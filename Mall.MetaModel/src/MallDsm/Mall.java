/**
 */
package MallDsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mall</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MallDsm.Mall#getShops <em>Shops</em>}</li>
 *   <li>{@link MallDsm.Mall#getAviableBrands <em>Aviable Brands</em>}</li>
 * </ul>
 *
 * @see MallDsm.MallDsmPackage#getMall()
 * @model
 * @generated
 */
public interface Mall extends EObject {
	/**
	 * Returns the value of the '<em><b>Shops</b></em>' containment reference list.
	 * The list contents are of type {@link MallDsm.Shop}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shops</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shops</em>' containment reference list.
	 * @see MallDsm.MallDsmPackage#getMall_Shops()
	 * @model containment="true"
	 * @generated
	 */
	EList<Shop> getShops();

	/**
	 * Returns the value of the '<em><b>Aviable Brands</b></em>' containment reference list.
	 * The list contents are of type {@link MallDsm.Brand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aviable Brands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aviable Brands</em>' containment reference list.
	 * @see MallDsm.MallDsmPackage#getMall_AviableBrands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Brand> getAviableBrands();

} // Mall
