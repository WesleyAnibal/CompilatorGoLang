package org.xtext.go.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.go.services.GoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'('", "')'", "'='", "'['", "']'", "'print'", "'datatype'"
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

    	public void setGrammarAccess(GoGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleGo"
    // InternalGo.g:53:1: entryRuleGo : ruleGo EOF ;
    public final void entryRuleGo() throws RecognitionException {
        try {
            // InternalGo.g:54:1: ( ruleGo EOF )
            // InternalGo.g:55:1: ruleGo EOF
            {
             before(grammarAccess.getGoRule()); 
            pushFollow(FOLLOW_1);
            ruleGo();

            state._fsp--;

             after(grammarAccess.getGoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGo"


    // $ANTLR start "ruleGo"
    // InternalGo.g:62:1: ruleGo : ( ( rule__Go__ElementsAssignment )* ) ;
    public final void ruleGo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:66:2: ( ( ( rule__Go__ElementsAssignment )* ) )
            // InternalGo.g:67:2: ( ( rule__Go__ElementsAssignment )* )
            {
            // InternalGo.g:67:2: ( ( rule__Go__ElementsAssignment )* )
            // InternalGo.g:68:3: ( rule__Go__ElementsAssignment )*
            {
             before(grammarAccess.getGoAccess().getElementsAssignment()); 
            // InternalGo.g:69:3: ( rule__Go__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=25 && LA1_0<=26)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGo.g:69:4: rule__Go__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Go__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getGoAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGo"


    // $ANTLR start "entryRuleGreeting"
    // InternalGo.g:78:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // InternalGo.g:79:1: ( ruleGreeting EOF )
            // InternalGo.g:80:1: ruleGreeting EOF
            {
             before(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_1);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getGreetingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // InternalGo.g:87:1: ruleGreeting : ( ( rule__Greeting__Alternatives ) ) ;
    public final void ruleGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:91:2: ( ( ( rule__Greeting__Alternatives ) ) )
            // InternalGo.g:92:2: ( ( rule__Greeting__Alternatives ) )
            {
            // InternalGo.g:92:2: ( ( rule__Greeting__Alternatives ) )
            // InternalGo.g:93:3: ( rule__Greeting__Alternatives )
            {
             before(grammarAccess.getGreetingAccess().getAlternatives()); 
            // InternalGo.g:94:3: ( rule__Greeting__Alternatives )
            // InternalGo.g:94:4: rule__Greeting__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleType"
    // InternalGo.g:103:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalGo.g:104:1: ( ruleType EOF )
            // InternalGo.g:105:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalGo.g:112:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:116:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalGo.g:117:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalGo.g:117:2: ( ( rule__Type__Alternatives ) )
            // InternalGo.g:118:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalGo.g:119:3: ( rule__Type__Alternatives )
            // InternalGo.g:119:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeName"
    // InternalGo.g:128:1: entryRuleTypeName : ruleTypeName EOF ;
    public final void entryRuleTypeName() throws RecognitionException {
        try {
            // InternalGo.g:129:1: ( ruleTypeName EOF )
            // InternalGo.g:130:1: ruleTypeName EOF
            {
             before(grammarAccess.getTypeNameRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeName();

            state._fsp--;

             after(grammarAccess.getTypeNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeName"


    // $ANTLR start "ruleTypeName"
    // InternalGo.g:137:1: ruleTypeName : ( ( rule__TypeName__NameAssignment ) ) ;
    public final void ruleTypeName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:141:2: ( ( ( rule__TypeName__NameAssignment ) ) )
            // InternalGo.g:142:2: ( ( rule__TypeName__NameAssignment ) )
            {
            // InternalGo.g:142:2: ( ( rule__TypeName__NameAssignment ) )
            // InternalGo.g:143:3: ( rule__TypeName__NameAssignment )
            {
             before(grammarAccess.getTypeNameAccess().getNameAssignment()); 
            // InternalGo.g:144:3: ( rule__TypeName__NameAssignment )
            // InternalGo.g:144:4: rule__TypeName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TypeName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTypeNameAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeName"


    // $ANTLR start "entryRuleTypeSpec"
    // InternalGo.g:153:1: entryRuleTypeSpec : ruleTypeSpec EOF ;
    public final void entryRuleTypeSpec() throws RecognitionException {
        try {
            // InternalGo.g:154:1: ( ruleTypeSpec EOF )
            // InternalGo.g:155:1: ruleTypeSpec EOF
            {
             before(grammarAccess.getTypeSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeSpec();

            state._fsp--;

             after(grammarAccess.getTypeSpecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeSpec"


    // $ANTLR start "ruleTypeSpec"
    // InternalGo.g:162:1: ruleTypeSpec : ( ( rule__TypeSpec__Alternatives ) ) ;
    public final void ruleTypeSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:166:2: ( ( ( rule__TypeSpec__Alternatives ) ) )
            // InternalGo.g:167:2: ( ( rule__TypeSpec__Alternatives ) )
            {
            // InternalGo.g:167:2: ( ( rule__TypeSpec__Alternatives ) )
            // InternalGo.g:168:3: ( rule__TypeSpec__Alternatives )
            {
             before(grammarAccess.getTypeSpecAccess().getAlternatives()); 
            // InternalGo.g:169:3: ( rule__TypeSpec__Alternatives )
            // InternalGo.g:169:4: rule__TypeSpec__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeSpec__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeSpecAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeSpec"


    // $ANTLR start "entryRuleTypeDef"
    // InternalGo.g:178:1: entryRuleTypeDef : ruleTypeDef EOF ;
    public final void entryRuleTypeDef() throws RecognitionException {
        try {
            // InternalGo.g:179:1: ( ruleTypeDef EOF )
            // InternalGo.g:180:1: ruleTypeDef EOF
            {
             before(grammarAccess.getTypeDefRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeDef();

            state._fsp--;

             after(grammarAccess.getTypeDefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeDef"


    // $ANTLR start "ruleTypeDef"
    // InternalGo.g:187:1: ruleTypeDef : ( ( rule__TypeDef__Group__0 ) ) ;
    public final void ruleTypeDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:191:2: ( ( ( rule__TypeDef__Group__0 ) ) )
            // InternalGo.g:192:2: ( ( rule__TypeDef__Group__0 ) )
            {
            // InternalGo.g:192:2: ( ( rule__TypeDef__Group__0 ) )
            // InternalGo.g:193:3: ( rule__TypeDef__Group__0 )
            {
             before(grammarAccess.getTypeDefAccess().getGroup()); 
            // InternalGo.g:194:3: ( rule__TypeDef__Group__0 )
            // InternalGo.g:194:4: rule__TypeDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleAliasDecl"
    // InternalGo.g:203:1: entryRuleAliasDecl : ruleAliasDecl EOF ;
    public final void entryRuleAliasDecl() throws RecognitionException {
        try {
            // InternalGo.g:204:1: ( ruleAliasDecl EOF )
            // InternalGo.g:205:1: ruleAliasDecl EOF
            {
             before(grammarAccess.getAliasDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleAliasDecl();

            state._fsp--;

             after(grammarAccess.getAliasDeclRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAliasDecl"


    // $ANTLR start "ruleAliasDecl"
    // InternalGo.g:212:1: ruleAliasDecl : ( ( rule__AliasDecl__Group__0 ) ) ;
    public final void ruleAliasDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:216:2: ( ( ( rule__AliasDecl__Group__0 ) ) )
            // InternalGo.g:217:2: ( ( rule__AliasDecl__Group__0 ) )
            {
            // InternalGo.g:217:2: ( ( rule__AliasDecl__Group__0 ) )
            // InternalGo.g:218:3: ( rule__AliasDecl__Group__0 )
            {
             before(grammarAccess.getAliasDeclAccess().getGroup()); 
            // InternalGo.g:219:3: ( rule__AliasDecl__Group__0 )
            // InternalGo.g:219:4: rule__AliasDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AliasDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAliasDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAliasDecl"


    // $ANTLR start "entryRuleTypeLit"
    // InternalGo.g:228:1: entryRuleTypeLit : ruleTypeLit EOF ;
    public final void entryRuleTypeLit() throws RecognitionException {
        try {
            // InternalGo.g:229:1: ( ruleTypeLit EOF )
            // InternalGo.g:230:1: ruleTypeLit EOF
            {
             before(grammarAccess.getTypeLitRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeLit();

            state._fsp--;

             after(grammarAccess.getTypeLitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeLit"


    // $ANTLR start "ruleTypeLit"
    // InternalGo.g:237:1: ruleTypeLit : ( ruleArrayType ) ;
    public final void ruleTypeLit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:241:2: ( ( ruleArrayType ) )
            // InternalGo.g:242:2: ( ruleArrayType )
            {
            // InternalGo.g:242:2: ( ruleArrayType )
            // InternalGo.g:243:3: ruleArrayType
            {
             before(grammarAccess.getTypeLitAccess().getArrayTypeParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getTypeLitAccess().getArrayTypeParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeLit"


    // $ANTLR start "entryRuleArrayType"
    // InternalGo.g:253:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // InternalGo.g:254:1: ( ruleArrayType EOF )
            // InternalGo.g:255:1: ruleArrayType EOF
            {
             before(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getArrayTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // InternalGo.g:262:1: ruleArrayType : ( ( rule__ArrayType__Group__0 ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:266:2: ( ( ( rule__ArrayType__Group__0 ) ) )
            // InternalGo.g:267:2: ( ( rule__ArrayType__Group__0 ) )
            {
            // InternalGo.g:267:2: ( ( rule__ArrayType__Group__0 ) )
            // InternalGo.g:268:3: ( rule__ArrayType__Group__0 )
            {
             before(grammarAccess.getArrayTypeAccess().getGroup()); 
            // InternalGo.g:269:3: ( rule__ArrayType__Group__0 )
            // InternalGo.g:269:4: rule__ArrayType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleArrayLength"
    // InternalGo.g:278:1: entryRuleArrayLength : ruleArrayLength EOF ;
    public final void entryRuleArrayLength() throws RecognitionException {
        try {
            // InternalGo.g:279:1: ( ruleArrayLength EOF )
            // InternalGo.g:280:1: ruleArrayLength EOF
            {
             before(grammarAccess.getArrayLengthRule()); 
            pushFollow(FOLLOW_1);
            ruleArrayLength();

            state._fsp--;

             after(grammarAccess.getArrayLengthRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayLength"


    // $ANTLR start "ruleArrayLength"
    // InternalGo.g:287:1: ruleArrayLength : ( ( rule__ArrayLength__Alternatives ) ) ;
    public final void ruleArrayLength() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:291:2: ( ( ( rule__ArrayLength__Alternatives ) ) )
            // InternalGo.g:292:2: ( ( rule__ArrayLength__Alternatives ) )
            {
            // InternalGo.g:292:2: ( ( rule__ArrayLength__Alternatives ) )
            // InternalGo.g:293:3: ( rule__ArrayLength__Alternatives )
            {
             before(grammarAccess.getArrayLengthAccess().getAlternatives()); 
            // InternalGo.g:294:3: ( rule__ArrayLength__Alternatives )
            // InternalGo.g:294:4: rule__ArrayLength__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ArrayLength__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArrayLengthAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayLength"


    // $ANTLR start "entryRuleEntity"
    // InternalGo.g:303:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalGo.g:304:1: ( ruleEntity EOF )
            // InternalGo.g:305:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalGo.g:312:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:316:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalGo.g:317:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalGo.g:317:2: ( ( rule__Entity__Group__0 ) )
            // InternalGo.g:318:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalGo.g:319:3: ( rule__Entity__Group__0 )
            // InternalGo.g:319:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleDataType"
    // InternalGo.g:328:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalGo.g:329:1: ( ruleDataType EOF )
            // InternalGo.g:330:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalGo.g:337:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:341:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalGo.g:342:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalGo.g:342:2: ( ( rule__DataType__Group__0 ) )
            // InternalGo.g:343:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalGo.g:344:3: ( rule__DataType__Group__0 )
            // InternalGo.g:344:4: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "rule__Greeting__Alternatives"
    // InternalGo.g:352:1: rule__Greeting__Alternatives : ( ( ruleDataType ) | ( ruleEntity ) | ( ruleTypeSpec ) );
    public final void rule__Greeting__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:356:1: ( ( ruleDataType ) | ( ruleEntity ) | ( ruleTypeSpec ) )
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
                    // InternalGo.g:357:2: ( ruleDataType )
                    {
                    // InternalGo.g:357:2: ( ruleDataType )
                    // InternalGo.g:358:3: ruleDataType
                    {
                     before(grammarAccess.getGreetingAccess().getDataTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getGreetingAccess().getDataTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:363:2: ( ruleEntity )
                    {
                    // InternalGo.g:363:2: ( ruleEntity )
                    // InternalGo.g:364:3: ruleEntity
                    {
                     before(grammarAccess.getGreetingAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getGreetingAccess().getEntityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:369:2: ( ruleTypeSpec )
                    {
                    // InternalGo.g:369:2: ( ruleTypeSpec )
                    // InternalGo.g:370:3: ruleTypeSpec
                    {
                     before(grammarAccess.getGreetingAccess().getTypeSpecParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeSpec();

                    state._fsp--;

                     after(grammarAccess.getGreetingAccess().getTypeSpecParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalGo.g:379:1: rule__Type__Alternatives : ( ( ruleTypeName ) | ( ruleTypeLit ) | ( ( rule__Type__Group_2__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:383:1: ( ( ruleTypeName ) | ( ruleTypeLit ) | ( ( rule__Type__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case 20:
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
                    // InternalGo.g:384:2: ( ruleTypeName )
                    {
                    // InternalGo.g:384:2: ( ruleTypeName )
                    // InternalGo.g:385:3: ruleTypeName
                    {
                     before(grammarAccess.getTypeAccess().getTypeNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeName();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getTypeNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:390:2: ( ruleTypeLit )
                    {
                    // InternalGo.g:390:2: ( ruleTypeLit )
                    // InternalGo.g:391:3: ruleTypeLit
                    {
                     before(grammarAccess.getTypeAccess().getTypeLitParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeLit();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getTypeLitParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:396:2: ( ( rule__Type__Group_2__0 ) )
                    {
                    // InternalGo.g:396:2: ( ( rule__Type__Group_2__0 ) )
                    // InternalGo.g:397:3: ( rule__Type__Group_2__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_2()); 
                    // InternalGo.g:398:3: ( rule__Type__Group_2__0 )
                    // InternalGo.g:398:4: rule__Type__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__TypeSpec__Alternatives"
    // InternalGo.g:406:1: rule__TypeSpec__Alternatives : ( ( ruleAliasDecl ) | ( ruleTypeDef ) );
    public final void rule__TypeSpec__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:410:1: ( ( ruleAliasDecl ) | ( ruleTypeDef ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID||LA4_1==20||LA4_1==23) ) {
                    alt4=2;
                }
                else if ( (LA4_1==22) ) {
                    alt4=1;
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
                    // InternalGo.g:411:2: ( ruleAliasDecl )
                    {
                    // InternalGo.g:411:2: ( ruleAliasDecl )
                    // InternalGo.g:412:3: ruleAliasDecl
                    {
                     before(grammarAccess.getTypeSpecAccess().getAliasDeclParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAliasDecl();

                    state._fsp--;

                     after(grammarAccess.getTypeSpecAccess().getAliasDeclParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:417:2: ( ruleTypeDef )
                    {
                    // InternalGo.g:417:2: ( ruleTypeDef )
                    // InternalGo.g:418:3: ruleTypeDef
                    {
                     before(grammarAccess.getTypeSpecAccess().getTypeDefParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeDef();

                    state._fsp--;

                     after(grammarAccess.getTypeSpecAccess().getTypeDefParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSpec__Alternatives"


    // $ANTLR start "rule__ArrayLength__Alternatives"
    // InternalGo.g:427:1: rule__ArrayLength__Alternatives : ( ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) );
    public final void rule__ArrayLength__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:431:1: ( ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) )
            int alt5=9;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                alt5=4;
                }
                break;
            case 15:
                {
                alt5=5;
                }
                break;
            case 16:
                {
                alt5=6;
                }
                break;
            case 17:
                {
                alt5=7;
                }
                break;
            case 18:
                {
                alt5=8;
                }
                break;
            case 19:
                {
                alt5=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalGo.g:432:2: ( '1' )
                    {
                    // InternalGo.g:432:2: ( '1' )
                    // InternalGo.g:433:3: '1'
                    {
                     before(grammarAccess.getArrayLengthAccess().getDigitOneKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getArrayLengthAccess().getDigitOneKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:438:2: ( '2' )
                    {
                    // InternalGo.g:438:2: ( '2' )
                    // InternalGo.g:439:3: '2'
                    {
                     before(grammarAccess.getArrayLengthAccess().getDigitTwoKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getArrayLengthAccess().getDigitTwoKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:444:2: ( '3' )
                    {
                    // InternalGo.g:444:2: ( '3' )
                    // InternalGo.g:445:3: '3'
                    {
                     before(grammarAccess.getArrayLengthAccess().getDigitThreeKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getArrayLengthAccess().getDigitThreeKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:450:2: ( '4' )
                    {
                    // InternalGo.g:450:2: ( '4' )
                    // InternalGo.g:451:3: '4'
                    {
                     before(grammarAccess.getArrayLengthAccess().getDigitFourKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getArrayLengthAccess().getDigitFourKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGo.g:456:2: ( '5' )
                    {
                    // InternalGo.g:456:2: ( '5' )
                    // InternalGo.g:457:3: '5'
                    {
                     before(grammarAccess.getArrayLengthAccess().getDigitFiveKeyword_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getArrayLengthAccess().getDigitFiveKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGo.g:462:2: ( '6' )
                    {
                    // InternalGo.g:462:2: ( '6' )
                    // InternalGo.g:463:3: '6'
                    {
                     before(grammarAccess.getArrayLengthAccess().getDigitSixKeyword_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getArrayLengthAccess().getDigitSixKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGo.g:468:2: ( '7' )
                    {
                    // InternalGo.g:468:2: ( '7' )
                    // InternalGo.g:469:3: '7'
                    {
                     before(grammarAccess.getArrayLengthAccess().getDigitSevenKeyword_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getArrayLengthAccess().getDigitSevenKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGo.g:474:2: ( '8' )
                    {
                    // InternalGo.g:474:2: ( '8' )
                    // InternalGo.g:475:3: '8'
                    {
                     before(grammarAccess.getArrayLengthAccess().getDigitEightKeyword_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getArrayLengthAccess().getDigitEightKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalGo.g:480:2: ( '9' )
                    {
                    // InternalGo.g:480:2: ( '9' )
                    // InternalGo.g:481:3: '9'
                    {
                     before(grammarAccess.getArrayLengthAccess().getDigitNineKeyword_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getArrayLengthAccess().getDigitNineKeyword_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLength__Alternatives"


    // $ANTLR start "rule__Type__Group_2__0"
    // InternalGo.g:490:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:494:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalGo.g:495:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Type__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0"


    // $ANTLR start "rule__Type__Group_2__0__Impl"
    // InternalGo.g:502:1: rule__Type__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:506:1: ( ( '(' ) )
            // InternalGo.g:507:1: ( '(' )
            {
            // InternalGo.g:507:1: ( '(' )
            // InternalGo.g:508:2: '('
            {
             before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0__Impl"


    // $ANTLR start "rule__Type__Group_2__1"
    // InternalGo.g:517:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl rule__Type__Group_2__2 ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:521:1: ( rule__Type__Group_2__1__Impl rule__Type__Group_2__2 )
            // InternalGo.g:522:2: rule__Type__Group_2__1__Impl rule__Type__Group_2__2
            {
            pushFollow(FOLLOW_5);
            rule__Type__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1"


    // $ANTLR start "rule__Type__Group_2__1__Impl"
    // InternalGo.g:529:1: rule__Type__Group_2__1__Impl : ( ruleType ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:533:1: ( ( ruleType ) )
            // InternalGo.g:534:1: ( ruleType )
            {
            // InternalGo.g:534:1: ( ruleType )
            // InternalGo.g:535:2: ruleType
            {
             before(grammarAccess.getTypeAccess().getTypeParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getTypeParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1__Impl"


    // $ANTLR start "rule__Type__Group_2__2"
    // InternalGo.g:544:1: rule__Type__Group_2__2 : rule__Type__Group_2__2__Impl ;
    public final void rule__Type__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:548:1: ( rule__Type__Group_2__2__Impl )
            // InternalGo.g:549:2: rule__Type__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__2"


    // $ANTLR start "rule__Type__Group_2__2__Impl"
    // InternalGo.g:555:1: rule__Type__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Type__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:559:1: ( ( ')' ) )
            // InternalGo.g:560:1: ( ')' )
            {
            // InternalGo.g:560:1: ( ')' )
            // InternalGo.g:561:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__2__Impl"


    // $ANTLR start "rule__TypeDef__Group__0"
    // InternalGo.g:571:1: rule__TypeDef__Group__0 : rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1 ;
    public final void rule__TypeDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:575:1: ( rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1 )
            // InternalGo.g:576:2: rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TypeDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__0"


    // $ANTLR start "rule__TypeDef__Group__0__Impl"
    // InternalGo.g:583:1: rule__TypeDef__Group__0__Impl : ( ( rule__TypeDef__NameAssignment_0 ) ) ;
    public final void rule__TypeDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:587:1: ( ( ( rule__TypeDef__NameAssignment_0 ) ) )
            // InternalGo.g:588:1: ( ( rule__TypeDef__NameAssignment_0 ) )
            {
            // InternalGo.g:588:1: ( ( rule__TypeDef__NameAssignment_0 ) )
            // InternalGo.g:589:2: ( rule__TypeDef__NameAssignment_0 )
            {
             before(grammarAccess.getTypeDefAccess().getNameAssignment_0()); 
            // InternalGo.g:590:2: ( rule__TypeDef__NameAssignment_0 )
            // InternalGo.g:590:3: rule__TypeDef__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__0__Impl"


    // $ANTLR start "rule__TypeDef__Group__1"
    // InternalGo.g:598:1: rule__TypeDef__Group__1 : rule__TypeDef__Group__1__Impl ;
    public final void rule__TypeDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:602:1: ( rule__TypeDef__Group__1__Impl )
            // InternalGo.g:603:2: rule__TypeDef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__1"


    // $ANTLR start "rule__TypeDef__Group__1__Impl"
    // InternalGo.g:609:1: rule__TypeDef__Group__1__Impl : ( ( rule__TypeDef__TypeAssignment_1 ) ) ;
    public final void rule__TypeDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:613:1: ( ( ( rule__TypeDef__TypeAssignment_1 ) ) )
            // InternalGo.g:614:1: ( ( rule__TypeDef__TypeAssignment_1 ) )
            {
            // InternalGo.g:614:1: ( ( rule__TypeDef__TypeAssignment_1 ) )
            // InternalGo.g:615:2: ( rule__TypeDef__TypeAssignment_1 )
            {
             before(grammarAccess.getTypeDefAccess().getTypeAssignment_1()); 
            // InternalGo.g:616:2: ( rule__TypeDef__TypeAssignment_1 )
            // InternalGo.g:616:3: rule__TypeDef__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__1__Impl"


    // $ANTLR start "rule__AliasDecl__Group__0"
    // InternalGo.g:625:1: rule__AliasDecl__Group__0 : rule__AliasDecl__Group__0__Impl rule__AliasDecl__Group__1 ;
    public final void rule__AliasDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:629:1: ( rule__AliasDecl__Group__0__Impl rule__AliasDecl__Group__1 )
            // InternalGo.g:630:2: rule__AliasDecl__Group__0__Impl rule__AliasDecl__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__AliasDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AliasDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasDecl__Group__0"


    // $ANTLR start "rule__AliasDecl__Group__0__Impl"
    // InternalGo.g:637:1: rule__AliasDecl__Group__0__Impl : ( ( rule__AliasDecl__NameAssignment_0 ) ) ;
    public final void rule__AliasDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:641:1: ( ( ( rule__AliasDecl__NameAssignment_0 ) ) )
            // InternalGo.g:642:1: ( ( rule__AliasDecl__NameAssignment_0 ) )
            {
            // InternalGo.g:642:1: ( ( rule__AliasDecl__NameAssignment_0 ) )
            // InternalGo.g:643:2: ( rule__AliasDecl__NameAssignment_0 )
            {
             before(grammarAccess.getAliasDeclAccess().getNameAssignment_0()); 
            // InternalGo.g:644:2: ( rule__AliasDecl__NameAssignment_0 )
            // InternalGo.g:644:3: rule__AliasDecl__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AliasDecl__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAliasDeclAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasDecl__Group__0__Impl"


    // $ANTLR start "rule__AliasDecl__Group__1"
    // InternalGo.g:652:1: rule__AliasDecl__Group__1 : rule__AliasDecl__Group__1__Impl rule__AliasDecl__Group__2 ;
    public final void rule__AliasDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:656:1: ( rule__AliasDecl__Group__1__Impl rule__AliasDecl__Group__2 )
            // InternalGo.g:657:2: rule__AliasDecl__Group__1__Impl rule__AliasDecl__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AliasDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AliasDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasDecl__Group__1"


    // $ANTLR start "rule__AliasDecl__Group__1__Impl"
    // InternalGo.g:664:1: rule__AliasDecl__Group__1__Impl : ( '=' ) ;
    public final void rule__AliasDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:668:1: ( ( '=' ) )
            // InternalGo.g:669:1: ( '=' )
            {
            // InternalGo.g:669:1: ( '=' )
            // InternalGo.g:670:2: '='
            {
             before(grammarAccess.getAliasDeclAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAliasDeclAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasDecl__Group__1__Impl"


    // $ANTLR start "rule__AliasDecl__Group__2"
    // InternalGo.g:679:1: rule__AliasDecl__Group__2 : rule__AliasDecl__Group__2__Impl ;
    public final void rule__AliasDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:683:1: ( rule__AliasDecl__Group__2__Impl )
            // InternalGo.g:684:2: rule__AliasDecl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AliasDecl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasDecl__Group__2"


    // $ANTLR start "rule__AliasDecl__Group__2__Impl"
    // InternalGo.g:690:1: rule__AliasDecl__Group__2__Impl : ( ( rule__AliasDecl__TypeAssignment_2 ) ) ;
    public final void rule__AliasDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:694:1: ( ( ( rule__AliasDecl__TypeAssignment_2 ) ) )
            // InternalGo.g:695:1: ( ( rule__AliasDecl__TypeAssignment_2 ) )
            {
            // InternalGo.g:695:1: ( ( rule__AliasDecl__TypeAssignment_2 ) )
            // InternalGo.g:696:2: ( rule__AliasDecl__TypeAssignment_2 )
            {
             before(grammarAccess.getAliasDeclAccess().getTypeAssignment_2()); 
            // InternalGo.g:697:2: ( rule__AliasDecl__TypeAssignment_2 )
            // InternalGo.g:697:3: rule__AliasDecl__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AliasDecl__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAliasDeclAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasDecl__Group__2__Impl"


    // $ANTLR start "rule__ArrayType__Group__0"
    // InternalGo.g:706:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:710:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // InternalGo.g:711:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ArrayType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__0"


    // $ANTLR start "rule__ArrayType__Group__0__Impl"
    // InternalGo.g:718:1: rule__ArrayType__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:722:1: ( ( '[' ) )
            // InternalGo.g:723:1: ( '[' )
            {
            // InternalGo.g:723:1: ( '[' )
            // InternalGo.g:724:2: '['
            {
             before(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__0__Impl"


    // $ANTLR start "rule__ArrayType__Group__1"
    // InternalGo.g:733:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:737:1: ( rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 )
            // InternalGo.g:738:2: rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ArrayType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__1"


    // $ANTLR start "rule__ArrayType__Group__1__Impl"
    // InternalGo.g:745:1: rule__ArrayType__Group__1__Impl : ( ( ruleArrayLength )* ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:749:1: ( ( ( ruleArrayLength )* ) )
            // InternalGo.g:750:1: ( ( ruleArrayLength )* )
            {
            // InternalGo.g:750:1: ( ( ruleArrayLength )* )
            // InternalGo.g:751:2: ( ruleArrayLength )*
            {
             before(grammarAccess.getArrayTypeAccess().getArrayLengthParserRuleCall_1()); 
            // InternalGo.g:752:2: ( ruleArrayLength )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=11 && LA6_0<=19)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGo.g:752:3: ruleArrayLength
            	    {
            	    pushFollow(FOLLOW_8);
            	    ruleArrayLength();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getArrayTypeAccess().getArrayLengthParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__1__Impl"


    // $ANTLR start "rule__ArrayType__Group__2"
    // InternalGo.g:760:1: rule__ArrayType__Group__2 : rule__ArrayType__Group__2__Impl ;
    public final void rule__ArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:764:1: ( rule__ArrayType__Group__2__Impl )
            // InternalGo.g:765:2: rule__ArrayType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__2"


    // $ANTLR start "rule__ArrayType__Group__2__Impl"
    // InternalGo.g:771:1: rule__ArrayType__Group__2__Impl : ( ']' ) ;
    public final void rule__ArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:775:1: ( ( ']' ) )
            // InternalGo.g:776:1: ( ']' )
            {
            // InternalGo.g:776:1: ( ']' )
            // InternalGo.g:777:2: ']'
            {
             before(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalGo.g:787:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:791:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalGo.g:792:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalGo.g:799:1: rule__Entity__Group__0__Impl : ( 'print' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:803:1: ( ( 'print' ) )
            // InternalGo.g:804:1: ( 'print' )
            {
            // InternalGo.g:804:1: ( 'print' )
            // InternalGo.g:805:2: 'print'
            {
             before(grammarAccess.getEntityAccess().getPrintKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getPrintKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalGo.g:814:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:818:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalGo.g:819:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalGo.g:826:1: rule__Entity__Group__1__Impl : ( '(' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:830:1: ( ( '(' ) )
            // InternalGo.g:831:1: ( '(' )
            {
            // InternalGo.g:831:1: ( '(' )
            // InternalGo.g:832:2: '('
            {
             before(grammarAccess.getEntityAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalGo.g:841:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:845:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalGo.g:846:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalGo.g:853:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:857:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // InternalGo.g:858:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // InternalGo.g:858:1: ( ( rule__Entity__NameAssignment_2 ) )
            // InternalGo.g:859:2: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // InternalGo.g:860:2: ( rule__Entity__NameAssignment_2 )
            // InternalGo.g:860:3: rule__Entity__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalGo.g:868:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:872:1: ( rule__Entity__Group__3__Impl )
            // InternalGo.g:873:2: rule__Entity__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalGo.g:879:1: rule__Entity__Group__3__Impl : ( ')' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:883:1: ( ( ')' ) )
            // InternalGo.g:884:1: ( ')' )
            {
            // InternalGo.g:884:1: ( ')' )
            // InternalGo.g:885:2: ')'
            {
             before(grammarAccess.getEntityAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__DataType__Group__0"
    // InternalGo.g:895:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:899:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalGo.g:900:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // InternalGo.g:907:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:911:1: ( ( 'datatype' ) )
            // InternalGo.g:912:1: ( 'datatype' )
            {
            // InternalGo.g:912:1: ( 'datatype' )
            // InternalGo.g:913:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // InternalGo.g:922:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:926:1: ( rule__DataType__Group__1__Impl )
            // InternalGo.g:927:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // InternalGo.g:933:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:937:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalGo.g:938:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalGo.g:938:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalGo.g:939:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalGo.g:940:2: ( rule__DataType__NameAssignment_1 )
            // InternalGo.g:940:3: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__Go__ElementsAssignment"
    // InternalGo.g:949:1: rule__Go__ElementsAssignment : ( ruleGreeting ) ;
    public final void rule__Go__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:953:1: ( ( ruleGreeting ) )
            // InternalGo.g:954:2: ( ruleGreeting )
            {
            // InternalGo.g:954:2: ( ruleGreeting )
            // InternalGo.g:955:3: ruleGreeting
            {
             before(grammarAccess.getGoAccess().getElementsGreetingParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getGoAccess().getElementsGreetingParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__ElementsAssignment"


    // $ANTLR start "rule__TypeName__NameAssignment"
    // InternalGo.g:964:1: rule__TypeName__NameAssignment : ( RULE_ID ) ;
    public final void rule__TypeName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:968:1: ( ( RULE_ID ) )
            // InternalGo.g:969:2: ( RULE_ID )
            {
            // InternalGo.g:969:2: ( RULE_ID )
            // InternalGo.g:970:3: RULE_ID
            {
             before(grammarAccess.getTypeNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeNameAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeName__NameAssignment"


    // $ANTLR start "rule__TypeDef__NameAssignment_0"
    // InternalGo.g:979:1: rule__TypeDef__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__TypeDef__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:983:1: ( ( RULE_ID ) )
            // InternalGo.g:984:2: ( RULE_ID )
            {
            // InternalGo.g:984:2: ( RULE_ID )
            // InternalGo.g:985:3: RULE_ID
            {
             before(grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__NameAssignment_0"


    // $ANTLR start "rule__TypeDef__TypeAssignment_1"
    // InternalGo.g:994:1: rule__TypeDef__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__TypeDef__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:998:1: ( ( ruleType ) )
            // InternalGo.g:999:2: ( ruleType )
            {
            // InternalGo.g:999:2: ( ruleType )
            // InternalGo.g:1000:3: ruleType
            {
             before(grammarAccess.getTypeDefAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeDefAccess().getTypeTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__TypeAssignment_1"


    // $ANTLR start "rule__AliasDecl__NameAssignment_0"
    // InternalGo.g:1009:1: rule__AliasDecl__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__AliasDecl__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1013:1: ( ( RULE_ID ) )
            // InternalGo.g:1014:2: ( RULE_ID )
            {
            // InternalGo.g:1014:2: ( RULE_ID )
            // InternalGo.g:1015:3: RULE_ID
            {
             before(grammarAccess.getAliasDeclAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAliasDeclAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasDecl__NameAssignment_0"


    // $ANTLR start "rule__AliasDecl__TypeAssignment_2"
    // InternalGo.g:1024:1: rule__AliasDecl__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__AliasDecl__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1028:1: ( ( ruleType ) )
            // InternalGo.g:1029:2: ( ruleType )
            {
            // InternalGo.g:1029:2: ( ruleType )
            // InternalGo.g:1030:3: ruleType
            {
             before(grammarAccess.getAliasDeclAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getAliasDeclAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AliasDecl__TypeAssignment_2"


    // $ANTLR start "rule__Entity__NameAssignment_2"
    // InternalGo.g:1039:1: rule__Entity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1043:1: ( ( RULE_ID ) )
            // InternalGo.g:1044:2: ( RULE_ID )
            {
            // InternalGo.g:1044:2: ( RULE_ID )
            // InternalGo.g:1045:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_2"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // InternalGo.g:1054:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1058:1: ( ( RULE_ID ) )
            // InternalGo.g:1059:2: ( RULE_ID )
            {
            // InternalGo.g:1059:2: ( RULE_ID )
            // InternalGo.g:1060:3: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000006000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000900010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000010FF800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000FF802L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});

}