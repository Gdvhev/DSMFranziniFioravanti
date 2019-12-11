/**
 */
package MallDsm.tests;

import MallDsm.MallDsmFactory;
import MallDsm.SpecialisticShop;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Specialistic Shop</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecialisticShopTest extends ShopTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SpecialisticShopTest.class);
	}

	/**
	 * Constructs a new Specialistic Shop test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialisticShopTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Specialistic Shop test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SpecialisticShop getFixture() {
		return (SpecialisticShop)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MallDsmFactory.eINSTANCE.createSpecialisticShop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SpecialisticShopTest
