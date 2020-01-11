/**
 */
package MallDsm.util;

import MallDsm.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see MallDsm.MallDsmPackage
 * @generated
 */
public class MallDsmValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MallDsmValidator INSTANCE = new MallDsmValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "MallDsm";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MallDsmValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return MallDsmPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case MallDsmPackage.SHOP:
				return validateShop((Shop)value, diagnostics, context);
			case MallDsmPackage.BRAND_SHOP:
				return validateBrandShop((BrandShop)value, diagnostics, context);
			case MallDsmPackage.SPECIALISTIC_SHOP:
				return validateSpecialisticShop((SpecialisticShop)value, diagnostics, context);
			case MallDsmPackage.BRAND:
				return validateBrand((Brand)value, diagnostics, context);
			case MallDsmPackage.CONTAINER:
				return validateContainer((Container)value, diagnostics, context);
			case MallDsmPackage.GOOD:
				return validateGood((Good)value, diagnostics, context);
			case MallDsmPackage.ITEM_IN_STOCK:
				return validateItemInStock((ItemInStock)value, diagnostics, context);
			case MallDsmPackage.LISTED_GOOD:
				return validateListedGood((ListedGood)value, diagnostics, context);
			case MallDsmPackage.FEATURE:
				return validateFeature((Feature)value, diagnostics, context);
			case MallDsmPackage.SUB_CATEGORY:
				return validateSubCategory((SubCategory)value, diagnostics, context);
			case MallDsmPackage.CATEGORY:
				return validateCategory((Category)value, diagnostics, context);
			case MallDsmPackage.EMPLOYEE:
				return validateEmployee((Employee)value, diagnostics, context);
			case MallDsmPackage.TIME_SPAN:
				return validateTimeSpan((TimeSpan)value, diagnostics, context);
			case MallDsmPackage.WEEKLY_SCHEDULE:
				return validateWeeklySchedule((WeeklySchedule)value, diagnostics, context);
			case MallDsmPackage.DISCOUNT:
				return validateDiscount((Discount)value, diagnostics, context);
			case MallDsmPackage.SHELF:
				return validateShelf((Shelf)value, diagnostics, context);
			case MallDsmPackage.REFRIGERATOR:
				return validateRefrigerator((Refrigerator)value, diagnostics, context);
			case MallDsmPackage.TABLE:
				return validateTable((Table)value, diagnostics, context);
			case MallDsmPackage.MALL:
				return validateMall((Mall)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShop(Shop shop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(shop, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(shop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(shop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(shop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(shop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(shop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(shop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(shop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(shop, diagnostics, context);
		if (result || diagnostics != null) result &= validateShop_noStockWithoutPrice(shop, diagnostics, context);
		if (result || diagnostics != null) result &= validateShop_noDoubleListing(shop, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noStockWithoutPrice constraint of '<em>Shop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SHOP__NO_STOCK_WITHOUT_PRICE__EEXPRESSION = "self.has->forAll(cont|cont.containedGood->forAll(g|self.soldGoods.good->includes(g.contains)))";

	/**
	 * Validates the noStockWithoutPrice constraint of '<em>Shop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShop_noStockWithoutPrice(Shop shop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MallDsmPackage.Literals.SHOP,
				 shop,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noStockWithoutPrice",
				 SHOP__NO_STOCK_WITHOUT_PRICE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noDoubleListing constraint of '<em>Shop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SHOP__NO_DOUBLE_LISTING__EEXPRESSION = "self.soldGoods->forAll(l1,l2|l1<>l2 implies l1.good<>l2.good)";

	/**
	 * Validates the noDoubleListing constraint of '<em>Shop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShop_noDoubleListing(Shop shop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MallDsmPackage.Literals.SHOP,
				 shop,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noDoubleListing",
				 SHOP__NO_DOUBLE_LISTING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBrandShop(BrandShop brandShop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(brandShop, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(brandShop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(brandShop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(brandShop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(brandShop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(brandShop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(brandShop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(brandShop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(brandShop, diagnostics, context);
		if (result || diagnostics != null) result &= validateShop_noStockWithoutPrice(brandShop, diagnostics, context);
		if (result || diagnostics != null) result &= validateShop_noDoubleListing(brandShop, diagnostics, context);
		if (result || diagnostics != null) result &= validateBrandShop_brandConstraint(brandShop, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the brandConstraint constraint of '<em>Brand Shop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BRAND_SHOP__BRAND_CONSTRAINT__EEXPRESSION = "self.soldGoods.good->forAll(g|self.brand.producedGoods->includes(g))";

	/**
	 * Validates the brandConstraint constraint of '<em>Brand Shop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBrandShop_brandConstraint(BrandShop brandShop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MallDsmPackage.Literals.BRAND_SHOP,
				 brandShop,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "brandConstraint",
				 BRAND_SHOP__BRAND_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialisticShop(SpecialisticShop specialisticShop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(specialisticShop, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(specialisticShop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(specialisticShop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(specialisticShop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(specialisticShop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(specialisticShop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(specialisticShop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(specialisticShop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(specialisticShop, diagnostics, context);
		if (result || diagnostics != null) result &= validateShop_noStockWithoutPrice(specialisticShop, diagnostics, context);
		if (result || diagnostics != null) result &= validateShop_noDoubleListing(specialisticShop, diagnostics, context);
		if (result || diagnostics != null) result &= validateSpecialisticShop_categoryConstraint(specialisticShop, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the categoryConstraint constraint of '<em>Specialistic Shop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SPECIALISTIC_SHOP__CATEGORY_CONSTRAINT__EEXPRESSION = "self.soldGoods.good->forAll(g|self.speciality.contains->includes(g.hasSubCategory))";

	/**
	 * Validates the categoryConstraint constraint of '<em>Specialistic Shop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialisticShop_categoryConstraint(SpecialisticShop specialisticShop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MallDsmPackage.Literals.SPECIALISTIC_SHOP,
				 specialisticShop,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "categoryConstraint",
				 SPECIALISTIC_SHOP__CATEGORY_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBrand(Brand brand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(brand, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainer(Container container, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(container, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGood(Good good, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(good, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(good, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(good, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(good, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(good, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(good, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(good, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(good, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(good, diagnostics, context);
		if (result || diagnostics != null) result &= validateGood_uniqueFeatures(good, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueFeatures constraint of '<em>Good</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GOOD__UNIQUE_FEATURES__EEXPRESSION = "self.features->forAll(f1,f2|f1<>f2 implies f1.name<>f2.name)";

	/**
	 * Validates the uniqueFeatures constraint of '<em>Good</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGood_uniqueFeatures(Good good, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MallDsmPackage.Literals.GOOD,
				 good,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueFeatures",
				 GOOD__UNIQUE_FEATURES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemInStock(ItemInStock itemInStock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemInStock, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListedGood(ListedGood listedGood, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(listedGood, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(listedGood, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(listedGood, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(listedGood, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(listedGood, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(listedGood, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(listedGood, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(listedGood, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(listedGood, diagnostics, context);
		if (result || diagnostics != null) result &= validateListedGood_posPrice(listedGood, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the posPrice constraint of '<em>Listed Good</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LISTED_GOOD__POS_PRICE__EEXPRESSION = "self.defaultPrice>0";

	/**
	 * Validates the posPrice constraint of '<em>Listed Good</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListedGood_posPrice(ListedGood listedGood, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MallDsmPackage.Literals.LISTED_GOOD,
				 listedGood,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "posPrice",
				 LISTED_GOOD__POS_PRICE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature(Feature feature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(feature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubCategory(SubCategory subCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subCategory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategory(Category category, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(category, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmployee(Employee employee, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(employee, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSpan(TimeSpan timeSpan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeSpan, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeSpan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeSpan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeSpan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeSpan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeSpan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeSpan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeSpan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeSpan, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimeSpan_validInterval(timeSpan, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the validInterval constraint of '<em>Time Span</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TIME_SPAN__VALID_INTERVAL__EEXPRESSION = "if(self.endDay=self.startDay) \n" +
		"\t\t\tthen\n" +
		"\t\t\t\tself.startHour<=self.endHour\n" +
		"\t\t\telse\n" +
		"\t\t\t\ttrue\n" +
		"\t\t\tendif and\n" +
		"\t\t\tself.startHour>=0 and self.startHour<=23 and\n" +
		"\t\t\tself.startDay>=0 and self.startDay<=6 and\n" +
		"\t\t\tself.endHour>=0 and self.endHour<=23 and\n" +
		"\t\t\tself.endDay>=0 and self.endDay<=6";

	/**
	 * Validates the validInterval constraint of '<em>Time Span</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSpan_validInterval(TimeSpan timeSpan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MallDsmPackage.Literals.TIME_SPAN,
				 timeSpan,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "validInterval",
				 TIME_SPAN__VALID_INTERVAL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeeklySchedule(WeeklySchedule weeklySchedule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(weeklySchedule, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(weeklySchedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(weeklySchedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(weeklySchedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(weeklySchedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(weeklySchedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(weeklySchedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(weeklySchedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(weeklySchedule, diagnostics, context);
		if (result || diagnostics != null) result &= validateWeeklySchedule_noOverlappingShifts(weeklySchedule, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noOverlappingShifts constraint of '<em>Weekly Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WEEKLY_SCHEDULE__NO_OVERLAPPING_SHIFTS__EEXPRESSION = "self.shifts->forAll(s1,s2|s1<>s2 implies \n" +
		"\t\t\tlet startAbs1: Integer =(s1.startDay*24+s1.startHour) in\n" +
		"\t\t\tlet endAbs1: Integer =(s1.endDay*24+s1.endHour) in\n" +
		"\t\t\tlet startAbs2: Integer =(s2.startDay*24+s2.startHour) in\n" +
		"\t\t\tlet endAbs2: Integer =(s2.endDay*24+s2.endHour) in\n" +
		"\t\t\tif(startAbs1>startAbs2)then\n" +
		"\t\t\t\tstartAbs1>endAbs2 and (endAbs1<startAbs1 implies endAbs1<startAbs2)\n" +
		"\t\t\telse--Opposite case taken care by the double iterator\n" +
		"\t\t\t\tstartAbs1<>startAbs2\n" +
		"\t\t\t\t\n" +
		"\t\t\tendif\n" +
		"\t\t)";

	/**
	 * Validates the noOverlappingShifts constraint of '<em>Weekly Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeeklySchedule_noOverlappingShifts(WeeklySchedule weeklySchedule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MallDsmPackage.Literals.WEEKLY_SCHEDULE,
				 weeklySchedule,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noOverlappingShifts",
				 WEEKLY_SCHEDULE__NO_OVERLAPPING_SHIFTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscount(Discount discount, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(discount, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(discount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(discount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(discount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(discount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(discount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(discount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(discount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(discount, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscount_validPerc(discount, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscount_validDateInterval(discount, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the validPerc constraint of '<em>Discount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISCOUNT__VALID_PERC__EEXPRESSION = "self.percentage <=100 and self.percentage >=0";

	/**
	 * Validates the validPerc constraint of '<em>Discount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscount_validPerc(Discount discount, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MallDsmPackage.Literals.DISCOUNT,
				 discount,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "validPerc",
				 DISCOUNT__VALID_PERC__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the validDateInterval constraint of '<em>Discount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISCOUNT__VALID_DATE_INTERVAL__EEXPRESSION = "self.timeEnd.compareTo(self.timeStart)>0";

	/**
	 * Validates the validDateInterval constraint of '<em>Discount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscount_validDateInterval(Discount discount, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MallDsmPackage.Literals.DISCOUNT,
				 discount,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "validDateInterval",
				 DISCOUNT__VALID_DATE_INTERVAL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShelf(Shelf shelf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(shelf, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(shelf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(shelf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(shelf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(shelf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(shelf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(shelf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(shelf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(shelf, diagnostics, context);
		if (result || diagnostics != null) result &= validateShelf_posLayers(shelf, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the posLayers constraint of '<em>Shelf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SHELF__POS_LAYERS__EEXPRESSION = "self.layers>1";

	/**
	 * Validates the posLayers constraint of '<em>Shelf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShelf_posLayers(Shelf shelf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MallDsmPackage.Literals.SHELF,
				 shelf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "posLayers",
				 SHELF__POS_LAYERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefrigerator(Refrigerator refrigerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(refrigerator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(table, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMall(Mall mall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mall, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mall, diagnostics, context);
		if (result || diagnostics != null) result &= validateMall_uniqueShopName(mall, diagnostics, context);
		if (result || diagnostics != null) result &= validateMall_uniqueMnumber(mall, diagnostics, context);
		if (result || diagnostics != null) result &= validateMall_uniqueCatName(mall, diagnostics, context);
		if (result || diagnostics != null) result &= validateMall_uniqueSubCatName(mall, diagnostics, context);
		if (result || diagnostics != null) result &= validateMall_uniqueBrandName(mall, diagnostics, context);
		if (result || diagnostics != null) result &= validateMall_uniqueGoodBrand(mall, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueShopName constraint of '<em>Mall</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MALL__UNIQUE_SHOP_NAME__EEXPRESSION = "self.shops->forAll(s1,s2|s1<>s2 implies s1.name<>s2.name)";

	/**
	 * Validates the uniqueShopName constraint of '<em>Mall</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMall_uniqueShopName(Mall mall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MallDsmPackage.Literals.MALL,
				 mall,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueShopName",
				 MALL__UNIQUE_SHOP_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueMnumber constraint of '<em>Mall</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MALL__UNIQUE_MNUMBER__EEXPRESSION = "self.availableBrands.producedGoods->forAll(g1,g2|g1<>g2 implies g1.modelNumber<>g2.modelNumber)";

	/**
	 * Validates the uniqueMnumber constraint of '<em>Mall</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMall_uniqueMnumber(Mall mall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MallDsmPackage.Literals.MALL,
				 mall,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueMnumber",
				 MALL__UNIQUE_MNUMBER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueCatName constraint of '<em>Mall</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MALL__UNIQUE_CAT_NAME__EEXPRESSION = "self.categories->forAll(c1,c2|c1<>c2 implies c1.name <> c2.name)";

	/**
	 * Validates the uniqueCatName constraint of '<em>Mall</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMall_uniqueCatName(Mall mall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MallDsmPackage.Literals.MALL,
				 mall,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueCatName",
				 MALL__UNIQUE_CAT_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueSubCatName constraint of '<em>Mall</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MALL__UNIQUE_SUB_CAT_NAME__EEXPRESSION = "self.categories.contains->forAll(sc1,sc2|sc1<>sc2 implies sc1.name<>sc2.name)";

	/**
	 * Validates the uniqueSubCatName constraint of '<em>Mall</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMall_uniqueSubCatName(Mall mall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MallDsmPackage.Literals.MALL,
				 mall,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueSubCatName",
				 MALL__UNIQUE_SUB_CAT_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueBrandName constraint of '<em>Mall</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MALL__UNIQUE_BRAND_NAME__EEXPRESSION = "self.availableBrands->forAll(b1,b2|b1<>b2 implies b1.name<>b2.name)";

	/**
	 * Validates the uniqueBrandName constraint of '<em>Mall</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMall_uniqueBrandName(Mall mall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MallDsmPackage.Literals.MALL,
				 mall,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueBrandName",
				 MALL__UNIQUE_BRAND_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueGoodBrand constraint of '<em>Mall</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MALL__UNIQUE_GOOD_BRAND__EEXPRESSION = "self.availableBrands->forAll(b1,b2|b1<>b2 implies b1.producedGoods->intersection(b2.producedGoods)->isEmpty())";

	/**
	 * Validates the uniqueGoodBrand constraint of '<em>Mall</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMall_uniqueGoodBrand(Mall mall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MallDsmPackage.Literals.MALL,
				 mall,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueGoodBrand",
				 MALL__UNIQUE_GOOD_BRAND__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //MallDsmValidator
