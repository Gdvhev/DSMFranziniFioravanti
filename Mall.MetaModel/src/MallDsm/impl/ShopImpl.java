/**
 */
package MallDsm.impl;

import MallDsm.Container;
import MallDsm.Employee;
import MallDsm.ListedGood;
import MallDsm.MallDsmPackage;
import MallDsm.Shop;
import MallDsm.WeeklySchedule;

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
 * An implementation of the model object '<em><b>Shop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MallDsm.impl.ShopImpl#getHas <em>Has</em>}</li>
 *   <li>{@link MallDsm.impl.ShopImpl#getSoldGoods <em>Sold Goods</em>}</li>
 *   <li>{@link MallDsm.impl.ShopImpl#getEmployees <em>Employees</em>}</li>
 *   <li>{@link MallDsm.impl.ShopImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link MallDsm.impl.ShopImpl#getOpenSchedule <em>Open Schedule</em>}</li>
 *   <li>{@link MallDsm.impl.ShopImpl#getName <em>Name</em>}</li>
 *   <li>{@link MallDsm.impl.ShopImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link MallDsm.impl.ShopImpl#getPhotosPaths <em>Photos Paths</em>}</li>
 *   <li>{@link MallDsm.impl.ShopImpl#getMapPath <em>Map Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ShopImpl extends EObjectImpl implements Shop {
	/**
	 * The cached value of the '{@link #getHas() <em>Has</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas()
	 * @generated
	 * @ordered
	 */
	protected EList<Container> has;

	/**
	 * The cached value of the '{@link #getSoldGoods() <em>Sold Goods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoldGoods()
	 * @generated
	 * @ordered
	 */
	protected EList<ListedGood> soldGoods;

	/**
	 * The cached value of the '{@link #getEmployees() <em>Employees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployees()
	 * @generated
	 * @ordered
	 */
	protected EList<Employee> employees;

	/**
	 * The cached value of the '{@link #getManager() <em>Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected Employee manager;

	/**
	 * The cached value of the '{@link #getOpenSchedule() <em>Open Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenSchedule()
	 * @generated
	 * @ordered
	 */
	protected WeeklySchedule openSchedule;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhotosPaths() <em>Photos Paths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhotosPaths()
	 * @generated
	 * @ordered
	 */
	protected static final String PHOTOS_PATHS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhotosPaths() <em>Photos Paths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhotosPaths()
	 * @generated
	 * @ordered
	 */
	protected String photosPaths = PHOTOS_PATHS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMapPath() <em>Map Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapPath()
	 * @generated
	 * @ordered
	 */
	protected static final String MAP_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMapPath() <em>Map Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapPath()
	 * @generated
	 * @ordered
	 */
	protected String mapPath = MAP_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MallDsmPackage.Literals.SHOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Container> getHas() {
		if (has == null) {
			has = new EObjectContainmentEList<Container>(Container.class, this, MallDsmPackage.SHOP__HAS);
		}
		return has;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListedGood> getSoldGoods() {
		if (soldGoods == null) {
			soldGoods = new EObjectContainmentEList<ListedGood>(ListedGood.class, this, MallDsmPackage.SHOP__SOLD_GOODS);
		}
		return soldGoods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getEmployees() {
		if (employees == null) {
			employees = new EObjectContainmentEList<Employee>(Employee.class, this, MallDsmPackage.SHOP__EMPLOYEES);
		}
		return employees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee getManager() {
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManager(Employee newManager, NotificationChain msgs) {
		Employee oldManager = manager;
		manager = newManager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MallDsmPackage.SHOP__MANAGER, oldManager, newManager);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManager(Employee newManager) {
		if (newManager != manager) {
			NotificationChain msgs = null;
			if (manager != null)
				msgs = ((InternalEObject)manager).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MallDsmPackage.SHOP__MANAGER, null, msgs);
			if (newManager != null)
				msgs = ((InternalEObject)newManager).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MallDsmPackage.SHOP__MANAGER, null, msgs);
			msgs = basicSetManager(newManager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MallDsmPackage.SHOP__MANAGER, newManager, newManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeeklySchedule getOpenSchedule() {
		return openSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpenSchedule(WeeklySchedule newOpenSchedule, NotificationChain msgs) {
		WeeklySchedule oldOpenSchedule = openSchedule;
		openSchedule = newOpenSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MallDsmPackage.SHOP__OPEN_SCHEDULE, oldOpenSchedule, newOpenSchedule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenSchedule(WeeklySchedule newOpenSchedule) {
		if (newOpenSchedule != openSchedule) {
			NotificationChain msgs = null;
			if (openSchedule != null)
				msgs = ((InternalEObject)openSchedule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MallDsmPackage.SHOP__OPEN_SCHEDULE, null, msgs);
			if (newOpenSchedule != null)
				msgs = ((InternalEObject)newOpenSchedule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MallDsmPackage.SHOP__OPEN_SCHEDULE, null, msgs);
			msgs = basicSetOpenSchedule(newOpenSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MallDsmPackage.SHOP__OPEN_SCHEDULE, newOpenSchedule, newOpenSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MallDsmPackage.SHOP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MallDsmPackage.SHOP__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhotosPaths() {
		return photosPaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhotosPaths(String newPhotosPaths) {
		String oldPhotosPaths = photosPaths;
		photosPaths = newPhotosPaths;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MallDsmPackage.SHOP__PHOTOS_PATHS, oldPhotosPaths, photosPaths));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMapPath() {
		return mapPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapPath(String newMapPath) {
		String oldMapPath = mapPath;
		mapPath = newMapPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MallDsmPackage.SHOP__MAP_PATH, oldMapPath, mapPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MallDsmPackage.SHOP__HAS:
				return ((InternalEList<?>)getHas()).basicRemove(otherEnd, msgs);
			case MallDsmPackage.SHOP__SOLD_GOODS:
				return ((InternalEList<?>)getSoldGoods()).basicRemove(otherEnd, msgs);
			case MallDsmPackage.SHOP__EMPLOYEES:
				return ((InternalEList<?>)getEmployees()).basicRemove(otherEnd, msgs);
			case MallDsmPackage.SHOP__MANAGER:
				return basicSetManager(null, msgs);
			case MallDsmPackage.SHOP__OPEN_SCHEDULE:
				return basicSetOpenSchedule(null, msgs);
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
			case MallDsmPackage.SHOP__HAS:
				return getHas();
			case MallDsmPackage.SHOP__SOLD_GOODS:
				return getSoldGoods();
			case MallDsmPackage.SHOP__EMPLOYEES:
				return getEmployees();
			case MallDsmPackage.SHOP__MANAGER:
				return getManager();
			case MallDsmPackage.SHOP__OPEN_SCHEDULE:
				return getOpenSchedule();
			case MallDsmPackage.SHOP__NAME:
				return getName();
			case MallDsmPackage.SHOP__ADDRESS:
				return getAddress();
			case MallDsmPackage.SHOP__PHOTOS_PATHS:
				return getPhotosPaths();
			case MallDsmPackage.SHOP__MAP_PATH:
				return getMapPath();
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
			case MallDsmPackage.SHOP__HAS:
				getHas().clear();
				getHas().addAll((Collection<? extends Container>)newValue);
				return;
			case MallDsmPackage.SHOP__SOLD_GOODS:
				getSoldGoods().clear();
				getSoldGoods().addAll((Collection<? extends ListedGood>)newValue);
				return;
			case MallDsmPackage.SHOP__EMPLOYEES:
				getEmployees().clear();
				getEmployees().addAll((Collection<? extends Employee>)newValue);
				return;
			case MallDsmPackage.SHOP__MANAGER:
				setManager((Employee)newValue);
				return;
			case MallDsmPackage.SHOP__OPEN_SCHEDULE:
				setOpenSchedule((WeeklySchedule)newValue);
				return;
			case MallDsmPackage.SHOP__NAME:
				setName((String)newValue);
				return;
			case MallDsmPackage.SHOP__ADDRESS:
				setAddress((String)newValue);
				return;
			case MallDsmPackage.SHOP__PHOTOS_PATHS:
				setPhotosPaths((String)newValue);
				return;
			case MallDsmPackage.SHOP__MAP_PATH:
				setMapPath((String)newValue);
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
			case MallDsmPackage.SHOP__HAS:
				getHas().clear();
				return;
			case MallDsmPackage.SHOP__SOLD_GOODS:
				getSoldGoods().clear();
				return;
			case MallDsmPackage.SHOP__EMPLOYEES:
				getEmployees().clear();
				return;
			case MallDsmPackage.SHOP__MANAGER:
				setManager((Employee)null);
				return;
			case MallDsmPackage.SHOP__OPEN_SCHEDULE:
				setOpenSchedule((WeeklySchedule)null);
				return;
			case MallDsmPackage.SHOP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MallDsmPackage.SHOP__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case MallDsmPackage.SHOP__PHOTOS_PATHS:
				setPhotosPaths(PHOTOS_PATHS_EDEFAULT);
				return;
			case MallDsmPackage.SHOP__MAP_PATH:
				setMapPath(MAP_PATH_EDEFAULT);
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
			case MallDsmPackage.SHOP__HAS:
				return has != null && !has.isEmpty();
			case MallDsmPackage.SHOP__SOLD_GOODS:
				return soldGoods != null && !soldGoods.isEmpty();
			case MallDsmPackage.SHOP__EMPLOYEES:
				return employees != null && !employees.isEmpty();
			case MallDsmPackage.SHOP__MANAGER:
				return manager != null;
			case MallDsmPackage.SHOP__OPEN_SCHEDULE:
				return openSchedule != null;
			case MallDsmPackage.SHOP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MallDsmPackage.SHOP__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case MallDsmPackage.SHOP__PHOTOS_PATHS:
				return PHOTOS_PATHS_EDEFAULT == null ? photosPaths != null : !PHOTOS_PATHS_EDEFAULT.equals(photosPaths);
			case MallDsmPackage.SHOP__MAP_PATH:
				return MAP_PATH_EDEFAULT == null ? mapPath != null : !MAP_PATH_EDEFAULT.equals(mapPath);
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", Address: ");
		result.append(address);
		result.append(", PhotosPaths: ");
		result.append(photosPaths);
		result.append(", MapPath: ");
		result.append(mapPath);
		result.append(')');
		return result.toString();
	}

} //ShopImpl
