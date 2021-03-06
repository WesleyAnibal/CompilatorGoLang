/**
 * generated by Xtext 2.13.0
 */
package org.xtext.go.go;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Params</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.go.Params#getParams <em>Params</em>}</li>
 *   <li>{@link org.xtext.go.go.Params#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.go.go.GoPackage#getParams()
 * @model
 * @generated
 */
public interface Params extends EObject
{
  /**
   * Returns the value of the '<em><b>Params</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' attribute list.
   * @see org.xtext.go.go.GoPackage#getParams_Params()
   * @model unique="false"
   * @generated
   */
  EList<String> getParams();

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute list.
   * @see org.xtext.go.go.GoPackage#getParams_Type()
   * @model unique="false"
   * @generated
   */
  EList<String> getType();

} // Params
