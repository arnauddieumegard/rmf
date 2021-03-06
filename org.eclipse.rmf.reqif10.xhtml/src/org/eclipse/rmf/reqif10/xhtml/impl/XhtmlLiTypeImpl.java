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
import org.eclipse.rmf.reqif10.xhtml.XhtmlAType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlBrType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDivType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDlType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlEditType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlEmType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type;
import org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type;
import org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type;
import org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type;
import org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type;
import org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type;
import org.eclipse.rmf.reqif10.xhtml.XhtmlHrType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlLiType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlOlType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPackage;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPreType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlQType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlSampType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlTableType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlUlType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlVarType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Li Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getMixed <em>Mixed</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getXhtmlFlowMix <em>Xhtml Flow Mix</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getH1 <em>H1</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getH2 <em>H2</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getH3 <em>H3</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getH4 <em>H4</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getH5 <em>H5</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getH6 <em>H6</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getUl <em>Ul</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getOl <em>Ol</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getDl <em>Dl</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getP <em>P</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getDiv <em>Div</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getPre <em>Pre</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getBlockquote <em>Blockquote</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getAddress <em>Address</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getHr <em>Hr</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getTable <em>Table</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getBr <em>Br</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getSpan <em>Span</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getEm <em>Em</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getStrong <em>Strong</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getDfn <em>Dfn</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getCode <em>Code</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getSamp <em>Samp</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getKbd <em>Kbd</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getVar <em>Var</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getCite <em>Cite</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getAbbr <em>Abbr</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getAcronym <em>Acronym</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getQ <em>Q</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getTt <em>Tt</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getI <em>I</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getB <em>B</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getBig <em>Big</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getSmall <em>Small</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getSub <em>Sub</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getSup <em>Sup</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getA <em>A</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getObject <em>Object</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getIns <em>Ins</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getDel <em>Del</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getClass_ <em>Class</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getId <em>Id</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getLang <em>Lang</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getSpace <em>Space</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getStyle <em>Style</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class XhtmlLiTypeImpl extends MinimalEObjectImpl implements XhtmlLiType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

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
	protected XhtmlLiTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XhtmlPackage.eINSTANCE.getXhtmlLiType();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XhtmlPackage.XHTML_LI_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getXhtmlFlowMix() {
		return (FeatureMap) getMixed().<FeatureMap.Entry> list(XhtmlPackage.eINSTANCE.getXhtmlLiType_XhtmlFlowMix());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlH1Type> getH1() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_H1());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlH2Type> getH2() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_H2());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlH3Type> getH3() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_H3());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlH4Type> getH4() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_H4());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlH5Type> getH5() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_H5());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlH6Type> getH6() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_H6());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlUlType> getUl() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Ul());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlOlType> getOl() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Ol());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlDlType> getDl() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Dl());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlPType> getP() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_P());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlDivType> getDiv() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Div());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlPreType> getPre() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Pre());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlBlockquoteType> getBlockquote() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Blockquote());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlAddressType> getAddress() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Address());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlHrType> getHr() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Hr());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlTableType> getTable() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Table());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlBrType> getBr() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Br());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlSpanType> getSpan() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Span());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlEmType> getEm() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Em());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlStrongType> getStrong() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Strong());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlDfnType> getDfn() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Dfn());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlCodeType> getCode() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Code());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlSampType> getSamp() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Samp());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlKbdType> getKbd() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Kbd());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlVarType> getVar() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Var());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlCiteType> getCite() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Cite());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlAbbrType> getAbbr() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Abbr());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlAcronymType> getAcronym() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Acronym());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlQType> getQ() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Q());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlInlPresType> getTt() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Tt());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlInlPresType> getI() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_I());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlInlPresType> getB() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_B());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlInlPresType> getBig() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Big());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlInlPresType> getSmall() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Small());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlInlPresType> getSub() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Sub());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlInlPresType> getSup() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Sup());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlAType> getA() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_A());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlObjectType> getObject() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Object());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlEditType> getIns() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Ins());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XhtmlEditType> getDel() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlLiType_Del());
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_LI_TYPE__CLASS, oldClass, class_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_LI_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_LI_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_LI_TYPE__SPACE, oldSpace, space, !oldSpaceESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XhtmlPackage.XHTML_LI_TYPE__SPACE, oldSpace, SPACE_EDEFAULT, oldSpaceESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_LI_TYPE__STYLE, oldStyle, style));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_LI_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case XhtmlPackage.XHTML_LI_TYPE__MIXED:
			return ((InternalEList<?>) getMixed()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__XHTML_FLOW_MIX:
			return ((InternalEList<?>) getXhtmlFlowMix()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__H1:
			return ((InternalEList<?>) getH1()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__H2:
			return ((InternalEList<?>) getH2()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__H3:
			return ((InternalEList<?>) getH3()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__H4:
			return ((InternalEList<?>) getH4()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__H5:
			return ((InternalEList<?>) getH5()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__H6:
			return ((InternalEList<?>) getH6()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__UL:
			return ((InternalEList<?>) getUl()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__OL:
			return ((InternalEList<?>) getOl()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__DL:
			return ((InternalEList<?>) getDl()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__P:
			return ((InternalEList<?>) getP()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__DIV:
			return ((InternalEList<?>) getDiv()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__PRE:
			return ((InternalEList<?>) getPre()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__BLOCKQUOTE:
			return ((InternalEList<?>) getBlockquote()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__ADDRESS:
			return ((InternalEList<?>) getAddress()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__HR:
			return ((InternalEList<?>) getHr()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__TABLE:
			return ((InternalEList<?>) getTable()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__BR:
			return ((InternalEList<?>) getBr()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__SPAN:
			return ((InternalEList<?>) getSpan()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__EM:
			return ((InternalEList<?>) getEm()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__STRONG:
			return ((InternalEList<?>) getStrong()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__DFN:
			return ((InternalEList<?>) getDfn()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__CODE:
			return ((InternalEList<?>) getCode()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__SAMP:
			return ((InternalEList<?>) getSamp()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__KBD:
			return ((InternalEList<?>) getKbd()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__VAR:
			return ((InternalEList<?>) getVar()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__CITE:
			return ((InternalEList<?>) getCite()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__ABBR:
			return ((InternalEList<?>) getAbbr()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__ACRONYM:
			return ((InternalEList<?>) getAcronym()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__Q:
			return ((InternalEList<?>) getQ()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__TT:
			return ((InternalEList<?>) getTt()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__I:
			return ((InternalEList<?>) getI()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__B:
			return ((InternalEList<?>) getB()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__BIG:
			return ((InternalEList<?>) getBig()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__SMALL:
			return ((InternalEList<?>) getSmall()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__SUB:
			return ((InternalEList<?>) getSub()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__SUP:
			return ((InternalEList<?>) getSup()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__A:
			return ((InternalEList<?>) getA()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__OBJECT:
			return ((InternalEList<?>) getObject()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__INS:
			return ((InternalEList<?>) getIns()).basicRemove(otherEnd, msgs);
		case XhtmlPackage.XHTML_LI_TYPE__DEL:
			return ((InternalEList<?>) getDel()).basicRemove(otherEnd, msgs);
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
		case XhtmlPackage.XHTML_LI_TYPE__MIXED:
			if (coreType)
				return getMixed();
			return ((FeatureMap.Internal) getMixed()).getWrapper();
		case XhtmlPackage.XHTML_LI_TYPE__XHTML_FLOW_MIX:
			if (coreType)
				return getXhtmlFlowMix();
			return ((FeatureMap.Internal) getXhtmlFlowMix()).getWrapper();
		case XhtmlPackage.XHTML_LI_TYPE__H1:
			return getH1();
		case XhtmlPackage.XHTML_LI_TYPE__H2:
			return getH2();
		case XhtmlPackage.XHTML_LI_TYPE__H3:
			return getH3();
		case XhtmlPackage.XHTML_LI_TYPE__H4:
			return getH4();
		case XhtmlPackage.XHTML_LI_TYPE__H5:
			return getH5();
		case XhtmlPackage.XHTML_LI_TYPE__H6:
			return getH6();
		case XhtmlPackage.XHTML_LI_TYPE__UL:
			return getUl();
		case XhtmlPackage.XHTML_LI_TYPE__OL:
			return getOl();
		case XhtmlPackage.XHTML_LI_TYPE__DL:
			return getDl();
		case XhtmlPackage.XHTML_LI_TYPE__P:
			return getP();
		case XhtmlPackage.XHTML_LI_TYPE__DIV:
			return getDiv();
		case XhtmlPackage.XHTML_LI_TYPE__PRE:
			return getPre();
		case XhtmlPackage.XHTML_LI_TYPE__BLOCKQUOTE:
			return getBlockquote();
		case XhtmlPackage.XHTML_LI_TYPE__ADDRESS:
			return getAddress();
		case XhtmlPackage.XHTML_LI_TYPE__HR:
			return getHr();
		case XhtmlPackage.XHTML_LI_TYPE__TABLE:
			return getTable();
		case XhtmlPackage.XHTML_LI_TYPE__BR:
			return getBr();
		case XhtmlPackage.XHTML_LI_TYPE__SPAN:
			return getSpan();
		case XhtmlPackage.XHTML_LI_TYPE__EM:
			return getEm();
		case XhtmlPackage.XHTML_LI_TYPE__STRONG:
			return getStrong();
		case XhtmlPackage.XHTML_LI_TYPE__DFN:
			return getDfn();
		case XhtmlPackage.XHTML_LI_TYPE__CODE:
			return getCode();
		case XhtmlPackage.XHTML_LI_TYPE__SAMP:
			return getSamp();
		case XhtmlPackage.XHTML_LI_TYPE__KBD:
			return getKbd();
		case XhtmlPackage.XHTML_LI_TYPE__VAR:
			return getVar();
		case XhtmlPackage.XHTML_LI_TYPE__CITE:
			return getCite();
		case XhtmlPackage.XHTML_LI_TYPE__ABBR:
			return getAbbr();
		case XhtmlPackage.XHTML_LI_TYPE__ACRONYM:
			return getAcronym();
		case XhtmlPackage.XHTML_LI_TYPE__Q:
			return getQ();
		case XhtmlPackage.XHTML_LI_TYPE__TT:
			return getTt();
		case XhtmlPackage.XHTML_LI_TYPE__I:
			return getI();
		case XhtmlPackage.XHTML_LI_TYPE__B:
			return getB();
		case XhtmlPackage.XHTML_LI_TYPE__BIG:
			return getBig();
		case XhtmlPackage.XHTML_LI_TYPE__SMALL:
			return getSmall();
		case XhtmlPackage.XHTML_LI_TYPE__SUB:
			return getSub();
		case XhtmlPackage.XHTML_LI_TYPE__SUP:
			return getSup();
		case XhtmlPackage.XHTML_LI_TYPE__A:
			return getA();
		case XhtmlPackage.XHTML_LI_TYPE__OBJECT:
			return getObject();
		case XhtmlPackage.XHTML_LI_TYPE__INS:
			return getIns();
		case XhtmlPackage.XHTML_LI_TYPE__DEL:
			return getDel();
		case XhtmlPackage.XHTML_LI_TYPE__CLASS:
			return getClass_();
		case XhtmlPackage.XHTML_LI_TYPE__ID:
			return getId();
		case XhtmlPackage.XHTML_LI_TYPE__LANG:
			return getLang();
		case XhtmlPackage.XHTML_LI_TYPE__SPACE:
			return getSpace();
		case XhtmlPackage.XHTML_LI_TYPE__STYLE:
			return getStyle();
		case XhtmlPackage.XHTML_LI_TYPE__TITLE:
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
		case XhtmlPackage.XHTML_LI_TYPE__MIXED:
			((FeatureMap.Internal) getMixed()).set(newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__XHTML_FLOW_MIX:
			((FeatureMap.Internal) getXhtmlFlowMix()).set(newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__H1:
			getH1().clear();
			getH1().addAll((Collection<? extends XhtmlH1Type>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__H2:
			getH2().clear();
			getH2().addAll((Collection<? extends XhtmlH2Type>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__H3:
			getH3().clear();
			getH3().addAll((Collection<? extends XhtmlH3Type>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__H4:
			getH4().clear();
			getH4().addAll((Collection<? extends XhtmlH4Type>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__H5:
			getH5().clear();
			getH5().addAll((Collection<? extends XhtmlH5Type>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__H6:
			getH6().clear();
			getH6().addAll((Collection<? extends XhtmlH6Type>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__UL:
			getUl().clear();
			getUl().addAll((Collection<? extends XhtmlUlType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__OL:
			getOl().clear();
			getOl().addAll((Collection<? extends XhtmlOlType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__DL:
			getDl().clear();
			getDl().addAll((Collection<? extends XhtmlDlType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__P:
			getP().clear();
			getP().addAll((Collection<? extends XhtmlPType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__DIV:
			getDiv().clear();
			getDiv().addAll((Collection<? extends XhtmlDivType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__PRE:
			getPre().clear();
			getPre().addAll((Collection<? extends XhtmlPreType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__BLOCKQUOTE:
			getBlockquote().clear();
			getBlockquote().addAll((Collection<? extends XhtmlBlockquoteType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__ADDRESS:
			getAddress().clear();
			getAddress().addAll((Collection<? extends XhtmlAddressType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__HR:
			getHr().clear();
			getHr().addAll((Collection<? extends XhtmlHrType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__TABLE:
			getTable().clear();
			getTable().addAll((Collection<? extends XhtmlTableType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__BR:
			getBr().clear();
			getBr().addAll((Collection<? extends XhtmlBrType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__SPAN:
			getSpan().clear();
			getSpan().addAll((Collection<? extends XhtmlSpanType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__EM:
			getEm().clear();
			getEm().addAll((Collection<? extends XhtmlEmType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__STRONG:
			getStrong().clear();
			getStrong().addAll((Collection<? extends XhtmlStrongType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__DFN:
			getDfn().clear();
			getDfn().addAll((Collection<? extends XhtmlDfnType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__CODE:
			getCode().clear();
			getCode().addAll((Collection<? extends XhtmlCodeType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__SAMP:
			getSamp().clear();
			getSamp().addAll((Collection<? extends XhtmlSampType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__KBD:
			getKbd().clear();
			getKbd().addAll((Collection<? extends XhtmlKbdType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__VAR:
			getVar().clear();
			getVar().addAll((Collection<? extends XhtmlVarType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__CITE:
			getCite().clear();
			getCite().addAll((Collection<? extends XhtmlCiteType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__ABBR:
			getAbbr().clear();
			getAbbr().addAll((Collection<? extends XhtmlAbbrType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__ACRONYM:
			getAcronym().clear();
			getAcronym().addAll((Collection<? extends XhtmlAcronymType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__Q:
			getQ().clear();
			getQ().addAll((Collection<? extends XhtmlQType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__TT:
			getTt().clear();
			getTt().addAll((Collection<? extends XhtmlInlPresType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__I:
			getI().clear();
			getI().addAll((Collection<? extends XhtmlInlPresType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__B:
			getB().clear();
			getB().addAll((Collection<? extends XhtmlInlPresType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__BIG:
			getBig().clear();
			getBig().addAll((Collection<? extends XhtmlInlPresType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__SMALL:
			getSmall().clear();
			getSmall().addAll((Collection<? extends XhtmlInlPresType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__SUB:
			getSub().clear();
			getSub().addAll((Collection<? extends XhtmlInlPresType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__SUP:
			getSup().clear();
			getSup().addAll((Collection<? extends XhtmlInlPresType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__A:
			getA().clear();
			getA().addAll((Collection<? extends XhtmlAType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__OBJECT:
			getObject().clear();
			getObject().addAll((Collection<? extends XhtmlObjectType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__INS:
			getIns().clear();
			getIns().addAll((Collection<? extends XhtmlEditType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__DEL:
			getDel().clear();
			getDel().addAll((Collection<? extends XhtmlEditType>) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__CLASS:
			setClass((String) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__ID:
			setId((String) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__LANG:
			setLang((String) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__SPACE:
			setSpace((SpaceType) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__STYLE:
			setStyle((String) newValue);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__TITLE:
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
		case XhtmlPackage.XHTML_LI_TYPE__MIXED:
			getMixed().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__XHTML_FLOW_MIX:
			getXhtmlFlowMix().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__H1:
			getH1().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__H2:
			getH2().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__H3:
			getH3().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__H4:
			getH4().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__H5:
			getH5().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__H6:
			getH6().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__UL:
			getUl().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__OL:
			getOl().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__DL:
			getDl().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__P:
			getP().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__DIV:
			getDiv().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__PRE:
			getPre().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__BLOCKQUOTE:
			getBlockquote().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__ADDRESS:
			getAddress().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__HR:
			getHr().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__TABLE:
			getTable().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__BR:
			getBr().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__SPAN:
			getSpan().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__EM:
			getEm().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__STRONG:
			getStrong().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__DFN:
			getDfn().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__CODE:
			getCode().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__SAMP:
			getSamp().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__KBD:
			getKbd().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__VAR:
			getVar().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__CITE:
			getCite().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__ABBR:
			getAbbr().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__ACRONYM:
			getAcronym().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__Q:
			getQ().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__TT:
			getTt().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__I:
			getI().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__B:
			getB().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__BIG:
			getBig().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__SMALL:
			getSmall().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__SUB:
			getSub().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__SUP:
			getSup().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__A:
			getA().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__OBJECT:
			getObject().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__INS:
			getIns().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__DEL:
			getDel().clear();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__CLASS:
			setClass(CLASS_EDEFAULT);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__ID:
			setId(ID_EDEFAULT);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__LANG:
			setLang(LANG_EDEFAULT);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__SPACE:
			unsetSpace();
			return;
		case XhtmlPackage.XHTML_LI_TYPE__STYLE:
			setStyle(STYLE_EDEFAULT);
			return;
		case XhtmlPackage.XHTML_LI_TYPE__TITLE:
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
		case XhtmlPackage.XHTML_LI_TYPE__MIXED:
			return mixed != null && !mixed.isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__XHTML_FLOW_MIX:
			return !getXhtmlFlowMix().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__H1:
			return !getH1().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__H2:
			return !getH2().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__H3:
			return !getH3().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__H4:
			return !getH4().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__H5:
			return !getH5().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__H6:
			return !getH6().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__UL:
			return !getUl().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__OL:
			return !getOl().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__DL:
			return !getDl().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__P:
			return !getP().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__DIV:
			return !getDiv().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__PRE:
			return !getPre().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__BLOCKQUOTE:
			return !getBlockquote().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__ADDRESS:
			return !getAddress().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__HR:
			return !getHr().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__TABLE:
			return !getTable().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__BR:
			return !getBr().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__SPAN:
			return !getSpan().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__EM:
			return !getEm().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__STRONG:
			return !getStrong().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__DFN:
			return !getDfn().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__CODE:
			return !getCode().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__SAMP:
			return !getSamp().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__KBD:
			return !getKbd().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__VAR:
			return !getVar().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__CITE:
			return !getCite().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__ABBR:
			return !getAbbr().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__ACRONYM:
			return !getAcronym().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__Q:
			return !getQ().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__TT:
			return !getTt().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__I:
			return !getI().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__B:
			return !getB().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__BIG:
			return !getBig().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__SMALL:
			return !getSmall().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__SUB:
			return !getSub().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__SUP:
			return !getSup().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__A:
			return !getA().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__OBJECT:
			return !getObject().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__INS:
			return !getIns().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__DEL:
			return !getDel().isEmpty();
		case XhtmlPackage.XHTML_LI_TYPE__CLASS:
			return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
		case XhtmlPackage.XHTML_LI_TYPE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case XhtmlPackage.XHTML_LI_TYPE__LANG:
			return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
		case XhtmlPackage.XHTML_LI_TYPE__SPACE:
			return isSetSpace();
		case XhtmlPackage.XHTML_LI_TYPE__STYLE:
			return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
		case XhtmlPackage.XHTML_LI_TYPE__TITLE:
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
		result.append(" (mixed: "); //$NON-NLS-1$
		result.append(mixed);
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

} // XhtmlLiTypeImpl
