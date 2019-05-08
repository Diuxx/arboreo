/**
 */
package lpdql.arboreo.impl;

import lpdql.arboreo.ArboreoPackage;
import lpdql.arboreo.Lien;
import lpdql.arboreo.Page;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lien</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lpdql.arboreo.impl.LienImpl#getName <em>Name</em>}</li>
 *   <li>{@link lpdql.arboreo.impl.LienImpl#getPage_origine <em>Page origine</em>}</li>
 *   <li>{@link lpdql.arboreo.impl.LienImpl#getPage_destination <em>Page destination</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LienImpl extends MinimalEObjectImpl.Container implements Lien {
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
	 * The cached value of the '{@link #getPage_origine() <em>Page origine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage_origine()
	 * @generated
	 * @ordered
	 */
	protected Page page_origine;

	/**
	 * The cached value of the '{@link #getPage_destination() <em>Page destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage_destination()
	 * @generated
	 * @ordered
	 */
	protected Page page_destination;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LienImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArboreoPackage.Literals.LIEN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArboreoPackage.LIEN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getPage_origine() {
		if (page_origine != null && page_origine.eIsProxy()) {
			InternalEObject oldPage_origine = (InternalEObject) page_origine;
			page_origine = (Page) eResolveProxy(oldPage_origine);
			if (page_origine != oldPage_origine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArboreoPackage.LIEN__PAGE_ORIGINE,
							oldPage_origine, page_origine));
			}
		}
		return page_origine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetPage_origine() {
		return page_origine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPage_origine(Page newPage_origine) {
		Page oldPage_origine = page_origine;
		page_origine = newPage_origine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArboreoPackage.LIEN__PAGE_ORIGINE, oldPage_origine,
					page_origine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getPage_destination() {
		if (page_destination != null && page_destination.eIsProxy()) {
			InternalEObject oldPage_destination = (InternalEObject) page_destination;
			page_destination = (Page) eResolveProxy(oldPage_destination);
			if (page_destination != oldPage_destination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArboreoPackage.LIEN__PAGE_DESTINATION,
							oldPage_destination, page_destination));
			}
		}
		return page_destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetPage_destination() {
		return page_destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPage_destination(Page newPage_destination) {
		Page oldPage_destination = page_destination;
		page_destination = newPage_destination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArboreoPackage.LIEN__PAGE_DESTINATION,
					oldPage_destination, page_destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArboreoPackage.LIEN__NAME:
			return getName();
		case ArboreoPackage.LIEN__PAGE_ORIGINE:
			if (resolve)
				return getPage_origine();
			return basicGetPage_origine();
		case ArboreoPackage.LIEN__PAGE_DESTINATION:
			if (resolve)
				return getPage_destination();
			return basicGetPage_destination();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ArboreoPackage.LIEN__NAME:
			setName((String) newValue);
			return;
		case ArboreoPackage.LIEN__PAGE_ORIGINE:
			setPage_origine((Page) newValue);
			return;
		case ArboreoPackage.LIEN__PAGE_DESTINATION:
			setPage_destination((Page) newValue);
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
		case ArboreoPackage.LIEN__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ArboreoPackage.LIEN__PAGE_ORIGINE:
			setPage_origine((Page) null);
			return;
		case ArboreoPackage.LIEN__PAGE_DESTINATION:
			setPage_destination((Page) null);
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
		case ArboreoPackage.LIEN__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ArboreoPackage.LIEN__PAGE_ORIGINE:
			return page_origine != null;
		case ArboreoPackage.LIEN__PAGE_DESTINATION:
			return page_destination != null;
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

} //LienImpl
