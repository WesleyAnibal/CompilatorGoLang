/**
 * generated by Xtext 2.13.0
 */
package org.xtext.go.go.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.go.go.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GoFactoryImpl extends EFactoryImpl implements GoFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GoFactory init()
  {
    try
    {
      GoFactory theGoFactory = (GoFactory)EPackage.Registry.INSTANCE.getEFactory(GoPackage.eNS_URI);
      if (theGoFactory != null)
      {
        return theGoFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GoFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GoPackage.GO: return createGo();
      case GoPackage.GREETING: return createGreeting();
      case GoPackage.DECL: return createDecl();
      case GoPackage.DEC_VAR: return createDecVar();
      case GoPackage.ATRIB: return createAtrib();
      case GoPackage.SWITCH_CASE: return createSwitchCase();
      case GoPackage.CASES: return createCases();
      case GoPackage.PARAMS: return createParams();
      case GoPackage.OPERATIONS_ONE_EQUALS: return createOperationsOneEquals();
      case GoPackage.CONDITION: return createCondition();
      case GoPackage.IF_CONDITION: return createIfCondition();
      case GoPackage.ELSE_IF_CONDITION: return createElseIfCondition();
      case GoPackage.ELSE_CONDITION: return createElseCondition();
      case GoPackage.EXPRESSION: return createExpression();
      case GoPackage.CALL_FOR: return createCallFor();
      case GoPackage.OPERATIONS_ONE: return createoperationsOne();
      case GoPackage.VAR_FOR: return createvarFor();
      case GoPackage.DEC_FUNC: return createDecFunc();
      case GoPackage.CALL_FUNC: return createCallFunc();
      case GoPackage.DATA_TYPE: return createDataType();
      case GoPackage.ADDITION: return createAddition();
      case GoPackage.SUBTRATION: return createSubtration();
      case GoPackage.MULTIPLICATION: return createMultiplication();
      case GoPackage.DIVISION: return createDivision();
      case GoPackage.OR_EXPRESSION: return createOrExpression();
      case GoPackage.AND_EXPRESSION: return createAndExpression();
      case GoPackage.COMPARISON_EXPRESSION: return createComparisonExpression();
      case GoPackage.LITERAL: return createLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Go createGo()
  {
    GoImpl go = new GoImpl();
    return go;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Greeting createGreeting()
  {
    GreetingImpl greeting = new GreetingImpl();
    return greeting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Decl createDecl()
  {
    DeclImpl decl = new DeclImpl();
    return decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecVar createDecVar()
  {
    DecVarImpl decVar = new DecVarImpl();
    return decVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atrib createAtrib()
  {
    AtribImpl atrib = new AtribImpl();
    return atrib;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchCase createSwitchCase()
  {
    SwitchCaseImpl switchCase = new SwitchCaseImpl();
    return switchCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cases createCases()
  {
    CasesImpl cases = new CasesImpl();
    return cases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Params createParams()
  {
    ParamsImpl params = new ParamsImpl();
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationsOneEquals createOperationsOneEquals()
  {
    OperationsOneEqualsImpl operationsOneEquals = new OperationsOneEqualsImpl();
    return operationsOneEquals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfCondition createIfCondition()
  {
    IfConditionImpl ifCondition = new IfConditionImpl();
    return ifCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElseIfCondition createElseIfCondition()
  {
    ElseIfConditionImpl elseIfCondition = new ElseIfConditionImpl();
    return elseIfCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElseCondition createElseCondition()
  {
    ElseConditionImpl elseCondition = new ElseConditionImpl();
    return elseCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CallFor createCallFor()
  {
    CallForImpl callFor = new CallForImpl();
    return callFor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public operationsOne createoperationsOne()
  {
    operationsOneImpl operationsOne = new operationsOneImpl();
    return operationsOne;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public varFor createvarFor()
  {
    varForImpl varFor = new varForImpl();
    return varFor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecFunc createDecFunc()
  {
    DecFuncImpl decFunc = new DecFuncImpl();
    return decFunc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CallFunc createCallFunc()
  {
    CallFuncImpl callFunc = new CallFuncImpl();
    return callFunc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataType()
  {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Addition createAddition()
  {
    AdditionImpl addition = new AdditionImpl();
    return addition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subtration createSubtration()
  {
    SubtrationImpl subtration = new SubtrationImpl();
    return subtration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplication createMultiplication()
  {
    MultiplicationImpl multiplication = new MultiplicationImpl();
    return multiplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Division createDivision()
  {
    DivisionImpl division = new DivisionImpl();
    return division;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrExpression createOrExpression()
  {
    OrExpressionImpl orExpression = new OrExpressionImpl();
    return orExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndExpression createAndExpression()
  {
    AndExpressionImpl andExpression = new AndExpressionImpl();
    return andExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComparisonExpression createComparisonExpression()
  {
    ComparisonExpressionImpl comparisonExpression = new ComparisonExpressionImpl();
    return comparisonExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoPackage getGoPackage()
  {
    return (GoPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GoPackage getPackage()
  {
    return GoPackage.eINSTANCE;
  }

} //GoFactoryImpl
