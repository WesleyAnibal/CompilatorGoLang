/**
 * generated by Xtext 2.13.0
 */
package org.xtext.go.go.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.go.go.Addition;
import org.xtext.go.go.AndExpression;
import org.xtext.go.go.Atri;
import org.xtext.go.go.Atrib;
import org.xtext.go.go.AtribVar;
import org.xtext.go.go.Atrib_Aux;
import org.xtext.go.go.Bool;
import org.xtext.go.go.CallFor;
import org.xtext.go.go.CallFunc;
import org.xtext.go.go.Cases;
import org.xtext.go.go.ComparisonExpression;
import org.xtext.go.go.Condition;
import org.xtext.go.go.DataType;
import org.xtext.go.go.DecFunc;
import org.xtext.go.go.DecVar;
import org.xtext.go.go.DecVars;
import org.xtext.go.go.Decl;
import org.xtext.go.go.Division;
import org.xtext.go.go.ElseCondition;
import org.xtext.go.go.ElseIfCondition;
import org.xtext.go.go.Expression;
import org.xtext.go.go.F;
import org.xtext.go.go.Go;
import org.xtext.go.go.GoPackage;
import org.xtext.go.go.Greeting;
import org.xtext.go.go.I;
import org.xtext.go.go.IfCondition;
import org.xtext.go.go.Intg;
import org.xtext.go.go.Literal;
import org.xtext.go.go.MultDecVars;
import org.xtext.go.go.Multiplication;
import org.xtext.go.go.Numbers;
import org.xtext.go.go.Operations;
import org.xtext.go.go.OperationsOneEquals;
import org.xtext.go.go.OrExpression;
import org.xtext.go.go.Params;
import org.xtext.go.go.ReAtrib;
import org.xtext.go.go.Str;
import org.xtext.go.go.Subtration;
import org.xtext.go.go.SwitchCase;
import org.xtext.go.go.T;
import org.xtext.go.go.TypeValue;
import org.xtext.go.go.Variable;
import org.xtext.go.go.Y;
import org.xtext.go.go.operationsOne;
import org.xtext.go.go.varFor;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.go.go.GoPackage
 * @generated
 */
public class GoAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GoPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = GoPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GoSwitch<Adapter> modelSwitch =
    new GoSwitch<Adapter>()
    {
      @Override
      public Adapter caseGo(Go object)
      {
        return createGoAdapter();
      }
      @Override
      public Adapter caseGreeting(Greeting object)
      {
        return createGreetingAdapter();
      }
      @Override
      public Adapter caseDecl(Decl object)
      {
        return createDeclAdapter();
      }
      @Override
      public Adapter caseDecVar(DecVar object)
      {
        return createDecVarAdapter();
      }
      @Override
      public Adapter caseAtribVar(AtribVar object)
      {
        return createAtribVarAdapter();
      }
      @Override
      public Adapter caseAtrib_Aux(Atrib_Aux object)
      {
        return createAtrib_AuxAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseAtrib(Atrib object)
      {
        return createAtribAdapter();
      }
      @Override
      public Adapter caseReAtrib(ReAtrib object)
      {
        return createReAtribAdapter();
      }
      @Override
      public Adapter caseMultDecVars(MultDecVars object)
      {
        return createMultDecVarsAdapter();
      }
      @Override
      public Adapter caseDecVars(DecVars object)
      {
        return createDecVarsAdapter();
      }
      @Override
      public Adapter caseSwitchCase(SwitchCase object)
      {
        return createSwitchCaseAdapter();
      }
      @Override
      public Adapter caseCases(Cases object)
      {
        return createCasesAdapter();
      }
      @Override
      public Adapter caseAtri(Atri object)
      {
        return createAtriAdapter();
      }
      @Override
      public Adapter caseParams(Params object)
      {
        return createParamsAdapter();
      }
      @Override
      public Adapter caseTypeValue(TypeValue object)
      {
        return createTypeValueAdapter();
      }
      @Override
      public Adapter caseStr(Str object)
      {
        return createStrAdapter();
      }
      @Override
      public Adapter caseOperationsOneEquals(OperationsOneEquals object)
      {
        return createOperationsOneEqualsAdapter();
      }
      @Override
      public Adapter caseNumbers(Numbers object)
      {
        return createNumbersAdapter();
      }
      @Override
      public Adapter caseIntg(Intg object)
      {
        return createIntgAdapter();
      }
      @Override
      public Adapter caseDouble(org.xtext.go.go.Double object)
      {
        return createDoubleAdapter();
      }
      @Override
      public Adapter caseOperations(Operations object)
      {
        return createOperationsAdapter();
      }
      @Override
      public Adapter caseI(I object)
      {
        return createIAdapter();
      }
      @Override
      public Adapter caseT(T object)
      {
        return createTAdapter();
      }
      @Override
      public Adapter caseY(Y object)
      {
        return createYAdapter();
      }
      @Override
      public Adapter caseF(F object)
      {
        return createFAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseIfCondition(IfCondition object)
      {
        return createIfConditionAdapter();
      }
      @Override
      public Adapter caseElseIfCondition(ElseIfCondition object)
      {
        return createElseIfConditionAdapter();
      }
      @Override
      public Adapter caseElseCondition(ElseCondition object)
      {
        return createElseConditionAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseCallFor(CallFor object)
      {
        return createCallForAdapter();
      }
      @Override
      public Adapter caseoperationsOne(operationsOne object)
      {
        return createoperationsOneAdapter();
      }
      @Override
      public Adapter casevarFor(varFor object)
      {
        return createvarForAdapter();
      }
      @Override
      public Adapter caseDecFunc(DecFunc object)
      {
        return createDecFuncAdapter();
      }
      @Override
      public Adapter caseCallFunc(CallFunc object)
      {
        return createCallFuncAdapter();
      }
      @Override
      public Adapter caseBool(Bool object)
      {
        return createBoolAdapter();
      }
      @Override
      public Adapter caseDataType(DataType object)
      {
        return createDataTypeAdapter();
      }
      @Override
      public Adapter caseAddition(Addition object)
      {
        return createAdditionAdapter();
      }
      @Override
      public Adapter caseSubtration(Subtration object)
      {
        return createSubtrationAdapter();
      }
      @Override
      public Adapter caseMultiplication(Multiplication object)
      {
        return createMultiplicationAdapter();
      }
      @Override
      public Adapter caseDivision(Division object)
      {
        return createDivisionAdapter();
      }
      @Override
      public Adapter caseOrExpression(OrExpression object)
      {
        return createOrExpressionAdapter();
      }
      @Override
      public Adapter caseAndExpression(AndExpression object)
      {
        return createAndExpressionAdapter();
      }
      @Override
      public Adapter caseComparisonExpression(ComparisonExpression object)
      {
        return createComparisonExpressionAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.Go <em>Go</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.Go
   * @generated
   */
  public Adapter createGoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.Greeting <em>Greeting</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.Greeting
   * @generated
   */
  public Adapter createGreetingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.Decl <em>Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.Decl
   * @generated
   */
  public Adapter createDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.DecVar <em>Dec Var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.DecVar
   * @generated
   */
  public Adapter createDecVarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.AtribVar <em>Atrib Var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.AtribVar
   * @generated
   */
  public Adapter createAtribVarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.Atrib_Aux <em>Atrib Aux</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.Atrib_Aux
   * @generated
   */
  public Adapter createAtrib_AuxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.Atrib <em>Atrib</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.Atrib
   * @generated
   */
  public Adapter createAtribAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.ReAtrib <em>Re Atrib</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.ReAtrib
   * @generated
   */
  public Adapter createReAtribAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.MultDecVars <em>Mult Dec Vars</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.MultDecVars
   * @generated
   */
  public Adapter createMultDecVarsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.DecVars <em>Dec Vars</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.DecVars
   * @generated
   */
  public Adapter createDecVarsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.SwitchCase <em>Switch Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.SwitchCase
   * @generated
   */
  public Adapter createSwitchCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.Cases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.Cases
   * @generated
   */
  public Adapter createCasesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.Atri <em>Atri</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.Atri
   * @generated
   */
  public Adapter createAtriAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.Params <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.Params
   * @generated
   */
  public Adapter createParamsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.TypeValue <em>Type Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.TypeValue
   * @generated
   */
  public Adapter createTypeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.Str <em>Str</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.Str
   * @generated
   */
  public Adapter createStrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.OperationsOneEquals <em>Operations One Equals</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.OperationsOneEquals
   * @generated
   */
  public Adapter createOperationsOneEqualsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.Numbers <em>Numbers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.Numbers
   * @generated
   */
  public Adapter createNumbersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.Intg <em>Intg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.Intg
   * @generated
   */
  public Adapter createIntgAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.Double <em>Double</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.Double
   * @generated
   */
  public Adapter createDoubleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.Operations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.Operations
   * @generated
   */
  public Adapter createOperationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.I <em>I</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.I
   * @generated
   */
  public Adapter createIAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.T <em>T</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.T
   * @generated
   */
  public Adapter createTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.Y <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.Y
   * @generated
   */
  public Adapter createYAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.F <em>F</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.F
   * @generated
   */
  public Adapter createFAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.IfCondition <em>If Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.IfCondition
   * @generated
   */
  public Adapter createIfConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.ElseIfCondition <em>Else If Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.ElseIfCondition
   * @generated
   */
  public Adapter createElseIfConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.ElseCondition <em>Else Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.ElseCondition
   * @generated
   */
  public Adapter createElseConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.CallFor <em>Call For</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.CallFor
   * @generated
   */
  public Adapter createCallForAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.operationsOne <em>operations One</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.operationsOne
   * @generated
   */
  public Adapter createoperationsOneAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.varFor <em>var For</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.varFor
   * @generated
   */
  public Adapter createvarForAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.DecFunc <em>Dec Func</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.DecFunc
   * @generated
   */
  public Adapter createDecFuncAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.CallFunc <em>Call Func</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.CallFunc
   * @generated
   */
  public Adapter createCallFuncAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.Bool <em>Bool</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.Bool
   * @generated
   */
  public Adapter createBoolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.DataType
   * @generated
   */
  public Adapter createDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.Addition <em>Addition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.Addition
   * @generated
   */
  public Adapter createAdditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.Subtration <em>Subtration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.Subtration
   * @generated
   */
  public Adapter createSubtrationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.Multiplication
   * @generated
   */
  public Adapter createMultiplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.Division <em>Division</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.Division
   * @generated
   */
  public Adapter createDivisionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.OrExpression
   * @generated
   */
  public Adapter createOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.AndExpression
   * @generated
   */
  public Adapter createAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.ComparisonExpression <em>Comparison Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.ComparisonExpression
   * @generated
   */
  public Adapter createComparisonExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.go.go.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.go.go.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //GoAdapterFactory
