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
	
	public static Map<String,DecFunc> funcImplements = new HashMap<String, DecFunc>();
	public static Map<String, Atrib> variablesDeclarationMap     = new HashMap<String, Atrib>();
	

	@Check
	def checkGreetingStartsWithCapital(AtribVar g) {
		if(g.atrb.size() > 0){
			
			if(g.vars.size() < g.atrb.size()){
				error("n�mero de atribui��es maior que variaveis", GoPackage.Literals.DEC_VARS__VARS);
			}else if(g.vars.size() > g.atrb.size()){
				error("n�mero de atribui��es menor que variaveis", GoPackage.Literals.DEC_VARS__VARS);
			}
		}
	}
	
	def boolean checkIfCallFuncIdExists(String funcName){
		
		var out = false; 
		var arr = funcImplements.get(funcName);
		if(arr != null){
			out = true;
		} 
		return out;
		
	}
	
	/**
	 * This function add in the map all the variables in the source code
	 */
	@Check
	def addVariableDeclarations(Atrib dec){
		checkTypeDeclarationAtrib(dec);
		variablesDeclarationMap.put(dec.name.toString(), dec);
	}

	
	def checkTypeDeclarationAtrib (Atrib dec) {
		if(dec.atrib instanceof TypeValue){
			if(dec.type.equals("string") &&  dec.atrib instanceof Numbers){
				error(SEMANTIC_ERROR + "n�o � poss�vel converter number para string" , GoPackage.Literals.ATRIB__TYPE);
			
			}
			if(!dec.type.equals("string") &&  dec.atrib instanceof Str){
				error(SEMANTIC_ERROR + "n�o � poss�vel converter string para " + dec.type , GoPackage.Literals.ATRIB__TYPE);
			
			}
		}
		
	}

	
	// escopo comum
	// obs.: algumas classes nao foram geradas como a Opers, entao,
		// para contornar esse erro, na gramatica de expression, colocamos atributos como sum e sub em expression, para acessar esse tipo de tratamento.
	
	
	@Check
	def checkIfVariableIsDeclarated(Variable variable){
		if(!variablesDeclarationMap.containsKey(variable.name)){
			error(SEMANTIC_ERROR + "variavel n�o declarada", GoPackage.Literals.VARIABLE__NAME);
		}
		
	}
		
	@Check
	def addFuncToImplements(DecFunc dec){
		funcImplements.put(dec.name.toString(), dec);			

	}
	
	@Check 
	def checkIfFunctionOverhead(DecFunc dec){
		if (!funcImplements.containsKey(dec.name) ){
			error(SEMANTIC_ERROR + "fun��o n�o declarada",GoPackage.Literals.CALL_FUNC__NAME_FUNC);
		} 
	}
	
	@Check
	def callFunc(CallFunc callFunc){
		if (!funcImplements.containsKey(callFunc.nameFunc) ){
			error(SEMANTIC_ERROR + "fun��o n�o declarada",GoPackage.Literals.CALL_FUNC__NAME_FUNC);
		} 
		var DecFunc func = funcImplements.get(callFunc.nameFunc);
		
		checkIfHasEqualTypes(func, callFunc);
	}
	

	
	/**
	 * Verifies the number of parameters and your respoective types between the function declaration
	 * and function call
	 */
	def checkIfHasEqualTypes(DecFunc func, CallFunc callFunc){
		if(getParametersSize(func.param) != getParametersSize(callFunc.param)){
			error(SEMANTIC_ERROR + "Diferen�a entre a quantidade de par�metros" ,GoPackage.Literals.CALL_FUNC__PARAM);
		}
		
		var List<String> functionTypes = getParametersType(func.param);
		var List<String> callTypes = getParametersType(callFunc.param);
		
		
		
		for(var int i = 0; i < functionTypes.size() ; i++){
			if(!callTypes.get(i).equals(functionTypes.get(i))){
				error(SEMANTIC_ERROR + "Diferen�a entre os tipos dos par�metros. Tipo Esperado: " + functionTypes.get(i) 
							+ "  Tipo declarado: " + callTypes.get(i) ,GoPackage.Literals.CALL_FUNC__PARAM
				);
			}
		}
	}

	def getParametersSize(Params param){
		var List<String> tipos = new ArrayList<String>();
		if(param != null && param.params != null){
			for(String t : param.params){
				tipos.add(t);
			}
		}
		return tipos.size(); 
			
	}
	
	def getParametersType(Params param){
		
		var List<String> tipos = new ArrayList<String>();
		if(param !== null && param.type !== null){
			for(String id : param.type){
				tipos.add(id)
			}
		}
		return tipos; 
			
	}
	

	
	
	
	
}
