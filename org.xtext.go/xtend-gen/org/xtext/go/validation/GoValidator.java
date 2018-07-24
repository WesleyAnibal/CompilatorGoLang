/**
 * generated by Xtext 2.13.0
 */
package org.xtext.go.validation;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.xtext.validation.Check;
import org.xtext.go.go.Atrib;
import org.xtext.go.go.AtribVar;
import org.xtext.go.go.Atrib_Aux;
import org.xtext.go.go.CallFunc;
import org.xtext.go.go.DecFunc;
import org.xtext.go.go.GoPackage;
import org.xtext.go.go.Numbers;
import org.xtext.go.go.Params;
import org.xtext.go.go.Str;
import org.xtext.go.go.TypeValue;
import org.xtext.go.go.Variable;
import org.xtext.go.validation.AbstractGoValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class GoValidator extends AbstractGoValidator {
  public final static String SEMANTIC_ERROR = "Erro Sem�ntico: ";
  
  public static Map<String, DecFunc> funcImplements = new HashMap<String, DecFunc>();
  
  public static Map<String, Atrib> variablesDeclarationMap = new HashMap<String, Atrib>();
  
  @Check
  public void checkGreetingStartsWithCapital(final AtribVar g) {
    int _size = g.getAtrb().size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      int _size_1 = g.getVars().size();
      int _size_2 = g.getAtrb().size();
      boolean _lessThan = (_size_1 < _size_2);
      if (_lessThan) {
        this.error("n�mero de atribui��es maior que variaveis", GoPackage.Literals.DEC_VARS__VARS);
      } else {
        int _size_3 = g.getVars().size();
        int _size_4 = g.getAtrb().size();
        boolean _greaterThan_1 = (_size_3 > _size_4);
        if (_greaterThan_1) {
          this.error("n�mero de atribui��es menor que variaveis", GoPackage.Literals.DEC_VARS__VARS);
        }
      }
    }
  }
  
  public boolean checkIfCallFuncIdExists(final String funcName) {
    boolean out = false;
    DecFunc arr = GoValidator.funcImplements.get(funcName);
    boolean _notEquals = (!Objects.equal(arr, null));
    if (_notEquals) {
      out = true;
    }
    return out;
  }
  
  /**
   * This function add in the map all the variables in the source code
   */
  @Check
  public Atrib addVariableDeclarations(final Atrib dec) {
    Atrib _xblockexpression = null;
    {
      this.checkTypeDeclarationAtrib(dec);
      _xblockexpression = GoValidator.variablesDeclarationMap.put(dec.getName().toString(), dec);
    }
    return _xblockexpression;
  }
  
  /**
   * Check if the declaration variables are in accord with the golang specification
   */
  public void checkTypeDeclarationAtrib(final Atrib dec) {
    this.atribDeclarationTypes(dec);
    Atrib_Aux _atrib = dec.getAtrib();
    if ((_atrib instanceof Variable)) {
      Atrib_Aux _atrib_1 = dec.getAtrib();
      Variable variable = ((Variable) _atrib_1);
      boolean _containsKey = GoValidator.variablesDeclarationMap.containsKey(variable.getName());
      boolean _not = (!_containsKey);
      if (_not) {
        String _name = variable.getName();
        String _plus = ((GoValidator.SEMANTIC_ERROR + "N�o � poss�vel atribuir valor. Variavel ") + _name);
        String _plus_1 = (_plus + " n�o declarada");
        this.error(_plus_1, 
          GoPackage.Literals.ATRIB_VAR__ATRB);
      } else {
        Atrib atrib = GoValidator.variablesDeclarationMap.get(variable.getName());
        this.checkIfAtribsAreCompatible(dec, atrib);
      }
    }
    Atrib_Aux _atrib_2 = dec.getAtrib();
    if ((_atrib_2 instanceof CallFunc)) {
      Atrib_Aux _atrib_3 = dec.getAtrib();
      CallFunc call = ((CallFunc) _atrib_3);
      this.checkIfFunctionExists(call, GoPackage.Literals.ATRIB_VAR__TYPE);
    }
  }
  
  /**
   * Given two Atrib entitys, this function check if both has the same type.
   */
  public void checkIfAtribsAreCompatible(final Atrib dec, final Atrib atrib) {
    boolean _equals = atrib.getType().equals(dec.getType());
    boolean _not = (!_equals);
    if (_not) {
      String _type = atrib.getType();
      String _plus = ((GoValidator.SEMANTIC_ERROR + "n�o � poss�vel converter ") + _type);
      String _plus_1 = (_plus + " para ");
      String _type_1 = dec.getType();
      String _plus_2 = (_plus_1 + _type_1);
      this.error(_plus_2, 
        GoPackage.Literals.ATRIB__TYPE);
    }
  }
  
  /**
   * Given a pure declaration, (var c int = 3), this function verifies if the types are in accord with
   * the hierarchy type.
   */
  public void atribDeclarationTypes(final Atrib dec) {
    Atrib_Aux _atrib = dec.getAtrib();
    if ((_atrib instanceof TypeValue)) {
      if ((dec.getType().equals("string") && (dec.getAtrib() instanceof Numbers))) {
        this.error((GoValidator.SEMANTIC_ERROR + "n�o � poss�vel converter number para string"), GoPackage.Literals.ATRIB__TYPE);
      }
      if (((!dec.getType().equals("string")) && (dec.getAtrib() instanceof Str))) {
        String _type = dec.getType();
        String _plus = ((GoValidator.SEMANTIC_ERROR + "n�o � poss�vel converter string para ") + _type);
        this.error(_plus, 
          GoPackage.Literals.ATRIB__TYPE);
      }
    }
  }
  
  @Check
  public void checkIfVariableIsDeclarated(final Variable variable) {
    boolean _containsKey = GoValidator.variablesDeclarationMap.containsKey(variable.getName());
    boolean _not = (!_containsKey);
    if (_not) {
      this.error((GoValidator.SEMANTIC_ERROR + "variavel n�o declarada"), GoPackage.Literals.VARIABLE__NAME);
    }
  }
  
  @Check
  public DecFunc addFuncToImplements(final DecFunc dec) {
    return GoValidator.funcImplements.put(dec.getName().toString(), dec);
  }
  
  @Check
  public void checkIfFunctionOverhead(final DecFunc dec) {
    boolean _containsKey = GoValidator.funcImplements.containsKey(dec.getName());
    boolean _not = (!_containsKey);
    if (_not) {
      this.error((GoValidator.SEMANTIC_ERROR + "fun��o n�o declarada"), GoPackage.Literals.CALL_FUNC__NAME_FUNC);
    }
  }
  
  @Check
  public void callFunc(final CallFunc callFunc) {
    this.checkIfFunctionExists(callFunc, GoPackage.Literals.CALL_FUNC__NAME_FUNC);
    DecFunc func = GoValidator.funcImplements.get(callFunc.getNameFunc());
    this.checkIfHasEqualTypes(func, callFunc);
  }
  
  /**
   * Auxiliary method that allows know if a callFunc is already declared
   */
  public void checkIfFunctionExists(final CallFunc callFunc, final EAttribute pack) {
    boolean _containsKey = GoValidator.funcImplements.containsKey(callFunc.getNameFunc());
    boolean _not = (!_containsKey);
    if (_not) {
      this.error((GoValidator.SEMANTIC_ERROR + "fun��o n�o declarada"), pack);
    }
  }
  
  /**
   * Verifies the number of parameters and your respoective types between the function declaration
   * and function call
   */
  public void checkIfHasEqualTypes(final DecFunc func, final CallFunc callFunc) {
    int _parametersSize = this.getParametersSize(func.getParam());
    int _parametersSize_1 = this.getParametersSize(callFunc.getParam());
    boolean _notEquals = (_parametersSize != _parametersSize_1);
    if (_notEquals) {
      this.error((GoValidator.SEMANTIC_ERROR + "Diferen�a entre a quantidade de par�metros"), GoPackage.Literals.CALL_FUNC__PARAM);
    }
    List<String> functionTypes = this.getParametersType(func.getParam());
    List<String> callTypes = this.getParametersType(callFunc.getParam());
    for (int i = 0; (i < functionTypes.size()); i++) {
      boolean _equals = callTypes.get(i).equals(functionTypes.get(i));
      boolean _not = (!_equals);
      if (_not) {
        String _get = functionTypes.get(i);
        String _plus = ((GoValidator.SEMANTIC_ERROR + "Diferen�a entre os tipos dos par�metros. Tipo Esperado: ") + _get);
        String _plus_1 = (_plus + 
          "  Tipo declarado: ");
        String _get_1 = callTypes.get(i);
        String _plus_2 = (_plus_1 + _get_1);
        this.error(_plus_2, 
          GoPackage.Literals.CALL_FUNC__PARAM);
      }
    }
  }
  
  public int getParametersSize(final Params param) {
    List<String> tipos = new ArrayList<String>();
    if (((!Objects.equal(param, null)) && (!Objects.equal(param.getParams(), null)))) {
      EList<String> _params = param.getParams();
      for (final String t : _params) {
        tipos.add(t);
      }
    }
    return tipos.size();
  }
  
  public Atrib getVariableById(final String name) {
    return GoValidator.variablesDeclarationMap.get(name);
  }
  
  public List<String> getParametersType(final Params param) {
    List<String> tipos = new ArrayList<String>();
    if (((param != null) && (param.getType() != null))) {
      int _size = param.getType().size();
      boolean _equals = (_size == 0);
      if (_equals) {
        EList<String> _params = param.getParams();
        for (final String id : _params) {
          {
            Atrib variable = this.getVariableById(id);
            tipos.add(variable.getType());
          }
        }
      } else {
        EList<String> _type = param.getType();
        for (final String t : _type) {
          tipos.add(t);
        }
      }
    }
    return tipos;
  }
}
