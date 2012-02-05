/*******************************************************************************
 * Copyright (c) 2011 itemis GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nirmal Sasidharan - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.rif11.xsd.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE;
import org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBOOLEAN;
import org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATE;
import org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDOCUMENT;
import org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONENUMERATION;
import org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONINTEGER;
import org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL;
import org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSTRING;
import org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONXMLDATA;


/**
 * A sample validator interface for {@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DATATYPEDEFINITIONSTypeValidator {
	boolean validate();

	boolean validateGroup(FeatureMap value);
	boolean validateDATATYPEDEFINITIONBINARYFILEREF(EList<DATATYPEDEFINITIONBINARYFILE> value);
	boolean validateDATATYPEDEFINITIONBOOLEANREF(EList<DATATYPEDEFINITIONBOOLEAN> value);
	boolean validateDATATYPEDEFINITIONDATEREF(EList<DATATYPEDEFINITIONDATE> value);
	boolean validateDATATYPEDEFINITIONDOCUMENTREF(EList<DATATYPEDEFINITIONDOCUMENT> value);
	boolean validateDATATYPEDEFINITIONENUMERATIONREF(EList<DATATYPEDEFINITIONENUMERATION> value);
	boolean validateDATATYPEDEFINITIONINTEGERREF(EList<DATATYPEDEFINITIONINTEGER> value);
	boolean validateDATATYPEDEFINITIONREALREF(EList<DATATYPEDEFINITIONREAL> value);
	boolean validateDATATYPEDEFINITIONSTRINGREF(EList<DATATYPEDEFINITIONSTRING> value);
	boolean validateDATATYPEDEFINITIONXMLDATAREF(EList<DATATYPEDEFINITIONXMLDATA> value);
}