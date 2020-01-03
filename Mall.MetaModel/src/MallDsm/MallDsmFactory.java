/**
 */
package MallDsm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MallDsm.MallDsmPackage
 * @generated
 */
public interface MallDsmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MallDsmFactory eINSTANCE = MallDsm.impl.MallDsmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Brand Shop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Brand Shop</em>'.
	 * @generated
	 */
	BrandShop createBrandShop();

	/**
	 * Returns a new object of class '<em>Specialistic Shop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specialistic Shop</em>'.
	 * @generated
	 */
	SpecialisticShop createSpecialisticShop();

	/**
	 * Returns a new object of class '<em>Brand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Brand</em>'.
	 * @generated
	 */
	Brand createBrand();

	/**
	 * Returns a new object of class '<em>Good</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Good</em>'.
	 * @generated
	 */
	Good createGood();

	/**
	 * Returns a new object of class '<em>Item In Stock</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item In Stock</em>'.
	 * @generated
	 */
	ItemInStock createItemInStock();

	/**
	 * Returns a new object of class '<em>Listed Good</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Listed Good</em>'.
	 * @generated
	 */
	ListedGood createListedGood();

	/**
	 * Returns a new object of class '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature</em>'.
	 * @generated
	 */
	Feature createFeature();

	/**
	 * Returns a new object of class '<em>Sub Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Category</em>'.
	 * @generated
	 */
	SubCategory createSubCategory();

	/**
	 * Returns a new object of class '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category</em>'.
	 * @generated
	 */
	Category createCategory();

	/**
	 * Returns a new object of class '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employee</em>'.
	 * @generated
	 */
	Employee createEmployee();

	/**
	 * Returns a new object of class '<em>Time Span</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Span</em>'.
	 * @generated
	 */
	TimeSpan createTimeSpan();

	/**
	 * Returns a new object of class '<em>Weekly Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Weekly Schedule</em>'.
	 * @generated
	 */
	WeeklySchedule createWeeklySchedule();

	/**
	 * Returns a new object of class '<em>Discount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discount</em>'.
	 * @generated
	 */
	Discount createDiscount();

	/**
	 * Returns a new object of class '<em>Shelf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shelf</em>'.
	 * @generated
	 */
	Shelf createShelf();

	/**
	 * Returns a new object of class '<em>Refrigerator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refrigerator</em>'.
	 * @generated
	 */
	Refrigerator createRefrigerator();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Mall</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mall</em>'.
	 * @generated
	 */
	Mall createMall();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MallDsmPackage getMallDsmPackage();

} //MallDsmFactory
