/**
 * generated by Xtext 2.13.0
 */
package org.xtext.go.go;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dec Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.go.DecVar#getVars <em>Vars</em>}</li>
 *   <li>{@link org.xtext.go.go.DecVar#getAtrb <em>Atrb</em>}</li>
 * </ul>
 *
 * @see org.xtext.go.go.GoPackage#getDecVar()
 * @model
 * @generated
 */
public interface DecVar extends Greeting
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
   * @see org.xtext.go.go.GoPackage#getDecVar_Vars()
   * @model unique="false"
   * @generated
   */
  EList<String> getVars();

  /**
   * Returns the value of the '<em><b>Atrb</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atrb</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atrb</em>' attribute list.
   * @see org.xtext.go.go.GoPackage#getDecVar_Atrb()
   * @model unique="false"
   * @generated
   */
  EList<String> getAtrb();

} // DecVar