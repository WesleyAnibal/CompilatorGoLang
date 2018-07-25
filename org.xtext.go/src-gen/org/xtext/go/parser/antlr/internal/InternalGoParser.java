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
    // InternalGo.g:282:1: ruleDecVar returns [EObject current=null] : ( ( (lv_declaration_0_0= ruleDecl ) ) | ( (lv_assignment_1_0= ruleAtribVar ) ) | ( (lv_atribuicao_2_0= ruleAtrib ) ) | ( (lv_reassignment_3_0= ruleReAtrib ) ) ) ;
    public final EObject ruleDecVar() throws RecognitionException {
        EObject current = null;

        EObject lv_declaration_0_0 = null;

        EObject lv_assignment_1_0 = null;

        EObject lv_atribuicao_2_0 = null;

        EObject lv_reassignment_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:288:2: ( ( ( (lv_declaration_0_0= ruleDecl ) ) | ( (lv_assignment_1_0= ruleAtribVar ) ) | ( (lv_atribuicao_2_0= ruleAtrib ) ) | ( (lv_reassignment_3_0= ruleReAtrib ) ) ) )
            // InternalGo.g:289:2: ( ( (lv_declaration_0_0= ruleDecl ) ) | ( (lv_assignment_1_0= ruleAtribVar ) ) | ( (lv_atribuicao_2_0= ruleAtrib ) ) | ( (lv_reassignment_3_0= ruleReAtrib ) ) )
            {
            // InternalGo.g:289:2: ( ( (lv_declaration_0_0= ruleDecl ) ) | ( (lv_assignment_1_0= ruleAtribVar ) ) | ( (lv_atribuicao_2_0= ruleAtrib ) ) | ( (lv_reassignment_3_0= ruleReAtrib ) ) )
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
                    // InternalGo.g:310:3: ( (lv_assignment_1_0= ruleAtribVar ) )
                    {
                    // InternalGo.g:310:3: ( (lv_assignment_1_0= ruleAtribVar ) )
                    // InternalGo.g:311:4: (lv_assignment_1_0= ruleAtribVar )
                    {
                    // InternalGo.g:311:4: (lv_assignment_1_0= ruleAtribVar )
                    // InternalGo.g:312:5: lv_assignment_1_0= ruleAtribVar
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDecVarAccess().getAssignmentAtribVarParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_assignment_1_0=ruleAtribVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDecVarRule());
                      					}
                      					set(
                      						current,
                      						"assignment",
                      						lv_assignment_1_0,
                      						"org.xtext.go.Go.AtribVar");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:330:3: ( (lv_atribuicao_2_0= ruleAtrib ) )
                    {
                    // InternalGo.g:330:3: ( (lv_atribuicao_2_0= ruleAtrib ) )
                    // InternalGo.g:331:4: (lv_atribuicao_2_0= ruleAtrib )
                    {
                    // InternalGo.g:331:4: (lv_atribuicao_2_0= ruleAtrib )
                    // InternalGo.g:332:5: lv_atribuicao_2_0= ruleAtrib
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDecVarAccess().getAtribuicaoAtribParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_atribuicao_2_0=ruleAtrib();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDecVarRule());
                      					}
                      					set(
                      						current,
                      						"atribuicao",
                      						lv_atribuicao_2_0,
                      						"org.xtext.go.Go.Atrib");
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

                        if ( (LA5_0==RULE_ID||(LA5_0>=RULE_OPEN_BRACKETS && LA5_0<=RULE_INT)||LA5_0==RULE_STRING||(LA5_0>=47 && LA5_0<=48)) ) {
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
    // InternalGo.g:517:1: ruleAtrib_Aux returns [EObject current=null] : (this_Atri_0= ruleAtri | this_Variable_1= ruleVariable | this_CallFunc_2= ruleCallFunc ) ;
    public final EObject ruleAtrib_Aux() throws RecognitionException {
        EObject current = null;

        EObject this_Atri_0 = null;

        EObject this_Variable_1 = null;

        EObject this_CallFunc_2 = null;



        	enterRule();

        try {
            // InternalGo.g:523:2: ( (this_Atri_0= ruleAtri | this_Variable_1= ruleVariable | this_CallFunc_2= ruleCallFunc ) )
            // InternalGo.g:524:2: (this_Atri_0= ruleAtri | this_Variable_1= ruleVariable | this_CallFunc_2= ruleCallFunc )
            {
            // InternalGo.g:524:2: (this_Atri_0= ruleAtri | this_Variable_1= ruleVariable | this_CallFunc_2= ruleCallFunc )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_OPEN_BRACKETS && LA7_0<=RULE_INT)||LA7_0==RULE_STRING||(LA7_0>=47 && LA7_0<=48)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==RULE_OPEN_PARENTHESES) ) {
                    alt7=3;
                }
                else if ( (LA7_2==EOF||(LA7_2>=RULE_EOL && LA7_2<=RULE_COMMA)||(LA7_2>=RULE_CLOSED_KEY && LA7_2<=RULE_INT)||LA7_2==RULE_STRING||LA7_2==RULE_PONTOVIRGULA||(LA7_2>=47 && LA7_2<=48)||LA7_2==50||LA7_2==52||(LA7_2>=55 && LA7_2<=58)||(LA7_2>=62 && LA7_2<=64)||LA7_2==66) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGo.g:525:3: this_Atri_0= ruleAtri
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtrib_AuxAccess().getAtriParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Atri_0=ruleAtri();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Atri_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:534:3: this_Variable_1= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtrib_AuxAccess().getVariableParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Variable_1=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Variable_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:543:3: this_CallFunc_2= ruleCallFunc
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtrib_AuxAccess().getCallFuncParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CallFunc_2=ruleCallFunc();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CallFunc_2;
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
    // InternalGo.g:555:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalGo.g:555:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalGo.g:556:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalGo.g:562:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalGo.g:568:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalGo.g:569:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalGo.g:569:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalGo.g:570:3: (lv_name_0_0= RULE_ID )
            {
            // InternalGo.g:570:3: (lv_name_0_0= RULE_ID )
            // InternalGo.g:571:4: lv_name_0_0= RULE_ID
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
    // InternalGo.g:590:1: entryRuleAtrib returns [EObject current=null] : iv_ruleAtrib= ruleAtrib EOF ;
    public final EObject entryRuleAtrib() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtrib = null;


        try {
            // InternalGo.g:590:46: (iv_ruleAtrib= ruleAtrib EOF )
            // InternalGo.g:591:2: iv_ruleAtrib= ruleAtrib EOF
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
    // InternalGo.g:597:1: ruleAtrib returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleModif ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) ) this_equals_3= RULE_EQUALS ( (lv_atrib_4_0= ruleAtrib_Aux ) ) ) ;
    public final EObject ruleAtrib() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token this_equals_3=null;
        AntlrDatatypeRuleToken lv_modifier_0_0 = null;

        AntlrDatatypeRuleToken lv_type_2_0 = null;

        EObject lv_atrib_4_0 = null;



        	enterRule();

        try {
            // InternalGo.g:603:2: ( ( ( (lv_modifier_0_0= ruleModif ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) ) this_equals_3= RULE_EQUALS ( (lv_atrib_4_0= ruleAtrib_Aux ) ) ) )
            // InternalGo.g:604:2: ( ( (lv_modifier_0_0= ruleModif ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) ) this_equals_3= RULE_EQUALS ( (lv_atrib_4_0= ruleAtrib_Aux ) ) )
            {
            // InternalGo.g:604:2: ( ( (lv_modifier_0_0= ruleModif ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) ) this_equals_3= RULE_EQUALS ( (lv_atrib_4_0= ruleAtrib_Aux ) ) )
            // InternalGo.g:605:3: ( (lv_modifier_0_0= ruleModif ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) ) this_equals_3= RULE_EQUALS ( (lv_atrib_4_0= ruleAtrib_Aux ) )
            {
            // InternalGo.g:605:3: ( (lv_modifier_0_0= ruleModif ) )
            // InternalGo.g:606:4: (lv_modifier_0_0= ruleModif )
            {
            // InternalGo.g:606:4: (lv_modifier_0_0= ruleModif )
            // InternalGo.g:607:5: lv_modifier_0_0= ruleModif
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

            // InternalGo.g:624:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGo.g:625:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGo.g:625:4: (lv_name_1_0= RULE_ID )
            // InternalGo.g:626:5: lv_name_1_0= RULE_ID
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

            // InternalGo.g:642:3: ( (lv_type_2_0= ruleTypes ) )
            // InternalGo.g:643:4: (lv_type_2_0= ruleTypes )
            {
            // InternalGo.g:643:4: (lv_type_2_0= ruleTypes )
            // InternalGo.g:644:5: lv_type_2_0= ruleTypes
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
            // InternalGo.g:665:3: ( (lv_atrib_4_0= ruleAtrib_Aux ) )
            // InternalGo.g:666:4: (lv_atrib_4_0= ruleAtrib_Aux )
            {
            // InternalGo.g:666:4: (lv_atrib_4_0= ruleAtrib_Aux )
            // InternalGo.g:667:5: lv_atrib_4_0= ruleAtrib_Aux
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
    // InternalGo.g:688:1: entryRuleReAtrib returns [EObject current=null] : iv_ruleReAtrib= ruleReAtrib EOF ;
    public final EObject entryRuleReAtrib() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReAtrib = null;


        try {
            // InternalGo.g:688:48: (iv_ruleReAtrib= ruleReAtrib EOF )
            // InternalGo.g:689:2: iv_ruleReAtrib= ruleReAtrib EOF
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
    // InternalGo.g:695:1: ruleReAtrib returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) this_equals_1= RULE_EQUALS ( (lv_atrib_2_0= ruleAtrib_Aux ) ) ) ;
    public final EObject ruleReAtrib() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_equals_1=null;
        EObject lv_atrib_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:701:2: ( ( ( (lv_name_0_0= RULE_ID ) ) this_equals_1= RULE_EQUALS ( (lv_atrib_2_0= ruleAtrib_Aux ) ) ) )
            // InternalGo.g:702:2: ( ( (lv_name_0_0= RULE_ID ) ) this_equals_1= RULE_EQUALS ( (lv_atrib_2_0= ruleAtrib_Aux ) ) )
            {
            // InternalGo.g:702:2: ( ( (lv_name_0_0= RULE_ID ) ) this_equals_1= RULE_EQUALS ( (lv_atrib_2_0= ruleAtrib_Aux ) ) )
            // InternalGo.g:703:3: ( (lv_name_0_0= RULE_ID ) ) this_equals_1= RULE_EQUALS ( (lv_atrib_2_0= ruleAtrib_Aux ) )
            {
            // InternalGo.g:703:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGo.g:704:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGo.g:704:4: (lv_name_0_0= RULE_ID )
            // InternalGo.g:705:5: lv_name_0_0= RULE_ID
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
            // InternalGo.g:725:3: ( (lv_atrib_2_0= ruleAtrib_Aux ) )
            // InternalGo.g:726:4: (lv_atrib_2_0= ruleAtrib_Aux )
            {
            // InternalGo.g:726:4: (lv_atrib_2_0= ruleAtrib_Aux )
            // InternalGo.g:727:5: lv_atrib_2_0= ruleAtrib_Aux
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
    // InternalGo.g:748:1: entryRuleMultDecVars returns [EObject current=null] : iv_ruleMultDecVars= ruleMultDecVars EOF ;
    public final EObject entryRuleMultDecVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultDecVars = null;


        try {
            // InternalGo.g:748:52: (iv_ruleMultDecVars= ruleMultDecVars EOF )
            // InternalGo.g:749:2: iv_ruleMultDecVars= ruleMultDecVars EOF
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
    // InternalGo.g:755:1: ruleMultDecVars returns [EObject current=null] : ( ruleModif this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( ( (lv_name_2_0= RULE_ID ) ) this_equals_3= RULE_EQUALS ( ( (lv_typw_4_0= ruleTypeValue ) ) | ( (lv_value_5_0= RULE_ID ) ) ) )* this_Closed_parentheses_6= RULE_CLOSED_PARENTHESES ) ;
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
            // InternalGo.g:761:2: ( ( ruleModif this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( ( (lv_name_2_0= RULE_ID ) ) this_equals_3= RULE_EQUALS ( ( (lv_typw_4_0= ruleTypeValue ) ) | ( (lv_value_5_0= RULE_ID ) ) ) )* this_Closed_parentheses_6= RULE_CLOSED_PARENTHESES ) )
            // InternalGo.g:762:2: ( ruleModif this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( ( (lv_name_2_0= RULE_ID ) ) this_equals_3= RULE_EQUALS ( ( (lv_typw_4_0= ruleTypeValue ) ) | ( (lv_value_5_0= RULE_ID ) ) ) )* this_Closed_parentheses_6= RULE_CLOSED_PARENTHESES )
            {
            // InternalGo.g:762:2: ( ruleModif this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( ( (lv_name_2_0= RULE_ID ) ) this_equals_3= RULE_EQUALS ( ( (lv_typw_4_0= ruleTypeValue ) ) | ( (lv_value_5_0= RULE_ID ) ) ) )* this_Closed_parentheses_6= RULE_CLOSED_PARENTHESES )
            // InternalGo.g:763:3: ruleModif this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( ( (lv_name_2_0= RULE_ID ) ) this_equals_3= RULE_EQUALS ( ( (lv_typw_4_0= ruleTypeValue ) ) | ( (lv_value_5_0= RULE_ID ) ) ) )* this_Closed_parentheses_6= RULE_CLOSED_PARENTHESES
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
            // InternalGo.g:774:3: ( ( (lv_name_2_0= RULE_ID ) ) this_equals_3= RULE_EQUALS ( ( (lv_typw_4_0= ruleTypeValue ) ) | ( (lv_value_5_0= RULE_ID ) ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGo.g:775:4: ( (lv_name_2_0= RULE_ID ) ) this_equals_3= RULE_EQUALS ( ( (lv_typw_4_0= ruleTypeValue ) ) | ( (lv_value_5_0= RULE_ID ) ) )
            	    {
            	    // InternalGo.g:775:4: ( (lv_name_2_0= RULE_ID ) )
            	    // InternalGo.g:776:5: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalGo.g:776:5: (lv_name_2_0= RULE_ID )
            	    // InternalGo.g:777:6: lv_name_2_0= RULE_ID
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
            	    // InternalGo.g:797:4: ( ( (lv_typw_4_0= ruleTypeValue ) ) | ( (lv_value_5_0= RULE_ID ) ) )
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
            	            // InternalGo.g:798:5: ( (lv_typw_4_0= ruleTypeValue ) )
            	            {
            	            // InternalGo.g:798:5: ( (lv_typw_4_0= ruleTypeValue ) )
            	            // InternalGo.g:799:6: (lv_typw_4_0= ruleTypeValue )
            	            {
            	            // InternalGo.g:799:6: (lv_typw_4_0= ruleTypeValue )
            	            // InternalGo.g:800:7: lv_typw_4_0= ruleTypeValue
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
            	            // InternalGo.g:818:5: ( (lv_value_5_0= RULE_ID ) )
            	            {
            	            // InternalGo.g:818:5: ( (lv_value_5_0= RULE_ID ) )
            	            // InternalGo.g:819:6: (lv_value_5_0= RULE_ID )
            	            {
            	            // InternalGo.g:819:6: (lv_value_5_0= RULE_ID )
            	            // InternalGo.g:820:7: lv_value_5_0= RULE_ID
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
    // InternalGo.g:846:1: entryRuleSwitchCase returns [EObject current=null] : iv_ruleSwitchCase= ruleSwitchCase EOF ;
    public final EObject entryRuleSwitchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchCase = null;


        try {
            // InternalGo.g:846:51: (iv_ruleSwitchCase= ruleSwitchCase EOF )
            // InternalGo.g:847:2: iv_ruleSwitchCase= ruleSwitchCase EOF
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
    // InternalGo.g:853:1: ruleSwitchCase returns [EObject current=null] : ( ruleSWITCH ( (lv_name_1_0= RULE_ID ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_cas_3_0= ruleCases ) )* ( ruleDEFAULT this_DoisPontos_5= RULE_DOISPONTOS ( (lv_k_6_0= ruleGreeting ) )* )? this_Closed_Key_7= RULE_CLOSED_KEY ) ;
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
            // InternalGo.g:859:2: ( ( ruleSWITCH ( (lv_name_1_0= RULE_ID ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_cas_3_0= ruleCases ) )* ( ruleDEFAULT this_DoisPontos_5= RULE_DOISPONTOS ( (lv_k_6_0= ruleGreeting ) )* )? this_Closed_Key_7= RULE_CLOSED_KEY ) )
            // InternalGo.g:860:2: ( ruleSWITCH ( (lv_name_1_0= RULE_ID ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_cas_3_0= ruleCases ) )* ( ruleDEFAULT this_DoisPontos_5= RULE_DOISPONTOS ( (lv_k_6_0= ruleGreeting ) )* )? this_Closed_Key_7= RULE_CLOSED_KEY )
            {
            // InternalGo.g:860:2: ( ruleSWITCH ( (lv_name_1_0= RULE_ID ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_cas_3_0= ruleCases ) )* ( ruleDEFAULT this_DoisPontos_5= RULE_DOISPONTOS ( (lv_k_6_0= ruleGreeting ) )* )? this_Closed_Key_7= RULE_CLOSED_KEY )
            // InternalGo.g:861:3: ruleSWITCH ( (lv_name_1_0= RULE_ID ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_cas_3_0= ruleCases ) )* ( ruleDEFAULT this_DoisPontos_5= RULE_DOISPONTOS ( (lv_k_6_0= ruleGreeting ) )* )? this_Closed_Key_7= RULE_CLOSED_KEY
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
            // InternalGo.g:868:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGo.g:869:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGo.g:869:4: (lv_name_1_0= RULE_ID )
            // InternalGo.g:870:5: lv_name_1_0= RULE_ID
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
            // InternalGo.g:890:3: ( (lv_cas_3_0= ruleCases ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==50) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGo.g:891:4: (lv_cas_3_0= ruleCases )
            	    {
            	    // InternalGo.g:891:4: (lv_cas_3_0= ruleCases )
            	    // InternalGo.g:892:5: lv_cas_3_0= ruleCases
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

            // InternalGo.g:909:3: ( ruleDEFAULT this_DoisPontos_5= RULE_DOISPONTOS ( (lv_k_6_0= ruleGreeting ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==63) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGo.g:910:4: ruleDEFAULT this_DoisPontos_5= RULE_DOISPONTOS ( (lv_k_6_0= ruleGreeting ) )*
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
                    // InternalGo.g:921:4: ( (lv_k_6_0= ruleGreeting ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>=RULE_EOL && LA11_0<=RULE_ID)||LA11_0==52||(LA11_0>=55 && LA11_0<=58)||LA11_0==62||LA11_0==64||LA11_0==66) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalGo.g:922:5: (lv_k_6_0= ruleGreeting )
                    	    {
                    	    // InternalGo.g:922:5: (lv_k_6_0= ruleGreeting )
                    	    // InternalGo.g:923:6: lv_k_6_0= ruleGreeting
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
    // InternalGo.g:949:1: entryRuleCases returns [EObject current=null] : iv_ruleCases= ruleCases EOF ;
    public final EObject entryRuleCases() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCases = null;


        try {
            // InternalGo.g:949:46: (iv_ruleCases= ruleCases EOF )
            // InternalGo.g:950:2: iv_ruleCases= ruleCases EOF
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
    // InternalGo.g:956:1: ruleCases returns [EObject current=null] : ( ruleCASE ( (lv_x_1_0= ruleExpression ) ) this_DoisPontos_2= RULE_DOISPONTOS ( (lv_v_3_0= ruleGreeting ) )* ) ;
    public final EObject ruleCases() throws RecognitionException {
        EObject current = null;

        Token this_DoisPontos_2=null;
        EObject lv_x_1_0 = null;

        EObject lv_v_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:962:2: ( ( ruleCASE ( (lv_x_1_0= ruleExpression ) ) this_DoisPontos_2= RULE_DOISPONTOS ( (lv_v_3_0= ruleGreeting ) )* ) )
            // InternalGo.g:963:2: ( ruleCASE ( (lv_x_1_0= ruleExpression ) ) this_DoisPontos_2= RULE_DOISPONTOS ( (lv_v_3_0= ruleGreeting ) )* )
            {
            // InternalGo.g:963:2: ( ruleCASE ( (lv_x_1_0= ruleExpression ) ) this_DoisPontos_2= RULE_DOISPONTOS ( (lv_v_3_0= ruleGreeting ) )* )
            // InternalGo.g:964:3: ruleCASE ( (lv_x_1_0= ruleExpression ) ) this_DoisPontos_2= RULE_DOISPONTOS ( (lv_v_3_0= ruleGreeting ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCasesAccess().getCASEParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_19);
            ruleCASE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:971:3: ( (lv_x_1_0= ruleExpression ) )
            // InternalGo.g:972:4: (lv_x_1_0= ruleExpression )
            {
            // InternalGo.g:972:4: (lv_x_1_0= ruleExpression )
            // InternalGo.g:973:5: lv_x_1_0= ruleExpression
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

            this_DoisPontos_2=(Token)match(input,RULE_DOISPONTOS,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DoisPontos_2, grammarAccess.getCasesAccess().getDoisPontosTerminalRuleCall_2());
              		
            }
            // InternalGo.g:994:3: ( (lv_v_3_0= ruleGreeting ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_EOL && LA13_0<=RULE_ID)||LA13_0==52||(LA13_0>=55 && LA13_0<=58)||LA13_0==62||LA13_0==64||LA13_0==66) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGo.g:995:4: (lv_v_3_0= ruleGreeting )
            	    {
            	    // InternalGo.g:995:4: (lv_v_3_0= ruleGreeting )
            	    // InternalGo.g:996:5: lv_v_3_0= ruleGreeting
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
    // InternalGo.g:1017:1: entryRuleAtri returns [EObject current=null] : iv_ruleAtri= ruleAtri EOF ;
    public final EObject entryRuleAtri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtri = null;


        try {
            // InternalGo.g:1017:45: (iv_ruleAtri= ruleAtri EOF )
            // InternalGo.g:1018:2: iv_ruleAtri= ruleAtri EOF
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
    // InternalGo.g:1024:1: ruleAtri returns [EObject current=null] : ( (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? ) | this_TypeValue_7= ruleTypeValue ) ;
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
            // InternalGo.g:1030:2: ( ( (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? ) | this_TypeValue_7= ruleTypeValue ) )
            // InternalGo.g:1031:2: ( (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? ) | this_TypeValue_7= ruleTypeValue )
            {
            // InternalGo.g:1031:2: ( (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? ) | this_TypeValue_7= ruleTypeValue )
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
                    // InternalGo.g:1032:3: (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? )
                    {
                    // InternalGo.g:1032:3: (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? )
                    // InternalGo.g:1033:4: this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )?
                    {
                    this_Open_brackets_0=(Token)match(input,RULE_OPEN_BRACKETS,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Open_brackets_0, grammarAccess.getAtriAccess().getOpen_bracketsTerminalRuleCall_0_0());
                      			
                    }
                    // InternalGo.g:1037:4: (this_INT_1= RULE_INT )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_INT) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalGo.g:1038:5: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_22); if (state.failed) return current;
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
                    pushFollow(FOLLOW_23);
                    ruleTypes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:1054:4: (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_OPEN_KEY) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalGo.g:1055:5: this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY
                            {
                            this_Open_Key_4=(Token)match(input,RULE_OPEN_KEY,FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_Open_Key_4, grammarAccess.getAtriAccess().getOpen_KeyTerminalRuleCall_0_4_0());
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getAtriAccess().getTypeValueParserRuleCall_0_4_1());
                              				
                            }
                            pushFollow(FOLLOW_25);
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
                    // InternalGo.g:1074:3: this_TypeValue_7= ruleTypeValue
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
    // InternalGo.g:1086:1: entryRuleParams returns [EObject current=null] : iv_ruleParams= ruleParams EOF ;
    public final EObject entryRuleParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParams = null;


        try {
            // InternalGo.g:1086:47: (iv_ruleParams= ruleParams EOF )
            // InternalGo.g:1087:2: iv_ruleParams= ruleParams EOF
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
    // InternalGo.g:1093:1: ruleParams returns [EObject current=null] : ( ( (lv_params_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypes ) )? (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ( (lv_type_4_0= ruleTypes ) )? )* ) ;
    public final EObject ruleParams() throws RecognitionException {
        EObject current = null;

        Token lv_params_0_0=null;
        Token this_Comma_2=null;
        Token lv_params_3_0=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1099:2: ( ( ( (lv_params_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypes ) )? (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ( (lv_type_4_0= ruleTypes ) )? )* ) )
            // InternalGo.g:1100:2: ( ( (lv_params_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypes ) )? (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ( (lv_type_4_0= ruleTypes ) )? )* )
            {
            // InternalGo.g:1100:2: ( ( (lv_params_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypes ) )? (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ( (lv_type_4_0= ruleTypes ) )? )* )
            // InternalGo.g:1101:3: ( (lv_params_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypes ) )? (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ( (lv_type_4_0= ruleTypes ) )? )*
            {
            // InternalGo.g:1101:3: ( (lv_params_0_0= RULE_ID ) )
            // InternalGo.g:1102:4: (lv_params_0_0= RULE_ID )
            {
            // InternalGo.g:1102:4: (lv_params_0_0= RULE_ID )
            // InternalGo.g:1103:5: lv_params_0_0= RULE_ID
            {
            lv_params_0_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
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

            // InternalGo.g:1119:3: ( (lv_type_1_0= ruleTypes ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=40 && LA17_0<=46)||LA17_0==61) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGo.g:1120:4: (lv_type_1_0= ruleTypes )
                    {
                    // InternalGo.g:1120:4: (lv_type_1_0= ruleTypes )
                    // InternalGo.g:1121:5: lv_type_1_0= ruleTypes
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getParamsAccess().getTypeTypesParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_27);
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

            // InternalGo.g:1138:3: (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ( (lv_type_4_0= ruleTypes ) )? )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_COMMA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGo.g:1139:4: this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ( (lv_type_4_0= ruleTypes ) )?
            	    {
            	    this_Comma_2=(Token)match(input,RULE_COMMA,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_Comma_2, grammarAccess.getParamsAccess().getCommaTerminalRuleCall_2_0());
            	      			
            	    }
            	    // InternalGo.g:1143:4: ( (lv_params_3_0= RULE_ID ) )
            	    // InternalGo.g:1144:5: (lv_params_3_0= RULE_ID )
            	    {
            	    // InternalGo.g:1144:5: (lv_params_3_0= RULE_ID )
            	    // InternalGo.g:1145:6: lv_params_3_0= RULE_ID
            	    {
            	    lv_params_3_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
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

            	    // InternalGo.g:1161:4: ( (lv_type_4_0= ruleTypes ) )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( ((LA18_0>=40 && LA18_0<=46)||LA18_0==61) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalGo.g:1162:5: (lv_type_4_0= ruleTypes )
            	            {
            	            // InternalGo.g:1162:5: (lv_type_4_0= ruleTypes )
            	            // InternalGo.g:1163:6: lv_type_4_0= ruleTypes
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getParamsAccess().getTypeTypesParserRuleCall_2_2_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_27);
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
    // InternalGo.g:1185:1: entryRuleTypeValue returns [EObject current=null] : iv_ruleTypeValue= ruleTypeValue EOF ;
    public final EObject entryRuleTypeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeValue = null;


        try {
            // InternalGo.g:1185:50: (iv_ruleTypeValue= ruleTypeValue EOF )
            // InternalGo.g:1186:2: iv_ruleTypeValue= ruleTypeValue EOF
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
    // InternalGo.g:1192:1: ruleTypeValue returns [EObject current=null] : (this_Str_0= ruleStr | this_Numbers_1= ruleNumbers | this_Boolean_2= ruleBoolean ) ;
    public final EObject ruleTypeValue() throws RecognitionException {
        EObject current = null;

        EObject this_Str_0 = null;

        EObject this_Numbers_1 = null;

        EObject this_Boolean_2 = null;



        	enterRule();

        try {
            // InternalGo.g:1198:2: ( (this_Str_0= ruleStr | this_Numbers_1= ruleNumbers | this_Boolean_2= ruleBoolean ) )
            // InternalGo.g:1199:2: (this_Str_0= ruleStr | this_Numbers_1= ruleNumbers | this_Boolean_2= ruleBoolean )
            {
            // InternalGo.g:1199:2: (this_Str_0= ruleStr | this_Numbers_1= ruleNumbers | this_Boolean_2= ruleBoolean )
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
                    // InternalGo.g:1200:3: this_Str_0= ruleStr
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
                    // InternalGo.g:1209:3: this_Numbers_1= ruleNumbers
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
                    // InternalGo.g:1218:3: this_Boolean_2= ruleBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeValueAccess().getBooleanParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Boolean_2=ruleBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Boolean_2;
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
    // InternalGo.g:1230:1: entryRuleStr returns [EObject current=null] : iv_ruleStr= ruleStr EOF ;
    public final EObject entryRuleStr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStr = null;


        try {
            // InternalGo.g:1230:44: (iv_ruleStr= ruleStr EOF )
            // InternalGo.g:1231:2: iv_ruleStr= ruleStr EOF
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
    // InternalGo.g:1237:1: ruleStr returns [EObject current=null] : ( (lv_s_0_0= RULE_STRING ) ) ;
    public final EObject ruleStr() throws RecognitionException {
        EObject current = null;

        Token lv_s_0_0=null;


        	enterRule();

        try {
            // InternalGo.g:1243:2: ( ( (lv_s_0_0= RULE_STRING ) ) )
            // InternalGo.g:1244:2: ( (lv_s_0_0= RULE_STRING ) )
            {
            // InternalGo.g:1244:2: ( (lv_s_0_0= RULE_STRING ) )
            // InternalGo.g:1245:3: (lv_s_0_0= RULE_STRING )
            {
            // InternalGo.g:1245:3: (lv_s_0_0= RULE_STRING )
            // InternalGo.g:1246:4: lv_s_0_0= RULE_STRING
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
    // InternalGo.g:1265:1: entryRuleDecImport returns [String current=null] : iv_ruleDecImport= ruleDecImport EOF ;
    public final String entryRuleDecImport() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecImport = null;


        try {
            // InternalGo.g:1265:49: (iv_ruleDecImport= ruleDecImport EOF )
            // InternalGo.g:1266:2: iv_ruleDecImport= ruleDecImport EOF
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
    // InternalGo.g:1272:1: ruleDecImport returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IMPORT_0= ruleIMPORT (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) ) ) ;
    public final AntlrDatatypeRuleToken ruleDecImport() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_1=null;
        Token this_Open_parentheses_2=null;
        Token this_STRING_3=null;
        Token this_Closed_parentheses_4=null;
        AntlrDatatypeRuleToken this_IMPORT_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1278:2: ( (this_IMPORT_0= ruleIMPORT (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) ) ) )
            // InternalGo.g:1279:2: (this_IMPORT_0= ruleIMPORT (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) ) )
            {
            // InternalGo.g:1279:2: (this_IMPORT_0= ruleIMPORT (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) ) )
            // InternalGo.g:1280:3: this_IMPORT_0= ruleIMPORT (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) )
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDecImportAccess().getIMPORTParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_28);
            this_IMPORT_0=ruleIMPORT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IMPORT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1290:3: (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) )
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
                    // InternalGo.g:1291:4: this_STRING_1= RULE_STRING
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
                    // InternalGo.g:1299:4: (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES )
                    {
                    // InternalGo.g:1299:4: (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES )
                    // InternalGo.g:1300:5: this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES
                    {
                    this_Open_parentheses_2=(Token)match(input,RULE_OPEN_PARENTHESES,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Open_parentheses_2);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_Open_parentheses_2, grammarAccess.getDecImportAccess().getOpen_parenthesesTerminalRuleCall_1_1_0());
                      				
                    }
                    // InternalGo.g:1307:5: (this_STRING_3= RULE_STRING )+
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
                    	    // InternalGo.g:1308:6: this_STRING_3= RULE_STRING
                    	    {
                    	    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_30); if (state.failed) return current;
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
    // InternalGo.g:1329:1: entryRuleOperationsOneEquals returns [EObject current=null] : iv_ruleOperationsOneEquals= ruleOperationsOneEquals EOF ;
    public final EObject entryRuleOperationsOneEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationsOneEquals = null;


        try {
            // InternalGo.g:1329:60: (iv_ruleOperationsOneEquals= ruleOperationsOneEquals EOF )
            // InternalGo.g:1330:2: iv_ruleOperationsOneEquals= ruleOperationsOneEquals EOF
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
    // InternalGo.g:1336:1: ruleOperationsOneEquals returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusEquals_1= RULE_PLUSEQUALS | this_MinusEquals_2= RULE_MINUSEQUALS ) (this_ID_3= RULE_ID | ( (lv_n_4_0= ruleNumbers ) ) ) ) ;
    public final EObject ruleOperationsOneEquals() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_PlusEquals_1=null;
        Token this_MinusEquals_2=null;
        Token this_ID_3=null;
        EObject lv_n_4_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1342:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusEquals_1= RULE_PLUSEQUALS | this_MinusEquals_2= RULE_MINUSEQUALS ) (this_ID_3= RULE_ID | ( (lv_n_4_0= ruleNumbers ) ) ) ) )
            // InternalGo.g:1343:2: ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusEquals_1= RULE_PLUSEQUALS | this_MinusEquals_2= RULE_MINUSEQUALS ) (this_ID_3= RULE_ID | ( (lv_n_4_0= ruleNumbers ) ) ) )
            {
            // InternalGo.g:1343:2: ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusEquals_1= RULE_PLUSEQUALS | this_MinusEquals_2= RULE_MINUSEQUALS ) (this_ID_3= RULE_ID | ( (lv_n_4_0= ruleNumbers ) ) ) )
            // InternalGo.g:1344:3: ( (lv_name_0_0= RULE_ID ) ) (this_PlusEquals_1= RULE_PLUSEQUALS | this_MinusEquals_2= RULE_MINUSEQUALS ) (this_ID_3= RULE_ID | ( (lv_n_4_0= ruleNumbers ) ) )
            {
            // InternalGo.g:1344:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGo.g:1345:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGo.g:1345:4: (lv_name_0_0= RULE_ID )
            // InternalGo.g:1346:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
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

            // InternalGo.g:1362:3: (this_PlusEquals_1= RULE_PLUSEQUALS | this_MinusEquals_2= RULE_MINUSEQUALS )
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
                    // InternalGo.g:1363:4: this_PlusEquals_1= RULE_PLUSEQUALS
                    {
                    this_PlusEquals_1=(Token)match(input,RULE_PLUSEQUALS,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_PlusEquals_1, grammarAccess.getOperationsOneEqualsAccess().getPlusEqualsTerminalRuleCall_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1368:4: this_MinusEquals_2= RULE_MINUSEQUALS
                    {
                    this_MinusEquals_2=(Token)match(input,RULE_MINUSEQUALS,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_MinusEquals_2, grammarAccess.getOperationsOneEqualsAccess().getMinusEqualsTerminalRuleCall_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalGo.g:1373:3: (this_ID_3= RULE_ID | ( (lv_n_4_0= ruleNumbers ) ) )
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
                    // InternalGo.g:1374:4: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_3, grammarAccess.getOperationsOneEqualsAccess().getIDTerminalRuleCall_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1379:4: ( (lv_n_4_0= ruleNumbers ) )
                    {
                    // InternalGo.g:1379:4: ( (lv_n_4_0= ruleNumbers ) )
                    // InternalGo.g:1380:5: (lv_n_4_0= ruleNumbers )
                    {
                    // InternalGo.g:1380:5: (lv_n_4_0= ruleNumbers )
                    // InternalGo.g:1381:6: lv_n_4_0= ruleNumbers
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
    // InternalGo.g:1403:1: entryRuleNumbers returns [EObject current=null] : iv_ruleNumbers= ruleNumbers EOF ;
    public final EObject entryRuleNumbers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumbers = null;


        try {
            // InternalGo.g:1403:48: (iv_ruleNumbers= ruleNumbers EOF )
            // InternalGo.g:1404:2: iv_ruleNumbers= ruleNumbers EOF
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
    // InternalGo.g:1410:1: ruleNumbers returns [EObject current=null] : ( ( (lv_int_0_0= RULE_INT ) ) | ( (lv_d_1_0= ruleDouble ) ) ) ;
    public final EObject ruleNumbers() throws RecognitionException {
        EObject current = null;

        Token lv_int_0_0=null;
        EObject lv_d_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1416:2: ( ( ( (lv_int_0_0= RULE_INT ) ) | ( (lv_d_1_0= ruleDouble ) ) ) )
            // InternalGo.g:1417:2: ( ( (lv_int_0_0= RULE_INT ) ) | ( (lv_d_1_0= ruleDouble ) ) )
            {
            // InternalGo.g:1417:2: ( ( (lv_int_0_0= RULE_INT ) ) | ( (lv_d_1_0= ruleDouble ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==EOF||(LA25_1>=RULE_EOL && LA25_1<=RULE_COMMA)||(LA25_1>=RULE_CLOSED_PARENTHESES && LA25_1<=RULE_INT)||LA25_1==RULE_STRING||(LA25_1>=RULE_PLUS && LA25_1<=RULE_BAR)||LA25_1==RULE_PONTOVIRGULA||(LA25_1>=33 && LA25_1<=39)||(LA25_1>=47 && LA25_1<=48)||LA25_1==50||LA25_1==52||(LA25_1>=55 && LA25_1<=58)||(LA25_1>=62 && LA25_1<=64)||LA25_1==66) ) {
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
                    // InternalGo.g:1418:3: ( (lv_int_0_0= RULE_INT ) )
                    {
                    // InternalGo.g:1418:3: ( (lv_int_0_0= RULE_INT ) )
                    // InternalGo.g:1419:4: (lv_int_0_0= RULE_INT )
                    {
                    // InternalGo.g:1419:4: (lv_int_0_0= RULE_INT )
                    // InternalGo.g:1420:5: lv_int_0_0= RULE_INT
                    {
                    lv_int_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_int_0_0, grammarAccess.getNumbersAccess().getIntINTTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getNumbersRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"int",
                      						lv_int_0_0,
                      						"org.eclipse.xtext.common.Terminals.INT");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1437:3: ( (lv_d_1_0= ruleDouble ) )
                    {
                    // InternalGo.g:1437:3: ( (lv_d_1_0= ruleDouble ) )
                    // InternalGo.g:1438:4: (lv_d_1_0= ruleDouble )
                    {
                    // InternalGo.g:1438:4: (lv_d_1_0= ruleDouble )
                    // InternalGo.g:1439:5: lv_d_1_0= ruleDouble
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


    // $ANTLR start "entryRuleDouble"
    // InternalGo.g:1460:1: entryRuleDouble returns [EObject current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final EObject entryRuleDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDouble = null;


        try {
            // InternalGo.g:1460:47: (iv_ruleDouble= ruleDouble EOF )
            // InternalGo.g:1461:2: iv_ruleDouble= ruleDouble EOF
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
    // InternalGo.g:1467:1: ruleDouble returns [EObject current=null] : ( ( (lv_d_0_0= RULE_INT ) ) this_Dot_1= RULE_DOT this_INT_2= RULE_INT ) ;
    public final EObject ruleDouble() throws RecognitionException {
        EObject current = null;

        Token lv_d_0_0=null;
        Token this_Dot_1=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalGo.g:1473:2: ( ( ( (lv_d_0_0= RULE_INT ) ) this_Dot_1= RULE_DOT this_INT_2= RULE_INT ) )
            // InternalGo.g:1474:2: ( ( (lv_d_0_0= RULE_INT ) ) this_Dot_1= RULE_DOT this_INT_2= RULE_INT )
            {
            // InternalGo.g:1474:2: ( ( (lv_d_0_0= RULE_INT ) ) this_Dot_1= RULE_DOT this_INT_2= RULE_INT )
            // InternalGo.g:1475:3: ( (lv_d_0_0= RULE_INT ) ) this_Dot_1= RULE_DOT this_INT_2= RULE_INT
            {
            // InternalGo.g:1475:3: ( (lv_d_0_0= RULE_INT ) )
            // InternalGo.g:1476:4: (lv_d_0_0= RULE_INT )
            {
            // InternalGo.g:1476:4: (lv_d_0_0= RULE_INT )
            // InternalGo.g:1477:5: lv_d_0_0= RULE_INT
            {
            lv_d_0_0=(Token)match(input,RULE_INT,FOLLOW_33); if (state.failed) return current;
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

            this_Dot_1=(Token)match(input,RULE_DOT,FOLLOW_34); if (state.failed) return current;
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


    // $ANTLR start "entryRuleCondition"
    // InternalGo.g:1505:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalGo.g:1505:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalGo.g:1506:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalGo.g:1512:1: ruleCondition returns [EObject current=null] : ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_if_0_0 = null;

        EObject lv_elseif_1_0 = null;

        EObject lv_else_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1518:2: ( ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )? ) )
            // InternalGo.g:1519:2: ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )? )
            {
            // InternalGo.g:1519:2: ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )? )
            // InternalGo.g:1520:3: ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )?
            {
            // InternalGo.g:1520:3: ( (lv_if_0_0= ruleIfCondition ) )
            // InternalGo.g:1521:4: (lv_if_0_0= ruleIfCondition )
            {
            // InternalGo.g:1521:4: (lv_if_0_0= ruleIfCondition )
            // InternalGo.g:1522:5: lv_if_0_0= ruleIfCondition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionAccess().getIfIfConditionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_35);
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

            // InternalGo.g:1539:3: ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==54) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==57) && (synpred1_InternalGo())) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // InternalGo.g:1540:4: ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition )
            	    {
            	    // InternalGo.g:1541:4: (lv_elseif_1_0= ruleElseIfCondition )
            	    // InternalGo.g:1542:5: lv_elseif_1_0= ruleElseIfCondition
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConditionAccess().getElseifElseIfConditionParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_35);
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

            // InternalGo.g:1559:3: ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==54) && (synpred2_InternalGo())) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGo.g:1560:4: ( ruleELSE )=> (lv_else_2_0= ruleElseCondition )
                    {
                    // InternalGo.g:1561:4: (lv_else_2_0= ruleElseCondition )
                    // InternalGo.g:1562:5: lv_else_2_0= ruleElseCondition
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
    // InternalGo.g:1583:1: entryRuleIfCondition returns [EObject current=null] : iv_ruleIfCondition= ruleIfCondition EOF ;
    public final EObject entryRuleIfCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfCondition = null;


        try {
            // InternalGo.g:1583:52: (iv_ruleIfCondition= ruleIfCondition EOF )
            // InternalGo.g:1584:2: iv_ruleIfCondition= ruleIfCondition EOF
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
    // InternalGo.g:1590:1: ruleIfCondition returns [EObject current=null] : ( ruleIF ( ( ruleAndExpression )=> (lv_cond_1_0= ruleOrExpression ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_then_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY ) ;
    public final EObject ruleIfCondition() throws RecognitionException {
        EObject current = null;

        Token this_Open_Key_2=null;
        Token this_Closed_Key_4=null;
        EObject lv_cond_1_0 = null;

        EObject lv_then_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1596:2: ( ( ruleIF ( ( ruleAndExpression )=> (lv_cond_1_0= ruleOrExpression ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_then_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY ) )
            // InternalGo.g:1597:2: ( ruleIF ( ( ruleAndExpression )=> (lv_cond_1_0= ruleOrExpression ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_then_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY )
            {
            // InternalGo.g:1597:2: ( ruleIF ( ( ruleAndExpression )=> (lv_cond_1_0= ruleOrExpression ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_then_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY )
            // InternalGo.g:1598:3: ruleIF ( ( ruleAndExpression )=> (lv_cond_1_0= ruleOrExpression ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_then_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIfConditionAccess().getIFParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_36);
            ruleIF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1605:3: ( ( ruleAndExpression )=> (lv_cond_1_0= ruleOrExpression ) )
            // InternalGo.g:1606:4: ( ruleAndExpression )=> (lv_cond_1_0= ruleOrExpression )
            {
            // InternalGo.g:1607:4: (lv_cond_1_0= ruleOrExpression )
            // InternalGo.g:1608:5: lv_cond_1_0= ruleOrExpression
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
            // InternalGo.g:1629:3: ( (lv_then_3_0= ruleGreeting ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_EOL && LA28_0<=RULE_ID)||LA28_0==52||(LA28_0>=55 && LA28_0<=58)||LA28_0==62||LA28_0==64||LA28_0==66) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalGo.g:1630:4: (lv_then_3_0= ruleGreeting )
            	    {
            	    // InternalGo.g:1630:4: (lv_then_3_0= ruleGreeting )
            	    // InternalGo.g:1631:5: lv_then_3_0= ruleGreeting
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
    // InternalGo.g:1656:1: entryRuleElseIfCondition returns [EObject current=null] : iv_ruleElseIfCondition= ruleElseIfCondition EOF ;
    public final EObject entryRuleElseIfCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfCondition = null;


        try {
            // InternalGo.g:1656:56: (iv_ruleElseIfCondition= ruleElseIfCondition EOF )
            // InternalGo.g:1657:2: iv_ruleElseIfCondition= ruleElseIfCondition EOF
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
    // InternalGo.g:1663:1: ruleElseIfCondition returns [EObject current=null] : ( ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition ) ;
    public final EObject ruleElseIfCondition() throws RecognitionException {
        EObject current = null;

        EObject this_IfCondition_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1669:2: ( ( ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition ) )
            // InternalGo.g:1670:2: ( ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition )
            {
            // InternalGo.g:1670:2: ( ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition )
            // InternalGo.g:1671:3: ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition
            {
            // InternalGo.g:1671:3: ( ( ruleELSE )=> ruleELSE )
            // InternalGo.g:1672:4: ( ruleELSE )=> ruleELSE
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getElseIfConditionAccess().getELSEParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_37);
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
    // InternalGo.g:1693:1: entryRuleElseCondition returns [EObject current=null] : iv_ruleElseCondition= ruleElseCondition EOF ;
    public final EObject entryRuleElseCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseCondition = null;


        try {
            // InternalGo.g:1693:54: (iv_ruleElseCondition= ruleElseCondition EOF )
            // InternalGo.g:1694:2: iv_ruleElseCondition= ruleElseCondition EOF
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
    // InternalGo.g:1700:1: ruleElseCondition returns [EObject current=null] : ( ( ( ruleELSE )=> ruleELSE ) this_Open_Key_1= RULE_OPEN_KEY ( (lv_then_2_0= ruleGreeting ) )* this_Closed_Key_3= RULE_CLOSED_KEY ) ;
    public final EObject ruleElseCondition() throws RecognitionException {
        EObject current = null;

        Token this_Open_Key_1=null;
        Token this_Closed_Key_3=null;
        EObject lv_then_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1706:2: ( ( ( ( ruleELSE )=> ruleELSE ) this_Open_Key_1= RULE_OPEN_KEY ( (lv_then_2_0= ruleGreeting ) )* this_Closed_Key_3= RULE_CLOSED_KEY ) )
            // InternalGo.g:1707:2: ( ( ( ruleELSE )=> ruleELSE ) this_Open_Key_1= RULE_OPEN_KEY ( (lv_then_2_0= ruleGreeting ) )* this_Closed_Key_3= RULE_CLOSED_KEY )
            {
            // InternalGo.g:1707:2: ( ( ( ruleELSE )=> ruleELSE ) this_Open_Key_1= RULE_OPEN_KEY ( (lv_then_2_0= ruleGreeting ) )* this_Closed_Key_3= RULE_CLOSED_KEY )
            // InternalGo.g:1708:3: ( ( ruleELSE )=> ruleELSE ) this_Open_Key_1= RULE_OPEN_KEY ( (lv_then_2_0= ruleGreeting ) )* this_Closed_Key_3= RULE_CLOSED_KEY
            {
            // InternalGo.g:1708:3: ( ( ruleELSE )=> ruleELSE )
            // InternalGo.g:1709:4: ( ruleELSE )=> ruleELSE
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
            // InternalGo.g:1722:3: ( (lv_then_2_0= ruleGreeting ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_EOL && LA29_0<=RULE_ID)||LA29_0==52||(LA29_0>=55 && LA29_0<=58)||LA29_0==62||LA29_0==64||LA29_0==66) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalGo.g:1723:4: (lv_then_2_0= ruleGreeting )
            	    {
            	    // InternalGo.g:1723:4: (lv_then_2_0= ruleGreeting )
            	    // InternalGo.g:1724:5: lv_then_2_0= ruleGreeting
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
    // InternalGo.g:1749:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalGo.g:1749:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalGo.g:1750:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalGo.g:1756:1: ruleExpression returns [EObject current=null] : ( ( ( ( ( ruleOpers ) ) | ( ( ruleAndExpression )=> ruleOrExpression ) | RULE_ID ) )=> ( ( (lv_x_0_0= ruleOpers ) ) | ( ( ruleAndExpression )=>this_OrExpression_1= ruleOrExpression ) | this_ID_2= RULE_ID ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token this_ID_2=null;
        EObject lv_x_0_0 = null;

        EObject this_OrExpression_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1762:2: ( ( ( ( ( ( ruleOpers ) ) | ( ( ruleAndExpression )=> ruleOrExpression ) | RULE_ID ) )=> ( ( (lv_x_0_0= ruleOpers ) ) | ( ( ruleAndExpression )=>this_OrExpression_1= ruleOrExpression ) | this_ID_2= RULE_ID ) ) )
            // InternalGo.g:1763:2: ( ( ( ( ( ruleOpers ) ) | ( ( ruleAndExpression )=> ruleOrExpression ) | RULE_ID ) )=> ( ( (lv_x_0_0= ruleOpers ) ) | ( ( ruleAndExpression )=>this_OrExpression_1= ruleOrExpression ) | this_ID_2= RULE_ID ) )
            {
            // InternalGo.g:1763:2: ( ( ( ( ( ruleOpers ) ) | ( ( ruleAndExpression )=> ruleOrExpression ) | RULE_ID ) )=> ( ( (lv_x_0_0= ruleOpers ) ) | ( ( ruleAndExpression )=>this_OrExpression_1= ruleOrExpression ) | this_ID_2= RULE_ID ) )
            // InternalGo.g:1764:3: ( ( ( ( ruleOpers ) ) | ( ( ruleAndExpression )=> ruleOrExpression ) | RULE_ID ) )=> ( ( (lv_x_0_0= ruleOpers ) ) | ( ( ruleAndExpression )=>this_OrExpression_1= ruleOrExpression ) | this_ID_2= RULE_ID )
            {
            // InternalGo.g:1779:3: ( ( (lv_x_0_0= ruleOpers ) ) | ( ( ruleAndExpression )=>this_OrExpression_1= ruleOrExpression ) | this_ID_2= RULE_ID )
            int alt30=3;
            switch ( input.LA(1) ) {
            case RULE_OPEN_PARENTHESES:
                {
                int LA30_1 = input.LA(2);

                if ( (true) ) {
                    alt30=1;
                }
                else if ( (synpred8_InternalGo()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                int LA30_2 = input.LA(2);

                if ( (true) ) {
                    alt30=1;
                }
                else if ( (synpred8_InternalGo()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                int LA30_3 = input.LA(2);

                if ( (true) ) {
                    alt30=1;
                }
                else if ( (synpred8_InternalGo()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA30_4 = input.LA(2);

                if ( (true) ) {
                    alt30=1;
                }
                else if ( (synpred8_InternalGo()) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt30=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalGo.g:1780:4: ( (lv_x_0_0= ruleOpers ) )
                    {
                    // InternalGo.g:1780:4: ( (lv_x_0_0= ruleOpers ) )
                    // InternalGo.g:1781:5: (lv_x_0_0= ruleOpers )
                    {
                    // InternalGo.g:1781:5: (lv_x_0_0= ruleOpers )
                    // InternalGo.g:1782:6: lv_x_0_0= ruleOpers
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getXOpersParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_x_0_0=ruleOpers();

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
                      							"org.xtext.go.Go.Opers");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1800:4: ( ( ruleAndExpression )=>this_OrExpression_1= ruleOrExpression )
                    {
                    // InternalGo.g:1800:4: ( ( ruleAndExpression )=>this_OrExpression_1= ruleOrExpression )
                    // InternalGo.g:1801:5: ( ruleAndExpression )=>this_OrExpression_1= ruleOrExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall_0_1());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    this_OrExpression_1=ruleOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_OrExpression_1;
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:1812:4: this_ID_2= RULE_ID
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
    // InternalGo.g:1821:1: entryRuleCallFor returns [EObject current=null] : iv_ruleCallFor= ruleCallFor EOF ;
    public final EObject entryRuleCallFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallFor = null;


        try {
            // InternalGo.g:1821:48: (iv_ruleCallFor= ruleCallFor EOF )
            // InternalGo.g:1822:2: iv_ruleCallFor= ruleCallFor EOF
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
    // InternalGo.g:1828:1: ruleCallFor returns [EObject current=null] : ( ruleFOR (this_varFor_1= rulevarFor )? this_Open_Key_2= RULE_OPEN_KEY ( (lv_x_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY ) ;
    public final EObject ruleCallFor() throws RecognitionException {
        EObject current = null;

        Token this_Open_Key_2=null;
        Token this_Closed_Key_4=null;
        EObject this_varFor_1 = null;

        EObject lv_x_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1834:2: ( ( ruleFOR (this_varFor_1= rulevarFor )? this_Open_Key_2= RULE_OPEN_KEY ( (lv_x_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY ) )
            // InternalGo.g:1835:2: ( ruleFOR (this_varFor_1= rulevarFor )? this_Open_Key_2= RULE_OPEN_KEY ( (lv_x_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY )
            {
            // InternalGo.g:1835:2: ( ruleFOR (this_varFor_1= rulevarFor )? this_Open_Key_2= RULE_OPEN_KEY ( (lv_x_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY )
            // InternalGo.g:1836:3: ruleFOR (this_varFor_1= rulevarFor )? this_Open_Key_2= RULE_OPEN_KEY ( (lv_x_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCallForAccess().getFORParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_38);
            ruleFOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1843:3: (this_varFor_1= rulevarFor )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_OPEN_PARENTHESES||LA31_0==RULE_INT||(LA31_0>=47 && LA31_0<=48)||LA31_0==52||LA31_0==62) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGo.g:1844:4: this_varFor_1= rulevarFor
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
            // InternalGo.g:1857:3: ( (lv_x_3_0= ruleGreeting ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_EOL && LA32_0<=RULE_ID)||LA32_0==52||(LA32_0>=55 && LA32_0<=58)||LA32_0==62||LA32_0==64||LA32_0==66) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalGo.g:1858:4: (lv_x_3_0= ruleGreeting )
            	    {
            	    // InternalGo.g:1858:4: (lv_x_3_0= ruleGreeting )
            	    // InternalGo.g:1859:5: lv_x_3_0= ruleGreeting
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
            	    break loop32;
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


    // $ANTLR start "entryRuleOpers"
    // InternalGo.g:1884:1: entryRuleOpers returns [EObject current=null] : iv_ruleOpers= ruleOpers EOF ;
    public final EObject entryRuleOpers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpers = null;


        try {
            // InternalGo.g:1884:46: (iv_ruleOpers= ruleOpers EOF )
            // InternalGo.g:1885:2: iv_ruleOpers= ruleOpers EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpersRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpers=ruleOpers();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpers; 
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
    // $ANTLR end "entryRuleOpers"


    // $ANTLR start "ruleOpers"
    // InternalGo.g:1891:1: ruleOpers returns [EObject current=null] : ( ( ( ruleSubMult )=> (lv_sum_0_0= ruleAddition ) ) | ( ( ruleSubMult )=> (lv_sub_1_0= ruleSubtration ) ) ) ;
    public final EObject ruleOpers() throws RecognitionException {
        EObject current = null;

        EObject lv_sum_0_0 = null;

        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1897:2: ( ( ( ( ruleSubMult )=> (lv_sum_0_0= ruleAddition ) ) | ( ( ruleSubMult )=> (lv_sub_1_0= ruleSubtration ) ) ) )
            // InternalGo.g:1898:2: ( ( ( ruleSubMult )=> (lv_sum_0_0= ruleAddition ) ) | ( ( ruleSubMult )=> (lv_sub_1_0= ruleSubtration ) ) )
            {
            // InternalGo.g:1898:2: ( ( ( ruleSubMult )=> (lv_sum_0_0= ruleAddition ) ) | ( ( ruleSubMult )=> (lv_sub_1_0= ruleSubtration ) ) )
            int alt33=2;
            switch ( input.LA(1) ) {
            case RULE_OPEN_PARENTHESES:
                {
                int LA33_1 = input.LA(2);

                if ( (synpred9_InternalGo()) ) {
                    alt33=1;
                }
                else if ( (synpred10_InternalGo()) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                int LA33_2 = input.LA(2);

                if ( (synpred9_InternalGo()) ) {
                    alt33=1;
                }
                else if ( (synpred10_InternalGo()) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                int LA33_3 = input.LA(2);

                if ( (synpred9_InternalGo()) ) {
                    alt33=1;
                }
                else if ( (synpred10_InternalGo()) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA33_4 = input.LA(2);

                if ( (synpred9_InternalGo()) ) {
                    alt33=1;
                }
                else if ( (synpred10_InternalGo()) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalGo.g:1899:3: ( ( ruleSubMult )=> (lv_sum_0_0= ruleAddition ) )
                    {
                    // InternalGo.g:1899:3: ( ( ruleSubMult )=> (lv_sum_0_0= ruleAddition ) )
                    // InternalGo.g:1900:4: ( ruleSubMult )=> (lv_sum_0_0= ruleAddition )
                    {
                    // InternalGo.g:1901:4: (lv_sum_0_0= ruleAddition )
                    // InternalGo.g:1902:5: lv_sum_0_0= ruleAddition
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getOpersAccess().getSumAdditionParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_sum_0_0=ruleAddition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getOpersRule());
                      					}
                      					set(
                      						current,
                      						"sum",
                      						lv_sum_0_0,
                      						"org.xtext.go.Go.Addition");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1920:3: ( ( ruleSubMult )=> (lv_sub_1_0= ruleSubtration ) )
                    {
                    // InternalGo.g:1920:3: ( ( ruleSubMult )=> (lv_sub_1_0= ruleSubtration ) )
                    // InternalGo.g:1921:4: ( ruleSubMult )=> (lv_sub_1_0= ruleSubtration )
                    {
                    // InternalGo.g:1922:4: (lv_sub_1_0= ruleSubtration )
                    // InternalGo.g:1923:5: lv_sub_1_0= ruleSubtration
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getOpersAccess().getSubSubtrationParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_sub_1_0=ruleSubtration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getOpersRule());
                      					}
                      					set(
                      						current,
                      						"sub",
                      						lv_sub_1_0,
                      						"org.xtext.go.Go.Subtration");
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
    // $ANTLR end "ruleOpers"


    // $ANTLR start "entryRuleAddition"
    // InternalGo.g:1944:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalGo.g:1944:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalGo.g:1945:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalGo.g:1951:1: ruleAddition returns [EObject current=null] : ( ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Plus_2= RULE_PLUS ( (lv_right_3_0= ruleSubMult ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token this_Plus_2=null;
        EObject this_SubMult_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1957:2: ( ( ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Plus_2= RULE_PLUS ( (lv_right_3_0= ruleSubMult ) ) )* ) )
            // InternalGo.g:1958:2: ( ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Plus_2= RULE_PLUS ( (lv_right_3_0= ruleSubMult ) ) )* )
            {
            // InternalGo.g:1958:2: ( ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Plus_2= RULE_PLUS ( (lv_right_3_0= ruleSubMult ) ) )* )
            // InternalGo.g:1959:3: ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Plus_2= RULE_PLUS ( (lv_right_3_0= ruleSubMult ) ) )*
            {
            // InternalGo.g:1959:3: ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult )
            // InternalGo.g:1960:4: ( ruleSubMult )=>this_SubMult_0= ruleSubMult
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getAdditionAccess().getSubMultParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_39);
            this_SubMult_0=ruleSubMult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_SubMult_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalGo.g:1970:3: ( () this_Plus_2= RULE_PLUS ( (lv_right_3_0= ruleSubMult ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_PLUS) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalGo.g:1971:4: () this_Plus_2= RULE_PLUS ( (lv_right_3_0= ruleSubMult ) )
            	    {
            	    // InternalGo.g:1971:4: ()
            	    // InternalGo.g:1972:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_Plus_2=(Token)match(input,RULE_PLUS,FOLLOW_36); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_Plus_2, grammarAccess.getAdditionAccess().getPlusTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalGo.g:1982:4: ( (lv_right_3_0= ruleSubMult ) )
            	    // InternalGo.g:1983:5: (lv_right_3_0= ruleSubMult )
            	    {
            	    // InternalGo.g:1983:5: (lv_right_3_0= ruleSubMult )
            	    // InternalGo.g:1984:6: lv_right_3_0= ruleSubMult
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditionAccess().getRightSubMultParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleSubtration"
    // InternalGo.g:2006:1: entryRuleSubtration returns [EObject current=null] : iv_ruleSubtration= ruleSubtration EOF ;
    public final EObject entryRuleSubtration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtration = null;


        try {
            // InternalGo.g:2006:51: (iv_ruleSubtration= ruleSubtration EOF )
            // InternalGo.g:2007:2: iv_ruleSubtration= ruleSubtration EOF
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
    // InternalGo.g:2013:1: ruleSubtration returns [EObject current=null] : ( ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Minus_2= RULE_MINUS ( (lv_right_3_0= ruleSubMult ) ) )* ) ;
    public final EObject ruleSubtration() throws RecognitionException {
        EObject current = null;

        Token this_Minus_2=null;
        EObject this_SubMult_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2019:2: ( ( ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Minus_2= RULE_MINUS ( (lv_right_3_0= ruleSubMult ) ) )* ) )
            // InternalGo.g:2020:2: ( ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Minus_2= RULE_MINUS ( (lv_right_3_0= ruleSubMult ) ) )* )
            {
            // InternalGo.g:2020:2: ( ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Minus_2= RULE_MINUS ( (lv_right_3_0= ruleSubMult ) ) )* )
            // InternalGo.g:2021:3: ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Minus_2= RULE_MINUS ( (lv_right_3_0= ruleSubMult ) ) )*
            {
            // InternalGo.g:2021:3: ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult )
            // InternalGo.g:2022:4: ( ruleSubMult )=>this_SubMult_0= ruleSubMult
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getSubtrationAccess().getSubMultParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_40);
            this_SubMult_0=ruleSubMult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_SubMult_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalGo.g:2032:3: ( () this_Minus_2= RULE_MINUS ( (lv_right_3_0= ruleSubMult ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_MINUS) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalGo.g:2033:4: () this_Minus_2= RULE_MINUS ( (lv_right_3_0= ruleSubMult ) )
            	    {
            	    // InternalGo.g:2033:4: ()
            	    // InternalGo.g:2034:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getSubtrationAccess().getSubtrationLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_Minus_2=(Token)match(input,RULE_MINUS,FOLLOW_36); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_Minus_2, grammarAccess.getSubtrationAccess().getMinusTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalGo.g:2044:4: ( (lv_right_3_0= ruleSubMult ) )
            	    // InternalGo.g:2045:5: (lv_right_3_0= ruleSubMult )
            	    {
            	    // InternalGo.g:2045:5: (lv_right_3_0= ruleSubMult )
            	    // InternalGo.g:2046:6: lv_right_3_0= ruleSubMult
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSubtrationAccess().getRightSubMultParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
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
    // $ANTLR end "ruleSubtration"


    // $ANTLR start "entryRuleMultiplication"
    // InternalGo.g:2068:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalGo.g:2068:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalGo.g:2069:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalGo.g:2075:1: ruleMultiplication returns [EObject current=null] : ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Asterics_2= RULE_ASTERICS ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token this_Asterics_2=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2081:2: ( ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Asterics_2= RULE_ASTERICS ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // InternalGo.g:2082:2: ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Asterics_2= RULE_ASTERICS ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // InternalGo.g:2082:2: ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Asterics_2= RULE_ASTERICS ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // InternalGo.g:2083:3: ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Asterics_2= RULE_ASTERICS ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {
            // InternalGo.g:2083:3: ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression )
            // InternalGo.g:2084:4: ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_41);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_PrimaryExpression_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalGo.g:2094:3: ( () this_Asterics_2= RULE_ASTERICS ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ASTERICS) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalGo.g:2095:4: () this_Asterics_2= RULE_ASTERICS ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // InternalGo.g:2095:4: ()
            	    // InternalGo.g:2096:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_Asterics_2=(Token)match(input,RULE_ASTERICS,FOLLOW_36); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_Asterics_2, grammarAccess.getMultiplicationAccess().getAstericsTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalGo.g:2106:4: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // InternalGo.g:2107:5: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // InternalGo.g:2107:5: (lv_right_3_0= rulePrimaryExpression )
            	    // InternalGo.g:2108:6: lv_right_3_0= rulePrimaryExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_41);
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleDivision"
    // InternalGo.g:2130:1: entryRuleDivision returns [EObject current=null] : iv_ruleDivision= ruleDivision EOF ;
    public final EObject entryRuleDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivision = null;


        try {
            // InternalGo.g:2130:49: (iv_ruleDivision= ruleDivision EOF )
            // InternalGo.g:2131:2: iv_ruleDivision= ruleDivision EOF
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
    // InternalGo.g:2137:1: ruleDivision returns [EObject current=null] : ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Bar_2= RULE_BAR ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleDivision() throws RecognitionException {
        EObject current = null;

        Token this_Bar_2=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2143:2: ( ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Bar_2= RULE_BAR ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // InternalGo.g:2144:2: ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Bar_2= RULE_BAR ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // InternalGo.g:2144:2: ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Bar_2= RULE_BAR ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // InternalGo.g:2145:3: ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Bar_2= RULE_BAR ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {
            // InternalGo.g:2145:3: ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression )
            // InternalGo.g:2146:4: ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getDivisionAccess().getPrimaryExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_42);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_PrimaryExpression_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalGo.g:2156:3: ( () this_Bar_2= RULE_BAR ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_BAR) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalGo.g:2157:4: () this_Bar_2= RULE_BAR ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // InternalGo.g:2157:4: ()
            	    // InternalGo.g:2158:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_Bar_2=(Token)match(input,RULE_BAR,FOLLOW_36); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_Bar_2, grammarAccess.getDivisionAccess().getBarTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalGo.g:2168:4: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // InternalGo.g:2169:5: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // InternalGo.g:2169:5: (lv_right_3_0= rulePrimaryExpression )
            	    // InternalGo.g:2170:6: lv_right_3_0= rulePrimaryExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDivisionAccess().getRightPrimaryExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
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
    // $ANTLR end "ruleDivision"


    // $ANTLR start "entryRuleSubMult"
    // InternalGo.g:2192:1: entryRuleSubMult returns [EObject current=null] : iv_ruleSubMult= ruleSubMult EOF ;
    public final EObject entryRuleSubMult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubMult = null;


        try {
            // InternalGo.g:2192:48: (iv_ruleSubMult= ruleSubMult EOF )
            // InternalGo.g:2193:2: iv_ruleSubMult= ruleSubMult EOF
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
    // InternalGo.g:2199:1: ruleSubMult returns [EObject current=null] : ( ( ( rulePrimaryExpression )=>this_Multiplication_0= ruleMultiplication ) | ( ( rulePrimaryExpression )=>this_Division_1= ruleDivision ) ) ;
    public final EObject ruleSubMult() throws RecognitionException {
        EObject current = null;

        EObject this_Multiplication_0 = null;

        EObject this_Division_1 = null;



        	enterRule();

        try {
            // InternalGo.g:2205:2: ( ( ( ( rulePrimaryExpression )=>this_Multiplication_0= ruleMultiplication ) | ( ( rulePrimaryExpression )=>this_Division_1= ruleDivision ) ) )
            // InternalGo.g:2206:2: ( ( ( rulePrimaryExpression )=>this_Multiplication_0= ruleMultiplication ) | ( ( rulePrimaryExpression )=>this_Division_1= ruleDivision ) )
            {
            // InternalGo.g:2206:2: ( ( ( rulePrimaryExpression )=>this_Multiplication_0= ruleMultiplication ) | ( ( rulePrimaryExpression )=>this_Division_1= ruleDivision ) )
            int alt38=2;
            switch ( input.LA(1) ) {
            case RULE_OPEN_PARENTHESES:
                {
                int LA38_1 = input.LA(2);

                if ( (synpred15_InternalGo()) ) {
                    alt38=1;
                }
                else if ( (synpred16_InternalGo()) ) {
                    alt38=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                int LA38_2 = input.LA(2);

                if ( (synpred15_InternalGo()) ) {
                    alt38=1;
                }
                else if ( (synpred16_InternalGo()) ) {
                    alt38=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 2, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                int LA38_3 = input.LA(2);

                if ( (synpred15_InternalGo()) ) {
                    alt38=1;
                }
                else if ( (synpred16_InternalGo()) ) {
                    alt38=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA38_4 = input.LA(2);

                if ( (synpred15_InternalGo()) ) {
                    alt38=1;
                }
                else if ( (synpred16_InternalGo()) ) {
                    alt38=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 4, input);

                    throw nvae;
                }
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
                    // InternalGo.g:2207:3: ( ( rulePrimaryExpression )=>this_Multiplication_0= ruleMultiplication )
                    {
                    // InternalGo.g:2207:3: ( ( rulePrimaryExpression )=>this_Multiplication_0= ruleMultiplication )
                    // InternalGo.g:2208:4: ( rulePrimaryExpression )=>this_Multiplication_0= ruleMultiplication
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
                    // InternalGo.g:2219:3: ( ( rulePrimaryExpression )=>this_Division_1= ruleDivision )
                    {
                    // InternalGo.g:2219:3: ( ( rulePrimaryExpression )=>this_Division_1= ruleDivision )
                    // InternalGo.g:2220:4: ( rulePrimaryExpression )=>this_Division_1= ruleDivision
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
    // InternalGo.g:2234:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalGo.g:2234:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalGo.g:2235:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalGo.g:2241:1: ruleOrExpression returns [EObject current=null] : ( ( ( ruleAndExpression )=>this_AndExpression_0= ruleAndExpression ) ( () otherlv_2= '||' ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2247:2: ( ( ( ( ruleAndExpression )=>this_AndExpression_0= ruleAndExpression ) ( () otherlv_2= '||' ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalGo.g:2248:2: ( ( ( ruleAndExpression )=>this_AndExpression_0= ruleAndExpression ) ( () otherlv_2= '||' ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalGo.g:2248:2: ( ( ( ruleAndExpression )=>this_AndExpression_0= ruleAndExpression ) ( () otherlv_2= '||' ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalGo.g:2249:3: ( ( ruleAndExpression )=>this_AndExpression_0= ruleAndExpression ) ( () otherlv_2= '||' ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) ) )*
            {
            // InternalGo.g:2249:3: ( ( ruleAndExpression )=>this_AndExpression_0= ruleAndExpression )
            // InternalGo.g:2250:4: ( ruleAndExpression )=>this_AndExpression_0= ruleAndExpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_43);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_AndExpression_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalGo.g:2260:3: ( () otherlv_2= '||' ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==33) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalGo.g:2261:4: () otherlv_2= '||' ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalGo.g:2261:4: ()
            	    // InternalGo.g:2262:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_36); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalGo.g:2272:4: ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) )
            	    // InternalGo.g:2273:5: ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalGo.g:2274:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalGo.g:2275:6: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_43);
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalGo.g:2297:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalGo.g:2297:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalGo.g:2298:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalGo.g:2304:1: ruleAndExpression returns [EObject current=null] : ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) ( () otherlv_2= '&&' ( ( rulePrimaryExpression )=> (lv_right_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ComparisonExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2310:2: ( ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) ( () otherlv_2= '&&' ( ( rulePrimaryExpression )=> (lv_right_3_0= ruleComparisonExpression ) ) )* ) )
            // InternalGo.g:2311:2: ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) ( () otherlv_2= '&&' ( ( rulePrimaryExpression )=> (lv_right_3_0= ruleComparisonExpression ) ) )* )
            {
            // InternalGo.g:2311:2: ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) ( () otherlv_2= '&&' ( ( rulePrimaryExpression )=> (lv_right_3_0= ruleComparisonExpression ) ) )* )
            // InternalGo.g:2312:3: ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) ( () otherlv_2= '&&' ( ( rulePrimaryExpression )=> (lv_right_3_0= ruleComparisonExpression ) ) )*
            {
            // InternalGo.g:2312:3: ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression )
            // InternalGo.g:2313:4: ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getAndExpressionAccess().getComparisonExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_44);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_ComparisonExpression_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalGo.g:2323:3: ( () otherlv_2= '&&' ( ( rulePrimaryExpression )=> (lv_right_3_0= ruleComparisonExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==34) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalGo.g:2324:4: () otherlv_2= '&&' ( ( rulePrimaryExpression )=> (lv_right_3_0= ruleComparisonExpression ) )
            	    {
            	    // InternalGo.g:2324:4: ()
            	    // InternalGo.g:2325:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,34,FOLLOW_36); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalGo.g:2335:4: ( ( rulePrimaryExpression )=> (lv_right_3_0= ruleComparisonExpression ) )
            	    // InternalGo.g:2336:5: ( rulePrimaryExpression )=> (lv_right_3_0= ruleComparisonExpression )
            	    {
            	    // InternalGo.g:2337:5: (lv_right_3_0= ruleComparisonExpression )
            	    // InternalGo.g:2338:6: lv_right_3_0= ruleComparisonExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_44);
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
            	    break loop40;
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
    // InternalGo.g:2360:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalGo.g:2360:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalGo.g:2361:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
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
    // InternalGo.g:2367:1: ruleComparisonExpression returns [EObject current=null] : ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () ruleOperator ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2373:2: ( ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () ruleOperator ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // InternalGo.g:2374:2: ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () ruleOperator ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // InternalGo.g:2374:2: ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () ruleOperator ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // InternalGo.g:2375:3: ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () ruleOperator ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {
            // InternalGo.g:2375:3: ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression )
            // InternalGo.g:2376:4: ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getComparisonExpressionAccess().getPrimaryExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_45);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_PrimaryExpression_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalGo.g:2386:3: ( () ruleOperator ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=35 && LA41_0<=39)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalGo.g:2387:4: () ruleOperator ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // InternalGo.g:2387:4: ()
            	    // InternalGo.g:2388:5: 
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
            	    pushFollow(FOLLOW_36);
            	    ruleOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalGo.g:2401:4: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // InternalGo.g:2402:5: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // InternalGo.g:2402:5: (lv_right_3_0= rulePrimaryExpression )
            	    // InternalGo.g:2403:6: lv_right_3_0= rulePrimaryExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_45);
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
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalGo.g:2425:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalGo.g:2425:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalGo.g:2426:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalGo.g:2432:1: rulePrimaryExpression returns [EObject current=null] : ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | this_Literal_3= ruleLiteral ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token this_Open_parentheses_0=null;
        Token this_Closed_parentheses_2=null;
        EObject this_Expression_1 = null;

        EObject this_Literal_3 = null;



        	enterRule();

        try {
            // InternalGo.g:2438:2: ( ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | this_Literal_3= ruleLiteral ) )
            // InternalGo.g:2439:2: ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | this_Literal_3= ruleLiteral )
            {
            // InternalGo.g:2439:2: ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | this_Literal_3= ruleLiteral )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_OPEN_PARENTHESES) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_INT||(LA42_0>=47 && LA42_0<=48)) ) {
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
                    // InternalGo.g:2440:3: (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES )
                    {
                    // InternalGo.g:2440:3: (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES )
                    // InternalGo.g:2441:4: this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES
                    {
                    this_Open_parentheses_0=(Token)match(input,RULE_OPEN_PARENTHESES,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Open_parentheses_0, grammarAccess.getPrimaryExpressionAccess().getOpen_parenthesesTerminalRuleCall_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_46);
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
                    // InternalGo.g:2459:3: this_Literal_3= ruleLiteral
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
    // InternalGo.g:2471:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalGo.g:2471:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalGo.g:2472:2: iv_ruleOperator= ruleOperator EOF
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
    // InternalGo.g:2478:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '<=' | kw= '==' | kw= '>=' | kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2484:2: ( (kw= '<' | kw= '<=' | kw= '==' | kw= '>=' | kw= '>' ) )
            // InternalGo.g:2485:2: (kw= '<' | kw= '<=' | kw= '==' | kw= '>=' | kw= '>' )
            {
            // InternalGo.g:2485:2: (kw= '<' | kw= '<=' | kw= '==' | kw= '>=' | kw= '>' )
            int alt43=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt43=1;
                }
                break;
            case 36:
                {
                alt43=2;
                }
                break;
            case 37:
                {
                alt43=3;
                }
                break;
            case 38:
                {
                alt43=4;
                }
                break;
            case 39:
                {
                alt43=5;
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
                    // InternalGo.g:2486:3: kw= '<'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2492:3: kw= '<='
                    {
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignEqualsSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:2498:3: kw= '=='
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getEqualsSignEqualsSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:2504:3: kw= '>='
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getGreaterThanSignEqualsSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:2510:3: kw= '>'
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
    // InternalGo.g:2519:1: entryRuleoperationsOne returns [EObject current=null] : iv_ruleoperationsOne= ruleoperationsOne EOF ;
    public final EObject entryRuleoperationsOne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperationsOne = null;


        try {
            // InternalGo.g:2519:54: (iv_ruleoperationsOne= ruleoperationsOne EOF )
            // InternalGo.g:2520:2: iv_ruleoperationsOne= ruleoperationsOne EOF
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
    // InternalGo.g:2526:1: ruleoperationsOne returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusOne_1= RULE_PLUSONE | this_MinusOne_2= RULE_MINUSONE ) ) ;
    public final EObject ruleoperationsOne() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_PlusOne_1=null;
        Token this_MinusOne_2=null;


        	enterRule();

        try {
            // InternalGo.g:2532:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusOne_1= RULE_PLUSONE | this_MinusOne_2= RULE_MINUSONE ) ) )
            // InternalGo.g:2533:2: ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusOne_1= RULE_PLUSONE | this_MinusOne_2= RULE_MINUSONE ) )
            {
            // InternalGo.g:2533:2: ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusOne_1= RULE_PLUSONE | this_MinusOne_2= RULE_MINUSONE ) )
            // InternalGo.g:2534:3: ( (lv_name_0_0= RULE_ID ) ) (this_PlusOne_1= RULE_PLUSONE | this_MinusOne_2= RULE_MINUSONE )
            {
            // InternalGo.g:2534:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGo.g:2535:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGo.g:2535:4: (lv_name_0_0= RULE_ID )
            // InternalGo.g:2536:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_47); if (state.failed) return current;
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

            // InternalGo.g:2552:3: (this_PlusOne_1= RULE_PLUSONE | this_MinusOne_2= RULE_MINUSONE )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_PLUSONE) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_MINUSONE) ) {
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
                    // InternalGo.g:2553:4: this_PlusOne_1= RULE_PLUSONE
                    {
                    this_PlusOne_1=(Token)match(input,RULE_PLUSONE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_PlusOne_1, grammarAccess.getOperationsOneAccess().getPlusOneTerminalRuleCall_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2558:4: this_MinusOne_2= RULE_MINUSONE
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
    // InternalGo.g:2567:1: entryRulevarFor returns [EObject current=null] : iv_rulevarFor= rulevarFor EOF ;
    public final EObject entryRulevarFor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevarFor = null;


        try {
            // InternalGo.g:2567:47: (iv_rulevarFor= rulevarFor EOF )
            // InternalGo.g:2568:2: iv_rulevarFor= rulevarFor EOF
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
    // InternalGo.g:2574:1: rulevarFor returns [EObject current=null] : ( ( ( rulePrimaryExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) | ( ruleModif ( (lv_var_2_0= RULE_ID ) ) ruleTypes this_equals_4= RULE_EQUALS ( (lv_atrb_5_0= ruleAtrib_Aux ) ) this_PontoVirgula_6= RULE_PONTOVIRGULA ( (lv_right_7_0= ruleLiteral ) ) ruleOperator ( (lv_left_9_0= ruleLiteral ) ) this_PontoVirgula_10= RULE_PONTOVIRGULA (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals ) ) ) ;
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
            // InternalGo.g:2580:2: ( ( ( ( rulePrimaryExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) | ( ruleModif ( (lv_var_2_0= RULE_ID ) ) ruleTypes this_equals_4= RULE_EQUALS ( (lv_atrb_5_0= ruleAtrib_Aux ) ) this_PontoVirgula_6= RULE_PONTOVIRGULA ( (lv_right_7_0= ruleLiteral ) ) ruleOperator ( (lv_left_9_0= ruleLiteral ) ) this_PontoVirgula_10= RULE_PONTOVIRGULA (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals ) ) ) )
            // InternalGo.g:2581:2: ( ( ( rulePrimaryExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) | ( ruleModif ( (lv_var_2_0= RULE_ID ) ) ruleTypes this_equals_4= RULE_EQUALS ( (lv_atrb_5_0= ruleAtrib_Aux ) ) this_PontoVirgula_6= RULE_PONTOVIRGULA ( (lv_right_7_0= ruleLiteral ) ) ruleOperator ( (lv_left_9_0= ruleLiteral ) ) this_PontoVirgula_10= RULE_PONTOVIRGULA (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals ) ) )
            {
            // InternalGo.g:2581:2: ( ( ( rulePrimaryExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) | ( ruleModif ( (lv_var_2_0= RULE_ID ) ) ruleTypes this_equals_4= RULE_EQUALS ( (lv_atrb_5_0= ruleAtrib_Aux ) ) this_PontoVirgula_6= RULE_PONTOVIRGULA ( (lv_right_7_0= ruleLiteral ) ) ruleOperator ( (lv_left_9_0= ruleLiteral ) ) this_PontoVirgula_10= RULE_PONTOVIRGULA (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_OPEN_PARENTHESES) && (synpred22_InternalGo())) {
                alt46=1;
            }
            else if ( (LA46_0==47) && (synpred22_InternalGo())) {
                alt46=1;
            }
            else if ( (LA46_0==48) && (synpred22_InternalGo())) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_INT) && (synpred22_InternalGo())) {
                alt46=1;
            }
            else if ( (LA46_0==52||LA46_0==62) ) {
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
                    // InternalGo.g:2582:3: ( ( rulePrimaryExpression )=>this_ComparisonExpression_0= ruleComparisonExpression )
                    {
                    // InternalGo.g:2582:3: ( ( rulePrimaryExpression )=>this_ComparisonExpression_0= ruleComparisonExpression )
                    // InternalGo.g:2583:4: ( rulePrimaryExpression )=>this_ComparisonExpression_0= ruleComparisonExpression
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
                    // InternalGo.g:2594:3: ( ruleModif ( (lv_var_2_0= RULE_ID ) ) ruleTypes this_equals_4= RULE_EQUALS ( (lv_atrb_5_0= ruleAtrib_Aux ) ) this_PontoVirgula_6= RULE_PONTOVIRGULA ( (lv_right_7_0= ruleLiteral ) ) ruleOperator ( (lv_left_9_0= ruleLiteral ) ) this_PontoVirgula_10= RULE_PONTOVIRGULA (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals ) )
                    {
                    // InternalGo.g:2594:3: ( ruleModif ( (lv_var_2_0= RULE_ID ) ) ruleTypes this_equals_4= RULE_EQUALS ( (lv_atrb_5_0= ruleAtrib_Aux ) ) this_PontoVirgula_6= RULE_PONTOVIRGULA ( (lv_right_7_0= ruleLiteral ) ) ruleOperator ( (lv_left_9_0= ruleLiteral ) ) this_PontoVirgula_10= RULE_PONTOVIRGULA (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals ) )
                    // InternalGo.g:2595:4: ruleModif ( (lv_var_2_0= RULE_ID ) ) ruleTypes this_equals_4= RULE_EQUALS ( (lv_atrb_5_0= ruleAtrib_Aux ) ) this_PontoVirgula_6= RULE_PONTOVIRGULA ( (lv_right_7_0= ruleLiteral ) ) ruleOperator ( (lv_left_9_0= ruleLiteral ) ) this_PontoVirgula_10= RULE_PONTOVIRGULA (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals )
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
                    // InternalGo.g:2602:4: ( (lv_var_2_0= RULE_ID ) )
                    // InternalGo.g:2603:5: (lv_var_2_0= RULE_ID )
                    {
                    // InternalGo.g:2603:5: (lv_var_2_0= RULE_ID )
                    // InternalGo.g:2604:6: lv_var_2_0= RULE_ID
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
                    // InternalGo.g:2631:4: ( (lv_atrb_5_0= ruleAtrib_Aux ) )
                    // InternalGo.g:2632:5: (lv_atrb_5_0= ruleAtrib_Aux )
                    {
                    // InternalGo.g:2632:5: (lv_atrb_5_0= ruleAtrib_Aux )
                    // InternalGo.g:2633:6: lv_atrb_5_0= ruleAtrib_Aux
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarForAccess().getAtrbAtrib_AuxParserRuleCall_1_4_0());
                      					
                    }
                    pushFollow(FOLLOW_48);
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

                    this_PontoVirgula_6=(Token)match(input,RULE_PONTOVIRGULA,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_PontoVirgula_6, grammarAccess.getVarForAccess().getPontoVirgulaTerminalRuleCall_1_5());
                      			
                    }
                    // InternalGo.g:2654:4: ( (lv_right_7_0= ruleLiteral ) )
                    // InternalGo.g:2655:5: (lv_right_7_0= ruleLiteral )
                    {
                    // InternalGo.g:2655:5: (lv_right_7_0= ruleLiteral )
                    // InternalGo.g:2656:6: lv_right_7_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarForAccess().getRightLiteralParserRuleCall_1_6_0());
                      					
                    }
                    pushFollow(FOLLOW_49);
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
                    pushFollow(FOLLOW_36);
                    ruleOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:2680:4: ( (lv_left_9_0= ruleLiteral ) )
                    // InternalGo.g:2681:5: (lv_left_9_0= ruleLiteral )
                    {
                    // InternalGo.g:2681:5: (lv_left_9_0= ruleLiteral )
                    // InternalGo.g:2682:6: lv_left_9_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarForAccess().getLeftLiteralParserRuleCall_1_8_0());
                      					
                    }
                    pushFollow(FOLLOW_48);
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
                    // InternalGo.g:2703:4: (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==RULE_ID) ) {
                        int LA45_1 = input.LA(2);

                        if ( ((LA45_1>=RULE_PLUSEQUALS && LA45_1<=RULE_MINUSEQUALS)) ) {
                            alt45=2;
                        }
                        else if ( ((LA45_1>=RULE_PLUSONE && LA45_1<=RULE_MINUSONE)) ) {
                            alt45=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 45, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalGo.g:2704:5: this_operationsOne_11= ruleoperationsOne
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
                            // InternalGo.g:2713:5: this_OperationsOneEquals_12= ruleOperationsOneEquals
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
    // InternalGo.g:2727:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalGo.g:2727:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalGo.g:2728:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalGo.g:2734:1: ruleLiteral returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleBoolean ) ) ) | this_Numbers_2= ruleNumbers ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;

        EObject this_Numbers_2 = null;



        	enterRule();

        try {
            // InternalGo.g:2740:2: ( ( ( () ( (lv_value_1_0= ruleBoolean ) ) ) | this_Numbers_2= ruleNumbers ) )
            // InternalGo.g:2741:2: ( ( () ( (lv_value_1_0= ruleBoolean ) ) ) | this_Numbers_2= ruleNumbers )
            {
            // InternalGo.g:2741:2: ( ( () ( (lv_value_1_0= ruleBoolean ) ) ) | this_Numbers_2= ruleNumbers )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=47 && LA47_0<=48)) ) {
                alt47=1;
            }
            else if ( (LA47_0==RULE_INT) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalGo.g:2742:3: ( () ( (lv_value_1_0= ruleBoolean ) ) )
                    {
                    // InternalGo.g:2742:3: ( () ( (lv_value_1_0= ruleBoolean ) ) )
                    // InternalGo.g:2743:4: () ( (lv_value_1_0= ruleBoolean ) )
                    {
                    // InternalGo.g:2743:4: ()
                    // InternalGo.g:2744:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getLiteralAccess().getLiteralAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGo.g:2750:4: ( (lv_value_1_0= ruleBoolean ) )
                    // InternalGo.g:2751:5: (lv_value_1_0= ruleBoolean )
                    {
                    // InternalGo.g:2751:5: (lv_value_1_0= ruleBoolean )
                    // InternalGo.g:2752:6: lv_value_1_0= ruleBoolean
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
                    // InternalGo.g:2771:3: this_Numbers_2= ruleNumbers
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
    // InternalGo.g:2783:1: entryRuleDecFunc returns [EObject current=null] : iv_ruleDecFunc= ruleDecFunc EOF ;
    public final EObject entryRuleDecFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecFunc = null;


        try {
            // InternalGo.g:2783:48: (iv_ruleDecFunc= ruleDecFunc EOF )
            // InternalGo.g:2784:2: iv_ruleDecFunc= ruleDecFunc EOF
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
    // InternalGo.g:2790:1: ruleDecFunc returns [EObject current=null] : ( ruleFUNC ( (lv_name_1_0= RULE_ID ) ) this_Open_parentheses_2= RULE_OPEN_PARENTHESES ( (lv_param_3_0= ruleParams ) )* this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ( (lv_returnType_5_0= ruleTypes ) )? this_Open_Key_6= RULE_OPEN_KEY ( (lv_args_7_0= ruleGreeting ) )* this_Closed_Key_8= RULE_CLOSED_KEY ) ;
    public final EObject ruleDecFunc() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token this_Open_parentheses_2=null;
        Token this_Closed_parentheses_4=null;
        Token this_Open_Key_6=null;
        Token this_Closed_Key_8=null;
        EObject lv_param_3_0 = null;

        AntlrDatatypeRuleToken lv_returnType_5_0 = null;

        EObject lv_args_7_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2796:2: ( ( ruleFUNC ( (lv_name_1_0= RULE_ID ) ) this_Open_parentheses_2= RULE_OPEN_PARENTHESES ( (lv_param_3_0= ruleParams ) )* this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ( (lv_returnType_5_0= ruleTypes ) )? this_Open_Key_6= RULE_OPEN_KEY ( (lv_args_7_0= ruleGreeting ) )* this_Closed_Key_8= RULE_CLOSED_KEY ) )
            // InternalGo.g:2797:2: ( ruleFUNC ( (lv_name_1_0= RULE_ID ) ) this_Open_parentheses_2= RULE_OPEN_PARENTHESES ( (lv_param_3_0= ruleParams ) )* this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ( (lv_returnType_5_0= ruleTypes ) )? this_Open_Key_6= RULE_OPEN_KEY ( (lv_args_7_0= ruleGreeting ) )* this_Closed_Key_8= RULE_CLOSED_KEY )
            {
            // InternalGo.g:2797:2: ( ruleFUNC ( (lv_name_1_0= RULE_ID ) ) this_Open_parentheses_2= RULE_OPEN_PARENTHESES ( (lv_param_3_0= ruleParams ) )* this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ( (lv_returnType_5_0= ruleTypes ) )? this_Open_Key_6= RULE_OPEN_KEY ( (lv_args_7_0= ruleGreeting ) )* this_Closed_Key_8= RULE_CLOSED_KEY )
            // InternalGo.g:2798:3: ruleFUNC ( (lv_name_1_0= RULE_ID ) ) this_Open_parentheses_2= RULE_OPEN_PARENTHESES ( (lv_param_3_0= ruleParams ) )* this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ( (lv_returnType_5_0= ruleTypes ) )? this_Open_Key_6= RULE_OPEN_KEY ( (lv_args_7_0= ruleGreeting ) )* this_Closed_Key_8= RULE_CLOSED_KEY
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
            // InternalGo.g:2805:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGo.g:2806:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGo.g:2806:4: (lv_name_1_0= RULE_ID )
            // InternalGo.g:2807:5: lv_name_1_0= RULE_ID
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
            // InternalGo.g:2827:3: ( (lv_param_3_0= ruleParams ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_ID) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalGo.g:2828:4: (lv_param_3_0= ruleParams )
            	    {
            	    // InternalGo.g:2828:4: (lv_param_3_0= ruleParams )
            	    // InternalGo.g:2829:5: lv_param_3_0= ruleParams
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
            	    break loop48;
                }
            } while (true);

            this_Closed_parentheses_4=(Token)match(input,RULE_CLOSED_PARENTHESES,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Closed_parentheses_4, grammarAccess.getDecFuncAccess().getClosed_parenthesesTerminalRuleCall_4());
              		
            }
            // InternalGo.g:2850:3: ( (lv_returnType_5_0= ruleTypes ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=40 && LA49_0<=46)||LA49_0==61) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalGo.g:2851:4: (lv_returnType_5_0= ruleTypes )
                    {
                    // InternalGo.g:2851:4: (lv_returnType_5_0= ruleTypes )
                    // InternalGo.g:2852:5: lv_returnType_5_0= ruleTypes
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

            this_Open_Key_6=(Token)match(input,RULE_OPEN_KEY,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Open_Key_6, grammarAccess.getDecFuncAccess().getOpen_KeyTerminalRuleCall_6());
              		
            }
            // InternalGo.g:2873:3: ( (lv_args_7_0= ruleGreeting ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=RULE_EOL && LA50_0<=RULE_ID)||LA50_0==52||(LA50_0>=55 && LA50_0<=58)||LA50_0==62||LA50_0==64||LA50_0==66) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalGo.g:2874:4: (lv_args_7_0= ruleGreeting )
            	    {
            	    // InternalGo.g:2874:4: (lv_args_7_0= ruleGreeting )
            	    // InternalGo.g:2875:5: lv_args_7_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDecFuncAccess().getArgsGreetingParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_args_7_0=ruleGreeting();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDecFuncRule());
            	      					}
            	      					add(
            	      						current,
            	      						"args",
            	      						lv_args_7_0,
            	      						"org.xtext.go.Go.Greeting");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

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


    // $ANTLR start "entryRuleCallFunc"
    // InternalGo.g:2900:1: entryRuleCallFunc returns [EObject current=null] : iv_ruleCallFunc= ruleCallFunc EOF ;
    public final EObject entryRuleCallFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallFunc = null;


        try {
            // InternalGo.g:2900:49: (iv_ruleCallFunc= ruleCallFunc EOF )
            // InternalGo.g:2901:2: iv_ruleCallFunc= ruleCallFunc EOF
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
    // InternalGo.g:2907:1: ruleCallFunc returns [EObject current=null] : ( ( (lv_nameFunc_0_0= RULE_ID ) ) this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( (lv_param_2_0= ruleParams ) )* this_Closed_parentheses_3= RULE_CLOSED_PARENTHESES ) ;
    public final EObject ruleCallFunc() throws RecognitionException {
        EObject current = null;

        Token lv_nameFunc_0_0=null;
        Token this_Open_parentheses_1=null;
        Token this_Closed_parentheses_3=null;
        EObject lv_param_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2913:2: ( ( ( (lv_nameFunc_0_0= RULE_ID ) ) this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( (lv_param_2_0= ruleParams ) )* this_Closed_parentheses_3= RULE_CLOSED_PARENTHESES ) )
            // InternalGo.g:2914:2: ( ( (lv_nameFunc_0_0= RULE_ID ) ) this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( (lv_param_2_0= ruleParams ) )* this_Closed_parentheses_3= RULE_CLOSED_PARENTHESES )
            {
            // InternalGo.g:2914:2: ( ( (lv_nameFunc_0_0= RULE_ID ) ) this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( (lv_param_2_0= ruleParams ) )* this_Closed_parentheses_3= RULE_CLOSED_PARENTHESES )
            // InternalGo.g:2915:3: ( (lv_nameFunc_0_0= RULE_ID ) ) this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( (lv_param_2_0= ruleParams ) )* this_Closed_parentheses_3= RULE_CLOSED_PARENTHESES
            {
            // InternalGo.g:2915:3: ( (lv_nameFunc_0_0= RULE_ID ) )
            // InternalGo.g:2916:4: (lv_nameFunc_0_0= RULE_ID )
            {
            // InternalGo.g:2916:4: (lv_nameFunc_0_0= RULE_ID )
            // InternalGo.g:2917:5: lv_nameFunc_0_0= RULE_ID
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
            // InternalGo.g:2937:3: ( (lv_param_2_0= ruleParams ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_ID) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalGo.g:2938:4: (lv_param_2_0= ruleParams )
            	    {
            	    // InternalGo.g:2938:4: (lv_param_2_0= ruleParams )
            	    // InternalGo.g:2939:5: lv_param_2_0= ruleParams
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
            	    break loop51;
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
    // InternalGo.g:2964:1: entryRuleTypes returns [String current=null] : iv_ruleTypes= ruleTypes EOF ;
    public final String entryRuleTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypes = null;


        try {
            // InternalGo.g:2964:45: (iv_ruleTypes= ruleTypes EOF )
            // InternalGo.g:2965:2: iv_ruleTypes= ruleTypes EOF
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
    // InternalGo.g:2971:1: ruleTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TYPE_0= ruleTYPE | kw= 'string' | kw= 'int' | kw= 'bool' | kw= 'byte' | kw= 'rune' | kw= 'float32' | kw= 'float64' ) ;
    public final AntlrDatatypeRuleToken ruleTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TYPE_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2977:2: ( (this_TYPE_0= ruleTYPE | kw= 'string' | kw= 'int' | kw= 'bool' | kw= 'byte' | kw= 'rune' | kw= 'float32' | kw= 'float64' ) )
            // InternalGo.g:2978:2: (this_TYPE_0= ruleTYPE | kw= 'string' | kw= 'int' | kw= 'bool' | kw= 'byte' | kw= 'rune' | kw= 'float32' | kw= 'float64' )
            {
            // InternalGo.g:2978:2: (this_TYPE_0= ruleTYPE | kw= 'string' | kw= 'int' | kw= 'bool' | kw= 'byte' | kw= 'rune' | kw= 'float32' | kw= 'float64' )
            int alt52=8;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt52=1;
                }
                break;
            case 40:
                {
                alt52=2;
                }
                break;
            case 41:
                {
                alt52=3;
                }
                break;
            case 42:
                {
                alt52=4;
                }
                break;
            case 43:
                {
                alt52=5;
                }
                break;
            case 44:
                {
                alt52=6;
                }
                break;
            case 45:
                {
                alt52=7;
                }
                break;
            case 46:
                {
                alt52=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalGo.g:2979:3: this_TYPE_0= ruleTYPE
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
                    // InternalGo.g:2990:3: kw= 'string'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getStringKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:2996:3: kw= 'int'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getIntKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:3002:3: kw= 'bool'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getBoolKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:3008:3: kw= 'byte'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getByteKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGo.g:3014:3: kw= 'rune'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getRuneKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGo.g:3020:3: kw= 'float32'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getFloat32Keyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalGo.g:3026:3: kw= 'float64'
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
    // InternalGo.g:3035:1: entryRuleModif returns [String current=null] : iv_ruleModif= ruleModif EOF ;
    public final String entryRuleModif() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModif = null;


        try {
            // InternalGo.g:3035:45: (iv_ruleModif= ruleModif EOF )
            // InternalGo.g:3036:2: iv_ruleModif= ruleModif EOF
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
    // InternalGo.g:3042:1: ruleModif returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VAR_0= ruleVAR | this_CONST_1= ruleCONST ) ;
    public final AntlrDatatypeRuleToken ruleModif() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VAR_0 = null;

        AntlrDatatypeRuleToken this_CONST_1 = null;



        	enterRule();

        try {
            // InternalGo.g:3048:2: ( (this_VAR_0= ruleVAR | this_CONST_1= ruleCONST ) )
            // InternalGo.g:3049:2: (this_VAR_0= ruleVAR | this_CONST_1= ruleCONST )
            {
            // InternalGo.g:3049:2: (this_VAR_0= ruleVAR | this_CONST_1= ruleCONST )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==62) ) {
                alt53=1;
            }
            else if ( (LA53_0==52) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalGo.g:3050:3: this_VAR_0= ruleVAR
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
                    // InternalGo.g:3061:3: this_CONST_1= ruleCONST
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
    // InternalGo.g:3075:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // InternalGo.g:3075:48: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalGo.g:3076:2: iv_ruleBoolean= ruleBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolean; 
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
    // InternalGo.g:3082:1: ruleBoolean returns [EObject current=null] : ( ( (lv_val_0_0= 'true' ) ) | ( (lv_val_1_0= 'false' ) ) ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalGo.g:3088:2: ( ( ( (lv_val_0_0= 'true' ) ) | ( (lv_val_1_0= 'false' ) ) ) )
            // InternalGo.g:3089:2: ( ( (lv_val_0_0= 'true' ) ) | ( (lv_val_1_0= 'false' ) ) )
            {
            // InternalGo.g:3089:2: ( ( (lv_val_0_0= 'true' ) ) | ( (lv_val_1_0= 'false' ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==47) ) {
                alt54=1;
            }
            else if ( (LA54_0==48) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalGo.g:3090:3: ( (lv_val_0_0= 'true' ) )
                    {
                    // InternalGo.g:3090:3: ( (lv_val_0_0= 'true' ) )
                    // InternalGo.g:3091:4: (lv_val_0_0= 'true' )
                    {
                    // InternalGo.g:3091:4: (lv_val_0_0= 'true' )
                    // InternalGo.g:3092:5: lv_val_0_0= 'true'
                    {
                    lv_val_0_0=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_val_0_0, grammarAccess.getBooleanAccess().getValTrueKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBooleanRule());
                      					}
                      					setWithLastConsumed(current, "val", lv_val_0_0, "true");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:3105:3: ( (lv_val_1_0= 'false' ) )
                    {
                    // InternalGo.g:3105:3: ( (lv_val_1_0= 'false' ) )
                    // InternalGo.g:3106:4: (lv_val_1_0= 'false' )
                    {
                    // InternalGo.g:3106:4: (lv_val_1_0= 'false' )
                    // InternalGo.g:3107:5: lv_val_1_0= 'false'
                    {
                    lv_val_1_0=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_val_1_0, grammarAccess.getBooleanAccess().getValFalseKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBooleanRule());
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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleBREAK"
    // InternalGo.g:3123:1: entryRuleBREAK returns [String current=null] : iv_ruleBREAK= ruleBREAK EOF ;
    public final String entryRuleBREAK() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBREAK = null;


        try {
            // InternalGo.g:3123:45: (iv_ruleBREAK= ruleBREAK EOF )
            // InternalGo.g:3124:2: iv_ruleBREAK= ruleBREAK EOF
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
    // InternalGo.g:3130:1: ruleBREAK returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'break' ;
    public final AntlrDatatypeRuleToken ruleBREAK() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3136:2: (kw= 'break' )
            // InternalGo.g:3137:2: kw= 'break'
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
    // InternalGo.g:3145:1: entryRuleCASE returns [String current=null] : iv_ruleCASE= ruleCASE EOF ;
    public final String entryRuleCASE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCASE = null;


        try {
            // InternalGo.g:3145:44: (iv_ruleCASE= ruleCASE EOF )
            // InternalGo.g:3146:2: iv_ruleCASE= ruleCASE EOF
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
    // InternalGo.g:3152:1: ruleCASE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'case' ;
    public final AntlrDatatypeRuleToken ruleCASE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3158:2: (kw= 'case' )
            // InternalGo.g:3159:2: kw= 'case'
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
    // InternalGo.g:3167:1: entryRuleCHAN returns [String current=null] : iv_ruleCHAN= ruleCHAN EOF ;
    public final String entryRuleCHAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCHAN = null;


        try {
            // InternalGo.g:3167:44: (iv_ruleCHAN= ruleCHAN EOF )
            // InternalGo.g:3168:2: iv_ruleCHAN= ruleCHAN EOF
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
    // InternalGo.g:3174:1: ruleCHAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'chan' ;
    public final AntlrDatatypeRuleToken ruleCHAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3180:2: (kw= 'chan' )
            // InternalGo.g:3181:2: kw= 'chan'
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
    // InternalGo.g:3189:1: entryRuleCONST returns [String current=null] : iv_ruleCONST= ruleCONST EOF ;
    public final String entryRuleCONST() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCONST = null;


        try {
            // InternalGo.g:3189:45: (iv_ruleCONST= ruleCONST EOF )
            // InternalGo.g:3190:2: iv_ruleCONST= ruleCONST EOF
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
    // InternalGo.g:3196:1: ruleCONST returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'const' ;
    public final AntlrDatatypeRuleToken ruleCONST() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3202:2: (kw= 'const' )
            // InternalGo.g:3203:2: kw= 'const'
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
    // InternalGo.g:3211:1: entryRuleCONTINUE returns [String current=null] : iv_ruleCONTINUE= ruleCONTINUE EOF ;
    public final String entryRuleCONTINUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCONTINUE = null;


        try {
            // InternalGo.g:3211:48: (iv_ruleCONTINUE= ruleCONTINUE EOF )
            // InternalGo.g:3212:2: iv_ruleCONTINUE= ruleCONTINUE EOF
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
    // InternalGo.g:3218:1: ruleCONTINUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'continue' ;
    public final AntlrDatatypeRuleToken ruleCONTINUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3224:2: (kw= 'continue' )
            // InternalGo.g:3225:2: kw= 'continue'
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
    // InternalGo.g:3233:1: entryRuleELSE returns [String current=null] : iv_ruleELSE= ruleELSE EOF ;
    public final String entryRuleELSE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELSE = null;


        try {
            // InternalGo.g:3233:44: (iv_ruleELSE= ruleELSE EOF )
            // InternalGo.g:3234:2: iv_ruleELSE= ruleELSE EOF
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
    // InternalGo.g:3240:1: ruleELSE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'else' ;
    public final AntlrDatatypeRuleToken ruleELSE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3246:2: (kw= 'else' )
            // InternalGo.g:3247:2: kw= 'else'
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
    // InternalGo.g:3255:1: entryRuleFOR returns [String current=null] : iv_ruleFOR= ruleFOR EOF ;
    public final String entryRuleFOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFOR = null;


        try {
            // InternalGo.g:3255:43: (iv_ruleFOR= ruleFOR EOF )
            // InternalGo.g:3256:2: iv_ruleFOR= ruleFOR EOF
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
    // InternalGo.g:3262:1: ruleFOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'for' ;
    public final AntlrDatatypeRuleToken ruleFOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3268:2: (kw= 'for' )
            // InternalGo.g:3269:2: kw= 'for'
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
    // InternalGo.g:3277:1: entryRuleFUNC returns [String current=null] : iv_ruleFUNC= ruleFUNC EOF ;
    public final String entryRuleFUNC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFUNC = null;


        try {
            // InternalGo.g:3277:44: (iv_ruleFUNC= ruleFUNC EOF )
            // InternalGo.g:3278:2: iv_ruleFUNC= ruleFUNC EOF
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
    // InternalGo.g:3284:1: ruleFUNC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'func' ;
    public final AntlrDatatypeRuleToken ruleFUNC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3290:2: (kw= 'func' )
            // InternalGo.g:3291:2: kw= 'func'
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
    // InternalGo.g:3299:1: entryRuleIF returns [String current=null] : iv_ruleIF= ruleIF EOF ;
    public final String entryRuleIF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIF = null;


        try {
            // InternalGo.g:3299:42: (iv_ruleIF= ruleIF EOF )
            // InternalGo.g:3300:2: iv_ruleIF= ruleIF EOF
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
    // InternalGo.g:3306:1: ruleIF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'if' ;
    public final AntlrDatatypeRuleToken ruleIF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3312:2: (kw= 'if' )
            // InternalGo.g:3313:2: kw= 'if'
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
    // InternalGo.g:3321:1: entryRuleIMPORT returns [String current=null] : iv_ruleIMPORT= ruleIMPORT EOF ;
    public final String entryRuleIMPORT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIMPORT = null;


        try {
            // InternalGo.g:3321:46: (iv_ruleIMPORT= ruleIMPORT EOF )
            // InternalGo.g:3322:2: iv_ruleIMPORT= ruleIMPORT EOF
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
    // InternalGo.g:3328:1: ruleIMPORT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'import' ;
    public final AntlrDatatypeRuleToken ruleIMPORT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3334:2: (kw= 'import' )
            // InternalGo.g:3335:2: kw= 'import'
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
    // InternalGo.g:3343:1: entryRuleRETURN returns [String current=null] : iv_ruleRETURN= ruleRETURN EOF ;
    public final String entryRuleRETURN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRETURN = null;


        try {
            // InternalGo.g:3343:46: (iv_ruleRETURN= ruleRETURN EOF )
            // InternalGo.g:3344:2: iv_ruleRETURN= ruleRETURN EOF
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
    // InternalGo.g:3350:1: ruleRETURN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'return' ;
    public final AntlrDatatypeRuleToken ruleRETURN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3356:2: (kw= 'return' )
            // InternalGo.g:3357:2: kw= 'return'
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
    // InternalGo.g:3365:1: entryRulePACKAGE returns [String current=null] : iv_rulePACKAGE= rulePACKAGE EOF ;
    public final String entryRulePACKAGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePACKAGE = null;


        try {
            // InternalGo.g:3365:47: (iv_rulePACKAGE= rulePACKAGE EOF )
            // InternalGo.g:3366:2: iv_rulePACKAGE= rulePACKAGE EOF
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
    // InternalGo.g:3372:1: rulePACKAGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'package' ;
    public final AntlrDatatypeRuleToken rulePACKAGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3378:2: (kw= 'package' )
            // InternalGo.g:3379:2: kw= 'package'
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
    // InternalGo.g:3387:1: entryRuleTYPE returns [String current=null] : iv_ruleTYPE= ruleTYPE EOF ;
    public final String entryRuleTYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTYPE = null;


        try {
            // InternalGo.g:3387:44: (iv_ruleTYPE= ruleTYPE EOF )
            // InternalGo.g:3388:2: iv_ruleTYPE= ruleTYPE EOF
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
    // InternalGo.g:3394:1: ruleTYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'type' ;
    public final AntlrDatatypeRuleToken ruleTYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3400:2: (kw= 'type' )
            // InternalGo.g:3401:2: kw= 'type'
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
    // InternalGo.g:3409:1: entryRuleVAR returns [String current=null] : iv_ruleVAR= ruleVAR EOF ;
    public final String entryRuleVAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVAR = null;


        try {
            // InternalGo.g:3409:43: (iv_ruleVAR= ruleVAR EOF )
            // InternalGo.g:3410:2: iv_ruleVAR= ruleVAR EOF
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
    // InternalGo.g:3416:1: ruleVAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'var' ;
    public final AntlrDatatypeRuleToken ruleVAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3422:2: (kw= 'var' )
            // InternalGo.g:3423:2: kw= 'var'
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
    // InternalGo.g:3431:1: entryRuleDEFAULT returns [String current=null] : iv_ruleDEFAULT= ruleDEFAULT EOF ;
    public final String entryRuleDEFAULT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDEFAULT = null;


        try {
            // InternalGo.g:3431:47: (iv_ruleDEFAULT= ruleDEFAULT EOF )
            // InternalGo.g:3432:2: iv_ruleDEFAULT= ruleDEFAULT EOF
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
    // InternalGo.g:3438:1: ruleDEFAULT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'default' ;
    public final AntlrDatatypeRuleToken ruleDEFAULT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3444:2: (kw= 'default' )
            // InternalGo.g:3445:2: kw= 'default'
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
    // InternalGo.g:3453:1: entryRuleSWITCH returns [String current=null] : iv_ruleSWITCH= ruleSWITCH EOF ;
    public final String entryRuleSWITCH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSWITCH = null;


        try {
            // InternalGo.g:3453:46: (iv_ruleSWITCH= ruleSWITCH EOF )
            // InternalGo.g:3454:2: iv_ruleSWITCH= ruleSWITCH EOF
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
    // InternalGo.g:3460:1: ruleSWITCH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'switch' ;
    public final AntlrDatatypeRuleToken ruleSWITCH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3466:2: (kw= 'switch' )
            // InternalGo.g:3467:2: kw= 'switch'
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
    // InternalGo.g:3475:1: entryRuleRANGE returns [String current=null] : iv_ruleRANGE= ruleRANGE EOF ;
    public final String entryRuleRANGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRANGE = null;


        try {
            // InternalGo.g:3475:45: (iv_ruleRANGE= ruleRANGE EOF )
            // InternalGo.g:3476:2: iv_ruleRANGE= ruleRANGE EOF
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
    // InternalGo.g:3482:1: ruleRANGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'range' ;
    public final AntlrDatatypeRuleToken ruleRANGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3488:2: (kw= 'range' )
            // InternalGo.g:3489:2: kw= 'range'
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
    // InternalGo.g:3497:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalGo.g:3497:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalGo.g:3498:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalGo.g:3504:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGo.g:3510:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGo.g:3511:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGo.g:3511:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGo.g:3512:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
              		
            }
            // InternalGo.g:3516:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGo.g:3517:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGo.g:3517:4: (lv_name_1_0= RULE_ID )
            // InternalGo.g:3518:5: lv_name_1_0= RULE_ID
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
        // InternalGo.g:1540:4: ( ruleELSE )
        // InternalGo.g:1540:5: ruleELSE
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
        // InternalGo.g:1560:4: ( ruleELSE )
        // InternalGo.g:1560:5: ruleELSE
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
        // InternalGo.g:1801:5: ( ruleAndExpression )
        // InternalGo.g:1801:6: ruleAndExpression
        {
        pushFollow(FOLLOW_2);
        ruleAndExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalGo

    // $ANTLR start synpred9_InternalGo
    public final void synpred9_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:1900:4: ( ruleSubMult )
        // InternalGo.g:1900:5: ruleSubMult
        {
        pushFollow(FOLLOW_2);
        ruleSubMult();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalGo

    // $ANTLR start synpred10_InternalGo
    public final void synpred10_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:1921:4: ( ruleSubMult )
        // InternalGo.g:1921:5: ruleSubMult
        {
        pushFollow(FOLLOW_2);
        ruleSubMult();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalGo

    // $ANTLR start synpred15_InternalGo
    public final void synpred15_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:2208:4: ( rulePrimaryExpression )
        // InternalGo.g:2208:5: rulePrimaryExpression
        {
        pushFollow(FOLLOW_2);
        rulePrimaryExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalGo

    // $ANTLR start synpred16_InternalGo
    public final void synpred16_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:2220:4: ( rulePrimaryExpression )
        // InternalGo.g:2220:5: rulePrimaryExpression
        {
        pushFollow(FOLLOW_2);
        rulePrimaryExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalGo

    // $ANTLR start synpred22_InternalGo
    public final void synpred22_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:2583:4: ( rulePrimaryExpression )
        // InternalGo.g:2583:5: rulePrimaryExpression
        {
        pushFollow(FOLLOW_2);
        rulePrimaryExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalGo

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
    public final boolean synpred9_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalGo_fragment(); // can never throw exception
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
    public final boolean synpred10_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalGo_fragment(); // can never throw exception
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
    static final String dfa_2s = "\3\uffff\1\15\13\uffff";
    static final String dfa_3s = "\1\4\2\5\1\4\13\uffff";
    static final String dfa_4s = "\1\102\2\10\1\102\13\uffff";
    static final String dfa_5s = "\4\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\12\1\2\1\1\1\13\1\11";
    static final String dfa_6s = "\17\uffff}>";
    static final String[] dfa_7s = {
            "\1\6\1\3\56\uffff\1\2\2\uffff\1\12\1\5\1\7\1\11\3\uffff\1\1\1\uffff\1\10\1\uffff\1\4",
            "\1\13\2\uffff\1\14",
            "\1\13\2\uffff\1\14",
            "\2\15\1\uffff\1\13\1\16\3\uffff\1\15\45\uffff\1\15\1\uffff\1\15\2\uffff\4\15\3\uffff\3\15\1\uffff\1\15",
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
    static final String dfa_9s = "\6\uffff\10\17\2\uffff";
    static final String dfa_10s = "\3\5\1\uffff\1\6\1\uffff\10\4\2\uffff";
    static final String dfa_11s = "\1\76\2\5\1\uffff\1\75\1\uffff\10\102\2\uffff";
    static final String dfa_12s = "\3\uffff\1\4\1\uffff\1\2\10\uffff\1\3\1\1";
    static final String dfa_13s = "\20\uffff}>";
    static final String[] dfa_14s = {
            "\1\3\56\uffff\1\2\11\uffff\1\1",
            "\1\4",
            "\1\4",
            "",
            "\1\5\41\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\16\uffff\1\6",
            "",
            "\2\17\1\uffff\1\16\4\uffff\1\17\45\uffff\1\17\1\uffff\1\17\2\uffff\4\17\3\uffff\3\17\1\uffff\1\17",
            "\2\17\1\uffff\1\16\4\uffff\1\17\45\uffff\1\17\1\uffff\1\17\2\uffff\4\17\3\uffff\3\17\1\uffff\1\17",
            "\2\17\1\uffff\1\16\4\uffff\1\17\45\uffff\1\17\1\uffff\1\17\2\uffff\4\17\3\uffff\3\17\1\uffff\1\17",
            "\2\17\1\uffff\1\16\4\uffff\1\17\45\uffff\1\17\1\uffff\1\17\2\uffff\4\17\3\uffff\3\17\1\uffff\1\17",
            "\2\17\1\uffff\1\16\4\uffff\1\17\45\uffff\1\17\1\uffff\1\17\2\uffff\4\17\3\uffff\3\17\1\uffff\1\17",
            "\2\17\1\uffff\1\16\4\uffff\1\17\45\uffff\1\17\1\uffff\1\17\2\uffff\4\17\3\uffff\3\17\1\uffff\1\17",
            "\2\17\1\uffff\1\16\4\uffff\1\17\45\uffff\1\17\1\uffff\1\17\2\uffff\4\17\3\uffff\3\17\1\uffff\1\17",
            "\2\17\1\uffff\1\16\4\uffff\1\17\45\uffff\1\17\1\uffff\1\17\2\uffff\4\17\3\uffff\3\17\1\uffff\1\17",
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
            return "289:2: ( ( (lv_declaration_0_0= ruleDecl ) ) | ( (lv_assignment_1_0= ruleAtribVar ) ) | ( (lv_atribuicao_2_0= ruleAtrib ) ) | ( (lv_reassignment_3_0= ruleReAtrib ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x4790000000000032L,0x0000000000000005L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x20007F0000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x20007F0000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x4791800000016030L,0x0000000000000005L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x4791800000016032L,0x0000000000000005L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0001800000016020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x8004000000001000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x4790000000001030L,0x0000000000000005L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0001800000016120L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x4790000000000030L,0x0000000000000005L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001800000016000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x20007F0000000042L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000010100L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000010200L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001800000016100L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x4011800000016500L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000000F800000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x000000F800000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x20007F0000000400L});

}