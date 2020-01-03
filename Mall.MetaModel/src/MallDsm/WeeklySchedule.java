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
 *   <li>{@link MallDsm.WeeklySchedule#getShifts <em>Shifts</em>}</li>
 * </ul>
 *
 * @see MallDsm.MallDsmPackage#getWeeklySchedule()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noOverlappingShifts'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot noOverlappingShifts='self.shifts-&gt;forAll(s1,s2|s1&lt;&gt;s2 implies \n\t\t\tlet startAbs1: Integer =(s1.startDay*24+s1.startHour) in\n\t\t\tlet endAbs1: Integer =(s1.endDay*24+s1.endHour) in\n\t\t\tlet startAbs2: Integer =(s2.startDay*24+s2.startHour) in\n\t\t\tlet endAbs2: Integer =(s2.endDay*24+s2.endHour) in\n\t\t\tif(startAbs1&gt;startAbs2)then\n\t\t\t\tstartAbs1&gt;endAbs2 and (endAbs1&lt;startAbs1 implies endAbs1&lt;startAbs2)\n\t\t\telse--Opposite case taken care by the double iterator\n\t\t\t\tstartAbs1&lt;&gt;startAbs2\n\t\t\t\t\n\t\t\tendif\n\t\t)'"
 * @generated
 */
public interface WeeklySchedule extends EObject {
	/**
	 * Returns the value of the '<em><b>Shifts</b></em>' containment reference list.
	 * The list contents are of type {@link MallDsm.TimeSpan}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shifts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shifts</em>' containment reference list.
	 * @see MallDsm.MallDsmPackage#getWeeklySchedule_Shifts()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimeSpan> getShifts();

} // WeeklySchedule
