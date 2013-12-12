/**
 */
package com.stefanocottafavi.airfoil.impl;

import com.stefanocottafavi.airfoil.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AirfoilFactoryImpl extends EFactoryImpl implements AirfoilFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AirfoilFactory init() {
		try {
			AirfoilFactory theAirfoilFactory = (AirfoilFactory)EPackage.Registry.INSTANCE.getEFactory(AirfoilPackage.eNS_URI);
			if (theAirfoilFactory != null) {
				return theAirfoilFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AirfoilFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirfoilFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AirfoilPackage.AERODYNAMICS_TYPE: return createAerodynamicsType();
			case AirfoilPackage.AIRFOIL_TYPE: return createAirfoilType();
			case AirfoilPackage.COORDINATES_TYPE: return createCoordinatesType();
			case AirfoilPackage.DATA_TYPE: return createDataType();
			case AirfoilPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case AirfoilPackage.ELEMENTS_TYPE: return createElementsType();
			case AirfoilPackage.ELEMENT_TYPE: return createElementType();
			case AirfoilPackage.PARAMETERS_TYPE: return createParametersType();
			case AirfoilPackage.PARAMETER_TYPE: return createParameterType();
			case AirfoilPackage.POINT_TYPE: return createPointType();
			case AirfoilPackage.ROTATION_TYPE: return createRotationType();
			case AirfoilPackage.SCALING_TYPE: return createScalingType();
			case AirfoilPackage.TABLES_TYPE: return createTablesType();
			case AirfoilPackage.TABLE_TYPE: return createTableType();
			case AirfoilPackage.TRANSFORMATION_TYPE: return createTransformationType();
			case AirfoilPackage.TRANSLATION_TYPE: return createTranslationType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AerodynamicsType createAerodynamicsType() {
		AerodynamicsTypeImpl aerodynamicsType = new AerodynamicsTypeImpl();
		return aerodynamicsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirfoilType createAirfoilType() {
		AirfoilTypeImpl airfoilType = new AirfoilTypeImpl();
		return airfoilType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinatesType createCoordinatesType() {
		CoordinatesTypeImpl coordinatesType = new CoordinatesTypeImpl();
		return coordinatesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementsType createElementsType() {
		ElementsTypeImpl elementsType = new ElementsTypeImpl();
		return elementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementType createElementType() {
		ElementTypeImpl elementType = new ElementTypeImpl();
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersType createParametersType() {
		ParametersTypeImpl parametersType = new ParametersTypeImpl();
		return parametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterType() {
		ParameterTypeImpl parameterType = new ParameterTypeImpl();
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointType createPointType() {
		PointTypeImpl pointType = new PointTypeImpl();
		return pointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotationType createRotationType() {
		RotationTypeImpl rotationType = new RotationTypeImpl();
		return rotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingType createScalingType() {
		ScalingTypeImpl scalingType = new ScalingTypeImpl();
		return scalingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TablesType createTablesType() {
		TablesTypeImpl tablesType = new TablesTypeImpl();
		return tablesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableType createTableType() {
		TableTypeImpl tableType = new TableTypeImpl();
		return tableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationType createTransformationType() {
		TransformationTypeImpl transformationType = new TransformationTypeImpl();
		return transformationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationType createTranslationType() {
		TranslationTypeImpl translationType = new TranslationTypeImpl();
		return translationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirfoilPackage getAirfoilPackage() {
		return (AirfoilPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AirfoilPackage getPackage() {
		return AirfoilPackage.eINSTANCE;
	}

} //AirfoilFactoryImpl
