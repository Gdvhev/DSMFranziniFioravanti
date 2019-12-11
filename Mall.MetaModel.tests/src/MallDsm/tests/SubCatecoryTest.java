/**
 */
package MallDsm.tests;

import MallDsm.MallDsmFactory;
import MallDsm.SubCatecory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sub Catecory</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubCatecoryTest extends TestCase {

	/**
	 * The fixture for this Sub Catecory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubCatecory fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubCatecoryTest.class);
	}

	/**
	 * Constructs a new Sub Catecory test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubCatecoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sub Catecory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SubCatecory fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sub Catecory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubCatecory getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MallDsmFactory.eINSTANCE.createSubCatecory());
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

} //SubCatecoryTest
