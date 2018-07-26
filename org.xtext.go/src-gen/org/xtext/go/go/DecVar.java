/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go.go;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dec Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.go.go.DecVar#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.xtext.go.go.DecVar#getAtribuicao <em>Atribuicao</em>}</li>
 *   <li>{@link org.xtext.go.go.DecVar#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link org.xtext.go.go.DecVar#getReassignment <em>Reassignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.go.go.GoPackage#getDecVar()
 * @model
 * @generated
 */
public interface DecVar extends Greeting
{
  /**
   * Returns the value of the '<em><b>Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaration</em>' containment reference.
   * @see #setDeclaration(Decl)
   * @see org.xtext.go.go.GoPackage#getDecVar_Declaration()
   * @model containment="true"
   * @generated
   */
  Decl getDeclaration();

  /**
   * Sets the value of the '{@link org.xtext.go.go.DecVar#getDeclaration <em>Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaration</em>' containment reference.
   * @see #getDeclaration()
   * @generated
   */
  void setDeclaration(Decl value);

  /**
   * Returns the value of the '<em><b>Atribuicao</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atribuicao</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atribuicao</em>' containment reference.
   * @see #setAtribuicao(Atrib)
   * @see org.xtext.go.go.GoPackage#getDecVar_Atribuicao()
   * @model containment="true"
   * @generated
   */
  Atrib getAtribuicao();

  /**
   * Sets the value of the '{@link org.xtext.go.go.DecVar#getAtribuicao <em>Atribuicao</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atribuicao</em>' containment reference.
   * @see #getAtribuicao()
   * @generated
   */
  void setAtribuicao(Atrib value);

  /**
   * Returns the value of the '<em><b>Assignment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignment</em>' containment reference.
   * @see #setAssignment(AtribVar)
   * @see org.xtext.go.go.GoPackage#getDecVar_Assignment()
   * @model containment="true"
   * @generated
   */
  AtribVar getAssignment();

  /**
   * Sets the value of the '{@link org.xtext.go.go.DecVar#getAssignment <em>Assignment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignment</em>' containment reference.
   * @see #getAssignment()
   * @generated
   */
  void setAssignment(AtribVar value);

  /**
   * Returns the value of the '<em><b>Reassignment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reassignment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reassignment</em>' containment reference.
   * @see #setReassignment(ReAtrib)
   * @see org.xtext.go.go.GoPackage#getDecVar_Reassignment()
   * @model containment="true"
   * @generated
   */
  ReAtrib getReassignment();

  /**
   * Sets the value of the '{@link org.xtext.go.go.DecVar#getReassignment <em>Reassignment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reassignment</em>' containment reference.
   * @see #getReassignment()
   * @generated
   */
  void setReassignment(ReAtrib value);

} // DecVar
