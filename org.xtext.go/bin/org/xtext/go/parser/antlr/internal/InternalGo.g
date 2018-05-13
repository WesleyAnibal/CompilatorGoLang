/*
 * generated by Xtext 2.13.0
 */
grammar InternalGo;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.go.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.go.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.go.services.GoGrammarAccess;

}

@parser::members {

 	private GoGrammarAccess grammarAccess;

    public InternalGoParser(TokenStream input, GoGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Go";
   	}

   	@Override
   	protected GoGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleGo
entryRuleGo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGoRule()); }
	iv_ruleGo=ruleGo
	{ $current=$iv_ruleGo.current; }
	EOF;

// Rule Go
ruleGo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getGoAccess().getElementsGreetingParserRuleCall_0());
			}
			lv_elements_0_0=ruleGreeting
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getGoRule());
				}
				add(
					$current,
					"elements",
					lv_elements_0_0,
					"org.xtext.go.Go.Greeting");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleGreeting
entryRuleGreeting returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGreetingRule()); }
	iv_ruleGreeting=ruleGreeting
	{ $current=$iv_ruleGreeting.current; }
	EOF;

// Rule Greeting
ruleGreeting returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getGreetingAccess().getDecVarParserRuleCall_0());
		}
		this_DecVar_0=ruleDecVar
		{
			$current = $this_DecVar_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getGreetingAccess().getDataTypeParserRuleCall_1());
		}
		this_DataType_1=ruleDataType
		{
			$current = $this_DataType_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getGreetingAccess().getEntityParserRuleCall_2());
		}
		ruleEntity
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getGreetingAccess().getDecFuncParserRuleCall_3());
		}
		this_DecFunc_3=ruleDecFunc
		{
			$current = $this_DecFunc_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		this_EOL_4=RULE_EOL
		{
			newLeafNode(this_EOL_4, grammarAccess.getGreetingAccess().getEOLTerminalRuleCall_4());
		}
		    |
		{
			newCompositeNode(grammarAccess.getGreetingAccess().getConditionParserRuleCall_5());
		}
		this_Condition_5=ruleCondition
		{
			$current = $this_Condition_5.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDecVar
entryRuleDecVar returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDecVarRule()); }
	iv_ruleDecVar=ruleDecVar
	{ $current=$iv_ruleDecVar.current; }
	EOF;

// Rule DecVar
ruleDecVar returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDecVarAccess().getVARParserRuleCall_0());
		}
		ruleVAR
		{
			afterParserOrEnumRuleCall();
		}
		(
			(
				lv_vars_1_0=RULE_ID
				{
					newLeafNode(lv_vars_1_0, grammarAccess.getDecVarAccess().getVarsIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDecVarRule());
					}
					addWithLastConsumed(
						$current,
						"vars",
						lv_vars_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		{
			newCompositeNode(grammarAccess.getDecVarAccess().getTYPEParserRuleCall_2());
		}
		ruleTYPE
		{
			afterParserOrEnumRuleCall();
		}
		(
			otherlv_3='='
			{
				newLeafNode(otherlv_3, grammarAccess.getDecVarAccess().getEqualsSignKeyword_3_0());
			}
			(
				(
					lv_atrb_4_0=RULE_ID
					{
						newLeafNode(lv_atrb_4_0, grammarAccess.getDecVarAccess().getAtrbIDTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDecVarRule());
						}
						addWithLastConsumed(
							$current,
							"atrb",
							lv_atrb_4_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getDecVarAccess().getCommaKeyword_3_2_0());
				}
				(
					(
						lv_atrb_6_0=RULE_ID
						{
							newLeafNode(lv_atrb_6_0, grammarAccess.getDecVarAccess().getAtrbIDTerminalRuleCall_3_2_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getDecVarRule());
							}
							addWithLastConsumed(
								$current,
								"atrb",
								lv_atrb_6_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)*
		)?
	)
;

// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	iv_ruleCondition=ruleCondition
	{ $current=$iv_ruleCondition.current; }
	EOF;

// Rule Condition
ruleCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getConditionAccess().getIfIfConditionParserRuleCall_0_0());
				}
				lv_if_0_0=ruleIfCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConditionRule());
					}
					set(
						$current,
						"if",
						lv_if_0_0,
						"org.xtext.go.Go.IfCondition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(ruleELSE)=>
			(
				{
					newCompositeNode(grammarAccess.getConditionAccess().getElseifElseIfConditionParserRuleCall_1_0());
				}
				lv_elseif_1_0=ruleElseIfCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConditionRule());
					}
					set(
						$current,
						"elseif",
						lv_elseif_1_0,
						"org.xtext.go.Go.ElseIfCondition");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(ruleELSE)=>
			(
				{
					newCompositeNode(grammarAccess.getConditionAccess().getElseElseConditionParserRuleCall_2_0());
				}
				lv_else_2_0=ruleElseCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConditionRule());
					}
					set(
						$current,
						"else",
						lv_else_2_0,
						"org.xtext.go.Go.ElseCondition");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleIfCondition
entryRuleIfCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIfConditionRule()); }
	iv_ruleIfCondition=ruleIfCondition
	{ $current=$iv_ruleIfCondition.current; }
	EOF;

// Rule IfCondition
ruleIfCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getIfConditionAccess().getIFParserRuleCall_0());
		}
		ruleIF
		{
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIfConditionAccess().getCondExpressionParserRuleCall_1_0());
				}
				lv_cond_1_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfConditionRule());
					}
					set(
						$current,
						"cond",
						lv_cond_1_0,
						"org.xtext.go.Go.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getIfConditionAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIfConditionAccess().getThenGreetingParserRuleCall_3_0());
				}
				lv_then_3_0=ruleGreeting
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfConditionRule());
					}
					set(
						$current,
						"then",
						lv_then_3_0,
						"org.xtext.go.Go.Greeting");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getIfConditionAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleElseIfCondition
entryRuleElseIfCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElseIfConditionRule()); }
	iv_ruleElseIfCondition=ruleElseIfCondition
	{ $current=$iv_ruleElseIfCondition.current; }
	EOF;

// Rule ElseIfCondition
ruleElseIfCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(ruleELSE)=>
			{
				newCompositeNode(grammarAccess.getElseIfConditionAccess().getELSEParserRuleCall_0());
			}
			ruleELSE
			{
				afterParserOrEnumRuleCall();
			}
		)
		{
			newCompositeNode(grammarAccess.getElseIfConditionAccess().getIfConditionParserRuleCall_1());
		}
		this_IfCondition_1=ruleIfCondition
		{
			$current = $this_IfCondition_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleElseCondition
entryRuleElseCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElseConditionRule()); }
	iv_ruleElseCondition=ruleElseCondition
	{ $current=$iv_ruleElseCondition.current; }
	EOF;

// Rule ElseCondition
ruleElseCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(ruleELSE)=>
			{
				newCompositeNode(grammarAccess.getElseConditionAccess().getELSEParserRuleCall_0());
			}
			ruleELSE
			{
				afterParserOrEnumRuleCall();
			}
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getElseConditionAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getElseConditionAccess().getThenGreetingParserRuleCall_2_0());
				}
				lv_then_2_0=ruleGreeting
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getElseConditionRule());
					}
					set(
						$current,
						"then",
						lv_then_2_0,
						"org.xtext.go.Go.Greeting");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getElseConditionAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall());
	}
	this_OrExpression_0=ruleOrExpression
	{
		$current = $this_OrExpression_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleOrExpression
entryRuleOrExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOrExpressionRule()); }
	iv_ruleOrExpression=ruleOrExpression
	{ $current=$iv_ruleOrExpression.current; }
	EOF;

// Rule OrExpression
ruleOrExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
		}
		this_AndExpression_0=ruleAndExpression
		{
			$current = $this_AndExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='||'
			{
				newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleAndExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOrExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.go.Go.AndExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAndExpression
entryRuleAndExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAndExpressionRule()); }
	iv_ruleAndExpression=ruleAndExpression
	{ $current=$iv_ruleAndExpression.current; }
	EOF;

// Rule AndExpression
ruleAndExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAndExpressionAccess().getComparisonExpressionParserRuleCall_0());
		}
		this_ComparisonExpression_0=ruleComparisonExpression
		{
			$current = $this_ComparisonExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='&&'
			{
				newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleComparisonExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAndExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.go.Go.ComparisonExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleComparisonExpression
entryRuleComparisonExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComparisonExpressionRule()); }
	iv_ruleComparisonExpression=ruleComparisonExpression
	{ $current=$iv_ruleComparisonExpression.current; }
	EOF;

// Rule ComparisonExpression
ruleComparisonExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getComparisonExpressionAccess().getPrimaryExpressionParserRuleCall_0());
		}
		this_PrimaryExpression_0=rulePrimaryExpression
		{
			$current = $this_PrimaryExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						lv_operator_2_1='<'
						{
							newLeafNode(lv_operator_2_1, grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSignKeyword_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getComparisonExpressionRule());
							}
							setWithLastConsumed($current, "operator", lv_operator_2_1, null);
						}
						    |
						lv_operator_2_2='<='
						{
							newLeafNode(lv_operator_2_2, grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getComparisonExpressionRule());
							}
							setWithLastConsumed($current, "operator", lv_operator_2_2, null);
						}
						    |
						lv_operator_2_3='=='
						{
							newLeafNode(lv_operator_2_3, grammarAccess.getComparisonExpressionAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_2());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getComparisonExpressionRule());
							}
							setWithLastConsumed($current, "operator", lv_operator_2_3, null);
						}
						    |
						lv_operator_2_4='>='
						{
							newLeafNode(lv_operator_2_4, grammarAccess.getComparisonExpressionAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_3());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getComparisonExpressionRule());
							}
							setWithLastConsumed($current, "operator", lv_operator_2_4, null);
						}
						    |
						lv_operator_2_5='>'
						{
							newLeafNode(lv_operator_2_5, grammarAccess.getComparisonExpressionAccess().getOperatorGreaterThanSignKeyword_1_1_0_4());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getComparisonExpressionRule());
							}
							setWithLastConsumed($current, "operator", lv_operator_2_5, null);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_2_0());
					}
					lv_right_3_0=rulePrimaryExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.go.Go.PrimaryExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePrimaryExpression
entryRulePrimaryExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryExpressionRule()); }
	iv_rulePrimaryExpression=rulePrimaryExpression
	{ $current=$iv_rulePrimaryExpression.current; }
	EOF;

// Rule PrimaryExpression
rulePrimaryExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='('
			{
				newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
			}
			{
				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1());
			}
			this_Expression_1=ruleExpression
			{
				$current = $this_Expression_1.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_2=')'
			{
				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
			}
		)
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_1());
		}
		this_Literal_3=ruleLiteral
		{
			$current = $this_Literal_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleLiteral
entryRuleLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLiteralRule()); }
	iv_ruleLiteral=ruleLiteral
	{ $current=$iv_ruleLiteral.current; }
	EOF;

// Rule Literal
ruleLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getLiteralAccess().getLiteralAction_0_0(),
						$current);
				}
			)
			(
				(
					lv_value_1_0='true'
					{
						newLeafNode(lv_value_1_0, grammarAccess.getLiteralAccess().getValueTrueKeyword_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getLiteralRule());
						}
						setWithLastConsumed($current, "value", lv_value_1_0, "true");
					}
				)
			)
		)
		    |
		otherlv_2='false'
		{
			newLeafNode(otherlv_2, grammarAccess.getLiteralAccess().getFalseKeyword_1());
		}
		    |
		this_INT_3=RULE_INT
		{
			newLeafNode(this_INT_3, grammarAccess.getLiteralAccess().getINTTerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleDecFunc
entryRuleDecFunc returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDecFuncRule()); }
	iv_ruleDecFunc=ruleDecFunc
	{ $current=$iv_ruleDecFunc.current; }
	EOF;

// Rule DecFunc
ruleDecFunc returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDecFuncAccess().getFUNCParserRuleCall_0());
		}
		ruleFUNC
		{
			afterParserOrEnumRuleCall();
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDecFuncAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDecFuncRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getDecFuncAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				lv_parameter_3_0=RULE_ID
				{
					newLeafNode(lv_parameter_3_0, grammarAccess.getDecFuncAccess().getParameterIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDecFuncRule());
					}
					setWithLastConsumed(
						$current,
						"parameter",
						lv_parameter_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getDecFuncAccess().getCommaKeyword_4_0());
			}
			(
				(
					lv_parameter_5_0=RULE_ID
					{
						newLeafNode(lv_parameter_5_0, grammarAccess.getDecFuncAccess().getParameterIDTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDecFuncRule());
						}
						setWithLastConsumed(
							$current,
							"parameter",
							lv_parameter_5_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)*
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getDecFuncAccess().getRightParenthesisKeyword_5());
		}
		otherlv_7='{'
		{
			newLeafNode(otherlv_7, grammarAccess.getDecFuncAccess().getLeftCurlyBracketKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDecFuncAccess().getArgsGreetingParserRuleCall_7_0());
				}
				lv_args_8_0=ruleGreeting
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDecFuncRule());
					}
					add(
						$current,
						"args",
						lv_args_8_0,
						"org.xtext.go.Go.Greeting");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getDecFuncAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleBREAK
entryRuleBREAK returns [String current=null]:
	{ newCompositeNode(grammarAccess.getBREAKRule()); }
	iv_ruleBREAK=ruleBREAK
	{ $current=$iv_ruleBREAK.current.getText(); }
	EOF;

// Rule BREAK
ruleBREAK returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='break'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getBREAKAccess().getBreakKeyword());
	}
;

// Entry rule entryRuleCASE
entryRuleCASE returns [String current=null]:
	{ newCompositeNode(grammarAccess.getCASERule()); }
	iv_ruleCASE=ruleCASE
	{ $current=$iv_ruleCASE.current.getText(); }
	EOF;

// Rule CASE
ruleCASE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='case'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getCASEAccess().getCaseKeyword());
	}
;

// Entry rule entryRuleCHAN
entryRuleCHAN returns [String current=null]:
	{ newCompositeNode(grammarAccess.getCHANRule()); }
	iv_ruleCHAN=ruleCHAN
	{ $current=$iv_ruleCHAN.current.getText(); }
	EOF;

// Rule CHAN
ruleCHAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='chan'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getCHANAccess().getChanKeyword());
	}
;

// Entry rule entryRuleCONST
entryRuleCONST returns [String current=null]:
	{ newCompositeNode(grammarAccess.getCONSTRule()); }
	iv_ruleCONST=ruleCONST
	{ $current=$iv_ruleCONST.current.getText(); }
	EOF;

// Rule CONST
ruleCONST returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='const'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getCONSTAccess().getConstKeyword());
	}
;

// Entry rule entryRuleCONTINUE
entryRuleCONTINUE returns [String current=null]:
	{ newCompositeNode(grammarAccess.getCONTINUERule()); }
	iv_ruleCONTINUE=ruleCONTINUE
	{ $current=$iv_ruleCONTINUE.current.getText(); }
	EOF;

// Rule CONTINUE
ruleCONTINUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='continue'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getCONTINUEAccess().getContinueKeyword());
	}
;

// Entry rule entryRuleELSE
entryRuleELSE returns [String current=null]:
	{ newCompositeNode(grammarAccess.getELSERule()); }
	iv_ruleELSE=ruleELSE
	{ $current=$iv_ruleELSE.current.getText(); }
	EOF;

// Rule ELSE
ruleELSE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='else'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getELSEAccess().getElseKeyword());
	}
;

// Entry rule entryRuleFOR
entryRuleFOR returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFORRule()); }
	iv_ruleFOR=ruleFOR
	{ $current=$iv_ruleFOR.current.getText(); }
	EOF;

// Rule FOR
ruleFOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='for'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getFORAccess().getForKeyword());
	}
;

// Entry rule entryRuleFUNC
entryRuleFUNC returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFUNCRule()); }
	iv_ruleFUNC=ruleFUNC
	{ $current=$iv_ruleFUNC.current.getText(); }
	EOF;

// Rule FUNC
ruleFUNC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='func'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getFUNCAccess().getFuncKeyword());
	}
;

// Entry rule entryRuleIF
entryRuleIF returns [String current=null]:
	{ newCompositeNode(grammarAccess.getIFRule()); }
	iv_ruleIF=ruleIF
	{ $current=$iv_ruleIF.current.getText(); }
	EOF;

// Rule IF
ruleIF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='if'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getIFAccess().getIfKeyword());
	}
;

// Entry rule entryRuleIMPORT
entryRuleIMPORT returns [String current=null]:
	{ newCompositeNode(grammarAccess.getIMPORTRule()); }
	iv_ruleIMPORT=ruleIMPORT
	{ $current=$iv_ruleIMPORT.current.getText(); }
	EOF;

// Rule IMPORT
ruleIMPORT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='import'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getIMPORTAccess().getImportKeyword());
	}
;

// Entry rule entryRuleRETURN
entryRuleRETURN returns [String current=null]:
	{ newCompositeNode(grammarAccess.getRETURNRule()); }
	iv_ruleRETURN=ruleRETURN
	{ $current=$iv_ruleRETURN.current.getText(); }
	EOF;

// Rule RETURN
ruleRETURN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='return'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getRETURNAccess().getReturnKeyword());
	}
;

// Entry rule entryRulePACKAGE
entryRulePACKAGE returns [String current=null]:
	{ newCompositeNode(grammarAccess.getPACKAGERule()); }
	iv_rulePACKAGE=rulePACKAGE
	{ $current=$iv_rulePACKAGE.current.getText(); }
	EOF;

// Rule PACKAGE
rulePACKAGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='package'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getPACKAGEAccess().getPackageKeyword());
	}
;

// Entry rule entryRuleTYPE
entryRuleTYPE returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTYPERule()); }
	iv_ruleTYPE=ruleTYPE
	{ $current=$iv_ruleTYPE.current.getText(); }
	EOF;

// Rule TYPE
ruleTYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='type'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getTYPEAccess().getTypeKeyword());
	}
;

// Entry rule entryRuleVAR
entryRuleVAR returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVARRule()); }
	iv_ruleVAR=ruleVAR
	{ $current=$iv_ruleVAR.current.getText(); }
	EOF;

// Rule VAR
ruleVAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='var'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getVARAccess().getVarKeyword());
	}
;

// Entry rule entryRuleRANGE
entryRuleRANGE returns [String current=null]:
	{ newCompositeNode(grammarAccess.getRANGERule()); }
	iv_ruleRANGE=ruleRANGE
	{ $current=$iv_ruleRANGE.current.getText(); }
	EOF;

// Rule RANGE
ruleRANGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='range'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getRANGEAccess().getRangeKeyword());
	}
;

// Entry rule entryRuleEntity
entryRuleEntity returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	iv_ruleEntity=ruleEntity
	{ $current=$iv_ruleEntity.current.getText(); }
	EOF;

// Rule Entity
ruleEntity returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='print'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEntityAccess().getPrintKeyword_0());
		}
		kw='('
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEntityAccess().getLeftParenthesisKeyword_1());
		}
		(
			this_STRING_2=RULE_STRING
			{
				$current.merge(this_STRING_2);
			}
			{
				newLeafNode(this_STRING_2, grammarAccess.getEntityAccess().getSTRINGTerminalRuleCall_2_0());
			}
			    |
			(
				this_INT_3=RULE_INT
				{
					$current.merge(this_INT_3);
				}
				{
					newLeafNode(this_INT_3, grammarAccess.getEntityAccess().getINTTerminalRuleCall_2_1());
				}
			)+
		)
		kw=')'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEntityAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleDataType
entryRuleDataType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataTypeRule()); }
	iv_ruleDataType=ruleDataType
	{ $current=$iv_ruleDataType.current; }
	EOF;

// Rule DataType
ruleDataType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='datatype'
		{
			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataTypeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

RULE_EOL : (RULE_NEWLINE|RULE_COMMENTS);

fragment RULE_COMMENTS : (RULE_ML_COMMENT|RULE_SL_COMMENT);

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

fragment RULE_NEWLINE : '\r'? '\n';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
