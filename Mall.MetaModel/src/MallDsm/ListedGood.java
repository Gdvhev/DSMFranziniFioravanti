/**
 */
package MallDsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Listed Good</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MallDsm.ListedGood#getGood <em>Good</em>}</li>
 *   <li>{@link MallDsm.ListedGood#getSales <em>Sales</em>}</li>
 *   <li>{@link MallDsm.ListedGood#getDefaultPrice <em>Default Price</em>}</li>
 * </ul>
 *
 * @see MallDsm.MallDsmPackage#getListedGood()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='posPrice'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot posPrice='self.defaultPrice&gt;0'"
 * @generated
 */
public interface ListedGood extends EObject {
	/**
	 * Returns the value of the '<em><b>Good</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Good</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Good</em>' reference.
	 * @see #setGood(Good)
	 * @see MallDsm.MallDsmPackage#getListedGood_Good()
	 * @model required="true"
	 * @generated
	 */
	Good getGood();

	/**
	 * Sets the value of the '{@link MallDsm.ListedGood#getGood <em>Good</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Good</em>' reference.
	 * @see #getGood()
	 * @generated
	 */
	void setGood(Good value);

	/**
	 * Returns the value of the '<em><b>Sales</b></em>' containment reference list.
	 * The list contents are of type {@link MallDsm.Discount}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales</em>' containment reference list.
	 * @see MallDsm.MallDsmPackage#getListedGood_Sales()
	 * @model containment="true"
	 * @generated
	 */
	EList<Discount> getSales();

	/**
	 * Returns the value of the '<em><b>Default Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Price</em>' attribute.
	 * @see #setDefaultPrice(Integer)
	 * @see MallDsm.MallDsmPackage#getListedGood_DefaultPrice()
	 * @model required="true"
	 * @generated
	 */
	Integer getDefaultPrice();

	/**
	 * Sets the value of the '{@link MallDsm.ListedGood#getDefaultPrice <em>Default Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Price</em>' attribute.
	 * @see #getDefaultPrice()
	 * @generated
	 */
	void setDefaultPrice(Integer value);

} // ListedGood
