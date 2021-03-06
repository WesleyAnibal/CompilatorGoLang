/*
 * generated by Xtext 2.13.0
 */
package org.xtext.go.validation

import org.eclipse.xtext.validation.Check
import org.xtext.go.go.Go
import org.xtext.go.go.DecVar
import org.xtext.go.go.GoPackage
import org.xtext.go.go.Greeting
import org.xtext.go.go.Decl
import java.util.Map
import java.util.List
import java.util.HashMap
import org.xtext.go.go.DecFunc
import org.xtext.go.go.CallFunc
import java.util.ArrayList
import org.xtext.go.go.Expression
import org.xtext.go.go.impl.ExpressionImpl
import org.xtext.go.go.impl.LiteralImpl
import java.lang.reflect.Type
import org.xtext.go.go.impl.DecVarImpl
import org.xtext.go.go.AtribVar
import org.xtext.go.go.impl.CallFuncImpl
import org.xtext.go.go.Params
import java.sql.Types
import org.xtext.go.go.Atrib
import org.xtext.go.go.impl.AtribImpl
import org.xtext.go.go.Variable
import org.xtext.go.go.TypeValue
import org.xtext.go.go.Atri
import org.xtext.go.go.Numbers
import org.xtext.go.go.Str
import org.eclipse.emf.ecore.EAttribute
import org.xtext.go.go.ReAtrib
import org.xtext.go.go.Bool
import org.xtext.go.go.Intg
import org.xtext.go.go.FunctionBody

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class GoValidator extends AbstractGoValidator {

//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					GoPackage.Literals.GREETING__ NAME,
//					INVALID_NAME)
//		}
//	}
	public static final String SEMANTIC_ERROR = "Erro Sem�ntico: ";
	public static final String SYNTACTIC_ERROR = "Erro Sint�tico: ";

	public static Map<String, DecFunc> funcImplements = new HashMap<String, DecFunc>();
	public static Map<String, Atrib> variablesDeclarationMap = new HashMap<String, Atrib>();
	public static Map<String, List<Atrib>> variablesInFunction = new HashMap<String, List<Atrib>>();
		
		Object v

	@Check
	def checkGreetingStartsWithCapital(AtribVar g) {
		if (g.atrb.size() > 0) {

			if (g.vars.size() < g.atrb.size()) {
				error("n�mero de atribui��es maior que variaveis", GoPackage.Literals.DEC_VARS__VARS);
			} else if (g.vars.size() > g.atrb.size()) {
				error("n�mero de atribui��es menor que variaveis", GoPackage.Literals.DEC_VARS__VARS);
			}
		}
	}

	def boolean checkIfCallFuncIdExists(String funcName) {

		var out = false;
		var arr = funcImplements.get(funcName);
		if (arr != null) {
			out = true;
		}
		return out;

	}

	@Check
	def reassignmentVar(ReAtrib re) {
		if (!variablesDeclarationMap.containsKey(re.name)) {
			error(SEMANTIC_ERROR + "N�o � poss�vel reaatribuir valor. Variavel " + re.name + " n�o declarada",
				GoPackage.Literals.RE_ATRIB__NAME);
		} else {
			var Atrib at = variablesDeclarationMap.get(re.name);
			if (at.modifier.equals("const")) {
				error(SEMANTIC_ERROR + "N�o � poss�vel reaatribuir valor para vari�veis const.",
					GoPackage.Literals.RE_ATRIB__NAME);
			}
		}
		validateReassignmentWithVariable(re);
		if (re.atrib instanceof TypeValue) {
			var TypeValue type = re.atrib as TypeValue;
			var Atrib at = variablesDeclarationMap.get(re.name);
			checkIfIsTypeCompatible(at.type, type, GoPackage.Literals.RE_ATRIB__NAME)

		}

	}

	def checkIfIsTypeCompatible(String t1, TypeValue t2, EAttribute pack) {

		if (t1.equals("bool") && !(t2 instanceof Bool)) {
			error(SEMANTIC_ERROR + "N�o � poss�vel converter " + t1.toString() + " para " +
				getTypeNameFromTypeValue(t2), pack);
		}
		if (!t1.equals("bool") && (t2 instanceof Bool)) {
			error(SEMANTIC_ERROR + "N�o � poss�vel converter " + t1.toString() + " para boolean", pack);
		}
		if (!t1.equals("string") && (t2 instanceof Str)) {

			error(SEMANTIC_ERROR + "N�o � poss�vel converter " + t1.toString() + " para string", pack);
		}

		if (t1.equals("string") && !(t2 instanceof Str)) {
			error(
				SEMANTIC_ERROR + "N�o � poss�vel converter " + t1.toString() + " para " + getTypeNameFromTypeValue(t2),
				pack);
		}

	}

	def getTypeNameFromTypeValue(TypeValue typeValue) {
		if (typeValue instanceof Str) {
			return "string";
		}
		if (typeValue instanceof Numbers) {
			var Numbers n = typeValue as Numbers;
			if (n instanceof Intg) { // ta ocorrendo alguma em n n�o � visto como um inteiro. 
				return "int";
			} else {
				return "float"
			}
		}
		if (typeValue instanceof Bool) {
			return "bool";
		}
	}

	/**
	 * Verifies a var reassignment with another var
	 */
	def validateReassignmentWithVariable(ReAtrib re) {
		if (re.atrib instanceof Variable) {
			var Variable variable = re.atrib as Variable;
			if (!variablesDeclarationMap.containsKey(variable.name)) {
				error(SEMANTIC_ERROR + "N�o � poss�vel reatribuir valor. Variavel " + variable.name + " n�o declarada",
					GoPackage.Literals.RE_ATRIB__ATRIB);
			} else {
				var Atrib assgn = variablesDeclarationMap.get(re.name);
				var Atrib atrib = variablesDeclarationMap.get(variable.name);
				if (!assgn.type.equals(atrib.type)) {
					error(SEMANTIC_ERROR + "n�o � poss�vel converter " + atrib.type + " para " + assgn.type,
						GoPackage.Literals.RE_ATRIB__ATRIB);
				}
			}
		}
	}

	/**
	 * This function add in the map all the variables in the source code
	 */
	@Check
	def addVariableDeclarations(Atrib dec) {
		checkTypeDeclarationAtrib(dec);
		variablesDeclarationMap.put(dec.name.toString(), dec);
		
	}

	/**
	 * Check if the declaration variables are in accord with the golang specification
	 * 	 
	 * */
	def checkTypeDeclarationAtrib(Atrib dec) {
		var EAttribute erro = GoPackage.Literals.ATRIB_VAR__TYPE;
		atribDeclarationTypes(dec);
		if (dec.atrib instanceof Variable) {
			var Variable variable = dec.atrib as Variable;
			if (!variablesDeclarationMap.containsKey(variable.name)) {
				error(SEMANTIC_ERROR + "N�o � poss�vel atribuir valor. Variavel " + variable.name + " n�o declarada",
					erro);
			} else {
				var Atrib atrib = variablesDeclarationMap.get(variable.name);
				checkIfAtribsAreCompatible(dec, atrib);
			}
		}
		if (dec.atrib instanceof CallFunc) {
			var CallFunc call = dec.atrib as CallFunc;
			checkIfFunctionExists(call, erro);
			var DecFunc decF = funcImplements.get(call.nameFunc);
			if (decF.returnType === null) {
				error(
					SEMANTIC_ERROR + "N�o � poss�vel atribuir valor a vari�vel. Funcao sem tipo de retorno.",
					GoPackage.Literals.ATRIB__TYPE
				);
			}

			checkIfFunctionHasReturnType(call, erro)
			checkTypeFunctionWithAtrib(call, dec, GoPackage.Literals.ATRIB__TYPE);
		}
	}

	def checkIfFunctionHasReturnType(CallFunc call, EAttribute pack) {
		var DecFunc dec = funcImplements.get(call.nameFunc);
		if (dec.returnType === null) {
			error(
				SEMANTIC_ERROR + "N�o � poss�vel atribuir valor a vari�vel. Funcao sem tipo de retorno.",
				pack
			);
		}

	}

	def checkTypeFunctionWithAtrib(CallFunc call, Atrib atrib, EAttribute pack) {
		var DecFunc dec = funcImplements.get(call.nameFunc);
		if (!atrib.type.equals(dec.returnType)) {
			error(
				SEMANTIC_ERROR + "retorno da fun��o � diferente do tipo da vari�vel. Tipo da Fun��o: " +
					dec.returnType + " Tipo da vari�vel: " + atrib.type,
				pack
			);
		}

	}

	/**
	 * Auxiliary method that allows know if a callFunc is already declared
	 */
	def checkIfFunctionExists(CallFunc callFunc, EAttribute pack) {
		if (!funcImplements.containsKey(callFunc.nameFunc)) {
			error(SEMANTIC_ERROR + "fun��o n�o declarada", pack);
		}
	}

	/**
	 * Given two Atrib entitys, this function check if both has the same type.
	 */
	def checkIfAtribsAreCompatible(Atrib dec, Atrib atrib) {
		if (!atrib.type.equals(dec.type)) {
			error(SEMANTIC_ERROR + "n�o � poss�vel converter " + atrib.type + " para " + dec.type,
				GoPackage.Literals.ATRIB__TYPE);
		}
	}

	/**
	 * Given a pure declaration, (var c int = 3), this function verifies if the types are in accord with 
	 * the hierarchy type. 
	 */
	def atribDeclarationTypes(Atrib dec) {
		if (dec.atrib instanceof TypeValue) {
			var TypeValue type = dec.atrib as TypeValue;
			checkIfIsTypeCompatible(dec.type, type, GoPackage.Literals.ATRIB__TYPE);
//			if (dec.type.equals("string") && dec.atrib instanceof Numbers) {
//				error(SEMANTIC_ERROR + "n�o � poss�vel converter number para string", GoPackage.Literals.ATRIB__TYPE);
//			}
//			if (!dec.type.equals("string") && dec.atrib instanceof Str) {
//				error(SEMANTIC_ERROR + "n�o � poss�vel converter string para " + dec.type,
//					GoPackage.Literals.ATRIB__TYPE);
//			}
		}

	}

	// escopo comum
	// obs.: algumas classes nao foram geradas como a Opers, entao,
	// para contornar esse erro, na gramatica de expression, colocamos atributos como sum e sub em expression, para acessar esse tipo de tratamento.
	@Check
	def checkIfVariableIsDeclarated(Variable variable) {
		if (!variablesDeclarationMap.containsKey(variable.name)) {
			error(SEMANTIC_ERROR + "variavel n�o declarada", GoPackage.Literals.VARIABLE__NAME);
		}

	}

	@Check
	def addFuncToImplements(DecFunc dec) {
		funcImplements.put(dec.name.toString(), dec);
		variablesInFunction.put(dec.name, new ArrayList<Atrib>());
		verifiesReturnFunctionAndReturnBody(dec);
		mapVariableInBodyFunction(dec);
		verifiesBodyFunction(dec);

	}
	
	def verifiesReturnFunctionAndReturnBody(DecFunc dec){
		var FunctionBody body = dec.body;
		if(dec.returnType === null && body.ret !== null  ){
			error(SEMANTIC_ERROR + "Fun��o void: n�o precisa de retorno", GoPackage.Literals.DEC_FUNC__RETURN_TYPE);
		}
		if(dec.returnType !== null && body.ret === null){
			error(SEMANTIC_ERROR + "Retorno nao encontrado", GoPackage.Literals.DEC_FUNC__RETURN_TYPE);
		}
		
	}

	def mapVariableInBodyFunction(DecFunc dec) {

		var FunctionBody body = dec.body;
		for (Greeting gret : body.args) {

			if (gret instanceof DecVar) {
				var DecVar variable = gret as DecVar;
				if (variable.atribuicao !== null) {
					var Atrib atrib =variable.atribuicao;
					variablesInFunction.get(dec.name).add(atrib);
				}
			}

		}
	}

	def verifiesBodyFunction(DecFunc dec) {

		var FunctionBody body = dec.body;
		for (Greeting gret : body.args) {
			
			if(gret instanceof Variable){
				var Variable variable = gret as Variable;
				if(!searchVariable(dec.name, variable.name)){
					if(!variablesDeclarationMap.containsKey(variable.name))
						error(SEMANTIC_ERROR + "Variavel n�o declarada no escopo da fun��o", GoPackage.Literals.DEC_FUNC__BODY);
				}
			}
		}
	}
	
	def searchVariable(String nameFunc, String nameVar){
		var List<Atrib> attrs = variablesInFunction.get(nameFunc);
		for(Atrib at : attrs){
			if(at.name.equals(nameVar)){
				return true;
			}
		}
		return false; 
		
	}

	@Check
	def callFunc(CallFunc callFunc) {
		checkIfFunctionExists(callFunc, GoPackage.Literals.CALL_FUNC__NAME_FUNC);
		var DecFunc func = funcImplements.get(callFunc.nameFunc);

		checkIfHasEqualTypes(func, callFunc);
	}

	/**
	 * Verifies the number of parameters and your respoective types between the function declaration
	 * and function call
	 */
	def checkIfHasEqualTypes(DecFunc func, CallFunc callFunc) {
		if (getParametersSize(func.param) != getParametersSize(callFunc.param)) {
			error(SEMANTIC_ERROR + "Diferen�a entre a quantidade de par�metros", GoPackage.Literals.CALL_FUNC__PARAM);
		}

		var List<String> functionTypes = getParametersType(func.param);
		var List<String> callTypes = getParametersType(callFunc.param);

		for (var int i = 0; i < functionTypes.size(); i++) {
			if (!callTypes.get(i).equals(functionTypes.get(i))) {
				error(
					SEMANTIC_ERROR + "Diferen�a entre os tipos dos par�metros. Tipo Esperado: " + functionTypes.get(i) +
						"  Tipo declarado: " + callTypes.get(i),
					GoPackage.Literals.CALL_FUNC__PARAM
				);
			}
		}
	}

	def getParametersSize(Params param) {
		var List<String> tipos = new ArrayList<String>();
		if (param != null && param.params != null) {
			for (String t : param.params) {
				tipos.add(t);
			}
		}
		return tipos.size();

	}

	

	def getVariableById(String name) {
		return variablesDeclarationMap.get(name);
	}

	def getParametersType(Params param) {

		var List<String> tipos = new ArrayList<String>();
		if (param !== null && param.type !== null) {
			if (param.type.size() == 0) {
				for (String id : param.params) {
					var Atrib variable = getVariableById(id);
					tipos.add(variable.type);
				}
			} else {
				for (String t : param.type) {
					tipos.add(t)
				}
			}

		}
		return tipos;

	}

}
