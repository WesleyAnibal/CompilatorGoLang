/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Re Atrib</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.go.go.ReAtrib#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.go.go.ReAtrib#getAtrib <em>Atrib</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.go.go.GoPackage#getReAtrib()
 * @model
 * @generated
 */
public interface ReAtrib extends EObject
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
   * @see org.xtext.go.go.GoPackage#getReAtrib_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.go.go.ReAtrib#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Atrib</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atrib</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atrib</em>' containment reference.
   * @see #setAtrib(Atrib_Aux)
   * @see org.xtext.go.go.GoPackage#getReAtrib_Atrib()
   * @model containment="true"
   * @generated
   */
  Atrib_Aux getAtrib();

  /**
   * Sets the value of the '{@link org.xtext.go.go.ReAtrib#getAtrib <em>Atrib</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atrib</em>' containment reference.
   * @see #getAtrib()
   * @generated
   */
  void setAtrib(Atrib_Aux value);

} // ReAtrib
