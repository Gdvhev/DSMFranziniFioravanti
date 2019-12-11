/**
 */
package MallDsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MallDsm.Employee#getShiftSchedule <em>Shift Schedule</em>}</li>
 *   <li>{@link MallDsm.Employee#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see MallDsm.MallDsmPackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends EObject {
	/**
	 * Returns the value of the '<em><b>Shift Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shift Schedule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shift Schedule</em>' containment reference.
	 * @see #setShiftSchedule(WeeklySchedule)
	 * @see MallDsm.MallDsmPackage#getEmployee_ShiftSchedule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	WeeklySchedule getShiftSchedule();

	/**
	 * Sets the value of the '{@link MallDsm.Employee#getShiftSchedule <em>Shift Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shift Schedule</em>' containment reference.
	 * @see #getShiftSchedule()
	 * @generated
	 */
	void setShiftSchedule(WeeklySchedule value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see MallDsm.MallDsmPackage#getEmployee_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MallDsm.Employee#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Employee
