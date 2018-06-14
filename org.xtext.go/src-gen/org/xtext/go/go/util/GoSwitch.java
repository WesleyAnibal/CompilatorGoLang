/**
 * generated by Xtext 2.13.0
 */
package org.xtext.go.go.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.go.go.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.go.go.GoPackage
 * @generated
 */
public class GoSwitch<T1> extends Switch<T1>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GoPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = GoPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T1 doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case GoPackage.GO:
      {
        Go go = (Go)theEObject;
        T1 result = caseGo(go);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.GREETING:
      {
        Greeting greeting = (Greeting)theEObject;
        T1 result = caseGreeting(greeting);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.DEC_VAR:
      {
        DecVar decVar = (DecVar)theEObject;
        T1 result = caseDecVar(decVar);
        if (result == null) result = caseGreeting(decVar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.MULT_DEC_VARS:
      {
        MultDecVars multDecVars = (MultDecVars)theEObject;
        T1 result = caseMultDecVars(multDecVars);
        if (result == null) result = caseGreeting(multDecVars);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.DEC_VARS:
      {
        DecVars decVars = (DecVars)theEObject;
        T1 result = caseDecVars(decVars);
        if (result == null) result = caseDecVar(decVars);
        if (result == null) result = caseGreeting(decVars);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.PARAMS:
      {
        Params params = (Params)theEObject;
        T1 result = caseParams(params);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.OPERATIONS_ONE_EQUALS:
      {
        OperationsOneEquals operationsOneEquals = (OperationsOneEquals)theEObject;
        T1 result = caseOperationsOneEquals(operationsOneEquals);
        if (result == null) result = caseINT(operationsOneEquals);
        if (result == null) result = casevarFor(operationsOneEquals);
        if (result == null) result = caseCallFor(operationsOneEquals);
        if (result == null) result = caseGreeting(operationsOneEquals);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.INT:
      {
        INT int_ = (INT)theEObject;
        T1 result = caseINT(int_);
        if (result == null) result = caseGreeting(int_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.I:
      {
        I i = (I)theEObject;
        T1 result = caseI(i);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.T:
      {
        T t = (T)theEObject;
        T1 result = caseT(t);
        if (result == null) result = caseINT(t);
        if (result == null) result = caseI(t);
        if (result == null) result = caseGreeting(t);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.Y:
      {
        Y y = (Y)theEObject;
        T1 result = caseY(y);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.F:
      {
        F f = (F)theEObject;
        T1 result = caseF(f);
        if (result == null) result = caseT(f);
        if (result == null) result = caseINT(f);
        if (result == null) result = caseI(f);
        if (result == null) result = caseGreeting(f);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T1 result = caseCondition(condition);
        if (result == null) result = caseGreeting(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.IF_CONDITION:
      {
        IfCondition ifCondition = (IfCondition)theEObject;
        T1 result = caseIfCondition(ifCondition);
        if (result == null) result = caseElseIfCondition(ifCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.ELSE_IF_CONDITION:
      {
        ElseIfCondition elseIfCondition = (ElseIfCondition)theEObject;
        T1 result = caseElseIfCondition(elseIfCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.ELSE_CONDITION:
      {
        ElseCondition elseCondition = (ElseCondition)theEObject;
        T1 result = caseElseCondition(elseCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T1 result = caseExpression(expression);
        if (result == null) result = casevarFor(expression);
        if (result == null) result = caseCallFor(expression);
        if (result == null) result = caseGreeting(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.CALL_FOR:
      {
        CallFor callFor = (CallFor)theEObject;
        T1 result = caseCallFor(callFor);
        if (result == null) result = caseGreeting(callFor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.OPERATIONS_ONE:
      {
        operationsOne operationsOne = (operationsOne)theEObject;
        T1 result = caseoperationsOne(operationsOne);
        if (result == null) result = casevarFor(operationsOne);
        if (result == null) result = caseCallFor(operationsOne);
        if (result == null) result = caseGreeting(operationsOne);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.VAR_FOR:
      {
        varFor varFor = (varFor)theEObject;
        T1 result = casevarFor(varFor);
        if (result == null) result = caseCallFor(varFor);
        if (result == null) result = caseGreeting(varFor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.DEC_FUNC:
      {
        DecFunc decFunc = (DecFunc)theEObject;
        T1 result = caseDecFunc(decFunc);
        if (result == null) result = caseGreeting(decFunc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.CALL_FUNC:
      {
        CallFunc callFunc = (CallFunc)theEObject;
        T1 result = caseCallFunc(callFunc);
        if (result == null) result = caseGreeting(callFunc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.DATA_TYPE:
      {
        DataType dataType = (DataType)theEObject;
        T1 result = caseDataType(dataType);
        if (result == null) result = caseGreeting(dataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.OR_EXPRESSION:
      {
        OrExpression orExpression = (OrExpression)theEObject;
        T1 result = caseOrExpression(orExpression);
        if (result == null) result = caseExpression(orExpression);
        if (result == null) result = casevarFor(orExpression);
        if (result == null) result = caseCallFor(orExpression);
        if (result == null) result = caseGreeting(orExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.AND_EXPRESSION:
      {
        AndExpression andExpression = (AndExpression)theEObject;
        T1 result = caseAndExpression(andExpression);
        if (result == null) result = caseExpression(andExpression);
        if (result == null) result = casevarFor(andExpression);
        if (result == null) result = caseCallFor(andExpression);
        if (result == null) result = caseGreeting(andExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.COMPARISON_EXPRESSION:
      {
        ComparisonExpression comparisonExpression = (ComparisonExpression)theEObject;
        T1 result = caseComparisonExpression(comparisonExpression);
        if (result == null) result = caseExpression(comparisonExpression);
        if (result == null) result = casevarFor(comparisonExpression);
        if (result == null) result = caseCallFor(comparisonExpression);
        if (result == null) result = caseGreeting(comparisonExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.LITERAL:
      {
        Literal literal = (Literal)theEObject;
        T1 result = caseLiteral(literal);
        if (result == null) result = caseExpression(literal);
        if (result == null) result = casevarFor(literal);
        if (result == null) result = caseCallFor(literal);
        if (result == null) result = caseGreeting(literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Go</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Go</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseGo(Go object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Greeting</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Greeting</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseGreeting(Greeting object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dec Var</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dec Var</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseDecVar(DecVar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mult Dec Vars</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mult Dec Vars</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseMultDecVars(MultDecVars object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dec Vars</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dec Vars</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseDecVars(DecVars object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Params</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Params</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseParams(Params object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operations One Equals</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operations One Equals</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseOperationsOneEquals(OperationsOneEquals object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>INT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>INT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseINT(INT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>I</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>I</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseI(I object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>T</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>T</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseT(T object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Y</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Y</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseY(Y object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>F</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>F</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseF(F object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseCondition(Condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseIfCondition(IfCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Else If Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Else If Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseElseIfCondition(ElseIfCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Else Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Else Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseElseCondition(ElseCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Call For</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Call For</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseCallFor(CallFor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>operations One</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>operations One</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseoperationsOne(operationsOne object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>var For</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>var For</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 casevarFor(varFor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dec Func</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dec Func</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseDecFunc(DecFunc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Call Func</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Call Func</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseCallFunc(CallFunc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseDataType(DataType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseOrExpression(OrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseAndExpression(AndExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comparison Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comparison Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseComparisonExpression(ComparisonExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseLiteral(Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T1 defaultCase(EObject object)
  {
    return null;
  }

} //GoSwitch
