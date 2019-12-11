/**
 */
package MallDsm.impl;

import MallDsm.Container;
import MallDsm.ItemInStock;
import MallDsm.MallDsmPackage;

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
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MallDsm.impl.ContainerImpl#getContainedGood <em>Contained Good</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContainerImpl extends EObjectImpl implements Container {
	/**
	 * The cached value of the '{@link #getContainedGood() <em>Contained Good</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedGood()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemInStock> containedGood;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MallDsmPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemInStock> getContainedGood() {
		if (containedGood == null) {
			containedGood = new EObjectContainmentEList<ItemInStock>(ItemInStock.class, this, MallDsmPackage.CONTAINER__CONTAINED_GOOD);
		}
		return containedGood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MallDsmPackage.CONTAINER__CONTAINED_GOOD:
				return ((InternalEList<?>)getContainedGood()).basicRemove(otherEnd, msgs);
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
			case MallDsmPackage.CONTAINER__CONTAINED_GOOD:
				return getContainedGood();
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
			case MallDsmPackage.CONTAINER__CONTAINED_GOOD:
				getContainedGood().clear();
				getContainedGood().addAll((Collection<? extends ItemInStock>)newValue);
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
			case MallDsmPackage.CONTAINER__CONTAINED_GOOD:
				getContainedGood().clear();
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
			case MallDsmPackage.CONTAINER__CONTAINED_GOOD:
				return containedGood != null && !containedGood.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainerImpl
