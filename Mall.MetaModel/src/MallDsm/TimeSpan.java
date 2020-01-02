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
	 * Returns the value of the '<em><b>Start Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Hour</em>' attribute list isn't clear,
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
	 * If the meaning of the '<em>Start Day</em>' attribute list isn't clear,
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
	 * If the meaning of the '<em>End Day</em>' attribute list isn't clear,
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
	 * If the meaning of the '<em>End Hour</em>' attribute list isn't clear,
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
