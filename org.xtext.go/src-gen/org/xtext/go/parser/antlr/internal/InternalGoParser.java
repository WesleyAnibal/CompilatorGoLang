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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_ID", "RULE_COMMA", "RULE_OPEN_PARENTHESES", "RULE_CLOSED_PARENTHESES", "RULE_OPEN_BRACKETS", "RULE_INT", "RULE_CLOSED_BRACKETS", "RULE_OPEN_KEY", "RULE_CLOSED_KEY", "RULE_STRING", "RULE_PLUS", "RULE_MINUS", "RULE_ASTERICS", "RULE_BAR", "RULE_DOT", "RULE_NEWLINE", "RULE_COMMENTS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "':='", "'||'", "'&&'", "'<'", "'<='", "'=='", "'>='", "'>'", "'string'", "'int'", "'bool'", "'byte'", "'rune'", "'float32'", "'float64'", "'true'", "'false'", "'break'", "'case'", "'chan'", "'const'", "'continue'", "'else'", "'for'", "'func'", "'if'", "'import'", "'return'", "'package'", "'type'", "'var'", "'range'", "'datatype'"
    };
    public static final int T__50=50;
    public static final int RULE_OPEN_KEY=12;
    public static final int RULE_OPEN_PARENTHESES=7;
    public static final int RULE_BAR=18;
    public static final int RULE_COMMENTS=21;
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
    public static final int RULE_ID=5;
    public static final int RULE_EOL=4;
    public static final int RULE_COMMA=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int RULE_ML_COMMENT=22;
    public static final int RULE_NEWLINE=20;
    public static final int RULE_ASTERICS=17;
    public static final int RULE_STRING=14;
    public static final int RULE_SL_COMMENT=23;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_OPEN_BRACKETS=9;
    public static final int RULE_PLUS=15;
    public static final int T__36=36;
    public static final int RULE_DOT=19;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=24;
    public static final int RULE_CLOSED_KEY=13;
    public static final int RULE_ANY_OTHER=25;
    public static final int RULE_MINUS=16;
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

                if ( ((LA1_0>=RULE_EOL && LA1_0<=RULE_ID)||LA1_0==RULE_OPEN_PARENTHESES||LA1_0==RULE_INT||LA1_0==47||(LA1_0>=51 && LA1_0<=53)||LA1_0==57||LA1_0==59) ) {
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
    // InternalGo.g:107:1: ruleGreeting returns [EObject current=null] : (this_MultDecVars_0= ruleMultDecVars | this_DecVar_1= ruleDecVar | this_DataType_2= ruleDataType | this_DecFunc_3= ruleDecFunc | this_EOL_4= RULE_EOL | this_Condition_5= ruleCondition | this_Operations_6= ruleOperations | ruleDecImport ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token this_EOL_4=null;
        EObject this_MultDecVars_0 = null;

        EObject this_DecVar_1 = null;

        EObject this_DataType_2 = null;

        EObject this_DecFunc_3 = null;

        EObject this_Condition_5 = null;

        EObject this_Operations_6 = null;



        	enterRule();

        try {
            // InternalGo.g:113:2: ( (this_MultDecVars_0= ruleMultDecVars | this_DecVar_1= ruleDecVar | this_DataType_2= ruleDataType | this_DecFunc_3= ruleDecFunc | this_EOL_4= RULE_EOL | this_Condition_5= ruleCondition | this_Operations_6= ruleOperations | ruleDecImport ) )
            // InternalGo.g:114:2: (this_MultDecVars_0= ruleMultDecVars | this_DecVar_1= ruleDecVar | this_DataType_2= ruleDataType | this_DecFunc_3= ruleDecFunc | this_EOL_4= RULE_EOL | this_Condition_5= ruleCondition | this_Operations_6= ruleOperations | ruleDecImport )
            {
            // InternalGo.g:114:2: (this_MultDecVars_0= ruleMultDecVars | this_DecVar_1= ruleDecVar | this_DataType_2= ruleDataType | this_DecFunc_3= ruleDecFunc | this_EOL_4= RULE_EOL | this_Condition_5= ruleCondition | this_Operations_6= ruleOperations | ruleDecImport )
            int alt2=8;
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
    // InternalGo.g:185:1: entryRuleDecVar returns [EObject current=null] : iv_ruleDecVar= ruleDecVar EOF ;
    public final EObject entryRuleDecVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecVar = null;


        try {
            // InternalGo.g:185:47: (iv_ruleDecVar= ruleDecVar EOF )
            // InternalGo.g:186:2: iv_ruleDecVar= ruleDecVar EOF
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
    // InternalGo.g:192:1: ruleDecVar returns [EObject current=null] : (this_DecVars_0= ruleDecVars | ( ruleModif ( (lv_vars_2_0= RULE_ID ) ) (this_Comma_3= RULE_COMMA ( (lv_vars_4_0= RULE_ID ) ) )* ruleTypes (otherlv_6= '=' ( ( (lv_atrb_7_1= ruleAtri | lv_atrb_7_2= RULE_ID ) ) ) (this_Comma_8= RULE_COMMA ( ( (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID ) ) ) )* )? ) ) ;
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
            // InternalGo.g:198:2: ( (this_DecVars_0= ruleDecVars | ( ruleModif ( (lv_vars_2_0= RULE_ID ) ) (this_Comma_3= RULE_COMMA ( (lv_vars_4_0= RULE_ID ) ) )* ruleTypes (otherlv_6= '=' ( ( (lv_atrb_7_1= ruleAtri | lv_atrb_7_2= RULE_ID ) ) ) (this_Comma_8= RULE_COMMA ( ( (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID ) ) ) )* )? ) ) )
            // InternalGo.g:199:2: (this_DecVars_0= ruleDecVars | ( ruleModif ( (lv_vars_2_0= RULE_ID ) ) (this_Comma_3= RULE_COMMA ( (lv_vars_4_0= RULE_ID ) ) )* ruleTypes (otherlv_6= '=' ( ( (lv_atrb_7_1= ruleAtri | lv_atrb_7_2= RULE_ID ) ) ) (this_Comma_8= RULE_COMMA ( ( (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID ) ) ) )* )? ) )
            {
            // InternalGo.g:199:2: (this_DecVars_0= ruleDecVars | ( ruleModif ( (lv_vars_2_0= RULE_ID ) ) (this_Comma_3= RULE_COMMA ( (lv_vars_4_0= RULE_ID ) ) )* ruleTypes (otherlv_6= '=' ( ( (lv_atrb_7_1= ruleAtri | lv_atrb_7_2= RULE_ID ) ) ) (this_Comma_8= RULE_COMMA ( ( (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID ) ) ) )* )? ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==47||LA8_0==57) ) {
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
                    // InternalGo.g:200:3: this_DecVars_0= ruleDecVars
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
                    // InternalGo.g:209:3: ( ruleModif ( (lv_vars_2_0= RULE_ID ) ) (this_Comma_3= RULE_COMMA ( (lv_vars_4_0= RULE_ID ) ) )* ruleTypes (otherlv_6= '=' ( ( (lv_atrb_7_1= ruleAtri | lv_atrb_7_2= RULE_ID ) ) ) (this_Comma_8= RULE_COMMA ( ( (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID ) ) ) )* )? )
                    {
                    // InternalGo.g:209:3: ( ruleModif ( (lv_vars_2_0= RULE_ID ) ) (this_Comma_3= RULE_COMMA ( (lv_vars_4_0= RULE_ID ) ) )* ruleTypes (otherlv_6= '=' ( ( (lv_atrb_7_1= ruleAtri | lv_atrb_7_2= RULE_ID ) ) ) (this_Comma_8= RULE_COMMA ( ( (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID ) ) ) )* )? )
                    // InternalGo.g:210:4: ruleModif ( (lv_vars_2_0= RULE_ID ) ) (this_Comma_3= RULE_COMMA ( (lv_vars_4_0= RULE_ID ) ) )* ruleTypes (otherlv_6= '=' ( ( (lv_atrb_7_1= ruleAtri | lv_atrb_7_2= RULE_ID ) ) ) (this_Comma_8= RULE_COMMA ( ( (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID ) ) ) )* )?
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
                    // InternalGo.g:217:4: ( (lv_vars_2_0= RULE_ID ) )
                    // InternalGo.g:218:5: (lv_vars_2_0= RULE_ID )
                    {
                    // InternalGo.g:218:5: (lv_vars_2_0= RULE_ID )
                    // InternalGo.g:219:6: lv_vars_2_0= RULE_ID
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

                    // InternalGo.g:235:4: (this_Comma_3= RULE_COMMA ( (lv_vars_4_0= RULE_ID ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_COMMA) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalGo.g:236:5: this_Comma_3= RULE_COMMA ( (lv_vars_4_0= RULE_ID ) )
                    	    {
                    	    this_Comma_3=(Token)match(input,RULE_COMMA,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_Comma_3, grammarAccess.getDecVarAccess().getCommaTerminalRuleCall_1_2_0());
                    	      				
                    	    }
                    	    // InternalGo.g:240:5: ( (lv_vars_4_0= RULE_ID ) )
                    	    // InternalGo.g:241:6: (lv_vars_4_0= RULE_ID )
                    	    {
                    	    // InternalGo.g:241:6: (lv_vars_4_0= RULE_ID )
                    	    // InternalGo.g:242:7: lv_vars_4_0= RULE_ID
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
                    // InternalGo.g:266:4: (otherlv_6= '=' ( ( (lv_atrb_7_1= ruleAtri | lv_atrb_7_2= RULE_ID ) ) ) (this_Comma_8= RULE_COMMA ( ( (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID ) ) ) )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==26) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalGo.g:267:5: otherlv_6= '=' ( ( (lv_atrb_7_1= ruleAtri | lv_atrb_7_2= RULE_ID ) ) ) (this_Comma_8= RULE_COMMA ( ( (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID ) ) ) )*
                            {
                            otherlv_6=(Token)match(input,26,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getDecVarAccess().getEqualsSignKeyword_1_4_0());
                              				
                            }
                            // InternalGo.g:271:5: ( ( (lv_atrb_7_1= ruleAtri | lv_atrb_7_2= RULE_ID ) ) )
                            // InternalGo.g:272:6: ( (lv_atrb_7_1= ruleAtri | lv_atrb_7_2= RULE_ID ) )
                            {
                            // InternalGo.g:272:6: ( (lv_atrb_7_1= ruleAtri | lv_atrb_7_2= RULE_ID ) )
                            // InternalGo.g:273:7: (lv_atrb_7_1= ruleAtri | lv_atrb_7_2= RULE_ID )
                            {
                            // InternalGo.g:273:7: (lv_atrb_7_1= ruleAtri | lv_atrb_7_2= RULE_ID )
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( ((LA4_0>=RULE_OPEN_BRACKETS && LA4_0<=RULE_INT)||LA4_0==RULE_STRING||(LA4_0>=42 && LA4_0<=43)) ) {
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
                                    // InternalGo.g:274:8: lv_atrb_7_1= ruleAtri
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
                                    // InternalGo.g:290:8: lv_atrb_7_2= RULE_ID
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

                            // InternalGo.g:307:5: (this_Comma_8= RULE_COMMA ( ( (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID ) ) ) )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( (LA6_0==RULE_COMMA) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // InternalGo.g:308:6: this_Comma_8= RULE_COMMA ( ( (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID ) ) )
                            	    {
                            	    this_Comma_8=(Token)match(input,RULE_COMMA,FOLLOW_7); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(this_Comma_8, grammarAccess.getDecVarAccess().getCommaTerminalRuleCall_1_4_2_0());
                            	      					
                            	    }
                            	    // InternalGo.g:312:6: ( ( (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID ) ) )
                            	    // InternalGo.g:313:7: ( (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID ) )
                            	    {
                            	    // InternalGo.g:313:7: ( (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID ) )
                            	    // InternalGo.g:314:8: (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID )
                            	    {
                            	    // InternalGo.g:314:8: (lv_atrb_9_1= ruleAtri | lv_atrb_9_2= RULE_ID )
                            	    int alt5=2;
                            	    int LA5_0 = input.LA(1);

                            	    if ( ((LA5_0>=RULE_OPEN_BRACKETS && LA5_0<=RULE_INT)||LA5_0==RULE_STRING||(LA5_0>=42 && LA5_0<=43)) ) {
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
                            	            // InternalGo.g:315:9: lv_atrb_9_1= ruleAtri
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
                            	            // InternalGo.g:331:9: lv_atrb_9_2= RULE_ID
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
    // InternalGo.g:355:1: entryRuleMultDecVars returns [EObject current=null] : iv_ruleMultDecVars= ruleMultDecVars EOF ;
    public final EObject entryRuleMultDecVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultDecVars = null;


        try {
            // InternalGo.g:355:52: (iv_ruleMultDecVars= ruleMultDecVars EOF )
            // InternalGo.g:356:2: iv_ruleMultDecVars= ruleMultDecVars EOF
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
    // InternalGo.g:362:1: ruleMultDecVars returns [EObject current=null] : ( ruleModif this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( ruleTypeValue | ( (lv_value_5_0= RULE_ID ) ) ) )* this_Closed_parentheses_6= RULE_CLOSED_PARENTHESES ) ;
    public final EObject ruleMultDecVars() throws RecognitionException {
        EObject current = null;

        Token this_Open_parentheses_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_value_5_0=null;
        Token this_Closed_parentheses_6=null;


        	enterRule();

        try {
            // InternalGo.g:368:2: ( ( ruleModif this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( ruleTypeValue | ( (lv_value_5_0= RULE_ID ) ) ) )* this_Closed_parentheses_6= RULE_CLOSED_PARENTHESES ) )
            // InternalGo.g:369:2: ( ruleModif this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( ruleTypeValue | ( (lv_value_5_0= RULE_ID ) ) ) )* this_Closed_parentheses_6= RULE_CLOSED_PARENTHESES )
            {
            // InternalGo.g:369:2: ( ruleModif this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( ruleTypeValue | ( (lv_value_5_0= RULE_ID ) ) ) )* this_Closed_parentheses_6= RULE_CLOSED_PARENTHESES )
            // InternalGo.g:370:3: ruleModif this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( ruleTypeValue | ( (lv_value_5_0= RULE_ID ) ) ) )* this_Closed_parentheses_6= RULE_CLOSED_PARENTHESES
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
            // InternalGo.g:381:3: ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( ruleTypeValue | ( (lv_value_5_0= RULE_ID ) ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGo.g:382:4: ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( ruleTypeValue | ( (lv_value_5_0= RULE_ID ) ) )
            	    {
            	    // InternalGo.g:382:4: ( (lv_name_2_0= RULE_ID ) )
            	    // InternalGo.g:383:5: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalGo.g:383:5: (lv_name_2_0= RULE_ID )
            	    // InternalGo.g:384:6: lv_name_2_0= RULE_ID
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

            	    otherlv_3=(Token)match(input,26,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getMultDecVarsAccess().getEqualsSignKeyword_2_1());
            	      			
            	    }
            	    // InternalGo.g:404:4: ( ruleTypeValue | ( (lv_value_5_0= RULE_ID ) ) )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==RULE_INT||LA9_0==RULE_STRING||(LA9_0>=42 && LA9_0<=43)) ) {
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
            	            // InternalGo.g:405:5: ruleTypeValue
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
            	            // InternalGo.g:413:5: ( (lv_value_5_0= RULE_ID ) )
            	            {
            	            // InternalGo.g:413:5: ( (lv_value_5_0= RULE_ID ) )
            	            // InternalGo.g:414:6: (lv_value_5_0= RULE_ID )
            	            {
            	            // InternalGo.g:414:6: (lv_value_5_0= RULE_ID )
            	            // InternalGo.g:415:7: lv_value_5_0= RULE_ID
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
    // InternalGo.g:441:1: entryRuleDecVars returns [EObject current=null] : iv_ruleDecVars= ruleDecVars EOF ;
    public final EObject entryRuleDecVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecVars = null;


        try {
            // InternalGo.g:441:48: (iv_ruleDecVars= ruleDecVars EOF )
            // InternalGo.g:442:2: iv_ruleDecVars= ruleDecVars EOF
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
    // InternalGo.g:448:1: ruleDecVars returns [EObject current=null] : ( ( (lv_vars_0_0= RULE_ID ) ) (this_Comma_1= RULE_COMMA ( (lv_vars_2_0= RULE_ID ) ) )* otherlv_3= ':=' ( ( (lv_atrb_4_1= ruleAtri | lv_atrb_4_2= RULE_ID ) ) ) (this_Comma_5= RULE_COMMA ( ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) ) ) )* ) ;
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
            // InternalGo.g:454:2: ( ( ( (lv_vars_0_0= RULE_ID ) ) (this_Comma_1= RULE_COMMA ( (lv_vars_2_0= RULE_ID ) ) )* otherlv_3= ':=' ( ( (lv_atrb_4_1= ruleAtri | lv_atrb_4_2= RULE_ID ) ) ) (this_Comma_5= RULE_COMMA ( ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) ) ) )* ) )
            // InternalGo.g:455:2: ( ( (lv_vars_0_0= RULE_ID ) ) (this_Comma_1= RULE_COMMA ( (lv_vars_2_0= RULE_ID ) ) )* otherlv_3= ':=' ( ( (lv_atrb_4_1= ruleAtri | lv_atrb_4_2= RULE_ID ) ) ) (this_Comma_5= RULE_COMMA ( ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) ) ) )* )
            {
            // InternalGo.g:455:2: ( ( (lv_vars_0_0= RULE_ID ) ) (this_Comma_1= RULE_COMMA ( (lv_vars_2_0= RULE_ID ) ) )* otherlv_3= ':=' ( ( (lv_atrb_4_1= ruleAtri | lv_atrb_4_2= RULE_ID ) ) ) (this_Comma_5= RULE_COMMA ( ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) ) ) )* )
            // InternalGo.g:456:3: ( (lv_vars_0_0= RULE_ID ) ) (this_Comma_1= RULE_COMMA ( (lv_vars_2_0= RULE_ID ) ) )* otherlv_3= ':=' ( ( (lv_atrb_4_1= ruleAtri | lv_atrb_4_2= RULE_ID ) ) ) (this_Comma_5= RULE_COMMA ( ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) ) ) )*
            {
            // InternalGo.g:456:3: ( (lv_vars_0_0= RULE_ID ) )
            // InternalGo.g:457:4: (lv_vars_0_0= RULE_ID )
            {
            // InternalGo.g:457:4: (lv_vars_0_0= RULE_ID )
            // InternalGo.g:458:5: lv_vars_0_0= RULE_ID
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

            // InternalGo.g:474:3: (this_Comma_1= RULE_COMMA ( (lv_vars_2_0= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGo.g:475:4: this_Comma_1= RULE_COMMA ( (lv_vars_2_0= RULE_ID ) )
            	    {
            	    this_Comma_1=(Token)match(input,RULE_COMMA,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_Comma_1, grammarAccess.getDecVarsAccess().getCommaTerminalRuleCall_1_0());
            	      			
            	    }
            	    // InternalGo.g:479:4: ( (lv_vars_2_0= RULE_ID ) )
            	    // InternalGo.g:480:5: (lv_vars_2_0= RULE_ID )
            	    {
            	    // InternalGo.g:480:5: (lv_vars_2_0= RULE_ID )
            	    // InternalGo.g:481:6: lv_vars_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,27,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDecVarsAccess().getColonEqualsSignKeyword_2());
              		
            }
            // InternalGo.g:502:3: ( ( (lv_atrb_4_1= ruleAtri | lv_atrb_4_2= RULE_ID ) ) )
            // InternalGo.g:503:4: ( (lv_atrb_4_1= ruleAtri | lv_atrb_4_2= RULE_ID ) )
            {
            // InternalGo.g:503:4: ( (lv_atrb_4_1= ruleAtri | lv_atrb_4_2= RULE_ID ) )
            // InternalGo.g:504:5: (lv_atrb_4_1= ruleAtri | lv_atrb_4_2= RULE_ID )
            {
            // InternalGo.g:504:5: (lv_atrb_4_1= ruleAtri | lv_atrb_4_2= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_OPEN_BRACKETS && LA12_0<=RULE_INT)||LA12_0==RULE_STRING||(LA12_0>=42 && LA12_0<=43)) ) {
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
                    // InternalGo.g:505:6: lv_atrb_4_1= ruleAtri
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
                    // InternalGo.g:521:6: lv_atrb_4_2= RULE_ID
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

            // InternalGo.g:538:3: (this_Comma_5= RULE_COMMA ( ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COMMA) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGo.g:539:4: this_Comma_5= RULE_COMMA ( ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) ) )
            	    {
            	    this_Comma_5=(Token)match(input,RULE_COMMA,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_Comma_5, grammarAccess.getDecVarsAccess().getCommaTerminalRuleCall_4_0());
            	      			
            	    }
            	    // InternalGo.g:543:4: ( ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) ) )
            	    // InternalGo.g:544:5: ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) )
            	    {
            	    // InternalGo.g:544:5: ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) )
            	    // InternalGo.g:545:6: (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID )
            	    {
            	    // InternalGo.g:545:6: (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( ((LA13_0>=RULE_OPEN_BRACKETS && LA13_0<=RULE_INT)||LA13_0==RULE_STRING||(LA13_0>=42 && LA13_0<=43)) ) {
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
            	            // InternalGo.g:546:7: lv_atrb_6_1= ruleAtri
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
            	            // InternalGo.g:562:7: lv_atrb_6_2= RULE_ID
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
    // InternalGo.g:584:1: entryRuleAtri returns [String current=null] : iv_ruleAtri= ruleAtri EOF ;
    public final String entryRuleAtri() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAtri = null;


        try {
            // InternalGo.g:584:44: (iv_ruleAtri= ruleAtri EOF )
            // InternalGo.g:585:2: iv_ruleAtri= ruleAtri EOF
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
    // InternalGo.g:591:1: ruleAtri returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS this_Types_3= ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? ) | this_TypeValue_7= ruleTypeValue ) ;
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
            // InternalGo.g:597:2: ( ( (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS this_Types_3= ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? ) | this_TypeValue_7= ruleTypeValue ) )
            // InternalGo.g:598:2: ( (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS this_Types_3= ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? ) | this_TypeValue_7= ruleTypeValue )
            {
            // InternalGo.g:598:2: ( (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS this_Types_3= ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? ) | this_TypeValue_7= ruleTypeValue )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_OPEN_BRACKETS) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_INT||LA17_0==RULE_STRING||(LA17_0>=42 && LA17_0<=43)) ) {
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
                    // InternalGo.g:599:3: (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS this_Types_3= ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? )
                    {
                    // InternalGo.g:599:3: (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS this_Types_3= ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? )
                    // InternalGo.g:600:4: this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS this_Types_3= ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )?
                    {
                    this_Open_brackets_0=(Token)match(input,RULE_OPEN_BRACKETS,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Open_brackets_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Open_brackets_0, grammarAccess.getAtriAccess().getOpen_bracketsTerminalRuleCall_0_0());
                      			
                    }
                    // InternalGo.g:607:4: (this_INT_1= RULE_INT )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_INT) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalGo.g:608:5: this_INT_1= RULE_INT
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
                    // InternalGo.g:633:4: (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_OPEN_KEY) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalGo.g:634:5: this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY
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
                    // InternalGo.g:661:3: this_TypeValue_7= ruleTypeValue
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
    // InternalGo.g:675:1: entryRuleParams returns [EObject current=null] : iv_ruleParams= ruleParams EOF ;
    public final EObject entryRuleParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParams = null;


        try {
            // InternalGo.g:675:47: (iv_ruleParams= ruleParams EOF )
            // InternalGo.g:676:2: iv_ruleParams= ruleParams EOF
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
    // InternalGo.g:682:1: ruleParams returns [EObject current=null] : ( ( (lv_params_0_0= RULE_ID ) ) ruleTypes (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ruleTypes )* ) ;
    public final EObject ruleParams() throws RecognitionException {
        EObject current = null;

        Token lv_params_0_0=null;
        Token this_Comma_2=null;
        Token lv_params_3_0=null;


        	enterRule();

        try {
            // InternalGo.g:688:2: ( ( ( (lv_params_0_0= RULE_ID ) ) ruleTypes (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ruleTypes )* ) )
            // InternalGo.g:689:2: ( ( (lv_params_0_0= RULE_ID ) ) ruleTypes (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ruleTypes )* )
            {
            // InternalGo.g:689:2: ( ( (lv_params_0_0= RULE_ID ) ) ruleTypes (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ruleTypes )* )
            // InternalGo.g:690:3: ( (lv_params_0_0= RULE_ID ) ) ruleTypes (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ruleTypes )*
            {
            // InternalGo.g:690:3: ( (lv_params_0_0= RULE_ID ) )
            // InternalGo.g:691:4: (lv_params_0_0= RULE_ID )
            {
            // InternalGo.g:691:4: (lv_params_0_0= RULE_ID )
            // InternalGo.g:692:5: lv_params_0_0= RULE_ID
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
            // InternalGo.g:715:3: (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ruleTypes )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_COMMA) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGo.g:716:4: this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ruleTypes
            	    {
            	    this_Comma_2=(Token)match(input,RULE_COMMA,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_Comma_2, grammarAccess.getParamsAccess().getCommaTerminalRuleCall_2_0());
            	      			
            	    }
            	    // InternalGo.g:720:4: ( (lv_params_3_0= RULE_ID ) )
            	    // InternalGo.g:721:5: (lv_params_3_0= RULE_ID )
            	    {
            	    // InternalGo.g:721:5: (lv_params_3_0= RULE_ID )
            	    // InternalGo.g:722:6: lv_params_3_0= RULE_ID
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
    // InternalGo.g:750:1: entryRuleTypeValue returns [String current=null] : iv_ruleTypeValue= ruleTypeValue EOF ;
    public final String entryRuleTypeValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeValue = null;


        try {
            // InternalGo.g:750:49: (iv_ruleTypeValue= ruleTypeValue EOF )
            // InternalGo.g:751:2: iv_ruleTypeValue= ruleTypeValue EOF
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
    // InternalGo.g:757:1: ruleTypeValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_Numbers_1= ruleNumbers | this_Boolean_2= ruleBoolean ) ;
    public final AntlrDatatypeRuleToken ruleTypeValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_Numbers_1 = null;

        AntlrDatatypeRuleToken this_Boolean_2 = null;



        	enterRule();

        try {
            // InternalGo.g:763:2: ( (this_STRING_0= RULE_STRING | this_Numbers_1= ruleNumbers | this_Boolean_2= ruleBoolean ) )
            // InternalGo.g:764:2: (this_STRING_0= RULE_STRING | this_Numbers_1= ruleNumbers | this_Boolean_2= ruleBoolean )
            {
            // InternalGo.g:764:2: (this_STRING_0= RULE_STRING | this_Numbers_1= ruleNumbers | this_Boolean_2= ruleBoolean )
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
            case 42:
            case 43:
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
                    // InternalGo.g:765:3: this_STRING_0= RULE_STRING
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
                    // InternalGo.g:773:3: this_Numbers_1= ruleNumbers
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
                    // InternalGo.g:784:3: this_Boolean_2= ruleBoolean
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
    // InternalGo.g:798:1: entryRuleDecImport returns [String current=null] : iv_ruleDecImport= ruleDecImport EOF ;
    public final String entryRuleDecImport() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecImport = null;


        try {
            // InternalGo.g:798:49: (iv_ruleDecImport= ruleDecImport EOF )
            // InternalGo.g:799:2: iv_ruleDecImport= ruleDecImport EOF
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
    // InternalGo.g:805:1: ruleDecImport returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IMPORT_0= ruleIMPORT (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) ) ) ;
    public final AntlrDatatypeRuleToken ruleDecImport() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_1=null;
        Token this_Open_parentheses_2=null;
        Token this_STRING_3=null;
        Token this_Closed_parentheses_4=null;
        AntlrDatatypeRuleToken this_IMPORT_0 = null;



        	enterRule();

        try {
            // InternalGo.g:811:2: ( (this_IMPORT_0= ruleIMPORT (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) ) ) )
            // InternalGo.g:812:2: (this_IMPORT_0= ruleIMPORT (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) ) )
            {
            // InternalGo.g:812:2: (this_IMPORT_0= ruleIMPORT (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) ) )
            // InternalGo.g:813:3: this_IMPORT_0= ruleIMPORT (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) )
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
            // InternalGo.g:823:3: (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) )
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
                    // InternalGo.g:824:4: this_STRING_1= RULE_STRING
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
                    // InternalGo.g:832:4: (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES )
                    {
                    // InternalGo.g:832:4: (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES )
                    // InternalGo.g:833:5: this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES
                    {
                    this_Open_parentheses_2=(Token)match(input,RULE_OPEN_PARENTHESES,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Open_parentheses_2);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_Open_parentheses_2, grammarAccess.getDecImportAccess().getOpen_parenthesesTerminalRuleCall_1_1_0());
                      				
                    }
                    // InternalGo.g:840:5: (this_STRING_3= RULE_STRING )+
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
                    	    // InternalGo.g:841:6: this_STRING_3= RULE_STRING
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


    // $ANTLR start "entryRuleOperations"
    // InternalGo.g:862:1: entryRuleOperations returns [EObject current=null] : iv_ruleOperations= ruleOperations EOF ;
    public final EObject entryRuleOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperations = null;


        try {
            // InternalGo.g:862:51: (iv_ruleOperations= ruleOperations EOF )
            // InternalGo.g:863:2: iv_ruleOperations= ruleOperations EOF
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
    // InternalGo.g:869:1: ruleOperations returns [EObject current=null] : (this_T_0= ruleT ( (lv_o_1_0= ruleI ) ) ) ;
    public final EObject ruleOperations() throws RecognitionException {
        EObject current = null;

        EObject this_T_0 = null;

        EObject lv_o_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:875:2: ( (this_T_0= ruleT ( (lv_o_1_0= ruleI ) ) ) )
            // InternalGo.g:876:2: (this_T_0= ruleT ( (lv_o_1_0= ruleI ) ) )
            {
            // InternalGo.g:876:2: (this_T_0= ruleT ( (lv_o_1_0= ruleI ) ) )
            // InternalGo.g:877:3: this_T_0= ruleT ( (lv_o_1_0= ruleI ) )
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOperationsAccess().getTParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_21);
            this_T_0=ruleT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_T_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:885:3: ( (lv_o_1_0= ruleI ) )
            // InternalGo.g:886:4: (lv_o_1_0= ruleI )
            {
            // InternalGo.g:886:4: (lv_o_1_0= ruleI )
            // InternalGo.g:887:5: lv_o_1_0= ruleI
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperationsAccess().getOIParserRuleCall_1_0());
              				
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
    // InternalGo.g:908:1: entryRuleI returns [EObject current=null] : iv_ruleI= ruleI EOF ;
    public final EObject entryRuleI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleI = null;


        try {
            // InternalGo.g:908:42: (iv_ruleI= ruleI EOF )
            // InternalGo.g:909:2: iv_ruleI= ruleI EOF
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
    // InternalGo.g:915:1: ruleI returns [EObject current=null] : ( (this_Plus_0= RULE_PLUS this_T_1= ruleT ( (lv_o_2_0= ruleI ) ) ) | (this_Minus_3= RULE_MINUS this_T_4= ruleT ( (lv_o_5_0= ruleI ) ) ) )? ;
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
            // InternalGo.g:921:2: ( ( (this_Plus_0= RULE_PLUS this_T_1= ruleT ( (lv_o_2_0= ruleI ) ) ) | (this_Minus_3= RULE_MINUS this_T_4= ruleT ( (lv_o_5_0= ruleI ) ) ) )? )
            // InternalGo.g:922:2: ( (this_Plus_0= RULE_PLUS this_T_1= ruleT ( (lv_o_2_0= ruleI ) ) ) | (this_Minus_3= RULE_MINUS this_T_4= ruleT ( (lv_o_5_0= ruleI ) ) ) )?
            {
            // InternalGo.g:922:2: ( (this_Plus_0= RULE_PLUS this_T_1= ruleT ( (lv_o_2_0= ruleI ) ) ) | (this_Minus_3= RULE_MINUS this_T_4= ruleT ( (lv_o_5_0= ruleI ) ) ) )?
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_PLUS) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_MINUS) ) {
                alt22=2;
            }
            switch (alt22) {
                case 1 :
                    // InternalGo.g:923:3: (this_Plus_0= RULE_PLUS this_T_1= ruleT ( (lv_o_2_0= ruleI ) ) )
                    {
                    // InternalGo.g:923:3: (this_Plus_0= RULE_PLUS this_T_1= ruleT ( (lv_o_2_0= ruleI ) ) )
                    // InternalGo.g:924:4: this_Plus_0= RULE_PLUS this_T_1= ruleT ( (lv_o_2_0= ruleI ) )
                    {
                    this_Plus_0=(Token)match(input,RULE_PLUS,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Plus_0, grammarAccess.getIAccess().getPlusTerminalRuleCall_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIAccess().getTParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_21);
                    this_T_1=ruleT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_T_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:936:4: ( (lv_o_2_0= ruleI ) )
                    // InternalGo.g:937:5: (lv_o_2_0= ruleI )
                    {
                    // InternalGo.g:937:5: (lv_o_2_0= ruleI )
                    // InternalGo.g:938:6: lv_o_2_0= ruleI
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
                    // InternalGo.g:957:3: (this_Minus_3= RULE_MINUS this_T_4= ruleT ( (lv_o_5_0= ruleI ) ) )
                    {
                    // InternalGo.g:957:3: (this_Minus_3= RULE_MINUS this_T_4= ruleT ( (lv_o_5_0= ruleI ) ) )
                    // InternalGo.g:958:4: this_Minus_3= RULE_MINUS this_T_4= ruleT ( (lv_o_5_0= ruleI ) )
                    {
                    this_Minus_3=(Token)match(input,RULE_MINUS,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Minus_3, grammarAccess.getIAccess().getMinusTerminalRuleCall_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIAccess().getTParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_21);
                    this_T_4=ruleT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_T_4;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:970:4: ( (lv_o_5_0= ruleI ) )
                    // InternalGo.g:971:5: (lv_o_5_0= ruleI )
                    {
                    // InternalGo.g:971:5: (lv_o_5_0= ruleI )
                    // InternalGo.g:972:6: lv_o_5_0= ruleI
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
    // InternalGo.g:994:1: entryRuleT returns [EObject current=null] : iv_ruleT= ruleT EOF ;
    public final EObject entryRuleT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleT = null;


        try {
            // InternalGo.g:994:42: (iv_ruleT= ruleT EOF )
            // InternalGo.g:995:2: iv_ruleT= ruleT EOF
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
    // InternalGo.g:1001:1: ruleT returns [EObject current=null] : (this_F_0= ruleF ( (lv_o_1_0= ruleY ) ) ) ;
    public final EObject ruleT() throws RecognitionException {
        EObject current = null;

        EObject this_F_0 = null;

        EObject lv_o_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1007:2: ( (this_F_0= ruleF ( (lv_o_1_0= ruleY ) ) ) )
            // InternalGo.g:1008:2: (this_F_0= ruleF ( (lv_o_1_0= ruleY ) ) )
            {
            // InternalGo.g:1008:2: (this_F_0= ruleF ( (lv_o_1_0= ruleY ) ) )
            // InternalGo.g:1009:3: this_F_0= ruleF ( (lv_o_1_0= ruleY ) )
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTAccess().getFParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_23);
            this_F_0=ruleF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_F_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1017:3: ( (lv_o_1_0= ruleY ) )
            // InternalGo.g:1018:4: (lv_o_1_0= ruleY )
            {
            // InternalGo.g:1018:4: (lv_o_1_0= ruleY )
            // InternalGo.g:1019:5: lv_o_1_0= ruleY
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
    // InternalGo.g:1040:1: entryRuleY returns [EObject current=null] : iv_ruleY= ruleY EOF ;
    public final EObject entryRuleY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleY = null;


        try {
            // InternalGo.g:1040:42: (iv_ruleY= ruleY EOF )
            // InternalGo.g:1041:2: iv_ruleY= ruleY EOF
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
    // InternalGo.g:1047:1: ruleY returns [EObject current=null] : ( (this_Asterics_0= RULE_ASTERICS ( (lv_o_1_0= ruleF ) ) ( (lv_o_2_0= ruleY ) ) ) | (this_Bar_3= RULE_BAR ( (lv_o_4_0= ruleF ) ) ( (lv_o_5_0= ruleY ) ) ) )? ;
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
            // InternalGo.g:1053:2: ( ( (this_Asterics_0= RULE_ASTERICS ( (lv_o_1_0= ruleF ) ) ( (lv_o_2_0= ruleY ) ) ) | (this_Bar_3= RULE_BAR ( (lv_o_4_0= ruleF ) ) ( (lv_o_5_0= ruleY ) ) ) )? )
            // InternalGo.g:1054:2: ( (this_Asterics_0= RULE_ASTERICS ( (lv_o_1_0= ruleF ) ) ( (lv_o_2_0= ruleY ) ) ) | (this_Bar_3= RULE_BAR ( (lv_o_4_0= ruleF ) ) ( (lv_o_5_0= ruleY ) ) ) )?
            {
            // InternalGo.g:1054:2: ( (this_Asterics_0= RULE_ASTERICS ( (lv_o_1_0= ruleF ) ) ( (lv_o_2_0= ruleY ) ) ) | (this_Bar_3= RULE_BAR ( (lv_o_4_0= ruleF ) ) ( (lv_o_5_0= ruleY ) ) ) )?
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ASTERICS) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_BAR) ) {
                alt23=2;
            }
            switch (alt23) {
                case 1 :
                    // InternalGo.g:1055:3: (this_Asterics_0= RULE_ASTERICS ( (lv_o_1_0= ruleF ) ) ( (lv_o_2_0= ruleY ) ) )
                    {
                    // InternalGo.g:1055:3: (this_Asterics_0= RULE_ASTERICS ( (lv_o_1_0= ruleF ) ) ( (lv_o_2_0= ruleY ) ) )
                    // InternalGo.g:1056:4: this_Asterics_0= RULE_ASTERICS ( (lv_o_1_0= ruleF ) ) ( (lv_o_2_0= ruleY ) )
                    {
                    this_Asterics_0=(Token)match(input,RULE_ASTERICS,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Asterics_0, grammarAccess.getYAccess().getAstericsTerminalRuleCall_0_0());
                      			
                    }
                    // InternalGo.g:1060:4: ( (lv_o_1_0= ruleF ) )
                    // InternalGo.g:1061:5: (lv_o_1_0= ruleF )
                    {
                    // InternalGo.g:1061:5: (lv_o_1_0= ruleF )
                    // InternalGo.g:1062:6: lv_o_1_0= ruleF
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getYAccess().getOFParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
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

                    // InternalGo.g:1079:4: ( (lv_o_2_0= ruleY ) )
                    // InternalGo.g:1080:5: (lv_o_2_0= ruleY )
                    {
                    // InternalGo.g:1080:5: (lv_o_2_0= ruleY )
                    // InternalGo.g:1081:6: lv_o_2_0= ruleY
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
                    // InternalGo.g:1100:3: (this_Bar_3= RULE_BAR ( (lv_o_4_0= ruleF ) ) ( (lv_o_5_0= ruleY ) ) )
                    {
                    // InternalGo.g:1100:3: (this_Bar_3= RULE_BAR ( (lv_o_4_0= ruleF ) ) ( (lv_o_5_0= ruleY ) ) )
                    // InternalGo.g:1101:4: this_Bar_3= RULE_BAR ( (lv_o_4_0= ruleF ) ) ( (lv_o_5_0= ruleY ) )
                    {
                    this_Bar_3=(Token)match(input,RULE_BAR,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Bar_3, grammarAccess.getYAccess().getBarTerminalRuleCall_1_0());
                      			
                    }
                    // InternalGo.g:1105:4: ( (lv_o_4_0= ruleF ) )
                    // InternalGo.g:1106:5: (lv_o_4_0= ruleF )
                    {
                    // InternalGo.g:1106:5: (lv_o_4_0= ruleF )
                    // InternalGo.g:1107:6: lv_o_4_0= ruleF
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getYAccess().getOFParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
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

                    // InternalGo.g:1124:4: ( (lv_o_5_0= ruleY ) )
                    // InternalGo.g:1125:5: (lv_o_5_0= ruleY )
                    {
                    // InternalGo.g:1125:5: (lv_o_5_0= ruleY )
                    // InternalGo.g:1126:6: lv_o_5_0= ruleY
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
    // InternalGo.g:1148:1: entryRuleF returns [EObject current=null] : iv_ruleF= ruleF EOF ;
    public final EObject entryRuleF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleF = null;


        try {
            // InternalGo.g:1148:42: (iv_ruleF= ruleF EOF )
            // InternalGo.g:1149:2: iv_ruleF= ruleF EOF
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
    // InternalGo.g:1155:1: ruleF returns [EObject current=null] : ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES ( (lv_o_1_0= ruleOperations ) ) this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | ruleNumbers ) ;
    public final EObject ruleF() throws RecognitionException {
        EObject current = null;

        Token this_Open_parentheses_0=null;
        Token this_Closed_parentheses_2=null;
        EObject lv_o_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1161:2: ( ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES ( (lv_o_1_0= ruleOperations ) ) this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | ruleNumbers ) )
            // InternalGo.g:1162:2: ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES ( (lv_o_1_0= ruleOperations ) ) this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | ruleNumbers )
            {
            // InternalGo.g:1162:2: ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES ( (lv_o_1_0= ruleOperations ) ) this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | ruleNumbers )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_OPEN_PARENTHESES) ) {
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
                    // InternalGo.g:1163:3: (this_Open_parentheses_0= RULE_OPEN_PARENTHESES ( (lv_o_1_0= ruleOperations ) ) this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES )
                    {
                    // InternalGo.g:1163:3: (this_Open_parentheses_0= RULE_OPEN_PARENTHESES ( (lv_o_1_0= ruleOperations ) ) this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES )
                    // InternalGo.g:1164:4: this_Open_parentheses_0= RULE_OPEN_PARENTHESES ( (lv_o_1_0= ruleOperations ) ) this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES
                    {
                    this_Open_parentheses_0=(Token)match(input,RULE_OPEN_PARENTHESES,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Open_parentheses_0, grammarAccess.getFAccess().getOpen_parenthesesTerminalRuleCall_0_0());
                      			
                    }
                    // InternalGo.g:1168:4: ( (lv_o_1_0= ruleOperations ) )
                    // InternalGo.g:1169:5: (lv_o_1_0= ruleOperations )
                    {
                    // InternalGo.g:1169:5: (lv_o_1_0= ruleOperations )
                    // InternalGo.g:1170:6: lv_o_1_0= ruleOperations
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFAccess().getOOperationsParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
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
                    // InternalGo.g:1193:3: ruleNumbers
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
    // InternalGo.g:1204:1: entryRuleNumbers returns [String current=null] : iv_ruleNumbers= ruleNumbers EOF ;
    public final String entryRuleNumbers() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumbers = null;


        try {
            // InternalGo.g:1204:47: (iv_ruleNumbers= ruleNumbers EOF )
            // InternalGo.g:1205:2: iv_ruleNumbers= ruleNumbers EOF
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
    // InternalGo.g:1211:1: ruleNumbers returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_Double_1= ruleDouble ) ;
    public final AntlrDatatypeRuleToken ruleNumbers() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        AntlrDatatypeRuleToken this_Double_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1217:2: ( (this_INT_0= RULE_INT | this_Double_1= ruleDouble ) )
            // InternalGo.g:1218:2: (this_INT_0= RULE_INT | this_Double_1= ruleDouble )
            {
            // InternalGo.g:1218:2: (this_INT_0= RULE_INT | this_Double_1= ruleDouble )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==EOF||(LA25_1>=RULE_EOL && LA25_1<=RULE_CLOSED_PARENTHESES)||LA25_1==RULE_INT||(LA25_1>=RULE_OPEN_KEY && LA25_1<=RULE_CLOSED_KEY)||(LA25_1>=RULE_PLUS && LA25_1<=RULE_BAR)||(LA25_1>=28 && LA25_1<=34)||LA25_1==47||(LA25_1>=51 && LA25_1<=53)||LA25_1==57||LA25_1==59) ) {
                    alt25=1;
                }
                else if ( (LA25_1==RULE_DOT) ) {
                    alt25=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalGo.g:1219:3: this_INT_0= RULE_INT
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
                    // InternalGo.g:1227:3: this_Double_1= ruleDouble
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
    // InternalGo.g:1241:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalGo.g:1241:46: (iv_ruleDouble= ruleDouble EOF )
            // InternalGo.g:1242:2: iv_ruleDouble= ruleDouble EOF
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
    // InternalGo.g:1248:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT this_Dot_1= RULE_DOT this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_Dot_1=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalGo.g:1254:2: ( (this_INT_0= RULE_INT this_Dot_1= RULE_DOT this_INT_2= RULE_INT ) )
            // InternalGo.g:1255:2: (this_INT_0= RULE_INT this_Dot_1= RULE_DOT this_INT_2= RULE_INT )
            {
            // InternalGo.g:1255:2: (this_INT_0= RULE_INT this_Dot_1= RULE_DOT this_INT_2= RULE_INT )
            // InternalGo.g:1256:3: this_INT_0= RULE_INT this_Dot_1= RULE_DOT this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0());
              		
            }
            this_Dot_1=(Token)match(input,RULE_DOT,FOLLOW_26); if (state.failed) return current;
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
    // InternalGo.g:1281:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalGo.g:1281:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalGo.g:1282:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalGo.g:1288:1: ruleCondition returns [EObject current=null] : ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_if_0_0 = null;

        EObject lv_elseif_1_0 = null;

        EObject lv_else_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1294:2: ( ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )? ) )
            // InternalGo.g:1295:2: ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )? )
            {
            // InternalGo.g:1295:2: ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )? )
            // InternalGo.g:1296:3: ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )?
            {
            // InternalGo.g:1296:3: ( (lv_if_0_0= ruleIfCondition ) )
            // InternalGo.g:1297:4: (lv_if_0_0= ruleIfCondition )
            {
            // InternalGo.g:1297:4: (lv_if_0_0= ruleIfCondition )
            // InternalGo.g:1298:5: lv_if_0_0= ruleIfCondition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionAccess().getIfIfConditionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_27);
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

            // InternalGo.g:1315:3: ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==49) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==52) && (synpred1_InternalGo())) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // InternalGo.g:1316:4: ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition )
            	    {
            	    // InternalGo.g:1317:4: (lv_elseif_1_0= ruleElseIfCondition )
            	    // InternalGo.g:1318:5: lv_elseif_1_0= ruleElseIfCondition
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConditionAccess().getElseifElseIfConditionParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_27);
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
            	    break loop26;
                }
            } while (true);

            // InternalGo.g:1335:3: ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==49) && (synpred2_InternalGo())) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGo.g:1336:4: ( ruleELSE )=> (lv_else_2_0= ruleElseCondition )
                    {
                    // InternalGo.g:1337:4: (lv_else_2_0= ruleElseCondition )
                    // InternalGo.g:1338:5: lv_else_2_0= ruleElseCondition
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
    // InternalGo.g:1359:1: entryRuleIfCondition returns [EObject current=null] : iv_ruleIfCondition= ruleIfCondition EOF ;
    public final EObject entryRuleIfCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfCondition = null;


        try {
            // InternalGo.g:1359:52: (iv_ruleIfCondition= ruleIfCondition EOF )
            // InternalGo.g:1360:2: iv_ruleIfCondition= ruleIfCondition EOF
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
    // InternalGo.g:1366:1: ruleIfCondition returns [EObject current=null] : ( ruleIF ( (lv_cond_1_0= ruleExpression ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_then_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY ) ;
    public final EObject ruleIfCondition() throws RecognitionException {
        EObject current = null;

        Token this_Open_Key_2=null;
        Token this_Closed_Key_4=null;
        EObject lv_cond_1_0 = null;

        EObject lv_then_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1372:2: ( ( ruleIF ( (lv_cond_1_0= ruleExpression ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_then_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY ) )
            // InternalGo.g:1373:2: ( ruleIF ( (lv_cond_1_0= ruleExpression ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_then_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY )
            {
            // InternalGo.g:1373:2: ( ruleIF ( (lv_cond_1_0= ruleExpression ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_then_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY )
            // InternalGo.g:1374:3: ruleIF ( (lv_cond_1_0= ruleExpression ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_then_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIfConditionAccess().getIFParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_16);
            ruleIF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1381:3: ( (lv_cond_1_0= ruleExpression ) )
            // InternalGo.g:1382:4: (lv_cond_1_0= ruleExpression )
            {
            // InternalGo.g:1382:4: (lv_cond_1_0= ruleExpression )
            // InternalGo.g:1383:5: lv_cond_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfConditionAccess().getCondExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_28);
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

            this_Open_Key_2=(Token)match(input,RULE_OPEN_KEY,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Open_Key_2, grammarAccess.getIfConditionAccess().getOpen_KeyTerminalRuleCall_2());
              		
            }
            // InternalGo.g:1404:3: ( (lv_then_3_0= ruleGreeting ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_EOL && LA28_0<=RULE_ID)||LA28_0==RULE_OPEN_PARENTHESES||LA28_0==RULE_INT||LA28_0==47||(LA28_0>=51 && LA28_0<=53)||LA28_0==57||LA28_0==59) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalGo.g:1405:4: (lv_then_3_0= ruleGreeting )
            	    {
            	    // InternalGo.g:1405:4: (lv_then_3_0= ruleGreeting )
            	    // InternalGo.g:1406:5: lv_then_3_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfConditionAccess().getThenGreetingParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_29);
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
            	    break loop28;
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
    // InternalGo.g:1431:1: entryRuleElseIfCondition returns [EObject current=null] : iv_ruleElseIfCondition= ruleElseIfCondition EOF ;
    public final EObject entryRuleElseIfCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfCondition = null;


        try {
            // InternalGo.g:1431:56: (iv_ruleElseIfCondition= ruleElseIfCondition EOF )
            // InternalGo.g:1432:2: iv_ruleElseIfCondition= ruleElseIfCondition EOF
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
    // InternalGo.g:1438:1: ruleElseIfCondition returns [EObject current=null] : ( ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition ) ;
    public final EObject ruleElseIfCondition() throws RecognitionException {
        EObject current = null;

        EObject this_IfCondition_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1444:2: ( ( ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition ) )
            // InternalGo.g:1445:2: ( ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition )
            {
            // InternalGo.g:1445:2: ( ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition )
            // InternalGo.g:1446:3: ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition
            {
            // InternalGo.g:1446:3: ( ( ruleELSE )=> ruleELSE )
            // InternalGo.g:1447:4: ( ruleELSE )=> ruleELSE
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getElseIfConditionAccess().getELSEParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_30);
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
    // InternalGo.g:1468:1: entryRuleElseCondition returns [EObject current=null] : iv_ruleElseCondition= ruleElseCondition EOF ;
    public final EObject entryRuleElseCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseCondition = null;


        try {
            // InternalGo.g:1468:54: (iv_ruleElseCondition= ruleElseCondition EOF )
            // InternalGo.g:1469:2: iv_ruleElseCondition= ruleElseCondition EOF
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
    // InternalGo.g:1475:1: ruleElseCondition returns [EObject current=null] : ( ( ( ruleELSE )=> ruleELSE ) this_Open_Key_1= RULE_OPEN_KEY ( (lv_then_2_0= ruleGreeting ) )* this_Closed_Key_3= RULE_CLOSED_KEY ) ;
    public final EObject ruleElseCondition() throws RecognitionException {
        EObject current = null;

        Token this_Open_Key_1=null;
        Token this_Closed_Key_3=null;
        EObject lv_then_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1481:2: ( ( ( ( ruleELSE )=> ruleELSE ) this_Open_Key_1= RULE_OPEN_KEY ( (lv_then_2_0= ruleGreeting ) )* this_Closed_Key_3= RULE_CLOSED_KEY ) )
            // InternalGo.g:1482:2: ( ( ( ruleELSE )=> ruleELSE ) this_Open_Key_1= RULE_OPEN_KEY ( (lv_then_2_0= ruleGreeting ) )* this_Closed_Key_3= RULE_CLOSED_KEY )
            {
            // InternalGo.g:1482:2: ( ( ( ruleELSE )=> ruleELSE ) this_Open_Key_1= RULE_OPEN_KEY ( (lv_then_2_0= ruleGreeting ) )* this_Closed_Key_3= RULE_CLOSED_KEY )
            // InternalGo.g:1483:3: ( ( ruleELSE )=> ruleELSE ) this_Open_Key_1= RULE_OPEN_KEY ( (lv_then_2_0= ruleGreeting ) )* this_Closed_Key_3= RULE_CLOSED_KEY
            {
            // InternalGo.g:1483:3: ( ( ruleELSE )=> ruleELSE )
            // InternalGo.g:1484:4: ( ruleELSE )=> ruleELSE
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getElseConditionAccess().getELSEParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_28);
            ruleELSE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }

            this_Open_Key_1=(Token)match(input,RULE_OPEN_KEY,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Open_Key_1, grammarAccess.getElseConditionAccess().getOpen_KeyTerminalRuleCall_1());
              		
            }
            // InternalGo.g:1497:3: ( (lv_then_2_0= ruleGreeting ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_EOL && LA29_0<=RULE_ID)||LA29_0==RULE_OPEN_PARENTHESES||LA29_0==RULE_INT||LA29_0==47||(LA29_0>=51 && LA29_0<=53)||LA29_0==57||LA29_0==59) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalGo.g:1498:4: (lv_then_2_0= ruleGreeting )
            	    {
            	    // InternalGo.g:1498:4: (lv_then_2_0= ruleGreeting )
            	    // InternalGo.g:1499:5: lv_then_2_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getElseConditionAccess().getThenGreetingParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_29);
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
            	    break loop29;
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
    // InternalGo.g:1524:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalGo.g:1524:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalGo.g:1525:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalGo.g:1531:1: ruleExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1537:2: (this_OrExpression_0= ruleOrExpression )
            // InternalGo.g:1538:2: this_OrExpression_0= ruleOrExpression
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
    // InternalGo.g:1549:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalGo.g:1549:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalGo.g:1550:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalGo.g:1556:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1562:2: ( (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalGo.g:1563:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalGo.g:1563:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalGo.g:1564:3: this_AndExpression_0= ruleAndExpression ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_31);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1572:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==28) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGo.g:1573:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalGo.g:1573:4: ()
            	    // InternalGo.g:1574:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalGo.g:1584:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalGo.g:1585:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalGo.g:1585:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalGo.g:1586:6: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_31);
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
            	    break loop30;
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
    // InternalGo.g:1608:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalGo.g:1608:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalGo.g:1609:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalGo.g:1615:1: ruleAndExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ComparisonExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1621:2: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) )
            // InternalGo.g:1622:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            {
            // InternalGo.g:1622:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            // InternalGo.g:1623:3: this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndExpressionAccess().getComparisonExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_32);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ComparisonExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1631:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==29) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalGo.g:1632:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonExpression ) )
            	    {
            	    // InternalGo.g:1632:4: ()
            	    // InternalGo.g:1633:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,29,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalGo.g:1643:4: ( (lv_right_3_0= ruleComparisonExpression ) )
            	    // InternalGo.g:1644:5: (lv_right_3_0= ruleComparisonExpression )
            	    {
            	    // InternalGo.g:1644:5: (lv_right_3_0= ruleComparisonExpression )
            	    // InternalGo.g:1645:6: lv_right_3_0= ruleComparisonExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_32);
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
            	    break loop31;
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
    // InternalGo.g:1667:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalGo.g:1667:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalGo.g:1668:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
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
    // InternalGo.g:1674:1: ruleComparisonExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
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
            // InternalGo.g:1680:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // InternalGo.g:1681:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // InternalGo.g:1681:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // InternalGo.g:1682:3: this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonExpressionAccess().getPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_33);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1690:3: ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=30 && LA33_0<=34)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalGo.g:1691:4: () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // InternalGo.g:1691:4: ()
            	    // InternalGo.g:1692:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalGo.g:1698:4: ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) )
            	    // InternalGo.g:1699:5: ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) )
            	    {
            	    // InternalGo.g:1699:5: ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) )
            	    // InternalGo.g:1700:6: (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' )
            	    {
            	    // InternalGo.g:1700:6: (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' )
            	    int alt32=5;
            	    switch ( input.LA(1) ) {
            	    case 30:
            	        {
            	        alt32=1;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt32=2;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt32=3;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt32=4;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt32=5;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 32, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt32) {
            	        case 1 :
            	            // InternalGo.g:1701:7: lv_operator_2_1= '<'
            	            {
            	            lv_operator_2_1=(Token)match(input,30,FOLLOW_16); if (state.failed) return current;
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
            	            // InternalGo.g:1712:7: lv_operator_2_2= '<='
            	            {
            	            lv_operator_2_2=(Token)match(input,31,FOLLOW_16); if (state.failed) return current;
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
            	            // InternalGo.g:1723:7: lv_operator_2_3= '=='
            	            {
            	            lv_operator_2_3=(Token)match(input,32,FOLLOW_16); if (state.failed) return current;
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
            	            // InternalGo.g:1734:7: lv_operator_2_4= '>='
            	            {
            	            lv_operator_2_4=(Token)match(input,33,FOLLOW_16); if (state.failed) return current;
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
            	            // InternalGo.g:1745:7: lv_operator_2_5= '>'
            	            {
            	            lv_operator_2_5=(Token)match(input,34,FOLLOW_16); if (state.failed) return current;
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

            	    // InternalGo.g:1758:4: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // InternalGo.g:1759:5: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // InternalGo.g:1759:5: (lv_right_3_0= rulePrimaryExpression )
            	    // InternalGo.g:1760:6: lv_right_3_0= rulePrimaryExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_33);
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
            	    break loop33;
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
    // InternalGo.g:1782:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalGo.g:1782:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalGo.g:1783:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalGo.g:1789:1: rulePrimaryExpression returns [EObject current=null] : ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | this_Literal_3= ruleLiteral ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token this_Open_parentheses_0=null;
        Token this_Closed_parentheses_2=null;
        EObject this_Expression_1 = null;

        EObject this_Literal_3 = null;



        	enterRule();

        try {
            // InternalGo.g:1795:2: ( ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | this_Literal_3= ruleLiteral ) )
            // InternalGo.g:1796:2: ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | this_Literal_3= ruleLiteral )
            {
            // InternalGo.g:1796:2: ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | this_Literal_3= ruleLiteral )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_OPEN_PARENTHESES) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_INT||(LA34_0>=42 && LA34_0<=43)) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalGo.g:1797:3: (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES )
                    {
                    // InternalGo.g:1797:3: (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES )
                    // InternalGo.g:1798:4: this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES
                    {
                    this_Open_parentheses_0=(Token)match(input,RULE_OPEN_PARENTHESES,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Open_parentheses_0, grammarAccess.getPrimaryExpressionAccess().getOpen_parenthesesTerminalRuleCall_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_24);
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
                    // InternalGo.g:1816:3: this_Literal_3= ruleLiteral
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
    // InternalGo.g:1828:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalGo.g:1828:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalGo.g:1829:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalGo.g:1835:1: ruleLiteral returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleBoolean ) ) ) | ruleNumbers ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1841:2: ( ( ( () ( (lv_value_1_0= ruleBoolean ) ) ) | ruleNumbers ) )
            // InternalGo.g:1842:2: ( ( () ( (lv_value_1_0= ruleBoolean ) ) ) | ruleNumbers )
            {
            // InternalGo.g:1842:2: ( ( () ( (lv_value_1_0= ruleBoolean ) ) ) | ruleNumbers )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=42 && LA35_0<=43)) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_INT) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalGo.g:1843:3: ( () ( (lv_value_1_0= ruleBoolean ) ) )
                    {
                    // InternalGo.g:1843:3: ( () ( (lv_value_1_0= ruleBoolean ) ) )
                    // InternalGo.g:1844:4: () ( (lv_value_1_0= ruleBoolean ) )
                    {
                    // InternalGo.g:1844:4: ()
                    // InternalGo.g:1845:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getLiteralAccess().getLiteralAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGo.g:1851:4: ( (lv_value_1_0= ruleBoolean ) )
                    // InternalGo.g:1852:5: (lv_value_1_0= ruleBoolean )
                    {
                    // InternalGo.g:1852:5: (lv_value_1_0= ruleBoolean )
                    // InternalGo.g:1853:6: lv_value_1_0= ruleBoolean
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
                    // InternalGo.g:1872:3: ruleNumbers
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
    // InternalGo.g:1883:1: entryRuleDecFunc returns [EObject current=null] : iv_ruleDecFunc= ruleDecFunc EOF ;
    public final EObject entryRuleDecFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecFunc = null;


        try {
            // InternalGo.g:1883:48: (iv_ruleDecFunc= ruleDecFunc EOF )
            // InternalGo.g:1884:2: iv_ruleDecFunc= ruleDecFunc EOF
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
    // InternalGo.g:1890:1: ruleDecFunc returns [EObject current=null] : ( ruleFUNC ( (lv_name_1_0= RULE_ID ) ) this_Open_parentheses_2= RULE_OPEN_PARENTHESES ( (lv_param_3_0= ruleParams ) )* this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES this_Open_Key_5= RULE_OPEN_KEY ( (lv_args_6_0= ruleGreeting ) )* this_Closed_Key_7= RULE_CLOSED_KEY ) ;
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
            // InternalGo.g:1896:2: ( ( ruleFUNC ( (lv_name_1_0= RULE_ID ) ) this_Open_parentheses_2= RULE_OPEN_PARENTHESES ( (lv_param_3_0= ruleParams ) )* this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES this_Open_Key_5= RULE_OPEN_KEY ( (lv_args_6_0= ruleGreeting ) )* this_Closed_Key_7= RULE_CLOSED_KEY ) )
            // InternalGo.g:1897:2: ( ruleFUNC ( (lv_name_1_0= RULE_ID ) ) this_Open_parentheses_2= RULE_OPEN_PARENTHESES ( (lv_param_3_0= ruleParams ) )* this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES this_Open_Key_5= RULE_OPEN_KEY ( (lv_args_6_0= ruleGreeting ) )* this_Closed_Key_7= RULE_CLOSED_KEY )
            {
            // InternalGo.g:1897:2: ( ruleFUNC ( (lv_name_1_0= RULE_ID ) ) this_Open_parentheses_2= RULE_OPEN_PARENTHESES ( (lv_param_3_0= ruleParams ) )* this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES this_Open_Key_5= RULE_OPEN_KEY ( (lv_args_6_0= ruleGreeting ) )* this_Closed_Key_7= RULE_CLOSED_KEY )
            // InternalGo.g:1898:3: ruleFUNC ( (lv_name_1_0= RULE_ID ) ) this_Open_parentheses_2= RULE_OPEN_PARENTHESES ( (lv_param_3_0= ruleParams ) )* this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES this_Open_Key_5= RULE_OPEN_KEY ( (lv_args_6_0= ruleGreeting ) )* this_Closed_Key_7= RULE_CLOSED_KEY
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
            // InternalGo.g:1905:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGo.g:1906:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGo.g:1906:4: (lv_name_1_0= RULE_ID )
            // InternalGo.g:1907:5: lv_name_1_0= RULE_ID
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
            // InternalGo.g:1927:3: ( (lv_param_3_0= ruleParams ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalGo.g:1928:4: (lv_param_3_0= ruleParams )
            	    {
            	    // InternalGo.g:1928:4: (lv_param_3_0= ruleParams )
            	    // InternalGo.g:1929:5: lv_param_3_0= ruleParams
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
            	    break loop36;
                }
            } while (true);

            this_Closed_parentheses_4=(Token)match(input,RULE_CLOSED_PARENTHESES,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Closed_parentheses_4, grammarAccess.getDecFuncAccess().getClosed_parenthesesTerminalRuleCall_4());
              		
            }
            this_Open_Key_5=(Token)match(input,RULE_OPEN_KEY,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Open_Key_5, grammarAccess.getDecFuncAccess().getOpen_KeyTerminalRuleCall_5());
              		
            }
            // InternalGo.g:1954:3: ( (lv_args_6_0= ruleGreeting ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=RULE_EOL && LA37_0<=RULE_ID)||LA37_0==RULE_OPEN_PARENTHESES||LA37_0==RULE_INT||LA37_0==47||(LA37_0>=51 && LA37_0<=53)||LA37_0==57||LA37_0==59) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalGo.g:1955:4: (lv_args_6_0= ruleGreeting )
            	    {
            	    // InternalGo.g:1955:4: (lv_args_6_0= ruleGreeting )
            	    // InternalGo.g:1956:5: lv_args_6_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDecFuncAccess().getArgsGreetingParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_29);
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
            	    break loop37;
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


    // $ANTLR start "entryRuleTypes"
    // InternalGo.g:1981:1: entryRuleTypes returns [String current=null] : iv_ruleTypes= ruleTypes EOF ;
    public final String entryRuleTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypes = null;


        try {
            // InternalGo.g:1981:45: (iv_ruleTypes= ruleTypes EOF )
            // InternalGo.g:1982:2: iv_ruleTypes= ruleTypes EOF
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
    // InternalGo.g:1988:1: ruleTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TYPE_0= ruleTYPE | kw= 'string' | kw= 'int' | kw= 'bool' | kw= 'byte' | kw= 'rune' | kw= 'float32' | kw= 'float64' ) ;
    public final AntlrDatatypeRuleToken ruleTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TYPE_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1994:2: ( (this_TYPE_0= ruleTYPE | kw= 'string' | kw= 'int' | kw= 'bool' | kw= 'byte' | kw= 'rune' | kw= 'float32' | kw= 'float64' ) )
            // InternalGo.g:1995:2: (this_TYPE_0= ruleTYPE | kw= 'string' | kw= 'int' | kw= 'bool' | kw= 'byte' | kw= 'rune' | kw= 'float32' | kw= 'float64' )
            {
            // InternalGo.g:1995:2: (this_TYPE_0= ruleTYPE | kw= 'string' | kw= 'int' | kw= 'bool' | kw= 'byte' | kw= 'rune' | kw= 'float32' | kw= 'float64' )
            int alt38=8;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt38=1;
                }
                break;
            case 35:
                {
                alt38=2;
                }
                break;
            case 36:
                {
                alt38=3;
                }
                break;
            case 37:
                {
                alt38=4;
                }
                break;
            case 38:
                {
                alt38=5;
                }
                break;
            case 39:
                {
                alt38=6;
                }
                break;
            case 40:
                {
                alt38=7;
                }
                break;
            case 41:
                {
                alt38=8;
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
                    // InternalGo.g:1996:3: this_TYPE_0= ruleTYPE
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
                    // InternalGo.g:2007:3: kw= 'string'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getStringKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:2013:3: kw= 'int'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getIntKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:2019:3: kw= 'bool'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getBoolKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:2025:3: kw= 'byte'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getByteKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGo.g:2031:3: kw= 'rune'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getRuneKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGo.g:2037:3: kw= 'float32'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getFloat32Keyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalGo.g:2043:3: kw= 'float64'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2052:1: entryRuleModif returns [String current=null] : iv_ruleModif= ruleModif EOF ;
    public final String entryRuleModif() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModif = null;


        try {
            // InternalGo.g:2052:45: (iv_ruleModif= ruleModif EOF )
            // InternalGo.g:2053:2: iv_ruleModif= ruleModif EOF
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
    // InternalGo.g:2059:1: ruleModif returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VAR_0= ruleVAR | this_CONST_1= ruleCONST ) ;
    public final AntlrDatatypeRuleToken ruleModif() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VAR_0 = null;

        AntlrDatatypeRuleToken this_CONST_1 = null;



        	enterRule();

        try {
            // InternalGo.g:2065:2: ( (this_VAR_0= ruleVAR | this_CONST_1= ruleCONST ) )
            // InternalGo.g:2066:2: (this_VAR_0= ruleVAR | this_CONST_1= ruleCONST )
            {
            // InternalGo.g:2066:2: (this_VAR_0= ruleVAR | this_CONST_1= ruleCONST )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==57) ) {
                alt39=1;
            }
            else if ( (LA39_0==47) ) {
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
                    // InternalGo.g:2067:3: this_VAR_0= ruleVAR
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
                    // InternalGo.g:2078:3: this_CONST_1= ruleCONST
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
    // InternalGo.g:2092:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalGo.g:2092:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalGo.g:2093:2: iv_ruleBoolean= ruleBoolean EOF
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
    // InternalGo.g:2099:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2105:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalGo.g:2106:2: (kw= 'true' | kw= 'false' )
            {
            // InternalGo.g:2106:2: (kw= 'true' | kw= 'false' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==42) ) {
                alt40=1;
            }
            else if ( (LA40_0==43) ) {
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
                    // InternalGo.g:2107:3: kw= 'true'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2113:3: kw= 'false'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2122:1: entryRuleBREAK returns [String current=null] : iv_ruleBREAK= ruleBREAK EOF ;
    public final String entryRuleBREAK() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBREAK = null;


        try {
            // InternalGo.g:2122:45: (iv_ruleBREAK= ruleBREAK EOF )
            // InternalGo.g:2123:2: iv_ruleBREAK= ruleBREAK EOF
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
    // InternalGo.g:2129:1: ruleBREAK returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'break' ;
    public final AntlrDatatypeRuleToken ruleBREAK() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2135:2: (kw= 'break' )
            // InternalGo.g:2136:2: kw= 'break'
            {
            kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2144:1: entryRuleCASE returns [String current=null] : iv_ruleCASE= ruleCASE EOF ;
    public final String entryRuleCASE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCASE = null;


        try {
            // InternalGo.g:2144:44: (iv_ruleCASE= ruleCASE EOF )
            // InternalGo.g:2145:2: iv_ruleCASE= ruleCASE EOF
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
    // InternalGo.g:2151:1: ruleCASE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'case' ;
    public final AntlrDatatypeRuleToken ruleCASE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2157:2: (kw= 'case' )
            // InternalGo.g:2158:2: kw= 'case'
            {
            kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2166:1: entryRuleCHAN returns [String current=null] : iv_ruleCHAN= ruleCHAN EOF ;
    public final String entryRuleCHAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCHAN = null;


        try {
            // InternalGo.g:2166:44: (iv_ruleCHAN= ruleCHAN EOF )
            // InternalGo.g:2167:2: iv_ruleCHAN= ruleCHAN EOF
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
    // InternalGo.g:2173:1: ruleCHAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'chan' ;
    public final AntlrDatatypeRuleToken ruleCHAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2179:2: (kw= 'chan' )
            // InternalGo.g:2180:2: kw= 'chan'
            {
            kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2188:1: entryRuleCONST returns [String current=null] : iv_ruleCONST= ruleCONST EOF ;
    public final String entryRuleCONST() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCONST = null;


        try {
            // InternalGo.g:2188:45: (iv_ruleCONST= ruleCONST EOF )
            // InternalGo.g:2189:2: iv_ruleCONST= ruleCONST EOF
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
    // InternalGo.g:2195:1: ruleCONST returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'const' ;
    public final AntlrDatatypeRuleToken ruleCONST() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2201:2: (kw= 'const' )
            // InternalGo.g:2202:2: kw= 'const'
            {
            kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2210:1: entryRuleCONTINUE returns [String current=null] : iv_ruleCONTINUE= ruleCONTINUE EOF ;
    public final String entryRuleCONTINUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCONTINUE = null;


        try {
            // InternalGo.g:2210:48: (iv_ruleCONTINUE= ruleCONTINUE EOF )
            // InternalGo.g:2211:2: iv_ruleCONTINUE= ruleCONTINUE EOF
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
    // InternalGo.g:2217:1: ruleCONTINUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'continue' ;
    public final AntlrDatatypeRuleToken ruleCONTINUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2223:2: (kw= 'continue' )
            // InternalGo.g:2224:2: kw= 'continue'
            {
            kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2232:1: entryRuleELSE returns [String current=null] : iv_ruleELSE= ruleELSE EOF ;
    public final String entryRuleELSE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELSE = null;


        try {
            // InternalGo.g:2232:44: (iv_ruleELSE= ruleELSE EOF )
            // InternalGo.g:2233:2: iv_ruleELSE= ruleELSE EOF
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
    // InternalGo.g:2239:1: ruleELSE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'else' ;
    public final AntlrDatatypeRuleToken ruleELSE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2245:2: (kw= 'else' )
            // InternalGo.g:2246:2: kw= 'else'
            {
            kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2254:1: entryRuleFOR returns [String current=null] : iv_ruleFOR= ruleFOR EOF ;
    public final String entryRuleFOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFOR = null;


        try {
            // InternalGo.g:2254:43: (iv_ruleFOR= ruleFOR EOF )
            // InternalGo.g:2255:2: iv_ruleFOR= ruleFOR EOF
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
    // InternalGo.g:2261:1: ruleFOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'for' ;
    public final AntlrDatatypeRuleToken ruleFOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2267:2: (kw= 'for' )
            // InternalGo.g:2268:2: kw= 'for'
            {
            kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2276:1: entryRuleFUNC returns [String current=null] : iv_ruleFUNC= ruleFUNC EOF ;
    public final String entryRuleFUNC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFUNC = null;


        try {
            // InternalGo.g:2276:44: (iv_ruleFUNC= ruleFUNC EOF )
            // InternalGo.g:2277:2: iv_ruleFUNC= ruleFUNC EOF
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
    // InternalGo.g:2283:1: ruleFUNC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'func' ;
    public final AntlrDatatypeRuleToken ruleFUNC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2289:2: (kw= 'func' )
            // InternalGo.g:2290:2: kw= 'func'
            {
            kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2298:1: entryRuleIF returns [String current=null] : iv_ruleIF= ruleIF EOF ;
    public final String entryRuleIF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIF = null;


        try {
            // InternalGo.g:2298:42: (iv_ruleIF= ruleIF EOF )
            // InternalGo.g:2299:2: iv_ruleIF= ruleIF EOF
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
    // InternalGo.g:2305:1: ruleIF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'if' ;
    public final AntlrDatatypeRuleToken ruleIF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2311:2: (kw= 'if' )
            // InternalGo.g:2312:2: kw= 'if'
            {
            kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2320:1: entryRuleIMPORT returns [String current=null] : iv_ruleIMPORT= ruleIMPORT EOF ;
    public final String entryRuleIMPORT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIMPORT = null;


        try {
            // InternalGo.g:2320:46: (iv_ruleIMPORT= ruleIMPORT EOF )
            // InternalGo.g:2321:2: iv_ruleIMPORT= ruleIMPORT EOF
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
    // InternalGo.g:2327:1: ruleIMPORT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'import' ;
    public final AntlrDatatypeRuleToken ruleIMPORT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2333:2: (kw= 'import' )
            // InternalGo.g:2334:2: kw= 'import'
            {
            kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2342:1: entryRuleRETURN returns [String current=null] : iv_ruleRETURN= ruleRETURN EOF ;
    public final String entryRuleRETURN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRETURN = null;


        try {
            // InternalGo.g:2342:46: (iv_ruleRETURN= ruleRETURN EOF )
            // InternalGo.g:2343:2: iv_ruleRETURN= ruleRETURN EOF
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
    // InternalGo.g:2349:1: ruleRETURN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'return' ;
    public final AntlrDatatypeRuleToken ruleRETURN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2355:2: (kw= 'return' )
            // InternalGo.g:2356:2: kw= 'return'
            {
            kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2364:1: entryRulePACKAGE returns [String current=null] : iv_rulePACKAGE= rulePACKAGE EOF ;
    public final String entryRulePACKAGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePACKAGE = null;


        try {
            // InternalGo.g:2364:47: (iv_rulePACKAGE= rulePACKAGE EOF )
            // InternalGo.g:2365:2: iv_rulePACKAGE= rulePACKAGE EOF
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
    // InternalGo.g:2371:1: rulePACKAGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'package' ;
    public final AntlrDatatypeRuleToken rulePACKAGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2377:2: (kw= 'package' )
            // InternalGo.g:2378:2: kw= 'package'
            {
            kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2386:1: entryRuleTYPE returns [String current=null] : iv_ruleTYPE= ruleTYPE EOF ;
    public final String entryRuleTYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTYPE = null;


        try {
            // InternalGo.g:2386:44: (iv_ruleTYPE= ruleTYPE EOF )
            // InternalGo.g:2387:2: iv_ruleTYPE= ruleTYPE EOF
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
    // InternalGo.g:2393:1: ruleTYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'type' ;
    public final AntlrDatatypeRuleToken ruleTYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2399:2: (kw= 'type' )
            // InternalGo.g:2400:2: kw= 'type'
            {
            kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2408:1: entryRuleVAR returns [String current=null] : iv_ruleVAR= ruleVAR EOF ;
    public final String entryRuleVAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVAR = null;


        try {
            // InternalGo.g:2408:43: (iv_ruleVAR= ruleVAR EOF )
            // InternalGo.g:2409:2: iv_ruleVAR= ruleVAR EOF
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
    // InternalGo.g:2415:1: ruleVAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'var' ;
    public final AntlrDatatypeRuleToken ruleVAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2421:2: (kw= 'var' )
            // InternalGo.g:2422:2: kw= 'var'
            {
            kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2430:1: entryRuleRANGE returns [String current=null] : iv_ruleRANGE= ruleRANGE EOF ;
    public final String entryRuleRANGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRANGE = null;


        try {
            // InternalGo.g:2430:45: (iv_ruleRANGE= ruleRANGE EOF )
            // InternalGo.g:2431:2: iv_ruleRANGE= ruleRANGE EOF
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
    // InternalGo.g:2437:1: ruleRANGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'range' ;
    public final AntlrDatatypeRuleToken ruleRANGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2443:2: (kw= 'range' )
            // InternalGo.g:2444:2: kw= 'range'
            {
            kw=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:2452:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalGo.g:2452:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalGo.g:2453:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalGo.g:2459:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGo.g:2465:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGo.g:2466:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGo.g:2466:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGo.g:2467:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
              		
            }
            // InternalGo.g:2471:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGo.g:2472:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGo.g:2472:4: (lv_name_1_0= RULE_ID )
            // InternalGo.g:2473:5: lv_name_1_0= RULE_ID
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
        // InternalGo.g:1316:4: ( ruleELSE )
        // InternalGo.g:1316:5: ruleELSE
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
        // InternalGo.g:1336:4: ( ruleELSE )
        // InternalGo.g:1336:5: ruleELSE
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
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\4\2\5\10\uffff";
    static final String dfa_3s = "\1\73\2\7\10\uffff";
    static final String dfa_4s = "\3\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\1";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\6\1\3\1\uffff\1\10\2\uffff\1\10\44\uffff\1\2\3\uffff\1\5\1\7\1\11\3\uffff\1\1\1\uffff\1\4",
            "\1\3\1\uffff\1\12",
            "\1\3\1\uffff\1\12",
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
            return "114:2: (this_MultDecVars_0= ruleMultDecVars | this_DecVar_1= ruleDecVar | this_DataType_2= ruleDataType | this_DecFunc_3= ruleDecFunc | this_EOL_4= RULE_EOL | this_Condition_5= ruleCondition | this_Operations_6= ruleOperations | ruleDecImport )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0A388000000004B2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x010003F800000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000C00000046A0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000C0000004680L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000004100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0A388000000024B0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000007C0000002L});

}