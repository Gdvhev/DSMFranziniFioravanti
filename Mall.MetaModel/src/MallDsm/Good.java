/**
 */
package MallDsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Good</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MallDsm.Good#getFeatures <em>Features</em>}</li>
 *   <li>{@link MallDsm.Good#getHasSubCategory <em>Has Sub Category</em>}</li>
 *   <li>{@link MallDsm.Good#getModelNumber <em>Model Number</em>}</li>
 * </ul>
 *
 * @see MallDsm.MallDsmPackage#getGood()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueFeatures'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueFeatures='self.features-&gt;forAll(f1,f2|f1&lt;&gt;f2 implies f1.name&lt;&gt;f2.name)'"
 * @generated
 */
public interface Good extends EObject {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link MallDsm.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see MallDsm.MallDsmPackage#getGood_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Has Sub Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Sub Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Sub Category</em>' reference.
	 * @see #setHasSubCategory(SubCategory)
	 * @see MallDsm.MallDsmPackage#getGood_HasSubCategory()
	 * @model required="true"
	 * @generated
	 */
	SubCategory getHasSubCategory();

	/**
	 * Sets the value of the '{@link MallDsm.Good#getHasSubCategory <em>Has Sub Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Sub Category</em>' reference.
	 * @see #getHasSubCategory()
	 * @generated
	 */
	void setHasSubCategory(SubCategory value);

	/**
	 * Returns the value of the '<em><b>Model Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Number</em>' attribute.
	 * @see #setModelNumber(String)
	 * @see MallDsm.MallDsmPackage#getGood_ModelNumber()
	 * @model required="true"
	 * @generated
	 */
	String getModelNumber();

	/**
	 * Sets the value of the '{@link MallDsm.Good#getModelNumber <em>Model Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Number</em>' attribute.
	 * @see #getModelNumber()
	 * @generated
	 */
	void setModelNumber(String value);

} // Good
