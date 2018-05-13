/**
 * generated by Xtext 2.13.0
 */
package org.xtext.go.go;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.go.go.GoFactory
 * @model kind="package"
 * @generated
 */
public interface GoPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "go";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/go/Go";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "go";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GoPackage eINSTANCE = org.xtext.go.go.impl.GoPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.go.go.impl.GoImpl <em>Go</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.go.go.impl.GoImpl
   * @see org.xtext.go.go.impl.GoPackageImpl#getGo()
   * @generated
   */
  int GO = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GO__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Go</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.go.go.impl.GreetingImpl <em>Greeting</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.go.go.impl.GreetingImpl
   * @see org.xtext.go.go.impl.GoPackageImpl#getGreeting()
   * @generated
   */
  int GREETING = 1;

  /**
   * The number of structural features of the '<em>Greeting</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREETING_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.go.go.impl.DecVarImpl <em>Dec Var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.go.go.impl.DecVarImpl
   * @see org.xtext.go.go.impl.GoPackageImpl#getDecVar()
   * @generated
   */
  int DEC_VAR = 2;

  /**
   * The feature id for the '<em><b>Vars</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEC_VAR__VARS = GREETING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Atrb</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEC_VAR__ATRB = GREETING_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Dec Var</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEC_VAR_FEATURE_COUNT = GREETING_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.go.go.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.go.go.impl.ConditionImpl
   * @see org.xtext.go.go.impl.GoPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 3;

  /**
   * The feature id for the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__IF = GREETING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elseif</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__ELSEIF = GREETING_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__ELSE = GREETING_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = GREETING_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.go.go.impl.ElseIfConditionImpl <em>Else If Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.go.go.impl.ElseIfConditionImpl
   * @see org.xtext.go.go.impl.GoPackageImpl#getElseIfCondition()
   * @generated
   */
  int ELSE_IF_CONDITION = 5;

  /**
   * The number of structural features of the '<em>Else If Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_IF_CONDITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.go.go.impl.IfConditionImpl <em>If Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.go.go.impl.IfConditionImpl
   * @see org.xtext.go.go.impl.GoPackageImpl#getIfCondition()
   * @generated
   */
  int IF_CONDITION = 4;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_CONDITION__COND = ELSE_IF_CONDITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_CONDITION__THEN = ELSE_IF_CONDITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>If Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_CONDITION_FEATURE_COUNT = ELSE_IF_CONDITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.go.go.impl.ElseConditionImpl <em>Else Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.go.go.impl.ElseConditionImpl
   * @see org.xtext.go.go.impl.GoPackageImpl#getElseCondition()
   * @generated
   */
  int ELSE_CONDITION = 6;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_CONDITION__THEN = 0;

  /**
   * The number of structural features of the '<em>Else Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_CONDITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.go.go.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.go.go.impl.ExpressionImpl
   * @see org.xtext.go.go.impl.GoPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 7;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.go.go.impl.DecFuncImpl <em>Dec Func</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.go.go.impl.DecFuncImpl
   * @see org.xtext.go.go.impl.GoPackageImpl#getDecFunc()
   * @generated
   */
  int DEC_FUNC = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEC_FUNC__NAME = GREETING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEC_FUNC__PARAMETER = GREETING_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEC_FUNC__ARGS = GREETING_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Dec Func</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEC_FUNC_FEATURE_COUNT = GREETING_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.go.go.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.go.go.impl.DataTypeImpl
   * @see org.xtext.go.go.impl.GoPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__NAME = GREETING_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = GREETING_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.go.go.impl.OrExpressionImpl <em>Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.go.go.impl.OrExpressionImpl
   * @see org.xtext.go.go.impl.GoPackageImpl#getOrExpression()
   * @generated
   */
  int OR_EXPRESSION = 10;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.go.go.impl.AndExpressionImpl <em>And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.go.go.impl.AndExpressionImpl
   * @see org.xtext.go.go.impl.GoPackageImpl#getAndExpression()
   * @generated
   */
  int AND_EXPRESSION = 11;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.go.go.impl.ComparisonExpressionImpl <em>Comparison Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.go.go.impl.ComparisonExpressionImpl
   * @see org.xtext.go.go.impl.GoPackageImpl#getComparisonExpression()
   * @generated
   */
  int COMPARISON_EXPRESSION = 12;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Comparison Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.go.go.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.go.go.impl.LiteralImpl
   * @see org.xtext.go.go.impl.GoPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.xtext.go.go.Go <em>Go</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Go</em>'.
   * @see org.xtext.go.go.Go
   * @generated
   */
  EClass getGo();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.go.go.Go#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.go.go.Go#getElements()
   * @see #getGo()
   * @generated
   */
  EReference getGo_Elements();

  /**
   * Returns the meta object for class '{@link org.xtext.go.go.Greeting <em>Greeting</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Greeting</em>'.
   * @see org.xtext.go.go.Greeting
   * @generated
   */
  EClass getGreeting();

  /**
   * Returns the meta object for class '{@link org.xtext.go.go.DecVar <em>Dec Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dec Var</em>'.
   * @see org.xtext.go.go.DecVar
   * @generated
   */
  EClass getDecVar();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.go.go.DecVar#getVars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Vars</em>'.
   * @see org.xtext.go.go.DecVar#getVars()
   * @see #getDecVar()
   * @generated
   */
  EAttribute getDecVar_Vars();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.go.go.DecVar#getAtrb <em>Atrb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Atrb</em>'.
   * @see org.xtext.go.go.DecVar#getAtrb()
   * @see #getDecVar()
   * @generated
   */
  EAttribute getDecVar_Atrb();

  /**
   * Returns the meta object for class '{@link org.xtext.go.go.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see org.xtext.go.go.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.go.go.Condition#getIf <em>If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If</em>'.
   * @see org.xtext.go.go.Condition#getIf()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_If();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.go.go.Condition#getElseif <em>Elseif</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elseif</em>'.
   * @see org.xtext.go.go.Condition#getElseif()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Elseif();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.go.go.Condition#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see org.xtext.go.go.Condition#getElse()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Else();

  /**
   * Returns the meta object for class '{@link org.xtext.go.go.IfCondition <em>If Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Condition</em>'.
   * @see org.xtext.go.go.IfCondition
   * @generated
   */
  EClass getIfCondition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.go.go.IfCondition#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see org.xtext.go.go.IfCondition#getCond()
   * @see #getIfCondition()
   * @generated
   */
  EReference getIfCondition_Cond();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.go.go.IfCondition#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see org.xtext.go.go.IfCondition#getThen()
   * @see #getIfCondition()
   * @generated
   */
  EReference getIfCondition_Then();

  /**
   * Returns the meta object for class '{@link org.xtext.go.go.ElseIfCondition <em>Else If Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Else If Condition</em>'.
   * @see org.xtext.go.go.ElseIfCondition
   * @generated
   */
  EClass getElseIfCondition();

  /**
   * Returns the meta object for class '{@link org.xtext.go.go.ElseCondition <em>Else Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Else Condition</em>'.
   * @see org.xtext.go.go.ElseCondition
   * @generated
   */
  EClass getElseCondition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.go.go.ElseCondition#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see org.xtext.go.go.ElseCondition#getThen()
   * @see #getElseCondition()
   * @generated
   */
  EReference getElseCondition_Then();

  /**
   * Returns the meta object for class '{@link org.xtext.go.go.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.xtext.go.go.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.go.go.DecFunc <em>Dec Func</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dec Func</em>'.
   * @see org.xtext.go.go.DecFunc
   * @generated
   */
  EClass getDecFunc();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.go.go.DecFunc#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.go.go.DecFunc#getName()
   * @see #getDecFunc()
   * @generated
   */
  EAttribute getDecFunc_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.go.go.DecFunc#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parameter</em>'.
   * @see org.xtext.go.go.DecFunc#getParameter()
   * @see #getDecFunc()
   * @generated
   */
  EAttribute getDecFunc_Parameter();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.go.go.DecFunc#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.xtext.go.go.DecFunc#getArgs()
   * @see #getDecFunc()
   * @generated
   */
  EReference getDecFunc_Args();

  /**
   * Returns the meta object for class '{@link org.xtext.go.go.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see org.xtext.go.go.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.go.go.DataType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.go.go.DataType#getName()
   * @see #getDataType()
   * @generated
   */
  EAttribute getDataType_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.go.go.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Expression</em>'.
   * @see org.xtext.go.go.OrExpression
   * @generated
   */
  EClass getOrExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.go.go.OrExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.go.go.OrExpression#getLeft()
   * @see #getOrExpression()
   * @generated
   */
  EReference getOrExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.go.go.OrExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.go.go.OrExpression#getRight()
   * @see #getOrExpression()
   * @generated
   */
  EReference getOrExpression_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.go.go.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expression</em>'.
   * @see org.xtext.go.go.AndExpression
   * @generated
   */
  EClass getAndExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.go.go.AndExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.go.go.AndExpression#getLeft()
   * @see #getAndExpression()
   * @generated
   */
  EReference getAndExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.go.go.AndExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.go.go.AndExpression#getRight()
   * @see #getAndExpression()
   * @generated
   */
  EReference getAndExpression_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.go.go.ComparisonExpression <em>Comparison Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comparison Expression</em>'.
   * @see org.xtext.go.go.ComparisonExpression
   * @generated
   */
  EClass getComparisonExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.go.go.ComparisonExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.go.go.ComparisonExpression#getLeft()
   * @see #getComparisonExpression()
   * @generated
   */
  EReference getComparisonExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.go.go.ComparisonExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.xtext.go.go.ComparisonExpression#getOperator()
   * @see #getComparisonExpression()
   * @generated
   */
  EAttribute getComparisonExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.go.go.ComparisonExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.go.go.ComparisonExpression#getRight()
   * @see #getComparisonExpression()
   * @generated
   */
  EReference getComparisonExpression_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.go.go.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see org.xtext.go.go.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.go.go.Literal#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.go.go.Literal#getValue()
   * @see #getLiteral()
   * @generated
   */
  EAttribute getLiteral_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GoFactory getGoFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.go.go.impl.GoImpl <em>Go</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.go.go.impl.GoImpl
     * @see org.xtext.go.go.impl.GoPackageImpl#getGo()
     * @generated
     */
    EClass GO = eINSTANCE.getGo();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GO__ELEMENTS = eINSTANCE.getGo_Elements();

    /**
     * The meta object literal for the '{@link org.xtext.go.go.impl.GreetingImpl <em>Greeting</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.go.go.impl.GreetingImpl
     * @see org.xtext.go.go.impl.GoPackageImpl#getGreeting()
     * @generated
     */
    EClass GREETING = eINSTANCE.getGreeting();

    /**
     * The meta object literal for the '{@link org.xtext.go.go.impl.DecVarImpl <em>Dec Var</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.go.go.impl.DecVarImpl
     * @see org.xtext.go.go.impl.GoPackageImpl#getDecVar()
     * @generated
     */
    EClass DEC_VAR = eINSTANCE.getDecVar();

    /**
     * The meta object literal for the '<em><b>Vars</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEC_VAR__VARS = eINSTANCE.getDecVar_Vars();

    /**
     * The meta object literal for the '<em><b>Atrb</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEC_VAR__ATRB = eINSTANCE.getDecVar_Atrb();

    /**
     * The meta object literal for the '{@link org.xtext.go.go.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.go.go.impl.ConditionImpl
     * @see org.xtext.go.go.impl.GoPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__IF = eINSTANCE.getCondition_If();

    /**
     * The meta object literal for the '<em><b>Elseif</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__ELSEIF = eINSTANCE.getCondition_Elseif();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__ELSE = eINSTANCE.getCondition_Else();

    /**
     * The meta object literal for the '{@link org.xtext.go.go.impl.IfConditionImpl <em>If Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.go.go.impl.IfConditionImpl
     * @see org.xtext.go.go.impl.GoPackageImpl#getIfCondition()
     * @generated
     */
    EClass IF_CONDITION = eINSTANCE.getIfCondition();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_CONDITION__COND = eINSTANCE.getIfCondition_Cond();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_CONDITION__THEN = eINSTANCE.getIfCondition_Then();

    /**
     * The meta object literal for the '{@link org.xtext.go.go.impl.ElseIfConditionImpl <em>Else If Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.go.go.impl.ElseIfConditionImpl
     * @see org.xtext.go.go.impl.GoPackageImpl#getElseIfCondition()
     * @generated
     */
    EClass ELSE_IF_CONDITION = eINSTANCE.getElseIfCondition();

    /**
     * The meta object literal for the '{@link org.xtext.go.go.impl.ElseConditionImpl <em>Else Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.go.go.impl.ElseConditionImpl
     * @see org.xtext.go.go.impl.GoPackageImpl#getElseCondition()
     * @generated
     */
    EClass ELSE_CONDITION = eINSTANCE.getElseCondition();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELSE_CONDITION__THEN = eINSTANCE.getElseCondition_Then();

    /**
     * The meta object literal for the '{@link org.xtext.go.go.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.go.go.impl.ExpressionImpl
     * @see org.xtext.go.go.impl.GoPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.xtext.go.go.impl.DecFuncImpl <em>Dec Func</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.go.go.impl.DecFuncImpl
     * @see org.xtext.go.go.impl.GoPackageImpl#getDecFunc()
     * @generated
     */
    EClass DEC_FUNC = eINSTANCE.getDecFunc();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEC_FUNC__NAME = eINSTANCE.getDecFunc_Name();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEC_FUNC__PARAMETER = eINSTANCE.getDecFunc_Parameter();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEC_FUNC__ARGS = eINSTANCE.getDecFunc_Args();

    /**
     * The meta object literal for the '{@link org.xtext.go.go.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.go.go.impl.DataTypeImpl
     * @see org.xtext.go.go.impl.GoPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE__NAME = eINSTANCE.getDataType_Name();

    /**
     * The meta object literal for the '{@link org.xtext.go.go.impl.OrExpressionImpl <em>Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.go.go.impl.OrExpressionImpl
     * @see org.xtext.go.go.impl.GoPackageImpl#getOrExpression()
     * @generated
     */
    EClass OR_EXPRESSION = eINSTANCE.getOrExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPRESSION__LEFT = eINSTANCE.getOrExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPRESSION__RIGHT = eINSTANCE.getOrExpression_Right();

    /**
     * The meta object literal for the '{@link org.xtext.go.go.impl.AndExpressionImpl <em>And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.go.go.impl.AndExpressionImpl
     * @see org.xtext.go.go.impl.GoPackageImpl#getAndExpression()
     * @generated
     */
    EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPRESSION__LEFT = eINSTANCE.getAndExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPRESSION__RIGHT = eINSTANCE.getAndExpression_Right();

    /**
     * The meta object literal for the '{@link org.xtext.go.go.impl.ComparisonExpressionImpl <em>Comparison Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.go.go.impl.ComparisonExpressionImpl
     * @see org.xtext.go.go.impl.GoPackageImpl#getComparisonExpression()
     * @generated
     */
    EClass COMPARISON_EXPRESSION = eINSTANCE.getComparisonExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON_EXPRESSION__LEFT = eINSTANCE.getComparisonExpression_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARISON_EXPRESSION__OPERATOR = eINSTANCE.getComparisonExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON_EXPRESSION__RIGHT = eINSTANCE.getComparisonExpression_Right();

    /**
     * The meta object literal for the '{@link org.xtext.go.go.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.go.go.impl.LiteralImpl
     * @see org.xtext.go.go.impl.GoPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL__VALUE = eINSTANCE.getLiteral_Value();

  }

} //GoPackage
