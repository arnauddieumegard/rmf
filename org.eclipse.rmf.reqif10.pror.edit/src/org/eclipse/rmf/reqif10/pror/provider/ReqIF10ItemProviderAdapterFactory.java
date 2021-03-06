/*******************************************************************************
 * Copyright (c) 2011, 2013 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.reqif10.pror.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.Disposable;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.rmf.reqif10.util.ReqIF10AdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReqIF10ItemProviderAdapterFactory extends ReqIF10AdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the item providers created, so that they can be {@link #dispose disposed}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Disposable disposable = new Disposable();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqIF10ItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.AttributeValueXHTML} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueXHTMLItemProvider attributeValueXHTMLItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.AttributeValueXHTML}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeValueXHTMLAdapter() {
		if (attributeValueXHTMLItemProvider == null) {
			attributeValueXHTMLItemProvider = new AttributeValueXHTMLItemProvider(this);
		}

		return attributeValueXHTMLItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.AttributeDefinitionXHTML} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeDefinitionXHTMLItemProvider attributeDefinitionXHTMLItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.AttributeDefinitionXHTML}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeDefinitionXHTMLAdapter() {
		if (attributeDefinitionXHTMLItemProvider == null) {
			attributeDefinitionXHTMLItemProvider = new AttributeDefinitionXHTMLItemProvider(this);
		}

		return attributeDefinitionXHTMLItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.ReqIFContent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReqIFContentItemProvider reqIFContentItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.ReqIFContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReqIFContentAdapter() {
		if (reqIFContentItemProvider == null) {
			reqIFContentItemProvider = new ReqIFContentItemProvider(this);
		}

		return reqIFContentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.ReqIF} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReqIFItemProvider reqIFItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.ReqIF}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReqIFAdapter() {
		if (reqIFItemProvider == null) {
			reqIFItemProvider = new ReqIFItemProvider(this);
		}

		return reqIFItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.ReqIFHeader} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReqIFHeaderItemProvider reqIFHeaderItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.ReqIFHeader}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReqIFHeaderAdapter() {
		if (reqIFHeaderItemProvider == null) {
			reqIFHeaderItemProvider = new ReqIFHeaderItemProvider(this);
		}

		return reqIFHeaderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.ReqIFToolExtension} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReqIFToolExtensionItemProvider reqIFToolExtensionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.ReqIFToolExtension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReqIFToolExtensionAdapter() {
		if (reqIFToolExtensionItemProvider == null) {
			reqIFToolExtensionItemProvider = new ReqIFToolExtensionItemProvider(this);
		}

		return reqIFToolExtensionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.SpecObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecObjectItemProvider specObjectItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.SpecObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpecObjectAdapter() {
		if (specObjectItemProvider == null) {
			specObjectItemProvider = new SpecObjectItemProvider(this);
		}

		return specObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.SpecObjectType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecObjectTypeItemProvider specObjectTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.SpecObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpecObjectTypeAdapter() {
		if (specObjectTypeItemProvider == null) {
			specObjectTypeItemProvider = new SpecObjectTypeItemProvider(this);
		}

		return specObjectTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.Specification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationItemProvider specificationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.Specification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpecificationAdapter() {
		if (specificationItemProvider == null) {
			specificationItemProvider = new SpecificationItemProvider(this);
		}

		return specificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.SpecificationType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationTypeItemProvider specificationTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.SpecificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpecificationTypeAdapter() {
		if (specificationTypeItemProvider == null) {
			specificationTypeItemProvider = new SpecificationTypeItemProvider(this);
		}

		return specificationTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.SpecHierarchy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecHierarchyItemProvider specHierarchyItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.SpecHierarchy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpecHierarchyAdapter() {
		if (specHierarchyItemProvider == null) {
			specHierarchyItemProvider = new SpecHierarchyItemProvider(this);
		}

		return specHierarchyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.SpecRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecRelationItemProvider specRelationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.SpecRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpecRelationAdapter() {
		if (specRelationItemProvider == null) {
			specRelationItemProvider = new SpecRelationItemProvider(this);
		}

		return specRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.SpecRelationType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecRelationTypeItemProvider specRelationTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.SpecRelationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpecRelationTypeAdapter() {
		if (specRelationTypeItemProvider == null) {
			specRelationTypeItemProvider = new SpecRelationTypeItemProvider(this);
		}

		return specRelationTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.RelationGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationGroupItemProvider relationGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.RelationGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelationGroupAdapter() {
		if (relationGroupItemProvider == null) {
			relationGroupItemProvider = new RelationGroupItemProvider(this);
		}

		return relationGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.RelationGroupType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationGroupTypeItemProvider relationGroupTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.RelationGroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelationGroupTypeAdapter() {
		if (relationGroupTypeItemProvider == null) {
			relationGroupTypeItemProvider = new RelationGroupTypeItemProvider(this);
		}

		return relationGroupTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.DatatypeDefinitionXHTML} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatatypeDefinitionXHTMLItemProvider datatypeDefinitionXHTMLItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.DatatypeDefinitionXHTML}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDatatypeDefinitionXHTMLAdapter() {
		if (datatypeDefinitionXHTMLItemProvider == null) {
			datatypeDefinitionXHTMLItemProvider = new DatatypeDefinitionXHTMLItemProvider(this);
		}

		return datatypeDefinitionXHTMLItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.AlternativeID} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlternativeIDItemProvider alternativeIDItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.AlternativeID}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAlternativeIDAdapter() {
		if (alternativeIDItemProvider == null) {
			alternativeIDItemProvider = new AlternativeIDItemProvider(this);
		}

		return alternativeIDItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.AttributeDefinitionBoolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeDefinitionBooleanAdapter() {
		return new AttributeDefinitionBooleanItemProvider(this);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.DatatypeDefinitionBoolean} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatatypeDefinitionBooleanItemProvider datatypeDefinitionBooleanItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.DatatypeDefinitionBoolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDatatypeDefinitionBooleanAdapter() {
		if (datatypeDefinitionBooleanItemProvider == null) {
			datatypeDefinitionBooleanItemProvider = new DatatypeDefinitionBooleanItemProvider(this);
		}

		return datatypeDefinitionBooleanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.AttributeValueBoolean} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueBooleanItemProvider attributeValueBooleanItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.AttributeValueBoolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeValueBooleanAdapter() {
		if (attributeValueBooleanItemProvider == null) {
			attributeValueBooleanItemProvider = new AttributeValueBooleanItemProvider(this);
		}

		return attributeValueBooleanItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.AttributeDefinitionDate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeDefinitionDateAdapter() {
		return new AttributeDefinitionDateItemProvider(this);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.DatatypeDefinitionDate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatatypeDefinitionDateItemProvider datatypeDefinitionDateItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.DatatypeDefinitionDate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDatatypeDefinitionDateAdapter() {
		if (datatypeDefinitionDateItemProvider == null) {
			datatypeDefinitionDateItemProvider = new DatatypeDefinitionDateItemProvider(this);
		}

		return datatypeDefinitionDateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.AttributeValueDate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueDateItemProvider attributeValueDateItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.AttributeValueDate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeValueDateAdapter() {
		if (attributeValueDateItemProvider == null) {
			attributeValueDateItemProvider = new AttributeValueDateItemProvider(this);
		}

		return attributeValueDateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeDefinitionEnumerationItemProvider attributeDefinitionEnumerationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeDefinitionEnumerationAdapter() {
		if (attributeDefinitionEnumerationItemProvider == null) {
			attributeDefinitionEnumerationItemProvider = new AttributeDefinitionEnumerationItemProvider(this);
		}

		return attributeDefinitionEnumerationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatatypeDefinitionEnumerationItemProvider datatypeDefinitionEnumerationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDatatypeDefinitionEnumerationAdapter() {
		if (datatypeDefinitionEnumerationItemProvider == null) {
			datatypeDefinitionEnumerationItemProvider = new DatatypeDefinitionEnumerationItemProvider(this);
		}

		return datatypeDefinitionEnumerationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.EnumValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumValueItemProvider enumValueItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.EnumValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumValueAdapter() {
		if (enumValueItemProvider == null) {
			enumValueItemProvider = new EnumValueItemProvider(this);
		}

		return enumValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.EmbeddedValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmbeddedValueItemProvider embeddedValueItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.EmbeddedValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEmbeddedValueAdapter() {
		if (embeddedValueItemProvider == null) {
			embeddedValueItemProvider = new EmbeddedValueItemProvider(this);
		}

		return embeddedValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.AttributeValueEnumeration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueEnumerationItemProvider attributeValueEnumerationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.AttributeValueEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeValueEnumerationAdapter() {
		if (attributeValueEnumerationItemProvider == null) {
			attributeValueEnumerationItemProvider = new AttributeValueEnumerationItemProvider(this);
		}

		return attributeValueEnumerationItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.AttributeDefinitionInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeDefinitionIntegerAdapter() {
		return new AttributeDefinitionIntegerItemProvider(this);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.DatatypeDefinitionInteger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatatypeDefinitionIntegerItemProvider datatypeDefinitionIntegerItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.DatatypeDefinitionInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDatatypeDefinitionIntegerAdapter() {
		if (datatypeDefinitionIntegerItemProvider == null) {
			datatypeDefinitionIntegerItemProvider = new DatatypeDefinitionIntegerItemProvider(this);
		}

		return datatypeDefinitionIntegerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.AttributeValueInteger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueIntegerItemProvider attributeValueIntegerItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.AttributeValueInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeValueIntegerAdapter() {
		if (attributeValueIntegerItemProvider == null) {
			attributeValueIntegerItemProvider = new AttributeValueIntegerItemProvider(this);
		}

		return attributeValueIntegerItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.AttributeDefinitionReal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeDefinitionRealAdapter() {
		return new AttributeDefinitionRealItemProvider(this);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.DatatypeDefinitionReal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatatypeDefinitionRealItemProvider datatypeDefinitionRealItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.DatatypeDefinitionReal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDatatypeDefinitionRealAdapter() {
		if (datatypeDefinitionRealItemProvider == null) {
			datatypeDefinitionRealItemProvider = new DatatypeDefinitionRealItemProvider(this);
		}

		return datatypeDefinitionRealItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.AttributeValueReal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueRealItemProvider attributeValueRealItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.AttributeValueReal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeValueRealAdapter() {
		if (attributeValueRealItemProvider == null) {
			attributeValueRealItemProvider = new AttributeValueRealItemProvider(this);
		}

		return attributeValueRealItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.AttributeDefinitionString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeDefinitionStringAdapter() {
		return new AttributeDefinitionStringItemProvider(this);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.DatatypeDefinitionString} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatatypeDefinitionStringItemProvider datatypeDefinitionStringItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.DatatypeDefinitionString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDatatypeDefinitionStringAdapter() {
		if (datatypeDefinitionStringItemProvider == null) {
			datatypeDefinitionStringItemProvider = new DatatypeDefinitionStringItemProvider(this);
		}

		return datatypeDefinitionStringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.AttributeValueString} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueStringItemProvider attributeValueStringItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.AttributeValueString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeValueStringAdapter() {
		if (attributeValueStringItemProvider == null) {
			attributeValueStringItemProvider = new AttributeValueStringItemProvider(this);
		}

		return attributeValueStringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.XhtmlContent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XhtmlContentItemProvider xhtmlContentItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.XhtmlContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXhtmlContentAdapter() {
		if (xhtmlContentItemProvider == null) {
			xhtmlContentItemProvider = new XhtmlContentItemProvider(this);
		}

		return xhtmlContentItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * Associates an adapter with a notifier via the base implementation, then records it to ensure it will be disposed.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void associate(Adapter adapter, Notifier target) {
		super.associate(adapter, target);
		if (adapter != null) {
			disposable.add(adapter);
		}
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		disposable.dispose();
	}

}
