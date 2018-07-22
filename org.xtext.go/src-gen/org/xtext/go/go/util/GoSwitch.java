/**
 * generated by Xtext 2.13.0
 */
package org.xtext.go.go.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.go.go.Addition;
import org.xtext.go.go.AndExpression;
import org.xtext.go.go.Atri;
import org.xtext.go.go.Atrib;
import org.xtext.go.go.AtribVar;
import org.xtext.go.go.Atrib_Aux;
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
import org.xtext.go.go.Go;
import org.xtext.go.go.GoPackage;
import org.xtext.go.go.Greeting;
import org.xtext.go.go.IfCondition;
import org.xtext.go.go.Literal;
import org.xtext.go.go.MultDecVars;
import org.xtext.go.go.Multiplication;
import org.xtext.go.go.Numbers;
import org.xtext.go.go.OperationsOneEquals;
import org.xtext.go.go.OrExpression;
import org.xtext.go.go.Params;
import org.xtext.go.go.Str;
import org.xtext.go.go.Subtration;
import org.xtext.go.go.SwitchCase;
import org.xtext.go.go.TypeValue;
import org.xtext.go.go.Variable;
import org.xtext.go.go.operationsOne;
import org.xtext.go.go.varFor;

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
public class GoSwitch<T> extends Switch<T>
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case GoPackage.GO:
      {
        Go go = (Go)theEObject;
        T result = caseGo(go);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.GREETING:
      {
        Greeting greeting = (Greeting)theEObject;
        T result = caseGreeting(greeting);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.DECL:
      {
        Decl decl = (Decl)theEObject;
        T result = caseDecl(decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.DEC_VAR:
      {
        DecVar decVar = (DecVar)theEObject;
        T result = caseDecVar(decVar);
        if (result == null) result = caseGreeting(decVar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.ATRIB_VAR:
      {
        AtribVar atribVar = (AtribVar)theEObject;
        T result = caseAtribVar(atribVar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.ATRIB_AUX:
      {
        Atrib_Aux atrib_Aux = (Atrib_Aux)theEObject;
        T result = caseAtrib_Aux(atrib_Aux);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = caseGreeting(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.ATRIB:
      {
        Atrib atrib = (Atrib)theEObject;
        T result = caseAtrib(atrib);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.MULT_DEC_VARS:
      {
        MultDecVars multDecVars = (MultDecVars)theEObject;
        T result = caseMultDecVars(multDecVars);
        if (result == null) result = caseGreeting(multDecVars);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.DEC_VARS:
      {
        DecVars decVars = (DecVars)theEObject;
        T result = caseDecVars(decVars);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.SWITCH_CASE:
      {
        SwitchCase switchCase = (SwitchCase)theEObject;
        T result = caseSwitchCase(switchCase);
        if (result == null) result = caseGreeting(switchCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.CASES:
      {
        Cases cases = (Cases)theEObject;
        T result = caseCases(cases);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.ATRI:
      {
        Atri atri = (Atri)theEObject;
        T result = caseAtri(atri);
        if (result == null) result = caseAtrib_Aux(atri);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.PARAMS:
      {
        Params params = (Params)theEObject;
        T result = caseParams(params);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.TYPE_VALUE:
      {
        TypeValue typeValue = (TypeValue)theEObject;
        T result = caseTypeValue(typeValue);
        if (result == null) result = caseAtri(typeValue);
        if (result == null) result = caseAtrib_Aux(typeValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.STR:
      {
        Str str = (Str)theEObject;
        T result = caseStr(str);
        if (result == null) result = caseTypeValue(str);
        if (result == null) result = caseAtri(str);
        if (result == null) result = caseAtrib_Aux(str);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.OPERATIONS_ONE_EQUALS:
      {
        OperationsOneEquals operationsOneEquals = (OperationsOneEquals)theEObject;
        T result = caseOperationsOneEquals(operationsOneEquals);
        if (result == null) result = casevarFor(operationsOneEquals);
        if (result == null) result = caseCallFor(operationsOneEquals);
        if (result == null) result = caseGreeting(operationsOneEquals);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.NUMBERS:
      {
        Numbers numbers = (Numbers)theEObject;
        T result = caseNumbers(numbers);
        if (result == null) result = caseTypeValue(numbers);
        if (result == null) result = caseExpression(numbers);
        if (result == null) result = caseAtri(numbers);
        if (result == null) result = casevarFor(numbers);
        if (result == null) result = caseAtrib_Aux(numbers);
        if (result == null) result = caseCallFor(numbers);
        if (result == null) result = caseGreeting(numbers);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.DOUBLE:
      {
        org.xtext.go.go.Double double_ = (org.xtext.go.go.Double)theEObject;
        T result = caseDouble(double_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = caseGreeting(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.IF_CONDITION:
      {
        IfCondition ifCondition = (IfCondition)theEObject;
        T result = caseIfCondition(ifCondition);
        if (result == null) result = caseElseIfCondition(ifCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.ELSE_IF_CONDITION:
      {
        ElseIfCondition elseIfCondition = (ElseIfCondition)theEObject;
        T result = caseElseIfCondition(elseIfCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.ELSE_CONDITION:
      {
        ElseCondition elseCondition = (ElseCondition)theEObject;
        T result = caseElseCondition(elseCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = casevarFor(expression);
        if (result == null) result = caseCallFor(expression);
        if (result == null) result = caseGreeting(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.CALL_FOR:
      {
        CallFor callFor = (CallFor)theEObject;
        T result = caseCallFor(callFor);
        if (result == null) result = caseGreeting(callFor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.OPERATIONS_ONE:
      {
        operationsOne operationsOne = (operationsOne)theEObject;
        T result = caseoperationsOne(operationsOne);
        if (result == null) result = casevarFor(operationsOne);
        if (result == null) result = caseCallFor(operationsOne);
        if (result == null) result = caseGreeting(operationsOne);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.VAR_FOR:
      {
        varFor varFor = (varFor)theEObject;
        T result = casevarFor(varFor);
        if (result == null) result = caseCallFor(varFor);
        if (result == null) result = caseGreeting(varFor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.DEC_FUNC:
      {
        DecFunc decFunc = (DecFunc)theEObject;
        T result = caseDecFunc(decFunc);
        if (result == null) result = caseGreeting(decFunc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.CALL_FUNC:
      {
        CallFunc callFunc = (CallFunc)theEObject;
        T result = caseCallFunc(callFunc);
        if (result == null) result = caseGreeting(callFunc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.BOOLEAN:
      {
        org.xtext.go.go.Boolean boolean_ = (org.xtext.go.go.Boolean)theEObject;
        T result = caseBoolean(boolean_);
        if (result == null) result = caseTypeValue(boolean_);
        if (result == null) result = caseAtri(boolean_);
        if (result == null) result = caseAtrib_Aux(boolean_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.DATA_TYPE:
      {
        DataType dataType = (DataType)theEObject;
        T result = caseDataType(dataType);
        if (result == null) result = caseGreeting(dataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.ADDITION:
      {
        Addition addition = (Addition)theEObject;
        T result = caseAddition(addition);
        if (result == null) result = caseExpression(addition);
        if (result == null) result = casevarFor(addition);
        if (result == null) result = caseCallFor(addition);
        if (result == null) result = caseGreeting(addition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.SUBTRATION:
      {
        Subtration subtration = (Subtration)theEObject;
        T result = caseSubtration(subtration);
        if (result == null) result = caseExpression(subtration);
        if (result == null) result = casevarFor(subtration);
        if (result == null) result = caseCallFor(subtration);
        if (result == null) result = caseGreeting(subtration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.MULTIPLICATION:
      {
        Multiplication multiplication = (Multiplication)theEObject;
        T result = caseMultiplication(multiplication);
        if (result == null) result = caseExpression(multiplication);
        if (result == null) result = casevarFor(multiplication);
        if (result == null) result = caseCallFor(multiplication);
        if (result == null) result = caseGreeting(multiplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.DIVISION:
      {
        Division division = (Division)theEObject;
        T result = caseDivision(division);
        if (result == null) result = caseExpression(division);
        if (result == null) result = casevarFor(division);
        if (result == null) result = caseCallFor(division);
        if (result == null) result = caseGreeting(division);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoPackage.OR_EXPRESSION:
      {
        OrExpression orExpression = (OrExpression)theEObject;
        T result = caseOrExpression(orExpression);
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
        T result = caseAndExpression(andExpression);
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
        T result = caseComparisonExpression(comparisonExpression);
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
        T result = caseLiteral(literal);
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
  public T caseGo(Go object)
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
  public T caseGreeting(Greeting object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecl(Decl object)
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
  public T caseDecVar(DecVar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atrib Var</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atrib Var</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtribVar(AtribVar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atrib Aux</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atrib Aux</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtrib_Aux(Atrib_Aux object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atrib</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atrib</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtrib(Atrib object)
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
  public T caseMultDecVars(MultDecVars object)
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
  public T caseDecVars(DecVars object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Switch Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switch Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwitchCase(SwitchCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cases</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cases</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCases(Cases object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atri</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atri</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtri(Atri object)
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
  public T caseParams(Params object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeValue(TypeValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Str</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Str</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStr(Str object)
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
  public T caseOperationsOneEquals(OperationsOneEquals object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Numbers</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numbers</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumbers(Numbers object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDouble(org.xtext.go.go.Double object)
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
  public T caseCondition(Condition object)
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
  public T caseIfCondition(IfCondition object)
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
  public T caseElseIfCondition(ElseIfCondition object)
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
  public T caseElseCondition(ElseCondition object)
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
  public T caseExpression(Expression object)
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
  public T caseCallFor(CallFor object)
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
  public T caseoperationsOne(operationsOne object)
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
  public T casevarFor(varFor object)
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
  public T caseDecFunc(DecFunc object)
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
  public T caseCallFunc(CallFunc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolean(org.xtext.go.go.Boolean object)
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
  public T caseDataType(DataType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Addition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Addition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddition(Addition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subtration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subtration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubtration(Subtration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplication(Multiplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Division</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Division</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDivision(Division object)
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
  public T caseOrExpression(OrExpression object)
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
  public T caseAndExpression(AndExpression object)
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
  public T caseComparisonExpression(ComparisonExpression object)
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
  public T caseLiteral(Literal object)
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
  public T defaultCase(EObject object)
  {
    return null;
  }

} //GoSwitch
