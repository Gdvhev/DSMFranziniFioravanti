/**
 */
package MallDsm.impl;

import MallDsm.Good;
import MallDsm.ItemInStock;
import MallDsm.MallDsmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item In Stock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MallDsm.impl.ItemInStockImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link MallDsm.impl.ItemInStockImpl#getItemCount <em>Item Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemInStockImpl extends EObjectImpl implements ItemInStock {
	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected Good contains;

	/**
	 * The default value of the '{@link #getItemCount() <em>Item Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemCount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ITEM_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItemCount() <em>Item Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemCount()
	 * @generated
	 * @ordered
	 */
	protected Integer itemCount = ITEM_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemInStockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MallDsmPackage.Literals.ITEM_IN_STOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Good getContains() {
		if (contains != null && contains.eIsProxy()) {
			InternalEObject oldContains = (InternalEObject)contains;
			contains = (Good)eResolveProxy(oldContains);
			if (contains != oldContains) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MallDsmPackage.ITEM_IN_STOCK__CONTAINS, oldContains, contains));
			}
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Good basicGetContains() {
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContains(Good newContains) {
		Good oldContains = contains;
		contains = newContains;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MallDsmPackage.ITEM_IN_STOCK__CONTAINS, oldContains, contains));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getItemCount() {
		return itemCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemCount(Integer newItemCount) {
		Integer oldItemCount = itemCount;
		itemCount = newItemCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MallDsmPackage.ITEM_IN_STOCK__ITEM_COUNT, oldItemCount, itemCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MallDsmPackage.ITEM_IN_STOCK__CONTAINS:
				if (resolve) return getContains();
				return basicGetContains();
			case MallDsmPackage.ITEM_IN_STOCK__ITEM_COUNT:
				return getItemCount();
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
			case MallDsmPackage.ITEM_IN_STOCK__CONTAINS:
				setContains((Good)newValue);
				return;
			case MallDsmPackage.ITEM_IN_STOCK__ITEM_COUNT:
				setItemCount((Integer)newValue);
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
			case MallDsmPackage.ITEM_IN_STOCK__CONTAINS:
				setContains((Good)null);
				return;
			case MallDsmPackage.ITEM_IN_STOCK__ITEM_COUNT:
				setItemCount(ITEM_COUNT_EDEFAULT);
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
			case MallDsmPackage.ITEM_IN_STOCK__CONTAINS:
				return contains != null;
			case MallDsmPackage.ITEM_IN_STOCK__ITEM_COUNT:
				return ITEM_COUNT_EDEFAULT == null ? itemCount != null : !ITEM_COUNT_EDEFAULT.equals(itemCount);
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
		result.append(" (itemCount: ");
		result.append(itemCount);
		result.append(')');
		return result.toString();
	}

} //ItemInStockImpl
