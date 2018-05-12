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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_ID", "RULE_NEWLINE", "RULE_SL_COMMENT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'break'", "'case'", "'chan'", "'const'", "'continue'", "'else'", "'for'", "'func'", "'if'", "'import'", "'return'", "'package'", "'range'", "'('", "')'", "'{'", "'}'", "','", "'print'", "'datatype'"
    };
    public static final int RULE_NEWLINE=6;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_EOL=4;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
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

                if ( (LA1_0==RULE_EOL||LA1_0==20||(LA1_0>=31 && LA1_0<=32)) ) {
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


    // $ANTLR start "entryRuleDecFunc"
    // InternalGo.g:103:1: entryRuleDecFunc : ruleDecFunc EOF ;
    public final void entryRuleDecFunc() throws RecognitionException {
        try {
            // InternalGo.g:104:1: ( ruleDecFunc EOF )
            // InternalGo.g:105:1: ruleDecFunc EOF
            {
             before(grammarAccess.getDecFuncRule()); 
            pushFollow(FOLLOW_1);
            ruleDecFunc();

            state._fsp--;

             after(grammarAccess.getDecFuncRule()); 
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
    // $ANTLR end "entryRuleDecFunc"


    // $ANTLR start "ruleDecFunc"
    // InternalGo.g:112:1: ruleDecFunc : ( ( rule__DecFunc__Group__0 ) ) ;
    public final void ruleDecFunc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:116:2: ( ( ( rule__DecFunc__Group__0 ) ) )
            // InternalGo.g:117:2: ( ( rule__DecFunc__Group__0 ) )
            {
            // InternalGo.g:117:2: ( ( rule__DecFunc__Group__0 ) )
            // InternalGo.g:118:3: ( rule__DecFunc__Group__0 )
            {
             before(grammarAccess.getDecFuncAccess().getGroup()); 
            // InternalGo.g:119:3: ( rule__DecFunc__Group__0 )
            // InternalGo.g:119:4: rule__DecFunc__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DecFunc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecFuncAccess().getGroup()); 

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
    // $ANTLR end "ruleDecFunc"


    // $ANTLR start "entryRuleBREAK"
    // InternalGo.g:128:1: entryRuleBREAK : ruleBREAK EOF ;
    public final void entryRuleBREAK() throws RecognitionException {
        try {
            // InternalGo.g:129:1: ( ruleBREAK EOF )
            // InternalGo.g:130:1: ruleBREAK EOF
            {
             before(grammarAccess.getBREAKRule()); 
            pushFollow(FOLLOW_1);
            ruleBREAK();

            state._fsp--;

             after(grammarAccess.getBREAKRule()); 
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
    // $ANTLR end "entryRuleBREAK"


    // $ANTLR start "ruleBREAK"
    // InternalGo.g:137:1: ruleBREAK : ( 'break' ) ;
    public final void ruleBREAK() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:141:2: ( ( 'break' ) )
            // InternalGo.g:142:2: ( 'break' )
            {
            // InternalGo.g:142:2: ( 'break' )
            // InternalGo.g:143:3: 'break'
            {
             before(grammarAccess.getBREAKAccess().getBreakKeyword()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getBREAKAccess().getBreakKeyword()); 

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
    // $ANTLR end "ruleBREAK"


    // $ANTLR start "entryRuleCASE"
    // InternalGo.g:153:1: entryRuleCASE : ruleCASE EOF ;
    public final void entryRuleCASE() throws RecognitionException {
        try {
            // InternalGo.g:154:1: ( ruleCASE EOF )
            // InternalGo.g:155:1: ruleCASE EOF
            {
             before(grammarAccess.getCASERule()); 
            pushFollow(FOLLOW_1);
            ruleCASE();

            state._fsp--;

             after(grammarAccess.getCASERule()); 
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
    // $ANTLR end "entryRuleCASE"


    // $ANTLR start "ruleCASE"
    // InternalGo.g:162:1: ruleCASE : ( 'case' ) ;
    public final void ruleCASE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:166:2: ( ( 'case' ) )
            // InternalGo.g:167:2: ( 'case' )
            {
            // InternalGo.g:167:2: ( 'case' )
            // InternalGo.g:168:3: 'case'
            {
             before(grammarAccess.getCASEAccess().getCaseKeyword()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCASEAccess().getCaseKeyword()); 

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
    // $ANTLR end "ruleCASE"


    // $ANTLR start "entryRuleCHAN"
    // InternalGo.g:178:1: entryRuleCHAN : ruleCHAN EOF ;
    public final void entryRuleCHAN() throws RecognitionException {
        try {
            // InternalGo.g:179:1: ( ruleCHAN EOF )
            // InternalGo.g:180:1: ruleCHAN EOF
            {
             before(grammarAccess.getCHANRule()); 
            pushFollow(FOLLOW_1);
            ruleCHAN();

            state._fsp--;

             after(grammarAccess.getCHANRule()); 
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
    // $ANTLR end "entryRuleCHAN"


    // $ANTLR start "ruleCHAN"
    // InternalGo.g:187:1: ruleCHAN : ( 'chan' ) ;
    public final void ruleCHAN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:191:2: ( ( 'chan' ) )
            // InternalGo.g:192:2: ( 'chan' )
            {
            // InternalGo.g:192:2: ( 'chan' )
            // InternalGo.g:193:3: 'chan'
            {
             before(grammarAccess.getCHANAccess().getChanKeyword()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCHANAccess().getChanKeyword()); 

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
    // $ANTLR end "ruleCHAN"


    // $ANTLR start "entryRuleCONST"
    // InternalGo.g:203:1: entryRuleCONST : ruleCONST EOF ;
    public final void entryRuleCONST() throws RecognitionException {
        try {
            // InternalGo.g:204:1: ( ruleCONST EOF )
            // InternalGo.g:205:1: ruleCONST EOF
            {
             before(grammarAccess.getCONSTRule()); 
            pushFollow(FOLLOW_1);
            ruleCONST();

            state._fsp--;

             after(grammarAccess.getCONSTRule()); 
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
    // $ANTLR end "entryRuleCONST"


    // $ANTLR start "ruleCONST"
    // InternalGo.g:212:1: ruleCONST : ( 'const' ) ;
    public final void ruleCONST() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:216:2: ( ( 'const' ) )
            // InternalGo.g:217:2: ( 'const' )
            {
            // InternalGo.g:217:2: ( 'const' )
            // InternalGo.g:218:3: 'const'
            {
             before(grammarAccess.getCONSTAccess().getConstKeyword()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCONSTAccess().getConstKeyword()); 

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
    // $ANTLR end "ruleCONST"


    // $ANTLR start "entryRuleCONTINUE"
    // InternalGo.g:228:1: entryRuleCONTINUE : ruleCONTINUE EOF ;
    public final void entryRuleCONTINUE() throws RecognitionException {
        try {
            // InternalGo.g:229:1: ( ruleCONTINUE EOF )
            // InternalGo.g:230:1: ruleCONTINUE EOF
            {
             before(grammarAccess.getCONTINUERule()); 
            pushFollow(FOLLOW_1);
            ruleCONTINUE();

            state._fsp--;

             after(grammarAccess.getCONTINUERule()); 
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
    // $ANTLR end "entryRuleCONTINUE"


    // $ANTLR start "ruleCONTINUE"
    // InternalGo.g:237:1: ruleCONTINUE : ( 'continue' ) ;
    public final void ruleCONTINUE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:241:2: ( ( 'continue' ) )
            // InternalGo.g:242:2: ( 'continue' )
            {
            // InternalGo.g:242:2: ( 'continue' )
            // InternalGo.g:243:3: 'continue'
            {
             before(grammarAccess.getCONTINUEAccess().getContinueKeyword()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCONTINUEAccess().getContinueKeyword()); 

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
    // $ANTLR end "ruleCONTINUE"


    // $ANTLR start "entryRuleELSE"
    // InternalGo.g:253:1: entryRuleELSE : ruleELSE EOF ;
    public final void entryRuleELSE() throws RecognitionException {
        try {
            // InternalGo.g:254:1: ( ruleELSE EOF )
            // InternalGo.g:255:1: ruleELSE EOF
            {
             before(grammarAccess.getELSERule()); 
            pushFollow(FOLLOW_1);
            ruleELSE();

            state._fsp--;

             after(grammarAccess.getELSERule()); 
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
    // $ANTLR end "entryRuleELSE"


    // $ANTLR start "ruleELSE"
    // InternalGo.g:262:1: ruleELSE : ( 'else' ) ;
    public final void ruleELSE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:266:2: ( ( 'else' ) )
            // InternalGo.g:267:2: ( 'else' )
            {
            // InternalGo.g:267:2: ( 'else' )
            // InternalGo.g:268:3: 'else'
            {
             before(grammarAccess.getELSEAccess().getElseKeyword()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getELSEAccess().getElseKeyword()); 

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
    // $ANTLR end "ruleELSE"


    // $ANTLR start "entryRuleFOR"
    // InternalGo.g:278:1: entryRuleFOR : ruleFOR EOF ;
    public final void entryRuleFOR() throws RecognitionException {
        try {
            // InternalGo.g:279:1: ( ruleFOR EOF )
            // InternalGo.g:280:1: ruleFOR EOF
            {
             before(grammarAccess.getFORRule()); 
            pushFollow(FOLLOW_1);
            ruleFOR();

            state._fsp--;

             after(grammarAccess.getFORRule()); 
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
    // $ANTLR end "entryRuleFOR"


    // $ANTLR start "ruleFOR"
    // InternalGo.g:287:1: ruleFOR : ( 'for' ) ;
    public final void ruleFOR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:291:2: ( ( 'for' ) )
            // InternalGo.g:292:2: ( 'for' )
            {
            // InternalGo.g:292:2: ( 'for' )
            // InternalGo.g:293:3: 'for'
            {
             before(grammarAccess.getFORAccess().getForKeyword()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFORAccess().getForKeyword()); 

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
    // $ANTLR end "ruleFOR"


    // $ANTLR start "entryRuleFUNC"
    // InternalGo.g:303:1: entryRuleFUNC : ruleFUNC EOF ;
    public final void entryRuleFUNC() throws RecognitionException {
        try {
            // InternalGo.g:304:1: ( ruleFUNC EOF )
            // InternalGo.g:305:1: ruleFUNC EOF
            {
             before(grammarAccess.getFUNCRule()); 
            pushFollow(FOLLOW_1);
            ruleFUNC();

            state._fsp--;

             after(grammarAccess.getFUNCRule()); 
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
    // $ANTLR end "entryRuleFUNC"


    // $ANTLR start "ruleFUNC"
    // InternalGo.g:312:1: ruleFUNC : ( 'func' ) ;
    public final void ruleFUNC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:316:2: ( ( 'func' ) )
            // InternalGo.g:317:2: ( 'func' )
            {
            // InternalGo.g:317:2: ( 'func' )
            // InternalGo.g:318:3: 'func'
            {
             before(grammarAccess.getFUNCAccess().getFuncKeyword()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFUNCAccess().getFuncKeyword()); 

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
    // $ANTLR end "ruleFUNC"


    // $ANTLR start "entryRuleIF"
    // InternalGo.g:328:1: entryRuleIF : ruleIF EOF ;
    public final void entryRuleIF() throws RecognitionException {
        try {
            // InternalGo.g:329:1: ( ruleIF EOF )
            // InternalGo.g:330:1: ruleIF EOF
            {
             before(grammarAccess.getIFRule()); 
            pushFollow(FOLLOW_1);
            ruleIF();

            state._fsp--;

             after(grammarAccess.getIFRule()); 
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
    // $ANTLR end "entryRuleIF"


    // $ANTLR start "ruleIF"
    // InternalGo.g:337:1: ruleIF : ( 'if' ) ;
    public final void ruleIF() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:341:2: ( ( 'if' ) )
            // InternalGo.g:342:2: ( 'if' )
            {
            // InternalGo.g:342:2: ( 'if' )
            // InternalGo.g:343:3: 'if'
            {
             before(grammarAccess.getIFAccess().getIfKeyword()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getIFAccess().getIfKeyword()); 

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
    // $ANTLR end "ruleIF"


    // $ANTLR start "entryRuleIMPORT"
    // InternalGo.g:353:1: entryRuleIMPORT : ruleIMPORT EOF ;
    public final void entryRuleIMPORT() throws RecognitionException {
        try {
            // InternalGo.g:354:1: ( ruleIMPORT EOF )
            // InternalGo.g:355:1: ruleIMPORT EOF
            {
             before(grammarAccess.getIMPORTRule()); 
            pushFollow(FOLLOW_1);
            ruleIMPORT();

            state._fsp--;

             after(grammarAccess.getIMPORTRule()); 
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
    // $ANTLR end "entryRuleIMPORT"


    // $ANTLR start "ruleIMPORT"
    // InternalGo.g:362:1: ruleIMPORT : ( 'import' ) ;
    public final void ruleIMPORT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:366:2: ( ( 'import' ) )
            // InternalGo.g:367:2: ( 'import' )
            {
            // InternalGo.g:367:2: ( 'import' )
            // InternalGo.g:368:3: 'import'
            {
             before(grammarAccess.getIMPORTAccess().getImportKeyword()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getIMPORTAccess().getImportKeyword()); 

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
    // $ANTLR end "ruleIMPORT"


    // $ANTLR start "entryRuleRETURN"
    // InternalGo.g:378:1: entryRuleRETURN : ruleRETURN EOF ;
    public final void entryRuleRETURN() throws RecognitionException {
        try {
            // InternalGo.g:379:1: ( ruleRETURN EOF )
            // InternalGo.g:380:1: ruleRETURN EOF
            {
             before(grammarAccess.getRETURNRule()); 
            pushFollow(FOLLOW_1);
            ruleRETURN();

            state._fsp--;

             after(grammarAccess.getRETURNRule()); 
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
    // $ANTLR end "entryRuleRETURN"


    // $ANTLR start "ruleRETURN"
    // InternalGo.g:387:1: ruleRETURN : ( 'return' ) ;
    public final void ruleRETURN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:391:2: ( ( 'return' ) )
            // InternalGo.g:392:2: ( 'return' )
            {
            // InternalGo.g:392:2: ( 'return' )
            // InternalGo.g:393:3: 'return'
            {
             before(grammarAccess.getRETURNAccess().getReturnKeyword()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRETURNAccess().getReturnKeyword()); 

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
    // $ANTLR end "ruleRETURN"


    // $ANTLR start "entryRulePACKAGE"
    // InternalGo.g:403:1: entryRulePACKAGE : rulePACKAGE EOF ;
    public final void entryRulePACKAGE() throws RecognitionException {
        try {
            // InternalGo.g:404:1: ( rulePACKAGE EOF )
            // InternalGo.g:405:1: rulePACKAGE EOF
            {
             before(grammarAccess.getPACKAGERule()); 
            pushFollow(FOLLOW_1);
            rulePACKAGE();

            state._fsp--;

             after(grammarAccess.getPACKAGERule()); 
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
    // $ANTLR end "entryRulePACKAGE"


    // $ANTLR start "rulePACKAGE"
    // InternalGo.g:412:1: rulePACKAGE : ( 'package' ) ;
    public final void rulePACKAGE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:416:2: ( ( 'package' ) )
            // InternalGo.g:417:2: ( 'package' )
            {
            // InternalGo.g:417:2: ( 'package' )
            // InternalGo.g:418:3: 'package'
            {
             before(grammarAccess.getPACKAGEAccess().getPackageKeyword()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPACKAGEAccess().getPackageKeyword()); 

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
    // $ANTLR end "rulePACKAGE"


    // $ANTLR start "entryRuleRANGE"
    // InternalGo.g:428:1: entryRuleRANGE : ruleRANGE EOF ;
    public final void entryRuleRANGE() throws RecognitionException {
        try {
            // InternalGo.g:429:1: ( ruleRANGE EOF )
            // InternalGo.g:430:1: ruleRANGE EOF
            {
             before(grammarAccess.getRANGERule()); 
            pushFollow(FOLLOW_1);
            ruleRANGE();

            state._fsp--;

             after(grammarAccess.getRANGERule()); 
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
    // $ANTLR end "entryRuleRANGE"


    // $ANTLR start "ruleRANGE"
    // InternalGo.g:437:1: ruleRANGE : ( 'range' ) ;
    public final void ruleRANGE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:441:2: ( ( 'range' ) )
            // InternalGo.g:442:2: ( 'range' )
            {
            // InternalGo.g:442:2: ( 'range' )
            // InternalGo.g:443:3: 'range'
            {
             before(grammarAccess.getRANGEAccess().getRangeKeyword()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRANGEAccess().getRangeKeyword()); 

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
    // $ANTLR end "ruleRANGE"


    // $ANTLR start "entryRuleEntity"
    // InternalGo.g:453:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalGo.g:454:1: ( ruleEntity EOF )
            // InternalGo.g:455:1: ruleEntity EOF
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
    // InternalGo.g:462:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:466:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalGo.g:467:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalGo.g:467:2: ( ( rule__Entity__Group__0 ) )
            // InternalGo.g:468:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalGo.g:469:3: ( rule__Entity__Group__0 )
            // InternalGo.g:469:4: rule__Entity__Group__0
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
    // InternalGo.g:478:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalGo.g:479:1: ( ruleDataType EOF )
            // InternalGo.g:480:1: ruleDataType EOF
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
    // InternalGo.g:487:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:491:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalGo.g:492:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalGo.g:492:2: ( ( rule__DataType__Group__0 ) )
            // InternalGo.g:493:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalGo.g:494:3: ( rule__DataType__Group__0 )
            // InternalGo.g:494:4: rule__DataType__Group__0
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
    // InternalGo.g:502:1: rule__Greeting__Alternatives : ( ( ruleDataType ) | ( ruleEntity ) | ( ruleDecFunc ) | ( RULE_EOL ) );
    public final void rule__Greeting__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:506:1: ( ( ruleDataType ) | ( ruleEntity ) | ( ruleDecFunc ) | ( RULE_EOL ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt2=1;
                }
                break;
            case 31:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case RULE_EOL:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGo.g:507:2: ( ruleDataType )
                    {
                    // InternalGo.g:507:2: ( ruleDataType )
                    // InternalGo.g:508:3: ruleDataType
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
                    // InternalGo.g:513:2: ( ruleEntity )
                    {
                    // InternalGo.g:513:2: ( ruleEntity )
                    // InternalGo.g:514:3: ruleEntity
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
                    // InternalGo.g:519:2: ( ruleDecFunc )
                    {
                    // InternalGo.g:519:2: ( ruleDecFunc )
                    // InternalGo.g:520:3: ruleDecFunc
                    {
                     before(grammarAccess.getGreetingAccess().getDecFuncParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDecFunc();

                    state._fsp--;

                     after(grammarAccess.getGreetingAccess().getDecFuncParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:525:2: ( RULE_EOL )
                    {
                    // InternalGo.g:525:2: ( RULE_EOL )
                    // InternalGo.g:526:3: RULE_EOL
                    {
                     before(grammarAccess.getGreetingAccess().getEOLTerminalRuleCall_3()); 
                    match(input,RULE_EOL,FOLLOW_2); 
                     after(grammarAccess.getGreetingAccess().getEOLTerminalRuleCall_3()); 

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


    // $ANTLR start "rule__DecFunc__Group__0"
    // InternalGo.g:535:1: rule__DecFunc__Group__0 : rule__DecFunc__Group__0__Impl rule__DecFunc__Group__1 ;
    public final void rule__DecFunc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:539:1: ( rule__DecFunc__Group__0__Impl rule__DecFunc__Group__1 )
            // InternalGo.g:540:2: rule__DecFunc__Group__0__Impl rule__DecFunc__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DecFunc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecFunc__Group__1();

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
    // $ANTLR end "rule__DecFunc__Group__0"


    // $ANTLR start "rule__DecFunc__Group__0__Impl"
    // InternalGo.g:547:1: rule__DecFunc__Group__0__Impl : ( ruleFUNC ) ;
    public final void rule__DecFunc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:551:1: ( ( ruleFUNC ) )
            // InternalGo.g:552:1: ( ruleFUNC )
            {
            // InternalGo.g:552:1: ( ruleFUNC )
            // InternalGo.g:553:2: ruleFUNC
            {
             before(grammarAccess.getDecFuncAccess().getFUNCParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFUNC();

            state._fsp--;

             after(grammarAccess.getDecFuncAccess().getFUNCParserRuleCall_0()); 

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
    // $ANTLR end "rule__DecFunc__Group__0__Impl"


    // $ANTLR start "rule__DecFunc__Group__1"
    // InternalGo.g:562:1: rule__DecFunc__Group__1 : rule__DecFunc__Group__1__Impl rule__DecFunc__Group__2 ;
    public final void rule__DecFunc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:566:1: ( rule__DecFunc__Group__1__Impl rule__DecFunc__Group__2 )
            // InternalGo.g:567:2: rule__DecFunc__Group__1__Impl rule__DecFunc__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DecFunc__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecFunc__Group__2();

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
    // $ANTLR end "rule__DecFunc__Group__1"


    // $ANTLR start "rule__DecFunc__Group__1__Impl"
    // InternalGo.g:574:1: rule__DecFunc__Group__1__Impl : ( ( rule__DecFunc__NameAssignment_1 ) ) ;
    public final void rule__DecFunc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:578:1: ( ( ( rule__DecFunc__NameAssignment_1 ) ) )
            // InternalGo.g:579:1: ( ( rule__DecFunc__NameAssignment_1 ) )
            {
            // InternalGo.g:579:1: ( ( rule__DecFunc__NameAssignment_1 ) )
            // InternalGo.g:580:2: ( rule__DecFunc__NameAssignment_1 )
            {
             before(grammarAccess.getDecFuncAccess().getNameAssignment_1()); 
            // InternalGo.g:581:2: ( rule__DecFunc__NameAssignment_1 )
            // InternalGo.g:581:3: rule__DecFunc__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DecFunc__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDecFuncAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DecFunc__Group__1__Impl"


    // $ANTLR start "rule__DecFunc__Group__2"
    // InternalGo.g:589:1: rule__DecFunc__Group__2 : rule__DecFunc__Group__2__Impl rule__DecFunc__Group__3 ;
    public final void rule__DecFunc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:593:1: ( rule__DecFunc__Group__2__Impl rule__DecFunc__Group__3 )
            // InternalGo.g:594:2: rule__DecFunc__Group__2__Impl rule__DecFunc__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__DecFunc__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecFunc__Group__3();

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
    // $ANTLR end "rule__DecFunc__Group__2"


    // $ANTLR start "rule__DecFunc__Group__2__Impl"
    // InternalGo.g:601:1: rule__DecFunc__Group__2__Impl : ( '(' ) ;
    public final void rule__DecFunc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:605:1: ( ( '(' ) )
            // InternalGo.g:606:1: ( '(' )
            {
            // InternalGo.g:606:1: ( '(' )
            // InternalGo.g:607:2: '('
            {
             before(grammarAccess.getDecFuncAccess().getLeftParenthesisKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDecFuncAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__DecFunc__Group__2__Impl"


    // $ANTLR start "rule__DecFunc__Group__3"
    // InternalGo.g:616:1: rule__DecFunc__Group__3 : rule__DecFunc__Group__3__Impl rule__DecFunc__Group__4 ;
    public final void rule__DecFunc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:620:1: ( rule__DecFunc__Group__3__Impl rule__DecFunc__Group__4 )
            // InternalGo.g:621:2: rule__DecFunc__Group__3__Impl rule__DecFunc__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__DecFunc__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecFunc__Group__4();

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
    // $ANTLR end "rule__DecFunc__Group__3"


    // $ANTLR start "rule__DecFunc__Group__3__Impl"
    // InternalGo.g:628:1: rule__DecFunc__Group__3__Impl : ( ( rule__DecFunc__ParameterAssignment_3 )? ) ;
    public final void rule__DecFunc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:632:1: ( ( ( rule__DecFunc__ParameterAssignment_3 )? ) )
            // InternalGo.g:633:1: ( ( rule__DecFunc__ParameterAssignment_3 )? )
            {
            // InternalGo.g:633:1: ( ( rule__DecFunc__ParameterAssignment_3 )? )
            // InternalGo.g:634:2: ( rule__DecFunc__ParameterAssignment_3 )?
            {
             before(grammarAccess.getDecFuncAccess().getParameterAssignment_3()); 
            // InternalGo.g:635:2: ( rule__DecFunc__ParameterAssignment_3 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGo.g:635:3: rule__DecFunc__ParameterAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__DecFunc__ParameterAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecFuncAccess().getParameterAssignment_3()); 

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
    // $ANTLR end "rule__DecFunc__Group__3__Impl"


    // $ANTLR start "rule__DecFunc__Group__4"
    // InternalGo.g:643:1: rule__DecFunc__Group__4 : rule__DecFunc__Group__4__Impl rule__DecFunc__Group__5 ;
    public final void rule__DecFunc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:647:1: ( rule__DecFunc__Group__4__Impl rule__DecFunc__Group__5 )
            // InternalGo.g:648:2: rule__DecFunc__Group__4__Impl rule__DecFunc__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__DecFunc__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecFunc__Group__5();

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
    // $ANTLR end "rule__DecFunc__Group__4"


    // $ANTLR start "rule__DecFunc__Group__4__Impl"
    // InternalGo.g:655:1: rule__DecFunc__Group__4__Impl : ( ( rule__DecFunc__Group_4__0 )* ) ;
    public final void rule__DecFunc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:659:1: ( ( ( rule__DecFunc__Group_4__0 )* ) )
            // InternalGo.g:660:1: ( ( rule__DecFunc__Group_4__0 )* )
            {
            // InternalGo.g:660:1: ( ( rule__DecFunc__Group_4__0 )* )
            // InternalGo.g:661:2: ( rule__DecFunc__Group_4__0 )*
            {
             before(grammarAccess.getDecFuncAccess().getGroup_4()); 
            // InternalGo.g:662:2: ( rule__DecFunc__Group_4__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==30) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGo.g:662:3: rule__DecFunc__Group_4__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DecFunc__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getDecFuncAccess().getGroup_4()); 

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
    // $ANTLR end "rule__DecFunc__Group__4__Impl"


    // $ANTLR start "rule__DecFunc__Group__5"
    // InternalGo.g:670:1: rule__DecFunc__Group__5 : rule__DecFunc__Group__5__Impl rule__DecFunc__Group__6 ;
    public final void rule__DecFunc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:674:1: ( rule__DecFunc__Group__5__Impl rule__DecFunc__Group__6 )
            // InternalGo.g:675:2: rule__DecFunc__Group__5__Impl rule__DecFunc__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__DecFunc__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecFunc__Group__6();

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
    // $ANTLR end "rule__DecFunc__Group__5"


    // $ANTLR start "rule__DecFunc__Group__5__Impl"
    // InternalGo.g:682:1: rule__DecFunc__Group__5__Impl : ( ')' ) ;
    public final void rule__DecFunc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:686:1: ( ( ')' ) )
            // InternalGo.g:687:1: ( ')' )
            {
            // InternalGo.g:687:1: ( ')' )
            // InternalGo.g:688:2: ')'
            {
             before(grammarAccess.getDecFuncAccess().getRightParenthesisKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDecFuncAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__DecFunc__Group__5__Impl"


    // $ANTLR start "rule__DecFunc__Group__6"
    // InternalGo.g:697:1: rule__DecFunc__Group__6 : rule__DecFunc__Group__6__Impl rule__DecFunc__Group__7 ;
    public final void rule__DecFunc__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:701:1: ( rule__DecFunc__Group__6__Impl rule__DecFunc__Group__7 )
            // InternalGo.g:702:2: rule__DecFunc__Group__6__Impl rule__DecFunc__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__DecFunc__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecFunc__Group__7();

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
    // $ANTLR end "rule__DecFunc__Group__6"


    // $ANTLR start "rule__DecFunc__Group__6__Impl"
    // InternalGo.g:709:1: rule__DecFunc__Group__6__Impl : ( '{' ) ;
    public final void rule__DecFunc__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:713:1: ( ( '{' ) )
            // InternalGo.g:714:1: ( '{' )
            {
            // InternalGo.g:714:1: ( '{' )
            // InternalGo.g:715:2: '{'
            {
             before(grammarAccess.getDecFuncAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDecFuncAccess().getLeftCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__DecFunc__Group__6__Impl"


    // $ANTLR start "rule__DecFunc__Group__7"
    // InternalGo.g:724:1: rule__DecFunc__Group__7 : rule__DecFunc__Group__7__Impl ;
    public final void rule__DecFunc__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:728:1: ( rule__DecFunc__Group__7__Impl )
            // InternalGo.g:729:2: rule__DecFunc__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecFunc__Group__7__Impl();

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
    // $ANTLR end "rule__DecFunc__Group__7"


    // $ANTLR start "rule__DecFunc__Group__7__Impl"
    // InternalGo.g:735:1: rule__DecFunc__Group__7__Impl : ( '}' ) ;
    public final void rule__DecFunc__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:739:1: ( ( '}' ) )
            // InternalGo.g:740:1: ( '}' )
            {
            // InternalGo.g:740:1: ( '}' )
            // InternalGo.g:741:2: '}'
            {
             before(grammarAccess.getDecFuncAccess().getRightCurlyBracketKeyword_7()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDecFuncAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__DecFunc__Group__7__Impl"


    // $ANTLR start "rule__DecFunc__Group_4__0"
    // InternalGo.g:751:1: rule__DecFunc__Group_4__0 : rule__DecFunc__Group_4__0__Impl rule__DecFunc__Group_4__1 ;
    public final void rule__DecFunc__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:755:1: ( rule__DecFunc__Group_4__0__Impl rule__DecFunc__Group_4__1 )
            // InternalGo.g:756:2: rule__DecFunc__Group_4__0__Impl rule__DecFunc__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__DecFunc__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecFunc__Group_4__1();

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
    // $ANTLR end "rule__DecFunc__Group_4__0"


    // $ANTLR start "rule__DecFunc__Group_4__0__Impl"
    // InternalGo.g:763:1: rule__DecFunc__Group_4__0__Impl : ( ',' ) ;
    public final void rule__DecFunc__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:767:1: ( ( ',' ) )
            // InternalGo.g:768:1: ( ',' )
            {
            // InternalGo.g:768:1: ( ',' )
            // InternalGo.g:769:2: ','
            {
             before(grammarAccess.getDecFuncAccess().getCommaKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDecFuncAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__DecFunc__Group_4__0__Impl"


    // $ANTLR start "rule__DecFunc__Group_4__1"
    // InternalGo.g:778:1: rule__DecFunc__Group_4__1 : rule__DecFunc__Group_4__1__Impl ;
    public final void rule__DecFunc__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:782:1: ( rule__DecFunc__Group_4__1__Impl )
            // InternalGo.g:783:2: rule__DecFunc__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecFunc__Group_4__1__Impl();

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
    // $ANTLR end "rule__DecFunc__Group_4__1"


    // $ANTLR start "rule__DecFunc__Group_4__1__Impl"
    // InternalGo.g:789:1: rule__DecFunc__Group_4__1__Impl : ( ( rule__DecFunc__ParameterAssignment_4_1 ) ) ;
    public final void rule__DecFunc__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:793:1: ( ( ( rule__DecFunc__ParameterAssignment_4_1 ) ) )
            // InternalGo.g:794:1: ( ( rule__DecFunc__ParameterAssignment_4_1 ) )
            {
            // InternalGo.g:794:1: ( ( rule__DecFunc__ParameterAssignment_4_1 ) )
            // InternalGo.g:795:2: ( rule__DecFunc__ParameterAssignment_4_1 )
            {
             before(grammarAccess.getDecFuncAccess().getParameterAssignment_4_1()); 
            // InternalGo.g:796:2: ( rule__DecFunc__ParameterAssignment_4_1 )
            // InternalGo.g:796:3: rule__DecFunc__ParameterAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DecFunc__ParameterAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDecFuncAccess().getParameterAssignment_4_1()); 

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
    // $ANTLR end "rule__DecFunc__Group_4__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalGo.g:805:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:809:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalGo.g:810:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalGo.g:817:1: rule__Entity__Group__0__Impl : ( 'print' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:821:1: ( ( 'print' ) )
            // InternalGo.g:822:1: ( 'print' )
            {
            // InternalGo.g:822:1: ( 'print' )
            // InternalGo.g:823:2: 'print'
            {
             before(grammarAccess.getEntityAccess().getPrintKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalGo.g:832:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:836:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalGo.g:837:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalGo.g:844:1: rule__Entity__Group__1__Impl : ( '(' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:848:1: ( ( '(' ) )
            // InternalGo.g:849:1: ( '(' )
            {
            // InternalGo.g:849:1: ( '(' )
            // InternalGo.g:850:2: '('
            {
             before(grammarAccess.getEntityAccess().getLeftParenthesisKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGo.g:859:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:863:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalGo.g:864:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalGo.g:871:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:875:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // InternalGo.g:876:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // InternalGo.g:876:1: ( ( rule__Entity__NameAssignment_2 ) )
            // InternalGo.g:877:2: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // InternalGo.g:878:2: ( rule__Entity__NameAssignment_2 )
            // InternalGo.g:878:3: rule__Entity__NameAssignment_2
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
    // InternalGo.g:886:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:890:1: ( rule__Entity__Group__3__Impl )
            // InternalGo.g:891:2: rule__Entity__Group__3__Impl
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
    // InternalGo.g:897:1: rule__Entity__Group__3__Impl : ( ')' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:901:1: ( ( ')' ) )
            // InternalGo.g:902:1: ( ')' )
            {
            // InternalGo.g:902:1: ( ')' )
            // InternalGo.g:903:2: ')'
            {
             before(grammarAccess.getEntityAccess().getRightParenthesisKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGo.g:913:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:917:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalGo.g:918:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalGo.g:925:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:929:1: ( ( 'datatype' ) )
            // InternalGo.g:930:1: ( 'datatype' )
            {
            // InternalGo.g:930:1: ( 'datatype' )
            // InternalGo.g:931:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalGo.g:940:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:944:1: ( rule__DataType__Group__1__Impl )
            // InternalGo.g:945:2: rule__DataType__Group__1__Impl
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
    // InternalGo.g:951:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:955:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalGo.g:956:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalGo.g:956:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalGo.g:957:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalGo.g:958:2: ( rule__DataType__NameAssignment_1 )
            // InternalGo.g:958:3: rule__DataType__NameAssignment_1
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
    // InternalGo.g:967:1: rule__Go__ElementsAssignment : ( ruleGreeting ) ;
    public final void rule__Go__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:971:1: ( ( ruleGreeting ) )
            // InternalGo.g:972:2: ( ruleGreeting )
            {
            // InternalGo.g:972:2: ( ruleGreeting )
            // InternalGo.g:973:3: ruleGreeting
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


    // $ANTLR start "rule__DecFunc__NameAssignment_1"
    // InternalGo.g:982:1: rule__DecFunc__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DecFunc__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:986:1: ( ( RULE_ID ) )
            // InternalGo.g:987:2: ( RULE_ID )
            {
            // InternalGo.g:987:2: ( RULE_ID )
            // InternalGo.g:988:3: RULE_ID
            {
             before(grammarAccess.getDecFuncAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDecFuncAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DecFunc__NameAssignment_1"


    // $ANTLR start "rule__DecFunc__ParameterAssignment_3"
    // InternalGo.g:997:1: rule__DecFunc__ParameterAssignment_3 : ( RULE_ID ) ;
    public final void rule__DecFunc__ParameterAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1001:1: ( ( RULE_ID ) )
            // InternalGo.g:1002:2: ( RULE_ID )
            {
            // InternalGo.g:1002:2: ( RULE_ID )
            // InternalGo.g:1003:3: RULE_ID
            {
             before(grammarAccess.getDecFuncAccess().getParameterIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDecFuncAccess().getParameterIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__DecFunc__ParameterAssignment_3"


    // $ANTLR start "rule__DecFunc__ParameterAssignment_4_1"
    // InternalGo.g:1012:1: rule__DecFunc__ParameterAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__DecFunc__ParameterAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1016:1: ( ( RULE_ID ) )
            // InternalGo.g:1017:2: ( RULE_ID )
            {
            // InternalGo.g:1017:2: ( RULE_ID )
            // InternalGo.g:1018:3: RULE_ID
            {
             before(grammarAccess.getDecFuncAccess().getParameterIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDecFuncAccess().getParameterIDTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__DecFunc__ParameterAssignment_4_1"


    // $ANTLR start "rule__Entity__NameAssignment_2"
    // InternalGo.g:1027:1: rule__Entity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1031:1: ( ( RULE_ID ) )
            // InternalGo.g:1032:2: ( RULE_ID )
            {
            // InternalGo.g:1032:2: ( RULE_ID )
            // InternalGo.g:1033:3: RULE_ID
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
    // InternalGo.g:1042:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1046:1: ( ( RULE_ID ) )
            // InternalGo.g:1047:2: ( RULE_ID )
            {
            // InternalGo.g:1047:2: ( RULE_ID )
            // InternalGo.g:1048:3: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000180100012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000048000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});

}