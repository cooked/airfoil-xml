/**
 */
package com.stefanocottafavi.airfoil.impl;

import com.stefanocottafavi.airfoil.AirfoilPackage;
import com.stefanocottafavi.airfoil.DataType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.stefanocottafavi.airfoil.impl.DataTypeImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link com.stefanocottafavi.airfoil.impl.DataTypeImpl#getCl <em>Cl</em>}</li>
 *   <li>{@link com.stefanocottafavi.airfoil.impl.DataTypeImpl#getCd <em>Cd</em>}</li>
 *   <li>{@link com.stefanocottafavi.airfoil.impl.DataTypeImpl#getCm <em>Cm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTypeImpl extends MinimalEObjectImpl.Container implements DataType {
	/**
	 * The default value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected double angle = ANGLE_EDEFAULT;

	/**
	 * This is true if the Angle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean angleESet;

	/**
	 * The default value of the '{@link #getCl() <em>Cl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCl()
	 * @generated
	 * @ordered
	 */
	protected static final double CL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCl() <em>Cl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCl()
	 * @generated
	 * @ordered
	 */
	protected double cl = CL_EDEFAULT;

	/**
	 * This is true if the Cl attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clESet;

	/**
	 * The default value of the '{@link #getCd() <em>Cd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCd()
	 * @generated
	 * @ordered
	 */
	protected static final double CD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCd() <em>Cd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCd()
	 * @generated
	 * @ordered
	 */
	protected double cd = CD_EDEFAULT;

	/**
	 * This is true if the Cd attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cdESet;

	/**
	 * The default value of the '{@link #getCm() <em>Cm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCm()
	 * @generated
	 * @ordered
	 */
	protected static final double CM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCm() <em>Cm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCm()
	 * @generated
	 * @ordered
	 */
	protected double cm = CM_EDEFAULT;

	/**
	 * This is true if the Cm attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cmESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AirfoilPackage.Literals.DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAngle() {
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngle(double newAngle) {
		double oldAngle = angle;
		angle = newAngle;
		boolean oldAngleESet = angleESet;
		angleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirfoilPackage.DATA_TYPE__ANGLE, oldAngle, angle, !oldAngleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAngle() {
		double oldAngle = angle;
		boolean oldAngleESet = angleESet;
		angle = ANGLE_EDEFAULT;
		angleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AirfoilPackage.DATA_TYPE__ANGLE, oldAngle, ANGLE_EDEFAULT, oldAngleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAngle() {
		return angleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCl() {
		return cl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCl(double newCl) {
		double oldCl = cl;
		cl = newCl;
		boolean oldClESet = clESet;
		clESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirfoilPackage.DATA_TYPE__CL, oldCl, cl, !oldClESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCl() {
		double oldCl = cl;
		boolean oldClESet = clESet;
		cl = CL_EDEFAULT;
		clESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AirfoilPackage.DATA_TYPE__CL, oldCl, CL_EDEFAULT, oldClESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCl() {
		return clESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCd() {
		return cd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCd(double newCd) {
		double oldCd = cd;
		cd = newCd;
		boolean oldCdESet = cdESet;
		cdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirfoilPackage.DATA_TYPE__CD, oldCd, cd, !oldCdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCd() {
		double oldCd = cd;
		boolean oldCdESet = cdESet;
		cd = CD_EDEFAULT;
		cdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AirfoilPackage.DATA_TYPE__CD, oldCd, CD_EDEFAULT, oldCdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCd() {
		return cdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCm() {
		return cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCm(double newCm) {
		double oldCm = cm;
		cm = newCm;
		boolean oldCmESet = cmESet;
		cmESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirfoilPackage.DATA_TYPE__CM, oldCm, cm, !oldCmESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCm() {
		double oldCm = cm;
		boolean oldCmESet = cmESet;
		cm = CM_EDEFAULT;
		cmESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AirfoilPackage.DATA_TYPE__CM, oldCm, CM_EDEFAULT, oldCmESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCm() {
		return cmESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AirfoilPackage.DATA_TYPE__ANGLE:
				return getAngle();
			case AirfoilPackage.DATA_TYPE__CL:
				return getCl();
			case AirfoilPackage.DATA_TYPE__CD:
				return getCd();
			case AirfoilPackage.DATA_TYPE__CM:
				return getCm();
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
			case AirfoilPackage.DATA_TYPE__ANGLE:
				setAngle((Double)newValue);
				return;
			case AirfoilPackage.DATA_TYPE__CL:
				setCl((Double)newValue);
				return;
			case AirfoilPackage.DATA_TYPE__CD:
				setCd((Double)newValue);
				return;
			case AirfoilPackage.DATA_TYPE__CM:
				setCm((Double)newValue);
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
			case AirfoilPackage.DATA_TYPE__ANGLE:
				unsetAngle();
				return;
			case AirfoilPackage.DATA_TYPE__CL:
				unsetCl();
				return;
			case AirfoilPackage.DATA_TYPE__CD:
				unsetCd();
				return;
			case AirfoilPackage.DATA_TYPE__CM:
				unsetCm();
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
			case AirfoilPackage.DATA_TYPE__ANGLE:
				return isSetAngle();
			case AirfoilPackage.DATA_TYPE__CL:
				return isSetCl();
			case AirfoilPackage.DATA_TYPE__CD:
				return isSetCd();
			case AirfoilPackage.DATA_TYPE__CM:
				return isSetCm();
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
		result.append(" (angle: ");
		if (angleESet) result.append(angle); else result.append("<unset>");
		result.append(", cl: ");
		if (clESet) result.append(cl); else result.append("<unset>");
		result.append(", cd: ");
		if (cdESet) result.append(cd); else result.append("<unset>");
		result.append(", cm: ");
		if (cmESet) result.append(cm); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DataTypeImpl
