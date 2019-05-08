/**
 */
package lpdql.arboreo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lien</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lpdql.arboreo.Lien#getPage_origine <em>Page origine</em>}</li>
 *   <li>{@link lpdql.arboreo.Lien#getPage_destination <em>Page destination</em>}</li>
 * </ul>
 *
 * @see lpdql.arboreo.ArboreoPackage#getLien()
 * @model
 * @generated
 */
public interface Lien extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Page origine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page origine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page origine</em>' reference.
	 * @see #setPage_origine(Page)
	 * @see lpdql.arboreo.ArboreoPackage#getLien_Page_origine()
	 * @model
	 * @generated
	 */
	Page getPage_origine();

	/**
	 * Sets the value of the '{@link lpdql.arboreo.Lien#getPage_origine <em>Page origine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page origine</em>' reference.
	 * @see #getPage_origine()
	 * @generated
	 */
	void setPage_origine(Page value);

	/**
	 * Returns the value of the '<em><b>Page destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page destination</em>' reference.
	 * @see #setPage_destination(Page)
	 * @see lpdql.arboreo.ArboreoPackage#getLien_Page_destination()
	 * @model
	 * @generated
	 */
	Page getPage_destination();

	/**
	 * Sets the value of the '{@link lpdql.arboreo.Lien#getPage_destination <em>Page destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page destination</em>' reference.
	 * @see #getPage_destination()
	 * @generated
	 */
	void setPage_destination(Page value);

} // Lien
