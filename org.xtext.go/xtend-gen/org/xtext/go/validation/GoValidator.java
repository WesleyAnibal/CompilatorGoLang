/**
 * generated by Xtext 2.13.0
 */
package org.xtext.go.validation;

import com.google.common.base.Objects;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.xtext.validation.Check;
import org.xtext.go.go.CallFunc;
import org.xtext.go.go.DecFunc;
import org.xtext.go.go.DecVar;
import org.xtext.go.go.GoPackage;
import org.xtext.go.go.impl.ExpressionImpl;
import org.xtext.go.validation.AbstractGoValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class GoValidator extends AbstractGoValidator {
  public static Map<String, List<String>> funcImplements = new HashMap<String, List<String>>();
  
  @Check
  public void checkGreetingStartsWithCapital(final DecVar g) {
    int _size = g.getAtrb().size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      int _size_1 = g.getVars().size();
      int _size_2 = g.getAtrb().size();
      boolean _lessThan = (_size_1 < _size_2);
      if (_lessThan) {
        this.error("n�mero de atribui��es maior que variaveis", GoPackage.Literals.DEC_VAR__VARS);
      } else {
        int _size_3 = g.getVars().size();
        int _size_4 = g.getAtrb().size();
        boolean _greaterThan_1 = (_size_3 > _size_4);
        if (_greaterThan_1) {
          this.error("n�mero de atribui��es menor que variaveis", GoPackage.Literals.DEC_VAR__VARS);
        }
      }
    }
  }
  
  public void checkIfCallFuncIsValid(final CallFunc cf) {
    boolean _checkIfCallFuncIdExists = this.checkIfCallFuncIdExists(cf.getNameFunc().toString());
    if (_checkIfCallFuncIdExists) {
      this.error("Identificador da fun��o n�o existe", GoPackage.Literals.CALL_FUNC__NAME_FUNC);
    }
  }
  
  public boolean checkIfCallFuncIdExists(final String funcName) {
    boolean out = false;
    List<String> arr = GoValidator.funcImplements.get(funcName);
    boolean _notEquals = (!Objects.equal(arr, null));
    if (_notEquals) {
      out = true;
    }
    return out;
  }
  
  @Check
  public Object checkArithmeticExp(final ExpressionImpl exp) {
    return null;
  }
  
  @Check
  public Object checkLiteralsType(final Type typeNumber, final Type typeBoolean, final Type typeString) {
    return null;
  }
  
  @Check
  public Object checkExistingTypes() {
    return null;
  }
  
  @Check
  public Object checkAbstractions() {
    return null;
  }
  
  @Check
  public Object checkVariableUses() {
    return null;
  }
  
  @Check
  public Object atribuitionComands() {
    return null;
  }
  
  @Check
  public Object checkFunctions() {
    return null;
  }
  
  @Check
  public Object checkBooleanExpressions() {
    return null;
  }
  
  @Check
  public Object checkSwitch() {
    return null;
  }
  
  @Check
  public List<String> addFuncToImplements(final DecFunc dec) {
    String _string = dec.getName().toString();
    ArrayList<String> _arrayList = new ArrayList<String>();
    return GoValidator.funcImplements.put(_string, _arrayList);
  }
  
  @Check
  public void callFunc(final CallFunc func) {
    boolean _containsKey = GoValidator.funcImplements.containsKey(func.getNameFunc());
    boolean _not = (!_containsKey);
    if (_not) {
      this.error("erro sem�ntico: fun��o n�o existe", GoPackage.Literals.CALL_FUNC__NAME_FUNC);
    }
  }
}
