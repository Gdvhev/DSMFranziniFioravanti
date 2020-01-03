/**
 */
package MallDsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Span</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MallDsm.TimeSpan#getStartHour <em>Start Hour</em>}</li>
 *   <li>{@link MallDsm.TimeSpan#getStartDay <em>Start Day</em>}</li>
 *   <li>{@link MallDsm.TimeSpan#getEndDay <em>End Day</em>}</li>
 *   <li>{@link MallDsm.TimeSpan#getEndHour <em>End Hour</em>}</li>
 * </ul>
 *
 * @see MallDsm.MallDsmPackage#getTimeSpan()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validInterval'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot validInterval='if(self.endDay=self.startDay) \n\t\t\tthen\n\t\t\t\tself.startHour&lt;=self.endHour\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif and\n\t\t\tself.startHour&gt;=0 and self.startHour&lt;=23 and\n\t\t\tself.startDay&gt;=0 and self.startDay&lt;=6 and\n\t\t\tself.endHour&gt;=0 and self.endHour&lt;=23 and\n\t\t\tself.endDay&gt;=0 and self.endDay&lt;=6'"
 * @generated
 */
public interface TimeSpan extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Hour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Hour</em>' attribute.
	 * @see #setStartHour(Integer)
	 * @see MallDsm.MallDsmPackage#getTimeSpan_StartHour()
	 * @model required="true"
	 * @generated
	 */
	Integer getStartHour();

	/**
	 * Sets the value of the '{@link MallDsm.TimeSpan#getStartHour <em>Start Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Hour</em>' attribute.
	 * @see #getStartHour()
	 * @generated
	 */
	void setStartHour(Integer value);

	/**
	 * Returns the value of the '<em><b>Start Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Day</em>' attribute.
	 * @see #setStartDay(Integer)
	 * @see MallDsm.MallDsmPackage#getTimeSpan_StartDay()
	 * @model required="true"
	 * @generated
	 */
	Integer getStartDay();

	/**
	 * Sets the value of the '{@link MallDsm.TimeSpan#getStartDay <em>Start Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Day</em>' attribute.
	 * @see #getStartDay()
	 * @generated
	 */
	void setStartDay(Integer value);

	/**
	 * Returns the value of the '<em><b>End Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Day</em>' attribute.
	 * @see #setEndDay(Integer)
	 * @see MallDsm.MallDsmPackage#getTimeSpan_EndDay()
	 * @model required="true"
	 * @generated
	 */
	Integer getEndDay();

	/**
	 * Sets the value of the '{@link MallDsm.TimeSpan#getEndDay <em>End Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Day</em>' attribute.
	 * @see #getEndDay()
	 * @generated
	 */
	void setEndDay(Integer value);

	/**
	 * Returns the value of the '<em><b>End Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Hour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Hour</em>' attribute.
	 * @see #setEndHour(Integer)
	 * @see MallDsm.MallDsmPackage#getTimeSpan_EndHour()
	 * @model required="true"
	 * @generated
	 */
	Integer getEndHour();

	/**
	 * Sets the value of the '{@link MallDsm.TimeSpan#getEndHour <em>End Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Hour</em>' attribute.
	 * @see #getEndHour()
	 * @generated
	 */
	void setEndHour(Integer value);

} // TimeSpan
