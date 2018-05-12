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
					put(grammarAccess.getComparisonExpressionAccess().getOperatorAlternatives_1_1_0(), "rule__ComparisonExpression__OperatorAlternatives_1_1_0");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getTerminalsAccess().getAlternatives(), "rule__Terminals__Alternatives");
					put(grammarAccess.getEntityAccess().getAlternatives_2(), "rule__Entity__Alternatives_2");
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
					put(grammarAccess.getDecFuncAccess().getGroup_4(), "rule__DecFunc__Group_4__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getDataTypeAccess().getGroup(), "rule__DataType__Group__0");
					put(grammarAccess.getGoAccess().getElementsAssignment(), "rule__Go__ElementsAssignment");
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
					put(grammarAccess.getDecFuncAccess().getParameterAssignment_3(), "rule__DecFunc__ParameterAssignment_3");
					put(grammarAccess.getDecFuncAccess().getParameterAssignment_4_1(), "rule__DecFunc__ParameterAssignment_4_1");
					put(grammarAccess.getDecFuncAccess().getArgsAssignment_7(), "rule__DecFunc__ArgsAssignment_7");
					put(grammarAccess.getEntityAccess().getNameAssignment_2_0(), "rule__Entity__NameAssignment_2_0");
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
