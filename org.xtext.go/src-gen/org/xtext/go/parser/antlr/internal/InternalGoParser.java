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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_INT", "RULE_ID", "RULE_NEWLINE", "RULE_SL_COMMENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'||'", "'&&'", "'<'", "'<='", "'=='", "'>='", "'>'", "'('", "')'", "'true'", "'false'", "','", "'break'", "'case'", "'chan'", "'const'", "'continue'", "'else'", "'for'", "'func'", "'if'", "'import'", "'return'", "'package'", "'range'", "'print'", "'datatype'"
    };
    public static final int RULE_NEWLINE=7;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_EOL=4;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGo.g"; }



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




    // $ANTLR start "entryRuleGo"
    // InternalGo.g:64:1: entryRuleGo returns [EObject current=null] : iv_ruleGo= ruleGo EOF ;
    public final EObject entryRuleGo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGo = null;


        try {
            // InternalGo.g:64:43: (iv_ruleGo= ruleGo EOF )
            // InternalGo.g:65:2: iv_ruleGo= ruleGo EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGo=ruleGo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGo; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGo"


    // $ANTLR start "ruleGo"
    // InternalGo.g:71:1: ruleGo returns [EObject current=null] : ( (lv_elements_0_0= ruleGreeting ) )* ;
    public final EObject ruleGo() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalGo.g:77:2: ( ( (lv_elements_0_0= ruleGreeting ) )* )
            // InternalGo.g:78:2: ( (lv_elements_0_0= ruleGreeting ) )*
            {
            // InternalGo.g:78:2: ( (lv_elements_0_0= ruleGreeting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_EOL||(LA1_0>=34 && LA1_0<=35)||(LA1_0>=40 && LA1_0<=41)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGo.g:79:3: (lv_elements_0_0= ruleGreeting )
            	    {
            	    // InternalGo.g:79:3: (lv_elements_0_0= ruleGreeting )
            	    // InternalGo.g:80:4: lv_elements_0_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getGoAccess().getElementsGreetingParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleGreeting();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getGoRule());
            	      				}
            	      				add(
            	      					current,
            	      					"elements",
            	      					lv_elements_0_0,
            	      					"org.xtext.go.Go.Greeting");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGo"


    // $ANTLR start "entryRuleGreeting"
    // InternalGo.g:100:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // InternalGo.g:100:49: (iv_ruleGreeting= ruleGreeting EOF )
            // InternalGo.g:101:2: iv_ruleGreeting= ruleGreeting EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreetingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreeting; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // InternalGo.g:107:1: ruleGreeting returns [EObject current=null] : (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity | this_DecFunc_2= ruleDecFunc | this_EOL_3= RULE_EOL | this_Condition_4= ruleCondition ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token this_EOL_3=null;
        EObject this_DataType_0 = null;

        EObject this_Entity_1 = null;

        EObject this_DecFunc_2 = null;

        EObject this_Condition_4 = null;



        	enterRule();

        try {
            // InternalGo.g:113:2: ( (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity | this_DecFunc_2= ruleDecFunc | this_EOL_3= RULE_EOL | this_Condition_4= ruleCondition ) )
            // InternalGo.g:114:2: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity | this_DecFunc_2= ruleDecFunc | this_EOL_3= RULE_EOL | this_Condition_4= ruleCondition )
            {
            // InternalGo.g:114:2: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity | this_DecFunc_2= ruleDecFunc | this_EOL_3= RULE_EOL | this_Condition_4= ruleCondition )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt2=1;
                }
                break;
            case 40:
                {
                alt2=2;
                }
                break;
            case 34:
                {
                alt2=3;
                }
                break;
            case RULE_EOL:
                {
                alt2=4;
                }
                break;
            case 35:
                {
                alt2=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGo.g:115:3: this_DataType_0= ruleDataType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGreetingAccess().getDataTypeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DataType_0=ruleDataType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DataType_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:124:3: this_Entity_1= ruleEntity
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGreetingAccess().getEntityParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Entity_1=ruleEntity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Entity_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:133:3: this_DecFunc_2= ruleDecFunc
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGreetingAccess().getDecFuncParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DecFunc_2=ruleDecFunc();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DecFunc_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:142:3: this_EOL_3= RULE_EOL
                    {
                    this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_EOL_3, grammarAccess.getGreetingAccess().getEOLTerminalRuleCall_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:147:3: this_Condition_4= ruleCondition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGreetingAccess().getConditionParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Condition_4=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Condition_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleCondition"
    // InternalGo.g:159:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalGo.g:159:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalGo.g:160:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalGo.g:166:1: ruleCondition returns [EObject current=null] : ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) ) ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_if_0_0 = null;

        EObject lv_elseif_1_0 = null;

        EObject lv_else_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:172:2: ( ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) ) ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )? ) )
            // InternalGo.g:173:2: ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) ) ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )? )
            {
            // InternalGo.g:173:2: ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) ) ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )? )
            // InternalGo.g:174:3: ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) ) ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )?
            {
            // InternalGo.g:174:3: ( (lv_if_0_0= ruleIfCondition ) )
            // InternalGo.g:175:4: (lv_if_0_0= ruleIfCondition )
            {
            // InternalGo.g:175:4: (lv_if_0_0= ruleIfCondition )
            // InternalGo.g:176:5: lv_if_0_0= ruleIfCondition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionAccess().getIfIfConditionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_if_0_0=ruleIfCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionRule());
              					}
              					set(
              						current,
              						"if",
              						lv_if_0_0,
              						"org.xtext.go.Go.IfCondition");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGo.g:193:3: ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )
            // InternalGo.g:194:4: ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition )
            {
            // InternalGo.g:195:4: (lv_elseif_1_0= ruleElseIfCondition )
            // InternalGo.g:196:5: lv_elseif_1_0= ruleElseIfCondition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionAccess().getElseifElseIfConditionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_elseif_1_0=ruleElseIfCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionRule());
              					}
              					set(
              						current,
              						"elseif",
              						lv_elseif_1_0,
              						"org.xtext.go.Go.ElseIfCondition");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGo.g:213:3: ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==32) && (synpred2_InternalGo())) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGo.g:214:4: ( ruleELSE )=> (lv_else_2_0= ruleElseCondition )
                    {
                    // InternalGo.g:215:4: (lv_else_2_0= ruleElseCondition )
                    // InternalGo.g:216:5: lv_else_2_0= ruleElseCondition
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConditionAccess().getElseElseConditionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_else_2_0=ruleElseCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getConditionRule());
                      					}
                      					set(
                      						current,
                      						"else",
                      						lv_else_2_0,
                      						"org.xtext.go.Go.ElseCondition");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleIfCondition"
    // InternalGo.g:237:1: entryRuleIfCondition returns [EObject current=null] : iv_ruleIfCondition= ruleIfCondition EOF ;
    public final EObject entryRuleIfCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfCondition = null;


        try {
            // InternalGo.g:237:52: (iv_ruleIfCondition= ruleIfCondition EOF )
            // InternalGo.g:238:2: iv_ruleIfCondition= ruleIfCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfCondition=ruleIfCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfCondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfCondition"


    // $ANTLR start "ruleIfCondition"
    // InternalGo.g:244:1: ruleIfCondition returns [EObject current=null] : ( ruleIF ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= '{' ( (lv_then_3_0= ruleGreeting ) ) otherlv_4= '}' ) ;
    public final EObject ruleIfCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_cond_1_0 = null;

        EObject lv_then_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:250:2: ( ( ruleIF ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= '{' ( (lv_then_3_0= ruleGreeting ) ) otherlv_4= '}' ) )
            // InternalGo.g:251:2: ( ruleIF ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= '{' ( (lv_then_3_0= ruleGreeting ) ) otherlv_4= '}' )
            {
            // InternalGo.g:251:2: ( ruleIF ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= '{' ( (lv_then_3_0= ruleGreeting ) ) otherlv_4= '}' )
            // InternalGo.g:252:3: ruleIF ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= '{' ( (lv_then_3_0= ruleGreeting ) ) otherlv_4= '}'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIfConditionAccess().getIFParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_6);
            ruleIF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:259:3: ( (lv_cond_1_0= ruleExpression ) )
            // InternalGo.g:260:4: (lv_cond_1_0= ruleExpression )
            {
            // InternalGo.g:260:4: (lv_cond_1_0= ruleExpression )
            // InternalGo.g:261:5: lv_cond_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfConditionAccess().getCondExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_cond_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfConditionRule());
              					}
              					set(
              						current,
              						"cond",
              						lv_cond_1_0,
              						"org.xtext.go.Go.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfConditionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalGo.g:282:3: ( (lv_then_3_0= ruleGreeting ) )
            // InternalGo.g:283:4: (lv_then_3_0= ruleGreeting )
            {
            // InternalGo.g:283:4: (lv_then_3_0= ruleGreeting )
            // InternalGo.g:284:5: lv_then_3_0= ruleGreeting
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfConditionAccess().getThenGreetingParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_then_3_0=ruleGreeting();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfConditionRule());
              					}
              					set(
              						current,
              						"then",
              						lv_then_3_0,
              						"org.xtext.go.Go.Greeting");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getIfConditionAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfCondition"


    // $ANTLR start "entryRuleElseIfCondition"
    // InternalGo.g:309:1: entryRuleElseIfCondition returns [EObject current=null] : iv_ruleElseIfCondition= ruleElseIfCondition EOF ;
    public final EObject entryRuleElseIfCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfCondition = null;


        try {
            // InternalGo.g:309:56: (iv_ruleElseIfCondition= ruleElseIfCondition EOF )
            // InternalGo.g:310:2: iv_ruleElseIfCondition= ruleElseIfCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElseIfConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElseIfCondition=ruleElseIfCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElseIfCondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElseIfCondition"


    // $ANTLR start "ruleElseIfCondition"
    // InternalGo.g:316:1: ruleElseIfCondition returns [EObject current=null] : ( ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition ) ;
    public final EObject ruleElseIfCondition() throws RecognitionException {
        EObject current = null;

        EObject this_IfCondition_1 = null;



        	enterRule();

        try {
            // InternalGo.g:322:2: ( ( ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition ) )
            // InternalGo.g:323:2: ( ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition )
            {
            // InternalGo.g:323:2: ( ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition )
            // InternalGo.g:324:3: ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition
            {
            // InternalGo.g:324:3: ( ( ruleELSE )=> ruleELSE )
            // InternalGo.g:325:4: ( ruleELSE )=> ruleELSE
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getElseIfConditionAccess().getELSEParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_10);
            ruleELSE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getElseIfConditionAccess().getIfConditionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_IfCondition_1=ruleIfCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_IfCondition_1;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElseIfCondition"


    // $ANTLR start "entryRuleElseCondition"
    // InternalGo.g:346:1: entryRuleElseCondition returns [EObject current=null] : iv_ruleElseCondition= ruleElseCondition EOF ;
    public final EObject entryRuleElseCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseCondition = null;


        try {
            // InternalGo.g:346:54: (iv_ruleElseCondition= ruleElseCondition EOF )
            // InternalGo.g:347:2: iv_ruleElseCondition= ruleElseCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElseConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElseCondition=ruleElseCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElseCondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElseCondition"


    // $ANTLR start "ruleElseCondition"
    // InternalGo.g:353:1: ruleElseCondition returns [EObject current=null] : ( ( ( ruleELSE )=> ruleELSE ) otherlv_1= '{' ( (lv_then_2_0= ruleGreeting ) ) otherlv_3= '}' ) ;
    public final EObject ruleElseCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_then_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:359:2: ( ( ( ( ruleELSE )=> ruleELSE ) otherlv_1= '{' ( (lv_then_2_0= ruleGreeting ) ) otherlv_3= '}' ) )
            // InternalGo.g:360:2: ( ( ( ruleELSE )=> ruleELSE ) otherlv_1= '{' ( (lv_then_2_0= ruleGreeting ) ) otherlv_3= '}' )
            {
            // InternalGo.g:360:2: ( ( ( ruleELSE )=> ruleELSE ) otherlv_1= '{' ( (lv_then_2_0= ruleGreeting ) ) otherlv_3= '}' )
            // InternalGo.g:361:3: ( ( ruleELSE )=> ruleELSE ) otherlv_1= '{' ( (lv_then_2_0= ruleGreeting ) ) otherlv_3= '}'
            {
            // InternalGo.g:361:3: ( ( ruleELSE )=> ruleELSE )
            // InternalGo.g:362:4: ( ruleELSE )=> ruleELSE
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getElseConditionAccess().getELSEParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_7);
            ruleELSE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }

            otherlv_1=(Token)match(input,13,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getElseConditionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGo.g:375:3: ( (lv_then_2_0= ruleGreeting ) )
            // InternalGo.g:376:4: (lv_then_2_0= ruleGreeting )
            {
            // InternalGo.g:376:4: (lv_then_2_0= ruleGreeting )
            // InternalGo.g:377:5: lv_then_2_0= ruleGreeting
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getElseConditionAccess().getThenGreetingParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_then_2_0=ruleGreeting();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getElseConditionRule());
              					}
              					set(
              						current,
              						"then",
              						lv_then_2_0,
              						"org.xtext.go.Go.Greeting");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getElseConditionAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElseCondition"


    // $ANTLR start "entryRuleExpression"
    // InternalGo.g:402:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalGo.g:402:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalGo.g:403:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalGo.g:409:1: ruleExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;



        	enterRule();

        try {
            // InternalGo.g:415:2: (this_OrExpression_0= ruleOrExpression )
            // InternalGo.g:416:2: this_OrExpression_0= ruleOrExpression
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_OrExpression_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalGo.g:427:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalGo.g:427:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalGo.g:428:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalGo.g:434:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:440:2: ( (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalGo.g:441:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalGo.g:441:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalGo.g:442:3: this_AndExpression_0= ruleAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_11);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:450:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGo.g:451:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalGo.g:451:4: ()
            	    // InternalGo.g:452:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalGo.g:462:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalGo.g:463:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalGo.g:463:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalGo.g:464:6: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.go.Go.AndExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalGo.g:486:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalGo.g:486:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalGo.g:487:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalGo.g:493:1: ruleAndExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ComparisonExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:499:2: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) )
            // InternalGo.g:500:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            {
            // InternalGo.g:500:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            // InternalGo.g:501:3: this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndExpressionAccess().getComparisonExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_12);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ComparisonExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:509:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGo.g:510:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) )
            	    {
            	    // InternalGo.g:510:4: ()
            	    // InternalGo.g:511:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalGo.g:521:4: ( (lv_right_3_0= ruleComparisonExpression ) )
            	    // InternalGo.g:522:5: (lv_right_3_0= ruleComparisonExpression )
            	    {
            	    // InternalGo.g:522:5: (lv_right_3_0= ruleComparisonExpression )
            	    // InternalGo.g:523:6: lv_right_3_0= ruleComparisonExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_right_3_0=ruleComparisonExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.go.Go.ComparisonExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalGo.g:545:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalGo.g:545:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalGo.g:546:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalGo.g:552:1: ruleComparisonExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token lv_operator_2_3=null;
        Token lv_operator_2_4=null;
        Token lv_operator_2_5=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:558:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // InternalGo.g:559:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // InternalGo.g:559:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // InternalGo.g:560:3: this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonExpressionAccess().getPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_13);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:568:3: ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=17 && LA7_0<=21)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGo.g:569:4: () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // InternalGo.g:569:4: ()
            	    // InternalGo.g:570:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalGo.g:576:4: ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) )
            	    // InternalGo.g:577:5: ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) )
            	    {
            	    // InternalGo.g:577:5: ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) )
            	    // InternalGo.g:578:6: (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' )
            	    {
            	    // InternalGo.g:578:6: (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' )
            	    int alt6=5;
            	    switch ( input.LA(1) ) {
            	    case 17:
            	        {
            	        alt6=1;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt6=2;
            	        }
            	        break;
            	    case 19:
            	        {
            	        alt6=3;
            	        }
            	        break;
            	    case 20:
            	        {
            	        alt6=4;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt6=5;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt6) {
            	        case 1 :
            	            // InternalGo.g:579:7: lv_operator_2_1= '<'
            	            {
            	            lv_operator_2_1=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_1, grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalGo.g:590:7: lv_operator_2_2= '<='
            	            {
            	            lv_operator_2_2=(Token)match(input,18,FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_2, grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalGo.g:601:7: lv_operator_2_3= '=='
            	            {
            	            lv_operator_2_3=(Token)match(input,19,FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_3, grammarAccess.getComparisonExpressionAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_2());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "operator", lv_operator_2_3, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalGo.g:612:7: lv_operator_2_4= '>='
            	            {
            	            lv_operator_2_4=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_4, grammarAccess.getComparisonExpressionAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_3());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "operator", lv_operator_2_4, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // InternalGo.g:623:7: lv_operator_2_5= '>'
            	            {
            	            lv_operator_2_5=(Token)match(input,21,FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_5, grammarAccess.getComparisonExpressionAccess().getOperatorGreaterThanSignKeyword_1_1_0_4());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "operator", lv_operator_2_5, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalGo.g:636:4: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // InternalGo.g:637:5: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // InternalGo.g:637:5: (lv_right_3_0= rulePrimaryExpression )
            	    // InternalGo.g:638:6: lv_right_3_0= rulePrimaryExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_right_3_0=rulePrimaryExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.go.Go.PrimaryExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalGo.g:660:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalGo.g:660:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalGo.g:661:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalGo.g:667:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Literal_3= ruleLiteral ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_Literal_3 = null;



        	enterRule();

        try {
            // InternalGo.g:673:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Literal_3= ruleLiteral ) )
            // InternalGo.g:674:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Literal_3= ruleLiteral )
            {
            // InternalGo.g:674:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Literal_3= ruleLiteral )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INT||(LA8_0>=24 && LA8_0<=25)) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGo.g:675:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalGo.g:675:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalGo.g:676:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_14);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:694:3: this_Literal_3= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Literal_3=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Literal_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleLiteral"
    // InternalGo.g:706:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalGo.g:706:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalGo.g:707:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalGo.g:713:1: ruleLiteral returns [EObject current=null] : ( ( () ( (lv_value_1_0= 'true' ) ) ) | otherlv_2= 'false' | this_INT_3= RULE_INT ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalGo.g:719:2: ( ( ( () ( (lv_value_1_0= 'true' ) ) ) | otherlv_2= 'false' | this_INT_3= RULE_INT ) )
            // InternalGo.g:720:2: ( ( () ( (lv_value_1_0= 'true' ) ) ) | otherlv_2= 'false' | this_INT_3= RULE_INT )
            {
            // InternalGo.g:720:2: ( ( () ( (lv_value_1_0= 'true' ) ) ) | otherlv_2= 'false' | this_INT_3= RULE_INT )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt9=1;
                }
                break;
            case 25:
                {
                alt9=2;
                }
                break;
            case RULE_INT:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalGo.g:721:3: ( () ( (lv_value_1_0= 'true' ) ) )
                    {
                    // InternalGo.g:721:3: ( () ( (lv_value_1_0= 'true' ) ) )
                    // InternalGo.g:722:4: () ( (lv_value_1_0= 'true' ) )
                    {
                    // InternalGo.g:722:4: ()
                    // InternalGo.g:723:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getLiteralAccess().getLiteralAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGo.g:729:4: ( (lv_value_1_0= 'true' ) )
                    // InternalGo.g:730:5: (lv_value_1_0= 'true' )
                    {
                    // InternalGo.g:730:5: (lv_value_1_0= 'true' )
                    // InternalGo.g:731:6: lv_value_1_0= 'true'
                    {
                    lv_value_1_0=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getLiteralAccess().getValueTrueKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLiteralRule());
                      						}
                      						setWithLastConsumed(current, "value", lv_value_1_0, "true");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:745:3: otherlv_2= 'false'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(otherlv_2, grammarAccess.getLiteralAccess().getFalseKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:750:3: this_INT_3= RULE_INT
                    {
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_3, grammarAccess.getLiteralAccess().getINTTerminalRuleCall_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleDecFunc"
    // InternalGo.g:758:1: entryRuleDecFunc returns [EObject current=null] : iv_ruleDecFunc= ruleDecFunc EOF ;
    public final EObject entryRuleDecFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecFunc = null;


        try {
            // InternalGo.g:758:48: (iv_ruleDecFunc= ruleDecFunc EOF )
            // InternalGo.g:759:2: iv_ruleDecFunc= ruleDecFunc EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecFuncRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDecFunc=ruleDecFunc();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecFunc; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecFunc"


    // $ANTLR start "ruleDecFunc"
    // InternalGo.g:765:1: ruleDecFunc returns [EObject current=null] : ( ruleFUNC ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameter_3_0= RULE_ID ) )? (otherlv_4= ',' ( (lv_parameter_5_0= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_args_8_0= ruleGreeting ) )* otherlv_9= '}' ) ;
    public final EObject ruleDecFunc() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_parameter_3_0=null;
        Token otherlv_4=null;
        Token lv_parameter_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_args_8_0 = null;



        	enterRule();

        try {
            // InternalGo.g:771:2: ( ( ruleFUNC ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameter_3_0= RULE_ID ) )? (otherlv_4= ',' ( (lv_parameter_5_0= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_args_8_0= ruleGreeting ) )* otherlv_9= '}' ) )
            // InternalGo.g:772:2: ( ruleFUNC ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameter_3_0= RULE_ID ) )? (otherlv_4= ',' ( (lv_parameter_5_0= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_args_8_0= ruleGreeting ) )* otherlv_9= '}' )
            {
            // InternalGo.g:772:2: ( ruleFUNC ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameter_3_0= RULE_ID ) )? (otherlv_4= ',' ( (lv_parameter_5_0= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_args_8_0= ruleGreeting ) )* otherlv_9= '}' )
            // InternalGo.g:773:3: ruleFUNC ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameter_3_0= RULE_ID ) )? (otherlv_4= ',' ( (lv_parameter_5_0= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_args_8_0= ruleGreeting ) )* otherlv_9= '}'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDecFuncAccess().getFUNCParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_15);
            ruleFUNC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:780:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGo.g:781:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGo.g:781:4: (lv_name_1_0= RULE_ID )
            // InternalGo.g:782:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDecFuncAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDecFuncRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDecFuncAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalGo.g:802:3: ( (lv_parameter_3_0= RULE_ID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGo.g:803:4: (lv_parameter_3_0= RULE_ID )
                    {
                    // InternalGo.g:803:4: (lv_parameter_3_0= RULE_ID )
                    // InternalGo.g:804:5: lv_parameter_3_0= RULE_ID
                    {
                    lv_parameter_3_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_parameter_3_0, grammarAccess.getDecFuncAccess().getParameterIDTerminalRuleCall_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDecFuncRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"parameter",
                      						lv_parameter_3_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGo.g:820:3: (otherlv_4= ',' ( (lv_parameter_5_0= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGo.g:821:4: otherlv_4= ',' ( (lv_parameter_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getDecFuncAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalGo.g:825:4: ( (lv_parameter_5_0= RULE_ID ) )
            	    // InternalGo.g:826:5: (lv_parameter_5_0= RULE_ID )
            	    {
            	    // InternalGo.g:826:5: (lv_parameter_5_0= RULE_ID )
            	    // InternalGo.g:827:6: lv_parameter_5_0= RULE_ID
            	    {
            	    lv_parameter_5_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_parameter_5_0, grammarAccess.getDecFuncAccess().getParameterIDTerminalRuleCall_4_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDecFuncRule());
            	      						}
            	      						setWithLastConsumed(
            	      							current,
            	      							"parameter",
            	      							lv_parameter_5_0,
            	      							"org.eclipse.xtext.common.Terminals.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,23,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDecFuncAccess().getRightParenthesisKeyword_5());
              		
            }
            otherlv_7=(Token)match(input,13,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDecFuncAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalGo.g:852:3: ( (lv_args_8_0= ruleGreeting ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_EOL||(LA12_0>=34 && LA12_0<=35)||(LA12_0>=40 && LA12_0<=41)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGo.g:853:4: (lv_args_8_0= ruleGreeting )
            	    {
            	    // InternalGo.g:853:4: (lv_args_8_0= ruleGreeting )
            	    // InternalGo.g:854:5: lv_args_8_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDecFuncAccess().getArgsGreetingParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_args_8_0=ruleGreeting();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDecFuncRule());
            	      					}
            	      					add(
            	      						current,
            	      						"args",
            	      						lv_args_8_0,
            	      						"org.xtext.go.Go.Greeting");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getDecFuncAccess().getRightCurlyBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecFunc"


    // $ANTLR start "entryRuleBREAK"
    // InternalGo.g:879:1: entryRuleBREAK returns [String current=null] : iv_ruleBREAK= ruleBREAK EOF ;
    public final String entryRuleBREAK() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBREAK = null;


        try {
            // InternalGo.g:879:45: (iv_ruleBREAK= ruleBREAK EOF )
            // InternalGo.g:880:2: iv_ruleBREAK= ruleBREAK EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBREAKRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBREAK=ruleBREAK();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBREAK.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBREAK"


    // $ANTLR start "ruleBREAK"
    // InternalGo.g:886:1: ruleBREAK returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'break' ;
    public final AntlrDatatypeRuleToken ruleBREAK() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:892:2: (kw= 'break' )
            // InternalGo.g:893:2: kw= 'break'
            {
            kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getBREAKAccess().getBreakKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBREAK"


    // $ANTLR start "entryRuleCASE"
    // InternalGo.g:901:1: entryRuleCASE returns [String current=null] : iv_ruleCASE= ruleCASE EOF ;
    public final String entryRuleCASE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCASE = null;


        try {
            // InternalGo.g:901:44: (iv_ruleCASE= ruleCASE EOF )
            // InternalGo.g:902:2: iv_ruleCASE= ruleCASE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCASERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCASE=ruleCASE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCASE.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCASE"


    // $ANTLR start "ruleCASE"
    // InternalGo.g:908:1: ruleCASE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'case' ;
    public final AntlrDatatypeRuleToken ruleCASE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:914:2: (kw= 'case' )
            // InternalGo.g:915:2: kw= 'case'
            {
            kw=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getCASEAccess().getCaseKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCASE"


    // $ANTLR start "entryRuleCHAN"
    // InternalGo.g:923:1: entryRuleCHAN returns [String current=null] : iv_ruleCHAN= ruleCHAN EOF ;
    public final String entryRuleCHAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCHAN = null;


        try {
            // InternalGo.g:923:44: (iv_ruleCHAN= ruleCHAN EOF )
            // InternalGo.g:924:2: iv_ruleCHAN= ruleCHAN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCHANRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCHAN=ruleCHAN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCHAN.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCHAN"


    // $ANTLR start "ruleCHAN"
    // InternalGo.g:930:1: ruleCHAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'chan' ;
    public final AntlrDatatypeRuleToken ruleCHAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:936:2: (kw= 'chan' )
            // InternalGo.g:937:2: kw= 'chan'
            {
            kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getCHANAccess().getChanKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCHAN"


    // $ANTLR start "entryRuleCONST"
    // InternalGo.g:945:1: entryRuleCONST returns [String current=null] : iv_ruleCONST= ruleCONST EOF ;
    public final String entryRuleCONST() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCONST = null;


        try {
            // InternalGo.g:945:45: (iv_ruleCONST= ruleCONST EOF )
            // InternalGo.g:946:2: iv_ruleCONST= ruleCONST EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCONSTRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCONST=ruleCONST();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCONST.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCONST"


    // $ANTLR start "ruleCONST"
    // InternalGo.g:952:1: ruleCONST returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'const' ;
    public final AntlrDatatypeRuleToken ruleCONST() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:958:2: (kw= 'const' )
            // InternalGo.g:959:2: kw= 'const'
            {
            kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getCONSTAccess().getConstKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCONST"


    // $ANTLR start "entryRuleCONTINUE"
    // InternalGo.g:967:1: entryRuleCONTINUE returns [String current=null] : iv_ruleCONTINUE= ruleCONTINUE EOF ;
    public final String entryRuleCONTINUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCONTINUE = null;


        try {
            // InternalGo.g:967:48: (iv_ruleCONTINUE= ruleCONTINUE EOF )
            // InternalGo.g:968:2: iv_ruleCONTINUE= ruleCONTINUE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCONTINUERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCONTINUE=ruleCONTINUE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCONTINUE.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCONTINUE"


    // $ANTLR start "ruleCONTINUE"
    // InternalGo.g:974:1: ruleCONTINUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'continue' ;
    public final AntlrDatatypeRuleToken ruleCONTINUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:980:2: (kw= 'continue' )
            // InternalGo.g:981:2: kw= 'continue'
            {
            kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getCONTINUEAccess().getContinueKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCONTINUE"


    // $ANTLR start "entryRuleELSE"
    // InternalGo.g:989:1: entryRuleELSE returns [String current=null] : iv_ruleELSE= ruleELSE EOF ;
    public final String entryRuleELSE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELSE = null;


        try {
            // InternalGo.g:989:44: (iv_ruleELSE= ruleELSE EOF )
            // InternalGo.g:990:2: iv_ruleELSE= ruleELSE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getELSERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleELSE=ruleELSE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleELSE.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleELSE"


    // $ANTLR start "ruleELSE"
    // InternalGo.g:996:1: ruleELSE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'else' ;
    public final AntlrDatatypeRuleToken ruleELSE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:1002:2: (kw= 'else' )
            // InternalGo.g:1003:2: kw= 'else'
            {
            kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getELSEAccess().getElseKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleELSE"


    // $ANTLR start "entryRuleFOR"
    // InternalGo.g:1011:1: entryRuleFOR returns [String current=null] : iv_ruleFOR= ruleFOR EOF ;
    public final String entryRuleFOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFOR = null;


        try {
            // InternalGo.g:1011:43: (iv_ruleFOR= ruleFOR EOF )
            // InternalGo.g:1012:2: iv_ruleFOR= ruleFOR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFORRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFOR=ruleFOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFOR.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFOR"


    // $ANTLR start "ruleFOR"
    // InternalGo.g:1018:1: ruleFOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'for' ;
    public final AntlrDatatypeRuleToken ruleFOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:1024:2: (kw= 'for' )
            // InternalGo.g:1025:2: kw= 'for'
            {
            kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getFORAccess().getForKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFOR"


    // $ANTLR start "entryRuleFUNC"
    // InternalGo.g:1033:1: entryRuleFUNC returns [String current=null] : iv_ruleFUNC= ruleFUNC EOF ;
    public final String entryRuleFUNC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFUNC = null;


        try {
            // InternalGo.g:1033:44: (iv_ruleFUNC= ruleFUNC EOF )
            // InternalGo.g:1034:2: iv_ruleFUNC= ruleFUNC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFUNCRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFUNC=ruleFUNC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFUNC.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFUNC"


    // $ANTLR start "ruleFUNC"
    // InternalGo.g:1040:1: ruleFUNC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'func' ;
    public final AntlrDatatypeRuleToken ruleFUNC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:1046:2: (kw= 'func' )
            // InternalGo.g:1047:2: kw= 'func'
            {
            kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getFUNCAccess().getFuncKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFUNC"


    // $ANTLR start "entryRuleIF"
    // InternalGo.g:1055:1: entryRuleIF returns [String current=null] : iv_ruleIF= ruleIF EOF ;
    public final String entryRuleIF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIF = null;


        try {
            // InternalGo.g:1055:42: (iv_ruleIF= ruleIF EOF )
            // InternalGo.g:1056:2: iv_ruleIF= ruleIF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIFRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIF=ruleIF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIF.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIF"


    // $ANTLR start "ruleIF"
    // InternalGo.g:1062:1: ruleIF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'if' ;
    public final AntlrDatatypeRuleToken ruleIF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:1068:2: (kw= 'if' )
            // InternalGo.g:1069:2: kw= 'if'
            {
            kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getIFAccess().getIfKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIF"


    // $ANTLR start "entryRuleIMPORT"
    // InternalGo.g:1077:1: entryRuleIMPORT returns [String current=null] : iv_ruleIMPORT= ruleIMPORT EOF ;
    public final String entryRuleIMPORT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIMPORT = null;


        try {
            // InternalGo.g:1077:46: (iv_ruleIMPORT= ruleIMPORT EOF )
            // InternalGo.g:1078:2: iv_ruleIMPORT= ruleIMPORT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIMPORTRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIMPORT=ruleIMPORT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIMPORT.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIMPORT"


    // $ANTLR start "ruleIMPORT"
    // InternalGo.g:1084:1: ruleIMPORT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'import' ;
    public final AntlrDatatypeRuleToken ruleIMPORT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:1090:2: (kw= 'import' )
            // InternalGo.g:1091:2: kw= 'import'
            {
            kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getIMPORTAccess().getImportKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIMPORT"


    // $ANTLR start "entryRuleRETURN"
    // InternalGo.g:1099:1: entryRuleRETURN returns [String current=null] : iv_ruleRETURN= ruleRETURN EOF ;
    public final String entryRuleRETURN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRETURN = null;


        try {
            // InternalGo.g:1099:46: (iv_ruleRETURN= ruleRETURN EOF )
            // InternalGo.g:1100:2: iv_ruleRETURN= ruleRETURN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRETURNRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRETURN=ruleRETURN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRETURN.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRETURN"


    // $ANTLR start "ruleRETURN"
    // InternalGo.g:1106:1: ruleRETURN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'return' ;
    public final AntlrDatatypeRuleToken ruleRETURN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:1112:2: (kw= 'return' )
            // InternalGo.g:1113:2: kw= 'return'
            {
            kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getRETURNAccess().getReturnKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRETURN"


    // $ANTLR start "entryRulePACKAGE"
    // InternalGo.g:1121:1: entryRulePACKAGE returns [String current=null] : iv_rulePACKAGE= rulePACKAGE EOF ;
    public final String entryRulePACKAGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePACKAGE = null;


        try {
            // InternalGo.g:1121:47: (iv_rulePACKAGE= rulePACKAGE EOF )
            // InternalGo.g:1122:2: iv_rulePACKAGE= rulePACKAGE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPACKAGERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePACKAGE=rulePACKAGE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePACKAGE.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePACKAGE"


    // $ANTLR start "rulePACKAGE"
    // InternalGo.g:1128:1: rulePACKAGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'package' ;
    public final AntlrDatatypeRuleToken rulePACKAGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:1134:2: (kw= 'package' )
            // InternalGo.g:1135:2: kw= 'package'
            {
            kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getPACKAGEAccess().getPackageKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePACKAGE"


    // $ANTLR start "entryRuleRANGE"
    // InternalGo.g:1143:1: entryRuleRANGE returns [String current=null] : iv_ruleRANGE= ruleRANGE EOF ;
    public final String entryRuleRANGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRANGE = null;


        try {
            // InternalGo.g:1143:45: (iv_ruleRANGE= ruleRANGE EOF )
            // InternalGo.g:1144:2: iv_ruleRANGE= ruleRANGE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRANGERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRANGE=ruleRANGE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRANGE.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRANGE"


    // $ANTLR start "ruleRANGE"
    // InternalGo.g:1150:1: ruleRANGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'range' ;
    public final AntlrDatatypeRuleToken ruleRANGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:1156:2: (kw= 'range' )
            // InternalGo.g:1157:2: kw= 'range'
            {
            kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getRANGEAccess().getRangeKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRANGE"


    // $ANTLR start "entryRuleEntity"
    // InternalGo.g:1165:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalGo.g:1165:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalGo.g:1166:2: iv_ruleEntity= ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntity; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalGo.g:1172:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'print' otherlv_1= '(' ( ( (lv_name_2_0= RULE_ID ) ) | (this_INT_3= RULE_INT )+ ) otherlv_4= ')' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_INT_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGo.g:1178:2: ( (otherlv_0= 'print' otherlv_1= '(' ( ( (lv_name_2_0= RULE_ID ) ) | (this_INT_3= RULE_INT )+ ) otherlv_4= ')' ) )
            // InternalGo.g:1179:2: (otherlv_0= 'print' otherlv_1= '(' ( ( (lv_name_2_0= RULE_ID ) ) | (this_INT_3= RULE_INT )+ ) otherlv_4= ')' )
            {
            // InternalGo.g:1179:2: (otherlv_0= 'print' otherlv_1= '(' ( ( (lv_name_2_0= RULE_ID ) ) | (this_INT_3= RULE_INT )+ ) otherlv_4= ')' )
            // InternalGo.g:1180:3: otherlv_0= 'print' otherlv_1= '(' ( ( (lv_name_2_0= RULE_ID ) ) | (this_INT_3= RULE_INT )+ ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getPrintKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGo.g:1188:3: ( ( (lv_name_2_0= RULE_ID ) ) | (this_INT_3= RULE_INT )+ )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_INT) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalGo.g:1189:4: ( (lv_name_2_0= RULE_ID ) )
                    {
                    // InternalGo.g:1189:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalGo.g:1190:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalGo.g:1190:5: (lv_name_2_0= RULE_ID )
                    // InternalGo.g:1191:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_2_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEntityRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_2_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1208:4: (this_INT_3= RULE_INT )+
                    {
                    // InternalGo.g:1208:4: (this_INT_3= RULE_INT )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_INT) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalGo.g:1209:5: this_INT_3= RULE_INT
                    	    {
                    	    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_20); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_INT_3, grammarAccess.getEntityAccess().getINTTerminalRuleCall_2_1());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleDataType"
    // InternalGo.g:1223:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalGo.g:1223:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalGo.g:1224:2: iv_ruleDataType= ruleDataType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalGo.g:1230:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGo.g:1236:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGo.g:1237:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGo.g:1237:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGo.g:1238:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
              		
            }
            // InternalGo.g:1242:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGo.g:1243:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGo.g:1243:4: (lv_name_1_0= RULE_ID )
            // InternalGo.g:1244:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDataTypeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"

    // $ANTLR start synpred2_InternalGo
    public final void synpred2_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:214:4: ( ruleELSE )
        // InternalGo.g:214:5: ruleELSE
        {
        pushFollow(FOLLOW_2);
        ruleELSE();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalGo

    // Delegated rules

    public final boolean synpred2_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000030C00000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000003400020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000030C00004010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000030C00000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000003E0002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004800040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800020L});

}