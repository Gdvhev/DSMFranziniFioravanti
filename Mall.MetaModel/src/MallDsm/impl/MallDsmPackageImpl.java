/**
 */
package MallDsm.impl;

import MallDsm.Brand;
import MallDsm.BrandShop;
import MallDsm.Category;
import MallDsm.Discount;
import MallDsm.Employee;
import MallDsm.Feature;
import MallDsm.Good;
import MallDsm.ItemInStock;
import MallDsm.ListedGood;
import MallDsm.Mall;
import MallDsm.MallDsmFactory;
import MallDsm.MallDsmPackage;
import MallDsm.Refrigerator;
import MallDsm.Shelf;
import MallDsm.Shop;
import MallDsm.SpecialisticShop;
import MallDsm.SubCategory;
import MallDsm.Table;
import MallDsm.TimeSpan;
import MallDsm.WeeklySchedule;

import MallDsm.util.MallDsmValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MallDsmPackageImpl extends EPackageImpl implements MallDsmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass brandShopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specialisticShopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass brandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemInStockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listedGoodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeSpanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weeklyScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shelfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refrigeratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mallEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see MallDsm.MallDsmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MallDsmPackageImpl() {
		super(eNS_URI, MallDsmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MallDsmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MallDsmPackage init() {
		if (isInited) return (MallDsmPackage)EPackage.Registry.INSTANCE.getEPackage(MallDsmPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMallDsmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MallDsmPackageImpl theMallDsmPackage = registeredMallDsmPackage instanceof MallDsmPackageImpl ? (MallDsmPackageImpl)registeredMallDsmPackage : new MallDsmPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMallDsmPackage.createPackageContents();

		// Initialize created meta-data
		theMallDsmPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theMallDsmPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return MallDsmValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theMallDsmPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MallDsmPackage.eNS_URI, theMallDsmPackage);
		return theMallDsmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShop() {
		return shopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShop_Has() {
		return (EReference)shopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShop_SoldGoods() {
		return (EReference)shopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShop_Employees() {
		return (EReference)shopEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShop_Manager() {
		return (EReference)shopEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShop_OpenSchedule() {
		return (EReference)shopEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShop_Name() {
		return (EAttribute)shopEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShop_Address() {
		return (EAttribute)shopEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShop_PhotosPaths() {
		return (EAttribute)shopEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShop_MapPath() {
		return (EAttribute)shopEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrandShop() {
		return brandShopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrandShop_Brand() {
		return (EReference)brandShopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecialisticShop() {
		return specialisticShopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecialisticShop_Speciality() {
		return (EReference)specialisticShopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrand() {
		return brandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrand_ProducedGoods() {
		return (EReference)brandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrand_Name() {
		return (EAttribute)brandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_ContainedGood() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGood() {
		return goodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGood_Features() {
		return (EReference)goodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGood_HasSubCategory() {
		return (EReference)goodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGood_ModelNumber() {
		return (EAttribute)goodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemInStock() {
		return itemInStockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemInStock_Contains() {
		return (EReference)itemInStockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemInStock_ItemCount() {
		return (EAttribute)itemInStockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListedGood() {
		return listedGoodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListedGood_Good() {
		return (EReference)listedGoodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListedGood_Sales() {
		return (EReference)listedGoodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListedGood_DefaultPrice() {
		return (EAttribute)listedGoodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Name() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Value() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubCategory() {
		return subCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubCategory_Name() {
		return (EAttribute)subCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategory() {
		return categoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategory_Contains() {
		return (EReference)categoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategory_Name() {
		return (EAttribute)categoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmployee() {
		return employeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmployee_ShiftSchedule() {
		return (EReference)employeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_Name() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeSpan() {
		return timeSpanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeSpan_StartHour() {
		return (EAttribute)timeSpanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeSpan_StartDay() {
		return (EAttribute)timeSpanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeSpan_EndDay() {
		return (EAttribute)timeSpanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeSpan_EndHour() {
		return (EAttribute)timeSpanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeeklySchedule() {
		return weeklyScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWeeklySchedule_Shifts() {
		return (EReference)weeklyScheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscount() {
		return discountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscount_Percentage() {
		return (EAttribute)discountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscount_TimeStart() {
		return (EAttribute)discountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscount_TimeEnd() {
		return (EAttribute)discountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShelf() {
		return shelfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShelf_Layers() {
		return (EAttribute)shelfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefrigerator() {
		return refrigeratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMall() {
		return mallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMall_Shops() {
		return (EReference)mallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMall_AvailableBrands() {
		return (EReference)mallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMall_Categories() {
		return (EReference)mallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MallDsmFactory getMallDsmFactory() {
		return (MallDsmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		shopEClass = createEClass(SHOP);
		createEReference(shopEClass, SHOP__HAS);
		createEReference(shopEClass, SHOP__SOLD_GOODS);
		createEReference(shopEClass, SHOP__EMPLOYEES);
		createEReference(shopEClass, SHOP__MANAGER);
		createEReference(shopEClass, SHOP__OPEN_SCHEDULE);
		createEAttribute(shopEClass, SHOP__NAME);
		createEAttribute(shopEClass, SHOP__ADDRESS);
		createEAttribute(shopEClass, SHOP__PHOTOS_PATHS);
		createEAttribute(shopEClass, SHOP__MAP_PATH);

		brandShopEClass = createEClass(BRAND_SHOP);
		createEReference(brandShopEClass, BRAND_SHOP__BRAND);

		specialisticShopEClass = createEClass(SPECIALISTIC_SHOP);
		createEReference(specialisticShopEClass, SPECIALISTIC_SHOP__SPECIALITY);

		brandEClass = createEClass(BRAND);
		createEReference(brandEClass, BRAND__PRODUCED_GOODS);
		createEAttribute(brandEClass, BRAND__NAME);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__CONTAINED_GOOD);

		goodEClass = createEClass(GOOD);
		createEReference(goodEClass, GOOD__FEATURES);
		createEReference(goodEClass, GOOD__HAS_SUB_CATEGORY);
		createEAttribute(goodEClass, GOOD__MODEL_NUMBER);

		itemInStockEClass = createEClass(ITEM_IN_STOCK);
		createEReference(itemInStockEClass, ITEM_IN_STOCK__CONTAINS);
		createEAttribute(itemInStockEClass, ITEM_IN_STOCK__ITEM_COUNT);

		listedGoodEClass = createEClass(LISTED_GOOD);
		createEReference(listedGoodEClass, LISTED_GOOD__GOOD);
		createEReference(listedGoodEClass, LISTED_GOOD__SALES);
		createEAttribute(listedGoodEClass, LISTED_GOOD__DEFAULT_PRICE);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__NAME);
		createEAttribute(featureEClass, FEATURE__VALUE);

		subCategoryEClass = createEClass(SUB_CATEGORY);
		createEAttribute(subCategoryEClass, SUB_CATEGORY__NAME);

		categoryEClass = createEClass(CATEGORY);
		createEReference(categoryEClass, CATEGORY__CONTAINS);
		createEAttribute(categoryEClass, CATEGORY__NAME);

		employeeEClass = createEClass(EMPLOYEE);
		createEReference(employeeEClass, EMPLOYEE__SHIFT_SCHEDULE);
		createEAttribute(employeeEClass, EMPLOYEE__NAME);

		timeSpanEClass = createEClass(TIME_SPAN);
		createEAttribute(timeSpanEClass, TIME_SPAN__START_HOUR);
		createEAttribute(timeSpanEClass, TIME_SPAN__START_DAY);
		createEAttribute(timeSpanEClass, TIME_SPAN__END_DAY);
		createEAttribute(timeSpanEClass, TIME_SPAN__END_HOUR);

		weeklyScheduleEClass = createEClass(WEEKLY_SCHEDULE);
		createEReference(weeklyScheduleEClass, WEEKLY_SCHEDULE__SHIFTS);

		discountEClass = createEClass(DISCOUNT);
		createEAttribute(discountEClass, DISCOUNT__PERCENTAGE);
		createEAttribute(discountEClass, DISCOUNT__TIME_START);
		createEAttribute(discountEClass, DISCOUNT__TIME_END);

		shelfEClass = createEClass(SHELF);
		createEAttribute(shelfEClass, SHELF__LAYERS);

		refrigeratorEClass = createEClass(REFRIGERATOR);

		tableEClass = createEClass(TABLE);

		mallEClass = createEClass(MALL);
		createEReference(mallEClass, MALL__SHOPS);
		createEReference(mallEClass, MALL__AVAILABLE_BRANDS);
		createEReference(mallEClass, MALL__CATEGORIES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		brandShopEClass.getESuperTypes().add(this.getShop());
		specialisticShopEClass.getESuperTypes().add(this.getShop());
		shelfEClass.getESuperTypes().add(this.getContainer());
		refrigeratorEClass.getESuperTypes().add(this.getContainer());
		tableEClass.getESuperTypes().add(this.getContainer());

		// Initialize classes and features; add operations and parameters
		initEClass(shopEClass, Shop.class, "Shop", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShop_Has(), this.getContainer(), null, "has", null, 0, -1, Shop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShop_SoldGoods(), this.getListedGood(), null, "soldGoods", null, 0, -1, Shop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShop_Employees(), this.getEmployee(), null, "employees", null, 0, -1, Shop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShop_Manager(), this.getEmployee(), null, "manager", null, 1, 1, Shop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShop_OpenSchedule(), this.getWeeklySchedule(), null, "openSchedule", null, 1, 1, Shop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShop_Name(), ecorePackage.getEString(), "name", null, 1, 1, Shop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShop_Address(), ecorePackage.getEString(), "address", null, 1, 1, Shop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShop_PhotosPaths(), ecorePackage.getEString(), "photosPaths", null, 0, 1, Shop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShop_MapPath(), ecorePackage.getEString(), "mapPath", null, 0, 1, Shop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(brandShopEClass, BrandShop.class, "BrandShop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBrandShop_Brand(), this.getBrand(), null, "brand", null, 1, 1, BrandShop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specialisticShopEClass, SpecialisticShop.class, "SpecialisticShop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecialisticShop_Speciality(), this.getCategory(), null, "speciality", null, 1, 1, SpecialisticShop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(brandEClass, Brand.class, "Brand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBrand_ProducedGoods(), this.getGood(), null, "producedGoods", null, 0, -1, Brand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBrand_Name(), ecorePackage.getEString(), "name", null, 1, 1, Brand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, MallDsm.Container.class, "Container", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_ContainedGood(), this.getItemInStock(), null, "containedGood", null, 0, -1, MallDsm.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goodEClass, Good.class, "Good", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGood_Features(), this.getFeature(), null, "features", null, 0, -1, Good.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGood_HasSubCategory(), this.getSubCategory(), null, "hasSubCategory", null, 1, 1, Good.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGood_ModelNumber(), ecorePackage.getEString(), "modelNumber", null, 1, 1, Good.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemInStockEClass, ItemInStock.class, "ItemInStock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemInStock_Contains(), this.getGood(), null, "contains", null, 1, 1, ItemInStock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemInStock_ItemCount(), ecorePackage.getEIntegerObject(), "itemCount", null, 1, 1, ItemInStock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listedGoodEClass, ListedGood.class, "ListedGood", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListedGood_Good(), this.getGood(), null, "good", null, 1, 1, ListedGood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListedGood_Sales(), this.getDiscount(), null, "sales", null, 0, -1, ListedGood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListedGood_DefaultPrice(), ecorePackage.getEIntegerObject(), "defaultPrice", null, 1, 1, ListedGood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_Name(), ecorePackage.getEString(), "name", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Value(), ecorePackage.getEString(), "value", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subCategoryEClass, SubCategory.class, "SubCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubCategory_Name(), ecorePackage.getEString(), "name", null, 1, 1, SubCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategory_Contains(), this.getSubCategory(), null, "contains", null, 0, -1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCategory_Name(), ecorePackage.getEString(), "name", null, 1, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(employeeEClass, Employee.class, "Employee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmployee_ShiftSchedule(), this.getWeeklySchedule(), null, "shiftSchedule", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployee_Name(), ecorePackage.getEString(), "name", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeSpanEClass, TimeSpan.class, "TimeSpan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeSpan_StartHour(), ecorePackage.getEIntegerObject(), "startHour", null, 1, 1, TimeSpan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeSpan_StartDay(), ecorePackage.getEIntegerObject(), "startDay", null, 1, 1, TimeSpan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeSpan_EndDay(), ecorePackage.getEIntegerObject(), "endDay", null, 1, 1, TimeSpan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeSpan_EndHour(), ecorePackage.getEIntegerObject(), "endHour", null, 1, 1, TimeSpan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weeklyScheduleEClass, WeeklySchedule.class, "WeeklySchedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWeeklySchedule_Shifts(), this.getTimeSpan(), null, "shifts", null, 0, -1, WeeklySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discountEClass, Discount.class, "Discount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscount_Percentage(), ecorePackage.getEIntegerObject(), "percentage", null, 1, 1, Discount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscount_TimeStart(), ecorePackage.getEDate(), "timeStart", null, 1, 1, Discount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscount_TimeEnd(), ecorePackage.getEDate(), "timeEnd", null, 1, 1, Discount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shelfEClass, Shelf.class, "Shelf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShelf_Layers(), ecorePackage.getEIntegerObject(), "layers", null, 1, 1, Shelf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refrigeratorEClass, Refrigerator.class, "Refrigerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mallEClass, Mall.class, "Mall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMall_Shops(), this.getShop(), null, "shops", null, 0, -1, Mall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMall_AvailableBrands(), this.getBrand(), null, "availableBrands", null, 0, -1, Mall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMall_Categories(), this.getCategory(), null, "categories", null, 0, -1, Mall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore#/"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
		addAnnotation
		  (shopEClass,
		   source,
		   new String[] {
			   "constraints", "noStockWithoutPrice noDoubleListing"
		   });
		addAnnotation
		  (brandShopEClass,
		   source,
		   new String[] {
			   "constraints", "brandConstraint"
		   });
		addAnnotation
		  (specialisticShopEClass,
		   source,
		   new String[] {
			   "constraints", "categoryConstraint"
		   });
		addAnnotation
		  (listedGoodEClass,
		   source,
		   new String[] {
			   "constraints", "posPrice"
		   });
		addAnnotation
		  (timeSpanEClass,
		   source,
		   new String[] {
			   "constraints", "validInterval"
		   });
		addAnnotation
		  (weeklyScheduleEClass,
		   source,
		   new String[] {
			   "constraints", "noOverlappingShifts"
		   });
		addAnnotation
		  (discountEClass,
		   source,
		   new String[] {
			   "constraints", "validPerc validDateInterval"
		   });
		addAnnotation
		  (shelfEClass,
		   source,
		   new String[] {
			   "constraints", "posLayers"
		   });
		addAnnotation
		  (mallEClass,
		   source,
		   new String[] {
			   "constraints", "uniqueShopName uniqueMnumber uniqueCatName uniqueSubCatName uniqueBrandName uniqueGoodBrand"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (shopEClass,
		   source,
		   new String[] {
			   "noStockWithoutPrice", "self.has->forAll(cont|cont.containedGood->forAll(g|self.soldGoods.good->includes(g.contains)))",
			   "noDoubleListing", "self.soldGoods->forAll(l1,l2|l1<>l2 implies l1.good<>l2.good)"
		   });
		addAnnotation
		  (brandShopEClass,
		   source,
		   new String[] {
			   "brandConstraint", "self.soldGoods.good->forAll(g|self.brand.producedGoods->includes(g))"
		   });
		addAnnotation
		  (specialisticShopEClass,
		   source,
		   new String[] {
			   "categoryConstraint", "self.soldGoods.good->forAll(g|self.speciality.contains->includes(g.hasSubCategory))"
		   });
		addAnnotation
		  (listedGoodEClass,
		   source,
		   new String[] {
			   "posPrice", "self.defaultPrice>0"
		   });
		addAnnotation
		  (timeSpanEClass,
		   source,
		   new String[] {
			   "validInterval", "if(self.endDay=self.startDay) \n\t\t\tthen\n\t\t\t\tself.startHour<=self.endHour\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif and\n\t\t\tself.startHour>=0 and self.startHour<=23 and\n\t\t\tself.startDay>=0 and self.startDay<=6 and\n\t\t\tself.endHour>=0 and self.endHour<=23 and\n\t\t\tself.endDay>=0 and self.endDay<=6"
		   });
		addAnnotation
		  (weeklyScheduleEClass,
		   source,
		   new String[] {
			   "noOverlappingShifts", "self.shifts->forAll(s1,s2|s1<>s2 implies \n\t\t\tlet startAbs1: Integer =(s1.startDay*24+s1.startHour) in\n\t\t\tlet endAbs1: Integer =(s1.endDay*24+s1.endHour) in\n\t\t\tlet startAbs2: Integer =(s2.startDay*24+s2.startHour) in\n\t\t\tlet endAbs2: Integer =(s2.endDay*24+s2.endHour) in\n\t\t\tif(startAbs1>startAbs2)then\n\t\t\t\tstartAbs1>endAbs2 and (endAbs1<startAbs1 implies endAbs1<startAbs2)\n\t\t\telse--Opposite case taken care by the double iterator\n\t\t\t\tstartAbs1<>startAbs2\n\t\t\t\t\n\t\t\tendif\n\t\t)"
		   });
		addAnnotation
		  (discountEClass,
		   source,
		   new String[] {
			   "validPerc", "self.percentage <=100 and self.percentage >=0",
			   "validDateInterval", "self.timeEnd.compareTo(self.timeStart)>0"
		   });
		addAnnotation
		  (shelfEClass,
		   source,
		   new String[] {
			   "posLayers", "self.layers>0"
		   });
		addAnnotation
		  (mallEClass,
		   source,
		   new String[] {
			   "uniqueShopName", "self.shops->forAll(s1,s2|s1<>s2 implies s1.name<>s2.name)",
			   "uniqueMnumber", "self.availableBrands.producedGoods->forAll(g1,g2|g1<>g2 implies g1.modelNumber<>g2.modelNumber)",
			   "uniqueCatName", "self.categories->forAll(c1,c2|c1<>c2 implies c1.name <> c2.name)",
			   "uniqueSubCatName", "self.categories.contains->forAll(sc1,sc2|sc1<>sc2 implies sc1.name<>sc2.name)",
			   "uniqueBrandName", "self.availableBrands->forAll(b1,b2|b1<>b2 implies b1.name<>b2.name)",
			   "uniqueGoodBrand", "self.availableBrands->forAll(b1,b2|b1<>b2 implies b1.producedGoods->intersection(b2.producedGoods)->isEmpty())"
		   });
	}

} //MallDsmPackageImpl
