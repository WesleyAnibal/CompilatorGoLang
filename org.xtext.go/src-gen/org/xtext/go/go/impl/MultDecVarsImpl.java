/**
 * generated by Xtext 2.13.0
 */
package org.xtext.go.go.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.go.go.GoPackage;
import org.xtext.go.go.MultDecVars;
import org.xtext.go.go.TypeValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mult Dec Vars</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.go.impl.MultDecVarsImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.go.go.impl.MultDecVarsImpl#getTypw <em>Typw</em>}</li>
 *   <li>{@link org.xtext.go.go.impl.MultDecVarsImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultDecVarsImpl extends GreetingImpl implements MultDecVars
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
   * The cached value of the '{@link #getTypw() <em>Typw</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypw()
   * @generated
   * @ordered
   */
  protected TypeValue typw;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultDecVarsImpl()
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
    return GoPackage.Literals.MULT_DEC_VARS;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.MULT_DEC_VARS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeValue getTypw()
  {
    return typw;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypw(TypeValue newTypw, NotificationChain msgs)
  {
    TypeValue oldTypw = typw;
    typw = newTypw;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.MULT_DEC_VARS__TYPW, oldTypw, newTypw);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypw(TypeValue newTypw)
  {
    if (newTypw != typw)
    {
      NotificationChain msgs = null;
      if (typw != null)
        msgs = ((InternalEObject)typw).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.MULT_DEC_VARS__TYPW, null, msgs);
      if (newTypw != null)
        msgs = ((InternalEObject)newTypw).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.MULT_DEC_VARS__TYPW, null, msgs);
      msgs = basicSetTypw(newTypw, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.MULT_DEC_VARS__TYPW, newTypw, newTypw));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.MULT_DEC_VARS__VALUE, oldValue, value));
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
      case GoPackage.MULT_DEC_VARS__TYPW:
        return basicSetTypw(null, msgs);
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
      case GoPackage.MULT_DEC_VARS__NAME:
        return getName();
      case GoPackage.MULT_DEC_VARS__TYPW:
        return getTypw();
      case GoPackage.MULT_DEC_VARS__VALUE:
        return getValue();
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
      case GoPackage.MULT_DEC_VARS__NAME:
        setName((String)newValue);
        return;
      case GoPackage.MULT_DEC_VARS__TYPW:
        setTypw((TypeValue)newValue);
        return;
      case GoPackage.MULT_DEC_VARS__VALUE:
        setValue((String)newValue);
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
      case GoPackage.MULT_DEC_VARS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GoPackage.MULT_DEC_VARS__TYPW:
        setTypw((TypeValue)null);
        return;
      case GoPackage.MULT_DEC_VARS__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case GoPackage.MULT_DEC_VARS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GoPackage.MULT_DEC_VARS__TYPW:
        return typw != null;
      case GoPackage.MULT_DEC_VARS__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //MultDecVarsImpl
