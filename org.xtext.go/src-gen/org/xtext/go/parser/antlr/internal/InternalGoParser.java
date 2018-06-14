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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_ID", "RULE_COMMA", "RULE_OPEN_PARENTHESES", "RULE_CLOSED_PARENTHESES", "RULE_OPEN_BRACKETS", "RULE_INT", "RULE_CLOSED_BRACKETS", "RULE_OPEN_KEY", "RULE_CLOSED_KEY", "RULE_STRING", "RULE_PLUSEQUALS", "RULE_MINUSEQUALS", "RULE_PLUS", "RULE_MINUS", "RULE_ASTERICS", "RULE_BAR", "RULE_DOT", "RULE_PLUSONE", "RULE_MINUSONE", "RULE_PONTOVIRGULA", "RULE_NEWLINE", "RULE_COMMENTS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "':='", "'||'", "'&&'", "'<'", "'<='", "'=='", "'>='", "'>'", "'string'", "'int'", "'bool'", "'byte'", "'rune'", "'float32'", "'float64'", "'true'", "'false'", "'break'", "'case'", "'chan'", "'const'", "'continue'", "'else'", "'for'", "'func'", "'if'", "'import'", "'return'", "'package'", "'type'", "'var'", "'range'", "'datatype'"
    };
    public static final int RULE_MINUSONE=23;
    public static final int T__50=50;
    public static final int RULE_OPEN_KEY=12;
    public static final int RULE_OPEN_PARENTHESES=7;
    public static final int RULE_BAR=20;
    public static final int RULE_COMMENTS=26;
    public static final int T__59=59;
    public static final int RULE_CLOSED_PARENTHESES=8;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_EOL=4;
    public static final int RULE_COMMA=6;
    public static final int RULE_PLUSONE=22;
    public static final int RULE_INT=10;
    public static final int RULE_ML_COMMENT=27;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int RULE_PONTOVIRGULA=24;
    public static final int RULE_NEWLINE=25;
    public static final int RULE_ASTERICS=19;
    public static final int RULE_STRING=14;
    public static final int RULE_MINUSEQUALS=16;
    public static final int RULE_SL_COMMENT=28;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_OPEN_BRACKETS=9;
    public static final int RULE_PLUS=17;
    public static final int T__36=36;
    public static final int RULE_DOT=21;
    public static final int EOF=-1;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=29;
    public static final int RULE_PLUSEQUALS=15;
    public static final int RULE_CLOSED_KEY=13;
    public static final int RULE_ANY_OTHER=30;
    public static final int RULE_MINUS=18;
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
    public static final int RULE_CLOSED_BRACKETS=11;

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

                if ( ((LA1_0>=RULE_EOL && LA1_0<=RULE_ID)||LA1_0==RULE_OPEN_PARENTHESES||LA1_0==RULE_INT||LA1_0==52||(LA1_0>=55 && LA1_0<=58)||LA1_0==62||LA1_0==64) ) {
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
    // InternalGo.g:107:1: ruleGreeting returns [EObject current=null] : (this_MultDecVars_0= ruleMultDecVars | this_DecVar_1= ruleDecVar | this_DataType_2= ruleDataType | this_DecFunc_3= ruleDecFunc | this_EOL_4= RULE_EOL | this_Condition_5= ruleCondition | this_Operations_6= ruleOperations | ruleDecImport | this_CallFunc_8= ruleCallFunc | this_CallFor_9= ruleCallFor ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token this_EOL_4=null;
        EObject this_MultDecVars_0 = null;

        EObject this_DecVar_1 = null;

        EObject this_DataType_2 = null;

        EObject this_DecFunc_3 = null;

        EObject this_Condition_5 = null;

        EObject this_Operations_6 = null;

        EObject this_CallFunc_8 = null;

        EObject this_CallFor_9 = null;



        	enterRule();

        try {
            // InternalGo.g:113:2: ( (this_MultDecVars_0= ruleMultDecVars | this_DecVar_1= ruleDecVar | this_DataType_2= ruleDataType | this_DecFunc_3= ruleDecFunc | this_EOL_4= RULE_EOL | this_Condition_5= ruleCondition | this_Operations_6= ruleOperations | ruleDecImport | this_CallFunc_8= ruleCallFunc | this_CallFor_9= ruleCallFor ) )
            // InternalGo.g:114:2: (this_MultDecVars_0= ruleMultDecVars | this_DecVar_1= ruleDecVar | this_DataType_2= ruleDataType | this_DecFunc_3= ruleDecFunc | this_EOL_4= RULE_EOL | this_Condition_5= ruleCondition | this_Operations_6= ruleOperations | ruleDecImport | this_CallFunc_8= ruleCallFunc | this_CallFor_9= ruleCallFor )
            {
            // InternalGo.g:114:2: (this_MultDecVars_0= ruleMultDecVars | this_DecVar_1= ruleDecVar | this_DataType_2= ruleDataType | this_DecFunc_3= ruleDecFunc | this_EOL_4= RULE_EOL | this_Condition_5= ruleCondition | this_Operations_6= ruleOperations | ruleDecImport | this_CallFunc_8= ruleCallFunc | this_CallFor_9= ruleCallFor )
            int alt2=10;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalGo.g:115:3: this_MultDecVars_0= ruleMultDecVars
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGreetingAccess().getMultDecVarsParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MultDecVars_0=ruleMultDecVars();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MultDecVars_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:124:3: this_DecVar_1= ruleDecVar
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGreetingAccess().getDecVarParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DecVar_1=ruleDecVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DecVar_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:133:3: this_DataType_2= ruleDataType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGreetingAccess().getDataTypeParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DataType_2=ruleDataType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DataType_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:142:3: this_DecFunc_3= ruleDecFunc
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
                    // InternalGo.g:151:3: this_EOL_4= RULE_EOL
                    {
                    this_EOL_4=(Token)match(input,RULE_EOL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_EOL_4, grammarAccess.getGreetingAccess().getEOLTerminalRuleCall_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGo.g:156:3: this_Condition_5= ruleCondition
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
                    // InternalGo.g:165:3: this_Operations_6= ruleOperations
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
                case 8 :
                    // InternalGo.g:174:3: ruleDecImport
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGreetingAccess().getDecImportParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    ruleDecImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalGo.g:182:3: this_CallFunc_8= ruleCallFunc
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGreetingAccess().getCallFuncParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CallFunc_8=ruleCallFunc();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CallFunc_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalGo.g:191:3: this_CallFor_9= ruleCallFor
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGreetingAccess().getCallForParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CallFor_9=ruleCallFor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CallFor_9;
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
    // InternalGo.g:203:1: entryRuleDecVar returns [EObject current=null] : iv_ruleDecVar= ruleDecVar EOF ;
    public final EObject entryRuleDecVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecVar = null;


        try {
            // InternalGo.g:203:47: (iv_ruleDecVar= ruleDecVar EOF )
            // InternalGo.g:204:2: iv_ruleDecVar= ruleDecVar EOF
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
    // InternalGo.g:210:1: ruleDecVar returns [EObject current=null] : (this_DecVars_0= ruleDecVars | ( ruleModif ( (lv_vars_2_0= RULE_ID ) ) (this_Comma_3= RULE_COMMA ( (lv_vars_4_0= RULE_ID ) ) )* ruleTypes (otherlv_6= '=' ( ( (lv_atrb_7_1= ruleAtri | lv_atrb_7_2= RULE_ID ) ) ) (this_Comma_8= RULE_COMMA ( ( (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID ) ) ) )* )? ) ) ;
    public final EObject ruleDecVar() throws RecognitionException {
        EObject current = null;

        Token lv_vars_2_0=null;
        Token this_Comma_3=null;
        Token lv_vars_4_0=null;
        Token otherlv_6=null;
        Token lv_atrb_7_2=null;
        Token this_Comma_8=null;
        Token lv_atrb_9_2=null;
        EObject this_DecVars_0 = null;

        AntlrDatatypeRuleToken lv_atrb_7_1 = null;

        AntlrDatatypeRuleToken lv_atrb_9_1 = null;



        	enterRule();

        try {
            // InternalGo.g:216:2: ( (this_DecVars_0= ruleDecVars | ( ruleModif ( (lv_vars_2_0= RULE_ID ) ) (this_Comma_3= RULE_COMMA ( (lv_vars_4_0= RULE_ID ) ) )* ruleTypes (otherlv_6= '=' ( ( (lv_atrb_7_1= ruleAtri | lv_atrb_7_2= RULE_ID ) ) ) (this_Comma_8= RULE_COMMA ( ( (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID ) ) ) )* )? ) ) )
            // InternalGo.g:217:2: (this_DecVars_0= ruleDecVars | ( ruleModif ( (lv_vars_2_0= RULE_ID ) ) (this_Comma_3= RULE_COMMA ( (lv_vars_4_0= RULE_ID ) ) )* ruleTypes (otherlv_6= '=' ( ( (lv_atrb_7_1= ruleAtri | lv_atrb_7_2= RULE_ID ) ) ) (this_Comma_8= RULE_COMMA ( ( (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID ) ) ) )* )? ) )
            {
            // InternalGo.g:217:2: (this_DecVars_0= ruleDecVars | ( ruleModif ( (lv_vars_2_0= RULE_ID ) ) (this_Comma_3= RULE_COMMA ( (lv_vars_4_0= RULE_ID ) ) )* ruleTypes (otherlv_6= '=' ( ( (lv_atrb_7_1= ruleAtri | lv_atrb_7_2= RULE_ID ) ) ) (this_Comma_8= RULE_COMMA ( ( (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID ) ) ) )* )? ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==52||LA8_0==62) ) {
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
                    // InternalGo.g:218:3: this_DecVars_0= ruleDecVars
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
                    // InternalGo.g:227:3: ( ruleModif ( (lv_vars_2_0= RULE_ID ) ) (this_Comma_3= RULE_COMMA ( (lv_vars_4_0= RULE_ID ) ) )* ruleTypes (otherlv_6= '=' ( ( (lv_atrb_7_1= ruleAtri | lv_atrb_7_2= RULE_ID ) ) ) (this_Comma_8= RULE_COMMA ( ( (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID ) ) ) )* )? )
                    {
                    // InternalGo.g:227:3: ( ruleModif ( (lv_vars_2_0= RULE_ID ) ) (this_Comma_3= RULE_COMMA ( (lv_vars_4_0= RULE_ID ) ) )* ruleTypes (otherlv_6= '=' ( ( (lv_atrb_7_1= ruleAtri | lv_atrb_7_2= RULE_ID ) ) ) (this_Comma_8= RULE_COMMA ( ( (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID ) ) ) )* )? )
                    // InternalGo.g:228:4: ruleModif ( (lv_vars_2_0= RULE_ID ) ) (this_Comma_3= RULE_COMMA ( (lv_vars_4_0= RULE_ID ) ) )* ruleTypes (otherlv_6= '=' ( ( (lv_atrb_7_1= ruleAtri | lv_atrb_7_2= RULE_ID ) ) ) (this_Comma_8= RULE_COMMA ( ( (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID ) ) ) )* )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDecVarAccess().getModifParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    ruleModif();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:235:4: ( (lv_vars_2_0= RULE_ID ) )
                    // InternalGo.g:236:5: (lv_vars_2_0= RULE_ID )
                    {
                    // InternalGo.g:236:5: (lv_vars_2_0= RULE_ID )
                    // InternalGo.g:237:6: lv_vars_2_0= RULE_ID
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

                    // InternalGo.g:253:4: (this_Comma_3= RULE_COMMA ( (lv_vars_4_0= RULE_ID ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_COMMA) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalGo.g:254:5: this_Comma_3= RULE_COMMA ( (lv_vars_4_0= RULE_ID ) )
                    	    {
                    	    this_Comma_3=(Token)match(input,RULE_COMMA,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_Comma_3, grammarAccess.getDecVarAccess().getCommaTerminalRuleCall_1_2_0());
                    	      				
                    	    }
                    	    // InternalGo.g:258:5: ( (lv_vars_4_0= RULE_ID ) )
                    	    // InternalGo.g:259:6: (lv_vars_4_0= RULE_ID )
                    	    {
                    	    // InternalGo.g:259:6: (lv_vars_4_0= RULE_ID )
                    	    // InternalGo.g:260:7: lv_vars_4_0= RULE_ID
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

                      				newCompositeNode(grammarAccess.getDecVarAccess().getTypesParserRuleCall_1_3());
                      			
                    }
                    pushFollow(FOLLOW_6);
                    ruleTypes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:284:4: (otherlv_6= '=' ( ( (lv_atrb_7_1= ruleAtri | lv_atrb_7_2= RULE_ID ) ) ) (this_Comma_8= RULE_COMMA ( ( (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID ) ) ) )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==31) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalGo.g:285:5: otherlv_6= '=' ( ( (lv_atrb_7_1= ruleAtri | lv_atrb_7_2= RULE_ID ) ) ) (this_Comma_8= RULE_COMMA ( ( (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID ) ) ) )*
                            {
                            otherlv_6=(Token)match(input,31,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getDecVarAccess().getEqualsSignKeyword_1_4_0());
                              				
                            }
                            // InternalGo.g:289:5: ( ( (lv_atrb_7_1= ruleAtri | lv_atrb_7_2= RULE_ID ) ) )
                            // InternalGo.g:290:6: ( (lv_atrb_7_1= ruleAtri | lv_atrb_7_2= RULE_ID ) )
                            {
                            // InternalGo.g:290:6: ( (lv_atrb_7_1= ruleAtri | lv_atrb_7_2= RULE_ID ) )
                            // InternalGo.g:291:7: (lv_atrb_7_1= ruleAtri | lv_atrb_7_2= RULE_ID )
                            {
                            // InternalGo.g:291:7: (lv_atrb_7_1= ruleAtri | lv_atrb_7_2= RULE_ID )
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( ((LA4_0>=RULE_OPEN_BRACKETS && LA4_0<=RULE_INT)||LA4_0==RULE_STRING||(LA4_0>=47 && LA4_0<=48)) ) {
                                alt4=1;
                            }
                            else if ( (LA4_0==RULE_ID) ) {
                                alt4=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 0, input);

                                throw nvae;
                            }
                            switch (alt4) {
                                case 1 :
                                    // InternalGo.g:292:8: lv_atrb_7_1= ruleAtri
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getDecVarAccess().getAtrbAtriParserRuleCall_1_4_1_0_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_8);
                                    lv_atrb_7_1=ruleAtri();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getDecVarRule());
                                      								}
                                      								add(
                                      									current,
                                      									"atrb",
                                      									lv_atrb_7_1,
                                      									"org.xtext.go.Go.Atri");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }
                                    break;
                                case 2 :
                                    // InternalGo.g:308:8: lv_atrb_7_2= RULE_ID
                                    {
                                    lv_atrb_7_2=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(lv_atrb_7_2, grammarAccess.getDecVarAccess().getAtrbIDTerminalRuleCall_1_4_1_0_1());
                                      							
                                    }
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElement(grammarAccess.getDecVarRule());
                                      								}
                                      								addWithLastConsumed(
                                      									current,
                                      									"atrb",
                                      									lv_atrb_7_2,
                                      									"org.eclipse.xtext.common.Terminals.ID");
                                      							
                                    }

                                    }
                                    break;

                            }


                            }


                            }

                            // InternalGo.g:325:5: (this_Comma_8= RULE_COMMA ( ( (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID ) ) ) )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( (LA6_0==RULE_COMMA) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // InternalGo.g:326:6: this_Comma_8= RULE_COMMA ( ( (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID ) ) )
                            	    {
                            	    this_Comma_8=(Token)match(input,RULE_COMMA,FOLLOW_7); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(this_Comma_8, grammarAccess.getDecVarAccess().getCommaTerminalRuleCall_1_4_2_0());
                            	      					
                            	    }
                            	    // InternalGo.g:330:6: ( ( (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID ) ) )
                            	    // InternalGo.g:331:7: ( (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID ) )
                            	    {
                            	    // InternalGo.g:331:7: ( (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID ) )
                            	    // InternalGo.g:332:8: (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID )
                            	    {
                            	    // InternalGo.g:332:8: (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID )
                            	    int alt5=2;
                            	    int LA5_0 = input.LA(1);

                            	    if ( ((LA5_0>=RULE_OPEN_BRACKETS && LA5_0<=RULE_INT)||LA5_0==RULE_STRING||(LA5_0>=47 && LA5_0<=48)) ) {
                            	        alt5=1;
                            	    }
                            	    else if ( (LA5_0==RULE_ID) ) {
                            	        alt5=2;
                            	    }
                            	    else {
                            	        if (state.backtracking>0) {state.failed=true; return current;}
                            	        NoViableAltException nvae =
                            	            new NoViableAltException("", 5, 0, input);

                            	        throw nvae;
                            	    }
                            	    switch (alt5) {
                            	        case 1 :
                            	            // InternalGo.g:333:9: lv_atrb_9_1= ruleAtri
                            	            {
                            	            if ( state.backtracking==0 ) {

                            	              									newCompositeNode(grammarAccess.getDecVarAccess().getAtrbAtriParserRuleCall_1_4_2_1_0_0());
                            	              								
                            	            }
                            	            pushFollow(FOLLOW_8);
                            	            lv_atrb_9_1=ruleAtri();

                            	            state._fsp--;
                            	            if (state.failed) return current;
                            	            if ( state.backtracking==0 ) {

                            	              									if (current==null) {
                            	              										current = createModelElementForParent(grammarAccess.getDecVarRule());
                            	              									}
                            	              									add(
                            	              										current,
                            	              										"atrb",
                            	              										lv_atrb_9_1,
                            	              										"org.xtext.go.Go.Atri");
                            	              									afterParserOrEnumRuleCall();
                            	              								
                            	            }

                            	            }
                            	            break;
                            	        case 2 :
                            	            // InternalGo.g:349:9: lv_atrb_9_2= RULE_ID
                            	            {
                            	            lv_atrb_9_2=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
                            	            if ( state.backtracking==0 ) {

                            	              									newLeafNode(lv_atrb_9_2, grammarAccess.getDecVarAccess().getAtrbIDTerminalRuleCall_1_4_2_1_0_1());
                            	              								
                            	            }
                            	            if ( state.backtracking==0 ) {

                            	              									if (current==null) {
                            	              										current = createModelElement(grammarAccess.getDecVarRule());
                            	              									}
                            	              									addWithLastConsumed(
                            	              										current,
                            	              										"atrb",
                            	              										lv_atrb_9_2,
                            	              										"org.eclipse.xtext.common.Terminals.ID");
                            	              								
                            	            }

                            	            }
                            	            break;

                            	    }


                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop6;
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


    // $ANTLR start "entryRuleMultDecVars"
    // InternalGo.g:373:1: entryRuleMultDecVars returns [EObject current=null] : iv_ruleMultDecVars= ruleMultDecVars EOF ;
    public final EObject entryRuleMultDecVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultDecVars = null;


        try {
            // InternalGo.g:373:52: (iv_ruleMultDecVars= ruleMultDecVars EOF )
            // InternalGo.g:374:2: iv_ruleMultDecVars= ruleMultDecVars EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultDecVarsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultDecVars=ruleMultDecVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultDecVars; 
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
    // $ANTLR end "entryRuleMultDecVars"


    // $ANTLR start "ruleMultDecVars"
    // InternalGo.g:380:1: ruleMultDecVars returns [EObject current=null] : ( ruleModif this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( ruleTypeValue | ( (lv_value_5_0= RULE_ID ) ) ) )* this_Closed_parentheses_6= RULE_CLOSED_PARENTHESES ) ;
    public final EObject ruleMultDecVars() throws RecognitionException {
        EObject current = null;

        Token this_Open_parentheses_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_value_5_0=null;
        Token this_Closed_parentheses_6=null;


        	enterRule();

        try {
            // InternalGo.g:386:2: ( ( ruleModif this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( ruleTypeValue | ( (lv_value_5_0= RULE_ID ) ) ) )* this_Closed_parentheses_6= RULE_CLOSED_PARENTHESES ) )
            // InternalGo.g:387:2: ( ruleModif this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( ruleTypeValue | ( (lv_value_5_0= RULE_ID ) ) ) )* this_Closed_parentheses_6= RULE_CLOSED_PARENTHESES )
            {
            // InternalGo.g:387:2: ( ruleModif this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( ruleTypeValue | ( (lv_value_5_0= RULE_ID ) ) ) )* this_Closed_parentheses_6= RULE_CLOSED_PARENTHESES )
            // InternalGo.g:388:3: ruleModif this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( ruleTypeValue | ( (lv_value_5_0= RULE_ID ) ) ) )* this_Closed_parentheses_6= RULE_CLOSED_PARENTHESES
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultDecVarsAccess().getModifParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            ruleModif();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_Open_parentheses_1=(Token)match(input,RULE_OPEN_PARENTHESES,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Open_parentheses_1, grammarAccess.getMultDecVarsAccess().getOpen_parenthesesTerminalRuleCall_1());
              		
            }
            // InternalGo.g:399:3: ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( ruleTypeValue | ( (lv_value_5_0= RULE_ID ) ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGo.g:400:4: ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( ruleTypeValue | ( (lv_value_5_0= RULE_ID ) ) )
            	    {
            	    // InternalGo.g:400:4: ( (lv_name_2_0= RULE_ID ) )
            	    // InternalGo.g:401:5: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalGo.g:401:5: (lv_name_2_0= RULE_ID )
            	    // InternalGo.g:402:6: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_name_2_0, grammarAccess.getMultDecVarsAccess().getNameIDTerminalRuleCall_2_0_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getMultDecVarsRule());
            	      						}
            	      						setWithLastConsumed(
            	      							current,
            	      							"name",
            	      							lv_name_2_0,
            	      							"org.eclipse.xtext.common.Terminals.ID");
            	      					
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,31,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getMultDecVarsAccess().getEqualsSignKeyword_2_1());
            	      			
            	    }
            	    // InternalGo.g:422:4: ( ruleTypeValue | ( (lv_value_5_0= RULE_ID ) ) )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==RULE_INT||LA9_0==RULE_STRING||(LA9_0>=47 && LA9_0<=48)) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==RULE_ID) ) {
            	        alt9=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalGo.g:423:5: ruleTypeValue
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getMultDecVarsAccess().getTypeValueParserRuleCall_2_2_0());
            	              				
            	            }
            	            pushFollow(FOLLOW_10);
            	            ruleTypeValue();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalGo.g:431:5: ( (lv_value_5_0= RULE_ID ) )
            	            {
            	            // InternalGo.g:431:5: ( (lv_value_5_0= RULE_ID ) )
            	            // InternalGo.g:432:6: (lv_value_5_0= RULE_ID )
            	            {
            	            // InternalGo.g:432:6: (lv_value_5_0= RULE_ID )
            	            // InternalGo.g:433:7: lv_value_5_0= RULE_ID
            	            {
            	            lv_value_5_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_value_5_0, grammarAccess.getMultDecVarsAccess().getValueIDTerminalRuleCall_2_2_1_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getMultDecVarsRule());
            	              							}
            	              							setWithLastConsumed(
            	              								current,
            	              								"value",
            	              								lv_value_5_0,
            	              								"org.eclipse.xtext.common.Terminals.ID");
            	              						
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            this_Closed_parentheses_6=(Token)match(input,RULE_CLOSED_PARENTHESES,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Closed_parentheses_6, grammarAccess.getMultDecVarsAccess().getClosed_parenthesesTerminalRuleCall_3());
              		
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
    // $ANTLR end "ruleMultDecVars"


    // $ANTLR start "entryRuleDecVars"
    // InternalGo.g:459:1: entryRuleDecVars returns [EObject current=null] : iv_ruleDecVars= ruleDecVars EOF ;
    public final EObject entryRuleDecVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecVars = null;


        try {
            // InternalGo.g:459:48: (iv_ruleDecVars= ruleDecVars EOF )
            // InternalGo.g:460:2: iv_ruleDecVars= ruleDecVars EOF
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
    // InternalGo.g:466:1: ruleDecVars returns [EObject current=null] : ( ( (lv_vars_0_0= RULE_ID ) ) (this_Comma_1= RULE_COMMA ( (lv_vars_2_0= RULE_ID ) ) )* otherlv_3= ':=' ( ( (lv_atrb_4_1= ruleAtri | lv_atrb_4_2= RULE_ID ) ) ) (this_Comma_5= RULE_COMMA ( ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) ) ) )* ) ;
    public final EObject ruleDecVars() throws RecognitionException {
        EObject current = null;

        Token lv_vars_0_0=null;
        Token this_Comma_1=null;
        Token lv_vars_2_0=null;
        Token otherlv_3=null;
        Token lv_atrb_4_2=null;
        Token this_Comma_5=null;
        Token lv_atrb_6_2=null;
        AntlrDatatypeRuleToken lv_atrb_4_1 = null;

        AntlrDatatypeRuleToken lv_atrb_6_1 = null;



        	enterRule();

        try {
            // InternalGo.g:472:2: ( ( ( (lv_vars_0_0= RULE_ID ) ) (this_Comma_1= RULE_COMMA ( (lv_vars_2_0= RULE_ID ) ) )* otherlv_3= ':=' ( ( (lv_atrb_4_1= ruleAtri | lv_atrb_4_2= RULE_ID ) ) ) (this_Comma_5= RULE_COMMA ( ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) ) ) )* ) )
            // InternalGo.g:473:2: ( ( (lv_vars_0_0= RULE_ID ) ) (this_Comma_1= RULE_COMMA ( (lv_vars_2_0= RULE_ID ) ) )* otherlv_3= ':=' ( ( (lv_atrb_4_1= ruleAtri | lv_atrb_4_2= RULE_ID ) ) ) (this_Comma_5= RULE_COMMA ( ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) ) ) )* )
            {
            // InternalGo.g:473:2: ( ( (lv_vars_0_0= RULE_ID ) ) (this_Comma_1= RULE_COMMA ( (lv_vars_2_0= RULE_ID ) ) )* otherlv_3= ':=' ( ( (lv_atrb_4_1= ruleAtri | lv_atrb_4_2= RULE_ID ) ) ) (this_Comma_5= RULE_COMMA ( ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) ) ) )* )
            // InternalGo.g:474:3: ( (lv_vars_0_0= RULE_ID ) ) (this_Comma_1= RULE_COMMA ( (lv_vars_2_0= RULE_ID ) ) )* otherlv_3= ':=' ( ( (lv_atrb_4_1= ruleAtri | lv_atrb_4_2= RULE_ID ) ) ) (this_Comma_5= RULE_COMMA ( ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) ) ) )*
            {
            // InternalGo.g:474:3: ( (lv_vars_0_0= RULE_ID ) )
            // InternalGo.g:475:4: (lv_vars_0_0= RULE_ID )
            {
            // InternalGo.g:475:4: (lv_vars_0_0= RULE_ID )
            // InternalGo.g:476:5: lv_vars_0_0= RULE_ID
            {
            lv_vars_0_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
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

            // InternalGo.g:492:3: (this_Comma_1= RULE_COMMA ( (lv_vars_2_0= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGo.g:493:4: this_Comma_1= RULE_COMMA ( (lv_vars_2_0= RULE_ID ) )
            	    {
            	    this_Comma_1=(Token)match(input,RULE_COMMA,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_Comma_1, grammarAccess.getDecVarsAccess().getCommaTerminalRuleCall_1_0());
            	      			
            	    }
            	    // InternalGo.g:497:4: ( (lv_vars_2_0= RULE_ID ) )
            	    // InternalGo.g:498:5: (lv_vars_2_0= RULE_ID )
            	    {
            	    // InternalGo.g:498:5: (lv_vars_2_0= RULE_ID )
            	    // InternalGo.g:499:6: lv_vars_2_0= RULE_ID
            	    {
            	    lv_vars_2_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
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
            	    break loop11;
                }
            } while (true);

            otherlv_3=(Token)match(input,32,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDecVarsAccess().getColonEqualsSignKeyword_2());
              		
            }
            // InternalGo.g:520:3: ( ( (lv_atrb_4_1= ruleAtri | lv_atrb_4_2= RULE_ID ) ) )
            // InternalGo.g:521:4: ( (lv_atrb_4_1= ruleAtri | lv_atrb_4_2= RULE_ID ) )
            {
            // InternalGo.g:521:4: ( (lv_atrb_4_1= ruleAtri | lv_atrb_4_2= RULE_ID ) )
            // InternalGo.g:522:5: (lv_atrb_4_1= ruleAtri | lv_atrb_4_2= RULE_ID )
            {
            // InternalGo.g:522:5: (lv_atrb_4_1= ruleAtri | lv_atrb_4_2= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_OPEN_BRACKETS && LA12_0<=RULE_INT)||LA12_0==RULE_STRING||(LA12_0>=47 && LA12_0<=48)) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalGo.g:523:6: lv_atrb_4_1= ruleAtri
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDecVarsAccess().getAtrbAtriParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
                    lv_atrb_4_1=ruleAtri();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDecVarsRule());
                      						}
                      						add(
                      							current,
                      							"atrb",
                      							lv_atrb_4_1,
                      							"org.xtext.go.Go.Atri");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:539:6: lv_atrb_4_2= RULE_ID
                    {
                    lv_atrb_4_2=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_atrb_4_2, grammarAccess.getDecVarsAccess().getAtrbIDTerminalRuleCall_3_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDecVarsRule());
                      						}
                      						addWithLastConsumed(
                      							current,
                      							"atrb",
                      							lv_atrb_4_2,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalGo.g:556:3: (this_Comma_5= RULE_COMMA ( ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COMMA) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGo.g:557:4: this_Comma_5= RULE_COMMA ( ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) ) )
            	    {
            	    this_Comma_5=(Token)match(input,RULE_COMMA,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_Comma_5, grammarAccess.getDecVarsAccess().getCommaTerminalRuleCall_4_0());
            	      			
            	    }
            	    // InternalGo.g:561:4: ( ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) ) )
            	    // InternalGo.g:562:5: ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) )
            	    {
            	    // InternalGo.g:562:5: ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) )
            	    // InternalGo.g:563:6: (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID )
            	    {
            	    // InternalGo.g:563:6: (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( ((LA13_0>=RULE_OPEN_BRACKETS && LA13_0<=RULE_INT)||LA13_0==RULE_STRING||(LA13_0>=47 && LA13_0<=48)) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==RULE_ID) ) {
            	        alt13=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalGo.g:564:7: lv_atrb_6_1= ruleAtri
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getDecVarsAccess().getAtrbAtriParserRuleCall_4_1_0_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_atrb_6_1=ruleAtri();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getDecVarsRule());
            	              							}
            	              							add(
            	              								current,
            	              								"atrb",
            	              								lv_atrb_6_1,
            	              								"org.xtext.go.Go.Atri");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalGo.g:580:7: lv_atrb_6_2= RULE_ID
            	            {
            	            lv_atrb_6_2=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_atrb_6_2, grammarAccess.getDecVarsAccess().getAtrbIDTerminalRuleCall_4_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getDecVarsRule());
            	              							}
            	              							addWithLastConsumed(
            	              								current,
            	              								"atrb",
            	              								lv_atrb_6_2,
            	              								"org.eclipse.xtext.common.Terminals.ID");
            	              						
            	            }

            	            }
            	            break;

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
    // $ANTLR end "ruleDecVars"


    // $ANTLR start "entryRuleAtri"
    // InternalGo.g:602:1: entryRuleAtri returns [String current=null] : iv_ruleAtri= ruleAtri EOF ;
    public final String entryRuleAtri() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAtri = null;


        try {
            // InternalGo.g:602:44: (iv_ruleAtri= ruleAtri EOF )
            // InternalGo.g:603:2: iv_ruleAtri= ruleAtri EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtriRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtri=ruleAtri();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtri.getText(); 
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
    // $ANTLR end "entryRuleAtri"


    // $ANTLR start "ruleAtri"
    // InternalGo.g:609:1: ruleAtri returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS this_Types_3= ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? ) | this_TypeValue_7= ruleTypeValue ) ;
    public final AntlrDatatypeRuleToken ruleAtri() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_Open_brackets_0=null;
        Token this_INT_1=null;
        Token this_Closed_brackets_2=null;
        Token this_Open_Key_4=null;
        Token this_Closed_Key_6=null;
        AntlrDatatypeRuleToken this_Types_3 = null;

        AntlrDatatypeRuleToken this_TypeValue_5 = null;

        AntlrDatatypeRuleToken this_TypeValue_7 = null;



        	enterRule();

        try {
            // InternalGo.g:615:2: ( ( (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS this_Types_3= ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? ) | this_TypeValue_7= ruleTypeValue ) )
            // InternalGo.g:616:2: ( (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS this_Types_3= ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? ) | this_TypeValue_7= ruleTypeValue )
            {
            // InternalGo.g:616:2: ( (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS this_Types_3= ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? ) | this_TypeValue_7= ruleTypeValue )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_OPEN_BRACKETS) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_INT||LA17_0==RULE_STRING||(LA17_0>=47 && LA17_0<=48)) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalGo.g:617:3: (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS this_Types_3= ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? )
                    {
                    // InternalGo.g:617:3: (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS this_Types_3= ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? )
                    // InternalGo.g:618:4: this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS this_Types_3= ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )?
                    {
                    this_Open_brackets_0=(Token)match(input,RULE_OPEN_BRACKETS,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Open_brackets_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Open_brackets_0, grammarAccess.getAtriAccess().getOpen_bracketsTerminalRuleCall_0_0());
                      			
                    }
                    // InternalGo.g:625:4: (this_INT_1= RULE_INT )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_INT) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalGo.g:626:5: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_INT_1);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_INT_1, grammarAccess.getAtriAccess().getINTTerminalRuleCall_0_1());
                              				
                            }

                            }
                            break;

                    }

                    this_Closed_brackets_2=(Token)match(input,RULE_CLOSED_BRACKETS,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Closed_brackets_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Closed_brackets_2, grammarAccess.getAtriAccess().getClosed_bracketsTerminalRuleCall_0_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAtriAccess().getTypesParserRuleCall_0_3());
                      			
                    }
                    pushFollow(FOLLOW_15);
                    this_Types_3=ruleTypes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Types_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:651:4: (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_OPEN_KEY) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalGo.g:652:5: this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY
                            {
                            this_Open_Key_4=(Token)match(input,RULE_OPEN_KEY,FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_Open_Key_4);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_Open_Key_4, grammarAccess.getAtriAccess().getOpen_KeyTerminalRuleCall_0_4_0());
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getAtriAccess().getTypeValueParserRuleCall_0_4_1());
                              				
                            }
                            pushFollow(FOLLOW_17);
                            this_TypeValue_5=ruleTypeValue();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_TypeValue_5);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }
                            this_Closed_Key_6=(Token)match(input,RULE_CLOSED_KEY,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_Closed_Key_6);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_Closed_Key_6, grammarAccess.getAtriAccess().getClosed_KeyTerminalRuleCall_0_4_2());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:679:3: this_TypeValue_7= ruleTypeValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtriAccess().getTypeValueParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeValue_7=ruleTypeValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_TypeValue_7);
                      		
                    }
                    if ( state.backtracking==0 ) {

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
    // $ANTLR end "ruleAtri"


    // $ANTLR start "entryRuleParams"
    // InternalGo.g:693:1: entryRuleParams returns [EObject current=null] : iv_ruleParams= ruleParams EOF ;
    public final EObject entryRuleParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParams = null;


        try {
            // InternalGo.g:693:47: (iv_ruleParams= ruleParams EOF )
            // InternalGo.g:694:2: iv_ruleParams= ruleParams EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParams=ruleParams();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParams; 
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
    // $ANTLR end "entryRuleParams"


    // $ANTLR start "ruleParams"
    // InternalGo.g:700:1: ruleParams returns [EObject current=null] : ( ( (lv_params_0_0= RULE_ID ) ) ruleTypes (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ruleTypes )* ) ;
    public final EObject ruleParams() throws RecognitionException {
        EObject current = null;

        Token lv_params_0_0=null;
        Token this_Comma_2=null;
        Token lv_params_3_0=null;


        	enterRule();

        try {
            // InternalGo.g:706:2: ( ( ( (lv_params_0_0= RULE_ID ) ) ruleTypes (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ruleTypes )* ) )
            // InternalGo.g:707:2: ( ( (lv_params_0_0= RULE_ID ) ) ruleTypes (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ruleTypes )* )
            {
            // InternalGo.g:707:2: ( ( (lv_params_0_0= RULE_ID ) ) ruleTypes (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ruleTypes )* )
            // InternalGo.g:708:3: ( (lv_params_0_0= RULE_ID ) ) ruleTypes (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ruleTypes )*
            {
            // InternalGo.g:708:3: ( (lv_params_0_0= RULE_ID ) )
            // InternalGo.g:709:4: (lv_params_0_0= RULE_ID )
            {
            // InternalGo.g:709:4: (lv_params_0_0= RULE_ID )
            // InternalGo.g:710:5: lv_params_0_0= RULE_ID
            {
            lv_params_0_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_params_0_0, grammarAccess.getParamsAccess().getParamsIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParamsRule());
              					}
              					addWithLastConsumed(
              						current,
              						"params",
              						lv_params_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParamsAccess().getTypesParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_8);
            ruleTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:733:3: (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ruleTypes )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_COMMA) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGo.g:734:4: this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ruleTypes
            	    {
            	    this_Comma_2=(Token)match(input,RULE_COMMA,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_Comma_2, grammarAccess.getParamsAccess().getCommaTerminalRuleCall_2_0());
            	      			
            	    }
            	    // InternalGo.g:738:4: ( (lv_params_3_0= RULE_ID ) )
            	    // InternalGo.g:739:5: (lv_params_3_0= RULE_ID )
            	    {
            	    // InternalGo.g:739:5: (lv_params_3_0= RULE_ID )
            	    // InternalGo.g:740:6: lv_params_3_0= RULE_ID
            	    {
            	    lv_params_3_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_params_3_0, grammarAccess.getParamsAccess().getParamsIDTerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getParamsRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"params",
            	      							lv_params_3_0,
            	      							"org.eclipse.xtext.common.Terminals.ID");
            	      					
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getParamsAccess().getTypesParserRuleCall_2_2());
            	      			
            	    }
            	    pushFollow(FOLLOW_8);
            	    ruleTypes();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "ruleParams"


    // $ANTLR start "entryRuleTypeValue"
    // InternalGo.g:768:1: entryRuleTypeValue returns [String current=null] : iv_ruleTypeValue= ruleTypeValue EOF ;
    public final String entryRuleTypeValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeValue = null;


        try {
            // InternalGo.g:768:49: (iv_ruleTypeValue= ruleTypeValue EOF )
            // InternalGo.g:769:2: iv_ruleTypeValue= ruleTypeValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeValue=ruleTypeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeValue.getText(); 
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
    // $ANTLR end "entryRuleTypeValue"


    // $ANTLR start "ruleTypeValue"
    // InternalGo.g:775:1: ruleTypeValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_Numbers_1= ruleNumbers | this_Boolean_2= ruleBoolean ) ;
    public final AntlrDatatypeRuleToken ruleTypeValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_Numbers_1 = null;

        AntlrDatatypeRuleToken this_Boolean_2 = null;



        	enterRule();

        try {
            // InternalGo.g:781:2: ( (this_STRING_0= RULE_STRING | this_Numbers_1= ruleNumbers | this_Boolean_2= ruleBoolean ) )
            // InternalGo.g:782:2: (this_STRING_0= RULE_STRING | this_Numbers_1= ruleNumbers | this_Boolean_2= ruleBoolean )
            {
            // InternalGo.g:782:2: (this_STRING_0= RULE_STRING | this_Numbers_1= ruleNumbers | this_Boolean_2= ruleBoolean )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt19=1;
                }
                break;
            case RULE_INT:
                {
                alt19=2;
                }
                break;
            case 47:
            case 48:
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
                    // InternalGo.g:783:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_0, grammarAccess.getTypeValueAccess().getSTRINGTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:791:3: this_Numbers_1= ruleNumbers
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeValueAccess().getNumbersParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Numbers_1=ruleNumbers();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Numbers_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:802:3: this_Boolean_2= ruleBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeValueAccess().getBooleanParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Boolean_2=ruleBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Boolean_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

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
    // $ANTLR end "ruleTypeValue"


    // $ANTLR start "entryRuleDecImport"
    // InternalGo.g:816:1: entryRuleDecImport returns [String current=null] : iv_ruleDecImport= ruleDecImport EOF ;
    public final String entryRuleDecImport() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecImport = null;


        try {
            // InternalGo.g:816:49: (iv_ruleDecImport= ruleDecImport EOF )
            // InternalGo.g:817:2: iv_ruleDecImport= ruleDecImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDecImport=ruleDecImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecImport.getText(); 
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
    // $ANTLR end "entryRuleDecImport"


    // $ANTLR start "ruleDecImport"
    // InternalGo.g:823:1: ruleDecImport returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IMPORT_0= ruleIMPORT (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) ) ) ;
    public final AntlrDatatypeRuleToken ruleDecImport() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_1=null;
        Token this_Open_parentheses_2=null;
        Token this_STRING_3=null;
        Token this_Closed_parentheses_4=null;
        AntlrDatatypeRuleToken this_IMPORT_0 = null;



        	enterRule();

        try {
            // InternalGo.g:829:2: ( (this_IMPORT_0= ruleIMPORT (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) ) ) )
            // InternalGo.g:830:2: (this_IMPORT_0= ruleIMPORT (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) ) )
            {
            // InternalGo.g:830:2: (this_IMPORT_0= ruleIMPORT (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) ) )
            // InternalGo.g:831:3: this_IMPORT_0= ruleIMPORT (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) )
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDecImportAccess().getIMPORTParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_18);
            this_IMPORT_0=ruleIMPORT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IMPORT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:841:3: (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_OPEN_PARENTHESES) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalGo.g:842:4: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_STRING_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_STRING_1, grammarAccess.getDecImportAccess().getSTRINGTerminalRuleCall_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:850:4: (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES )
                    {
                    // InternalGo.g:850:4: (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES )
                    // InternalGo.g:851:5: this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES
                    {
                    this_Open_parentheses_2=(Token)match(input,RULE_OPEN_PARENTHESES,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Open_parentheses_2);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_Open_parentheses_2, grammarAccess.getDecImportAccess().getOpen_parenthesesTerminalRuleCall_1_1_0());
                      				
                    }
                    // InternalGo.g:858:5: (this_STRING_3= RULE_STRING )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_STRING) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalGo.g:859:6: this_STRING_3= RULE_STRING
                    	    {
                    	    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_20); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(this_STRING_3);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(this_STRING_3, grammarAccess.getDecImportAccess().getSTRINGTerminalRuleCall_1_1_1());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);

                    this_Closed_parentheses_4=(Token)match(input,RULE_CLOSED_PARENTHESES,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Closed_parentheses_4);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_Closed_parentheses_4, grammarAccess.getDecImportAccess().getClosed_parenthesesTerminalRuleCall_1_1_2());
                      				
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
    // $ANTLR end "ruleDecImport"


    // $ANTLR start "entryRuleOperationsOneEquals"
    // InternalGo.g:880:1: entryRuleOperationsOneEquals returns [EObject current=null] : iv_ruleOperationsOneEquals= ruleOperationsOneEquals EOF ;
    public final EObject entryRuleOperationsOneEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationsOneEquals = null;


        try {
            // InternalGo.g:880:60: (iv_ruleOperationsOneEquals= ruleOperationsOneEquals EOF )
            // InternalGo.g:881:2: iv_ruleOperationsOneEquals= ruleOperationsOneEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationsOneEqualsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperationsOneEquals=ruleOperationsOneEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationsOneEquals; 
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
    // $ANTLR end "entryRuleOperationsOneEquals"


    // $ANTLR start "ruleOperationsOneEquals"
    // InternalGo.g:887:1: ruleOperationsOneEquals returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusEquals_1= RULE_PLUSEQUALS | this_MinusEquals_2= RULE_MINUSEQUALS ) (this_ID_3= RULE_ID | ruleNumbers ) ) ;
    public final EObject ruleOperationsOneEquals() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_PlusEquals_1=null;
        Token this_MinusEquals_2=null;
        Token this_ID_3=null;


        	enterRule();

        try {
            // InternalGo.g:893:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusEquals_1= RULE_PLUSEQUALS | this_MinusEquals_2= RULE_MINUSEQUALS ) (this_ID_3= RULE_ID | ruleNumbers ) ) )
            // InternalGo.g:894:2: ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusEquals_1= RULE_PLUSEQUALS | this_MinusEquals_2= RULE_MINUSEQUALS ) (this_ID_3= RULE_ID | ruleNumbers ) )
            {
            // InternalGo.g:894:2: ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusEquals_1= RULE_PLUSEQUALS | this_MinusEquals_2= RULE_MINUSEQUALS ) (this_ID_3= RULE_ID | ruleNumbers ) )
            // InternalGo.g:895:3: ( (lv_name_0_0= RULE_ID ) ) (this_PlusEquals_1= RULE_PLUSEQUALS | this_MinusEquals_2= RULE_MINUSEQUALS ) (this_ID_3= RULE_ID | ruleNumbers )
            {
            // InternalGo.g:895:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGo.g:896:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGo.g:896:4: (lv_name_0_0= RULE_ID )
            // InternalGo.g:897:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getOperationsOneEqualsAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOperationsOneEqualsRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalGo.g:913:3: (this_PlusEquals_1= RULE_PLUSEQUALS | this_MinusEquals_2= RULE_MINUSEQUALS )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_PLUSEQUALS) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_MINUSEQUALS) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalGo.g:914:4: this_PlusEquals_1= RULE_PLUSEQUALS
                    {
                    this_PlusEquals_1=(Token)match(input,RULE_PLUSEQUALS,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_PlusEquals_1, grammarAccess.getOperationsOneEqualsAccess().getPlusEqualsTerminalRuleCall_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:919:4: this_MinusEquals_2= RULE_MINUSEQUALS
                    {
                    this_MinusEquals_2=(Token)match(input,RULE_MINUSEQUALS,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_MinusEquals_2, grammarAccess.getOperationsOneEqualsAccess().getMinusEqualsTerminalRuleCall_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalGo.g:924:3: (this_ID_3= RULE_ID | ruleNumbers )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_INT) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalGo.g:925:4: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_3, grammarAccess.getOperationsOneEqualsAccess().getIDTerminalRuleCall_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:930:4: ruleNumbers
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getOperationsOneEqualsAccess().getNumbersParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    ruleNumbers();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
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
    // $ANTLR end "ruleOperationsOneEquals"


    // $ANTLR start "entryRuleOperations"
    // InternalGo.g:942:1: entryRuleOperations returns [EObject current=null] : iv_ruleOperations= ruleOperations EOF ;
    public final EObject entryRuleOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperations = null;


        try {
            // InternalGo.g:942:51: (iv_ruleOperations= ruleOperations EOF )
            // InternalGo.g:943:2: iv_ruleOperations= ruleOperations EOF
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
    // InternalGo.g:949:1: ruleOperations returns [EObject current=null] : ( (this_T_0= ruleT ( (lv_o_1_0= ruleI ) ) ) | this_OperationsOneEquals_2= ruleOperationsOneEquals ) ;
    public final EObject ruleOperations() throws RecognitionException {
        EObject current = null;

        EObject this_T_0 = null;

        EObject lv_o_1_0 = null;

        EObject this_OperationsOneEquals_2 = null;



        	enterRule();

        try {
            // InternalGo.g:955:2: ( ( (this_T_0= ruleT ( (lv_o_1_0= ruleI ) ) ) | this_OperationsOneEquals_2= ruleOperationsOneEquals ) )
            // InternalGo.g:956:2: ( (this_T_0= ruleT ( (lv_o_1_0= ruleI ) ) ) | this_OperationsOneEquals_2= ruleOperationsOneEquals )
            {
            // InternalGo.g:956:2: ( (this_T_0= ruleT ( (lv_o_1_0= ruleI ) ) ) | this_OperationsOneEquals_2= ruleOperationsOneEquals )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_OPEN_PARENTHESES||LA24_0==RULE_INT) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_ID) ) {
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
                    // InternalGo.g:957:3: (this_T_0= ruleT ( (lv_o_1_0= ruleI ) ) )
                    {
                    // InternalGo.g:957:3: (this_T_0= ruleT ( (lv_o_1_0= ruleI ) ) )
                    // InternalGo.g:958:4: this_T_0= ruleT ( (lv_o_1_0= ruleI ) )
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getOperationsAccess().getTParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_23);
                    this_T_0=ruleT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_T_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:966:4: ( (lv_o_1_0= ruleI ) )
                    // InternalGo.g:967:5: (lv_o_1_0= ruleI )
                    {
                    // InternalGo.g:967:5: (lv_o_1_0= ruleI )
                    // InternalGo.g:968:6: lv_o_1_0= ruleI
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperationsAccess().getOIParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_o_1_0=ruleI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperationsRule());
                      						}
                      						set(
                      							current,
                      							"o",
                      							lv_o_1_0,
                      							"org.xtext.go.Go.I");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:987:3: this_OperationsOneEquals_2= ruleOperationsOneEquals
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperationsAccess().getOperationsOneEqualsParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_OperationsOneEquals_2=ruleOperationsOneEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_OperationsOneEquals_2;
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
    // $ANTLR end "ruleOperations"


    // $ANTLR start "entryRuleI"
    // InternalGo.g:999:1: entryRuleI returns [EObject current=null] : iv_ruleI= ruleI EOF ;
    public final EObject entryRuleI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleI = null;


        try {
            // InternalGo.g:999:42: (iv_ruleI= ruleI EOF )
            // InternalGo.g:1000:2: iv_ruleI= ruleI EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleI=ruleI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleI; 
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
    // $ANTLR end "entryRuleI"


    // $ANTLR start "ruleI"
    // InternalGo.g:1006:1: ruleI returns [EObject current=null] : ( (this_Plus_0= RULE_PLUS this_T_1= ruleT ( (lv_o_2_0= ruleI ) ) ) | (this_Minus_3= RULE_MINUS this_T_4= ruleT ( (lv_o_5_0= ruleI ) ) ) )? ;
    public final EObject ruleI() throws RecognitionException {
        EObject current = null;

        Token this_Plus_0=null;
        Token this_Minus_3=null;
        EObject this_T_1 = null;

        EObject lv_o_2_0 = null;

        EObject this_T_4 = null;

        EObject lv_o_5_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1012:2: ( ( (this_Plus_0= RULE_PLUS this_T_1= ruleT ( (lv_o_2_0= ruleI ) ) ) | (this_Minus_3= RULE_MINUS this_T_4= ruleT ( (lv_o_5_0= ruleI ) ) ) )? )
            // InternalGo.g:1013:2: ( (this_Plus_0= RULE_PLUS this_T_1= ruleT ( (lv_o_2_0= ruleI ) ) ) | (this_Minus_3= RULE_MINUS this_T_4= ruleT ( (lv_o_5_0= ruleI ) ) ) )?
            {
            // InternalGo.g:1013:2: ( (this_Plus_0= RULE_PLUS this_T_1= ruleT ( (lv_o_2_0= ruleI ) ) ) | (this_Minus_3= RULE_MINUS this_T_4= ruleT ( (lv_o_5_0= ruleI ) ) ) )?
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_PLUS) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_MINUS) ) {
                alt25=2;
            }
            switch (alt25) {
                case 1 :
                    // InternalGo.g:1014:3: (this_Plus_0= RULE_PLUS this_T_1= ruleT ( (lv_o_2_0= ruleI ) ) )
                    {
                    // InternalGo.g:1014:3: (this_Plus_0= RULE_PLUS this_T_1= ruleT ( (lv_o_2_0= ruleI ) ) )
                    // InternalGo.g:1015:4: this_Plus_0= RULE_PLUS this_T_1= ruleT ( (lv_o_2_0= ruleI ) )
                    {
                    this_Plus_0=(Token)match(input,RULE_PLUS,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Plus_0, grammarAccess.getIAccess().getPlusTerminalRuleCall_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIAccess().getTParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_23);
                    this_T_1=ruleT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_T_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:1027:4: ( (lv_o_2_0= ruleI ) )
                    // InternalGo.g:1028:5: (lv_o_2_0= ruleI )
                    {
                    // InternalGo.g:1028:5: (lv_o_2_0= ruleI )
                    // InternalGo.g:1029:6: lv_o_2_0= ruleI
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIAccess().getOIParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_o_2_0=ruleI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIRule());
                      						}
                      						set(
                      							current,
                      							"o",
                      							lv_o_2_0,
                      							"org.xtext.go.Go.I");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1048:3: (this_Minus_3= RULE_MINUS this_T_4= ruleT ( (lv_o_5_0= ruleI ) ) )
                    {
                    // InternalGo.g:1048:3: (this_Minus_3= RULE_MINUS this_T_4= ruleT ( (lv_o_5_0= ruleI ) ) )
                    // InternalGo.g:1049:4: this_Minus_3= RULE_MINUS this_T_4= ruleT ( (lv_o_5_0= ruleI ) )
                    {
                    this_Minus_3=(Token)match(input,RULE_MINUS,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Minus_3, grammarAccess.getIAccess().getMinusTerminalRuleCall_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIAccess().getTParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_23);
                    this_T_4=ruleT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_T_4;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:1061:4: ( (lv_o_5_0= ruleI ) )
                    // InternalGo.g:1062:5: (lv_o_5_0= ruleI )
                    {
                    // InternalGo.g:1062:5: (lv_o_5_0= ruleI )
                    // InternalGo.g:1063:6: lv_o_5_0= ruleI
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIAccess().getOIParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_o_5_0=ruleI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIRule());
                      						}
                      						set(
                      							current,
                      							"o",
                      							lv_o_5_0,
                      							"org.xtext.go.Go.I");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


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
    // $ANTLR end "ruleI"


    // $ANTLR start "entryRuleT"
    // InternalGo.g:1085:1: entryRuleT returns [EObject current=null] : iv_ruleT= ruleT EOF ;
    public final EObject entryRuleT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleT = null;


        try {
            // InternalGo.g:1085:42: (iv_ruleT= ruleT EOF )
            // InternalGo.g:1086:2: iv_ruleT= ruleT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleT=ruleT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleT; 
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
    // $ANTLR end "entryRuleT"


    // $ANTLR start "ruleT"
    // InternalGo.g:1092:1: ruleT returns [EObject current=null] : (this_F_0= ruleF ( (lv_o_1_0= ruleY ) ) ) ;
    public final EObject ruleT() throws RecognitionException {
        EObject current = null;

        EObject this_F_0 = null;

        EObject lv_o_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1098:2: ( (this_F_0= ruleF ( (lv_o_1_0= ruleY ) ) ) )
            // InternalGo.g:1099:2: (this_F_0= ruleF ( (lv_o_1_0= ruleY ) ) )
            {
            // InternalGo.g:1099:2: (this_F_0= ruleF ( (lv_o_1_0= ruleY ) ) )
            // InternalGo.g:1100:3: this_F_0= ruleF ( (lv_o_1_0= ruleY ) )
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTAccess().getFParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_25);
            this_F_0=ruleF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_F_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1108:3: ( (lv_o_1_0= ruleY ) )
            // InternalGo.g:1109:4: (lv_o_1_0= ruleY )
            {
            // InternalGo.g:1109:4: (lv_o_1_0= ruleY )
            // InternalGo.g:1110:5: lv_o_1_0= ruleY
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTAccess().getOYParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_o_1_0=ruleY();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTRule());
              					}
              					set(
              						current,
              						"o",
              						lv_o_1_0,
              						"org.xtext.go.Go.Y");
              					afterParserOrEnumRuleCall();
              				
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
    // $ANTLR end "ruleT"


    // $ANTLR start "entryRuleY"
    // InternalGo.g:1131:1: entryRuleY returns [EObject current=null] : iv_ruleY= ruleY EOF ;
    public final EObject entryRuleY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleY = null;


        try {
            // InternalGo.g:1131:42: (iv_ruleY= ruleY EOF )
            // InternalGo.g:1132:2: iv_ruleY= ruleY EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleY=ruleY();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleY; 
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
    // $ANTLR end "entryRuleY"


    // $ANTLR start "ruleY"
    // InternalGo.g:1138:1: ruleY returns [EObject current=null] : ( (this_Asterics_0= RULE_ASTERICS ( (lv_o_1_0= ruleF ) ) ( (lv_o_2_0= ruleY ) ) ) | (this_Bar_3= RULE_BAR ( (lv_o_4_0= ruleF ) ) ( (lv_o_5_0= ruleY ) ) ) )? ;
    public final EObject ruleY() throws RecognitionException {
        EObject current = null;

        Token this_Asterics_0=null;
        Token this_Bar_3=null;
        EObject lv_o_1_0 = null;

        EObject lv_o_2_0 = null;

        EObject lv_o_4_0 = null;

        EObject lv_o_5_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1144:2: ( ( (this_Asterics_0= RULE_ASTERICS ( (lv_o_1_0= ruleF ) ) ( (lv_o_2_0= ruleY ) ) ) | (this_Bar_3= RULE_BAR ( (lv_o_4_0= ruleF ) ) ( (lv_o_5_0= ruleY ) ) ) )? )
            // InternalGo.g:1145:2: ( (this_Asterics_0= RULE_ASTERICS ( (lv_o_1_0= ruleF ) ) ( (lv_o_2_0= ruleY ) ) ) | (this_Bar_3= RULE_BAR ( (lv_o_4_0= ruleF ) ) ( (lv_o_5_0= ruleY ) ) ) )?
            {
            // InternalGo.g:1145:2: ( (this_Asterics_0= RULE_ASTERICS ( (lv_o_1_0= ruleF ) ) ( (lv_o_2_0= ruleY ) ) ) | (this_Bar_3= RULE_BAR ( (lv_o_4_0= ruleF ) ) ( (lv_o_5_0= ruleY ) ) ) )?
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ASTERICS) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_BAR) ) {
                alt26=2;
            }
            switch (alt26) {
                case 1 :
                    // InternalGo.g:1146:3: (this_Asterics_0= RULE_ASTERICS ( (lv_o_1_0= ruleF ) ) ( (lv_o_2_0= ruleY ) ) )
                    {
                    // InternalGo.g:1146:3: (this_Asterics_0= RULE_ASTERICS ( (lv_o_1_0= ruleF ) ) ( (lv_o_2_0= ruleY ) ) )
                    // InternalGo.g:1147:4: this_Asterics_0= RULE_ASTERICS ( (lv_o_1_0= ruleF ) ) ( (lv_o_2_0= ruleY ) )
                    {
                    this_Asterics_0=(Token)match(input,RULE_ASTERICS,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Asterics_0, grammarAccess.getYAccess().getAstericsTerminalRuleCall_0_0());
                      			
                    }
                    // InternalGo.g:1151:4: ( (lv_o_1_0= ruleF ) )
                    // InternalGo.g:1152:5: (lv_o_1_0= ruleF )
                    {
                    // InternalGo.g:1152:5: (lv_o_1_0= ruleF )
                    // InternalGo.g:1153:6: lv_o_1_0= ruleF
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getYAccess().getOFParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_25);
                    lv_o_1_0=ruleF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getYRule());
                      						}
                      						set(
                      							current,
                      							"o",
                      							lv_o_1_0,
                      							"org.xtext.go.Go.F");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGo.g:1170:4: ( (lv_o_2_0= ruleY ) )
                    // InternalGo.g:1171:5: (lv_o_2_0= ruleY )
                    {
                    // InternalGo.g:1171:5: (lv_o_2_0= ruleY )
                    // InternalGo.g:1172:6: lv_o_2_0= ruleY
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getYAccess().getOYParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_o_2_0=ruleY();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getYRule());
                      						}
                      						set(
                      							current,
                      							"o",
                      							lv_o_2_0,
                      							"org.xtext.go.Go.Y");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1191:3: (this_Bar_3= RULE_BAR ( (lv_o_4_0= ruleF ) ) ( (lv_o_5_0= ruleY ) ) )
                    {
                    // InternalGo.g:1191:3: (this_Bar_3= RULE_BAR ( (lv_o_4_0= ruleF ) ) ( (lv_o_5_0= ruleY ) ) )
                    // InternalGo.g:1192:4: this_Bar_3= RULE_BAR ( (lv_o_4_0= ruleF ) ) ( (lv_o_5_0= ruleY ) )
                    {
                    this_Bar_3=(Token)match(input,RULE_BAR,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Bar_3, grammarAccess.getYAccess().getBarTerminalRuleCall_1_0());
                      			
                    }
                    // InternalGo.g:1196:4: ( (lv_o_4_0= ruleF ) )
                    // InternalGo.g:1197:5: (lv_o_4_0= ruleF )
                    {
                    // InternalGo.g:1197:5: (lv_o_4_0= ruleF )
                    // InternalGo.g:1198:6: lv_o_4_0= ruleF
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getYAccess().getOFParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_25);
                    lv_o_4_0=ruleF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getYRule());
                      						}
                      						set(
                      							current,
                      							"o",
                      							lv_o_4_0,
                      							"org.xtext.go.Go.F");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGo.g:1215:4: ( (lv_o_5_0= ruleY ) )
                    // InternalGo.g:1216:5: (lv_o_5_0= ruleY )
                    {
                    // InternalGo.g:1216:5: (lv_o_5_0= ruleY )
                    // InternalGo.g:1217:6: lv_o_5_0= ruleY
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getYAccess().getOYParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_o_5_0=ruleY();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getYRule());
                      						}
                      						set(
                      							current,
                      							"o",
                      							lv_o_5_0,
                      							"org.xtext.go.Go.Y");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


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
    // $ANTLR end "ruleY"


    // $ANTLR start "entryRuleF"
    // InternalGo.g:1239:1: entryRuleF returns [EObject current=null] : iv_ruleF= ruleF EOF ;
    public final EObject entryRuleF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleF = null;


        try {
            // InternalGo.g:1239:42: (iv_ruleF= ruleF EOF )
            // InternalGo.g:1240:2: iv_ruleF= ruleF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleF=ruleF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleF; 
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
    // $ANTLR end "entryRuleF"


    // $ANTLR start "ruleF"
    // InternalGo.g:1246:1: ruleF returns [EObject current=null] : ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES ( (lv_o_1_0= ruleOperations ) ) this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | ruleNumbers ) ;
    public final EObject ruleF() throws RecognitionException {
        EObject current = null;

        Token this_Open_parentheses_0=null;
        Token this_Closed_parentheses_2=null;
        EObject lv_o_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1252:2: ( ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES ( (lv_o_1_0= ruleOperations ) ) this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | ruleNumbers ) )
            // InternalGo.g:1253:2: ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES ( (lv_o_1_0= ruleOperations ) ) this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | ruleNumbers )
            {
            // InternalGo.g:1253:2: ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES ( (lv_o_1_0= ruleOperations ) ) this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | ruleNumbers )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_OPEN_PARENTHESES) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_INT) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalGo.g:1254:3: (this_Open_parentheses_0= RULE_OPEN_PARENTHESES ( (lv_o_1_0= ruleOperations ) ) this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES )
                    {
                    // InternalGo.g:1254:3: (this_Open_parentheses_0= RULE_OPEN_PARENTHESES ( (lv_o_1_0= ruleOperations ) ) this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES )
                    // InternalGo.g:1255:4: this_Open_parentheses_0= RULE_OPEN_PARENTHESES ( (lv_o_1_0= ruleOperations ) ) this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES
                    {
                    this_Open_parentheses_0=(Token)match(input,RULE_OPEN_PARENTHESES,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Open_parentheses_0, grammarAccess.getFAccess().getOpen_parenthesesTerminalRuleCall_0_0());
                      			
                    }
                    // InternalGo.g:1259:4: ( (lv_o_1_0= ruleOperations ) )
                    // InternalGo.g:1260:5: (lv_o_1_0= ruleOperations )
                    {
                    // InternalGo.g:1260:5: (lv_o_1_0= ruleOperations )
                    // InternalGo.g:1261:6: lv_o_1_0= ruleOperations
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFAccess().getOOperationsParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_26);
                    lv_o_1_0=ruleOperations();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFRule());
                      						}
                      						set(
                      							current,
                      							"o",
                      							lv_o_1_0,
                      							"org.xtext.go.Go.Operations");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    this_Closed_parentheses_2=(Token)match(input,RULE_CLOSED_PARENTHESES,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Closed_parentheses_2, grammarAccess.getFAccess().getClosed_parenthesesTerminalRuleCall_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1284:3: ruleNumbers
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFAccess().getNumbersParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    ruleNumbers();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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
    // $ANTLR end "ruleF"


    // $ANTLR start "entryRuleNumbers"
    // InternalGo.g:1295:1: entryRuleNumbers returns [String current=null] : iv_ruleNumbers= ruleNumbers EOF ;
    public final String entryRuleNumbers() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumbers = null;


        try {
            // InternalGo.g:1295:47: (iv_ruleNumbers= ruleNumbers EOF )
            // InternalGo.g:1296:2: iv_ruleNumbers= ruleNumbers EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumbersRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumbers=ruleNumbers();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumbers.getText(); 
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
    // $ANTLR end "entryRuleNumbers"


    // $ANTLR start "ruleNumbers"
    // InternalGo.g:1302:1: ruleNumbers returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_Double_1= ruleDouble ) ;
    public final AntlrDatatypeRuleToken ruleNumbers() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        AntlrDatatypeRuleToken this_Double_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1308:2: ( (this_INT_0= RULE_INT | this_Double_1= ruleDouble ) )
            // InternalGo.g:1309:2: (this_INT_0= RULE_INT | this_Double_1= ruleDouble )
            {
            // InternalGo.g:1309:2: (this_INT_0= RULE_INT | this_Double_1= ruleDouble )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_INT) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==EOF||(LA28_1>=RULE_EOL && LA28_1<=RULE_CLOSED_PARENTHESES)||LA28_1==RULE_INT||(LA28_1>=RULE_OPEN_KEY && LA28_1<=RULE_CLOSED_KEY)||(LA28_1>=RULE_PLUS && LA28_1<=RULE_BAR)||LA28_1==RULE_PONTOVIRGULA||(LA28_1>=33 && LA28_1<=39)||LA28_1==52||(LA28_1>=55 && LA28_1<=58)||LA28_1==62||LA28_1==64) ) {
                    alt28=1;
                }
                else if ( (LA28_1==RULE_DOT) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalGo.g:1310:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_0, grammarAccess.getNumbersAccess().getINTTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1318:3: this_Double_1= ruleDouble
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNumbersAccess().getDoubleParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Double_1=ruleDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Double_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

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
    // $ANTLR end "ruleNumbers"


    // $ANTLR start "entryRuleDouble"
    // InternalGo.g:1332:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalGo.g:1332:46: (iv_ruleDouble= ruleDouble EOF )
            // InternalGo.g:1333:2: iv_ruleDouble= ruleDouble EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoubleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDouble=ruleDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDouble.getText(); 
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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // InternalGo.g:1339:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT this_Dot_1= RULE_DOT this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_Dot_1=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalGo.g:1345:2: ( (this_INT_0= RULE_INT this_Dot_1= RULE_DOT this_INT_2= RULE_INT ) )
            // InternalGo.g:1346:2: (this_INT_0= RULE_INT this_Dot_1= RULE_DOT this_INT_2= RULE_INT )
            {
            // InternalGo.g:1346:2: (this_INT_0= RULE_INT this_Dot_1= RULE_DOT this_INT_2= RULE_INT )
            // InternalGo.g:1347:3: this_INT_0= RULE_INT this_Dot_1= RULE_DOT this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0());
              		
            }
            this_Dot_1=(Token)match(input,RULE_DOT,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Dot_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Dot_1, grammarAccess.getDoubleAccess().getDotTerminalRuleCall_1());
              		
            }
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_2, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2());
              		
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
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleCondition"
    // InternalGo.g:1372:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalGo.g:1372:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalGo.g:1373:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalGo.g:1379:1: ruleCondition returns [EObject current=null] : ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_if_0_0 = null;

        EObject lv_elseif_1_0 = null;

        EObject lv_else_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1385:2: ( ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )? ) )
            // InternalGo.g:1386:2: ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )? )
            {
            // InternalGo.g:1386:2: ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )? )
            // InternalGo.g:1387:3: ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )?
            {
            // InternalGo.g:1387:3: ( (lv_if_0_0= ruleIfCondition ) )
            // InternalGo.g:1388:4: (lv_if_0_0= ruleIfCondition )
            {
            // InternalGo.g:1388:4: (lv_if_0_0= ruleIfCondition )
            // InternalGo.g:1389:5: lv_if_0_0= ruleIfCondition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionAccess().getIfIfConditionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_29);
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

            // InternalGo.g:1406:3: ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==54) ) {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1==57) && (synpred1_InternalGo())) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // InternalGo.g:1407:4: ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition )
            	    {
            	    // InternalGo.g:1408:4: (lv_elseif_1_0= ruleElseIfCondition )
            	    // InternalGo.g:1409:5: lv_elseif_1_0= ruleElseIfCondition
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConditionAccess().getElseifElseIfConditionParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_29);
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
            	    break loop29;
                }
            } while (true);

            // InternalGo.g:1426:3: ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==54) && (synpred2_InternalGo())) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGo.g:1427:4: ( ruleELSE )=> (lv_else_2_0= ruleElseCondition )
                    {
                    // InternalGo.g:1428:4: (lv_else_2_0= ruleElseCondition )
                    // InternalGo.g:1429:5: lv_else_2_0= ruleElseCondition
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
    // InternalGo.g:1450:1: entryRuleIfCondition returns [EObject current=null] : iv_ruleIfCondition= ruleIfCondition EOF ;
    public final EObject entryRuleIfCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfCondition = null;


        try {
            // InternalGo.g:1450:52: (iv_ruleIfCondition= ruleIfCondition EOF )
            // InternalGo.g:1451:2: iv_ruleIfCondition= ruleIfCondition EOF
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
    // InternalGo.g:1457:1: ruleIfCondition returns [EObject current=null] : ( ruleIF ( (lv_cond_1_0= ruleExpression ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_then_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY ) ;
    public final EObject ruleIfCondition() throws RecognitionException {
        EObject current = null;

        Token this_Open_Key_2=null;
        Token this_Closed_Key_4=null;
        EObject lv_cond_1_0 = null;

        EObject lv_then_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1463:2: ( ( ruleIF ( (lv_cond_1_0= ruleExpression ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_then_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY ) )
            // InternalGo.g:1464:2: ( ruleIF ( (lv_cond_1_0= ruleExpression ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_then_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY )
            {
            // InternalGo.g:1464:2: ( ruleIF ( (lv_cond_1_0= ruleExpression ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_then_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY )
            // InternalGo.g:1465:3: ruleIF ( (lv_cond_1_0= ruleExpression ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_then_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIfConditionAccess().getIFParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_7);
            ruleIF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1472:3: ( (lv_cond_1_0= ruleExpression ) )
            // InternalGo.g:1473:4: (lv_cond_1_0= ruleExpression )
            {
            // InternalGo.g:1473:4: (lv_cond_1_0= ruleExpression )
            // InternalGo.g:1474:5: lv_cond_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfConditionAccess().getCondExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_30);
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

            this_Open_Key_2=(Token)match(input,RULE_OPEN_KEY,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Open_Key_2, grammarAccess.getIfConditionAccess().getOpen_KeyTerminalRuleCall_2());
              		
            }
            // InternalGo.g:1495:3: ( (lv_then_3_0= ruleGreeting ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_EOL && LA31_0<=RULE_ID)||LA31_0==RULE_OPEN_PARENTHESES||LA31_0==RULE_INT||LA31_0==52||(LA31_0>=55 && LA31_0<=58)||LA31_0==62||LA31_0==64) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalGo.g:1496:4: (lv_then_3_0= ruleGreeting )
            	    {
            	    // InternalGo.g:1496:4: (lv_then_3_0= ruleGreeting )
            	    // InternalGo.g:1497:5: lv_then_3_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfConditionAccess().getThenGreetingParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_31);
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
            	    break loop31;
                }
            } while (true);

            this_Closed_Key_4=(Token)match(input,RULE_CLOSED_KEY,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Closed_Key_4, grammarAccess.getIfConditionAccess().getClosed_KeyTerminalRuleCall_4());
              		
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
    // InternalGo.g:1522:1: entryRuleElseIfCondition returns [EObject current=null] : iv_ruleElseIfCondition= ruleElseIfCondition EOF ;
    public final EObject entryRuleElseIfCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfCondition = null;


        try {
            // InternalGo.g:1522:56: (iv_ruleElseIfCondition= ruleElseIfCondition EOF )
            // InternalGo.g:1523:2: iv_ruleElseIfCondition= ruleElseIfCondition EOF
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
    // InternalGo.g:1529:1: ruleElseIfCondition returns [EObject current=null] : ( ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition ) ;
    public final EObject ruleElseIfCondition() throws RecognitionException {
        EObject current = null;

        EObject this_IfCondition_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1535:2: ( ( ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition ) )
            // InternalGo.g:1536:2: ( ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition )
            {
            // InternalGo.g:1536:2: ( ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition )
            // InternalGo.g:1537:3: ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition
            {
            // InternalGo.g:1537:3: ( ( ruleELSE )=> ruleELSE )
            // InternalGo.g:1538:4: ( ruleELSE )=> ruleELSE
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getElseIfConditionAccess().getELSEParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_32);
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
    // InternalGo.g:1559:1: entryRuleElseCondition returns [EObject current=null] : iv_ruleElseCondition= ruleElseCondition EOF ;
    public final EObject entryRuleElseCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseCondition = null;


        try {
            // InternalGo.g:1559:54: (iv_ruleElseCondition= ruleElseCondition EOF )
            // InternalGo.g:1560:2: iv_ruleElseCondition= ruleElseCondition EOF
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
    // InternalGo.g:1566:1: ruleElseCondition returns [EObject current=null] : ( ( ( ruleELSE )=> ruleELSE ) this_Open_Key_1= RULE_OPEN_KEY ( (lv_then_2_0= ruleGreeting ) )* this_Closed_Key_3= RULE_CLOSED_KEY ) ;
    public final EObject ruleElseCondition() throws RecognitionException {
        EObject current = null;

        Token this_Open_Key_1=null;
        Token this_Closed_Key_3=null;
        EObject lv_then_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1572:2: ( ( ( ( ruleELSE )=> ruleELSE ) this_Open_Key_1= RULE_OPEN_KEY ( (lv_then_2_0= ruleGreeting ) )* this_Closed_Key_3= RULE_CLOSED_KEY ) )
            // InternalGo.g:1573:2: ( ( ( ruleELSE )=> ruleELSE ) this_Open_Key_1= RULE_OPEN_KEY ( (lv_then_2_0= ruleGreeting ) )* this_Closed_Key_3= RULE_CLOSED_KEY )
            {
            // InternalGo.g:1573:2: ( ( ( ruleELSE )=> ruleELSE ) this_Open_Key_1= RULE_OPEN_KEY ( (lv_then_2_0= ruleGreeting ) )* this_Closed_Key_3= RULE_CLOSED_KEY )
            // InternalGo.g:1574:3: ( ( ruleELSE )=> ruleELSE ) this_Open_Key_1= RULE_OPEN_KEY ( (lv_then_2_0= ruleGreeting ) )* this_Closed_Key_3= RULE_CLOSED_KEY
            {
            // InternalGo.g:1574:3: ( ( ruleELSE )=> ruleELSE )
            // InternalGo.g:1575:4: ( ruleELSE )=> ruleELSE
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getElseConditionAccess().getELSEParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_30);
            ruleELSE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }

            this_Open_Key_1=(Token)match(input,RULE_OPEN_KEY,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Open_Key_1, grammarAccess.getElseConditionAccess().getOpen_KeyTerminalRuleCall_1());
              		
            }
            // InternalGo.g:1588:3: ( (lv_then_2_0= ruleGreeting ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_EOL && LA32_0<=RULE_ID)||LA32_0==RULE_OPEN_PARENTHESES||LA32_0==RULE_INT||LA32_0==52||(LA32_0>=55 && LA32_0<=58)||LA32_0==62||LA32_0==64) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalGo.g:1589:4: (lv_then_2_0= ruleGreeting )
            	    {
            	    // InternalGo.g:1589:4: (lv_then_2_0= ruleGreeting )
            	    // InternalGo.g:1590:5: lv_then_2_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getElseConditionAccess().getThenGreetingParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_31);
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
            	    break loop32;
                }
            } while (true);

            this_Closed_Key_3=(Token)match(input,RULE_CLOSED_KEY,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Closed_Key_3, grammarAccess.getElseConditionAccess().getClosed_KeyTerminalRuleCall_3());
              		
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
    // InternalGo.g:1615:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalGo.g:1615:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalGo.g:1616:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalGo.g:1622:1: ruleExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1628:2: (this_OrExpression_0= ruleOrExpression )
            // InternalGo.g:1629:2: this_OrExpression_0= ruleOrExpression
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


    // $ANTLR start "entryRuleCallFor"
    // InternalGo.g:1640:1: entryRuleCallFor returns [EObject current=null] : iv_ruleCallFor= ruleCallFor EOF ;
    public final EObject entryRuleCallFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallFor = null;


        try {
            // InternalGo.g:1640:48: (iv_ruleCallFor= ruleCallFor EOF )
            // InternalGo.g:1641:2: iv_ruleCallFor= ruleCallFor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallForRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCallFor=ruleCallFor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCallFor; 
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
    // $ANTLR end "entryRuleCallFor"


    // $ANTLR start "ruleCallFor"
    // InternalGo.g:1647:1: ruleCallFor returns [EObject current=null] : ( ruleFOR (this_varFor_1= rulevarFor )? this_Open_Key_2= RULE_OPEN_KEY ( (lv_x_3_0= ruleGreeting ) ) this_Closed_Key_4= RULE_CLOSED_KEY ) ;
    public final EObject ruleCallFor() throws RecognitionException {
        EObject current = null;

        Token this_Open_Key_2=null;
        Token this_Closed_Key_4=null;
        EObject this_varFor_1 = null;

        EObject lv_x_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1653:2: ( ( ruleFOR (this_varFor_1= rulevarFor )? this_Open_Key_2= RULE_OPEN_KEY ( (lv_x_3_0= ruleGreeting ) ) this_Closed_Key_4= RULE_CLOSED_KEY ) )
            // InternalGo.g:1654:2: ( ruleFOR (this_varFor_1= rulevarFor )? this_Open_Key_2= RULE_OPEN_KEY ( (lv_x_3_0= ruleGreeting ) ) this_Closed_Key_4= RULE_CLOSED_KEY )
            {
            // InternalGo.g:1654:2: ( ruleFOR (this_varFor_1= rulevarFor )? this_Open_Key_2= RULE_OPEN_KEY ( (lv_x_3_0= ruleGreeting ) ) this_Closed_Key_4= RULE_CLOSED_KEY )
            // InternalGo.g:1655:3: ruleFOR (this_varFor_1= rulevarFor )? this_Open_Key_2= RULE_OPEN_KEY ( (lv_x_3_0= ruleGreeting ) ) this_Closed_Key_4= RULE_CLOSED_KEY
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCallForAccess().getFORParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_33);
            ruleFOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1662:3: (this_varFor_1= rulevarFor )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID||LA33_0==RULE_OPEN_PARENTHESES||LA33_0==RULE_INT||(LA33_0>=47 && LA33_0<=48)||LA33_0==52||LA33_0==62) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGo.g:1663:4: this_varFor_1= rulevarFor
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCallForAccess().getVarForParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_30);
                    this_varFor_1=rulevarFor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_varFor_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            this_Open_Key_2=(Token)match(input,RULE_OPEN_KEY,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Open_Key_2, grammarAccess.getCallForAccess().getOpen_KeyTerminalRuleCall_2());
              		
            }
            // InternalGo.g:1676:3: ( (lv_x_3_0= ruleGreeting ) )
            // InternalGo.g:1677:4: (lv_x_3_0= ruleGreeting )
            {
            // InternalGo.g:1677:4: (lv_x_3_0= ruleGreeting )
            // InternalGo.g:1678:5: lv_x_3_0= ruleGreeting
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCallForAccess().getXGreetingParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_x_3_0=ruleGreeting();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCallForRule());
              					}
              					set(
              						current,
              						"x",
              						lv_x_3_0,
              						"org.xtext.go.Go.Greeting");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_Closed_Key_4=(Token)match(input,RULE_CLOSED_KEY,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Closed_Key_4, grammarAccess.getCallForAccess().getClosed_KeyTerminalRuleCall_4());
              		
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
    // $ANTLR end "ruleCallFor"


    // $ANTLR start "entryRuleOrExpression"
    // InternalGo.g:1703:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalGo.g:1703:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalGo.g:1704:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalGo.g:1710:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1716:2: ( (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalGo.g:1717:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalGo.g:1717:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalGo.g:1718:3: this_AndExpression_0= ruleAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_34);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1726:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==33) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalGo.g:1727:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalGo.g:1727:4: ()
            	    // InternalGo.g:1728:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalGo.g:1738:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalGo.g:1739:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalGo.g:1739:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalGo.g:1740:6: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_34);
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
            	    break loop34;
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
    // InternalGo.g:1762:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalGo.g:1762:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalGo.g:1763:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalGo.g:1769:1: ruleAndExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ComparisonExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1775:2: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) )
            // InternalGo.g:1776:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            {
            // InternalGo.g:1776:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            // InternalGo.g:1777:3: this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndExpressionAccess().getComparisonExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_35);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ComparisonExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1785:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==34) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalGo.g:1786:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) )
            	    {
            	    // InternalGo.g:1786:4: ()
            	    // InternalGo.g:1787:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,34,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalGo.g:1797:4: ( (lv_right_3_0= ruleComparisonExpression ) )
            	    // InternalGo.g:1798:5: (lv_right_3_0= ruleComparisonExpression )
            	    {
            	    // InternalGo.g:1798:5: (lv_right_3_0= ruleComparisonExpression )
            	    // InternalGo.g:1799:6: lv_right_3_0= ruleComparisonExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_35);
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
            	    break loop35;
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
    // InternalGo.g:1821:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalGo.g:1821:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalGo.g:1822:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
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
    // InternalGo.g:1828:1: ruleComparisonExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ruleOperator ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1834:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ruleOperator ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // InternalGo.g:1835:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ruleOperator ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // InternalGo.g:1835:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ruleOperator ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // InternalGo.g:1836:3: this_PrimaryExpression_0= rulePrimaryExpression ( () ruleOperator ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonExpressionAccess().getPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_36);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1844:3: ( () ruleOperator ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=35 && LA36_0<=39)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalGo.g:1845:4: () ruleOperator ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // InternalGo.g:1845:4: ()
            	    // InternalGo.g:1846:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOperatorParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_7);
            	    ruleOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalGo.g:1859:4: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // InternalGo.g:1860:5: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // InternalGo.g:1860:5: (lv_right_3_0= rulePrimaryExpression )
            	    // InternalGo.g:1861:6: lv_right_3_0= rulePrimaryExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
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
            	    break loop36;
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
    // InternalGo.g:1883:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalGo.g:1883:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalGo.g:1884:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalGo.g:1890:1: rulePrimaryExpression returns [EObject current=null] : ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | this_Literal_3= ruleLiteral ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token this_Open_parentheses_0=null;
        Token this_Closed_parentheses_2=null;
        EObject this_Expression_1 = null;

        EObject this_Literal_3 = null;



        	enterRule();

        try {
            // InternalGo.g:1896:2: ( ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | this_Literal_3= ruleLiteral ) )
            // InternalGo.g:1897:2: ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | this_Literal_3= ruleLiteral )
            {
            // InternalGo.g:1897:2: ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | this_Literal_3= ruleLiteral )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_OPEN_PARENTHESES) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_ID||LA37_0==RULE_INT||(LA37_0>=47 && LA37_0<=48)) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalGo.g:1898:3: (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES )
                    {
                    // InternalGo.g:1898:3: (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES )
                    // InternalGo.g:1899:4: this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES
                    {
                    this_Open_parentheses_0=(Token)match(input,RULE_OPEN_PARENTHESES,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Open_parentheses_0, grammarAccess.getPrimaryExpressionAccess().getOpen_parenthesesTerminalRuleCall_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_26);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    this_Closed_parentheses_2=(Token)match(input,RULE_CLOSED_PARENTHESES,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Closed_parentheses_2, grammarAccess.getPrimaryExpressionAccess().getClosed_parenthesesTerminalRuleCall_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1917:3: this_Literal_3= ruleLiteral
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


    // $ANTLR start "entryRuleOperator"
    // InternalGo.g:1929:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalGo.g:1929:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalGo.g:1930:2: iv_ruleOperator= ruleOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperator.getText(); 
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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalGo.g:1936:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '<=' | kw= '==' | kw= '>=' | kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:1942:2: ( (kw= '<' | kw= '<=' | kw= '==' | kw= '>=' | kw= '>' ) )
            // InternalGo.g:1943:2: (kw= '<' | kw= '<=' | kw= '==' | kw= '>=' | kw= '>' )
            {
            // InternalGo.g:1943:2: (kw= '<' | kw= '<=' | kw= '==' | kw= '>=' | kw= '>' )
            int alt38=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt38=1;
                }
                break;
            case 36:
                {
                alt38=2;
                }
                break;
            case 37:
                {
                alt38=3;
                }
                break;
            case 38:
                {
                alt38=4;
                }
                break;
            case 39:
                {
                alt38=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalGo.g:1944:3: kw= '<'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1950:3: kw= '<='
                    {
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignEqualsSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:1956:3: kw= '=='
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getEqualsSignEqualsSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:1962:3: kw= '>='
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getGreaterThanSignEqualsSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:1968:3: kw= '>'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_4());
                      		
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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleoperationsOne"
    // InternalGo.g:1977:1: entryRuleoperationsOne returns [EObject current=null] : iv_ruleoperationsOne= ruleoperationsOne EOF ;
    public final EObject entryRuleoperationsOne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperationsOne = null;


        try {
            // InternalGo.g:1977:54: (iv_ruleoperationsOne= ruleoperationsOne EOF )
            // InternalGo.g:1978:2: iv_ruleoperationsOne= ruleoperationsOne EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationsOneRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleoperationsOne=ruleoperationsOne();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleoperationsOne; 
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
    // $ANTLR end "entryRuleoperationsOne"


    // $ANTLR start "ruleoperationsOne"
    // InternalGo.g:1984:1: ruleoperationsOne returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusOne_1= RULE_PLUSONE | this_MinusOne_2= RULE_MINUSONE ) ) ;
    public final EObject ruleoperationsOne() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_PlusOne_1=null;
        Token this_MinusOne_2=null;


        	enterRule();

        try {
            // InternalGo.g:1990:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusOne_1= RULE_PLUSONE | this_MinusOne_2= RULE_MINUSONE ) ) )
            // InternalGo.g:1991:2: ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusOne_1= RULE_PLUSONE | this_MinusOne_2= RULE_MINUSONE ) )
            {
            // InternalGo.g:1991:2: ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusOne_1= RULE_PLUSONE | this_MinusOne_2= RULE_MINUSONE ) )
            // InternalGo.g:1992:3: ( (lv_name_0_0= RULE_ID ) ) (this_PlusOne_1= RULE_PLUSONE | this_MinusOne_2= RULE_MINUSONE )
            {
            // InternalGo.g:1992:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGo.g:1993:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGo.g:1993:4: (lv_name_0_0= RULE_ID )
            // InternalGo.g:1994:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getOperationsOneAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOperationsOneRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalGo.g:2010:3: (this_PlusOne_1= RULE_PLUSONE | this_MinusOne_2= RULE_MINUSONE )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_PLUSONE) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_MINUSONE) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalGo.g:2011:4: this_PlusOne_1= RULE_PLUSONE
                    {
                    this_PlusOne_1=(Token)match(input,RULE_PLUSONE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_PlusOne_1, grammarAccess.getOperationsOneAccess().getPlusOneTerminalRuleCall_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2016:4: this_MinusOne_2= RULE_MINUSONE
                    {
                    this_MinusOne_2=(Token)match(input,RULE_MINUSONE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_MinusOne_2, grammarAccess.getOperationsOneAccess().getMinusOneTerminalRuleCall_1_1());
                      			
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
    // $ANTLR end "ruleoperationsOne"


    // $ANTLR start "entryRulevarFor"
    // InternalGo.g:2025:1: entryRulevarFor returns [EObject current=null] : iv_rulevarFor= rulevarFor EOF ;
    public final EObject entryRulevarFor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevarFor = null;


        try {
            // InternalGo.g:2025:47: (iv_rulevarFor= rulevarFor EOF )
            // InternalGo.g:2026:2: iv_rulevarFor= rulevarFor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarForRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevarFor=rulevarFor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevarFor; 
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
    // $ANTLR end "entryRulevarFor"


    // $ANTLR start "rulevarFor"
    // InternalGo.g:2032:1: rulevarFor returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression | ( ruleModif ( (lv_var_2_0= RULE_ID ) ) ruleTypes otherlv_4= '=' ( ( (lv_atrb_5_1= ruleAtri | lv_atrb_5_2= RULE_ID ) ) ) this_PontoVirgula_6= RULE_PONTOVIRGULA ( (lv_right_7_0= ruleLiteral ) ) ruleOperator ( (lv_left_9_0= ruleLiteral ) ) this_PontoVirgula_10= RULE_PONTOVIRGULA (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals ) ) ) ;
    public final EObject rulevarFor() throws RecognitionException {
        EObject current = null;

        Token lv_var_2_0=null;
        Token otherlv_4=null;
        Token lv_atrb_5_2=null;
        Token this_PontoVirgula_6=null;
        Token this_PontoVirgula_10=null;
        EObject this_ComparisonExpression_0 = null;

        AntlrDatatypeRuleToken lv_atrb_5_1 = null;

        EObject lv_right_7_0 = null;

        EObject lv_left_9_0 = null;

        EObject this_operationsOne_11 = null;

        EObject this_OperationsOneEquals_12 = null;



        	enterRule();

        try {
            // InternalGo.g:2038:2: ( (this_ComparisonExpression_0= ruleComparisonExpression | ( ruleModif ( (lv_var_2_0= RULE_ID ) ) ruleTypes otherlv_4= '=' ( ( (lv_atrb_5_1= ruleAtri | lv_atrb_5_2= RULE_ID ) ) ) this_PontoVirgula_6= RULE_PONTOVIRGULA ( (lv_right_7_0= ruleLiteral ) ) ruleOperator ( (lv_left_9_0= ruleLiteral ) ) this_PontoVirgula_10= RULE_PONTOVIRGULA (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals ) ) ) )
            // InternalGo.g:2039:2: (this_ComparisonExpression_0= ruleComparisonExpression | ( ruleModif ( (lv_var_2_0= RULE_ID ) ) ruleTypes otherlv_4= '=' ( ( (lv_atrb_5_1= ruleAtri | lv_atrb_5_2= RULE_ID ) ) ) this_PontoVirgula_6= RULE_PONTOVIRGULA ( (lv_right_7_0= ruleLiteral ) ) ruleOperator ( (lv_left_9_0= ruleLiteral ) ) this_PontoVirgula_10= RULE_PONTOVIRGULA (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals ) ) )
            {
            // InternalGo.g:2039:2: (this_ComparisonExpression_0= ruleComparisonExpression | ( ruleModif ( (lv_var_2_0= RULE_ID ) ) ruleTypes otherlv_4= '=' ( ( (lv_atrb_5_1= ruleAtri | lv_atrb_5_2= RULE_ID ) ) ) this_PontoVirgula_6= RULE_PONTOVIRGULA ( (lv_right_7_0= ruleLiteral ) ) ruleOperator ( (lv_left_9_0= ruleLiteral ) ) this_PontoVirgula_10= RULE_PONTOVIRGULA (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID||LA42_0==RULE_OPEN_PARENTHESES||LA42_0==RULE_INT||(LA42_0>=47 && LA42_0<=48)) ) {
                alt42=1;
            }
            else if ( (LA42_0==52||LA42_0==62) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalGo.g:2040:3: this_ComparisonExpression_0= ruleComparisonExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVarForAccess().getComparisonExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ComparisonExpression_0=ruleComparisonExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ComparisonExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2049:3: ( ruleModif ( (lv_var_2_0= RULE_ID ) ) ruleTypes otherlv_4= '=' ( ( (lv_atrb_5_1= ruleAtri | lv_atrb_5_2= RULE_ID ) ) ) this_PontoVirgula_6= RULE_PONTOVIRGULA ( (lv_right_7_0= ruleLiteral ) ) ruleOperator ( (lv_left_9_0= ruleLiteral ) ) this_PontoVirgula_10= RULE_PONTOVIRGULA (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals ) )
                    {
                    // InternalGo.g:2049:3: ( ruleModif ( (lv_var_2_0= RULE_ID ) ) ruleTypes otherlv_4= '=' ( ( (lv_atrb_5_1= ruleAtri | lv_atrb_5_2= RULE_ID ) ) ) this_PontoVirgula_6= RULE_PONTOVIRGULA ( (lv_right_7_0= ruleLiteral ) ) ruleOperator ( (lv_left_9_0= ruleLiteral ) ) this_PontoVirgula_10= RULE_PONTOVIRGULA (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals ) )
                    // InternalGo.g:2050:4: ruleModif ( (lv_var_2_0= RULE_ID ) ) ruleTypes otherlv_4= '=' ( ( (lv_atrb_5_1= ruleAtri | lv_atrb_5_2= RULE_ID ) ) ) this_PontoVirgula_6= RULE_PONTOVIRGULA ( (lv_right_7_0= ruleLiteral ) ) ruleOperator ( (lv_left_9_0= ruleLiteral ) ) this_PontoVirgula_10= RULE_PONTOVIRGULA (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals )
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getVarForAccess().getModifParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    ruleModif();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:2057:4: ( (lv_var_2_0= RULE_ID ) )
                    // InternalGo.g:2058:5: (lv_var_2_0= RULE_ID )
                    {
                    // InternalGo.g:2058:5: (lv_var_2_0= RULE_ID )
                    // InternalGo.g:2059:6: lv_var_2_0= RULE_ID
                    {
                    lv_var_2_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_var_2_0, grammarAccess.getVarForAccess().getVarIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVarForRule());
                      						}
                      						addWithLastConsumed(
                      							current,
                      							"var",
                      							lv_var_2_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getVarForAccess().getTypesParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_11);
                    ruleTypes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_4=(Token)match(input,31,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getVarForAccess().getEqualsSignKeyword_1_3());
                      			
                    }
                    // InternalGo.g:2086:4: ( ( (lv_atrb_5_1= ruleAtri | lv_atrb_5_2= RULE_ID ) ) )
                    // InternalGo.g:2087:5: ( (lv_atrb_5_1= ruleAtri | lv_atrb_5_2= RULE_ID ) )
                    {
                    // InternalGo.g:2087:5: ( (lv_atrb_5_1= ruleAtri | lv_atrb_5_2= RULE_ID ) )
                    // InternalGo.g:2088:6: (lv_atrb_5_1= ruleAtri | lv_atrb_5_2= RULE_ID )
                    {
                    // InternalGo.g:2088:6: (lv_atrb_5_1= ruleAtri | lv_atrb_5_2= RULE_ID )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( ((LA40_0>=RULE_OPEN_BRACKETS && LA40_0<=RULE_INT)||LA40_0==RULE_STRING||(LA40_0>=47 && LA40_0<=48)) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==RULE_ID) ) {
                        alt40=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalGo.g:2089:7: lv_atrb_5_1= ruleAtri
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getVarForAccess().getAtrbAtriParserRuleCall_1_4_0_0());
                              						
                            }
                            pushFollow(FOLLOW_38);
                            lv_atrb_5_1=ruleAtri();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getVarForRule());
                              							}
                              							add(
                              								current,
                              								"atrb",
                              								lv_atrb_5_1,
                              								"org.xtext.go.Go.Atri");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalGo.g:2105:7: lv_atrb_5_2= RULE_ID
                            {
                            lv_atrb_5_2=(Token)match(input,RULE_ID,FOLLOW_38); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_atrb_5_2, grammarAccess.getVarForAccess().getAtrbIDTerminalRuleCall_1_4_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getVarForRule());
                              							}
                              							addWithLastConsumed(
                              								current,
                              								"atrb",
                              								lv_atrb_5_2,
                              								"org.eclipse.xtext.common.Terminals.ID");
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    this_PontoVirgula_6=(Token)match(input,RULE_PONTOVIRGULA,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_PontoVirgula_6, grammarAccess.getVarForAccess().getPontoVirgulaTerminalRuleCall_1_5());
                      			
                    }
                    // InternalGo.g:2126:4: ( (lv_right_7_0= ruleLiteral ) )
                    // InternalGo.g:2127:5: (lv_right_7_0= ruleLiteral )
                    {
                    // InternalGo.g:2127:5: (lv_right_7_0= ruleLiteral )
                    // InternalGo.g:2128:6: lv_right_7_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarForAccess().getRightLiteralParserRuleCall_1_6_0());
                      					
                    }
                    pushFollow(FOLLOW_39);
                    lv_right_7_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVarForRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_7_0,
                      							"org.xtext.go.Go.Literal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getVarForAccess().getOperatorParserRuleCall_1_7());
                      			
                    }
                    pushFollow(FOLLOW_7);
                    ruleOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:2152:4: ( (lv_left_9_0= ruleLiteral ) )
                    // InternalGo.g:2153:5: (lv_left_9_0= ruleLiteral )
                    {
                    // InternalGo.g:2153:5: (lv_left_9_0= ruleLiteral )
                    // InternalGo.g:2154:6: lv_left_9_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarForAccess().getLeftLiteralParserRuleCall_1_8_0());
                      					
                    }
                    pushFollow(FOLLOW_38);
                    lv_left_9_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVarForRule());
                      						}
                      						set(
                      							current,
                      							"left",
                      							lv_left_9_0,
                      							"org.xtext.go.Go.Literal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    this_PontoVirgula_10=(Token)match(input,RULE_PONTOVIRGULA,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_PontoVirgula_10, grammarAccess.getVarForAccess().getPontoVirgulaTerminalRuleCall_1_9());
                      			
                    }
                    // InternalGo.g:2175:4: (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_ID) ) {
                        int LA41_1 = input.LA(2);

                        if ( ((LA41_1>=RULE_PLUSEQUALS && LA41_1<=RULE_MINUSEQUALS)) ) {
                            alt41=2;
                        }
                        else if ( ((LA41_1>=RULE_PLUSONE && LA41_1<=RULE_MINUSONE)) ) {
                            alt41=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 41, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalGo.g:2176:5: this_operationsOne_11= ruleoperationsOne
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getVarForAccess().getOperationsOneParserRuleCall_1_10_0());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_operationsOne_11=ruleoperationsOne();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current = this_operationsOne_11;
                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalGo.g:2185:5: this_OperationsOneEquals_12= ruleOperationsOneEquals
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getVarForAccess().getOperationsOneEqualsParserRuleCall_1_10_1());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_OperationsOneEquals_12=ruleOperationsOneEquals();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current = this_OperationsOneEquals_12;
                              					afterParserOrEnumRuleCall();
                              				
                            }

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
    // $ANTLR end "rulevarFor"


    // $ANTLR start "entryRuleLiteral"
    // InternalGo.g:2199:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalGo.g:2199:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalGo.g:2200:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalGo.g:2206:1: ruleLiteral returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleBoolean ) ) ) | ruleNumbers | this_ID_3= RULE_ID ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token this_ID_3=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2212:2: ( ( ( () ( (lv_value_1_0= ruleBoolean ) ) ) | ruleNumbers | this_ID_3= RULE_ID ) )
            // InternalGo.g:2213:2: ( ( () ( (lv_value_1_0= ruleBoolean ) ) ) | ruleNumbers | this_ID_3= RULE_ID )
            {
            // InternalGo.g:2213:2: ( ( () ( (lv_value_1_0= ruleBoolean ) ) ) | ruleNumbers | this_ID_3= RULE_ID )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 47:
            case 48:
                {
                alt43=1;
                }
                break;
            case RULE_INT:
                {
                alt43=2;
                }
                break;
            case RULE_ID:
                {
                alt43=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalGo.g:2214:3: ( () ( (lv_value_1_0= ruleBoolean ) ) )
                    {
                    // InternalGo.g:2214:3: ( () ( (lv_value_1_0= ruleBoolean ) ) )
                    // InternalGo.g:2215:4: () ( (lv_value_1_0= ruleBoolean ) )
                    {
                    // InternalGo.g:2215:4: ()
                    // InternalGo.g:2216:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getLiteralAccess().getLiteralAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGo.g:2222:4: ( (lv_value_1_0= ruleBoolean ) )
                    // InternalGo.g:2223:5: (lv_value_1_0= ruleBoolean )
                    {
                    // InternalGo.g:2223:5: (lv_value_1_0= ruleBoolean )
                    // InternalGo.g:2224:6: lv_value_1_0= ruleBoolean
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLiteralAccess().getValueBooleanParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLiteralRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_1_0,
                      							"org.xtext.go.Go.Boolean");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:2243:3: ruleNumbers
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getNumbersParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    ruleNumbers();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:2251:3: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_3, grammarAccess.getLiteralAccess().getIDTerminalRuleCall_2());
                      		
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
    // InternalGo.g:2259:1: entryRuleDecFunc returns [EObject current=null] : iv_ruleDecFunc= ruleDecFunc EOF ;
    public final EObject entryRuleDecFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecFunc = null;


        try {
            // InternalGo.g:2259:48: (iv_ruleDecFunc= ruleDecFunc EOF )
            // InternalGo.g:2260:2: iv_ruleDecFunc= ruleDecFunc EOF
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
    // InternalGo.g:2266:1: ruleDecFunc returns [EObject current=null] : ( ruleFUNC ( (lv_name_1_0= RULE_ID ) ) this_Open_parentheses_2= RULE_OPEN_PARENTHESES ( (lv_param_3_0= ruleParams ) )* this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES this_Open_Key_5= RULE_OPEN_KEY ( (lv_args_6_0= ruleGreeting ) )* this_Closed_Key_7= RULE_CLOSED_KEY ) ;
    public final EObject ruleDecFunc() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token this_Open_parentheses_2=null;
        Token this_Closed_parentheses_4=null;
        Token this_Open_Key_5=null;
        Token this_Closed_Key_7=null;
        EObject lv_param_3_0 = null;

        EObject lv_args_6_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2272:2: ( ( ruleFUNC ( (lv_name_1_0= RULE_ID ) ) this_Open_parentheses_2= RULE_OPEN_PARENTHESES ( (lv_param_3_0= ruleParams ) )* this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES this_Open_Key_5= RULE_OPEN_KEY ( (lv_args_6_0= ruleGreeting ) )* this_Closed_Key_7= RULE_CLOSED_KEY ) )
            // InternalGo.g:2273:2: ( ruleFUNC ( (lv_name_1_0= RULE_ID ) ) this_Open_parentheses_2= RULE_OPEN_PARENTHESES ( (lv_param_3_0= ruleParams ) )* this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES this_Open_Key_5= RULE_OPEN_KEY ( (lv_args_6_0= ruleGreeting ) )* this_Closed_Key_7= RULE_CLOSED_KEY )
            {
            // InternalGo.g:2273:2: ( ruleFUNC ( (lv_name_1_0= RULE_ID ) ) this_Open_parentheses_2= RULE_OPEN_PARENTHESES ( (lv_param_3_0= ruleParams ) )* this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES this_Open_Key_5= RULE_OPEN_KEY ( (lv_args_6_0= ruleGreeting ) )* this_Closed_Key_7= RULE_CLOSED_KEY )
            // InternalGo.g:2274:3: ruleFUNC ( (lv_name_1_0= RULE_ID ) ) this_Open_parentheses_2= RULE_OPEN_PARENTHESES ( (lv_param_3_0= ruleParams ) )* this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES this_Open_Key_5= RULE_OPEN_KEY ( (lv_args_6_0= ruleGreeting ) )* this_Closed_Key_7= RULE_CLOSED_KEY
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
            // InternalGo.g:2281:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGo.g:2282:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGo.g:2282:4: (lv_name_1_0= RULE_ID )
            // InternalGo.g:2283:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
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

            this_Open_parentheses_2=(Token)match(input,RULE_OPEN_PARENTHESES,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Open_parentheses_2, grammarAccess.getDecFuncAccess().getOpen_parenthesesTerminalRuleCall_2());
              		
            }
            // InternalGo.g:2303:3: ( (lv_param_3_0= ruleParams ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalGo.g:2304:4: (lv_param_3_0= ruleParams )
            	    {
            	    // InternalGo.g:2304:4: (lv_param_3_0= ruleParams )
            	    // InternalGo.g:2305:5: lv_param_3_0= ruleParams
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDecFuncAccess().getParamParamsParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_param_3_0=ruleParams();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDecFuncRule());
            	      					}
            	      					set(
            	      						current,
            	      						"param",
            	      						lv_param_3_0,
            	      						"org.xtext.go.Go.Params");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            this_Closed_parentheses_4=(Token)match(input,RULE_CLOSED_PARENTHESES,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Closed_parentheses_4, grammarAccess.getDecFuncAccess().getClosed_parenthesesTerminalRuleCall_4());
              		
            }
            this_Open_Key_5=(Token)match(input,RULE_OPEN_KEY,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Open_Key_5, grammarAccess.getDecFuncAccess().getOpen_KeyTerminalRuleCall_5());
              		
            }
            // InternalGo.g:2330:3: ( (lv_args_6_0= ruleGreeting ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=RULE_EOL && LA45_0<=RULE_ID)||LA45_0==RULE_OPEN_PARENTHESES||LA45_0==RULE_INT||LA45_0==52||(LA45_0>=55 && LA45_0<=58)||LA45_0==62||LA45_0==64) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalGo.g:2331:4: (lv_args_6_0= ruleGreeting )
            	    {
            	    // InternalGo.g:2331:4: (lv_args_6_0= ruleGreeting )
            	    // InternalGo.g:2332:5: lv_args_6_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDecFuncAccess().getArgsGreetingParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_31);
            	    lv_args_6_0=ruleGreeting();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDecFuncRule());
            	      					}
            	      					add(
            	      						current,
            	      						"args",
            	      						lv_args_6_0,
            	      						"org.xtext.go.Go.Greeting");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            this_Closed_Key_7=(Token)match(input,RULE_CLOSED_KEY,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Closed_Key_7, grammarAccess.getDecFuncAccess().getClosed_KeyTerminalRuleCall_7());
              		
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


    // $ANTLR start "entryRuleCallFunc"
    // InternalGo.g:2357:1: entryRuleCallFunc returns [EObject current=null] : iv_ruleCallFunc= ruleCallFunc EOF ;
    public final EObject entryRuleCallFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallFunc = null;


        try {
            // InternalGo.g:2357:49: (iv_ruleCallFunc= ruleCallFunc EOF )
            // InternalGo.g:2358:2: iv_ruleCallFunc= ruleCallFunc EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallFuncRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCallFunc=ruleCallFunc();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCallFunc; 
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
    // $ANTLR end "entryRuleCallFunc"


    // $ANTLR start "ruleCallFunc"
    // InternalGo.g:2364:1: ruleCallFunc returns [EObject current=null] : ( ( (lv_nameClass_0_0= RULE_ID ) ) this_Dot_1= RULE_DOT ( (lv_nameFunc_2_0= RULE_ID ) ) this_Open_parentheses_3= RULE_OPEN_PARENTHESES ( (lv_param_4_0= ruleParams ) )* this_Closed_parentheses_5= RULE_CLOSED_PARENTHESES ) ;
    public final EObject ruleCallFunc() throws RecognitionException {
        EObject current = null;

        Token lv_nameClass_0_0=null;
        Token this_Dot_1=null;
        Token lv_nameFunc_2_0=null;
        Token this_Open_parentheses_3=null;
        Token this_Closed_parentheses_5=null;
        EObject lv_param_4_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2370:2: ( ( ( (lv_nameClass_0_0= RULE_ID ) ) this_Dot_1= RULE_DOT ( (lv_nameFunc_2_0= RULE_ID ) ) this_Open_parentheses_3= RULE_OPEN_PARENTHESES ( (lv_param_4_0= ruleParams ) )* this_Closed_parentheses_5= RULE_CLOSED_PARENTHESES ) )
            // InternalGo.g:2371:2: ( ( (lv_nameClass_0_0= RULE_ID ) ) this_Dot_1= RULE_DOT ( (lv_nameFunc_2_0= RULE_ID ) ) this_Open_parentheses_3= RULE_OPEN_PARENTHESES ( (lv_param_4_0= ruleParams ) )* this_Closed_parentheses_5= RULE_CLOSED_PARENTHESES )
            {
            // InternalGo.g:2371:2: ( ( (lv_nameClass_0_0= RULE_ID ) ) this_Dot_1= RULE_DOT ( (lv_nameFunc_2_0= RULE_ID ) ) this_Open_parentheses_3= RULE_OPEN_PARENTHESES ( (lv_param_4_0= ruleParams ) )* this_Closed_parentheses_5= RULE_CLOSED_PARENTHESES )
            // InternalGo.g:2372:3: ( (lv_nameClass_0_0= RULE_ID ) ) this_Dot_1= RULE_DOT ( (lv_nameFunc_2_0= RULE_ID ) ) this_Open_parentheses_3= RULE_OPEN_PARENTHESES ( (lv_param_4_0= ruleParams ) )* this_Closed_parentheses_5= RULE_CLOSED_PARENTHESES
            {
            // InternalGo.g:2372:3: ( (lv_nameClass_0_0= RULE_ID ) )
            // InternalGo.g:2373:4: (lv_nameClass_0_0= RULE_ID )
            {
            // InternalGo.g:2373:4: (lv_nameClass_0_0= RULE_ID )
            // InternalGo.g:2374:5: lv_nameClass_0_0= RULE_ID
            {
            lv_nameClass_0_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_nameClass_0_0, grammarAccess.getCallFuncAccess().getNameClassIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCallFuncRule());
              					}
              					setWithLastConsumed(
              						current,
              						"nameClass",
              						lv_nameClass_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            this_Dot_1=(Token)match(input,RULE_DOT,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Dot_1, grammarAccess.getCallFuncAccess().getDotTerminalRuleCall_1());
              		
            }
            // InternalGo.g:2394:3: ( (lv_nameFunc_2_0= RULE_ID ) )
            // InternalGo.g:2395:4: (lv_nameFunc_2_0= RULE_ID )
            {
            // InternalGo.g:2395:4: (lv_nameFunc_2_0= RULE_ID )
            // InternalGo.g:2396:5: lv_nameFunc_2_0= RULE_ID
            {
            lv_nameFunc_2_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_nameFunc_2_0, grammarAccess.getCallFuncAccess().getNameFuncIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCallFuncRule());
              					}
              					setWithLastConsumed(
              						current,
              						"nameFunc",
              						lv_nameFunc_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            this_Open_parentheses_3=(Token)match(input,RULE_OPEN_PARENTHESES,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Open_parentheses_3, grammarAccess.getCallFuncAccess().getOpen_parenthesesTerminalRuleCall_3());
              		
            }
            // InternalGo.g:2416:3: ( (lv_param_4_0= ruleParams ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalGo.g:2417:4: (lv_param_4_0= ruleParams )
            	    {
            	    // InternalGo.g:2417:4: (lv_param_4_0= ruleParams )
            	    // InternalGo.g:2418:5: lv_param_4_0= ruleParams
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCallFuncAccess().getParamParamsParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_param_4_0=ruleParams();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getCallFuncRule());
            	      					}
            	      					set(
            	      						current,
            	      						"param",
            	      						lv_param_4_0,
            	      						"org.xtext.go.Go.Params");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            this_Closed_parentheses_5=(Token)match(input,RULE_CLOSED_PARENTHESES,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Closed_parentheses_5, grammarAccess.getCallFuncAccess().getClosed_parenthesesTerminalRuleCall_5());
              		
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
    // $ANTLR end "ruleCallFunc"


    // $ANTLR start "entryRuleTypes"
    // InternalGo.g:2443:1: entryRuleTypes returns [String current=null] : iv_ruleTypes= ruleTypes EOF ;
    public final String entryRuleTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypes = null;


        try {
            // InternalGo.g:2443:45: (iv_ruleTypes= ruleTypes EOF )
            // InternalGo.g:2444:2: iv_ruleTypes= ruleTypes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypes=ruleTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypes.getText(); 
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
    // $ANTLR end "entryRuleTypes"


    // $ANTLR start "ruleTypes"
    // InternalGo.g:2450:1: ruleTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TYPE_0= ruleTYPE | kw= 'string' | kw= 'int' | kw= 'bool' | kw= 'byte' | kw= 'rune' | kw= 'float32' | kw= 'float64' ) ;
    public final AntlrDatatypeRuleToken ruleTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TYPE_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2456:2: ( (this_TYPE_0= ruleTYPE | kw= 'string' | kw= 'int' | kw= 'bool' | kw= 'byte' | kw= 'rune' | kw= 'float32' | kw= 'float64' ) )
            // InternalGo.g:2457:2: (this_TYPE_0= ruleTYPE | kw= 'string' | kw= 'int' | kw= 'bool' | kw= 'byte' | kw= 'rune' | kw= 'float32' | kw= 'float64' )
            {
            // InternalGo.g:2457:2: (this_TYPE_0= ruleTYPE | kw= 'string' | kw= 'int' | kw= 'bool' | kw= 'byte' | kw= 'rune' | kw= 'float32' | kw= 'float64' )
            int alt47=8;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt47=1;
                }
                break;
            case 40:
                {
                alt47=2;
                }
                break;
            case 41:
                {
                alt47=3;
                }
                break;
            case 42:
                {
                alt47=4;
                }
                break;
            case 43:
                {
                alt47=5;
                }
                break;
            case 44:
                {
                alt47=6;
                }
                break;
            case 45:
                {
                alt47=7;
                }
                break;
            case 46:
                {
                alt47=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalGo.g:2458:3: this_TYPE_0= ruleTYPE
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypesAccess().getTYPEParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TYPE_0=ruleTYPE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_TYPE_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2469:3: kw= 'string'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getStringKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:2475:3: kw= 'int'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getIntKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:2481:3: kw= 'bool'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getBoolKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:2487:3: kw= 'byte'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getByteKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGo.g:2493:3: kw= 'rune'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getRuneKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGo.g:2499:3: kw= 'float32'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getFloat32Keyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalGo.g:2505:3: kw= 'float64'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getFloat64Keyword_7());
                      		
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
    // $ANTLR end "ruleTypes"


    // $ANTLR start "entryRuleModif"
    // InternalGo.g:2514:1: entryRuleModif returns [String current=null] : iv_ruleModif= ruleModif EOF ;
    public final String entryRuleModif() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModif = null;


        try {
            // InternalGo.g:2514:45: (iv_ruleModif= ruleModif EOF )
            // InternalGo.g:2515:2: iv_ruleModif= ruleModif EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModifRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModif=ruleModif();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModif.getText(); 
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
    // $ANTLR end "entryRuleModif"


    // $ANTLR start "ruleModif"
    // InternalGo.g:2521:1: ruleModif returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VAR_0= ruleVAR | this_CONST_1= ruleCONST ) ;
    public final AntlrDatatypeRuleToken ruleModif() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VAR_0 = null;

        AntlrDatatypeRuleToken this_CONST_1 = null;



        	enterRule();

        try {
            // InternalGo.g:2527:2: ( (this_VAR_0= ruleVAR | this_CONST_1= ruleCONST ) )
            // InternalGo.g:2528:2: (this_VAR_0= ruleVAR | this_CONST_1= ruleCONST )
            {
            // InternalGo.g:2528:2: (this_VAR_0= ruleVAR | this_CONST_1= ruleCONST )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==62) ) {
                alt48=1;
            }
            else if ( (LA48_0==52) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalGo.g:2529:3: this_VAR_0= ruleVAR
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModifAccess().getVARParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VAR_0=ruleVAR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_VAR_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2540:3: this_CONST_1= ruleCONST
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModifAccess().getCONSTParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CONST_1=ruleCONST();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_CONST_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

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
    // $ANTLR end "ruleModif"


    // $ANTLR start "entryRuleBoolean"
    // InternalGo.g:2554:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalGo.g:2554:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalGo.g:2555:2: iv_ruleBoolean= ruleBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolean.getText(); 
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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalGo.g:2561:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2567:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalGo.g:2568:2: (kw= 'true' | kw= 'false' )
            {
            // InternalGo.g:2568:2: (kw= 'true' | kw= 'false' )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==47) ) {
                alt49=1;
            }
            else if ( (LA49_0==48) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalGo.g:2569:3: kw= 'true'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2575:3: kw= 'false'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1());
                      		
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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleBREAK"
    // InternalGo.g:2584:1: entryRuleBREAK returns [String current=null] : iv_ruleBREAK= ruleBREAK EOF ;
    public final String entryRuleBREAK() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBREAK = null;


        try {
            // InternalGo.g:2584:45: (iv_ruleBREAK= ruleBREAK EOF )
            // InternalGo.g:2585:2: iv_ruleBREAK= ruleBREAK EOF
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
    // InternalGo.g:2591:1: ruleBREAK returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'break' ;
    public final AntlrDatatypeRuleToken ruleBREAK() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2597:2: (kw= 'break' )
            // InternalGo.g:2598:2: kw= 'break'
            {
            kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2606:1: entryRuleCASE returns [String current=null] : iv_ruleCASE= ruleCASE EOF ;
    public final String entryRuleCASE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCASE = null;


        try {
            // InternalGo.g:2606:44: (iv_ruleCASE= ruleCASE EOF )
            // InternalGo.g:2607:2: iv_ruleCASE= ruleCASE EOF
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
    // InternalGo.g:2613:1: ruleCASE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'case' ;
    public final AntlrDatatypeRuleToken ruleCASE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2619:2: (kw= 'case' )
            // InternalGo.g:2620:2: kw= 'case'
            {
            kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2628:1: entryRuleCHAN returns [String current=null] : iv_ruleCHAN= ruleCHAN EOF ;
    public final String entryRuleCHAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCHAN = null;


        try {
            // InternalGo.g:2628:44: (iv_ruleCHAN= ruleCHAN EOF )
            // InternalGo.g:2629:2: iv_ruleCHAN= ruleCHAN EOF
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
    // InternalGo.g:2635:1: ruleCHAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'chan' ;
    public final AntlrDatatypeRuleToken ruleCHAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2641:2: (kw= 'chan' )
            // InternalGo.g:2642:2: kw= 'chan'
            {
            kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2650:1: entryRuleCONST returns [String current=null] : iv_ruleCONST= ruleCONST EOF ;
    public final String entryRuleCONST() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCONST = null;


        try {
            // InternalGo.g:2650:45: (iv_ruleCONST= ruleCONST EOF )
            // InternalGo.g:2651:2: iv_ruleCONST= ruleCONST EOF
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
    // InternalGo.g:2657:1: ruleCONST returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'const' ;
    public final AntlrDatatypeRuleToken ruleCONST() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2663:2: (kw= 'const' )
            // InternalGo.g:2664:2: kw= 'const'
            {
            kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2672:1: entryRuleCONTINUE returns [String current=null] : iv_ruleCONTINUE= ruleCONTINUE EOF ;
    public final String entryRuleCONTINUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCONTINUE = null;


        try {
            // InternalGo.g:2672:48: (iv_ruleCONTINUE= ruleCONTINUE EOF )
            // InternalGo.g:2673:2: iv_ruleCONTINUE= ruleCONTINUE EOF
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
    // InternalGo.g:2679:1: ruleCONTINUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'continue' ;
    public final AntlrDatatypeRuleToken ruleCONTINUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2685:2: (kw= 'continue' )
            // InternalGo.g:2686:2: kw= 'continue'
            {
            kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2694:1: entryRuleELSE returns [String current=null] : iv_ruleELSE= ruleELSE EOF ;
    public final String entryRuleELSE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELSE = null;


        try {
            // InternalGo.g:2694:44: (iv_ruleELSE= ruleELSE EOF )
            // InternalGo.g:2695:2: iv_ruleELSE= ruleELSE EOF
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
    // InternalGo.g:2701:1: ruleELSE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'else' ;
    public final AntlrDatatypeRuleToken ruleELSE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2707:2: (kw= 'else' )
            // InternalGo.g:2708:2: kw= 'else'
            {
            kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2716:1: entryRuleFOR returns [String current=null] : iv_ruleFOR= ruleFOR EOF ;
    public final String entryRuleFOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFOR = null;


        try {
            // InternalGo.g:2716:43: (iv_ruleFOR= ruleFOR EOF )
            // InternalGo.g:2717:2: iv_ruleFOR= ruleFOR EOF
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
    // InternalGo.g:2723:1: ruleFOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'for' ;
    public final AntlrDatatypeRuleToken ruleFOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2729:2: (kw= 'for' )
            // InternalGo.g:2730:2: kw= 'for'
            {
            kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2738:1: entryRuleFUNC returns [String current=null] : iv_ruleFUNC= ruleFUNC EOF ;
    public final String entryRuleFUNC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFUNC = null;


        try {
            // InternalGo.g:2738:44: (iv_ruleFUNC= ruleFUNC EOF )
            // InternalGo.g:2739:2: iv_ruleFUNC= ruleFUNC EOF
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
    // InternalGo.g:2745:1: ruleFUNC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'func' ;
    public final AntlrDatatypeRuleToken ruleFUNC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2751:2: (kw= 'func' )
            // InternalGo.g:2752:2: kw= 'func'
            {
            kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2760:1: entryRuleIF returns [String current=null] : iv_ruleIF= ruleIF EOF ;
    public final String entryRuleIF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIF = null;


        try {
            // InternalGo.g:2760:42: (iv_ruleIF= ruleIF EOF )
            // InternalGo.g:2761:2: iv_ruleIF= ruleIF EOF
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
    // InternalGo.g:2767:1: ruleIF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'if' ;
    public final AntlrDatatypeRuleToken ruleIF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2773:2: (kw= 'if' )
            // InternalGo.g:2774:2: kw= 'if'
            {
            kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2782:1: entryRuleIMPORT returns [String current=null] : iv_ruleIMPORT= ruleIMPORT EOF ;
    public final String entryRuleIMPORT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIMPORT = null;


        try {
            // InternalGo.g:2782:46: (iv_ruleIMPORT= ruleIMPORT EOF )
            // InternalGo.g:2783:2: iv_ruleIMPORT= ruleIMPORT EOF
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
    // InternalGo.g:2789:1: ruleIMPORT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'import' ;
    public final AntlrDatatypeRuleToken ruleIMPORT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2795:2: (kw= 'import' )
            // InternalGo.g:2796:2: kw= 'import'
            {
            kw=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2804:1: entryRuleRETURN returns [String current=null] : iv_ruleRETURN= ruleRETURN EOF ;
    public final String entryRuleRETURN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRETURN = null;


        try {
            // InternalGo.g:2804:46: (iv_ruleRETURN= ruleRETURN EOF )
            // InternalGo.g:2805:2: iv_ruleRETURN= ruleRETURN EOF
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
    // InternalGo.g:2811:1: ruleRETURN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'return' ;
    public final AntlrDatatypeRuleToken ruleRETURN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2817:2: (kw= 'return' )
            // InternalGo.g:2818:2: kw= 'return'
            {
            kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2826:1: entryRulePACKAGE returns [String current=null] : iv_rulePACKAGE= rulePACKAGE EOF ;
    public final String entryRulePACKAGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePACKAGE = null;


        try {
            // InternalGo.g:2826:47: (iv_rulePACKAGE= rulePACKAGE EOF )
            // InternalGo.g:2827:2: iv_rulePACKAGE= rulePACKAGE EOF
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
    // InternalGo.g:2833:1: rulePACKAGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'package' ;
    public final AntlrDatatypeRuleToken rulePACKAGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2839:2: (kw= 'package' )
            // InternalGo.g:2840:2: kw= 'package'
            {
            kw=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2848:1: entryRuleTYPE returns [String current=null] : iv_ruleTYPE= ruleTYPE EOF ;
    public final String entryRuleTYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTYPE = null;


        try {
            // InternalGo.g:2848:44: (iv_ruleTYPE= ruleTYPE EOF )
            // InternalGo.g:2849:2: iv_ruleTYPE= ruleTYPE EOF
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
    // InternalGo.g:2855:1: ruleTYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'type' ;
    public final AntlrDatatypeRuleToken ruleTYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2861:2: (kw= 'type' )
            // InternalGo.g:2862:2: kw= 'type'
            {
            kw=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2870:1: entryRuleVAR returns [String current=null] : iv_ruleVAR= ruleVAR EOF ;
    public final String entryRuleVAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVAR = null;


        try {
            // InternalGo.g:2870:43: (iv_ruleVAR= ruleVAR EOF )
            // InternalGo.g:2871:2: iv_ruleVAR= ruleVAR EOF
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
    // InternalGo.g:2877:1: ruleVAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'var' ;
    public final AntlrDatatypeRuleToken ruleVAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2883:2: (kw= 'var' )
            // InternalGo.g:2884:2: kw= 'var'
            {
            kw=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2892:1: entryRuleRANGE returns [String current=null] : iv_ruleRANGE= ruleRANGE EOF ;
    public final String entryRuleRANGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRANGE = null;


        try {
            // InternalGo.g:2892:45: (iv_ruleRANGE= ruleRANGE EOF )
            // InternalGo.g:2893:2: iv_ruleRANGE= ruleRANGE EOF
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
    // InternalGo.g:2899:1: ruleRANGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'range' ;
    public final AntlrDatatypeRuleToken ruleRANGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2905:2: (kw= 'range' )
            // InternalGo.g:2906:2: kw= 'range'
            {
            kw=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleDataType"
    // InternalGo.g:2914:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalGo.g:2914:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalGo.g:2915:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalGo.g:2921:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGo.g:2927:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGo.g:2928:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGo.g:2928:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGo.g:2929:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
              		
            }
            // InternalGo.g:2933:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGo.g:2934:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGo.g:2934:4: (lv_name_1_0= RULE_ID )
            // InternalGo.g:2935:5: lv_name_1_0= RULE_ID
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
        // InternalGo.g:1407:4: ( ruleELSE )
        // InternalGo.g:1407:5: ruleELSE
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
        // InternalGo.g:1427:4: ( ruleELSE )
        // InternalGo.g:1427:5: ruleELSE
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


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\4\2\5\1\6\12\uffff";
    static final String dfa_3s = "\1\100\2\7\1\40\12\uffff";
    static final String dfa_4s = "\4\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\12\1\1\1\2\1\11";
    static final String dfa_5s = "\16\uffff}>";
    static final String[] dfa_6s = {
            "\1\6\1\3\1\uffff\1\10\2\uffff\1\10\51\uffff\1\2\2\uffff\1\12\1\5\1\7\1\11\3\uffff\1\1\1\uffff\1\4",
            "\1\14\1\uffff\1\13",
            "\1\14\1\uffff\1\13",
            "\1\14\10\uffff\2\10\4\uffff\1\15\12\uffff\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "114:2: (this_MultDecVars_0= ruleMultDecVars | this_DecVar_1= ruleDecVar | this_DataType_2= ruleDataType | this_DecFunc_3= ruleDecFunc | this_EOL_4= RULE_EOL | this_Condition_5= ruleCondition | this_Operations_6= ruleOperations | ruleDecImport | this_CallFunc_8= ruleCallFunc | this_CallFor_9= ruleCallFor )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x47900000000004B2L,0x0000000000000001L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x20007F0000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00018000000046A0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0001800000004680L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000004100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000000004A0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x47900000000024B0L,0x0000000000000001L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x40118000000056A0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000F800000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000000F800000000L});

}