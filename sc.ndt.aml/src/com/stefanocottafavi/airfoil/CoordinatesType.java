/**
 */
package com.stefanocottafavi.airfoil;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinates Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a sequence of point coordinates describing the shape of an airfoil element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.stefanocottafavi.airfoil.CoordinatesType#getPoint <em>Point</em>}</li>
 *   <li>{@link com.stefanocottafavi.airfoil.CoordinatesType#getCount <em>Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.stefanocottafavi.airfoil.AirfoilPackage#getCoordinatesType()
 * @model extendedMetaData="name='coordinatesType' kind='elementOnly'"
 * @generated
 */
public interface CoordinatesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference list.
	 * The list contents are of type {@link com.stefanocottafavi.airfoil.PointType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point</em>' containment reference list.
	 * @see com.stefanocottafavi.airfoil.AirfoilPackage#getCoordinatesType_Point()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='point' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PointType> getPoint();

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
	 * @see com.stefanocottafavi.airfoil.AirfoilPackage#getCoordinatesType_Count()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='count'"
	 * @generated
	 */
	BigInteger getCount();

	/**
	 * Sets the value of the '{@link com.stefanocottafavi.airfoil.CoordinatesType#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(BigInteger value);

} // CoordinatesType
