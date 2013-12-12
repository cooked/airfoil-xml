/**
 */
package com.stefanocottafavi.airfoil;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.stefanocottafavi.airfoil.AirfoilPackage
 * @generated
 */
public interface AirfoilFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AirfoilFactory eINSTANCE = com.stefanocottafavi.airfoil.impl.AirfoilFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Aerodynamics Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aerodynamics Type</em>'.
	 * @generated
	 */
	AerodynamicsType createAerodynamicsType();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	AirfoilType createAirfoilType();

	/**
	 * Returns a new object of class '<em>Coordinates Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordinates Type</em>'.
	 * @generated
	 */
	CoordinatesType createCoordinatesType();

	/**
	 * Returns a new object of class '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type</em>'.
	 * @generated
	 */
	DataType createDataType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Elements Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elements Type</em>'.
	 * @generated
	 */
	ElementsType createElementsType();

	/**
	 * Returns a new object of class '<em>Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Type</em>'.
	 * @generated
	 */
	ElementType createElementType();

	/**
	 * Returns a new object of class '<em>Parameters Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameters Type</em>'.
	 * @generated
	 */
	ParametersType createParametersType();

	/**
	 * Returns a new object of class '<em>Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Type</em>'.
	 * @generated
	 */
	ParameterType createParameterType();

	/**
	 * Returns a new object of class '<em>Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point Type</em>'.
	 * @generated
	 */
	PointType createPointType();

	/**
	 * Returns a new object of class '<em>Rotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rotation Type</em>'.
	 * @generated
	 */
	RotationType createRotationType();

	/**
	 * Returns a new object of class '<em>Scaling Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scaling Type</em>'.
	 * @generated
	 */
	ScalingType createScalingType();

	/**
	 * Returns a new object of class '<em>Tables Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tables Type</em>'.
	 * @generated
	 */
	TablesType createTablesType();

	/**
	 * Returns a new object of class '<em>Table Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Type</em>'.
	 * @generated
	 */
	TableType createTableType();

	/**
	 * Returns a new object of class '<em>Transformation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation Type</em>'.
	 * @generated
	 */
	TransformationType createTransformationType();

	/**
	 * Returns a new object of class '<em>Translation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Translation Type</em>'.
	 * @generated
	 */
	TranslationType createTranslationType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AirfoilPackage getAirfoilPackage();

} //AirfoilFactory
