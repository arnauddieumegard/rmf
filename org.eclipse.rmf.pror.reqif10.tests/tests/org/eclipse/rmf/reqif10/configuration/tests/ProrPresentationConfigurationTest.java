/*******************************************************************************
 * Copyright (c) 2012 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.reqif10.configuration.tests;

import org.eclipse.rmf.pror.reqif10.configuration.ConfigFactory;
import org.eclipse.rmf.pror.reqif10.configuration.ConfigPackage;
import org.eclipse.rmf.pror.reqif10.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.pror.reqif10.configuration.ProrPresentationConfigurations;
import org.eclipse.rmf.pror.reqif10.testframework.AbstractItemProviderTest;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.Reqif10Factory;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * A test case for the model object '<em><b>Pror Presentation Configuration</b></em>'.
 */
public abstract class ProrPresentationConfigurationTest extends AbstractItemProviderTest {

	/**
	 * The fixture for this Pror Presentation Configuration test case.
	 */
	protected ProrPresentationConfiguration fixture = null;

	/**
	 * Sets the fixture for this Pror Presentation Configuration test case.
	 */
	protected void setFixture(ProrPresentationConfiguration fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Pror Presentation Configuration test case.
	 */
	protected ProrPresentationConfiguration getFixture() {
		return fixture;
	}
	
	@Test
	public void testTypeNotifications() {
		ProrPresentationConfigurations configs = ConfigFactory.eINSTANCE.createProrPresentationConfigurations();
		setViaCommand(configs, ConfigPackage.Literals.PROR_PRESENTATION_CONFIGURATIONS__PRESENTATION_CONFIGURATIONS, fixture);
		assertEquals(fixture, configs.getPresentationConfigurations().get(0));
		
		this.getItemProvider(fixture).addListener(listener);
		DatatypeDefinition dd = Reqif10Factory.eINSTANCE.createDatatypeDefinitionString();
		setViaCommand(fixture, ConfigPackage.Literals.PROR_PRESENTATION_CONFIGURATION__DATATYPE, dd);
		assertEquals(dd, fixture.getDatatype());
		assertEquals(1, this.notifications.size());
	}

} //ProrPresentationConfigurationTest
