/**
 */
package com.stefanocottafavi.airfoil.impl;

import com.stefanocottafavi.airfoil.AerodynamicsType;
import com.stefanocottafavi.airfoil.AirfoilPackage;
import com.stefanocottafavi.airfoil.AirfoilType;
import com.stefanocottafavi.airfoil.ElementsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.stefanocottafavi.airfoil.impl.AirfoilTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.stefanocottafavi.airfoil.impl.AirfoilTypeImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link com.stefanocottafavi.airfoil.impl.AirfoilTypeImpl#getAerodynamics <em>Aerodynamics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AirfoilTypeImpl extends MinimalEObjectImpl.Container implements AirfoilType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected ElementsType elements;

	/**
	 * The cached value of the '{@link #getAerodynamics() <em>Aerodynamics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAerodynamics()
	 * @generated
	 * @ordered
	 */
	protected AerodynamicsType aerodynamics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AirfoilTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AirfoilPackage.Literals.AIRFOIL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirfoilPackage.AIRFOIL_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementsType getElements() {
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElements(ElementsType newElements, NotificationChain msgs) {
		ElementsType oldElements = elements;
		elements = newElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AirfoilPackage.AIRFOIL_TYPE__ELEMENTS, oldElements, newElements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElements(ElementsType newElements) {
		if (newElements != elements) {
			NotificationChain msgs = null;
			if (elements != null)
				msgs = ((InternalEObject)elements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AirfoilPackage.AIRFOIL_TYPE__ELEMENTS, null, msgs);
			if (newElements != null)
				msgs = ((InternalEObject)newElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AirfoilPackage.AIRFOIL_TYPE__ELEMENTS, null, msgs);
			msgs = basicSetElements(newElements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirfoilPackage.AIRFOIL_TYPE__ELEMENTS, newElements, newElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AerodynamicsType getAerodynamics() {
		return aerodynamics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAerodynamics(AerodynamicsType newAerodynamics, NotificationChain msgs) {
		AerodynamicsType oldAerodynamics = aerodynamics;
		aerodynamics = newAerodynamics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AirfoilPackage.AIRFOIL_TYPE__AERODYNAMICS, oldAerodynamics, newAerodynamics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAerodynamics(AerodynamicsType newAerodynamics) {
		if (newAerodynamics != aerodynamics) {
			NotificationChain msgs = null;
			if (aerodynamics != null)
				msgs = ((InternalEObject)aerodynamics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AirfoilPackage.AIRFOIL_TYPE__AERODYNAMICS, null, msgs);
			if (newAerodynamics != null)
				msgs = ((InternalEObject)newAerodynamics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AirfoilPackage.AIRFOIL_TYPE__AERODYNAMICS, null, msgs);
			msgs = basicSetAerodynamics(newAerodynamics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirfoilPackage.AIRFOIL_TYPE__AERODYNAMICS, newAerodynamics, newAerodynamics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AirfoilPackage.AIRFOIL_TYPE__ELEMENTS:
				return basicSetElements(null, msgs);
			case AirfoilPackage.AIRFOIL_TYPE__AERODYNAMICS:
				return basicSetAerodynamics(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AirfoilPackage.AIRFOIL_TYPE__NAME:
				return getName();
			case AirfoilPackage.AIRFOIL_TYPE__ELEMENTS:
				return getElements();
			case AirfoilPackage.AIRFOIL_TYPE__AERODYNAMICS:
				return getAerodynamics();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AirfoilPackage.AIRFOIL_TYPE__NAME:
				setName((String)newValue);
				return;
			case AirfoilPackage.AIRFOIL_TYPE__ELEMENTS:
				setElements((ElementsType)newValue);
				return;
			case AirfoilPackage.AIRFOIL_TYPE__AERODYNAMICS:
				setAerodynamics((AerodynamicsType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AirfoilPackage.AIRFOIL_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AirfoilPackage.AIRFOIL_TYPE__ELEMENTS:
				setElements((ElementsType)null);
				return;
			case AirfoilPackage.AIRFOIL_TYPE__AERODYNAMICS:
				setAerodynamics((AerodynamicsType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AirfoilPackage.AIRFOIL_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AirfoilPackage.AIRFOIL_TYPE__ELEMENTS:
				return elements != null;
			case AirfoilPackage.AIRFOIL_TYPE__AERODYNAMICS:
				return aerodynamics != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AirfoilTypeImpl
