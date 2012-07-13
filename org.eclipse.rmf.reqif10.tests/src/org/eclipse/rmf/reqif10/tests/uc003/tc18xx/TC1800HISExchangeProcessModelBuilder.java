package org.eclipse.rmf.reqif10.tests.uc003.tc18xx;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.SpecificationType;
import org.eclipse.rmf.reqif10.tests.util.CommonSystemAttributes;
import org.eclipse.rmf.reqif10.tests.util.SimpleModelBuilder;

@SuppressWarnings("nls")
public class TC1800HISExchangeProcessModelBuilder extends SimpleModelBuilder implements CommonSystemAttributes {
	final static String LAST_CHANGE_STRING_0 = "2012-04-07T01:51:37.112+02:00";
	final static String TEST_CASE_ID = "TC18xx";

	// datatypes
	protected DatatypeDefinitionString datatypeDefinitionString;
	protected DatatypeDefinitionEnumeration datatypeDefinitionEnumeration;

	// SpecObjectTypes
	SpecObjectType specObjectType;
	AttributeDefinitionString specObjectTypeAttributeDefinitionStringName;
	AttributeDefinitionString specObjectTypeAttributeDefinitionStringA1;
	AttributeDefinitionString specObjectTypeAttributeDefinitionStringA2;
	AttributeDefinitionEnumeration specObjectTypeAttributeDefinitionEnumerationE1;

	// Enumeration Values
	EnumValue one;
	EnumValue two;

	// SpecificationTypes
	SpecificationType specificationType;
	AttributeDefinitionString specificationTypeAttributeDefinitionStringName;

	// SpecObjects
	SpecObject specObject01;
	// 02 does not exist any more
	SpecObject specObject03;
	// 04 will be created later
	// 05 will be created later
	SpecObject specObject06;
	SpecObject specObject07;
	SpecObject specObject08;
	SpecObject specObject09;

	// Specifications
	Specification specification1;
	Specification specification2;

	public TC1800HISExchangeProcessModelBuilder() throws Exception {
		super("ID_TC1800_HISProcess", "TC 1800 'HIS Exchange Process OEM -> SUP (initial)'");
	}

	@Override
	public void createDatatypes() throws Exception {
		datatypeDefinitionString = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionString();
		datatypeDefinitionString.setIdentifier("ID_TC18xx_DatatypeDefinitionString");
		datatypeDefinitionString.setLongName("TC18xx DatatypeDefinitionString");
		datatypeDefinitionString.setLastChange(toDate(LAST_CHANGE_STRING_0));
		datatypeDefinitionString.setMaxLength(new BigInteger("255"));

		EList<DatatypeDefinition> datatypes = getReqIF().getCoreContent().getDatatypes();
		datatypes.add(datatypeDefinitionString);

		one = ReqIF10Factory.eINSTANCE.createEnumValue();
		one.setIdentifier("ID_TC18xx_EnumValue_one");
		one.setLongName("one");

		two = ReqIF10Factory.eINSTANCE.createEnumValue();
		two.setIdentifier("ID_TC18xx_EnumValue_two");
		two.setLongName("two");

		datatypeDefinitionEnumeration = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionEnumeration();
		datatypeDefinitionEnumeration.setIdentifier("ID_TC18xx_DatatypeDefinitionEnumeration");
		datatypeDefinitionEnumeration.setLongName("TC18xx DatatypeDefinitionEnumeration");
		datatypeDefinitionEnumeration.setLastChange(toDate(LAST_CHANGE_STRING_0));
		datatypeDefinitionEnumeration.getSpecifiedValues().add(one);
		datatypeDefinitionEnumeration.getSpecifiedValues().add(two);
		datatypes.add(datatypeDefinitionEnumeration);
	}

	@Override
	public void createSpecObjectTypes() throws Exception {
		specObjectType = ReqIF10Factory.eINSTANCE.createSpecObjectType();
		specObjectType.setIdentifier("ID_TC18xx_SpecObjectType");
		specObjectType.setLongName("TC18xx SpecObjectType");
		specObjectType.setLastChange(toDate(LAST_CHANGE_STRING_0));

		specObjectTypeAttributeDefinitionStringName = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		specObjectTypeAttributeDefinitionStringName.setIdentifier("ID_TC18xx_SpecObjectTypeAttributeDefinitionString_" + REQIF_NAME);
		specObjectTypeAttributeDefinitionStringName.setLongName(REQIF_NAME);
		specObjectTypeAttributeDefinitionStringName.setLastChange(toDate(LAST_CHANGE_STRING_0));
		specObjectTypeAttributeDefinitionStringName.setType(datatypeDefinitionString);

		specObjectTypeAttributeDefinitionStringA1 = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		specObjectTypeAttributeDefinitionStringA1.setIdentifier("ID_TC18xx_A1");
		specObjectTypeAttributeDefinitionStringA1.setLongName("A1");
		specObjectTypeAttributeDefinitionStringA1.setLastChange(toDate(LAST_CHANGE_STRING_0));
		specObjectTypeAttributeDefinitionStringA1.setType(datatypeDefinitionString);

		specObjectTypeAttributeDefinitionStringA2 = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		specObjectTypeAttributeDefinitionStringA2.setIdentifier("ID_TC18xx_A2");
		specObjectTypeAttributeDefinitionStringA2.setLongName("A2");
		specObjectTypeAttributeDefinitionStringA2.setLastChange(toDate(LAST_CHANGE_STRING_0));
		specObjectTypeAttributeDefinitionStringA2.setType(datatypeDefinitionString);

		specObjectTypeAttributeDefinitionEnumerationE1 = ReqIF10Factory.eINSTANCE.createAttributeDefinitionEnumeration();
		specObjectTypeAttributeDefinitionEnumerationE1.setIdentifier("ID_TC18xx_E1");
		specObjectTypeAttributeDefinitionEnumerationE1.setLongName("E1");
		specObjectTypeAttributeDefinitionEnumerationE1.setLastChange(toDate(LAST_CHANGE_STRING_0));
		specObjectTypeAttributeDefinitionEnumerationE1.setType(datatypeDefinitionEnumeration);

		specObjectType.getSpecAttributes().add(specObjectTypeAttributeDefinitionStringName);
		specObjectType.getSpecAttributes().add(specObjectTypeAttributeDefinitionStringA1);
		specObjectType.getSpecAttributes().add(specObjectTypeAttributeDefinitionStringA2);
		specObjectType.getSpecAttributes().add(specObjectTypeAttributeDefinitionEnumerationE1);

		getReqIF().getCoreContent().getSpecTypes().add(specObjectType);

	}

	@Override
	public void createSpecificationTypes() throws Exception {
		specificationType = ReqIF10Factory.eINSTANCE.createSpecificationType();
		specificationType.setIdentifier("ID_TC18xx_SpecificationType");
		specificationType.setLongName("TC18xx SpecificationType");
		specificationType.setLastChange(toDate(LAST_CHANGE_STRING_0));

		specificationTypeAttributeDefinitionStringName = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		specificationTypeAttributeDefinitionStringName.setIdentifier("ID_TC18xx_SpecificationTypeAttributeDefinitionString_" + REQIF_NAME);
		specificationTypeAttributeDefinitionStringName.setLongName(REQIF_NAME);
		specificationTypeAttributeDefinitionStringName.setLastChange(toDate(LAST_CHANGE_STRING_0));
		specificationTypeAttributeDefinitionStringName.setType(datatypeDefinitionString);

		specificationType.getSpecAttributes().add(specificationTypeAttributeDefinitionStringName);

		getReqIF().getCoreContent().getSpecTypes().add(specificationType);
	}

	/**
	 * Creates a new SpecObject and assigns it to the provided specObject, and adds it to the Reqif with the given values.
	 */
	private void createBasicSpecObject(SpecObject specObject, String objectId, String a1, String a2, EnumValue e1) throws Exception {
		AttributeValueString attributeValueString;
		AttributeValueEnumeration attributeValueEnum;

		specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.setIdentifier("ID_TC1800_SpecObject" + objectId);
		specObject.setLastChange(toDate(LAST_CHANGE_STRING_0));
		specObject.setType(specObjectType);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specObjectTypeAttributeDefinitionStringName);
		attributeValueString.setTheValue("Obj-" + objectId);
		specObject.getValues().add(attributeValueString);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specObjectTypeAttributeDefinitionStringA1);
		attributeValueString.setTheValue(a1);
		specObject.getValues().add(attributeValueString);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specObjectTypeAttributeDefinitionStringA2);
		attributeValueString.setTheValue(a2);
		specObject.getValues().add(attributeValueString);

		attributeValueEnum = ReqIF10Factory.eINSTANCE.createAttributeValueEnumeration();
		attributeValueEnum.setDefinition(specObjectTypeAttributeDefinitionEnumerationE1);
		attributeValueEnum.getValues().add(e1);
		specObject.getValues().add(attributeValueEnum);

		getReqIF().getCoreContent().getSpecObjects().add(specObject);

	}

	@Override
	public void createSpecObjects() throws Exception {
		createBasicSpecObject(specObject01, "01", "no change", "no change", one);
		createBasicSpecObject(specObject03, "03", "O3.A1 initial", "O3.A2 initial", one);
		// no 04
		// no 05
		createBasicSpecObject(specObject06, "06", "no change", "no change", one);
		createBasicSpecObject(specObject07, "07", "no change", "no change", one);
		createBasicSpecObject(specObject08, "08", "no change", "no change", one);
		createBasicSpecObject(specObject09, "09", "no change", "no change", one);
	}

	@Override
	public void createSpecifications() throws Exception {
		// set the specification attributes
		AttributeValueString attributeValueString;

		// Two Specifications
		for (int i = 1; i <= 2; i++) {
			Specification spec = ReqIF10Factory.eINSTANCE.createSpecification();
			spec.setIdentifier("ID_TC18xx_Specification" + i);
			spec.setType(specificationType);
			spec.setLastChange(toDate(LAST_CHANGE_STRING_0));

			attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
			attributeValueString.setDefinition(specificationTypeAttributeDefinitionStringName);
			attributeValueString.setTheValue("Spec" + i);
			spec.getValues().add(attributeValueString);
			getReqIF().getCoreContent().getSpecifications().add(spec);
		}

		// Add all SpecObjects to first spec.
		Specification spec1 = getReqIF().getCoreContent().getSpecifications().get(0);

		for (SpecObject specObject : getReqIF().getCoreContent().getSpecObjects()) {
			SpecHierarchy specHierarchy = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
			specHierarchy.setIdentifier("ID_TC1800_SpecHierarchy-" + specObject.getIdentifier());
			specHierarchy.setLastChange(toDate(LAST_CHANGE_STRING_0));
			specHierarchy.setObject(specObject);
			spec1.getChildren().add(specHierarchy);
		}

	}

}