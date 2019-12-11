/**
 */
package MallDsm.impl;

import MallDsm.Brand;
import MallDsm.Mall;
import MallDsm.MallDsmPackage;
import MallDsm.Shop;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mall</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MallDsm.impl.MallImpl#getShops <em>Shops</em>}</li>
 *   <li>{@link MallDsm.impl.MallImpl#getAviableBrands <em>Aviable Brands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MallImpl extends EObjectImpl implements Mall {
	/**
	 * The cached value of the '{@link #getShops() <em>Shops</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShops()
	 * @generated
	 * @ordered
	 */
	protected EList<Shop> shops;

	/**
	 * The cached value of the '{@link #getAviableBrands() <em>Aviable Brands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAviableBrands()
	 * @generated
	 * @ordered
	 */
	protected EList<Brand> aviableBrands;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MallDsmPackage.Literals.MALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Shop> getShops() {
		if (shops == null) {
			shops = new EObjectContainmentEList<Shop>(Shop.class, this, MallDsmPackage.MALL__SHOPS);
		}
		return shops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Brand> getAviableBrands() {
		if (aviableBrands == null) {
			aviableBrands = new EObjectContainmentEList<Brand>(Brand.class, this, MallDsmPackage.MALL__AVIABLE_BRANDS);
		}
		return aviableBrands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MallDsmPackage.MALL__SHOPS:
				return ((InternalEList<?>)getShops()).basicRemove(otherEnd, msgs);
			case MallDsmPackage.MALL__AVIABLE_BRANDS:
				return ((InternalEList<?>)getAviableBrands()).basicRemove(otherEnd, msgs);
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
			case MallDsmPackage.MALL__SHOPS:
				return getShops();
			case MallDsmPackage.MALL__AVIABLE_BRANDS:
				return getAviableBrands();
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
			case MallDsmPackage.MALL__SHOPS:
				getShops().clear();
				getShops().addAll((Collection<? extends Shop>)newValue);
				return;
			case MallDsmPackage.MALL__AVIABLE_BRANDS:
				getAviableBrands().clear();
				getAviableBrands().addAll((Collection<? extends Brand>)newValue);
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
			case MallDsmPackage.MALL__SHOPS:
				getShops().clear();
				return;
			case MallDsmPackage.MALL__AVIABLE_BRANDS:
				getAviableBrands().clear();
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
			case MallDsmPackage.MALL__SHOPS:
				return shops != null && !shops.isEmpty();
			case MallDsmPackage.MALL__AVIABLE_BRANDS:
				return aviableBrands != null && !aviableBrands.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MallImpl
