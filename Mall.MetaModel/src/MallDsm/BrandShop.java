/**
 */
package MallDsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Brand Shop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MallDsm.BrandShop#getBrand <em>Brand</em>}</li>
 * </ul>
 *
 * @see MallDsm.MallDsmPackage#getBrandShop()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='brandConstraint'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot brandConstraint='self.soldGoods.good-&gt;forAll(g|self.brand.producedGoods-&gt;includes(g))'"
 * @generated
 */
public interface BrandShop extends Shop {
	/**
	 * Returns the value of the '<em><b>Brand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brand</em>' reference.
	 * @see #setBrand(Brand)
	 * @see MallDsm.MallDsmPackage#getBrandShop_Brand()
	 * @model required="true"
	 * @generated
	 */
	Brand getBrand();

	/**
	 * Sets the value of the '{@link MallDsm.BrandShop#getBrand <em>Brand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brand</em>' reference.
	 * @see #getBrand()
	 * @generated
	 */
	void setBrand(Brand value);

} // BrandShop
