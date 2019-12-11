/**
 */
package MallDsm.util;

import MallDsm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MallDsm.MallDsmPackage
 * @generated
 */
public class MallDsmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MallDsmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MallDsmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MallDsmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MallDsmSwitch<Adapter> modelSwitch =
		new MallDsmSwitch<Adapter>() {
			@Override
			public Adapter caseShop(Shop object) {
				return createShopAdapter();
			}
			@Override
			public Adapter caseBrandShop(BrandShop object) {
				return createBrandShopAdapter();
			}
			@Override
			public Adapter caseSpecialisticShop(SpecialisticShop object) {
				return createSpecialisticShopAdapter();
			}
			@Override
			public Adapter caseBrand(Brand object) {
				return createBrandAdapter();
			}
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter caseGood(Good object) {
				return createGoodAdapter();
			}
			@Override
			public Adapter caseItemInStock(ItemInStock object) {
				return createItemInStockAdapter();
			}
			@Override
			public Adapter caseListedGood(ListedGood object) {
				return createListedGoodAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseSubCatecory(SubCatecory object) {
				return createSubCatecoryAdapter();
			}
			@Override
			public Adapter caseCategory(Category object) {
				return createCategoryAdapter();
			}
			@Override
			public Adapter caseEmployee(Employee object) {
				return createEmployeeAdapter();
			}
			@Override
			public Adapter caseTimeSpan(TimeSpan object) {
				return createTimeSpanAdapter();
			}
			@Override
			public Adapter caseWeeklySchedule(WeeklySchedule object) {
				return createWeeklyScheduleAdapter();
			}
			@Override
			public Adapter caseDiscount(Discount object) {
				return createDiscountAdapter();
			}
			@Override
			public Adapter caseShelf(Shelf object) {
				return createShelfAdapter();
			}
			@Override
			public Adapter caseRefrigerator(Refrigerator object) {
				return createRefrigeratorAdapter();
			}
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter caseMall(Mall object) {
				return createMallAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link MallDsm.Shop <em>Shop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MallDsm.Shop
	 * @generated
	 */
	public Adapter createShopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MallDsm.BrandShop <em>Brand Shop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MallDsm.BrandShop
	 * @generated
	 */
	public Adapter createBrandShopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MallDsm.SpecialisticShop <em>Specialistic Shop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MallDsm.SpecialisticShop
	 * @generated
	 */
	public Adapter createSpecialisticShopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MallDsm.Brand <em>Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MallDsm.Brand
	 * @generated
	 */
	public Adapter createBrandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MallDsm.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MallDsm.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MallDsm.Good <em>Good</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MallDsm.Good
	 * @generated
	 */
	public Adapter createGoodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MallDsm.ItemInStock <em>Item In Stock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MallDsm.ItemInStock
	 * @generated
	 */
	public Adapter createItemInStockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MallDsm.ListedGood <em>Listed Good</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MallDsm.ListedGood
	 * @generated
	 */
	public Adapter createListedGoodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MallDsm.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MallDsm.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MallDsm.SubCatecory <em>Sub Catecory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MallDsm.SubCatecory
	 * @generated
	 */
	public Adapter createSubCatecoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MallDsm.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MallDsm.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MallDsm.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MallDsm.Employee
	 * @generated
	 */
	public Adapter createEmployeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MallDsm.TimeSpan <em>Time Span</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MallDsm.TimeSpan
	 * @generated
	 */
	public Adapter createTimeSpanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MallDsm.WeeklySchedule <em>Weekly Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MallDsm.WeeklySchedule
	 * @generated
	 */
	public Adapter createWeeklyScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MallDsm.Discount <em>Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MallDsm.Discount
	 * @generated
	 */
	public Adapter createDiscountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MallDsm.Shelf <em>Shelf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MallDsm.Shelf
	 * @generated
	 */
	public Adapter createShelfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MallDsm.Refrigerator <em>Refrigerator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MallDsm.Refrigerator
	 * @generated
	 */
	public Adapter createRefrigeratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MallDsm.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MallDsm.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MallDsm.Mall <em>Mall</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MallDsm.Mall
	 * @generated
	 */
	public Adapter createMallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MallDsmAdapterFactory
