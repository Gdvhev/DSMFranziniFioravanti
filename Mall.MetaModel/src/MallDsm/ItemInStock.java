/**
 */
package MallDsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item In Stock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MallDsm.ItemInStock#getContains <em>Contains</em>}</li>
 *   <li>{@link MallDsm.ItemInStock#getItemCount <em>Item Count</em>}</li>
 * </ul>
 *
 * @see MallDsm.MallDsmPackage#getItemInStock()
 * @model
 * @generated
 */
public interface ItemInStock extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference.
	 * @see #setContains(Good)
	 * @see MallDsm.MallDsmPackage#getItemInStock_Contains()
	 * @model required="true"
	 * @generated
	 */
	Good getContains();

	/**
	 * Sets the value of the '{@link MallDsm.ItemInStock#getContains <em>Contains</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains</em>' reference.
	 * @see #getContains()
	 * @generated
	 */
	void setContains(Good value);

	/**
	 * Returns the value of the '<em><b>Item Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Count</em>' attribute.
	 * @see #setItemCount(Integer)
	 * @see MallDsm.MallDsmPackage#getItemInStock_ItemCount()
	 * @model required="true"
	 * @generated
	 */
	Integer getItemCount();

	/**
	 * Sets the value of the '{@link MallDsm.ItemInStock#getItemCount <em>Item Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Count</em>' attribute.
	 * @see #getItemCount()
	 * @generated
	 */
	void setItemCount(Integer value);

} // ItemInStock
