/*******************************************************************************
 * Copyright (c) 2014 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Mark Broerkens (itemis AG) - initial API and implementation
 *******************************************************************************/
package org.eclipse.rmf.tests.reqif10.serialization.uc003.tc18xx;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeDefinitionXHTML;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.tests.reqif10.serialization.util.SimpleModelBuilder;

@SuppressWarnings("nls")
public class TC1801HISExchangeProcessModelBuilder {

	final static String LAST_CHANGE_STRING_1 = "2012-04-08T01:51:37.112+02:00";
	private ReqIF reqIF;

	public TC1801HISExchangeProcessModelBuilder(ReqIF reqIF) throws Exception {
		this.reqIF = reqIF;
		modifyReqIF();
	}

	private void modifyReqIF() throws Exception {
		// No action for 01 needed
		// 02 does not exist any more
		modifySpecObject03();
		createSpecObject04();
		// No action for 05 needed
		deleteSpecObject06();
		// No action for 07 needed
		moveSpecObject08();
		// No action for 09 needed
	}

	private void modifySpecObject03() throws Exception {
		SpecObject specObject = reqIF.getCoreContent().getSpecObjects().get(1);
		AttributeValueString value = (AttributeValueString) ReqIFUtil.getAttributeValueForLabel(specObject, "A2");
		value.setTheValue("O3.A2 once");
		specObject.setLastChange(toDate(LAST_CHANGE_STRING_1));
	}

	private void createSpecObject04() throws Exception {
		SpecObjectType specObjectType = (SpecObjectType) reqIF.getCoreContent().getSpecTypes().get(0);
		AttributeValueString attributeValueString;
		AttributeValueXHTML attributeValueXhtml;
		AttributeValueEnumeration attributeValueEnum;

		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.setIdentifier("ID_TC1801_SpecObject04");
		specObject.setLastChange(toDate(LAST_CHANGE_STRING_1));
		specObject.setType(specObjectType);

		attributeValueXhtml = ReqIF10Factory.eINSTANCE.createAttributeValueXHTML();
		attributeValueXhtml.setDefinition((AttributeDefinitionXHTML) specObjectType.getSpecAttributes().get(0));
		attributeValueXhtml.setTheValue(SimpleModelBuilder.createXhtmlValue("Obj-04"));
		specObject.getValues().add(attributeValueXhtml);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition((AttributeDefinitionString) specObjectType.getSpecAttributes().get(1));
		attributeValueString.setTheValue("no change");
		specObject.getValues().add(attributeValueString);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition((AttributeDefinitionString) specObjectType.getSpecAttributes().get(2));
		attributeValueString.setTheValue("no change");
		specObject.getValues().add(attributeValueString);

		attributeValueEnum = ReqIF10Factory.eINSTANCE.createAttributeValueEnumeration();
		AttributeDefinitionEnumeration enumeration = (AttributeDefinitionEnumeration) specObjectType.getSpecAttributes().get(3);
		attributeValueEnum.setDefinition(enumeration);
		attributeValueEnum.getValues().add(enumeration.getType().getSpecifiedValues().get(0));
		specObject.getValues().add(attributeValueEnum);

		getReqIF().getCoreContent().getSpecObjects().add(3, specObject);

		SpecHierarchy specHierarchy = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy.setLastChange(toDate(LAST_CHANGE_STRING_1));
		specHierarchy.setIdentifier("ID_TC1801_SpecHierarchy-" + specObject.getIdentifier());
		specHierarchy.setObject(specObject);

		reqIF.getCoreContent().getSpecifications().get(0).getChildren().add(3, specHierarchy);
	}

	private void deleteSpecObject06() {
		reqIF.getCoreContent().getSpecObjects().remove(2);
		reqIF.getCoreContent().getSpecifications().get(0).getChildren().remove(2);
	}

	private void moveSpecObject08() throws Exception {
		// Remove from Spec 1...

		SpecObject specObject = reqIF.getCoreContent().getSpecifications().get(0).getChildren().get(4).getObject();
		reqIF.getCoreContent().getSpecifications().get(0).getChildren().remove(4);

		// ... and add to Spec 2
		SpecHierarchy specHierarchy = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy.setLastChange(toDate(LAST_CHANGE_STRING_1));
		specHierarchy.setIdentifier("ID_TC1801_SpecHierarchy-" + specObject.getIdentifier());
		specHierarchy.setObject(specObject);

		reqIF.getCoreContent().getSpecifications().get(1).getChildren().add(specHierarchy);
	}

	public ReqIF getReqIF() {
		return reqIF;
	}

	public GregorianCalendar toDate(String date) throws DatatypeConfigurationException {
		GregorianCalendar gregorianCalendar = (GregorianCalendar) EcoreUtil.createFromString(ReqIF10Package.eINSTANCE.getDateTime(), date);
		return gregorianCalendar;
	}

}
