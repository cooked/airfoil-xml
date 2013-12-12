/**
 */
package com.stefanocottafavi.airfoil;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.stefanocottafavi.airfoil.AirfoilType#getName <em>Name</em>}</li>
 *   <li>{@link com.stefanocottafavi.airfoil.AirfoilType#getElements <em>Elements</em>}</li>
 *   <li>{@link com.stefanocottafavi.airfoil.AirfoilType#getAerodynamics <em>Aerodynamics</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.stefanocottafavi.airfoil.AirfoilPackage#getAirfoilType()
 * @model extendedMetaData="name='airfoil_._type' kind='elementOnly'"
 * @generated
 */
public interface AirfoilType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.stefanocottafavi.airfoil.AirfoilPackage#getAirfoilType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.stefanocottafavi.airfoil.AirfoilType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference.
	 * @see #setElements(ElementsType)
	 * @see com.stefanocottafavi.airfoil.AirfoilPackage#getAirfoilType_Elements()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='elements' namespace='##targetNamespace'"
	 * @generated
	 */
	ElementsType getElements();

	/**
	 * Sets the value of the '{@link com.stefanocottafavi.airfoil.AirfoilType#getElements <em>Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elements</em>' containment reference.
	 * @see #getElements()
	 * @generated
	 */
	void setElements(ElementsType value);

	/**
	 * Returns the value of the '<em><b>Aerodynamics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aerodynamics</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aerodynamics</em>' containment reference.
	 * @see #setAerodynamics(AerodynamicsType)
	 * @see com.stefanocottafavi.airfoil.AirfoilPackage#getAirfoilType_Aerodynamics()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='aerodynamics' namespace='##targetNamespace'"
	 * @generated
	 */
	AerodynamicsType getAerodynamics();

	/**
	 * Sets the value of the '{@link com.stefanocottafavi.airfoil.AirfoilType#getAerodynamics <em>Aerodynamics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aerodynamics</em>' containment reference.
	 * @see #getAerodynamics()
	 * @generated
	 */
	void setAerodynamics(AerodynamicsType value);

} // AirfoilType
