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

import org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBOOLEAN;
import org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATE;
import org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONINTEGER;
import org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL;
import org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSTRING;

/**
 * A sample validator interface for {@link org.eclipse.rmf.rif11.xsd.TYPEType3}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TYPEType3Validator {
	boolean validate();

	boolean validateDATATYPEDEFINITIONBOOLEANREF(DATATYPEDEFINITIONBOOLEAN value);
	boolean validateDATATYPEDEFINITIONDATEREF(DATATYPEDEFINITIONDATE value);
	boolean validateDATATYPEDEFINITIONINTEGERREF(DATATYPEDEFINITIONINTEGER value);
	boolean validateDATATYPEDEFINITIONREALREF(DATATYPEDEFINITIONREAL value);
	boolean validateDATATYPEDEFINITIONSTRINGREF(DATATYPEDEFINITIONSTRING value);
}
