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
	protected AbstractElementAlias match_Division_Greeting_Multiplication_Operations_Subtraction_Sum_EOLTerminalRuleCall_4_or_EntityParserRuleCall_2_or_INTTerminalRuleCall_4_or___INTTerminalRuleCall_0_AstericsTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_BarTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_MinusTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_PlusTerminalRuleCall_1_INTTerminalRuleCall_2__;
	protected AbstractElementAlias match_Division_Literal_Multiplication_Operations_Subtraction_Sum_FalseKeyword_1_or_INTTerminalRuleCall_4_or___INTTerminalRuleCall_0_AstericsTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_BarTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_MinusTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_PlusTerminalRuleCall_1_INTTerminalRuleCall_2__;
	protected AbstractElementAlias match_Division_Multiplication_Operations_Subtraction_Sum_INTTerminalRuleCall_4_or___INTTerminalRuleCall_0_AstericsTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_BarTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_MinusTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_PlusTerminalRuleCall_1_INTTerminalRuleCall_2__;
	protected AbstractElementAlias match_PrimaryExpression_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_PrimaryExpression_LeftParenthesisKeyword_0_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GoGrammarAccess) access;
		match_Division_Greeting_Multiplication_Operations_Subtraction_Sum_EOLTerminalRuleCall_4_or_EntityParserRuleCall_2_or_INTTerminalRuleCall_4_or___INTTerminalRuleCall_0_AstericsTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_BarTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_MinusTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_PlusTerminalRuleCall_1_INTTerminalRuleCall_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDivisionAccess().getINTTerminalRuleCall_0()), new TokenAlias(false, false, grammarAccess.getDivisionAccess().getBarTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getDivisionAccess().getINTTerminalRuleCall_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMultiplicationAccess().getINTTerminalRuleCall_0()), new TokenAlias(false, false, grammarAccess.getMultiplicationAccess().getAstericsTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getMultiplicationAccess().getINTTerminalRuleCall_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getSubtractionAccess().getINTTerminalRuleCall_0()), new TokenAlias(false, false, grammarAccess.getSubtractionAccess().getMinusTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getSubtractionAccess().getINTTerminalRuleCall_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getSumAccess().getINTTerminalRuleCall_0()), new TokenAlias(false, false, grammarAccess.getSumAccess().getPlusTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getSumAccess().getINTTerminalRuleCall_2())), new TokenAlias(false, false, grammarAccess.getGreetingAccess().getEOLTerminalRuleCall_4()), new TokenAlias(false, false, grammarAccess.getGreetingAccess().getEntityParserRuleCall_2()), new TokenAlias(false, false, grammarAccess.getOperationsAccess().getINTTerminalRuleCall_4()));
		match_Division_Literal_Multiplication_Operations_Subtraction_Sum_FalseKeyword_1_or_INTTerminalRuleCall_4_or___INTTerminalRuleCall_0_AstericsTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_BarTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_MinusTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_PlusTerminalRuleCall_1_INTTerminalRuleCall_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDivisionAccess().getINTTerminalRuleCall_0()), new TokenAlias(false, false, grammarAccess.getDivisionAccess().getBarTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getDivisionAccess().getINTTerminalRuleCall_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMultiplicationAccess().getINTTerminalRuleCall_0()), new TokenAlias(false, false, grammarAccess.getMultiplicationAccess().getAstericsTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getMultiplicationAccess().getINTTerminalRuleCall_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getSubtractionAccess().getINTTerminalRuleCall_0()), new TokenAlias(false, false, grammarAccess.getSubtractionAccess().getMinusTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getSubtractionAccess().getINTTerminalRuleCall_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getSumAccess().getINTTerminalRuleCall_0()), new TokenAlias(false, false, grammarAccess.getSumAccess().getPlusTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getSumAccess().getINTTerminalRuleCall_2())), new TokenAlias(false, false, grammarAccess.getLiteralAccess().getFalseKeyword_1()), new TokenAlias(false, false, grammarAccess.getOperationsAccess().getINTTerminalRuleCall_4()));
		match_Division_Multiplication_Operations_Subtraction_Sum_INTTerminalRuleCall_4_or___INTTerminalRuleCall_0_AstericsTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_BarTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_MinusTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_PlusTerminalRuleCall_1_INTTerminalRuleCall_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDivisionAccess().getINTTerminalRuleCall_0()), new TokenAlias(false, false, grammarAccess.getDivisionAccess().getBarTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getDivisionAccess().getINTTerminalRuleCall_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMultiplicationAccess().getINTTerminalRuleCall_0()), new TokenAlias(false, false, grammarAccess.getMultiplicationAccess().getAstericsTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getMultiplicationAccess().getINTTerminalRuleCall_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getSubtractionAccess().getINTTerminalRuleCall_0()), new TokenAlias(false, false, grammarAccess.getSubtractionAccess().getMinusTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getSubtractionAccess().getINTTerminalRuleCall_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getSumAccess().getINTTerminalRuleCall_0()), new TokenAlias(false, false, grammarAccess.getSumAccess().getPlusTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getSumAccess().getINTTerminalRuleCall_2())), new TokenAlias(false, false, grammarAccess.getOperationsAccess().getINTTerminalRuleCall_4()));
		match_PrimaryExpression_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
		match_PrimaryExpression_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getAstericsRule())
			return getAstericsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getBarRule())
			return getBarToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getELSERule())
			return getELSEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getEOLRule())
			return getEOLToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getEntityRule())
			return getEntityToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getFUNCRule())
			return getFUNCToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getIFRule())
			return getIFToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getMinusRule())
			return getMinusToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPlusRule())
			return getPlusToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTYPERule())
			return getTYPEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getVARRule())
			return getVARToken(semanticObject, ruleCall, node);
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
	 * Entity:
	 * 	'print' '(' (STRING | INT+) ')';
	 */
	protected String getEntityToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "print(\"\")";
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
	 * IF:
	 * 	"if";
	 */
	protected String getIFToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "if";
	}
	
	/**
	 * terminal INT returns ecore::EInt: ('0'..'9')+;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
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
	 * terminal Plus:
	 * 	"+";
	 */
	protected String getPlusToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+";
	}
	
	/**
	 * TYPE:
	 * 	"type";
	 */
	protected String getTYPEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "type";
	}
	
	/**
	 * VAR:
	 * 	"var";
	 */
	protected String getVARToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "var";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Division_Greeting_Multiplication_Operations_Subtraction_Sum_EOLTerminalRuleCall_4_or_EntityParserRuleCall_2_or_INTTerminalRuleCall_4_or___INTTerminalRuleCall_0_AstericsTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_BarTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_MinusTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_PlusTerminalRuleCall_1_INTTerminalRuleCall_2__.equals(syntax))
				emit_Division_Greeting_Multiplication_Operations_Subtraction_Sum_EOLTerminalRuleCall_4_or_EntityParserRuleCall_2_or_INTTerminalRuleCall_4_or___INTTerminalRuleCall_0_AstericsTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_BarTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_MinusTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_PlusTerminalRuleCall_1_INTTerminalRuleCall_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Division_Literal_Multiplication_Operations_Subtraction_Sum_FalseKeyword_1_or_INTTerminalRuleCall_4_or___INTTerminalRuleCall_0_AstericsTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_BarTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_MinusTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_PlusTerminalRuleCall_1_INTTerminalRuleCall_2__.equals(syntax))
				emit_Division_Literal_Multiplication_Operations_Subtraction_Sum_FalseKeyword_1_or_INTTerminalRuleCall_4_or___INTTerminalRuleCall_0_AstericsTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_BarTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_MinusTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_PlusTerminalRuleCall_1_INTTerminalRuleCall_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Division_Multiplication_Operations_Subtraction_Sum_INTTerminalRuleCall_4_or___INTTerminalRuleCall_0_AstericsTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_BarTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_MinusTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_PlusTerminalRuleCall_1_INTTerminalRuleCall_2__.equals(syntax))
				emit_Division_Multiplication_Operations_Subtraction_Sum_INTTerminalRuleCall_4_or___INTTerminalRuleCall_0_AstericsTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_BarTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_MinusTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_PlusTerminalRuleCall_1_INTTerminalRuleCall_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrimaryExpression_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_PrimaryExpression_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrimaryExpression_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_PrimaryExpression_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     (
	  *         (INT Plus INT) | 
	  *         (INT Asterics INT) | 
	  *         (INT Bar INT) | 
	  *         (INT Minus INT) | 
	  *         EOL | 
	  *         Entity | 
	  *         INT
	  *     )
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Division_Greeting_Multiplication_Operations_Subtraction_Sum_EOLTerminalRuleCall_4_or_EntityParserRuleCall_2_or_INTTerminalRuleCall_4_or___INTTerminalRuleCall_0_AstericsTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_BarTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_MinusTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_PlusTerminalRuleCall_1_INTTerminalRuleCall_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         (INT Plus INT) | 
	  *         (INT Asterics INT) | 
	  *         (INT Bar INT) | 
	  *         (INT Minus INT) | 
	  *         'false' | 
	  *         INT
	  *     )
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '('* (ambiguity) (rule start)
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Division_Literal_Multiplication_Operations_Subtraction_Sum_FalseKeyword_1_or_INTTerminalRuleCall_4_or___INTTerminalRuleCall_0_AstericsTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_BarTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_MinusTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_PlusTerminalRuleCall_1_INTTerminalRuleCall_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (INT Plus INT) | (INT Asterics INT) | (INT Bar INT) | (INT Minus INT) | INT
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Division_Multiplication_Operations_Subtraction_Sum_INTTerminalRuleCall_4_or___INTTerminalRuleCall_0_AstericsTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_BarTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_MinusTerminalRuleCall_1_INTTerminalRuleCall_2___or___INTTerminalRuleCall_0_PlusTerminalRuleCall_1_INTTerminalRuleCall_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) ((INT Plus INT) | (INT Asterics INT) | (INT Bar INT) | (INT Minus INT) | 'false' | INT) (rule start)
	 *     (rule start) (ambiguity) value='true'
	 *     (rule start) (ambiguity) {AndExpression.left=}
	 *     (rule start) (ambiguity) {ComparisonExpression.left=}
	 *     (rule start) (ambiguity) {OrExpression.left=}
	 */
	protected void emit_PrimaryExpression_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {AndExpression.left=}
	 *     (rule start) (ambiguity) {ComparisonExpression.left=}
	 *     (rule start) (ambiguity) {OrExpression.left=}
	 */
	protected void emit_PrimaryExpression_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
