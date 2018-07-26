/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go.go.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.go.go.Atrib_Aux;
import org.xtext.go.go.GoPackage;
import org.xtext.go.go.ReAtrib;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Re Atrib</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.go.go.impl.ReAtribImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.go.go.impl.ReAtribImpl#getAtrib <em>Atrib</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReAtribImpl extends MinimalEObjectImpl.Container implements ReAtrib
{
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
   * The cached value of the '{@link #getAtrib() <em>Atrib</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtrib()
   * @generated
   * @ordered
   */
  protected Atrib_Aux atrib;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReAtribImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GoPackage.Literals.RE_ATRIB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.RE_ATRIB__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atrib_Aux getAtrib()
  {
    return atrib;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAtrib(Atrib_Aux newAtrib, NotificationChain msgs)
  {
    Atrib_Aux oldAtrib = atrib;
    atrib = newAtrib;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.RE_ATRIB__ATRIB, oldAtrib, newAtrib);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtrib(Atrib_Aux newAtrib)
  {
    if (newAtrib != atrib)
    {
      NotificationChain msgs = null;
      if (atrib != null)
        msgs = ((InternalEObject)atrib).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.RE_ATRIB__ATRIB, null, msgs);
      if (newAtrib != null)
        msgs = ((InternalEObject)newAtrib).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.RE_ATRIB__ATRIB, null, msgs);
      msgs = basicSetAtrib(newAtrib, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.RE_ATRIB__ATRIB, newAtrib, newAtrib));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GoPackage.RE_ATRIB__ATRIB:
        return basicSetAtrib(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GoPackage.RE_ATRIB__NAME:
        return getName();
      case GoPackage.RE_ATRIB__ATRIB:
        return getAtrib();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GoPackage.RE_ATRIB__NAME:
        setName((String)newValue);
        return;
      case GoPackage.RE_ATRIB__ATRIB:
        setAtrib((Atrib_Aux)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GoPackage.RE_ATRIB__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GoPackage.RE_ATRIB__ATRIB:
        setAtrib((Atrib_Aux)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GoPackage.RE_ATRIB__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GoPackage.RE_ATRIB__ATRIB:
        return atrib != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ReAtribImpl
