/**
 */
package MallDsm;


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
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='posLayers'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot posLayers='self.layers&gt;0'"
 * @generated
 */
public interface Shelf extends Container {
	/**
	 * Returns the value of the '<em><b>Layers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers</em>' attribute.
	 * @see #setLayers(Integer)
	 * @see MallDsm.MallDsmPackage#getShelf_Layers()
	 * @model required="true"
	 * @generated
	 */
	Integer getLayers();

	/**
	 * Sets the value of the '{@link MallDsm.Shelf#getLayers <em>Layers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layers</em>' attribute.
	 * @see #getLayers()
	 * @generated
	 */
	void setLayers(Integer value);

} // Shelf
