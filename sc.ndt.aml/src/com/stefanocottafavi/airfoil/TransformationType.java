/**
 */
package com.stefanocottafavi.airfoil;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a transformation for an element. Transformation order is: 1) scaling, 2) rotation, 3) translation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.stefanocottafavi.airfoil.TransformationType#getScaling <em>Scaling</em>}</li>
 *   <li>{@link com.stefanocottafavi.airfoil.TransformationType#getTranslation <em>Translation</em>}</li>
 *   <li>{@link com.stefanocottafavi.airfoil.TransformationType#getRotation <em>Rotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.stefanocottafavi.airfoil.AirfoilPackage#getTransformationType()
 * @model extendedMetaData="name='transformationType' kind='elementOnly'"
 * @generated
 */
public interface TransformationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Scaling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scaling</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaling</em>' containment reference.
	 * @see #setScaling(ScalingType)
	 * @see com.stefanocottafavi.airfoil.AirfoilPackage#getTransformationType_Scaling()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scaling' namespace='##targetNamespace'"
	 * @generated
	 */
	ScalingType getScaling();

	/**
	 * Sets the value of the '{@link com.stefanocottafavi.airfoil.TransformationType#getScaling <em>Scaling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaling</em>' containment reference.
	 * @see #getScaling()
	 * @generated
	 */
	void setScaling(ScalingType value);

	/**
	 * Returns the value of the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translation</em>' containment reference.
	 * @see #setTranslation(TranslationType)
	 * @see com.stefanocottafavi.airfoil.AirfoilPackage#getTransformationType_Translation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='translation' namespace='##targetNamespace'"
	 * @generated
	 */
	TranslationType getTranslation();

	/**
	 * Sets the value of the '{@link com.stefanocottafavi.airfoil.TransformationType#getTranslation <em>Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translation</em>' containment reference.
	 * @see #getTranslation()
	 * @generated
	 */
	void setTranslation(TranslationType value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' containment reference.
	 * @see #setRotation(RotationType)
	 * @see com.stefanocottafavi.airfoil.AirfoilPackage#getTransformationType_Rotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rotation' namespace='##targetNamespace'"
	 * @generated
	 */
	RotationType getRotation();

	/**
	 * Sets the value of the '{@link com.stefanocottafavi.airfoil.TransformationType#getRotation <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' containment reference.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(RotationType value);

} // TransformationType
