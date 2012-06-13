/**
 * Copyright (c) 2012 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 */
package org.eclipse.rmf.internal.serialization;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.FeatureNotFoundException;
import org.eclipse.emf.ecore.xmi.PackageNotFoundException;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.SAXXMLHandler;
import org.eclipse.emf.ecore.xmi.impl.XMLHandler;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

public class ReqIFXMLSAXHandler extends SAXXMLHandler implements IReqIFSerializationConstants {
	private static final int OUT_OF_XHTML = -1;

	private SerializationStrategy serializationStrategy = SerializationStrategy.REQIF;
	private String previousElement = "";
	int xhtmlLevel = OUT_OF_XHTML;
	int toolExtensionsLevel = OUT_OF_XHTML;

	protected XMLHandler.MyStack<EStructuralFeature> deferredFeatures = new MyStack<EStructuralFeature>();

	protected int level = 0;

	public ReqIFXMLSAXHandler(XMLResource xmiResource, XMLHelper helper, Map<?, ?> options) {
		super(xmiResource, helper, options);
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		super.reset();
		deferredFeatures.clear();
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		level++;
		super.startElement(uri, localName, qName, attributes);
		previousElement = qName;
	}

	@Override
	protected void processElement(String name, String prefix, String localName) {
		if (SerializationStrategy.REQIF == serializationStrategy || SerializationStrategy.TOOL_EXTENSION == serializationStrategy) {
			if (isRoot) {
				isRoot = false;
				recordHeaderInformation();
			}
			if (isError()) {
				types.push(ERROR_TYPE);
			} else {
				if (objects.isEmpty()) {
					// root object
					createTopObject(prefix, localName);
				} else {
					if (isFeatureExpected()) {
						handleFeature(prefix, localName);
					} else {
						if (localName.endsWith(REF)) {
							handleReference(prefix, localName.substring(0, localName.length() - 4));
						} else {
							handleObject(prefix, localName);
						}
					}
				}
			}
		} else {
			super.processElement(name, prefix, localName);
		}
	}

	@Override
	protected void createObject(EObject peekObject, EStructuralFeature feature) {
		super.createObject(peekObject, feature);

	}

	protected void handleReference(String prefix, String localName) {
		handleObject(prefix, localName);
		text = new StringBuffer(); // if text is not null, endDocument will make this object a proxy
	}

	@Override
	protected void handleProxy(InternalEObject proxy, String uriLiteral) {
		URI proxyURI = URI.createURI("#" + uriLiteral); //$NON-NLS-1$
		proxy.eSetProxyURI(proxyURI);
	}

	protected void handleObject(String prefix, String localName) {
		assert null != deferredFeatures.peek();
		EObject peekObject = objects.peekEObject();
		assert null != peekObject;

		EFactory eFactory = getFactoryForPrefix(prefix);

		// TODO: check why do we need to check for empty namespace prefix?
		if (eFactory == null && prefix.equals("") && helper.getURI(prefix) == null) { //$NON-NLS-1$
			// handle anonymous namespace
			EPackage ePackage = handleMissingPackage(null);
			if (ePackage == null) {
				error(new PackageNotFoundException(null, getLocation(), getLineNumber(), getColumnNumber()));
			} else {
				eFactory = ePackage.getEFactoryInstance();
			}
		}

		EObject obj = createObject(eFactory, helper.getType(eFactory, localName), false);

		// this happens if we find an element that is nested in ReqIFToolExtensions
		if (null == deferredFeatures.peek()) {
			deferredFeatures.pop();
			EStructuralFeature feature = getFeature(peekObject, obj.eClass().getEPackage().getNsPrefix(), "root", true);
			deferredFeatures.push(feature);
		}

		obj = validateCreateObjectFromFactory(eFactory, localName, obj, deferredFeatures.peek());

		if (obj != null) {
			setFeatureValue(peekObject, deferredFeatures.peek(), obj);
		}

		// checking for instanceof ReqIFToolExtension doesn't work here since we would get all subclasses of
		// reqIFToolExtension as well
		// TODO: improve robustness of this algorithm
		if (obj.eClass().equals(ReqIF10Package.eINSTANCE.getReqIFToolExtension())) {
			serializationStrategy = SerializationStrategy.TOOL_EXTENSION;
			deferredFeatures.push(null);
			// mixedTargets.push((FeatureMap) obj.eGet(ReqIF10Package.eINSTANCE.getReqIFToolExtension_Any()));
			toolExtensionsLevel = level;
		}

		processObject(obj);

	}

	/**
	 * The XML element represents a feature. There are two cases to handle: 1. The feature has a type that is a
	 * datatype. 2. The feature has a type that is a class.
	 */
	@Override
	protected void handleFeature(String prefix, String name) {
		if (SerializationStrategy.REQIF == serializationStrategy || SerializationStrategy.TOOL_EXTENSION == serializationStrategy) {
			EObject peekObject = objects.peekEObject();

			// This happens when processing an element with simple content that has
			// elements content even though it shouldn't.
			//
			if (peekObject == null) {
				types.push(ERROR_TYPE);
				error(new FeatureNotFoundException(name, null, getLocation(), getLineNumber(), getColumnNumber()));
				return;
			}

			EStructuralFeature feature = getFeature(peekObject, prefix, name, true);
			if (feature != null) {

				deferredFeatures.push(feature);

				int kind = helper.getFeatureKind(feature);
				if (kind == XMLHelper.DATATYPE_SINGLE || kind == XMLHelper.DATATYPE_IS_MANY) {
					objects.push(null);
					mixedTargets.push(null);
					types.push(feature);
					if (!isNull()) {
						text = new StringBuffer();
					}
				} else if (extendedMetaData != null) {
					EReference eReference = (EReference) feature;
					boolean isContainment = eReference.isContainment();
					if (!isContainment && !eReference.isResolveProxies()
							&& extendedMetaData.getFeatureKind(feature) != ExtendedMetaData.UNSPECIFIED_FEATURE) {
						isIDREF = true;
						objects.push(null);
						mixedTargets.push(null);
						types.push(feature);
						text = new StringBuffer();
					} else if (feature == ReqIF10Package.eINSTANCE.getAttributeValueXHTML_TheValue()
							|| feature == ReqIF10Package.eINSTANCE.getAttributeValueXHTML_TheOriginalValue()) {
						createObject(peekObject, feature);
						serializationStrategy = SerializationStrategy.XHTML;
						xhtmlLevel = level;
					} else {
						objects.push(peekObject);
						types.push(OBJECT_TYPE);

					}
				} else {
					assert false;
					// we assume that extended metadata is not null
				}

			} else {
				handleUnknownFeature(prefix, name, true, peekObject, null);

			}
		} else {
			super.handleFeature(prefix, name);
		}
	}

	// TODO: cleanup algorithm for hand-over between different serialization strategies
	/**
	 * Pop the appropriate stacks and set features whose values are in the content of XML elements.
	 */
	@Override
	public void endElement(String uri, String localName, String name) {
		// make sure that the feature is set if we have seen a feature element without having created an object
		if ((SerializationStrategy.REQIF == serializationStrategy || SerializationStrategy.TOOL_EXTENSION == serializationStrategy)
				&& isEmptyManyFeature(uri, localName, name)) {
			setFeatureValue(objects.peek(), deferredFeatures.peek(), name, -2);
		}
		super.endElement(uri, localName, name);

		if (SerializationStrategy.TOOL_EXTENSION == serializationStrategy && level - 1 <= toolExtensionsLevel) {
			// we finished reading tool extensions
			serializationStrategy = SerializationStrategy.REQIF;
		} else if (SerializationStrategy.REQIF == serializationStrategy || SerializationStrategy.TOOL_EXTENSION == serializationStrategy) {
			if (isFeatureExpected()) {
				deferredFeatures.pop();
			}
		} else if (SerializationStrategy.XHTML == serializationStrategy && level - 1 <= xhtmlLevel) {
			// we finished reading xhtml
			serializationStrategy = SerializationStrategy.REQIF;
			// required in case of empty xhtml content
			if (level - 1 < xhtmlLevel) {
				if (isFeatureExpected()) {
					deferredFeatures.pop();
				}
			}
		}

		level--;
		previousElement = name;

	}

	protected boolean isEmptyManyFeature(String uri, String localName, String name) {
		if (name.equals(previousElement) && isFeatureExpected()) {
			EStructuralFeature feature = deferredFeatures.peek();
			if (null != feature && feature instanceof EReference) {
				EReference reference = (EReference) feature;
				return reference.isMany() && reference.isContainment();
				// return false;
			}
		}
		return false;
	}

	// a feature is expected if level is even
	protected boolean isFeatureExpected() {
		if (SerializationStrategy.REQIF == serializationStrategy) {
			return level % 2 == 0 ? true : false;
		} else {
			return level % 2 == 0 ? false : true;
		}
	}

	@Override
	protected void handleObjectAttribs(EObject obj) {

		if (attribs != null) {
			InternalEObject internalEObject = (InternalEObject) obj;
			for (int i = 0, size = attribs.getLength(); i < size; ++i) {
				String name = attribs.getQName(i);
				if (name.equals(idAttribute)) {
					xmlResource.setID(internalEObject, attribs.getValue(i));
				} else if (name.equals(hrefAttribute) && (!recordUnknownFeature || types.peek() != UNKNOWN_FEATURE_TYPE || obj.eClass() != anyType)) {
					handleProxy(internalEObject, attribs.getValue(i));
				} else if (!name.startsWith(XMLResource.XML_NS) && !notFeatures.contains(name)) {
					setAttribValue(obj, name, attribs.getValue(i));
				}
			}
		}

	}

	/**
	 * Create a feature with the given name for the given object with the given values.
	 */
	@Override
	protected void setAttribValue(EObject object, String name, String value) {
		if (SerializationStrategy.REQIF != serializationStrategy && SerializationStrategy.TOOL_EXTENSION != serializationStrategy) {
			super.setAttribValue(object, name, value);
		} else {
			int index = name.indexOf(':', 0);

			// is considered to have the null target namespace...
			// TODO: make sure that we correctly handle the null namespace case
			String prefix = null;
			String localName = name;
			if (index != -1) {
				prefix = name.substring(0, index);
				localName = name.substring(index + 1);
			}
			EStructuralFeature feature = getFeature(object, prefix, localName, false);
			if (feature == null) {
				handleUnknownFeature(prefix, localName, false, object, value);
			} else {
				int kind = helper.getFeatureKind(feature);

				if (kind == XMLHelper.DATATYPE_SINGLE || kind == XMLHelper.DATATYPE_IS_MANY) {
					setFeatureValue(object, feature, value, -2);
				} else {
					setValueFromId(object, (EReference) feature, value);
				}
			}
		}
	}
}
