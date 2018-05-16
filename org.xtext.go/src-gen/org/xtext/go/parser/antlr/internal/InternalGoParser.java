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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_ID", "RULE_INT", "RULE_PLUS", "RULE_MINUS", "RULE_ASTERICS", "RULE_BAR", "RULE_STRING", "RULE_NEWLINE", "RULE_COMMENTS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'='", "':='", "'{'", "'}'", "'||'", "'&&'", "'<'", "'<='", "'=='", "'>='", "'>'", "'('", "')'", "'true'", "'false'", "'break'", "'case'", "'chan'", "'const'", "'continue'", "'else'", "'for'", "'func'", "'if'", "'import'", "'return'", "'package'", "'type'", "'var'", "'range'", "'print'", "'datatype'"
    };
    public static final int T__50=50;
    public static final int RULE_BAR=10;
    public static final int T__19=19;
    public static final int RULE_COMMENTS=13;
    public static final int T__18=18;
    public static final int RULE_ID=5;
    public static final int RULE_EOL=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_NEWLINE=12;
    public static final int RULE_ASTERICS=9;
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_PLUS=7;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=16;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_MINUS=8;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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

                if ( ((LA1_0>=RULE_EOL && LA1_0<=RULE_INT)||(LA1_0>=41 && LA1_0<=42)||LA1_0==47||(LA1_0>=49 && LA1_0<=50)) ) {
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
    // InternalGo.g:107:1: ruleGreeting returns [EObject current=null] : (this_DecVar_0= ruleDecVar | this_DataType_1= ruleDataType | ruleEntity | this_DecFunc_3= ruleDecFunc | this_EOL_4= RULE_EOL | this_Condition_5= ruleCondition | this_Operations_6= ruleOperations ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token this_EOL_4=null;
        EObject this_DecVar_0 = null;

        EObject this_DataType_1 = null;

        EObject this_DecFunc_3 = null;

        EObject this_Condition_5 = null;

        EObject this_Operations_6 = null;



        	enterRule();

        try {
            // InternalGo.g:113:2: ( (this_DecVar_0= ruleDecVar | this_DataType_1= ruleDataType | ruleEntity | this_DecFunc_3= ruleDecFunc | this_EOL_4= RULE_EOL | this_Condition_5= ruleCondition | this_Operations_6= ruleOperations ) )
            // InternalGo.g:114:2: (this_DecVar_0= ruleDecVar | this_DataType_1= ruleDataType | ruleEntity | this_DecFunc_3= ruleDecFunc | this_EOL_4= RULE_EOL | this_Condition_5= ruleCondition | this_Operations_6= ruleOperations )
            {
            // InternalGo.g:114:2: (this_DecVar_0= ruleDecVar | this_DataType_1= ruleDataType | ruleEntity | this_DecFunc_3= ruleDecFunc | this_EOL_4= RULE_EOL | this_Condition_5= ruleCondition | this_Operations_6= ruleOperations )
            int alt2=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 47:
                {
                alt2=1;
                }
                break;
            case 50:
                {
                alt2=2;
                }
                break;
            case 49:
                {
                alt2=3;
                }
                break;
            case 41:
                {
                alt2=4;
                }
                break;
            case RULE_EOL:
                {
                alt2=5;
                }
                break;
            case 42:
                {
                alt2=6;
                }
                break;
            case RULE_INT:
                {
                alt2=7;
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
                    // InternalGo.g:115:3: this_DecVar_0= ruleDecVar
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGreetingAccess().getDecVarParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DecVar_0=ruleDecVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DecVar_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:124:3: this_DataType_1= ruleDataType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGreetingAccess().getDataTypeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DataType_1=ruleDataType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DataType_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:133:3: ruleEntity
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGreetingAccess().getEntityParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:141:3: this_DecFunc_3= ruleDecFunc
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGreetingAccess().getDecFuncParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DecFunc_3=ruleDecFunc();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DecFunc_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:150:3: this_EOL_4= RULE_EOL
                    {
                    this_EOL_4=(Token)match(input,RULE_EOL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_EOL_4, grammarAccess.getGreetingAccess().getEOLTerminalRuleCall_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGo.g:155:3: this_Condition_5= ruleCondition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGreetingAccess().getConditionParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Condition_5=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Condition_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGo.g:164:3: this_Operations_6= ruleOperations
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGreetingAccess().getOperationsParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Operations_6=ruleOperations();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Operations_6;
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


    // $ANTLR start "entryRuleDecVar"
    // InternalGo.g:176:1: entryRuleDecVar returns [EObject current=null] : iv_ruleDecVar= ruleDecVar EOF ;
    public final EObject entryRuleDecVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecVar = null;


        try {
            // InternalGo.g:176:47: (iv_ruleDecVar= ruleDecVar EOF )
            // InternalGo.g:177:2: iv_ruleDecVar= ruleDecVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecVarRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDecVar=ruleDecVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecVar; 
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
    // $ANTLR end "entryRuleDecVar"


    // $ANTLR start "ruleDecVar"
    // InternalGo.g:183:1: ruleDecVar returns [EObject current=null] : (this_DecVars_0= ruleDecVars | ( ruleVAR ( (lv_vars_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_vars_4_0= RULE_ID ) ) )* ruleTYPE (otherlv_6= '=' ( (lv_atrb_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_atrb_9_0= RULE_ID ) ) )* )? ) ) ;
    public final EObject ruleDecVar() throws RecognitionException {
        EObject current = null;

        Token lv_vars_2_0=null;
        Token otherlv_3=null;
        Token lv_vars_4_0=null;
        Token otherlv_6=null;
        Token lv_atrb_7_0=null;
        Token otherlv_8=null;
        Token lv_atrb_9_0=null;
        EObject this_DecVars_0 = null;



        	enterRule();

        try {
            // InternalGo.g:189:2: ( (this_DecVars_0= ruleDecVars | ( ruleVAR ( (lv_vars_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_vars_4_0= RULE_ID ) ) )* ruleTYPE (otherlv_6= '=' ( (lv_atrb_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_atrb_9_0= RULE_ID ) ) )* )? ) ) )
            // InternalGo.g:190:2: (this_DecVars_0= ruleDecVars | ( ruleVAR ( (lv_vars_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_vars_4_0= RULE_ID ) ) )* ruleTYPE (otherlv_6= '=' ( (lv_atrb_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_atrb_9_0= RULE_ID ) ) )* )? ) )
            {
            // InternalGo.g:190:2: (this_DecVars_0= ruleDecVars | ( ruleVAR ( (lv_vars_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_vars_4_0= RULE_ID ) ) )* ruleTYPE (otherlv_6= '=' ( (lv_atrb_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_atrb_9_0= RULE_ID ) ) )* )? ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==47) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGo.g:191:3: this_DecVars_0= ruleDecVars
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDecVarAccess().getDecVarsParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DecVars_0=ruleDecVars();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DecVars_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:200:3: ( ruleVAR ( (lv_vars_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_vars_4_0= RULE_ID ) ) )* ruleTYPE (otherlv_6= '=' ( (lv_atrb_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_atrb_9_0= RULE_ID ) ) )* )? )
                    {
                    // InternalGo.g:200:3: ( ruleVAR ( (lv_vars_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_vars_4_0= RULE_ID ) ) )* ruleTYPE (otherlv_6= '=' ( (lv_atrb_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_atrb_9_0= RULE_ID ) ) )* )? )
                    // InternalGo.g:201:4: ruleVAR ( (lv_vars_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_vars_4_0= RULE_ID ) ) )* ruleTYPE (otherlv_6= '=' ( (lv_atrb_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_atrb_9_0= RULE_ID ) ) )* )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDecVarAccess().getVARParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    ruleVAR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:208:4: ( (lv_vars_2_0= RULE_ID ) )
                    // InternalGo.g:209:5: (lv_vars_2_0= RULE_ID )
                    {
                    // InternalGo.g:209:5: (lv_vars_2_0= RULE_ID )
                    // InternalGo.g:210:6: lv_vars_2_0= RULE_ID
                    {
                    lv_vars_2_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_vars_2_0, grammarAccess.getDecVarAccess().getVarsIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDecVarRule());
                      						}
                      						addWithLastConsumed(
                      							current,
                      							"vars",
                      							lv_vars_2_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    // InternalGo.g:226:4: (otherlv_3= ',' ( (lv_vars_4_0= RULE_ID ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==18) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalGo.g:227:5: otherlv_3= ',' ( (lv_vars_4_0= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getDecVarAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalGo.g:231:5: ( (lv_vars_4_0= RULE_ID ) )
                    	    // InternalGo.g:232:6: (lv_vars_4_0= RULE_ID )
                    	    {
                    	    // InternalGo.g:232:6: (lv_vars_4_0= RULE_ID )
                    	    // InternalGo.g:233:7: lv_vars_4_0= RULE_ID
                    	    {
                    	    lv_vars_4_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(lv_vars_4_0, grammarAccess.getDecVarAccess().getVarsIDTerminalRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getDecVarRule());
                    	      							}
                    	      							addWithLastConsumed(
                    	      								current,
                    	      								"vars",
                    	      								lv_vars_4_0,
                    	      								"org.eclipse.xtext.common.Terminals.ID");
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDecVarAccess().getTYPEParserRuleCall_1_3());
                      			
                    }
                    pushFollow(FOLLOW_6);
                    ruleTYPE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:257:4: (otherlv_6= '=' ( (lv_atrb_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_atrb_9_0= RULE_ID ) ) )* )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==19) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalGo.g:258:5: otherlv_6= '=' ( (lv_atrb_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_atrb_9_0= RULE_ID ) ) )*
                            {
                            otherlv_6=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getDecVarAccess().getEqualsSignKeyword_1_4_0());
                              				
                            }
                            // InternalGo.g:262:5: ( (lv_atrb_7_0= RULE_ID ) )
                            // InternalGo.g:263:6: (lv_atrb_7_0= RULE_ID )
                            {
                            // InternalGo.g:263:6: (lv_atrb_7_0= RULE_ID )
                            // InternalGo.g:264:7: lv_atrb_7_0= RULE_ID
                            {
                            lv_atrb_7_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_atrb_7_0, grammarAccess.getDecVarAccess().getAtrbIDTerminalRuleCall_1_4_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getDecVarRule());
                              							}
                              							addWithLastConsumed(
                              								current,
                              								"atrb",
                              								lv_atrb_7_0,
                              								"org.eclipse.xtext.common.Terminals.ID");
                              						
                            }

                            }


                            }

                            // InternalGo.g:280:5: (otherlv_8= ',' ( (lv_atrb_9_0= RULE_ID ) ) )*
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( (LA4_0==18) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // InternalGo.g:281:6: otherlv_8= ',' ( (lv_atrb_9_0= RULE_ID ) )
                            	    {
                            	    otherlv_8=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_8, grammarAccess.getDecVarAccess().getCommaKeyword_1_4_2_0());
                            	      					
                            	    }
                            	    // InternalGo.g:285:6: ( (lv_atrb_9_0= RULE_ID ) )
                            	    // InternalGo.g:286:7: (lv_atrb_9_0= RULE_ID )
                            	    {
                            	    // InternalGo.g:286:7: (lv_atrb_9_0= RULE_ID )
                            	    // InternalGo.g:287:8: lv_atrb_9_0= RULE_ID
                            	    {
                            	    lv_atrb_9_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								newLeafNode(lv_atrb_9_0, grammarAccess.getDecVarAccess().getAtrbIDTerminalRuleCall_1_4_2_1_0());
                            	      							
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElement(grammarAccess.getDecVarRule());
                            	      								}
                            	      								addWithLastConsumed(
                            	      									current,
                            	      									"atrb",
                            	      									lv_atrb_9_0,
                            	      									"org.eclipse.xtext.common.Terminals.ID");
                            	      							
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
                            break;

                    }


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
    // $ANTLR end "ruleDecVar"


    // $ANTLR start "entryRuleDecVars"
    // InternalGo.g:310:1: entryRuleDecVars returns [EObject current=null] : iv_ruleDecVars= ruleDecVars EOF ;
    public final EObject entryRuleDecVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecVars = null;


        try {
            // InternalGo.g:310:48: (iv_ruleDecVars= ruleDecVars EOF )
            // InternalGo.g:311:2: iv_ruleDecVars= ruleDecVars EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecVarsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDecVars=ruleDecVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecVars; 
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
    // $ANTLR end "entryRuleDecVars"


    // $ANTLR start "ruleDecVars"
    // InternalGo.g:317:1: ruleDecVars returns [EObject current=null] : ( ( (lv_vars_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_ID ) ) )* otherlv_3= ':=' ( (lv_atrb_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_atrb_6_0= RULE_ID ) ) )* ) ;
    public final EObject ruleDecVars() throws RecognitionException {
        EObject current = null;

        Token lv_vars_0_0=null;
        Token otherlv_1=null;
        Token lv_vars_2_0=null;
        Token otherlv_3=null;
        Token lv_atrb_4_0=null;
        Token otherlv_5=null;
        Token lv_atrb_6_0=null;


        	enterRule();

        try {
            // InternalGo.g:323:2: ( ( ( (lv_vars_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_ID ) ) )* otherlv_3= ':=' ( (lv_atrb_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_atrb_6_0= RULE_ID ) ) )* ) )
            // InternalGo.g:324:2: ( ( (lv_vars_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_ID ) ) )* otherlv_3= ':=' ( (lv_atrb_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_atrb_6_0= RULE_ID ) ) )* )
            {
            // InternalGo.g:324:2: ( ( (lv_vars_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_ID ) ) )* otherlv_3= ':=' ( (lv_atrb_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_atrb_6_0= RULE_ID ) ) )* )
            // InternalGo.g:325:3: ( (lv_vars_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_ID ) ) )* otherlv_3= ':=' ( (lv_atrb_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_atrb_6_0= RULE_ID ) ) )*
            {
            // InternalGo.g:325:3: ( (lv_vars_0_0= RULE_ID ) )
            // InternalGo.g:326:4: (lv_vars_0_0= RULE_ID )
            {
            // InternalGo.g:326:4: (lv_vars_0_0= RULE_ID )
            // InternalGo.g:327:5: lv_vars_0_0= RULE_ID
            {
            lv_vars_0_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_vars_0_0, grammarAccess.getDecVarsAccess().getVarsIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDecVarsRule());
              					}
              					addWithLastConsumed(
              						current,
              						"vars",
              						lv_vars_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalGo.g:343:3: (otherlv_1= ',' ( (lv_vars_2_0= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGo.g:344:4: otherlv_1= ',' ( (lv_vars_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDecVarsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalGo.g:348:4: ( (lv_vars_2_0= RULE_ID ) )
            	    // InternalGo.g:349:5: (lv_vars_2_0= RULE_ID )
            	    {
            	    // InternalGo.g:349:5: (lv_vars_2_0= RULE_ID )
            	    // InternalGo.g:350:6: lv_vars_2_0= RULE_ID
            	    {
            	    lv_vars_2_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_vars_2_0, grammarAccess.getDecVarsAccess().getVarsIDTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDecVarsRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"vars",
            	      							lv_vars_2_0,
            	      							"org.eclipse.xtext.common.Terminals.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDecVarsAccess().getColonEqualsSignKeyword_2());
              		
            }
            // InternalGo.g:371:3: ( (lv_atrb_4_0= RULE_ID ) )
            // InternalGo.g:372:4: (lv_atrb_4_0= RULE_ID )
            {
            // InternalGo.g:372:4: (lv_atrb_4_0= RULE_ID )
            // InternalGo.g:373:5: lv_atrb_4_0= RULE_ID
            {
            lv_atrb_4_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_atrb_4_0, grammarAccess.getDecVarsAccess().getAtrbIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDecVarsRule());
              					}
              					addWithLastConsumed(
              						current,
              						"atrb",
              						lv_atrb_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalGo.g:389:3: (otherlv_5= ',' ( (lv_atrb_6_0= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGo.g:390:4: otherlv_5= ',' ( (lv_atrb_6_0= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getDecVarsAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalGo.g:394:4: ( (lv_atrb_6_0= RULE_ID ) )
            	    // InternalGo.g:395:5: (lv_atrb_6_0= RULE_ID )
            	    {
            	    // InternalGo.g:395:5: (lv_atrb_6_0= RULE_ID )
            	    // InternalGo.g:396:6: lv_atrb_6_0= RULE_ID
            	    {
            	    lv_atrb_6_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_atrb_6_0, grammarAccess.getDecVarsAccess().getAtrbIDTerminalRuleCall_4_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDecVarsRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"atrb",
            	      							lv_atrb_6_0,
            	      							"org.eclipse.xtext.common.Terminals.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleDecVars"


    // $ANTLR start "entryRuleOperations"
    // InternalGo.g:417:1: entryRuleOperations returns [EObject current=null] : iv_ruleOperations= ruleOperations EOF ;
    public final EObject entryRuleOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperations = null;


        try {
            // InternalGo.g:417:51: (iv_ruleOperations= ruleOperations EOF )
            // InternalGo.g:418:2: iv_ruleOperations= ruleOperations EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperations=ruleOperations();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperations; 
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
    // $ANTLR end "entryRuleOperations"


    // $ANTLR start "ruleOperations"
    // InternalGo.g:424:1: ruleOperations returns [EObject current=null] : (this_Sum_0= ruleSum | this_Subtraction_1= ruleSubtraction | this_Multiplication_2= ruleMultiplication | this_Division_3= ruleDivision | this_INT_4= RULE_INT ) ;
    public final EObject ruleOperations() throws RecognitionException {
        EObject current = null;

        Token this_INT_4=null;
        EObject this_Sum_0 = null;

        EObject this_Subtraction_1 = null;

        EObject this_Multiplication_2 = null;

        EObject this_Division_3 = null;



        	enterRule();

        try {
            // InternalGo.g:430:2: ( (this_Sum_0= ruleSum | this_Subtraction_1= ruleSubtraction | this_Multiplication_2= ruleMultiplication | this_Division_3= ruleDivision | this_INT_4= RULE_INT ) )
            // InternalGo.g:431:2: (this_Sum_0= ruleSum | this_Subtraction_1= ruleSubtraction | this_Multiplication_2= ruleMultiplication | this_Division_3= ruleDivision | this_INT_4= RULE_INT )
            {
            // InternalGo.g:431:2: (this_Sum_0= ruleSum | this_Subtraction_1= ruleSubtraction | this_Multiplication_2= ruleMultiplication | this_Division_3= ruleDivision | this_INT_4= RULE_INT )
            int alt9=5;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                switch ( input.LA(2) ) {
                case RULE_BAR:
                    {
                    alt9=4;
                    }
                    break;
                case RULE_ASTERICS:
                    {
                    alt9=3;
                    }
                    break;
                case RULE_MINUS:
                    {
                    alt9=2;
                    }
                    break;
                case RULE_PLUS:
                    {
                    alt9=1;
                    }
                    break;
                case EOF:
                case RULE_EOL:
                case RULE_ID:
                case RULE_INT:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 31:
                case 41:
                case 42:
                case 47:
                case 49:
                case 50:
                    {
                    alt9=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGo.g:432:3: this_Sum_0= ruleSum
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperationsAccess().getSumParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Sum_0=ruleSum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Sum_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:441:3: this_Subtraction_1= ruleSubtraction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperationsAccess().getSubtractionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Subtraction_1=ruleSubtraction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Subtraction_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:450:3: this_Multiplication_2= ruleMultiplication
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperationsAccess().getMultiplicationParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Multiplication_2=ruleMultiplication();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Multiplication_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:459:3: this_Division_3= ruleDivision
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperationsAccess().getDivisionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Division_3=ruleDivision();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Division_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:468:3: this_INT_4= RULE_INT
                    {
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_4, grammarAccess.getOperationsAccess().getINTTerminalRuleCall_4());
                      		
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
    // $ANTLR end "ruleOperations"


    // $ANTLR start "entryRuleSum"
    // InternalGo.g:476:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalGo.g:476:44: (iv_ruleSum= ruleSum EOF )
            // InternalGo.g:477:2: iv_ruleSum= ruleSum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSum=ruleSum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSum; 
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
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // InternalGo.g:483:1: ruleSum returns [EObject current=null] : (this_INT_0= RULE_INT this_Plus_1= RULE_PLUS this_INT_2= RULE_INT ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token this_INT_0=null;
        Token this_Plus_1=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalGo.g:489:2: ( (this_INT_0= RULE_INT this_Plus_1= RULE_PLUS this_INT_2= RULE_INT ) )
            // InternalGo.g:490:2: (this_INT_0= RULE_INT this_Plus_1= RULE_PLUS this_INT_2= RULE_INT )
            {
            // InternalGo.g:490:2: (this_INT_0= RULE_INT this_Plus_1= RULE_PLUS this_INT_2= RULE_INT )
            // InternalGo.g:491:3: this_INT_0= RULE_INT this_Plus_1= RULE_PLUS this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getSumAccess().getINTTerminalRuleCall_0());
              		
            }
            this_Plus_1=(Token)match(input,RULE_PLUS,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Plus_1, grammarAccess.getSumAccess().getPlusTerminalRuleCall_1());
              		
            }
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_2, grammarAccess.getSumAccess().getINTTerminalRuleCall_2());
              		
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
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleSubtraction"
    // InternalGo.g:507:1: entryRuleSubtraction returns [EObject current=null] : iv_ruleSubtraction= ruleSubtraction EOF ;
    public final EObject entryRuleSubtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtraction = null;


        try {
            // InternalGo.g:507:52: (iv_ruleSubtraction= ruleSubtraction EOF )
            // InternalGo.g:508:2: iv_ruleSubtraction= ruleSubtraction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubtractionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubtraction=ruleSubtraction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubtraction; 
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
    // $ANTLR end "entryRuleSubtraction"


    // $ANTLR start "ruleSubtraction"
    // InternalGo.g:514:1: ruleSubtraction returns [EObject current=null] : (this_INT_0= RULE_INT this_Minus_1= RULE_MINUS this_INT_2= RULE_INT ) ;
    public final EObject ruleSubtraction() throws RecognitionException {
        EObject current = null;

        Token this_INT_0=null;
        Token this_Minus_1=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalGo.g:520:2: ( (this_INT_0= RULE_INT this_Minus_1= RULE_MINUS this_INT_2= RULE_INT ) )
            // InternalGo.g:521:2: (this_INT_0= RULE_INT this_Minus_1= RULE_MINUS this_INT_2= RULE_INT )
            {
            // InternalGo.g:521:2: (this_INT_0= RULE_INT this_Minus_1= RULE_MINUS this_INT_2= RULE_INT )
            // InternalGo.g:522:3: this_INT_0= RULE_INT this_Minus_1= RULE_MINUS this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getSubtractionAccess().getINTTerminalRuleCall_0());
              		
            }
            this_Minus_1=(Token)match(input,RULE_MINUS,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Minus_1, grammarAccess.getSubtractionAccess().getMinusTerminalRuleCall_1());
              		
            }
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_2, grammarAccess.getSubtractionAccess().getINTTerminalRuleCall_2());
              		
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
    // $ANTLR end "ruleSubtraction"


    // $ANTLR start "entryRuleMultiplication"
    // InternalGo.g:538:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalGo.g:538:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalGo.g:539:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplication; 
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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalGo.g:545:1: ruleMultiplication returns [EObject current=null] : (this_INT_0= RULE_INT this_Asterics_1= RULE_ASTERICS this_INT_2= RULE_INT ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token this_INT_0=null;
        Token this_Asterics_1=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalGo.g:551:2: ( (this_INT_0= RULE_INT this_Asterics_1= RULE_ASTERICS this_INT_2= RULE_INT ) )
            // InternalGo.g:552:2: (this_INT_0= RULE_INT this_Asterics_1= RULE_ASTERICS this_INT_2= RULE_INT )
            {
            // InternalGo.g:552:2: (this_INT_0= RULE_INT this_Asterics_1= RULE_ASTERICS this_INT_2= RULE_INT )
            // InternalGo.g:553:3: this_INT_0= RULE_INT this_Asterics_1= RULE_ASTERICS this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getMultiplicationAccess().getINTTerminalRuleCall_0());
              		
            }
            this_Asterics_1=(Token)match(input,RULE_ASTERICS,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Asterics_1, grammarAccess.getMultiplicationAccess().getAstericsTerminalRuleCall_1());
              		
            }
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_2, grammarAccess.getMultiplicationAccess().getINTTerminalRuleCall_2());
              		
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleDivision"
    // InternalGo.g:569:1: entryRuleDivision returns [EObject current=null] : iv_ruleDivision= ruleDivision EOF ;
    public final EObject entryRuleDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivision = null;


        try {
            // InternalGo.g:569:49: (iv_ruleDivision= ruleDivision EOF )
            // InternalGo.g:570:2: iv_ruleDivision= ruleDivision EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivisionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivision=ruleDivision();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivision; 
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
    // $ANTLR end "entryRuleDivision"


    // $ANTLR start "ruleDivision"
    // InternalGo.g:576:1: ruleDivision returns [EObject current=null] : (this_INT_0= RULE_INT this_Bar_1= RULE_BAR this_INT_2= RULE_INT ) ;
    public final EObject ruleDivision() throws RecognitionException {
        EObject current = null;

        Token this_INT_0=null;
        Token this_Bar_1=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalGo.g:582:2: ( (this_INT_0= RULE_INT this_Bar_1= RULE_BAR this_INT_2= RULE_INT ) )
            // InternalGo.g:583:2: (this_INT_0= RULE_INT this_Bar_1= RULE_BAR this_INT_2= RULE_INT )
            {
            // InternalGo.g:583:2: (this_INT_0= RULE_INT this_Bar_1= RULE_BAR this_INT_2= RULE_INT )
            // InternalGo.g:584:3: this_INT_0= RULE_INT this_Bar_1= RULE_BAR this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getDivisionAccess().getINTTerminalRuleCall_0());
              		
            }
            this_Bar_1=(Token)match(input,RULE_BAR,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Bar_1, grammarAccess.getDivisionAccess().getBarTerminalRuleCall_1());
              		
            }
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_2, grammarAccess.getDivisionAccess().getINTTerminalRuleCall_2());
              		
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
    // $ANTLR end "ruleDivision"


    // $ANTLR start "entryRuleCondition"
    // InternalGo.g:600:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalGo.g:600:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalGo.g:601:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalGo.g:607:1: ruleCondition returns [EObject current=null] : ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_if_0_0 = null;

        EObject lv_elseif_1_0 = null;

        EObject lv_else_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:613:2: ( ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )? ) )
            // InternalGo.g:614:2: ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )? )
            {
            // InternalGo.g:614:2: ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )? )
            // InternalGo.g:615:3: ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )?
            {
            // InternalGo.g:615:3: ( (lv_if_0_0= ruleIfCondition ) )
            // InternalGo.g:616:4: (lv_if_0_0= ruleIfCondition )
            {
            // InternalGo.g:616:4: (lv_if_0_0= ruleIfCondition )
            // InternalGo.g:617:5: lv_if_0_0= ruleIfCondition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionAccess().getIfIfConditionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_14);
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

            // InternalGo.g:634:3: ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==39) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==42) && (synpred1_InternalGo())) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalGo.g:635:4: ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition )
            	    {
            	    // InternalGo.g:636:4: (lv_elseif_1_0= ruleElseIfCondition )
            	    // InternalGo.g:637:5: lv_elseif_1_0= ruleElseIfCondition
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConditionAccess().getElseifElseIfConditionParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_14);
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
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalGo.g:654:3: ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==39) && (synpred2_InternalGo())) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGo.g:655:4: ( ruleELSE )=> (lv_else_2_0= ruleElseCondition )
                    {
                    // InternalGo.g:656:4: (lv_else_2_0= ruleElseCondition )
                    // InternalGo.g:657:5: lv_else_2_0= ruleElseCondition
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
    // InternalGo.g:678:1: entryRuleIfCondition returns [EObject current=null] : iv_ruleIfCondition= ruleIfCondition EOF ;
    public final EObject entryRuleIfCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfCondition = null;


        try {
            // InternalGo.g:678:52: (iv_ruleIfCondition= ruleIfCondition EOF )
            // InternalGo.g:679:2: iv_ruleIfCondition= ruleIfCondition EOF
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
    // InternalGo.g:685:1: ruleIfCondition returns [EObject current=null] : ( ruleIF ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= '{' ( (lv_then_3_0= ruleGreeting ) )* otherlv_4= '}' ) ;
    public final EObject ruleIfCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_cond_1_0 = null;

        EObject lv_then_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:691:2: ( ( ruleIF ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= '{' ( (lv_then_3_0= ruleGreeting ) )* otherlv_4= '}' ) )
            // InternalGo.g:692:2: ( ruleIF ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= '{' ( (lv_then_3_0= ruleGreeting ) )* otherlv_4= '}' )
            {
            // InternalGo.g:692:2: ( ruleIF ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= '{' ( (lv_then_3_0= ruleGreeting ) )* otherlv_4= '}' )
            // InternalGo.g:693:3: ruleIF ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= '{' ( (lv_then_3_0= ruleGreeting ) )* otherlv_4= '}'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIfConditionAccess().getIFParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_15);
            ruleIF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:700:3: ( (lv_cond_1_0= ruleExpression ) )
            // InternalGo.g:701:4: (lv_cond_1_0= ruleExpression )
            {
            // InternalGo.g:701:4: (lv_cond_1_0= ruleExpression )
            // InternalGo.g:702:5: lv_cond_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfConditionAccess().getCondExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_16);
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

            otherlv_2=(Token)match(input,21,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfConditionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalGo.g:723:3: ( (lv_then_3_0= ruleGreeting ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_EOL && LA12_0<=RULE_INT)||(LA12_0>=41 && LA12_0<=42)||LA12_0==47||(LA12_0>=49 && LA12_0<=50)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGo.g:724:4: (lv_then_3_0= ruleGreeting )
            	    {
            	    // InternalGo.g:724:4: (lv_then_3_0= ruleGreeting )
            	    // InternalGo.g:725:5: lv_then_3_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfConditionAccess().getThenGreetingParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_17);
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
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:750:1: entryRuleElseIfCondition returns [EObject current=null] : iv_ruleElseIfCondition= ruleElseIfCondition EOF ;
    public final EObject entryRuleElseIfCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfCondition = null;


        try {
            // InternalGo.g:750:56: (iv_ruleElseIfCondition= ruleElseIfCondition EOF )
            // InternalGo.g:751:2: iv_ruleElseIfCondition= ruleElseIfCondition EOF
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
    // InternalGo.g:757:1: ruleElseIfCondition returns [EObject current=null] : ( ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition ) ;
    public final EObject ruleElseIfCondition() throws RecognitionException {
        EObject current = null;

        EObject this_IfCondition_1 = null;



        	enterRule();

        try {
            // InternalGo.g:763:2: ( ( ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition ) )
            // InternalGo.g:764:2: ( ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition )
            {
            // InternalGo.g:764:2: ( ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition )
            // InternalGo.g:765:3: ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition
            {
            // InternalGo.g:765:3: ( ( ruleELSE )=> ruleELSE )
            // InternalGo.g:766:4: ( ruleELSE )=> ruleELSE
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getElseIfConditionAccess().getELSEParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_18);
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
    // InternalGo.g:787:1: entryRuleElseCondition returns [EObject current=null] : iv_ruleElseCondition= ruleElseCondition EOF ;
    public final EObject entryRuleElseCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseCondition = null;


        try {
            // InternalGo.g:787:54: (iv_ruleElseCondition= ruleElseCondition EOF )
            // InternalGo.g:788:2: iv_ruleElseCondition= ruleElseCondition EOF
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
    // InternalGo.g:794:1: ruleElseCondition returns [EObject current=null] : ( ( ( ruleELSE )=> ruleELSE ) otherlv_1= '{' ( (lv_then_2_0= ruleGreeting ) )* otherlv_3= '}' ) ;
    public final EObject ruleElseCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_then_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:800:2: ( ( ( ( ruleELSE )=> ruleELSE ) otherlv_1= '{' ( (lv_then_2_0= ruleGreeting ) )* otherlv_3= '}' ) )
            // InternalGo.g:801:2: ( ( ( ruleELSE )=> ruleELSE ) otherlv_1= '{' ( (lv_then_2_0= ruleGreeting ) )* otherlv_3= '}' )
            {
            // InternalGo.g:801:2: ( ( ( ruleELSE )=> ruleELSE ) otherlv_1= '{' ( (lv_then_2_0= ruleGreeting ) )* otherlv_3= '}' )
            // InternalGo.g:802:3: ( ( ruleELSE )=> ruleELSE ) otherlv_1= '{' ( (lv_then_2_0= ruleGreeting ) )* otherlv_3= '}'
            {
            // InternalGo.g:802:3: ( ( ruleELSE )=> ruleELSE )
            // InternalGo.g:803:4: ( ruleELSE )=> ruleELSE
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getElseConditionAccess().getELSEParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_16);
            ruleELSE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getElseConditionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGo.g:816:3: ( (lv_then_2_0= ruleGreeting ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_EOL && LA13_0<=RULE_INT)||(LA13_0>=41 && LA13_0<=42)||LA13_0==47||(LA13_0>=49 && LA13_0<=50)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGo.g:817:4: (lv_then_2_0= ruleGreeting )
            	    {
            	    // InternalGo.g:817:4: (lv_then_2_0= ruleGreeting )
            	    // InternalGo.g:818:5: lv_then_2_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getElseConditionAccess().getThenGreetingParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_17);
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
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:843:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalGo.g:843:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalGo.g:844:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalGo.g:850:1: ruleExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;



        	enterRule();

        try {
            // InternalGo.g:856:2: (this_OrExpression_0= ruleOrExpression )
            // InternalGo.g:857:2: this_OrExpression_0= ruleOrExpression
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
    // InternalGo.g:868:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalGo.g:868:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalGo.g:869:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalGo.g:875:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:881:2: ( (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalGo.g:882:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalGo.g:882:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalGo.g:883:3: this_AndExpression_0= ruleAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_19);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:891:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGo.g:892:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalGo.g:892:4: ()
            	    // InternalGo.g:893:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalGo.g:903:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalGo.g:904:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalGo.g:904:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalGo.g:905:6: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
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
            	    break loop14;
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
    // InternalGo.g:927:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalGo.g:927:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalGo.g:928:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalGo.g:934:1: ruleAndExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ComparisonExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:940:2: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) )
            // InternalGo.g:941:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            {
            // InternalGo.g:941:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            // InternalGo.g:942:3: this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndExpressionAccess().getComparisonExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_20);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ComparisonExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:950:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==24) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGo.g:951:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) )
            	    {
            	    // InternalGo.g:951:4: ()
            	    // InternalGo.g:952:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalGo.g:962:4: ( (lv_right_3_0= ruleComparisonExpression ) )
            	    // InternalGo.g:963:5: (lv_right_3_0= ruleComparisonExpression )
            	    {
            	    // InternalGo.g:963:5: (lv_right_3_0= ruleComparisonExpression )
            	    // InternalGo.g:964:6: lv_right_3_0= ruleComparisonExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
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
            	    break loop15;
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
    // InternalGo.g:986:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalGo.g:986:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalGo.g:987:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
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
    // InternalGo.g:993:1: ruleComparisonExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
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
            // InternalGo.g:999:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // InternalGo.g:1000:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // InternalGo.g:1000:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // InternalGo.g:1001:3: this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonExpressionAccess().getPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_21);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1009:3: ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=25 && LA17_0<=29)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGo.g:1010:4: () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // InternalGo.g:1010:4: ()
            	    // InternalGo.g:1011:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalGo.g:1017:4: ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) )
            	    // InternalGo.g:1018:5: ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) )
            	    {
            	    // InternalGo.g:1018:5: ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) )
            	    // InternalGo.g:1019:6: (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' )
            	    {
            	    // InternalGo.g:1019:6: (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' )
            	    int alt16=5;
            	    switch ( input.LA(1) ) {
            	    case 25:
            	        {
            	        alt16=1;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt16=2;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt16=3;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt16=4;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt16=5;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt16) {
            	        case 1 :
            	            // InternalGo.g:1020:7: lv_operator_2_1= '<'
            	            {
            	            lv_operator_2_1=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
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
            	            // InternalGo.g:1031:7: lv_operator_2_2= '<='
            	            {
            	            lv_operator_2_2=(Token)match(input,26,FOLLOW_15); if (state.failed) return current;
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
            	            // InternalGo.g:1042:7: lv_operator_2_3= '=='
            	            {
            	            lv_operator_2_3=(Token)match(input,27,FOLLOW_15); if (state.failed) return current;
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
            	            // InternalGo.g:1053:7: lv_operator_2_4= '>='
            	            {
            	            lv_operator_2_4=(Token)match(input,28,FOLLOW_15); if (state.failed) return current;
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
            	            // InternalGo.g:1064:7: lv_operator_2_5= '>'
            	            {
            	            lv_operator_2_5=(Token)match(input,29,FOLLOW_15); if (state.failed) return current;
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

            	    // InternalGo.g:1077:4: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // InternalGo.g:1078:5: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // InternalGo.g:1078:5: (lv_right_3_0= rulePrimaryExpression )
            	    // InternalGo.g:1079:6: lv_right_3_0= rulePrimaryExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_21);
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
            	    break loop17;
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
    // InternalGo.g:1101:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalGo.g:1101:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalGo.g:1102:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalGo.g:1108:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Literal_3= ruleLiteral ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_Literal_3 = null;



        	enterRule();

        try {
            // InternalGo.g:1114:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Literal_3= ruleLiteral ) )
            // InternalGo.g:1115:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Literal_3= ruleLiteral )
            {
            // InternalGo.g:1115:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Literal_3= ruleLiteral )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_INT||(LA18_0>=32 && LA18_0<=33)) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalGo.g:1116:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalGo.g:1116:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalGo.g:1117:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_22);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1135:3: this_Literal_3= ruleLiteral
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
    // InternalGo.g:1147:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalGo.g:1147:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalGo.g:1148:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalGo.g:1154:1: ruleLiteral returns [EObject current=null] : ( ( () ( (lv_value_1_0= 'true' ) ) ) | otherlv_2= 'false' | this_Operations_3= ruleOperations ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;
        EObject this_Operations_3 = null;



        	enterRule();

        try {
            // InternalGo.g:1160:2: ( ( ( () ( (lv_value_1_0= 'true' ) ) ) | otherlv_2= 'false' | this_Operations_3= ruleOperations ) )
            // InternalGo.g:1161:2: ( ( () ( (lv_value_1_0= 'true' ) ) ) | otherlv_2= 'false' | this_Operations_3= ruleOperations )
            {
            // InternalGo.g:1161:2: ( ( () ( (lv_value_1_0= 'true' ) ) ) | otherlv_2= 'false' | this_Operations_3= ruleOperations )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt19=1;
                }
                break;
            case 33:
                {
                alt19=2;
                }
                break;
            case RULE_INT:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalGo.g:1162:3: ( () ( (lv_value_1_0= 'true' ) ) )
                    {
                    // InternalGo.g:1162:3: ( () ( (lv_value_1_0= 'true' ) ) )
                    // InternalGo.g:1163:4: () ( (lv_value_1_0= 'true' ) )
                    {
                    // InternalGo.g:1163:4: ()
                    // InternalGo.g:1164:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getLiteralAccess().getLiteralAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGo.g:1170:4: ( (lv_value_1_0= 'true' ) )
                    // InternalGo.g:1171:5: (lv_value_1_0= 'true' )
                    {
                    // InternalGo.g:1171:5: (lv_value_1_0= 'true' )
                    // InternalGo.g:1172:6: lv_value_1_0= 'true'
                    {
                    lv_value_1_0=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
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
                    // InternalGo.g:1186:3: otherlv_2= 'false'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(otherlv_2, grammarAccess.getLiteralAccess().getFalseKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:1191:3: this_Operations_3= ruleOperations
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getOperationsParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Operations_3=ruleOperations();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Operations_3;
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleDecFunc"
    // InternalGo.g:1203:1: entryRuleDecFunc returns [EObject current=null] : iv_ruleDecFunc= ruleDecFunc EOF ;
    public final EObject entryRuleDecFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecFunc = null;


        try {
            // InternalGo.g:1203:48: (iv_ruleDecFunc= ruleDecFunc EOF )
            // InternalGo.g:1204:2: iv_ruleDecFunc= ruleDecFunc EOF
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
    // InternalGo.g:1210:1: ruleDecFunc returns [EObject current=null] : ( ruleFUNC ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameter_3_0= RULE_ID ) )? (otherlv_4= ',' ( (lv_parameter_5_0= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_args_8_0= ruleGreeting ) )* otherlv_9= '}' ) ;
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
            // InternalGo.g:1216:2: ( ( ruleFUNC ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameter_3_0= RULE_ID ) )? (otherlv_4= ',' ( (lv_parameter_5_0= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_args_8_0= ruleGreeting ) )* otherlv_9= '}' ) )
            // InternalGo.g:1217:2: ( ruleFUNC ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameter_3_0= RULE_ID ) )? (otherlv_4= ',' ( (lv_parameter_5_0= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_args_8_0= ruleGreeting ) )* otherlv_9= '}' )
            {
            // InternalGo.g:1217:2: ( ruleFUNC ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameter_3_0= RULE_ID ) )? (otherlv_4= ',' ( (lv_parameter_5_0= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_args_8_0= ruleGreeting ) )* otherlv_9= '}' )
            // InternalGo.g:1218:3: ruleFUNC ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameter_3_0= RULE_ID ) )? (otherlv_4= ',' ( (lv_parameter_5_0= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_args_8_0= ruleGreeting ) )* otherlv_9= '}'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDecFuncAccess().getFUNCParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_4);
            ruleFUNC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1225:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGo.g:1226:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGo.g:1226:4: (lv_name_1_0= RULE_ID )
            // InternalGo.g:1227:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,30,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDecFuncAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalGo.g:1247:3: ( (lv_parameter_3_0= RULE_ID ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGo.g:1248:4: (lv_parameter_3_0= RULE_ID )
                    {
                    // InternalGo.g:1248:4: (lv_parameter_3_0= RULE_ID )
                    // InternalGo.g:1249:5: lv_parameter_3_0= RULE_ID
                    {
                    lv_parameter_3_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
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

            // InternalGo.g:1265:3: (otherlv_4= ',' ( (lv_parameter_5_0= RULE_ID ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==18) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGo.g:1266:4: otherlv_4= ',' ( (lv_parameter_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getDecFuncAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalGo.g:1270:4: ( (lv_parameter_5_0= RULE_ID ) )
            	    // InternalGo.g:1271:5: (lv_parameter_5_0= RULE_ID )
            	    {
            	    // InternalGo.g:1271:5: (lv_parameter_5_0= RULE_ID )
            	    // InternalGo.g:1272:6: lv_parameter_5_0= RULE_ID
            	    {
            	    lv_parameter_5_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
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
            	    break loop21;
                }
            } while (true);

            otherlv_6=(Token)match(input,31,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDecFuncAccess().getRightParenthesisKeyword_5());
              		
            }
            otherlv_7=(Token)match(input,21,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDecFuncAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalGo.g:1297:3: ( (lv_args_8_0= ruleGreeting ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_EOL && LA22_0<=RULE_INT)||(LA22_0>=41 && LA22_0<=42)||LA22_0==47||(LA22_0>=49 && LA22_0<=50)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGo.g:1298:4: (lv_args_8_0= ruleGreeting )
            	    {
            	    // InternalGo.g:1298:4: (lv_args_8_0= ruleGreeting )
            	    // InternalGo.g:1299:5: lv_args_8_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDecFuncAccess().getArgsGreetingParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_17);
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
            	    break loop22;
                }
            } while (true);

            otherlv_9=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:1324:1: entryRuleBREAK returns [String current=null] : iv_ruleBREAK= ruleBREAK EOF ;
    public final String entryRuleBREAK() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBREAK = null;


        try {
            // InternalGo.g:1324:45: (iv_ruleBREAK= ruleBREAK EOF )
            // InternalGo.g:1325:2: iv_ruleBREAK= ruleBREAK EOF
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
    // InternalGo.g:1331:1: ruleBREAK returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'break' ;
    public final AntlrDatatypeRuleToken ruleBREAK() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:1337:2: (kw= 'break' )
            // InternalGo.g:1338:2: kw= 'break'
            {
            kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:1346:1: entryRuleCASE returns [String current=null] : iv_ruleCASE= ruleCASE EOF ;
    public final String entryRuleCASE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCASE = null;


        try {
            // InternalGo.g:1346:44: (iv_ruleCASE= ruleCASE EOF )
            // InternalGo.g:1347:2: iv_ruleCASE= ruleCASE EOF
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
    // InternalGo.g:1353:1: ruleCASE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'case' ;
    public final AntlrDatatypeRuleToken ruleCASE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:1359:2: (kw= 'case' )
            // InternalGo.g:1360:2: kw= 'case'
            {
            kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:1368:1: entryRuleCHAN returns [String current=null] : iv_ruleCHAN= ruleCHAN EOF ;
    public final String entryRuleCHAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCHAN = null;


        try {
            // InternalGo.g:1368:44: (iv_ruleCHAN= ruleCHAN EOF )
            // InternalGo.g:1369:2: iv_ruleCHAN= ruleCHAN EOF
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
    // InternalGo.g:1375:1: ruleCHAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'chan' ;
    public final AntlrDatatypeRuleToken ruleCHAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:1381:2: (kw= 'chan' )
            // InternalGo.g:1382:2: kw= 'chan'
            {
            kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:1390:1: entryRuleCONST returns [String current=null] : iv_ruleCONST= ruleCONST EOF ;
    public final String entryRuleCONST() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCONST = null;


        try {
            // InternalGo.g:1390:45: (iv_ruleCONST= ruleCONST EOF )
            // InternalGo.g:1391:2: iv_ruleCONST= ruleCONST EOF
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
    // InternalGo.g:1397:1: ruleCONST returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'const' ;
    public final AntlrDatatypeRuleToken ruleCONST() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:1403:2: (kw= 'const' )
            // InternalGo.g:1404:2: kw= 'const'
            {
            kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:1412:1: entryRuleCONTINUE returns [String current=null] : iv_ruleCONTINUE= ruleCONTINUE EOF ;
    public final String entryRuleCONTINUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCONTINUE = null;


        try {
            // InternalGo.g:1412:48: (iv_ruleCONTINUE= ruleCONTINUE EOF )
            // InternalGo.g:1413:2: iv_ruleCONTINUE= ruleCONTINUE EOF
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
    // InternalGo.g:1419:1: ruleCONTINUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'continue' ;
    public final AntlrDatatypeRuleToken ruleCONTINUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:1425:2: (kw= 'continue' )
            // InternalGo.g:1426:2: kw= 'continue'
            {
            kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:1434:1: entryRuleELSE returns [String current=null] : iv_ruleELSE= ruleELSE EOF ;
    public final String entryRuleELSE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELSE = null;


        try {
            // InternalGo.g:1434:44: (iv_ruleELSE= ruleELSE EOF )
            // InternalGo.g:1435:2: iv_ruleELSE= ruleELSE EOF
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
    // InternalGo.g:1441:1: ruleELSE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'else' ;
    public final AntlrDatatypeRuleToken ruleELSE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:1447:2: (kw= 'else' )
            // InternalGo.g:1448:2: kw= 'else'
            {
            kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:1456:1: entryRuleFOR returns [String current=null] : iv_ruleFOR= ruleFOR EOF ;
    public final String entryRuleFOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFOR = null;


        try {
            // InternalGo.g:1456:43: (iv_ruleFOR= ruleFOR EOF )
            // InternalGo.g:1457:2: iv_ruleFOR= ruleFOR EOF
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
    // InternalGo.g:1463:1: ruleFOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'for' ;
    public final AntlrDatatypeRuleToken ruleFOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:1469:2: (kw= 'for' )
            // InternalGo.g:1470:2: kw= 'for'
            {
            kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:1478:1: entryRuleFUNC returns [String current=null] : iv_ruleFUNC= ruleFUNC EOF ;
    public final String entryRuleFUNC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFUNC = null;


        try {
            // InternalGo.g:1478:44: (iv_ruleFUNC= ruleFUNC EOF )
            // InternalGo.g:1479:2: iv_ruleFUNC= ruleFUNC EOF
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
    // InternalGo.g:1485:1: ruleFUNC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'func' ;
    public final AntlrDatatypeRuleToken ruleFUNC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:1491:2: (kw= 'func' )
            // InternalGo.g:1492:2: kw= 'func'
            {
            kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:1500:1: entryRuleIF returns [String current=null] : iv_ruleIF= ruleIF EOF ;
    public final String entryRuleIF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIF = null;


        try {
            // InternalGo.g:1500:42: (iv_ruleIF= ruleIF EOF )
            // InternalGo.g:1501:2: iv_ruleIF= ruleIF EOF
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
    // InternalGo.g:1507:1: ruleIF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'if' ;
    public final AntlrDatatypeRuleToken ruleIF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:1513:2: (kw= 'if' )
            // InternalGo.g:1514:2: kw= 'if'
            {
            kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:1522:1: entryRuleIMPORT returns [String current=null] : iv_ruleIMPORT= ruleIMPORT EOF ;
    public final String entryRuleIMPORT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIMPORT = null;


        try {
            // InternalGo.g:1522:46: (iv_ruleIMPORT= ruleIMPORT EOF )
            // InternalGo.g:1523:2: iv_ruleIMPORT= ruleIMPORT EOF
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
    // InternalGo.g:1529:1: ruleIMPORT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'import' ;
    public final AntlrDatatypeRuleToken ruleIMPORT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:1535:2: (kw= 'import' )
            // InternalGo.g:1536:2: kw= 'import'
            {
            kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:1544:1: entryRuleRETURN returns [String current=null] : iv_ruleRETURN= ruleRETURN EOF ;
    public final String entryRuleRETURN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRETURN = null;


        try {
            // InternalGo.g:1544:46: (iv_ruleRETURN= ruleRETURN EOF )
            // InternalGo.g:1545:2: iv_ruleRETURN= ruleRETURN EOF
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
    // InternalGo.g:1551:1: ruleRETURN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'return' ;
    public final AntlrDatatypeRuleToken ruleRETURN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:1557:2: (kw= 'return' )
            // InternalGo.g:1558:2: kw= 'return'
            {
            kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:1566:1: entryRulePACKAGE returns [String current=null] : iv_rulePACKAGE= rulePACKAGE EOF ;
    public final String entryRulePACKAGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePACKAGE = null;


        try {
            // InternalGo.g:1566:47: (iv_rulePACKAGE= rulePACKAGE EOF )
            // InternalGo.g:1567:2: iv_rulePACKAGE= rulePACKAGE EOF
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
    // InternalGo.g:1573:1: rulePACKAGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'package' ;
    public final AntlrDatatypeRuleToken rulePACKAGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:1579:2: (kw= 'package' )
            // InternalGo.g:1580:2: kw= 'package'
            {
            kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleTYPE"
    // InternalGo.g:1588:1: entryRuleTYPE returns [String current=null] : iv_ruleTYPE= ruleTYPE EOF ;
    public final String entryRuleTYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTYPE = null;


        try {
            // InternalGo.g:1588:44: (iv_ruleTYPE= ruleTYPE EOF )
            // InternalGo.g:1589:2: iv_ruleTYPE= ruleTYPE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTYPERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTYPE=ruleTYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTYPE.getText(); 
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
    // $ANTLR end "entryRuleTYPE"


    // $ANTLR start "ruleTYPE"
    // InternalGo.g:1595:1: ruleTYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'type' ;
    public final AntlrDatatypeRuleToken ruleTYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:1601:2: (kw= 'type' )
            // InternalGo.g:1602:2: kw= 'type'
            {
            kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getTYPEAccess().getTypeKeyword());
              	
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
    // $ANTLR end "ruleTYPE"


    // $ANTLR start "entryRuleVAR"
    // InternalGo.g:1610:1: entryRuleVAR returns [String current=null] : iv_ruleVAR= ruleVAR EOF ;
    public final String entryRuleVAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVAR = null;


        try {
            // InternalGo.g:1610:43: (iv_ruleVAR= ruleVAR EOF )
            // InternalGo.g:1611:2: iv_ruleVAR= ruleVAR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVARRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVAR=ruleVAR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVAR.getText(); 
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
    // $ANTLR end "entryRuleVAR"


    // $ANTLR start "ruleVAR"
    // InternalGo.g:1617:1: ruleVAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'var' ;
    public final AntlrDatatypeRuleToken ruleVAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:1623:2: (kw= 'var' )
            // InternalGo.g:1624:2: kw= 'var'
            {
            kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getVARAccess().getVarKeyword());
              	
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
    // $ANTLR end "ruleVAR"


    // $ANTLR start "entryRuleRANGE"
    // InternalGo.g:1632:1: entryRuleRANGE returns [String current=null] : iv_ruleRANGE= ruleRANGE EOF ;
    public final String entryRuleRANGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRANGE = null;


        try {
            // InternalGo.g:1632:45: (iv_ruleRANGE= ruleRANGE EOF )
            // InternalGo.g:1633:2: iv_ruleRANGE= ruleRANGE EOF
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
    // InternalGo.g:1639:1: ruleRANGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'range' ;
    public final AntlrDatatypeRuleToken ruleRANGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:1645:2: (kw= 'range' )
            // InternalGo.g:1646:2: kw= 'range'
            {
            kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:1654:1: entryRuleEntity returns [String current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final String entryRuleEntity() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEntity = null;


        try {
            // InternalGo.g:1654:46: (iv_ruleEntity= ruleEntity EOF )
            // InternalGo.g:1655:2: iv_ruleEntity= ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntity.getText(); 
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
    // InternalGo.g:1661:1: ruleEntity returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'print' kw= '(' (this_STRING_2= RULE_STRING | (this_INT_3= RULE_INT )+ ) kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleEntity() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_2=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalGo.g:1667:2: ( (kw= 'print' kw= '(' (this_STRING_2= RULE_STRING | (this_INT_3= RULE_INT )+ ) kw= ')' ) )
            // InternalGo.g:1668:2: (kw= 'print' kw= '(' (this_STRING_2= RULE_STRING | (this_INT_3= RULE_INT )+ ) kw= ')' )
            {
            // InternalGo.g:1668:2: (kw= 'print' kw= '(' (this_STRING_2= RULE_STRING | (this_INT_3= RULE_INT )+ ) kw= ')' )
            // InternalGo.g:1669:3: kw= 'print' kw= '(' (this_STRING_2= RULE_STRING | (this_INT_3= RULE_INT )+ ) kw= ')'
            {
            kw=(Token)match(input,49,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEntityAccess().getPrintKeyword_0());
              		
            }
            kw=(Token)match(input,30,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEntityAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGo.g:1679:3: (this_STRING_2= RULE_STRING | (this_INT_3= RULE_INT )+ )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_INT) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalGo.g:1680:4: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_STRING_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_STRING_2, grammarAccess.getEntityAccess().getSTRINGTerminalRuleCall_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1688:4: (this_INT_3= RULE_INT )+
                    {
                    // InternalGo.g:1688:4: (this_INT_3= RULE_INT )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_INT) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalGo.g:1689:5: this_INT_3= RULE_INT
                    	    {
                    	    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_27); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_INT_3);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_INT_3, grammarAccess.getEntityAccess().getINTTerminalRuleCall_2_1());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);


                    }
                    break;

            }

            kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEntityAccess().getRightParenthesisKeyword_3());
              		
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
    // InternalGo.g:1707:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalGo.g:1707:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalGo.g:1708:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalGo.g:1714:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGo.g:1720:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGo.g:1721:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGo.g:1721:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGo.g:1722:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
              		
            }
            // InternalGo.g:1726:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGo.g:1727:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGo.g:1727:4: (lv_name_1_0= RULE_ID )
            // InternalGo.g:1728:5: lv_name_1_0= RULE_ID
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

    // $ANTLR start synpred1_InternalGo
    public final void synpred1_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:635:4: ( ruleELSE )
        // InternalGo.g:635:5: ruleELSE
        {
        pushFollow(FOLLOW_2);
        ruleELSE();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalGo

    // $ANTLR start synpred2_InternalGo
    public final void synpred2_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:655:4: ( ruleELSE )
        // InternalGo.g:655:5: ruleELSE
        {
        pushFollow(FOLLOW_2);
        ruleELSE();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalGo

    // Delegated rules

    public final boolean synpred1_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0006860000000072L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000400000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0006860340000070L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0006860000400070L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000003E000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080040020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000040L});

}