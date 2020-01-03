/**
 */
package MallDsm;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MallDsm.Discount#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link MallDsm.Discount#getTimeStart <em>Time Start</em>}</li>
 *   <li>{@link MallDsm.Discount#getTimeEnd <em>Time End</em>}</li>
 * </ul>
 *
 * @see MallDsm.MallDsmPackage#getDiscount()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validPerc validDateInterval'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot validPerc='self.percentage &lt;=100 and self.percentage &gt;=0' validDateInterval='self.timeEnd.compareTo(self.timeStart)&gt;0'"
 * @generated
 */
public interface Discount extends EObject {
	/**
	 * Returns the value of the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage</em>' attribute.
	 * @see #setPercentage(Integer)
	 * @see MallDsm.MallDsmPackage#getDiscount_Percentage()
	 * @model required="true"
	 * @generated
	 */
	Integer getPercentage();

	/**
	 * Sets the value of the '{@link MallDsm.Discount#getPercentage <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage</em>' attribute.
	 * @see #getPercentage()
	 * @generated
	 */
	void setPercentage(Integer value);

	/**
	 * Returns the value of the '<em><b>Time Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Start</em>' attribute.
	 * @see #setTimeStart(Date)
	 * @see MallDsm.MallDsmPackage#getDiscount_TimeStart()
	 * @model required="true"
	 * @generated
	 */
	Date getTimeStart();

	/**
	 * Sets the value of the '{@link MallDsm.Discount#getTimeStart <em>Time Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Start</em>' attribute.
	 * @see #getTimeStart()
	 * @generated
	 */
	void setTimeStart(Date value);

	/**
	 * Returns the value of the '<em><b>Time End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time End</em>' attribute.
	 * @see #setTimeEnd(Date)
	 * @see MallDsm.MallDsmPackage#getDiscount_TimeEnd()
	 * @model required="true"
	 * @generated
	 */
	Date getTimeEnd();

	/**
	 * Sets the value of the '{@link MallDsm.Discount#getTimeEnd <em>Time End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time End</em>' attribute.
	 * @see #getTimeEnd()
	 * @generated
	 */
	void setTimeEnd(Date value);

} // Discount
