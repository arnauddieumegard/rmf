/**
 */
package org.eclipse.rmf.reqif10.pror.configuration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.rmf.reqif10.pror.configuration.ConfigurationFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "configuration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/rmf/pror/toolextensions/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "configuration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigurationPackage eINSTANCE = org.eclipse.rmf.reqif10.pror.configuration.impl.ConfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.pror.configuration.impl.ProrToolExtensionImpl <em>Pror Tool Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.ProrToolExtensionImpl
	 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.ConfigurationPackageImpl#getProrToolExtension()
	 * @generated
	 */
	int PROR_TOOL_EXTENSION = 0;

	/**
	 * The feature id for the '<em><b>Spec View Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROR_TOOL_EXTENSION__SPEC_VIEW_CONFIGURATIONS = 0;

	/**
	 * The feature id for the '<em><b>General Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROR_TOOL_EXTENSION__GENERAL_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Presentation Configurations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROR_TOOL_EXTENSION__PRESENTATION_CONFIGURATIONS = 2;

	/**
	 * The number of structural features of the '<em>Pror Tool Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROR_TOOL_EXTENSION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.pror.configuration.impl.ProrSpecViewConfigurationImpl <em>Pror Spec View Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.ProrSpecViewConfigurationImpl
	 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.ConfigurationPackageImpl#getProrSpecViewConfiguration()
	 * @generated
	 */
	int PROR_SPEC_VIEW_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROR_SPEC_VIEW_CONFIGURATION__SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROR_SPEC_VIEW_CONFIGURATION__COLUMNS = 1;

	/**
	 * The feature id for the '<em><b>Left Header Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROR_SPEC_VIEW_CONFIGURATION__LEFT_HEADER_COLUMN = 2;

	/**
	 * The number of structural features of the '<em>Pror Spec View Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROR_SPEC_VIEW_CONFIGURATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.pror.configuration.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.ColumnImpl
	 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.ConfigurationPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__WIDTH = 1;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.pror.configuration.impl.ProrPresentationConfigurationsImpl <em>Pror Presentation Configurations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.ProrPresentationConfigurationsImpl
	 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.ConfigurationPackageImpl#getProrPresentationConfigurations()
	 * @generated
	 */
	int PROR_PRESENTATION_CONFIGURATIONS = 3;

	/**
	 * The feature id for the '<em><b>Presentation Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROR_PRESENTATION_CONFIGURATIONS__PRESENTATION_CONFIGURATIONS = 0;

	/**
	 * The number of structural features of the '<em>Pror Presentation Configurations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROR_PRESENTATION_CONFIGURATIONS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.pror.configuration.impl.ProrPresentationConfigurationImpl <em>Pror Presentation Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.ProrPresentationConfigurationImpl
	 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.ConfigurationPackageImpl#getProrPresentationConfiguration()
	 * @generated
	 */
	int PROR_PRESENTATION_CONFIGURATION = 4;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROR_PRESENTATION_CONFIGURATION__DATATYPE = 0;

	/**
	 * The number of structural features of the '<em>Pror Presentation Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROR_PRESENTATION_CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.pror.configuration.impl.ProrGeneralConfigurationImpl <em>Pror General Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.ProrGeneralConfigurationImpl
	 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.ConfigurationPackageImpl#getProrGeneralConfiguration()
	 * @generated
	 */
	int PROR_GENERAL_CONFIGURATION = 5;

	/**
	 * The feature id for the '<em><b>Label Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROR_GENERAL_CONFIGURATION__LABEL_CONFIGURATION = 0;

	/**
	 * The number of structural features of the '<em>Pror General Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROR_GENERAL_CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.pror.configuration.impl.LabelConfigurationImpl <em>Label Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.LabelConfigurationImpl
	 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.ConfigurationPackageImpl#getLabelConfiguration()
	 * @generated
	 */
	int LABEL_CONFIGURATION = 6;

	/**
	 * The feature id for the '<em><b>Default Label</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_CONFIGURATION__DEFAULT_LABEL = 0;

	/**
	 * The number of structural features of the '<em>Label Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.pror.configuration.impl.UnifiedColumnImpl <em>Unified Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.UnifiedColumnImpl
	 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.ConfigurationPackageImpl#getUnifiedColumn()
	 * @generated
	 */
	int UNIFIED_COLUMN = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFIED_COLUMN__LABEL = COLUMN__LABEL;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFIED_COLUMN__WIDTH = COLUMN__WIDTH;

	/**
	 * The number of structural features of the '<em>Unified Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFIED_COLUMN_FEATURE_COUNT = COLUMN_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension <em>Pror Tool Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pror Tool Extension</em>'.
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension
	 * @generated
	 */
	EClass getProrToolExtension();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension#getSpecViewConfigurations <em>Spec View Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spec View Configurations</em>'.
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension#getSpecViewConfigurations()
	 * @see #getProrToolExtension()
	 * @generated
	 */
	EReference getProrToolExtension_SpecViewConfigurations();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension#getGeneralConfiguration <em>General Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>General Configuration</em>'.
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension#getGeneralConfiguration()
	 * @see #getProrToolExtension()
	 * @generated
	 */
	EReference getProrToolExtension_GeneralConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension#getPresentationConfigurations <em>Presentation Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Presentation Configurations</em>'.
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension#getPresentationConfigurations()
	 * @see #getProrToolExtension()
	 * @generated
	 */
	EReference getProrToolExtension_PresentationConfigurations();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration <em>Pror Spec View Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pror Spec View Configuration</em>'.
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration
	 * @generated
	 */
	EClass getProrSpecViewConfiguration();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specification</em>'.
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration#getSpecification()
	 * @see #getProrSpecViewConfiguration()
	 * @generated
	 */
	EReference getProrSpecViewConfiguration_Specification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration#getColumns()
	 * @see #getProrSpecViewConfiguration()
	 * @generated
	 */
	EReference getProrSpecViewConfiguration_Columns();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration#getLeftHeaderColumn <em>Left Header Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Header Column</em>'.
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration#getLeftHeaderColumn()
	 * @see #getProrSpecViewConfiguration()
	 * @generated
	 */
	EReference getProrSpecViewConfiguration_LeftHeaderColumn();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.pror.configuration.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see org.eclipse.rmf.reqif10.pror.configuration.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.pror.configuration.Column#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.rmf.reqif10.pror.configuration.Column#getLabel()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.pror.configuration.Column#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.rmf.reqif10.pror.configuration.Column#getWidth()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Width();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfigurations <em>Pror Presentation Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pror Presentation Configurations</em>'.
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfigurations
	 * @generated
	 */
	EClass getProrPresentationConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfigurations#getPresentationConfigurations <em>Presentation Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Presentation Configurations</em>'.
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfigurations#getPresentationConfigurations()
	 * @see #getProrPresentationConfigurations()
	 * @generated
	 */
	EReference getProrPresentationConfigurations_PresentationConfigurations();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration <em>Pror Presentation Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pror Presentation Configuration</em>'.
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration
	 * @generated
	 */
	EClass getProrPresentationConfiguration();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration#getDatatype()
	 * @see #getProrPresentationConfiguration()
	 * @generated
	 */
	EReference getProrPresentationConfiguration_Datatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrGeneralConfiguration <em>Pror General Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pror General Configuration</em>'.
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ProrGeneralConfiguration
	 * @generated
	 */
	EClass getProrGeneralConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrGeneralConfiguration#getLabelConfiguration <em>Label Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label Configuration</em>'.
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ProrGeneralConfiguration#getLabelConfiguration()
	 * @see #getProrGeneralConfiguration()
	 * @generated
	 */
	EReference getProrGeneralConfiguration_LabelConfiguration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.pror.configuration.LabelConfiguration <em>Label Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Configuration</em>'.
	 * @see org.eclipse.rmf.reqif10.pror.configuration.LabelConfiguration
	 * @generated
	 */
	EClass getLabelConfiguration();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.pror.configuration.LabelConfiguration#getDefaultLabel <em>Default Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Default Label</em>'.
	 * @see org.eclipse.rmf.reqif10.pror.configuration.LabelConfiguration#getDefaultLabel()
	 * @see #getLabelConfiguration()
	 * @generated
	 */
	EAttribute getLabelConfiguration_DefaultLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.pror.configuration.UnifiedColumn <em>Unified Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unified Column</em>'.
	 * @see org.eclipse.rmf.reqif10.pror.configuration.UnifiedColumn
	 * @generated
	 */
	EClass getUnifiedColumn();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigurationFactory getConfigurationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.pror.configuration.impl.ProrToolExtensionImpl <em>Pror Tool Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.ProrToolExtensionImpl
		 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.ConfigurationPackageImpl#getProrToolExtension()
		 * @generated
		 */
		EClass PROR_TOOL_EXTENSION = eINSTANCE.getProrToolExtension();

		/**
		 * The meta object literal for the '<em><b>Spec View Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROR_TOOL_EXTENSION__SPEC_VIEW_CONFIGURATIONS = eINSTANCE.getProrToolExtension_SpecViewConfigurations();

		/**
		 * The meta object literal for the '<em><b>General Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROR_TOOL_EXTENSION__GENERAL_CONFIGURATION = eINSTANCE.getProrToolExtension_GeneralConfiguration();

		/**
		 * The meta object literal for the '<em><b>Presentation Configurations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROR_TOOL_EXTENSION__PRESENTATION_CONFIGURATIONS = eINSTANCE.getProrToolExtension_PresentationConfigurations();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.pror.configuration.impl.ProrSpecViewConfigurationImpl <em>Pror Spec View Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.ProrSpecViewConfigurationImpl
		 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.ConfigurationPackageImpl#getProrSpecViewConfiguration()
		 * @generated
		 */
		EClass PROR_SPEC_VIEW_CONFIGURATION = eINSTANCE.getProrSpecViewConfiguration();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROR_SPEC_VIEW_CONFIGURATION__SPECIFICATION = eINSTANCE.getProrSpecViewConfiguration_Specification();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROR_SPEC_VIEW_CONFIGURATION__COLUMNS = eINSTANCE.getProrSpecViewConfiguration_Columns();

		/**
		 * The meta object literal for the '<em><b>Left Header Column</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROR_SPEC_VIEW_CONFIGURATION__LEFT_HEADER_COLUMN = eINSTANCE.getProrSpecViewConfiguration_LeftHeaderColumn();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.pror.configuration.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.ColumnImpl
		 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.ConfigurationPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__LABEL = eINSTANCE.getColumn_Label();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__WIDTH = eINSTANCE.getColumn_Width();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.pror.configuration.impl.ProrPresentationConfigurationsImpl <em>Pror Presentation Configurations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.ProrPresentationConfigurationsImpl
		 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.ConfigurationPackageImpl#getProrPresentationConfigurations()
		 * @generated
		 */
		EClass PROR_PRESENTATION_CONFIGURATIONS = eINSTANCE.getProrPresentationConfigurations();

		/**
		 * The meta object literal for the '<em><b>Presentation Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROR_PRESENTATION_CONFIGURATIONS__PRESENTATION_CONFIGURATIONS = eINSTANCE.getProrPresentationConfigurations_PresentationConfigurations();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.pror.configuration.impl.ProrPresentationConfigurationImpl <em>Pror Presentation Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.ProrPresentationConfigurationImpl
		 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.ConfigurationPackageImpl#getProrPresentationConfiguration()
		 * @generated
		 */
		EClass PROR_PRESENTATION_CONFIGURATION = eINSTANCE.getProrPresentationConfiguration();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROR_PRESENTATION_CONFIGURATION__DATATYPE = eINSTANCE.getProrPresentationConfiguration_Datatype();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.pror.configuration.impl.ProrGeneralConfigurationImpl <em>Pror General Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.ProrGeneralConfigurationImpl
		 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.ConfigurationPackageImpl#getProrGeneralConfiguration()
		 * @generated
		 */
		EClass PROR_GENERAL_CONFIGURATION = eINSTANCE.getProrGeneralConfiguration();

		/**
		 * The meta object literal for the '<em><b>Label Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROR_GENERAL_CONFIGURATION__LABEL_CONFIGURATION = eINSTANCE.getProrGeneralConfiguration_LabelConfiguration();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.pror.configuration.impl.LabelConfigurationImpl <em>Label Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.LabelConfigurationImpl
		 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.ConfigurationPackageImpl#getLabelConfiguration()
		 * @generated
		 */
		EClass LABEL_CONFIGURATION = eINSTANCE.getLabelConfiguration();

		/**
		 * The meta object literal for the '<em><b>Default Label</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_CONFIGURATION__DEFAULT_LABEL = eINSTANCE.getLabelConfiguration_DefaultLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.pror.configuration.impl.UnifiedColumnImpl <em>Unified Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.UnifiedColumnImpl
		 * @see org.eclipse.rmf.reqif10.pror.configuration.impl.ConfigurationPackageImpl#getUnifiedColumn()
		 * @generated
		 */
		EClass UNIFIED_COLUMN = eINSTANCE.getUnifiedColumn();

	}

} //ConfigurationPackage
