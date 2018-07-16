/*
 * generated by Xtext 2.13.0
 */
package org.xtext.go.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.go.services.GoGrammarAccess;

@SuppressWarnings("all")
public class GoSyntacticSequencer extends AbstractSyntacticSequencer {

	protected GoGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Greeting_DecImportParserRuleCall_7_or_EOLTerminalRuleCall_4;
	protected AbstractElementAlias match_OperationsOneEquals_IDTerminalRuleCall_2_0_or_NumbersParserRuleCall_2_1;
	protected AbstractElementAlias match_OperationsOneEquals_MinusEqualsTerminalRuleCall_1_1_or_PlusEqualsTerminalRuleCall_1_0;
	protected AbstractElementAlias match_PrimaryExpression_Open_parenthesesTerminalRuleCall_0_0_a;
	protected AbstractElementAlias match_PrimaryExpression_Open_parenthesesTerminalRuleCall_0_0_p;
	protected AbstractElementAlias match_SwitchCase___DEFAULTParserRuleCall_4_0_DoisPontosTerminalRuleCall_4_1__q;
	protected AbstractElementAlias match_operationsOne_MinusOneTerminalRuleCall_1_1_or_PlusOneTerminalRuleCall_1_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GoGrammarAccess) access;
		match_Greeting_DecImportParserRuleCall_7_or_EOLTerminalRuleCall_4 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getGreetingAccess().getDecImportParserRuleCall_7()), new TokenAlias(false, false, grammarAccess.getGreetingAccess().getEOLTerminalRuleCall_4()));
		match_OperationsOneEquals_IDTerminalRuleCall_2_0_or_NumbersParserRuleCall_2_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getOperationsOneEqualsAccess().getIDTerminalRuleCall_2_0()), new TokenAlias(false, false, grammarAccess.getOperationsOneEqualsAccess().getNumbersParserRuleCall_2_1()));
		match_OperationsOneEquals_MinusEqualsTerminalRuleCall_1_1_or_PlusEqualsTerminalRuleCall_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getOperationsOneEqualsAccess().getMinusEqualsTerminalRuleCall_1_1()), new TokenAlias(false, false, grammarAccess.getOperationsOneEqualsAccess().getPlusEqualsTerminalRuleCall_1_0()));
		match_PrimaryExpression_Open_parenthesesTerminalRuleCall_0_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryExpressionAccess().getOpen_parenthesesTerminalRuleCall_0_0());
		match_PrimaryExpression_Open_parenthesesTerminalRuleCall_0_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryExpressionAccess().getOpen_parenthesesTerminalRuleCall_0_0());
		match_SwitchCase___DEFAULTParserRuleCall_4_0_DoisPontosTerminalRuleCall_4_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSwitchCaseAccess().getDEFAULTParserRuleCall_4_0()), new TokenAlias(false, false, grammarAccess.getSwitchCaseAccess().getDoisPontosTerminalRuleCall_4_1()));
		match_operationsOne_MinusOneTerminalRuleCall_1_1_or_PlusOneTerminalRuleCall_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getOperationsOneAccess().getMinusOneTerminalRuleCall_1_1()), new TokenAlias(false, false, grammarAccess.getOperationsOneAccess().getPlusOneTerminalRuleCall_1_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getAstericsRule())
			return getAstericsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getBarRule())
			return getBarToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCASERule())
			return getCASEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getClosed_KeyRule())
			return getClosed_KeyToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getClosed_parenthesesRule())
			return getClosed_parenthesesToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCommaRule())
			return getCommaToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDEFAULTRule())
			return getDEFAULTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDecImportRule())
			return getDecImportToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDoisPontosRule())
			return getDoisPontosToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDotRule())
			return getDotToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getELSERule())
			return getELSEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getEOLRule())
			return getEOLToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getFORRule())
			return getFORToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getFUNCRule())
			return getFUNCToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getIFRule())
			return getIFToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getMinusRule())
			return getMinusToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getMinusEqualsRule())
			return getMinusEqualsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getMinusOneRule())
			return getMinusOneToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getModifRule())
			return getModifToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getNumbersRule())
			return getNumbersToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getOpen_KeyRule())
			return getOpen_KeyToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getOpen_parenthesesRule())
			return getOpen_parenthesesToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getOperatorRule())
			return getOperatorToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPlusRule())
			return getPlusToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPlusEqualsRule())
			return getPlusEqualsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPlusOneRule())
			return getPlusOneToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPontoVirgulaRule())
			return getPontoVirgulaToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSWITCHRule())
			return getSWITCHToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTypesRule())
			return getTypesToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal Asterics:
	 * 	"*";
	 */
	protected String getAstericsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "*";
	}
	
	/**
	 * terminal Bar:
	 * 	"/";
	 */
	protected String getBarToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "/";
	}
	
	/**
	 * CASE:
	 * 	"case";
	 */
	protected String getCASEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "case";
	}
	
	/**
	 * terminal Closed_Key:
	 * 	"}";
	 */
	protected String getClosed_KeyToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	
	/**
	 * terminal Closed_parentheses:
	 * 	")";
	 */
	protected String getClosed_parenthesesToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ")";
	}
	
	/**
	 * terminal Comma:
	 * 	",";
	 */
	protected String getCommaToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	/**
	 * DEFAULT:
	 * "default";
	 */
	protected String getDEFAULTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "default";
	}
	
	/**
	 * DecImport:
	 * 	IMPORT (STRING | Open_parentheses STRING+ Closed_parentheses);
	 */
	protected String getDecImportToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "import\"\"";
	}
	
	/**
	 * terminal DoisPontos:
	 *  	":"	
	 * ;
	 */
	protected String getDoisPontosToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":";
	}
	
	/**
	 * terminal Dot:
	 * 	".";
	 */
	protected String getDotToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	
	/**
	 * ELSE:
	 * 	"else";
	 */
	protected String getELSEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "else";
	}
	
	/**
	 * terminal EOL:
	 * 	NEWLINE | COMMENTS;
	 */
	protected String getEOLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\n";
	}
	
	/**
	 * FOR:
	 * 	"for";
	 */
	protected String getFORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "for";
	}
	
	/**
	 * FUNC:
	 * 	"func";
	 */
	protected String getFUNCToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "func";
	}
	
	/**
	 * terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * IF:
	 * 	"if";
	 */
	protected String getIFToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "if";
	}
	
	/**
	 * terminal Minus:
	 * 	"-";
	 */
	protected String getMinusToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "-";
	}
	
	/**
	 * terminal MinusEquals:
	 * 	"-=";
	 */
	protected String getMinusEqualsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "-=";
	}
	
	/**
	 * terminal MinusOne:
	 * 	"--";
	 */
	protected String getMinusOneToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "--";
	}
	
	/**
	 * Modif:
	 * 	VAR | CONST;
	 */
	protected String getModifToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "var";
	}
	
	/**
	 * Numbers:
	 * 	INT | Double;
	 */
	protected String getNumbersToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal Open_Key:
	 * 	"{";
	 */
	protected String getOpen_KeyToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	
	/**
	 * terminal Open_parentheses:
	 * 	"(";
	 */
	protected String getOpen_parenthesesToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
	}
	
	/**
	 * Operator:
	 * 	"<"|"<="|"=="|">="|">";
	 */
	protected String getOperatorToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<";
	}
	
	/**
	 * terminal Plus:
	 * 	"+";
	 */
	protected String getPlusToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+";
	}
	
	/**
	 * terminal PlusEquals:
	 * 	"+=";
	 */
	protected String getPlusEqualsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+=";
	}
	
	/**
	 * terminal PlusOne:
	 * 	"++";
	 */
	protected String getPlusOneToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "++";
	}
	
	/**
	 * terminal PontoVirgula:
	 * 	";";
	 */
	protected String getPontoVirgulaToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	
	/**
	 * SWITCH:
	 * 	"switch";
	 */
	protected String getSWITCHToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "switch";
	}
	
	/**
	 * Types:
	 * 	TYPE | "string" |"int" | "bool"| "byte" | "rune" |"float32" | "float64";
	 */
	protected String getTypesToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "type";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Greeting_DecImportParserRuleCall_7_or_EOLTerminalRuleCall_4.equals(syntax))
				emit_Greeting_DecImportParserRuleCall_7_or_EOLTerminalRuleCall_4(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_OperationsOneEquals_IDTerminalRuleCall_2_0_or_NumbersParserRuleCall_2_1.equals(syntax))
				emit_OperationsOneEquals_IDTerminalRuleCall_2_0_or_NumbersParserRuleCall_2_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_OperationsOneEquals_MinusEqualsTerminalRuleCall_1_1_or_PlusEqualsTerminalRuleCall_1_0.equals(syntax))
				emit_OperationsOneEquals_MinusEqualsTerminalRuleCall_1_1_or_PlusEqualsTerminalRuleCall_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrimaryExpression_Open_parenthesesTerminalRuleCall_0_0_a.equals(syntax))
				emit_PrimaryExpression_Open_parenthesesTerminalRuleCall_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrimaryExpression_Open_parenthesesTerminalRuleCall_0_0_p.equals(syntax))
				emit_PrimaryExpression_Open_parenthesesTerminalRuleCall_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SwitchCase___DEFAULTParserRuleCall_4_0_DoisPontosTerminalRuleCall_4_1__q.equals(syntax))
				emit_SwitchCase___DEFAULTParserRuleCall_4_0_DoisPontosTerminalRuleCall_4_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_operationsOne_MinusOneTerminalRuleCall_1_1_or_PlusOneTerminalRuleCall_1_0.equals(syntax))
				emit_operationsOne_MinusOneTerminalRuleCall_1_1_or_PlusOneTerminalRuleCall_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     EOL | DecImport
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Greeting_DecImportParserRuleCall_7_or_EOLTerminalRuleCall_4(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     Numbers | ID
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (PlusEquals | MinusEquals) (ambiguity) (rule end)
	 *     name=ID (PlusEquals | MinusEquals) (ambiguity) Open_Key Closed_Key (rule end)
	 *     name=ID (PlusEquals | MinusEquals) (ambiguity) Open_Key x=Greeting
	 */
	protected void emit_OperationsOneEquals_IDTerminalRuleCall_2_0_or_NumbersParserRuleCall_2_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     PlusEquals | MinusEquals
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) (ID | Numbers) (rule end)
	 *     name=ID (ambiguity) (Numbers | ID) (rule end)
	 *     name=ID (ambiguity) (Numbers | ID) Open_Key Closed_Key (rule end)
	 *     name=ID (ambiguity) (Numbers | ID) Open_Key x=Greeting
	 */
	protected void emit_OperationsOneEquals_MinusEqualsTerminalRuleCall_1_1_or_PlusEqualsTerminalRuleCall_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     Open_parentheses*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) value=Boolean
	 *     (rule start) (ambiguity) {Addition.left=}
	 *     (rule start) (ambiguity) {AndExpression.left=}
	 *     (rule start) (ambiguity) {ComparisonExpression.left=}
	 *     (rule start) (ambiguity) {Division.left=}
	 *     (rule start) (ambiguity) {Multiplication.left=}
	 *     (rule start) (ambiguity) {OrExpression.left=}
	 *     (rule start) (ambiguity) {Subtration.left=}
	 *     (rule start) FOR (ambiguity) value=Boolean
	 *     (rule start) FOR (ambiguity) {ComparisonExpression.left=}
	 */
	protected void emit_PrimaryExpression_Open_parenthesesTerminalRuleCall_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     Open_parentheses+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {Addition.left=}
	 *     (rule start) (ambiguity) {AndExpression.left=}
	 *     (rule start) (ambiguity) {ComparisonExpression.left=}
	 *     (rule start) (ambiguity) {Division.left=}
	 *     (rule start) (ambiguity) {Multiplication.left=}
	 *     (rule start) (ambiguity) {OrExpression.left=}
	 *     (rule start) (ambiguity) {Subtration.left=}
	 *     (rule start) FOR (ambiguity) {Addition.left=}
	 *     (rule start) FOR (ambiguity) {AndExpression.left=}
	 *     (rule start) FOR (ambiguity) {Division.left=}
	 *     (rule start) FOR (ambiguity) {Multiplication.left=}
	 *     (rule start) FOR (ambiguity) {OrExpression.left=}
	 *     (rule start) FOR (ambiguity) {Subtration.left=}
	 */
	protected void emit_PrimaryExpression_Open_parenthesesTerminalRuleCall_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (DEFAULT DoisPontos)?
	 *
	 * This ambiguous syntax occurs at:
	 *     cas=Cases (ambiguity) Closed_Key (rule end)
	 *     name=ID Open_Key (ambiguity) Closed_Key (rule end)
	 */
	protected void emit_SwitchCase___DEFAULTParserRuleCall_4_0_DoisPontosTerminalRuleCall_4_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     PlusOne | MinusOne
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) (rule end)
	 *     name=ID (ambiguity) Open_Key Closed_Key (rule end)
	 *     name=ID (ambiguity) Open_Key x=Greeting
	 */
	protected void emit_operationsOne_MinusOneTerminalRuleCall_1_1_or_PlusOneTerminalRuleCall_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
