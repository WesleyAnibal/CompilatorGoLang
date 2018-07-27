/**
 * generated by Xtext 2.13.0
 */
package org.xtext.go.go;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Func</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.go.go.CallFunc#getNameFunc <em>Name Func</em>}</li>
 *   <li>{@link org.xtext.go.go.CallFunc#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @see org.xtext.go.go.GoPackage#getCallFunc()
 * @model
 * @generated
 */
public interface CallFunc extends Greeting, Atrib_Aux
{
  /**
   * Returns the value of the '<em><b>Name Func</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Func</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Func</em>' attribute.
   * @see #setNameFunc(String)
   * @see org.xtext.go.go.GoPackage#getCallFunc_NameFunc()
   * @model
   * @generated
   */
  String getNameFunc();

  /**
   * Sets the value of the '{@link org.xtext.go.go.CallFunc#getNameFunc <em>Name Func</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Func</em>' attribute.
   * @see #getNameFunc()
   * @generated
   */
  void setNameFunc(String value);

  /**
   * Returns the value of the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' containment reference.
   * @see #setParam(Params)
   * @see org.xtext.go.go.GoPackage#getCallFunc_Param()
   * @model containment="true"
   * @generated
   */
  Params getParam();

  /**
   * Sets the value of the '{@link org.xtext.go.go.CallFunc#getParam <em>Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' containment reference.
   * @see #getParam()
   * @generated
   */
  void setParam(Params value);

} // CallFunc
