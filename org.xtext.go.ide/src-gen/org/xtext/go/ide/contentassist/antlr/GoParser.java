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
					put(grammarAccess.getAtriAccess().getAlternatives(), "rule__Atri__Alternatives");
					put(grammarAccess.getTypeValueAccess().getAlternatives(), "rule__TypeValue__Alternatives");
					put(grammarAccess.getDecImportAccess().getAlternatives_1(), "rule__DecImport__Alternatives_1");
					put(grammarAccess.getIAccess().getAlternatives(), "rule__I__Alternatives");
					put(grammarAccess.getYAccess().getAlternatives(), "rule__Y__Alternatives");
					put(grammarAccess.getFAccess().getAlternatives(), "rule__F__Alternatives");
					put(grammarAccess.getNumbersAccess().getAlternatives(), "rule__Numbers__Alternatives");
					put(grammarAccess.getComparisonExpressionAccess().getOperatorAlternatives_1_1_0(), "rule__ComparisonExpression__OperatorAlternatives_1_1_0");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getTerminalsAccess().getAlternatives(), "rule__Terminals__Alternatives");
					put(grammarAccess.getTypesAccess().getAlternatives(), "rule__Types__Alternatives");
					put(grammarAccess.getBooleanAccess().getAlternatives(), "rule__Boolean__Alternatives");
					put(grammarAccess.getEntityAccess().getAlternatives_2(), "rule__Entity__Alternatives_2");
					put(grammarAccess.getDecVarAccess().getGroup_1(), "rule__DecVar__Group_1__0");
					put(grammarAccess.getDecVarAccess().getGroup_1_2(), "rule__DecVar__Group_1_2__0");
					put(grammarAccess.getDecVarAccess().getGroup_1_4(), "rule__DecVar__Group_1_4__0");
					put(grammarAccess.getDecVarAccess().getGroup_1_4_2(), "rule__DecVar__Group_1_4_2__0");
					put(grammarAccess.getDecVarsAccess().getGroup(), "rule__DecVars__Group__0");
					put(grammarAccess.getDecVarsAccess().getGroup_1(), "rule__DecVars__Group_1__0");
					put(grammarAccess.getDecVarsAccess().getGroup_4(), "rule__DecVars__Group_4__0");
					put(grammarAccess.getAtriAccess().getGroup_0(), "rule__Atri__Group_0__0");
					put(grammarAccess.getAtriAccess().getGroup_0_4(), "rule__Atri__Group_0_4__0");
					put(grammarAccess.getParamsAccess().getGroup(), "rule__Params__Group__0");
					put(grammarAccess.getParamsAccess().getGroup_2(), "rule__Params__Group_2__0");
					put(grammarAccess.getDecImportAccess().getGroup(), "rule__DecImport__Group__0");
					put(grammarAccess.getDecImportAccess().getGroup_1_1(), "rule__DecImport__Group_1_1__0");
					put(grammarAccess.getOperationsAccess().getGroup(), "rule__Operations__Group__0");
					put(grammarAccess.getIAccess().getGroup_0(), "rule__I__Group_0__0");
					put(grammarAccess.getIAccess().getGroup_1(), "rule__I__Group_1__0");
					put(grammarAccess.getTAccess().getGroup(), "rule__T__Group__0");
					put(grammarAccess.getYAccess().getGroup_0(), "rule__Y__Group_0__0");
					put(grammarAccess.getYAccess().getGroup_1(), "rule__Y__Group_1__0");
					put(grammarAccess.getFAccess().getGroup_0(), "rule__F__Group_0__0");
					put(grammarAccess.getDoubleAccess().getGroup(), "rule__Double__Group__0");
					put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
					put(grammarAccess.getIfConditionAccess().getGroup(), "rule__IfCondition__Group__0");
					put(grammarAccess.getElseIfConditionAccess().getGroup(), "rule__ElseIfCondition__Group__0");
					put(grammarAccess.getElseConditionAccess().getGroup(), "rule__ElseCondition__Group__0");
					put(grammarAccess.getOrExpressionAccess().getGroup(), "rule__OrExpression__Group__0");
					put(grammarAccess.getOrExpressionAccess().getGroup_1(), "rule__OrExpression__Group_1__0");
					put(grammarAccess.getAndExpressionAccess().getGroup(), "rule__AndExpression__Group__0");
					put(grammarAccess.getAndExpressionAccess().getGroup_1(), "rule__AndExpression__Group_1__0");
					put(grammarAccess.getComparisonExpressionAccess().getGroup(), "rule__ComparisonExpression__Group__0");
					put(grammarAccess.getComparisonExpressionAccess().getGroup_1(), "rule__ComparisonExpression__Group_1__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0(), "rule__PrimaryExpression__Group_0__0");
					put(grammarAccess.getLiteralAccess().getGroup_0(), "rule__Literal__Group_0__0");
					put(grammarAccess.getDecFuncAccess().getGroup(), "rule__DecFunc__Group__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getDataTypeAccess().getGroup(), "rule__DataType__Group__0");
					put(grammarAccess.getGoAccess().getElementsAssignment(), "rule__Go__ElementsAssignment");
					put(grammarAccess.getDecVarAccess().getVarsAssignment_1_1(), "rule__DecVar__VarsAssignment_1_1");
					put(grammarAccess.getDecVarAccess().getVarsAssignment_1_2_1(), "rule__DecVar__VarsAssignment_1_2_1");
					put(grammarAccess.getDecVarAccess().getAtrbAssignment_1_4_1(), "rule__DecVar__AtrbAssignment_1_4_1");
					put(grammarAccess.getDecVarAccess().getAtrbAssignment_1_4_2_1(), "rule__DecVar__AtrbAssignment_1_4_2_1");
					put(grammarAccess.getDecVarsAccess().getVarsAssignment_0(), "rule__DecVars__VarsAssignment_0");
					put(grammarAccess.getDecVarsAccess().getVarsAssignment_1_1(), "rule__DecVars__VarsAssignment_1_1");
					put(grammarAccess.getDecVarsAccess().getAtrbAssignment_3(), "rule__DecVars__AtrbAssignment_3");
					put(grammarAccess.getDecVarsAccess().getAtrbAssignment_4_1(), "rule__DecVars__AtrbAssignment_4_1");
					put(grammarAccess.getParamsAccess().getParamsAssignment_0(), "rule__Params__ParamsAssignment_0");
					put(grammarAccess.getParamsAccess().getParamsAssignment_2_1(), "rule__Params__ParamsAssignment_2_1");
					put(grammarAccess.getOperationsAccess().getOAssignment_1(), "rule__Operations__OAssignment_1");
					put(grammarAccess.getIAccess().getOAssignment_0_2(), "rule__I__OAssignment_0_2");
					put(grammarAccess.getIAccess().getOAssignment_1_2(), "rule__I__OAssignment_1_2");
					put(grammarAccess.getTAccess().getOAssignment_1(), "rule__T__OAssignment_1");
					put(grammarAccess.getYAccess().getOAssignment_0_1(), "rule__Y__OAssignment_0_1");
					put(grammarAccess.getYAccess().getOAssignment_0_2(), "rule__Y__OAssignment_0_2");
					put(grammarAccess.getYAccess().getOAssignment_1_1(), "rule__Y__OAssignment_1_1");
					put(grammarAccess.getYAccess().getOAssignment_1_2(), "rule__Y__OAssignment_1_2");
					put(grammarAccess.getFAccess().getOAssignment_0_1(), "rule__F__OAssignment_0_1");
					put(grammarAccess.getConditionAccess().getIfAssignment_0(), "rule__Condition__IfAssignment_0");
					put(grammarAccess.getConditionAccess().getElseifAssignment_1(), "rule__Condition__ElseifAssignment_1");
					put(grammarAccess.getConditionAccess().getElseAssignment_2(), "rule__Condition__ElseAssignment_2");
					put(grammarAccess.getIfConditionAccess().getCondAssignment_1(), "rule__IfCondition__CondAssignment_1");
					put(grammarAccess.getIfConditionAccess().getThenAssignment_3(), "rule__IfCondition__ThenAssignment_3");
					put(grammarAccess.getElseConditionAccess().getThenAssignment_2(), "rule__ElseCondition__ThenAssignment_2");
					put(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2(), "rule__OrExpression__RightAssignment_1_2");
					put(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2(), "rule__AndExpression__RightAssignment_1_2");
					put(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1(), "rule__ComparisonExpression__OperatorAssignment_1_1");
					put(grammarAccess.getComparisonExpressionAccess().getRightAssignment_1_2(), "rule__ComparisonExpression__RightAssignment_1_2");
					put(grammarAccess.getLiteralAccess().getValueAssignment_0_1(), "rule__Literal__ValueAssignment_0_1");
					put(grammarAccess.getDecFuncAccess().getNameAssignment_1(), "rule__DecFunc__NameAssignment_1");
					put(grammarAccess.getDecFuncAccess().getParamAssignment_3(), "rule__DecFunc__ParamAssignment_3");
					put(grammarAccess.getDecFuncAccess().getArgsAssignment_6(), "rule__DecFunc__ArgsAssignment_6");
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
