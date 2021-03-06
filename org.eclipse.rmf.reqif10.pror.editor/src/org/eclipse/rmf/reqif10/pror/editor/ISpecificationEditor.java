/*******************************************************************************
 * Copyright (c) 2015 Formal Mind GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.editor;

import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.pror.filter.ReqifFilter;

/**
 * This interface must be implemented by all editors for ReqIF Specifications.
 * 
 * @author jastram
 */
public interface ISpecificationEditor extends IReqifEditor {

	/**
	 * Forward requests to show or hide SpecRelations.
	 */
	public void setShowSpecRelations(boolean checked);
	
	public void setFilter(ReqifFilter filter);

	public Specification getSpecification();
}
