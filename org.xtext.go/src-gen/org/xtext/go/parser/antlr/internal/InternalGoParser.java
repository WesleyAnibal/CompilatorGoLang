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

@SuppressWarnings("all")
public class InternalGoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'='", "'['", "']'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'print'", "'datatype'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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
             newCompositeNode(grammarAccess.getGoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGo=ruleGo();

            state._fsp--;

             current =iv_ruleGo; 
            match(input,EOF,FOLLOW_2); 

            }

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

                if ( (LA1_0==RULE_ID||(LA1_0>=25 && LA1_0<=26)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGo.g:79:3: (lv_elements_0_0= ruleGreeting )
            	    {
            	    // InternalGo.g:79:3: (lv_elements_0_0= ruleGreeting )
            	    // InternalGo.g:80:4: lv_elements_0_0= ruleGreeting
            	    {

            	    				newCompositeNode(grammarAccess.getGoAccess().getElementsGreetingParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleGreeting();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;

             current =iv_ruleGreeting; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalGo.g:107:1: ruleGreeting returns [EObject current=null] : (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity | this_TypeSpec_2= ruleTypeSpec ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_Entity_1 = null;

        EObject this_TypeSpec_2 = null;



        	enterRule();

        try {
            // InternalGo.g:113:2: ( (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity | this_TypeSpec_2= ruleTypeSpec ) )
            // InternalGo.g:114:2: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity | this_TypeSpec_2= ruleTypeSpec )
            {
            // InternalGo.g:114:2: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity | this_TypeSpec_2= ruleTypeSpec )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGo.g:115:3: this_DataType_0= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getGreetingAccess().getDataTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_0=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGo.g:124:3: this_Entity_1= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getGreetingAccess().getEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_1=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGo.g:133:3: this_TypeSpec_2= ruleTypeSpec
                    {

                    			newCompositeNode(grammarAccess.getGreetingAccess().getTypeSpecParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeSpec_2=ruleTypeSpec();

                    state._fsp--;


                    			current = this_TypeSpec_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleType"
    // InternalGo.g:145:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalGo.g:145:45: (iv_ruleType= ruleType EOF )
            // InternalGo.g:146:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalGo.g:152:1: ruleType returns [EObject current=null] : (this_TypeName_0= ruleTypeName | ruleTypeLit | (otherlv_2= '(' this_Type_3= ruleType otherlv_4= ')' ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_TypeName_0 = null;

        EObject this_Type_3 = null;



        	enterRule();

        try {
            // InternalGo.g:158:2: ( (this_TypeName_0= ruleTypeName | ruleTypeLit | (otherlv_2= '(' this_Type_3= ruleType otherlv_4= ')' ) ) )
            // InternalGo.g:159:2: (this_TypeName_0= ruleTypeName | ruleTypeLit | (otherlv_2= '(' this_Type_3= ruleType otherlv_4= ')' ) )
            {
            // InternalGo.g:159:2: (this_TypeName_0= ruleTypeName | ruleTypeLit | (otherlv_2= '(' this_Type_3= ruleType otherlv_4= ')' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 11:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGo.g:160:3: this_TypeName_0= ruleTypeName
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getTypeNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeName_0=ruleTypeName();

                    state._fsp--;


                    			current = this_TypeName_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGo.g:169:3: ruleTypeLit
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getTypeLitParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    ruleTypeLit();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGo.g:177:3: (otherlv_2= '(' this_Type_3= ruleType otherlv_4= ')' )
                    {
                    // InternalGo.g:177:3: (otherlv_2= '(' this_Type_3= ruleType otherlv_4= ')' )
                    // InternalGo.g:178:4: otherlv_2= '(' this_Type_3= ruleType otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getTypeAccess().getTypeParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_5);
                    this_Type_3=ruleType();

                    state._fsp--;


                    				current = this_Type_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeName"
    // InternalGo.g:199:1: entryRuleTypeName returns [EObject current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final EObject entryRuleTypeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeName = null;


        try {
            // InternalGo.g:199:49: (iv_ruleTypeName= ruleTypeName EOF )
            // InternalGo.g:200:2: iv_ruleTypeName= ruleTypeName EOF
            {
             newCompositeNode(grammarAccess.getTypeNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeName=ruleTypeName();

            state._fsp--;

             current =iv_ruleTypeName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeName"


    // $ANTLR start "ruleTypeName"
    // InternalGo.g:206:1: ruleTypeName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTypeName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalGo.g:212:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalGo.g:213:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalGo.g:213:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalGo.g:214:3: (lv_name_0_0= RULE_ID )
            {
            // InternalGo.g:214:3: (lv_name_0_0= RULE_ID )
            // InternalGo.g:215:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getTypeNameAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTypeNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeName"


    // $ANTLR start "entryRuleTypeSpec"
    // InternalGo.g:234:1: entryRuleTypeSpec returns [EObject current=null] : iv_ruleTypeSpec= ruleTypeSpec EOF ;
    public final EObject entryRuleTypeSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSpec = null;


        try {
            // InternalGo.g:234:49: (iv_ruleTypeSpec= ruleTypeSpec EOF )
            // InternalGo.g:235:2: iv_ruleTypeSpec= ruleTypeSpec EOF
            {
             newCompositeNode(grammarAccess.getTypeSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeSpec=ruleTypeSpec();

            state._fsp--;

             current =iv_ruleTypeSpec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeSpec"


    // $ANTLR start "ruleTypeSpec"
    // InternalGo.g:241:1: ruleTypeSpec returns [EObject current=null] : (this_AliasDecl_0= ruleAliasDecl | this_TypeDef_1= ruleTypeDef ) ;
    public final EObject ruleTypeSpec() throws RecognitionException {
        EObject current = null;

        EObject this_AliasDecl_0 = null;

        EObject this_TypeDef_1 = null;



        	enterRule();

        try {
            // InternalGo.g:247:2: ( (this_AliasDecl_0= ruleAliasDecl | this_TypeDef_1= ruleTypeDef ) )
            // InternalGo.g:248:2: (this_AliasDecl_0= ruleAliasDecl | this_TypeDef_1= ruleTypeDef )
            {
            // InternalGo.g:248:2: (this_AliasDecl_0= ruleAliasDecl | this_TypeDef_1= ruleTypeDef )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==13) ) {
                    alt4=1;
                }
                else if ( (LA4_1==RULE_ID||LA4_1==11||LA4_1==14) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGo.g:249:3: this_AliasDecl_0= ruleAliasDecl
                    {

                    			newCompositeNode(grammarAccess.getTypeSpecAccess().getAliasDeclParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AliasDecl_0=ruleAliasDecl();

                    state._fsp--;


                    			current = this_AliasDecl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGo.g:258:3: this_TypeDef_1= ruleTypeDef
                    {

                    			newCompositeNode(grammarAccess.getTypeSpecAccess().getTypeDefParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeDef_1=ruleTypeDef();

                    state._fsp--;


                    			current = this_TypeDef_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeSpec"


    // $ANTLR start "entryRuleTypeDef"
    // InternalGo.g:270:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // InternalGo.g:270:48: (iv_ruleTypeDef= ruleTypeDef EOF )
            // InternalGo.g:271:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
             newCompositeNode(grammarAccess.getTypeDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeDef=ruleTypeDef();

            state._fsp--;

             current =iv_ruleTypeDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDef"


    // $ANTLR start "ruleTypeDef"
    // InternalGo.g:277:1: ruleTypeDef returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:283:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleType ) ) ) )
            // InternalGo.g:284:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleType ) ) )
            {
            // InternalGo.g:284:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleType ) ) )
            // InternalGo.g:285:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleType ) )
            {
            // InternalGo.g:285:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGo.g:286:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGo.g:286:4: (lv_name_0_0= RULE_ID )
            // InternalGo.g:287:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGo.g:303:3: ( (lv_type_1_0= ruleType ) )
            // InternalGo.g:304:4: (lv_type_1_0= ruleType )
            {
            // InternalGo.g:304:4: (lv_type_1_0= ruleType )
            // InternalGo.g:305:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getTypeDefAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeDefRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.go.Go.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleAliasDecl"
    // InternalGo.g:326:1: entryRuleAliasDecl returns [EObject current=null] : iv_ruleAliasDecl= ruleAliasDecl EOF ;
    public final EObject entryRuleAliasDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasDecl = null;


        try {
            // InternalGo.g:326:50: (iv_ruleAliasDecl= ruleAliasDecl EOF )
            // InternalGo.g:327:2: iv_ruleAliasDecl= ruleAliasDecl EOF
            {
             newCompositeNode(grammarAccess.getAliasDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAliasDecl=ruleAliasDecl();

            state._fsp--;

             current =iv_ruleAliasDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAliasDecl"


    // $ANTLR start "ruleAliasDecl"
    // InternalGo.g:333:1: ruleAliasDecl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleAliasDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:339:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruleType ) ) ) )
            // InternalGo.g:340:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalGo.g:340:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruleType ) ) )
            // InternalGo.g:341:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruleType ) )
            {
            // InternalGo.g:341:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGo.g:342:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGo.g:342:4: (lv_name_0_0= RULE_ID )
            // InternalGo.g:343:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAliasDeclAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAliasDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAliasDeclAccess().getEqualsSignKeyword_1());
            		
            // InternalGo.g:363:3: ( (lv_type_2_0= ruleType ) )
            // InternalGo.g:364:4: (lv_type_2_0= ruleType )
            {
            // InternalGo.g:364:4: (lv_type_2_0= ruleType )
            // InternalGo.g:365:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getAliasDeclAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAliasDeclRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.go.Go.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAliasDecl"


    // $ANTLR start "entryRuleTypeLit"
    // InternalGo.g:386:1: entryRuleTypeLit returns [String current=null] : iv_ruleTypeLit= ruleTypeLit EOF ;
    public final String entryRuleTypeLit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeLit = null;


        try {
            // InternalGo.g:386:47: (iv_ruleTypeLit= ruleTypeLit EOF )
            // InternalGo.g:387:2: iv_ruleTypeLit= ruleTypeLit EOF
            {
             newCompositeNode(grammarAccess.getTypeLitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeLit=ruleTypeLit();

            state._fsp--;

             current =iv_ruleTypeLit.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeLit"


    // $ANTLR start "ruleTypeLit"
    // InternalGo.g:393:1: ruleTypeLit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ArrayType_0= ruleArrayType ;
    public final AntlrDatatypeRuleToken ruleTypeLit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ArrayType_0 = null;



        	enterRule();

        try {
            // InternalGo.g:399:2: (this_ArrayType_0= ruleArrayType )
            // InternalGo.g:400:2: this_ArrayType_0= ruleArrayType
            {

            		newCompositeNode(grammarAccess.getTypeLitAccess().getArrayTypeParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ArrayType_0=ruleArrayType();

            state._fsp--;


            		current.merge(this_ArrayType_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeLit"


    // $ANTLR start "entryRuleArrayType"
    // InternalGo.g:413:1: entryRuleArrayType returns [String current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final String entryRuleArrayType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayType = null;


        try {
            // InternalGo.g:413:49: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalGo.g:414:2: iv_ruleArrayType= ruleArrayType EOF
            {
             newCompositeNode(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayType=ruleArrayType();

            state._fsp--;

             current =iv_ruleArrayType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // InternalGo.g:420:1: ruleArrayType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' (this_ArrayLength_1= ruleArrayLength )* kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleArrayType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ArrayLength_1 = null;



        	enterRule();

        try {
            // InternalGo.g:426:2: ( (kw= '[' (this_ArrayLength_1= ruleArrayLength )* kw= ']' ) )
            // InternalGo.g:427:2: (kw= '[' (this_ArrayLength_1= ruleArrayLength )* kw= ']' )
            {
            // InternalGo.g:427:2: (kw= '[' (this_ArrayLength_1= ruleArrayLength )* kw= ']' )
            // InternalGo.g:428:3: kw= '[' (this_ArrayLength_1= ruleArrayLength )* kw= ']'
            {
            kw=(Token)match(input,14,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalGo.g:433:3: (this_ArrayLength_1= ruleArrayLength )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=16 && LA5_0<=24)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGo.g:434:4: this_ArrayLength_1= ruleArrayLength
            	    {

            	    				newCompositeNode(grammarAccess.getArrayTypeAccess().getArrayLengthParserRuleCall_1());
            	    			
            	    pushFollow(FOLLOW_7);
            	    this_ArrayLength_1=ruleArrayLength();

            	    state._fsp--;


            	    				current.merge(this_ArrayLength_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            kw=(Token)match(input,15,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleArrayLength"
    // InternalGo.g:454:1: entryRuleArrayLength returns [String current=null] : iv_ruleArrayLength= ruleArrayLength EOF ;
    public final String entryRuleArrayLength() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayLength = null;


        try {
            // InternalGo.g:454:51: (iv_ruleArrayLength= ruleArrayLength EOF )
            // InternalGo.g:455:2: iv_ruleArrayLength= ruleArrayLength EOF
            {
             newCompositeNode(grammarAccess.getArrayLengthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayLength=ruleArrayLength();

            state._fsp--;

             current =iv_ruleArrayLength.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayLength"


    // $ANTLR start "ruleArrayLength"
    // InternalGo.g:461:1: ruleArrayLength returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' ) ;
    public final AntlrDatatypeRuleToken ruleArrayLength() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:467:2: ( (kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' ) )
            // InternalGo.g:468:2: (kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )
            {
            // InternalGo.g:468:2: (kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )
            int alt6=9;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            case 19:
                {
                alt6=4;
                }
                break;
            case 20:
                {
                alt6=5;
                }
                break;
            case 21:
                {
                alt6=6;
                }
                break;
            case 22:
                {
                alt6=7;
                }
                break;
            case 23:
                {
                alt6=8;
                }
                break;
            case 24:
                {
                alt6=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalGo.g:469:3: kw= '1'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArrayLengthAccess().getDigitOneKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGo.g:475:3: kw= '2'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArrayLengthAccess().getDigitTwoKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalGo.g:481:3: kw= '3'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArrayLengthAccess().getDigitThreeKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalGo.g:487:3: kw= '4'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArrayLengthAccess().getDigitFourKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalGo.g:493:3: kw= '5'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArrayLengthAccess().getDigitFiveKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalGo.g:499:3: kw= '6'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArrayLengthAccess().getDigitSixKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalGo.g:505:3: kw= '7'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArrayLengthAccess().getDigitSevenKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalGo.g:511:3: kw= '8'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArrayLengthAccess().getDigitEightKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalGo.g:517:3: kw= '9'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArrayLengthAccess().getDigitNineKeyword_8());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayLength"


    // $ANTLR start "entryRuleEntity"
    // InternalGo.g:526:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalGo.g:526:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalGo.g:527:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalGo.g:533:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'print' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGo.g:539:2: ( (otherlv_0= 'print' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalGo.g:540:2: (otherlv_0= 'print' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalGo.g:540:2: (otherlv_0= 'print' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' )
            // InternalGo.g:541:3: otherlv_0= 'print' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getPrintKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGo.g:549:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGo.g:550:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGo.g:550:4: (lv_name_2_0= RULE_ID )
            // InternalGo.g:551:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0());
            				

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

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

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
    // InternalGo.g:575:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalGo.g:575:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalGo.g:576:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalGo.g:582:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGo.g:588:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGo.g:589:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGo.g:589:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGo.g:590:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalGo.g:594:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGo.g:595:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGo.g:595:4: (lv_name_1_0= RULE_ID )
            // InternalGo.g:596:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

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


            	leaveRule();

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000006000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004810L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001FF8000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});

}