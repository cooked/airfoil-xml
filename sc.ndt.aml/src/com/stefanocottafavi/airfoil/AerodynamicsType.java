/**
 */
package com.stefanocottafavi.airfoil;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aerodynamics Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a collection of aerodynamic data.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.stefanocottafavi.airfoil.AerodynamicsType#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.stefanocottafavi.airfoil.AerodynamicsType#getTables <em>Tables</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.stefanocottafavi.airfoil.AirfoilPackage#getAerodynamicsType()
 * @model extendedMetaData="name='aerodynamicsType' kind='elementOnly'"
 * @generated
 */
public interface AerodynamicsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(ParametersType)
	 * @see com.stefanocottafavi.airfoil.AirfoilPackage#getAerodynamicsType_Parameters()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='parameters' namespace='##targetNamespace'"
	 * @generated
	 */
	ParametersType getParameters();

	/**
	 * Sets the value of the '{@link com.stefanocottafavi.airfoil.AerodynamicsType#getParameters <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' containment reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(ParametersType value);

	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference.
	 * @see #setTables(TablesType)
	 * @see com.stefanocottafavi.airfoil.AirfoilPackage#getAerodynamicsType_Tables()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='tables' namespace='##targetNamespace'"
	 * @generated
	 */
	TablesType getTables();

	/**
	 * Sets the value of the '{@link com.stefanocottafavi.airfoil.AerodynamicsType#getTables <em>Tables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tables</em>' containment reference.
	 * @see #getTables()
	 * @generated
	 */
	void setTables(TablesType value);

} // AerodynamicsType
