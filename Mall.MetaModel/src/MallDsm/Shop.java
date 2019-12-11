/**
 */
package MallDsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MallDsm.Shop#getHas <em>Has</em>}</li>
 *   <li>{@link MallDsm.Shop#getSoldGoods <em>Sold Goods</em>}</li>
 *   <li>{@link MallDsm.Shop#getEmployees <em>Employees</em>}</li>
 *   <li>{@link MallDsm.Shop#getManager <em>Manager</em>}</li>
 *   <li>{@link MallDsm.Shop#getOpenSchedule <em>Open Schedule</em>}</li>
 *   <li>{@link MallDsm.Shop#getName <em>Name</em>}</li>
 *   <li>{@link MallDsm.Shop#getAddress <em>Address</em>}</li>
 *   <li>{@link MallDsm.Shop#getPhotosPaths <em>Photos Paths</em>}</li>
 *   <li>{@link MallDsm.Shop#getMapPath <em>Map Path</em>}</li>
 * </ul>
 *
 * @see MallDsm.MallDsmPackage#getShop()
 * @model abstract="true"
 * @generated
 */
public interface Shop extends EObject {
	/**
	 * Returns the value of the '<em><b>Has</b></em>' containment reference list.
	 * The list contents are of type {@link MallDsm.Container}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' containment reference list.
	 * @see MallDsm.MallDsmPackage#getShop_Has()
	 * @model containment="true"
	 * @generated
	 */
	EList<Container> getHas();

	/**
	 * Returns the value of the '<em><b>Sold Goods</b></em>' containment reference list.
	 * The list contents are of type {@link MallDsm.ListedGood}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sold Goods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sold Goods</em>' containment reference list.
	 * @see MallDsm.MallDsmPackage#getShop_SoldGoods()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListedGood> getSoldGoods();

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' containment reference list.
	 * The list contents are of type {@link MallDsm.Employee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employees</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' containment reference list.
	 * @see MallDsm.MallDsmPackage#getShop_Employees()
	 * @model containment="true"
	 * @generated
	 */
	EList<Employee> getEmployees();

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' containment reference.
	 * @see #setManager(Employee)
	 * @see MallDsm.MallDsmPackage#getShop_Manager()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Employee getManager();

	/**
	 * Sets the value of the '{@link MallDsm.Shop#getManager <em>Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' containment reference.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(Employee value);

	/**
	 * Returns the value of the '<em><b>Open Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open Schedule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open Schedule</em>' containment reference.
	 * @see #setOpenSchedule(WeeklySchedule)
	 * @see MallDsm.MallDsmPackage#getShop_OpenSchedule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	WeeklySchedule getOpenSchedule();

	/**
	 * Sets the value of the '{@link MallDsm.Shop#getOpenSchedule <em>Open Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open Schedule</em>' containment reference.
	 * @see #getOpenSchedule()
	 * @generated
	 */
	void setOpenSchedule(WeeklySchedule value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see MallDsm.MallDsmPackage#getShop_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MallDsm.Shop#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see MallDsm.MallDsmPackage#getShop_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link MallDsm.Shop#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Photos Paths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Photos Paths</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photos Paths</em>' attribute.
	 * @see #setPhotosPaths(String)
	 * @see MallDsm.MallDsmPackage#getShop_PhotosPaths()
	 * @model
	 * @generated
	 */
	String getPhotosPaths();

	/**
	 * Sets the value of the '{@link MallDsm.Shop#getPhotosPaths <em>Photos Paths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Photos Paths</em>' attribute.
	 * @see #getPhotosPaths()
	 * @generated
	 */
	void setPhotosPaths(String value);

	/**
	 * Returns the value of the '<em><b>Map Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Path</em>' attribute.
	 * @see #setMapPath(String)
	 * @see MallDsm.MallDsmPackage#getShop_MapPath()
	 * @model
	 * @generated
	 */
	String getMapPath();

	/**
	 * Sets the value of the '{@link MallDsm.Shop#getMapPath <em>Map Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Path</em>' attribute.
	 * @see #getMapPath()
	 * @generated
	 */
	void setMapPath(String value);

} // Shop
