/**
 */
package com.stefanocottafavi.airfoil.impl;

import com.stefanocottafavi.airfoil.AerodynamicsType;
import com.stefanocottafavi.airfoil.AirfoilFactory;
import com.stefanocottafavi.airfoil.AirfoilPackage;
import com.stefanocottafavi.airfoil.AirfoilType;
import com.stefanocottafavi.airfoil.CoordinatesType;
import com.stefanocottafavi.airfoil.DataType;
import com.stefanocottafavi.airfoil.DocumentRoot;
import com.stefanocottafavi.airfoil.ElementType;
import com.stefanocottafavi.airfoil.ElementsType;
import com.stefanocottafavi.airfoil.ParameterType;
import com.stefanocottafavi.airfoil.ParametersType;
import com.stefanocottafavi.airfoil.PointType;
import com.stefanocottafavi.airfoil.RotationType;
import com.stefanocottafavi.airfoil.ScalingType;
import com.stefanocottafavi.airfoil.TableType;
import com.stefanocottafavi.airfoil.TablesType;
import com.stefanocottafavi.airfoil.TransformationType;
import com.stefanocottafavi.airfoil.TranslationType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AirfoilPackageImpl extends EPackageImpl implements AirfoilPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aerodynamicsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass airfoilTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinatesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tablesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass translationTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.stefanocottafavi.airfoil.AirfoilPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AirfoilPackageImpl() {
		super(eNS_URI, AirfoilFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AirfoilPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AirfoilPackage init() {
		if (isInited) return (AirfoilPackage)EPackage.Registry.INSTANCE.getEPackage(AirfoilPackage.eNS_URI);

		// Obtain or create and register package
		AirfoilPackageImpl theAirfoilPackage = (AirfoilPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AirfoilPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AirfoilPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAirfoilPackage.createPackageContents();

		// Initialize created meta-data
		theAirfoilPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAirfoilPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AirfoilPackage.eNS_URI, theAirfoilPackage);
		return theAirfoilPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAerodynamicsType() {
		return aerodynamicsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAerodynamicsType_Parameters() {
		return (EReference)aerodynamicsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAerodynamicsType_Tables() {
		return (EReference)aerodynamicsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAirfoilType() {
		return airfoilTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAirfoilType_Name() {
		return (EAttribute)airfoilTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAirfoilType_Elements() {
		return (EReference)airfoilTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAirfoilType_Aerodynamics() {
		return (EReference)airfoilTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinatesType() {
		return coordinatesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinatesType_Point() {
		return (EReference)coordinatesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinatesType_Count() {
		return (EAttribute)coordinatesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Angle() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Cl() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Cd() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Cm() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Airfoil() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Name() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_X() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Y() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Z() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Id() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Name1() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementsType() {
		return elementsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementsType_Element() {
		return (EReference)elementsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementsType_Count() {
		return (EAttribute)elementsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementType() {
		return elementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementType_Transformation() {
		return (EReference)elementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementType_Coordinates() {
		return (EReference)elementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementType_Id() {
		return (EAttribute)elementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametersType() {
		return parametersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersType_Parameter() {
		return (EReference)parametersTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParametersType_Count() {
		return (EAttribute)parametersTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterType() {
		return parameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterType_Name() {
		return (EAttribute)parameterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointType() {
		return pointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointType_X() {
		return (EAttribute)pointTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointType_Y() {
		return (EAttribute)pointTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointType_Z() {
		return (EAttribute)pointTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointType_Id() {
		return (EAttribute)pointTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotationType() {
		return rotationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRotationType_Point() {
		return (EReference)rotationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScalingType() {
		return scalingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScalingType_Point() {
		return (EReference)scalingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTablesType() {
		return tablesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTablesType_Table() {
		return (EReference)tablesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTablesType_Count() {
		return (EAttribute)tablesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableType() {
		return tableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableType_Data() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableType_Count() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableType_Id() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableType_Name() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableType_Re() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformationType() {
		return transformationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationType_Scaling() {
		return (EReference)transformationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationType_Translation() {
		return (EReference)transformationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationType_Rotation() {
		return (EReference)transformationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTranslationType() {
		return translationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTranslationType_Point() {
		return (EReference)translationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirfoilFactory getAirfoilFactory() {
		return (AirfoilFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		aerodynamicsTypeEClass = createEClass(AERODYNAMICS_TYPE);
		createEReference(aerodynamicsTypeEClass, AERODYNAMICS_TYPE__PARAMETERS);
		createEReference(aerodynamicsTypeEClass, AERODYNAMICS_TYPE__TABLES);

		airfoilTypeEClass = createEClass(AIRFOIL_TYPE);
		createEAttribute(airfoilTypeEClass, AIRFOIL_TYPE__NAME);
		createEReference(airfoilTypeEClass, AIRFOIL_TYPE__ELEMENTS);
		createEReference(airfoilTypeEClass, AIRFOIL_TYPE__AERODYNAMICS);

		coordinatesTypeEClass = createEClass(COORDINATES_TYPE);
		createEReference(coordinatesTypeEClass, COORDINATES_TYPE__POINT);
		createEAttribute(coordinatesTypeEClass, COORDINATES_TYPE__COUNT);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEAttribute(dataTypeEClass, DATA_TYPE__ANGLE);
		createEAttribute(dataTypeEClass, DATA_TYPE__CL);
		createEAttribute(dataTypeEClass, DATA_TYPE__CD);
		createEAttribute(dataTypeEClass, DATA_TYPE__CM);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AIRFOIL);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__NAME);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__X);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__Y);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__Z);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ID);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__NAME1);

		elementsTypeEClass = createEClass(ELEMENTS_TYPE);
		createEReference(elementsTypeEClass, ELEMENTS_TYPE__ELEMENT);
		createEAttribute(elementsTypeEClass, ELEMENTS_TYPE__COUNT);

		elementTypeEClass = createEClass(ELEMENT_TYPE);
		createEReference(elementTypeEClass, ELEMENT_TYPE__TRANSFORMATION);
		createEReference(elementTypeEClass, ELEMENT_TYPE__COORDINATES);
		createEAttribute(elementTypeEClass, ELEMENT_TYPE__ID);

		parametersTypeEClass = createEClass(PARAMETERS_TYPE);
		createEReference(parametersTypeEClass, PARAMETERS_TYPE__PARAMETER);
		createEAttribute(parametersTypeEClass, PARAMETERS_TYPE__COUNT);

		parameterTypeEClass = createEClass(PARAMETER_TYPE);
		createEAttribute(parameterTypeEClass, PARAMETER_TYPE__NAME);

		pointTypeEClass = createEClass(POINT_TYPE);
		createEAttribute(pointTypeEClass, POINT_TYPE__X);
		createEAttribute(pointTypeEClass, POINT_TYPE__Y);
		createEAttribute(pointTypeEClass, POINT_TYPE__Z);
		createEAttribute(pointTypeEClass, POINT_TYPE__ID);

		rotationTypeEClass = createEClass(ROTATION_TYPE);
		createEReference(rotationTypeEClass, ROTATION_TYPE__POINT);

		scalingTypeEClass = createEClass(SCALING_TYPE);
		createEReference(scalingTypeEClass, SCALING_TYPE__POINT);

		tablesTypeEClass = createEClass(TABLES_TYPE);
		createEReference(tablesTypeEClass, TABLES_TYPE__TABLE);
		createEAttribute(tablesTypeEClass, TABLES_TYPE__COUNT);

		tableTypeEClass = createEClass(TABLE_TYPE);
		createEReference(tableTypeEClass, TABLE_TYPE__DATA);
		createEAttribute(tableTypeEClass, TABLE_TYPE__COUNT);
		createEAttribute(tableTypeEClass, TABLE_TYPE__ID);
		createEAttribute(tableTypeEClass, TABLE_TYPE__NAME);
		createEAttribute(tableTypeEClass, TABLE_TYPE__RE);

		transformationTypeEClass = createEClass(TRANSFORMATION_TYPE);
		createEReference(transformationTypeEClass, TRANSFORMATION_TYPE__SCALING);
		createEReference(transformationTypeEClass, TRANSFORMATION_TYPE__TRANSLATION);
		createEReference(transformationTypeEClass, TRANSFORMATION_TYPE__ROTATION);

		translationTypeEClass = createEClass(TRANSLATION_TYPE);
		createEReference(translationTypeEClass, TRANSLATION_TYPE__POINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(aerodynamicsTypeEClass, AerodynamicsType.class, "AerodynamicsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAerodynamicsType_Parameters(), this.getParametersType(), null, "parameters", null, 1, 1, AerodynamicsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAerodynamicsType_Tables(), this.getTablesType(), null, "tables", null, 1, 1, AerodynamicsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(airfoilTypeEClass, AirfoilType.class, "AirfoilType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAirfoilType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, AirfoilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAirfoilType_Elements(), this.getElementsType(), null, "elements", null, 1, 1, AirfoilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAirfoilType_Aerodynamics(), this.getAerodynamicsType(), null, "aerodynamics", null, 1, 1, AirfoilType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinatesTypeEClass, CoordinatesType.class, "CoordinatesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoordinatesType_Point(), this.getPointType(), null, "point", null, 1, -1, CoordinatesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoordinatesType_Count(), theXMLTypePackage.getInteger(), "count", null, 0, 1, CoordinatesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataType_Angle(), theXMLTypePackage.getDouble(), "angle", "0", 1, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_Cl(), theXMLTypePackage.getDouble(), "cl", "0", 1, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_Cd(), theXMLTypePackage.getDouble(), "cd", "0", 1, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_Cm(), theXMLTypePackage.getDouble(), "cm", "0", 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Airfoil(), this.getAirfoilType(), null, "airfoil", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Name(), theXMLTypePackage.getString(), "name", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_X(), theXMLTypePackage.getDouble(), "x", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Y(), theXMLTypePackage.getDouble(), "y", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Z(), theXMLTypePackage.getDouble(), "z", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Name1(), theXMLTypePackage.getString(), "name1", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementsTypeEClass, ElementsType.class, "ElementsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementsType_Element(), this.getElementType(), null, "element", null, 1, -1, ElementsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementsType_Count(), theXMLTypePackage.getInteger(), "count", null, 0, 1, ElementsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementTypeEClass, ElementType.class, "ElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementType_Transformation(), this.getTransformationType(), null, "transformation", null, 0, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementType_Coordinates(), this.getCoordinatesType(), null, "coordinates", null, 1, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementType_Id(), theXMLTypePackage.getInteger(), "id", null, 0, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parametersTypeEClass, ParametersType.class, "ParametersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParametersType_Parameter(), this.getParameterType(), null, "parameter", null, 1, -1, ParametersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParametersType_Count(), theXMLTypePackage.getInteger(), "count", null, 0, 1, ParametersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterTypeEClass, ParameterType.class, "ParameterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointTypeEClass, PointType.class, "PointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPointType_X(), theXMLTypePackage.getDouble(), "x", null, 1, 1, PointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPointType_Y(), theXMLTypePackage.getDouble(), "y", null, 1, 1, PointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPointType_Z(), theXMLTypePackage.getDouble(), "z", null, 0, 1, PointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPointType_Id(), theXMLTypePackage.getInteger(), "id", null, 0, 1, PointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rotationTypeEClass, RotationType.class, "RotationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRotationType_Point(), this.getPointType(), null, "point", null, 1, 1, RotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scalingTypeEClass, ScalingType.class, "ScalingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScalingType_Point(), this.getPointType(), null, "point", null, 1, 1, ScalingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tablesTypeEClass, TablesType.class, "TablesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTablesType_Table(), this.getTableType(), null, "table", null, 1, 1, TablesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTablesType_Count(), theXMLTypePackage.getInteger(), "count", null, 0, 1, TablesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableTypeEClass, TableType.class, "TableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableType_Data(), this.getDataType(), null, "data", null, 1, -1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Count(), theXMLTypePackage.getInteger(), "count", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Id(), theXMLTypePackage.getString(), "id", "tab", 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Name(), theXMLTypePackage.getString(), "name", "", 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Re(), theXMLTypePackage.getShort(), "re", "0", 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationTypeEClass, TransformationType.class, "TransformationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformationType_Scaling(), this.getScalingType(), null, "scaling", null, 0, 1, TransformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformationType_Translation(), this.getTranslationType(), null, "translation", null, 0, 1, TransformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformationType_Rotation(), this.getRotationType(), null, "rotation", null, 0, 1, TransformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(translationTypeEClass, TranslationType.class, "TranslationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTranslationType_Point(), this.getPointType(), null, "point", null, 1, 1, TranslationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
		addAnnotation
		  (aerodynamicsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "aerodynamicsType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAerodynamicsType_Parameters(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "parameters",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAerodynamicsType_Tables(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tables",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (airfoilTypeEClass, 
		   source, 
		   new String[] {
			 "name", "airfoil_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAirfoilType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAirfoilType_Elements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "elements",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAirfoilType_Aerodynamics(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "aerodynamics",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (coordinatesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "coordinatesType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCoordinatesType_Point(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "point",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCoordinatesType_Count(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "count"
		   });		
		addAnnotation
		  (dataTypeEClass, 
		   source, 
		   new String[] {
			 "name", "dataType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDataType_Angle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "angle",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDataType_Cl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cl",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDataType_Cd(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cd",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDataType_Cm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cm",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });			
		addAnnotation
		  (getDocumentRoot_Airfoil(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "airfoil",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_X(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "x",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Y(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "y",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Z(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "z",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Name1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (elementsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "elementsType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getElementsType_Element(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getElementsType_Count(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "count"
		   });			
		addAnnotation
		  (elementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "elementType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getElementType_Transformation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "transformation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getElementType_Coordinates(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "coordinates",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getElementType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });			
		addAnnotation
		  (parametersTypeEClass, 
		   source, 
		   new String[] {
			 "name", "parametersType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getParametersType_Parameter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "parameter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getParametersType_Count(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "count"
		   });			
		addAnnotation
		  (parameterTypeEClass, 
		   source, 
		   new String[] {
			 "name", "parameterType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getParameterType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });			
		addAnnotation
		  (pointTypeEClass, 
		   source, 
		   new String[] {
			 "name", "pointType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPointType_X(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "x",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPointType_Y(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "y",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPointType_Z(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "z",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPointType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });			
		addAnnotation
		  (rotationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "rotationType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRotationType_Point(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "point",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (scalingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "scalingType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getScalingType_Point(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "point",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (tablesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "tablesType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTablesType_Table(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "table",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTablesType_Count(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "count"
		   });			
		addAnnotation
		  (tableTypeEClass, 
		   source, 
		   new String[] {
			 "name", "tableType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTableType_Data(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "data",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTableType_Count(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "count"
		   });		
		addAnnotation
		  (getTableType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getTableType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getTableType_Re(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "re"
		   });			
		addAnnotation
		  (transformationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "transformationType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTransformationType_Scaling(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "scaling",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransformationType_Translation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "translation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransformationType_Rotation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rotation",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (translationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "translationType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTranslationType_Point(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "point",
			 "namespace", "##targetNamespace"
		   });
	}

} //AirfoilPackageImpl
