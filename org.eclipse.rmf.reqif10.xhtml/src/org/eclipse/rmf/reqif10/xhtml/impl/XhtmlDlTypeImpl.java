/**
 * Copyright (c) 2013 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.reqif10.xhtml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.xml.namespace.SpaceType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDdType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDlType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDtType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Dl Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlDlTypeImpl#getGroup <em>Group</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlDlTypeImpl#getDt <em>Dt</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlDlTypeImpl#getDd <em>Dd</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlDlTypeImpl#getClass_ <em>Class</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlDlTypeImpl#getId <em>Id</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlDlTypeImpl#getLang <em>Lang</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlDlTypeImpl#getSpace <em>Space</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlDlTypeImpl#getStyle <em>Style</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlDlTypeImpl#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class XhtmlDlTypeImpl extends MinimalEObjectImpl implements XhtmlDlType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected String lang = LANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpace() <em>Space</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSpace()
	 * @generated
	 * @ordered
	 */
	protected static final SpaceType SPACE_EDEFAULT = SpaceType.PRESERVE_LITERAL;

	/**
	 * The cached value of the '{@link #getSpace() <em>Space</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getSpace()
	 * @generated
	 * @ordered
	 */
	protected SpaceType space = SPACE_EDEFAULT;

	/**
	 * This is true if the Space attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean spaceESet;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected XhtmlDlTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XhtmlPackage.eINSTANCE.getXhtmlDlType();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, XhtmlPackage.XHTML_DL_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlDtType> getDt() {
		return getGroup().list(XhtmlPackage.eINSTANCE.getXhtmlDlType_Dt());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlDdType> getDd() {
		return getGroup().list(XhtmlPackage.eINSTANCE.getXhtmlDlType_Dd());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_DL_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_DL_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLang(String newLang) {
		String oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_DL_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SpaceType getSpace() {
		return space;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSpace(SpaceType newSpace) {
		SpaceType oldSpace = space;
		space = newSpace == null ? SPACE_EDEFAULT : newSpace;
		boolean oldSpaceESet = spaceESet;
		spaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_DL_TYPE__SPACE, oldSpace, space, !oldSpaceESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetSpace() {
		SpaceType oldSpace = space;
		boolean oldSpaceESet = spaceESet;
		space = SPACE_EDEFAULT;
		spaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XhtmlPackage.XHTML_DL_TYPE__SPACE, oldSpace, SPACE_EDEFAULT, oldSpaceESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetSpace() {
		return spaceESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_DL_TYPE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_DL_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case XhtmlPackage.XHTML_DL_TYPE__GROUP:
			return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_DL_TYPE__DT:
			return ((InternalEList<?>) getDt()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_DL_TYPE__DD:
			return ((InternalEList<?>) getDd()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case XhtmlPackage.XHTML_DL_TYPE__GROUP:
			if (coreType)
				return getGroup();
			return ((FeatureMap.Internal) getGroup()).getWrapper();
		case XhtmlPackage.XHTML_DL_TYPE__DT:
			return getDt();
		case XhtmlPackage.XHTML_DL_TYPE__DD:
			return getDd();
		case XhtmlPackage.XHTML_DL_TYPE__CLASS:
			return getClass_();
		case XhtmlPackage.XHTML_DL_TYPE__ID:
			return getId();
		case XhtmlPackage.XHTML_DL_TYPE__LANG:
			return getLang();
		case XhtmlPackage.XHTML_DL_TYPE__SPACE:
			return getSpace();
		case XhtmlPackage.XHTML_DL_TYPE__STYLE:
			return getStyle();
		case XhtmlPackage.XHTML_DL_TYPE__TITLE:
			return getTitle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case XhtmlPackage.XHTML_DL_TYPE__GROUP:
			((FeatureMap.Internal) getGroup()).set(newValue);
			return;
		case XhtmlPackage.XHTML_DL_TYPE__DT:
			getDt().clear();
			getDt().addAll((Collection<? extends XhtmlDtType>) newValue);
			return;
		case XhtmlPackage.XHTML_DL_TYPE__DD:
			getDd().clear();
			getDd().addAll((Collection<? extends XhtmlDdType>) newValue);
			return;
		case XhtmlPackage.XHTML_DL_TYPE__CLASS:
			setClass((String) newValue);
			return;
		case XhtmlPackage.XHTML_DL_TYPE__ID:
			setId((String) newValue);
			return;
		case XhtmlPackage.XHTML_DL_TYPE__LANG:
			setLang((String) newValue);
			return;
		case XhtmlPackage.XHTML_DL_TYPE__SPACE:
			setSpace((SpaceType) newValue);
			return;
		case XhtmlPackage.XHTML_DL_TYPE__STYLE:
			setStyle((String) newValue);
			return;
		case XhtmlPackage.XHTML_DL_TYPE__TITLE:
			setTitle((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case XhtmlPackage.XHTML_DL_TYPE__GROUP:
			getGroup().clear();
			return;
		case XhtmlPackage.XHTML_DL_TYPE__DT:
			getDt().clear();
			return;
		case XhtmlPackage.XHTML_DL_TYPE__DD:
			getDd().clear();
			return;
		case XhtmlPackage.XHTML_DL_TYPE__CLASS:
			setClass(CLASS_EDEFAULT);
			return;
		case XhtmlPackage.XHTML_DL_TYPE__ID:
			setId(ID_EDEFAULT);
			return;
		case XhtmlPackage.XHTML_DL_TYPE__LANG:
			setLang(LANG_EDEFAULT);
			return;
		case XhtmlPackage.XHTML_DL_TYPE__SPACE:
			unsetSpace();
			return;
		case XhtmlPackage.XHTML_DL_TYPE__STYLE:
			setStyle(STYLE_EDEFAULT);
			return;
		case XhtmlPackage.XHTML_DL_TYPE__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case XhtmlPackage.XHTML_DL_TYPE__GROUP:
			return group != null && !group.isEmpty();
		case XhtmlPackage.XHTML_DL_TYPE__DT:
			return !getDt().isEmpty();
		case XhtmlPackage.XHTML_DL_TYPE__DD:
			return !getDd().isEmpty();
		case XhtmlPackage.XHTML_DL_TYPE__CLASS:
			return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
		case XhtmlPackage.XHTML_DL_TYPE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case XhtmlPackage.XHTML_DL_TYPE__LANG:
			return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
		case XhtmlPackage.XHTML_DL_TYPE__SPACE:
			return isSetSpace();
		case XhtmlPackage.XHTML_DL_TYPE__STYLE:
			return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
		case XhtmlPackage.XHTML_DL_TYPE__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: "); //$NON-NLS-1$
		result.append(group);
		result.append(", class: "); //$NON-NLS-1$
		result.append(class_);
		result.append(", id: "); //$NON-NLS-1$
		result.append(id);
		result.append(", lang: "); //$NON-NLS-1$
		result.append(lang);
		result.append(", space: "); //$NON-NLS-1$
		if (spaceESet)
			result.append(space);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(", style: "); //$NON-NLS-1$
		result.append(style);
		result.append(", title: "); //$NON-NLS-1$
		result.append(title);
		result.append(')');
		return result.toString();
	}

} // XhtmlDlTypeImpl
