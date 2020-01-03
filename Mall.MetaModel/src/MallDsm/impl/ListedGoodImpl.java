/**
 */
package MallDsm.impl;

import MallDsm.Discount;
import MallDsm.Good;
import MallDsm.ListedGood;
import MallDsm.MallDsmPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Listed Good</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MallDsm.impl.ListedGoodImpl#getGood <em>Good</em>}</li>
 *   <li>{@link MallDsm.impl.ListedGoodImpl#getSales <em>Sales</em>}</li>
 *   <li>{@link MallDsm.impl.ListedGoodImpl#getDefaultPrice <em>Default Price</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListedGoodImpl extends EObjectImpl implements ListedGood {
	/**
	 * The cached value of the '{@link #getGood() <em>Good</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGood()
	 * @generated
	 * @ordered
	 */
	protected Good good;

	/**
	 * The cached value of the '{@link #getSales() <em>Sales</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSales()
	 * @generated
	 * @ordered
	 */
	protected EList<Discount> sales;

	/**
	 * The default value of the '{@link #getDefaultPrice() <em>Default Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPrice()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEFAULT_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultPrice() <em>Default Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPrice()
	 * @generated
	 * @ordered
	 */
	protected Integer defaultPrice = DEFAULT_PRICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListedGoodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MallDsmPackage.Literals.LISTED_GOOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Good getGood() {
		if (good != null && good.eIsProxy()) {
			InternalEObject oldGood = (InternalEObject)good;
			good = (Good)eResolveProxy(oldGood);
			if (good != oldGood) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MallDsmPackage.LISTED_GOOD__GOOD, oldGood, good));
			}
		}
		return good;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Good basicGetGood() {
		return good;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGood(Good newGood) {
		Good oldGood = good;
		good = newGood;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MallDsmPackage.LISTED_GOOD__GOOD, oldGood, good));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Discount> getSales() {
		if (sales == null) {
			sales = new EObjectContainmentEList<Discount>(Discount.class, this, MallDsmPackage.LISTED_GOOD__SALES);
		}
		return sales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDefaultPrice() {
		return defaultPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultPrice(Integer newDefaultPrice) {
		Integer oldDefaultPrice = defaultPrice;
		defaultPrice = newDefaultPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MallDsmPackage.LISTED_GOOD__DEFAULT_PRICE, oldDefaultPrice, defaultPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MallDsmPackage.LISTED_GOOD__SALES:
				return ((InternalEList<?>)getSales()).basicRemove(otherEnd, msgs);
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
			case MallDsmPackage.LISTED_GOOD__GOOD:
				if (resolve) return getGood();
				return basicGetGood();
			case MallDsmPackage.LISTED_GOOD__SALES:
				return getSales();
			case MallDsmPackage.LISTED_GOOD__DEFAULT_PRICE:
				return getDefaultPrice();
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
			case MallDsmPackage.LISTED_GOOD__GOOD:
				setGood((Good)newValue);
				return;
			case MallDsmPackage.LISTED_GOOD__SALES:
				getSales().clear();
				getSales().addAll((Collection<? extends Discount>)newValue);
				return;
			case MallDsmPackage.LISTED_GOOD__DEFAULT_PRICE:
				setDefaultPrice((Integer)newValue);
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
			case MallDsmPackage.LISTED_GOOD__GOOD:
				setGood((Good)null);
				return;
			case MallDsmPackage.LISTED_GOOD__SALES:
				getSales().clear();
				return;
			case MallDsmPackage.LISTED_GOOD__DEFAULT_PRICE:
				setDefaultPrice(DEFAULT_PRICE_EDEFAULT);
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
			case MallDsmPackage.LISTED_GOOD__GOOD:
				return good != null;
			case MallDsmPackage.LISTED_GOOD__SALES:
				return sales != null && !sales.isEmpty();
			case MallDsmPackage.LISTED_GOOD__DEFAULT_PRICE:
				return DEFAULT_PRICE_EDEFAULT == null ? defaultPrice != null : !DEFAULT_PRICE_EDEFAULT.equals(defaultPrice);
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
		result.append(" (defaultPrice: ");
		result.append(defaultPrice);
		result.append(')');
		return result.toString();
	}

} //ListedGoodImpl
