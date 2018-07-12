/**
 * generated by Xtext 2.13.0
 */
package org.xtext.go.go.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.go.go.Atrib;
import org.xtext.go.go.GoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atrib</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.go.impl.AtribImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.go.go.impl.AtribImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.go.go.impl.AtribImpl#getAtrib <em>Atrib</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtribImpl extends MinimalEObjectImpl.Container implements Atrib
{
  /**
   * The default value of the '{@link #getVar() <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected static final String VAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected String var = VAR_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getAtrib() <em>Atrib</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtrib()
   * @generated
   * @ordered
   */
  protected static final String ATRIB_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAtrib() <em>Atrib</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtrib()
   * @generated
   * @ordered
   */
  protected String atrib = ATRIB_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtribImpl()
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
    return GoPackage.Literals.ATRIB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar(String newVar)
  {
    String oldVar = var;
    var = newVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.ATRIB__VAR, oldVar, var));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.ATRIB__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAtrib()
  {
    return atrib;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtrib(String newAtrib)
  {
    String oldAtrib = atrib;
    atrib = newAtrib;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.ATRIB__ATRIB, oldAtrib, atrib));
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
      case GoPackage.ATRIB__VAR:
        return getVar();
      case GoPackage.ATRIB__TYPE:
        return getType();
      case GoPackage.ATRIB__ATRIB:
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
      case GoPackage.ATRIB__VAR:
        setVar((String)newValue);
        return;
      case GoPackage.ATRIB__TYPE:
        setType((String)newValue);
        return;
      case GoPackage.ATRIB__ATRIB:
        setAtrib((String)newValue);
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
      case GoPackage.ATRIB__VAR:
        setVar(VAR_EDEFAULT);
        return;
      case GoPackage.ATRIB__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case GoPackage.ATRIB__ATRIB:
        setAtrib(ATRIB_EDEFAULT);
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
      case GoPackage.ATRIB__VAR:
        return VAR_EDEFAULT == null ? var != null : !VAR_EDEFAULT.equals(var);
      case GoPackage.ATRIB__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case GoPackage.ATRIB__ATRIB:
        return ATRIB_EDEFAULT == null ? atrib != null : !ATRIB_EDEFAULT.equals(atrib);
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
    result.append(" (var: ");
    result.append(var);
    result.append(", type: ");
    result.append(type);
    result.append(", atrib: ");
    result.append(atrib);
    result.append(')');
    return result.toString();
  }

} //AtribImpl
