/**
 */
package com.stefanocottafavi.airfoil;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.stefanocottafavi.airfoil.DataType#getAngle <em>Angle</em>}</li>
 *   <li>{@link com.stefanocottafavi.airfoil.DataType#getCl <em>Cl</em>}</li>
 *   <li>{@link com.stefanocottafavi.airfoil.DataType#getCd <em>Cd</em>}</li>
 *   <li>{@link com.stefanocottafavi.airfoil.DataType#getCm <em>Cm</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.stefanocottafavi.airfoil.AirfoilPackage#getDataType()
 * @model extendedMetaData="name='dataType' kind='elementOnly'"
 * @generated
 */
public interface DataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see #isSetAngle()
	 * @see #unsetAngle()
	 * @see #setAngle(double)
	 * @see com.stefanocottafavi.airfoil.AirfoilPackage#getDataType_Angle()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='angle' namespace='##targetNamespace'"
	 * @generated
	 */
	double getAngle();

	/**
	 * Sets the value of the '{@link com.stefanocottafavi.airfoil.DataType#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #isSetAngle()
	 * @see #unsetAngle()
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(double value);

	/**
	 * Unsets the value of the '{@link com.stefanocottafavi.airfoil.DataType#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAngle()
	 * @see #getAngle()
	 * @see #setAngle(double)
	 * @generated
	 */
	void unsetAngle();

	/**
	 * Returns whether the value of the '{@link com.stefanocottafavi.airfoil.DataType#getAngle <em>Angle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Angle</em>' attribute is set.
	 * @see #unsetAngle()
	 * @see #getAngle()
	 * @see #setAngle(double)
	 * @generated
	 */
	boolean isSetAngle();

	/**
	 * Returns the value of the '<em><b>Cl</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cl</em>' attribute.
	 * @see #isSetCl()
	 * @see #unsetCl()
	 * @see #setCl(double)
	 * @see com.stefanocottafavi.airfoil.AirfoilPackage#getDataType_Cl()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='cl' namespace='##targetNamespace'"
	 * @generated
	 */
	double getCl();

	/**
	 * Sets the value of the '{@link com.stefanocottafavi.airfoil.DataType#getCl <em>Cl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cl</em>' attribute.
	 * @see #isSetCl()
	 * @see #unsetCl()
	 * @see #getCl()
	 * @generated
	 */
	void setCl(double value);

	/**
	 * Unsets the value of the '{@link com.stefanocottafavi.airfoil.DataType#getCl <em>Cl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCl()
	 * @see #getCl()
	 * @see #setCl(double)
	 * @generated
	 */
	void unsetCl();

	/**
	 * Returns whether the value of the '{@link com.stefanocottafavi.airfoil.DataType#getCl <em>Cl</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cl</em>' attribute is set.
	 * @see #unsetCl()
	 * @see #getCl()
	 * @see #setCl(double)
	 * @generated
	 */
	boolean isSetCl();

	/**
	 * Returns the value of the '<em><b>Cd</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cd</em>' attribute.
	 * @see #isSetCd()
	 * @see #unsetCd()
	 * @see #setCd(double)
	 * @see com.stefanocottafavi.airfoil.AirfoilPackage#getDataType_Cd()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='cd' namespace='##targetNamespace'"
	 * @generated
	 */
	double getCd();

	/**
	 * Sets the value of the '{@link com.stefanocottafavi.airfoil.DataType#getCd <em>Cd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cd</em>' attribute.
	 * @see #isSetCd()
	 * @see #unsetCd()
	 * @see #getCd()
	 * @generated
	 */
	void setCd(double value);

	/**
	 * Unsets the value of the '{@link com.stefanocottafavi.airfoil.DataType#getCd <em>Cd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCd()
	 * @see #getCd()
	 * @see #setCd(double)
	 * @generated
	 */
	void unsetCd();

	/**
	 * Returns whether the value of the '{@link com.stefanocottafavi.airfoil.DataType#getCd <em>Cd</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cd</em>' attribute is set.
	 * @see #unsetCd()
	 * @see #getCd()
	 * @see #setCd(double)
	 * @generated
	 */
	boolean isSetCd();

	/**
	 * Returns the value of the '<em><b>Cm</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cm</em>' attribute.
	 * @see #isSetCm()
	 * @see #unsetCm()
	 * @see #setCm(double)
	 * @see com.stefanocottafavi.airfoil.AirfoilPackage#getDataType_Cm()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='cm' namespace='##targetNamespace'"
	 * @generated
	 */
	double getCm();

	/**
	 * Sets the value of the '{@link com.stefanocottafavi.airfoil.DataType#getCm <em>Cm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cm</em>' attribute.
	 * @see #isSetCm()
	 * @see #unsetCm()
	 * @see #getCm()
	 * @generated
	 */
	void setCm(double value);

	/**
	 * Unsets the value of the '{@link com.stefanocottafavi.airfoil.DataType#getCm <em>Cm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCm()
	 * @see #getCm()
	 * @see #setCm(double)
	 * @generated
	 */
	void unsetCm();

	/**
	 * Returns whether the value of the '{@link com.stefanocottafavi.airfoil.DataType#getCm <em>Cm</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cm</em>' attribute is set.
	 * @see #unsetCm()
	 * @see #getCm()
	 * @see #setCm(double)
	 * @generated
	 */
	boolean isSetCm();

} // DataType
