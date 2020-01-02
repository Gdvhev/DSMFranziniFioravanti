/**
 */
package MallDsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Brand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MallDsm.Brand#getProducedGoods <em>Produced Goods</em>}</li>
 *   <li>{@link MallDsm.Brand#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see MallDsm.MallDsmPackage#getBrand()
 * @model
 * @generated
 */
public interface Brand extends EObject {
	/**
	 * Returns the value of the '<em><b>Produced Goods</b></em>' containment reference list.
	 * The list contents are of type {@link MallDsm.Good}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produced Goods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produced Goods</em>' containment reference list.
	 * @see MallDsm.MallDsmPackage#getBrand_ProducedGoods()
	 * @model containment="true"
	 * @generated
	 */
	EList<Good> getProducedGoods();

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
	 * @see MallDsm.MallDsmPackage#getBrand_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MallDsm.Brand#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Brand
