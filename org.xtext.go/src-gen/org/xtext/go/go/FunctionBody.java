/**
 * generated by Xtext 2.13.0
 */
package org.xtext.go.go;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.go.FunctionBody#getArgs <em>Args</em>}</li>
 *   <li>{@link org.xtext.go.go.FunctionBody#getRet <em>Ret</em>}</li>
 * </ul>
 *
 * @see org.xtext.go.go.GoPackage#getFunctionBody()
 * @model
 * @generated
 */
public interface FunctionBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.go.go.Greeting}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see org.xtext.go.go.GoPackage#getFunctionBody_Args()
   * @model containment="true"
   * @generated
   */
  EList<Greeting> getArgs();

  /**
   * Returns the value of the '<em><b>Ret</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ret</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ret</em>' containment reference.
   * @see #setRet(FunctionReturn)
   * @see org.xtext.go.go.GoPackage#getFunctionBody_Ret()
   * @model containment="true"
   * @generated
   */
  FunctionReturn getRet();

  /**
   * Sets the value of the '{@link org.xtext.go.go.FunctionBody#getRet <em>Ret</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ret</em>' containment reference.
   * @see #getRet()
   * @generated
   */
  void setRet(FunctionReturn value);

} // FunctionBody
