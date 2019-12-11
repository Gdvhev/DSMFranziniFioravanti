/**
 */
package MallDsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialistic Shop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MallDsm.SpecialisticShop#getSpeciality <em>Speciality</em>}</li>
 * </ul>
 *
 * @see MallDsm.MallDsmPackage#getSpecialisticShop()
 * @model
 * @generated
 */
public interface SpecialisticShop extends Shop {
	/**
	 * Returns the value of the '<em><b>Speciality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speciality</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speciality</em>' reference.
	 * @see #setSpeciality(Category)
	 * @see MallDsm.MallDsmPackage#getSpecialisticShop_Speciality()
	 * @model required="true"
	 * @generated
	 */
	Category getSpeciality();

	/**
	 * Sets the value of the '{@link MallDsm.SpecialisticShop#getSpeciality <em>Speciality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speciality</em>' reference.
	 * @see #getSpeciality()
	 * @generated
	 */
	void setSpeciality(Category value);

} // SpecialisticShop
