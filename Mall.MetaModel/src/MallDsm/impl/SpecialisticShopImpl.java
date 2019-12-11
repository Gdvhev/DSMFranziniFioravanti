/**
 */
package MallDsm.impl;

import MallDsm.Category;
import MallDsm.MallDsmPackage;
import MallDsm.SpecialisticShop;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialistic Shop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MallDsm.impl.SpecialisticShopImpl#getSpeciality <em>Speciality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecialisticShopImpl extends ShopImpl implements SpecialisticShop {
	/**
	 * The cached value of the '{@link #getSpeciality() <em>Speciality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeciality()
	 * @generated
	 * @ordered
	 */
	protected Category speciality;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecialisticShopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MallDsmPackage.Literals.SPECIALISTIC_SHOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getSpeciality() {
		if (speciality != null && speciality.eIsProxy()) {
			InternalEObject oldSpeciality = (InternalEObject)speciality;
			speciality = (Category)eResolveProxy(oldSpeciality);
			if (speciality != oldSpeciality) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MallDsmPackage.SPECIALISTIC_SHOP__SPECIALITY, oldSpeciality, speciality));
			}
		}
		return speciality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetSpeciality() {
		return speciality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeciality(Category newSpeciality) {
		Category oldSpeciality = speciality;
		speciality = newSpeciality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MallDsmPackage.SPECIALISTIC_SHOP__SPECIALITY, oldSpeciality, speciality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MallDsmPackage.SPECIALISTIC_SHOP__SPECIALITY:
				if (resolve) return getSpeciality();
				return basicGetSpeciality();
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
			case MallDsmPackage.SPECIALISTIC_SHOP__SPECIALITY:
				setSpeciality((Category)newValue);
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
			case MallDsmPackage.SPECIALISTIC_SHOP__SPECIALITY:
				setSpeciality((Category)null);
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
			case MallDsmPackage.SPECIALISTIC_SHOP__SPECIALITY:
				return speciality != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecialisticShopImpl
