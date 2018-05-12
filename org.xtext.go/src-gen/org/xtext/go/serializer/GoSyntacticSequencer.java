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
	protected AbstractElementAlias match_Entity_Greeting_EOLTerminalRuleCall_3_or___PrintKeyword_0_LeftParenthesisKeyword_1_INTTerminalRuleCall_2_1_p_RightParenthesisKeyword_3__;
	protected AbstractElementAlias match_Entity_INTTerminalRuleCall_2_1_p;
	protected AbstractElementAlias match_Literal_FalseKeyword_1_or_INTTerminalRuleCall_2;
	protected AbstractElementAlias match_PrimaryExpression_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_PrimaryExpression_LeftParenthesisKeyword_0_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GoGrammarAccess) access;
		match_Entity_Greeting_EOLTerminalRuleCall_3_or___PrintKeyword_0_LeftParenthesisKeyword_1_INTTerminalRuleCall_2_1_p_RightParenthesisKeyword_3__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getEntityAccess().getPrintKeyword_0()), new TokenAlias(false, false, grammarAccess.getEntityAccess().getLeftParenthesisKeyword_1()), new TokenAlias(true, false, grammarAccess.getEntityAccess().getINTTerminalRuleCall_2_1()), new TokenAlias(false, false, grammarAccess.getEntityAccess().getRightParenthesisKeyword_3())), new TokenAlias(false, false, grammarAccess.getGreetingAccess().getEOLTerminalRuleCall_3()));
		match_Entity_INTTerminalRuleCall_2_1_p = new TokenAlias(true, false, grammarAccess.getEntityAccess().getINTTerminalRuleCall_2_1());
		match_Literal_FalseKeyword_1_or_INTTerminalRuleCall_2 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLiteralAccess().getFalseKeyword_1()), new TokenAlias(false, false, grammarAccess.getLiteralAccess().getINTTerminalRuleCall_2()));
		match_PrimaryExpression_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
		match_PrimaryExpression_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getELSERule())
			return getELSEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getEOLRule())
			return getEOLToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getFUNCRule())
			return getFUNCToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getIFRule())
			return getIFToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		return "";
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
	 * 	NEWLINE | SL_COMMENT;
	 */
	protected String getEOLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\n";
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
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Entity_Greeting_EOLTerminalRuleCall_3_or___PrintKeyword_0_LeftParenthesisKeyword_1_INTTerminalRuleCall_2_1_p_RightParenthesisKeyword_3__.equals(syntax))
				emit_Entity_Greeting_EOLTerminalRuleCall_3_or___PrintKeyword_0_LeftParenthesisKeyword_1_INTTerminalRuleCall_2_1_p_RightParenthesisKeyword_3__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entity_INTTerminalRuleCall_2_1_p.equals(syntax))
				emit_Entity_INTTerminalRuleCall_2_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Literal_FalseKeyword_1_or_INTTerminalRuleCall_2.equals(syntax))
				emit_Literal_FalseKeyword_1_or_INTTerminalRuleCall_2(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrimaryExpression_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_PrimaryExpression_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrimaryExpression_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_PrimaryExpression_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     EOL | ('print' '(' INT+ ')')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Entity_Greeting_EOLTerminalRuleCall_3_or___PrintKeyword_0_LeftParenthesisKeyword_1_INTTerminalRuleCall_2_1_p_RightParenthesisKeyword_3__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     INT+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'print' '(' (ambiguity) ')' (rule start)
	 */
	protected void emit_Entity_INTTerminalRuleCall_2_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     INT | 'false'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '('* (ambiguity) (rule start)
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Literal_FalseKeyword_1_or_INTTerminalRuleCall_2(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (INT | 'false') (rule start)
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
