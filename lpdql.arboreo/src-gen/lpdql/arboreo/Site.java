/**
 */
package lpdql.arboreo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lpdql.arboreo.Site#getPages <em>Pages</em>}</li>
 *   <li>{@link lpdql.arboreo.Site#getLiens <em>Liens</em>}</li>
 *   <li>{@link lpdql.arboreo.Site#getAccueil <em>Accueil</em>}</li>
 * </ul>
 *
 * @see lpdql.arboreo.ArboreoPackage#getSite()
 * @model
 * @generated
 */
public interface Site extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link lpdql.arboreo.Page}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see lpdql.arboreo.ArboreoPackage#getSite_Pages()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Page> getPages();

	/**
	 * Returns the value of the '<em><b>Liens</b></em>' containment reference list.
	 * The list contents are of type {@link lpdql.arboreo.Lien}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Liens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liens</em>' containment reference list.
	 * @see lpdql.arboreo.ArboreoPackage#getSite_Liens()
	 * @model containment="true"
	 * @generated
	 */
	EList<Lien> getLiens();

	/**
	 * Returns the value of the '<em><b>Accueil</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accueil</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accueil</em>' reference.
	 * @see #setAccueil(Page)
	 * @see lpdql.arboreo.ArboreoPackage#getSite_Accueil()
	 * @model
	 * @generated
	 */
	Page getAccueil();

	/**
	 * Sets the value of the '{@link lpdql.arboreo.Site#getAccueil <em>Accueil</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accueil</em>' reference.
	 * @see #getAccueil()
	 * @generated
	 */
	void setAccueil(Page value);

} // Site
