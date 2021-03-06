/**
 */
package com.stefanocottafavi.airfoil;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Translation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a translation in x, y and z direction.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.stefanocottafavi.airfoil.TranslationType#getPoint <em>Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.stefanocottafavi.airfoil.AirfoilPackage#getTranslationType()
 * @model extendedMetaData="name='translationType' kind='elementOnly'"
 * @generated
 */
public interface TranslationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point</em>' containment reference.
	 * @see #setPoint(PointType)
	 * @see com.stefanocottafavi.airfoil.AirfoilPackage#getTranslationType_Point()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='point' namespace='##targetNamespace'"
	 * @generated
	 */
	PointType getPoint();

	/**
	 * Sets the value of the '{@link com.stefanocottafavi.airfoil.TranslationType#getPoint <em>Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point</em>' containment reference.
	 * @see #getPoint()
	 * @generated
	 */
	void setPoint(PointType value);

} // TranslationType
