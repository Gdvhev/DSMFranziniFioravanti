/**
 */
package MallDsm.impl;

import MallDsm.MallDsmPackage;
import MallDsm.TimeSpan;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Span</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MallDsm.impl.TimeSpanImpl#getStartHour <em>Start Hour</em>}</li>
 *   <li>{@link MallDsm.impl.TimeSpanImpl#getStartDay <em>Start Day</em>}</li>
 *   <li>{@link MallDsm.impl.TimeSpanImpl#getEndDay <em>End Day</em>}</li>
 *   <li>{@link MallDsm.impl.TimeSpanImpl#getEndHour <em>End Hour</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeSpanImpl extends EObjectImpl implements TimeSpan {
	/**
	 * The default value of the '{@link #getStartHour() <em>Start Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartHour()
	 * @generated
	 * @ordered
	 */
	protected static final Integer START_HOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartHour() <em>Start Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartHour()
	 * @generated
	 * @ordered
	 */
	protected Integer startHour = START_HOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDay() <em>Start Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDay()
	 * @generated
	 * @ordered
	 */
	protected static final Integer START_DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDay() <em>Start Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDay()
	 * @generated
	 * @ordered
	 */
	protected Integer startDay = START_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDay() <em>End Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDay()
	 * @generated
	 * @ordered
	 */
	protected static final Integer END_DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDay() <em>End Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDay()
	 * @generated
	 * @ordered
	 */
	protected Integer endDay = END_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndHour() <em>End Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndHour()
	 * @generated
	 * @ordered
	 */
	protected static final Integer END_HOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndHour() <em>End Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndHour()
	 * @generated
	 * @ordered
	 */
	protected Integer endHour = END_HOUR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeSpanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MallDsmPackage.Literals.TIME_SPAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStartHour() {
		return startHour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartHour(Integer newStartHour) {
		Integer oldStartHour = startHour;
		startHour = newStartHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MallDsmPackage.TIME_SPAN__START_HOUR, oldStartHour, startHour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStartDay() {
		return startDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDay(Integer newStartDay) {
		Integer oldStartDay = startDay;
		startDay = newStartDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MallDsmPackage.TIME_SPAN__START_DAY, oldStartDay, startDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getEndDay() {
		return endDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDay(Integer newEndDay) {
		Integer oldEndDay = endDay;
		endDay = newEndDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MallDsmPackage.TIME_SPAN__END_DAY, oldEndDay, endDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getEndHour() {
		return endHour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndHour(Integer newEndHour) {
		Integer oldEndHour = endHour;
		endHour = newEndHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MallDsmPackage.TIME_SPAN__END_HOUR, oldEndHour, endHour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MallDsmPackage.TIME_SPAN__START_HOUR:
				return getStartHour();
			case MallDsmPackage.TIME_SPAN__START_DAY:
				return getStartDay();
			case MallDsmPackage.TIME_SPAN__END_DAY:
				return getEndDay();
			case MallDsmPackage.TIME_SPAN__END_HOUR:
				return getEndHour();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MallDsmPackage.TIME_SPAN__START_HOUR:
				setStartHour((Integer)newValue);
				return;
			case MallDsmPackage.TIME_SPAN__START_DAY:
				setStartDay((Integer)newValue);
				return;
			case MallDsmPackage.TIME_SPAN__END_DAY:
				setEndDay((Integer)newValue);
				return;
			case MallDsmPackage.TIME_SPAN__END_HOUR:
				setEndHour((Integer)newValue);
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
			case MallDsmPackage.TIME_SPAN__START_HOUR:
				setStartHour(START_HOUR_EDEFAULT);
				return;
			case MallDsmPackage.TIME_SPAN__START_DAY:
				setStartDay(START_DAY_EDEFAULT);
				return;
			case MallDsmPackage.TIME_SPAN__END_DAY:
				setEndDay(END_DAY_EDEFAULT);
				return;
			case MallDsmPackage.TIME_SPAN__END_HOUR:
				setEndHour(END_HOUR_EDEFAULT);
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
			case MallDsmPackage.TIME_SPAN__START_HOUR:
				return START_HOUR_EDEFAULT == null ? startHour != null : !START_HOUR_EDEFAULT.equals(startHour);
			case MallDsmPackage.TIME_SPAN__START_DAY:
				return START_DAY_EDEFAULT == null ? startDay != null : !START_DAY_EDEFAULT.equals(startDay);
			case MallDsmPackage.TIME_SPAN__END_DAY:
				return END_DAY_EDEFAULT == null ? endDay != null : !END_DAY_EDEFAULT.equals(endDay);
			case MallDsmPackage.TIME_SPAN__END_HOUR:
				return END_HOUR_EDEFAULT == null ? endHour != null : !END_HOUR_EDEFAULT.equals(endHour);
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
		result.append(" (startHour: ");
		result.append(startHour);
		result.append(", startDay: ");
		result.append(startDay);
		result.append(", endDay: ");
		result.append(endDay);
		result.append(", endHour: ");
		result.append(endHour);
		result.append(')');
		return result.toString();
	}

} //TimeSpanImpl
