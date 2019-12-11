/**
 */
package MallDsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shelf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MallDsm.Shelf#getLayers <em>Layers</em>}</li>
 * </ul>
 *
 * @see MallDsm.MallDsmPackage#getShelf()
 * @model
 * @generated
 */
public interface Shelf extends Container {
	/**
	 * Returns the value of the '<em><b>Layers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layers</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers</em>' attribute list.
	 * @see MallDsm.MallDsmPackage#getShelf_Layers()
	 * @model lower="2"
	 * @generated
	 */
	EList<Integer> getLayers();

} // Shelf
