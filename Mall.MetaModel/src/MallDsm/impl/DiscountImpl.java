/**
 */
package MallDsm.impl;

import MallDsm.Discount;
import MallDsm.MallDsmPackage;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discount</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MallDsm.impl.DiscountImpl#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link MallDsm.impl.DiscountImpl#getTimeStart <em>Time Start</em>}</li>
 *   <li>{@link MallDsm.impl.DiscountImpl#getTimeEnd <em>Time End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscountImpl extends EObjectImpl implements Discount {
	/**
	 * The cached value of the '{@link #getPercentage() <em>Percentage</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> percentage;

	/**
	 * The default value of the '{@link #getTimeStart() <em>Time Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeStart() <em>Time Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStart()
	 * @generated
	 * @ordered
	 */
	protected Date timeStart = TIME_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeEnd() <em>Time End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeEnd() <em>Time End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeEnd()
	 * @generated
	 * @ordered
	 */
	protected Date timeEnd = TIME_END_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MallDsmPackage.Literals.DISCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getPercentage() {
		if (percentage == null) {
			percentage = new EDataTypeUniqueEList<Integer>(Integer.class, this, MallDsmPackage.DISCOUNT__PERCENTAGE);
		}
		return percentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimeStart() {
		return timeStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStart(Date newTimeStart) {
		Date oldTimeStart = timeStart;
		timeStart = newTimeStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MallDsmPackage.DISCOUNT__TIME_START, oldTimeStart, timeStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimeEnd() {
		return timeEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeEnd(Date newTimeEnd) {
		Date oldTimeEnd = timeEnd;
		timeEnd = newTimeEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MallDsmPackage.DISCOUNT__TIME_END, oldTimeEnd, timeEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MallDsmPackage.DISCOUNT__PERCENTAGE:
				return getPercentage();
			case MallDsmPackage.DISCOUNT__TIME_START:
				return getTimeStart();
			case MallDsmPackage.DISCOUNT__TIME_END:
				return getTimeEnd();
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
			case MallDsmPackage.DISCOUNT__PERCENTAGE:
				getPercentage().clear();
				getPercentage().addAll((Collection<? extends Integer>)newValue);
				return;
			case MallDsmPackage.DISCOUNT__TIME_START:
				setTimeStart((Date)newValue);
				return;
			case MallDsmPackage.DISCOUNT__TIME_END:
				setTimeEnd((Date)newValue);
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
			case MallDsmPackage.DISCOUNT__PERCENTAGE:
				getPercentage().clear();
				return;
			case MallDsmPackage.DISCOUNT__TIME_START:
				setTimeStart(TIME_START_EDEFAULT);
				return;
			case MallDsmPackage.DISCOUNT__TIME_END:
				setTimeEnd(TIME_END_EDEFAULT);
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
			case MallDsmPackage.DISCOUNT__PERCENTAGE:
				return percentage != null && !percentage.isEmpty();
			case MallDsmPackage.DISCOUNT__TIME_START:
				return TIME_START_EDEFAULT == null ? timeStart != null : !TIME_START_EDEFAULT.equals(timeStart);
			case MallDsmPackage.DISCOUNT__TIME_END:
				return TIME_END_EDEFAULT == null ? timeEnd != null : !TIME_END_EDEFAULT.equals(timeEnd);
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
		result.append(" (percentage: ");
		result.append(percentage);
		result.append(", timeStart: ");
		result.append(timeStart);
		result.append(", timeEnd: ");
		result.append(timeEnd);
		result.append(')');
		return result.toString();
	}

} //DiscountImpl
