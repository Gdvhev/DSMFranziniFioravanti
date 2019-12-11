/**
 */
package MallDsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weekly Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MallDsm.WeeklySchedule#getShift <em>Shift</em>}</li>
 * </ul>
 *
 * @see MallDsm.MallDsmPackage#getWeeklySchedule()
 * @model
 * @generated
 */
public interface WeeklySchedule extends EObject {
	/**
	 * Returns the value of the '<em><b>Shift</b></em>' containment reference list.
	 * The list contents are of type {@link MallDsm.TimeSpan}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shift</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shift</em>' containment reference list.
	 * @see MallDsm.MallDsmPackage#getWeeklySchedule_Shift()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimeSpan> getShift();

} // WeeklySchedule
