/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go.go;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numbers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.go.go.Numbers#getInt <em>Int</em>}</li>
 *   <li>{@link org.xtext.go.go.Numbers#getD <em>D</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.go.go.GoPackage#getNumbers()
 * @model
 * @generated
 */
public interface Numbers extends TypeValue, Expression
{
  /**
   * Returns the value of the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int</em>' attribute.
   * @see #setInt(int)
   * @see org.xtext.go.go.GoPackage#getNumbers_Int()
   * @model
   * @generated
   */
  int getInt();

  /**
   * Sets the value of the '{@link org.xtext.go.go.Numbers#getInt <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int</em>' attribute.
   * @see #getInt()
   * @generated
   */
  void setInt(int value);

  /**
   * Returns the value of the '<em><b>D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>D</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>D</em>' containment reference.
   * @see #setD(org.xtext.go.go.Double)
   * @see org.xtext.go.go.GoPackage#getNumbers_D()
   * @model containment="true"
   * @generated
   */
  org.xtext.go.go.Double getD();

  /**
   * Sets the value of the '{@link org.xtext.go.go.Numbers#getD <em>D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>D</em>' containment reference.
   * @see #getD()
   * @generated
   */
  void setD(org.xtext.go.go.Double value);

} // Numbers
