/**
 */
package MallDsm.impl;

import MallDsm.Employee;
import MallDsm.MallDsmPackage;
import MallDsm.WeeklySchedule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MallDsm.impl.EmployeeImpl#getShiftSchedule <em>Shift Schedule</em>}</li>
 *   <li>{@link MallDsm.impl.EmployeeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeeImpl extends EObjectImpl implements Employee {
	/**
	 * The cached value of the '{@link #getShiftSchedule() <em>Shift Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShiftSchedule()
	 * @generated
	 * @ordered
	 */
	protected WeeklySchedule shiftSchedule;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MallDsmPackage.Literals.EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeeklySchedule getShiftSchedule() {
		return shiftSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShiftSchedule(WeeklySchedule newShiftSchedule, NotificationChain msgs) {
		WeeklySchedule oldShiftSchedule = shiftSchedule;
		shiftSchedule = newShiftSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MallDsmPackage.EMPLOYEE__SHIFT_SCHEDULE, oldShiftSchedule, newShiftSchedule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShiftSchedule(WeeklySchedule newShiftSchedule) {
		if (newShiftSchedule != shiftSchedule) {
			NotificationChain msgs = null;
			if (shiftSchedule != null)
				msgs = ((InternalEObject)shiftSchedule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MallDsmPackage.EMPLOYEE__SHIFT_SCHEDULE, null, msgs);
			if (newShiftSchedule != null)
				msgs = ((InternalEObject)newShiftSchedule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MallDsmPackage.EMPLOYEE__SHIFT_SCHEDULE, null, msgs);
			msgs = basicSetShiftSchedule(newShiftSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MallDsmPackage.EMPLOYEE__SHIFT_SCHEDULE, newShiftSchedule, newShiftSchedule));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MallDsmPackage.EMPLOYEE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MallDsmPackage.EMPLOYEE__SHIFT_SCHEDULE:
				return basicSetShiftSchedule(null, msgs);
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
			case MallDsmPackage.EMPLOYEE__SHIFT_SCHEDULE:
				return getShiftSchedule();
			case MallDsmPackage.EMPLOYEE__NAME:
				return getName();
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
			case MallDsmPackage.EMPLOYEE__SHIFT_SCHEDULE:
				setShiftSchedule((WeeklySchedule)newValue);
				return;
			case MallDsmPackage.EMPLOYEE__NAME:
				setName((String)newValue);
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
			case MallDsmPackage.EMPLOYEE__SHIFT_SCHEDULE:
				setShiftSchedule((WeeklySchedule)null);
				return;
			case MallDsmPackage.EMPLOYEE__NAME:
				setName(NAME_EDEFAULT);
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
			case MallDsmPackage.EMPLOYEE__SHIFT_SCHEDULE:
				return shiftSchedule != null;
			case MallDsmPackage.EMPLOYEE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EmployeeImpl
