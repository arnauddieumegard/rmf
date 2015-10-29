/*******************************************************************************
 * Copyright (c) 2015 Formal Mind GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ingo Weigelt (Formal Mind GmbH)
 *******************************************************************************/
package org.eclipse.rmf.reqif10.constraints;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.common.util.ReqIF10XhtmlUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class AttributeValueXHTMLObjectsDataAttributePresent extends ReqIFModelConstraint {

	@Override
	public IStatus doValidate(IValidationContext ctx) {
		Object target = ctx.getTarget();
		if (target == null) {
			return Status.OK_STATUS;
		}

		if (target instanceof AttributeValueXHTML) {
			AttributeValueXHTML xhtmlVal = (AttributeValueXHTML) target;

			if (xhtmlVal.getTheValue() == null) {
				return ConstraintStatus.createStatus(ctx, null, IStatus.ERROR, Integer.MAX_VALUE,
						"Can not validate AttributeValueXHTML because the Value is null.");
			}

			Document xhtmlDom = ReqIF10XhtmlUtil.getXhtmlDom(xhtmlVal.getTheValue());

			NodeList objectTags1 = xhtmlDom.getElementsByTagName("xhtml:object"); //$NON-NLS-1$
			NodeList objectTags2 = xhtmlDom.getElementsByTagName("reqif-xhtml:object"); //$NON-NLS-1$

			List<Element> items = new LinkedList<Element>();

			for (int i = 0; i < objectTags1.getLength(); i++) {
				Element item = (Element) objectTags1.item(i);
				items.add(item);
			}
			for (int i = 0; i < objectTags2.getLength(); i++) {
				Element item = (Element) objectTags2.item(i);
				items.add(item);
			}

			List<Element> elementsWithoutDataAttribute = new LinkedList<Element>();
			for (Element item : items) {
				if (item.getAttribute("data") == null || item.getAttribute("data").equals("")) { //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					elementsWithoutDataAttribute.add(item);
				}
			}

			if (elementsWithoutDataAttribute.size() > 0) {
				//
				int count = elementsWithoutDataAttribute.size();
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < elementsWithoutDataAttribute.size(); i++) {
					if (i > 0) {
						sb.append(", ");
					}
					sb.append(elementsWithoutDataAttribute.get(i));
				}
				// AttributeValueXHTML missing data attribute in {0}
				return ctx.createFailureStatus(count == 1 ? "an object" : count + " objects");
			}

		}

		return Status.OK_STATUS;

	}

}