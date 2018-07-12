/**
 * generated by Xtext 2.13.0
 */
package org.xtext.go.go.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.go.go.Cases;
import org.xtext.go.go.GoPackage;
import org.xtext.go.go.Greeting;
import org.xtext.go.go.SwitchCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.go.impl.SwitchCaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.go.go.impl.SwitchCaseImpl#getCas <em>Cas</em>}</li>
 *   <li>{@link org.xtext.go.go.impl.SwitchCaseImpl#getK <em>K</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchCaseImpl extends GreetingImpl implements SwitchCase
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
   * The cached value of the '{@link #getCas() <em>Cas</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCas()
   * @generated
   * @ordered
   */
  protected Cases cas;

  /**
   * The cached value of the '{@link #getK() <em>K</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getK()
   * @generated
   * @ordered
   */
  protected Greeting k;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SwitchCaseImpl()
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
    return GoPackage.Literals.SWITCH_CASE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.SWITCH_CASE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cases getCas()
  {
    return cas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCas(Cases newCas, NotificationChain msgs)
  {
    Cases oldCas = cas;
    cas = newCas;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.SWITCH_CASE__CAS, oldCas, newCas);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCas(Cases newCas)
  {
    if (newCas != cas)
    {
      NotificationChain msgs = null;
      if (cas != null)
        msgs = ((InternalEObject)cas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.SWITCH_CASE__CAS, null, msgs);
      if (newCas != null)
        msgs = ((InternalEObject)newCas).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.SWITCH_CASE__CAS, null, msgs);
      msgs = basicSetCas(newCas, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.SWITCH_CASE__CAS, newCas, newCas));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Greeting getK()
  {
    return k;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetK(Greeting newK, NotificationChain msgs)
  {
    Greeting oldK = k;
    k = newK;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.SWITCH_CASE__K, oldK, newK);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setK(Greeting newK)
  {
    if (newK != k)
    {
      NotificationChain msgs = null;
      if (k != null)
        msgs = ((InternalEObject)k).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.SWITCH_CASE__K, null, msgs);
      if (newK != null)
        msgs = ((InternalEObject)newK).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.SWITCH_CASE__K, null, msgs);
      msgs = basicSetK(newK, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.SWITCH_CASE__K, newK, newK));
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
      case GoPackage.SWITCH_CASE__CAS:
        return basicSetCas(null, msgs);
      case GoPackage.SWITCH_CASE__K:
        return basicSetK(null, msgs);
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
      case GoPackage.SWITCH_CASE__NAME:
        return getName();
      case GoPackage.SWITCH_CASE__CAS:
        return getCas();
      case GoPackage.SWITCH_CASE__K:
        return getK();
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
      case GoPackage.SWITCH_CASE__NAME:
        setName((String)newValue);
        return;
      case GoPackage.SWITCH_CASE__CAS:
        setCas((Cases)newValue);
        return;
      case GoPackage.SWITCH_CASE__K:
        setK((Greeting)newValue);
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
      case GoPackage.SWITCH_CASE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GoPackage.SWITCH_CASE__CAS:
        setCas((Cases)null);
        return;
      case GoPackage.SWITCH_CASE__K:
        setK((Greeting)null);
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
      case GoPackage.SWITCH_CASE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GoPackage.SWITCH_CASE__CAS:
        return cas != null;
      case GoPackage.SWITCH_CASE__K:
        return k != null;
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

} //SwitchCaseImpl