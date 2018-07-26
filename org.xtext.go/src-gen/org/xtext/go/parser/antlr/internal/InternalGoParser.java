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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_ID", "RULE_COMMA", "RULE_EQUALS", "RULE_OPEN_PARENTHESES", "RULE_CLOSED_PARENTHESES", "RULE_OPEN_KEY", "RULE_DOISPONTOS", "RULE_CLOSED_KEY", "RULE_OPEN_BRACKETS", "RULE_INT", "RULE_CLOSED_BRACKETS", "RULE_STRING", "RULE_PLUSEQUALS", "RULE_MINUSEQUALS", "RULE_DOT", "RULE_PLUS", "RULE_MINUS", "RULE_ASTERICS", "RULE_BAR", "RULE_PLUSONE", "RULE_MINUSONE", "RULE_PONTOVIRGULA", "RULE_NEWLINE", "RULE_COMMENTS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'||'", "'&&'", "'<'", "'<='", "'=='", "'>='", "'>'", "'string'", "'int'", "'bool'", "'byte'", "'rune'", "'float32'", "'float64'", "'true'", "'false'", "'break'", "'case'", "'chan'", "'const'", "'continue'", "'else'", "'for'", "'func'", "'if'", "'import'", "'return'", "'package'", "'type'", "'var'", "'default'", "'switch'", "'range'", "'datatype'"
    };
    public static final int RULE_MINUSONE=25;
    public static final int T__50=50;
    public static final int RULE_OPEN_KEY=10;
    public static final int RULE_OPEN_PARENTHESES=8;
    public static final int RULE_BAR=23;
    public static final int RULE_DOISPONTOS=11;
    public static final int RULE_COMMENTS=28;
    public static final int RULE_EQUALS=7;
    public static final int T__59=59;
    public static final int RULE_CLOSED_PARENTHESES=9;
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
    public static final int RULE_PLUSONE=24;
    public static final int RULE_INT=14;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=29;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_PONTOVIRGULA=26;
    public static final int RULE_NEWLINE=27;
    public static final int RULE_ASTERICS=22;
    public static final int RULE_STRING=16;
    public static final int RULE_MINUSEQUALS=18;
    public static final int RULE_SL_COMMENT=30;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_OPEN_BRACKETS=13;
    public static final int RULE_PLUS=20;
    public static final int T__36=36;
    public static final int RULE_DOT=19;
    public static final int EOF=-1;
    public static final int RULE_WS=31;
    public static final int RULE_PLUSEQUALS=17;
    public static final int RULE_CLOSED_KEY=12;
    public static final int RULE_ANY_OTHER=32;
    public static final int RULE_MINUS=21;
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
    public static final int RULE_CLOSED_BRACKETS=15;

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

                if ( ((LA1_0>=RULE_EOL && LA1_0<=RULE_ID)||LA1_0==52||(LA1_0>=55 && LA1_0<=58)||LA1_0==62||LA1_0==64||LA1_0==66) ) {
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
    // InternalGo.g:107:1: ruleGreeting returns [EObject current=null] : (this_MultDecVars_0= ruleMultDecVars | this_DecVar_1= ruleDecVar | this_DataType_2= ruleDataType | this_DecFunc_3= ruleDecFunc | this_EOL_4= RULE_EOL | this_Condition_5= ruleCondition | this_SwitchCase_6= ruleSwitchCase | ruleDecImport | this_CallFunc_8= ruleCallFunc | this_CallFor_9= ruleCallFor | this_Variable_10= ruleVariable ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token this_EOL_4=null;
        EObject this_MultDecVars_0 = null;

        EObject this_DecVar_1 = null;

        EObject this_DataType_2 = null;

        EObject this_DecFunc_3 = null;

        EObject this_Condition_5 = null;

        EObject this_SwitchCase_6 = null;

        EObject this_CallFunc_8 = null;

        EObject this_CallFor_9 = null;

        EObject this_Variable_10 = null;



        	enterRule();

        try {
            // InternalGo.g:113:2: ( (this_MultDecVars_0= ruleMultDecVars | this_DecVar_1= ruleDecVar | this_DataType_2= ruleDataType | this_DecFunc_3= ruleDecFunc | this_EOL_4= RULE_EOL | this_Condition_5= ruleCondition | this_SwitchCase_6= ruleSwitchCase | ruleDecImport | this_CallFunc_8= ruleCallFunc | this_CallFor_9= ruleCallFor | this_Variable_10= ruleVariable ) )
            // InternalGo.g:114:2: (this_MultDecVars_0= ruleMultDecVars | this_DecVar_1= ruleDecVar | this_DataType_2= ruleDataType | this_DecFunc_3= ruleDecFunc | this_EOL_4= RULE_EOL | this_Condition_5= ruleCondition | this_SwitchCase_6= ruleSwitchCase | ruleDecImport | this_CallFunc_8= ruleCallFunc | this_CallFor_9= ruleCallFor | this_Variable_10= ruleVariable )
            {
            // InternalGo.g:114:2: (this_MultDecVars_0= ruleMultDecVars | this_DecVar_1= ruleDecVar | this_DataType_2= ruleDataType | this_DecFunc_3= ruleDecFunc | this_EOL_4= RULE_EOL | this_Condition_5= ruleCondition | this_SwitchCase_6= ruleSwitchCase | ruleDecImport | this_CallFunc_8= ruleCallFunc | this_CallFor_9= ruleCallFor | this_Variable_10= ruleVariable )
            int alt2=11;
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
                    // InternalGo.g:165:3: this_SwitchCase_6= ruleSwitchCase
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGreetingAccess().getSwitchCaseParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SwitchCase_6=ruleSwitchCase();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SwitchCase_6;
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
                case 11 :
                    // InternalGo.g:200:3: this_Variable_10= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGreetingAccess().getVariableParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Variable_10=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Variable_10;
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


    // $ANTLR start "entryRuleDecl"
    // InternalGo.g:212:1: entryRuleDecl returns [EObject current=null] : iv_ruleDecl= ruleDecl EOF ;
    public final EObject entryRuleDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecl = null;


        try {
            // InternalGo.g:212:45: (iv_ruleDecl= ruleDecl EOF )
            // InternalGo.g:213:2: iv_ruleDecl= ruleDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDecl=ruleDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecl; 
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
    // $ANTLR end "entryRuleDecl"


    // $ANTLR start "ruleDecl"
    // InternalGo.g:219:1: ruleDecl returns [EObject current=null] : ( ruleModif ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) ) ) ;
    public final EObject ruleDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:225:2: ( ( ruleModif ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) ) ) )
            // InternalGo.g:226:2: ( ruleModif ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) ) )
            {
            // InternalGo.g:226:2: ( ruleModif ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) ) )
            // InternalGo.g:227:3: ruleModif ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) )
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDeclAccess().getModifParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_4);
            ruleModif();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:234:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGo.g:235:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGo.g:235:4: (lv_name_1_0= RULE_ID )
            // InternalGo.g:236:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDeclAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDeclRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalGo.g:252:3: ( (lv_type_2_0= ruleTypes ) )
            // InternalGo.g:253:4: (lv_type_2_0= ruleTypes )
            {
            // InternalGo.g:253:4: (lv_type_2_0= ruleTypes )
            // InternalGo.g:254:5: lv_type_2_0= ruleTypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDeclAccess().getTypeTypesParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDeclRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"org.xtext.go.Go.Types");
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
    // $ANTLR end "ruleDecl"


    // $ANTLR start "entryRuleDecVar"
    // InternalGo.g:275:1: entryRuleDecVar returns [EObject current=null] : iv_ruleDecVar= ruleDecVar EOF ;
    public final EObject entryRuleDecVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecVar = null;


        try {
            // InternalGo.g:275:47: (iv_ruleDecVar= ruleDecVar EOF )
            // InternalGo.g:276:2: iv_ruleDecVar= ruleDecVar EOF
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
    // InternalGo.g:282:1: ruleDecVar returns [EObject current=null] : ( ( (lv_declaration_0_0= ruleDecl ) ) | ( (lv_atribuicao_1_0= ruleAtrib ) ) | ( (lv_assignment_2_0= ruleAtribVar ) ) | ( (lv_reassignment_3_0= ruleReAtrib ) ) ) ;
    public final EObject ruleDecVar() throws RecognitionException {
        EObject current = null;

        EObject lv_declaration_0_0 = null;

        EObject lv_atribuicao_1_0 = null;

        EObject lv_assignment_2_0 = null;

        EObject lv_reassignment_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:288:2: ( ( ( (lv_declaration_0_0= ruleDecl ) ) | ( (lv_atribuicao_1_0= ruleAtrib ) ) | ( (lv_assignment_2_0= ruleAtribVar ) ) | ( (lv_reassignment_3_0= ruleReAtrib ) ) ) )
            // InternalGo.g:289:2: ( ( (lv_declaration_0_0= ruleDecl ) ) | ( (lv_atribuicao_1_0= ruleAtrib ) ) | ( (lv_assignment_2_0= ruleAtribVar ) ) | ( (lv_reassignment_3_0= ruleReAtrib ) ) )
            {
            // InternalGo.g:289:2: ( ( (lv_declaration_0_0= ruleDecl ) ) | ( (lv_atribuicao_1_0= ruleAtrib ) ) | ( (lv_assignment_2_0= ruleAtribVar ) ) | ( (lv_reassignment_3_0= ruleReAtrib ) ) )
            int alt3=4;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalGo.g:290:3: ( (lv_declaration_0_0= ruleDecl ) )
                    {
                    // InternalGo.g:290:3: ( (lv_declaration_0_0= ruleDecl ) )
                    // InternalGo.g:291:4: (lv_declaration_0_0= ruleDecl )
                    {
                    // InternalGo.g:291:4: (lv_declaration_0_0= ruleDecl )
                    // InternalGo.g:292:5: lv_declaration_0_0= ruleDecl
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDecVarAccess().getDeclarationDeclParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_declaration_0_0=ruleDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDecVarRule());
                      					}
                      					set(
                      						current,
                      						"declaration",
                      						lv_declaration_0_0,
                      						"org.xtext.go.Go.Decl");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:310:3: ( (lv_atribuicao_1_0= ruleAtrib ) )
                    {
                    // InternalGo.g:310:3: ( (lv_atribuicao_1_0= ruleAtrib ) )
                    // InternalGo.g:311:4: (lv_atribuicao_1_0= ruleAtrib )
                    {
                    // InternalGo.g:311:4: (lv_atribuicao_1_0= ruleAtrib )
                    // InternalGo.g:312:5: lv_atribuicao_1_0= ruleAtrib
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDecVarAccess().getAtribuicaoAtribParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_atribuicao_1_0=ruleAtrib();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDecVarRule());
                      					}
                      					set(
                      						current,
                      						"atribuicao",
                      						lv_atribuicao_1_0,
                      						"org.xtext.go.Go.Atrib");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:330:3: ( (lv_assignment_2_0= ruleAtribVar ) )
                    {
                    // InternalGo.g:330:3: ( (lv_assignment_2_0= ruleAtribVar ) )
                    // InternalGo.g:331:4: (lv_assignment_2_0= ruleAtribVar )
                    {
                    // InternalGo.g:331:4: (lv_assignment_2_0= ruleAtribVar )
                    // InternalGo.g:332:5: lv_assignment_2_0= ruleAtribVar
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDecVarAccess().getAssignmentAtribVarParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_assignment_2_0=ruleAtribVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDecVarRule());
                      					}
                      					set(
                      						current,
                      						"assignment",
                      						lv_assignment_2_0,
                      						"org.xtext.go.Go.AtribVar");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:350:3: ( (lv_reassignment_3_0= ruleReAtrib ) )
                    {
                    // InternalGo.g:350:3: ( (lv_reassignment_3_0= ruleReAtrib ) )
                    // InternalGo.g:351:4: (lv_reassignment_3_0= ruleReAtrib )
                    {
                    // InternalGo.g:351:4: (lv_reassignment_3_0= ruleReAtrib )
                    // InternalGo.g:352:5: lv_reassignment_3_0= ruleReAtrib
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDecVarAccess().getReassignmentReAtribParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_reassignment_3_0=ruleReAtrib();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDecVarRule());
                      					}
                      					set(
                      						current,
                      						"reassignment",
                      						lv_reassignment_3_0,
                      						"org.xtext.go.Go.ReAtrib");
                      					afterParserOrEnumRuleCall();
                      				
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
    // $ANTLR end "ruleDecVar"


    // $ANTLR start "entryRuleAtribVar"
    // InternalGo.g:373:1: entryRuleAtribVar returns [EObject current=null] : iv_ruleAtribVar= ruleAtribVar EOF ;
    public final EObject entryRuleAtribVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtribVar = null;


        try {
            // InternalGo.g:373:49: (iv_ruleAtribVar= ruleAtribVar EOF )
            // InternalGo.g:374:2: iv_ruleAtribVar= ruleAtribVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtribVarRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtribVar=ruleAtribVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtribVar; 
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
    // $ANTLR end "entryRuleAtribVar"


    // $ANTLR start "ruleAtribVar"
    // InternalGo.g:380:1: ruleAtribVar returns [EObject current=null] : ( ruleModif ( (lv_vars_1_0= RULE_ID ) ) (this_Comma_2= RULE_COMMA ( (lv_vars_3_0= RULE_ID ) ) )* ( (lv_type_4_0= ruleTypes ) ) (this_equals_5= RULE_EQUALS ( (lv_atrb_6_0= ruleAtrib_Aux ) ) (this_Comma_7= RULE_COMMA ( (lv_atrb_8_0= ruleAtrib_Aux ) )* ) )? ) ;
    public final EObject ruleAtribVar() throws RecognitionException {
        EObject current = null;

        Token lv_vars_1_0=null;
        Token this_Comma_2=null;
        Token lv_vars_3_0=null;
        Token this_equals_5=null;
        Token this_Comma_7=null;
        AntlrDatatypeRuleToken lv_type_4_0 = null;

        EObject lv_atrb_6_0 = null;

        EObject lv_atrb_8_0 = null;



        	enterRule();

        try {
            // InternalGo.g:386:2: ( ( ruleModif ( (lv_vars_1_0= RULE_ID ) ) (this_Comma_2= RULE_COMMA ( (lv_vars_3_0= RULE_ID ) ) )* ( (lv_type_4_0= ruleTypes ) ) (this_equals_5= RULE_EQUALS ( (lv_atrb_6_0= ruleAtrib_Aux ) ) (this_Comma_7= RULE_COMMA ( (lv_atrb_8_0= ruleAtrib_Aux ) )* ) )? ) )
            // InternalGo.g:387:2: ( ruleModif ( (lv_vars_1_0= RULE_ID ) ) (this_Comma_2= RULE_COMMA ( (lv_vars_3_0= RULE_ID ) ) )* ( (lv_type_4_0= ruleTypes ) ) (this_equals_5= RULE_EQUALS ( (lv_atrb_6_0= ruleAtrib_Aux ) ) (this_Comma_7= RULE_COMMA ( (lv_atrb_8_0= ruleAtrib_Aux ) )* ) )? )
            {
            // InternalGo.g:387:2: ( ruleModif ( (lv_vars_1_0= RULE_ID ) ) (this_Comma_2= RULE_COMMA ( (lv_vars_3_0= RULE_ID ) ) )* ( (lv_type_4_0= ruleTypes ) ) (this_equals_5= RULE_EQUALS ( (lv_atrb_6_0= ruleAtrib_Aux ) ) (this_Comma_7= RULE_COMMA ( (lv_atrb_8_0= ruleAtrib_Aux ) )* ) )? )
            // InternalGo.g:388:3: ruleModif ( (lv_vars_1_0= RULE_ID ) ) (this_Comma_2= RULE_COMMA ( (lv_vars_3_0= RULE_ID ) ) )* ( (lv_type_4_0= ruleTypes ) ) (this_equals_5= RULE_EQUALS ( (lv_atrb_6_0= ruleAtrib_Aux ) ) (this_Comma_7= RULE_COMMA ( (lv_atrb_8_0= ruleAtrib_Aux ) )* ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAtribVarAccess().getModifParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_4);
            ruleModif();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:395:3: ( (lv_vars_1_0= RULE_ID ) )
            // InternalGo.g:396:4: (lv_vars_1_0= RULE_ID )
            {
            // InternalGo.g:396:4: (lv_vars_1_0= RULE_ID )
            // InternalGo.g:397:5: lv_vars_1_0= RULE_ID
            {
            lv_vars_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_vars_1_0, grammarAccess.getAtribVarAccess().getVarsIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAtribVarRule());
              					}
              					addWithLastConsumed(
              						current,
              						"vars",
              						lv_vars_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalGo.g:413:3: (this_Comma_2= RULE_COMMA ( (lv_vars_3_0= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGo.g:414:4: this_Comma_2= RULE_COMMA ( (lv_vars_3_0= RULE_ID ) )
            	    {
            	    this_Comma_2=(Token)match(input,RULE_COMMA,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_Comma_2, grammarAccess.getAtribVarAccess().getCommaTerminalRuleCall_2_0());
            	      			
            	    }
            	    // InternalGo.g:418:4: ( (lv_vars_3_0= RULE_ID ) )
            	    // InternalGo.g:419:5: (lv_vars_3_0= RULE_ID )
            	    {
            	    // InternalGo.g:419:5: (lv_vars_3_0= RULE_ID )
            	    // InternalGo.g:420:6: lv_vars_3_0= RULE_ID
            	    {
            	    lv_vars_3_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_vars_3_0, grammarAccess.getAtribVarAccess().getVarsIDTerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getAtribVarRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"vars",
            	      							lv_vars_3_0,
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

            // InternalGo.g:437:3: ( (lv_type_4_0= ruleTypes ) )
            // InternalGo.g:438:4: (lv_type_4_0= ruleTypes )
            {
            // InternalGo.g:438:4: (lv_type_4_0= ruleTypes )
            // InternalGo.g:439:5: lv_type_4_0= ruleTypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAtribVarAccess().getTypeTypesParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_type_4_0=ruleTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAtribVarRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_4_0,
              						"org.xtext.go.Go.Types");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGo.g:456:3: (this_equals_5= RULE_EQUALS ( (lv_atrb_6_0= ruleAtrib_Aux ) ) (this_Comma_7= RULE_COMMA ( (lv_atrb_8_0= ruleAtrib_Aux ) )* ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_EQUALS) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGo.g:457:4: this_equals_5= RULE_EQUALS ( (lv_atrb_6_0= ruleAtrib_Aux ) ) (this_Comma_7= RULE_COMMA ( (lv_atrb_8_0= ruleAtrib_Aux ) )* )
                    {
                    this_equals_5=(Token)match(input,RULE_EQUALS,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_equals_5, grammarAccess.getAtribVarAccess().getEqualsTerminalRuleCall_4_0());
                      			
                    }
                    // InternalGo.g:461:4: ( (lv_atrb_6_0= ruleAtrib_Aux ) )
                    // InternalGo.g:462:5: (lv_atrb_6_0= ruleAtrib_Aux )
                    {
                    // InternalGo.g:462:5: (lv_atrb_6_0= ruleAtrib_Aux )
                    // InternalGo.g:463:6: lv_atrb_6_0= ruleAtrib_Aux
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtribVarAccess().getAtrbAtrib_AuxParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_atrb_6_0=ruleAtrib_Aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtribVarRule());
                      						}
                      						add(
                      							current,
                      							"atrb",
                      							lv_atrb_6_0,
                      							"org.xtext.go.Go.Atrib_Aux");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGo.g:480:4: (this_Comma_7= RULE_COMMA ( (lv_atrb_8_0= ruleAtrib_Aux ) )* )
                    // InternalGo.g:481:5: this_Comma_7= RULE_COMMA ( (lv_atrb_8_0= ruleAtrib_Aux ) )*
                    {
                    this_Comma_7=(Token)match(input,RULE_COMMA,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_Comma_7, grammarAccess.getAtribVarAccess().getCommaTerminalRuleCall_4_2_0());
                      				
                    }
                    // InternalGo.g:485:5: ( (lv_atrb_8_0= ruleAtrib_Aux ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID||LA5_0==RULE_OPEN_PARENTHESES||(LA5_0>=RULE_OPEN_BRACKETS && LA5_0<=RULE_INT)||LA5_0==RULE_STRING||(LA5_0>=47 && LA5_0<=48)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalGo.g:486:6: (lv_atrb_8_0= ruleAtrib_Aux )
                    	    {
                    	    // InternalGo.g:486:6: (lv_atrb_8_0= ruleAtrib_Aux )
                    	    // InternalGo.g:487:7: lv_atrb_8_0= ruleAtrib_Aux
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAtribVarAccess().getAtrbAtrib_AuxParserRuleCall_4_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    lv_atrb_8_0=ruleAtrib_Aux();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getAtribVarRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"atrb",
                    	      								lv_atrb_8_0,
                    	      								"org.xtext.go.Go.Atrib_Aux");
                    	      							afterParserOrEnumRuleCall();
                    	      						
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
    // $ANTLR end "ruleAtribVar"


    // $ANTLR start "entryRuleAtrib_Aux"
    // InternalGo.g:510:1: entryRuleAtrib_Aux returns [EObject current=null] : iv_ruleAtrib_Aux= ruleAtrib_Aux EOF ;
    public final EObject entryRuleAtrib_Aux() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtrib_Aux = null;


        try {
            // InternalGo.g:510:50: (iv_ruleAtrib_Aux= ruleAtrib_Aux EOF )
            // InternalGo.g:511:2: iv_ruleAtrib_Aux= ruleAtrib_Aux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtrib_AuxRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtrib_Aux=ruleAtrib_Aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtrib_Aux; 
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
    // $ANTLR end "entryRuleAtrib_Aux"


    // $ANTLR start "ruleAtrib_Aux"
    // InternalGo.g:517:1: ruleAtrib_Aux returns [EObject current=null] : (this_Operations_0= ruleOperations | this_Atri_1= ruleAtri | this_Variable_2= ruleVariable | this_CallFunc_3= ruleCallFunc ) ;
    public final EObject ruleAtrib_Aux() throws RecognitionException {
        EObject current = null;

        EObject this_Operations_0 = null;

        EObject this_Atri_1 = null;

        EObject this_Variable_2 = null;

        EObject this_CallFunc_3 = null;



        	enterRule();

        try {
            // InternalGo.g:523:2: ( (this_Operations_0= ruleOperations | this_Atri_1= ruleAtri | this_Variable_2= ruleVariable | this_CallFunc_3= ruleCallFunc ) )
            // InternalGo.g:524:2: (this_Operations_0= ruleOperations | this_Atri_1= ruleAtri | this_Variable_2= ruleVariable | this_CallFunc_3= ruleCallFunc )
            {
            // InternalGo.g:524:2: (this_Operations_0= ruleOperations | this_Atri_1= ruleAtri | this_Variable_2= ruleVariable | this_CallFunc_3= ruleCallFunc )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_OPEN_PARENTHESES:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
                {
                alt7=1;
                }
                break;
            case RULE_OPEN_BRACKETS:
            case RULE_STRING:
            case 47:
            case 48:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
                {
                int LA7_4 = input.LA(2);

                if ( (LA7_4==EOF||(LA7_4>=RULE_EOL && LA7_4<=RULE_COMMA)||(LA7_4>=RULE_CLOSED_KEY && LA7_4<=RULE_INT)||LA7_4==RULE_STRING||LA7_4==RULE_PONTOVIRGULA||(LA7_4>=47 && LA7_4<=48)||LA7_4==50||LA7_4==52||(LA7_4>=55 && LA7_4<=59)||(LA7_4>=62 && LA7_4<=64)||LA7_4==66) ) {
                    alt7=3;
                }
                else if ( (LA7_4==RULE_OPEN_PARENTHESES) ) {
                    int LA7_6 = input.LA(3);

                    if ( (LA7_6==RULE_ID||LA7_6==RULE_CLOSED_PARENTHESES) ) {
                        alt7=4;
                    }
                    else if ( (LA7_6==RULE_OPEN_PARENTHESES||LA7_6==RULE_INT) ) {
                        alt7=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 6, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalGo.g:525:3: this_Operations_0= ruleOperations
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtrib_AuxAccess().getOperationsParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Operations_0=ruleOperations();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Operations_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:534:3: this_Atri_1= ruleAtri
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtrib_AuxAccess().getAtriParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Atri_1=ruleAtri();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Atri_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:543:3: this_Variable_2= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtrib_AuxAccess().getVariableParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Variable_2=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Variable_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:552:3: this_CallFunc_3= ruleCallFunc
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtrib_AuxAccess().getCallFuncParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CallFunc_3=ruleCallFunc();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CallFunc_3;
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
    // $ANTLR end "ruleAtrib_Aux"


    // $ANTLR start "entryRuleVariable"
    // InternalGo.g:564:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalGo.g:564:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalGo.g:565:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalGo.g:571:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalGo.g:577:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalGo.g:578:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalGo.g:578:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalGo.g:579:3: (lv_name_0_0= RULE_ID )
            {
            // InternalGo.g:579:3: (lv_name_0_0= RULE_ID )
            // InternalGo.g:580:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getVariableRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleAtrib"
    // InternalGo.g:599:1: entryRuleAtrib returns [EObject current=null] : iv_ruleAtrib= ruleAtrib EOF ;
    public final EObject entryRuleAtrib() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtrib = null;


        try {
            // InternalGo.g:599:46: (iv_ruleAtrib= ruleAtrib EOF )
            // InternalGo.g:600:2: iv_ruleAtrib= ruleAtrib EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtribRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtrib=ruleAtrib();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtrib; 
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
    // $ANTLR end "entryRuleAtrib"


    // $ANTLR start "ruleAtrib"
    // InternalGo.g:606:1: ruleAtrib returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleModif ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) ) this_equals_3= RULE_EQUALS ( (lv_atrib_4_0= ruleAtrib_Aux ) ) ) ;
    public final EObject ruleAtrib() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token this_equals_3=null;
        AntlrDatatypeRuleToken lv_modifier_0_0 = null;

        AntlrDatatypeRuleToken lv_type_2_0 = null;

        EObject lv_atrib_4_0 = null;



        	enterRule();

        try {
            // InternalGo.g:612:2: ( ( ( (lv_modifier_0_0= ruleModif ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) ) this_equals_3= RULE_EQUALS ( (lv_atrib_4_0= ruleAtrib_Aux ) ) ) )
            // InternalGo.g:613:2: ( ( (lv_modifier_0_0= ruleModif ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) ) this_equals_3= RULE_EQUALS ( (lv_atrib_4_0= ruleAtrib_Aux ) ) )
            {
            // InternalGo.g:613:2: ( ( (lv_modifier_0_0= ruleModif ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) ) this_equals_3= RULE_EQUALS ( (lv_atrib_4_0= ruleAtrib_Aux ) ) )
            // InternalGo.g:614:3: ( (lv_modifier_0_0= ruleModif ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) ) this_equals_3= RULE_EQUALS ( (lv_atrib_4_0= ruleAtrib_Aux ) )
            {
            // InternalGo.g:614:3: ( (lv_modifier_0_0= ruleModif ) )
            // InternalGo.g:615:4: (lv_modifier_0_0= ruleModif )
            {
            // InternalGo.g:615:4: (lv_modifier_0_0= ruleModif )
            // InternalGo.g:616:5: lv_modifier_0_0= ruleModif
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAtribAccess().getModifierModifParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_modifier_0_0=ruleModif();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAtribRule());
              					}
              					set(
              						current,
              						"modifier",
              						lv_modifier_0_0,
              						"org.xtext.go.Go.Modif");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGo.g:633:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGo.g:634:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGo.g:634:4: (lv_name_1_0= RULE_ID )
            // InternalGo.g:635:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getAtribAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAtribRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalGo.g:651:3: ( (lv_type_2_0= ruleTypes ) )
            // InternalGo.g:652:4: (lv_type_2_0= ruleTypes )
            {
            // InternalGo.g:652:4: (lv_type_2_0= ruleTypes )
            // InternalGo.g:653:5: lv_type_2_0= ruleTypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAtribAccess().getTypeTypesParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_type_2_0=ruleTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAtribRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"org.xtext.go.Go.Types");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_equals_3=(Token)match(input,RULE_EQUALS,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_equals_3, grammarAccess.getAtribAccess().getEqualsTerminalRuleCall_3());
              		
            }
            // InternalGo.g:674:3: ( (lv_atrib_4_0= ruleAtrib_Aux ) )
            // InternalGo.g:675:4: (lv_atrib_4_0= ruleAtrib_Aux )
            {
            // InternalGo.g:675:4: (lv_atrib_4_0= ruleAtrib_Aux )
            // InternalGo.g:676:5: lv_atrib_4_0= ruleAtrib_Aux
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAtribAccess().getAtribAtrib_AuxParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_atrib_4_0=ruleAtrib_Aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAtribRule());
              					}
              					set(
              						current,
              						"atrib",
              						lv_atrib_4_0,
              						"org.xtext.go.Go.Atrib_Aux");
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
    // $ANTLR end "ruleAtrib"


    // $ANTLR start "entryRuleReAtrib"
    // InternalGo.g:697:1: entryRuleReAtrib returns [EObject current=null] : iv_ruleReAtrib= ruleReAtrib EOF ;
    public final EObject entryRuleReAtrib() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReAtrib = null;


        try {
            // InternalGo.g:697:48: (iv_ruleReAtrib= ruleReAtrib EOF )
            // InternalGo.g:698:2: iv_ruleReAtrib= ruleReAtrib EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReAtribRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReAtrib=ruleReAtrib();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReAtrib; 
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
    // $ANTLR end "entryRuleReAtrib"


    // $ANTLR start "ruleReAtrib"
    // InternalGo.g:704:1: ruleReAtrib returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) this_equals_1= RULE_EQUALS ( (lv_atrib_2_0= ruleAtrib_Aux ) ) ) ;
    public final EObject ruleReAtrib() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_equals_1=null;
        EObject lv_atrib_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:710:2: ( ( ( (lv_name_0_0= RULE_ID ) ) this_equals_1= RULE_EQUALS ( (lv_atrib_2_0= ruleAtrib_Aux ) ) ) )
            // InternalGo.g:711:2: ( ( (lv_name_0_0= RULE_ID ) ) this_equals_1= RULE_EQUALS ( (lv_atrib_2_0= ruleAtrib_Aux ) ) )
            {
            // InternalGo.g:711:2: ( ( (lv_name_0_0= RULE_ID ) ) this_equals_1= RULE_EQUALS ( (lv_atrib_2_0= ruleAtrib_Aux ) ) )
            // InternalGo.g:712:3: ( (lv_name_0_0= RULE_ID ) ) this_equals_1= RULE_EQUALS ( (lv_atrib_2_0= ruleAtrib_Aux ) )
            {
            // InternalGo.g:712:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGo.g:713:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGo.g:713:4: (lv_name_0_0= RULE_ID )
            // InternalGo.g:714:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getReAtribAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getReAtribRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            this_equals_1=(Token)match(input,RULE_EQUALS,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_equals_1, grammarAccess.getReAtribAccess().getEqualsTerminalRuleCall_1());
              		
            }
            // InternalGo.g:734:3: ( (lv_atrib_2_0= ruleAtrib_Aux ) )
            // InternalGo.g:735:4: (lv_atrib_2_0= ruleAtrib_Aux )
            {
            // InternalGo.g:735:4: (lv_atrib_2_0= ruleAtrib_Aux )
            // InternalGo.g:736:5: lv_atrib_2_0= ruleAtrib_Aux
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReAtribAccess().getAtribAtrib_AuxParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_atrib_2_0=ruleAtrib_Aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReAtribRule());
              					}
              					set(
              						current,
              						"atrib",
              						lv_atrib_2_0,
              						"org.xtext.go.Go.Atrib_Aux");
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
    // $ANTLR end "ruleReAtrib"


    // $ANTLR start "entryRuleMultDecVars"
    // InternalGo.g:757:1: entryRuleMultDecVars returns [EObject current=null] : iv_ruleMultDecVars= ruleMultDecVars EOF ;
    public final EObject entryRuleMultDecVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultDecVars = null;


        try {
            // InternalGo.g:757:52: (iv_ruleMultDecVars= ruleMultDecVars EOF )
            // InternalGo.g:758:2: iv_ruleMultDecVars= ruleMultDecVars EOF
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
    // InternalGo.g:764:1: ruleMultDecVars returns [EObject current=null] : ( ruleModif this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( ( (lv_name_2_0= RULE_ID ) ) this_equals_3= RULE_EQUALS ( ( (lv_typw_4_0= ruleTypeValue ) ) | ( (lv_value_5_0= RULE_ID ) ) ) )* this_Closed_parentheses_6= RULE_CLOSED_PARENTHESES ) ;
    public final EObject ruleMultDecVars() throws RecognitionException {
        EObject current = null;

        Token this_Open_parentheses_1=null;
        Token lv_name_2_0=null;
        Token this_equals_3=null;
        Token lv_value_5_0=null;
        Token this_Closed_parentheses_6=null;
        EObject lv_typw_4_0 = null;



        	enterRule();

        try {
            // InternalGo.g:770:2: ( ( ruleModif this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( ( (lv_name_2_0= RULE_ID ) ) this_equals_3= RULE_EQUALS ( ( (lv_typw_4_0= ruleTypeValue ) ) | ( (lv_value_5_0= RULE_ID ) ) ) )* this_Closed_parentheses_6= RULE_CLOSED_PARENTHESES ) )
            // InternalGo.g:771:2: ( ruleModif this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( ( (lv_name_2_0= RULE_ID ) ) this_equals_3= RULE_EQUALS ( ( (lv_typw_4_0= ruleTypeValue ) ) | ( (lv_value_5_0= RULE_ID ) ) ) )* this_Closed_parentheses_6= RULE_CLOSED_PARENTHESES )
            {
            // InternalGo.g:771:2: ( ruleModif this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( ( (lv_name_2_0= RULE_ID ) ) this_equals_3= RULE_EQUALS ( ( (lv_typw_4_0= ruleTypeValue ) ) | ( (lv_value_5_0= RULE_ID ) ) ) )* this_Closed_parentheses_6= RULE_CLOSED_PARENTHESES )
            // InternalGo.g:772:3: ruleModif this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( ( (lv_name_2_0= RULE_ID ) ) this_equals_3= RULE_EQUALS ( ( (lv_typw_4_0= ruleTypeValue ) ) | ( (lv_value_5_0= RULE_ID ) ) ) )* this_Closed_parentheses_6= RULE_CLOSED_PARENTHESES
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultDecVarsAccess().getModifParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_12);
            ruleModif();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_Open_parentheses_1=(Token)match(input,RULE_OPEN_PARENTHESES,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Open_parentheses_1, grammarAccess.getMultDecVarsAccess().getOpen_parenthesesTerminalRuleCall_1());
              		
            }
            // InternalGo.g:783:3: ( ( (lv_name_2_0= RULE_ID ) ) this_equals_3= RULE_EQUALS ( ( (lv_typw_4_0= ruleTypeValue ) ) | ( (lv_value_5_0= RULE_ID ) ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGo.g:784:4: ( (lv_name_2_0= RULE_ID ) ) this_equals_3= RULE_EQUALS ( ( (lv_typw_4_0= ruleTypeValue ) ) | ( (lv_value_5_0= RULE_ID ) ) )
            	    {
            	    // InternalGo.g:784:4: ( (lv_name_2_0= RULE_ID ) )
            	    // InternalGo.g:785:5: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalGo.g:785:5: (lv_name_2_0= RULE_ID )
            	    // InternalGo.g:786:6: lv_name_2_0= RULE_ID
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

            	    this_equals_3=(Token)match(input,RULE_EQUALS,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_equals_3, grammarAccess.getMultDecVarsAccess().getEqualsTerminalRuleCall_2_1());
            	      			
            	    }
            	    // InternalGo.g:806:4: ( ( (lv_typw_4_0= ruleTypeValue ) ) | ( (lv_value_5_0= RULE_ID ) ) )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==RULE_INT||LA8_0==RULE_STRING||(LA8_0>=47 && LA8_0<=48)) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==RULE_ID) ) {
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
            	            // InternalGo.g:807:5: ( (lv_typw_4_0= ruleTypeValue ) )
            	            {
            	            // InternalGo.g:807:5: ( (lv_typw_4_0= ruleTypeValue ) )
            	            // InternalGo.g:808:6: (lv_typw_4_0= ruleTypeValue )
            	            {
            	            // InternalGo.g:808:6: (lv_typw_4_0= ruleTypeValue )
            	            // InternalGo.g:809:7: lv_typw_4_0= ruleTypeValue
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getMultDecVarsAccess().getTypwTypeValueParserRuleCall_2_2_0_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_13);
            	            lv_typw_4_0=ruleTypeValue();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getMultDecVarsRule());
            	              							}
            	              							set(
            	              								current,
            	              								"typw",
            	              								lv_typw_4_0,
            	              								"org.xtext.go.Go.TypeValue");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalGo.g:827:5: ( (lv_value_5_0= RULE_ID ) )
            	            {
            	            // InternalGo.g:827:5: ( (lv_value_5_0= RULE_ID ) )
            	            // InternalGo.g:828:6: (lv_value_5_0= RULE_ID )
            	            {
            	            // InternalGo.g:828:6: (lv_value_5_0= RULE_ID )
            	            // InternalGo.g:829:7: lv_value_5_0= RULE_ID
            	            {
            	            lv_value_5_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
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
            	    break loop9;
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


    // $ANTLR start "entryRuleSwitchCase"
    // InternalGo.g:855:1: entryRuleSwitchCase returns [EObject current=null] : iv_ruleSwitchCase= ruleSwitchCase EOF ;
    public final EObject entryRuleSwitchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchCase = null;


        try {
            // InternalGo.g:855:51: (iv_ruleSwitchCase= ruleSwitchCase EOF )
            // InternalGo.g:856:2: iv_ruleSwitchCase= ruleSwitchCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchCaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSwitchCase=ruleSwitchCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchCase; 
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
    // $ANTLR end "entryRuleSwitchCase"


    // $ANTLR start "ruleSwitchCase"
    // InternalGo.g:862:1: ruleSwitchCase returns [EObject current=null] : ( ruleSWITCH ( (lv_name_1_0= RULE_ID ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_cas_3_0= ruleCases ) )* ( ruleDEFAULT this_DoisPontos_5= RULE_DOISPONTOS ( (lv_k_6_0= ruleGreeting ) )* )? this_Closed_Key_7= RULE_CLOSED_KEY ) ;
    public final EObject ruleSwitchCase() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token this_Open_Key_2=null;
        Token this_DoisPontos_5=null;
        Token this_Closed_Key_7=null;
        EObject lv_cas_3_0 = null;

        EObject lv_k_6_0 = null;



        	enterRule();

        try {
            // InternalGo.g:868:2: ( ( ruleSWITCH ( (lv_name_1_0= RULE_ID ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_cas_3_0= ruleCases ) )* ( ruleDEFAULT this_DoisPontos_5= RULE_DOISPONTOS ( (lv_k_6_0= ruleGreeting ) )* )? this_Closed_Key_7= RULE_CLOSED_KEY ) )
            // InternalGo.g:869:2: ( ruleSWITCH ( (lv_name_1_0= RULE_ID ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_cas_3_0= ruleCases ) )* ( ruleDEFAULT this_DoisPontos_5= RULE_DOISPONTOS ( (lv_k_6_0= ruleGreeting ) )* )? this_Closed_Key_7= RULE_CLOSED_KEY )
            {
            // InternalGo.g:869:2: ( ruleSWITCH ( (lv_name_1_0= RULE_ID ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_cas_3_0= ruleCases ) )* ( ruleDEFAULT this_DoisPontos_5= RULE_DOISPONTOS ( (lv_k_6_0= ruleGreeting ) )* )? this_Closed_Key_7= RULE_CLOSED_KEY )
            // InternalGo.g:870:3: ruleSWITCH ( (lv_name_1_0= RULE_ID ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_cas_3_0= ruleCases ) )* ( ruleDEFAULT this_DoisPontos_5= RULE_DOISPONTOS ( (lv_k_6_0= ruleGreeting ) )* )? this_Closed_Key_7= RULE_CLOSED_KEY
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSwitchCaseAccess().getSWITCHParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_4);
            ruleSWITCH();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:877:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGo.g:878:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGo.g:878:4: (lv_name_1_0= RULE_ID )
            // InternalGo.g:879:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getSwitchCaseAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSwitchCaseRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            this_Open_Key_2=(Token)match(input,RULE_OPEN_KEY,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Open_Key_2, grammarAccess.getSwitchCaseAccess().getOpen_KeyTerminalRuleCall_2());
              		
            }
            // InternalGo.g:899:3: ( (lv_cas_3_0= ruleCases ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==50) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGo.g:900:4: (lv_cas_3_0= ruleCases )
            	    {
            	    // InternalGo.g:900:4: (lv_cas_3_0= ruleCases )
            	    // InternalGo.g:901:5: lv_cas_3_0= ruleCases
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSwitchCaseAccess().getCasCasesParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_cas_3_0=ruleCases();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSwitchCaseRule());
            	      					}
            	      					set(
            	      						current,
            	      						"cas",
            	      						lv_cas_3_0,
            	      						"org.xtext.go.Go.Cases");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalGo.g:918:3: ( ruleDEFAULT this_DoisPontos_5= RULE_DOISPONTOS ( (lv_k_6_0= ruleGreeting ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==63) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGo.g:919:4: ruleDEFAULT this_DoisPontos_5= RULE_DOISPONTOS ( (lv_k_6_0= ruleGreeting ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSwitchCaseAccess().getDEFAULTParserRuleCall_4_0());
                      			
                    }
                    pushFollow(FOLLOW_17);
                    ruleDEFAULT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    this_DoisPontos_5=(Token)match(input,RULE_DOISPONTOS,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DoisPontos_5, grammarAccess.getSwitchCaseAccess().getDoisPontosTerminalRuleCall_4_1());
                      			
                    }
                    // InternalGo.g:930:4: ( (lv_k_6_0= ruleGreeting ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>=RULE_EOL && LA11_0<=RULE_ID)||LA11_0==52||(LA11_0>=55 && LA11_0<=58)||LA11_0==62||LA11_0==64||LA11_0==66) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalGo.g:931:5: (lv_k_6_0= ruleGreeting )
                    	    {
                    	    // InternalGo.g:931:5: (lv_k_6_0= ruleGreeting )
                    	    // InternalGo.g:932:6: lv_k_6_0= ruleGreeting
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getSwitchCaseAccess().getKGreetingParserRuleCall_4_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    lv_k_6_0=ruleGreeting();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getSwitchCaseRule());
                    	      						}
                    	      						set(
                    	      							current,
                    	      							"k",
                    	      							lv_k_6_0,
                    	      							"org.xtext.go.Go.Greeting");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            this_Closed_Key_7=(Token)match(input,RULE_CLOSED_KEY,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Closed_Key_7, grammarAccess.getSwitchCaseAccess().getClosed_KeyTerminalRuleCall_5());
              		
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
    // $ANTLR end "ruleSwitchCase"


    // $ANTLR start "entryRuleCases"
    // InternalGo.g:958:1: entryRuleCases returns [EObject current=null] : iv_ruleCases= ruleCases EOF ;
    public final EObject entryRuleCases() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCases = null;


        try {
            // InternalGo.g:958:46: (iv_ruleCases= ruleCases EOF )
            // InternalGo.g:959:2: iv_ruleCases= ruleCases EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCasesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCases=ruleCases();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCases; 
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
    // $ANTLR end "entryRuleCases"


    // $ANTLR start "ruleCases"
    // InternalGo.g:965:1: ruleCases returns [EObject current=null] : ( ruleCASE ( (lv_x_1_0= ruleExpression ) ) this_DoisPontos_2= RULE_DOISPONTOS ( (lv_v_3_0= ruleGreeting ) )* ) ;
    public final EObject ruleCases() throws RecognitionException {
        EObject current = null;

        Token this_DoisPontos_2=null;
        EObject lv_x_1_0 = null;

        EObject lv_v_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:971:2: ( ( ruleCASE ( (lv_x_1_0= ruleExpression ) ) this_DoisPontos_2= RULE_DOISPONTOS ( (lv_v_3_0= ruleGreeting ) )* ) )
            // InternalGo.g:972:2: ( ruleCASE ( (lv_x_1_0= ruleExpression ) ) this_DoisPontos_2= RULE_DOISPONTOS ( (lv_v_3_0= ruleGreeting ) )* )
            {
            // InternalGo.g:972:2: ( ruleCASE ( (lv_x_1_0= ruleExpression ) ) this_DoisPontos_2= RULE_DOISPONTOS ( (lv_v_3_0= ruleGreeting ) )* )
            // InternalGo.g:973:3: ruleCASE ( (lv_x_1_0= ruleExpression ) ) this_DoisPontos_2= RULE_DOISPONTOS ( (lv_v_3_0= ruleGreeting ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCasesAccess().getCASEParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_14);
            ruleCASE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:980:3: ( (lv_x_1_0= ruleExpression ) )
            // InternalGo.g:981:4: (lv_x_1_0= ruleExpression )
            {
            // InternalGo.g:981:4: (lv_x_1_0= ruleExpression )
            // InternalGo.g:982:5: lv_x_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCasesAccess().getXExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_x_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCasesRule());
              					}
              					set(
              						current,
              						"x",
              						lv_x_1_0,
              						"org.xtext.go.Go.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_DoisPontos_2=(Token)match(input,RULE_DOISPONTOS,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DoisPontos_2, grammarAccess.getCasesAccess().getDoisPontosTerminalRuleCall_2());
              		
            }
            // InternalGo.g:1003:3: ( (lv_v_3_0= ruleGreeting ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_EOL && LA13_0<=RULE_ID)||LA13_0==52||(LA13_0>=55 && LA13_0<=58)||LA13_0==62||LA13_0==64||LA13_0==66) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGo.g:1004:4: (lv_v_3_0= ruleGreeting )
            	    {
            	    // InternalGo.g:1004:4: (lv_v_3_0= ruleGreeting )
            	    // InternalGo.g:1005:5: lv_v_3_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCasesAccess().getVGreetingParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_v_3_0=ruleGreeting();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getCasesRule());
            	      					}
            	      					set(
            	      						current,
            	      						"v",
            	      						lv_v_3_0,
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
    // $ANTLR end "ruleCases"


    // $ANTLR start "entryRuleAtri"
    // InternalGo.g:1026:1: entryRuleAtri returns [EObject current=null] : iv_ruleAtri= ruleAtri EOF ;
    public final EObject entryRuleAtri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtri = null;


        try {
            // InternalGo.g:1026:45: (iv_ruleAtri= ruleAtri EOF )
            // InternalGo.g:1027:2: iv_ruleAtri= ruleAtri EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtriRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtri=ruleAtri();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtri; 
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
    // InternalGo.g:1033:1: ruleAtri returns [EObject current=null] : ( (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? ) | this_TypeValue_7= ruleTypeValue ) ;
    public final EObject ruleAtri() throws RecognitionException {
        EObject current = null;

        Token this_Open_brackets_0=null;
        Token this_INT_1=null;
        Token this_Closed_brackets_2=null;
        Token this_Open_Key_4=null;
        Token this_Closed_Key_6=null;
        EObject this_TypeValue_5 = null;

        EObject this_TypeValue_7 = null;



        	enterRule();

        try {
            // InternalGo.g:1039:2: ( ( (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? ) | this_TypeValue_7= ruleTypeValue ) )
            // InternalGo.g:1040:2: ( (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? ) | this_TypeValue_7= ruleTypeValue )
            {
            // InternalGo.g:1040:2: ( (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? ) | this_TypeValue_7= ruleTypeValue )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_OPEN_BRACKETS) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_INT||LA16_0==RULE_STRING||(LA16_0>=47 && LA16_0<=48)) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalGo.g:1041:3: (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? )
                    {
                    // InternalGo.g:1041:3: (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? )
                    // InternalGo.g:1042:4: this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )?
                    {
                    this_Open_brackets_0=(Token)match(input,RULE_OPEN_BRACKETS,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Open_brackets_0, grammarAccess.getAtriAccess().getOpen_bracketsTerminalRuleCall_0_0());
                      			
                    }
                    // InternalGo.g:1046:4: (this_INT_1= RULE_INT )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_INT) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalGo.g:1047:5: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_21); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_INT_1, grammarAccess.getAtriAccess().getINTTerminalRuleCall_0_1());
                              				
                            }

                            }
                            break;

                    }

                    this_Closed_brackets_2=(Token)match(input,RULE_CLOSED_BRACKETS,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Closed_brackets_2, grammarAccess.getAtriAccess().getClosed_bracketsTerminalRuleCall_0_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAtriAccess().getTypesParserRuleCall_0_3());
                      			
                    }
                    pushFollow(FOLLOW_22);
                    ruleTypes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:1063:4: (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_OPEN_KEY) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalGo.g:1064:5: this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY
                            {
                            this_Open_Key_4=(Token)match(input,RULE_OPEN_KEY,FOLLOW_23); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_Open_Key_4, grammarAccess.getAtriAccess().getOpen_KeyTerminalRuleCall_0_4_0());
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getAtriAccess().getTypeValueParserRuleCall_0_4_1());
                              				
                            }
                            pushFollow(FOLLOW_24);
                            this_TypeValue_5=ruleTypeValue();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current = this_TypeValue_5;
                              					afterParserOrEnumRuleCall();
                              				
                            }
                            this_Closed_Key_6=(Token)match(input,RULE_CLOSED_KEY,FOLLOW_2); if (state.failed) return current;
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
                    // InternalGo.g:1083:3: this_TypeValue_7= ruleTypeValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtriAccess().getTypeValueParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeValue_7=ruleTypeValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeValue_7;
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
    // InternalGo.g:1095:1: entryRuleParams returns [EObject current=null] : iv_ruleParams= ruleParams EOF ;
    public final EObject entryRuleParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParams = null;


        try {
            // InternalGo.g:1095:47: (iv_ruleParams= ruleParams EOF )
            // InternalGo.g:1096:2: iv_ruleParams= ruleParams EOF
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
    // InternalGo.g:1102:1: ruleParams returns [EObject current=null] : ( ( (lv_params_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypes ) )? (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ( (lv_type_4_0= ruleTypes ) )? )* ) ;
    public final EObject ruleParams() throws RecognitionException {
        EObject current = null;

        Token lv_params_0_0=null;
        Token this_Comma_2=null;
        Token lv_params_3_0=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1108:2: ( ( ( (lv_params_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypes ) )? (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ( (lv_type_4_0= ruleTypes ) )? )* ) )
            // InternalGo.g:1109:2: ( ( (lv_params_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypes ) )? (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ( (lv_type_4_0= ruleTypes ) )? )* )
            {
            // InternalGo.g:1109:2: ( ( (lv_params_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypes ) )? (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ( (lv_type_4_0= ruleTypes ) )? )* )
            // InternalGo.g:1110:3: ( (lv_params_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypes ) )? (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ( (lv_type_4_0= ruleTypes ) )? )*
            {
            // InternalGo.g:1110:3: ( (lv_params_0_0= RULE_ID ) )
            // InternalGo.g:1111:4: (lv_params_0_0= RULE_ID )
            {
            // InternalGo.g:1111:4: (lv_params_0_0= RULE_ID )
            // InternalGo.g:1112:5: lv_params_0_0= RULE_ID
            {
            lv_params_0_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
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

            // InternalGo.g:1128:3: ( (lv_type_1_0= ruleTypes ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=40 && LA17_0<=46)||LA17_0==61) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGo.g:1129:4: (lv_type_1_0= ruleTypes )
                    {
                    // InternalGo.g:1129:4: (lv_type_1_0= ruleTypes )
                    // InternalGo.g:1130:5: lv_type_1_0= ruleTypes
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getParamsAccess().getTypeTypesParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_26);
                    lv_type_1_0=ruleTypes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getParamsRule());
                      					}
                      					add(
                      						current,
                      						"type",
                      						lv_type_1_0,
                      						"org.xtext.go.Go.Types");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGo.g:1147:3: (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ( (lv_type_4_0= ruleTypes ) )? )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_COMMA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGo.g:1148:4: this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ( (lv_type_4_0= ruleTypes ) )?
            	    {
            	    this_Comma_2=(Token)match(input,RULE_COMMA,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_Comma_2, grammarAccess.getParamsAccess().getCommaTerminalRuleCall_2_0());
            	      			
            	    }
            	    // InternalGo.g:1152:4: ( (lv_params_3_0= RULE_ID ) )
            	    // InternalGo.g:1153:5: (lv_params_3_0= RULE_ID )
            	    {
            	    // InternalGo.g:1153:5: (lv_params_3_0= RULE_ID )
            	    // InternalGo.g:1154:6: lv_params_3_0= RULE_ID
            	    {
            	    lv_params_3_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
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

            	    // InternalGo.g:1170:4: ( (lv_type_4_0= ruleTypes ) )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( ((LA18_0>=40 && LA18_0<=46)||LA18_0==61) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalGo.g:1171:5: (lv_type_4_0= ruleTypes )
            	            {
            	            // InternalGo.g:1171:5: (lv_type_4_0= ruleTypes )
            	            // InternalGo.g:1172:6: lv_type_4_0= ruleTypes
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getParamsAccess().getTypeTypesParserRuleCall_2_2_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_26);
            	            lv_type_4_0=ruleTypes();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getParamsRule());
            	              						}
            	              						add(
            	              							current,
            	              							"type",
            	              							lv_type_4_0,
            	              							"org.xtext.go.Go.Types");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalGo.g:1194:1: entryRuleTypeValue returns [EObject current=null] : iv_ruleTypeValue= ruleTypeValue EOF ;
    public final EObject entryRuleTypeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeValue = null;


        try {
            // InternalGo.g:1194:50: (iv_ruleTypeValue= ruleTypeValue EOF )
            // InternalGo.g:1195:2: iv_ruleTypeValue= ruleTypeValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeValue=ruleTypeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeValue; 
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
    // InternalGo.g:1201:1: ruleTypeValue returns [EObject current=null] : (this_Str_0= ruleStr | this_Numbers_1= ruleNumbers | this_Bool_2= ruleBool ) ;
    public final EObject ruleTypeValue() throws RecognitionException {
        EObject current = null;

        EObject this_Str_0 = null;

        EObject this_Numbers_1 = null;

        EObject this_Bool_2 = null;



        	enterRule();

        try {
            // InternalGo.g:1207:2: ( (this_Str_0= ruleStr | this_Numbers_1= ruleNumbers | this_Bool_2= ruleBool ) )
            // InternalGo.g:1208:2: (this_Str_0= ruleStr | this_Numbers_1= ruleNumbers | this_Bool_2= ruleBool )
            {
            // InternalGo.g:1208:2: (this_Str_0= ruleStr | this_Numbers_1= ruleNumbers | this_Bool_2= ruleBool )
            int alt20=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt20=1;
                }
                break;
            case RULE_INT:
                {
                alt20=2;
                }
                break;
            case 47:
            case 48:
                {
                alt20=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalGo.g:1209:3: this_Str_0= ruleStr
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeValueAccess().getStrParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Str_0=ruleStr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Str_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1218:3: this_Numbers_1= ruleNumbers
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeValueAccess().getNumbersParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Numbers_1=ruleNumbers();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Numbers_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:1227:3: this_Bool_2= ruleBool
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeValueAccess().getBoolParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Bool_2=ruleBool();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Bool_2;
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


    // $ANTLR start "entryRuleStr"
    // InternalGo.g:1239:1: entryRuleStr returns [EObject current=null] : iv_ruleStr= ruleStr EOF ;
    public final EObject entryRuleStr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStr = null;


        try {
            // InternalGo.g:1239:44: (iv_ruleStr= ruleStr EOF )
            // InternalGo.g:1240:2: iv_ruleStr= ruleStr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStr=ruleStr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStr; 
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
    // $ANTLR end "entryRuleStr"


    // $ANTLR start "ruleStr"
    // InternalGo.g:1246:1: ruleStr returns [EObject current=null] : ( (lv_s_0_0= RULE_STRING ) ) ;
    public final EObject ruleStr() throws RecognitionException {
        EObject current = null;

        Token lv_s_0_0=null;


        	enterRule();

        try {
            // InternalGo.g:1252:2: ( ( (lv_s_0_0= RULE_STRING ) ) )
            // InternalGo.g:1253:2: ( (lv_s_0_0= RULE_STRING ) )
            {
            // InternalGo.g:1253:2: ( (lv_s_0_0= RULE_STRING ) )
            // InternalGo.g:1254:3: (lv_s_0_0= RULE_STRING )
            {
            // InternalGo.g:1254:3: (lv_s_0_0= RULE_STRING )
            // InternalGo.g:1255:4: lv_s_0_0= RULE_STRING
            {
            lv_s_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_s_0_0, grammarAccess.getStrAccess().getSSTRINGTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getStrRule());
              				}
              				setWithLastConsumed(
              					current,
              					"s",
              					lv_s_0_0,
              					"org.eclipse.xtext.common.Terminals.STRING");
              			
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
    // $ANTLR end "ruleStr"


    // $ANTLR start "entryRuleDecImport"
    // InternalGo.g:1274:1: entryRuleDecImport returns [String current=null] : iv_ruleDecImport= ruleDecImport EOF ;
    public final String entryRuleDecImport() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecImport = null;


        try {
            // InternalGo.g:1274:49: (iv_ruleDecImport= ruleDecImport EOF )
            // InternalGo.g:1275:2: iv_ruleDecImport= ruleDecImport EOF
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
    // InternalGo.g:1281:1: ruleDecImport returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IMPORT_0= ruleIMPORT (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) ) ) ;
    public final AntlrDatatypeRuleToken ruleDecImport() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_1=null;
        Token this_Open_parentheses_2=null;
        Token this_STRING_3=null;
        Token this_Closed_parentheses_4=null;
        AntlrDatatypeRuleToken this_IMPORT_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1287:2: ( (this_IMPORT_0= ruleIMPORT (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) ) ) )
            // InternalGo.g:1288:2: (this_IMPORT_0= ruleIMPORT (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) ) )
            {
            // InternalGo.g:1288:2: (this_IMPORT_0= ruleIMPORT (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) ) )
            // InternalGo.g:1289:3: this_IMPORT_0= ruleIMPORT (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) )
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDecImportAccess().getIMPORTParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_27);
            this_IMPORT_0=ruleIMPORT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IMPORT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1299:3: (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_OPEN_PARENTHESES) ) {
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
                    // InternalGo.g:1300:4: this_STRING_1= RULE_STRING
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
                    // InternalGo.g:1308:4: (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES )
                    {
                    // InternalGo.g:1308:4: (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES )
                    // InternalGo.g:1309:5: this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES
                    {
                    this_Open_parentheses_2=(Token)match(input,RULE_OPEN_PARENTHESES,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Open_parentheses_2);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_Open_parentheses_2, grammarAccess.getDecImportAccess().getOpen_parenthesesTerminalRuleCall_1_1_0());
                      				
                    }
                    // InternalGo.g:1316:5: (this_STRING_3= RULE_STRING )+
                    int cnt21=0;
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_STRING) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalGo.g:1317:6: this_STRING_3= RULE_STRING
                    	    {
                    	    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(this_STRING_3);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(this_STRING_3, grammarAccess.getDecImportAccess().getSTRINGTerminalRuleCall_1_1_1());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt21 >= 1 ) break loop21;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(21, input);
                                throw eee;
                        }
                        cnt21++;
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
    // InternalGo.g:1338:1: entryRuleOperationsOneEquals returns [EObject current=null] : iv_ruleOperationsOneEquals= ruleOperationsOneEquals EOF ;
    public final EObject entryRuleOperationsOneEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationsOneEquals = null;


        try {
            // InternalGo.g:1338:60: (iv_ruleOperationsOneEquals= ruleOperationsOneEquals EOF )
            // InternalGo.g:1339:2: iv_ruleOperationsOneEquals= ruleOperationsOneEquals EOF
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
    // InternalGo.g:1345:1: ruleOperationsOneEquals returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusEquals_1= RULE_PLUSEQUALS | this_MinusEquals_2= RULE_MINUSEQUALS ) (this_ID_3= RULE_ID | ( (lv_n_4_0= ruleNumbers ) ) ) ) ;
    public final EObject ruleOperationsOneEquals() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_PlusEquals_1=null;
        Token this_MinusEquals_2=null;
        Token this_ID_3=null;
        EObject lv_n_4_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1351:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusEquals_1= RULE_PLUSEQUALS | this_MinusEquals_2= RULE_MINUSEQUALS ) (this_ID_3= RULE_ID | ( (lv_n_4_0= ruleNumbers ) ) ) ) )
            // InternalGo.g:1352:2: ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusEquals_1= RULE_PLUSEQUALS | this_MinusEquals_2= RULE_MINUSEQUALS ) (this_ID_3= RULE_ID | ( (lv_n_4_0= ruleNumbers ) ) ) )
            {
            // InternalGo.g:1352:2: ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusEquals_1= RULE_PLUSEQUALS | this_MinusEquals_2= RULE_MINUSEQUALS ) (this_ID_3= RULE_ID | ( (lv_n_4_0= ruleNumbers ) ) ) )
            // InternalGo.g:1353:3: ( (lv_name_0_0= RULE_ID ) ) (this_PlusEquals_1= RULE_PLUSEQUALS | this_MinusEquals_2= RULE_MINUSEQUALS ) (this_ID_3= RULE_ID | ( (lv_n_4_0= ruleNumbers ) ) )
            {
            // InternalGo.g:1353:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGo.g:1354:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGo.g:1354:4: (lv_name_0_0= RULE_ID )
            // InternalGo.g:1355:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
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

            // InternalGo.g:1371:3: (this_PlusEquals_1= RULE_PLUSEQUALS | this_MinusEquals_2= RULE_MINUSEQUALS )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_PLUSEQUALS) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_MINUSEQUALS) ) {
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
                    // InternalGo.g:1372:4: this_PlusEquals_1= RULE_PLUSEQUALS
                    {
                    this_PlusEquals_1=(Token)match(input,RULE_PLUSEQUALS,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_PlusEquals_1, grammarAccess.getOperationsOneEqualsAccess().getPlusEqualsTerminalRuleCall_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1377:4: this_MinusEquals_2= RULE_MINUSEQUALS
                    {
                    this_MinusEquals_2=(Token)match(input,RULE_MINUSEQUALS,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_MinusEquals_2, grammarAccess.getOperationsOneEqualsAccess().getMinusEqualsTerminalRuleCall_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalGo.g:1382:3: (this_ID_3= RULE_ID | ( (lv_n_4_0= ruleNumbers ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
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
                    // InternalGo.g:1383:4: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_3, grammarAccess.getOperationsOneEqualsAccess().getIDTerminalRuleCall_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1388:4: ( (lv_n_4_0= ruleNumbers ) )
                    {
                    // InternalGo.g:1388:4: ( (lv_n_4_0= ruleNumbers ) )
                    // InternalGo.g:1389:5: (lv_n_4_0= ruleNumbers )
                    {
                    // InternalGo.g:1389:5: (lv_n_4_0= ruleNumbers )
                    // InternalGo.g:1390:6: lv_n_4_0= ruleNumbers
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperationsOneEqualsAccess().getNNumbersParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_n_4_0=ruleNumbers();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperationsOneEqualsRule());
                      						}
                      						set(
                      							current,
                      							"n",
                      							lv_n_4_0,
                      							"org.xtext.go.Go.Numbers");
                      						afterParserOrEnumRuleCall();
                      					
                    }

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
    // $ANTLR end "ruleOperationsOneEquals"


    // $ANTLR start "entryRuleNumbers"
    // InternalGo.g:1412:1: entryRuleNumbers returns [EObject current=null] : iv_ruleNumbers= ruleNumbers EOF ;
    public final EObject entryRuleNumbers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumbers = null;


        try {
            // InternalGo.g:1412:48: (iv_ruleNumbers= ruleNumbers EOF )
            // InternalGo.g:1413:2: iv_ruleNumbers= ruleNumbers EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumbersRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumbers=ruleNumbers();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumbers; 
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
    // InternalGo.g:1419:1: ruleNumbers returns [EObject current=null] : ( ( (lv_int_0_0= ruleIntg ) ) | ( (lv_d_1_0= ruleDouble ) ) ) ;
    public final EObject ruleNumbers() throws RecognitionException {
        EObject current = null;

        EObject lv_int_0_0 = null;

        EObject lv_d_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1425:2: ( ( ( (lv_int_0_0= ruleIntg ) ) | ( (lv_d_1_0= ruleDouble ) ) ) )
            // InternalGo.g:1426:2: ( ( (lv_int_0_0= ruleIntg ) ) | ( (lv_d_1_0= ruleDouble ) ) )
            {
            // InternalGo.g:1426:2: ( ( (lv_int_0_0= ruleIntg ) ) | ( (lv_d_1_0= ruleDouble ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==RULE_DOT) ) {
                    alt25=2;
                }
                else if ( (LA25_1==EOF||(LA25_1>=RULE_EOL && LA25_1<=RULE_COMMA)||(LA25_1>=RULE_OPEN_PARENTHESES && LA25_1<=RULE_INT)||LA25_1==RULE_STRING||(LA25_1>=RULE_PLUS && LA25_1<=RULE_BAR)||LA25_1==RULE_PONTOVIRGULA||(LA25_1>=33 && LA25_1<=39)||(LA25_1>=47 && LA25_1<=48)||LA25_1==50||LA25_1==52||(LA25_1>=55 && LA25_1<=59)||(LA25_1>=62 && LA25_1<=64)||LA25_1==66) ) {
                    alt25=1;
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
                    // InternalGo.g:1427:3: ( (lv_int_0_0= ruleIntg ) )
                    {
                    // InternalGo.g:1427:3: ( (lv_int_0_0= ruleIntg ) )
                    // InternalGo.g:1428:4: (lv_int_0_0= ruleIntg )
                    {
                    // InternalGo.g:1428:4: (lv_int_0_0= ruleIntg )
                    // InternalGo.g:1429:5: lv_int_0_0= ruleIntg
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNumbersAccess().getIntIntgParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_int_0_0=ruleIntg();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNumbersRule());
                      					}
                      					set(
                      						current,
                      						"int",
                      						lv_int_0_0,
                      						"org.xtext.go.Go.Intg");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1447:3: ( (lv_d_1_0= ruleDouble ) )
                    {
                    // InternalGo.g:1447:3: ( (lv_d_1_0= ruleDouble ) )
                    // InternalGo.g:1448:4: (lv_d_1_0= ruleDouble )
                    {
                    // InternalGo.g:1448:4: (lv_d_1_0= ruleDouble )
                    // InternalGo.g:1449:5: lv_d_1_0= ruleDouble
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNumbersAccess().getDDoubleParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_d_1_0=ruleDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNumbersRule());
                      					}
                      					set(
                      						current,
                      						"d",
                      						lv_d_1_0,
                      						"org.xtext.go.Go.Double");
                      					afterParserOrEnumRuleCall();
                      				
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
    // $ANTLR end "ruleNumbers"


    // $ANTLR start "entryRuleIntg"
    // InternalGo.g:1470:1: entryRuleIntg returns [EObject current=null] : iv_ruleIntg= ruleIntg EOF ;
    public final EObject entryRuleIntg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntg = null;


        try {
            // InternalGo.g:1470:45: (iv_ruleIntg= ruleIntg EOF )
            // InternalGo.g:1471:2: iv_ruleIntg= ruleIntg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntgRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntg=ruleIntg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntg; 
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
    // $ANTLR end "entryRuleIntg"


    // $ANTLR start "ruleIntg"
    // InternalGo.g:1477:1: ruleIntg returns [EObject current=null] : ( (lv_i_0_0= RULE_INT ) ) ;
    public final EObject ruleIntg() throws RecognitionException {
        EObject current = null;

        Token lv_i_0_0=null;


        	enterRule();

        try {
            // InternalGo.g:1483:2: ( ( (lv_i_0_0= RULE_INT ) ) )
            // InternalGo.g:1484:2: ( (lv_i_0_0= RULE_INT ) )
            {
            // InternalGo.g:1484:2: ( (lv_i_0_0= RULE_INT ) )
            // InternalGo.g:1485:3: (lv_i_0_0= RULE_INT )
            {
            // InternalGo.g:1485:3: (lv_i_0_0= RULE_INT )
            // InternalGo.g:1486:4: lv_i_0_0= RULE_INT
            {
            lv_i_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_i_0_0, grammarAccess.getIntgAccess().getIINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getIntgRule());
              				}
              				setWithLastConsumed(
              					current,
              					"i",
              					lv_i_0_0,
              					"org.eclipse.xtext.common.Terminals.INT");
              			
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
    // $ANTLR end "ruleIntg"


    // $ANTLR start "entryRuleDouble"
    // InternalGo.g:1505:1: entryRuleDouble returns [EObject current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final EObject entryRuleDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDouble = null;


        try {
            // InternalGo.g:1505:47: (iv_ruleDouble= ruleDouble EOF )
            // InternalGo.g:1506:2: iv_ruleDouble= ruleDouble EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoubleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDouble=ruleDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDouble; 
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
    // InternalGo.g:1512:1: ruleDouble returns [EObject current=null] : ( ( (lv_d_0_0= RULE_INT ) ) this_Dot_1= RULE_DOT this_INT_2= RULE_INT ) ;
    public final EObject ruleDouble() throws RecognitionException {
        EObject current = null;

        Token lv_d_0_0=null;
        Token this_Dot_1=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalGo.g:1518:2: ( ( ( (lv_d_0_0= RULE_INT ) ) this_Dot_1= RULE_DOT this_INT_2= RULE_INT ) )
            // InternalGo.g:1519:2: ( ( (lv_d_0_0= RULE_INT ) ) this_Dot_1= RULE_DOT this_INT_2= RULE_INT )
            {
            // InternalGo.g:1519:2: ( ( (lv_d_0_0= RULE_INT ) ) this_Dot_1= RULE_DOT this_INT_2= RULE_INT )
            // InternalGo.g:1520:3: ( (lv_d_0_0= RULE_INT ) ) this_Dot_1= RULE_DOT this_INT_2= RULE_INT
            {
            // InternalGo.g:1520:3: ( (lv_d_0_0= RULE_INT ) )
            // InternalGo.g:1521:4: (lv_d_0_0= RULE_INT )
            {
            // InternalGo.g:1521:4: (lv_d_0_0= RULE_INT )
            // InternalGo.g:1522:5: lv_d_0_0= RULE_INT
            {
            lv_d_0_0=(Token)match(input,RULE_INT,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_d_0_0, grammarAccess.getDoubleAccess().getDINTTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDoubleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"d",
              						lv_d_0_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            this_Dot_1=(Token)match(input,RULE_DOT,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Dot_1, grammarAccess.getDoubleAccess().getDotTerminalRuleCall_1());
              		
            }
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleOperations"
    // InternalGo.g:1550:1: entryRuleOperations returns [EObject current=null] : iv_ruleOperations= ruleOperations EOF ;
    public final EObject entryRuleOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperations = null;


        try {
            // InternalGo.g:1550:51: (iv_ruleOperations= ruleOperations EOF )
            // InternalGo.g:1551:2: iv_ruleOperations= ruleOperations EOF
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
    // InternalGo.g:1557:1: ruleOperations returns [EObject current=null] : (this_T_0= ruleT ( (lv_o_1_0= ruleI ) ) ) ;
    public final EObject ruleOperations() throws RecognitionException {
        EObject current = null;

        EObject this_T_0 = null;

        EObject lv_o_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1563:2: ( (this_T_0= ruleT ( (lv_o_1_0= ruleI ) ) ) )
            // InternalGo.g:1564:2: (this_T_0= ruleT ( (lv_o_1_0= ruleI ) ) )
            {
            // InternalGo.g:1564:2: (this_T_0= ruleT ( (lv_o_1_0= ruleI ) ) )
            // InternalGo.g:1565:3: this_T_0= ruleT ( (lv_o_1_0= ruleI ) )
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOperationsAccess().getTParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_34);
            this_T_0=ruleT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_T_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1573:3: ( (lv_o_1_0= ruleI ) )
            // InternalGo.g:1574:4: (lv_o_1_0= ruleI )
            {
            // InternalGo.g:1574:4: (lv_o_1_0= ruleI )
            // InternalGo.g:1575:5: lv_o_1_0= ruleI
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
    // InternalGo.g:1596:1: entryRuleI returns [EObject current=null] : iv_ruleI= ruleI EOF ;
    public final EObject entryRuleI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleI = null;


        try {
            // InternalGo.g:1596:42: (iv_ruleI= ruleI EOF )
            // InternalGo.g:1597:2: iv_ruleI= ruleI EOF
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
    // InternalGo.g:1603:1: ruleI returns [EObject current=null] : ( (this_Plus_0= RULE_PLUS this_T_1= ruleT ( (lv_o_2_0= ruleI ) ) ) | (this_Minus_3= RULE_MINUS this_T_4= ruleT ( (lv_o_5_0= ruleI ) ) ) )? ;
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
            // InternalGo.g:1609:2: ( ( (this_Plus_0= RULE_PLUS this_T_1= ruleT ( (lv_o_2_0= ruleI ) ) ) | (this_Minus_3= RULE_MINUS this_T_4= ruleT ( (lv_o_5_0= ruleI ) ) ) )? )
            // InternalGo.g:1610:2: ( (this_Plus_0= RULE_PLUS this_T_1= ruleT ( (lv_o_2_0= ruleI ) ) ) | (this_Minus_3= RULE_MINUS this_T_4= ruleT ( (lv_o_5_0= ruleI ) ) ) )?
            {
            // InternalGo.g:1610:2: ( (this_Plus_0= RULE_PLUS this_T_1= ruleT ( (lv_o_2_0= ruleI ) ) ) | (this_Minus_3= RULE_MINUS this_T_4= ruleT ( (lv_o_5_0= ruleI ) ) ) )?
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_PLUS) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_MINUS) ) {
                alt26=2;
            }
            switch (alt26) {
                case 1 :
                    // InternalGo.g:1611:3: (this_Plus_0= RULE_PLUS this_T_1= ruleT ( (lv_o_2_0= ruleI ) ) )
                    {
                    // InternalGo.g:1611:3: (this_Plus_0= RULE_PLUS this_T_1= ruleT ( (lv_o_2_0= ruleI ) ) )
                    // InternalGo.g:1612:4: this_Plus_0= RULE_PLUS this_T_1= ruleT ( (lv_o_2_0= ruleI ) )
                    {
                    this_Plus_0=(Token)match(input,RULE_PLUS,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Plus_0, grammarAccess.getIAccess().getPlusTerminalRuleCall_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIAccess().getTParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_34);
                    this_T_1=ruleT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_T_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:1624:4: ( (lv_o_2_0= ruleI ) )
                    // InternalGo.g:1625:5: (lv_o_2_0= ruleI )
                    {
                    // InternalGo.g:1625:5: (lv_o_2_0= ruleI )
                    // InternalGo.g:1626:6: lv_o_2_0= ruleI
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
                    // InternalGo.g:1645:3: (this_Minus_3= RULE_MINUS this_T_4= ruleT ( (lv_o_5_0= ruleI ) ) )
                    {
                    // InternalGo.g:1645:3: (this_Minus_3= RULE_MINUS this_T_4= ruleT ( (lv_o_5_0= ruleI ) ) )
                    // InternalGo.g:1646:4: this_Minus_3= RULE_MINUS this_T_4= ruleT ( (lv_o_5_0= ruleI ) )
                    {
                    this_Minus_3=(Token)match(input,RULE_MINUS,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Minus_3, grammarAccess.getIAccess().getMinusTerminalRuleCall_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIAccess().getTParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_34);
                    this_T_4=ruleT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_T_4;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:1658:4: ( (lv_o_5_0= ruleI ) )
                    // InternalGo.g:1659:5: (lv_o_5_0= ruleI )
                    {
                    // InternalGo.g:1659:5: (lv_o_5_0= ruleI )
                    // InternalGo.g:1660:6: lv_o_5_0= ruleI
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
    // InternalGo.g:1682:1: entryRuleT returns [EObject current=null] : iv_ruleT= ruleT EOF ;
    public final EObject entryRuleT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleT = null;


        try {
            // InternalGo.g:1682:42: (iv_ruleT= ruleT EOF )
            // InternalGo.g:1683:2: iv_ruleT= ruleT EOF
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
    // InternalGo.g:1689:1: ruleT returns [EObject current=null] : (this_F_0= ruleF ( (lv_o_1_0= ruleY ) ) ) ;
    public final EObject ruleT() throws RecognitionException {
        EObject current = null;

        EObject this_F_0 = null;

        EObject lv_o_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1695:2: ( (this_F_0= ruleF ( (lv_o_1_0= ruleY ) ) ) )
            // InternalGo.g:1696:2: (this_F_0= ruleF ( (lv_o_1_0= ruleY ) ) )
            {
            // InternalGo.g:1696:2: (this_F_0= ruleF ( (lv_o_1_0= ruleY ) ) )
            // InternalGo.g:1697:3: this_F_0= ruleF ( (lv_o_1_0= ruleY ) )
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTAccess().getFParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_36);
            this_F_0=ruleF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_F_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1705:3: ( (lv_o_1_0= ruleY ) )
            // InternalGo.g:1706:4: (lv_o_1_0= ruleY )
            {
            // InternalGo.g:1706:4: (lv_o_1_0= ruleY )
            // InternalGo.g:1707:5: lv_o_1_0= ruleY
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
    // InternalGo.g:1728:1: entryRuleY returns [EObject current=null] : iv_ruleY= ruleY EOF ;
    public final EObject entryRuleY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleY = null;


        try {
            // InternalGo.g:1728:42: (iv_ruleY= ruleY EOF )
            // InternalGo.g:1729:2: iv_ruleY= ruleY EOF
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
    // InternalGo.g:1735:1: ruleY returns [EObject current=null] : ( (this_Asterics_0= RULE_ASTERICS ( (lv_o_1_0= ruleF ) ) ( (lv_o_2_0= ruleY ) ) ) | (this_Bar_3= RULE_BAR ( (lv_o_4_0= ruleF ) ) ( (lv_o_5_0= ruleY ) ) ) )? ;
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
            // InternalGo.g:1741:2: ( ( (this_Asterics_0= RULE_ASTERICS ( (lv_o_1_0= ruleF ) ) ( (lv_o_2_0= ruleY ) ) ) | (this_Bar_3= RULE_BAR ( (lv_o_4_0= ruleF ) ) ( (lv_o_5_0= ruleY ) ) ) )? )
            // InternalGo.g:1742:2: ( (this_Asterics_0= RULE_ASTERICS ( (lv_o_1_0= ruleF ) ) ( (lv_o_2_0= ruleY ) ) ) | (this_Bar_3= RULE_BAR ( (lv_o_4_0= ruleF ) ) ( (lv_o_5_0= ruleY ) ) ) )?
            {
            // InternalGo.g:1742:2: ( (this_Asterics_0= RULE_ASTERICS ( (lv_o_1_0= ruleF ) ) ( (lv_o_2_0= ruleY ) ) ) | (this_Bar_3= RULE_BAR ( (lv_o_4_0= ruleF ) ) ( (lv_o_5_0= ruleY ) ) ) )?
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ASTERICS) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_BAR) ) {
                alt27=2;
            }
            switch (alt27) {
                case 1 :
                    // InternalGo.g:1743:3: (this_Asterics_0= RULE_ASTERICS ( (lv_o_1_0= ruleF ) ) ( (lv_o_2_0= ruleY ) ) )
                    {
                    // InternalGo.g:1743:3: (this_Asterics_0= RULE_ASTERICS ( (lv_o_1_0= ruleF ) ) ( (lv_o_2_0= ruleY ) ) )
                    // InternalGo.g:1744:4: this_Asterics_0= RULE_ASTERICS ( (lv_o_1_0= ruleF ) ) ( (lv_o_2_0= ruleY ) )
                    {
                    this_Asterics_0=(Token)match(input,RULE_ASTERICS,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Asterics_0, grammarAccess.getYAccess().getAstericsTerminalRuleCall_0_0());
                      			
                    }
                    // InternalGo.g:1748:4: ( (lv_o_1_0= ruleF ) )
                    // InternalGo.g:1749:5: (lv_o_1_0= ruleF )
                    {
                    // InternalGo.g:1749:5: (lv_o_1_0= ruleF )
                    // InternalGo.g:1750:6: lv_o_1_0= ruleF
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getYAccess().getOFParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_36);
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

                    // InternalGo.g:1767:4: ( (lv_o_2_0= ruleY ) )
                    // InternalGo.g:1768:5: (lv_o_2_0= ruleY )
                    {
                    // InternalGo.g:1768:5: (lv_o_2_0= ruleY )
                    // InternalGo.g:1769:6: lv_o_2_0= ruleY
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
                    // InternalGo.g:1788:3: (this_Bar_3= RULE_BAR ( (lv_o_4_0= ruleF ) ) ( (lv_o_5_0= ruleY ) ) )
                    {
                    // InternalGo.g:1788:3: (this_Bar_3= RULE_BAR ( (lv_o_4_0= ruleF ) ) ( (lv_o_5_0= ruleY ) ) )
                    // InternalGo.g:1789:4: this_Bar_3= RULE_BAR ( (lv_o_4_0= ruleF ) ) ( (lv_o_5_0= ruleY ) )
                    {
                    this_Bar_3=(Token)match(input,RULE_BAR,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Bar_3, grammarAccess.getYAccess().getBarTerminalRuleCall_1_0());
                      			
                    }
                    // InternalGo.g:1793:4: ( (lv_o_4_0= ruleF ) )
                    // InternalGo.g:1794:5: (lv_o_4_0= ruleF )
                    {
                    // InternalGo.g:1794:5: (lv_o_4_0= ruleF )
                    // InternalGo.g:1795:6: lv_o_4_0= ruleF
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getYAccess().getOFParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_36);
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

                    // InternalGo.g:1812:4: ( (lv_o_5_0= ruleY ) )
                    // InternalGo.g:1813:5: (lv_o_5_0= ruleY )
                    {
                    // InternalGo.g:1813:5: (lv_o_5_0= ruleY )
                    // InternalGo.g:1814:6: lv_o_5_0= ruleY
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
    // InternalGo.g:1836:1: entryRuleF returns [EObject current=null] : iv_ruleF= ruleF EOF ;
    public final EObject entryRuleF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleF = null;


        try {
            // InternalGo.g:1836:42: (iv_ruleF= ruleF EOF )
            // InternalGo.g:1837:2: iv_ruleF= ruleF EOF
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
    // InternalGo.g:1843:1: ruleF returns [EObject current=null] : ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES ( (lv_o_1_0= ruleOperations ) ) this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | this_Numbers_3= ruleNumbers ) ;
    public final EObject ruleF() throws RecognitionException {
        EObject current = null;

        Token this_Open_parentheses_0=null;
        Token this_Closed_parentheses_2=null;
        EObject lv_o_1_0 = null;

        EObject this_Numbers_3 = null;



        	enterRule();

        try {
            // InternalGo.g:1849:2: ( ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES ( (lv_o_1_0= ruleOperations ) ) this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | this_Numbers_3= ruleNumbers ) )
            // InternalGo.g:1850:2: ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES ( (lv_o_1_0= ruleOperations ) ) this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | this_Numbers_3= ruleNumbers )
            {
            // InternalGo.g:1850:2: ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES ( (lv_o_1_0= ruleOperations ) ) this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | this_Numbers_3= ruleNumbers )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_OPEN_PARENTHESES) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_INT) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalGo.g:1851:3: (this_Open_parentheses_0= RULE_OPEN_PARENTHESES ( (lv_o_1_0= ruleOperations ) ) this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES )
                    {
                    // InternalGo.g:1851:3: (this_Open_parentheses_0= RULE_OPEN_PARENTHESES ( (lv_o_1_0= ruleOperations ) ) this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES )
                    // InternalGo.g:1852:4: this_Open_parentheses_0= RULE_OPEN_PARENTHESES ( (lv_o_1_0= ruleOperations ) ) this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES
                    {
                    this_Open_parentheses_0=(Token)match(input,RULE_OPEN_PARENTHESES,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Open_parentheses_0, grammarAccess.getFAccess().getOpen_parenthesesTerminalRuleCall_0_0());
                      			
                    }
                    // InternalGo.g:1856:4: ( (lv_o_1_0= ruleOperations ) )
                    // InternalGo.g:1857:5: (lv_o_1_0= ruleOperations )
                    {
                    // InternalGo.g:1857:5: (lv_o_1_0= ruleOperations )
                    // InternalGo.g:1858:6: lv_o_1_0= ruleOperations
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFAccess().getOOperationsParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_37);
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
                    // InternalGo.g:1881:3: this_Numbers_3= ruleNumbers
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFAccess().getNumbersParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Numbers_3=ruleNumbers();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Numbers_3;
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


    // $ANTLR start "entryRuleCondition"
    // InternalGo.g:1893:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalGo.g:1893:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalGo.g:1894:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalGo.g:1900:1: ruleCondition returns [EObject current=null] : ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_if_0_0 = null;

        EObject lv_elseif_1_0 = null;

        EObject lv_else_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1906:2: ( ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )? ) )
            // InternalGo.g:1907:2: ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )? )
            {
            // InternalGo.g:1907:2: ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )? )
            // InternalGo.g:1908:3: ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )?
            {
            // InternalGo.g:1908:3: ( (lv_if_0_0= ruleIfCondition ) )
            // InternalGo.g:1909:4: (lv_if_0_0= ruleIfCondition )
            {
            // InternalGo.g:1909:4: (lv_if_0_0= ruleIfCondition )
            // InternalGo.g:1910:5: lv_if_0_0= ruleIfCondition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionAccess().getIfIfConditionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_38);
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

            // InternalGo.g:1927:3: ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )*
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
            	    // InternalGo.g:1928:4: ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition )
            	    {
            	    // InternalGo.g:1929:4: (lv_elseif_1_0= ruleElseIfCondition )
            	    // InternalGo.g:1930:5: lv_elseif_1_0= ruleElseIfCondition
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConditionAccess().getElseifElseIfConditionParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_38);
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

            // InternalGo.g:1947:3: ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==54) && (synpred2_InternalGo())) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGo.g:1948:4: ( ruleELSE )=> (lv_else_2_0= ruleElseCondition )
                    {
                    // InternalGo.g:1949:4: (lv_else_2_0= ruleElseCondition )
                    // InternalGo.g:1950:5: lv_else_2_0= ruleElseCondition
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
    // InternalGo.g:1971:1: entryRuleIfCondition returns [EObject current=null] : iv_ruleIfCondition= ruleIfCondition EOF ;
    public final EObject entryRuleIfCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfCondition = null;


        try {
            // InternalGo.g:1971:52: (iv_ruleIfCondition= ruleIfCondition EOF )
            // InternalGo.g:1972:2: iv_ruleIfCondition= ruleIfCondition EOF
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
    // InternalGo.g:1978:1: ruleIfCondition returns [EObject current=null] : ( ruleIF ( ( ruleAndExpression )=> (lv_cond_1_0= ruleOrExpression ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_then_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY ) ;
    public final EObject ruleIfCondition() throws RecognitionException {
        EObject current = null;

        Token this_Open_Key_2=null;
        Token this_Closed_Key_4=null;
        EObject lv_cond_1_0 = null;

        EObject lv_then_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1984:2: ( ( ruleIF ( ( ruleAndExpression )=> (lv_cond_1_0= ruleOrExpression ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_then_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY ) )
            // InternalGo.g:1985:2: ( ruleIF ( ( ruleAndExpression )=> (lv_cond_1_0= ruleOrExpression ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_then_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY )
            {
            // InternalGo.g:1985:2: ( ruleIF ( ( ruleAndExpression )=> (lv_cond_1_0= ruleOrExpression ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_then_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY )
            // InternalGo.g:1986:3: ruleIF ( ( ruleAndExpression )=> (lv_cond_1_0= ruleOrExpression ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_then_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIfConditionAccess().getIFParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_23);
            ruleIF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1993:3: ( ( ruleAndExpression )=> (lv_cond_1_0= ruleOrExpression ) )
            // InternalGo.g:1994:4: ( ruleAndExpression )=> (lv_cond_1_0= ruleOrExpression )
            {
            // InternalGo.g:1995:4: (lv_cond_1_0= ruleOrExpression )
            // InternalGo.g:1996:5: lv_cond_1_0= ruleOrExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfConditionAccess().getCondOrExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_cond_1_0=ruleOrExpression();

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
              						"org.xtext.go.Go.OrExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_Open_Key_2=(Token)match(input,RULE_OPEN_KEY,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Open_Key_2, grammarAccess.getIfConditionAccess().getOpen_KeyTerminalRuleCall_2());
              		
            }
            // InternalGo.g:2017:3: ( (lv_then_3_0= ruleGreeting ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_EOL && LA31_0<=RULE_ID)||LA31_0==52||(LA31_0>=55 && LA31_0<=58)||LA31_0==62||LA31_0==64||LA31_0==66) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalGo.g:2018:4: (lv_then_3_0= ruleGreeting )
            	    {
            	    // InternalGo.g:2018:4: (lv_then_3_0= ruleGreeting )
            	    // InternalGo.g:2019:5: lv_then_3_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfConditionAccess().getThenGreetingParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
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
    // InternalGo.g:2044:1: entryRuleElseIfCondition returns [EObject current=null] : iv_ruleElseIfCondition= ruleElseIfCondition EOF ;
    public final EObject entryRuleElseIfCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfCondition = null;


        try {
            // InternalGo.g:2044:56: (iv_ruleElseIfCondition= ruleElseIfCondition EOF )
            // InternalGo.g:2045:2: iv_ruleElseIfCondition= ruleElseIfCondition EOF
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
    // InternalGo.g:2051:1: ruleElseIfCondition returns [EObject current=null] : ( ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition ) ;
    public final EObject ruleElseIfCondition() throws RecognitionException {
        EObject current = null;

        EObject this_IfCondition_1 = null;



        	enterRule();

        try {
            // InternalGo.g:2057:2: ( ( ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition ) )
            // InternalGo.g:2058:2: ( ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition )
            {
            // InternalGo.g:2058:2: ( ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition )
            // InternalGo.g:2059:3: ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition
            {
            // InternalGo.g:2059:3: ( ( ruleELSE )=> ruleELSE )
            // InternalGo.g:2060:4: ( ruleELSE )=> ruleELSE
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getElseIfConditionAccess().getELSEParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_39);
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
    // InternalGo.g:2081:1: entryRuleElseCondition returns [EObject current=null] : iv_ruleElseCondition= ruleElseCondition EOF ;
    public final EObject entryRuleElseCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseCondition = null;


        try {
            // InternalGo.g:2081:54: (iv_ruleElseCondition= ruleElseCondition EOF )
            // InternalGo.g:2082:2: iv_ruleElseCondition= ruleElseCondition EOF
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
    // InternalGo.g:2088:1: ruleElseCondition returns [EObject current=null] : ( ( ( ruleELSE )=> ruleELSE ) this_Open_Key_1= RULE_OPEN_KEY ( (lv_then_2_0= ruleGreeting ) )* this_Closed_Key_3= RULE_CLOSED_KEY ) ;
    public final EObject ruleElseCondition() throws RecognitionException {
        EObject current = null;

        Token this_Open_Key_1=null;
        Token this_Closed_Key_3=null;
        EObject lv_then_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2094:2: ( ( ( ( ruleELSE )=> ruleELSE ) this_Open_Key_1= RULE_OPEN_KEY ( (lv_then_2_0= ruleGreeting ) )* this_Closed_Key_3= RULE_CLOSED_KEY ) )
            // InternalGo.g:2095:2: ( ( ( ruleELSE )=> ruleELSE ) this_Open_Key_1= RULE_OPEN_KEY ( (lv_then_2_0= ruleGreeting ) )* this_Closed_Key_3= RULE_CLOSED_KEY )
            {
            // InternalGo.g:2095:2: ( ( ( ruleELSE )=> ruleELSE ) this_Open_Key_1= RULE_OPEN_KEY ( (lv_then_2_0= ruleGreeting ) )* this_Closed_Key_3= RULE_CLOSED_KEY )
            // InternalGo.g:2096:3: ( ( ruleELSE )=> ruleELSE ) this_Open_Key_1= RULE_OPEN_KEY ( (lv_then_2_0= ruleGreeting ) )* this_Closed_Key_3= RULE_CLOSED_KEY
            {
            // InternalGo.g:2096:3: ( ( ruleELSE )=> ruleELSE )
            // InternalGo.g:2097:4: ( ruleELSE )=> ruleELSE
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getElseConditionAccess().getELSEParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_15);
            ruleELSE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }

            this_Open_Key_1=(Token)match(input,RULE_OPEN_KEY,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Open_Key_1, grammarAccess.getElseConditionAccess().getOpen_KeyTerminalRuleCall_1());
              		
            }
            // InternalGo.g:2110:3: ( (lv_then_2_0= ruleGreeting ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_EOL && LA32_0<=RULE_ID)||LA32_0==52||(LA32_0>=55 && LA32_0<=58)||LA32_0==62||LA32_0==64||LA32_0==66) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalGo.g:2111:4: (lv_then_2_0= ruleGreeting )
            	    {
            	    // InternalGo.g:2111:4: (lv_then_2_0= ruleGreeting )
            	    // InternalGo.g:2112:5: lv_then_2_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getElseConditionAccess().getThenGreetingParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
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
    // InternalGo.g:2137:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalGo.g:2137:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalGo.g:2138:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalGo.g:2144:1: ruleExpression returns [EObject current=null] : ( ( ( ( ( ruleOperations ) ) | ( ( ruleAndExpression )=> ( ruleOrExpression ) ) | RULE_ID ) )=> ( ( (lv_x_0_0= ruleOperations ) ) | ( ( ruleAndExpression )=> (lv_boolean_1_0= ruleOrExpression ) ) | this_ID_2= RULE_ID ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token this_ID_2=null;
        EObject lv_x_0_0 = null;

        EObject lv_boolean_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2150:2: ( ( ( ( ( ( ruleOperations ) ) | ( ( ruleAndExpression )=> ( ruleOrExpression ) ) | RULE_ID ) )=> ( ( (lv_x_0_0= ruleOperations ) ) | ( ( ruleAndExpression )=> (lv_boolean_1_0= ruleOrExpression ) ) | this_ID_2= RULE_ID ) ) )
            // InternalGo.g:2151:2: ( ( ( ( ( ruleOperations ) ) | ( ( ruleAndExpression )=> ( ruleOrExpression ) ) | RULE_ID ) )=> ( ( (lv_x_0_0= ruleOperations ) ) | ( ( ruleAndExpression )=> (lv_boolean_1_0= ruleOrExpression ) ) | this_ID_2= RULE_ID ) )
            {
            // InternalGo.g:2151:2: ( ( ( ( ( ruleOperations ) ) | ( ( ruleAndExpression )=> ( ruleOrExpression ) ) | RULE_ID ) )=> ( ( (lv_x_0_0= ruleOperations ) ) | ( ( ruleAndExpression )=> (lv_boolean_1_0= ruleOrExpression ) ) | this_ID_2= RULE_ID ) )
            // InternalGo.g:2152:3: ( ( ( ( ruleOperations ) ) | ( ( ruleAndExpression )=> ( ruleOrExpression ) ) | RULE_ID ) )=> ( ( (lv_x_0_0= ruleOperations ) ) | ( ( ruleAndExpression )=> (lv_boolean_1_0= ruleOrExpression ) ) | this_ID_2= RULE_ID )
            {
            // InternalGo.g:2169:3: ( ( (lv_x_0_0= ruleOperations ) ) | ( ( ruleAndExpression )=> (lv_boolean_1_0= ruleOrExpression ) ) | this_ID_2= RULE_ID )
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_OPEN_PARENTHESES) ) {
                int LA33_1 = input.LA(2);

                if ( (true) ) {
                    alt33=1;
                }
                else if ( (synpred8_InternalGo()) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA33_0==RULE_INT) ) {
                int LA33_2 = input.LA(2);

                if ( (true) ) {
                    alt33=1;
                }
                else if ( (synpred8_InternalGo()) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;
                }
            }
            else if ( (LA33_0==47) && (synpred8_InternalGo())) {
                alt33=2;
            }
            else if ( (LA33_0==48) && (synpred8_InternalGo())) {
                alt33=2;
            }
            else if ( (LA33_0==RULE_ID) ) {
                alt33=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalGo.g:2170:4: ( (lv_x_0_0= ruleOperations ) )
                    {
                    // InternalGo.g:2170:4: ( (lv_x_0_0= ruleOperations ) )
                    // InternalGo.g:2171:5: (lv_x_0_0= ruleOperations )
                    {
                    // InternalGo.g:2171:5: (lv_x_0_0= ruleOperations )
                    // InternalGo.g:2172:6: lv_x_0_0= ruleOperations
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getXOperationsParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_x_0_0=ruleOperations();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                      						}
                      						set(
                      							current,
                      							"x",
                      							lv_x_0_0,
                      							"org.xtext.go.Go.Operations");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:2190:4: ( ( ruleAndExpression )=> (lv_boolean_1_0= ruleOrExpression ) )
                    {
                    // InternalGo.g:2190:4: ( ( ruleAndExpression )=> (lv_boolean_1_0= ruleOrExpression ) )
                    // InternalGo.g:2191:5: ( ruleAndExpression )=> (lv_boolean_1_0= ruleOrExpression )
                    {
                    // InternalGo.g:2192:5: (lv_boolean_1_0= ruleOrExpression )
                    // InternalGo.g:2193:6: lv_boolean_1_0= ruleOrExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getBooleanOrExpressionParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_boolean_1_0=ruleOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                      						}
                      						set(
                      							current,
                      							"boolean",
                      							lv_boolean_1_0,
                      							"org.xtext.go.Go.OrExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:2211:4: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_2, grammarAccess.getExpressionAccess().getIDTerminalRuleCall_0_2());
                      			
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleCallFor"
    // InternalGo.g:2220:1: entryRuleCallFor returns [EObject current=null] : iv_ruleCallFor= ruleCallFor EOF ;
    public final EObject entryRuleCallFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallFor = null;


        try {
            // InternalGo.g:2220:48: (iv_ruleCallFor= ruleCallFor EOF )
            // InternalGo.g:2221:2: iv_ruleCallFor= ruleCallFor EOF
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
    // InternalGo.g:2227:1: ruleCallFor returns [EObject current=null] : ( ruleFOR (this_varFor_1= rulevarFor )? this_Open_Key_2= RULE_OPEN_KEY ( (lv_x_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY ) ;
    public final EObject ruleCallFor() throws RecognitionException {
        EObject current = null;

        Token this_Open_Key_2=null;
        Token this_Closed_Key_4=null;
        EObject this_varFor_1 = null;

        EObject lv_x_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2233:2: ( ( ruleFOR (this_varFor_1= rulevarFor )? this_Open_Key_2= RULE_OPEN_KEY ( (lv_x_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY ) )
            // InternalGo.g:2234:2: ( ruleFOR (this_varFor_1= rulevarFor )? this_Open_Key_2= RULE_OPEN_KEY ( (lv_x_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY )
            {
            // InternalGo.g:2234:2: ( ruleFOR (this_varFor_1= rulevarFor )? this_Open_Key_2= RULE_OPEN_KEY ( (lv_x_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY )
            // InternalGo.g:2235:3: ruleFOR (this_varFor_1= rulevarFor )? this_Open_Key_2= RULE_OPEN_KEY ( (lv_x_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCallForAccess().getFORParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_40);
            ruleFOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:2242:3: (this_varFor_1= rulevarFor )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_OPEN_PARENTHESES||LA34_0==RULE_INT||(LA34_0>=47 && LA34_0<=48)||LA34_0==52||LA34_0==62) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGo.g:2243:4: this_varFor_1= rulevarFor
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCallForAccess().getVarForParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_15);
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

            this_Open_Key_2=(Token)match(input,RULE_OPEN_KEY,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Open_Key_2, grammarAccess.getCallForAccess().getOpen_KeyTerminalRuleCall_2());
              		
            }
            // InternalGo.g:2256:3: ( (lv_x_3_0= ruleGreeting ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=RULE_EOL && LA35_0<=RULE_ID)||LA35_0==52||(LA35_0>=55 && LA35_0<=58)||LA35_0==62||LA35_0==64||LA35_0==66) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalGo.g:2257:4: (lv_x_3_0= ruleGreeting )
            	    {
            	    // InternalGo.g:2257:4: (lv_x_3_0= ruleGreeting )
            	    // InternalGo.g:2258:5: lv_x_3_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCallForAccess().getXGreetingParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
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
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

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


    // $ANTLR start "entryRuleAddition"
    // InternalGo.g:2283:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalGo.g:2283:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalGo.g:2284:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddition; 
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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalGo.g:2290:1: ruleAddition returns [EObject current=null] : ( ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Plus_2= RULE_PLUS ( (lv_right_3_0= ruleSubMult ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token this_Plus_2=null;
        EObject this_SubMult_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2296:2: ( ( ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Plus_2= RULE_PLUS ( (lv_right_3_0= ruleSubMult ) ) )* ) )
            // InternalGo.g:2297:2: ( ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Plus_2= RULE_PLUS ( (lv_right_3_0= ruleSubMult ) ) )* )
            {
            // InternalGo.g:2297:2: ( ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Plus_2= RULE_PLUS ( (lv_right_3_0= ruleSubMult ) ) )* )
            // InternalGo.g:2298:3: ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Plus_2= RULE_PLUS ( (lv_right_3_0= ruleSubMult ) ) )*
            {
            // InternalGo.g:2298:3: ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult )
            // InternalGo.g:2299:4: ( ruleSubMult )=>this_SubMult_0= ruleSubMult
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getAdditionAccess().getSubMultParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_41);
            this_SubMult_0=ruleSubMult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_SubMult_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalGo.g:2309:3: ( () this_Plus_2= RULE_PLUS ( (lv_right_3_0= ruleSubMult ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_PLUS) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalGo.g:2310:4: () this_Plus_2= RULE_PLUS ( (lv_right_3_0= ruleSubMult ) )
            	    {
            	    // InternalGo.g:2310:4: ()
            	    // InternalGo.g:2311:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_Plus_2=(Token)match(input,RULE_PLUS,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_Plus_2, grammarAccess.getAdditionAccess().getPlusTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalGo.g:2321:4: ( (lv_right_3_0= ruleSubMult ) )
            	    // InternalGo.g:2322:5: (lv_right_3_0= ruleSubMult )
            	    {
            	    // InternalGo.g:2322:5: (lv_right_3_0= ruleSubMult )
            	    // InternalGo.g:2323:6: lv_right_3_0= ruleSubMult
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditionAccess().getRightSubMultParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_41);
            	    lv_right_3_0=ruleSubMult();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.go.Go.SubMult");
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleSubtration"
    // InternalGo.g:2345:1: entryRuleSubtration returns [EObject current=null] : iv_ruleSubtration= ruleSubtration EOF ;
    public final EObject entryRuleSubtration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtration = null;


        try {
            // InternalGo.g:2345:51: (iv_ruleSubtration= ruleSubtration EOF )
            // InternalGo.g:2346:2: iv_ruleSubtration= ruleSubtration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubtrationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubtration=ruleSubtration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubtration; 
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
    // $ANTLR end "entryRuleSubtration"


    // $ANTLR start "ruleSubtration"
    // InternalGo.g:2352:1: ruleSubtration returns [EObject current=null] : ( ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Minus_2= RULE_MINUS ( (lv_right_3_0= ruleSubMult ) ) )* ) ;
    public final EObject ruleSubtration() throws RecognitionException {
        EObject current = null;

        Token this_Minus_2=null;
        EObject this_SubMult_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2358:2: ( ( ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Minus_2= RULE_MINUS ( (lv_right_3_0= ruleSubMult ) ) )* ) )
            // InternalGo.g:2359:2: ( ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Minus_2= RULE_MINUS ( (lv_right_3_0= ruleSubMult ) ) )* )
            {
            // InternalGo.g:2359:2: ( ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Minus_2= RULE_MINUS ( (lv_right_3_0= ruleSubMult ) ) )* )
            // InternalGo.g:2360:3: ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Minus_2= RULE_MINUS ( (lv_right_3_0= ruleSubMult ) ) )*
            {
            // InternalGo.g:2360:3: ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult )
            // InternalGo.g:2361:4: ( ruleSubMult )=>this_SubMult_0= ruleSubMult
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getSubtrationAccess().getSubMultParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_42);
            this_SubMult_0=ruleSubMult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_SubMult_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalGo.g:2371:3: ( () this_Minus_2= RULE_MINUS ( (lv_right_3_0= ruleSubMult ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_MINUS) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalGo.g:2372:4: () this_Minus_2= RULE_MINUS ( (lv_right_3_0= ruleSubMult ) )
            	    {
            	    // InternalGo.g:2372:4: ()
            	    // InternalGo.g:2373:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getSubtrationAccess().getSubtrationLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_Minus_2=(Token)match(input,RULE_MINUS,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_Minus_2, grammarAccess.getSubtrationAccess().getMinusTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalGo.g:2383:4: ( (lv_right_3_0= ruleSubMult ) )
            	    // InternalGo.g:2384:5: (lv_right_3_0= ruleSubMult )
            	    {
            	    // InternalGo.g:2384:5: (lv_right_3_0= ruleSubMult )
            	    // InternalGo.g:2385:6: lv_right_3_0= ruleSubMult
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSubtrationAccess().getRightSubMultParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
            	    lv_right_3_0=ruleSubMult();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSubtrationRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.go.Go.SubMult");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // $ANTLR end "ruleSubtration"


    // $ANTLR start "entryRuleMultiplication"
    // InternalGo.g:2407:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalGo.g:2407:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalGo.g:2408:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalGo.g:2414:1: ruleMultiplication returns [EObject current=null] : ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Asterics_2= RULE_ASTERICS ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token this_Asterics_2=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2420:2: ( ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Asterics_2= RULE_ASTERICS ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // InternalGo.g:2421:2: ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Asterics_2= RULE_ASTERICS ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // InternalGo.g:2421:2: ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Asterics_2= RULE_ASTERICS ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // InternalGo.g:2422:3: ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Asterics_2= RULE_ASTERICS ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {
            // InternalGo.g:2422:3: ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression )
            // InternalGo.g:2423:4: ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_43);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_PrimaryExpression_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalGo.g:2433:3: ( () this_Asterics_2= RULE_ASTERICS ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ASTERICS) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalGo.g:2434:4: () this_Asterics_2= RULE_ASTERICS ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // InternalGo.g:2434:4: ()
            	    // InternalGo.g:2435:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_Asterics_2=(Token)match(input,RULE_ASTERICS,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_Asterics_2, grammarAccess.getMultiplicationAccess().getAstericsTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalGo.g:2445:4: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // InternalGo.g:2446:5: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // InternalGo.g:2446:5: (lv_right_3_0= rulePrimaryExpression )
            	    // InternalGo.g:2447:6: lv_right_3_0= rulePrimaryExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_43);
            	    lv_right_3_0=rulePrimaryExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
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
            	    break loop38;
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleDivision"
    // InternalGo.g:2469:1: entryRuleDivision returns [EObject current=null] : iv_ruleDivision= ruleDivision EOF ;
    public final EObject entryRuleDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivision = null;


        try {
            // InternalGo.g:2469:49: (iv_ruleDivision= ruleDivision EOF )
            // InternalGo.g:2470:2: iv_ruleDivision= ruleDivision EOF
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
    // InternalGo.g:2476:1: ruleDivision returns [EObject current=null] : ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Bar_2= RULE_BAR ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleDivision() throws RecognitionException {
        EObject current = null;

        Token this_Bar_2=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2482:2: ( ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Bar_2= RULE_BAR ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // InternalGo.g:2483:2: ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Bar_2= RULE_BAR ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // InternalGo.g:2483:2: ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Bar_2= RULE_BAR ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // InternalGo.g:2484:3: ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Bar_2= RULE_BAR ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {
            // InternalGo.g:2484:3: ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression )
            // InternalGo.g:2485:4: ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getDivisionAccess().getPrimaryExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_44);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_PrimaryExpression_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalGo.g:2495:3: ( () this_Bar_2= RULE_BAR ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_BAR) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalGo.g:2496:4: () this_Bar_2= RULE_BAR ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // InternalGo.g:2496:4: ()
            	    // InternalGo.g:2497:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_Bar_2=(Token)match(input,RULE_BAR,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_Bar_2, grammarAccess.getDivisionAccess().getBarTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalGo.g:2507:4: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // InternalGo.g:2508:5: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // InternalGo.g:2508:5: (lv_right_3_0= rulePrimaryExpression )
            	    // InternalGo.g:2509:6: lv_right_3_0= rulePrimaryExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDivisionAccess().getRightPrimaryExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_44);
            	    lv_right_3_0=rulePrimaryExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDivisionRule());
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
            	    break loop39;
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
    // $ANTLR end "ruleDivision"


    // $ANTLR start "entryRuleSubMult"
    // InternalGo.g:2531:1: entryRuleSubMult returns [EObject current=null] : iv_ruleSubMult= ruleSubMult EOF ;
    public final EObject entryRuleSubMult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubMult = null;


        try {
            // InternalGo.g:2531:48: (iv_ruleSubMult= ruleSubMult EOF )
            // InternalGo.g:2532:2: iv_ruleSubMult= ruleSubMult EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubMultRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubMult=ruleSubMult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubMult; 
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
    // $ANTLR end "entryRuleSubMult"


    // $ANTLR start "ruleSubMult"
    // InternalGo.g:2538:1: ruleSubMult returns [EObject current=null] : ( ( ( rulePrimaryExpression )=>this_Multiplication_0= ruleMultiplication ) | ( ( rulePrimaryExpression )=>this_Division_1= ruleDivision ) ) ;
    public final EObject ruleSubMult() throws RecognitionException {
        EObject current = null;

        EObject this_Multiplication_0 = null;

        EObject this_Division_1 = null;



        	enterRule();

        try {
            // InternalGo.g:2544:2: ( ( ( ( rulePrimaryExpression )=>this_Multiplication_0= ruleMultiplication ) | ( ( rulePrimaryExpression )=>this_Division_1= ruleDivision ) ) )
            // InternalGo.g:2545:2: ( ( ( rulePrimaryExpression )=>this_Multiplication_0= ruleMultiplication ) | ( ( rulePrimaryExpression )=>this_Division_1= ruleDivision ) )
            {
            // InternalGo.g:2545:2: ( ( ( rulePrimaryExpression )=>this_Multiplication_0= ruleMultiplication ) | ( ( rulePrimaryExpression )=>this_Division_1= ruleDivision ) )
            int alt40=2;
            switch ( input.LA(1) ) {
            case RULE_OPEN_PARENTHESES:
                {
                int LA40_1 = input.LA(2);

                if ( (synpred13_InternalGo()) ) {
                    alt40=1;
                }
                else if ( (synpred14_InternalGo()) ) {
                    alt40=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                int LA40_2 = input.LA(2);

                if ( (synpred13_InternalGo()) ) {
                    alt40=1;
                }
                else if ( (synpred14_InternalGo()) ) {
                    alt40=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 2, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                int LA40_3 = input.LA(2);

                if ( (synpred13_InternalGo()) ) {
                    alt40=1;
                }
                else if ( (synpred14_InternalGo()) ) {
                    alt40=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA40_4 = input.LA(2);

                if ( (synpred13_InternalGo()) ) {
                    alt40=1;
                }
                else if ( (synpred14_InternalGo()) ) {
                    alt40=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalGo.g:2546:3: ( ( rulePrimaryExpression )=>this_Multiplication_0= ruleMultiplication )
                    {
                    // InternalGo.g:2546:3: ( ( rulePrimaryExpression )=>this_Multiplication_0= ruleMultiplication )
                    // InternalGo.g:2547:4: ( rulePrimaryExpression )=>this_Multiplication_0= ruleMultiplication
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSubMultAccess().getMultiplicationParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Multiplication_0=ruleMultiplication();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Multiplication_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:2558:3: ( ( rulePrimaryExpression )=>this_Division_1= ruleDivision )
                    {
                    // InternalGo.g:2558:3: ( ( rulePrimaryExpression )=>this_Division_1= ruleDivision )
                    // InternalGo.g:2559:4: ( rulePrimaryExpression )=>this_Division_1= ruleDivision
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSubMultAccess().getDivisionParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Division_1=ruleDivision();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Division_1;
                      				afterParserOrEnumRuleCall();
                      			
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
    // $ANTLR end "ruleSubMult"


    // $ANTLR start "entryRuleOrExpression"
    // InternalGo.g:2573:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalGo.g:2573:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalGo.g:2574:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalGo.g:2580:1: ruleOrExpression returns [EObject current=null] : ( ( ( ruleAndExpression )=>this_AndExpression_0= ruleAndExpression ) ( () otherlv_2= '||' ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2586:2: ( ( ( ( ruleAndExpression )=>this_AndExpression_0= ruleAndExpression ) ( () otherlv_2= '||' ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalGo.g:2587:2: ( ( ( ruleAndExpression )=>this_AndExpression_0= ruleAndExpression ) ( () otherlv_2= '||' ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalGo.g:2587:2: ( ( ( ruleAndExpression )=>this_AndExpression_0= ruleAndExpression ) ( () otherlv_2= '||' ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalGo.g:2588:3: ( ( ruleAndExpression )=>this_AndExpression_0= ruleAndExpression ) ( () otherlv_2= '||' ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) ) )*
            {
            // InternalGo.g:2588:3: ( ( ruleAndExpression )=>this_AndExpression_0= ruleAndExpression )
            // InternalGo.g:2589:4: ( ruleAndExpression )=>this_AndExpression_0= ruleAndExpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_45);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_AndExpression_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalGo.g:2599:3: ( () otherlv_2= '||' ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==33) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalGo.g:2600:4: () otherlv_2= '||' ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalGo.g:2600:4: ()
            	    // InternalGo.g:2601:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalGo.g:2611:4: ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) )
            	    // InternalGo.g:2612:5: ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalGo.g:2613:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalGo.g:2614:6: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_45);
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
            	    break loop41;
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
    // InternalGo.g:2636:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalGo.g:2636:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalGo.g:2637:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalGo.g:2643:1: ruleAndExpression returns [EObject current=null] : ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) ( () otherlv_2= '&&' ( ( rulePrimaryExpression )=> (lv_right_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ComparisonExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2649:2: ( ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) ( () otherlv_2= '&&' ( ( rulePrimaryExpression )=> (lv_right_3_0= ruleComparisonExpression ) ) )* ) )
            // InternalGo.g:2650:2: ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) ( () otherlv_2= '&&' ( ( rulePrimaryExpression )=> (lv_right_3_0= ruleComparisonExpression ) ) )* )
            {
            // InternalGo.g:2650:2: ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) ( () otherlv_2= '&&' ( ( rulePrimaryExpression )=> (lv_right_3_0= ruleComparisonExpression ) ) )* )
            // InternalGo.g:2651:3: ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) ( () otherlv_2= '&&' ( ( rulePrimaryExpression )=> (lv_right_3_0= ruleComparisonExpression ) ) )*
            {
            // InternalGo.g:2651:3: ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression )
            // InternalGo.g:2652:4: ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getAndExpressionAccess().getComparisonExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_46);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_ComparisonExpression_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalGo.g:2662:3: ( () otherlv_2= '&&' ( ( rulePrimaryExpression )=> (lv_right_3_0= ruleComparisonExpression ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==34) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalGo.g:2663:4: () otherlv_2= '&&' ( ( rulePrimaryExpression )=> (lv_right_3_0= ruleComparisonExpression ) )
            	    {
            	    // InternalGo.g:2663:4: ()
            	    // InternalGo.g:2664:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,34,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalGo.g:2674:4: ( ( rulePrimaryExpression )=> (lv_right_3_0= ruleComparisonExpression ) )
            	    // InternalGo.g:2675:5: ( rulePrimaryExpression )=> (lv_right_3_0= ruleComparisonExpression )
            	    {
            	    // InternalGo.g:2676:5: (lv_right_3_0= ruleComparisonExpression )
            	    // InternalGo.g:2677:6: lv_right_3_0= ruleComparisonExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_46);
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
            	    break loop42;
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
    // InternalGo.g:2699:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalGo.g:2699:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalGo.g:2700:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
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
    // InternalGo.g:2706:1: ruleComparisonExpression returns [EObject current=null] : ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () ruleOperator ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2712:2: ( ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () ruleOperator ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // InternalGo.g:2713:2: ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () ruleOperator ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // InternalGo.g:2713:2: ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () ruleOperator ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // InternalGo.g:2714:3: ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () ruleOperator ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {
            // InternalGo.g:2714:3: ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression )
            // InternalGo.g:2715:4: ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getComparisonExpressionAccess().getPrimaryExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_47);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_PrimaryExpression_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalGo.g:2725:3: ( () ruleOperator ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=35 && LA43_0<=39)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalGo.g:2726:4: () ruleOperator ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // InternalGo.g:2726:4: ()
            	    // InternalGo.g:2727:5: 
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
            	    pushFollow(FOLLOW_23);
            	    ruleOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalGo.g:2740:4: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // InternalGo.g:2741:5: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // InternalGo.g:2741:5: (lv_right_3_0= rulePrimaryExpression )
            	    // InternalGo.g:2742:6: lv_right_3_0= rulePrimaryExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_47);
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
            	    break loop43;
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
    // InternalGo.g:2764:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalGo.g:2764:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalGo.g:2765:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalGo.g:2771:1: rulePrimaryExpression returns [EObject current=null] : ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | this_Literal_3= ruleLiteral ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token this_Open_parentheses_0=null;
        Token this_Closed_parentheses_2=null;
        EObject this_Expression_1 = null;

        EObject this_Literal_3 = null;



        	enterRule();

        try {
            // InternalGo.g:2777:2: ( ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | this_Literal_3= ruleLiteral ) )
            // InternalGo.g:2778:2: ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | this_Literal_3= ruleLiteral )
            {
            // InternalGo.g:2778:2: ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | this_Literal_3= ruleLiteral )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_OPEN_PARENTHESES) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_INT||(LA44_0>=47 && LA44_0<=48)) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalGo.g:2779:3: (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES )
                    {
                    // InternalGo.g:2779:3: (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES )
                    // InternalGo.g:2780:4: this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES
                    {
                    this_Open_parentheses_0=(Token)match(input,RULE_OPEN_PARENTHESES,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Open_parentheses_0, grammarAccess.getPrimaryExpressionAccess().getOpen_parenthesesTerminalRuleCall_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_37);
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
                    // InternalGo.g:2798:3: this_Literal_3= ruleLiteral
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
    // InternalGo.g:2810:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalGo.g:2810:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalGo.g:2811:2: iv_ruleOperator= ruleOperator EOF
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
    // InternalGo.g:2817:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '<=' | kw= '==' | kw= '>=' | kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2823:2: ( (kw= '<' | kw= '<=' | kw= '==' | kw= '>=' | kw= '>' ) )
            // InternalGo.g:2824:2: (kw= '<' | kw= '<=' | kw= '==' | kw= '>=' | kw= '>' )
            {
            // InternalGo.g:2824:2: (kw= '<' | kw= '<=' | kw= '==' | kw= '>=' | kw= '>' )
            int alt45=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt45=1;
                }
                break;
            case 36:
                {
                alt45=2;
                }
                break;
            case 37:
                {
                alt45=3;
                }
                break;
            case 38:
                {
                alt45=4;
                }
                break;
            case 39:
                {
                alt45=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalGo.g:2825:3: kw= '<'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2831:3: kw= '<='
                    {
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignEqualsSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:2837:3: kw= '=='
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getEqualsSignEqualsSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:2843:3: kw= '>='
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getGreaterThanSignEqualsSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:2849:3: kw= '>'
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
    // InternalGo.g:2858:1: entryRuleoperationsOne returns [EObject current=null] : iv_ruleoperationsOne= ruleoperationsOne EOF ;
    public final EObject entryRuleoperationsOne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperationsOne = null;


        try {
            // InternalGo.g:2858:54: (iv_ruleoperationsOne= ruleoperationsOne EOF )
            // InternalGo.g:2859:2: iv_ruleoperationsOne= ruleoperationsOne EOF
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
    // InternalGo.g:2865:1: ruleoperationsOne returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusOne_1= RULE_PLUSONE | this_MinusOne_2= RULE_MINUSONE ) ) ;
    public final EObject ruleoperationsOne() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_PlusOne_1=null;
        Token this_MinusOne_2=null;


        	enterRule();

        try {
            // InternalGo.g:2871:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusOne_1= RULE_PLUSONE | this_MinusOne_2= RULE_MINUSONE ) ) )
            // InternalGo.g:2872:2: ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusOne_1= RULE_PLUSONE | this_MinusOne_2= RULE_MINUSONE ) )
            {
            // InternalGo.g:2872:2: ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusOne_1= RULE_PLUSONE | this_MinusOne_2= RULE_MINUSONE ) )
            // InternalGo.g:2873:3: ( (lv_name_0_0= RULE_ID ) ) (this_PlusOne_1= RULE_PLUSONE | this_MinusOne_2= RULE_MINUSONE )
            {
            // InternalGo.g:2873:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGo.g:2874:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGo.g:2874:4: (lv_name_0_0= RULE_ID )
            // InternalGo.g:2875:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
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

            // InternalGo.g:2891:3: (this_PlusOne_1= RULE_PLUSONE | this_MinusOne_2= RULE_MINUSONE )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_PLUSONE) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_MINUSONE) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalGo.g:2892:4: this_PlusOne_1= RULE_PLUSONE
                    {
                    this_PlusOne_1=(Token)match(input,RULE_PLUSONE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_PlusOne_1, grammarAccess.getOperationsOneAccess().getPlusOneTerminalRuleCall_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2897:4: this_MinusOne_2= RULE_MINUSONE
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
    // InternalGo.g:2906:1: entryRulevarFor returns [EObject current=null] : iv_rulevarFor= rulevarFor EOF ;
    public final EObject entryRulevarFor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevarFor = null;


        try {
            // InternalGo.g:2906:47: (iv_rulevarFor= rulevarFor EOF )
            // InternalGo.g:2907:2: iv_rulevarFor= rulevarFor EOF
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
    // InternalGo.g:2913:1: rulevarFor returns [EObject current=null] : ( ( ( rulePrimaryExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) | ( ruleModif ( (lv_var_2_0= RULE_ID ) ) ruleTypes this_equals_4= RULE_EQUALS ( (lv_atrb_5_0= ruleAtrib_Aux ) ) this_PontoVirgula_6= RULE_PONTOVIRGULA ( (lv_right_7_0= ruleLiteral ) ) ruleOperator ( (lv_left_9_0= ruleLiteral ) ) this_PontoVirgula_10= RULE_PONTOVIRGULA (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals ) ) ) ;
    public final EObject rulevarFor() throws RecognitionException {
        EObject current = null;

        Token lv_var_2_0=null;
        Token this_equals_4=null;
        Token this_PontoVirgula_6=null;
        Token this_PontoVirgula_10=null;
        EObject this_ComparisonExpression_0 = null;

        EObject lv_atrb_5_0 = null;

        EObject lv_right_7_0 = null;

        EObject lv_left_9_0 = null;

        EObject this_operationsOne_11 = null;

        EObject this_OperationsOneEquals_12 = null;



        	enterRule();

        try {
            // InternalGo.g:2919:2: ( ( ( ( rulePrimaryExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) | ( ruleModif ( (lv_var_2_0= RULE_ID ) ) ruleTypes this_equals_4= RULE_EQUALS ( (lv_atrb_5_0= ruleAtrib_Aux ) ) this_PontoVirgula_6= RULE_PONTOVIRGULA ( (lv_right_7_0= ruleLiteral ) ) ruleOperator ( (lv_left_9_0= ruleLiteral ) ) this_PontoVirgula_10= RULE_PONTOVIRGULA (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals ) ) ) )
            // InternalGo.g:2920:2: ( ( ( rulePrimaryExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) | ( ruleModif ( (lv_var_2_0= RULE_ID ) ) ruleTypes this_equals_4= RULE_EQUALS ( (lv_atrb_5_0= ruleAtrib_Aux ) ) this_PontoVirgula_6= RULE_PONTOVIRGULA ( (lv_right_7_0= ruleLiteral ) ) ruleOperator ( (lv_left_9_0= ruleLiteral ) ) this_PontoVirgula_10= RULE_PONTOVIRGULA (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals ) ) )
            {
            // InternalGo.g:2920:2: ( ( ( rulePrimaryExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) | ( ruleModif ( (lv_var_2_0= RULE_ID ) ) ruleTypes this_equals_4= RULE_EQUALS ( (lv_atrb_5_0= ruleAtrib_Aux ) ) this_PontoVirgula_6= RULE_PONTOVIRGULA ( (lv_right_7_0= ruleLiteral ) ) ruleOperator ( (lv_left_9_0= ruleLiteral ) ) this_PontoVirgula_10= RULE_PONTOVIRGULA (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_OPEN_PARENTHESES) && (synpred20_InternalGo())) {
                alt48=1;
            }
            else if ( (LA48_0==47) && (synpred20_InternalGo())) {
                alt48=1;
            }
            else if ( (LA48_0==48) && (synpred20_InternalGo())) {
                alt48=1;
            }
            else if ( (LA48_0==RULE_INT) && (synpred20_InternalGo())) {
                alt48=1;
            }
            else if ( (LA48_0==52||LA48_0==62) ) {
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
                    // InternalGo.g:2921:3: ( ( rulePrimaryExpression )=>this_ComparisonExpression_0= ruleComparisonExpression )
                    {
                    // InternalGo.g:2921:3: ( ( rulePrimaryExpression )=>this_ComparisonExpression_0= ruleComparisonExpression )
                    // InternalGo.g:2922:4: ( rulePrimaryExpression )=>this_ComparisonExpression_0= ruleComparisonExpression
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


                    }
                    break;
                case 2 :
                    // InternalGo.g:2933:3: ( ruleModif ( (lv_var_2_0= RULE_ID ) ) ruleTypes this_equals_4= RULE_EQUALS ( (lv_atrb_5_0= ruleAtrib_Aux ) ) this_PontoVirgula_6= RULE_PONTOVIRGULA ( (lv_right_7_0= ruleLiteral ) ) ruleOperator ( (lv_left_9_0= ruleLiteral ) ) this_PontoVirgula_10= RULE_PONTOVIRGULA (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals ) )
                    {
                    // InternalGo.g:2933:3: ( ruleModif ( (lv_var_2_0= RULE_ID ) ) ruleTypes this_equals_4= RULE_EQUALS ( (lv_atrb_5_0= ruleAtrib_Aux ) ) this_PontoVirgula_6= RULE_PONTOVIRGULA ( (lv_right_7_0= ruleLiteral ) ) ruleOperator ( (lv_left_9_0= ruleLiteral ) ) this_PontoVirgula_10= RULE_PONTOVIRGULA (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals ) )
                    // InternalGo.g:2934:4: ruleModif ( (lv_var_2_0= RULE_ID ) ) ruleTypes this_equals_4= RULE_EQUALS ( (lv_atrb_5_0= ruleAtrib_Aux ) ) this_PontoVirgula_6= RULE_PONTOVIRGULA ( (lv_right_7_0= ruleLiteral ) ) ruleOperator ( (lv_left_9_0= ruleLiteral ) ) this_PontoVirgula_10= RULE_PONTOVIRGULA (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals )
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
                    // InternalGo.g:2941:4: ( (lv_var_2_0= RULE_ID ) )
                    // InternalGo.g:2942:5: (lv_var_2_0= RULE_ID )
                    {
                    // InternalGo.g:2942:5: (lv_var_2_0= RULE_ID )
                    // InternalGo.g:2943:6: lv_var_2_0= RULE_ID
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
                    this_equals_4=(Token)match(input,RULE_EQUALS,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_equals_4, grammarAccess.getVarForAccess().getEqualsTerminalRuleCall_1_3());
                      			
                    }
                    // InternalGo.g:2970:4: ( (lv_atrb_5_0= ruleAtrib_Aux ) )
                    // InternalGo.g:2971:5: (lv_atrb_5_0= ruleAtrib_Aux )
                    {
                    // InternalGo.g:2971:5: (lv_atrb_5_0= ruleAtrib_Aux )
                    // InternalGo.g:2972:6: lv_atrb_5_0= ruleAtrib_Aux
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarForAccess().getAtrbAtrib_AuxParserRuleCall_1_4_0());
                      					
                    }
                    pushFollow(FOLLOW_49);
                    lv_atrb_5_0=ruleAtrib_Aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVarForRule());
                      						}
                      						add(
                      							current,
                      							"atrb",
                      							lv_atrb_5_0,
                      							"org.xtext.go.Go.Atrib_Aux");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    this_PontoVirgula_6=(Token)match(input,RULE_PONTOVIRGULA,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_PontoVirgula_6, grammarAccess.getVarForAccess().getPontoVirgulaTerminalRuleCall_1_5());
                      			
                    }
                    // InternalGo.g:2993:4: ( (lv_right_7_0= ruleLiteral ) )
                    // InternalGo.g:2994:5: (lv_right_7_0= ruleLiteral )
                    {
                    // InternalGo.g:2994:5: (lv_right_7_0= ruleLiteral )
                    // InternalGo.g:2995:6: lv_right_7_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarForAccess().getRightLiteralParserRuleCall_1_6_0());
                      					
                    }
                    pushFollow(FOLLOW_50);
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
                    pushFollow(FOLLOW_23);
                    ruleOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:3019:4: ( (lv_left_9_0= ruleLiteral ) )
                    // InternalGo.g:3020:5: (lv_left_9_0= ruleLiteral )
                    {
                    // InternalGo.g:3020:5: (lv_left_9_0= ruleLiteral )
                    // InternalGo.g:3021:6: lv_left_9_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarForAccess().getLeftLiteralParserRuleCall_1_8_0());
                      					
                    }
                    pushFollow(FOLLOW_49);
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

                    this_PontoVirgula_10=(Token)match(input,RULE_PONTOVIRGULA,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_PontoVirgula_10, grammarAccess.getVarForAccess().getPontoVirgulaTerminalRuleCall_1_9());
                      			
                    }
                    // InternalGo.g:3042:4: (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_ID) ) {
                        int LA47_1 = input.LA(2);

                        if ( ((LA47_1>=RULE_PLUSONE && LA47_1<=RULE_MINUSONE)) ) {
                            alt47=1;
                        }
                        else if ( ((LA47_1>=RULE_PLUSEQUALS && LA47_1<=RULE_MINUSEQUALS)) ) {
                            alt47=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 47, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalGo.g:3043:5: this_operationsOne_11= ruleoperationsOne
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
                            // InternalGo.g:3052:5: this_OperationsOneEquals_12= ruleOperationsOneEquals
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
    // InternalGo.g:3066:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalGo.g:3066:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalGo.g:3067:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalGo.g:3073:1: ruleLiteral returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleBool ) ) ) | this_Numbers_2= ruleNumbers ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;

        EObject this_Numbers_2 = null;



        	enterRule();

        try {
            // InternalGo.g:3079:2: ( ( ( () ( (lv_value_1_0= ruleBool ) ) ) | this_Numbers_2= ruleNumbers ) )
            // InternalGo.g:3080:2: ( ( () ( (lv_value_1_0= ruleBool ) ) ) | this_Numbers_2= ruleNumbers )
            {
            // InternalGo.g:3080:2: ( ( () ( (lv_value_1_0= ruleBool ) ) ) | this_Numbers_2= ruleNumbers )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=47 && LA49_0<=48)) ) {
                alt49=1;
            }
            else if ( (LA49_0==RULE_INT) ) {
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
                    // InternalGo.g:3081:3: ( () ( (lv_value_1_0= ruleBool ) ) )
                    {
                    // InternalGo.g:3081:3: ( () ( (lv_value_1_0= ruleBool ) ) )
                    // InternalGo.g:3082:4: () ( (lv_value_1_0= ruleBool ) )
                    {
                    // InternalGo.g:3082:4: ()
                    // InternalGo.g:3083:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getLiteralAccess().getLiteralAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGo.g:3089:4: ( (lv_value_1_0= ruleBool ) )
                    // InternalGo.g:3090:5: (lv_value_1_0= ruleBool )
                    {
                    // InternalGo.g:3090:5: (lv_value_1_0= ruleBool )
                    // InternalGo.g:3091:6: lv_value_1_0= ruleBool
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLiteralAccess().getValueBoolParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleBool();

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
                      							"org.xtext.go.Go.Bool");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:3110:3: this_Numbers_2= ruleNumbers
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getNumbersParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Numbers_2=ruleNumbers();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Numbers_2;
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
    // InternalGo.g:3122:1: entryRuleDecFunc returns [EObject current=null] : iv_ruleDecFunc= ruleDecFunc EOF ;
    public final EObject entryRuleDecFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecFunc = null;


        try {
            // InternalGo.g:3122:48: (iv_ruleDecFunc= ruleDecFunc EOF )
            // InternalGo.g:3123:2: iv_ruleDecFunc= ruleDecFunc EOF
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
    // InternalGo.g:3129:1: ruleDecFunc returns [EObject current=null] : ( ruleFUNC ( (lv_name_1_0= RULE_ID ) ) this_Open_parentheses_2= RULE_OPEN_PARENTHESES ( (lv_param_3_0= ruleParams ) )* this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ( (lv_returnType_5_0= ruleTypes ) )? this_Open_Key_6= RULE_OPEN_KEY ( (lv_body_7_0= ruleFunctionBody ) ) this_Closed_Key_8= RULE_CLOSED_KEY ) ;
    public final EObject ruleDecFunc() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token this_Open_parentheses_2=null;
        Token this_Closed_parentheses_4=null;
        Token this_Open_Key_6=null;
        Token this_Closed_Key_8=null;
        EObject lv_param_3_0 = null;

        AntlrDatatypeRuleToken lv_returnType_5_0 = null;

        EObject lv_body_7_0 = null;



        	enterRule();

        try {
            // InternalGo.g:3135:2: ( ( ruleFUNC ( (lv_name_1_0= RULE_ID ) ) this_Open_parentheses_2= RULE_OPEN_PARENTHESES ( (lv_param_3_0= ruleParams ) )* this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ( (lv_returnType_5_0= ruleTypes ) )? this_Open_Key_6= RULE_OPEN_KEY ( (lv_body_7_0= ruleFunctionBody ) ) this_Closed_Key_8= RULE_CLOSED_KEY ) )
            // InternalGo.g:3136:2: ( ruleFUNC ( (lv_name_1_0= RULE_ID ) ) this_Open_parentheses_2= RULE_OPEN_PARENTHESES ( (lv_param_3_0= ruleParams ) )* this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ( (lv_returnType_5_0= ruleTypes ) )? this_Open_Key_6= RULE_OPEN_KEY ( (lv_body_7_0= ruleFunctionBody ) ) this_Closed_Key_8= RULE_CLOSED_KEY )
            {
            // InternalGo.g:3136:2: ( ruleFUNC ( (lv_name_1_0= RULE_ID ) ) this_Open_parentheses_2= RULE_OPEN_PARENTHESES ( (lv_param_3_0= ruleParams ) )* this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ( (lv_returnType_5_0= ruleTypes ) )? this_Open_Key_6= RULE_OPEN_KEY ( (lv_body_7_0= ruleFunctionBody ) ) this_Closed_Key_8= RULE_CLOSED_KEY )
            // InternalGo.g:3137:3: ruleFUNC ( (lv_name_1_0= RULE_ID ) ) this_Open_parentheses_2= RULE_OPEN_PARENTHESES ( (lv_param_3_0= ruleParams ) )* this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ( (lv_returnType_5_0= ruleTypes ) )? this_Open_Key_6= RULE_OPEN_KEY ( (lv_body_7_0= ruleFunctionBody ) ) this_Closed_Key_8= RULE_CLOSED_KEY
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
            // InternalGo.g:3144:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGo.g:3145:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGo.g:3145:4: (lv_name_1_0= RULE_ID )
            // InternalGo.g:3146:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
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

            this_Open_parentheses_2=(Token)match(input,RULE_OPEN_PARENTHESES,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Open_parentheses_2, grammarAccess.getDecFuncAccess().getOpen_parenthesesTerminalRuleCall_2());
              		
            }
            // InternalGo.g:3166:3: ( (lv_param_3_0= ruleParams ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_ID) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalGo.g:3167:4: (lv_param_3_0= ruleParams )
            	    {
            	    // InternalGo.g:3167:4: (lv_param_3_0= ruleParams )
            	    // InternalGo.g:3168:5: lv_param_3_0= ruleParams
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDecFuncAccess().getParamParamsParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
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
            	    break loop50;
                }
            } while (true);

            this_Closed_parentheses_4=(Token)match(input,RULE_CLOSED_PARENTHESES,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Closed_parentheses_4, grammarAccess.getDecFuncAccess().getClosed_parenthesesTerminalRuleCall_4());
              		
            }
            // InternalGo.g:3189:3: ( (lv_returnType_5_0= ruleTypes ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=40 && LA51_0<=46)||LA51_0==61) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalGo.g:3190:4: (lv_returnType_5_0= ruleTypes )
                    {
                    // InternalGo.g:3190:4: (lv_returnType_5_0= ruleTypes )
                    // InternalGo.g:3191:5: lv_returnType_5_0= ruleTypes
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDecFuncAccess().getReturnTypeTypesParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_15);
                    lv_returnType_5_0=ruleTypes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDecFuncRule());
                      					}
                      					set(
                      						current,
                      						"returnType",
                      						lv_returnType_5_0,
                      						"org.xtext.go.Go.Types");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            this_Open_Key_6=(Token)match(input,RULE_OPEN_KEY,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Open_Key_6, grammarAccess.getDecFuncAccess().getOpen_KeyTerminalRuleCall_6());
              		
            }
            // InternalGo.g:3212:3: ( (lv_body_7_0= ruleFunctionBody ) )
            // InternalGo.g:3213:4: (lv_body_7_0= ruleFunctionBody )
            {
            // InternalGo.g:3213:4: (lv_body_7_0= ruleFunctionBody )
            // InternalGo.g:3214:5: lv_body_7_0= ruleFunctionBody
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDecFuncAccess().getBodyFunctionBodyParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_body_7_0=ruleFunctionBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDecFuncRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_7_0,
              						"org.xtext.go.Go.FunctionBody");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_Closed_Key_8=(Token)match(input,RULE_CLOSED_KEY,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Closed_Key_8, grammarAccess.getDecFuncAccess().getClosed_KeyTerminalRuleCall_8());
              		
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


    // $ANTLR start "entryRuleFunctionBody"
    // InternalGo.g:3239:1: entryRuleFunctionBody returns [EObject current=null] : iv_ruleFunctionBody= ruleFunctionBody EOF ;
    public final EObject entryRuleFunctionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBody = null;


        try {
            // InternalGo.g:3239:53: (iv_ruleFunctionBody= ruleFunctionBody EOF )
            // InternalGo.g:3240:2: iv_ruleFunctionBody= ruleFunctionBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionBodyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionBody=ruleFunctionBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionBody; 
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
    // $ANTLR end "entryRuleFunctionBody"


    // $ANTLR start "ruleFunctionBody"
    // InternalGo.g:3246:1: ruleFunctionBody returns [EObject current=null] : ( ( (lv_args_0_0= ruleGreeting ) )* ( ruleRETURN ( (lv_returnType_2_0= ruleAtrib_Aux ) ) )? ) ;
    public final EObject ruleFunctionBody() throws RecognitionException {
        EObject current = null;

        EObject lv_args_0_0 = null;

        EObject lv_returnType_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:3252:2: ( ( ( (lv_args_0_0= ruleGreeting ) )* ( ruleRETURN ( (lv_returnType_2_0= ruleAtrib_Aux ) ) )? ) )
            // InternalGo.g:3253:2: ( ( (lv_args_0_0= ruleGreeting ) )* ( ruleRETURN ( (lv_returnType_2_0= ruleAtrib_Aux ) ) )? )
            {
            // InternalGo.g:3253:2: ( ( (lv_args_0_0= ruleGreeting ) )* ( ruleRETURN ( (lv_returnType_2_0= ruleAtrib_Aux ) ) )? )
            // InternalGo.g:3254:3: ( (lv_args_0_0= ruleGreeting ) )* ( ruleRETURN ( (lv_returnType_2_0= ruleAtrib_Aux ) ) )?
            {
            // InternalGo.g:3254:3: ( (lv_args_0_0= ruleGreeting ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=RULE_EOL && LA52_0<=RULE_ID)||LA52_0==52||(LA52_0>=55 && LA52_0<=58)||LA52_0==62||LA52_0==64||LA52_0==66) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalGo.g:3255:4: (lv_args_0_0= ruleGreeting )
            	    {
            	    // InternalGo.g:3255:4: (lv_args_0_0= ruleGreeting )
            	    // InternalGo.g:3256:5: lv_args_0_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFunctionBodyAccess().getArgsGreetingParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_53);
            	    lv_args_0_0=ruleGreeting();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getFunctionBodyRule());
            	      					}
            	      					add(
            	      						current,
            	      						"args",
            	      						lv_args_0_0,
            	      						"org.xtext.go.Go.Greeting");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            // InternalGo.g:3273:3: ( ruleRETURN ( (lv_returnType_2_0= ruleAtrib_Aux ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==59) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalGo.g:3274:4: ruleRETURN ( (lv_returnType_2_0= ruleAtrib_Aux ) )
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFunctionBodyAccess().getRETURNParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_8);
                    ruleRETURN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:3281:4: ( (lv_returnType_2_0= ruleAtrib_Aux ) )
                    // InternalGo.g:3282:5: (lv_returnType_2_0= ruleAtrib_Aux )
                    {
                    // InternalGo.g:3282:5: (lv_returnType_2_0= ruleAtrib_Aux )
                    // InternalGo.g:3283:6: lv_returnType_2_0= ruleAtrib_Aux
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionBodyAccess().getReturnTypeAtrib_AuxParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_returnType_2_0=ruleAtrib_Aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFunctionBodyRule());
                      						}
                      						set(
                      							current,
                      							"returnType",
                      							lv_returnType_2_0,
                      							"org.xtext.go.Go.Atrib_Aux");
                      						afterParserOrEnumRuleCall();
                      					
                    }

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
    // $ANTLR end "ruleFunctionBody"


    // $ANTLR start "entryRuleCallFunc"
    // InternalGo.g:3305:1: entryRuleCallFunc returns [EObject current=null] : iv_ruleCallFunc= ruleCallFunc EOF ;
    public final EObject entryRuleCallFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallFunc = null;


        try {
            // InternalGo.g:3305:49: (iv_ruleCallFunc= ruleCallFunc EOF )
            // InternalGo.g:3306:2: iv_ruleCallFunc= ruleCallFunc EOF
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
    // InternalGo.g:3312:1: ruleCallFunc returns [EObject current=null] : ( ( (lv_nameFunc_0_0= RULE_ID ) ) this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( (lv_param_2_0= ruleParams ) )* this_Closed_parentheses_3= RULE_CLOSED_PARENTHESES ) ;
    public final EObject ruleCallFunc() throws RecognitionException {
        EObject current = null;

        Token lv_nameFunc_0_0=null;
        Token this_Open_parentheses_1=null;
        Token this_Closed_parentheses_3=null;
        EObject lv_param_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:3318:2: ( ( ( (lv_nameFunc_0_0= RULE_ID ) ) this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( (lv_param_2_0= ruleParams ) )* this_Closed_parentheses_3= RULE_CLOSED_PARENTHESES ) )
            // InternalGo.g:3319:2: ( ( (lv_nameFunc_0_0= RULE_ID ) ) this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( (lv_param_2_0= ruleParams ) )* this_Closed_parentheses_3= RULE_CLOSED_PARENTHESES )
            {
            // InternalGo.g:3319:2: ( ( (lv_nameFunc_0_0= RULE_ID ) ) this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( (lv_param_2_0= ruleParams ) )* this_Closed_parentheses_3= RULE_CLOSED_PARENTHESES )
            // InternalGo.g:3320:3: ( (lv_nameFunc_0_0= RULE_ID ) ) this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( (lv_param_2_0= ruleParams ) )* this_Closed_parentheses_3= RULE_CLOSED_PARENTHESES
            {
            // InternalGo.g:3320:3: ( (lv_nameFunc_0_0= RULE_ID ) )
            // InternalGo.g:3321:4: (lv_nameFunc_0_0= RULE_ID )
            {
            // InternalGo.g:3321:4: (lv_nameFunc_0_0= RULE_ID )
            // InternalGo.g:3322:5: lv_nameFunc_0_0= RULE_ID
            {
            lv_nameFunc_0_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_nameFunc_0_0, grammarAccess.getCallFuncAccess().getNameFuncIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCallFuncRule());
              					}
              					setWithLastConsumed(
              						current,
              						"nameFunc",
              						lv_nameFunc_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            this_Open_parentheses_1=(Token)match(input,RULE_OPEN_PARENTHESES,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Open_parentheses_1, grammarAccess.getCallFuncAccess().getOpen_parenthesesTerminalRuleCall_1());
              		
            }
            // InternalGo.g:3342:3: ( (lv_param_2_0= ruleParams ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_ID) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalGo.g:3343:4: (lv_param_2_0= ruleParams )
            	    {
            	    // InternalGo.g:3343:4: (lv_param_2_0= ruleParams )
            	    // InternalGo.g:3344:5: lv_param_2_0= ruleParams
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCallFuncAccess().getParamParamsParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_param_2_0=ruleParams();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getCallFuncRule());
            	      					}
            	      					set(
            	      						current,
            	      						"param",
            	      						lv_param_2_0,
            	      						"org.xtext.go.Go.Params");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            this_Closed_parentheses_3=(Token)match(input,RULE_CLOSED_PARENTHESES,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Closed_parentheses_3, grammarAccess.getCallFuncAccess().getClosed_parenthesesTerminalRuleCall_3());
              		
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
    // InternalGo.g:3369:1: entryRuleTypes returns [String current=null] : iv_ruleTypes= ruleTypes EOF ;
    public final String entryRuleTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypes = null;


        try {
            // InternalGo.g:3369:45: (iv_ruleTypes= ruleTypes EOF )
            // InternalGo.g:3370:2: iv_ruleTypes= ruleTypes EOF
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
    // InternalGo.g:3376:1: ruleTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TYPE_0= ruleTYPE | kw= 'string' | kw= 'int' | kw= 'bool' | kw= 'byte' | kw= 'rune' | kw= 'float32' | kw= 'float64' ) ;
    public final AntlrDatatypeRuleToken ruleTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TYPE_0 = null;



        	enterRule();

        try {
            // InternalGo.g:3382:2: ( (this_TYPE_0= ruleTYPE | kw= 'string' | kw= 'int' | kw= 'bool' | kw= 'byte' | kw= 'rune' | kw= 'float32' | kw= 'float64' ) )
            // InternalGo.g:3383:2: (this_TYPE_0= ruleTYPE | kw= 'string' | kw= 'int' | kw= 'bool' | kw= 'byte' | kw= 'rune' | kw= 'float32' | kw= 'float64' )
            {
            // InternalGo.g:3383:2: (this_TYPE_0= ruleTYPE | kw= 'string' | kw= 'int' | kw= 'bool' | kw= 'byte' | kw= 'rune' | kw= 'float32' | kw= 'float64' )
            int alt55=8;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt55=1;
                }
                break;
            case 40:
                {
                alt55=2;
                }
                break;
            case 41:
                {
                alt55=3;
                }
                break;
            case 42:
                {
                alt55=4;
                }
                break;
            case 43:
                {
                alt55=5;
                }
                break;
            case 44:
                {
                alt55=6;
                }
                break;
            case 45:
                {
                alt55=7;
                }
                break;
            case 46:
                {
                alt55=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalGo.g:3384:3: this_TYPE_0= ruleTYPE
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
                    // InternalGo.g:3395:3: kw= 'string'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getStringKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:3401:3: kw= 'int'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getIntKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:3407:3: kw= 'bool'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getBoolKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:3413:3: kw= 'byte'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getByteKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGo.g:3419:3: kw= 'rune'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getRuneKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGo.g:3425:3: kw= 'float32'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getFloat32Keyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalGo.g:3431:3: kw= 'float64'
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
    // InternalGo.g:3440:1: entryRuleModif returns [String current=null] : iv_ruleModif= ruleModif EOF ;
    public final String entryRuleModif() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModif = null;


        try {
            // InternalGo.g:3440:45: (iv_ruleModif= ruleModif EOF )
            // InternalGo.g:3441:2: iv_ruleModif= ruleModif EOF
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
    // InternalGo.g:3447:1: ruleModif returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VAR_0= ruleVAR | this_CONST_1= ruleCONST ) ;
    public final AntlrDatatypeRuleToken ruleModif() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VAR_0 = null;

        AntlrDatatypeRuleToken this_CONST_1 = null;



        	enterRule();

        try {
            // InternalGo.g:3453:2: ( (this_VAR_0= ruleVAR | this_CONST_1= ruleCONST ) )
            // InternalGo.g:3454:2: (this_VAR_0= ruleVAR | this_CONST_1= ruleCONST )
            {
            // InternalGo.g:3454:2: (this_VAR_0= ruleVAR | this_CONST_1= ruleCONST )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==62) ) {
                alt56=1;
            }
            else if ( (LA56_0==52) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalGo.g:3455:3: this_VAR_0= ruleVAR
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
                    // InternalGo.g:3466:3: this_CONST_1= ruleCONST
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


    // $ANTLR start "entryRuleBool"
    // InternalGo.g:3480:1: entryRuleBool returns [EObject current=null] : iv_ruleBool= ruleBool EOF ;
    public final EObject entryRuleBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBool = null;


        try {
            // InternalGo.g:3480:45: (iv_ruleBool= ruleBool EOF )
            // InternalGo.g:3481:2: iv_ruleBool= ruleBool EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBool=ruleBool();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBool; 
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
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // InternalGo.g:3487:1: ruleBool returns [EObject current=null] : ( ( (lv_val_0_0= 'true' ) ) | ( (lv_val_1_0= 'false' ) ) ) ;
    public final EObject ruleBool() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalGo.g:3493:2: ( ( ( (lv_val_0_0= 'true' ) ) | ( (lv_val_1_0= 'false' ) ) ) )
            // InternalGo.g:3494:2: ( ( (lv_val_0_0= 'true' ) ) | ( (lv_val_1_0= 'false' ) ) )
            {
            // InternalGo.g:3494:2: ( ( (lv_val_0_0= 'true' ) ) | ( (lv_val_1_0= 'false' ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==47) ) {
                alt57=1;
            }
            else if ( (LA57_0==48) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalGo.g:3495:3: ( (lv_val_0_0= 'true' ) )
                    {
                    // InternalGo.g:3495:3: ( (lv_val_0_0= 'true' ) )
                    // InternalGo.g:3496:4: (lv_val_0_0= 'true' )
                    {
                    // InternalGo.g:3496:4: (lv_val_0_0= 'true' )
                    // InternalGo.g:3497:5: lv_val_0_0= 'true'
                    {
                    lv_val_0_0=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_val_0_0, grammarAccess.getBoolAccess().getValTrueKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBoolRule());
                      					}
                      					setWithLastConsumed(current, "val", lv_val_0_0, "true");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:3510:3: ( (lv_val_1_0= 'false' ) )
                    {
                    // InternalGo.g:3510:3: ( (lv_val_1_0= 'false' ) )
                    // InternalGo.g:3511:4: (lv_val_1_0= 'false' )
                    {
                    // InternalGo.g:3511:4: (lv_val_1_0= 'false' )
                    // InternalGo.g:3512:5: lv_val_1_0= 'false'
                    {
                    lv_val_1_0=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_val_1_0, grammarAccess.getBoolAccess().getValFalseKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBoolRule());
                      					}
                      					setWithLastConsumed(current, "val", lv_val_1_0, "false");
                      				
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
    // $ANTLR end "ruleBool"


    // $ANTLR start "entryRuleBREAK"
    // InternalGo.g:3528:1: entryRuleBREAK returns [String current=null] : iv_ruleBREAK= ruleBREAK EOF ;
    public final String entryRuleBREAK() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBREAK = null;


        try {
            // InternalGo.g:3528:45: (iv_ruleBREAK= ruleBREAK EOF )
            // InternalGo.g:3529:2: iv_ruleBREAK= ruleBREAK EOF
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
    // InternalGo.g:3535:1: ruleBREAK returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'break' ;
    public final AntlrDatatypeRuleToken ruleBREAK() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3541:2: (kw= 'break' )
            // InternalGo.g:3542:2: kw= 'break'
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
    // InternalGo.g:3550:1: entryRuleCASE returns [String current=null] : iv_ruleCASE= ruleCASE EOF ;
    public final String entryRuleCASE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCASE = null;


        try {
            // InternalGo.g:3550:44: (iv_ruleCASE= ruleCASE EOF )
            // InternalGo.g:3551:2: iv_ruleCASE= ruleCASE EOF
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
    // InternalGo.g:3557:1: ruleCASE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'case' ;
    public final AntlrDatatypeRuleToken ruleCASE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3563:2: (kw= 'case' )
            // InternalGo.g:3564:2: kw= 'case'
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
    // InternalGo.g:3572:1: entryRuleCHAN returns [String current=null] : iv_ruleCHAN= ruleCHAN EOF ;
    public final String entryRuleCHAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCHAN = null;


        try {
            // InternalGo.g:3572:44: (iv_ruleCHAN= ruleCHAN EOF )
            // InternalGo.g:3573:2: iv_ruleCHAN= ruleCHAN EOF
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
    // InternalGo.g:3579:1: ruleCHAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'chan' ;
    public final AntlrDatatypeRuleToken ruleCHAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3585:2: (kw= 'chan' )
            // InternalGo.g:3586:2: kw= 'chan'
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
    // InternalGo.g:3594:1: entryRuleCONST returns [String current=null] : iv_ruleCONST= ruleCONST EOF ;
    public final String entryRuleCONST() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCONST = null;


        try {
            // InternalGo.g:3594:45: (iv_ruleCONST= ruleCONST EOF )
            // InternalGo.g:3595:2: iv_ruleCONST= ruleCONST EOF
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
    // InternalGo.g:3601:1: ruleCONST returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'const' ;
    public final AntlrDatatypeRuleToken ruleCONST() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3607:2: (kw= 'const' )
            // InternalGo.g:3608:2: kw= 'const'
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
    // InternalGo.g:3616:1: entryRuleCONTINUE returns [String current=null] : iv_ruleCONTINUE= ruleCONTINUE EOF ;
    public final String entryRuleCONTINUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCONTINUE = null;


        try {
            // InternalGo.g:3616:48: (iv_ruleCONTINUE= ruleCONTINUE EOF )
            // InternalGo.g:3617:2: iv_ruleCONTINUE= ruleCONTINUE EOF
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
    // InternalGo.g:3623:1: ruleCONTINUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'continue' ;
    public final AntlrDatatypeRuleToken ruleCONTINUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3629:2: (kw= 'continue' )
            // InternalGo.g:3630:2: kw= 'continue'
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
    // InternalGo.g:3638:1: entryRuleELSE returns [String current=null] : iv_ruleELSE= ruleELSE EOF ;
    public final String entryRuleELSE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELSE = null;


        try {
            // InternalGo.g:3638:44: (iv_ruleELSE= ruleELSE EOF )
            // InternalGo.g:3639:2: iv_ruleELSE= ruleELSE EOF
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
    // InternalGo.g:3645:1: ruleELSE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'else' ;
    public final AntlrDatatypeRuleToken ruleELSE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3651:2: (kw= 'else' )
            // InternalGo.g:3652:2: kw= 'else'
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
    // InternalGo.g:3660:1: entryRuleFOR returns [String current=null] : iv_ruleFOR= ruleFOR EOF ;
    public final String entryRuleFOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFOR = null;


        try {
            // InternalGo.g:3660:43: (iv_ruleFOR= ruleFOR EOF )
            // InternalGo.g:3661:2: iv_ruleFOR= ruleFOR EOF
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
    // InternalGo.g:3667:1: ruleFOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'for' ;
    public final AntlrDatatypeRuleToken ruleFOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3673:2: (kw= 'for' )
            // InternalGo.g:3674:2: kw= 'for'
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
    // InternalGo.g:3682:1: entryRuleFUNC returns [String current=null] : iv_ruleFUNC= ruleFUNC EOF ;
    public final String entryRuleFUNC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFUNC = null;


        try {
            // InternalGo.g:3682:44: (iv_ruleFUNC= ruleFUNC EOF )
            // InternalGo.g:3683:2: iv_ruleFUNC= ruleFUNC EOF
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
    // InternalGo.g:3689:1: ruleFUNC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'func' ;
    public final AntlrDatatypeRuleToken ruleFUNC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3695:2: (kw= 'func' )
            // InternalGo.g:3696:2: kw= 'func'
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
    // InternalGo.g:3704:1: entryRuleIF returns [String current=null] : iv_ruleIF= ruleIF EOF ;
    public final String entryRuleIF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIF = null;


        try {
            // InternalGo.g:3704:42: (iv_ruleIF= ruleIF EOF )
            // InternalGo.g:3705:2: iv_ruleIF= ruleIF EOF
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
    // InternalGo.g:3711:1: ruleIF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'if' ;
    public final AntlrDatatypeRuleToken ruleIF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3717:2: (kw= 'if' )
            // InternalGo.g:3718:2: kw= 'if'
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
    // InternalGo.g:3726:1: entryRuleIMPORT returns [String current=null] : iv_ruleIMPORT= ruleIMPORT EOF ;
    public final String entryRuleIMPORT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIMPORT = null;


        try {
            // InternalGo.g:3726:46: (iv_ruleIMPORT= ruleIMPORT EOF )
            // InternalGo.g:3727:2: iv_ruleIMPORT= ruleIMPORT EOF
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
    // InternalGo.g:3733:1: ruleIMPORT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'import' ;
    public final AntlrDatatypeRuleToken ruleIMPORT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3739:2: (kw= 'import' )
            // InternalGo.g:3740:2: kw= 'import'
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
    // InternalGo.g:3748:1: entryRuleRETURN returns [String current=null] : iv_ruleRETURN= ruleRETURN EOF ;
    public final String entryRuleRETURN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRETURN = null;


        try {
            // InternalGo.g:3748:46: (iv_ruleRETURN= ruleRETURN EOF )
            // InternalGo.g:3749:2: iv_ruleRETURN= ruleRETURN EOF
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
    // InternalGo.g:3755:1: ruleRETURN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'return' ;
    public final AntlrDatatypeRuleToken ruleRETURN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3761:2: (kw= 'return' )
            // InternalGo.g:3762:2: kw= 'return'
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
    // InternalGo.g:3770:1: entryRulePACKAGE returns [String current=null] : iv_rulePACKAGE= rulePACKAGE EOF ;
    public final String entryRulePACKAGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePACKAGE = null;


        try {
            // InternalGo.g:3770:47: (iv_rulePACKAGE= rulePACKAGE EOF )
            // InternalGo.g:3771:2: iv_rulePACKAGE= rulePACKAGE EOF
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
    // InternalGo.g:3777:1: rulePACKAGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'package' ;
    public final AntlrDatatypeRuleToken rulePACKAGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3783:2: (kw= 'package' )
            // InternalGo.g:3784:2: kw= 'package'
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
    // InternalGo.g:3792:1: entryRuleTYPE returns [String current=null] : iv_ruleTYPE= ruleTYPE EOF ;
    public final String entryRuleTYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTYPE = null;


        try {
            // InternalGo.g:3792:44: (iv_ruleTYPE= ruleTYPE EOF )
            // InternalGo.g:3793:2: iv_ruleTYPE= ruleTYPE EOF
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
    // InternalGo.g:3799:1: ruleTYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'type' ;
    public final AntlrDatatypeRuleToken ruleTYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3805:2: (kw= 'type' )
            // InternalGo.g:3806:2: kw= 'type'
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
    // InternalGo.g:3814:1: entryRuleVAR returns [String current=null] : iv_ruleVAR= ruleVAR EOF ;
    public final String entryRuleVAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVAR = null;


        try {
            // InternalGo.g:3814:43: (iv_ruleVAR= ruleVAR EOF )
            // InternalGo.g:3815:2: iv_ruleVAR= ruleVAR EOF
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
    // InternalGo.g:3821:1: ruleVAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'var' ;
    public final AntlrDatatypeRuleToken ruleVAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3827:2: (kw= 'var' )
            // InternalGo.g:3828:2: kw= 'var'
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


    // $ANTLR start "entryRuleDEFAULT"
    // InternalGo.g:3836:1: entryRuleDEFAULT returns [String current=null] : iv_ruleDEFAULT= ruleDEFAULT EOF ;
    public final String entryRuleDEFAULT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDEFAULT = null;


        try {
            // InternalGo.g:3836:47: (iv_ruleDEFAULT= ruleDEFAULT EOF )
            // InternalGo.g:3837:2: iv_ruleDEFAULT= ruleDEFAULT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDEFAULTRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDEFAULT=ruleDEFAULT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDEFAULT.getText(); 
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
    // $ANTLR end "entryRuleDEFAULT"


    // $ANTLR start "ruleDEFAULT"
    // InternalGo.g:3843:1: ruleDEFAULT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'default' ;
    public final AntlrDatatypeRuleToken ruleDEFAULT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3849:2: (kw= 'default' )
            // InternalGo.g:3850:2: kw= 'default'
            {
            kw=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getDEFAULTAccess().getDefaultKeyword());
              	
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
    // $ANTLR end "ruleDEFAULT"


    // $ANTLR start "entryRuleSWITCH"
    // InternalGo.g:3858:1: entryRuleSWITCH returns [String current=null] : iv_ruleSWITCH= ruleSWITCH EOF ;
    public final String entryRuleSWITCH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSWITCH = null;


        try {
            // InternalGo.g:3858:46: (iv_ruleSWITCH= ruleSWITCH EOF )
            // InternalGo.g:3859:2: iv_ruleSWITCH= ruleSWITCH EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSWITCHRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSWITCH=ruleSWITCH();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSWITCH.getText(); 
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
    // $ANTLR end "entryRuleSWITCH"


    // $ANTLR start "ruleSWITCH"
    // InternalGo.g:3865:1: ruleSWITCH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'switch' ;
    public final AntlrDatatypeRuleToken ruleSWITCH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3871:2: (kw= 'switch' )
            // InternalGo.g:3872:2: kw= 'switch'
            {
            kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getSWITCHAccess().getSwitchKeyword());
              	
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
    // $ANTLR end "ruleSWITCH"


    // $ANTLR start "entryRuleRANGE"
    // InternalGo.g:3880:1: entryRuleRANGE returns [String current=null] : iv_ruleRANGE= ruleRANGE EOF ;
    public final String entryRuleRANGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRANGE = null;


        try {
            // InternalGo.g:3880:45: (iv_ruleRANGE= ruleRANGE EOF )
            // InternalGo.g:3881:2: iv_ruleRANGE= ruleRANGE EOF
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
    // InternalGo.g:3887:1: ruleRANGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'range' ;
    public final AntlrDatatypeRuleToken ruleRANGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3893:2: (kw= 'range' )
            // InternalGo.g:3894:2: kw= 'range'
            {
            kw=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
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
    // InternalGo.g:3902:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalGo.g:3902:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalGo.g:3903:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalGo.g:3909:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGo.g:3915:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGo.g:3916:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGo.g:3916:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGo.g:3917:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
              		
            }
            // InternalGo.g:3921:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGo.g:3922:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGo.g:3922:4: (lv_name_1_0= RULE_ID )
            // InternalGo.g:3923:5: lv_name_1_0= RULE_ID
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
        // InternalGo.g:1928:4: ( ruleELSE )
        // InternalGo.g:1928:5: ruleELSE
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
        // InternalGo.g:1948:4: ( ruleELSE )
        // InternalGo.g:1948:5: ruleELSE
        {
        pushFollow(FOLLOW_2);
        ruleELSE();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalGo

    // $ANTLR start synpred8_InternalGo
    public final void synpred8_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:2191:5: ( ruleAndExpression )
        // InternalGo.g:2191:6: ruleAndExpression
        {
        pushFollow(FOLLOW_2);
        ruleAndExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalGo

    // $ANTLR start synpred13_InternalGo
    public final void synpred13_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:2547:4: ( rulePrimaryExpression )
        // InternalGo.g:2547:5: rulePrimaryExpression
        {
        pushFollow(FOLLOW_2);
        rulePrimaryExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalGo

    // $ANTLR start synpred14_InternalGo
    public final void synpred14_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:2559:4: ( rulePrimaryExpression )
        // InternalGo.g:2559:5: rulePrimaryExpression
        {
        pushFollow(FOLLOW_2);
        rulePrimaryExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalGo

    // $ANTLR start synpred20_InternalGo
    public final void synpred20_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:2922:4: ( rulePrimaryExpression )
        // InternalGo.g:2922:5: rulePrimaryExpression
        {
        pushFollow(FOLLOW_2);
        rulePrimaryExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_InternalGo

    // Delegated rules

    public final boolean synpred8_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred13_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalGo_fragment(); // can never throw exception
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
    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\3\uffff\1\16\13\uffff";
    static final String dfa_3s = "\1\4\2\5\1\4\13\uffff";
    static final String dfa_4s = "\1\102\2\10\1\102\13\uffff";
    static final String dfa_5s = "\4\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\12\1\1\1\2\1\11\1\13";
    static final String dfa_6s = "\17\uffff}>";
    static final String[] dfa_7s = {
            "\1\6\1\3\56\uffff\1\2\2\uffff\1\12\1\5\1\7\1\11\3\uffff\1\1\1\uffff\1\10\1\uffff\1\4",
            "\1\14\2\uffff\1\13",
            "\1\14\2\uffff\1\13",
            "\2\16\1\uffff\1\14\1\15\3\uffff\1\16\45\uffff\1\16\1\uffff\1\16\2\uffff\5\16\2\uffff\3\16\1\uffff\1\16",
            "",
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
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "114:2: (this_MultDecVars_0= ruleMultDecVars | this_DecVar_1= ruleDecVar | this_DataType_2= ruleDataType | this_DecFunc_3= ruleDecFunc | this_EOL_4= RULE_EOL | this_Condition_5= ruleCondition | this_SwitchCase_6= ruleSwitchCase | ruleDecImport | this_CallFunc_8= ruleCallFunc | this_CallFor_9= ruleCallFor | this_Variable_10= ruleVariable )";
        }
    }
    static final String dfa_8s = "\20\uffff";
    static final String dfa_9s = "\6\uffff\10\16\2\uffff";
    static final String dfa_10s = "\3\5\1\uffff\1\6\1\uffff\10\4\2\uffff";
    static final String dfa_11s = "\1\76\2\5\1\uffff\1\75\1\uffff\10\102\2\uffff";
    static final String dfa_12s = "\3\uffff\1\4\1\uffff\1\3\10\uffff\1\1\1\2";
    static final String dfa_13s = "\20\uffff}>";
    static final String[] dfa_14s = {
            "\1\3\56\uffff\1\2\11\uffff\1\1",
            "\1\4",
            "\1\4",
            "",
            "\1\5\41\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\16\uffff\1\6",
            "",
            "\2\16\1\uffff\1\17\4\uffff\1\16\45\uffff\1\16\1\uffff\1\16\2\uffff\5\16\2\uffff\3\16\1\uffff\1\16",
            "\2\16\1\uffff\1\17\4\uffff\1\16\45\uffff\1\16\1\uffff\1\16\2\uffff\5\16\2\uffff\3\16\1\uffff\1\16",
            "\2\16\1\uffff\1\17\4\uffff\1\16\45\uffff\1\16\1\uffff\1\16\2\uffff\5\16\2\uffff\3\16\1\uffff\1\16",
            "\2\16\1\uffff\1\17\4\uffff\1\16\45\uffff\1\16\1\uffff\1\16\2\uffff\5\16\2\uffff\3\16\1\uffff\1\16",
            "\2\16\1\uffff\1\17\4\uffff\1\16\45\uffff\1\16\1\uffff\1\16\2\uffff\5\16\2\uffff\3\16\1\uffff\1\16",
            "\2\16\1\uffff\1\17\4\uffff\1\16\45\uffff\1\16\1\uffff\1\16\2\uffff\5\16\2\uffff\3\16\1\uffff\1\16",
            "\2\16\1\uffff\1\17\4\uffff\1\16\45\uffff\1\16\1\uffff\1\16\2\uffff\5\16\2\uffff\3\16\1\uffff\1\16",
            "\2\16\1\uffff\1\17\4\uffff\1\16\45\uffff\1\16\1\uffff\1\16\2\uffff\5\16\2\uffff\3\16\1\uffff\1\16",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "289:2: ( ( (lv_declaration_0_0= ruleDecl ) ) | ( (lv_atribuicao_1_0= ruleAtrib ) ) | ( (lv_assignment_2_0= ruleAtribVar ) ) | ( (lv_reassignment_3_0= ruleReAtrib ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x4790000000000032L,0x0000000000000005L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x20007F0000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x20007F0000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x4791800000016130L,0x0000000000000005L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x4791800000016132L,0x0000000000000005L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0001800000016120L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x8004000000001000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x4790000000001030L,0x0000000000000005L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x4790000000000030L,0x0000000000000005L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0001800000016100L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x20007F0000000042L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000010100L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000010200L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000004120L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000004100L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x4011800000016500L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x000000F800000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x000000F800000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x20007F0000000400L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x4F90000000000030L,0x0000000000000005L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x4F90000000000032L,0x0000000000000005L});

}