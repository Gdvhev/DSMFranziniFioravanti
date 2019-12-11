/**
 */
package MallDsm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see MallDsm.MallDsmFactory
 * @model kind="package"
 * @generated
 */
public interface MallDsmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MallDsm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mall.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Mall";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MallDsmPackage eINSTANCE = MallDsm.impl.MallDsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link MallDsm.impl.ShopImpl <em>Shop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MallDsm.impl.ShopImpl
	 * @see MallDsm.impl.MallDsmPackageImpl#getShop()
	 * @generated
	 */
	int SHOP = 0;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP__HAS = 0;

	/**
	 * The feature id for the '<em><b>Sold Goods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP__SOLD_GOODS = 1;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP__EMPLOYEES = 2;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP__MANAGER = 3;

	/**
	 * The feature id for the '<em><b>Open Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP__OPEN_SCHEDULE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP__NAME = 5;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP__ADDRESS = 6;

	/**
	 * The feature id for the '<em><b>Photos Paths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP__PHOTOS_PATHS = 7;

	/**
	 * The feature id for the '<em><b>Map Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP__MAP_PATH = 8;

	/**
	 * The number of structural features of the '<em>Shop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link MallDsm.impl.BrandShopImpl <em>Brand Shop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MallDsm.impl.BrandShopImpl
	 * @see MallDsm.impl.MallDsmPackageImpl#getBrandShop()
	 * @generated
	 */
	int BRAND_SHOP = 1;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRAND_SHOP__HAS = SHOP__HAS;

	/**
	 * The feature id for the '<em><b>Sold Goods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRAND_SHOP__SOLD_GOODS = SHOP__SOLD_GOODS;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRAND_SHOP__EMPLOYEES = SHOP__EMPLOYEES;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRAND_SHOP__MANAGER = SHOP__MANAGER;

	/**
	 * The feature id for the '<em><b>Open Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRAND_SHOP__OPEN_SCHEDULE = SHOP__OPEN_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRAND_SHOP__NAME = SHOP__NAME;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRAND_SHOP__ADDRESS = SHOP__ADDRESS;

	/**
	 * The feature id for the '<em><b>Photos Paths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRAND_SHOP__PHOTOS_PATHS = SHOP__PHOTOS_PATHS;

	/**
	 * The feature id for the '<em><b>Map Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRAND_SHOP__MAP_PATH = SHOP__MAP_PATH;

	/**
	 * The feature id for the '<em><b>Brand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRAND_SHOP__BRAND = SHOP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Brand Shop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRAND_SHOP_FEATURE_COUNT = SHOP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link MallDsm.impl.SpecialisticShopImpl <em>Specialistic Shop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MallDsm.impl.SpecialisticShopImpl
	 * @see MallDsm.impl.MallDsmPackageImpl#getSpecialisticShop()
	 * @generated
	 */
	int SPECIALISTIC_SHOP = 2;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISTIC_SHOP__HAS = SHOP__HAS;

	/**
	 * The feature id for the '<em><b>Sold Goods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISTIC_SHOP__SOLD_GOODS = SHOP__SOLD_GOODS;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISTIC_SHOP__EMPLOYEES = SHOP__EMPLOYEES;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISTIC_SHOP__MANAGER = SHOP__MANAGER;

	/**
	 * The feature id for the '<em><b>Open Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISTIC_SHOP__OPEN_SCHEDULE = SHOP__OPEN_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISTIC_SHOP__NAME = SHOP__NAME;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISTIC_SHOP__ADDRESS = SHOP__ADDRESS;

	/**
	 * The feature id for the '<em><b>Photos Paths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISTIC_SHOP__PHOTOS_PATHS = SHOP__PHOTOS_PATHS;

	/**
	 * The feature id for the '<em><b>Map Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISTIC_SHOP__MAP_PATH = SHOP__MAP_PATH;

	/**
	 * The feature id for the '<em><b>Speciality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISTIC_SHOP__SPECIALITY = SHOP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Specialistic Shop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISTIC_SHOP_FEATURE_COUNT = SHOP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link MallDsm.impl.BrandImpl <em>Brand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MallDsm.impl.BrandImpl
	 * @see MallDsm.impl.MallDsmPackageImpl#getBrand()
	 * @generated
	 */
	int BRAND = 3;

	/**
	 * The feature id for the '<em><b>Produced Goods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRAND__PRODUCED_GOODS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRAND__NAME = 1;

	/**
	 * The number of structural features of the '<em>Brand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRAND_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link MallDsm.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MallDsm.impl.ContainerImpl
	 * @see MallDsm.impl.MallDsmPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Contained Good</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTAINED_GOOD = 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link MallDsm.impl.GoodImpl <em>Good</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MallDsm.impl.GoodImpl
	 * @see MallDsm.impl.MallDsmPackageImpl#getGood()
	 * @generated
	 */
	int GOOD = 5;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOD__FEATURES = 0;

	/**
	 * The feature id for the '<em><b>Has Sub Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOD__HAS_SUB_CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Model Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOD__MODEL_NUMBER = 2;

	/**
	 * The number of structural features of the '<em>Good</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOD_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link MallDsm.impl.ItemInStockImpl <em>Item In Stock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MallDsm.impl.ItemInStockImpl
	 * @see MallDsm.impl.MallDsmPackageImpl#getItemInStock()
	 * @generated
	 */
	int ITEM_IN_STOCK = 6;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_IN_STOCK__CONTAINS = 0;

	/**
	 * The feature id for the '<em><b>Item Count</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_IN_STOCK__ITEM_COUNT = 1;

	/**
	 * The number of structural features of the '<em>Item In Stock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_IN_STOCK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link MallDsm.impl.ListedGoodImpl <em>Listed Good</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MallDsm.impl.ListedGoodImpl
	 * @see MallDsm.impl.MallDsmPackageImpl#getListedGood()
	 * @generated
	 */
	int LISTED_GOOD = 7;

	/**
	 * The feature id for the '<em><b>Good</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTED_GOOD__GOOD = 0;

	/**
	 * The feature id for the '<em><b>Sales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTED_GOOD__SALES = 1;

	/**
	 * The feature id for the '<em><b>Default Price</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTED_GOOD__DEFAULT_PRICE = 2;

	/**
	 * The number of structural features of the '<em>Listed Good</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTED_GOOD_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link MallDsm.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MallDsm.impl.FeatureImpl
	 * @see MallDsm.impl.MallDsmPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link MallDsm.impl.SubCatecoryImpl <em>Sub Catecory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MallDsm.impl.SubCatecoryImpl
	 * @see MallDsm.impl.MallDsmPackageImpl#getSubCatecory()
	 * @generated
	 */
	int SUB_CATECORY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CATECORY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Sub Catecory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CATECORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link MallDsm.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MallDsm.impl.CategoryImpl
	 * @see MallDsm.impl.MallDsmPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 10;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CONTAINS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 1;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link MallDsm.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MallDsm.impl.EmployeeImpl
	 * @see MallDsm.impl.MallDsmPackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 11;

	/**
	 * The feature id for the '<em><b>Shift Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__SHIFT_SCHEDULE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link MallDsm.impl.TimeSpanImpl <em>Time Span</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MallDsm.impl.TimeSpanImpl
	 * @see MallDsm.impl.MallDsmPackageImpl#getTimeSpan()
	 * @generated
	 */
	int TIME_SPAN = 12;

	/**
	 * The feature id for the '<em><b>Start Hour</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN__START_HOUR = 0;

	/**
	 * The feature id for the '<em><b>Start Day</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN__START_DAY = 1;

	/**
	 * The feature id for the '<em><b>End Day</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN__END_DAY = 2;

	/**
	 * The feature id for the '<em><b>End Hour</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN__END_HOUR = 3;

	/**
	 * The number of structural features of the '<em>Time Span</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link MallDsm.impl.WeeklyScheduleImpl <em>Weekly Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MallDsm.impl.WeeklyScheduleImpl
	 * @see MallDsm.impl.MallDsmPackageImpl#getWeeklySchedule()
	 * @generated
	 */
	int WEEKLY_SCHEDULE = 13;

	/**
	 * The feature id for the '<em><b>Shift</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEKLY_SCHEDULE__SHIFT = 0;

	/**
	 * The number of structural features of the '<em>Weekly Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEKLY_SCHEDULE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link MallDsm.impl.DiscountImpl <em>Discount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MallDsm.impl.DiscountImpl
	 * @see MallDsm.impl.MallDsmPackageImpl#getDiscount()
	 * @generated
	 */
	int DISCOUNT = 14;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT__PERCENTAGE = 0;

	/**
	 * The feature id for the '<em><b>Time Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT__TIME_START = 1;

	/**
	 * The feature id for the '<em><b>Time End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT__TIME_END = 2;

	/**
	 * The number of structural features of the '<em>Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link MallDsm.impl.ShelfImpl <em>Shelf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MallDsm.impl.ShelfImpl
	 * @see MallDsm.impl.MallDsmPackageImpl#getShelf()
	 * @generated
	 */
	int SHELF = 15;

	/**
	 * The feature id for the '<em><b>Contained Good</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELF__CONTAINED_GOOD = CONTAINER__CONTAINED_GOOD;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELF__LAYERS = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shelf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELF_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link MallDsm.impl.RefrigeratorImpl <em>Refrigerator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MallDsm.impl.RefrigeratorImpl
	 * @see MallDsm.impl.MallDsmPackageImpl#getRefrigerator()
	 * @generated
	 */
	int REFRIGERATOR = 16;

	/**
	 * The feature id for the '<em><b>Contained Good</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFRIGERATOR__CONTAINED_GOOD = CONTAINER__CONTAINED_GOOD;

	/**
	 * The number of structural features of the '<em>Refrigerator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFRIGERATOR_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link MallDsm.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MallDsm.impl.TableImpl
	 * @see MallDsm.impl.MallDsmPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 17;

	/**
	 * The feature id for the '<em><b>Contained Good</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CONTAINED_GOOD = CONTAINER__CONTAINED_GOOD;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link MallDsm.impl.MallImpl <em>Mall</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MallDsm.impl.MallImpl
	 * @see MallDsm.impl.MallDsmPackageImpl#getMall()
	 * @generated
	 */
	int MALL = 18;

	/**
	 * The feature id for the '<em><b>Shops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALL__SHOPS = 0;

	/**
	 * The feature id for the '<em><b>Aviable Brands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALL__AVIABLE_BRANDS = 1;

	/**
	 * The number of structural features of the '<em>Mall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALL_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link MallDsm.Shop <em>Shop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shop</em>'.
	 * @see MallDsm.Shop
	 * @generated
	 */
	EClass getShop();

	/**
	 * Returns the meta object for the containment reference list '{@link MallDsm.Shop#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has</em>'.
	 * @see MallDsm.Shop#getHas()
	 * @see #getShop()
	 * @generated
	 */
	EReference getShop_Has();

	/**
	 * Returns the meta object for the containment reference list '{@link MallDsm.Shop#getSoldGoods <em>Sold Goods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sold Goods</em>'.
	 * @see MallDsm.Shop#getSoldGoods()
	 * @see #getShop()
	 * @generated
	 */
	EReference getShop_SoldGoods();

	/**
	 * Returns the meta object for the containment reference list '{@link MallDsm.Shop#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employees</em>'.
	 * @see MallDsm.Shop#getEmployees()
	 * @see #getShop()
	 * @generated
	 */
	EReference getShop_Employees();

	/**
	 * Returns the meta object for the containment reference '{@link MallDsm.Shop#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manager</em>'.
	 * @see MallDsm.Shop#getManager()
	 * @see #getShop()
	 * @generated
	 */
	EReference getShop_Manager();

	/**
	 * Returns the meta object for the containment reference '{@link MallDsm.Shop#getOpenSchedule <em>Open Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Open Schedule</em>'.
	 * @see MallDsm.Shop#getOpenSchedule()
	 * @see #getShop()
	 * @generated
	 */
	EReference getShop_OpenSchedule();

	/**
	 * Returns the meta object for the attribute '{@link MallDsm.Shop#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MallDsm.Shop#getName()
	 * @see #getShop()
	 * @generated
	 */
	EAttribute getShop_Name();

	/**
	 * Returns the meta object for the attribute '{@link MallDsm.Shop#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see MallDsm.Shop#getAddress()
	 * @see #getShop()
	 * @generated
	 */
	EAttribute getShop_Address();

	/**
	 * Returns the meta object for the attribute '{@link MallDsm.Shop#getPhotosPaths <em>Photos Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Photos Paths</em>'.
	 * @see MallDsm.Shop#getPhotosPaths()
	 * @see #getShop()
	 * @generated
	 */
	EAttribute getShop_PhotosPaths();

	/**
	 * Returns the meta object for the attribute '{@link MallDsm.Shop#getMapPath <em>Map Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Path</em>'.
	 * @see MallDsm.Shop#getMapPath()
	 * @see #getShop()
	 * @generated
	 */
	EAttribute getShop_MapPath();

	/**
	 * Returns the meta object for class '{@link MallDsm.BrandShop <em>Brand Shop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Brand Shop</em>'.
	 * @see MallDsm.BrandShop
	 * @generated
	 */
	EClass getBrandShop();

	/**
	 * Returns the meta object for the reference '{@link MallDsm.BrandShop#getBrand <em>Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Brand</em>'.
	 * @see MallDsm.BrandShop#getBrand()
	 * @see #getBrandShop()
	 * @generated
	 */
	EReference getBrandShop_Brand();

	/**
	 * Returns the meta object for class '{@link MallDsm.SpecialisticShop <em>Specialistic Shop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialistic Shop</em>'.
	 * @see MallDsm.SpecialisticShop
	 * @generated
	 */
	EClass getSpecialisticShop();

	/**
	 * Returns the meta object for the reference '{@link MallDsm.SpecialisticShop#getSpeciality <em>Speciality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Speciality</em>'.
	 * @see MallDsm.SpecialisticShop#getSpeciality()
	 * @see #getSpecialisticShop()
	 * @generated
	 */
	EReference getSpecialisticShop_Speciality();

	/**
	 * Returns the meta object for class '{@link MallDsm.Brand <em>Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Brand</em>'.
	 * @see MallDsm.Brand
	 * @generated
	 */
	EClass getBrand();

	/**
	 * Returns the meta object for the containment reference list '{@link MallDsm.Brand#getProducedGoods <em>Produced Goods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Produced Goods</em>'.
	 * @see MallDsm.Brand#getProducedGoods()
	 * @see #getBrand()
	 * @generated
	 */
	EReference getBrand_ProducedGoods();

	/**
	 * Returns the meta object for the attribute '{@link MallDsm.Brand#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MallDsm.Brand#getName()
	 * @see #getBrand()
	 * @generated
	 */
	EAttribute getBrand_Name();

	/**
	 * Returns the meta object for class '{@link MallDsm.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see MallDsm.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link MallDsm.Container#getContainedGood <em>Contained Good</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Good</em>'.
	 * @see MallDsm.Container#getContainedGood()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_ContainedGood();

	/**
	 * Returns the meta object for class '{@link MallDsm.Good <em>Good</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Good</em>'.
	 * @see MallDsm.Good
	 * @generated
	 */
	EClass getGood();

	/**
	 * Returns the meta object for the containment reference list '{@link MallDsm.Good#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see MallDsm.Good#getFeatures()
	 * @see #getGood()
	 * @generated
	 */
	EReference getGood_Features();

	/**
	 * Returns the meta object for the reference '{@link MallDsm.Good#getHasSubCategory <em>Has Sub Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Sub Category</em>'.
	 * @see MallDsm.Good#getHasSubCategory()
	 * @see #getGood()
	 * @generated
	 */
	EReference getGood_HasSubCategory();

	/**
	 * Returns the meta object for the attribute '{@link MallDsm.Good#getModelNumber <em>Model Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Number</em>'.
	 * @see MallDsm.Good#getModelNumber()
	 * @see #getGood()
	 * @generated
	 */
	EAttribute getGood_ModelNumber();

	/**
	 * Returns the meta object for class '{@link MallDsm.ItemInStock <em>Item In Stock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item In Stock</em>'.
	 * @see MallDsm.ItemInStock
	 * @generated
	 */
	EClass getItemInStock();

	/**
	 * Returns the meta object for the reference '{@link MallDsm.ItemInStock#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contains</em>'.
	 * @see MallDsm.ItemInStock#getContains()
	 * @see #getItemInStock()
	 * @generated
	 */
	EReference getItemInStock_Contains();

	/**
	 * Returns the meta object for the attribute list '{@link MallDsm.ItemInStock#getItemCount <em>Item Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Item Count</em>'.
	 * @see MallDsm.ItemInStock#getItemCount()
	 * @see #getItemInStock()
	 * @generated
	 */
	EAttribute getItemInStock_ItemCount();

	/**
	 * Returns the meta object for class '{@link MallDsm.ListedGood <em>Listed Good</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Listed Good</em>'.
	 * @see MallDsm.ListedGood
	 * @generated
	 */
	EClass getListedGood();

	/**
	 * Returns the meta object for the reference '{@link MallDsm.ListedGood#getGood <em>Good</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Good</em>'.
	 * @see MallDsm.ListedGood#getGood()
	 * @see #getListedGood()
	 * @generated
	 */
	EReference getListedGood_Good();

	/**
	 * Returns the meta object for the containment reference list '{@link MallDsm.ListedGood#getSales <em>Sales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sales</em>'.
	 * @see MallDsm.ListedGood#getSales()
	 * @see #getListedGood()
	 * @generated
	 */
	EReference getListedGood_Sales();

	/**
	 * Returns the meta object for the attribute list '{@link MallDsm.ListedGood#getDefaultPrice <em>Default Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Default Price</em>'.
	 * @see MallDsm.ListedGood#getDefaultPrice()
	 * @see #getListedGood()
	 * @generated
	 */
	EAttribute getListedGood_DefaultPrice();

	/**
	 * Returns the meta object for class '{@link MallDsm.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see MallDsm.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link MallDsm.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MallDsm.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for the attribute '{@link MallDsm.Feature#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see MallDsm.Feature#getValue()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Value();

	/**
	 * Returns the meta object for class '{@link MallDsm.SubCatecory <em>Sub Catecory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Catecory</em>'.
	 * @see MallDsm.SubCatecory
	 * @generated
	 */
	EClass getSubCatecory();

	/**
	 * Returns the meta object for the attribute '{@link MallDsm.SubCatecory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MallDsm.SubCatecory#getName()
	 * @see #getSubCatecory()
	 * @generated
	 */
	EAttribute getSubCatecory_Name();

	/**
	 * Returns the meta object for class '{@link MallDsm.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see MallDsm.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the containment reference list '{@link MallDsm.Category#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see MallDsm.Category#getContains()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Contains();

	/**
	 * Returns the meta object for the attribute '{@link MallDsm.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MallDsm.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for class '{@link MallDsm.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see MallDsm.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the containment reference '{@link MallDsm.Employee#getShiftSchedule <em>Shift Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shift Schedule</em>'.
	 * @see MallDsm.Employee#getShiftSchedule()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_ShiftSchedule();

	/**
	 * Returns the meta object for the attribute '{@link MallDsm.Employee#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MallDsm.Employee#getName()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Name();

	/**
	 * Returns the meta object for class '{@link MallDsm.TimeSpan <em>Time Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Span</em>'.
	 * @see MallDsm.TimeSpan
	 * @generated
	 */
	EClass getTimeSpan();

	/**
	 * Returns the meta object for the attribute list '{@link MallDsm.TimeSpan#getStartHour <em>Start Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Start Hour</em>'.
	 * @see MallDsm.TimeSpan#getStartHour()
	 * @see #getTimeSpan()
	 * @generated
	 */
	EAttribute getTimeSpan_StartHour();

	/**
	 * Returns the meta object for the attribute list '{@link MallDsm.TimeSpan#getStartDay <em>Start Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Start Day</em>'.
	 * @see MallDsm.TimeSpan#getStartDay()
	 * @see #getTimeSpan()
	 * @generated
	 */
	EAttribute getTimeSpan_StartDay();

	/**
	 * Returns the meta object for the attribute list '{@link MallDsm.TimeSpan#getEndDay <em>End Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>End Day</em>'.
	 * @see MallDsm.TimeSpan#getEndDay()
	 * @see #getTimeSpan()
	 * @generated
	 */
	EAttribute getTimeSpan_EndDay();

	/**
	 * Returns the meta object for the attribute list '{@link MallDsm.TimeSpan#getEndHour <em>End Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>End Hour</em>'.
	 * @see MallDsm.TimeSpan#getEndHour()
	 * @see #getTimeSpan()
	 * @generated
	 */
	EAttribute getTimeSpan_EndHour();

	/**
	 * Returns the meta object for class '{@link MallDsm.WeeklySchedule <em>Weekly Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weekly Schedule</em>'.
	 * @see MallDsm.WeeklySchedule
	 * @generated
	 */
	EClass getWeeklySchedule();

	/**
	 * Returns the meta object for the containment reference list '{@link MallDsm.WeeklySchedule#getShift <em>Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shift</em>'.
	 * @see MallDsm.WeeklySchedule#getShift()
	 * @see #getWeeklySchedule()
	 * @generated
	 */
	EReference getWeeklySchedule_Shift();

	/**
	 * Returns the meta object for class '{@link MallDsm.Discount <em>Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discount</em>'.
	 * @see MallDsm.Discount
	 * @generated
	 */
	EClass getDiscount();

	/**
	 * Returns the meta object for the attribute list '{@link MallDsm.Discount#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Percentage</em>'.
	 * @see MallDsm.Discount#getPercentage()
	 * @see #getDiscount()
	 * @generated
	 */
	EAttribute getDiscount_Percentage();

	/**
	 * Returns the meta object for the attribute '{@link MallDsm.Discount#getTimeStart <em>Time Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Start</em>'.
	 * @see MallDsm.Discount#getTimeStart()
	 * @see #getDiscount()
	 * @generated
	 */
	EAttribute getDiscount_TimeStart();

	/**
	 * Returns the meta object for the attribute '{@link MallDsm.Discount#getTimeEnd <em>Time End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time End</em>'.
	 * @see MallDsm.Discount#getTimeEnd()
	 * @see #getDiscount()
	 * @generated
	 */
	EAttribute getDiscount_TimeEnd();

	/**
	 * Returns the meta object for class '{@link MallDsm.Shelf <em>Shelf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shelf</em>'.
	 * @see MallDsm.Shelf
	 * @generated
	 */
	EClass getShelf();

	/**
	 * Returns the meta object for the attribute list '{@link MallDsm.Shelf#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Layers</em>'.
	 * @see MallDsm.Shelf#getLayers()
	 * @see #getShelf()
	 * @generated
	 */
	EAttribute getShelf_Layers();

	/**
	 * Returns the meta object for class '{@link MallDsm.Refrigerator <em>Refrigerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refrigerator</em>'.
	 * @see MallDsm.Refrigerator
	 * @generated
	 */
	EClass getRefrigerator();

	/**
	 * Returns the meta object for class '{@link MallDsm.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see MallDsm.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for class '{@link MallDsm.Mall <em>Mall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mall</em>'.
	 * @see MallDsm.Mall
	 * @generated
	 */
	EClass getMall();

	/**
	 * Returns the meta object for the containment reference list '{@link MallDsm.Mall#getShops <em>Shops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shops</em>'.
	 * @see MallDsm.Mall#getShops()
	 * @see #getMall()
	 * @generated
	 */
	EReference getMall_Shops();

	/**
	 * Returns the meta object for the containment reference list '{@link MallDsm.Mall#getAviableBrands <em>Aviable Brands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aviable Brands</em>'.
	 * @see MallDsm.Mall#getAviableBrands()
	 * @see #getMall()
	 * @generated
	 */
	EReference getMall_AviableBrands();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MallDsmFactory getMallDsmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link MallDsm.impl.ShopImpl <em>Shop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MallDsm.impl.ShopImpl
		 * @see MallDsm.impl.MallDsmPackageImpl#getShop()
		 * @generated
		 */
		EClass SHOP = eINSTANCE.getShop();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOP__HAS = eINSTANCE.getShop_Has();

		/**
		 * The meta object literal for the '<em><b>Sold Goods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOP__SOLD_GOODS = eINSTANCE.getShop_SoldGoods();

		/**
		 * The meta object literal for the '<em><b>Employees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOP__EMPLOYEES = eINSTANCE.getShop_Employees();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOP__MANAGER = eINSTANCE.getShop_Manager();

		/**
		 * The meta object literal for the '<em><b>Open Schedule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOP__OPEN_SCHEDULE = eINSTANCE.getShop_OpenSchedule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOP__NAME = eINSTANCE.getShop_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOP__ADDRESS = eINSTANCE.getShop_Address();

		/**
		 * The meta object literal for the '<em><b>Photos Paths</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOP__PHOTOS_PATHS = eINSTANCE.getShop_PhotosPaths();

		/**
		 * The meta object literal for the '<em><b>Map Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOP__MAP_PATH = eINSTANCE.getShop_MapPath();

		/**
		 * The meta object literal for the '{@link MallDsm.impl.BrandShopImpl <em>Brand Shop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MallDsm.impl.BrandShopImpl
		 * @see MallDsm.impl.MallDsmPackageImpl#getBrandShop()
		 * @generated
		 */
		EClass BRAND_SHOP = eINSTANCE.getBrandShop();

		/**
		 * The meta object literal for the '<em><b>Brand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRAND_SHOP__BRAND = eINSTANCE.getBrandShop_Brand();

		/**
		 * The meta object literal for the '{@link MallDsm.impl.SpecialisticShopImpl <em>Specialistic Shop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MallDsm.impl.SpecialisticShopImpl
		 * @see MallDsm.impl.MallDsmPackageImpl#getSpecialisticShop()
		 * @generated
		 */
		EClass SPECIALISTIC_SHOP = eINSTANCE.getSpecialisticShop();

		/**
		 * The meta object literal for the '<em><b>Speciality</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALISTIC_SHOP__SPECIALITY = eINSTANCE.getSpecialisticShop_Speciality();

		/**
		 * The meta object literal for the '{@link MallDsm.impl.BrandImpl <em>Brand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MallDsm.impl.BrandImpl
		 * @see MallDsm.impl.MallDsmPackageImpl#getBrand()
		 * @generated
		 */
		EClass BRAND = eINSTANCE.getBrand();

		/**
		 * The meta object literal for the '<em><b>Produced Goods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRAND__PRODUCED_GOODS = eINSTANCE.getBrand_ProducedGoods();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRAND__NAME = eINSTANCE.getBrand_Name();

		/**
		 * The meta object literal for the '{@link MallDsm.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MallDsm.impl.ContainerImpl
		 * @see MallDsm.impl.MallDsmPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Contained Good</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__CONTAINED_GOOD = eINSTANCE.getContainer_ContainedGood();

		/**
		 * The meta object literal for the '{@link MallDsm.impl.GoodImpl <em>Good</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MallDsm.impl.GoodImpl
		 * @see MallDsm.impl.MallDsmPackageImpl#getGood()
		 * @generated
		 */
		EClass GOOD = eINSTANCE.getGood();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOOD__FEATURES = eINSTANCE.getGood_Features();

		/**
		 * The meta object literal for the '<em><b>Has Sub Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOOD__HAS_SUB_CATEGORY = eINSTANCE.getGood_HasSubCategory();

		/**
		 * The meta object literal for the '<em><b>Model Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOOD__MODEL_NUMBER = eINSTANCE.getGood_ModelNumber();

		/**
		 * The meta object literal for the '{@link MallDsm.impl.ItemInStockImpl <em>Item In Stock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MallDsm.impl.ItemInStockImpl
		 * @see MallDsm.impl.MallDsmPackageImpl#getItemInStock()
		 * @generated
		 */
		EClass ITEM_IN_STOCK = eINSTANCE.getItemInStock();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_IN_STOCK__CONTAINS = eINSTANCE.getItemInStock_Contains();

		/**
		 * The meta object literal for the '<em><b>Item Count</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_IN_STOCK__ITEM_COUNT = eINSTANCE.getItemInStock_ItemCount();

		/**
		 * The meta object literal for the '{@link MallDsm.impl.ListedGoodImpl <em>Listed Good</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MallDsm.impl.ListedGoodImpl
		 * @see MallDsm.impl.MallDsmPackageImpl#getListedGood()
		 * @generated
		 */
		EClass LISTED_GOOD = eINSTANCE.getListedGood();

		/**
		 * The meta object literal for the '<em><b>Good</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTED_GOOD__GOOD = eINSTANCE.getListedGood_Good();

		/**
		 * The meta object literal for the '<em><b>Sales</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTED_GOOD__SALES = eINSTANCE.getListedGood_Sales();

		/**
		 * The meta object literal for the '<em><b>Default Price</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTED_GOOD__DEFAULT_PRICE = eINSTANCE.getListedGood_DefaultPrice();

		/**
		 * The meta object literal for the '{@link MallDsm.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MallDsm.impl.FeatureImpl
		 * @see MallDsm.impl.MallDsmPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__VALUE = eINSTANCE.getFeature_Value();

		/**
		 * The meta object literal for the '{@link MallDsm.impl.SubCatecoryImpl <em>Sub Catecory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MallDsm.impl.SubCatecoryImpl
		 * @see MallDsm.impl.MallDsmPackageImpl#getSubCatecory()
		 * @generated
		 */
		EClass SUB_CATECORY = eINSTANCE.getSubCatecory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_CATECORY__NAME = eINSTANCE.getSubCatecory_Name();

		/**
		 * The meta object literal for the '{@link MallDsm.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MallDsm.impl.CategoryImpl
		 * @see MallDsm.impl.MallDsmPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__CONTAINS = eINSTANCE.getCategory_Contains();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '{@link MallDsm.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MallDsm.impl.EmployeeImpl
		 * @see MallDsm.impl.MallDsmPackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Shift Schedule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__SHIFT_SCHEDULE = eINSTANCE.getEmployee_ShiftSchedule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__NAME = eINSTANCE.getEmployee_Name();

		/**
		 * The meta object literal for the '{@link MallDsm.impl.TimeSpanImpl <em>Time Span</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MallDsm.impl.TimeSpanImpl
		 * @see MallDsm.impl.MallDsmPackageImpl#getTimeSpan()
		 * @generated
		 */
		EClass TIME_SPAN = eINSTANCE.getTimeSpan();

		/**
		 * The meta object literal for the '<em><b>Start Hour</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SPAN__START_HOUR = eINSTANCE.getTimeSpan_StartHour();

		/**
		 * The meta object literal for the '<em><b>Start Day</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SPAN__START_DAY = eINSTANCE.getTimeSpan_StartDay();

		/**
		 * The meta object literal for the '<em><b>End Day</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SPAN__END_DAY = eINSTANCE.getTimeSpan_EndDay();

		/**
		 * The meta object literal for the '<em><b>End Hour</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SPAN__END_HOUR = eINSTANCE.getTimeSpan_EndHour();

		/**
		 * The meta object literal for the '{@link MallDsm.impl.WeeklyScheduleImpl <em>Weekly Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MallDsm.impl.WeeklyScheduleImpl
		 * @see MallDsm.impl.MallDsmPackageImpl#getWeeklySchedule()
		 * @generated
		 */
		EClass WEEKLY_SCHEDULE = eINSTANCE.getWeeklySchedule();

		/**
		 * The meta object literal for the '<em><b>Shift</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEEKLY_SCHEDULE__SHIFT = eINSTANCE.getWeeklySchedule_Shift();

		/**
		 * The meta object literal for the '{@link MallDsm.impl.DiscountImpl <em>Discount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MallDsm.impl.DiscountImpl
		 * @see MallDsm.impl.MallDsmPackageImpl#getDiscount()
		 * @generated
		 */
		EClass DISCOUNT = eINSTANCE.getDiscount();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT__PERCENTAGE = eINSTANCE.getDiscount_Percentage();

		/**
		 * The meta object literal for the '<em><b>Time Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT__TIME_START = eINSTANCE.getDiscount_TimeStart();

		/**
		 * The meta object literal for the '<em><b>Time End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT__TIME_END = eINSTANCE.getDiscount_TimeEnd();

		/**
		 * The meta object literal for the '{@link MallDsm.impl.ShelfImpl <em>Shelf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MallDsm.impl.ShelfImpl
		 * @see MallDsm.impl.MallDsmPackageImpl#getShelf()
		 * @generated
		 */
		EClass SHELF = eINSTANCE.getShelf();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHELF__LAYERS = eINSTANCE.getShelf_Layers();

		/**
		 * The meta object literal for the '{@link MallDsm.impl.RefrigeratorImpl <em>Refrigerator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MallDsm.impl.RefrigeratorImpl
		 * @see MallDsm.impl.MallDsmPackageImpl#getRefrigerator()
		 * @generated
		 */
		EClass REFRIGERATOR = eINSTANCE.getRefrigerator();

		/**
		 * The meta object literal for the '{@link MallDsm.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MallDsm.impl.TableImpl
		 * @see MallDsm.impl.MallDsmPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '{@link MallDsm.impl.MallImpl <em>Mall</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MallDsm.impl.MallImpl
		 * @see MallDsm.impl.MallDsmPackageImpl#getMall()
		 * @generated
		 */
		EClass MALL = eINSTANCE.getMall();

		/**
		 * The meta object literal for the '<em><b>Shops</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MALL__SHOPS = eINSTANCE.getMall_Shops();

		/**
		 * The meta object literal for the '<em><b>Aviable Brands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MALL__AVIABLE_BRANDS = eINSTANCE.getMall_AviableBrands();

	}

} //MallDsmPackage
