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

package org.eclipse.rmf.rif11.ExchangeFile.validation;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;
import org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinition;
import org.eclipse.rmf.rif11.ExchangeFile.SpecGroup;
import org.eclipse.rmf.rif11.ExchangeFile.SpecHierarchyRoot;
import org.eclipse.rmf.rif11.ExchangeFile.SpecObject;
import org.eclipse.rmf.rif11.ExchangeFile.SpecRelation;
import org.eclipse.rmf.rif11.ExchangeFile.SpecType;


/**
 * A sample validator interface for {@link org.eclipse.rmf.rif11.ExchangeFile.RIF}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RIFValidator {
	boolean validate();

	boolean validateAuthor(String value);
	boolean validateComment(String value);
	boolean validateCountryCode(String value);
	boolean validateCreationTime(XMLGregorianCalendar value);
	boolean validateIdentifier(String value);
	boolean validateSourceToolId(String value);
	boolean validateTitle(String value);
	boolean validateVersion(String value);
	boolean validateAccessPolicies(EList<AccessPolicy> value);
	boolean validateDatatypes(EList<DatatypeDefinition> value);
	boolean validateSpecHierarchyRoots(EList<SpecHierarchyRoot> value);
	boolean validateSpecObjects(EList<SpecObject> value);
	boolean validateSpecGroups(EList<SpecGroup> value);
	boolean validateSpecTypes(EList<SpecType> value);
	boolean validateSpecRelations(EList<SpecRelation> value);
}
