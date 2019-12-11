/**
 */
package MallDsm.impl;

import MallDsm.MallDsmPackage;
import MallDsm.TimeSpan;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

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
	 * The cached value of the '{@link #getStartHour() <em>Start Hour</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartHour()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> startHour;

	/**
	 * The cached value of the '{@link #getStartDay() <em>Start Day</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDay()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> startDay;

	/**
	 * The cached value of the '{@link #getEndDay() <em>End Day</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDay()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> endDay;

	/**
	 * The cached value of the '{@link #getEndHour() <em>End Hour</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndHour()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> endHour;

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
	public EList<Integer> getStartHour() {
		if (startHour == null) {
			startHour = new EDataTypeUniqueEList<Integer>(Integer.class, this, MallDsmPackage.TIME_SPAN__START_HOUR);
		}
		return startHour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getStartDay() {
		if (startDay == null) {
			startDay = new EDataTypeUniqueEList<Integer>(Integer.class, this, MallDsmPackage.TIME_SPAN__START_DAY);
		}
		return startDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getEndDay() {
		if (endDay == null) {
			endDay = new EDataTypeUniqueEList<Integer>(Integer.class, this, MallDsmPackage.TIME_SPAN__END_DAY);
		}
		return endDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getEndHour() {
		if (endHour == null) {
			endHour = new EDataTypeUniqueEList<Integer>(Integer.class, this, MallDsmPackage.TIME_SPAN__END_HOUR);
		}
		return endHour;
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
				getStartHour().clear();
				getStartHour().addAll((Collection<? extends Integer>)newValue);
				return;
			case MallDsmPackage.TIME_SPAN__START_DAY:
				getStartDay().clear();
				getStartDay().addAll((Collection<? extends Integer>)newValue);
				return;
			case MallDsmPackage.TIME_SPAN__END_DAY:
				getEndDay().clear();
				getEndDay().addAll((Collection<? extends Integer>)newValue);
				return;
			case MallDsmPackage.TIME_SPAN__END_HOUR:
				getEndHour().clear();
				getEndHour().addAll((Collection<? extends Integer>)newValue);
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
				getStartHour().clear();
				return;
			case MallDsmPackage.TIME_SPAN__START_DAY:
				getStartDay().clear();
				return;
			case MallDsmPackage.TIME_SPAN__END_DAY:
				getEndDay().clear();
				return;
			case MallDsmPackage.TIME_SPAN__END_HOUR:
				getEndHour().clear();
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
				return startHour != null && !startHour.isEmpty();
			case MallDsmPackage.TIME_SPAN__START_DAY:
				return startDay != null && !startDay.isEmpty();
			case MallDsmPackage.TIME_SPAN__END_DAY:
				return endDay != null && !endDay.isEmpty();
			case MallDsmPackage.TIME_SPAN__END_HOUR:
				return endHour != null && !endHour.isEmpty();
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
		result.append(" (StartHour: ");
		result.append(startHour);
		result.append(", StartDay: ");
		result.append(startDay);
		result.append(", EndDay: ");
		result.append(endDay);
		result.append(", EndHour: ");
		result.append(endHour);
		result.append(')');
		return result.toString();
	}

} //TimeSpanImpl
