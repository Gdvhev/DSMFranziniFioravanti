/**
 */
package MallDsm.impl;

import MallDsm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MallDsmFactoryImpl extends EFactoryImpl implements MallDsmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MallDsmFactory init() {
		try {
			MallDsmFactory theMallDsmFactory = (MallDsmFactory)EPackage.Registry.INSTANCE.getEFactory(MallDsmPackage.eNS_URI);
			if (theMallDsmFactory != null) {
				return theMallDsmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MallDsmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MallDsmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MallDsmPackage.BRAND_SHOP: return createBrandShop();
			case MallDsmPackage.SPECIALISTIC_SHOP: return createSpecialisticShop();
			case MallDsmPackage.BRAND: return createBrand();
			case MallDsmPackage.GOOD: return createGood();
			case MallDsmPackage.ITEM_IN_STOCK: return createItemInStock();
			case MallDsmPackage.LISTED_GOOD: return createListedGood();
			case MallDsmPackage.FEATURE: return createFeature();
			case MallDsmPackage.SUB_CATEGORY: return createSubCategory();
			case MallDsmPackage.CATEGORY: return createCategory();
			case MallDsmPackage.EMPLOYEE: return createEmployee();
			case MallDsmPackage.TIME_SPAN: return createTimeSpan();
			case MallDsmPackage.WEEKLY_SCHEDULE: return createWeeklySchedule();
			case MallDsmPackage.DISCOUNT: return createDiscount();
			case MallDsmPackage.SHELF: return createShelf();
			case MallDsmPackage.REFRIGERATOR: return createRefrigerator();
			case MallDsmPackage.TABLE: return createTable();
			case MallDsmPackage.MALL: return createMall();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrandShop createBrandShop() {
		BrandShopImpl brandShop = new BrandShopImpl();
		return brandShop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialisticShop createSpecialisticShop() {
		SpecialisticShopImpl specialisticShop = new SpecialisticShopImpl();
		return specialisticShop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Brand createBrand() {
		BrandImpl brand = new BrandImpl();
		return brand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Good createGood() {
		GoodImpl good = new GoodImpl();
		return good;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemInStock createItemInStock() {
		ItemInStockImpl itemInStock = new ItemInStockImpl();
		return itemInStock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListedGood createListedGood() {
		ListedGoodImpl listedGood = new ListedGoodImpl();
		return listedGood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubCategory createSubCategory() {
		SubCategoryImpl subCategory = new SubCategoryImpl();
		return subCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee createEmployee() {
		EmployeeImpl employee = new EmployeeImpl();
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSpan createTimeSpan() {
		TimeSpanImpl timeSpan = new TimeSpanImpl();
		return timeSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeeklySchedule createWeeklySchedule() {
		WeeklyScheduleImpl weeklySchedule = new WeeklyScheduleImpl();
		return weeklySchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discount createDiscount() {
		DiscountImpl discount = new DiscountImpl();
		return discount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shelf createShelf() {
		ShelfImpl shelf = new ShelfImpl();
		return shelf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Refrigerator createRefrigerator() {
		RefrigeratorImpl refrigerator = new RefrigeratorImpl();
		return refrigerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mall createMall() {
		MallImpl mall = new MallImpl();
		return mall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MallDsmPackage getMallDsmPackage() {
		return (MallDsmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MallDsmPackage getPackage() {
		return MallDsmPackage.eINSTANCE;
	}

} //MallDsmFactoryImpl
