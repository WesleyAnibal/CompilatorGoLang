/**
 * generated by Xtext 2.13.0
 */
package org.xtext.go.go.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.go.go.DecVar;
import org.xtext.go.go.GoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dec Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.go.impl.DecVarImpl#getVars <em>Vars</em>}</li>
 *   <li>{@link org.xtext.go.go.impl.DecVarImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.go.go.impl.DecVarImpl#getAtrb <em>Atrb</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecVarImpl extends GreetingImpl implements DecVar
{
  /**
   * The cached value of the '{@link #getVars() <em>Vars</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVars()
   * @generated
   * @ordered
   */
  protected EList<String> vars;

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
   * The cached value of the '{@link #getAtrb() <em>Atrb</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtrb()
   * @generated
   * @ordered
   */
  protected EList<String> atrb;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DecVarImpl()
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
    return GoPackage.Literals.DEC_VAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getVars()
  {
    if (vars == null)
    {
      vars = new EDataTypeEList<String>(String.class, this, GoPackage.DEC_VAR__VARS);
    }
    return vars;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.DEC_VAR__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getAtrb()
  {
    if (atrb == null)
    {
      atrb = new EDataTypeEList<String>(String.class, this, GoPackage.DEC_VAR__ATRB);
    }
    return atrb;
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
      case GoPackage.DEC_VAR__VARS:
        return getVars();
      case GoPackage.DEC_VAR__TYPE:
        return getType();
      case GoPackage.DEC_VAR__ATRB:
        return getAtrb();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GoPackage.DEC_VAR__VARS:
        getVars().clear();
        getVars().addAll((Collection<? extends String>)newValue);
        return;
      case GoPackage.DEC_VAR__TYPE:
        setType((String)newValue);
        return;
      case GoPackage.DEC_VAR__ATRB:
        getAtrb().clear();
        getAtrb().addAll((Collection<? extends String>)newValue);
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
      case GoPackage.DEC_VAR__VARS:
        getVars().clear();
        return;
      case GoPackage.DEC_VAR__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case GoPackage.DEC_VAR__ATRB:
        getAtrb().clear();
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
      case GoPackage.DEC_VAR__VARS:
        return vars != null && !vars.isEmpty();
      case GoPackage.DEC_VAR__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case GoPackage.DEC_VAR__ATRB:
        return atrb != null && !atrb.isEmpty();
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
    result.append(" (vars: ");
    result.append(vars);
    result.append(", type: ");
    result.append(type);
    result.append(", atrb: ");
    result.append(atrb);
    result.append(')');
    return result.toString();
  }

} //DecVarImpl
