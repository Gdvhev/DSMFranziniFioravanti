/**
 */
package MallDsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MallDsm.Container#getContainedGood <em>Contained Good</em>}</li>
 * </ul>
 *
 * @see MallDsm.MallDsmPackage#getContainer()
 * @model abstract="true"
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Contained Good</b></em>' containment reference list.
	 * The list contents are of type {@link MallDsm.ItemInStock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Good</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Good</em>' containment reference list.
	 * @see MallDsm.MallDsmPackage#getContainer_ContainedGood()
	 * @model containment="true"
	 * @generated
	 */
	EList<ItemInStock> getContainedGood();

} // Container
