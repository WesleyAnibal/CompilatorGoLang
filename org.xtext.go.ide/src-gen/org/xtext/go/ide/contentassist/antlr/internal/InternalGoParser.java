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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'break'", "'case'", "'chan'", "'const'", "'continue'", "'else'", "'for'", "'func'", "'if'", "'import'", "'return'", "'package'", "'range'", "'print'", "'('", "')'", "'datatype'"
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
    public static final int T__27=27;
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

                if ( ((LA1_0>=11 && LA1_0<=24)||LA1_0==27) ) {
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


    // $ANTLR start "entryRuleTerminals"
    // InternalGo.g:103:1: entryRuleTerminals : ruleTerminals EOF ;
    public final void entryRuleTerminals() throws RecognitionException {
        try {
            // InternalGo.g:104:1: ( ruleTerminals EOF )
            // InternalGo.g:105:1: ruleTerminals EOF
            {
             before(grammarAccess.getTerminalsRule()); 
            pushFollow(FOLLOW_1);
            ruleTerminals();

            state._fsp--;

             after(grammarAccess.getTerminalsRule()); 
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
    // $ANTLR end "entryRuleTerminals"


    // $ANTLR start "ruleTerminals"
    // InternalGo.g:112:1: ruleTerminals : ( ( rule__Terminals__Alternatives ) ) ;
    public final void ruleTerminals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:116:2: ( ( ( rule__Terminals__Alternatives ) ) )
            // InternalGo.g:117:2: ( ( rule__Terminals__Alternatives ) )
            {
            // InternalGo.g:117:2: ( ( rule__Terminals__Alternatives ) )
            // InternalGo.g:118:3: ( rule__Terminals__Alternatives )
            {
             before(grammarAccess.getTerminalsAccess().getAlternatives()); 
            // InternalGo.g:119:3: ( rule__Terminals__Alternatives )
            // InternalGo.g:119:4: rule__Terminals__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Terminals__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTerminalsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTerminals"


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
            match(input,11,FOLLOW_2); 
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
            match(input,12,FOLLOW_2); 
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
            match(input,13,FOLLOW_2); 
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
            match(input,14,FOLLOW_2); 
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
            match(input,15,FOLLOW_2); 
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
            match(input,16,FOLLOW_2); 
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
            match(input,17,FOLLOW_2); 
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
            match(input,18,FOLLOW_2); 
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
            match(input,19,FOLLOW_2); 
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
            match(input,20,FOLLOW_2); 
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
            match(input,21,FOLLOW_2); 
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
            match(input,22,FOLLOW_2); 
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
            match(input,23,FOLLOW_2); 
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
    // InternalGo.g:502:1: rule__Greeting__Alternatives : ( ( ruleDataType ) | ( ruleEntity ) | ( ruleTerminals ) );
    public final void rule__Greeting__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:506:1: ( ( ruleDataType ) | ( ruleEntity ) | ( ruleTerminals ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
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
                    // InternalGo.g:519:2: ( ruleTerminals )
                    {
                    // InternalGo.g:519:2: ( ruleTerminals )
                    // InternalGo.g:520:3: ruleTerminals
                    {
                     before(grammarAccess.getGreetingAccess().getTerminalsParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTerminals();

                    state._fsp--;

                     after(grammarAccess.getGreetingAccess().getTerminalsParserRuleCall_2()); 

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


    // $ANTLR start "rule__Terminals__Alternatives"
    // InternalGo.g:529:1: rule__Terminals__Alternatives : ( ( ruleBREAK ) | ( ruleCASE ) | ( ruleCHAN ) | ( ruleCONST ) | ( ruleCONTINUE ) | ( ruleELSE ) | ( ruleIF ) | ( ruleFOR ) | ( ruleFUNC ) | ( ruleIMPORT ) | ( ruleRETURN ) | ( rulePACKAGE ) | ( ruleRANGE ) );
    public final void rule__Terminals__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:533:1: ( ( ruleBREAK ) | ( ruleCASE ) | ( ruleCHAN ) | ( ruleCONST ) | ( ruleCONTINUE ) | ( ruleELSE ) | ( ruleIF ) | ( ruleFOR ) | ( ruleFUNC ) | ( ruleIMPORT ) | ( ruleRETURN ) | ( rulePACKAGE ) | ( ruleRANGE ) )
            int alt3=13;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 19:
                {
                alt3=7;
                }
                break;
            case 17:
                {
                alt3=8;
                }
                break;
            case 18:
                {
                alt3=9;
                }
                break;
            case 20:
                {
                alt3=10;
                }
                break;
            case 21:
                {
                alt3=11;
                }
                break;
            case 22:
                {
                alt3=12;
                }
                break;
            case 23:
                {
                alt3=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGo.g:534:2: ( ruleBREAK )
                    {
                    // InternalGo.g:534:2: ( ruleBREAK )
                    // InternalGo.g:535:3: ruleBREAK
                    {
                     before(grammarAccess.getTerminalsAccess().getBREAKParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBREAK();

                    state._fsp--;

                     after(grammarAccess.getTerminalsAccess().getBREAKParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:540:2: ( ruleCASE )
                    {
                    // InternalGo.g:540:2: ( ruleCASE )
                    // InternalGo.g:541:3: ruleCASE
                    {
                     before(grammarAccess.getTerminalsAccess().getCASEParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCASE();

                    state._fsp--;

                     after(grammarAccess.getTerminalsAccess().getCASEParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:546:2: ( ruleCHAN )
                    {
                    // InternalGo.g:546:2: ( ruleCHAN )
                    // InternalGo.g:547:3: ruleCHAN
                    {
                     before(grammarAccess.getTerminalsAccess().getCHANParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCHAN();

                    state._fsp--;

                     after(grammarAccess.getTerminalsAccess().getCHANParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:552:2: ( ruleCONST )
                    {
                    // InternalGo.g:552:2: ( ruleCONST )
                    // InternalGo.g:553:3: ruleCONST
                    {
                     before(grammarAccess.getTerminalsAccess().getCONSTParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCONST();

                    state._fsp--;

                     after(grammarAccess.getTerminalsAccess().getCONSTParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGo.g:558:2: ( ruleCONTINUE )
                    {
                    // InternalGo.g:558:2: ( ruleCONTINUE )
                    // InternalGo.g:559:3: ruleCONTINUE
                    {
                     before(grammarAccess.getTerminalsAccess().getCONTINUEParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleCONTINUE();

                    state._fsp--;

                     after(grammarAccess.getTerminalsAccess().getCONTINUEParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGo.g:564:2: ( ruleELSE )
                    {
                    // InternalGo.g:564:2: ( ruleELSE )
                    // InternalGo.g:565:3: ruleELSE
                    {
                     before(grammarAccess.getTerminalsAccess().getELSEParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleELSE();

                    state._fsp--;

                     after(grammarAccess.getTerminalsAccess().getELSEParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGo.g:570:2: ( ruleIF )
                    {
                    // InternalGo.g:570:2: ( ruleIF )
                    // InternalGo.g:571:3: ruleIF
                    {
                     before(grammarAccess.getTerminalsAccess().getIFParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleIF();

                    state._fsp--;

                     after(grammarAccess.getTerminalsAccess().getIFParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGo.g:576:2: ( ruleFOR )
                    {
                    // InternalGo.g:576:2: ( ruleFOR )
                    // InternalGo.g:577:3: ruleFOR
                    {
                     before(grammarAccess.getTerminalsAccess().getFORParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleFOR();

                    state._fsp--;

                     after(grammarAccess.getTerminalsAccess().getFORParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalGo.g:582:2: ( ruleFUNC )
                    {
                    // InternalGo.g:582:2: ( ruleFUNC )
                    // InternalGo.g:583:3: ruleFUNC
                    {
                     before(grammarAccess.getTerminalsAccess().getFUNCParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleFUNC();

                    state._fsp--;

                     after(grammarAccess.getTerminalsAccess().getFUNCParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalGo.g:588:2: ( ruleIMPORT )
                    {
                    // InternalGo.g:588:2: ( ruleIMPORT )
                    // InternalGo.g:589:3: ruleIMPORT
                    {
                     before(grammarAccess.getTerminalsAccess().getIMPORTParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleIMPORT();

                    state._fsp--;

                     after(grammarAccess.getTerminalsAccess().getIMPORTParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalGo.g:594:2: ( ruleRETURN )
                    {
                    // InternalGo.g:594:2: ( ruleRETURN )
                    // InternalGo.g:595:3: ruleRETURN
                    {
                     before(grammarAccess.getTerminalsAccess().getRETURNParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleRETURN();

                    state._fsp--;

                     after(grammarAccess.getTerminalsAccess().getRETURNParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalGo.g:600:2: ( rulePACKAGE )
                    {
                    // InternalGo.g:600:2: ( rulePACKAGE )
                    // InternalGo.g:601:3: rulePACKAGE
                    {
                     before(grammarAccess.getTerminalsAccess().getPACKAGEParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    rulePACKAGE();

                    state._fsp--;

                     after(grammarAccess.getTerminalsAccess().getPACKAGEParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalGo.g:606:2: ( ruleRANGE )
                    {
                    // InternalGo.g:606:2: ( ruleRANGE )
                    // InternalGo.g:607:3: ruleRANGE
                    {
                     before(grammarAccess.getTerminalsAccess().getRANGEParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    ruleRANGE();

                    state._fsp--;

                     after(grammarAccess.getTerminalsAccess().getRANGEParserRuleCall_12()); 

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
    // $ANTLR end "rule__Terminals__Alternatives"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalGo.g:616:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:620:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalGo.g:621:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalGo.g:628:1: rule__Entity__Group__0__Impl : ( 'print' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:632:1: ( ( 'print' ) )
            // InternalGo.g:633:1: ( 'print' )
            {
            // InternalGo.g:633:1: ( 'print' )
            // InternalGo.g:634:2: 'print'
            {
             before(grammarAccess.getEntityAccess().getPrintKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalGo.g:643:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:647:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalGo.g:648:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalGo.g:655:1: rule__Entity__Group__1__Impl : ( '(' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:659:1: ( ( '(' ) )
            // InternalGo.g:660:1: ( '(' )
            {
            // InternalGo.g:660:1: ( '(' )
            // InternalGo.g:661:2: '('
            {
             before(grammarAccess.getEntityAccess().getLeftParenthesisKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGo.g:670:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:674:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalGo.g:675:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalGo.g:682:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:686:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // InternalGo.g:687:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // InternalGo.g:687:1: ( ( rule__Entity__NameAssignment_2 ) )
            // InternalGo.g:688:2: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // InternalGo.g:689:2: ( rule__Entity__NameAssignment_2 )
            // InternalGo.g:689:3: rule__Entity__NameAssignment_2
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
    // InternalGo.g:697:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:701:1: ( rule__Entity__Group__3__Impl )
            // InternalGo.g:702:2: rule__Entity__Group__3__Impl
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
    // InternalGo.g:708:1: rule__Entity__Group__3__Impl : ( ')' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:712:1: ( ( ')' ) )
            // InternalGo.g:713:1: ( ')' )
            {
            // InternalGo.g:713:1: ( ')' )
            // InternalGo.g:714:2: ')'
            {
             before(grammarAccess.getEntityAccess().getRightParenthesisKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGo.g:724:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:728:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalGo.g:729:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalGo.g:736:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:740:1: ( ( 'datatype' ) )
            // InternalGo.g:741:1: ( 'datatype' )
            {
            // InternalGo.g:741:1: ( 'datatype' )
            // InternalGo.g:742:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGo.g:751:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:755:1: ( rule__DataType__Group__1__Impl )
            // InternalGo.g:756:2: rule__DataType__Group__1__Impl
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
    // InternalGo.g:762:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:766:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalGo.g:767:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalGo.g:767:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalGo.g:768:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalGo.g:769:2: ( rule__DataType__NameAssignment_1 )
            // InternalGo.g:769:3: rule__DataType__NameAssignment_1
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
    // InternalGo.g:778:1: rule__Go__ElementsAssignment : ( ruleGreeting ) ;
    public final void rule__Go__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:782:1: ( ( ruleGreeting ) )
            // InternalGo.g:783:2: ( ruleGreeting )
            {
            // InternalGo.g:783:2: ( ruleGreeting )
            // InternalGo.g:784:3: ruleGreeting
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


    // $ANTLR start "rule__Entity__NameAssignment_2"
    // InternalGo.g:793:1: rule__Entity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:797:1: ( ( RULE_ID ) )
            // InternalGo.g:798:2: ( RULE_ID )
            {
            // InternalGo.g:798:2: ( RULE_ID )
            // InternalGo.g:799:3: RULE_ID
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
    // InternalGo.g:808:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:812:1: ( ( RULE_ID ) )
            // InternalGo.g:813:2: ( RULE_ID )
            {
            // InternalGo.g:813:2: ( RULE_ID )
            // InternalGo.g:814:3: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000009FFF802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000000L});

}