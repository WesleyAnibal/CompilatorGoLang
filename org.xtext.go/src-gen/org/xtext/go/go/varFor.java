/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go.go;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>var For</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.go.go.varFor#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.go.go.varFor#getAtrb <em>Atrb</em>}</li>
 *   <li>{@link org.xtext.go.go.varFor#getRight <em>Right</em>}</li>
 *   <li>{@link org.xtext.go.go.varFor#getLeft <em>Left</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.go.go.GoPackage#getvarFor()
 * @model
 * @generated
 */
public interface varFor extends CallFor
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' attribute list.
   * @see org.xtext.go.go.GoPackage#getvarFor_Var()
   * @model unique="false"
   * @generated
   */
  EList<String> getVar();

  /**
   * Returns the value of the '<em><b>Atrb</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.go.go.Atrib_Aux}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atrb</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atrb</em>' containment reference list.
   * @see org.xtext.go.go.GoPackage#getvarFor_Atrb()
   * @model containment="true"
   * @generated
   */
  EList<Atrib_Aux> getAtrb();

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see org.xtext.go.go.GoPackage#getvarFor_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link org.xtext.go.go.varFor#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see org.xtext.go.go.GoPackage#getvarFor_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link org.xtext.go.go.varFor#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

} // varFor
