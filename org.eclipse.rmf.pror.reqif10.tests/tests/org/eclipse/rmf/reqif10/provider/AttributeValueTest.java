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

import static org.junit.Assert.assertEquals;

import java.net.URISyntaxException;

import org.eclipse.rmf.pror.reqif10.testframework.AbstractItemProviderTest;
import org.eclipse.rmf.pror.reqif10.util.ProrUtil;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.SpecObject;
import org.junit.Test;

/**
 * A test case for the model object '<em><b>Attribute Value</b></em>'.
 */
public abstract class AttributeValueTest extends AbstractItemProviderTest {

	/**
	 * The fixture for this Attribute Value test case.
	 */
	protected AttributeValue fixture = null;

	/**
	 * Returns the fixture for this Attribute Value test case.
	 */
	protected AttributeValue getFixture() { 
		return fixture;
	}
	
	/**
	 * Sets the fixture for this Attribute Value test case.
	 */
	protected void setFixture(AttributeValue fixture) {
		this.fixture = fixture;
	}

	/**
	 * We make sure that a {@link SpecObject} containing this AttributeValue is
	 * notified. By providing this abstract test, we ensure that this test is
	 * executed for all subclasses of {@link AttributeValue}. We also have a
	 * corresponding test
	 * {@link SpecElementWithAttributesTest#testSpecElementNotificationValueChanged()}
	 * that tests all subclasses of SpecElement.
	 */
	@Test
	public void testEnclosingSpecObjectIsNotified() throws URISyntaxException {
		ReqIF reqif = getTestReqif("simple.reqif");
		SpecObject specObject = reqif.getCoreContent().getSpecObjects().get(0);
		specObject.getValues().add(getFixture());
		ProrUtil.getItemProvider(adapterFactory, specObject).addListener(listener);
		ProrUtil.setTheValue(getFixture(), getValueObject(), editingDomain);
		assertEquals(1, notifications.size());
		assertEquals(specObject, notifications.get(0).getNotifier());		
	}
	
	/**
	 * Returns a Value Object of the correct type for the given
	 * {@link AttributeValue}. The content doesn't really matter for testing.
	 * 
	 * @return
	 */
	public abstract Object getValueObject();
	
} // AttributeValueTest
