/**
 * generated by Xtext 2.13.0
 */
package org.xtext.go.go;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.go.Expression#getBoolean <em>Boolean</em>}</li>
 *   <li>{@link org.xtext.go.go.Expression#getSum <em>Sum</em>}</li>
 *   <li>{@link org.xtext.go.go.Expression#getSub <em>Sub</em>}</li>
 * </ul>
 *
 * @see org.xtext.go.go.GoPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends varFor
{
  /**
   * Returns the value of the '<em><b>Boolean</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boolean</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boolean</em>' containment reference.
   * @see #setBoolean(Expression)
   * @see org.xtext.go.go.GoPackage#getExpression_Boolean()
   * @model containment="true"
   * @generated
   */
  Expression getBoolean();

  /**
   * Sets the value of the '{@link org.xtext.go.go.Expression#getBoolean <em>Boolean</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boolean</em>' containment reference.
   * @see #getBoolean()
   * @generated
   */
  void setBoolean(Expression value);

  /**
   * Returns the value of the '<em><b>Sum</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sum</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sum</em>' containment reference.
   * @see #setSum(Expression)
   * @see org.xtext.go.go.GoPackage#getExpression_Sum()
   * @model containment="true"
   * @generated
   */
  Expression getSum();

  /**
   * Sets the value of the '{@link org.xtext.go.go.Expression#getSum <em>Sum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sum</em>' containment reference.
   * @see #getSum()
   * @generated
   */
  void setSum(Expression value);

  /**
   * Returns the value of the '<em><b>Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub</em>' containment reference.
   * @see #setSub(Expression)
   * @see org.xtext.go.go.GoPackage#getExpression_Sub()
   * @model containment="true"
   * @generated
   */
  Expression getSub();

  /**
   * Sets the value of the '{@link org.xtext.go.go.Expression#getSub <em>Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub</em>' containment reference.
   * @see #getSub()
   * @generated
   */
  void setSub(Expression value);

} // Expression
