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
 * @model
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
	 * Returns the value of the '<em><b>Default Price</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Price</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Price</em>' attribute list.
	 * @see MallDsm.MallDsmPackage#getListedGood_DefaultPrice()
	 * @model
	 * @generated
	 */
	EList<Integer> getDefaultPrice();

} // ListedGood
