/**
 */
package org.eclipse.rmf.reqif10.pror.configuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pror General Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.pror.configuration.ProrGeneralConfiguration#getLabelConfiguration <em>Label Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage#getProrGeneralConfiguration()
 * @model
 * @generated
 */
public interface ProrGeneralConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Label Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Configuration</em>' containment reference.
	 * @see #isSetLabelConfiguration()
	 * @see #unsetLabelConfiguration()
	 * @see #setLabelConfiguration(LabelConfiguration)
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage#getProrGeneralConfiguration_LabelConfiguration()
	 * @model containment="true" unsettable="true" required="true"
	 *        extendedMetaData="name='labelConfiguration' kind='element' namespace='##targetNamespace'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='labelConfiguration' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	LabelConfiguration getLabelConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrGeneralConfiguration#getLabelConfiguration <em>Label Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Configuration</em>' containment reference.
	 * @see #isSetLabelConfiguration()
	 * @see #unsetLabelConfiguration()
	 * @see #getLabelConfiguration()
	 * @generated
	 */
	void setLabelConfiguration(LabelConfiguration value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrGeneralConfiguration#getLabelConfiguration <em>Label Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLabelConfiguration()
	 * @see #getLabelConfiguration()
	 * @see #setLabelConfiguration(LabelConfiguration)
	 * @generated
	 */
	void unsetLabelConfiguration();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrGeneralConfiguration#getLabelConfiguration <em>Label Configuration</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Label Configuration</em>' containment reference is set.
	 * @see #unsetLabelConfiguration()
	 * @see #getLabelConfiguration()
	 * @see #setLabelConfiguration(LabelConfiguration)
	 * @generated
	 */
	boolean isSetLabelConfiguration();

} // ProrGeneralConfiguration
