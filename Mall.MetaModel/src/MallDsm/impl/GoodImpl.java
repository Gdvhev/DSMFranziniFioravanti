/**
 */
package MallDsm.impl;

import MallDsm.Feature;
import MallDsm.Good;
import MallDsm.MallDsmPackage;
import MallDsm.SubCatecory;

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
 * An implementation of the model object '<em><b>Good</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MallDsm.impl.GoodImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link MallDsm.impl.GoodImpl#getHasSubCategory <em>Has Sub Category</em>}</li>
 *   <li>{@link MallDsm.impl.GoodImpl#getModelNumber <em>Model Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoodImpl extends EObjectImpl implements Good {
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * The cached value of the '{@link #getHasSubCategory() <em>Has Sub Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSubCategory()
	 * @generated
	 * @ordered
	 */
	protected SubCatecory hasSubCategory;

	/**
	 * The default value of the '{@link #getModelNumber() <em>Model Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelNumber() <em>Model Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelNumber()
	 * @generated
	 * @ordered
	 */
	protected String modelNumber = MODEL_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MallDsmPackage.Literals.GOOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<Feature>(Feature.class, this, MallDsmPackage.GOOD__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubCatecory getHasSubCategory() {
		if (hasSubCategory != null && hasSubCategory.eIsProxy()) {
			InternalEObject oldHasSubCategory = (InternalEObject)hasSubCategory;
			hasSubCategory = (SubCatecory)eResolveProxy(oldHasSubCategory);
			if (hasSubCategory != oldHasSubCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MallDsmPackage.GOOD__HAS_SUB_CATEGORY, oldHasSubCategory, hasSubCategory));
			}
		}
		return hasSubCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubCatecory basicGetHasSubCategory() {
		return hasSubCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasSubCategory(SubCatecory newHasSubCategory) {
		SubCatecory oldHasSubCategory = hasSubCategory;
		hasSubCategory = newHasSubCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MallDsmPackage.GOOD__HAS_SUB_CATEGORY, oldHasSubCategory, hasSubCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelNumber() {
		return modelNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelNumber(String newModelNumber) {
		String oldModelNumber = modelNumber;
		modelNumber = newModelNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MallDsmPackage.GOOD__MODEL_NUMBER, oldModelNumber, modelNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MallDsmPackage.GOOD__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
			case MallDsmPackage.GOOD__FEATURES:
				return getFeatures();
			case MallDsmPackage.GOOD__HAS_SUB_CATEGORY:
				if (resolve) return getHasSubCategory();
				return basicGetHasSubCategory();
			case MallDsmPackage.GOOD__MODEL_NUMBER:
				return getModelNumber();
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
			case MallDsmPackage.GOOD__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case MallDsmPackage.GOOD__HAS_SUB_CATEGORY:
				setHasSubCategory((SubCatecory)newValue);
				return;
			case MallDsmPackage.GOOD__MODEL_NUMBER:
				setModelNumber((String)newValue);
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
			case MallDsmPackage.GOOD__FEATURES:
				getFeatures().clear();
				return;
			case MallDsmPackage.GOOD__HAS_SUB_CATEGORY:
				setHasSubCategory((SubCatecory)null);
				return;
			case MallDsmPackage.GOOD__MODEL_NUMBER:
				setModelNumber(MODEL_NUMBER_EDEFAULT);
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
			case MallDsmPackage.GOOD__FEATURES:
				return features != null && !features.isEmpty();
			case MallDsmPackage.GOOD__HAS_SUB_CATEGORY:
				return hasSubCategory != null;
			case MallDsmPackage.GOOD__MODEL_NUMBER:
				return MODEL_NUMBER_EDEFAULT == null ? modelNumber != null : !MODEL_NUMBER_EDEFAULT.equals(modelNumber);
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
		result.append(" (ModelNumber: ");
		result.append(modelNumber);
		result.append(')');
		return result.toString();
	}

} //GoodImpl
