/**
 */
package com.stefanocottafavi.airfoil;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.stefanocottafavi.airfoil.AirfoilFactory
 * @model kind="package"
 * @generated
 */
public interface AirfoilPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "airfoil";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.stefanocottafavi.com/airfoil";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "airfoil";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AirfoilPackage eINSTANCE = com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.stefanocottafavi.airfoil.impl.AerodynamicsTypeImpl <em>Aerodynamics Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.stefanocottafavi.airfoil.impl.AerodynamicsTypeImpl
	 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getAerodynamicsType()
	 * @generated
	 */
	int AERODYNAMICS_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AERODYNAMICS_TYPE__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AERODYNAMICS_TYPE__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Aerodynamics Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AERODYNAMICS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Aerodynamics Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AERODYNAMICS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.stefanocottafavi.airfoil.impl.AirfoilTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.stefanocottafavi.airfoil.impl.AirfoilTypeImpl
	 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getAirfoilType()
	 * @generated
	 */
	int AIRFOIL_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRFOIL_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRFOIL_TYPE__ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Aerodynamics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRFOIL_TYPE__AERODYNAMICS = 2;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRFOIL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRFOIL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.stefanocottafavi.airfoil.impl.CoordinatesTypeImpl <em>Coordinates Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.stefanocottafavi.airfoil.impl.CoordinatesTypeImpl
	 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getCoordinatesType()
	 * @generated
	 */
	int COORDINATES_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_TYPE__POINT = 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_TYPE__COUNT = 1;

	/**
	 * The number of structural features of the '<em>Coordinates Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Coordinates Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.stefanocottafavi.airfoil.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.stefanocottafavi.airfoil.impl.DataTypeImpl
	 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ANGLE = 0;

	/**
	 * The feature id for the '<em><b>Cl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__CL = 1;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__CD = 2;

	/**
	 * The feature id for the '<em><b>Cm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__CM = 3;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.stefanocottafavi.airfoil.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.stefanocottafavi.airfoil.impl.DocumentRootImpl
	 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 4;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Airfoil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AIRFOIL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAME = 4;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__X = 5;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__Y = 6;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__Z = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ID = 8;

	/**
	 * The feature id for the '<em><b>Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAME1 = 9;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.stefanocottafavi.airfoil.impl.ElementsTypeImpl <em>Elements Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.stefanocottafavi.airfoil.impl.ElementsTypeImpl
	 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getElementsType()
	 * @generated
	 */
	int ELEMENTS_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS_TYPE__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS_TYPE__COUNT = 1;

	/**
	 * The number of structural features of the '<em>Elements Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Elements Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.stefanocottafavi.airfoil.impl.ElementTypeImpl <em>Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.stefanocottafavi.airfoil.impl.ElementTypeImpl
	 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getElementType()
	 * @generated
	 */
	int ELEMENT_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__TRANSFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__COORDINATES = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.stefanocottafavi.airfoil.impl.ParametersTypeImpl <em>Parameters Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.stefanocottafavi.airfoil.impl.ParametersTypeImpl
	 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getParametersType()
	 * @generated
	 */
	int PARAMETERS_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_TYPE__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_TYPE__COUNT = 1;

	/**
	 * The number of structural features of the '<em>Parameters Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameters Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.stefanocottafavi.airfoil.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.stefanocottafavi.airfoil.impl.ParameterTypeImpl
	 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.stefanocottafavi.airfoil.impl.PointTypeImpl <em>Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.stefanocottafavi.airfoil.impl.PointTypeImpl
	 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getPointType()
	 * @generated
	 */
	int POINT_TYPE = 9;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__Z = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.stefanocottafavi.airfoil.impl.RotationTypeImpl <em>Rotation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.stefanocottafavi.airfoil.impl.RotationTypeImpl
	 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getRotationType()
	 * @generated
	 */
	int ROTATION_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_TYPE__POINT = 0;

	/**
	 * The number of structural features of the '<em>Rotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Rotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.stefanocottafavi.airfoil.impl.ScalingTypeImpl <em>Scaling Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.stefanocottafavi.airfoil.impl.ScalingTypeImpl
	 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getScalingType()
	 * @generated
	 */
	int SCALING_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_TYPE__POINT = 0;

	/**
	 * The number of structural features of the '<em>Scaling Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Scaling Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.stefanocottafavi.airfoil.impl.TablesTypeImpl <em>Tables Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.stefanocottafavi.airfoil.impl.TablesTypeImpl
	 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getTablesType()
	 * @generated
	 */
	int TABLES_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLES_TYPE__TABLE = 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLES_TYPE__COUNT = 1;

	/**
	 * The number of structural features of the '<em>Tables Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Tables Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.stefanocottafavi.airfoil.impl.TableTypeImpl <em>Table Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.stefanocottafavi.airfoil.impl.TableTypeImpl
	 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getTableType()
	 * @generated
	 */
	int TABLE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__DATA = 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__COUNT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Re</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__RE = 4;

	/**
	 * The number of structural features of the '<em>Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.stefanocottafavi.airfoil.impl.TransformationTypeImpl <em>Transformation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.stefanocottafavi.airfoil.impl.TransformationTypeImpl
	 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getTransformationType()
	 * @generated
	 */
	int TRANSFORMATION_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Scaling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TYPE__SCALING = 0;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TYPE__TRANSLATION = 1;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TYPE__ROTATION = 2;

	/**
	 * The number of structural features of the '<em>Transformation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transformation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.stefanocottafavi.airfoil.impl.TranslationTypeImpl <em>Translation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.stefanocottafavi.airfoil.impl.TranslationTypeImpl
	 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getTranslationType()
	 * @generated
	 */
	int TRANSLATION_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_TYPE__POINT = 0;

	/**
	 * The number of structural features of the '<em>Translation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Translation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.stefanocottafavi.airfoil.AerodynamicsType <em>Aerodynamics Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aerodynamics Type</em>'.
	 * @see com.stefanocottafavi.airfoil.AerodynamicsType
	 * @generated
	 */
	EClass getAerodynamicsType();

	/**
	 * Returns the meta object for the containment reference '{@link com.stefanocottafavi.airfoil.AerodynamicsType#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameters</em>'.
	 * @see com.stefanocottafavi.airfoil.AerodynamicsType#getParameters()
	 * @see #getAerodynamicsType()
	 * @generated
	 */
	EReference getAerodynamicsType_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link com.stefanocottafavi.airfoil.AerodynamicsType#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tables</em>'.
	 * @see com.stefanocottafavi.airfoil.AerodynamicsType#getTables()
	 * @see #getAerodynamicsType()
	 * @generated
	 */
	EReference getAerodynamicsType_Tables();

	/**
	 * Returns the meta object for class '{@link com.stefanocottafavi.airfoil.AirfoilType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see com.stefanocottafavi.airfoil.AirfoilType
	 * @generated
	 */
	EClass getAirfoilType();

	/**
	 * Returns the meta object for the attribute '{@link com.stefanocottafavi.airfoil.AirfoilType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.stefanocottafavi.airfoil.AirfoilType#getName()
	 * @see #getAirfoilType()
	 * @generated
	 */
	EAttribute getAirfoilType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.stefanocottafavi.airfoil.AirfoilType#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elements</em>'.
	 * @see com.stefanocottafavi.airfoil.AirfoilType#getElements()
	 * @see #getAirfoilType()
	 * @generated
	 */
	EReference getAirfoilType_Elements();

	/**
	 * Returns the meta object for the containment reference '{@link com.stefanocottafavi.airfoil.AirfoilType#getAerodynamics <em>Aerodynamics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aerodynamics</em>'.
	 * @see com.stefanocottafavi.airfoil.AirfoilType#getAerodynamics()
	 * @see #getAirfoilType()
	 * @generated
	 */
	EReference getAirfoilType_Aerodynamics();

	/**
	 * Returns the meta object for class '{@link com.stefanocottafavi.airfoil.CoordinatesType <em>Coordinates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinates Type</em>'.
	 * @see com.stefanocottafavi.airfoil.CoordinatesType
	 * @generated
	 */
	EClass getCoordinatesType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.stefanocottafavi.airfoil.CoordinatesType#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Point</em>'.
	 * @see com.stefanocottafavi.airfoil.CoordinatesType#getPoint()
	 * @see #getCoordinatesType()
	 * @generated
	 */
	EReference getCoordinatesType_Point();

	/**
	 * Returns the meta object for the attribute '{@link com.stefanocottafavi.airfoil.CoordinatesType#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see com.stefanocottafavi.airfoil.CoordinatesType#getCount()
	 * @see #getCoordinatesType()
	 * @generated
	 */
	EAttribute getCoordinatesType_Count();

	/**
	 * Returns the meta object for class '{@link com.stefanocottafavi.airfoil.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see com.stefanocottafavi.airfoil.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link com.stefanocottafavi.airfoil.DataType#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see com.stefanocottafavi.airfoil.DataType#getAngle()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Angle();

	/**
	 * Returns the meta object for the attribute '{@link com.stefanocottafavi.airfoil.DataType#getCl <em>Cl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cl</em>'.
	 * @see com.stefanocottafavi.airfoil.DataType#getCl()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Cl();

	/**
	 * Returns the meta object for the attribute '{@link com.stefanocottafavi.airfoil.DataType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cd</em>'.
	 * @see com.stefanocottafavi.airfoil.DataType#getCd()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Cd();

	/**
	 * Returns the meta object for the attribute '{@link com.stefanocottafavi.airfoil.DataType#getCm <em>Cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cm</em>'.
	 * @see com.stefanocottafavi.airfoil.DataType#getCm()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Cm();

	/**
	 * Returns the meta object for class '{@link com.stefanocottafavi.airfoil.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.stefanocottafavi.airfoil.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.stefanocottafavi.airfoil.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.stefanocottafavi.airfoil.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.stefanocottafavi.airfoil.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.stefanocottafavi.airfoil.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.stefanocottafavi.airfoil.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.stefanocottafavi.airfoil.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.stefanocottafavi.airfoil.DocumentRoot#getAirfoil <em>Airfoil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Airfoil</em>'.
	 * @see com.stefanocottafavi.airfoil.DocumentRoot#getAirfoil()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Airfoil();

	/**
	 * Returns the meta object for the attribute '{@link com.stefanocottafavi.airfoil.DocumentRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.stefanocottafavi.airfoil.DocumentRoot#getName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.stefanocottafavi.airfoil.DocumentRoot#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see com.stefanocottafavi.airfoil.DocumentRoot#getX()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_X();

	/**
	 * Returns the meta object for the attribute '{@link com.stefanocottafavi.airfoil.DocumentRoot#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see com.stefanocottafavi.airfoil.DocumentRoot#getY()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Y();

	/**
	 * Returns the meta object for the attribute '{@link com.stefanocottafavi.airfoil.DocumentRoot#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see com.stefanocottafavi.airfoil.DocumentRoot#getZ()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Z();

	/**
	 * Returns the meta object for the attribute '{@link com.stefanocottafavi.airfoil.DocumentRoot#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.stefanocottafavi.airfoil.DocumentRoot#getId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.stefanocottafavi.airfoil.DocumentRoot#getName1 <em>Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name1</em>'.
	 * @see com.stefanocottafavi.airfoil.DocumentRoot#getName1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Name1();

	/**
	 * Returns the meta object for class '{@link com.stefanocottafavi.airfoil.ElementsType <em>Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elements Type</em>'.
	 * @see com.stefanocottafavi.airfoil.ElementsType
	 * @generated
	 */
	EClass getElementsType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.stefanocottafavi.airfoil.ElementsType#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see com.stefanocottafavi.airfoil.ElementsType#getElement()
	 * @see #getElementsType()
	 * @generated
	 */
	EReference getElementsType_Element();

	/**
	 * Returns the meta object for the attribute '{@link com.stefanocottafavi.airfoil.ElementsType#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see com.stefanocottafavi.airfoil.ElementsType#getCount()
	 * @see #getElementsType()
	 * @generated
	 */
	EAttribute getElementsType_Count();

	/**
	 * Returns the meta object for class '{@link com.stefanocottafavi.airfoil.ElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Type</em>'.
	 * @see com.stefanocottafavi.airfoil.ElementType
	 * @generated
	 */
	EClass getElementType();

	/**
	 * Returns the meta object for the containment reference '{@link com.stefanocottafavi.airfoil.ElementType#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation</em>'.
	 * @see com.stefanocottafavi.airfoil.ElementType#getTransformation()
	 * @see #getElementType()
	 * @generated
	 */
	EReference getElementType_Transformation();

	/**
	 * Returns the meta object for the containment reference '{@link com.stefanocottafavi.airfoil.ElementType#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coordinates</em>'.
	 * @see com.stefanocottafavi.airfoil.ElementType#getCoordinates()
	 * @see #getElementType()
	 * @generated
	 */
	EReference getElementType_Coordinates();

	/**
	 * Returns the meta object for the attribute '{@link com.stefanocottafavi.airfoil.ElementType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.stefanocottafavi.airfoil.ElementType#getId()
	 * @see #getElementType()
	 * @generated
	 */
	EAttribute getElementType_Id();

	/**
	 * Returns the meta object for class '{@link com.stefanocottafavi.airfoil.ParametersType <em>Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameters Type</em>'.
	 * @see com.stefanocottafavi.airfoil.ParametersType
	 * @generated
	 */
	EClass getParametersType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.stefanocottafavi.airfoil.ParametersType#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see com.stefanocottafavi.airfoil.ParametersType#getParameter()
	 * @see #getParametersType()
	 * @generated
	 */
	EReference getParametersType_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link com.stefanocottafavi.airfoil.ParametersType#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see com.stefanocottafavi.airfoil.ParametersType#getCount()
	 * @see #getParametersType()
	 * @generated
	 */
	EAttribute getParametersType_Count();

	/**
	 * Returns the meta object for class '{@link com.stefanocottafavi.airfoil.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type</em>'.
	 * @see com.stefanocottafavi.airfoil.ParameterType
	 * @generated
	 */
	EClass getParameterType();

	/**
	 * Returns the meta object for the attribute '{@link com.stefanocottafavi.airfoil.ParameterType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.stefanocottafavi.airfoil.ParameterType#getName()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_Name();

	/**
	 * Returns the meta object for class '{@link com.stefanocottafavi.airfoil.PointType <em>Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Type</em>'.
	 * @see com.stefanocottafavi.airfoil.PointType
	 * @generated
	 */
	EClass getPointType();

	/**
	 * Returns the meta object for the attribute '{@link com.stefanocottafavi.airfoil.PointType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see com.stefanocottafavi.airfoil.PointType#getX()
	 * @see #getPointType()
	 * @generated
	 */
	EAttribute getPointType_X();

	/**
	 * Returns the meta object for the attribute '{@link com.stefanocottafavi.airfoil.PointType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see com.stefanocottafavi.airfoil.PointType#getY()
	 * @see #getPointType()
	 * @generated
	 */
	EAttribute getPointType_Y();

	/**
	 * Returns the meta object for the attribute '{@link com.stefanocottafavi.airfoil.PointType#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see com.stefanocottafavi.airfoil.PointType#getZ()
	 * @see #getPointType()
	 * @generated
	 */
	EAttribute getPointType_Z();

	/**
	 * Returns the meta object for the attribute '{@link com.stefanocottafavi.airfoil.PointType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.stefanocottafavi.airfoil.PointType#getId()
	 * @see #getPointType()
	 * @generated
	 */
	EAttribute getPointType_Id();

	/**
	 * Returns the meta object for class '{@link com.stefanocottafavi.airfoil.RotationType <em>Rotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotation Type</em>'.
	 * @see com.stefanocottafavi.airfoil.RotationType
	 * @generated
	 */
	EClass getRotationType();

	/**
	 * Returns the meta object for the containment reference '{@link com.stefanocottafavi.airfoil.RotationType#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point</em>'.
	 * @see com.stefanocottafavi.airfoil.RotationType#getPoint()
	 * @see #getRotationType()
	 * @generated
	 */
	EReference getRotationType_Point();

	/**
	 * Returns the meta object for class '{@link com.stefanocottafavi.airfoil.ScalingType <em>Scaling Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scaling Type</em>'.
	 * @see com.stefanocottafavi.airfoil.ScalingType
	 * @generated
	 */
	EClass getScalingType();

	/**
	 * Returns the meta object for the containment reference '{@link com.stefanocottafavi.airfoil.ScalingType#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point</em>'.
	 * @see com.stefanocottafavi.airfoil.ScalingType#getPoint()
	 * @see #getScalingType()
	 * @generated
	 */
	EReference getScalingType_Point();

	/**
	 * Returns the meta object for class '{@link com.stefanocottafavi.airfoil.TablesType <em>Tables Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tables Type</em>'.
	 * @see com.stefanocottafavi.airfoil.TablesType
	 * @generated
	 */
	EClass getTablesType();

	/**
	 * Returns the meta object for the containment reference '{@link com.stefanocottafavi.airfoil.TablesType#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table</em>'.
	 * @see com.stefanocottafavi.airfoil.TablesType#getTable()
	 * @see #getTablesType()
	 * @generated
	 */
	EReference getTablesType_Table();

	/**
	 * Returns the meta object for the attribute '{@link com.stefanocottafavi.airfoil.TablesType#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see com.stefanocottafavi.airfoil.TablesType#getCount()
	 * @see #getTablesType()
	 * @generated
	 */
	EAttribute getTablesType_Count();

	/**
	 * Returns the meta object for class '{@link com.stefanocottafavi.airfoil.TableType <em>Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Type</em>'.
	 * @see com.stefanocottafavi.airfoil.TableType
	 * @generated
	 */
	EClass getTableType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.stefanocottafavi.airfoil.TableType#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see com.stefanocottafavi.airfoil.TableType#getData()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Data();

	/**
	 * Returns the meta object for the attribute '{@link com.stefanocottafavi.airfoil.TableType#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see com.stefanocottafavi.airfoil.TableType#getCount()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Count();

	/**
	 * Returns the meta object for the attribute '{@link com.stefanocottafavi.airfoil.TableType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.stefanocottafavi.airfoil.TableType#getId()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.stefanocottafavi.airfoil.TableType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.stefanocottafavi.airfoil.TableType#getName()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.stefanocottafavi.airfoil.TableType#getRe <em>Re</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Re</em>'.
	 * @see com.stefanocottafavi.airfoil.TableType#getRe()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Re();

	/**
	 * Returns the meta object for class '{@link com.stefanocottafavi.airfoil.TransformationType <em>Transformation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Type</em>'.
	 * @see com.stefanocottafavi.airfoil.TransformationType
	 * @generated
	 */
	EClass getTransformationType();

	/**
	 * Returns the meta object for the containment reference '{@link com.stefanocottafavi.airfoil.TransformationType#getScaling <em>Scaling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scaling</em>'.
	 * @see com.stefanocottafavi.airfoil.TransformationType#getScaling()
	 * @see #getTransformationType()
	 * @generated
	 */
	EReference getTransformationType_Scaling();

	/**
	 * Returns the meta object for the containment reference '{@link com.stefanocottafavi.airfoil.TransformationType#getTranslation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Translation</em>'.
	 * @see com.stefanocottafavi.airfoil.TransformationType#getTranslation()
	 * @see #getTransformationType()
	 * @generated
	 */
	EReference getTransformationType_Translation();

	/**
	 * Returns the meta object for the containment reference '{@link com.stefanocottafavi.airfoil.TransformationType#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rotation</em>'.
	 * @see com.stefanocottafavi.airfoil.TransformationType#getRotation()
	 * @see #getTransformationType()
	 * @generated
	 */
	EReference getTransformationType_Rotation();

	/**
	 * Returns the meta object for class '{@link com.stefanocottafavi.airfoil.TranslationType <em>Translation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translation Type</em>'.
	 * @see com.stefanocottafavi.airfoil.TranslationType
	 * @generated
	 */
	EClass getTranslationType();

	/**
	 * Returns the meta object for the containment reference '{@link com.stefanocottafavi.airfoil.TranslationType#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point</em>'.
	 * @see com.stefanocottafavi.airfoil.TranslationType#getPoint()
	 * @see #getTranslationType()
	 * @generated
	 */
	EReference getTranslationType_Point();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AirfoilFactory getAirfoilFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.stefanocottafavi.airfoil.impl.AerodynamicsTypeImpl <em>Aerodynamics Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.stefanocottafavi.airfoil.impl.AerodynamicsTypeImpl
		 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getAerodynamicsType()
		 * @generated
		 */
		EClass AERODYNAMICS_TYPE = eINSTANCE.getAerodynamicsType();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AERODYNAMICS_TYPE__PARAMETERS = eINSTANCE.getAerodynamicsType_Parameters();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AERODYNAMICS_TYPE__TABLES = eINSTANCE.getAerodynamicsType_Tables();

		/**
		 * The meta object literal for the '{@link com.stefanocottafavi.airfoil.impl.AirfoilTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.stefanocottafavi.airfoil.impl.AirfoilTypeImpl
		 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getAirfoilType()
		 * @generated
		 */
		EClass AIRFOIL_TYPE = eINSTANCE.getAirfoilType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIRFOIL_TYPE__NAME = eINSTANCE.getAirfoilType_Name();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AIRFOIL_TYPE__ELEMENTS = eINSTANCE.getAirfoilType_Elements();

		/**
		 * The meta object literal for the '<em><b>Aerodynamics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AIRFOIL_TYPE__AERODYNAMICS = eINSTANCE.getAirfoilType_Aerodynamics();

		/**
		 * The meta object literal for the '{@link com.stefanocottafavi.airfoil.impl.CoordinatesTypeImpl <em>Coordinates Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.stefanocottafavi.airfoil.impl.CoordinatesTypeImpl
		 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getCoordinatesType()
		 * @generated
		 */
		EClass COORDINATES_TYPE = eINSTANCE.getCoordinatesType();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATES_TYPE__POINT = eINSTANCE.getCoordinatesType_Point();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES_TYPE__COUNT = eINSTANCE.getCoordinatesType_Count();

		/**
		 * The meta object literal for the '{@link com.stefanocottafavi.airfoil.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.stefanocottafavi.airfoil.impl.DataTypeImpl
		 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__ANGLE = eINSTANCE.getDataType_Angle();

		/**
		 * The meta object literal for the '<em><b>Cl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__CL = eINSTANCE.getDataType_Cl();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__CD = eINSTANCE.getDataType_Cd();

		/**
		 * The meta object literal for the '<em><b>Cm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__CM = eINSTANCE.getDataType_Cm();

		/**
		 * The meta object literal for the '{@link com.stefanocottafavi.airfoil.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.stefanocottafavi.airfoil.impl.DocumentRootImpl
		 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Airfoil</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AIRFOIL = eINSTANCE.getDocumentRoot_Airfoil();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__NAME = eINSTANCE.getDocumentRoot_Name();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__X = eINSTANCE.getDocumentRoot_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__Y = eINSTANCE.getDocumentRoot_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__Z = eINSTANCE.getDocumentRoot_Z();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ID = eINSTANCE.getDocumentRoot_Id();

		/**
		 * The meta object literal for the '<em><b>Name1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__NAME1 = eINSTANCE.getDocumentRoot_Name1();

		/**
		 * The meta object literal for the '{@link com.stefanocottafavi.airfoil.impl.ElementsTypeImpl <em>Elements Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.stefanocottafavi.airfoil.impl.ElementsTypeImpl
		 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getElementsType()
		 * @generated
		 */
		EClass ELEMENTS_TYPE = eINSTANCE.getElementsType();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTS_TYPE__ELEMENT = eINSTANCE.getElementsType_Element();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTS_TYPE__COUNT = eINSTANCE.getElementsType_Count();

		/**
		 * The meta object literal for the '{@link com.stefanocottafavi.airfoil.impl.ElementTypeImpl <em>Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.stefanocottafavi.airfoil.impl.ElementTypeImpl
		 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getElementType()
		 * @generated
		 */
		EClass ELEMENT_TYPE = eINSTANCE.getElementType();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_TYPE__TRANSFORMATION = eINSTANCE.getElementType_Transformation();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_TYPE__COORDINATES = eINSTANCE.getElementType_Coordinates();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_TYPE__ID = eINSTANCE.getElementType_Id();

		/**
		 * The meta object literal for the '{@link com.stefanocottafavi.airfoil.impl.ParametersTypeImpl <em>Parameters Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.stefanocottafavi.airfoil.impl.ParametersTypeImpl
		 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getParametersType()
		 * @generated
		 */
		EClass PARAMETERS_TYPE = eINSTANCE.getParametersType();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERS_TYPE__PARAMETER = eINSTANCE.getParametersType_Parameter();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS_TYPE__COUNT = eINSTANCE.getParametersType_Count();

		/**
		 * The meta object literal for the '{@link com.stefanocottafavi.airfoil.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.stefanocottafavi.airfoil.impl.ParameterTypeImpl
		 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getParameterType()
		 * @generated
		 */
		EClass PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_TYPE__NAME = eINSTANCE.getParameterType_Name();

		/**
		 * The meta object literal for the '{@link com.stefanocottafavi.airfoil.impl.PointTypeImpl <em>Point Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.stefanocottafavi.airfoil.impl.PointTypeImpl
		 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getPointType()
		 * @generated
		 */
		EClass POINT_TYPE = eINSTANCE.getPointType();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT_TYPE__X = eINSTANCE.getPointType_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT_TYPE__Y = eINSTANCE.getPointType_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT_TYPE__Z = eINSTANCE.getPointType_Z();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT_TYPE__ID = eINSTANCE.getPointType_Id();

		/**
		 * The meta object literal for the '{@link com.stefanocottafavi.airfoil.impl.RotationTypeImpl <em>Rotation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.stefanocottafavi.airfoil.impl.RotationTypeImpl
		 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getRotationType()
		 * @generated
		 */
		EClass ROTATION_TYPE = eINSTANCE.getRotationType();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROTATION_TYPE__POINT = eINSTANCE.getRotationType_Point();

		/**
		 * The meta object literal for the '{@link com.stefanocottafavi.airfoil.impl.ScalingTypeImpl <em>Scaling Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.stefanocottafavi.airfoil.impl.ScalingTypeImpl
		 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getScalingType()
		 * @generated
		 */
		EClass SCALING_TYPE = eINSTANCE.getScalingType();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALING_TYPE__POINT = eINSTANCE.getScalingType_Point();

		/**
		 * The meta object literal for the '{@link com.stefanocottafavi.airfoil.impl.TablesTypeImpl <em>Tables Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.stefanocottafavi.airfoil.impl.TablesTypeImpl
		 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getTablesType()
		 * @generated
		 */
		EClass TABLES_TYPE = eINSTANCE.getTablesType();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLES_TYPE__TABLE = eINSTANCE.getTablesType_Table();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLES_TYPE__COUNT = eINSTANCE.getTablesType_Count();

		/**
		 * The meta object literal for the '{@link com.stefanocottafavi.airfoil.impl.TableTypeImpl <em>Table Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.stefanocottafavi.airfoil.impl.TableTypeImpl
		 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getTableType()
		 * @generated
		 */
		EClass TABLE_TYPE = eINSTANCE.getTableType();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__DATA = eINSTANCE.getTableType_Data();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__COUNT = eINSTANCE.getTableType_Count();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__ID = eINSTANCE.getTableType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__NAME = eINSTANCE.getTableType_Name();

		/**
		 * The meta object literal for the '<em><b>Re</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__RE = eINSTANCE.getTableType_Re();

		/**
		 * The meta object literal for the '{@link com.stefanocottafavi.airfoil.impl.TransformationTypeImpl <em>Transformation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.stefanocottafavi.airfoil.impl.TransformationTypeImpl
		 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getTransformationType()
		 * @generated
		 */
		EClass TRANSFORMATION_TYPE = eINSTANCE.getTransformationType();

		/**
		 * The meta object literal for the '<em><b>Scaling</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_TYPE__SCALING = eINSTANCE.getTransformationType_Scaling();

		/**
		 * The meta object literal for the '<em><b>Translation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_TYPE__TRANSLATION = eINSTANCE.getTransformationType_Translation();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_TYPE__ROTATION = eINSTANCE.getTransformationType_Rotation();

		/**
		 * The meta object literal for the '{@link com.stefanocottafavi.airfoil.impl.TranslationTypeImpl <em>Translation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.stefanocottafavi.airfoil.impl.TranslationTypeImpl
		 * @see com.stefanocottafavi.airfoil.impl.AirfoilPackageImpl#getTranslationType()
		 * @generated
		 */
		EClass TRANSLATION_TYPE = eINSTANCE.getTranslationType();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSLATION_TYPE__POINT = eINSTANCE.getTranslationType_Point();

	}

} //AirfoilPackage
