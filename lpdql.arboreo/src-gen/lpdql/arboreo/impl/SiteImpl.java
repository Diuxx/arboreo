/**
 */
package lpdql.arboreo.impl;

import java.util.Collection;

import lpdql.arboreo.ArboreoPackage;
import lpdql.arboreo.Lien;
import lpdql.arboreo.Page;
import lpdql.arboreo.Site;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lpdql.arboreo.impl.SiteImpl#getName <em>Name</em>}</li>
 *   <li>{@link lpdql.arboreo.impl.SiteImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link lpdql.arboreo.impl.SiteImpl#getLiens <em>Liens</em>}</li>
 *   <li>{@link lpdql.arboreo.impl.SiteImpl#getAccueil <em>Accueil</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SiteImpl extends MinimalEObjectImpl.Container implements Site {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> pages;

	/**
	 * The cached value of the '{@link #getLiens() <em>Liens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiens()
	 * @generated
	 * @ordered
	 */
	protected EList<Lien> liens;

	/**
	 * The cached value of the '{@link #getAccueil() <em>Accueil</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccueil()
	 * @generated
	 * @ordered
	 */
	protected Page accueil;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArboreoPackage.Literals.SITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArboreoPackage.SITE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentEList<Page>(Page.class, this, ArboreoPackage.SITE__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lien> getLiens() {
		if (liens == null) {
			liens = new EObjectContainmentEList<Lien>(Lien.class, this, ArboreoPackage.SITE__LIENS);
		}
		return liens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getAccueil() {
		if (accueil != null && accueil.eIsProxy()) {
			InternalEObject oldAccueil = (InternalEObject) accueil;
			accueil = (Page) eResolveProxy(oldAccueil);
			if (accueil != oldAccueil) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArboreoPackage.SITE__ACCUEIL, oldAccueil,
							accueil));
			}
		}
		return accueil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetAccueil() {
		return accueil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccueil(Page newAccueil) {
		Page oldAccueil = accueil;
		accueil = newAccueil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArboreoPackage.SITE__ACCUEIL, oldAccueil, accueil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArboreoPackage.SITE__PAGES:
			return ((InternalEList<?>) getPages()).basicRemove(otherEnd, msgs);
		case ArboreoPackage.SITE__LIENS:
			return ((InternalEList<?>) getLiens()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArboreoPackage.SITE__NAME:
			return getName();
		case ArboreoPackage.SITE__PAGES:
			return getPages();
		case ArboreoPackage.SITE__LIENS:
			return getLiens();
		case ArboreoPackage.SITE__ACCUEIL:
			if (resolve)
				return getAccueil();
			return basicGetAccueil();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ArboreoPackage.SITE__NAME:
			setName((String) newValue);
			return;
		case ArboreoPackage.SITE__PAGES:
			getPages().clear();
			getPages().addAll((Collection<? extends Page>) newValue);
			return;
		case ArboreoPackage.SITE__LIENS:
			getLiens().clear();
			getLiens().addAll((Collection<? extends Lien>) newValue);
			return;
		case ArboreoPackage.SITE__ACCUEIL:
			setAccueil((Page) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ArboreoPackage.SITE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ArboreoPackage.SITE__PAGES:
			getPages().clear();
			return;
		case ArboreoPackage.SITE__LIENS:
			getLiens().clear();
			return;
		case ArboreoPackage.SITE__ACCUEIL:
			setAccueil((Page) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ArboreoPackage.SITE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ArboreoPackage.SITE__PAGES:
			return pages != null && !pages.isEmpty();
		case ArboreoPackage.SITE__LIENS:
			return liens != null && !liens.isEmpty();
		case ArboreoPackage.SITE__ACCUEIL:
			return accueil != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SiteImpl
