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
package org.eclipse.rmf.tests.serialization.env.emf.myreqif;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ATTRIBUTEDEFINITIONINTEGER</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#getALTERNATIVEID <em>ALTERNATIVEID</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#getDEFAULTVALUE <em>DEFAULTVALUE</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#getTYPE <em>TYPE</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#getDESC <em>DESC</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#isISEDITABLE <em>ISEDITABLE</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#getLONGNAME <em>LONGNAME</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getATTRIBUTEDEFINITIONINTEGER()
 * @model extendedMetaData="name='ATTRIBUTE-DEFINITION-INTEGER' kind='elementOnly'"
 * @generated
 */
public interface ATTRIBUTEDEFINITIONINTEGER extends EObject {
	/**
	 * Returns the value of the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ALTERNATIVEID</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ALTERNATIVEID</em>' containment reference.
	 * @see #setALTERNATIVEID(ALTERNATIVEIDType21)
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getATTRIBUTEDEFINITIONINTEGER_ALTERNATIVEID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ALTERNATIVE-ID' namespace='##targetNamespace'"
	 * @generated
	 */
	ALTERNATIVEIDType21 getALTERNATIVEID();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#getALTERNATIVEID <em>ALTERNATIVEID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ALTERNATIVEID</em>' containment reference.
	 * @see #getALTERNATIVEID()
	 * @generated
	 */
	void setALTERNATIVEID(ALTERNATIVEIDType21 value);

	/**
	 * Returns the value of the '<em><b>DEFAULTVALUE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DEFAULTVALUE</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DEFAULTVALUE</em>' containment reference.
	 * @see #setDEFAULTVALUE(DEFAULTVALUEType2)
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getATTRIBUTEDEFINITIONINTEGER_DEFAULTVALUE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DEFAULT-VALUE' namespace='##targetNamespace'"
	 * @generated
	 */
	DEFAULTVALUEType2 getDEFAULTVALUE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#getDEFAULTVALUE <em>DEFAULTVALUE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DEFAULTVALUE</em>' containment reference.
	 * @see #getDEFAULTVALUE()
	 * @generated
	 */
	void setDEFAULTVALUE(DEFAULTVALUEType2 value);

	/**
	 * Returns the value of the '<em><b>TYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TYPE</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TYPE</em>' containment reference.
	 * @see #setTYPE(TYPEType2)
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getATTRIBUTEDEFINITIONINTEGER_TYPE()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TYPE' namespace='##targetNamespace'"
	 * @generated
	 */
	TYPEType2 getTYPE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#getTYPE <em>TYPE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TYPE</em>' containment reference.
	 * @see #getTYPE()
	 * @generated
	 */
	void setTYPE(TYPEType2 value);

	/**
	 * Returns the value of the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DESC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DESC</em>' attribute.
	 * @see #setDESC(String)
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getATTRIBUTEDEFINITIONINTEGER_DESC()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='DESC'"
	 * @generated
	 */
	String getDESC();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#getDESC <em>DESC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DESC</em>' attribute.
	 * @see #getDESC()
	 * @generated
	 */
	void setDESC(String value);

	/**
	 * Returns the value of the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IDENTIFIER</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IDENTIFIER</em>' attribute.
	 * @see #setIDENTIFIER(String)
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getATTRIBUTEDEFINITIONINTEGER_IDENTIFIER()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='IDENTIFIER'"
	 * @generated
	 */
	String getIDENTIFIER();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDENTIFIER</em>' attribute.
	 * @see #getIDENTIFIER()
	 * @generated
	 */
	void setIDENTIFIER(String value);

	/**
	 * Returns the value of the '<em><b>ISEDITABLE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ISEDITABLE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ISEDITABLE</em>' attribute.
	 * @see #isSetISEDITABLE()
	 * @see #unsetISEDITABLE()
	 * @see #setISEDITABLE(boolean)
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getATTRIBUTEDEFINITIONINTEGER_ISEDITABLE()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IS-EDITABLE'"
	 * @generated
	 */
	boolean isISEDITABLE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#isISEDITABLE <em>ISEDITABLE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ISEDITABLE</em>' attribute.
	 * @see #isSetISEDITABLE()
	 * @see #unsetISEDITABLE()
	 * @see #isISEDITABLE()
	 * @generated
	 */
	void setISEDITABLE(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#isISEDITABLE <em>ISEDITABLE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetISEDITABLE()
	 * @see #isISEDITABLE()
	 * @see #setISEDITABLE(boolean)
	 * @generated
	 */
	void unsetISEDITABLE();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#isISEDITABLE <em>ISEDITABLE</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ISEDITABLE</em>' attribute is set.
	 * @see #unsetISEDITABLE()
	 * @see #isISEDITABLE()
	 * @see #setISEDITABLE(boolean)
	 * @generated
	 */
	boolean isSetISEDITABLE();

	/**
	 * Returns the value of the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LASTCHANGE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LASTCHANGE</em>' attribute.
	 * @see #setLASTCHANGE(XMLGregorianCalendar)
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getATTRIBUTEDEFINITIONINTEGER_LASTCHANGE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='attribute' name='LAST-CHANGE'"
	 * @generated
	 */
	XMLGregorianCalendar getLASTCHANGE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#getLASTCHANGE <em>LASTCHANGE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LASTCHANGE</em>' attribute.
	 * @see #getLASTCHANGE()
	 * @generated
	 */
	void setLASTCHANGE(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LONGNAME</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LONGNAME</em>' attribute.
	 * @see #setLONGNAME(String)
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getATTRIBUTEDEFINITIONINTEGER_LONGNAME()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='LONG-NAME'"
	 * @generated
	 */
	String getLONGNAME();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#getLONGNAME <em>LONGNAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LONGNAME</em>' attribute.
	 * @see #getLONGNAME()
	 * @generated
	 */
	void setLONGNAME(String value);

} // ATTRIBUTEDEFINITIONINTEGER
