/**
 * generated by Xtext 2.13.0
 */
package org.xtext.go.go;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.go.Variable#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.go.go.Variable#getCas <em>Cas</em>}</li>
 *   <li>{@link org.xtext.go.go.Variable#getK <em>K</em>}</li>
 * </ul>
 *
 * @see org.xtext.go.go.GoPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Greeting, Atrib_Aux, SwitchCase, OperationsOneEquals, operationsOne, Expression
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.go.go.GoPackage#getVariable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.go.go.Variable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Cas</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cas</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cas</em>' containment reference.
   * @see #setCas(Cases)
   * @see org.xtext.go.go.GoPackage#getVariable_Cas()
   * @model containment="true"
   * @generated
   */
  Cases getCas();

  /**
   * Sets the value of the '{@link org.xtext.go.go.Variable#getCas <em>Cas</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cas</em>' containment reference.
   * @see #getCas()
   * @generated
   */
  void setCas(Cases value);

  /**
   * Returns the value of the '<em><b>K</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>K</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>K</em>' containment reference.
   * @see #setK(Greeting)
   * @see org.xtext.go.go.GoPackage#getVariable_K()
   * @model containment="true"
   * @generated
   */
  Greeting getK();

  /**
   * Sets the value of the '{@link org.xtext.go.go.Variable#getK <em>K</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>K</em>' containment reference.
   * @see #getK()
   * @generated
   */
  void setK(Greeting value);

} // Variable
