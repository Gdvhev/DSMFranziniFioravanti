/**
 */
package MallDsm.tests;

import MallDsm.MallDsmFactory;
import MallDsm.WeeklySchedule;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Weekly Schedule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WeeklyScheduleTest extends TestCase {

	/**
	 * The fixture for this Weekly Schedule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeeklySchedule fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WeeklyScheduleTest.class);
	}

	/**
	 * Constructs a new Weekly Schedule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeeklyScheduleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Weekly Schedule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(WeeklySchedule fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Weekly Schedule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeeklySchedule getFixture() {
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
		setFixture(MallDsmFactory.eINSTANCE.createWeeklySchedule());
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

} //WeeklyScheduleTest
