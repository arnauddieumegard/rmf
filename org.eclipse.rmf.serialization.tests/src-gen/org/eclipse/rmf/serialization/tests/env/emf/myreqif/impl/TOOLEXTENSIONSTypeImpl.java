/**
 */
package org.eclipse.rmf.serialization.tests.env.emf.myreqif.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.rmf.serialization.tests.env.emf.myreqif.MyreqifPackage;
import org.eclipse.rmf.serialization.tests.env.emf.myreqif.REQIFTOOLEXTENSION;
import org.eclipse.rmf.serialization.tests.env.emf.myreqif.TOOLEXTENSIONSType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TOOLEXTENSIONS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.serialization.tests.env.emf.myreqif.impl.TOOLEXTENSIONSTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.serialization.tests.env.emf.myreqif.impl.TOOLEXTENSIONSTypeImpl#getREQIFTOOLEXTENSION <em>REQIFTOOLEXTENSION</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TOOLEXTENSIONSTypeImpl extends EObjectImpl implements TOOLEXTENSIONSType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TOOLEXTENSIONSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.TOOLEXTENSIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, MyreqifPackage.TOOLEXTENSIONS_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<REQIFTOOLEXTENSION> getREQIFTOOLEXTENSION() {
		return getGroup().list(MyreqifPackage.Literals.TOOLEXTENSIONS_TYPE__REQIFTOOLEXTENSION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyreqifPackage.TOOLEXTENSIONS_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case MyreqifPackage.TOOLEXTENSIONS_TYPE__REQIFTOOLEXTENSION:
				return ((InternalEList<?>)getREQIFTOOLEXTENSION()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyreqifPackage.TOOLEXTENSIONS_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case MyreqifPackage.TOOLEXTENSIONS_TYPE__REQIFTOOLEXTENSION:
				return getREQIFTOOLEXTENSION();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MyreqifPackage.TOOLEXTENSIONS_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case MyreqifPackage.TOOLEXTENSIONS_TYPE__REQIFTOOLEXTENSION:
				getREQIFTOOLEXTENSION().clear();
				getREQIFTOOLEXTENSION().addAll((Collection<? extends REQIFTOOLEXTENSION>)newValue);
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
			case MyreqifPackage.TOOLEXTENSIONS_TYPE__GROUP:
				getGroup().clear();
				return;
			case MyreqifPackage.TOOLEXTENSIONS_TYPE__REQIFTOOLEXTENSION:
				getREQIFTOOLEXTENSION().clear();
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
			case MyreqifPackage.TOOLEXTENSIONS_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case MyreqifPackage.TOOLEXTENSIONS_TYPE__REQIFTOOLEXTENSION:
				return !getREQIFTOOLEXTENSION().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //TOOLEXTENSIONSTypeImpl
