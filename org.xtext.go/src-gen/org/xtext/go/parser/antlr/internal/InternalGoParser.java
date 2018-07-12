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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_ID", "RULE_COMMA", "RULE_OPEN_PARENTHESES", "RULE_CLOSED_PARENTHESES", "RULE_OPEN_KEY", "RULE_DOISPONTOS", "RULE_CLOSED_KEY", "RULE_OPEN_BRACKETS", "RULE_INT", "RULE_CLOSED_BRACKETS", "RULE_STRING", "RULE_PLUSEQUALS", "RULE_MINUSEQUALS", "RULE_DOT", "RULE_PLUS", "RULE_MINUS", "RULE_ASTERICS", "RULE_BAR", "RULE_PLUSONE", "RULE_MINUSONE", "RULE_PONTOVIRGULA", "RULE_NEWLINE", "RULE_COMMENTS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'||'", "'&&'", "'<'", "'<='", "'=='", "'>='", "'>'", "'string'", "'int'", "'bool'", "'byte'", "'rune'", "'float32'", "'float64'", "'true'", "'false'", "'break'", "'case'", "'chan'", "'const'", "'continue'", "'else'", "'for'", "'func'", "'if'", "'import'", "'return'", "'package'", "'type'", "'var'", "'default'", "'switch'", "'range'", "'datatype'"
    };
    public static final int RULE_MINUSONE=24;
    public static final int T__50=50;
    public static final int RULE_OPEN_KEY=9;
    public static final int RULE_OPEN_PARENTHESES=7;
    public static final int RULE_BAR=22;
    public static final int RULE_DOISPONTOS=10;
    public static final int RULE_COMMENTS=27;
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
    public static final int RULE_PLUSONE=23;
    public static final int RULE_INT=13;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=28;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_PONTOVIRGULA=25;
    public static final int RULE_NEWLINE=26;
    public static final int RULE_ASTERICS=21;
    public static final int RULE_STRING=15;
    public static final int RULE_MINUSEQUALS=17;
    public static final int RULE_SL_COMMENT=29;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_OPEN_BRACKETS=12;
    public static final int RULE_PLUS=19;
    public static final int T__36=36;
    public static final int RULE_DOT=18;
    public static final int EOF=-1;
    public static final int T__32=32;
    public static final int RULE_WS=30;
    public static final int RULE_PLUSEQUALS=16;
    public static final int RULE_CLOSED_KEY=11;
    public static final int RULE_ANY_OTHER=31;
    public static final int RULE_MINUS=20;
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
    public static final int RULE_CLOSED_BRACKETS=14;

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
    // InternalGo.g:107:1: ruleGreeting returns [EObject current=null] : (this_MultDecVars_0= ruleMultDecVars | this_DecVar_1= ruleDecVar | this_DataType_2= ruleDataType | this_DecFunc_3= ruleDecFunc | this_EOL_4= RULE_EOL | this_Condition_5= ruleCondition | this_SwitchCase_6= ruleSwitchCase | ruleDecImport | this_CallFunc_8= ruleCallFunc | this_CallFor_9= ruleCallFor ) ;
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



        	enterRule();

        try {
            // InternalGo.g:113:2: ( (this_MultDecVars_0= ruleMultDecVars | this_DecVar_1= ruleDecVar | this_DataType_2= ruleDataType | this_DecFunc_3= ruleDecFunc | this_EOL_4= RULE_EOL | this_Condition_5= ruleCondition | this_SwitchCase_6= ruleSwitchCase | ruleDecImport | this_CallFunc_8= ruleCallFunc | this_CallFor_9= ruleCallFor ) )
            // InternalGo.g:114:2: (this_MultDecVars_0= ruleMultDecVars | this_DecVar_1= ruleDecVar | this_DataType_2= ruleDataType | this_DecFunc_3= ruleDecFunc | this_EOL_4= RULE_EOL | this_Condition_5= ruleCondition | this_SwitchCase_6= ruleSwitchCase | ruleDecImport | this_CallFunc_8= ruleCallFunc | this_CallFor_9= ruleCallFor )
            {
            // InternalGo.g:114:2: (this_MultDecVars_0= ruleMultDecVars | this_DecVar_1= ruleDecVar | this_DataType_2= ruleDataType | this_DecFunc_3= ruleDecFunc | this_EOL_4= RULE_EOL | this_Condition_5= ruleCondition | this_SwitchCase_6= ruleSwitchCase | ruleDecImport | this_CallFunc_8= ruleCallFunc | this_CallFor_9= ruleCallFor )
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

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalGo.g:203:1: entryRuleDecl returns [EObject current=null] : iv_ruleDecl= ruleDecl EOF ;
    public final EObject entryRuleDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecl = null;


        try {
            // InternalGo.g:203:45: (iv_ruleDecl= ruleDecl EOF )
            // InternalGo.g:204:2: iv_ruleDecl= ruleDecl EOF
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
    // InternalGo.g:210:1: ruleDecl returns [EObject current=null] : ( ruleModif ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) ) ) ;
    public final EObject ruleDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:216:2: ( ( ruleModif ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) ) ) )
            // InternalGo.g:217:2: ( ruleModif ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) ) )
            {
            // InternalGo.g:217:2: ( ruleModif ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) ) )
            // InternalGo.g:218:3: ruleModif ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) )
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
            // InternalGo.g:225:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGo.g:226:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGo.g:226:4: (lv_name_1_0= RULE_ID )
            // InternalGo.g:227:5: lv_name_1_0= RULE_ID
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

            // InternalGo.g:243:3: ( (lv_type_2_0= ruleTypes ) )
            // InternalGo.g:244:4: (lv_type_2_0= ruleTypes )
            {
            // InternalGo.g:244:4: (lv_type_2_0= ruleTypes )
            // InternalGo.g:245:5: lv_type_2_0= ruleTypes
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
    // InternalGo.g:266:1: entryRuleDecVar returns [EObject current=null] : iv_ruleDecVar= ruleDecVar EOF ;
    public final EObject entryRuleDecVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecVar = null;


        try {
            // InternalGo.g:266:47: (iv_ruleDecVar= ruleDecVar EOF )
            // InternalGo.g:267:2: iv_ruleDecVar= ruleDecVar EOF
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
    // InternalGo.g:273:1: ruleDecVar returns [EObject current=null] : ( ( (lv_declaration_0_0= ruleDecl ) ) | ( (lv_assignment_1_0= ruleAtribVar ) ) ) ;
    public final EObject ruleDecVar() throws RecognitionException {
        EObject current = null;

        EObject lv_declaration_0_0 = null;

        EObject lv_assignment_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:279:2: ( ( ( (lv_declaration_0_0= ruleDecl ) ) | ( (lv_assignment_1_0= ruleAtribVar ) ) ) )
            // InternalGo.g:280:2: ( ( (lv_declaration_0_0= ruleDecl ) ) | ( (lv_assignment_1_0= ruleAtribVar ) ) )
            {
            // InternalGo.g:280:2: ( ( (lv_declaration_0_0= ruleDecl ) ) | ( (lv_assignment_1_0= ruleAtribVar ) ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalGo.g:281:3: ( (lv_declaration_0_0= ruleDecl ) )
                    {
                    // InternalGo.g:281:3: ( (lv_declaration_0_0= ruleDecl ) )
                    // InternalGo.g:282:4: (lv_declaration_0_0= ruleDecl )
                    {
                    // InternalGo.g:282:4: (lv_declaration_0_0= ruleDecl )
                    // InternalGo.g:283:5: lv_declaration_0_0= ruleDecl
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
                    // InternalGo.g:301:3: ( (lv_assignment_1_0= ruleAtribVar ) )
                    {
                    // InternalGo.g:301:3: ( (lv_assignment_1_0= ruleAtribVar ) )
                    // InternalGo.g:302:4: (lv_assignment_1_0= ruleAtribVar )
                    {
                    // InternalGo.g:302:4: (lv_assignment_1_0= ruleAtribVar )
                    // InternalGo.g:303:5: lv_assignment_1_0= ruleAtribVar
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

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalGo.g:324:1: entryRuleAtribVar returns [EObject current=null] : iv_ruleAtribVar= ruleAtribVar EOF ;
    public final EObject entryRuleAtribVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtribVar = null;


        try {
            // InternalGo.g:324:49: (iv_ruleAtribVar= ruleAtribVar EOF )
            // InternalGo.g:325:2: iv_ruleAtribVar= ruleAtribVar EOF
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
    // InternalGo.g:331:1: ruleAtribVar returns [EObject current=null] : ( ruleModif ( (lv_vars_1_0= RULE_ID ) ) (this_Comma_2= RULE_COMMA ( (lv_vars_3_0= RULE_ID ) ) )* ( (lv_type_4_0= ruleTypes ) ) (otherlv_5= '=' ( ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) ) ) (this_Comma_7= RULE_COMMA ( ( (lv_atrb_8_1= ruleAtri | lv_atrb_8_2= RULE_ID ) ) ) )* )? ) ;
    public final EObject ruleAtribVar() throws RecognitionException {
        EObject current = null;

        Token lv_vars_1_0=null;
        Token this_Comma_2=null;
        Token lv_vars_3_0=null;
        Token otherlv_5=null;
        Token lv_atrb_6_2=null;
        Token this_Comma_7=null;
        Token lv_atrb_8_2=null;
        AntlrDatatypeRuleToken lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_atrb_6_1 = null;

        AntlrDatatypeRuleToken lv_atrb_8_1 = null;



        	enterRule();

        try {
            // InternalGo.g:337:2: ( ( ruleModif ( (lv_vars_1_0= RULE_ID ) ) (this_Comma_2= RULE_COMMA ( (lv_vars_3_0= RULE_ID ) ) )* ( (lv_type_4_0= ruleTypes ) ) (otherlv_5= '=' ( ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) ) ) (this_Comma_7= RULE_COMMA ( ( (lv_atrb_8_1= ruleAtri | lv_atrb_8_2= RULE_ID ) ) ) )* )? ) )
            // InternalGo.g:338:2: ( ruleModif ( (lv_vars_1_0= RULE_ID ) ) (this_Comma_2= RULE_COMMA ( (lv_vars_3_0= RULE_ID ) ) )* ( (lv_type_4_0= ruleTypes ) ) (otherlv_5= '=' ( ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) ) ) (this_Comma_7= RULE_COMMA ( ( (lv_atrb_8_1= ruleAtri | lv_atrb_8_2= RULE_ID ) ) ) )* )? )
            {
            // InternalGo.g:338:2: ( ruleModif ( (lv_vars_1_0= RULE_ID ) ) (this_Comma_2= RULE_COMMA ( (lv_vars_3_0= RULE_ID ) ) )* ( (lv_type_4_0= ruleTypes ) ) (otherlv_5= '=' ( ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) ) ) (this_Comma_7= RULE_COMMA ( ( (lv_atrb_8_1= ruleAtri | lv_atrb_8_2= RULE_ID ) ) ) )* )? )
            // InternalGo.g:339:3: ruleModif ( (lv_vars_1_0= RULE_ID ) ) (this_Comma_2= RULE_COMMA ( (lv_vars_3_0= RULE_ID ) ) )* ( (lv_type_4_0= ruleTypes ) ) (otherlv_5= '=' ( ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) ) ) (this_Comma_7= RULE_COMMA ( ( (lv_atrb_8_1= ruleAtri | lv_atrb_8_2= RULE_ID ) ) ) )* )?
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
            // InternalGo.g:346:3: ( (lv_vars_1_0= RULE_ID ) )
            // InternalGo.g:347:4: (lv_vars_1_0= RULE_ID )
            {
            // InternalGo.g:347:4: (lv_vars_1_0= RULE_ID )
            // InternalGo.g:348:5: lv_vars_1_0= RULE_ID
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

            // InternalGo.g:364:3: (this_Comma_2= RULE_COMMA ( (lv_vars_3_0= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGo.g:365:4: this_Comma_2= RULE_COMMA ( (lv_vars_3_0= RULE_ID ) )
            	    {
            	    this_Comma_2=(Token)match(input,RULE_COMMA,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_Comma_2, grammarAccess.getAtribVarAccess().getCommaTerminalRuleCall_2_0());
            	      			
            	    }
            	    // InternalGo.g:369:4: ( (lv_vars_3_0= RULE_ID ) )
            	    // InternalGo.g:370:5: (lv_vars_3_0= RULE_ID )
            	    {
            	    // InternalGo.g:370:5: (lv_vars_3_0= RULE_ID )
            	    // InternalGo.g:371:6: lv_vars_3_0= RULE_ID
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

            // InternalGo.g:388:3: ( (lv_type_4_0= ruleTypes ) )
            // InternalGo.g:389:4: (lv_type_4_0= ruleTypes )
            {
            // InternalGo.g:389:4: (lv_type_4_0= ruleTypes )
            // InternalGo.g:390:5: lv_type_4_0= ruleTypes
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

            // InternalGo.g:407:3: (otherlv_5= '=' ( ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) ) ) (this_Comma_7= RULE_COMMA ( ( (lv_atrb_8_1= ruleAtri | lv_atrb_8_2= RULE_ID ) ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==32) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGo.g:408:4: otherlv_5= '=' ( ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) ) ) (this_Comma_7= RULE_COMMA ( ( (lv_atrb_8_1= ruleAtri | lv_atrb_8_2= RULE_ID ) ) ) )*
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getAtribVarAccess().getEqualsSignKeyword_4_0());
                      			
                    }
                    // InternalGo.g:412:4: ( ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) ) )
                    // InternalGo.g:413:5: ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) )
                    {
                    // InternalGo.g:413:5: ( (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID ) )
                    // InternalGo.g:414:6: (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID )
                    {
                    // InternalGo.g:414:6: (lv_atrb_6_1= ruleAtri | lv_atrb_6_2= RULE_ID )
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
                            // InternalGo.g:415:7: lv_atrb_6_1= ruleAtri
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getAtribVarAccess().getAtrbAtriParserRuleCall_4_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_9);
                            lv_atrb_6_1=ruleAtri();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getAtribVarRule());
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
                            // InternalGo.g:431:7: lv_atrb_6_2= RULE_ID
                            {
                            lv_atrb_6_2=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_atrb_6_2, grammarAccess.getAtribVarAccess().getAtrbIDTerminalRuleCall_4_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getAtribVarRule());
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

                    // InternalGo.g:448:4: (this_Comma_7= RULE_COMMA ( ( (lv_atrb_8_1= ruleAtri | lv_atrb_8_2= RULE_ID ) ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_COMMA) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalGo.g:449:5: this_Comma_7= RULE_COMMA ( ( (lv_atrb_8_1= ruleAtri | lv_atrb_8_2= RULE_ID ) ) )
                    	    {
                    	    this_Comma_7=(Token)match(input,RULE_COMMA,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_Comma_7, grammarAccess.getAtribVarAccess().getCommaTerminalRuleCall_4_2_0());
                    	      				
                    	    }
                    	    // InternalGo.g:453:5: ( ( (lv_atrb_8_1= ruleAtri | lv_atrb_8_2= RULE_ID ) ) )
                    	    // InternalGo.g:454:6: ( (lv_atrb_8_1= ruleAtri | lv_atrb_8_2= RULE_ID ) )
                    	    {
                    	    // InternalGo.g:454:6: ( (lv_atrb_8_1= ruleAtri | lv_atrb_8_2= RULE_ID ) )
                    	    // InternalGo.g:455:7: (lv_atrb_8_1= ruleAtri | lv_atrb_8_2= RULE_ID )
                    	    {
                    	    // InternalGo.g:455:7: (lv_atrb_8_1= ruleAtri | lv_atrb_8_2= RULE_ID )
                    	    int alt6=2;
                    	    int LA6_0 = input.LA(1);

                    	    if ( ((LA6_0>=RULE_OPEN_BRACKETS && LA6_0<=RULE_INT)||LA6_0==RULE_STRING||(LA6_0>=47 && LA6_0<=48)) ) {
                    	        alt6=1;
                    	    }
                    	    else if ( (LA6_0==RULE_ID) ) {
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
                    	            // InternalGo.g:456:8: lv_atrb_8_1= ruleAtri
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              								newCompositeNode(grammarAccess.getAtribVarAccess().getAtrbAtriParserRuleCall_4_2_1_0_0());
                    	              							
                    	            }
                    	            pushFollow(FOLLOW_9);
                    	            lv_atrb_8_1=ruleAtri();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								if (current==null) {
                    	              									current = createModelElementForParent(grammarAccess.getAtribVarRule());
                    	              								}
                    	              								add(
                    	              									current,
                    	              									"atrb",
                    	              									lv_atrb_8_1,
                    	              									"org.xtext.go.Go.Atri");
                    	              								afterParserOrEnumRuleCall();
                    	              							
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalGo.g:472:8: lv_atrb_8_2= RULE_ID
                    	            {
                    	            lv_atrb_8_2=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								newLeafNode(lv_atrb_8_2, grammarAccess.getAtribVarAccess().getAtrbIDTerminalRuleCall_4_2_1_0_1());
                    	              							
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              								if (current==null) {
                    	              									current = createModelElement(grammarAccess.getAtribVarRule());
                    	              								}
                    	              								addWithLastConsumed(
                    	              									current,
                    	              									"atrb",
                    	              									lv_atrb_8_2,
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
                    	    break loop7;
                        }
                    } while (true);


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


    // $ANTLR start "entryRuleMultDecVars"
    // InternalGo.g:495:1: entryRuleMultDecVars returns [EObject current=null] : iv_ruleMultDecVars= ruleMultDecVars EOF ;
    public final EObject entryRuleMultDecVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultDecVars = null;


        try {
            // InternalGo.g:495:52: (iv_ruleMultDecVars= ruleMultDecVars EOF )
            // InternalGo.g:496:2: iv_ruleMultDecVars= ruleMultDecVars EOF
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
    // InternalGo.g:502:1: ruleMultDecVars returns [EObject current=null] : ( ruleModif this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( ruleTypeValue | ( (lv_value_5_0= RULE_ID ) ) ) )* this_Closed_parentheses_6= RULE_CLOSED_PARENTHESES ) ;
    public final EObject ruleMultDecVars() throws RecognitionException {
        EObject current = null;

        Token this_Open_parentheses_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_value_5_0=null;
        Token this_Closed_parentheses_6=null;


        	enterRule();

        try {
            // InternalGo.g:508:2: ( ( ruleModif this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( ruleTypeValue | ( (lv_value_5_0= RULE_ID ) ) ) )* this_Closed_parentheses_6= RULE_CLOSED_PARENTHESES ) )
            // InternalGo.g:509:2: ( ruleModif this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( ruleTypeValue | ( (lv_value_5_0= RULE_ID ) ) ) )* this_Closed_parentheses_6= RULE_CLOSED_PARENTHESES )
            {
            // InternalGo.g:509:2: ( ruleModif this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( ruleTypeValue | ( (lv_value_5_0= RULE_ID ) ) ) )* this_Closed_parentheses_6= RULE_CLOSED_PARENTHESES )
            // InternalGo.g:510:3: ruleModif this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( ruleTypeValue | ( (lv_value_5_0= RULE_ID ) ) ) )* this_Closed_parentheses_6= RULE_CLOSED_PARENTHESES
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultDecVarsAccess().getModifParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_10);
            ruleModif();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_Open_parentheses_1=(Token)match(input,RULE_OPEN_PARENTHESES,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Open_parentheses_1, grammarAccess.getMultDecVarsAccess().getOpen_parenthesesTerminalRuleCall_1());
              		
            }
            // InternalGo.g:521:3: ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( ruleTypeValue | ( (lv_value_5_0= RULE_ID ) ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGo.g:522:4: ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( ruleTypeValue | ( (lv_value_5_0= RULE_ID ) ) )
            	    {
            	    // InternalGo.g:522:4: ( (lv_name_2_0= RULE_ID ) )
            	    // InternalGo.g:523:5: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalGo.g:523:5: (lv_name_2_0= RULE_ID )
            	    // InternalGo.g:524:6: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
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

            	    otherlv_3=(Token)match(input,32,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getMultDecVarsAccess().getEqualsSignKeyword_2_1());
            	      			
            	    }
            	    // InternalGo.g:544:4: ( ruleTypeValue | ( (lv_value_5_0= RULE_ID ) ) )
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
            	            // InternalGo.g:545:5: ruleTypeValue
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getMultDecVarsAccess().getTypeValueParserRuleCall_2_2_0());
            	              				
            	            }
            	            pushFollow(FOLLOW_11);
            	            ruleTypeValue();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalGo.g:553:5: ( (lv_value_5_0= RULE_ID ) )
            	            {
            	            // InternalGo.g:553:5: ( (lv_value_5_0= RULE_ID ) )
            	            // InternalGo.g:554:6: (lv_value_5_0= RULE_ID )
            	            {
            	            // InternalGo.g:554:6: (lv_value_5_0= RULE_ID )
            	            // InternalGo.g:555:7: lv_value_5_0= RULE_ID
            	            {
            	            lv_value_5_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
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


    // $ANTLR start "entryRuleSwitchCase"
    // InternalGo.g:581:1: entryRuleSwitchCase returns [EObject current=null] : iv_ruleSwitchCase= ruleSwitchCase EOF ;
    public final EObject entryRuleSwitchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchCase = null;


        try {
            // InternalGo.g:581:51: (iv_ruleSwitchCase= ruleSwitchCase EOF )
            // InternalGo.g:582:2: iv_ruleSwitchCase= ruleSwitchCase EOF
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
    // InternalGo.g:588:1: ruleSwitchCase returns [EObject current=null] : ( ruleSWITCH ( (lv_name_1_0= RULE_ID ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_cas_3_0= ruleCases ) )* ( ruleDEFAULT this_DoisPontos_5= RULE_DOISPONTOS ( (lv_k_6_0= ruleGreeting ) )* )? this_Closed_Key_7= RULE_CLOSED_KEY ) ;
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
            // InternalGo.g:594:2: ( ( ruleSWITCH ( (lv_name_1_0= RULE_ID ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_cas_3_0= ruleCases ) )* ( ruleDEFAULT this_DoisPontos_5= RULE_DOISPONTOS ( (lv_k_6_0= ruleGreeting ) )* )? this_Closed_Key_7= RULE_CLOSED_KEY ) )
            // InternalGo.g:595:2: ( ruleSWITCH ( (lv_name_1_0= RULE_ID ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_cas_3_0= ruleCases ) )* ( ruleDEFAULT this_DoisPontos_5= RULE_DOISPONTOS ( (lv_k_6_0= ruleGreeting ) )* )? this_Closed_Key_7= RULE_CLOSED_KEY )
            {
            // InternalGo.g:595:2: ( ruleSWITCH ( (lv_name_1_0= RULE_ID ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_cas_3_0= ruleCases ) )* ( ruleDEFAULT this_DoisPontos_5= RULE_DOISPONTOS ( (lv_k_6_0= ruleGreeting ) )* )? this_Closed_Key_7= RULE_CLOSED_KEY )
            // InternalGo.g:596:3: ruleSWITCH ( (lv_name_1_0= RULE_ID ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_cas_3_0= ruleCases ) )* ( ruleDEFAULT this_DoisPontos_5= RULE_DOISPONTOS ( (lv_k_6_0= ruleGreeting ) )* )? this_Closed_Key_7= RULE_CLOSED_KEY
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
            // InternalGo.g:603:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGo.g:604:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGo.g:604:4: (lv_name_1_0= RULE_ID )
            // InternalGo.g:605:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
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

            this_Open_Key_2=(Token)match(input,RULE_OPEN_KEY,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Open_Key_2, grammarAccess.getSwitchCaseAccess().getOpen_KeyTerminalRuleCall_2());
              		
            }
            // InternalGo.g:625:3: ( (lv_cas_3_0= ruleCases ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==50) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGo.g:626:4: (lv_cas_3_0= ruleCases )
            	    {
            	    // InternalGo.g:626:4: (lv_cas_3_0= ruleCases )
            	    // InternalGo.g:627:5: lv_cas_3_0= ruleCases
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSwitchCaseAccess().getCasCasesParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_14);
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
            	    break loop11;
                }
            } while (true);

            // InternalGo.g:644:3: ( ruleDEFAULT this_DoisPontos_5= RULE_DOISPONTOS ( (lv_k_6_0= ruleGreeting ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==63) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGo.g:645:4: ruleDEFAULT this_DoisPontos_5= RULE_DOISPONTOS ( (lv_k_6_0= ruleGreeting ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSwitchCaseAccess().getDEFAULTParserRuleCall_4_0());
                      			
                    }
                    pushFollow(FOLLOW_15);
                    ruleDEFAULT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    this_DoisPontos_5=(Token)match(input,RULE_DOISPONTOS,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DoisPontos_5, grammarAccess.getSwitchCaseAccess().getDoisPontosTerminalRuleCall_4_1());
                      			
                    }
                    // InternalGo.g:656:4: ( (lv_k_6_0= ruleGreeting ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>=RULE_EOL && LA12_0<=RULE_ID)||LA12_0==52||(LA12_0>=55 && LA12_0<=58)||LA12_0==62||LA12_0==64||LA12_0==66) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalGo.g:657:5: (lv_k_6_0= ruleGreeting )
                    	    {
                    	    // InternalGo.g:657:5: (lv_k_6_0= ruleGreeting )
                    	    // InternalGo.g:658:6: lv_k_6_0= ruleGreeting
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getSwitchCaseAccess().getKGreetingParserRuleCall_4_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_16);
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
                    	    break loop12;
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
    // InternalGo.g:684:1: entryRuleCases returns [EObject current=null] : iv_ruleCases= ruleCases EOF ;
    public final EObject entryRuleCases() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCases = null;


        try {
            // InternalGo.g:684:46: (iv_ruleCases= ruleCases EOF )
            // InternalGo.g:685:2: iv_ruleCases= ruleCases EOF
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
    // InternalGo.g:691:1: ruleCases returns [EObject current=null] : ( ruleCASE ( (lv_x_1_0= ruleExpression ) ) this_DoisPontos_2= RULE_DOISPONTOS ( (lv_v_3_0= ruleGreeting ) )* ) ;
    public final EObject ruleCases() throws RecognitionException {
        EObject current = null;

        Token this_DoisPontos_2=null;
        EObject lv_x_1_0 = null;

        EObject lv_v_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:697:2: ( ( ruleCASE ( (lv_x_1_0= ruleExpression ) ) this_DoisPontos_2= RULE_DOISPONTOS ( (lv_v_3_0= ruleGreeting ) )* ) )
            // InternalGo.g:698:2: ( ruleCASE ( (lv_x_1_0= ruleExpression ) ) this_DoisPontos_2= RULE_DOISPONTOS ( (lv_v_3_0= ruleGreeting ) )* )
            {
            // InternalGo.g:698:2: ( ruleCASE ( (lv_x_1_0= ruleExpression ) ) this_DoisPontos_2= RULE_DOISPONTOS ( (lv_v_3_0= ruleGreeting ) )* )
            // InternalGo.g:699:3: ruleCASE ( (lv_x_1_0= ruleExpression ) ) this_DoisPontos_2= RULE_DOISPONTOS ( (lv_v_3_0= ruleGreeting ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCasesAccess().getCASEParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_17);
            ruleCASE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:706:3: ( (lv_x_1_0= ruleExpression ) )
            // InternalGo.g:707:4: (lv_x_1_0= ruleExpression )
            {
            // InternalGo.g:707:4: (lv_x_1_0= ruleExpression )
            // InternalGo.g:708:5: lv_x_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCasesAccess().getXExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
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

            this_DoisPontos_2=(Token)match(input,RULE_DOISPONTOS,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DoisPontos_2, grammarAccess.getCasesAccess().getDoisPontosTerminalRuleCall_2());
              		
            }
            // InternalGo.g:729:3: ( (lv_v_3_0= ruleGreeting ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_EOL && LA14_0<=RULE_ID)||LA14_0==52||(LA14_0>=55 && LA14_0<=58)||LA14_0==62||LA14_0==64||LA14_0==66) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGo.g:730:4: (lv_v_3_0= ruleGreeting )
            	    {
            	    // InternalGo.g:730:4: (lv_v_3_0= ruleGreeting )
            	    // InternalGo.g:731:5: lv_v_3_0= ruleGreeting
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
    // $ANTLR end "ruleCases"


    // $ANTLR start "entryRuleAtri"
    // InternalGo.g:752:1: entryRuleAtri returns [String current=null] : iv_ruleAtri= ruleAtri EOF ;
    public final String entryRuleAtri() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAtri = null;


        try {
            // InternalGo.g:752:44: (iv_ruleAtri= ruleAtri EOF )
            // InternalGo.g:753:2: iv_ruleAtri= ruleAtri EOF
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
    // InternalGo.g:759:1: ruleAtri returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS this_Types_3= ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? ) | this_TypeValue_7= ruleTypeValue ) ;
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
            // InternalGo.g:765:2: ( ( (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS this_Types_3= ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? ) | this_TypeValue_7= ruleTypeValue ) )
            // InternalGo.g:766:2: ( (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS this_Types_3= ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? ) | this_TypeValue_7= ruleTypeValue )
            {
            // InternalGo.g:766:2: ( (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS this_Types_3= ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? ) | this_TypeValue_7= ruleTypeValue )
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
                    // InternalGo.g:767:3: (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS this_Types_3= ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? )
                    {
                    // InternalGo.g:767:3: (this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS this_Types_3= ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )? )
                    // InternalGo.g:768:4: this_Open_brackets_0= RULE_OPEN_BRACKETS (this_INT_1= RULE_INT )? this_Closed_brackets_2= RULE_CLOSED_BRACKETS this_Types_3= ruleTypes (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )?
                    {
                    this_Open_brackets_0=(Token)match(input,RULE_OPEN_BRACKETS,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Open_brackets_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Open_brackets_0, grammarAccess.getAtriAccess().getOpen_bracketsTerminalRuleCall_0_0());
                      			
                    }
                    // InternalGo.g:775:4: (this_INT_1= RULE_INT )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_INT) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalGo.g:776:5: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_20); if (state.failed) return current;
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
                    pushFollow(FOLLOW_21);
                    this_Types_3=ruleTypes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Types_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:801:4: (this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_OPEN_KEY) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalGo.g:802:5: this_Open_Key_4= RULE_OPEN_KEY this_TypeValue_5= ruleTypeValue this_Closed_Key_6= RULE_CLOSED_KEY
                            {
                            this_Open_Key_4=(Token)match(input,RULE_OPEN_KEY,FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_Open_Key_4);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_Open_Key_4, grammarAccess.getAtriAccess().getOpen_KeyTerminalRuleCall_0_4_0());
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getAtriAccess().getTypeValueParserRuleCall_0_4_1());
                              				
                            }
                            pushFollow(FOLLOW_23);
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
                    // InternalGo.g:829:3: this_TypeValue_7= ruleTypeValue
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
    // InternalGo.g:843:1: entryRuleParams returns [EObject current=null] : iv_ruleParams= ruleParams EOF ;
    public final EObject entryRuleParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParams = null;


        try {
            // InternalGo.g:843:47: (iv_ruleParams= ruleParams EOF )
            // InternalGo.g:844:2: iv_ruleParams= ruleParams EOF
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
    // InternalGo.g:850:1: ruleParams returns [EObject current=null] : ( ( (lv_params_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypes ) ) (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ( (lv_type_4_0= ruleTypes ) ) )* ) ;
    public final EObject ruleParams() throws RecognitionException {
        EObject current = null;

        Token lv_params_0_0=null;
        Token this_Comma_2=null;
        Token lv_params_3_0=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalGo.g:856:2: ( ( ( (lv_params_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypes ) ) (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ( (lv_type_4_0= ruleTypes ) ) )* ) )
            // InternalGo.g:857:2: ( ( (lv_params_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypes ) ) (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ( (lv_type_4_0= ruleTypes ) ) )* )
            {
            // InternalGo.g:857:2: ( ( (lv_params_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypes ) ) (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ( (lv_type_4_0= ruleTypes ) ) )* )
            // InternalGo.g:858:3: ( (lv_params_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypes ) ) (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ( (lv_type_4_0= ruleTypes ) ) )*
            {
            // InternalGo.g:858:3: ( (lv_params_0_0= RULE_ID ) )
            // InternalGo.g:859:4: (lv_params_0_0= RULE_ID )
            {
            // InternalGo.g:859:4: (lv_params_0_0= RULE_ID )
            // InternalGo.g:860:5: lv_params_0_0= RULE_ID
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

            // InternalGo.g:876:3: ( (lv_type_1_0= ruleTypes ) )
            // InternalGo.g:877:4: (lv_type_1_0= ruleTypes )
            {
            // InternalGo.g:877:4: (lv_type_1_0= ruleTypes )
            // InternalGo.g:878:5: lv_type_1_0= ruleTypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParamsAccess().getTypeTypesParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_9);
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

            // InternalGo.g:895:3: (this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ( (lv_type_4_0= ruleTypes ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_COMMA) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGo.g:896:4: this_Comma_2= RULE_COMMA ( (lv_params_3_0= RULE_ID ) ) ( (lv_type_4_0= ruleTypes ) )
            	    {
            	    this_Comma_2=(Token)match(input,RULE_COMMA,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_Comma_2, grammarAccess.getParamsAccess().getCommaTerminalRuleCall_2_0());
            	      			
            	    }
            	    // InternalGo.g:900:4: ( (lv_params_3_0= RULE_ID ) )
            	    // InternalGo.g:901:5: (lv_params_3_0= RULE_ID )
            	    {
            	    // InternalGo.g:901:5: (lv_params_3_0= RULE_ID )
            	    // InternalGo.g:902:6: lv_params_3_0= RULE_ID
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

            	    // InternalGo.g:918:4: ( (lv_type_4_0= ruleTypes ) )
            	    // InternalGo.g:919:5: (lv_type_4_0= ruleTypes )
            	    {
            	    // InternalGo.g:919:5: (lv_type_4_0= ruleTypes )
            	    // InternalGo.g:920:6: lv_type_4_0= ruleTypes
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getParamsAccess().getTypeTypesParserRuleCall_2_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_9);
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
    // InternalGo.g:942:1: entryRuleTypeValue returns [String current=null] : iv_ruleTypeValue= ruleTypeValue EOF ;
    public final String entryRuleTypeValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeValue = null;


        try {
            // InternalGo.g:942:49: (iv_ruleTypeValue= ruleTypeValue EOF )
            // InternalGo.g:943:2: iv_ruleTypeValue= ruleTypeValue EOF
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
    // InternalGo.g:949:1: ruleTypeValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_Numbers_1= ruleNumbers | this_Boolean_2= ruleBoolean ) ;
    public final AntlrDatatypeRuleToken ruleTypeValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_Numbers_1 = null;

        AntlrDatatypeRuleToken this_Boolean_2 = null;



        	enterRule();

        try {
            // InternalGo.g:955:2: ( (this_STRING_0= RULE_STRING | this_Numbers_1= ruleNumbers | this_Boolean_2= ruleBoolean ) )
            // InternalGo.g:956:2: (this_STRING_0= RULE_STRING | this_Numbers_1= ruleNumbers | this_Boolean_2= ruleBoolean )
            {
            // InternalGo.g:956:2: (this_STRING_0= RULE_STRING | this_Numbers_1= ruleNumbers | this_Boolean_2= ruleBoolean )
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
                    // InternalGo.g:957:3: this_STRING_0= RULE_STRING
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
                    // InternalGo.g:965:3: this_Numbers_1= ruleNumbers
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
                    // InternalGo.g:976:3: this_Boolean_2= ruleBoolean
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
    // InternalGo.g:990:1: entryRuleDecImport returns [String current=null] : iv_ruleDecImport= ruleDecImport EOF ;
    public final String entryRuleDecImport() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecImport = null;


        try {
            // InternalGo.g:990:49: (iv_ruleDecImport= ruleDecImport EOF )
            // InternalGo.g:991:2: iv_ruleDecImport= ruleDecImport EOF
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
    // InternalGo.g:997:1: ruleDecImport returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IMPORT_0= ruleIMPORT (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) ) ) ;
    public final AntlrDatatypeRuleToken ruleDecImport() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_1=null;
        Token this_Open_parentheses_2=null;
        Token this_STRING_3=null;
        Token this_Closed_parentheses_4=null;
        AntlrDatatypeRuleToken this_IMPORT_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1003:2: ( (this_IMPORT_0= ruleIMPORT (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) ) ) )
            // InternalGo.g:1004:2: (this_IMPORT_0= ruleIMPORT (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) ) )
            {
            // InternalGo.g:1004:2: (this_IMPORT_0= ruleIMPORT (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) ) )
            // InternalGo.g:1005:3: this_IMPORT_0= ruleIMPORT (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) )
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDecImportAccess().getIMPORTParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_IMPORT_0=ruleIMPORT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IMPORT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1015:3: (this_STRING_1= RULE_STRING | (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES ) )
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
                    // InternalGo.g:1016:4: this_STRING_1= RULE_STRING
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
                    // InternalGo.g:1024:4: (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES )
                    {
                    // InternalGo.g:1024:4: (this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES )
                    // InternalGo.g:1025:5: this_Open_parentheses_2= RULE_OPEN_PARENTHESES (this_STRING_3= RULE_STRING )+ this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES
                    {
                    this_Open_parentheses_2=(Token)match(input,RULE_OPEN_PARENTHESES,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Open_parentheses_2);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_Open_parentheses_2, grammarAccess.getDecImportAccess().getOpen_parenthesesTerminalRuleCall_1_1_0());
                      				
                    }
                    // InternalGo.g:1032:5: (this_STRING_3= RULE_STRING )+
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
                    	    // InternalGo.g:1033:6: this_STRING_3= RULE_STRING
                    	    {
                    	    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_26); if (state.failed) return current;
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
    // InternalGo.g:1054:1: entryRuleOperationsOneEquals returns [EObject current=null] : iv_ruleOperationsOneEquals= ruleOperationsOneEquals EOF ;
    public final EObject entryRuleOperationsOneEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationsOneEquals = null;


        try {
            // InternalGo.g:1054:60: (iv_ruleOperationsOneEquals= ruleOperationsOneEquals EOF )
            // InternalGo.g:1055:2: iv_ruleOperationsOneEquals= ruleOperationsOneEquals EOF
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
    // InternalGo.g:1061:1: ruleOperationsOneEquals returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusEquals_1= RULE_PLUSEQUALS | this_MinusEquals_2= RULE_MINUSEQUALS ) (this_ID_3= RULE_ID | ruleNumbers ) ) ;
    public final EObject ruleOperationsOneEquals() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_PlusEquals_1=null;
        Token this_MinusEquals_2=null;
        Token this_ID_3=null;


        	enterRule();

        try {
            // InternalGo.g:1067:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusEquals_1= RULE_PLUSEQUALS | this_MinusEquals_2= RULE_MINUSEQUALS ) (this_ID_3= RULE_ID | ruleNumbers ) ) )
            // InternalGo.g:1068:2: ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusEquals_1= RULE_PLUSEQUALS | this_MinusEquals_2= RULE_MINUSEQUALS ) (this_ID_3= RULE_ID | ruleNumbers ) )
            {
            // InternalGo.g:1068:2: ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusEquals_1= RULE_PLUSEQUALS | this_MinusEquals_2= RULE_MINUSEQUALS ) (this_ID_3= RULE_ID | ruleNumbers ) )
            // InternalGo.g:1069:3: ( (lv_name_0_0= RULE_ID ) ) (this_PlusEquals_1= RULE_PLUSEQUALS | this_MinusEquals_2= RULE_MINUSEQUALS ) (this_ID_3= RULE_ID | ruleNumbers )
            {
            // InternalGo.g:1069:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGo.g:1070:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGo.g:1070:4: (lv_name_0_0= RULE_ID )
            // InternalGo.g:1071:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
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

            // InternalGo.g:1087:3: (this_PlusEquals_1= RULE_PLUSEQUALS | this_MinusEquals_2= RULE_MINUSEQUALS )
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
                    // InternalGo.g:1088:4: this_PlusEquals_1= RULE_PLUSEQUALS
                    {
                    this_PlusEquals_1=(Token)match(input,RULE_PLUSEQUALS,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_PlusEquals_1, grammarAccess.getOperationsOneEqualsAccess().getPlusEqualsTerminalRuleCall_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1093:4: this_MinusEquals_2= RULE_MINUSEQUALS
                    {
                    this_MinusEquals_2=(Token)match(input,RULE_MINUSEQUALS,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_MinusEquals_2, grammarAccess.getOperationsOneEqualsAccess().getMinusEqualsTerminalRuleCall_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalGo.g:1098:3: (this_ID_3= RULE_ID | ruleNumbers )
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
                    // InternalGo.g:1099:4: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_3, grammarAccess.getOperationsOneEqualsAccess().getIDTerminalRuleCall_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:1104:4: ruleNumbers
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


    // $ANTLR start "entryRuleNumbers"
    // InternalGo.g:1116:1: entryRuleNumbers returns [String current=null] : iv_ruleNumbers= ruleNumbers EOF ;
    public final String entryRuleNumbers() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumbers = null;


        try {
            // InternalGo.g:1116:47: (iv_ruleNumbers= ruleNumbers EOF )
            // InternalGo.g:1117:2: iv_ruleNumbers= ruleNumbers EOF
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
    // InternalGo.g:1123:1: ruleNumbers returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_Double_1= ruleDouble ) ;
    public final AntlrDatatypeRuleToken ruleNumbers() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        AntlrDatatypeRuleToken this_Double_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1129:2: ( (this_INT_0= RULE_INT | this_Double_1= ruleDouble ) )
            // InternalGo.g:1130:2: (this_INT_0= RULE_INT | this_Double_1= ruleDouble )
            {
            // InternalGo.g:1130:2: (this_INT_0= RULE_INT | this_Double_1= ruleDouble )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==EOF||(LA24_1>=RULE_EOL && LA24_1<=RULE_COMMA)||(LA24_1>=RULE_CLOSED_PARENTHESES && LA24_1<=RULE_CLOSED_KEY)||(LA24_1>=RULE_PLUS && LA24_1<=RULE_BAR)||LA24_1==RULE_PONTOVIRGULA||(LA24_1>=33 && LA24_1<=39)||LA24_1==50||LA24_1==52||(LA24_1>=55 && LA24_1<=58)||(LA24_1>=62 && LA24_1<=64)||LA24_1==66) ) {
                    alt24=1;
                }
                else if ( (LA24_1==RULE_DOT) ) {
                    alt24=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalGo.g:1131:3: this_INT_0= RULE_INT
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
                    // InternalGo.g:1139:3: this_Double_1= ruleDouble
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
    // InternalGo.g:1153:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalGo.g:1153:46: (iv_ruleDouble= ruleDouble EOF )
            // InternalGo.g:1154:2: iv_ruleDouble= ruleDouble EOF
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
    // InternalGo.g:1160:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT this_Dot_1= RULE_DOT this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_Dot_1=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalGo.g:1166:2: ( (this_INT_0= RULE_INT this_Dot_1= RULE_DOT this_INT_2= RULE_INT ) )
            // InternalGo.g:1167:2: (this_INT_0= RULE_INT this_Dot_1= RULE_DOT this_INT_2= RULE_INT )
            {
            // InternalGo.g:1167:2: (this_INT_0= RULE_INT this_Dot_1= RULE_DOT this_INT_2= RULE_INT )
            // InternalGo.g:1168:3: this_INT_0= RULE_INT this_Dot_1= RULE_DOT this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0());
              		
            }
            this_Dot_1=(Token)match(input,RULE_DOT,FOLLOW_30); if (state.failed) return current;
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
    // InternalGo.g:1193:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalGo.g:1193:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalGo.g:1194:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalGo.g:1200:1: ruleCondition returns [EObject current=null] : ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_if_0_0 = null;

        EObject lv_elseif_1_0 = null;

        EObject lv_else_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1206:2: ( ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )? ) )
            // InternalGo.g:1207:2: ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )? )
            {
            // InternalGo.g:1207:2: ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )? )
            // InternalGo.g:1208:3: ( (lv_if_0_0= ruleIfCondition ) ) ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )?
            {
            // InternalGo.g:1208:3: ( (lv_if_0_0= ruleIfCondition ) )
            // InternalGo.g:1209:4: (lv_if_0_0= ruleIfCondition )
            {
            // InternalGo.g:1209:4: (lv_if_0_0= ruleIfCondition )
            // InternalGo.g:1210:5: lv_if_0_0= ruleIfCondition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionAccess().getIfIfConditionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_31);
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

            // InternalGo.g:1227:3: ( ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==54) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==57) && (synpred1_InternalGo())) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // InternalGo.g:1228:4: ( ruleELSE )=> (lv_elseif_1_0= ruleElseIfCondition )
            	    {
            	    // InternalGo.g:1229:4: (lv_elseif_1_0= ruleElseIfCondition )
            	    // InternalGo.g:1230:5: lv_elseif_1_0= ruleElseIfCondition
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConditionAccess().getElseifElseIfConditionParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_31);
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
            	    break loop25;
                }
            } while (true);

            // InternalGo.g:1247:3: ( ( ruleELSE )=> (lv_else_2_0= ruleElseCondition ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==54) && (synpred2_InternalGo())) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGo.g:1248:4: ( ruleELSE )=> (lv_else_2_0= ruleElseCondition )
                    {
                    // InternalGo.g:1249:4: (lv_else_2_0= ruleElseCondition )
                    // InternalGo.g:1250:5: lv_else_2_0= ruleElseCondition
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
    // InternalGo.g:1271:1: entryRuleIfCondition returns [EObject current=null] : iv_ruleIfCondition= ruleIfCondition EOF ;
    public final EObject entryRuleIfCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfCondition = null;


        try {
            // InternalGo.g:1271:52: (iv_ruleIfCondition= ruleIfCondition EOF )
            // InternalGo.g:1272:2: iv_ruleIfCondition= ruleIfCondition EOF
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
    // InternalGo.g:1278:1: ruleIfCondition returns [EObject current=null] : ( ruleIF ( ( ruleAndExpression )=> (lv_cond_1_0= ruleOrExpression ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_then_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY ) ;
    public final EObject ruleIfCondition() throws RecognitionException {
        EObject current = null;

        Token this_Open_Key_2=null;
        Token this_Closed_Key_4=null;
        EObject lv_cond_1_0 = null;

        EObject lv_then_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1284:2: ( ( ruleIF ( ( ruleAndExpression )=> (lv_cond_1_0= ruleOrExpression ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_then_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY ) )
            // InternalGo.g:1285:2: ( ruleIF ( ( ruleAndExpression )=> (lv_cond_1_0= ruleOrExpression ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_then_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY )
            {
            // InternalGo.g:1285:2: ( ruleIF ( ( ruleAndExpression )=> (lv_cond_1_0= ruleOrExpression ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_then_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY )
            // InternalGo.g:1286:3: ruleIF ( ( ruleAndExpression )=> (lv_cond_1_0= ruleOrExpression ) ) this_Open_Key_2= RULE_OPEN_KEY ( (lv_then_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIfConditionAccess().getIFParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_32);
            ruleIF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1293:3: ( ( ruleAndExpression )=> (lv_cond_1_0= ruleOrExpression ) )
            // InternalGo.g:1294:4: ( ruleAndExpression )=> (lv_cond_1_0= ruleOrExpression )
            {
            // InternalGo.g:1295:4: (lv_cond_1_0= ruleOrExpression )
            // InternalGo.g:1296:5: lv_cond_1_0= ruleOrExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfConditionAccess().getCondOrExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            this_Open_Key_2=(Token)match(input,RULE_OPEN_KEY,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Open_Key_2, grammarAccess.getIfConditionAccess().getOpen_KeyTerminalRuleCall_2());
              		
            }
            // InternalGo.g:1317:3: ( (lv_then_3_0= ruleGreeting ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_EOL && LA27_0<=RULE_ID)||LA27_0==52||(LA27_0>=55 && LA27_0<=58)||LA27_0==62||LA27_0==64||LA27_0==66) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalGo.g:1318:4: (lv_then_3_0= ruleGreeting )
            	    {
            	    // InternalGo.g:1318:4: (lv_then_3_0= ruleGreeting )
            	    // InternalGo.g:1319:5: lv_then_3_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfConditionAccess().getThenGreetingParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
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
            	    break loop27;
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
    // InternalGo.g:1344:1: entryRuleElseIfCondition returns [EObject current=null] : iv_ruleElseIfCondition= ruleElseIfCondition EOF ;
    public final EObject entryRuleElseIfCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfCondition = null;


        try {
            // InternalGo.g:1344:56: (iv_ruleElseIfCondition= ruleElseIfCondition EOF )
            // InternalGo.g:1345:2: iv_ruleElseIfCondition= ruleElseIfCondition EOF
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
    // InternalGo.g:1351:1: ruleElseIfCondition returns [EObject current=null] : ( ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition ) ;
    public final EObject ruleElseIfCondition() throws RecognitionException {
        EObject current = null;

        EObject this_IfCondition_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1357:2: ( ( ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition ) )
            // InternalGo.g:1358:2: ( ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition )
            {
            // InternalGo.g:1358:2: ( ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition )
            // InternalGo.g:1359:3: ( ( ruleELSE )=> ruleELSE ) this_IfCondition_1= ruleIfCondition
            {
            // InternalGo.g:1359:3: ( ( ruleELSE )=> ruleELSE )
            // InternalGo.g:1360:4: ( ruleELSE )=> ruleELSE
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getElseIfConditionAccess().getELSEParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_33);
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
    // InternalGo.g:1381:1: entryRuleElseCondition returns [EObject current=null] : iv_ruleElseCondition= ruleElseCondition EOF ;
    public final EObject entryRuleElseCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseCondition = null;


        try {
            // InternalGo.g:1381:54: (iv_ruleElseCondition= ruleElseCondition EOF )
            // InternalGo.g:1382:2: iv_ruleElseCondition= ruleElseCondition EOF
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
    // InternalGo.g:1388:1: ruleElseCondition returns [EObject current=null] : ( ( ( ruleELSE )=> ruleELSE ) this_Open_Key_1= RULE_OPEN_KEY ( (lv_then_2_0= ruleGreeting ) )* this_Closed_Key_3= RULE_CLOSED_KEY ) ;
    public final EObject ruleElseCondition() throws RecognitionException {
        EObject current = null;

        Token this_Open_Key_1=null;
        Token this_Closed_Key_3=null;
        EObject lv_then_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1394:2: ( ( ( ( ruleELSE )=> ruleELSE ) this_Open_Key_1= RULE_OPEN_KEY ( (lv_then_2_0= ruleGreeting ) )* this_Closed_Key_3= RULE_CLOSED_KEY ) )
            // InternalGo.g:1395:2: ( ( ( ruleELSE )=> ruleELSE ) this_Open_Key_1= RULE_OPEN_KEY ( (lv_then_2_0= ruleGreeting ) )* this_Closed_Key_3= RULE_CLOSED_KEY )
            {
            // InternalGo.g:1395:2: ( ( ( ruleELSE )=> ruleELSE ) this_Open_Key_1= RULE_OPEN_KEY ( (lv_then_2_0= ruleGreeting ) )* this_Closed_Key_3= RULE_CLOSED_KEY )
            // InternalGo.g:1396:3: ( ( ruleELSE )=> ruleELSE ) this_Open_Key_1= RULE_OPEN_KEY ( (lv_then_2_0= ruleGreeting ) )* this_Closed_Key_3= RULE_CLOSED_KEY
            {
            // InternalGo.g:1396:3: ( ( ruleELSE )=> ruleELSE )
            // InternalGo.g:1397:4: ( ruleELSE )=> ruleELSE
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getElseConditionAccess().getELSEParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_13);
            ruleELSE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }

            this_Open_Key_1=(Token)match(input,RULE_OPEN_KEY,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Open_Key_1, grammarAccess.getElseConditionAccess().getOpen_KeyTerminalRuleCall_1());
              		
            }
            // InternalGo.g:1410:3: ( (lv_then_2_0= ruleGreeting ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_EOL && LA28_0<=RULE_ID)||LA28_0==52||(LA28_0>=55 && LA28_0<=58)||LA28_0==62||LA28_0==64||LA28_0==66) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalGo.g:1411:4: (lv_then_2_0= ruleGreeting )
            	    {
            	    // InternalGo.g:1411:4: (lv_then_2_0= ruleGreeting )
            	    // InternalGo.g:1412:5: lv_then_2_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getElseConditionAccess().getThenGreetingParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
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
            	    break loop28;
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
    // InternalGo.g:1437:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalGo.g:1437:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalGo.g:1438:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalGo.g:1444:1: ruleExpression returns [EObject current=null] : ( ( ( ( ( ruleOpers ) ) | ( ( ruleAndExpression )=> ruleOrExpression ) | RULE_ID ) )=> ( ( (lv_x_0_0= ruleOpers ) ) | ( ( ruleAndExpression )=>this_OrExpression_1= ruleOrExpression ) | this_ID_2= RULE_ID ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token this_ID_2=null;
        EObject lv_x_0_0 = null;

        EObject this_OrExpression_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1450:2: ( ( ( ( ( ( ruleOpers ) ) | ( ( ruleAndExpression )=> ruleOrExpression ) | RULE_ID ) )=> ( ( (lv_x_0_0= ruleOpers ) ) | ( ( ruleAndExpression )=>this_OrExpression_1= ruleOrExpression ) | this_ID_2= RULE_ID ) ) )
            // InternalGo.g:1451:2: ( ( ( ( ( ruleOpers ) ) | ( ( ruleAndExpression )=> ruleOrExpression ) | RULE_ID ) )=> ( ( (lv_x_0_0= ruleOpers ) ) | ( ( ruleAndExpression )=>this_OrExpression_1= ruleOrExpression ) | this_ID_2= RULE_ID ) )
            {
            // InternalGo.g:1451:2: ( ( ( ( ( ruleOpers ) ) | ( ( ruleAndExpression )=> ruleOrExpression ) | RULE_ID ) )=> ( ( (lv_x_0_0= ruleOpers ) ) | ( ( ruleAndExpression )=>this_OrExpression_1= ruleOrExpression ) | this_ID_2= RULE_ID ) )
            // InternalGo.g:1452:3: ( ( ( ( ruleOpers ) ) | ( ( ruleAndExpression )=> ruleOrExpression ) | RULE_ID ) )=> ( ( (lv_x_0_0= ruleOpers ) ) | ( ( ruleAndExpression )=>this_OrExpression_1= ruleOrExpression ) | this_ID_2= RULE_ID )
            {
            // InternalGo.g:1467:3: ( ( (lv_x_0_0= ruleOpers ) ) | ( ( ruleAndExpression )=>this_OrExpression_1= ruleOrExpression ) | this_ID_2= RULE_ID )
            int alt29=3;
            switch ( input.LA(1) ) {
            case RULE_OPEN_PARENTHESES:
                {
                int LA29_1 = input.LA(2);

                if ( (true) ) {
                    alt29=1;
                }
                else if ( (synpred8_InternalGo()) ) {
                    alt29=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                int LA29_2 = input.LA(2);

                if ( (true) ) {
                    alt29=1;
                }
                else if ( (synpred8_InternalGo()) ) {
                    alt29=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 2, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                int LA29_3 = input.LA(2);

                if ( (true) ) {
                    alt29=1;
                }
                else if ( (synpred8_InternalGo()) ) {
                    alt29=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA29_4 = input.LA(2);

                if ( (true) ) {
                    alt29=1;
                }
                else if ( (synpred8_InternalGo()) ) {
                    alt29=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalGo.g:1468:4: ( (lv_x_0_0= ruleOpers ) )
                    {
                    // InternalGo.g:1468:4: ( (lv_x_0_0= ruleOpers ) )
                    // InternalGo.g:1469:5: (lv_x_0_0= ruleOpers )
                    {
                    // InternalGo.g:1469:5: (lv_x_0_0= ruleOpers )
                    // InternalGo.g:1470:6: lv_x_0_0= ruleOpers
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
                    // InternalGo.g:1488:4: ( ( ruleAndExpression )=>this_OrExpression_1= ruleOrExpression )
                    {
                    // InternalGo.g:1488:4: ( ( ruleAndExpression )=>this_OrExpression_1= ruleOrExpression )
                    // InternalGo.g:1489:5: ( ruleAndExpression )=>this_OrExpression_1= ruleOrExpression
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
                    // InternalGo.g:1500:4: this_ID_2= RULE_ID
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
    // InternalGo.g:1509:1: entryRuleCallFor returns [EObject current=null] : iv_ruleCallFor= ruleCallFor EOF ;
    public final EObject entryRuleCallFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallFor = null;


        try {
            // InternalGo.g:1509:48: (iv_ruleCallFor= ruleCallFor EOF )
            // InternalGo.g:1510:2: iv_ruleCallFor= ruleCallFor EOF
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
    // InternalGo.g:1516:1: ruleCallFor returns [EObject current=null] : ( ruleFOR (this_varFor_1= rulevarFor )? this_Open_Key_2= RULE_OPEN_KEY ( (lv_x_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY ) ;
    public final EObject ruleCallFor() throws RecognitionException {
        EObject current = null;

        Token this_Open_Key_2=null;
        Token this_Closed_Key_4=null;
        EObject this_varFor_1 = null;

        EObject lv_x_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1522:2: ( ( ruleFOR (this_varFor_1= rulevarFor )? this_Open_Key_2= RULE_OPEN_KEY ( (lv_x_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY ) )
            // InternalGo.g:1523:2: ( ruleFOR (this_varFor_1= rulevarFor )? this_Open_Key_2= RULE_OPEN_KEY ( (lv_x_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY )
            {
            // InternalGo.g:1523:2: ( ruleFOR (this_varFor_1= rulevarFor )? this_Open_Key_2= RULE_OPEN_KEY ( (lv_x_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY )
            // InternalGo.g:1524:3: ruleFOR (this_varFor_1= rulevarFor )? this_Open_Key_2= RULE_OPEN_KEY ( (lv_x_3_0= ruleGreeting ) )* this_Closed_Key_4= RULE_CLOSED_KEY
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCallForAccess().getFORParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_34);
            ruleFOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1531:3: (this_varFor_1= rulevarFor )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_OPEN_PARENTHESES||LA30_0==RULE_INT||(LA30_0>=47 && LA30_0<=48)||LA30_0==52||LA30_0==62) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGo.g:1532:4: this_varFor_1= rulevarFor
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCallForAccess().getVarForParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_13);
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

            this_Open_Key_2=(Token)match(input,RULE_OPEN_KEY,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Open_Key_2, grammarAccess.getCallForAccess().getOpen_KeyTerminalRuleCall_2());
              		
            }
            // InternalGo.g:1545:3: ( (lv_x_3_0= ruleGreeting ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_EOL && LA31_0<=RULE_ID)||LA31_0==52||(LA31_0>=55 && LA31_0<=58)||LA31_0==62||LA31_0==64||LA31_0==66) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalGo.g:1546:4: (lv_x_3_0= ruleGreeting )
            	    {
            	    // InternalGo.g:1546:4: (lv_x_3_0= ruleGreeting )
            	    // InternalGo.g:1547:5: lv_x_3_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCallForAccess().getXGreetingParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
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
            	    break loop31;
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
    // InternalGo.g:1572:1: entryRuleOpers returns [EObject current=null] : iv_ruleOpers= ruleOpers EOF ;
    public final EObject entryRuleOpers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpers = null;


        try {
            // InternalGo.g:1572:46: (iv_ruleOpers= ruleOpers EOF )
            // InternalGo.g:1573:2: iv_ruleOpers= ruleOpers EOF
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
    // InternalGo.g:1579:1: ruleOpers returns [EObject current=null] : ( ( ( ruleSubMult )=> (lv_sum_0_0= ruleAddition ) ) | ( ( ruleSubMult )=> (lv_sub_1_0= ruleSubtration ) ) ) ;
    public final EObject ruleOpers() throws RecognitionException {
        EObject current = null;

        EObject lv_sum_0_0 = null;

        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1585:2: ( ( ( ( ruleSubMult )=> (lv_sum_0_0= ruleAddition ) ) | ( ( ruleSubMult )=> (lv_sub_1_0= ruleSubtration ) ) ) )
            // InternalGo.g:1586:2: ( ( ( ruleSubMult )=> (lv_sum_0_0= ruleAddition ) ) | ( ( ruleSubMult )=> (lv_sub_1_0= ruleSubtration ) ) )
            {
            // InternalGo.g:1586:2: ( ( ( ruleSubMult )=> (lv_sum_0_0= ruleAddition ) ) | ( ( ruleSubMult )=> (lv_sub_1_0= ruleSubtration ) ) )
            int alt32=2;
            switch ( input.LA(1) ) {
            case RULE_OPEN_PARENTHESES:
                {
                int LA32_1 = input.LA(2);

                if ( (synpred9_InternalGo()) ) {
                    alt32=1;
                }
                else if ( (synpred10_InternalGo()) ) {
                    alt32=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                int LA32_2 = input.LA(2);

                if ( (synpred9_InternalGo()) ) {
                    alt32=1;
                }
                else if ( (synpred10_InternalGo()) ) {
                    alt32=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 2, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                int LA32_3 = input.LA(2);

                if ( (synpred9_InternalGo()) ) {
                    alt32=1;
                }
                else if ( (synpred10_InternalGo()) ) {
                    alt32=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA32_4 = input.LA(2);

                if ( (synpred9_InternalGo()) ) {
                    alt32=1;
                }
                else if ( (synpred10_InternalGo()) ) {
                    alt32=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 4, input);

                    throw nvae;
                }
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
                    // InternalGo.g:1587:3: ( ( ruleSubMult )=> (lv_sum_0_0= ruleAddition ) )
                    {
                    // InternalGo.g:1587:3: ( ( ruleSubMult )=> (lv_sum_0_0= ruleAddition ) )
                    // InternalGo.g:1588:4: ( ruleSubMult )=> (lv_sum_0_0= ruleAddition )
                    {
                    // InternalGo.g:1589:4: (lv_sum_0_0= ruleAddition )
                    // InternalGo.g:1590:5: lv_sum_0_0= ruleAddition
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
                    // InternalGo.g:1608:3: ( ( ruleSubMult )=> (lv_sub_1_0= ruleSubtration ) )
                    {
                    // InternalGo.g:1608:3: ( ( ruleSubMult )=> (lv_sub_1_0= ruleSubtration ) )
                    // InternalGo.g:1609:4: ( ruleSubMult )=> (lv_sub_1_0= ruleSubtration )
                    {
                    // InternalGo.g:1610:4: (lv_sub_1_0= ruleSubtration )
                    // InternalGo.g:1611:5: lv_sub_1_0= ruleSubtration
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
    // InternalGo.g:1632:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalGo.g:1632:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalGo.g:1633:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalGo.g:1639:1: ruleAddition returns [EObject current=null] : ( ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Plus_2= RULE_PLUS ( (lv_right_3_0= ruleSubMult ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token this_Plus_2=null;
        EObject this_SubMult_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1645:2: ( ( ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Plus_2= RULE_PLUS ( (lv_right_3_0= ruleSubMult ) ) )* ) )
            // InternalGo.g:1646:2: ( ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Plus_2= RULE_PLUS ( (lv_right_3_0= ruleSubMult ) ) )* )
            {
            // InternalGo.g:1646:2: ( ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Plus_2= RULE_PLUS ( (lv_right_3_0= ruleSubMult ) ) )* )
            // InternalGo.g:1647:3: ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Plus_2= RULE_PLUS ( (lv_right_3_0= ruleSubMult ) ) )*
            {
            // InternalGo.g:1647:3: ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult )
            // InternalGo.g:1648:4: ( ruleSubMult )=>this_SubMult_0= ruleSubMult
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getAdditionAccess().getSubMultParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_35);
            this_SubMult_0=ruleSubMult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_SubMult_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalGo.g:1658:3: ( () this_Plus_2= RULE_PLUS ( (lv_right_3_0= ruleSubMult ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_PLUS) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalGo.g:1659:4: () this_Plus_2= RULE_PLUS ( (lv_right_3_0= ruleSubMult ) )
            	    {
            	    // InternalGo.g:1659:4: ()
            	    // InternalGo.g:1660:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_Plus_2=(Token)match(input,RULE_PLUS,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_Plus_2, grammarAccess.getAdditionAccess().getPlusTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalGo.g:1670:4: ( (lv_right_3_0= ruleSubMult ) )
            	    // InternalGo.g:1671:5: (lv_right_3_0= ruleSubMult )
            	    {
            	    // InternalGo.g:1671:5: (lv_right_3_0= ruleSubMult )
            	    // InternalGo.g:1672:6: lv_right_3_0= ruleSubMult
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditionAccess().getRightSubMultParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_35);
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleSubtration"
    // InternalGo.g:1694:1: entryRuleSubtration returns [EObject current=null] : iv_ruleSubtration= ruleSubtration EOF ;
    public final EObject entryRuleSubtration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtration = null;


        try {
            // InternalGo.g:1694:51: (iv_ruleSubtration= ruleSubtration EOF )
            // InternalGo.g:1695:2: iv_ruleSubtration= ruleSubtration EOF
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
    // InternalGo.g:1701:1: ruleSubtration returns [EObject current=null] : ( ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Minus_2= RULE_MINUS ( (lv_right_3_0= ruleSubMult ) ) )* ) ;
    public final EObject ruleSubtration() throws RecognitionException {
        EObject current = null;

        Token this_Minus_2=null;
        EObject this_SubMult_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1707:2: ( ( ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Minus_2= RULE_MINUS ( (lv_right_3_0= ruleSubMult ) ) )* ) )
            // InternalGo.g:1708:2: ( ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Minus_2= RULE_MINUS ( (lv_right_3_0= ruleSubMult ) ) )* )
            {
            // InternalGo.g:1708:2: ( ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Minus_2= RULE_MINUS ( (lv_right_3_0= ruleSubMult ) ) )* )
            // InternalGo.g:1709:3: ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult ) ( () this_Minus_2= RULE_MINUS ( (lv_right_3_0= ruleSubMult ) ) )*
            {
            // InternalGo.g:1709:3: ( ( ruleSubMult )=>this_SubMult_0= ruleSubMult )
            // InternalGo.g:1710:4: ( ruleSubMult )=>this_SubMult_0= ruleSubMult
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getSubtrationAccess().getSubMultParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_36);
            this_SubMult_0=ruleSubMult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_SubMult_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalGo.g:1720:3: ( () this_Minus_2= RULE_MINUS ( (lv_right_3_0= ruleSubMult ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_MINUS) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalGo.g:1721:4: () this_Minus_2= RULE_MINUS ( (lv_right_3_0= ruleSubMult ) )
            	    {
            	    // InternalGo.g:1721:4: ()
            	    // InternalGo.g:1722:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getSubtrationAccess().getSubtrationLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_Minus_2=(Token)match(input,RULE_MINUS,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_Minus_2, grammarAccess.getSubtrationAccess().getMinusTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalGo.g:1732:4: ( (lv_right_3_0= ruleSubMult ) )
            	    // InternalGo.g:1733:5: (lv_right_3_0= ruleSubMult )
            	    {
            	    // InternalGo.g:1733:5: (lv_right_3_0= ruleSubMult )
            	    // InternalGo.g:1734:6: lv_right_3_0= ruleSubMult
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSubtrationAccess().getRightSubMultParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
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
    // $ANTLR end "ruleSubtration"


    // $ANTLR start "entryRuleMultiplication"
    // InternalGo.g:1756:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalGo.g:1756:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalGo.g:1757:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalGo.g:1763:1: ruleMultiplication returns [EObject current=null] : ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Asterics_2= RULE_ASTERICS ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token this_Asterics_2=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1769:2: ( ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Asterics_2= RULE_ASTERICS ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // InternalGo.g:1770:2: ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Asterics_2= RULE_ASTERICS ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // InternalGo.g:1770:2: ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Asterics_2= RULE_ASTERICS ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // InternalGo.g:1771:3: ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Asterics_2= RULE_ASTERICS ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {
            // InternalGo.g:1771:3: ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression )
            // InternalGo.g:1772:4: ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_37);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_PrimaryExpression_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalGo.g:1782:3: ( () this_Asterics_2= RULE_ASTERICS ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ASTERICS) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalGo.g:1783:4: () this_Asterics_2= RULE_ASTERICS ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // InternalGo.g:1783:4: ()
            	    // InternalGo.g:1784:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_Asterics_2=(Token)match(input,RULE_ASTERICS,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_Asterics_2, grammarAccess.getMultiplicationAccess().getAstericsTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalGo.g:1794:4: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // InternalGo.g:1795:5: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // InternalGo.g:1795:5: (lv_right_3_0= rulePrimaryExpression )
            	    // InternalGo.g:1796:6: lv_right_3_0= rulePrimaryExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_37);
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleDivision"
    // InternalGo.g:1818:1: entryRuleDivision returns [EObject current=null] : iv_ruleDivision= ruleDivision EOF ;
    public final EObject entryRuleDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivision = null;


        try {
            // InternalGo.g:1818:49: (iv_ruleDivision= ruleDivision EOF )
            // InternalGo.g:1819:2: iv_ruleDivision= ruleDivision EOF
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
    // InternalGo.g:1825:1: ruleDivision returns [EObject current=null] : ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Bar_2= RULE_BAR ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleDivision() throws RecognitionException {
        EObject current = null;

        Token this_Bar_2=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1831:2: ( ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Bar_2= RULE_BAR ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // InternalGo.g:1832:2: ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Bar_2= RULE_BAR ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // InternalGo.g:1832:2: ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Bar_2= RULE_BAR ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // InternalGo.g:1833:3: ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () this_Bar_2= RULE_BAR ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {
            // InternalGo.g:1833:3: ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression )
            // InternalGo.g:1834:4: ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getDivisionAccess().getPrimaryExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_38);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_PrimaryExpression_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalGo.g:1844:3: ( () this_Bar_2= RULE_BAR ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_BAR) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalGo.g:1845:4: () this_Bar_2= RULE_BAR ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // InternalGo.g:1845:4: ()
            	    // InternalGo.g:1846:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getDivisionAccess().getDivisionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_Bar_2=(Token)match(input,RULE_BAR,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_Bar_2, grammarAccess.getDivisionAccess().getBarTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalGo.g:1856:4: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // InternalGo.g:1857:5: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // InternalGo.g:1857:5: (lv_right_3_0= rulePrimaryExpression )
            	    // InternalGo.g:1858:6: lv_right_3_0= rulePrimaryExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDivisionAccess().getRightPrimaryExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
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
    // $ANTLR end "ruleDivision"


    // $ANTLR start "entryRuleSubMult"
    // InternalGo.g:1880:1: entryRuleSubMult returns [EObject current=null] : iv_ruleSubMult= ruleSubMult EOF ;
    public final EObject entryRuleSubMult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubMult = null;


        try {
            // InternalGo.g:1880:48: (iv_ruleSubMult= ruleSubMult EOF )
            // InternalGo.g:1881:2: iv_ruleSubMult= ruleSubMult EOF
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
    // InternalGo.g:1887:1: ruleSubMult returns [EObject current=null] : ( ( ( rulePrimaryExpression )=>this_Multiplication_0= ruleMultiplication ) | ( ( rulePrimaryExpression )=>this_Division_1= ruleDivision ) ) ;
    public final EObject ruleSubMult() throws RecognitionException {
        EObject current = null;

        EObject this_Multiplication_0 = null;

        EObject this_Division_1 = null;



        	enterRule();

        try {
            // InternalGo.g:1893:2: ( ( ( ( rulePrimaryExpression )=>this_Multiplication_0= ruleMultiplication ) | ( ( rulePrimaryExpression )=>this_Division_1= ruleDivision ) ) )
            // InternalGo.g:1894:2: ( ( ( rulePrimaryExpression )=>this_Multiplication_0= ruleMultiplication ) | ( ( rulePrimaryExpression )=>this_Division_1= ruleDivision ) )
            {
            // InternalGo.g:1894:2: ( ( ( rulePrimaryExpression )=>this_Multiplication_0= ruleMultiplication ) | ( ( rulePrimaryExpression )=>this_Division_1= ruleDivision ) )
            int alt37=2;
            switch ( input.LA(1) ) {
            case RULE_OPEN_PARENTHESES:
                {
                int LA37_1 = input.LA(2);

                if ( (synpred15_InternalGo()) ) {
                    alt37=1;
                }
                else if ( (synpred16_InternalGo()) ) {
                    alt37=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                int LA37_2 = input.LA(2);

                if ( (synpred15_InternalGo()) ) {
                    alt37=1;
                }
                else if ( (synpred16_InternalGo()) ) {
                    alt37=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 2, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                int LA37_3 = input.LA(2);

                if ( (synpred15_InternalGo()) ) {
                    alt37=1;
                }
                else if ( (synpred16_InternalGo()) ) {
                    alt37=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA37_4 = input.LA(2);

                if ( (synpred15_InternalGo()) ) {
                    alt37=1;
                }
                else if ( (synpred16_InternalGo()) ) {
                    alt37=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalGo.g:1895:3: ( ( rulePrimaryExpression )=>this_Multiplication_0= ruleMultiplication )
                    {
                    // InternalGo.g:1895:3: ( ( rulePrimaryExpression )=>this_Multiplication_0= ruleMultiplication )
                    // InternalGo.g:1896:4: ( rulePrimaryExpression )=>this_Multiplication_0= ruleMultiplication
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
                    // InternalGo.g:1907:3: ( ( rulePrimaryExpression )=>this_Division_1= ruleDivision )
                    {
                    // InternalGo.g:1907:3: ( ( rulePrimaryExpression )=>this_Division_1= ruleDivision )
                    // InternalGo.g:1908:4: ( rulePrimaryExpression )=>this_Division_1= ruleDivision
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
    // InternalGo.g:1922:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalGo.g:1922:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalGo.g:1923:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalGo.g:1929:1: ruleOrExpression returns [EObject current=null] : ( ( ( ruleAndExpression )=>this_AndExpression_0= ruleAndExpression ) ( () otherlv_2= '||' ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1935:2: ( ( ( ( ruleAndExpression )=>this_AndExpression_0= ruleAndExpression ) ( () otherlv_2= '||' ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalGo.g:1936:2: ( ( ( ruleAndExpression )=>this_AndExpression_0= ruleAndExpression ) ( () otherlv_2= '||' ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalGo.g:1936:2: ( ( ( ruleAndExpression )=>this_AndExpression_0= ruleAndExpression ) ( () otherlv_2= '||' ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalGo.g:1937:3: ( ( ruleAndExpression )=>this_AndExpression_0= ruleAndExpression ) ( () otherlv_2= '||' ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) ) )*
            {
            // InternalGo.g:1937:3: ( ( ruleAndExpression )=>this_AndExpression_0= ruleAndExpression )
            // InternalGo.g:1938:4: ( ruleAndExpression )=>this_AndExpression_0= ruleAndExpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_39);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_AndExpression_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalGo.g:1948:3: ( () otherlv_2= '||' ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==33) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalGo.g:1949:4: () otherlv_2= '||' ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalGo.g:1949:4: ()
            	    // InternalGo.g:1950:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalGo.g:1960:4: ( ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression ) )
            	    // InternalGo.g:1961:5: ( ruleComparisonExpression )=> (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalGo.g:1962:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalGo.g:1963:6: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalGo.g:1985:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalGo.g:1985:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalGo.g:1986:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalGo.g:1992:1: ruleAndExpression returns [EObject current=null] : ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) ( () otherlv_2= '&&' ( ( rulePrimaryExpression )=> (lv_right_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ComparisonExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1998:2: ( ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) ( () otherlv_2= '&&' ( ( rulePrimaryExpression )=> (lv_right_3_0= ruleComparisonExpression ) ) )* ) )
            // InternalGo.g:1999:2: ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) ( () otherlv_2= '&&' ( ( rulePrimaryExpression )=> (lv_right_3_0= ruleComparisonExpression ) ) )* )
            {
            // InternalGo.g:1999:2: ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) ( () otherlv_2= '&&' ( ( rulePrimaryExpression )=> (lv_right_3_0= ruleComparisonExpression ) ) )* )
            // InternalGo.g:2000:3: ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) ( () otherlv_2= '&&' ( ( rulePrimaryExpression )=> (lv_right_3_0= ruleComparisonExpression ) ) )*
            {
            // InternalGo.g:2000:3: ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression )
            // InternalGo.g:2001:4: ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getAndExpressionAccess().getComparisonExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_40);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current = this_ComparisonExpression_0;
              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalGo.g:2011:3: ( () otherlv_2= '&&' ( ( rulePrimaryExpression )=> (lv_right_3_0= ruleComparisonExpression ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==34) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalGo.g:2012:4: () otherlv_2= '&&' ( ( rulePrimaryExpression )=> (lv_right_3_0= ruleComparisonExpression ) )
            	    {
            	    // InternalGo.g:2012:4: ()
            	    // InternalGo.g:2013:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,34,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalGo.g:2023:4: ( ( rulePrimaryExpression )=> (lv_right_3_0= ruleComparisonExpression ) )
            	    // InternalGo.g:2024:5: ( rulePrimaryExpression )=> (lv_right_3_0= ruleComparisonExpression )
            	    {
            	    // InternalGo.g:2025:5: (lv_right_3_0= ruleComparisonExpression )
            	    // InternalGo.g:2026:6: lv_right_3_0= ruleComparisonExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalGo.g:2048:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalGo.g:2048:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalGo.g:2049:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
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
    // InternalGo.g:2055:1: ruleComparisonExpression returns [EObject current=null] : ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () ruleOperator ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2061:2: ( ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () ruleOperator ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // InternalGo.g:2062:2: ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () ruleOperator ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // InternalGo.g:2062:2: ( ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () ruleOperator ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // InternalGo.g:2063:3: ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression ) ( () ruleOperator ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {
            // InternalGo.g:2063:3: ( ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression )
            // InternalGo.g:2064:4: ( rulePrimaryExpression )=>this_PrimaryExpression_0= rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getComparisonExpressionAccess().getPrimaryExpressionParserRuleCall_0());
              			
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

            // InternalGo.g:2074:3: ( () ruleOperator ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=35 && LA40_0<=39)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalGo.g:2075:4: () ruleOperator ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // InternalGo.g:2075:4: ()
            	    // InternalGo.g:2076:5: 
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
            	    pushFollow(FOLLOW_32);
            	    ruleOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalGo.g:2089:4: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // InternalGo.g:2090:5: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // InternalGo.g:2090:5: (lv_right_3_0= rulePrimaryExpression )
            	    // InternalGo.g:2091:6: lv_right_3_0= rulePrimaryExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_41);
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
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalGo.g:2113:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalGo.g:2113:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalGo.g:2114:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalGo.g:2120:1: rulePrimaryExpression returns [EObject current=null] : ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | this_Literal_3= ruleLiteral ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token this_Open_parentheses_0=null;
        Token this_Closed_parentheses_2=null;
        EObject this_Expression_1 = null;

        EObject this_Literal_3 = null;



        	enterRule();

        try {
            // InternalGo.g:2126:2: ( ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | this_Literal_3= ruleLiteral ) )
            // InternalGo.g:2127:2: ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | this_Literal_3= ruleLiteral )
            {
            // InternalGo.g:2127:2: ( (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES ) | this_Literal_3= ruleLiteral )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_OPEN_PARENTHESES) ) {
                alt41=1;
            }
            else if ( (LA41_0==RULE_INT||(LA41_0>=47 && LA41_0<=48)) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalGo.g:2128:3: (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES )
                    {
                    // InternalGo.g:2128:3: (this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES )
                    // InternalGo.g:2129:4: this_Open_parentheses_0= RULE_OPEN_PARENTHESES this_Expression_1= ruleExpression this_Closed_parentheses_2= RULE_CLOSED_PARENTHESES
                    {
                    this_Open_parentheses_0=(Token)match(input,RULE_OPEN_PARENTHESES,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_Open_parentheses_0, grammarAccess.getPrimaryExpressionAccess().getOpen_parenthesesTerminalRuleCall_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_42);
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
                    // InternalGo.g:2147:3: this_Literal_3= ruleLiteral
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
    // InternalGo.g:2159:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalGo.g:2159:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalGo.g:2160:2: iv_ruleOperator= ruleOperator EOF
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
    // InternalGo.g:2166:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '<=' | kw= '==' | kw= '>=' | kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2172:2: ( (kw= '<' | kw= '<=' | kw= '==' | kw= '>=' | kw= '>' ) )
            // InternalGo.g:2173:2: (kw= '<' | kw= '<=' | kw= '==' | kw= '>=' | kw= '>' )
            {
            // InternalGo.g:2173:2: (kw= '<' | kw= '<=' | kw= '==' | kw= '>=' | kw= '>' )
            int alt42=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt42=1;
                }
                break;
            case 36:
                {
                alt42=2;
                }
                break;
            case 37:
                {
                alt42=3;
                }
                break;
            case 38:
                {
                alt42=4;
                }
                break;
            case 39:
                {
                alt42=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalGo.g:2174:3: kw= '<'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2180:3: kw= '<='
                    {
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignEqualsSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:2186:3: kw= '=='
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getEqualsSignEqualsSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:2192:3: kw= '>='
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOperatorAccess().getGreaterThanSignEqualsSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:2198:3: kw= '>'
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
    // InternalGo.g:2207:1: entryRuleoperationsOne returns [EObject current=null] : iv_ruleoperationsOne= ruleoperationsOne EOF ;
    public final EObject entryRuleoperationsOne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperationsOne = null;


        try {
            // InternalGo.g:2207:54: (iv_ruleoperationsOne= ruleoperationsOne EOF )
            // InternalGo.g:2208:2: iv_ruleoperationsOne= ruleoperationsOne EOF
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
    // InternalGo.g:2214:1: ruleoperationsOne returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusOne_1= RULE_PLUSONE | this_MinusOne_2= RULE_MINUSONE ) ) ;
    public final EObject ruleoperationsOne() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_PlusOne_1=null;
        Token this_MinusOne_2=null;


        	enterRule();

        try {
            // InternalGo.g:2220:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusOne_1= RULE_PLUSONE | this_MinusOne_2= RULE_MINUSONE ) ) )
            // InternalGo.g:2221:2: ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusOne_1= RULE_PLUSONE | this_MinusOne_2= RULE_MINUSONE ) )
            {
            // InternalGo.g:2221:2: ( ( (lv_name_0_0= RULE_ID ) ) (this_PlusOne_1= RULE_PLUSONE | this_MinusOne_2= RULE_MINUSONE ) )
            // InternalGo.g:2222:3: ( (lv_name_0_0= RULE_ID ) ) (this_PlusOne_1= RULE_PLUSONE | this_MinusOne_2= RULE_MINUSONE )
            {
            // InternalGo.g:2222:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGo.g:2223:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGo.g:2223:4: (lv_name_0_0= RULE_ID )
            // InternalGo.g:2224:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_43); if (state.failed) return current;
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

            // InternalGo.g:2240:3: (this_PlusOne_1= RULE_PLUSONE | this_MinusOne_2= RULE_MINUSONE )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_PLUSONE) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_MINUSONE) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalGo.g:2241:4: this_PlusOne_1= RULE_PLUSONE
                    {
                    this_PlusOne_1=(Token)match(input,RULE_PLUSONE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_PlusOne_1, grammarAccess.getOperationsOneAccess().getPlusOneTerminalRuleCall_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2246:4: this_MinusOne_2= RULE_MINUSONE
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
    // InternalGo.g:2255:1: entryRulevarFor returns [EObject current=null] : iv_rulevarFor= rulevarFor EOF ;
    public final EObject entryRulevarFor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevarFor = null;


        try {
            // InternalGo.g:2255:47: (iv_rulevarFor= rulevarFor EOF )
            // InternalGo.g:2256:2: iv_rulevarFor= rulevarFor EOF
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
    // InternalGo.g:2262:1: rulevarFor returns [EObject current=null] : ( ( ( rulePrimaryExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) | ( ruleModif ( (lv_var_2_0= RULE_ID ) ) ruleTypes otherlv_4= '=' ( ( (lv_atrb_5_1= ruleAtri | lv_atrb_5_2= RULE_ID ) ) ) this_PontoVirgula_6= RULE_PONTOVIRGULA ( (lv_right_7_0= ruleLiteral ) ) ruleOperator ( (lv_left_9_0= ruleLiteral ) ) this_PontoVirgula_10= RULE_PONTOVIRGULA (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals ) ) ) ;
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
            // InternalGo.g:2268:2: ( ( ( ( rulePrimaryExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) | ( ruleModif ( (lv_var_2_0= RULE_ID ) ) ruleTypes otherlv_4= '=' ( ( (lv_atrb_5_1= ruleAtri | lv_atrb_5_2= RULE_ID ) ) ) this_PontoVirgula_6= RULE_PONTOVIRGULA ( (lv_right_7_0= ruleLiteral ) ) ruleOperator ( (lv_left_9_0= ruleLiteral ) ) this_PontoVirgula_10= RULE_PONTOVIRGULA (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals ) ) ) )
            // InternalGo.g:2269:2: ( ( ( rulePrimaryExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) | ( ruleModif ( (lv_var_2_0= RULE_ID ) ) ruleTypes otherlv_4= '=' ( ( (lv_atrb_5_1= ruleAtri | lv_atrb_5_2= RULE_ID ) ) ) this_PontoVirgula_6= RULE_PONTOVIRGULA ( (lv_right_7_0= ruleLiteral ) ) ruleOperator ( (lv_left_9_0= ruleLiteral ) ) this_PontoVirgula_10= RULE_PONTOVIRGULA (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals ) ) )
            {
            // InternalGo.g:2269:2: ( ( ( rulePrimaryExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) | ( ruleModif ( (lv_var_2_0= RULE_ID ) ) ruleTypes otherlv_4= '=' ( ( (lv_atrb_5_1= ruleAtri | lv_atrb_5_2= RULE_ID ) ) ) this_PontoVirgula_6= RULE_PONTOVIRGULA ( (lv_right_7_0= ruleLiteral ) ) ruleOperator ( (lv_left_9_0= ruleLiteral ) ) this_PontoVirgula_10= RULE_PONTOVIRGULA (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals ) ) )
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
                    // InternalGo.g:2270:3: ( ( rulePrimaryExpression )=>this_ComparisonExpression_0= ruleComparisonExpression )
                    {
                    // InternalGo.g:2270:3: ( ( rulePrimaryExpression )=>this_ComparisonExpression_0= ruleComparisonExpression )
                    // InternalGo.g:2271:4: ( rulePrimaryExpression )=>this_ComparisonExpression_0= ruleComparisonExpression
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
                    // InternalGo.g:2282:3: ( ruleModif ( (lv_var_2_0= RULE_ID ) ) ruleTypes otherlv_4= '=' ( ( (lv_atrb_5_1= ruleAtri | lv_atrb_5_2= RULE_ID ) ) ) this_PontoVirgula_6= RULE_PONTOVIRGULA ( (lv_right_7_0= ruleLiteral ) ) ruleOperator ( (lv_left_9_0= ruleLiteral ) ) this_PontoVirgula_10= RULE_PONTOVIRGULA (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals ) )
                    {
                    // InternalGo.g:2282:3: ( ruleModif ( (lv_var_2_0= RULE_ID ) ) ruleTypes otherlv_4= '=' ( ( (lv_atrb_5_1= ruleAtri | lv_atrb_5_2= RULE_ID ) ) ) this_PontoVirgula_6= RULE_PONTOVIRGULA ( (lv_right_7_0= ruleLiteral ) ) ruleOperator ( (lv_left_9_0= ruleLiteral ) ) this_PontoVirgula_10= RULE_PONTOVIRGULA (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals ) )
                    // InternalGo.g:2283:4: ruleModif ( (lv_var_2_0= RULE_ID ) ) ruleTypes otherlv_4= '=' ( ( (lv_atrb_5_1= ruleAtri | lv_atrb_5_2= RULE_ID ) ) ) this_PontoVirgula_6= RULE_PONTOVIRGULA ( (lv_right_7_0= ruleLiteral ) ) ruleOperator ( (lv_left_9_0= ruleLiteral ) ) this_PontoVirgula_10= RULE_PONTOVIRGULA (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals )
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
                    // InternalGo.g:2290:4: ( (lv_var_2_0= RULE_ID ) )
                    // InternalGo.g:2291:5: (lv_var_2_0= RULE_ID )
                    {
                    // InternalGo.g:2291:5: (lv_var_2_0= RULE_ID )
                    // InternalGo.g:2292:6: lv_var_2_0= RULE_ID
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
                    pushFollow(FOLLOW_12);
                    ruleTypes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_4=(Token)match(input,32,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getVarForAccess().getEqualsSignKeyword_1_3());
                      			
                    }
                    // InternalGo.g:2319:4: ( ( (lv_atrb_5_1= ruleAtri | lv_atrb_5_2= RULE_ID ) ) )
                    // InternalGo.g:2320:5: ( (lv_atrb_5_1= ruleAtri | lv_atrb_5_2= RULE_ID ) )
                    {
                    // InternalGo.g:2320:5: ( (lv_atrb_5_1= ruleAtri | lv_atrb_5_2= RULE_ID ) )
                    // InternalGo.g:2321:6: (lv_atrb_5_1= ruleAtri | lv_atrb_5_2= RULE_ID )
                    {
                    // InternalGo.g:2321:6: (lv_atrb_5_1= ruleAtri | lv_atrb_5_2= RULE_ID )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( ((LA44_0>=RULE_OPEN_BRACKETS && LA44_0<=RULE_INT)||LA44_0==RULE_STRING||(LA44_0>=47 && LA44_0<=48)) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==RULE_ID) ) {
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
                            // InternalGo.g:2322:7: lv_atrb_5_1= ruleAtri
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getVarForAccess().getAtrbAtriParserRuleCall_1_4_0_0());
                              						
                            }
                            pushFollow(FOLLOW_44);
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
                            // InternalGo.g:2338:7: lv_atrb_5_2= RULE_ID
                            {
                            lv_atrb_5_2=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
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

                    this_PontoVirgula_6=(Token)match(input,RULE_PONTOVIRGULA,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_PontoVirgula_6, grammarAccess.getVarForAccess().getPontoVirgulaTerminalRuleCall_1_5());
                      			
                    }
                    // InternalGo.g:2359:4: ( (lv_right_7_0= ruleLiteral ) )
                    // InternalGo.g:2360:5: (lv_right_7_0= ruleLiteral )
                    {
                    // InternalGo.g:2360:5: (lv_right_7_0= ruleLiteral )
                    // InternalGo.g:2361:6: lv_right_7_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarForAccess().getRightLiteralParserRuleCall_1_6_0());
                      					
                    }
                    pushFollow(FOLLOW_45);
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
                    pushFollow(FOLLOW_32);
                    ruleOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGo.g:2385:4: ( (lv_left_9_0= ruleLiteral ) )
                    // InternalGo.g:2386:5: (lv_left_9_0= ruleLiteral )
                    {
                    // InternalGo.g:2386:5: (lv_left_9_0= ruleLiteral )
                    // InternalGo.g:2387:6: lv_left_9_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarForAccess().getLeftLiteralParserRuleCall_1_8_0());
                      					
                    }
                    pushFollow(FOLLOW_44);
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
                    // InternalGo.g:2408:4: (this_operationsOne_11= ruleoperationsOne | this_OperationsOneEquals_12= ruleOperationsOneEquals )
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
                            // InternalGo.g:2409:5: this_operationsOne_11= ruleoperationsOne
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
                            // InternalGo.g:2418:5: this_OperationsOneEquals_12= ruleOperationsOneEquals
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
    // InternalGo.g:2432:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalGo.g:2432:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalGo.g:2433:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalGo.g:2439:1: ruleLiteral returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleBoolean ) ) ) | ruleNumbers ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2445:2: ( ( ( () ( (lv_value_1_0= ruleBoolean ) ) ) | ruleNumbers ) )
            // InternalGo.g:2446:2: ( ( () ( (lv_value_1_0= ruleBoolean ) ) ) | ruleNumbers )
            {
            // InternalGo.g:2446:2: ( ( () ( (lv_value_1_0= ruleBoolean ) ) ) | ruleNumbers )
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
                    // InternalGo.g:2447:3: ( () ( (lv_value_1_0= ruleBoolean ) ) )
                    {
                    // InternalGo.g:2447:3: ( () ( (lv_value_1_0= ruleBoolean ) ) )
                    // InternalGo.g:2448:4: () ( (lv_value_1_0= ruleBoolean ) )
                    {
                    // InternalGo.g:2448:4: ()
                    // InternalGo.g:2449:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getLiteralAccess().getLiteralAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGo.g:2455:4: ( (lv_value_1_0= ruleBoolean ) )
                    // InternalGo.g:2456:5: (lv_value_1_0= ruleBoolean )
                    {
                    // InternalGo.g:2456:5: (lv_value_1_0= ruleBoolean )
                    // InternalGo.g:2457:6: lv_value_1_0= ruleBoolean
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
                    // InternalGo.g:2476:3: ruleNumbers
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
    // InternalGo.g:2487:1: entryRuleDecFunc returns [EObject current=null] : iv_ruleDecFunc= ruleDecFunc EOF ;
    public final EObject entryRuleDecFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecFunc = null;


        try {
            // InternalGo.g:2487:48: (iv_ruleDecFunc= ruleDecFunc EOF )
            // InternalGo.g:2488:2: iv_ruleDecFunc= ruleDecFunc EOF
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
    // InternalGo.g:2494:1: ruleDecFunc returns [EObject current=null] : ( ruleFUNC ( (lv_name_1_0= RULE_ID ) ) this_Open_parentheses_2= RULE_OPEN_PARENTHESES ( (lv_param_3_0= ruleParams ) )* this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES this_Open_Key_5= RULE_OPEN_KEY ( (lv_args_6_0= ruleGreeting ) )* this_Closed_Key_7= RULE_CLOSED_KEY ) ;
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
            // InternalGo.g:2500:2: ( ( ruleFUNC ( (lv_name_1_0= RULE_ID ) ) this_Open_parentheses_2= RULE_OPEN_PARENTHESES ( (lv_param_3_0= ruleParams ) )* this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES this_Open_Key_5= RULE_OPEN_KEY ( (lv_args_6_0= ruleGreeting ) )* this_Closed_Key_7= RULE_CLOSED_KEY ) )
            // InternalGo.g:2501:2: ( ruleFUNC ( (lv_name_1_0= RULE_ID ) ) this_Open_parentheses_2= RULE_OPEN_PARENTHESES ( (lv_param_3_0= ruleParams ) )* this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES this_Open_Key_5= RULE_OPEN_KEY ( (lv_args_6_0= ruleGreeting ) )* this_Closed_Key_7= RULE_CLOSED_KEY )
            {
            // InternalGo.g:2501:2: ( ruleFUNC ( (lv_name_1_0= RULE_ID ) ) this_Open_parentheses_2= RULE_OPEN_PARENTHESES ( (lv_param_3_0= ruleParams ) )* this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES this_Open_Key_5= RULE_OPEN_KEY ( (lv_args_6_0= ruleGreeting ) )* this_Closed_Key_7= RULE_CLOSED_KEY )
            // InternalGo.g:2502:3: ruleFUNC ( (lv_name_1_0= RULE_ID ) ) this_Open_parentheses_2= RULE_OPEN_PARENTHESES ( (lv_param_3_0= ruleParams ) )* this_Closed_parentheses_4= RULE_CLOSED_PARENTHESES this_Open_Key_5= RULE_OPEN_KEY ( (lv_args_6_0= ruleGreeting ) )* this_Closed_Key_7= RULE_CLOSED_KEY
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
            // InternalGo.g:2509:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGo.g:2510:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGo.g:2510:4: (lv_name_1_0= RULE_ID )
            // InternalGo.g:2511:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
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

            this_Open_parentheses_2=(Token)match(input,RULE_OPEN_PARENTHESES,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Open_parentheses_2, grammarAccess.getDecFuncAccess().getOpen_parenthesesTerminalRuleCall_2());
              		
            }
            // InternalGo.g:2531:3: ( (lv_param_3_0= ruleParams ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_ID) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalGo.g:2532:4: (lv_param_3_0= ruleParams )
            	    {
            	    // InternalGo.g:2532:4: (lv_param_3_0= ruleParams )
            	    // InternalGo.g:2533:5: lv_param_3_0= ruleParams
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDecFuncAccess().getParamParamsParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
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

            this_Closed_parentheses_4=(Token)match(input,RULE_CLOSED_PARENTHESES,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Closed_parentheses_4, grammarAccess.getDecFuncAccess().getClosed_parenthesesTerminalRuleCall_4());
              		
            }
            this_Open_Key_5=(Token)match(input,RULE_OPEN_KEY,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Open_Key_5, grammarAccess.getDecFuncAccess().getOpen_KeyTerminalRuleCall_5());
              		
            }
            // InternalGo.g:2558:3: ( (lv_args_6_0= ruleGreeting ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=RULE_EOL && LA49_0<=RULE_ID)||LA49_0==52||(LA49_0>=55 && LA49_0<=58)||LA49_0==62||LA49_0==64||LA49_0==66) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalGo.g:2559:4: (lv_args_6_0= ruleGreeting )
            	    {
            	    // InternalGo.g:2559:4: (lv_args_6_0= ruleGreeting )
            	    // InternalGo.g:2560:5: lv_args_6_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDecFuncAccess().getArgsGreetingParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
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
            	    break loop49;
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
    // InternalGo.g:2585:1: entryRuleCallFunc returns [EObject current=null] : iv_ruleCallFunc= ruleCallFunc EOF ;
    public final EObject entryRuleCallFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallFunc = null;


        try {
            // InternalGo.g:2585:49: (iv_ruleCallFunc= ruleCallFunc EOF )
            // InternalGo.g:2586:2: iv_ruleCallFunc= ruleCallFunc EOF
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
    // InternalGo.g:2592:1: ruleCallFunc returns [EObject current=null] : ( ( (lv_nameFunc_0_0= RULE_ID ) ) this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( (lv_param_2_0= ruleParams ) )* this_Closed_parentheses_3= RULE_CLOSED_PARENTHESES ) ;
    public final EObject ruleCallFunc() throws RecognitionException {
        EObject current = null;

        Token lv_nameFunc_0_0=null;
        Token this_Open_parentheses_1=null;
        Token this_Closed_parentheses_3=null;
        EObject lv_param_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2598:2: ( ( ( (lv_nameFunc_0_0= RULE_ID ) ) this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( (lv_param_2_0= ruleParams ) )* this_Closed_parentheses_3= RULE_CLOSED_PARENTHESES ) )
            // InternalGo.g:2599:2: ( ( (lv_nameFunc_0_0= RULE_ID ) ) this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( (lv_param_2_0= ruleParams ) )* this_Closed_parentheses_3= RULE_CLOSED_PARENTHESES )
            {
            // InternalGo.g:2599:2: ( ( (lv_nameFunc_0_0= RULE_ID ) ) this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( (lv_param_2_0= ruleParams ) )* this_Closed_parentheses_3= RULE_CLOSED_PARENTHESES )
            // InternalGo.g:2600:3: ( (lv_nameFunc_0_0= RULE_ID ) ) this_Open_parentheses_1= RULE_OPEN_PARENTHESES ( (lv_param_2_0= ruleParams ) )* this_Closed_parentheses_3= RULE_CLOSED_PARENTHESES
            {
            // InternalGo.g:2600:3: ( (lv_nameFunc_0_0= RULE_ID ) )
            // InternalGo.g:2601:4: (lv_nameFunc_0_0= RULE_ID )
            {
            // InternalGo.g:2601:4: (lv_nameFunc_0_0= RULE_ID )
            // InternalGo.g:2602:5: lv_nameFunc_0_0= RULE_ID
            {
            lv_nameFunc_0_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
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

            this_Open_parentheses_1=(Token)match(input,RULE_OPEN_PARENTHESES,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_Open_parentheses_1, grammarAccess.getCallFuncAccess().getOpen_parenthesesTerminalRuleCall_1());
              		
            }
            // InternalGo.g:2622:3: ( (lv_param_2_0= ruleParams ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_ID) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalGo.g:2623:4: (lv_param_2_0= ruleParams )
            	    {
            	    // InternalGo.g:2623:4: (lv_param_2_0= ruleParams )
            	    // InternalGo.g:2624:5: lv_param_2_0= ruleParams
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCallFuncAccess().getParamParamsParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
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
            	    break loop50;
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
    // InternalGo.g:2649:1: entryRuleTypes returns [String current=null] : iv_ruleTypes= ruleTypes EOF ;
    public final String entryRuleTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypes = null;


        try {
            // InternalGo.g:2649:45: (iv_ruleTypes= ruleTypes EOF )
            // InternalGo.g:2650:2: iv_ruleTypes= ruleTypes EOF
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
    // InternalGo.g:2656:1: ruleTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TYPE_0= ruleTYPE | kw= 'string' | kw= 'int' | kw= 'bool' | kw= 'byte' | kw= 'rune' | kw= 'float32' | kw= 'float64' ) ;
    public final AntlrDatatypeRuleToken ruleTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TYPE_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2662:2: ( (this_TYPE_0= ruleTYPE | kw= 'string' | kw= 'int' | kw= 'bool' | kw= 'byte' | kw= 'rune' | kw= 'float32' | kw= 'float64' ) )
            // InternalGo.g:2663:2: (this_TYPE_0= ruleTYPE | kw= 'string' | kw= 'int' | kw= 'bool' | kw= 'byte' | kw= 'rune' | kw= 'float32' | kw= 'float64' )
            {
            // InternalGo.g:2663:2: (this_TYPE_0= ruleTYPE | kw= 'string' | kw= 'int' | kw= 'bool' | kw= 'byte' | kw= 'rune' | kw= 'float32' | kw= 'float64' )
            int alt51=8;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt51=1;
                }
                break;
            case 40:
                {
                alt51=2;
                }
                break;
            case 41:
                {
                alt51=3;
                }
                break;
            case 42:
                {
                alt51=4;
                }
                break;
            case 43:
                {
                alt51=5;
                }
                break;
            case 44:
                {
                alt51=6;
                }
                break;
            case 45:
                {
                alt51=7;
                }
                break;
            case 46:
                {
                alt51=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalGo.g:2664:3: this_TYPE_0= ruleTYPE
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
                    // InternalGo.g:2675:3: kw= 'string'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getStringKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:2681:3: kw= 'int'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getIntKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:2687:3: kw= 'bool'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getBoolKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:2693:3: kw= 'byte'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getByteKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGo.g:2699:3: kw= 'rune'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getRuneKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGo.g:2705:3: kw= 'float32'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypesAccess().getFloat32Keyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalGo.g:2711:3: kw= 'float64'
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
    // InternalGo.g:2720:1: entryRuleModif returns [String current=null] : iv_ruleModif= ruleModif EOF ;
    public final String entryRuleModif() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModif = null;


        try {
            // InternalGo.g:2720:45: (iv_ruleModif= ruleModif EOF )
            // InternalGo.g:2721:2: iv_ruleModif= ruleModif EOF
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
    // InternalGo.g:2727:1: ruleModif returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VAR_0= ruleVAR | this_CONST_1= ruleCONST ) ;
    public final AntlrDatatypeRuleToken ruleModif() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VAR_0 = null;

        AntlrDatatypeRuleToken this_CONST_1 = null;



        	enterRule();

        try {
            // InternalGo.g:2733:2: ( (this_VAR_0= ruleVAR | this_CONST_1= ruleCONST ) )
            // InternalGo.g:2734:2: (this_VAR_0= ruleVAR | this_CONST_1= ruleCONST )
            {
            // InternalGo.g:2734:2: (this_VAR_0= ruleVAR | this_CONST_1= ruleCONST )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==62) ) {
                alt52=1;
            }
            else if ( (LA52_0==52) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalGo.g:2735:3: this_VAR_0= ruleVAR
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
                    // InternalGo.g:2746:3: this_CONST_1= ruleCONST
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
    // InternalGo.g:2760:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalGo.g:2760:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalGo.g:2761:2: iv_ruleBoolean= ruleBoolean EOF
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
    // InternalGo.g:2767:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2773:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalGo.g:2774:2: (kw= 'true' | kw= 'false' )
            {
            // InternalGo.g:2774:2: (kw= 'true' | kw= 'false' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==47) ) {
                alt53=1;
            }
            else if ( (LA53_0==48) ) {
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
                    // InternalGo.g:2775:3: kw= 'true'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2781:3: kw= 'false'
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
    // InternalGo.g:2790:1: entryRuleBREAK returns [String current=null] : iv_ruleBREAK= ruleBREAK EOF ;
    public final String entryRuleBREAK() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBREAK = null;


        try {
            // InternalGo.g:2790:45: (iv_ruleBREAK= ruleBREAK EOF )
            // InternalGo.g:2791:2: iv_ruleBREAK= ruleBREAK EOF
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
    // InternalGo.g:2797:1: ruleBREAK returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'break' ;
    public final AntlrDatatypeRuleToken ruleBREAK() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2803:2: (kw= 'break' )
            // InternalGo.g:2804:2: kw= 'break'
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
    // InternalGo.g:2812:1: entryRuleCASE returns [String current=null] : iv_ruleCASE= ruleCASE EOF ;
    public final String entryRuleCASE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCASE = null;


        try {
            // InternalGo.g:2812:44: (iv_ruleCASE= ruleCASE EOF )
            // InternalGo.g:2813:2: iv_ruleCASE= ruleCASE EOF
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
    // InternalGo.g:2819:1: ruleCASE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'case' ;
    public final AntlrDatatypeRuleToken ruleCASE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2825:2: (kw= 'case' )
            // InternalGo.g:2826:2: kw= 'case'
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
    // InternalGo.g:2834:1: entryRuleCHAN returns [String current=null] : iv_ruleCHAN= ruleCHAN EOF ;
    public final String entryRuleCHAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCHAN = null;


        try {
            // InternalGo.g:2834:44: (iv_ruleCHAN= ruleCHAN EOF )
            // InternalGo.g:2835:2: iv_ruleCHAN= ruleCHAN EOF
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
    // InternalGo.g:2841:1: ruleCHAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'chan' ;
    public final AntlrDatatypeRuleToken ruleCHAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2847:2: (kw= 'chan' )
            // InternalGo.g:2848:2: kw= 'chan'
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
    // InternalGo.g:2856:1: entryRuleCONST returns [String current=null] : iv_ruleCONST= ruleCONST EOF ;
    public final String entryRuleCONST() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCONST = null;


        try {
            // InternalGo.g:2856:45: (iv_ruleCONST= ruleCONST EOF )
            // InternalGo.g:2857:2: iv_ruleCONST= ruleCONST EOF
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
    // InternalGo.g:2863:1: ruleCONST returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'const' ;
    public final AntlrDatatypeRuleToken ruleCONST() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2869:2: (kw= 'const' )
            // InternalGo.g:2870:2: kw= 'const'
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
    // InternalGo.g:2878:1: entryRuleCONTINUE returns [String current=null] : iv_ruleCONTINUE= ruleCONTINUE EOF ;
    public final String entryRuleCONTINUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCONTINUE = null;


        try {
            // InternalGo.g:2878:48: (iv_ruleCONTINUE= ruleCONTINUE EOF )
            // InternalGo.g:2879:2: iv_ruleCONTINUE= ruleCONTINUE EOF
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
    // InternalGo.g:2885:1: ruleCONTINUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'continue' ;
    public final AntlrDatatypeRuleToken ruleCONTINUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2891:2: (kw= 'continue' )
            // InternalGo.g:2892:2: kw= 'continue'
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
    // InternalGo.g:2900:1: entryRuleELSE returns [String current=null] : iv_ruleELSE= ruleELSE EOF ;
    public final String entryRuleELSE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELSE = null;


        try {
            // InternalGo.g:2900:44: (iv_ruleELSE= ruleELSE EOF )
            // InternalGo.g:2901:2: iv_ruleELSE= ruleELSE EOF
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
    // InternalGo.g:2907:1: ruleELSE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'else' ;
    public final AntlrDatatypeRuleToken ruleELSE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2913:2: (kw= 'else' )
            // InternalGo.g:2914:2: kw= 'else'
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
    // InternalGo.g:2922:1: entryRuleFOR returns [String current=null] : iv_ruleFOR= ruleFOR EOF ;
    public final String entryRuleFOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFOR = null;


        try {
            // InternalGo.g:2922:43: (iv_ruleFOR= ruleFOR EOF )
            // InternalGo.g:2923:2: iv_ruleFOR= ruleFOR EOF
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
    // InternalGo.g:2929:1: ruleFOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'for' ;
    public final AntlrDatatypeRuleToken ruleFOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2935:2: (kw= 'for' )
            // InternalGo.g:2936:2: kw= 'for'
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
    // InternalGo.g:2944:1: entryRuleFUNC returns [String current=null] : iv_ruleFUNC= ruleFUNC EOF ;
    public final String entryRuleFUNC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFUNC = null;


        try {
            // InternalGo.g:2944:44: (iv_ruleFUNC= ruleFUNC EOF )
            // InternalGo.g:2945:2: iv_ruleFUNC= ruleFUNC EOF
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
    // InternalGo.g:2951:1: ruleFUNC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'func' ;
    public final AntlrDatatypeRuleToken ruleFUNC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2957:2: (kw= 'func' )
            // InternalGo.g:2958:2: kw= 'func'
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
    // InternalGo.g:2966:1: entryRuleIF returns [String current=null] : iv_ruleIF= ruleIF EOF ;
    public final String entryRuleIF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIF = null;


        try {
            // InternalGo.g:2966:42: (iv_ruleIF= ruleIF EOF )
            // InternalGo.g:2967:2: iv_ruleIF= ruleIF EOF
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
    // InternalGo.g:2973:1: ruleIF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'if' ;
    public final AntlrDatatypeRuleToken ruleIF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2979:2: (kw= 'if' )
            // InternalGo.g:2980:2: kw= 'if'
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
    // InternalGo.g:2988:1: entryRuleIMPORT returns [String current=null] : iv_ruleIMPORT= ruleIMPORT EOF ;
    public final String entryRuleIMPORT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIMPORT = null;


        try {
            // InternalGo.g:2988:46: (iv_ruleIMPORT= ruleIMPORT EOF )
            // InternalGo.g:2989:2: iv_ruleIMPORT= ruleIMPORT EOF
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
    // InternalGo.g:2995:1: ruleIMPORT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'import' ;
    public final AntlrDatatypeRuleToken ruleIMPORT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3001:2: (kw= 'import' )
            // InternalGo.g:3002:2: kw= 'import'
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
    // InternalGo.g:3010:1: entryRuleRETURN returns [String current=null] : iv_ruleRETURN= ruleRETURN EOF ;
    public final String entryRuleRETURN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRETURN = null;


        try {
            // InternalGo.g:3010:46: (iv_ruleRETURN= ruleRETURN EOF )
            // InternalGo.g:3011:2: iv_ruleRETURN= ruleRETURN EOF
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
    // InternalGo.g:3017:1: ruleRETURN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'return' ;
    public final AntlrDatatypeRuleToken ruleRETURN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3023:2: (kw= 'return' )
            // InternalGo.g:3024:2: kw= 'return'
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
    // InternalGo.g:3032:1: entryRulePACKAGE returns [String current=null] : iv_rulePACKAGE= rulePACKAGE EOF ;
    public final String entryRulePACKAGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePACKAGE = null;


        try {
            // InternalGo.g:3032:47: (iv_rulePACKAGE= rulePACKAGE EOF )
            // InternalGo.g:3033:2: iv_rulePACKAGE= rulePACKAGE EOF
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
    // InternalGo.g:3039:1: rulePACKAGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'package' ;
    public final AntlrDatatypeRuleToken rulePACKAGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3045:2: (kw= 'package' )
            // InternalGo.g:3046:2: kw= 'package'
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
    // InternalGo.g:3054:1: entryRuleTYPE returns [String current=null] : iv_ruleTYPE= ruleTYPE EOF ;
    public final String entryRuleTYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTYPE = null;


        try {
            // InternalGo.g:3054:44: (iv_ruleTYPE= ruleTYPE EOF )
            // InternalGo.g:3055:2: iv_ruleTYPE= ruleTYPE EOF
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
    // InternalGo.g:3061:1: ruleTYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'type' ;
    public final AntlrDatatypeRuleToken ruleTYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3067:2: (kw= 'type' )
            // InternalGo.g:3068:2: kw= 'type'
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
    // InternalGo.g:3076:1: entryRuleVAR returns [String current=null] : iv_ruleVAR= ruleVAR EOF ;
    public final String entryRuleVAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVAR = null;


        try {
            // InternalGo.g:3076:43: (iv_ruleVAR= ruleVAR EOF )
            // InternalGo.g:3077:2: iv_ruleVAR= ruleVAR EOF
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
    // InternalGo.g:3083:1: ruleVAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'var' ;
    public final AntlrDatatypeRuleToken ruleVAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3089:2: (kw= 'var' )
            // InternalGo.g:3090:2: kw= 'var'
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
    // InternalGo.g:3098:1: entryRuleDEFAULT returns [String current=null] : iv_ruleDEFAULT= ruleDEFAULT EOF ;
    public final String entryRuleDEFAULT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDEFAULT = null;


        try {
            // InternalGo.g:3098:47: (iv_ruleDEFAULT= ruleDEFAULT EOF )
            // InternalGo.g:3099:2: iv_ruleDEFAULT= ruleDEFAULT EOF
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
    // InternalGo.g:3105:1: ruleDEFAULT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'default' ;
    public final AntlrDatatypeRuleToken ruleDEFAULT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3111:2: (kw= 'default' )
            // InternalGo.g:3112:2: kw= 'default'
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
    // InternalGo.g:3120:1: entryRuleSWITCH returns [String current=null] : iv_ruleSWITCH= ruleSWITCH EOF ;
    public final String entryRuleSWITCH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSWITCH = null;


        try {
            // InternalGo.g:3120:46: (iv_ruleSWITCH= ruleSWITCH EOF )
            // InternalGo.g:3121:2: iv_ruleSWITCH= ruleSWITCH EOF
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
    // InternalGo.g:3127:1: ruleSWITCH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'switch' ;
    public final AntlrDatatypeRuleToken ruleSWITCH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3133:2: (kw= 'switch' )
            // InternalGo.g:3134:2: kw= 'switch'
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
    // InternalGo.g:3142:1: entryRuleRANGE returns [String current=null] : iv_ruleRANGE= ruleRANGE EOF ;
    public final String entryRuleRANGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRANGE = null;


        try {
            // InternalGo.g:3142:45: (iv_ruleRANGE= ruleRANGE EOF )
            // InternalGo.g:3143:2: iv_ruleRANGE= ruleRANGE EOF
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
    // InternalGo.g:3149:1: ruleRANGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'range' ;
    public final AntlrDatatypeRuleToken ruleRANGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3155:2: (kw= 'range' )
            // InternalGo.g:3156:2: kw= 'range'
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
    // InternalGo.g:3164:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalGo.g:3164:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalGo.g:3165:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalGo.g:3171:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGo.g:3177:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGo.g:3178:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGo.g:3178:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGo.g:3179:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
              		
            }
            // InternalGo.g:3183:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGo.g:3184:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGo.g:3184:4: (lv_name_1_0= RULE_ID )
            // InternalGo.g:3185:5: lv_name_1_0= RULE_ID
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
        // InternalGo.g:1228:4: ( ruleELSE )
        // InternalGo.g:1228:5: ruleELSE
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
        // InternalGo.g:1248:4: ( ruleELSE )
        // InternalGo.g:1248:5: ruleELSE
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
        // InternalGo.g:1489:5: ( ruleAndExpression )
        // InternalGo.g:1489:6: ruleAndExpression
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
        // InternalGo.g:1588:4: ( ruleSubMult )
        // InternalGo.g:1588:5: ruleSubMult
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
        // InternalGo.g:1609:4: ( ruleSubMult )
        // InternalGo.g:1609:5: ruleSubMult
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
        // InternalGo.g:1896:4: ( rulePrimaryExpression )
        // InternalGo.g:1896:5: rulePrimaryExpression
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
        // InternalGo.g:1908:4: ( rulePrimaryExpression )
        // InternalGo.g:1908:5: rulePrimaryExpression
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
        // InternalGo.g:2271:4: ( rulePrimaryExpression )
        // InternalGo.g:2271:5: rulePrimaryExpression
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
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\4\2\5\12\uffff";
    static final String dfa_3s = "\1\102\2\7\12\uffff";
    static final String dfa_4s = "\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\2\1\1";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\1\11\56\uffff\1\2\2\uffff\1\12\1\4\1\6\1\10\3\uffff\1\1\1\uffff\1\7\1\uffff\1\3",
            "\1\13\1\uffff\1\14",
            "\1\13\1\uffff\1\14",
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
            return "114:2: (this_MultDecVars_0= ruleMultDecVars | this_DecVar_1= ruleDecVar | this_DataType_2= ruleDataType | this_DecFunc_3= ruleDecFunc | this_EOL_4= RULE_EOL | this_Condition_5= ruleCondition | this_SwitchCase_6= ruleSwitchCase | ruleDecImport | this_CallFunc_8= ruleCallFunc | this_CallFor_9= ruleCallFor )";
        }
    }
    static final String dfa_7s = "\1\64\2\5\1\6\11\uffff";
    static final String dfa_8s = "\1\76\2\5\1\75\11\uffff";
    static final String dfa_9s = "\4\uffff\1\2\10\1";
    static final String[] dfa_10s = {
            "\1\2\11\uffff\1\1",
            "\1\3",
            "\1\3",
            "\1\4\41\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\16\uffff\1\5",
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
    static final char[] dfa_7 = DFA.unpackEncodedStringToUnsignedChars(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final short[][] dfa_10 = unpackEncodedStringArray(dfa_10s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_7;
            this.max = dfa_8;
            this.accept = dfa_9;
            this.special = dfa_5;
            this.transition = dfa_10;
        }
        public String getDescription() {
            return "280:2: ( ( (lv_declaration_0_0= ruleDecl ) ) | ( (lv_assignment_1_0= ruleAtribVar ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x4790000000000032L,0x0000000000000005L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x20007F0000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x20007F0000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000180000000B020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x8004000000000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x4790000000000830L,0x0000000000000005L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000180000000B0A0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x4790000000000030L,0x0000000000000005L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000180000000B000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000008080L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000008100L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000180000000B080L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x401180000000B280L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000000F800000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000000F800000000L});

}