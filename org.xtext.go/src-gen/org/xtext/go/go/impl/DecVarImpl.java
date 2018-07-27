/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go.go.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.go.go.Atrib;
import org.xtext.go.go.AtribVar;
import org.xtext.go.go.DecVar;
import org.xtext.go.go.Decl;
import org.xtext.go.go.GoPackage;
import org.xtext.go.go.ReAtrib;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dec Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.go.go.impl.DecVarImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.xtext.go.go.impl.DecVarImpl#getAtribuicao <em>Atribuicao</em>}</li>
 *   <li>{@link org.xtext.go.go.impl.DecVarImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link org.xtext.go.go.impl.DecVarImpl#getReassignment <em>Reassignment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecVarImpl extends GreetingImpl implements DecVar
{
  /**
   * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaration()
   * @generated
   * @ordered
   */
  protected Decl declaration;

  /**
   * The cached value of the '{@link #getAtribuicao() <em>Atribuicao</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtribuicao()
   * @generated
   * @ordered
   */
  protected Atrib atribuicao;

  /**
   * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignment()
   * @generated
   * @ordered
   */
  protected AtribVar assignment;

  /**
   * The cached value of the '{@link #getReassignment() <em>Reassignment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReassignment()
   * @generated
   * @ordered
   */
  protected ReAtrib reassignment;

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
  public Decl getDeclaration()
  {
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclaration(Decl newDeclaration, NotificationChain msgs)
  {
    Decl oldDeclaration = declaration;
    declaration = newDeclaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.DEC_VAR__DECLARATION, oldDeclaration, newDeclaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaration(Decl newDeclaration)
  {
    if (newDeclaration != declaration)
    {
      NotificationChain msgs = null;
      if (declaration != null)
        msgs = ((InternalEObject)declaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.DEC_VAR__DECLARATION, null, msgs);
      if (newDeclaration != null)
        msgs = ((InternalEObject)newDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.DEC_VAR__DECLARATION, null, msgs);
      msgs = basicSetDeclaration(newDeclaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.DEC_VAR__DECLARATION, newDeclaration, newDeclaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atrib getAtribuicao()
  {
    return atribuicao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAtribuicao(Atrib newAtribuicao, NotificationChain msgs)
  {
    Atrib oldAtribuicao = atribuicao;
    atribuicao = newAtribuicao;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.DEC_VAR__ATRIBUICAO, oldAtribuicao, newAtribuicao);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtribuicao(Atrib newAtribuicao)
  {
    if (newAtribuicao != atribuicao)
    {
      NotificationChain msgs = null;
      if (atribuicao != null)
        msgs = ((InternalEObject)atribuicao).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.DEC_VAR__ATRIBUICAO, null, msgs);
      if (newAtribuicao != null)
        msgs = ((InternalEObject)newAtribuicao).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.DEC_VAR__ATRIBUICAO, null, msgs);
      msgs = basicSetAtribuicao(newAtribuicao, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.DEC_VAR__ATRIBUICAO, newAtribuicao, newAtribuicao));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtribVar getAssignment()
  {
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssignment(AtribVar newAssignment, NotificationChain msgs)
  {
    AtribVar oldAssignment = assignment;
    assignment = newAssignment;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.DEC_VAR__ASSIGNMENT, oldAssignment, newAssignment);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignment(AtribVar newAssignment)
  {
    if (newAssignment != assignment)
    {
      NotificationChain msgs = null;
      if (assignment != null)
        msgs = ((InternalEObject)assignment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.DEC_VAR__ASSIGNMENT, null, msgs);
      if (newAssignment != null)
        msgs = ((InternalEObject)newAssignment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.DEC_VAR__ASSIGNMENT, null, msgs);
      msgs = basicSetAssignment(newAssignment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.DEC_VAR__ASSIGNMENT, newAssignment, newAssignment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReAtrib getReassignment()
  {
    return reassignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReassignment(ReAtrib newReassignment, NotificationChain msgs)
  {
    ReAtrib oldReassignment = reassignment;
    reassignment = newReassignment;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.DEC_VAR__REASSIGNMENT, oldReassignment, newReassignment);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReassignment(ReAtrib newReassignment)
  {
    if (newReassignment != reassignment)
    {
      NotificationChain msgs = null;
      if (reassignment != null)
        msgs = ((InternalEObject)reassignment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.DEC_VAR__REASSIGNMENT, null, msgs);
      if (newReassignment != null)
        msgs = ((InternalEObject)newReassignment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.DEC_VAR__REASSIGNMENT, null, msgs);
      msgs = basicSetReassignment(newReassignment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.DEC_VAR__REASSIGNMENT, newReassignment, newReassignment));
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
      case GoPackage.DEC_VAR__DECLARATION:
        return basicSetDeclaration(null, msgs);
      case GoPackage.DEC_VAR__ATRIBUICAO:
        return basicSetAtribuicao(null, msgs);
      case GoPackage.DEC_VAR__ASSIGNMENT:
        return basicSetAssignment(null, msgs);
      case GoPackage.DEC_VAR__REASSIGNMENT:
        return basicSetReassignment(null, msgs);
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
      case GoPackage.DEC_VAR__DECLARATION:
        return getDeclaration();
      case GoPackage.DEC_VAR__ATRIBUICAO:
        return getAtribuicao();
      case GoPackage.DEC_VAR__ASSIGNMENT:
        return getAssignment();
      case GoPackage.DEC_VAR__REASSIGNMENT:
        return getReassignment();
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
      case GoPackage.DEC_VAR__DECLARATION:
        setDeclaration((Decl)newValue);
        return;
      case GoPackage.DEC_VAR__ATRIBUICAO:
        setAtribuicao((Atrib)newValue);
        return;
      case GoPackage.DEC_VAR__ASSIGNMENT:
        setAssignment((AtribVar)newValue);
        return;
      case GoPackage.DEC_VAR__REASSIGNMENT:
        setReassignment((ReAtrib)newValue);
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
      case GoPackage.DEC_VAR__DECLARATION:
        setDeclaration((Decl)null);
        return;
      case GoPackage.DEC_VAR__ATRIBUICAO:
        setAtribuicao((Atrib)null);
        return;
      case GoPackage.DEC_VAR__ASSIGNMENT:
        setAssignment((AtribVar)null);
        return;
      case GoPackage.DEC_VAR__REASSIGNMENT:
        setReassignment((ReAtrib)null);
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
      case GoPackage.DEC_VAR__DECLARATION:
        return declaration != null;
      case GoPackage.DEC_VAR__ATRIBUICAO:
        return atribuicao != null;
      case GoPackage.DEC_VAR__ASSIGNMENT:
        return assignment != null;
      case GoPackage.DEC_VAR__REASSIGNMENT:
        return reassignment != null;
    }
    return super.eIsSet(featureID);
  }

} //DecVarImpl
