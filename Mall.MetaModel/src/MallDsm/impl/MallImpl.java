/**
 */
package MallDsm.impl;

import MallDsm.Brand;
import MallDsm.Category;
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
 *   <li>{@link MallDsm.impl.MallImpl#getAvailableBrands <em>Available Brands</em>}</li>
 *   <li>{@link MallDsm.impl.MallImpl#getCategories <em>Categories</em>}</li>
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
	 * The cached value of the '{@link #getAvailableBrands() <em>Available Brands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableBrands()
	 * @generated
	 * @ordered
	 */
	protected EList<Brand> availableBrands;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> categories;

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
	public EList<Brand> getAvailableBrands() {
		if (availableBrands == null) {
			availableBrands = new EObjectContainmentEList<Brand>(Brand.class, this, MallDsmPackage.MALL__AVAILABLE_BRANDS);
		}
		return availableBrands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<Category>(Category.class, this, MallDsmPackage.MALL__CATEGORIES);
		}
		return categories;
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
			case MallDsmPackage.MALL__AVAILABLE_BRANDS:
				return ((InternalEList<?>)getAvailableBrands()).basicRemove(otherEnd, msgs);
			case MallDsmPackage.MALL__CATEGORIES:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
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
			case MallDsmPackage.MALL__AVAILABLE_BRANDS:
				return getAvailableBrands();
			case MallDsmPackage.MALL__CATEGORIES:
				return getCategories();
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
			case MallDsmPackage.MALL__AVAILABLE_BRANDS:
				getAvailableBrands().clear();
				getAvailableBrands().addAll((Collection<? extends Brand>)newValue);
				return;
			case MallDsmPackage.MALL__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends Category>)newValue);
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
			case MallDsmPackage.MALL__AVAILABLE_BRANDS:
				getAvailableBrands().clear();
				return;
			case MallDsmPackage.MALL__CATEGORIES:
				getCategories().clear();
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
			case MallDsmPackage.MALL__AVAILABLE_BRANDS:
				return availableBrands != null && !availableBrands.isEmpty();
			case MallDsmPackage.MALL__CATEGORIES:
				return categories != null && !categories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MallImpl
