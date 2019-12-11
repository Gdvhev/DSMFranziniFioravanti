/**
 */
package MallDsm.impl;

import MallDsm.Brand;
import MallDsm.BrandShop;
import MallDsm.MallDsmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Brand Shop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MallDsm.impl.BrandShopImpl#getBrand <em>Brand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BrandShopImpl extends ShopImpl implements BrandShop {
	/**
	 * The cached value of the '{@link #getBrand() <em>Brand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrand()
	 * @generated
	 * @ordered
	 */
	protected Brand brand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrandShopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MallDsmPackage.Literals.BRAND_SHOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Brand getBrand() {
		if (brand != null && brand.eIsProxy()) {
			InternalEObject oldBrand = (InternalEObject)brand;
			brand = (Brand)eResolveProxy(oldBrand);
			if (brand != oldBrand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MallDsmPackage.BRAND_SHOP__BRAND, oldBrand, brand));
			}
		}
		return brand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Brand basicGetBrand() {
		return brand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrand(Brand newBrand) {
		Brand oldBrand = brand;
		brand = newBrand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MallDsmPackage.BRAND_SHOP__BRAND, oldBrand, brand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MallDsmPackage.BRAND_SHOP__BRAND:
				if (resolve) return getBrand();
				return basicGetBrand();
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
			case MallDsmPackage.BRAND_SHOP__BRAND:
				setBrand((Brand)newValue);
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
			case MallDsmPackage.BRAND_SHOP__BRAND:
				setBrand((Brand)null);
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
			case MallDsmPackage.BRAND_SHOP__BRAND:
				return brand != null;
		}
		return super.eIsSet(featureID);
	}

} //BrandShopImpl
