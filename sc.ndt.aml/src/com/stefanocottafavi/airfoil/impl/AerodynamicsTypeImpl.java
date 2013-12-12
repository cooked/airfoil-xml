/**
 */
package com.stefanocottafavi.airfoil.impl;

import com.stefanocottafavi.airfoil.AerodynamicsType;
import com.stefanocottafavi.airfoil.AirfoilPackage;
import com.stefanocottafavi.airfoil.ParametersType;
import com.stefanocottafavi.airfoil.TablesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aerodynamics Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.stefanocottafavi.airfoil.impl.AerodynamicsTypeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.stefanocottafavi.airfoil.impl.AerodynamicsTypeImpl#getTables <em>Tables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AerodynamicsTypeImpl extends MinimalEObjectImpl.Container implements AerodynamicsType {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected ParametersType parameters;

	/**
	 * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTables()
	 * @generated
	 * @ordered
	 */
	protected TablesType tables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AerodynamicsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AirfoilPackage.Literals.AERODYNAMICS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersType getParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameters(ParametersType newParameters, NotificationChain msgs) {
		ParametersType oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AirfoilPackage.AERODYNAMICS_TYPE__PARAMETERS, oldParameters, newParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameters(ParametersType newParameters) {
		if (newParameters != parameters) {
			NotificationChain msgs = null;
			if (parameters != null)
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AirfoilPackage.AERODYNAMICS_TYPE__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AirfoilPackage.AERODYNAMICS_TYPE__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirfoilPackage.AERODYNAMICS_TYPE__PARAMETERS, newParameters, newParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TablesType getTables() {
		return tables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTables(TablesType newTables, NotificationChain msgs) {
		TablesType oldTables = tables;
		tables = newTables;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AirfoilPackage.AERODYNAMICS_TYPE__TABLES, oldTables, newTables);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTables(TablesType newTables) {
		if (newTables != tables) {
			NotificationChain msgs = null;
			if (tables != null)
				msgs = ((InternalEObject)tables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AirfoilPackage.AERODYNAMICS_TYPE__TABLES, null, msgs);
			if (newTables != null)
				msgs = ((InternalEObject)newTables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AirfoilPackage.AERODYNAMICS_TYPE__TABLES, null, msgs);
			msgs = basicSetTables(newTables, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirfoilPackage.AERODYNAMICS_TYPE__TABLES, newTables, newTables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AirfoilPackage.AERODYNAMICS_TYPE__PARAMETERS:
				return basicSetParameters(null, msgs);
			case AirfoilPackage.AERODYNAMICS_TYPE__TABLES:
				return basicSetTables(null, msgs);
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
			case AirfoilPackage.AERODYNAMICS_TYPE__PARAMETERS:
				return getParameters();
			case AirfoilPackage.AERODYNAMICS_TYPE__TABLES:
				return getTables();
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
			case AirfoilPackage.AERODYNAMICS_TYPE__PARAMETERS:
				setParameters((ParametersType)newValue);
				return;
			case AirfoilPackage.AERODYNAMICS_TYPE__TABLES:
				setTables((TablesType)newValue);
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
			case AirfoilPackage.AERODYNAMICS_TYPE__PARAMETERS:
				setParameters((ParametersType)null);
				return;
			case AirfoilPackage.AERODYNAMICS_TYPE__TABLES:
				setTables((TablesType)null);
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
			case AirfoilPackage.AERODYNAMICS_TYPE__PARAMETERS:
				return parameters != null;
			case AirfoilPackage.AERODYNAMICS_TYPE__TABLES:
				return tables != null;
		}
		return super.eIsSet(featureID);
	}

} //AerodynamicsTypeImpl
