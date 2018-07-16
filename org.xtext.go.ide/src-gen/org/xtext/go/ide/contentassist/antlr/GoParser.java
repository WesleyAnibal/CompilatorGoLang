/*
 * generated by Xtext 2.13.0
 */
package org.xtext.go.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.go.ide.contentassist.antlr.internal.InternalGoParser;
import org.xtext.go.services.GoGrammarAccess;

public class GoParser extends AbstractContentAssistParser {

	@Inject
	private GoGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalGoParser createParser() {
		InternalGoParser result = new InternalGoParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getGreetingAccess().getAlternatives(), "rule__Greeting__Alternatives");
					put(grammarAccess.getDecVarAccess().getAlternatives(), "rule__DecVar__Alternatives");
					put(grammarAccess.getAtribVarAccess().getAtrbAlternatives_4_1_0(), "rule__AtribVar__AtrbAlternatives_4_1_0");
					put(grammarAccess.getAtribVarAccess().getAtrbAlternatives_4_2_1_0(), "rule__AtribVar__AtrbAlternatives_4_2_1_0");
					put(grammarAccess.getAtribAccess().getAtribAlternatives_4_0(), "rule__Atrib__AtribAlternatives_4_0");
					put(grammarAccess.getMultDecVarsAccess().getAlternatives_2_2(), "rule__MultDecVars__Alternatives_2_2");
					put(grammarAccess.getDecVarsAccess().getAtrbAlternatives_3_0(), "rule__DecVars__AtrbAlternatives_3_0");
					put(grammarAccess.getDecVarsAccess().getAtrbAlternatives_4_1_0(), "rule__DecVars__AtrbAlternatives_4_1_0");
					put(grammarAccess.getAtriAccess().getAlternatives(), "rule__Atri__Alternatives");
					put(grammarAccess.getTypeValueAccess().getAlternatives(), "rule__TypeValue__Alternatives");
					put(grammarAccess.getDecImportAccess().getAlternatives_1(), "rule__DecImport__Alternatives_1");
					put(grammarAccess.getOperationsOneEqualsAccess().getAlternatives_1(), "rule__OperationsOneEquals__Alternatives_1");
					put(grammarAccess.getOperationsOneEqualsAccess().getAlternatives_2(), "rule__OperationsOneEquals__Alternatives_2");
					put(grammarAccess.getNumbersAccess().getAlternatives(), "rule__Numbers__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives_0(), "rule__Expression__Alternatives_0");
					put(grammarAccess.getOpersAccess().getAlternatives(), "rule__Opers__Alternatives");
					put(grammarAccess.getSubMultAccess().getAlternatives(), "rule__SubMult__Alternatives");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
					put(grammarAccess.getOperatorAccess().getAlternatives(), "rule__Operator__Alternatives");
					put(grammarAccess.getOperationsOneAccess().getAlternatives_1(), "rule__OperationsOne__Alternatives_1");
					put(grammarAccess.getVarForAccess().getAlternatives(), "rule__VarFor__Alternatives");
					put(grammarAccess.getVarForAccess().getAtrbAlternatives_1_4_0(), "rule__VarFor__AtrbAlternatives_1_4_0");
					put(grammarAccess.getVarForAccess().getAlternatives_1_10(), "rule__VarFor__Alternatives_1_10");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getTerminalsAccess().getAlternatives(), "rule__Terminals__Alternatives");
					put(grammarAccess.getTypesAccess().getAlternatives(), "rule__Types__Alternatives");
					put(grammarAccess.getModifAccess().getAlternatives(), "rule__Modif__Alternatives");
					put(grammarAccess.getBooleanAccess().getAlternatives(), "rule__Boolean__Alternatives");
					put(grammarAccess.getDeclAccess().getGroup(), "rule__Decl__Group__0");
					put(grammarAccess.getAtribVarAccess().getGroup(), "rule__AtribVar__Group__0");
					put(grammarAccess.getAtribVarAccess().getGroup_2(), "rule__AtribVar__Group_2__0");
					put(grammarAccess.getAtribVarAccess().getGroup_4(), "rule__AtribVar__Group_4__0");
					put(grammarAccess.getAtribVarAccess().getGroup_4_2(), "rule__AtribVar__Group_4_2__0");
					put(grammarAccess.getAtribAccess().getGroup(), "rule__Atrib__Group__0");
					put(grammarAccess.getMultDecVarsAccess().getGroup(), "rule__MultDecVars__Group__0");
					put(grammarAccess.getMultDecVarsAccess().getGroup_2(), "rule__MultDecVars__Group_2__0");
					put(grammarAccess.getDecVarsAccess().getGroup(), "rule__DecVars__Group__0");
					put(grammarAccess.getDecVarsAccess().getGroup_1(), "rule__DecVars__Group_1__0");
					put(grammarAccess.getDecVarsAccess().getGroup_4(), "rule__DecVars__Group_4__0");
					put(grammarAccess.getSwitchCaseAccess().getGroup(), "rule__SwitchCase__Group__0");
					put(grammarAccess.getSwitchCaseAccess().getGroup_4(), "rule__SwitchCase__Group_4__0");
					put(grammarAccess.getCasesAccess().getGroup(), "rule__Cases__Group__0");
					put(grammarAccess.getAtriAccess().getGroup_0(), "rule__Atri__Group_0__0");
					put(grammarAccess.getAtriAccess().getGroup_0_4(), "rule__Atri__Group_0_4__0");
					put(grammarAccess.getParamsAccess().getGroup(), "rule__Params__Group__0");
					put(grammarAccess.getParamsAccess().getGroup_2(), "rule__Params__Group_2__0");
					put(grammarAccess.getDecImportAccess().getGroup(), "rule__DecImport__Group__0");
					put(grammarAccess.getDecImportAccess().getGroup_1_1(), "rule__DecImport__Group_1_1__0");
					put(grammarAccess.getOperationsOneEqualsAccess().getGroup(), "rule__OperationsOneEquals__Group__0");
					put(grammarAccess.getDoubleAccess().getGroup(), "rule__Double__Group__0");
					put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
					put(grammarAccess.getIfConditionAccess().getGroup(), "rule__IfCondition__Group__0");
					put(grammarAccess.getElseIfConditionAccess().getGroup(), "rule__ElseIfCondition__Group__0");
					put(grammarAccess.getElseConditionAccess().getGroup(), "rule__ElseCondition__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getCallForAccess().getGroup(), "rule__CallFor__Group__0");
					put(grammarAccess.getAdditionAccess().getGroup(), "rule__Addition__Group__0");
					put(grammarAccess.getAdditionAccess().getGroup_1(), "rule__Addition__Group_1__0");
					put(grammarAccess.getSubtrationAccess().getGroup(), "rule__Subtration__Group__0");
					put(grammarAccess.getSubtrationAccess().getGroup_1(), "rule__Subtration__Group_1__0");
					put(grammarAccess.getMultiplicationAccess().getGroup(), "rule__Multiplication__Group__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1(), "rule__Multiplication__Group_1__0");
					put(grammarAccess.getDivisionAccess().getGroup(), "rule__Division__Group__0");
					put(grammarAccess.getDivisionAccess().getGroup_1(), "rule__Division__Group_1__0");
					put(grammarAccess.getOrExpressionAccess().getGroup(), "rule__OrExpression__Group__0");
					put(grammarAccess.getOrExpressionAccess().getGroup_1(), "rule__OrExpression__Group_1__0");
					put(grammarAccess.getAndExpressionAccess().getGroup(), "rule__AndExpression__Group__0");
					put(grammarAccess.getAndExpressionAccess().getGroup_1(), "rule__AndExpression__Group_1__0");
					put(grammarAccess.getComparisonExpressionAccess().getGroup(), "rule__ComparisonExpression__Group__0");
					put(grammarAccess.getComparisonExpressionAccess().getGroup_1(), "rule__ComparisonExpression__Group_1__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0(), "rule__PrimaryExpression__Group_0__0");
					put(grammarAccess.getOperationsOneAccess().getGroup(), "rule__OperationsOne__Group__0");
					put(grammarAccess.getVarForAccess().getGroup_1(), "rule__VarFor__Group_1__0");
					put(grammarAccess.getLiteralAccess().getGroup_0(), "rule__Literal__Group_0__0");
					put(grammarAccess.getDecFuncAccess().getGroup(), "rule__DecFunc__Group__0");
					put(grammarAccess.getCallFuncAccess().getGroup(), "rule__CallFunc__Group__0");
					put(grammarAccess.getDataTypeAccess().getGroup(), "rule__DataType__Group__0");
					put(grammarAccess.getGoAccess().getElementsAssignment(), "rule__Go__ElementsAssignment");
					put(grammarAccess.getDeclAccess().getNameAssignment_1(), "rule__Decl__NameAssignment_1");
					put(grammarAccess.getDeclAccess().getTypeAssignment_2(), "rule__Decl__TypeAssignment_2");
					put(grammarAccess.getDecVarAccess().getDeclarationAssignment_0(), "rule__DecVar__DeclarationAssignment_0");
					put(grammarAccess.getDecVarAccess().getAssignmentAssignment_1(), "rule__DecVar__AssignmentAssignment_1");
					put(grammarAccess.getDecVarAccess().getAtribuicaoAssignment_2(), "rule__DecVar__AtribuicaoAssignment_2");
					put(grammarAccess.getAtribVarAccess().getVarsAssignment_1(), "rule__AtribVar__VarsAssignment_1");
					put(grammarAccess.getAtribVarAccess().getVarsAssignment_2_1(), "rule__AtribVar__VarsAssignment_2_1");
					put(grammarAccess.getAtribVarAccess().getTypeAssignment_3(), "rule__AtribVar__TypeAssignment_3");
					put(grammarAccess.getAtribVarAccess().getAtrbAssignment_4_1(), "rule__AtribVar__AtrbAssignment_4_1");
					put(grammarAccess.getAtribVarAccess().getAtrbAssignment_4_2_1(), "rule__AtribVar__AtrbAssignment_4_2_1");
					put(grammarAccess.getAtribAccess().getNameAssignment_1(), "rule__Atrib__NameAssignment_1");
					put(grammarAccess.getAtribAccess().getTypeAssignment_2(), "rule__Atrib__TypeAssignment_2");
					put(grammarAccess.getAtribAccess().getAtribAssignment_4(), "rule__Atrib__AtribAssignment_4");
					put(grammarAccess.getMultDecVarsAccess().getNameAssignment_2_0(), "rule__MultDecVars__NameAssignment_2_0");
					put(grammarAccess.getMultDecVarsAccess().getValueAssignment_2_2_1(), "rule__MultDecVars__ValueAssignment_2_2_1");
					put(grammarAccess.getDecVarsAccess().getVarsAssignment_0(), "rule__DecVars__VarsAssignment_0");
					put(grammarAccess.getDecVarsAccess().getVarsAssignment_1_1(), "rule__DecVars__VarsAssignment_1_1");
					put(grammarAccess.getDecVarsAccess().getAtrbAssignment_3(), "rule__DecVars__AtrbAssignment_3");
					put(grammarAccess.getDecVarsAccess().getAtrbAssignment_4_1(), "rule__DecVars__AtrbAssignment_4_1");
					put(grammarAccess.getSwitchCaseAccess().getNameAssignment_1(), "rule__SwitchCase__NameAssignment_1");
					put(grammarAccess.getSwitchCaseAccess().getCasAssignment_3(), "rule__SwitchCase__CasAssignment_3");
					put(grammarAccess.getSwitchCaseAccess().getKAssignment_4_2(), "rule__SwitchCase__KAssignment_4_2");
					put(grammarAccess.getCasesAccess().getXAssignment_1(), "rule__Cases__XAssignment_1");
					put(grammarAccess.getCasesAccess().getVAssignment_3(), "rule__Cases__VAssignment_3");
					put(grammarAccess.getParamsAccess().getParamsAssignment_0(), "rule__Params__ParamsAssignment_0");
					put(grammarAccess.getParamsAccess().getTypeAssignment_1(), "rule__Params__TypeAssignment_1");
					put(grammarAccess.getParamsAccess().getParamsAssignment_2_1(), "rule__Params__ParamsAssignment_2_1");
					put(grammarAccess.getParamsAccess().getTypeAssignment_2_2(), "rule__Params__TypeAssignment_2_2");
					put(grammarAccess.getOperationsOneEqualsAccess().getNameAssignment_0(), "rule__OperationsOneEquals__NameAssignment_0");
					put(grammarAccess.getConditionAccess().getIfAssignment_0(), "rule__Condition__IfAssignment_0");
					put(grammarAccess.getConditionAccess().getElseifAssignment_1(), "rule__Condition__ElseifAssignment_1");
					put(grammarAccess.getConditionAccess().getElseAssignment_2(), "rule__Condition__ElseAssignment_2");
					put(grammarAccess.getIfConditionAccess().getCondAssignment_1(), "rule__IfCondition__CondAssignment_1");
					put(grammarAccess.getIfConditionAccess().getThenAssignment_3(), "rule__IfCondition__ThenAssignment_3");
					put(grammarAccess.getElseConditionAccess().getThenAssignment_2(), "rule__ElseCondition__ThenAssignment_2");
					put(grammarAccess.getExpressionAccess().getXAssignment_0_0(), "rule__Expression__XAssignment_0_0");
					put(grammarAccess.getCallForAccess().getXAssignment_3(), "rule__CallFor__XAssignment_3");
					put(grammarAccess.getOpersAccess().getSumAssignment_0(), "rule__Opers__SumAssignment_0");
					put(grammarAccess.getOpersAccess().getSubAssignment_1(), "rule__Opers__SubAssignment_1");
					put(grammarAccess.getAdditionAccess().getRightAssignment_1_2(), "rule__Addition__RightAssignment_1_2");
					put(grammarAccess.getSubtrationAccess().getRightAssignment_1_2(), "rule__Subtration__RightAssignment_1_2");
					put(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2(), "rule__Multiplication__RightAssignment_1_2");
					put(grammarAccess.getDivisionAccess().getRightAssignment_1_2(), "rule__Division__RightAssignment_1_2");
					put(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2(), "rule__OrExpression__RightAssignment_1_2");
					put(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2(), "rule__AndExpression__RightAssignment_1_2");
					put(grammarAccess.getComparisonExpressionAccess().getRightAssignment_1_2(), "rule__ComparisonExpression__RightAssignment_1_2");
					put(grammarAccess.getOperationsOneAccess().getNameAssignment_0(), "rule__OperationsOne__NameAssignment_0");
					put(grammarAccess.getVarForAccess().getVarAssignment_1_1(), "rule__VarFor__VarAssignment_1_1");
					put(grammarAccess.getVarForAccess().getAtrbAssignment_1_4(), "rule__VarFor__AtrbAssignment_1_4");
					put(grammarAccess.getVarForAccess().getRightAssignment_1_6(), "rule__VarFor__RightAssignment_1_6");
					put(grammarAccess.getVarForAccess().getLeftAssignment_1_8(), "rule__VarFor__LeftAssignment_1_8");
					put(grammarAccess.getLiteralAccess().getValueAssignment_0_1(), "rule__Literal__ValueAssignment_0_1");
					put(grammarAccess.getDecFuncAccess().getNameAssignment_1(), "rule__DecFunc__NameAssignment_1");
					put(grammarAccess.getDecFuncAccess().getParamAssignment_3(), "rule__DecFunc__ParamAssignment_3");
					put(grammarAccess.getDecFuncAccess().getReturnAssignment_5(), "rule__DecFunc__ReturnAssignment_5");
					put(grammarAccess.getDecFuncAccess().getArgsAssignment_7(), "rule__DecFunc__ArgsAssignment_7");
					put(grammarAccess.getCallFuncAccess().getNameFuncAssignment_0(), "rule__CallFunc__NameFuncAssignment_0");
					put(grammarAccess.getCallFuncAccess().getParamAssignment_2(), "rule__CallFunc__ParamAssignment_2");
					put(grammarAccess.getDataTypeAccess().getNameAssignment_1(), "rule__DataType__NameAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public GoGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GoGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
