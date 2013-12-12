/**
 */
package com.stefanocottafavi.airfoil.impl;

import com.stefanocottafavi.airfoil.AirfoilPackage;
import com.stefanocottafavi.airfoil.RotationType;
import com.stefanocottafavi.airfoil.ScalingType;
import com.stefanocottafavi.airfoil.TransformationType;
import com.stefanocottafavi.airfoil.TranslationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.stefanocottafavi.airfoil.impl.TransformationTypeImpl#getScaling <em>Scaling</em>}</li>
 *   <li>{@link com.stefanocottafavi.airfoil.impl.TransformationTypeImpl#getTranslation <em>Translation</em>}</li>
 *   <li>{@link com.stefanocottafavi.airfoil.impl.TransformationTypeImpl#getRotation <em>Rotation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformationTypeImpl extends MinimalEObjectImpl.Container implements TransformationType {
	/**
	 * The cached value of the '{@link #getScaling() <em>Scaling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaling()
	 * @generated
	 * @ordered
	 */
	protected ScalingType scaling;

	/**
	 * The cached value of the '{@link #getTranslation() <em>Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslation()
	 * @generated
	 * @ordered
	 */
	protected TranslationType translation;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected RotationType rotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AirfoilPackage.Literals.TRANSFORMATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingType getScaling() {
		return scaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScaling(ScalingType newScaling, NotificationChain msgs) {
		ScalingType oldScaling = scaling;
		scaling = newScaling;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AirfoilPackage.TRANSFORMATION_TYPE__SCALING, oldScaling, newScaling);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaling(ScalingType newScaling) {
		if (newScaling != scaling) {
			NotificationChain msgs = null;
			if (scaling != null)
				msgs = ((InternalEObject)scaling).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AirfoilPackage.TRANSFORMATION_TYPE__SCALING, null, msgs);
			if (newScaling != null)
				msgs = ((InternalEObject)newScaling).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AirfoilPackage.TRANSFORMATION_TYPE__SCALING, null, msgs);
			msgs = basicSetScaling(newScaling, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirfoilPackage.TRANSFORMATION_TYPE__SCALING, newScaling, newScaling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationType getTranslation() {
		return translation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslation(TranslationType newTranslation, NotificationChain msgs) {
		TranslationType oldTranslation = translation;
		translation = newTranslation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AirfoilPackage.TRANSFORMATION_TYPE__TRANSLATION, oldTranslation, newTranslation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslation(TranslationType newTranslation) {
		if (newTranslation != translation) {
			NotificationChain msgs = null;
			if (translation != null)
				msgs = ((InternalEObject)translation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AirfoilPackage.TRANSFORMATION_TYPE__TRANSLATION, null, msgs);
			if (newTranslation != null)
				msgs = ((InternalEObject)newTranslation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AirfoilPackage.TRANSFORMATION_TYPE__TRANSLATION, null, msgs);
			msgs = basicSetTranslation(newTranslation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirfoilPackage.TRANSFORMATION_TYPE__TRANSLATION, newTranslation, newTranslation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotationType getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotation(RotationType newRotation, NotificationChain msgs) {
		RotationType oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AirfoilPackage.TRANSFORMATION_TYPE__ROTATION, oldRotation, newRotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotation(RotationType newRotation) {
		if (newRotation != rotation) {
			NotificationChain msgs = null;
			if (rotation != null)
				msgs = ((InternalEObject)rotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AirfoilPackage.TRANSFORMATION_TYPE__ROTATION, null, msgs);
			if (newRotation != null)
				msgs = ((InternalEObject)newRotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AirfoilPackage.TRANSFORMATION_TYPE__ROTATION, null, msgs);
			msgs = basicSetRotation(newRotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirfoilPackage.TRANSFORMATION_TYPE__ROTATION, newRotation, newRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AirfoilPackage.TRANSFORMATION_TYPE__SCALING:
				return basicSetScaling(null, msgs);
			case AirfoilPackage.TRANSFORMATION_TYPE__TRANSLATION:
				return basicSetTranslation(null, msgs);
			case AirfoilPackage.TRANSFORMATION_TYPE__ROTATION:
				return basicSetRotation(null, msgs);
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
			case AirfoilPackage.TRANSFORMATION_TYPE__SCALING:
				return getScaling();
			case AirfoilPackage.TRANSFORMATION_TYPE__TRANSLATION:
				return getTranslation();
			case AirfoilPackage.TRANSFORMATION_TYPE__ROTATION:
				return getRotation();
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
			case AirfoilPackage.TRANSFORMATION_TYPE__SCALING:
				setScaling((ScalingType)newValue);
				return;
			case AirfoilPackage.TRANSFORMATION_TYPE__TRANSLATION:
				setTranslation((TranslationType)newValue);
				return;
			case AirfoilPackage.TRANSFORMATION_TYPE__ROTATION:
				setRotation((RotationType)newValue);
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
			case AirfoilPackage.TRANSFORMATION_TYPE__SCALING:
				setScaling((ScalingType)null);
				return;
			case AirfoilPackage.TRANSFORMATION_TYPE__TRANSLATION:
				setTranslation((TranslationType)null);
				return;
			case AirfoilPackage.TRANSFORMATION_TYPE__ROTATION:
				setRotation((RotationType)null);
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
			case AirfoilPackage.TRANSFORMATION_TYPE__SCALING:
				return scaling != null;
			case AirfoilPackage.TRANSFORMATION_TYPE__TRANSLATION:
				return translation != null;
			case AirfoilPackage.TRANSFORMATION_TYPE__ROTATION:
				return rotation != null;
		}
		return super.eIsSet(featureID);
	}

} //TransformationTypeImpl
