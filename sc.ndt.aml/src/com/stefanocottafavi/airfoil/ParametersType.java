/**
 */
package com.stefanocottafavi.airfoil;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameters Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a list of aerodynamic parameters.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.stefanocottafavi.airfoil.ParametersType#getParameter <em>Parameter</em>}</li>
 *   <li>{@link com.stefanocottafavi.airfoil.ParametersType#getCount <em>Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.stefanocottafavi.airfoil.AirfoilPackage#getParametersType()
 * @model extendedMetaData="name='parametersType' kind='elementOnly'"
 * @generated
 */
public interface ParametersType extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link com.stefanocottafavi.airfoil.ParameterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see com.stefanocottafavi.airfoil.AirfoilPackage#getParametersType_Parameter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ParameterType> getParameter();

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(BigInteger)
	 * @see com.stefanocottafavi.airfoil.AirfoilPackage#getParametersType_Count()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='count'"
	 * @generated
	 */
	BigInteger getCount();

	/**
	 * Sets the value of the '{@link com.stefanocottafavi.airfoil.ParametersType#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(BigInteger value);

} // ParametersType
