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

package org.eclipse.rmf.rif11.xhtml.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.rmf.rif11.xhtml.AddressType;
import org.eclipse.rmf.rif11.xhtml.BlockquoteType;
import org.eclipse.rmf.rif11.xhtml.DelType;
import org.eclipse.rmf.rif11.xhtml.DivType;
import org.eclipse.rmf.rif11.xhtml.DlType;
import org.eclipse.rmf.rif11.xhtml.H1Type;
import org.eclipse.rmf.rif11.xhtml.H2Type;
import org.eclipse.rmf.rif11.xhtml.H3Type;
import org.eclipse.rmf.rif11.xhtml.H4Type;
import org.eclipse.rmf.rif11.xhtml.H5Type;
import org.eclipse.rmf.rif11.xhtml.H6Type;
import org.eclipse.rmf.rif11.xhtml.HrType;
import org.eclipse.rmf.rif11.xhtml.InsType;
import org.eclipse.rmf.rif11.xhtml.OlType;
import org.eclipse.rmf.rif11.xhtml.PType;
import org.eclipse.rmf.rif11.xhtml.PreType;
import org.eclipse.rmf.rif11.xhtml.TableType;
import org.eclipse.rmf.rif11.xhtml.UlType;


/**
 * A sample validator interface for {@link org.eclipse.rmf.rif11.xhtml.Block}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BlockValidator {
	boolean validate();

	boolean validateGroup(FeatureMap value);
	boolean validateP(EList<PType> value);
	boolean validateH1(EList<H1Type> value);
	boolean validateH2(EList<H2Type> value);
	boolean validateH3(EList<H3Type> value);
	boolean validateH4(EList<H4Type> value);
	boolean validateH5(EList<H5Type> value);
	boolean validateH6(EList<H6Type> value);
	boolean validateDiv(EList<DivType> value);
	boolean validateUl(EList<UlType> value);
	boolean validateOl(EList<OlType> value);
	boolean validateDl(EList<DlType> value);
	boolean validatePre(EList<PreType> value);
	boolean validateHr(EList<HrType> value);
	boolean validateBlockquote(EList<BlockquoteType> value);
	boolean validateAddress(EList<AddressType> value);
	boolean validateTable(EList<TableType> value);
	boolean validateIns(EList<InsType> value);
	boolean validateDel(EList<DelType> value);
}
