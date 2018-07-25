/**
 * generated by Xtext 2.14.0
 */
package org.xtext.go.go;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atrib Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.go.go.AtribVar#getVars <em>Vars</em>}</li>
 *   <li>{@link org.xtext.go.go.AtribVar#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.go.go.AtribVar#getAtrb <em>Atrb</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.go.go.GoPackage#getAtribVar()
 * @model
 * @generated
 */
public interface AtribVar extends EObject
{
  /**
   * Returns the value of the '<em><b>Vars</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' attribute list.
   * @see org.xtext.go.go.GoPackage#getAtribVar_Vars()
   * @model unique="false"
   * @generated
   */
  EList<String> getVars();

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.xtext.go.go.GoPackage#getAtribVar_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.xtext.go.go.AtribVar#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

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
   * @see org.xtext.go.go.GoPackage#getAtribVar_Atrb()
   * @model containment="true"
   * @generated
   */
  EList<Atrib_Aux> getAtrb();

} // AtribVar
