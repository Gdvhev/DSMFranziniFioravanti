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
 *   <li>{@link MallDsm.Mall#getAvailableBrands <em>Available Brands</em>}</li>
 *   <li>{@link MallDsm.Mall#getCategories <em>Categories</em>}</li>
 * </ul>
 *
 * @see MallDsm.MallDsmPackage#getMall()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueShopName uniqueMnumber uniqueCatName uniqueSubCatName uniqueBrandName uniqueGoodBrand'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueShopName='self.shops-&gt;forAll(s1,s2|s1&lt;&gt;s2 implies s1.name&lt;&gt;s2.name)' uniqueMnumber='self.availableBrands.producedGoods-&gt;forAll(g1,g2|g1&lt;&gt;g2 implies g1.modelNumber&lt;&gt;g2.modelNumber)' uniqueCatName='self.categories-&gt;forAll(c1,c2|c1&lt;&gt;c2 implies c1.name &lt;&gt; c2.name)' uniqueSubCatName='self.categories.contains-&gt;forAll(sc1,sc2|sc1&lt;&gt;sc2 implies sc1.name&lt;&gt;sc2.name)' uniqueBrandName='self.availableBrands-&gt;forAll(b1,b2|b1&lt;&gt;b2 implies b1.name&lt;&gt;b2.name)' uniqueGoodBrand='self.availableBrands-&gt;forAll(b1,b2|b1&lt;&gt;b2 implies b1.producedGoods-&gt;intersection(b2.producedGoods)-&gt;isEmpty())'"
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
	 * Returns the value of the '<em><b>Available Brands</b></em>' containment reference list.
	 * The list contents are of type {@link MallDsm.Brand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Brands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Brands</em>' containment reference list.
	 * @see MallDsm.MallDsmPackage#getMall_AvailableBrands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Brand> getAvailableBrands();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link MallDsm.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see MallDsm.MallDsmPackage#getMall_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Category> getCategories();

} // Mall
