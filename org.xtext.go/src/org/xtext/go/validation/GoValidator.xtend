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
//					GoPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

	public static Map<String, List<String>> funcImplements = new HashMap<String, List<String>>();

	@Check
	def checkGreetingStartsWithCapital(DecVar g) {
		if(g.atrb.size() > 0){
			if(g.vars.size() < g.atrb.size()){
				error("n�mero de atribui��es maior que variaveis", GoPackage.Literals.DEC_VAR__VARS);
			}else if(g.vars.size() > g.atrb.size()){
				error("n�mero de atribui��es menor que variaveis", GoPackage.Literals.DEC_VAR__VARS);
			}
		}
	}
	

	def checkIfCallFuncIsValid(CallFunc cf){
		
		if(checkIfCallFuncIdExists(cf.nameFunc.toString())){
			error("Identificador da fun��o n�o existe", GoPackage.Literals.CALL_FUNC__NAME_FUNC);
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
	
	def addFuncToImplements(DecFunc dec){
		funcImplements.put(dec.name.toString(), new ArrayList<String>());
	}

	
}
