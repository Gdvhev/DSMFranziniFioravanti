/**
 */
package MallDsm;

import org.eclipse.emf.common.util.EList;

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
 * @model
 * @generated
 */
public interface TimeSpan extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Hour</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Hour</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Hour</em>' attribute list.
	 * @see MallDsm.MallDsmPackage#getTimeSpan_StartHour()
	 * @model upper="23"
	 * @generated
	 */
	EList<Integer> getStartHour();

	/**
	 * Returns the value of the '<em><b>Start Day</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Day</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Day</em>' attribute list.
	 * @see MallDsm.MallDsmPackage#getTimeSpan_StartDay()
	 * @model required="true" upper="7"
	 * @generated
	 */
	EList<Integer> getStartDay();

	/**
	 * Returns the value of the '<em><b>End Day</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Day</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Day</em>' attribute list.
	 * @see MallDsm.MallDsmPackage#getTimeSpan_EndDay()
	 * @model required="true" upper="7"
	 * @generated
	 */
	EList<Integer> getEndDay();

	/**
	 * Returns the value of the '<em><b>End Hour</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Hour</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Hour</em>' attribute list.
	 * @see MallDsm.MallDsmPackage#getTimeSpan_EndHour()
	 * @model upper="23"
	 * @generated
	 */
	EList<Integer> getEndHour();

} // TimeSpan
