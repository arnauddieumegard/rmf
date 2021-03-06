/**
 * Copyright (c) 2013 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    itemis AG - initial API and implementation
 * 
 */
package org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType6;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TYPE Type6</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType6Impl#getSPECOBJECTTYPEREF <em>SPECOBJECTTYPEREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TYPEType6Impl extends EObjectImpl implements TYPEType6 {
	/**
	 * The default value of the '{@link #getSPECOBJECTTYPEREF() <em>SPECOBJECTTYPEREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECOBJECTTYPEREF()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECOBJECTTYPEREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSPECOBJECTTYPEREF() <em>SPECOBJECTTYPEREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECOBJECTTYPEREF()
	 * @generated
	 * @ordered
	 */
	protected String sPECOBJECTTYPEREF = SPECOBJECTTYPEREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TYPEType6Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.TYPE_TYPE6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSPECOBJECTTYPEREF() {
		return sPECOBJECTTYPEREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPECOBJECTTYPEREF(String newSPECOBJECTTYPEREF) {
		String oldSPECOBJECTTYPEREF = sPECOBJECTTYPEREF;
		sPECOBJECTTYPEREF = newSPECOBJECTTYPEREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.TYPE_TYPE6__SPECOBJECTTYPEREF, oldSPECOBJECTTYPEREF, sPECOBJECTTYPEREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyreqifPackage.TYPE_TYPE6__SPECOBJECTTYPEREF:
				return getSPECOBJECTTYPEREF();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MyreqifPackage.TYPE_TYPE6__SPECOBJECTTYPEREF:
				setSPECOBJECTTYPEREF((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MyreqifPackage.TYPE_TYPE6__SPECOBJECTTYPEREF:
				setSPECOBJECTTYPEREF(SPECOBJECTTYPEREF_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MyreqifPackage.TYPE_TYPE6__SPECOBJECTTYPEREF:
				return SPECOBJECTTYPEREF_EDEFAULT == null ? sPECOBJECTTYPEREF != null : !SPECOBJECTTYPEREF_EDEFAULT.equals(sPECOBJECTTYPEREF);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (sPECOBJECTTYPEREF: ");
		result.append(sPECOBJECTTYPEREF);
		result.append(')');
		return result.toString();
	}

} //TYPEType6Impl
