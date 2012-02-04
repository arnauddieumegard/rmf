/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.reqif10.provider;

import org.eclipse.rmf.reqif10.AttributeValueDate;
import org.eclipse.rmf.reqif10.Reqif10Factory;
import org.junit.After;
import org.junit.Before;

/**
 * A test case for the model object '<em><b>Attribute Value Date</b></em>'.
 */
public class AttributeValueDateTest extends AttributeValueSimpleTest {

	/**
	 * Returns the fixture for this Attribute Value Date test case.
	 */
	@Override
	protected AttributeValueDate getFixture() {
		return (AttributeValueDate)fixture;
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		setFixture(Reqif10Factory.eINSTANCE.createAttributeValueDate());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * TODO Not sure what the right type is.
	 */
	@Override
	public Object getValueObject() {
		return null;
	}

} //AttributeValueDateTest
