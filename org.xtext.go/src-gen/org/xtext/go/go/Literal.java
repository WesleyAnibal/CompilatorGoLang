/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go.go;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.go.go.Literal#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.go.go.GoPackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends Expression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(org.xtext.go.go.Boolean)
   * @see org.xtext.go.go.GoPackage#getLiteral_Value()
   * @model containment="true"
   * @generated
   */
  org.xtext.go.go.Boolean getValue();

  /**
   * Sets the value of the '{@link org.xtext.go.go.Literal#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(org.xtext.go.go.Boolean value);

} // Literal
