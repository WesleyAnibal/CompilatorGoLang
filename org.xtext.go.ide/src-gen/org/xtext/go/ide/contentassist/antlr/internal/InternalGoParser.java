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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_COMMA", "RULE_OPEN_PARENTHESES", "RULE_CLOSED_PARENTHESES", "RULE_OPEN_BRACKETS", "RULE_CLOSED_BRACKETS", "RULE_OPEN_KEY", "RULE_CLOSED_KEY", "RULE_PLUS", "RULE_MINUS", "RULE_ASTERICS", "RULE_BAR", "RULE_DOT", "RULE_NEWLINE", "RULE_COMMENTS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'break'", "'case'", "'chan'", "'const'", "'continue'", "'else'", "'for'", "'func'", "'if'", "'import'", "'return'", "'package'", "'type'", "'var'", "'range'", "'<'", "'<='", "'=='", "'>='", "'>'", "'string'", "'int'", "'bool'", "'byte'", "'rune'", "'float32'", "'float64'", "'true'", "'false'", "'='", "':='", "'||'", "'&&'", "'datatype'"
    };
    public static final int T__50=50;
    public static final int RULE_OPEN_KEY=13;
    public static final int RULE_OPEN_PARENTHESES=9;
    public static final int RULE_BAR=18;
    public static final int RULE_COMMENTS=21;
    public static final int T__59=59;
    public static final int RULE_CLOSED_PARENTHESES=10;
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
    public static final int RULE_COMMA=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int RULE_ML_COMMENT=22;
    public static final int RULE_NEWLINE=20;
    public static final int RULE_ASTERICS=17;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=23;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_OPEN_BRACKETS=11;
    public static final int RULE_PLUS=15;
    public static final int T__36=36;
    public static final int RULE_DOT=19;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=24;
    public static final int RULE_CLOSED_KEY=14;
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
    public static final int RULE_CLOSED_BRACKETS=12;

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
    // InternalGo.g:54:1: entryRuleGo : ruleGo EOF ;
    public final void entryRuleGo() throws RecognitionException {
        try {
            // InternalGo.g:55:1: ( ruleGo EOF )
            // InternalGo.g:56:1: ruleGo EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGo();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:63:1: ruleGo : ( ( rule__Go__ElementsAssignment )* ) ;
    public final void ruleGo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:67:2: ( ( ( rule__Go__ElementsAssignment )* ) )
            // InternalGo.g:68:2: ( ( rule__Go__ElementsAssignment )* )
            {
            // InternalGo.g:68:2: ( ( rule__Go__ElementsAssignment )* )
            // InternalGo.g:69:3: ( rule__Go__ElementsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getElementsAssignment()); 
            }
            // InternalGo.g:70:3: ( rule__Go__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_EOL && LA1_0<=RULE_ID)||LA1_0==RULE_INT||LA1_0==RULE_OPEN_PARENTHESES||LA1_0==29||(LA1_0>=33 && LA1_0<=35)||LA1_0==39||LA1_0==59) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGo.g:70:4: rule__Go__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Go__ElementsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoAccess().getElementsAssignment()); 
            }

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
    // InternalGo.g:79:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // InternalGo.g:80:1: ( ruleGreeting EOF )
            // InternalGo.g:81:1: ruleGreeting EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGreetingRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGreeting();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGreetingRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:88:1: ruleGreeting : ( ( rule__Greeting__Alternatives ) ) ;
    public final void ruleGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:92:2: ( ( ( rule__Greeting__Alternatives ) ) )
            // InternalGo.g:93:2: ( ( rule__Greeting__Alternatives ) )
            {
            // InternalGo.g:93:2: ( ( rule__Greeting__Alternatives ) )
            // InternalGo.g:94:3: ( rule__Greeting__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGreetingAccess().getAlternatives()); 
            }
            // InternalGo.g:95:3: ( rule__Greeting__Alternatives )
            // InternalGo.g:95:4: rule__Greeting__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGreetingAccess().getAlternatives()); 
            }

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


    // $ANTLR start "entryRuleDecVar"
    // InternalGo.g:104:1: entryRuleDecVar : ruleDecVar EOF ;
    public final void entryRuleDecVar() throws RecognitionException {
        try {
            // InternalGo.g:105:1: ( ruleDecVar EOF )
            // InternalGo.g:106:1: ruleDecVar EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDecVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDecVar"


    // $ANTLR start "ruleDecVar"
    // InternalGo.g:113:1: ruleDecVar : ( ( rule__DecVar__Alternatives ) ) ;
    public final void ruleDecVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:117:2: ( ( ( rule__DecVar__Alternatives ) ) )
            // InternalGo.g:118:2: ( ( rule__DecVar__Alternatives ) )
            {
            // InternalGo.g:118:2: ( ( rule__DecVar__Alternatives ) )
            // InternalGo.g:119:3: ( rule__DecVar__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getAlternatives()); 
            }
            // InternalGo.g:120:3: ( rule__DecVar__Alternatives )
            // InternalGo.g:120:4: rule__DecVar__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DecVar__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleDecVar"


    // $ANTLR start "entryRuleMultDecVars"
    // InternalGo.g:129:1: entryRuleMultDecVars : ruleMultDecVars EOF ;
    public final void entryRuleMultDecVars() throws RecognitionException {
        try {
            // InternalGo.g:130:1: ( ruleMultDecVars EOF )
            // InternalGo.g:131:1: ruleMultDecVars EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultDecVarsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMultDecVars();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultDecVarsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMultDecVars"


    // $ANTLR start "ruleMultDecVars"
    // InternalGo.g:138:1: ruleMultDecVars : ( ( rule__MultDecVars__Group__0 ) ) ;
    public final void ruleMultDecVars() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:142:2: ( ( ( rule__MultDecVars__Group__0 ) ) )
            // InternalGo.g:143:2: ( ( rule__MultDecVars__Group__0 ) )
            {
            // InternalGo.g:143:2: ( ( rule__MultDecVars__Group__0 ) )
            // InternalGo.g:144:3: ( rule__MultDecVars__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultDecVarsAccess().getGroup()); 
            }
            // InternalGo.g:145:3: ( rule__MultDecVars__Group__0 )
            // InternalGo.g:145:4: rule__MultDecVars__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultDecVars__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultDecVarsAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleMultDecVars"


    // $ANTLR start "entryRuleDecVars"
    // InternalGo.g:154:1: entryRuleDecVars : ruleDecVars EOF ;
    public final void entryRuleDecVars() throws RecognitionException {
        try {
            // InternalGo.g:155:1: ( ruleDecVars EOF )
            // InternalGo.g:156:1: ruleDecVars EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDecVars();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDecVars"


    // $ANTLR start "ruleDecVars"
    // InternalGo.g:163:1: ruleDecVars : ( ( rule__DecVars__Group__0 ) ) ;
    public final void ruleDecVars() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:167:2: ( ( ( rule__DecVars__Group__0 ) ) )
            // InternalGo.g:168:2: ( ( rule__DecVars__Group__0 ) )
            {
            // InternalGo.g:168:2: ( ( rule__DecVars__Group__0 ) )
            // InternalGo.g:169:3: ( rule__DecVars__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarsAccess().getGroup()); 
            }
            // InternalGo.g:170:3: ( rule__DecVars__Group__0 )
            // InternalGo.g:170:4: rule__DecVars__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DecVars__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarsAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleDecVars"


    // $ANTLR start "entryRuleAtri"
    // InternalGo.g:179:1: entryRuleAtri : ruleAtri EOF ;
    public final void entryRuleAtri() throws RecognitionException {
        try {
            // InternalGo.g:180:1: ( ruleAtri EOF )
            // InternalGo.g:181:1: ruleAtri EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtriRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAtri();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtriRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAtri"


    // $ANTLR start "ruleAtri"
    // InternalGo.g:188:1: ruleAtri : ( ( rule__Atri__Alternatives ) ) ;
    public final void ruleAtri() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:192:2: ( ( ( rule__Atri__Alternatives ) ) )
            // InternalGo.g:193:2: ( ( rule__Atri__Alternatives ) )
            {
            // InternalGo.g:193:2: ( ( rule__Atri__Alternatives ) )
            // InternalGo.g:194:3: ( rule__Atri__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtriAccess().getAlternatives()); 
            }
            // InternalGo.g:195:3: ( rule__Atri__Alternatives )
            // InternalGo.g:195:4: rule__Atri__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atri__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtriAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleAtri"


    // $ANTLR start "entryRuleParams"
    // InternalGo.g:204:1: entryRuleParams : ruleParams EOF ;
    public final void entryRuleParams() throws RecognitionException {
        try {
            // InternalGo.g:205:1: ( ruleParams EOF )
            // InternalGo.g:206:1: ruleParams EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParams();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParams"


    // $ANTLR start "ruleParams"
    // InternalGo.g:213:1: ruleParams : ( ( rule__Params__Group__0 ) ) ;
    public final void ruleParams() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:217:2: ( ( ( rule__Params__Group__0 ) ) )
            // InternalGo.g:218:2: ( ( rule__Params__Group__0 ) )
            {
            // InternalGo.g:218:2: ( ( rule__Params__Group__0 ) )
            // InternalGo.g:219:3: ( rule__Params__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamsAccess().getGroup()); 
            }
            // InternalGo.g:220:3: ( rule__Params__Group__0 )
            // InternalGo.g:220:4: rule__Params__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Params__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamsAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleParams"


    // $ANTLR start "entryRuleTypeValue"
    // InternalGo.g:229:1: entryRuleTypeValue : ruleTypeValue EOF ;
    public final void entryRuleTypeValue() throws RecognitionException {
        try {
            // InternalGo.g:230:1: ( ruleTypeValue EOF )
            // InternalGo.g:231:1: ruleTypeValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypeValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTypeValue"


    // $ANTLR start "ruleTypeValue"
    // InternalGo.g:238:1: ruleTypeValue : ( ( rule__TypeValue__Alternatives ) ) ;
    public final void ruleTypeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:242:2: ( ( ( rule__TypeValue__Alternatives ) ) )
            // InternalGo.g:243:2: ( ( rule__TypeValue__Alternatives ) )
            {
            // InternalGo.g:243:2: ( ( rule__TypeValue__Alternatives ) )
            // InternalGo.g:244:3: ( rule__TypeValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeValueAccess().getAlternatives()); 
            }
            // InternalGo.g:245:3: ( rule__TypeValue__Alternatives )
            // InternalGo.g:245:4: rule__TypeValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeValueAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleTypeValue"


    // $ANTLR start "entryRuleDecImport"
    // InternalGo.g:254:1: entryRuleDecImport : ruleDecImport EOF ;
    public final void entryRuleDecImport() throws RecognitionException {
        try {
            // InternalGo.g:255:1: ( ruleDecImport EOF )
            // InternalGo.g:256:1: ruleDecImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDecImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecImportRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDecImport"


    // $ANTLR start "ruleDecImport"
    // InternalGo.g:263:1: ruleDecImport : ( ( rule__DecImport__Group__0 ) ) ;
    public final void ruleDecImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:267:2: ( ( ( rule__DecImport__Group__0 ) ) )
            // InternalGo.g:268:2: ( ( rule__DecImport__Group__0 ) )
            {
            // InternalGo.g:268:2: ( ( rule__DecImport__Group__0 ) )
            // InternalGo.g:269:3: ( rule__DecImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecImportAccess().getGroup()); 
            }
            // InternalGo.g:270:3: ( rule__DecImport__Group__0 )
            // InternalGo.g:270:4: rule__DecImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DecImport__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecImportAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleDecImport"


    // $ANTLR start "entryRuleOperations"
    // InternalGo.g:279:1: entryRuleOperations : ruleOperations EOF ;
    public final void entryRuleOperations() throws RecognitionException {
        try {
            // InternalGo.g:280:1: ( ruleOperations EOF )
            // InternalGo.g:281:1: ruleOperations EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOperations();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOperations"


    // $ANTLR start "ruleOperations"
    // InternalGo.g:288:1: ruleOperations : ( ( rule__Operations__Group__0 ) ) ;
    public final void ruleOperations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:292:2: ( ( ( rule__Operations__Group__0 ) ) )
            // InternalGo.g:293:2: ( ( rule__Operations__Group__0 ) )
            {
            // InternalGo.g:293:2: ( ( rule__Operations__Group__0 ) )
            // InternalGo.g:294:3: ( rule__Operations__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationsAccess().getGroup()); 
            }
            // InternalGo.g:295:3: ( rule__Operations__Group__0 )
            // InternalGo.g:295:4: rule__Operations__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operations__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationsAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleOperations"


    // $ANTLR start "entryRuleI"
    // InternalGo.g:304:1: entryRuleI : ruleI EOF ;
    public final void entryRuleI() throws RecognitionException {
        try {
            // InternalGo.g:305:1: ( ruleI EOF )
            // InternalGo.g:306:1: ruleI EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleI();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleI"


    // $ANTLR start "ruleI"
    // InternalGo.g:313:1: ruleI : ( ( rule__I__Alternatives )? ) ;
    public final void ruleI() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:317:2: ( ( ( rule__I__Alternatives )? ) )
            // InternalGo.g:318:2: ( ( rule__I__Alternatives )? )
            {
            // InternalGo.g:318:2: ( ( rule__I__Alternatives )? )
            // InternalGo.g:319:3: ( rule__I__Alternatives )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIAccess().getAlternatives()); 
            }
            // InternalGo.g:320:3: ( rule__I__Alternatives )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_PLUS && LA2_0<=RULE_MINUS)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGo.g:320:4: rule__I__Alternatives
                    {
                    pushFollow(FOLLOW_2);
                    rule__I__Alternatives();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleI"


    // $ANTLR start "entryRuleT"
    // InternalGo.g:329:1: entryRuleT : ruleT EOF ;
    public final void entryRuleT() throws RecognitionException {
        try {
            // InternalGo.g:330:1: ( ruleT EOF )
            // InternalGo.g:331:1: ruleT EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleT"


    // $ANTLR start "ruleT"
    // InternalGo.g:338:1: ruleT : ( ( rule__T__Group__0 ) ) ;
    public final void ruleT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:342:2: ( ( ( rule__T__Group__0 ) ) )
            // InternalGo.g:343:2: ( ( rule__T__Group__0 ) )
            {
            // InternalGo.g:343:2: ( ( rule__T__Group__0 ) )
            // InternalGo.g:344:3: ( rule__T__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTAccess().getGroup()); 
            }
            // InternalGo.g:345:3: ( rule__T__Group__0 )
            // InternalGo.g:345:4: rule__T__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__T__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleT"


    // $ANTLR start "entryRuleY"
    // InternalGo.g:354:1: entryRuleY : ruleY EOF ;
    public final void entryRuleY() throws RecognitionException {
        try {
            // InternalGo.g:355:1: ( ruleY EOF )
            // InternalGo.g:356:1: ruleY EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleY();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleY"


    // $ANTLR start "ruleY"
    // InternalGo.g:363:1: ruleY : ( ( rule__Y__Alternatives )? ) ;
    public final void ruleY() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:367:2: ( ( ( rule__Y__Alternatives )? ) )
            // InternalGo.g:368:2: ( ( rule__Y__Alternatives )? )
            {
            // InternalGo.g:368:2: ( ( rule__Y__Alternatives )? )
            // InternalGo.g:369:3: ( rule__Y__Alternatives )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAccess().getAlternatives()); 
            }
            // InternalGo.g:370:3: ( rule__Y__Alternatives )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_ASTERICS && LA3_0<=RULE_BAR)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGo.g:370:4: rule__Y__Alternatives
                    {
                    pushFollow(FOLLOW_2);
                    rule__Y__Alternatives();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleY"


    // $ANTLR start "entryRuleF"
    // InternalGo.g:379:1: entryRuleF : ruleF EOF ;
    public final void entryRuleF() throws RecognitionException {
        try {
            // InternalGo.g:380:1: ( ruleF EOF )
            // InternalGo.g:381:1: ruleF EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleF();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleF"


    // $ANTLR start "ruleF"
    // InternalGo.g:388:1: ruleF : ( ( rule__F__Alternatives ) ) ;
    public final void ruleF() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:392:2: ( ( ( rule__F__Alternatives ) ) )
            // InternalGo.g:393:2: ( ( rule__F__Alternatives ) )
            {
            // InternalGo.g:393:2: ( ( rule__F__Alternatives ) )
            // InternalGo.g:394:3: ( rule__F__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFAccess().getAlternatives()); 
            }
            // InternalGo.g:395:3: ( rule__F__Alternatives )
            // InternalGo.g:395:4: rule__F__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__F__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleF"


    // $ANTLR start "entryRuleNumbers"
    // InternalGo.g:404:1: entryRuleNumbers : ruleNumbers EOF ;
    public final void entryRuleNumbers() throws RecognitionException {
        try {
            // InternalGo.g:405:1: ( ruleNumbers EOF )
            // InternalGo.g:406:1: ruleNumbers EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumbersRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNumbers();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumbersRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNumbers"


    // $ANTLR start "ruleNumbers"
    // InternalGo.g:413:1: ruleNumbers : ( ( rule__Numbers__Alternatives ) ) ;
    public final void ruleNumbers() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:417:2: ( ( ( rule__Numbers__Alternatives ) ) )
            // InternalGo.g:418:2: ( ( rule__Numbers__Alternatives ) )
            {
            // InternalGo.g:418:2: ( ( rule__Numbers__Alternatives ) )
            // InternalGo.g:419:3: ( rule__Numbers__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumbersAccess().getAlternatives()); 
            }
            // InternalGo.g:420:3: ( rule__Numbers__Alternatives )
            // InternalGo.g:420:4: rule__Numbers__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Numbers__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumbersAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleNumbers"


    // $ANTLR start "entryRuleDouble"
    // InternalGo.g:429:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // InternalGo.g:430:1: ( ruleDouble EOF )
            // InternalGo.g:431:1: ruleDouble EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // InternalGo.g:438:1: ruleDouble : ( ( rule__Double__Group__0 ) ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:442:2: ( ( ( rule__Double__Group__0 ) ) )
            // InternalGo.g:443:2: ( ( rule__Double__Group__0 ) )
            {
            // InternalGo.g:443:2: ( ( rule__Double__Group__0 ) )
            // InternalGo.g:444:3: ( rule__Double__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAccess().getGroup()); 
            }
            // InternalGo.g:445:3: ( rule__Double__Group__0 )
            // InternalGo.g:445:4: rule__Double__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Double__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleCondition"
    // InternalGo.g:454:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalGo.g:455:1: ( ruleCondition EOF )
            // InternalGo.g:456:1: ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalGo.g:463:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:467:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalGo.g:468:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalGo.g:468:2: ( ( rule__Condition__Group__0 ) )
            // InternalGo.g:469:3: ( rule__Condition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getGroup()); 
            }
            // InternalGo.g:470:3: ( rule__Condition__Group__0 )
            // InternalGo.g:470:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleIfCondition"
    // InternalGo.g:479:1: entryRuleIfCondition : ruleIfCondition EOF ;
    public final void entryRuleIfCondition() throws RecognitionException {
        try {
            // InternalGo.g:480:1: ( ruleIfCondition EOF )
            // InternalGo.g:481:1: ruleIfCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIfCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfConditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIfCondition"


    // $ANTLR start "ruleIfCondition"
    // InternalGo.g:488:1: ruleIfCondition : ( ( rule__IfCondition__Group__0 ) ) ;
    public final void ruleIfCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:492:2: ( ( ( rule__IfCondition__Group__0 ) ) )
            // InternalGo.g:493:2: ( ( rule__IfCondition__Group__0 ) )
            {
            // InternalGo.g:493:2: ( ( rule__IfCondition__Group__0 ) )
            // InternalGo.g:494:3: ( rule__IfCondition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfConditionAccess().getGroup()); 
            }
            // InternalGo.g:495:3: ( rule__IfCondition__Group__0 )
            // InternalGo.g:495:4: rule__IfCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfCondition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfConditionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleIfCondition"


    // $ANTLR start "entryRuleElseIfCondition"
    // InternalGo.g:504:1: entryRuleElseIfCondition : ruleElseIfCondition EOF ;
    public final void entryRuleElseIfCondition() throws RecognitionException {
        try {
            // InternalGo.g:505:1: ( ruleElseIfCondition EOF )
            // InternalGo.g:506:1: ruleElseIfCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseIfConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleElseIfCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseIfConditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleElseIfCondition"


    // $ANTLR start "ruleElseIfCondition"
    // InternalGo.g:513:1: ruleElseIfCondition : ( ( rule__ElseIfCondition__Group__0 ) ) ;
    public final void ruleElseIfCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:517:2: ( ( ( rule__ElseIfCondition__Group__0 ) ) )
            // InternalGo.g:518:2: ( ( rule__ElseIfCondition__Group__0 ) )
            {
            // InternalGo.g:518:2: ( ( rule__ElseIfCondition__Group__0 ) )
            // InternalGo.g:519:3: ( rule__ElseIfCondition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseIfConditionAccess().getGroup()); 
            }
            // InternalGo.g:520:3: ( rule__ElseIfCondition__Group__0 )
            // InternalGo.g:520:4: rule__ElseIfCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElseIfCondition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseIfConditionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleElseIfCondition"


    // $ANTLR start "entryRuleElseCondition"
    // InternalGo.g:529:1: entryRuleElseCondition : ruleElseCondition EOF ;
    public final void entryRuleElseCondition() throws RecognitionException {
        try {
            // InternalGo.g:530:1: ( ruleElseCondition EOF )
            // InternalGo.g:531:1: ruleElseCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleElseCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseConditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleElseCondition"


    // $ANTLR start "ruleElseCondition"
    // InternalGo.g:538:1: ruleElseCondition : ( ( rule__ElseCondition__Group__0 ) ) ;
    public final void ruleElseCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:542:2: ( ( ( rule__ElseCondition__Group__0 ) ) )
            // InternalGo.g:543:2: ( ( rule__ElseCondition__Group__0 ) )
            {
            // InternalGo.g:543:2: ( ( rule__ElseCondition__Group__0 ) )
            // InternalGo.g:544:3: ( rule__ElseCondition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseConditionAccess().getGroup()); 
            }
            // InternalGo.g:545:3: ( rule__ElseCondition__Group__0 )
            // InternalGo.g:545:4: rule__ElseCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElseCondition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseConditionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleElseCondition"


    // $ANTLR start "entryRuleExpression"
    // InternalGo.g:554:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalGo.g:555:1: ( ruleExpression EOF )
            // InternalGo.g:556:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalGo.g:563:1: ruleExpression : ( ruleOrExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:567:2: ( ( ruleOrExpression ) )
            // InternalGo.g:568:2: ( ruleOrExpression )
            {
            // InternalGo.g:568:2: ( ruleOrExpression )
            // InternalGo.g:569:3: ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall()); 
            }

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalGo.g:579:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalGo.g:580:1: ( ruleOrExpression EOF )
            // InternalGo.g:581:1: ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalGo.g:588:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:592:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalGo.g:593:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalGo.g:593:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalGo.g:594:3: ( rule__OrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup()); 
            }
            // InternalGo.g:595:3: ( rule__OrExpression__Group__0 )
            // InternalGo.g:595:4: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalGo.g:604:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalGo.g:605:1: ( ruleAndExpression EOF )
            // InternalGo.g:606:1: ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalGo.g:613:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:617:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalGo.g:618:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalGo.g:618:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalGo.g:619:3: ( rule__AndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup()); 
            }
            // InternalGo.g:620:3: ( rule__AndExpression__Group__0 )
            // InternalGo.g:620:4: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalGo.g:629:1: entryRuleComparisonExpression : ruleComparisonExpression EOF ;
    public final void entryRuleComparisonExpression() throws RecognitionException {
        try {
            // InternalGo.g:630:1: ( ruleComparisonExpression EOF )
            // InternalGo.g:631:1: ruleComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalGo.g:638:1: ruleComparisonExpression : ( ( rule__ComparisonExpression__Group__0 ) ) ;
    public final void ruleComparisonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:642:2: ( ( ( rule__ComparisonExpression__Group__0 ) ) )
            // InternalGo.g:643:2: ( ( rule__ComparisonExpression__Group__0 ) )
            {
            // InternalGo.g:643:2: ( ( rule__ComparisonExpression__Group__0 ) )
            // InternalGo.g:644:3: ( rule__ComparisonExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getGroup()); 
            }
            // InternalGo.g:645:3: ( rule__ComparisonExpression__Group__0 )
            // InternalGo.g:645:4: rule__ComparisonExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalGo.g:654:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalGo.g:655:1: ( rulePrimaryExpression EOF )
            // InternalGo.g:656:1: rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalGo.g:663:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:667:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalGo.g:668:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalGo.g:668:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalGo.g:669:3: ( rule__PrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }
            // InternalGo.g:670:3: ( rule__PrimaryExpression__Alternatives )
            // InternalGo.g:670:4: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleLiteral"
    // InternalGo.g:679:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalGo.g:680:1: ( ruleLiteral EOF )
            // InternalGo.g:681:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalGo.g:688:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:692:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalGo.g:693:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalGo.g:693:2: ( ( rule__Literal__Alternatives ) )
            // InternalGo.g:694:3: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // InternalGo.g:695:3: ( rule__Literal__Alternatives )
            // InternalGo.g:695:4: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleDecFunc"
    // InternalGo.g:704:1: entryRuleDecFunc : ruleDecFunc EOF ;
    public final void entryRuleDecFunc() throws RecognitionException {
        try {
            // InternalGo.g:705:1: ( ruleDecFunc EOF )
            // InternalGo.g:706:1: ruleDecFunc EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecFuncRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDecFunc();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecFuncRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:713:1: ruleDecFunc : ( ( rule__DecFunc__Group__0 ) ) ;
    public final void ruleDecFunc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:717:2: ( ( ( rule__DecFunc__Group__0 ) ) )
            // InternalGo.g:718:2: ( ( rule__DecFunc__Group__0 ) )
            {
            // InternalGo.g:718:2: ( ( rule__DecFunc__Group__0 ) )
            // InternalGo.g:719:3: ( rule__DecFunc__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecFuncAccess().getGroup()); 
            }
            // InternalGo.g:720:3: ( rule__DecFunc__Group__0 )
            // InternalGo.g:720:4: rule__DecFunc__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DecFunc__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecFuncAccess().getGroup()); 
            }

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


    // $ANTLR start "entryRuleTypes"
    // InternalGo.g:729:1: entryRuleTypes : ruleTypes EOF ;
    public final void entryRuleTypes() throws RecognitionException {
        try {
            // InternalGo.g:730:1: ( ruleTypes EOF )
            // InternalGo.g:731:1: ruleTypes EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypesRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTypes"


    // $ANTLR start "ruleTypes"
    // InternalGo.g:738:1: ruleTypes : ( ( rule__Types__Alternatives ) ) ;
    public final void ruleTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:742:2: ( ( ( rule__Types__Alternatives ) ) )
            // InternalGo.g:743:2: ( ( rule__Types__Alternatives ) )
            {
            // InternalGo.g:743:2: ( ( rule__Types__Alternatives ) )
            // InternalGo.g:744:3: ( rule__Types__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypesAccess().getAlternatives()); 
            }
            // InternalGo.g:745:3: ( rule__Types__Alternatives )
            // InternalGo.g:745:4: rule__Types__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Types__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypesAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleTypes"


    // $ANTLR start "entryRuleModif"
    // InternalGo.g:754:1: entryRuleModif : ruleModif EOF ;
    public final void entryRuleModif() throws RecognitionException {
        try {
            // InternalGo.g:755:1: ( ruleModif EOF )
            // InternalGo.g:756:1: ruleModif EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModifRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModif();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModifRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleModif"


    // $ANTLR start "ruleModif"
    // InternalGo.g:763:1: ruleModif : ( ( rule__Modif__Alternatives ) ) ;
    public final void ruleModif() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:767:2: ( ( ( rule__Modif__Alternatives ) ) )
            // InternalGo.g:768:2: ( ( rule__Modif__Alternatives ) )
            {
            // InternalGo.g:768:2: ( ( rule__Modif__Alternatives ) )
            // InternalGo.g:769:3: ( rule__Modif__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModifAccess().getAlternatives()); 
            }
            // InternalGo.g:770:3: ( rule__Modif__Alternatives )
            // InternalGo.g:770:4: rule__Modif__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Modif__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModifAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleModif"


    // $ANTLR start "entryRuleBoolean"
    // InternalGo.g:779:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalGo.g:780:1: ( ruleBoolean EOF )
            // InternalGo.g:781:1: ruleBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalGo.g:788:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:792:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // InternalGo.g:793:2: ( ( rule__Boolean__Alternatives ) )
            {
            // InternalGo.g:793:2: ( ( rule__Boolean__Alternatives ) )
            // InternalGo.g:794:3: ( rule__Boolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanAccess().getAlternatives()); 
            }
            // InternalGo.g:795:3: ( rule__Boolean__Alternatives )
            // InternalGo.g:795:4: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleBREAK"
    // InternalGo.g:804:1: entryRuleBREAK : ruleBREAK EOF ;
    public final void entryRuleBREAK() throws RecognitionException {
        try {
            // InternalGo.g:805:1: ( ruleBREAK EOF )
            // InternalGo.g:806:1: ruleBREAK EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBREAKRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBREAK();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBREAKRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:813:1: ruleBREAK : ( 'break' ) ;
    public final void ruleBREAK() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:817:2: ( ( 'break' ) )
            // InternalGo.g:818:2: ( 'break' )
            {
            // InternalGo.g:818:2: ( 'break' )
            // InternalGo.g:819:3: 'break'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBREAKAccess().getBreakKeyword()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBREAKAccess().getBreakKeyword()); 
            }

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
    // InternalGo.g:829:1: entryRuleCASE : ruleCASE EOF ;
    public final void entryRuleCASE() throws RecognitionException {
        try {
            // InternalGo.g:830:1: ( ruleCASE EOF )
            // InternalGo.g:831:1: ruleCASE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCASERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCASE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCASERule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:838:1: ruleCASE : ( 'case' ) ;
    public final void ruleCASE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:842:2: ( ( 'case' ) )
            // InternalGo.g:843:2: ( 'case' )
            {
            // InternalGo.g:843:2: ( 'case' )
            // InternalGo.g:844:3: 'case'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCASEAccess().getCaseKeyword()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCASEAccess().getCaseKeyword()); 
            }

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
    // InternalGo.g:854:1: entryRuleCHAN : ruleCHAN EOF ;
    public final void entryRuleCHAN() throws RecognitionException {
        try {
            // InternalGo.g:855:1: ( ruleCHAN EOF )
            // InternalGo.g:856:1: ruleCHAN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCHANRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCHAN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCHANRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:863:1: ruleCHAN : ( 'chan' ) ;
    public final void ruleCHAN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:867:2: ( ( 'chan' ) )
            // InternalGo.g:868:2: ( 'chan' )
            {
            // InternalGo.g:868:2: ( 'chan' )
            // InternalGo.g:869:3: 'chan'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCHANAccess().getChanKeyword()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCHANAccess().getChanKeyword()); 
            }

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
    // InternalGo.g:879:1: entryRuleCONST : ruleCONST EOF ;
    public final void entryRuleCONST() throws RecognitionException {
        try {
            // InternalGo.g:880:1: ( ruleCONST EOF )
            // InternalGo.g:881:1: ruleCONST EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCONSTRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCONST();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCONSTRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:888:1: ruleCONST : ( 'const' ) ;
    public final void ruleCONST() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:892:2: ( ( 'const' ) )
            // InternalGo.g:893:2: ( 'const' )
            {
            // InternalGo.g:893:2: ( 'const' )
            // InternalGo.g:894:3: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCONSTAccess().getConstKeyword()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCONSTAccess().getConstKeyword()); 
            }

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
    // InternalGo.g:904:1: entryRuleCONTINUE : ruleCONTINUE EOF ;
    public final void entryRuleCONTINUE() throws RecognitionException {
        try {
            // InternalGo.g:905:1: ( ruleCONTINUE EOF )
            // InternalGo.g:906:1: ruleCONTINUE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCONTINUERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCONTINUE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCONTINUERule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:913:1: ruleCONTINUE : ( 'continue' ) ;
    public final void ruleCONTINUE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:917:2: ( ( 'continue' ) )
            // InternalGo.g:918:2: ( 'continue' )
            {
            // InternalGo.g:918:2: ( 'continue' )
            // InternalGo.g:919:3: 'continue'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCONTINUEAccess().getContinueKeyword()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCONTINUEAccess().getContinueKeyword()); 
            }

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
    // InternalGo.g:929:1: entryRuleELSE : ruleELSE EOF ;
    public final void entryRuleELSE() throws RecognitionException {
        try {
            // InternalGo.g:930:1: ( ruleELSE EOF )
            // InternalGo.g:931:1: ruleELSE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getELSERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleELSE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getELSERule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:938:1: ruleELSE : ( 'else' ) ;
    public final void ruleELSE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:942:2: ( ( 'else' ) )
            // InternalGo.g:943:2: ( 'else' )
            {
            // InternalGo.g:943:2: ( 'else' )
            // InternalGo.g:944:3: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getELSEAccess().getElseKeyword()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getELSEAccess().getElseKeyword()); 
            }

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
    // InternalGo.g:954:1: entryRuleFOR : ruleFOR EOF ;
    public final void entryRuleFOR() throws RecognitionException {
        try {
            // InternalGo.g:955:1: ( ruleFOR EOF )
            // InternalGo.g:956:1: ruleFOR EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFORRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFOR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFORRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:963:1: ruleFOR : ( 'for' ) ;
    public final void ruleFOR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:967:2: ( ( 'for' ) )
            // InternalGo.g:968:2: ( 'for' )
            {
            // InternalGo.g:968:2: ( 'for' )
            // InternalGo.g:969:3: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFORAccess().getForKeyword()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFORAccess().getForKeyword()); 
            }

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
    // InternalGo.g:979:1: entryRuleFUNC : ruleFUNC EOF ;
    public final void entryRuleFUNC() throws RecognitionException {
        try {
            // InternalGo.g:980:1: ( ruleFUNC EOF )
            // InternalGo.g:981:1: ruleFUNC EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFUNCRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFUNC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFUNCRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:988:1: ruleFUNC : ( 'func' ) ;
    public final void ruleFUNC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:992:2: ( ( 'func' ) )
            // InternalGo.g:993:2: ( 'func' )
            {
            // InternalGo.g:993:2: ( 'func' )
            // InternalGo.g:994:3: 'func'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFUNCAccess().getFuncKeyword()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFUNCAccess().getFuncKeyword()); 
            }

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
    // InternalGo.g:1004:1: entryRuleIF : ruleIF EOF ;
    public final void entryRuleIF() throws RecognitionException {
        try {
            // InternalGo.g:1005:1: ( ruleIF EOF )
            // InternalGo.g:1006:1: ruleIF EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIFRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIF();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIFRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:1013:1: ruleIF : ( 'if' ) ;
    public final void ruleIF() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1017:2: ( ( 'if' ) )
            // InternalGo.g:1018:2: ( 'if' )
            {
            // InternalGo.g:1018:2: ( 'if' )
            // InternalGo.g:1019:3: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIFAccess().getIfKeyword()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIFAccess().getIfKeyword()); 
            }

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
    // InternalGo.g:1029:1: entryRuleIMPORT : ruleIMPORT EOF ;
    public final void entryRuleIMPORT() throws RecognitionException {
        try {
            // InternalGo.g:1030:1: ( ruleIMPORT EOF )
            // InternalGo.g:1031:1: ruleIMPORT EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIMPORTRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIMPORT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIMPORTRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:1038:1: ruleIMPORT : ( 'import' ) ;
    public final void ruleIMPORT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1042:2: ( ( 'import' ) )
            // InternalGo.g:1043:2: ( 'import' )
            {
            // InternalGo.g:1043:2: ( 'import' )
            // InternalGo.g:1044:3: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIMPORTAccess().getImportKeyword()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIMPORTAccess().getImportKeyword()); 
            }

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
    // InternalGo.g:1054:1: entryRuleRETURN : ruleRETURN EOF ;
    public final void entryRuleRETURN() throws RecognitionException {
        try {
            // InternalGo.g:1055:1: ( ruleRETURN EOF )
            // InternalGo.g:1056:1: ruleRETURN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRETURNRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRETURN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRETURNRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:1063:1: ruleRETURN : ( 'return' ) ;
    public final void ruleRETURN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1067:2: ( ( 'return' ) )
            // InternalGo.g:1068:2: ( 'return' )
            {
            // InternalGo.g:1068:2: ( 'return' )
            // InternalGo.g:1069:3: 'return'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRETURNAccess().getReturnKeyword()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRETURNAccess().getReturnKeyword()); 
            }

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
    // InternalGo.g:1079:1: entryRulePACKAGE : rulePACKAGE EOF ;
    public final void entryRulePACKAGE() throws RecognitionException {
        try {
            // InternalGo.g:1080:1: ( rulePACKAGE EOF )
            // InternalGo.g:1081:1: rulePACKAGE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPACKAGERule()); 
            }
            pushFollow(FOLLOW_1);
            rulePACKAGE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPACKAGERule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:1088:1: rulePACKAGE : ( 'package' ) ;
    public final void rulePACKAGE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1092:2: ( ( 'package' ) )
            // InternalGo.g:1093:2: ( 'package' )
            {
            // InternalGo.g:1093:2: ( 'package' )
            // InternalGo.g:1094:3: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPACKAGEAccess().getPackageKeyword()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPACKAGEAccess().getPackageKeyword()); 
            }

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


    // $ANTLR start "entryRuleTYPE"
    // InternalGo.g:1104:1: entryRuleTYPE : ruleTYPE EOF ;
    public final void entryRuleTYPE() throws RecognitionException {
        try {
            // InternalGo.g:1105:1: ( ruleTYPE EOF )
            // InternalGo.g:1106:1: ruleTYPE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTYPERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTYPE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTYPERule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTYPE"


    // $ANTLR start "ruleTYPE"
    // InternalGo.g:1113:1: ruleTYPE : ( 'type' ) ;
    public final void ruleTYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1117:2: ( ( 'type' ) )
            // InternalGo.g:1118:2: ( 'type' )
            {
            // InternalGo.g:1118:2: ( 'type' )
            // InternalGo.g:1119:3: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTYPEAccess().getTypeKeyword()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTYPEAccess().getTypeKeyword()); 
            }

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
    // $ANTLR end "ruleTYPE"


    // $ANTLR start "entryRuleVAR"
    // InternalGo.g:1129:1: entryRuleVAR : ruleVAR EOF ;
    public final void entryRuleVAR() throws RecognitionException {
        try {
            // InternalGo.g:1130:1: ( ruleVAR EOF )
            // InternalGo.g:1131:1: ruleVAR EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVARRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVAR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVARRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVAR"


    // $ANTLR start "ruleVAR"
    // InternalGo.g:1138:1: ruleVAR : ( 'var' ) ;
    public final void ruleVAR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1142:2: ( ( 'var' ) )
            // InternalGo.g:1143:2: ( 'var' )
            {
            // InternalGo.g:1143:2: ( 'var' )
            // InternalGo.g:1144:3: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVARAccess().getVarKeyword()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVARAccess().getVarKeyword()); 
            }

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
    // $ANTLR end "ruleVAR"


    // $ANTLR start "entryRuleRANGE"
    // InternalGo.g:1154:1: entryRuleRANGE : ruleRANGE EOF ;
    public final void entryRuleRANGE() throws RecognitionException {
        try {
            // InternalGo.g:1155:1: ( ruleRANGE EOF )
            // InternalGo.g:1156:1: ruleRANGE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRANGERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRANGE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRANGERule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:1163:1: ruleRANGE : ( 'range' ) ;
    public final void ruleRANGE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1167:2: ( ( 'range' ) )
            // InternalGo.g:1168:2: ( 'range' )
            {
            // InternalGo.g:1168:2: ( 'range' )
            // InternalGo.g:1169:3: 'range'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRANGEAccess().getRangeKeyword()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRANGEAccess().getRangeKeyword()); 
            }

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


    // $ANTLR start "entryRuleDataType"
    // InternalGo.g:1179:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalGo.g:1180:1: ( ruleDataType EOF )
            // InternalGo.g:1181:1: ruleDataType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalGo.g:1188:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1192:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalGo.g:1193:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalGo.g:1193:2: ( ( rule__DataType__Group__0 ) )
            // InternalGo.g:1194:3: ( rule__DataType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeAccess().getGroup()); 
            }
            // InternalGo.g:1195:3: ( rule__DataType__Group__0 )
            // InternalGo.g:1195:4: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeAccess().getGroup()); 
            }

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
    // InternalGo.g:1203:1: rule__Greeting__Alternatives : ( ( ruleMultDecVars ) | ( ruleDecVar ) | ( ruleDataType ) | ( ruleDecFunc ) | ( RULE_EOL ) | ( ruleCondition ) | ( ruleOperations ) | ( ruleDecImport ) );
    public final void rule__Greeting__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1207:1: ( ( ruleMultDecVars ) | ( ruleDecVar ) | ( ruleDataType ) | ( ruleDecFunc ) | ( RULE_EOL ) | ( ruleCondition ) | ( ruleOperations ) | ( ruleDecImport ) )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalGo.g:1208:2: ( ruleMultDecVars )
                    {
                    // InternalGo.g:1208:2: ( ruleMultDecVars )
                    // InternalGo.g:1209:3: ruleMultDecVars
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGreetingAccess().getMultDecVarsParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMultDecVars();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGreetingAccess().getMultDecVarsParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1214:2: ( ruleDecVar )
                    {
                    // InternalGo.g:1214:2: ( ruleDecVar )
                    // InternalGo.g:1215:3: ruleDecVar
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGreetingAccess().getDecVarParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDecVar();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGreetingAccess().getDecVarParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:1220:2: ( ruleDataType )
                    {
                    // InternalGo.g:1220:2: ( ruleDataType )
                    // InternalGo.g:1221:3: ruleDataType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGreetingAccess().getDataTypeParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGreetingAccess().getDataTypeParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:1226:2: ( ruleDecFunc )
                    {
                    // InternalGo.g:1226:2: ( ruleDecFunc )
                    // InternalGo.g:1227:3: ruleDecFunc
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGreetingAccess().getDecFuncParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDecFunc();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGreetingAccess().getDecFuncParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalGo.g:1232:2: ( RULE_EOL )
                    {
                    // InternalGo.g:1232:2: ( RULE_EOL )
                    // InternalGo.g:1233:3: RULE_EOL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGreetingAccess().getEOLTerminalRuleCall_4()); 
                    }
                    match(input,RULE_EOL,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGreetingAccess().getEOLTerminalRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalGo.g:1238:2: ( ruleCondition )
                    {
                    // InternalGo.g:1238:2: ( ruleCondition )
                    // InternalGo.g:1239:3: ruleCondition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGreetingAccess().getConditionParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCondition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGreetingAccess().getConditionParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalGo.g:1244:2: ( ruleOperations )
                    {
                    // InternalGo.g:1244:2: ( ruleOperations )
                    // InternalGo.g:1245:3: ruleOperations
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGreetingAccess().getOperationsParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleOperations();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGreetingAccess().getOperationsParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalGo.g:1250:2: ( ruleDecImport )
                    {
                    // InternalGo.g:1250:2: ( ruleDecImport )
                    // InternalGo.g:1251:3: ruleDecImport
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGreetingAccess().getDecImportParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDecImport();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGreetingAccess().getDecImportParserRuleCall_7()); 
                    }

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


    // $ANTLR start "rule__DecVar__Alternatives"
    // InternalGo.g:1260:1: rule__DecVar__Alternatives : ( ( ruleDecVars ) | ( ( rule__DecVar__Group_1__0 ) ) );
    public final void rule__DecVar__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1264:1: ( ( ruleDecVars ) | ( ( rule__DecVar__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==29||LA5_0==39) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGo.g:1265:2: ( ruleDecVars )
                    {
                    // InternalGo.g:1265:2: ( ruleDecVars )
                    // InternalGo.g:1266:3: ruleDecVars
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDecVarAccess().getDecVarsParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDecVars();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDecVarAccess().getDecVarsParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1271:2: ( ( rule__DecVar__Group_1__0 ) )
                    {
                    // InternalGo.g:1271:2: ( ( rule__DecVar__Group_1__0 ) )
                    // InternalGo.g:1272:3: ( rule__DecVar__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDecVarAccess().getGroup_1()); 
                    }
                    // InternalGo.g:1273:3: ( rule__DecVar__Group_1__0 )
                    // InternalGo.g:1273:4: rule__DecVar__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DecVar__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDecVarAccess().getGroup_1()); 
                    }

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
    // $ANTLR end "rule__DecVar__Alternatives"


    // $ANTLR start "rule__DecVar__AtrbAlternatives_1_4_1_0"
    // InternalGo.g:1281:1: rule__DecVar__AtrbAlternatives_1_4_1_0 : ( ( ruleAtri ) | ( RULE_ID ) );
    public final void rule__DecVar__AtrbAlternatives_1_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1285:1: ( ( ruleAtri ) | ( RULE_ID ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_INT)||LA6_0==RULE_OPEN_BRACKETS||(LA6_0>=53 && LA6_0<=54)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGo.g:1286:2: ( ruleAtri )
                    {
                    // InternalGo.g:1286:2: ( ruleAtri )
                    // InternalGo.g:1287:3: ruleAtri
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDecVarAccess().getAtrbAtriParserRuleCall_1_4_1_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAtri();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDecVarAccess().getAtrbAtriParserRuleCall_1_4_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1292:2: ( RULE_ID )
                    {
                    // InternalGo.g:1292:2: ( RULE_ID )
                    // InternalGo.g:1293:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDecVarAccess().getAtrbIDTerminalRuleCall_1_4_1_0_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDecVarAccess().getAtrbIDTerminalRuleCall_1_4_1_0_1()); 
                    }

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
    // $ANTLR end "rule__DecVar__AtrbAlternatives_1_4_1_0"


    // $ANTLR start "rule__DecVar__AtrbAlternatives_1_4_2_1_0"
    // InternalGo.g:1302:1: rule__DecVar__AtrbAlternatives_1_4_2_1_0 : ( ( ruleAtri ) | ( RULE_ID ) );
    public final void rule__DecVar__AtrbAlternatives_1_4_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1306:1: ( ( ruleAtri ) | ( RULE_ID ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_INT)||LA7_0==RULE_OPEN_BRACKETS||(LA7_0>=53 && LA7_0<=54)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGo.g:1307:2: ( ruleAtri )
                    {
                    // InternalGo.g:1307:2: ( ruleAtri )
                    // InternalGo.g:1308:3: ruleAtri
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDecVarAccess().getAtrbAtriParserRuleCall_1_4_2_1_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAtri();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDecVarAccess().getAtrbAtriParserRuleCall_1_4_2_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1313:2: ( RULE_ID )
                    {
                    // InternalGo.g:1313:2: ( RULE_ID )
                    // InternalGo.g:1314:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDecVarAccess().getAtrbIDTerminalRuleCall_1_4_2_1_0_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDecVarAccess().getAtrbIDTerminalRuleCall_1_4_2_1_0_1()); 
                    }

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
    // $ANTLR end "rule__DecVar__AtrbAlternatives_1_4_2_1_0"


    // $ANTLR start "rule__MultDecVars__Alternatives_2_2"
    // InternalGo.g:1323:1: rule__MultDecVars__Alternatives_2_2 : ( ( ruleTypeValue ) | ( ( rule__MultDecVars__ValueAssignment_2_2_1 ) ) );
    public final void rule__MultDecVars__Alternatives_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1327:1: ( ( ruleTypeValue ) | ( ( rule__MultDecVars__ValueAssignment_2_2_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_INT)||(LA8_0>=53 && LA8_0<=54)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGo.g:1328:2: ( ruleTypeValue )
                    {
                    // InternalGo.g:1328:2: ( ruleTypeValue )
                    // InternalGo.g:1329:3: ruleTypeValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultDecVarsAccess().getTypeValueParserRuleCall_2_2_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTypeValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultDecVarsAccess().getTypeValueParserRuleCall_2_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1334:2: ( ( rule__MultDecVars__ValueAssignment_2_2_1 ) )
                    {
                    // InternalGo.g:1334:2: ( ( rule__MultDecVars__ValueAssignment_2_2_1 ) )
                    // InternalGo.g:1335:3: ( rule__MultDecVars__ValueAssignment_2_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultDecVarsAccess().getValueAssignment_2_2_1()); 
                    }
                    // InternalGo.g:1336:3: ( rule__MultDecVars__ValueAssignment_2_2_1 )
                    // InternalGo.g:1336:4: rule__MultDecVars__ValueAssignment_2_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultDecVars__ValueAssignment_2_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultDecVarsAccess().getValueAssignment_2_2_1()); 
                    }

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
    // $ANTLR end "rule__MultDecVars__Alternatives_2_2"


    // $ANTLR start "rule__DecVars__AtrbAlternatives_3_0"
    // InternalGo.g:1344:1: rule__DecVars__AtrbAlternatives_3_0 : ( ( ruleAtri ) | ( RULE_ID ) );
    public final void rule__DecVars__AtrbAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1348:1: ( ( ruleAtri ) | ( RULE_ID ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_INT)||LA9_0==RULE_OPEN_BRACKETS||(LA9_0>=53 && LA9_0<=54)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGo.g:1349:2: ( ruleAtri )
                    {
                    // InternalGo.g:1349:2: ( ruleAtri )
                    // InternalGo.g:1350:3: ruleAtri
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDecVarsAccess().getAtrbAtriParserRuleCall_3_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAtri();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDecVarsAccess().getAtrbAtriParserRuleCall_3_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1355:2: ( RULE_ID )
                    {
                    // InternalGo.g:1355:2: ( RULE_ID )
                    // InternalGo.g:1356:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDecVarsAccess().getAtrbIDTerminalRuleCall_3_0_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDecVarsAccess().getAtrbIDTerminalRuleCall_3_0_1()); 
                    }

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
    // $ANTLR end "rule__DecVars__AtrbAlternatives_3_0"


    // $ANTLR start "rule__DecVars__AtrbAlternatives_4_1_0"
    // InternalGo.g:1365:1: rule__DecVars__AtrbAlternatives_4_1_0 : ( ( ruleAtri ) | ( RULE_ID ) );
    public final void rule__DecVars__AtrbAlternatives_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1369:1: ( ( ruleAtri ) | ( RULE_ID ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_INT)||LA10_0==RULE_OPEN_BRACKETS||(LA10_0>=53 && LA10_0<=54)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGo.g:1370:2: ( ruleAtri )
                    {
                    // InternalGo.g:1370:2: ( ruleAtri )
                    // InternalGo.g:1371:3: ruleAtri
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDecVarsAccess().getAtrbAtriParserRuleCall_4_1_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAtri();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDecVarsAccess().getAtrbAtriParserRuleCall_4_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1376:2: ( RULE_ID )
                    {
                    // InternalGo.g:1376:2: ( RULE_ID )
                    // InternalGo.g:1377:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDecVarsAccess().getAtrbIDTerminalRuleCall_4_1_0_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDecVarsAccess().getAtrbIDTerminalRuleCall_4_1_0_1()); 
                    }

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
    // $ANTLR end "rule__DecVars__AtrbAlternatives_4_1_0"


    // $ANTLR start "rule__Atri__Alternatives"
    // InternalGo.g:1386:1: rule__Atri__Alternatives : ( ( ( rule__Atri__Group_0__0 ) ) | ( ruleTypeValue ) );
    public final void rule__Atri__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1390:1: ( ( ( rule__Atri__Group_0__0 ) ) | ( ruleTypeValue ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_OPEN_BRACKETS) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_INT)||(LA11_0>=53 && LA11_0<=54)) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalGo.g:1391:2: ( ( rule__Atri__Group_0__0 ) )
                    {
                    // InternalGo.g:1391:2: ( ( rule__Atri__Group_0__0 ) )
                    // InternalGo.g:1392:3: ( rule__Atri__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtriAccess().getGroup_0()); 
                    }
                    // InternalGo.g:1393:3: ( rule__Atri__Group_0__0 )
                    // InternalGo.g:1393:4: rule__Atri__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atri__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtriAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1397:2: ( ruleTypeValue )
                    {
                    // InternalGo.g:1397:2: ( ruleTypeValue )
                    // InternalGo.g:1398:3: ruleTypeValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtriAccess().getTypeValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTypeValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtriAccess().getTypeValueParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Atri__Alternatives"


    // $ANTLR start "rule__TypeValue__Alternatives"
    // InternalGo.g:1407:1: rule__TypeValue__Alternatives : ( ( RULE_STRING ) | ( ruleNumbers ) | ( ruleBoolean ) );
    public final void rule__TypeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1411:1: ( ( RULE_STRING ) | ( ruleNumbers ) | ( ruleBoolean ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt12=1;
                }
                break;
            case RULE_INT:
                {
                alt12=2;
                }
                break;
            case 53:
            case 54:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalGo.g:1412:2: ( RULE_STRING )
                    {
                    // InternalGo.g:1412:2: ( RULE_STRING )
                    // InternalGo.g:1413:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeValueAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeValueAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1418:2: ( ruleNumbers )
                    {
                    // InternalGo.g:1418:2: ( ruleNumbers )
                    // InternalGo.g:1419:3: ruleNumbers
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeValueAccess().getNumbersParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNumbers();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeValueAccess().getNumbersParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:1424:2: ( ruleBoolean )
                    {
                    // InternalGo.g:1424:2: ( ruleBoolean )
                    // InternalGo.g:1425:3: ruleBoolean
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeValueAccess().getBooleanParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBoolean();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeValueAccess().getBooleanParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__TypeValue__Alternatives"


    // $ANTLR start "rule__DecImport__Alternatives_1"
    // InternalGo.g:1434:1: rule__DecImport__Alternatives_1 : ( ( RULE_STRING ) | ( ( rule__DecImport__Group_1_1__0 ) ) );
    public final void rule__DecImport__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1438:1: ( ( RULE_STRING ) | ( ( rule__DecImport__Group_1_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_OPEN_PARENTHESES) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalGo.g:1439:2: ( RULE_STRING )
                    {
                    // InternalGo.g:1439:2: ( RULE_STRING )
                    // InternalGo.g:1440:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDecImportAccess().getSTRINGTerminalRuleCall_1_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDecImportAccess().getSTRINGTerminalRuleCall_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1445:2: ( ( rule__DecImport__Group_1_1__0 ) )
                    {
                    // InternalGo.g:1445:2: ( ( rule__DecImport__Group_1_1__0 ) )
                    // InternalGo.g:1446:3: ( rule__DecImport__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDecImportAccess().getGroup_1_1()); 
                    }
                    // InternalGo.g:1447:3: ( rule__DecImport__Group_1_1__0 )
                    // InternalGo.g:1447:4: rule__DecImport__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DecImport__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDecImportAccess().getGroup_1_1()); 
                    }

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
    // $ANTLR end "rule__DecImport__Alternatives_1"


    // $ANTLR start "rule__I__Alternatives"
    // InternalGo.g:1455:1: rule__I__Alternatives : ( ( ( rule__I__Group_0__0 ) ) | ( ( rule__I__Group_1__0 ) ) );
    public final void rule__I__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1459:1: ( ( ( rule__I__Group_0__0 ) ) | ( ( rule__I__Group_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_PLUS) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_MINUS) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalGo.g:1460:2: ( ( rule__I__Group_0__0 ) )
                    {
                    // InternalGo.g:1460:2: ( ( rule__I__Group_0__0 ) )
                    // InternalGo.g:1461:3: ( rule__I__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIAccess().getGroup_0()); 
                    }
                    // InternalGo.g:1462:3: ( rule__I__Group_0__0 )
                    // InternalGo.g:1462:4: rule__I__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__I__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1466:2: ( ( rule__I__Group_1__0 ) )
                    {
                    // InternalGo.g:1466:2: ( ( rule__I__Group_1__0 ) )
                    // InternalGo.g:1467:3: ( rule__I__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIAccess().getGroup_1()); 
                    }
                    // InternalGo.g:1468:3: ( rule__I__Group_1__0 )
                    // InternalGo.g:1468:4: rule__I__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__I__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIAccess().getGroup_1()); 
                    }

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
    // $ANTLR end "rule__I__Alternatives"


    // $ANTLR start "rule__Y__Alternatives"
    // InternalGo.g:1476:1: rule__Y__Alternatives : ( ( ( rule__Y__Group_0__0 ) ) | ( ( rule__Y__Group_1__0 ) ) );
    public final void rule__Y__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1480:1: ( ( ( rule__Y__Group_0__0 ) ) | ( ( rule__Y__Group_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ASTERICS) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_BAR) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalGo.g:1481:2: ( ( rule__Y__Group_0__0 ) )
                    {
                    // InternalGo.g:1481:2: ( ( rule__Y__Group_0__0 ) )
                    // InternalGo.g:1482:3: ( rule__Y__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAccess().getGroup_0()); 
                    }
                    // InternalGo.g:1483:3: ( rule__Y__Group_0__0 )
                    // InternalGo.g:1483:4: rule__Y__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Y__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getYAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1487:2: ( ( rule__Y__Group_1__0 ) )
                    {
                    // InternalGo.g:1487:2: ( ( rule__Y__Group_1__0 ) )
                    // InternalGo.g:1488:3: ( rule__Y__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAccess().getGroup_1()); 
                    }
                    // InternalGo.g:1489:3: ( rule__Y__Group_1__0 )
                    // InternalGo.g:1489:4: rule__Y__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Y__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getYAccess().getGroup_1()); 
                    }

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
    // $ANTLR end "rule__Y__Alternatives"


    // $ANTLR start "rule__F__Alternatives"
    // InternalGo.g:1497:1: rule__F__Alternatives : ( ( ( rule__F__Group_0__0 ) ) | ( ruleNumbers ) );
    public final void rule__F__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1501:1: ( ( ( rule__F__Group_0__0 ) ) | ( ruleNumbers ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_OPEN_PARENTHESES) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_INT) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalGo.g:1502:2: ( ( rule__F__Group_0__0 ) )
                    {
                    // InternalGo.g:1502:2: ( ( rule__F__Group_0__0 ) )
                    // InternalGo.g:1503:3: ( rule__F__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFAccess().getGroup_0()); 
                    }
                    // InternalGo.g:1504:3: ( rule__F__Group_0__0 )
                    // InternalGo.g:1504:4: rule__F__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__F__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1508:2: ( ruleNumbers )
                    {
                    // InternalGo.g:1508:2: ( ruleNumbers )
                    // InternalGo.g:1509:3: ruleNumbers
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFAccess().getNumbersParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNumbers();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFAccess().getNumbersParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__F__Alternatives"


    // $ANTLR start "rule__Numbers__Alternatives"
    // InternalGo.g:1518:1: rule__Numbers__Alternatives : ( ( RULE_INT ) | ( ruleDouble ) );
    public final void rule__Numbers__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1522:1: ( ( RULE_INT ) | ( ruleDouble ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==RULE_DOT) ) {
                    alt17=2;
                }
                else if ( (LA17_1==EOF||(LA17_1>=RULE_EOL && LA17_1<=RULE_ID)||(LA17_1>=RULE_INT && LA17_1<=RULE_CLOSED_PARENTHESES)||(LA17_1>=RULE_OPEN_KEY && LA17_1<=RULE_BAR)||LA17_1==29||(LA17_1>=33 && LA17_1<=35)||LA17_1==39||(LA17_1>=41 && LA17_1<=45)||(LA17_1>=57 && LA17_1<=59)) ) {
                    alt17=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalGo.g:1523:2: ( RULE_INT )
                    {
                    // InternalGo.g:1523:2: ( RULE_INT )
                    // InternalGo.g:1524:3: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumbersAccess().getINTTerminalRuleCall_0()); 
                    }
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNumbersAccess().getINTTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1529:2: ( ruleDouble )
                    {
                    // InternalGo.g:1529:2: ( ruleDouble )
                    // InternalGo.g:1530:3: ruleDouble
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumbersAccess().getDoubleParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDouble();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNumbersAccess().getDoubleParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Numbers__Alternatives"


    // $ANTLR start "rule__ComparisonExpression__OperatorAlternatives_1_1_0"
    // InternalGo.g:1539:1: rule__ComparisonExpression__OperatorAlternatives_1_1_0 : ( ( '<' ) | ( '<=' ) | ( '==' ) | ( '>=' ) | ( '>' ) );
    public final void rule__ComparisonExpression__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1543:1: ( ( '<' ) | ( '<=' ) | ( '==' ) | ( '>=' ) | ( '>' ) )
            int alt18=5;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt18=1;
                }
                break;
            case 42:
                {
                alt18=2;
                }
                break;
            case 43:
                {
                alt18=3;
                }
                break;
            case 44:
                {
                alt18=4;
                }
                break;
            case 45:
                {
                alt18=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalGo.g:1544:2: ( '<' )
                    {
                    // InternalGo.g:1544:2: ( '<' )
                    // InternalGo.g:1545:3: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSignKeyword_1_1_0_0()); 
                    }
                    match(input,41,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSignKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1550:2: ( '<=' )
                    {
                    // InternalGo.g:1550:2: ( '<=' )
                    // InternalGo.g:1551:3: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    }
                    match(input,42,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:1556:2: ( '==' )
                    {
                    // InternalGo.g:1556:2: ( '==' )
                    // InternalGo.g:1557:3: '=='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonExpressionAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_2()); 
                    }
                    match(input,43,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonExpressionAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:1562:2: ( '>=' )
                    {
                    // InternalGo.g:1562:2: ( '>=' )
                    // InternalGo.g:1563:3: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonExpressionAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_3()); 
                    }
                    match(input,44,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonExpressionAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalGo.g:1568:2: ( '>' )
                    {
                    // InternalGo.g:1568:2: ( '>' )
                    // InternalGo.g:1569:3: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonExpressionAccess().getOperatorGreaterThanSignKeyword_1_1_0_4()); 
                    }
                    match(input,45,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonExpressionAccess().getOperatorGreaterThanSignKeyword_1_1_0_4()); 
                    }

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
    // $ANTLR end "rule__ComparisonExpression__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // InternalGo.g:1578:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ruleLiteral ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1582:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ruleLiteral ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_OPEN_PARENTHESES) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_INT||(LA19_0>=53 && LA19_0<=54)) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalGo.g:1583:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // InternalGo.g:1583:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // InternalGo.g:1584:3: ( rule__PrimaryExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    }
                    // InternalGo.g:1585:3: ( rule__PrimaryExpression__Group_0__0 )
                    // InternalGo.g:1585:4: rule__PrimaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1589:2: ( ruleLiteral )
                    {
                    // InternalGo.g:1589:2: ( ruleLiteral )
                    // InternalGo.g:1590:3: ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalGo.g:1599:1: rule__Literal__Alternatives : ( ( ( rule__Literal__Group_0__0 ) ) | ( ruleNumbers ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1603:1: ( ( ( rule__Literal__Group_0__0 ) ) | ( ruleNumbers ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=53 && LA20_0<=54)) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_INT) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalGo.g:1604:2: ( ( rule__Literal__Group_0__0 ) )
                    {
                    // InternalGo.g:1604:2: ( ( rule__Literal__Group_0__0 ) )
                    // InternalGo.g:1605:3: ( rule__Literal__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getGroup_0()); 
                    }
                    // InternalGo.g:1606:3: ( rule__Literal__Group_0__0 )
                    // InternalGo.g:1606:4: rule__Literal__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1610:2: ( ruleNumbers )
                    {
                    // InternalGo.g:1610:2: ( ruleNumbers )
                    // InternalGo.g:1611:3: ruleNumbers
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getNumbersParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNumbers();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getNumbersParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__Types__Alternatives"
    // InternalGo.g:1620:1: rule__Types__Alternatives : ( ( ruleTYPE ) | ( 'string' ) | ( 'int' ) | ( 'bool' ) | ( 'byte' ) | ( 'rune' ) | ( 'float32' ) | ( 'float64' ) );
    public final void rule__Types__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1624:1: ( ( ruleTYPE ) | ( 'string' ) | ( 'int' ) | ( 'bool' ) | ( 'byte' ) | ( 'rune' ) | ( 'float32' ) | ( 'float64' ) )
            int alt21=8;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt21=1;
                }
                break;
            case 46:
                {
                alt21=2;
                }
                break;
            case 47:
                {
                alt21=3;
                }
                break;
            case 48:
                {
                alt21=4;
                }
                break;
            case 49:
                {
                alt21=5;
                }
                break;
            case 50:
                {
                alt21=6;
                }
                break;
            case 51:
                {
                alt21=7;
                }
                break;
            case 52:
                {
                alt21=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalGo.g:1625:2: ( ruleTYPE )
                    {
                    // InternalGo.g:1625:2: ( ruleTYPE )
                    // InternalGo.g:1626:3: ruleTYPE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypesAccess().getTYPEParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTYPE();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypesAccess().getTYPEParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1631:2: ( 'string' )
                    {
                    // InternalGo.g:1631:2: ( 'string' )
                    // InternalGo.g:1632:3: 'string'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypesAccess().getStringKeyword_1()); 
                    }
                    match(input,46,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypesAccess().getStringKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:1637:2: ( 'int' )
                    {
                    // InternalGo.g:1637:2: ( 'int' )
                    // InternalGo.g:1638:3: 'int'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypesAccess().getIntKeyword_2()); 
                    }
                    match(input,47,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypesAccess().getIntKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:1643:2: ( 'bool' )
                    {
                    // InternalGo.g:1643:2: ( 'bool' )
                    // InternalGo.g:1644:3: 'bool'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypesAccess().getBoolKeyword_3()); 
                    }
                    match(input,48,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypesAccess().getBoolKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalGo.g:1649:2: ( 'byte' )
                    {
                    // InternalGo.g:1649:2: ( 'byte' )
                    // InternalGo.g:1650:3: 'byte'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypesAccess().getByteKeyword_4()); 
                    }
                    match(input,49,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypesAccess().getByteKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalGo.g:1655:2: ( 'rune' )
                    {
                    // InternalGo.g:1655:2: ( 'rune' )
                    // InternalGo.g:1656:3: 'rune'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypesAccess().getRuneKeyword_5()); 
                    }
                    match(input,50,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypesAccess().getRuneKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalGo.g:1661:2: ( 'float32' )
                    {
                    // InternalGo.g:1661:2: ( 'float32' )
                    // InternalGo.g:1662:3: 'float32'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypesAccess().getFloat32Keyword_6()); 
                    }
                    match(input,51,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypesAccess().getFloat32Keyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalGo.g:1667:2: ( 'float64' )
                    {
                    // InternalGo.g:1667:2: ( 'float64' )
                    // InternalGo.g:1668:3: 'float64'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypesAccess().getFloat64Keyword_7()); 
                    }
                    match(input,52,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypesAccess().getFloat64Keyword_7()); 
                    }

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
    // $ANTLR end "rule__Types__Alternatives"


    // $ANTLR start "rule__Modif__Alternatives"
    // InternalGo.g:1677:1: rule__Modif__Alternatives : ( ( ruleVAR ) | ( ruleCONST ) );
    public final void rule__Modif__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1681:1: ( ( ruleVAR ) | ( ruleCONST ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            else if ( (LA22_0==29) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalGo.g:1682:2: ( ruleVAR )
                    {
                    // InternalGo.g:1682:2: ( ruleVAR )
                    // InternalGo.g:1683:3: ruleVAR
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModifAccess().getVARParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVAR();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModifAccess().getVARParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1688:2: ( ruleCONST )
                    {
                    // InternalGo.g:1688:2: ( ruleCONST )
                    // InternalGo.g:1689:3: ruleCONST
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModifAccess().getCONSTParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCONST();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModifAccess().getCONSTParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Modif__Alternatives"


    // $ANTLR start "rule__Boolean__Alternatives"
    // InternalGo.g:1698:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1702:1: ( ( 'true' ) | ( 'false' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==53) ) {
                alt23=1;
            }
            else if ( (LA23_0==54) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalGo.g:1703:2: ( 'true' )
                    {
                    // InternalGo.g:1703:2: ( 'true' )
                    // InternalGo.g:1704:3: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    }
                    match(input,53,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1709:2: ( 'false' )
                    {
                    // InternalGo.g:1709:2: ( 'false' )
                    // InternalGo.g:1710:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    }
                    match(input,54,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    }

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
    // $ANTLR end "rule__Boolean__Alternatives"


    // $ANTLR start "rule__DecVar__Group_1__0"
    // InternalGo.g:1719:1: rule__DecVar__Group_1__0 : rule__DecVar__Group_1__0__Impl rule__DecVar__Group_1__1 ;
    public final void rule__DecVar__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1723:1: ( rule__DecVar__Group_1__0__Impl rule__DecVar__Group_1__1 )
            // InternalGo.g:1724:2: rule__DecVar__Group_1__0__Impl rule__DecVar__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__DecVar__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecVar__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DecVar__Group_1__0"


    // $ANTLR start "rule__DecVar__Group_1__0__Impl"
    // InternalGo.g:1731:1: rule__DecVar__Group_1__0__Impl : ( ruleModif ) ;
    public final void rule__DecVar__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1735:1: ( ( ruleModif ) )
            // InternalGo.g:1736:1: ( ruleModif )
            {
            // InternalGo.g:1736:1: ( ruleModif )
            // InternalGo.g:1737:2: ruleModif
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getModifParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleModif();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getModifParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__DecVar__Group_1__0__Impl"


    // $ANTLR start "rule__DecVar__Group_1__1"
    // InternalGo.g:1746:1: rule__DecVar__Group_1__1 : rule__DecVar__Group_1__1__Impl rule__DecVar__Group_1__2 ;
    public final void rule__DecVar__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1750:1: ( rule__DecVar__Group_1__1__Impl rule__DecVar__Group_1__2 )
            // InternalGo.g:1751:2: rule__DecVar__Group_1__1__Impl rule__DecVar__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__DecVar__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecVar__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DecVar__Group_1__1"


    // $ANTLR start "rule__DecVar__Group_1__1__Impl"
    // InternalGo.g:1758:1: rule__DecVar__Group_1__1__Impl : ( ( rule__DecVar__VarsAssignment_1_1 ) ) ;
    public final void rule__DecVar__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1762:1: ( ( ( rule__DecVar__VarsAssignment_1_1 ) ) )
            // InternalGo.g:1763:1: ( ( rule__DecVar__VarsAssignment_1_1 ) )
            {
            // InternalGo.g:1763:1: ( ( rule__DecVar__VarsAssignment_1_1 ) )
            // InternalGo.g:1764:2: ( rule__DecVar__VarsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getVarsAssignment_1_1()); 
            }
            // InternalGo.g:1765:2: ( rule__DecVar__VarsAssignment_1_1 )
            // InternalGo.g:1765:3: rule__DecVar__VarsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DecVar__VarsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getVarsAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__DecVar__Group_1__1__Impl"


    // $ANTLR start "rule__DecVar__Group_1__2"
    // InternalGo.g:1773:1: rule__DecVar__Group_1__2 : rule__DecVar__Group_1__2__Impl rule__DecVar__Group_1__3 ;
    public final void rule__DecVar__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1777:1: ( rule__DecVar__Group_1__2__Impl rule__DecVar__Group_1__3 )
            // InternalGo.g:1778:2: rule__DecVar__Group_1__2__Impl rule__DecVar__Group_1__3
            {
            pushFollow(FOLLOW_5);
            rule__DecVar__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecVar__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DecVar__Group_1__2"


    // $ANTLR start "rule__DecVar__Group_1__2__Impl"
    // InternalGo.g:1785:1: rule__DecVar__Group_1__2__Impl : ( ( rule__DecVar__Group_1_2__0 )* ) ;
    public final void rule__DecVar__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1789:1: ( ( ( rule__DecVar__Group_1_2__0 )* ) )
            // InternalGo.g:1790:1: ( ( rule__DecVar__Group_1_2__0 )* )
            {
            // InternalGo.g:1790:1: ( ( rule__DecVar__Group_1_2__0 )* )
            // InternalGo.g:1791:2: ( rule__DecVar__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getGroup_1_2()); 
            }
            // InternalGo.g:1792:2: ( rule__DecVar__Group_1_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_COMMA) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGo.g:1792:3: rule__DecVar__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DecVar__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getGroup_1_2()); 
            }

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
    // $ANTLR end "rule__DecVar__Group_1__2__Impl"


    // $ANTLR start "rule__DecVar__Group_1__3"
    // InternalGo.g:1800:1: rule__DecVar__Group_1__3 : rule__DecVar__Group_1__3__Impl rule__DecVar__Group_1__4 ;
    public final void rule__DecVar__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1804:1: ( rule__DecVar__Group_1__3__Impl rule__DecVar__Group_1__4 )
            // InternalGo.g:1805:2: rule__DecVar__Group_1__3__Impl rule__DecVar__Group_1__4
            {
            pushFollow(FOLLOW_7);
            rule__DecVar__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecVar__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DecVar__Group_1__3"


    // $ANTLR start "rule__DecVar__Group_1__3__Impl"
    // InternalGo.g:1812:1: rule__DecVar__Group_1__3__Impl : ( ruleTypes ) ;
    public final void rule__DecVar__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1816:1: ( ( ruleTypes ) )
            // InternalGo.g:1817:1: ( ruleTypes )
            {
            // InternalGo.g:1817:1: ( ruleTypes )
            // InternalGo.g:1818:2: ruleTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getTypesParserRuleCall_1_3()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getTypesParserRuleCall_1_3()); 
            }

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
    // $ANTLR end "rule__DecVar__Group_1__3__Impl"


    // $ANTLR start "rule__DecVar__Group_1__4"
    // InternalGo.g:1827:1: rule__DecVar__Group_1__4 : rule__DecVar__Group_1__4__Impl ;
    public final void rule__DecVar__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1831:1: ( rule__DecVar__Group_1__4__Impl )
            // InternalGo.g:1832:2: rule__DecVar__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecVar__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DecVar__Group_1__4"


    // $ANTLR start "rule__DecVar__Group_1__4__Impl"
    // InternalGo.g:1838:1: rule__DecVar__Group_1__4__Impl : ( ( rule__DecVar__Group_1_4__0 )? ) ;
    public final void rule__DecVar__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1842:1: ( ( ( rule__DecVar__Group_1_4__0 )? ) )
            // InternalGo.g:1843:1: ( ( rule__DecVar__Group_1_4__0 )? )
            {
            // InternalGo.g:1843:1: ( ( rule__DecVar__Group_1_4__0 )? )
            // InternalGo.g:1844:2: ( rule__DecVar__Group_1_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getGroup_1_4()); 
            }
            // InternalGo.g:1845:2: ( rule__DecVar__Group_1_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==55) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGo.g:1845:3: rule__DecVar__Group_1_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DecVar__Group_1_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getGroup_1_4()); 
            }

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
    // $ANTLR end "rule__DecVar__Group_1__4__Impl"


    // $ANTLR start "rule__DecVar__Group_1_2__0"
    // InternalGo.g:1854:1: rule__DecVar__Group_1_2__0 : rule__DecVar__Group_1_2__0__Impl rule__DecVar__Group_1_2__1 ;
    public final void rule__DecVar__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1858:1: ( rule__DecVar__Group_1_2__0__Impl rule__DecVar__Group_1_2__1 )
            // InternalGo.g:1859:2: rule__DecVar__Group_1_2__0__Impl rule__DecVar__Group_1_2__1
            {
            pushFollow(FOLLOW_4);
            rule__DecVar__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecVar__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DecVar__Group_1_2__0"


    // $ANTLR start "rule__DecVar__Group_1_2__0__Impl"
    // InternalGo.g:1866:1: rule__DecVar__Group_1_2__0__Impl : ( RULE_COMMA ) ;
    public final void rule__DecVar__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1870:1: ( ( RULE_COMMA ) )
            // InternalGo.g:1871:1: ( RULE_COMMA )
            {
            // InternalGo.g:1871:1: ( RULE_COMMA )
            // InternalGo.g:1872:2: RULE_COMMA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getCommaTerminalRuleCall_1_2_0()); 
            }
            match(input,RULE_COMMA,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getCommaTerminalRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__DecVar__Group_1_2__0__Impl"


    // $ANTLR start "rule__DecVar__Group_1_2__1"
    // InternalGo.g:1881:1: rule__DecVar__Group_1_2__1 : rule__DecVar__Group_1_2__1__Impl ;
    public final void rule__DecVar__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1885:1: ( rule__DecVar__Group_1_2__1__Impl )
            // InternalGo.g:1886:2: rule__DecVar__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecVar__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DecVar__Group_1_2__1"


    // $ANTLR start "rule__DecVar__Group_1_2__1__Impl"
    // InternalGo.g:1892:1: rule__DecVar__Group_1_2__1__Impl : ( ( rule__DecVar__VarsAssignment_1_2_1 ) ) ;
    public final void rule__DecVar__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1896:1: ( ( ( rule__DecVar__VarsAssignment_1_2_1 ) ) )
            // InternalGo.g:1897:1: ( ( rule__DecVar__VarsAssignment_1_2_1 ) )
            {
            // InternalGo.g:1897:1: ( ( rule__DecVar__VarsAssignment_1_2_1 ) )
            // InternalGo.g:1898:2: ( rule__DecVar__VarsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getVarsAssignment_1_2_1()); 
            }
            // InternalGo.g:1899:2: ( rule__DecVar__VarsAssignment_1_2_1 )
            // InternalGo.g:1899:3: rule__DecVar__VarsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DecVar__VarsAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getVarsAssignment_1_2_1()); 
            }

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
    // $ANTLR end "rule__DecVar__Group_1_2__1__Impl"


    // $ANTLR start "rule__DecVar__Group_1_4__0"
    // InternalGo.g:1908:1: rule__DecVar__Group_1_4__0 : rule__DecVar__Group_1_4__0__Impl rule__DecVar__Group_1_4__1 ;
    public final void rule__DecVar__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1912:1: ( rule__DecVar__Group_1_4__0__Impl rule__DecVar__Group_1_4__1 )
            // InternalGo.g:1913:2: rule__DecVar__Group_1_4__0__Impl rule__DecVar__Group_1_4__1
            {
            pushFollow(FOLLOW_8);
            rule__DecVar__Group_1_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecVar__Group_1_4__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DecVar__Group_1_4__0"


    // $ANTLR start "rule__DecVar__Group_1_4__0__Impl"
    // InternalGo.g:1920:1: rule__DecVar__Group_1_4__0__Impl : ( '=' ) ;
    public final void rule__DecVar__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1924:1: ( ( '=' ) )
            // InternalGo.g:1925:1: ( '=' )
            {
            // InternalGo.g:1925:1: ( '=' )
            // InternalGo.g:1926:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getEqualsSignKeyword_1_4_0()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getEqualsSignKeyword_1_4_0()); 
            }

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
    // $ANTLR end "rule__DecVar__Group_1_4__0__Impl"


    // $ANTLR start "rule__DecVar__Group_1_4__1"
    // InternalGo.g:1935:1: rule__DecVar__Group_1_4__1 : rule__DecVar__Group_1_4__1__Impl rule__DecVar__Group_1_4__2 ;
    public final void rule__DecVar__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1939:1: ( rule__DecVar__Group_1_4__1__Impl rule__DecVar__Group_1_4__2 )
            // InternalGo.g:1940:2: rule__DecVar__Group_1_4__1__Impl rule__DecVar__Group_1_4__2
            {
            pushFollow(FOLLOW_9);
            rule__DecVar__Group_1_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecVar__Group_1_4__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DecVar__Group_1_4__1"


    // $ANTLR start "rule__DecVar__Group_1_4__1__Impl"
    // InternalGo.g:1947:1: rule__DecVar__Group_1_4__1__Impl : ( ( rule__DecVar__AtrbAssignment_1_4_1 ) ) ;
    public final void rule__DecVar__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1951:1: ( ( ( rule__DecVar__AtrbAssignment_1_4_1 ) ) )
            // InternalGo.g:1952:1: ( ( rule__DecVar__AtrbAssignment_1_4_1 ) )
            {
            // InternalGo.g:1952:1: ( ( rule__DecVar__AtrbAssignment_1_4_1 ) )
            // InternalGo.g:1953:2: ( rule__DecVar__AtrbAssignment_1_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getAtrbAssignment_1_4_1()); 
            }
            // InternalGo.g:1954:2: ( rule__DecVar__AtrbAssignment_1_4_1 )
            // InternalGo.g:1954:3: rule__DecVar__AtrbAssignment_1_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DecVar__AtrbAssignment_1_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getAtrbAssignment_1_4_1()); 
            }

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
    // $ANTLR end "rule__DecVar__Group_1_4__1__Impl"


    // $ANTLR start "rule__DecVar__Group_1_4__2"
    // InternalGo.g:1962:1: rule__DecVar__Group_1_4__2 : rule__DecVar__Group_1_4__2__Impl ;
    public final void rule__DecVar__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1966:1: ( rule__DecVar__Group_1_4__2__Impl )
            // InternalGo.g:1967:2: rule__DecVar__Group_1_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecVar__Group_1_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DecVar__Group_1_4__2"


    // $ANTLR start "rule__DecVar__Group_1_4__2__Impl"
    // InternalGo.g:1973:1: rule__DecVar__Group_1_4__2__Impl : ( ( rule__DecVar__Group_1_4_2__0 )* ) ;
    public final void rule__DecVar__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1977:1: ( ( ( rule__DecVar__Group_1_4_2__0 )* ) )
            // InternalGo.g:1978:1: ( ( rule__DecVar__Group_1_4_2__0 )* )
            {
            // InternalGo.g:1978:1: ( ( rule__DecVar__Group_1_4_2__0 )* )
            // InternalGo.g:1979:2: ( rule__DecVar__Group_1_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getGroup_1_4_2()); 
            }
            // InternalGo.g:1980:2: ( rule__DecVar__Group_1_4_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_COMMA) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGo.g:1980:3: rule__DecVar__Group_1_4_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DecVar__Group_1_4_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getGroup_1_4_2()); 
            }

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
    // $ANTLR end "rule__DecVar__Group_1_4__2__Impl"


    // $ANTLR start "rule__DecVar__Group_1_4_2__0"
    // InternalGo.g:1989:1: rule__DecVar__Group_1_4_2__0 : rule__DecVar__Group_1_4_2__0__Impl rule__DecVar__Group_1_4_2__1 ;
    public final void rule__DecVar__Group_1_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1993:1: ( rule__DecVar__Group_1_4_2__0__Impl rule__DecVar__Group_1_4_2__1 )
            // InternalGo.g:1994:2: rule__DecVar__Group_1_4_2__0__Impl rule__DecVar__Group_1_4_2__1
            {
            pushFollow(FOLLOW_8);
            rule__DecVar__Group_1_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecVar__Group_1_4_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DecVar__Group_1_4_2__0"


    // $ANTLR start "rule__DecVar__Group_1_4_2__0__Impl"
    // InternalGo.g:2001:1: rule__DecVar__Group_1_4_2__0__Impl : ( RULE_COMMA ) ;
    public final void rule__DecVar__Group_1_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2005:1: ( ( RULE_COMMA ) )
            // InternalGo.g:2006:1: ( RULE_COMMA )
            {
            // InternalGo.g:2006:1: ( RULE_COMMA )
            // InternalGo.g:2007:2: RULE_COMMA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getCommaTerminalRuleCall_1_4_2_0()); 
            }
            match(input,RULE_COMMA,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getCommaTerminalRuleCall_1_4_2_0()); 
            }

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
    // $ANTLR end "rule__DecVar__Group_1_4_2__0__Impl"


    // $ANTLR start "rule__DecVar__Group_1_4_2__1"
    // InternalGo.g:2016:1: rule__DecVar__Group_1_4_2__1 : rule__DecVar__Group_1_4_2__1__Impl ;
    public final void rule__DecVar__Group_1_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2020:1: ( rule__DecVar__Group_1_4_2__1__Impl )
            // InternalGo.g:2021:2: rule__DecVar__Group_1_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecVar__Group_1_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DecVar__Group_1_4_2__1"


    // $ANTLR start "rule__DecVar__Group_1_4_2__1__Impl"
    // InternalGo.g:2027:1: rule__DecVar__Group_1_4_2__1__Impl : ( ( rule__DecVar__AtrbAssignment_1_4_2_1 ) ) ;
    public final void rule__DecVar__Group_1_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2031:1: ( ( ( rule__DecVar__AtrbAssignment_1_4_2_1 ) ) )
            // InternalGo.g:2032:1: ( ( rule__DecVar__AtrbAssignment_1_4_2_1 ) )
            {
            // InternalGo.g:2032:1: ( ( rule__DecVar__AtrbAssignment_1_4_2_1 ) )
            // InternalGo.g:2033:2: ( rule__DecVar__AtrbAssignment_1_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getAtrbAssignment_1_4_2_1()); 
            }
            // InternalGo.g:2034:2: ( rule__DecVar__AtrbAssignment_1_4_2_1 )
            // InternalGo.g:2034:3: rule__DecVar__AtrbAssignment_1_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DecVar__AtrbAssignment_1_4_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getAtrbAssignment_1_4_2_1()); 
            }

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
    // $ANTLR end "rule__DecVar__Group_1_4_2__1__Impl"


    // $ANTLR start "rule__MultDecVars__Group__0"
    // InternalGo.g:2043:1: rule__MultDecVars__Group__0 : rule__MultDecVars__Group__0__Impl rule__MultDecVars__Group__1 ;
    public final void rule__MultDecVars__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2047:1: ( rule__MultDecVars__Group__0__Impl rule__MultDecVars__Group__1 )
            // InternalGo.g:2048:2: rule__MultDecVars__Group__0__Impl rule__MultDecVars__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__MultDecVars__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultDecVars__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MultDecVars__Group__0"


    // $ANTLR start "rule__MultDecVars__Group__0__Impl"
    // InternalGo.g:2055:1: rule__MultDecVars__Group__0__Impl : ( ruleModif ) ;
    public final void rule__MultDecVars__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2059:1: ( ( ruleModif ) )
            // InternalGo.g:2060:1: ( ruleModif )
            {
            // InternalGo.g:2060:1: ( ruleModif )
            // InternalGo.g:2061:2: ruleModif
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultDecVarsAccess().getModifParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleModif();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultDecVarsAccess().getModifParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__MultDecVars__Group__0__Impl"


    // $ANTLR start "rule__MultDecVars__Group__1"
    // InternalGo.g:2070:1: rule__MultDecVars__Group__1 : rule__MultDecVars__Group__1__Impl rule__MultDecVars__Group__2 ;
    public final void rule__MultDecVars__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2074:1: ( rule__MultDecVars__Group__1__Impl rule__MultDecVars__Group__2 )
            // InternalGo.g:2075:2: rule__MultDecVars__Group__1__Impl rule__MultDecVars__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__MultDecVars__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultDecVars__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MultDecVars__Group__1"


    // $ANTLR start "rule__MultDecVars__Group__1__Impl"
    // InternalGo.g:2082:1: rule__MultDecVars__Group__1__Impl : ( RULE_OPEN_PARENTHESES ) ;
    public final void rule__MultDecVars__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2086:1: ( ( RULE_OPEN_PARENTHESES ) )
            // InternalGo.g:2087:1: ( RULE_OPEN_PARENTHESES )
            {
            // InternalGo.g:2087:1: ( RULE_OPEN_PARENTHESES )
            // InternalGo.g:2088:2: RULE_OPEN_PARENTHESES
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultDecVarsAccess().getOpen_parenthesesTerminalRuleCall_1()); 
            }
            match(input,RULE_OPEN_PARENTHESES,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultDecVarsAccess().getOpen_parenthesesTerminalRuleCall_1()); 
            }

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
    // $ANTLR end "rule__MultDecVars__Group__1__Impl"


    // $ANTLR start "rule__MultDecVars__Group__2"
    // InternalGo.g:2097:1: rule__MultDecVars__Group__2 : rule__MultDecVars__Group__2__Impl rule__MultDecVars__Group__3 ;
    public final void rule__MultDecVars__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2101:1: ( rule__MultDecVars__Group__2__Impl rule__MultDecVars__Group__3 )
            // InternalGo.g:2102:2: rule__MultDecVars__Group__2__Impl rule__MultDecVars__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__MultDecVars__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultDecVars__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MultDecVars__Group__2"


    // $ANTLR start "rule__MultDecVars__Group__2__Impl"
    // InternalGo.g:2109:1: rule__MultDecVars__Group__2__Impl : ( ( rule__MultDecVars__Group_2__0 )* ) ;
    public final void rule__MultDecVars__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2113:1: ( ( ( rule__MultDecVars__Group_2__0 )* ) )
            // InternalGo.g:2114:1: ( ( rule__MultDecVars__Group_2__0 )* )
            {
            // InternalGo.g:2114:1: ( ( rule__MultDecVars__Group_2__0 )* )
            // InternalGo.g:2115:2: ( rule__MultDecVars__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultDecVarsAccess().getGroup_2()); 
            }
            // InternalGo.g:2116:2: ( rule__MultDecVars__Group_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalGo.g:2116:3: rule__MultDecVars__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__MultDecVars__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultDecVarsAccess().getGroup_2()); 
            }

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
    // $ANTLR end "rule__MultDecVars__Group__2__Impl"


    // $ANTLR start "rule__MultDecVars__Group__3"
    // InternalGo.g:2124:1: rule__MultDecVars__Group__3 : rule__MultDecVars__Group__3__Impl ;
    public final void rule__MultDecVars__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2128:1: ( rule__MultDecVars__Group__3__Impl )
            // InternalGo.g:2129:2: rule__MultDecVars__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultDecVars__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MultDecVars__Group__3"


    // $ANTLR start "rule__MultDecVars__Group__3__Impl"
    // InternalGo.g:2135:1: rule__MultDecVars__Group__3__Impl : ( RULE_CLOSED_PARENTHESES ) ;
    public final void rule__MultDecVars__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2139:1: ( ( RULE_CLOSED_PARENTHESES ) )
            // InternalGo.g:2140:1: ( RULE_CLOSED_PARENTHESES )
            {
            // InternalGo.g:2140:1: ( RULE_CLOSED_PARENTHESES )
            // InternalGo.g:2141:2: RULE_CLOSED_PARENTHESES
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultDecVarsAccess().getClosed_parenthesesTerminalRuleCall_3()); 
            }
            match(input,RULE_CLOSED_PARENTHESES,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultDecVarsAccess().getClosed_parenthesesTerminalRuleCall_3()); 
            }

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
    // $ANTLR end "rule__MultDecVars__Group__3__Impl"


    // $ANTLR start "rule__MultDecVars__Group_2__0"
    // InternalGo.g:2151:1: rule__MultDecVars__Group_2__0 : rule__MultDecVars__Group_2__0__Impl rule__MultDecVars__Group_2__1 ;
    public final void rule__MultDecVars__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2155:1: ( rule__MultDecVars__Group_2__0__Impl rule__MultDecVars__Group_2__1 )
            // InternalGo.g:2156:2: rule__MultDecVars__Group_2__0__Impl rule__MultDecVars__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__MultDecVars__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultDecVars__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MultDecVars__Group_2__0"


    // $ANTLR start "rule__MultDecVars__Group_2__0__Impl"
    // InternalGo.g:2163:1: rule__MultDecVars__Group_2__0__Impl : ( ( rule__MultDecVars__NameAssignment_2_0 ) ) ;
    public final void rule__MultDecVars__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2167:1: ( ( ( rule__MultDecVars__NameAssignment_2_0 ) ) )
            // InternalGo.g:2168:1: ( ( rule__MultDecVars__NameAssignment_2_0 ) )
            {
            // InternalGo.g:2168:1: ( ( rule__MultDecVars__NameAssignment_2_0 ) )
            // InternalGo.g:2169:2: ( rule__MultDecVars__NameAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultDecVarsAccess().getNameAssignment_2_0()); 
            }
            // InternalGo.g:2170:2: ( rule__MultDecVars__NameAssignment_2_0 )
            // InternalGo.g:2170:3: rule__MultDecVars__NameAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__MultDecVars__NameAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultDecVarsAccess().getNameAssignment_2_0()); 
            }

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
    // $ANTLR end "rule__MultDecVars__Group_2__0__Impl"


    // $ANTLR start "rule__MultDecVars__Group_2__1"
    // InternalGo.g:2178:1: rule__MultDecVars__Group_2__1 : rule__MultDecVars__Group_2__1__Impl rule__MultDecVars__Group_2__2 ;
    public final void rule__MultDecVars__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2182:1: ( rule__MultDecVars__Group_2__1__Impl rule__MultDecVars__Group_2__2 )
            // InternalGo.g:2183:2: rule__MultDecVars__Group_2__1__Impl rule__MultDecVars__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__MultDecVars__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultDecVars__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MultDecVars__Group_2__1"


    // $ANTLR start "rule__MultDecVars__Group_2__1__Impl"
    // InternalGo.g:2190:1: rule__MultDecVars__Group_2__1__Impl : ( '=' ) ;
    public final void rule__MultDecVars__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2194:1: ( ( '=' ) )
            // InternalGo.g:2195:1: ( '=' )
            {
            // InternalGo.g:2195:1: ( '=' )
            // InternalGo.g:2196:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultDecVarsAccess().getEqualsSignKeyword_2_1()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultDecVarsAccess().getEqualsSignKeyword_2_1()); 
            }

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
    // $ANTLR end "rule__MultDecVars__Group_2__1__Impl"


    // $ANTLR start "rule__MultDecVars__Group_2__2"
    // InternalGo.g:2205:1: rule__MultDecVars__Group_2__2 : rule__MultDecVars__Group_2__2__Impl ;
    public final void rule__MultDecVars__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2209:1: ( rule__MultDecVars__Group_2__2__Impl )
            // InternalGo.g:2210:2: rule__MultDecVars__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultDecVars__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MultDecVars__Group_2__2"


    // $ANTLR start "rule__MultDecVars__Group_2__2__Impl"
    // InternalGo.g:2216:1: rule__MultDecVars__Group_2__2__Impl : ( ( rule__MultDecVars__Alternatives_2_2 ) ) ;
    public final void rule__MultDecVars__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2220:1: ( ( ( rule__MultDecVars__Alternatives_2_2 ) ) )
            // InternalGo.g:2221:1: ( ( rule__MultDecVars__Alternatives_2_2 ) )
            {
            // InternalGo.g:2221:1: ( ( rule__MultDecVars__Alternatives_2_2 ) )
            // InternalGo.g:2222:2: ( rule__MultDecVars__Alternatives_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultDecVarsAccess().getAlternatives_2_2()); 
            }
            // InternalGo.g:2223:2: ( rule__MultDecVars__Alternatives_2_2 )
            // InternalGo.g:2223:3: rule__MultDecVars__Alternatives_2_2
            {
            pushFollow(FOLLOW_2);
            rule__MultDecVars__Alternatives_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultDecVarsAccess().getAlternatives_2_2()); 
            }

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
    // $ANTLR end "rule__MultDecVars__Group_2__2__Impl"


    // $ANTLR start "rule__DecVars__Group__0"
    // InternalGo.g:2232:1: rule__DecVars__Group__0 : rule__DecVars__Group__0__Impl rule__DecVars__Group__1 ;
    public final void rule__DecVars__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2236:1: ( rule__DecVars__Group__0__Impl rule__DecVars__Group__1 )
            // InternalGo.g:2237:2: rule__DecVars__Group__0__Impl rule__DecVars__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__DecVars__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecVars__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DecVars__Group__0"


    // $ANTLR start "rule__DecVars__Group__0__Impl"
    // InternalGo.g:2244:1: rule__DecVars__Group__0__Impl : ( ( rule__DecVars__VarsAssignment_0 ) ) ;
    public final void rule__DecVars__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2248:1: ( ( ( rule__DecVars__VarsAssignment_0 ) ) )
            // InternalGo.g:2249:1: ( ( rule__DecVars__VarsAssignment_0 ) )
            {
            // InternalGo.g:2249:1: ( ( rule__DecVars__VarsAssignment_0 ) )
            // InternalGo.g:2250:2: ( rule__DecVars__VarsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarsAccess().getVarsAssignment_0()); 
            }
            // InternalGo.g:2251:2: ( rule__DecVars__VarsAssignment_0 )
            // InternalGo.g:2251:3: rule__DecVars__VarsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DecVars__VarsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarsAccess().getVarsAssignment_0()); 
            }

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
    // $ANTLR end "rule__DecVars__Group__0__Impl"


    // $ANTLR start "rule__DecVars__Group__1"
    // InternalGo.g:2259:1: rule__DecVars__Group__1 : rule__DecVars__Group__1__Impl rule__DecVars__Group__2 ;
    public final void rule__DecVars__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2263:1: ( rule__DecVars__Group__1__Impl rule__DecVars__Group__2 )
            // InternalGo.g:2264:2: rule__DecVars__Group__1__Impl rule__DecVars__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__DecVars__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecVars__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DecVars__Group__1"


    // $ANTLR start "rule__DecVars__Group__1__Impl"
    // InternalGo.g:2271:1: rule__DecVars__Group__1__Impl : ( ( rule__DecVars__Group_1__0 )* ) ;
    public final void rule__DecVars__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2275:1: ( ( ( rule__DecVars__Group_1__0 )* ) )
            // InternalGo.g:2276:1: ( ( rule__DecVars__Group_1__0 )* )
            {
            // InternalGo.g:2276:1: ( ( rule__DecVars__Group_1__0 )* )
            // InternalGo.g:2277:2: ( rule__DecVars__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarsAccess().getGroup_1()); 
            }
            // InternalGo.g:2278:2: ( rule__DecVars__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_COMMA) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalGo.g:2278:3: rule__DecVars__Group_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DecVars__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarsAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__DecVars__Group__1__Impl"


    // $ANTLR start "rule__DecVars__Group__2"
    // InternalGo.g:2286:1: rule__DecVars__Group__2 : rule__DecVars__Group__2__Impl rule__DecVars__Group__3 ;
    public final void rule__DecVars__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2290:1: ( rule__DecVars__Group__2__Impl rule__DecVars__Group__3 )
            // InternalGo.g:2291:2: rule__DecVars__Group__2__Impl rule__DecVars__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__DecVars__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecVars__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DecVars__Group__2"


    // $ANTLR start "rule__DecVars__Group__2__Impl"
    // InternalGo.g:2298:1: rule__DecVars__Group__2__Impl : ( ':=' ) ;
    public final void rule__DecVars__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2302:1: ( ( ':=' ) )
            // InternalGo.g:2303:1: ( ':=' )
            {
            // InternalGo.g:2303:1: ( ':=' )
            // InternalGo.g:2304:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarsAccess().getColonEqualsSignKeyword_2()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarsAccess().getColonEqualsSignKeyword_2()); 
            }

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
    // $ANTLR end "rule__DecVars__Group__2__Impl"


    // $ANTLR start "rule__DecVars__Group__3"
    // InternalGo.g:2313:1: rule__DecVars__Group__3 : rule__DecVars__Group__3__Impl rule__DecVars__Group__4 ;
    public final void rule__DecVars__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2317:1: ( rule__DecVars__Group__3__Impl rule__DecVars__Group__4 )
            // InternalGo.g:2318:2: rule__DecVars__Group__3__Impl rule__DecVars__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__DecVars__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecVars__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DecVars__Group__3"


    // $ANTLR start "rule__DecVars__Group__3__Impl"
    // InternalGo.g:2325:1: rule__DecVars__Group__3__Impl : ( ( rule__DecVars__AtrbAssignment_3 ) ) ;
    public final void rule__DecVars__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2329:1: ( ( ( rule__DecVars__AtrbAssignment_3 ) ) )
            // InternalGo.g:2330:1: ( ( rule__DecVars__AtrbAssignment_3 ) )
            {
            // InternalGo.g:2330:1: ( ( rule__DecVars__AtrbAssignment_3 ) )
            // InternalGo.g:2331:2: ( rule__DecVars__AtrbAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarsAccess().getAtrbAssignment_3()); 
            }
            // InternalGo.g:2332:2: ( rule__DecVars__AtrbAssignment_3 )
            // InternalGo.g:2332:3: rule__DecVars__AtrbAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DecVars__AtrbAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarsAccess().getAtrbAssignment_3()); 
            }

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
    // $ANTLR end "rule__DecVars__Group__3__Impl"


    // $ANTLR start "rule__DecVars__Group__4"
    // InternalGo.g:2340:1: rule__DecVars__Group__4 : rule__DecVars__Group__4__Impl ;
    public final void rule__DecVars__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2344:1: ( rule__DecVars__Group__4__Impl )
            // InternalGo.g:2345:2: rule__DecVars__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecVars__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DecVars__Group__4"


    // $ANTLR start "rule__DecVars__Group__4__Impl"
    // InternalGo.g:2351:1: rule__DecVars__Group__4__Impl : ( ( rule__DecVars__Group_4__0 )* ) ;
    public final void rule__DecVars__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2355:1: ( ( ( rule__DecVars__Group_4__0 )* ) )
            // InternalGo.g:2356:1: ( ( rule__DecVars__Group_4__0 )* )
            {
            // InternalGo.g:2356:1: ( ( rule__DecVars__Group_4__0 )* )
            // InternalGo.g:2357:2: ( rule__DecVars__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarsAccess().getGroup_4()); 
            }
            // InternalGo.g:2358:2: ( rule__DecVars__Group_4__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_COMMA) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalGo.g:2358:3: rule__DecVars__Group_4__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DecVars__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarsAccess().getGroup_4()); 
            }

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
    // $ANTLR end "rule__DecVars__Group__4__Impl"


    // $ANTLR start "rule__DecVars__Group_1__0"
    // InternalGo.g:2367:1: rule__DecVars__Group_1__0 : rule__DecVars__Group_1__0__Impl rule__DecVars__Group_1__1 ;
    public final void rule__DecVars__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2371:1: ( rule__DecVars__Group_1__0__Impl rule__DecVars__Group_1__1 )
            // InternalGo.g:2372:2: rule__DecVars__Group_1__0__Impl rule__DecVars__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__DecVars__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecVars__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DecVars__Group_1__0"


    // $ANTLR start "rule__DecVars__Group_1__0__Impl"
    // InternalGo.g:2379:1: rule__DecVars__Group_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__DecVars__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2383:1: ( ( RULE_COMMA ) )
            // InternalGo.g:2384:1: ( RULE_COMMA )
            {
            // InternalGo.g:2384:1: ( RULE_COMMA )
            // InternalGo.g:2385:2: RULE_COMMA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarsAccess().getCommaTerminalRuleCall_1_0()); 
            }
            match(input,RULE_COMMA,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarsAccess().getCommaTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__DecVars__Group_1__0__Impl"


    // $ANTLR start "rule__DecVars__Group_1__1"
    // InternalGo.g:2394:1: rule__DecVars__Group_1__1 : rule__DecVars__Group_1__1__Impl ;
    public final void rule__DecVars__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2398:1: ( rule__DecVars__Group_1__1__Impl )
            // InternalGo.g:2399:2: rule__DecVars__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecVars__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DecVars__Group_1__1"


    // $ANTLR start "rule__DecVars__Group_1__1__Impl"
    // InternalGo.g:2405:1: rule__DecVars__Group_1__1__Impl : ( ( rule__DecVars__VarsAssignment_1_1 ) ) ;
    public final void rule__DecVars__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2409:1: ( ( ( rule__DecVars__VarsAssignment_1_1 ) ) )
            // InternalGo.g:2410:1: ( ( rule__DecVars__VarsAssignment_1_1 ) )
            {
            // InternalGo.g:2410:1: ( ( rule__DecVars__VarsAssignment_1_1 ) )
            // InternalGo.g:2411:2: ( rule__DecVars__VarsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarsAccess().getVarsAssignment_1_1()); 
            }
            // InternalGo.g:2412:2: ( rule__DecVars__VarsAssignment_1_1 )
            // InternalGo.g:2412:3: rule__DecVars__VarsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DecVars__VarsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarsAccess().getVarsAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__DecVars__Group_1__1__Impl"


    // $ANTLR start "rule__DecVars__Group_4__0"
    // InternalGo.g:2421:1: rule__DecVars__Group_4__0 : rule__DecVars__Group_4__0__Impl rule__DecVars__Group_4__1 ;
    public final void rule__DecVars__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2425:1: ( rule__DecVars__Group_4__0__Impl rule__DecVars__Group_4__1 )
            // InternalGo.g:2426:2: rule__DecVars__Group_4__0__Impl rule__DecVars__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__DecVars__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecVars__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DecVars__Group_4__0"


    // $ANTLR start "rule__DecVars__Group_4__0__Impl"
    // InternalGo.g:2433:1: rule__DecVars__Group_4__0__Impl : ( RULE_COMMA ) ;
    public final void rule__DecVars__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2437:1: ( ( RULE_COMMA ) )
            // InternalGo.g:2438:1: ( RULE_COMMA )
            {
            // InternalGo.g:2438:1: ( RULE_COMMA )
            // InternalGo.g:2439:2: RULE_COMMA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarsAccess().getCommaTerminalRuleCall_4_0()); 
            }
            match(input,RULE_COMMA,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarsAccess().getCommaTerminalRuleCall_4_0()); 
            }

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
    // $ANTLR end "rule__DecVars__Group_4__0__Impl"


    // $ANTLR start "rule__DecVars__Group_4__1"
    // InternalGo.g:2448:1: rule__DecVars__Group_4__1 : rule__DecVars__Group_4__1__Impl ;
    public final void rule__DecVars__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2452:1: ( rule__DecVars__Group_4__1__Impl )
            // InternalGo.g:2453:2: rule__DecVars__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecVars__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DecVars__Group_4__1"


    // $ANTLR start "rule__DecVars__Group_4__1__Impl"
    // InternalGo.g:2459:1: rule__DecVars__Group_4__1__Impl : ( ( rule__DecVars__AtrbAssignment_4_1 ) ) ;
    public final void rule__DecVars__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2463:1: ( ( ( rule__DecVars__AtrbAssignment_4_1 ) ) )
            // InternalGo.g:2464:1: ( ( rule__DecVars__AtrbAssignment_4_1 ) )
            {
            // InternalGo.g:2464:1: ( ( rule__DecVars__AtrbAssignment_4_1 ) )
            // InternalGo.g:2465:2: ( rule__DecVars__AtrbAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarsAccess().getAtrbAssignment_4_1()); 
            }
            // InternalGo.g:2466:2: ( rule__DecVars__AtrbAssignment_4_1 )
            // InternalGo.g:2466:3: rule__DecVars__AtrbAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DecVars__AtrbAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarsAccess().getAtrbAssignment_4_1()); 
            }

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
    // $ANTLR end "rule__DecVars__Group_4__1__Impl"


    // $ANTLR start "rule__Atri__Group_0__0"
    // InternalGo.g:2475:1: rule__Atri__Group_0__0 : rule__Atri__Group_0__0__Impl rule__Atri__Group_0__1 ;
    public final void rule__Atri__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2479:1: ( rule__Atri__Group_0__0__Impl rule__Atri__Group_0__1 )
            // InternalGo.g:2480:2: rule__Atri__Group_0__0__Impl rule__Atri__Group_0__1
            {
            pushFollow(FOLLOW_14);
            rule__Atri__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atri__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Atri__Group_0__0"


    // $ANTLR start "rule__Atri__Group_0__0__Impl"
    // InternalGo.g:2487:1: rule__Atri__Group_0__0__Impl : ( RULE_OPEN_BRACKETS ) ;
    public final void rule__Atri__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2491:1: ( ( RULE_OPEN_BRACKETS ) )
            // InternalGo.g:2492:1: ( RULE_OPEN_BRACKETS )
            {
            // InternalGo.g:2492:1: ( RULE_OPEN_BRACKETS )
            // InternalGo.g:2493:2: RULE_OPEN_BRACKETS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtriAccess().getOpen_bracketsTerminalRuleCall_0_0()); 
            }
            match(input,RULE_OPEN_BRACKETS,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtriAccess().getOpen_bracketsTerminalRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__Atri__Group_0__0__Impl"


    // $ANTLR start "rule__Atri__Group_0__1"
    // InternalGo.g:2502:1: rule__Atri__Group_0__1 : rule__Atri__Group_0__1__Impl rule__Atri__Group_0__2 ;
    public final void rule__Atri__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2506:1: ( rule__Atri__Group_0__1__Impl rule__Atri__Group_0__2 )
            // InternalGo.g:2507:2: rule__Atri__Group_0__1__Impl rule__Atri__Group_0__2
            {
            pushFollow(FOLLOW_14);
            rule__Atri__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atri__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Atri__Group_0__1"


    // $ANTLR start "rule__Atri__Group_0__1__Impl"
    // InternalGo.g:2514:1: rule__Atri__Group_0__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Atri__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2518:1: ( ( ( RULE_INT )? ) )
            // InternalGo.g:2519:1: ( ( RULE_INT )? )
            {
            // InternalGo.g:2519:1: ( ( RULE_INT )? )
            // InternalGo.g:2520:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtriAccess().getINTTerminalRuleCall_0_1()); 
            }
            // InternalGo.g:2521:2: ( RULE_INT )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INT) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGo.g:2521:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtriAccess().getINTTerminalRuleCall_0_1()); 
            }

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
    // $ANTLR end "rule__Atri__Group_0__1__Impl"


    // $ANTLR start "rule__Atri__Group_0__2"
    // InternalGo.g:2529:1: rule__Atri__Group_0__2 : rule__Atri__Group_0__2__Impl rule__Atri__Group_0__3 ;
    public final void rule__Atri__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2533:1: ( rule__Atri__Group_0__2__Impl rule__Atri__Group_0__3 )
            // InternalGo.g:2534:2: rule__Atri__Group_0__2__Impl rule__Atri__Group_0__3
            {
            pushFollow(FOLLOW_5);
            rule__Atri__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atri__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Atri__Group_0__2"


    // $ANTLR start "rule__Atri__Group_0__2__Impl"
    // InternalGo.g:2541:1: rule__Atri__Group_0__2__Impl : ( RULE_CLOSED_BRACKETS ) ;
    public final void rule__Atri__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2545:1: ( ( RULE_CLOSED_BRACKETS ) )
            // InternalGo.g:2546:1: ( RULE_CLOSED_BRACKETS )
            {
            // InternalGo.g:2546:1: ( RULE_CLOSED_BRACKETS )
            // InternalGo.g:2547:2: RULE_CLOSED_BRACKETS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtriAccess().getClosed_bracketsTerminalRuleCall_0_2()); 
            }
            match(input,RULE_CLOSED_BRACKETS,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtriAccess().getClosed_bracketsTerminalRuleCall_0_2()); 
            }

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
    // $ANTLR end "rule__Atri__Group_0__2__Impl"


    // $ANTLR start "rule__Atri__Group_0__3"
    // InternalGo.g:2556:1: rule__Atri__Group_0__3 : rule__Atri__Group_0__3__Impl rule__Atri__Group_0__4 ;
    public final void rule__Atri__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2560:1: ( rule__Atri__Group_0__3__Impl rule__Atri__Group_0__4 )
            // InternalGo.g:2561:2: rule__Atri__Group_0__3__Impl rule__Atri__Group_0__4
            {
            pushFollow(FOLLOW_15);
            rule__Atri__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atri__Group_0__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Atri__Group_0__3"


    // $ANTLR start "rule__Atri__Group_0__3__Impl"
    // InternalGo.g:2568:1: rule__Atri__Group_0__3__Impl : ( ruleTypes ) ;
    public final void rule__Atri__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2572:1: ( ( ruleTypes ) )
            // InternalGo.g:2573:1: ( ruleTypes )
            {
            // InternalGo.g:2573:1: ( ruleTypes )
            // InternalGo.g:2574:2: ruleTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtriAccess().getTypesParserRuleCall_0_3()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtriAccess().getTypesParserRuleCall_0_3()); 
            }

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
    // $ANTLR end "rule__Atri__Group_0__3__Impl"


    // $ANTLR start "rule__Atri__Group_0__4"
    // InternalGo.g:2583:1: rule__Atri__Group_0__4 : rule__Atri__Group_0__4__Impl ;
    public final void rule__Atri__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2587:1: ( rule__Atri__Group_0__4__Impl )
            // InternalGo.g:2588:2: rule__Atri__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atri__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Atri__Group_0__4"


    // $ANTLR start "rule__Atri__Group_0__4__Impl"
    // InternalGo.g:2594:1: rule__Atri__Group_0__4__Impl : ( ( rule__Atri__Group_0_4__0 )? ) ;
    public final void rule__Atri__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2598:1: ( ( ( rule__Atri__Group_0_4__0 )? ) )
            // InternalGo.g:2599:1: ( ( rule__Atri__Group_0_4__0 )? )
            {
            // InternalGo.g:2599:1: ( ( rule__Atri__Group_0_4__0 )? )
            // InternalGo.g:2600:2: ( rule__Atri__Group_0_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtriAccess().getGroup_0_4()); 
            }
            // InternalGo.g:2601:2: ( rule__Atri__Group_0_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_OPEN_KEY) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGo.g:2601:3: rule__Atri__Group_0_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atri__Group_0_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtriAccess().getGroup_0_4()); 
            }

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
    // $ANTLR end "rule__Atri__Group_0__4__Impl"


    // $ANTLR start "rule__Atri__Group_0_4__0"
    // InternalGo.g:2610:1: rule__Atri__Group_0_4__0 : rule__Atri__Group_0_4__0__Impl rule__Atri__Group_0_4__1 ;
    public final void rule__Atri__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2614:1: ( rule__Atri__Group_0_4__0__Impl rule__Atri__Group_0_4__1 )
            // InternalGo.g:2615:2: rule__Atri__Group_0_4__0__Impl rule__Atri__Group_0_4__1
            {
            pushFollow(FOLLOW_16);
            rule__Atri__Group_0_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atri__Group_0_4__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Atri__Group_0_4__0"


    // $ANTLR start "rule__Atri__Group_0_4__0__Impl"
    // InternalGo.g:2622:1: rule__Atri__Group_0_4__0__Impl : ( RULE_OPEN_KEY ) ;
    public final void rule__Atri__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2626:1: ( ( RULE_OPEN_KEY ) )
            // InternalGo.g:2627:1: ( RULE_OPEN_KEY )
            {
            // InternalGo.g:2627:1: ( RULE_OPEN_KEY )
            // InternalGo.g:2628:2: RULE_OPEN_KEY
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtriAccess().getOpen_KeyTerminalRuleCall_0_4_0()); 
            }
            match(input,RULE_OPEN_KEY,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtriAccess().getOpen_KeyTerminalRuleCall_0_4_0()); 
            }

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
    // $ANTLR end "rule__Atri__Group_0_4__0__Impl"


    // $ANTLR start "rule__Atri__Group_0_4__1"
    // InternalGo.g:2637:1: rule__Atri__Group_0_4__1 : rule__Atri__Group_0_4__1__Impl rule__Atri__Group_0_4__2 ;
    public final void rule__Atri__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2641:1: ( rule__Atri__Group_0_4__1__Impl rule__Atri__Group_0_4__2 )
            // InternalGo.g:2642:2: rule__Atri__Group_0_4__1__Impl rule__Atri__Group_0_4__2
            {
            pushFollow(FOLLOW_17);
            rule__Atri__Group_0_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atri__Group_0_4__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Atri__Group_0_4__1"


    // $ANTLR start "rule__Atri__Group_0_4__1__Impl"
    // InternalGo.g:2649:1: rule__Atri__Group_0_4__1__Impl : ( ruleTypeValue ) ;
    public final void rule__Atri__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2653:1: ( ( ruleTypeValue ) )
            // InternalGo.g:2654:1: ( ruleTypeValue )
            {
            // InternalGo.g:2654:1: ( ruleTypeValue )
            // InternalGo.g:2655:2: ruleTypeValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtriAccess().getTypeValueParserRuleCall_0_4_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtriAccess().getTypeValueParserRuleCall_0_4_1()); 
            }

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
    // $ANTLR end "rule__Atri__Group_0_4__1__Impl"


    // $ANTLR start "rule__Atri__Group_0_4__2"
    // InternalGo.g:2664:1: rule__Atri__Group_0_4__2 : rule__Atri__Group_0_4__2__Impl ;
    public final void rule__Atri__Group_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2668:1: ( rule__Atri__Group_0_4__2__Impl )
            // InternalGo.g:2669:2: rule__Atri__Group_0_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atri__Group_0_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Atri__Group_0_4__2"


    // $ANTLR start "rule__Atri__Group_0_4__2__Impl"
    // InternalGo.g:2675:1: rule__Atri__Group_0_4__2__Impl : ( RULE_CLOSED_KEY ) ;
    public final void rule__Atri__Group_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2679:1: ( ( RULE_CLOSED_KEY ) )
            // InternalGo.g:2680:1: ( RULE_CLOSED_KEY )
            {
            // InternalGo.g:2680:1: ( RULE_CLOSED_KEY )
            // InternalGo.g:2681:2: RULE_CLOSED_KEY
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtriAccess().getClosed_KeyTerminalRuleCall_0_4_2()); 
            }
            match(input,RULE_CLOSED_KEY,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtriAccess().getClosed_KeyTerminalRuleCall_0_4_2()); 
            }

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
    // $ANTLR end "rule__Atri__Group_0_4__2__Impl"


    // $ANTLR start "rule__Params__Group__0"
    // InternalGo.g:2691:1: rule__Params__Group__0 : rule__Params__Group__0__Impl rule__Params__Group__1 ;
    public final void rule__Params__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2695:1: ( rule__Params__Group__0__Impl rule__Params__Group__1 )
            // InternalGo.g:2696:2: rule__Params__Group__0__Impl rule__Params__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Params__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Params__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Params__Group__0"


    // $ANTLR start "rule__Params__Group__0__Impl"
    // InternalGo.g:2703:1: rule__Params__Group__0__Impl : ( ( rule__Params__ParamsAssignment_0 ) ) ;
    public final void rule__Params__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2707:1: ( ( ( rule__Params__ParamsAssignment_0 ) ) )
            // InternalGo.g:2708:1: ( ( rule__Params__ParamsAssignment_0 ) )
            {
            // InternalGo.g:2708:1: ( ( rule__Params__ParamsAssignment_0 ) )
            // InternalGo.g:2709:2: ( rule__Params__ParamsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamsAccess().getParamsAssignment_0()); 
            }
            // InternalGo.g:2710:2: ( rule__Params__ParamsAssignment_0 )
            // InternalGo.g:2710:3: rule__Params__ParamsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Params__ParamsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamsAccess().getParamsAssignment_0()); 
            }

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
    // $ANTLR end "rule__Params__Group__0__Impl"


    // $ANTLR start "rule__Params__Group__1"
    // InternalGo.g:2718:1: rule__Params__Group__1 : rule__Params__Group__1__Impl rule__Params__Group__2 ;
    public final void rule__Params__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2722:1: ( rule__Params__Group__1__Impl rule__Params__Group__2 )
            // InternalGo.g:2723:2: rule__Params__Group__1__Impl rule__Params__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Params__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Params__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Params__Group__1"


    // $ANTLR start "rule__Params__Group__1__Impl"
    // InternalGo.g:2730:1: rule__Params__Group__1__Impl : ( ruleTypes ) ;
    public final void rule__Params__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2734:1: ( ( ruleTypes ) )
            // InternalGo.g:2735:1: ( ruleTypes )
            {
            // InternalGo.g:2735:1: ( ruleTypes )
            // InternalGo.g:2736:2: ruleTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamsAccess().getTypesParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamsAccess().getTypesParserRuleCall_1()); 
            }

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
    // $ANTLR end "rule__Params__Group__1__Impl"


    // $ANTLR start "rule__Params__Group__2"
    // InternalGo.g:2745:1: rule__Params__Group__2 : rule__Params__Group__2__Impl ;
    public final void rule__Params__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2749:1: ( rule__Params__Group__2__Impl )
            // InternalGo.g:2750:2: rule__Params__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Params__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Params__Group__2"


    // $ANTLR start "rule__Params__Group__2__Impl"
    // InternalGo.g:2756:1: rule__Params__Group__2__Impl : ( ( rule__Params__Group_2__0 )* ) ;
    public final void rule__Params__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2760:1: ( ( ( rule__Params__Group_2__0 )* ) )
            // InternalGo.g:2761:1: ( ( rule__Params__Group_2__0 )* )
            {
            // InternalGo.g:2761:1: ( ( rule__Params__Group_2__0 )* )
            // InternalGo.g:2762:2: ( rule__Params__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamsAccess().getGroup_2()); 
            }
            // InternalGo.g:2763:2: ( rule__Params__Group_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_COMMA) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalGo.g:2763:3: rule__Params__Group_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Params__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamsAccess().getGroup_2()); 
            }

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
    // $ANTLR end "rule__Params__Group__2__Impl"


    // $ANTLR start "rule__Params__Group_2__0"
    // InternalGo.g:2772:1: rule__Params__Group_2__0 : rule__Params__Group_2__0__Impl rule__Params__Group_2__1 ;
    public final void rule__Params__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2776:1: ( rule__Params__Group_2__0__Impl rule__Params__Group_2__1 )
            // InternalGo.g:2777:2: rule__Params__Group_2__0__Impl rule__Params__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Params__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Params__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Params__Group_2__0"


    // $ANTLR start "rule__Params__Group_2__0__Impl"
    // InternalGo.g:2784:1: rule__Params__Group_2__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Params__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2788:1: ( ( RULE_COMMA ) )
            // InternalGo.g:2789:1: ( RULE_COMMA )
            {
            // InternalGo.g:2789:1: ( RULE_COMMA )
            // InternalGo.g:2790:2: RULE_COMMA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamsAccess().getCommaTerminalRuleCall_2_0()); 
            }
            match(input,RULE_COMMA,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamsAccess().getCommaTerminalRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__Params__Group_2__0__Impl"


    // $ANTLR start "rule__Params__Group_2__1"
    // InternalGo.g:2799:1: rule__Params__Group_2__1 : rule__Params__Group_2__1__Impl rule__Params__Group_2__2 ;
    public final void rule__Params__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2803:1: ( rule__Params__Group_2__1__Impl rule__Params__Group_2__2 )
            // InternalGo.g:2804:2: rule__Params__Group_2__1__Impl rule__Params__Group_2__2
            {
            pushFollow(FOLLOW_5);
            rule__Params__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Params__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Params__Group_2__1"


    // $ANTLR start "rule__Params__Group_2__1__Impl"
    // InternalGo.g:2811:1: rule__Params__Group_2__1__Impl : ( ( rule__Params__ParamsAssignment_2_1 ) ) ;
    public final void rule__Params__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2815:1: ( ( ( rule__Params__ParamsAssignment_2_1 ) ) )
            // InternalGo.g:2816:1: ( ( rule__Params__ParamsAssignment_2_1 ) )
            {
            // InternalGo.g:2816:1: ( ( rule__Params__ParamsAssignment_2_1 ) )
            // InternalGo.g:2817:2: ( rule__Params__ParamsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamsAccess().getParamsAssignment_2_1()); 
            }
            // InternalGo.g:2818:2: ( rule__Params__ParamsAssignment_2_1 )
            // InternalGo.g:2818:3: rule__Params__ParamsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Params__ParamsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamsAccess().getParamsAssignment_2_1()); 
            }

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
    // $ANTLR end "rule__Params__Group_2__1__Impl"


    // $ANTLR start "rule__Params__Group_2__2"
    // InternalGo.g:2826:1: rule__Params__Group_2__2 : rule__Params__Group_2__2__Impl ;
    public final void rule__Params__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2830:1: ( rule__Params__Group_2__2__Impl )
            // InternalGo.g:2831:2: rule__Params__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Params__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Params__Group_2__2"


    // $ANTLR start "rule__Params__Group_2__2__Impl"
    // InternalGo.g:2837:1: rule__Params__Group_2__2__Impl : ( ruleTypes ) ;
    public final void rule__Params__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2841:1: ( ( ruleTypes ) )
            // InternalGo.g:2842:1: ( ruleTypes )
            {
            // InternalGo.g:2842:1: ( ruleTypes )
            // InternalGo.g:2843:2: ruleTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamsAccess().getTypesParserRuleCall_2_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamsAccess().getTypesParserRuleCall_2_2()); 
            }

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
    // $ANTLR end "rule__Params__Group_2__2__Impl"


    // $ANTLR start "rule__DecImport__Group__0"
    // InternalGo.g:2853:1: rule__DecImport__Group__0 : rule__DecImport__Group__0__Impl rule__DecImport__Group__1 ;
    public final void rule__DecImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2857:1: ( rule__DecImport__Group__0__Impl rule__DecImport__Group__1 )
            // InternalGo.g:2858:2: rule__DecImport__Group__0__Impl rule__DecImport__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__DecImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecImport__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DecImport__Group__0"


    // $ANTLR start "rule__DecImport__Group__0__Impl"
    // InternalGo.g:2865:1: rule__DecImport__Group__0__Impl : ( ruleIMPORT ) ;
    public final void rule__DecImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2869:1: ( ( ruleIMPORT ) )
            // InternalGo.g:2870:1: ( ruleIMPORT )
            {
            // InternalGo.g:2870:1: ( ruleIMPORT )
            // InternalGo.g:2871:2: ruleIMPORT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecImportAccess().getIMPORTParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIMPORT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecImportAccess().getIMPORTParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__DecImport__Group__0__Impl"


    // $ANTLR start "rule__DecImport__Group__1"
    // InternalGo.g:2880:1: rule__DecImport__Group__1 : rule__DecImport__Group__1__Impl ;
    public final void rule__DecImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2884:1: ( rule__DecImport__Group__1__Impl )
            // InternalGo.g:2885:2: rule__DecImport__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DecImport__Group__1"


    // $ANTLR start "rule__DecImport__Group__1__Impl"
    // InternalGo.g:2891:1: rule__DecImport__Group__1__Impl : ( ( rule__DecImport__Alternatives_1 ) ) ;
    public final void rule__DecImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2895:1: ( ( ( rule__DecImport__Alternatives_1 ) ) )
            // InternalGo.g:2896:1: ( ( rule__DecImport__Alternatives_1 ) )
            {
            // InternalGo.g:2896:1: ( ( rule__DecImport__Alternatives_1 ) )
            // InternalGo.g:2897:2: ( rule__DecImport__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecImportAccess().getAlternatives_1()); 
            }
            // InternalGo.g:2898:2: ( rule__DecImport__Alternatives_1 )
            // InternalGo.g:2898:3: rule__DecImport__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__DecImport__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecImportAccess().getAlternatives_1()); 
            }

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
    // $ANTLR end "rule__DecImport__Group__1__Impl"


    // $ANTLR start "rule__DecImport__Group_1_1__0"
    // InternalGo.g:2907:1: rule__DecImport__Group_1_1__0 : rule__DecImport__Group_1_1__0__Impl rule__DecImport__Group_1_1__1 ;
    public final void rule__DecImport__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2911:1: ( rule__DecImport__Group_1_1__0__Impl rule__DecImport__Group_1_1__1 )
            // InternalGo.g:2912:2: rule__DecImport__Group_1_1__0__Impl rule__DecImport__Group_1_1__1
            {
            pushFollow(FOLLOW_19);
            rule__DecImport__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecImport__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DecImport__Group_1_1__0"


    // $ANTLR start "rule__DecImport__Group_1_1__0__Impl"
    // InternalGo.g:2919:1: rule__DecImport__Group_1_1__0__Impl : ( RULE_OPEN_PARENTHESES ) ;
    public final void rule__DecImport__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2923:1: ( ( RULE_OPEN_PARENTHESES ) )
            // InternalGo.g:2924:1: ( RULE_OPEN_PARENTHESES )
            {
            // InternalGo.g:2924:1: ( RULE_OPEN_PARENTHESES )
            // InternalGo.g:2925:2: RULE_OPEN_PARENTHESES
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecImportAccess().getOpen_parenthesesTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_OPEN_PARENTHESES,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecImportAccess().getOpen_parenthesesTerminalRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__DecImport__Group_1_1__0__Impl"


    // $ANTLR start "rule__DecImport__Group_1_1__1"
    // InternalGo.g:2934:1: rule__DecImport__Group_1_1__1 : rule__DecImport__Group_1_1__1__Impl rule__DecImport__Group_1_1__2 ;
    public final void rule__DecImport__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2938:1: ( rule__DecImport__Group_1_1__1__Impl rule__DecImport__Group_1_1__2 )
            // InternalGo.g:2939:2: rule__DecImport__Group_1_1__1__Impl rule__DecImport__Group_1_1__2
            {
            pushFollow(FOLLOW_20);
            rule__DecImport__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecImport__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DecImport__Group_1_1__1"


    // $ANTLR start "rule__DecImport__Group_1_1__1__Impl"
    // InternalGo.g:2946:1: rule__DecImport__Group_1_1__1__Impl : ( ( ( RULE_STRING ) ) ( ( RULE_STRING )* ) ) ;
    public final void rule__DecImport__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2950:1: ( ( ( ( RULE_STRING ) ) ( ( RULE_STRING )* ) ) )
            // InternalGo.g:2951:1: ( ( ( RULE_STRING ) ) ( ( RULE_STRING )* ) )
            {
            // InternalGo.g:2951:1: ( ( ( RULE_STRING ) ) ( ( RULE_STRING )* ) )
            // InternalGo.g:2952:2: ( ( RULE_STRING ) ) ( ( RULE_STRING )* )
            {
            // InternalGo.g:2952:2: ( ( RULE_STRING ) )
            // InternalGo.g:2953:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecImportAccess().getSTRINGTerminalRuleCall_1_1_1()); 
            }
            // InternalGo.g:2954:3: ( RULE_STRING )
            // InternalGo.g:2954:4: RULE_STRING
            {
            match(input,RULE_STRING,FOLLOW_21); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecImportAccess().getSTRINGTerminalRuleCall_1_1_1()); 
            }

            }

            // InternalGo.g:2957:2: ( ( RULE_STRING )* )
            // InternalGo.g:2958:3: ( RULE_STRING )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecImportAccess().getSTRINGTerminalRuleCall_1_1_1()); 
            }
            // InternalGo.g:2959:3: ( RULE_STRING )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_STRING) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalGo.g:2959:4: RULE_STRING
            	    {
            	    match(input,RULE_STRING,FOLLOW_21); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecImportAccess().getSTRINGTerminalRuleCall_1_1_1()); 
            }

            }


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
    // $ANTLR end "rule__DecImport__Group_1_1__1__Impl"


    // $ANTLR start "rule__DecImport__Group_1_1__2"
    // InternalGo.g:2968:1: rule__DecImport__Group_1_1__2 : rule__DecImport__Group_1_1__2__Impl ;
    public final void rule__DecImport__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2972:1: ( rule__DecImport__Group_1_1__2__Impl )
            // InternalGo.g:2973:2: rule__DecImport__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecImport__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DecImport__Group_1_1__2"


    // $ANTLR start "rule__DecImport__Group_1_1__2__Impl"
    // InternalGo.g:2979:1: rule__DecImport__Group_1_1__2__Impl : ( RULE_CLOSED_PARENTHESES ) ;
    public final void rule__DecImport__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2983:1: ( ( RULE_CLOSED_PARENTHESES ) )
            // InternalGo.g:2984:1: ( RULE_CLOSED_PARENTHESES )
            {
            // InternalGo.g:2984:1: ( RULE_CLOSED_PARENTHESES )
            // InternalGo.g:2985:2: RULE_CLOSED_PARENTHESES
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecImportAccess().getClosed_parenthesesTerminalRuleCall_1_1_2()); 
            }
            match(input,RULE_CLOSED_PARENTHESES,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecImportAccess().getClosed_parenthesesTerminalRuleCall_1_1_2()); 
            }

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
    // $ANTLR end "rule__DecImport__Group_1_1__2__Impl"


    // $ANTLR start "rule__Operations__Group__0"
    // InternalGo.g:2995:1: rule__Operations__Group__0 : rule__Operations__Group__0__Impl rule__Operations__Group__1 ;
    public final void rule__Operations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2999:1: ( rule__Operations__Group__0__Impl rule__Operations__Group__1 )
            // InternalGo.g:3000:2: rule__Operations__Group__0__Impl rule__Operations__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Operations__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operations__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Operations__Group__0"


    // $ANTLR start "rule__Operations__Group__0__Impl"
    // InternalGo.g:3007:1: rule__Operations__Group__0__Impl : ( ruleT ) ;
    public final void rule__Operations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3011:1: ( ( ruleT ) )
            // InternalGo.g:3012:1: ( ruleT )
            {
            // InternalGo.g:3012:1: ( ruleT )
            // InternalGo.g:3013:2: ruleT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationsAccess().getTParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationsAccess().getTParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Operations__Group__0__Impl"


    // $ANTLR start "rule__Operations__Group__1"
    // InternalGo.g:3022:1: rule__Operations__Group__1 : rule__Operations__Group__1__Impl ;
    public final void rule__Operations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3026:1: ( rule__Operations__Group__1__Impl )
            // InternalGo.g:3027:2: rule__Operations__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operations__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Operations__Group__1"


    // $ANTLR start "rule__Operations__Group__1__Impl"
    // InternalGo.g:3033:1: rule__Operations__Group__1__Impl : ( ( rule__Operations__OAssignment_1 ) ) ;
    public final void rule__Operations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3037:1: ( ( ( rule__Operations__OAssignment_1 ) ) )
            // InternalGo.g:3038:1: ( ( rule__Operations__OAssignment_1 ) )
            {
            // InternalGo.g:3038:1: ( ( rule__Operations__OAssignment_1 ) )
            // InternalGo.g:3039:2: ( rule__Operations__OAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationsAccess().getOAssignment_1()); 
            }
            // InternalGo.g:3040:2: ( rule__Operations__OAssignment_1 )
            // InternalGo.g:3040:3: rule__Operations__OAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Operations__OAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationsAccess().getOAssignment_1()); 
            }

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
    // $ANTLR end "rule__Operations__Group__1__Impl"


    // $ANTLR start "rule__I__Group_0__0"
    // InternalGo.g:3049:1: rule__I__Group_0__0 : rule__I__Group_0__0__Impl rule__I__Group_0__1 ;
    public final void rule__I__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3053:1: ( rule__I__Group_0__0__Impl rule__I__Group_0__1 )
            // InternalGo.g:3054:2: rule__I__Group_0__0__Impl rule__I__Group_0__1
            {
            pushFollow(FOLLOW_23);
            rule__I__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__I__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__I__Group_0__0"


    // $ANTLR start "rule__I__Group_0__0__Impl"
    // InternalGo.g:3061:1: rule__I__Group_0__0__Impl : ( RULE_PLUS ) ;
    public final void rule__I__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3065:1: ( ( RULE_PLUS ) )
            // InternalGo.g:3066:1: ( RULE_PLUS )
            {
            // InternalGo.g:3066:1: ( RULE_PLUS )
            // InternalGo.g:3067:2: RULE_PLUS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIAccess().getPlusTerminalRuleCall_0_0()); 
            }
            match(input,RULE_PLUS,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIAccess().getPlusTerminalRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__I__Group_0__0__Impl"


    // $ANTLR start "rule__I__Group_0__1"
    // InternalGo.g:3076:1: rule__I__Group_0__1 : rule__I__Group_0__1__Impl rule__I__Group_0__2 ;
    public final void rule__I__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3080:1: ( rule__I__Group_0__1__Impl rule__I__Group_0__2 )
            // InternalGo.g:3081:2: rule__I__Group_0__1__Impl rule__I__Group_0__2
            {
            pushFollow(FOLLOW_22);
            rule__I__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__I__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__I__Group_0__1"


    // $ANTLR start "rule__I__Group_0__1__Impl"
    // InternalGo.g:3088:1: rule__I__Group_0__1__Impl : ( ruleT ) ;
    public final void rule__I__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3092:1: ( ( ruleT ) )
            // InternalGo.g:3093:1: ( ruleT )
            {
            // InternalGo.g:3093:1: ( ruleT )
            // InternalGo.g:3094:2: ruleT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIAccess().getTParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIAccess().getTParserRuleCall_0_1()); 
            }

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
    // $ANTLR end "rule__I__Group_0__1__Impl"


    // $ANTLR start "rule__I__Group_0__2"
    // InternalGo.g:3103:1: rule__I__Group_0__2 : rule__I__Group_0__2__Impl ;
    public final void rule__I__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3107:1: ( rule__I__Group_0__2__Impl )
            // InternalGo.g:3108:2: rule__I__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__I__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__I__Group_0__2"


    // $ANTLR start "rule__I__Group_0__2__Impl"
    // InternalGo.g:3114:1: rule__I__Group_0__2__Impl : ( ( rule__I__OAssignment_0_2 ) ) ;
    public final void rule__I__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3118:1: ( ( ( rule__I__OAssignment_0_2 ) ) )
            // InternalGo.g:3119:1: ( ( rule__I__OAssignment_0_2 ) )
            {
            // InternalGo.g:3119:1: ( ( rule__I__OAssignment_0_2 ) )
            // InternalGo.g:3120:2: ( rule__I__OAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIAccess().getOAssignment_0_2()); 
            }
            // InternalGo.g:3121:2: ( rule__I__OAssignment_0_2 )
            // InternalGo.g:3121:3: rule__I__OAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__I__OAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIAccess().getOAssignment_0_2()); 
            }

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
    // $ANTLR end "rule__I__Group_0__2__Impl"


    // $ANTLR start "rule__I__Group_1__0"
    // InternalGo.g:3130:1: rule__I__Group_1__0 : rule__I__Group_1__0__Impl rule__I__Group_1__1 ;
    public final void rule__I__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3134:1: ( rule__I__Group_1__0__Impl rule__I__Group_1__1 )
            // InternalGo.g:3135:2: rule__I__Group_1__0__Impl rule__I__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__I__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__I__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__I__Group_1__0"


    // $ANTLR start "rule__I__Group_1__0__Impl"
    // InternalGo.g:3142:1: rule__I__Group_1__0__Impl : ( RULE_MINUS ) ;
    public final void rule__I__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3146:1: ( ( RULE_MINUS ) )
            // InternalGo.g:3147:1: ( RULE_MINUS )
            {
            // InternalGo.g:3147:1: ( RULE_MINUS )
            // InternalGo.g:3148:2: RULE_MINUS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIAccess().getMinusTerminalRuleCall_1_0()); 
            }
            match(input,RULE_MINUS,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIAccess().getMinusTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__I__Group_1__0__Impl"


    // $ANTLR start "rule__I__Group_1__1"
    // InternalGo.g:3157:1: rule__I__Group_1__1 : rule__I__Group_1__1__Impl rule__I__Group_1__2 ;
    public final void rule__I__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3161:1: ( rule__I__Group_1__1__Impl rule__I__Group_1__2 )
            // InternalGo.g:3162:2: rule__I__Group_1__1__Impl rule__I__Group_1__2
            {
            pushFollow(FOLLOW_22);
            rule__I__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__I__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__I__Group_1__1"


    // $ANTLR start "rule__I__Group_1__1__Impl"
    // InternalGo.g:3169:1: rule__I__Group_1__1__Impl : ( ruleT ) ;
    public final void rule__I__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3173:1: ( ( ruleT ) )
            // InternalGo.g:3174:1: ( ruleT )
            {
            // InternalGo.g:3174:1: ( ruleT )
            // InternalGo.g:3175:2: ruleT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIAccess().getTParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIAccess().getTParserRuleCall_1_1()); 
            }

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
    // $ANTLR end "rule__I__Group_1__1__Impl"


    // $ANTLR start "rule__I__Group_1__2"
    // InternalGo.g:3184:1: rule__I__Group_1__2 : rule__I__Group_1__2__Impl ;
    public final void rule__I__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3188:1: ( rule__I__Group_1__2__Impl )
            // InternalGo.g:3189:2: rule__I__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__I__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__I__Group_1__2"


    // $ANTLR start "rule__I__Group_1__2__Impl"
    // InternalGo.g:3195:1: rule__I__Group_1__2__Impl : ( ( rule__I__OAssignment_1_2 ) ) ;
    public final void rule__I__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3199:1: ( ( ( rule__I__OAssignment_1_2 ) ) )
            // InternalGo.g:3200:1: ( ( rule__I__OAssignment_1_2 ) )
            {
            // InternalGo.g:3200:1: ( ( rule__I__OAssignment_1_2 ) )
            // InternalGo.g:3201:2: ( rule__I__OAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIAccess().getOAssignment_1_2()); 
            }
            // InternalGo.g:3202:2: ( rule__I__OAssignment_1_2 )
            // InternalGo.g:3202:3: rule__I__OAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__I__OAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIAccess().getOAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__I__Group_1__2__Impl"


    // $ANTLR start "rule__T__Group__0"
    // InternalGo.g:3211:1: rule__T__Group__0 : rule__T__Group__0__Impl rule__T__Group__1 ;
    public final void rule__T__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3215:1: ( rule__T__Group__0__Impl rule__T__Group__1 )
            // InternalGo.g:3216:2: rule__T__Group__0__Impl rule__T__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__T__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__T__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__T__Group__0"


    // $ANTLR start "rule__T__Group__0__Impl"
    // InternalGo.g:3223:1: rule__T__Group__0__Impl : ( ruleF ) ;
    public final void rule__T__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3227:1: ( ( ruleF ) )
            // InternalGo.g:3228:1: ( ruleF )
            {
            // InternalGo.g:3228:1: ( ruleF )
            // InternalGo.g:3229:2: ruleF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTAccess().getFParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleF();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTAccess().getFParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__T__Group__0__Impl"


    // $ANTLR start "rule__T__Group__1"
    // InternalGo.g:3238:1: rule__T__Group__1 : rule__T__Group__1__Impl ;
    public final void rule__T__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3242:1: ( rule__T__Group__1__Impl )
            // InternalGo.g:3243:2: rule__T__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__T__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__T__Group__1"


    // $ANTLR start "rule__T__Group__1__Impl"
    // InternalGo.g:3249:1: rule__T__Group__1__Impl : ( ( rule__T__OAssignment_1 ) ) ;
    public final void rule__T__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3253:1: ( ( ( rule__T__OAssignment_1 ) ) )
            // InternalGo.g:3254:1: ( ( rule__T__OAssignment_1 ) )
            {
            // InternalGo.g:3254:1: ( ( rule__T__OAssignment_1 ) )
            // InternalGo.g:3255:2: ( rule__T__OAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTAccess().getOAssignment_1()); 
            }
            // InternalGo.g:3256:2: ( rule__T__OAssignment_1 )
            // InternalGo.g:3256:3: rule__T__OAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__T__OAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTAccess().getOAssignment_1()); 
            }

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
    // $ANTLR end "rule__T__Group__1__Impl"


    // $ANTLR start "rule__Y__Group_0__0"
    // InternalGo.g:3265:1: rule__Y__Group_0__0 : rule__Y__Group_0__0__Impl rule__Y__Group_0__1 ;
    public final void rule__Y__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3269:1: ( rule__Y__Group_0__0__Impl rule__Y__Group_0__1 )
            // InternalGo.g:3270:2: rule__Y__Group_0__0__Impl rule__Y__Group_0__1
            {
            pushFollow(FOLLOW_23);
            rule__Y__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Y__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Y__Group_0__0"


    // $ANTLR start "rule__Y__Group_0__0__Impl"
    // InternalGo.g:3277:1: rule__Y__Group_0__0__Impl : ( RULE_ASTERICS ) ;
    public final void rule__Y__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3281:1: ( ( RULE_ASTERICS ) )
            // InternalGo.g:3282:1: ( RULE_ASTERICS )
            {
            // InternalGo.g:3282:1: ( RULE_ASTERICS )
            // InternalGo.g:3283:2: RULE_ASTERICS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAccess().getAstericsTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ASTERICS,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAccess().getAstericsTerminalRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__Y__Group_0__0__Impl"


    // $ANTLR start "rule__Y__Group_0__1"
    // InternalGo.g:3292:1: rule__Y__Group_0__1 : rule__Y__Group_0__1__Impl rule__Y__Group_0__2 ;
    public final void rule__Y__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3296:1: ( rule__Y__Group_0__1__Impl rule__Y__Group_0__2 )
            // InternalGo.g:3297:2: rule__Y__Group_0__1__Impl rule__Y__Group_0__2
            {
            pushFollow(FOLLOW_24);
            rule__Y__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Y__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Y__Group_0__1"


    // $ANTLR start "rule__Y__Group_0__1__Impl"
    // InternalGo.g:3304:1: rule__Y__Group_0__1__Impl : ( ( rule__Y__OAssignment_0_1 ) ) ;
    public final void rule__Y__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3308:1: ( ( ( rule__Y__OAssignment_0_1 ) ) )
            // InternalGo.g:3309:1: ( ( rule__Y__OAssignment_0_1 ) )
            {
            // InternalGo.g:3309:1: ( ( rule__Y__OAssignment_0_1 ) )
            // InternalGo.g:3310:2: ( rule__Y__OAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAccess().getOAssignment_0_1()); 
            }
            // InternalGo.g:3311:2: ( rule__Y__OAssignment_0_1 )
            // InternalGo.g:3311:3: rule__Y__OAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Y__OAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAccess().getOAssignment_0_1()); 
            }

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
    // $ANTLR end "rule__Y__Group_0__1__Impl"


    // $ANTLR start "rule__Y__Group_0__2"
    // InternalGo.g:3319:1: rule__Y__Group_0__2 : rule__Y__Group_0__2__Impl ;
    public final void rule__Y__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3323:1: ( rule__Y__Group_0__2__Impl )
            // InternalGo.g:3324:2: rule__Y__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Y__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Y__Group_0__2"


    // $ANTLR start "rule__Y__Group_0__2__Impl"
    // InternalGo.g:3330:1: rule__Y__Group_0__2__Impl : ( ( rule__Y__OAssignment_0_2 ) ) ;
    public final void rule__Y__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3334:1: ( ( ( rule__Y__OAssignment_0_2 ) ) )
            // InternalGo.g:3335:1: ( ( rule__Y__OAssignment_0_2 ) )
            {
            // InternalGo.g:3335:1: ( ( rule__Y__OAssignment_0_2 ) )
            // InternalGo.g:3336:2: ( rule__Y__OAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAccess().getOAssignment_0_2()); 
            }
            // InternalGo.g:3337:2: ( rule__Y__OAssignment_0_2 )
            // InternalGo.g:3337:3: rule__Y__OAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Y__OAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAccess().getOAssignment_0_2()); 
            }

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
    // $ANTLR end "rule__Y__Group_0__2__Impl"


    // $ANTLR start "rule__Y__Group_1__0"
    // InternalGo.g:3346:1: rule__Y__Group_1__0 : rule__Y__Group_1__0__Impl rule__Y__Group_1__1 ;
    public final void rule__Y__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3350:1: ( rule__Y__Group_1__0__Impl rule__Y__Group_1__1 )
            // InternalGo.g:3351:2: rule__Y__Group_1__0__Impl rule__Y__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Y__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Y__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Y__Group_1__0"


    // $ANTLR start "rule__Y__Group_1__0__Impl"
    // InternalGo.g:3358:1: rule__Y__Group_1__0__Impl : ( RULE_BAR ) ;
    public final void rule__Y__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3362:1: ( ( RULE_BAR ) )
            // InternalGo.g:3363:1: ( RULE_BAR )
            {
            // InternalGo.g:3363:1: ( RULE_BAR )
            // InternalGo.g:3364:2: RULE_BAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAccess().getBarTerminalRuleCall_1_0()); 
            }
            match(input,RULE_BAR,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAccess().getBarTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__Y__Group_1__0__Impl"


    // $ANTLR start "rule__Y__Group_1__1"
    // InternalGo.g:3373:1: rule__Y__Group_1__1 : rule__Y__Group_1__1__Impl rule__Y__Group_1__2 ;
    public final void rule__Y__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3377:1: ( rule__Y__Group_1__1__Impl rule__Y__Group_1__2 )
            // InternalGo.g:3378:2: rule__Y__Group_1__1__Impl rule__Y__Group_1__2
            {
            pushFollow(FOLLOW_24);
            rule__Y__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Y__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Y__Group_1__1"


    // $ANTLR start "rule__Y__Group_1__1__Impl"
    // InternalGo.g:3385:1: rule__Y__Group_1__1__Impl : ( ( rule__Y__OAssignment_1_1 ) ) ;
    public final void rule__Y__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3389:1: ( ( ( rule__Y__OAssignment_1_1 ) ) )
            // InternalGo.g:3390:1: ( ( rule__Y__OAssignment_1_1 ) )
            {
            // InternalGo.g:3390:1: ( ( rule__Y__OAssignment_1_1 ) )
            // InternalGo.g:3391:2: ( rule__Y__OAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAccess().getOAssignment_1_1()); 
            }
            // InternalGo.g:3392:2: ( rule__Y__OAssignment_1_1 )
            // InternalGo.g:3392:3: rule__Y__OAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Y__OAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAccess().getOAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__Y__Group_1__1__Impl"


    // $ANTLR start "rule__Y__Group_1__2"
    // InternalGo.g:3400:1: rule__Y__Group_1__2 : rule__Y__Group_1__2__Impl ;
    public final void rule__Y__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3404:1: ( rule__Y__Group_1__2__Impl )
            // InternalGo.g:3405:2: rule__Y__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Y__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Y__Group_1__2"


    // $ANTLR start "rule__Y__Group_1__2__Impl"
    // InternalGo.g:3411:1: rule__Y__Group_1__2__Impl : ( ( rule__Y__OAssignment_1_2 ) ) ;
    public final void rule__Y__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3415:1: ( ( ( rule__Y__OAssignment_1_2 ) ) )
            // InternalGo.g:3416:1: ( ( rule__Y__OAssignment_1_2 ) )
            {
            // InternalGo.g:3416:1: ( ( rule__Y__OAssignment_1_2 ) )
            // InternalGo.g:3417:2: ( rule__Y__OAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAccess().getOAssignment_1_2()); 
            }
            // InternalGo.g:3418:2: ( rule__Y__OAssignment_1_2 )
            // InternalGo.g:3418:3: rule__Y__OAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Y__OAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAccess().getOAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__Y__Group_1__2__Impl"


    // $ANTLR start "rule__F__Group_0__0"
    // InternalGo.g:3427:1: rule__F__Group_0__0 : rule__F__Group_0__0__Impl rule__F__Group_0__1 ;
    public final void rule__F__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3431:1: ( rule__F__Group_0__0__Impl rule__F__Group_0__1 )
            // InternalGo.g:3432:2: rule__F__Group_0__0__Impl rule__F__Group_0__1
            {
            pushFollow(FOLLOW_23);
            rule__F__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__F__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__F__Group_0__0"


    // $ANTLR start "rule__F__Group_0__0__Impl"
    // InternalGo.g:3439:1: rule__F__Group_0__0__Impl : ( RULE_OPEN_PARENTHESES ) ;
    public final void rule__F__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3443:1: ( ( RULE_OPEN_PARENTHESES ) )
            // InternalGo.g:3444:1: ( RULE_OPEN_PARENTHESES )
            {
            // InternalGo.g:3444:1: ( RULE_OPEN_PARENTHESES )
            // InternalGo.g:3445:2: RULE_OPEN_PARENTHESES
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFAccess().getOpen_parenthesesTerminalRuleCall_0_0()); 
            }
            match(input,RULE_OPEN_PARENTHESES,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFAccess().getOpen_parenthesesTerminalRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__F__Group_0__0__Impl"


    // $ANTLR start "rule__F__Group_0__1"
    // InternalGo.g:3454:1: rule__F__Group_0__1 : rule__F__Group_0__1__Impl rule__F__Group_0__2 ;
    public final void rule__F__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3458:1: ( rule__F__Group_0__1__Impl rule__F__Group_0__2 )
            // InternalGo.g:3459:2: rule__F__Group_0__1__Impl rule__F__Group_0__2
            {
            pushFollow(FOLLOW_20);
            rule__F__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__F__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__F__Group_0__1"


    // $ANTLR start "rule__F__Group_0__1__Impl"
    // InternalGo.g:3466:1: rule__F__Group_0__1__Impl : ( ( rule__F__OAssignment_0_1 ) ) ;
    public final void rule__F__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3470:1: ( ( ( rule__F__OAssignment_0_1 ) ) )
            // InternalGo.g:3471:1: ( ( rule__F__OAssignment_0_1 ) )
            {
            // InternalGo.g:3471:1: ( ( rule__F__OAssignment_0_1 ) )
            // InternalGo.g:3472:2: ( rule__F__OAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFAccess().getOAssignment_0_1()); 
            }
            // InternalGo.g:3473:2: ( rule__F__OAssignment_0_1 )
            // InternalGo.g:3473:3: rule__F__OAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__F__OAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFAccess().getOAssignment_0_1()); 
            }

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
    // $ANTLR end "rule__F__Group_0__1__Impl"


    // $ANTLR start "rule__F__Group_0__2"
    // InternalGo.g:3481:1: rule__F__Group_0__2 : rule__F__Group_0__2__Impl ;
    public final void rule__F__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3485:1: ( rule__F__Group_0__2__Impl )
            // InternalGo.g:3486:2: rule__F__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__F__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__F__Group_0__2"


    // $ANTLR start "rule__F__Group_0__2__Impl"
    // InternalGo.g:3492:1: rule__F__Group_0__2__Impl : ( RULE_CLOSED_PARENTHESES ) ;
    public final void rule__F__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3496:1: ( ( RULE_CLOSED_PARENTHESES ) )
            // InternalGo.g:3497:1: ( RULE_CLOSED_PARENTHESES )
            {
            // InternalGo.g:3497:1: ( RULE_CLOSED_PARENTHESES )
            // InternalGo.g:3498:2: RULE_CLOSED_PARENTHESES
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFAccess().getClosed_parenthesesTerminalRuleCall_0_2()); 
            }
            match(input,RULE_CLOSED_PARENTHESES,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFAccess().getClosed_parenthesesTerminalRuleCall_0_2()); 
            }

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
    // $ANTLR end "rule__F__Group_0__2__Impl"


    // $ANTLR start "rule__Double__Group__0"
    // InternalGo.g:3508:1: rule__Double__Group__0 : rule__Double__Group__0__Impl rule__Double__Group__1 ;
    public final void rule__Double__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3512:1: ( rule__Double__Group__0__Impl rule__Double__Group__1 )
            // InternalGo.g:3513:2: rule__Double__Group__0__Impl rule__Double__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Double__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Double__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Double__Group__0"


    // $ANTLR start "rule__Double__Group__0__Impl"
    // InternalGo.g:3520:1: rule__Double__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3524:1: ( ( RULE_INT ) )
            // InternalGo.g:3525:1: ( RULE_INT )
            {
            // InternalGo.g:3525:1: ( RULE_INT )
            // InternalGo.g:3526:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Double__Group__0__Impl"


    // $ANTLR start "rule__Double__Group__1"
    // InternalGo.g:3535:1: rule__Double__Group__1 : rule__Double__Group__1__Impl rule__Double__Group__2 ;
    public final void rule__Double__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3539:1: ( rule__Double__Group__1__Impl rule__Double__Group__2 )
            // InternalGo.g:3540:2: rule__Double__Group__1__Impl rule__Double__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Double__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Double__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Double__Group__1"


    // $ANTLR start "rule__Double__Group__1__Impl"
    // InternalGo.g:3547:1: rule__Double__Group__1__Impl : ( RULE_DOT ) ;
    public final void rule__Double__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3551:1: ( ( RULE_DOT ) )
            // InternalGo.g:3552:1: ( RULE_DOT )
            {
            // InternalGo.g:3552:1: ( RULE_DOT )
            // InternalGo.g:3553:2: RULE_DOT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAccess().getDotTerminalRuleCall_1()); 
            }
            match(input,RULE_DOT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAccess().getDotTerminalRuleCall_1()); 
            }

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
    // $ANTLR end "rule__Double__Group__1__Impl"


    // $ANTLR start "rule__Double__Group__2"
    // InternalGo.g:3562:1: rule__Double__Group__2 : rule__Double__Group__2__Impl ;
    public final void rule__Double__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3566:1: ( rule__Double__Group__2__Impl )
            // InternalGo.g:3567:2: rule__Double__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Double__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Double__Group__2"


    // $ANTLR start "rule__Double__Group__2__Impl"
    // InternalGo.g:3573:1: rule__Double__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3577:1: ( ( RULE_INT ) )
            // InternalGo.g:3578:1: ( RULE_INT )
            {
            // InternalGo.g:3578:1: ( RULE_INT )
            // InternalGo.g:3579:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2()); 
            }

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
    // $ANTLR end "rule__Double__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalGo.g:3589:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3593:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalGo.g:3594:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Condition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalGo.g:3601:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__IfAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3605:1: ( ( ( rule__Condition__IfAssignment_0 ) ) )
            // InternalGo.g:3606:1: ( ( rule__Condition__IfAssignment_0 ) )
            {
            // InternalGo.g:3606:1: ( ( rule__Condition__IfAssignment_0 ) )
            // InternalGo.g:3607:2: ( rule__Condition__IfAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getIfAssignment_0()); 
            }
            // InternalGo.g:3608:2: ( rule__Condition__IfAssignment_0 )
            // InternalGo.g:3608:3: rule__Condition__IfAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__IfAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getIfAssignment_0()); 
            }

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
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalGo.g:3616:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3620:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalGo.g:3621:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Condition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalGo.g:3628:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ElseifAssignment_1 )* ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3632:1: ( ( ( rule__Condition__ElseifAssignment_1 )* ) )
            // InternalGo.g:3633:1: ( ( rule__Condition__ElseifAssignment_1 )* )
            {
            // InternalGo.g:3633:1: ( ( rule__Condition__ElseifAssignment_1 )* )
            // InternalGo.g:3634:2: ( rule__Condition__ElseifAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getElseifAssignment_1()); 
            }
            // InternalGo.g:3635:2: ( rule__Condition__ElseifAssignment_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==31) ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1==34) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // InternalGo.g:3635:3: rule__Condition__ElseifAssignment_1
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Condition__ElseifAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getElseifAssignment_1()); 
            }

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
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // InternalGo.g:3643:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3647:1: ( rule__Condition__Group__2__Impl )
            // InternalGo.g:3648:2: rule__Condition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalGo.g:3654:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__ElseAssignment_2 )? ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3658:1: ( ( ( rule__Condition__ElseAssignment_2 )? ) )
            // InternalGo.g:3659:1: ( ( rule__Condition__ElseAssignment_2 )? )
            {
            // InternalGo.g:3659:1: ( ( rule__Condition__ElseAssignment_2 )? )
            // InternalGo.g:3660:2: ( rule__Condition__ElseAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getElseAssignment_2()); 
            }
            // InternalGo.g:3661:2: ( rule__Condition__ElseAssignment_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==31) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalGo.g:3661:3: rule__Condition__ElseAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__ElseAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getElseAssignment_2()); 
            }

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
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__IfCondition__Group__0"
    // InternalGo.g:3670:1: rule__IfCondition__Group__0 : rule__IfCondition__Group__0__Impl rule__IfCondition__Group__1 ;
    public final void rule__IfCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3674:1: ( rule__IfCondition__Group__0__Impl rule__IfCondition__Group__1 )
            // InternalGo.g:3675:2: rule__IfCondition__Group__0__Impl rule__IfCondition__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__IfCondition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfCondition__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfCondition__Group__0"


    // $ANTLR start "rule__IfCondition__Group__0__Impl"
    // InternalGo.g:3682:1: rule__IfCondition__Group__0__Impl : ( ruleIF ) ;
    public final void rule__IfCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3686:1: ( ( ruleIF ) )
            // InternalGo.g:3687:1: ( ruleIF )
            {
            // InternalGo.g:3687:1: ( ruleIF )
            // InternalGo.g:3688:2: ruleIF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfConditionAccess().getIFParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIF();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfConditionAccess().getIFParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__IfCondition__Group__0__Impl"


    // $ANTLR start "rule__IfCondition__Group__1"
    // InternalGo.g:3697:1: rule__IfCondition__Group__1 : rule__IfCondition__Group__1__Impl rule__IfCondition__Group__2 ;
    public final void rule__IfCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3701:1: ( rule__IfCondition__Group__1__Impl rule__IfCondition__Group__2 )
            // InternalGo.g:3702:2: rule__IfCondition__Group__1__Impl rule__IfCondition__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__IfCondition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfCondition__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfCondition__Group__1"


    // $ANTLR start "rule__IfCondition__Group__1__Impl"
    // InternalGo.g:3709:1: rule__IfCondition__Group__1__Impl : ( ( rule__IfCondition__CondAssignment_1 ) ) ;
    public final void rule__IfCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3713:1: ( ( ( rule__IfCondition__CondAssignment_1 ) ) )
            // InternalGo.g:3714:1: ( ( rule__IfCondition__CondAssignment_1 ) )
            {
            // InternalGo.g:3714:1: ( ( rule__IfCondition__CondAssignment_1 ) )
            // InternalGo.g:3715:2: ( rule__IfCondition__CondAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfConditionAccess().getCondAssignment_1()); 
            }
            // InternalGo.g:3716:2: ( rule__IfCondition__CondAssignment_1 )
            // InternalGo.g:3716:3: rule__IfCondition__CondAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IfCondition__CondAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfConditionAccess().getCondAssignment_1()); 
            }

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
    // $ANTLR end "rule__IfCondition__Group__1__Impl"


    // $ANTLR start "rule__IfCondition__Group__2"
    // InternalGo.g:3724:1: rule__IfCondition__Group__2 : rule__IfCondition__Group__2__Impl rule__IfCondition__Group__3 ;
    public final void rule__IfCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3728:1: ( rule__IfCondition__Group__2__Impl rule__IfCondition__Group__3 )
            // InternalGo.g:3729:2: rule__IfCondition__Group__2__Impl rule__IfCondition__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__IfCondition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfCondition__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfCondition__Group__2"


    // $ANTLR start "rule__IfCondition__Group__2__Impl"
    // InternalGo.g:3736:1: rule__IfCondition__Group__2__Impl : ( RULE_OPEN_KEY ) ;
    public final void rule__IfCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3740:1: ( ( RULE_OPEN_KEY ) )
            // InternalGo.g:3741:1: ( RULE_OPEN_KEY )
            {
            // InternalGo.g:3741:1: ( RULE_OPEN_KEY )
            // InternalGo.g:3742:2: RULE_OPEN_KEY
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfConditionAccess().getOpen_KeyTerminalRuleCall_2()); 
            }
            match(input,RULE_OPEN_KEY,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfConditionAccess().getOpen_KeyTerminalRuleCall_2()); 
            }

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
    // $ANTLR end "rule__IfCondition__Group__2__Impl"


    // $ANTLR start "rule__IfCondition__Group__3"
    // InternalGo.g:3751:1: rule__IfCondition__Group__3 : rule__IfCondition__Group__3__Impl rule__IfCondition__Group__4 ;
    public final void rule__IfCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3755:1: ( rule__IfCondition__Group__3__Impl rule__IfCondition__Group__4 )
            // InternalGo.g:3756:2: rule__IfCondition__Group__3__Impl rule__IfCondition__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__IfCondition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfCondition__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfCondition__Group__3"


    // $ANTLR start "rule__IfCondition__Group__3__Impl"
    // InternalGo.g:3763:1: rule__IfCondition__Group__3__Impl : ( ( rule__IfCondition__ThenAssignment_3 )* ) ;
    public final void rule__IfCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3767:1: ( ( ( rule__IfCondition__ThenAssignment_3 )* ) )
            // InternalGo.g:3768:1: ( ( rule__IfCondition__ThenAssignment_3 )* )
            {
            // InternalGo.g:3768:1: ( ( rule__IfCondition__ThenAssignment_3 )* )
            // InternalGo.g:3769:2: ( rule__IfCondition__ThenAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfConditionAccess().getThenAssignment_3()); 
            }
            // InternalGo.g:3770:2: ( rule__IfCondition__ThenAssignment_3 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=RULE_EOL && LA36_0<=RULE_ID)||LA36_0==RULE_INT||LA36_0==RULE_OPEN_PARENTHESES||LA36_0==29||(LA36_0>=33 && LA36_0<=35)||LA36_0==39||LA36_0==59) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalGo.g:3770:3: rule__IfCondition__ThenAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__IfCondition__ThenAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfConditionAccess().getThenAssignment_3()); 
            }

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
    // $ANTLR end "rule__IfCondition__Group__3__Impl"


    // $ANTLR start "rule__IfCondition__Group__4"
    // InternalGo.g:3778:1: rule__IfCondition__Group__4 : rule__IfCondition__Group__4__Impl ;
    public final void rule__IfCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3782:1: ( rule__IfCondition__Group__4__Impl )
            // InternalGo.g:3783:2: rule__IfCondition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfCondition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfCondition__Group__4"


    // $ANTLR start "rule__IfCondition__Group__4__Impl"
    // InternalGo.g:3789:1: rule__IfCondition__Group__4__Impl : ( RULE_CLOSED_KEY ) ;
    public final void rule__IfCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3793:1: ( ( RULE_CLOSED_KEY ) )
            // InternalGo.g:3794:1: ( RULE_CLOSED_KEY )
            {
            // InternalGo.g:3794:1: ( RULE_CLOSED_KEY )
            // InternalGo.g:3795:2: RULE_CLOSED_KEY
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfConditionAccess().getClosed_KeyTerminalRuleCall_4()); 
            }
            match(input,RULE_CLOSED_KEY,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfConditionAccess().getClosed_KeyTerminalRuleCall_4()); 
            }

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
    // $ANTLR end "rule__IfCondition__Group__4__Impl"


    // $ANTLR start "rule__ElseIfCondition__Group__0"
    // InternalGo.g:3805:1: rule__ElseIfCondition__Group__0 : rule__ElseIfCondition__Group__0__Impl rule__ElseIfCondition__Group__1 ;
    public final void rule__ElseIfCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3809:1: ( rule__ElseIfCondition__Group__0__Impl rule__ElseIfCondition__Group__1 )
            // InternalGo.g:3810:2: rule__ElseIfCondition__Group__0__Impl rule__ElseIfCondition__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__ElseIfCondition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElseIfCondition__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ElseIfCondition__Group__0"


    // $ANTLR start "rule__ElseIfCondition__Group__0__Impl"
    // InternalGo.g:3817:1: rule__ElseIfCondition__Group__0__Impl : ( ( ruleELSE ) ) ;
    public final void rule__ElseIfCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3821:1: ( ( ( ruleELSE ) ) )
            // InternalGo.g:3822:1: ( ( ruleELSE ) )
            {
            // InternalGo.g:3822:1: ( ( ruleELSE ) )
            // InternalGo.g:3823:2: ( ruleELSE )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseIfConditionAccess().getELSEParserRuleCall_0()); 
            }
            // InternalGo.g:3824:2: ( ruleELSE )
            // InternalGo.g:3824:3: ruleELSE
            {
            pushFollow(FOLLOW_2);
            ruleELSE();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseIfConditionAccess().getELSEParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__ElseIfCondition__Group__0__Impl"


    // $ANTLR start "rule__ElseIfCondition__Group__1"
    // InternalGo.g:3832:1: rule__ElseIfCondition__Group__1 : rule__ElseIfCondition__Group__1__Impl ;
    public final void rule__ElseIfCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3836:1: ( rule__ElseIfCondition__Group__1__Impl )
            // InternalGo.g:3837:2: rule__ElseIfCondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElseIfCondition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ElseIfCondition__Group__1"


    // $ANTLR start "rule__ElseIfCondition__Group__1__Impl"
    // InternalGo.g:3843:1: rule__ElseIfCondition__Group__1__Impl : ( ruleIfCondition ) ;
    public final void rule__ElseIfCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3847:1: ( ( ruleIfCondition ) )
            // InternalGo.g:3848:1: ( ruleIfCondition )
            {
            // InternalGo.g:3848:1: ( ruleIfCondition )
            // InternalGo.g:3849:2: ruleIfCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseIfConditionAccess().getIfConditionParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleIfCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseIfConditionAccess().getIfConditionParserRuleCall_1()); 
            }

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
    // $ANTLR end "rule__ElseIfCondition__Group__1__Impl"


    // $ANTLR start "rule__ElseCondition__Group__0"
    // InternalGo.g:3859:1: rule__ElseCondition__Group__0 : rule__ElseCondition__Group__0__Impl rule__ElseCondition__Group__1 ;
    public final void rule__ElseCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3863:1: ( rule__ElseCondition__Group__0__Impl rule__ElseCondition__Group__1 )
            // InternalGo.g:3864:2: rule__ElseCondition__Group__0__Impl rule__ElseCondition__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ElseCondition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElseCondition__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ElseCondition__Group__0"


    // $ANTLR start "rule__ElseCondition__Group__0__Impl"
    // InternalGo.g:3871:1: rule__ElseCondition__Group__0__Impl : ( ( ruleELSE ) ) ;
    public final void rule__ElseCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3875:1: ( ( ( ruleELSE ) ) )
            // InternalGo.g:3876:1: ( ( ruleELSE ) )
            {
            // InternalGo.g:3876:1: ( ( ruleELSE ) )
            // InternalGo.g:3877:2: ( ruleELSE )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseConditionAccess().getELSEParserRuleCall_0()); 
            }
            // InternalGo.g:3878:2: ( ruleELSE )
            // InternalGo.g:3878:3: ruleELSE
            {
            pushFollow(FOLLOW_2);
            ruleELSE();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseConditionAccess().getELSEParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__ElseCondition__Group__0__Impl"


    // $ANTLR start "rule__ElseCondition__Group__1"
    // InternalGo.g:3886:1: rule__ElseCondition__Group__1 : rule__ElseCondition__Group__1__Impl rule__ElseCondition__Group__2 ;
    public final void rule__ElseCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3890:1: ( rule__ElseCondition__Group__1__Impl rule__ElseCondition__Group__2 )
            // InternalGo.g:3891:2: rule__ElseCondition__Group__1__Impl rule__ElseCondition__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__ElseCondition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElseCondition__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ElseCondition__Group__1"


    // $ANTLR start "rule__ElseCondition__Group__1__Impl"
    // InternalGo.g:3898:1: rule__ElseCondition__Group__1__Impl : ( RULE_OPEN_KEY ) ;
    public final void rule__ElseCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3902:1: ( ( RULE_OPEN_KEY ) )
            // InternalGo.g:3903:1: ( RULE_OPEN_KEY )
            {
            // InternalGo.g:3903:1: ( RULE_OPEN_KEY )
            // InternalGo.g:3904:2: RULE_OPEN_KEY
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseConditionAccess().getOpen_KeyTerminalRuleCall_1()); 
            }
            match(input,RULE_OPEN_KEY,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseConditionAccess().getOpen_KeyTerminalRuleCall_1()); 
            }

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
    // $ANTLR end "rule__ElseCondition__Group__1__Impl"


    // $ANTLR start "rule__ElseCondition__Group__2"
    // InternalGo.g:3913:1: rule__ElseCondition__Group__2 : rule__ElseCondition__Group__2__Impl rule__ElseCondition__Group__3 ;
    public final void rule__ElseCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3917:1: ( rule__ElseCondition__Group__2__Impl rule__ElseCondition__Group__3 )
            // InternalGo.g:3918:2: rule__ElseCondition__Group__2__Impl rule__ElseCondition__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__ElseCondition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElseCondition__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ElseCondition__Group__2"


    // $ANTLR start "rule__ElseCondition__Group__2__Impl"
    // InternalGo.g:3925:1: rule__ElseCondition__Group__2__Impl : ( ( rule__ElseCondition__ThenAssignment_2 )* ) ;
    public final void rule__ElseCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3929:1: ( ( ( rule__ElseCondition__ThenAssignment_2 )* ) )
            // InternalGo.g:3930:1: ( ( rule__ElseCondition__ThenAssignment_2 )* )
            {
            // InternalGo.g:3930:1: ( ( rule__ElseCondition__ThenAssignment_2 )* )
            // InternalGo.g:3931:2: ( rule__ElseCondition__ThenAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseConditionAccess().getThenAssignment_2()); 
            }
            // InternalGo.g:3932:2: ( rule__ElseCondition__ThenAssignment_2 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=RULE_EOL && LA37_0<=RULE_ID)||LA37_0==RULE_INT||LA37_0==RULE_OPEN_PARENTHESES||LA37_0==29||(LA37_0>=33 && LA37_0<=35)||LA37_0==39||LA37_0==59) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalGo.g:3932:3: rule__ElseCondition__ThenAssignment_2
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ElseCondition__ThenAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseConditionAccess().getThenAssignment_2()); 
            }

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
    // $ANTLR end "rule__ElseCondition__Group__2__Impl"


    // $ANTLR start "rule__ElseCondition__Group__3"
    // InternalGo.g:3940:1: rule__ElseCondition__Group__3 : rule__ElseCondition__Group__3__Impl ;
    public final void rule__ElseCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3944:1: ( rule__ElseCondition__Group__3__Impl )
            // InternalGo.g:3945:2: rule__ElseCondition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElseCondition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ElseCondition__Group__3"


    // $ANTLR start "rule__ElseCondition__Group__3__Impl"
    // InternalGo.g:3951:1: rule__ElseCondition__Group__3__Impl : ( RULE_CLOSED_KEY ) ;
    public final void rule__ElseCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3955:1: ( ( RULE_CLOSED_KEY ) )
            // InternalGo.g:3956:1: ( RULE_CLOSED_KEY )
            {
            // InternalGo.g:3956:1: ( RULE_CLOSED_KEY )
            // InternalGo.g:3957:2: RULE_CLOSED_KEY
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseConditionAccess().getClosed_KeyTerminalRuleCall_3()); 
            }
            match(input,RULE_CLOSED_KEY,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseConditionAccess().getClosed_KeyTerminalRuleCall_3()); 
            }

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
    // $ANTLR end "rule__ElseCondition__Group__3__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // InternalGo.g:3967:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3971:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalGo.g:3972:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // InternalGo.g:3979:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3983:1: ( ( ruleAndExpression ) )
            // InternalGo.g:3984:1: ( ruleAndExpression )
            {
            // InternalGo.g:3984:1: ( ruleAndExpression )
            // InternalGo.g:3985:2: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // InternalGo.g:3994:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3998:1: ( rule__OrExpression__Group__1__Impl )
            // InternalGo.g:3999:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // InternalGo.g:4005:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4009:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalGo.g:4010:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalGo.g:4010:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalGo.g:4011:2: ( rule__OrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // InternalGo.g:4012:2: ( rule__OrExpression__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==57) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalGo.g:4012:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__0"
    // InternalGo.g:4021:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4025:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalGo.g:4026:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_31);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrExpression__Group_1__0"


    // $ANTLR start "rule__OrExpression__Group_1__0__Impl"
    // InternalGo.g:4033:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4037:1: ( ( () ) )
            // InternalGo.g:4038:1: ( () )
            {
            // InternalGo.g:4038:1: ( () )
            // InternalGo.g:4039:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0()); 
            }
            // InternalGo.g:4040:2: ()
            // InternalGo.g:4040:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__1"
    // InternalGo.g:4048:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4052:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // InternalGo.g:4053:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrExpression__Group_1__1"


    // $ANTLR start "rule__OrExpression__Group_1__1__Impl"
    // InternalGo.g:4060:1: rule__OrExpression__Group_1__1__Impl : ( '||' ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4064:1: ( ( '||' ) )
            // InternalGo.g:4065:1: ( '||' )
            {
            // InternalGo.g:4065:1: ( '||' )
            // InternalGo.g:4066:2: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            }

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
    // $ANTLR end "rule__OrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__2"
    // InternalGo.g:4075:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4079:1: ( rule__OrExpression__Group_1__2__Impl )
            // InternalGo.g:4080:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrExpression__Group_1__2"


    // $ANTLR start "rule__OrExpression__Group_1__2__Impl"
    // InternalGo.g:4086:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__RightAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4090:1: ( ( ( rule__OrExpression__RightAssignment_1_2 ) ) )
            // InternalGo.g:4091:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            {
            // InternalGo.g:4091:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            // InternalGo.g:4092:2: ( rule__OrExpression__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2()); 
            }
            // InternalGo.g:4093:2: ( rule__OrExpression__RightAssignment_1_2 )
            // InternalGo.g:4093:3: rule__OrExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__OrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // InternalGo.g:4102:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4106:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalGo.g:4107:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // InternalGo.g:4114:1: rule__AndExpression__Group__0__Impl : ( ruleComparisonExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4118:1: ( ( ruleComparisonExpression ) )
            // InternalGo.g:4119:1: ( ruleComparisonExpression )
            {
            // InternalGo.g:4119:1: ( ruleComparisonExpression )
            // InternalGo.g:4120:2: ruleComparisonExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // InternalGo.g:4129:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4133:1: ( rule__AndExpression__Group__1__Impl )
            // InternalGo.g:4134:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // InternalGo.g:4140:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4144:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalGo.g:4145:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalGo.g:4145:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalGo.g:4146:2: ( rule__AndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // InternalGo.g:4147:2: ( rule__AndExpression__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==58) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalGo.g:4147:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // InternalGo.g:4156:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4160:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalGo.g:4161:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_33);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // InternalGo.g:4168:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4172:1: ( ( () ) )
            // InternalGo.g:4173:1: ( () )
            {
            // InternalGo.g:4173:1: ( () )
            // InternalGo.g:4174:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0()); 
            }
            // InternalGo.g:4175:2: ()
            // InternalGo.g:4175:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // InternalGo.g:4183:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4187:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalGo.g:4188:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // InternalGo.g:4195:1: rule__AndExpression__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4199:1: ( ( '&&' ) )
            // InternalGo.g:4200:1: ( '&&' )
            {
            // InternalGo.g:4200:1: ( '&&' )
            // InternalGo.g:4201:2: '&&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getAmpersandAmpersandKeyword_1_1()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getAmpersandAmpersandKeyword_1_1()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__2"
    // InternalGo.g:4210:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4214:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalGo.g:4215:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AndExpression__Group_1__2"


    // $ANTLR start "rule__AndExpression__Group_1__2__Impl"
    // InternalGo.g:4221:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4225:1: ( ( ( rule__AndExpression__RightAssignment_1_2 ) ) )
            // InternalGo.g:4226:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            {
            // InternalGo.g:4226:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            // InternalGo.g:4227:2: ( rule__AndExpression__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 
            }
            // InternalGo.g:4228:2: ( rule__AndExpression__RightAssignment_1_2 )
            // InternalGo.g:4228:3: rule__AndExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__0"
    // InternalGo.g:4237:1: rule__ComparisonExpression__Group__0 : rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 ;
    public final void rule__ComparisonExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4241:1: ( rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 )
            // InternalGo.g:4242:2: rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__ComparisonExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ComparisonExpression__Group__0"


    // $ANTLR start "rule__ComparisonExpression__Group__0__Impl"
    // InternalGo.g:4249:1: rule__ComparisonExpression__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__ComparisonExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4253:1: ( ( rulePrimaryExpression ) )
            // InternalGo.g:4254:1: ( rulePrimaryExpression )
            {
            // InternalGo.g:4254:1: ( rulePrimaryExpression )
            // InternalGo.g:4255:2: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__ComparisonExpression__Group__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__1"
    // InternalGo.g:4264:1: rule__ComparisonExpression__Group__1 : rule__ComparisonExpression__Group__1__Impl ;
    public final void rule__ComparisonExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4268:1: ( rule__ComparisonExpression__Group__1__Impl )
            // InternalGo.g:4269:2: rule__ComparisonExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ComparisonExpression__Group__1"


    // $ANTLR start "rule__ComparisonExpression__Group__1__Impl"
    // InternalGo.g:4275:1: rule__ComparisonExpression__Group__1__Impl : ( ( rule__ComparisonExpression__Group_1__0 )* ) ;
    public final void rule__ComparisonExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4279:1: ( ( ( rule__ComparisonExpression__Group_1__0 )* ) )
            // InternalGo.g:4280:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            {
            // InternalGo.g:4280:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            // InternalGo.g:4281:2: ( rule__ComparisonExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 
            }
            // InternalGo.g:4282:2: ( rule__ComparisonExpression__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=41 && LA40_0<=45)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalGo.g:4282:3: rule__ComparisonExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__ComparisonExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__ComparisonExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__0"
    // InternalGo.g:4291:1: rule__ComparisonExpression__Group_1__0 : rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 ;
    public final void rule__ComparisonExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4295:1: ( rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 )
            // InternalGo.g:4296:2: rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__ComparisonExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ComparisonExpression__Group_1__0"


    // $ANTLR start "rule__ComparisonExpression__Group_1__0__Impl"
    // InternalGo.g:4303:1: rule__ComparisonExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4307:1: ( ( () ) )
            // InternalGo.g:4308:1: ( () )
            {
            // InternalGo.g:4308:1: ( () )
            // InternalGo.g:4309:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0()); 
            }
            // InternalGo.g:4310:2: ()
            // InternalGo.g:4310:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__1"
    // InternalGo.g:4318:1: rule__ComparisonExpression__Group_1__1 : rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 ;
    public final void rule__ComparisonExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4322:1: ( rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 )
            // InternalGo.g:4323:2: rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__ComparisonExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ComparisonExpression__Group_1__1"


    // $ANTLR start "rule__ComparisonExpression__Group_1__1__Impl"
    // InternalGo.g:4330:1: rule__ComparisonExpression__Group_1__1__Impl : ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparisonExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4334:1: ( ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) )
            // InternalGo.g:4335:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            {
            // InternalGo.g:4335:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            // InternalGo.g:4336:2: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalGo.g:4337:2: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            // InternalGo.g:4337:3: rule__ComparisonExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__ComparisonExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__2"
    // InternalGo.g:4345:1: rule__ComparisonExpression__Group_1__2 : rule__ComparisonExpression__Group_1__2__Impl ;
    public final void rule__ComparisonExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4349:1: ( rule__ComparisonExpression__Group_1__2__Impl )
            // InternalGo.g:4350:2: rule__ComparisonExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ComparisonExpression__Group_1__2"


    // $ANTLR start "rule__ComparisonExpression__Group_1__2__Impl"
    // InternalGo.g:4356:1: rule__ComparisonExpression__Group_1__2__Impl : ( ( rule__ComparisonExpression__RightAssignment_1_2 ) ) ;
    public final void rule__ComparisonExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4360:1: ( ( ( rule__ComparisonExpression__RightAssignment_1_2 ) ) )
            // InternalGo.g:4361:1: ( ( rule__ComparisonExpression__RightAssignment_1_2 ) )
            {
            // InternalGo.g:4361:1: ( ( rule__ComparisonExpression__RightAssignment_1_2 ) )
            // InternalGo.g:4362:2: ( rule__ComparisonExpression__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getRightAssignment_1_2()); 
            }
            // InternalGo.g:4363:2: ( rule__ComparisonExpression__RightAssignment_1_2 )
            // InternalGo.g:4363:3: rule__ComparisonExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getRightAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__ComparisonExpression__Group_1__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0"
    // InternalGo.g:4372:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4376:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // InternalGo.g:4377:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__PrimaryExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__0"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0__Impl"
    // InternalGo.g:4384:1: rule__PrimaryExpression__Group_0__0__Impl : ( RULE_OPEN_PARENTHESES ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4388:1: ( ( RULE_OPEN_PARENTHESES ) )
            // InternalGo.g:4389:1: ( RULE_OPEN_PARENTHESES )
            {
            // InternalGo.g:4389:1: ( RULE_OPEN_PARENTHESES )
            // InternalGo.g:4390:2: RULE_OPEN_PARENTHESES
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getOpen_parenthesesTerminalRuleCall_0_0()); 
            }
            match(input,RULE_OPEN_PARENTHESES,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getOpen_parenthesesTerminalRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1"
    // InternalGo.g:4399:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4403:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // InternalGo.g:4404:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_20);
            rule__PrimaryExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__1"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1__Impl"
    // InternalGo.g:4411:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4415:1: ( ( ruleExpression ) )
            // InternalGo.g:4416:1: ( ruleExpression )
            {
            // InternalGo.g:4416:1: ( ruleExpression )
            // InternalGo.g:4417:2: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
            }

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2"
    // InternalGo.g:4426:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4430:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // InternalGo.g:4431:2: rule__PrimaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__2"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2__Impl"
    // InternalGo.g:4437:1: rule__PrimaryExpression__Group_0__2__Impl : ( RULE_CLOSED_PARENTHESES ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4441:1: ( ( RULE_CLOSED_PARENTHESES ) )
            // InternalGo.g:4442:1: ( RULE_CLOSED_PARENTHESES )
            {
            // InternalGo.g:4442:1: ( RULE_CLOSED_PARENTHESES )
            // InternalGo.g:4443:2: RULE_CLOSED_PARENTHESES
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getClosed_parenthesesTerminalRuleCall_0_2()); 
            }
            match(input,RULE_CLOSED_PARENTHESES,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getClosed_parenthesesTerminalRuleCall_0_2()); 
            }

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__2__Impl"


    // $ANTLR start "rule__Literal__Group_0__0"
    // InternalGo.g:4453:1: rule__Literal__Group_0__0 : rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 ;
    public final void rule__Literal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4457:1: ( rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 )
            // InternalGo.g:4458:2: rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__Literal__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Literal__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Literal__Group_0__0"


    // $ANTLR start "rule__Literal__Group_0__0__Impl"
    // InternalGo.g:4465:1: rule__Literal__Group_0__0__Impl : ( () ) ;
    public final void rule__Literal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4469:1: ( ( () ) )
            // InternalGo.g:4470:1: ( () )
            {
            // InternalGo.g:4470:1: ( () )
            // InternalGo.g:4471:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getLiteralAction_0_0()); 
            }
            // InternalGo.g:4472:2: ()
            // InternalGo.g:4472:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getLiteralAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__0__Impl"


    // $ANTLR start "rule__Literal__Group_0__1"
    // InternalGo.g:4480:1: rule__Literal__Group_0__1 : rule__Literal__Group_0__1__Impl ;
    public final void rule__Literal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4484:1: ( rule__Literal__Group_0__1__Impl )
            // InternalGo.g:4485:2: rule__Literal__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Literal__Group_0__1"


    // $ANTLR start "rule__Literal__Group_0__1__Impl"
    // InternalGo.g:4491:1: rule__Literal__Group_0__1__Impl : ( ( rule__Literal__ValueAssignment_0_1 ) ) ;
    public final void rule__Literal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4495:1: ( ( ( rule__Literal__ValueAssignment_0_1 ) ) )
            // InternalGo.g:4496:1: ( ( rule__Literal__ValueAssignment_0_1 ) )
            {
            // InternalGo.g:4496:1: ( ( rule__Literal__ValueAssignment_0_1 ) )
            // InternalGo.g:4497:2: ( rule__Literal__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getValueAssignment_0_1()); 
            }
            // InternalGo.g:4498:2: ( rule__Literal__ValueAssignment_0_1 )
            // InternalGo.g:4498:3: rule__Literal__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Literal__ValueAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getValueAssignment_0_1()); 
            }

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
    // $ANTLR end "rule__Literal__Group_0__1__Impl"


    // $ANTLR start "rule__DecFunc__Group__0"
    // InternalGo.g:4507:1: rule__DecFunc__Group__0 : rule__DecFunc__Group__0__Impl rule__DecFunc__Group__1 ;
    public final void rule__DecFunc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4511:1: ( rule__DecFunc__Group__0__Impl rule__DecFunc__Group__1 )
            // InternalGo.g:4512:2: rule__DecFunc__Group__0__Impl rule__DecFunc__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DecFunc__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecFunc__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:4519:1: rule__DecFunc__Group__0__Impl : ( ruleFUNC ) ;
    public final void rule__DecFunc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4523:1: ( ( ruleFUNC ) )
            // InternalGo.g:4524:1: ( ruleFUNC )
            {
            // InternalGo.g:4524:1: ( ruleFUNC )
            // InternalGo.g:4525:2: ruleFUNC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecFuncAccess().getFUNCParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFUNC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecFuncAccess().getFUNCParserRuleCall_0()); 
            }

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
    // InternalGo.g:4534:1: rule__DecFunc__Group__1 : rule__DecFunc__Group__1__Impl rule__DecFunc__Group__2 ;
    public final void rule__DecFunc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4538:1: ( rule__DecFunc__Group__1__Impl rule__DecFunc__Group__2 )
            // InternalGo.g:4539:2: rule__DecFunc__Group__1__Impl rule__DecFunc__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__DecFunc__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecFunc__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:4546:1: rule__DecFunc__Group__1__Impl : ( ( rule__DecFunc__NameAssignment_1 ) ) ;
    public final void rule__DecFunc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4550:1: ( ( ( rule__DecFunc__NameAssignment_1 ) ) )
            // InternalGo.g:4551:1: ( ( rule__DecFunc__NameAssignment_1 ) )
            {
            // InternalGo.g:4551:1: ( ( rule__DecFunc__NameAssignment_1 ) )
            // InternalGo.g:4552:2: ( rule__DecFunc__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecFuncAccess().getNameAssignment_1()); 
            }
            // InternalGo.g:4553:2: ( rule__DecFunc__NameAssignment_1 )
            // InternalGo.g:4553:3: rule__DecFunc__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DecFunc__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecFuncAccess().getNameAssignment_1()); 
            }

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
    // InternalGo.g:4561:1: rule__DecFunc__Group__2 : rule__DecFunc__Group__2__Impl rule__DecFunc__Group__3 ;
    public final void rule__DecFunc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4565:1: ( rule__DecFunc__Group__2__Impl rule__DecFunc__Group__3 )
            // InternalGo.g:4566:2: rule__DecFunc__Group__2__Impl rule__DecFunc__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__DecFunc__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecFunc__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:4573:1: rule__DecFunc__Group__2__Impl : ( RULE_OPEN_PARENTHESES ) ;
    public final void rule__DecFunc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4577:1: ( ( RULE_OPEN_PARENTHESES ) )
            // InternalGo.g:4578:1: ( RULE_OPEN_PARENTHESES )
            {
            // InternalGo.g:4578:1: ( RULE_OPEN_PARENTHESES )
            // InternalGo.g:4579:2: RULE_OPEN_PARENTHESES
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecFuncAccess().getOpen_parenthesesTerminalRuleCall_2()); 
            }
            match(input,RULE_OPEN_PARENTHESES,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecFuncAccess().getOpen_parenthesesTerminalRuleCall_2()); 
            }

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
    // InternalGo.g:4588:1: rule__DecFunc__Group__3 : rule__DecFunc__Group__3__Impl rule__DecFunc__Group__4 ;
    public final void rule__DecFunc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4592:1: ( rule__DecFunc__Group__3__Impl rule__DecFunc__Group__4 )
            // InternalGo.g:4593:2: rule__DecFunc__Group__3__Impl rule__DecFunc__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__DecFunc__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecFunc__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:4600:1: rule__DecFunc__Group__3__Impl : ( ( rule__DecFunc__ParamAssignment_3 )* ) ;
    public final void rule__DecFunc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4604:1: ( ( ( rule__DecFunc__ParamAssignment_3 )* ) )
            // InternalGo.g:4605:1: ( ( rule__DecFunc__ParamAssignment_3 )* )
            {
            // InternalGo.g:4605:1: ( ( rule__DecFunc__ParamAssignment_3 )* )
            // InternalGo.g:4606:2: ( rule__DecFunc__ParamAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecFuncAccess().getParamAssignment_3()); 
            }
            // InternalGo.g:4607:2: ( rule__DecFunc__ParamAssignment_3 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalGo.g:4607:3: rule__DecFunc__ParamAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__DecFunc__ParamAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecFuncAccess().getParamAssignment_3()); 
            }

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
    // InternalGo.g:4615:1: rule__DecFunc__Group__4 : rule__DecFunc__Group__4__Impl rule__DecFunc__Group__5 ;
    public final void rule__DecFunc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4619:1: ( rule__DecFunc__Group__4__Impl rule__DecFunc__Group__5 )
            // InternalGo.g:4620:2: rule__DecFunc__Group__4__Impl rule__DecFunc__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__DecFunc__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecFunc__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:4627:1: rule__DecFunc__Group__4__Impl : ( RULE_CLOSED_PARENTHESES ) ;
    public final void rule__DecFunc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4631:1: ( ( RULE_CLOSED_PARENTHESES ) )
            // InternalGo.g:4632:1: ( RULE_CLOSED_PARENTHESES )
            {
            // InternalGo.g:4632:1: ( RULE_CLOSED_PARENTHESES )
            // InternalGo.g:4633:2: RULE_CLOSED_PARENTHESES
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecFuncAccess().getClosed_parenthesesTerminalRuleCall_4()); 
            }
            match(input,RULE_CLOSED_PARENTHESES,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecFuncAccess().getClosed_parenthesesTerminalRuleCall_4()); 
            }

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
    // InternalGo.g:4642:1: rule__DecFunc__Group__5 : rule__DecFunc__Group__5__Impl rule__DecFunc__Group__6 ;
    public final void rule__DecFunc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4646:1: ( rule__DecFunc__Group__5__Impl rule__DecFunc__Group__6 )
            // InternalGo.g:4647:2: rule__DecFunc__Group__5__Impl rule__DecFunc__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__DecFunc__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecFunc__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:4654:1: rule__DecFunc__Group__5__Impl : ( RULE_OPEN_KEY ) ;
    public final void rule__DecFunc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4658:1: ( ( RULE_OPEN_KEY ) )
            // InternalGo.g:4659:1: ( RULE_OPEN_KEY )
            {
            // InternalGo.g:4659:1: ( RULE_OPEN_KEY )
            // InternalGo.g:4660:2: RULE_OPEN_KEY
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecFuncAccess().getOpen_KeyTerminalRuleCall_5()); 
            }
            match(input,RULE_OPEN_KEY,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecFuncAccess().getOpen_KeyTerminalRuleCall_5()); 
            }

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
    // InternalGo.g:4669:1: rule__DecFunc__Group__6 : rule__DecFunc__Group__6__Impl rule__DecFunc__Group__7 ;
    public final void rule__DecFunc__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4673:1: ( rule__DecFunc__Group__6__Impl rule__DecFunc__Group__7 )
            // InternalGo.g:4674:2: rule__DecFunc__Group__6__Impl rule__DecFunc__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__DecFunc__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecFunc__Group__7();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:4681:1: rule__DecFunc__Group__6__Impl : ( ( rule__DecFunc__ArgsAssignment_6 )* ) ;
    public final void rule__DecFunc__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4685:1: ( ( ( rule__DecFunc__ArgsAssignment_6 )* ) )
            // InternalGo.g:4686:1: ( ( rule__DecFunc__ArgsAssignment_6 )* )
            {
            // InternalGo.g:4686:1: ( ( rule__DecFunc__ArgsAssignment_6 )* )
            // InternalGo.g:4687:2: ( rule__DecFunc__ArgsAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecFuncAccess().getArgsAssignment_6()); 
            }
            // InternalGo.g:4688:2: ( rule__DecFunc__ArgsAssignment_6 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_EOL && LA42_0<=RULE_ID)||LA42_0==RULE_INT||LA42_0==RULE_OPEN_PARENTHESES||LA42_0==29||(LA42_0>=33 && LA42_0<=35)||LA42_0==39||LA42_0==59) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalGo.g:4688:3: rule__DecFunc__ArgsAssignment_6
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__DecFunc__ArgsAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecFuncAccess().getArgsAssignment_6()); 
            }

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
    // InternalGo.g:4696:1: rule__DecFunc__Group__7 : rule__DecFunc__Group__7__Impl ;
    public final void rule__DecFunc__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4700:1: ( rule__DecFunc__Group__7__Impl )
            // InternalGo.g:4701:2: rule__DecFunc__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecFunc__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:4707:1: rule__DecFunc__Group__7__Impl : ( RULE_CLOSED_KEY ) ;
    public final void rule__DecFunc__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4711:1: ( ( RULE_CLOSED_KEY ) )
            // InternalGo.g:4712:1: ( RULE_CLOSED_KEY )
            {
            // InternalGo.g:4712:1: ( RULE_CLOSED_KEY )
            // InternalGo.g:4713:2: RULE_CLOSED_KEY
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecFuncAccess().getClosed_KeyTerminalRuleCall_7()); 
            }
            match(input,RULE_CLOSED_KEY,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecFuncAccess().getClosed_KeyTerminalRuleCall_7()); 
            }

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


    // $ANTLR start "rule__DataType__Group__0"
    // InternalGo.g:4723:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4727:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalGo.g:4728:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DataType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DataType__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:4735:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4739:1: ( ( 'datatype' ) )
            // InternalGo.g:4740:1: ( 'datatype' )
            {
            // InternalGo.g:4740:1: ( 'datatype' )
            // InternalGo.g:4741:2: 'datatype'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            }

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
    // InternalGo.g:4750:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4754:1: ( rule__DataType__Group__1__Impl )
            // InternalGo.g:4755:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalGo.g:4761:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4765:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalGo.g:4766:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalGo.g:4766:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalGo.g:4767:2: ( rule__DataType__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            }
            // InternalGo.g:4768:2: ( rule__DataType__NameAssignment_1 )
            // InternalGo.g:4768:3: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            }

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
    // InternalGo.g:4777:1: rule__Go__ElementsAssignment : ( ruleGreeting ) ;
    public final void rule__Go__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4781:1: ( ( ruleGreeting ) )
            // InternalGo.g:4782:2: ( ruleGreeting )
            {
            // InternalGo.g:4782:2: ( ruleGreeting )
            // InternalGo.g:4783:3: ruleGreeting
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoAccess().getElementsGreetingParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGreeting();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoAccess().getElementsGreetingParserRuleCall_0()); 
            }

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


    // $ANTLR start "rule__DecVar__VarsAssignment_1_1"
    // InternalGo.g:4792:1: rule__DecVar__VarsAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__DecVar__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4796:1: ( ( RULE_ID ) )
            // InternalGo.g:4797:2: ( RULE_ID )
            {
            // InternalGo.g:4797:2: ( RULE_ID )
            // InternalGo.g:4798:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getVarsIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getVarsIDTerminalRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__DecVar__VarsAssignment_1_1"


    // $ANTLR start "rule__DecVar__VarsAssignment_1_2_1"
    // InternalGo.g:4807:1: rule__DecVar__VarsAssignment_1_2_1 : ( RULE_ID ) ;
    public final void rule__DecVar__VarsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4811:1: ( ( RULE_ID ) )
            // InternalGo.g:4812:2: ( RULE_ID )
            {
            // InternalGo.g:4812:2: ( RULE_ID )
            // InternalGo.g:4813:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getVarsIDTerminalRuleCall_1_2_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getVarsIDTerminalRuleCall_1_2_1_0()); 
            }

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
    // $ANTLR end "rule__DecVar__VarsAssignment_1_2_1"


    // $ANTLR start "rule__DecVar__AtrbAssignment_1_4_1"
    // InternalGo.g:4822:1: rule__DecVar__AtrbAssignment_1_4_1 : ( ( rule__DecVar__AtrbAlternatives_1_4_1_0 ) ) ;
    public final void rule__DecVar__AtrbAssignment_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4826:1: ( ( ( rule__DecVar__AtrbAlternatives_1_4_1_0 ) ) )
            // InternalGo.g:4827:2: ( ( rule__DecVar__AtrbAlternatives_1_4_1_0 ) )
            {
            // InternalGo.g:4827:2: ( ( rule__DecVar__AtrbAlternatives_1_4_1_0 ) )
            // InternalGo.g:4828:3: ( rule__DecVar__AtrbAlternatives_1_4_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getAtrbAlternatives_1_4_1_0()); 
            }
            // InternalGo.g:4829:3: ( rule__DecVar__AtrbAlternatives_1_4_1_0 )
            // InternalGo.g:4829:4: rule__DecVar__AtrbAlternatives_1_4_1_0
            {
            pushFollow(FOLLOW_2);
            rule__DecVar__AtrbAlternatives_1_4_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getAtrbAlternatives_1_4_1_0()); 
            }

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
    // $ANTLR end "rule__DecVar__AtrbAssignment_1_4_1"


    // $ANTLR start "rule__DecVar__AtrbAssignment_1_4_2_1"
    // InternalGo.g:4837:1: rule__DecVar__AtrbAssignment_1_4_2_1 : ( ( rule__DecVar__AtrbAlternatives_1_4_2_1_0 ) ) ;
    public final void rule__DecVar__AtrbAssignment_1_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4841:1: ( ( ( rule__DecVar__AtrbAlternatives_1_4_2_1_0 ) ) )
            // InternalGo.g:4842:2: ( ( rule__DecVar__AtrbAlternatives_1_4_2_1_0 ) )
            {
            // InternalGo.g:4842:2: ( ( rule__DecVar__AtrbAlternatives_1_4_2_1_0 ) )
            // InternalGo.g:4843:3: ( rule__DecVar__AtrbAlternatives_1_4_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getAtrbAlternatives_1_4_2_1_0()); 
            }
            // InternalGo.g:4844:3: ( rule__DecVar__AtrbAlternatives_1_4_2_1_0 )
            // InternalGo.g:4844:4: rule__DecVar__AtrbAlternatives_1_4_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__DecVar__AtrbAlternatives_1_4_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getAtrbAlternatives_1_4_2_1_0()); 
            }

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
    // $ANTLR end "rule__DecVar__AtrbAssignment_1_4_2_1"


    // $ANTLR start "rule__MultDecVars__NameAssignment_2_0"
    // InternalGo.g:4852:1: rule__MultDecVars__NameAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__MultDecVars__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4856:1: ( ( RULE_ID ) )
            // InternalGo.g:4857:2: ( RULE_ID )
            {
            // InternalGo.g:4857:2: ( RULE_ID )
            // InternalGo.g:4858:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultDecVarsAccess().getNameIDTerminalRuleCall_2_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultDecVarsAccess().getNameIDTerminalRuleCall_2_0_0()); 
            }

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
    // $ANTLR end "rule__MultDecVars__NameAssignment_2_0"


    // $ANTLR start "rule__MultDecVars__ValueAssignment_2_2_1"
    // InternalGo.g:4867:1: rule__MultDecVars__ValueAssignment_2_2_1 : ( RULE_ID ) ;
    public final void rule__MultDecVars__ValueAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4871:1: ( ( RULE_ID ) )
            // InternalGo.g:4872:2: ( RULE_ID )
            {
            // InternalGo.g:4872:2: ( RULE_ID )
            // InternalGo.g:4873:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultDecVarsAccess().getValueIDTerminalRuleCall_2_2_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultDecVarsAccess().getValueIDTerminalRuleCall_2_2_1_0()); 
            }

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
    // $ANTLR end "rule__MultDecVars__ValueAssignment_2_2_1"


    // $ANTLR start "rule__DecVars__VarsAssignment_0"
    // InternalGo.g:4882:1: rule__DecVars__VarsAssignment_0 : ( RULE_ID ) ;
    public final void rule__DecVars__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4886:1: ( ( RULE_ID ) )
            // InternalGo.g:4887:2: ( RULE_ID )
            {
            // InternalGo.g:4887:2: ( RULE_ID )
            // InternalGo.g:4888:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarsAccess().getVarsIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarsAccess().getVarsIDTerminalRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__DecVars__VarsAssignment_0"


    // $ANTLR start "rule__DecVars__VarsAssignment_1_1"
    // InternalGo.g:4897:1: rule__DecVars__VarsAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__DecVars__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4901:1: ( ( RULE_ID ) )
            // InternalGo.g:4902:2: ( RULE_ID )
            {
            // InternalGo.g:4902:2: ( RULE_ID )
            // InternalGo.g:4903:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarsAccess().getVarsIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarsAccess().getVarsIDTerminalRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__DecVars__VarsAssignment_1_1"


    // $ANTLR start "rule__DecVars__AtrbAssignment_3"
    // InternalGo.g:4912:1: rule__DecVars__AtrbAssignment_3 : ( ( rule__DecVars__AtrbAlternatives_3_0 ) ) ;
    public final void rule__DecVars__AtrbAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4916:1: ( ( ( rule__DecVars__AtrbAlternatives_3_0 ) ) )
            // InternalGo.g:4917:2: ( ( rule__DecVars__AtrbAlternatives_3_0 ) )
            {
            // InternalGo.g:4917:2: ( ( rule__DecVars__AtrbAlternatives_3_0 ) )
            // InternalGo.g:4918:3: ( rule__DecVars__AtrbAlternatives_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarsAccess().getAtrbAlternatives_3_0()); 
            }
            // InternalGo.g:4919:3: ( rule__DecVars__AtrbAlternatives_3_0 )
            // InternalGo.g:4919:4: rule__DecVars__AtrbAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__DecVars__AtrbAlternatives_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarsAccess().getAtrbAlternatives_3_0()); 
            }

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
    // $ANTLR end "rule__DecVars__AtrbAssignment_3"


    // $ANTLR start "rule__DecVars__AtrbAssignment_4_1"
    // InternalGo.g:4927:1: rule__DecVars__AtrbAssignment_4_1 : ( ( rule__DecVars__AtrbAlternatives_4_1_0 ) ) ;
    public final void rule__DecVars__AtrbAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4931:1: ( ( ( rule__DecVars__AtrbAlternatives_4_1_0 ) ) )
            // InternalGo.g:4932:2: ( ( rule__DecVars__AtrbAlternatives_4_1_0 ) )
            {
            // InternalGo.g:4932:2: ( ( rule__DecVars__AtrbAlternatives_4_1_0 ) )
            // InternalGo.g:4933:3: ( rule__DecVars__AtrbAlternatives_4_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarsAccess().getAtrbAlternatives_4_1_0()); 
            }
            // InternalGo.g:4934:3: ( rule__DecVars__AtrbAlternatives_4_1_0 )
            // InternalGo.g:4934:4: rule__DecVars__AtrbAlternatives_4_1_0
            {
            pushFollow(FOLLOW_2);
            rule__DecVars__AtrbAlternatives_4_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarsAccess().getAtrbAlternatives_4_1_0()); 
            }

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
    // $ANTLR end "rule__DecVars__AtrbAssignment_4_1"


    // $ANTLR start "rule__Params__ParamsAssignment_0"
    // InternalGo.g:4942:1: rule__Params__ParamsAssignment_0 : ( RULE_ID ) ;
    public final void rule__Params__ParamsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4946:1: ( ( RULE_ID ) )
            // InternalGo.g:4947:2: ( RULE_ID )
            {
            // InternalGo.g:4947:2: ( RULE_ID )
            // InternalGo.g:4948:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamsAccess().getParamsIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamsAccess().getParamsIDTerminalRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__Params__ParamsAssignment_0"


    // $ANTLR start "rule__Params__ParamsAssignment_2_1"
    // InternalGo.g:4957:1: rule__Params__ParamsAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Params__ParamsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4961:1: ( ( RULE_ID ) )
            // InternalGo.g:4962:2: ( RULE_ID )
            {
            // InternalGo.g:4962:2: ( RULE_ID )
            // InternalGo.g:4963:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamsAccess().getParamsIDTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamsAccess().getParamsIDTerminalRuleCall_2_1_0()); 
            }

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
    // $ANTLR end "rule__Params__ParamsAssignment_2_1"


    // $ANTLR start "rule__Operations__OAssignment_1"
    // InternalGo.g:4972:1: rule__Operations__OAssignment_1 : ( ruleI ) ;
    public final void rule__Operations__OAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4976:1: ( ( ruleI ) )
            // InternalGo.g:4977:2: ( ruleI )
            {
            // InternalGo.g:4977:2: ( ruleI )
            // InternalGo.g:4978:3: ruleI
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationsAccess().getOIParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleI();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationsAccess().getOIParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__Operations__OAssignment_1"


    // $ANTLR start "rule__I__OAssignment_0_2"
    // InternalGo.g:4987:1: rule__I__OAssignment_0_2 : ( ruleI ) ;
    public final void rule__I__OAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4991:1: ( ( ruleI ) )
            // InternalGo.g:4992:2: ( ruleI )
            {
            // InternalGo.g:4992:2: ( ruleI )
            // InternalGo.g:4993:3: ruleI
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIAccess().getOIParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleI();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIAccess().getOIParserRuleCall_0_2_0()); 
            }

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
    // $ANTLR end "rule__I__OAssignment_0_2"


    // $ANTLR start "rule__I__OAssignment_1_2"
    // InternalGo.g:5002:1: rule__I__OAssignment_1_2 : ( ruleI ) ;
    public final void rule__I__OAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5006:1: ( ( ruleI ) )
            // InternalGo.g:5007:2: ( ruleI )
            {
            // InternalGo.g:5007:2: ( ruleI )
            // InternalGo.g:5008:3: ruleI
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIAccess().getOIParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleI();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIAccess().getOIParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__I__OAssignment_1_2"


    // $ANTLR start "rule__T__OAssignment_1"
    // InternalGo.g:5017:1: rule__T__OAssignment_1 : ( ruleY ) ;
    public final void rule__T__OAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5021:1: ( ( ruleY ) )
            // InternalGo.g:5022:2: ( ruleY )
            {
            // InternalGo.g:5022:2: ( ruleY )
            // InternalGo.g:5023:3: ruleY
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTAccess().getOYParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleY();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTAccess().getOYParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__T__OAssignment_1"


    // $ANTLR start "rule__Y__OAssignment_0_1"
    // InternalGo.g:5032:1: rule__Y__OAssignment_0_1 : ( ruleF ) ;
    public final void rule__Y__OAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5036:1: ( ( ruleF ) )
            // InternalGo.g:5037:2: ( ruleF )
            {
            // InternalGo.g:5037:2: ( ruleF )
            // InternalGo.g:5038:3: ruleF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAccess().getOFParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleF();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAccess().getOFParserRuleCall_0_1_0()); 
            }

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
    // $ANTLR end "rule__Y__OAssignment_0_1"


    // $ANTLR start "rule__Y__OAssignment_0_2"
    // InternalGo.g:5047:1: rule__Y__OAssignment_0_2 : ( ruleY ) ;
    public final void rule__Y__OAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5051:1: ( ( ruleY ) )
            // InternalGo.g:5052:2: ( ruleY )
            {
            // InternalGo.g:5052:2: ( ruleY )
            // InternalGo.g:5053:3: ruleY
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAccess().getOYParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleY();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAccess().getOYParserRuleCall_0_2_0()); 
            }

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
    // $ANTLR end "rule__Y__OAssignment_0_2"


    // $ANTLR start "rule__Y__OAssignment_1_1"
    // InternalGo.g:5062:1: rule__Y__OAssignment_1_1 : ( ruleF ) ;
    public final void rule__Y__OAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5066:1: ( ( ruleF ) )
            // InternalGo.g:5067:2: ( ruleF )
            {
            // InternalGo.g:5067:2: ( ruleF )
            // InternalGo.g:5068:3: ruleF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAccess().getOFParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleF();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAccess().getOFParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__Y__OAssignment_1_1"


    // $ANTLR start "rule__Y__OAssignment_1_2"
    // InternalGo.g:5077:1: rule__Y__OAssignment_1_2 : ( ruleY ) ;
    public final void rule__Y__OAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5081:1: ( ( ruleY ) )
            // InternalGo.g:5082:2: ( ruleY )
            {
            // InternalGo.g:5082:2: ( ruleY )
            // InternalGo.g:5083:3: ruleY
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAccess().getOYParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleY();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAccess().getOYParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__Y__OAssignment_1_2"


    // $ANTLR start "rule__F__OAssignment_0_1"
    // InternalGo.g:5092:1: rule__F__OAssignment_0_1 : ( ruleOperations ) ;
    public final void rule__F__OAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5096:1: ( ( ruleOperations ) )
            // InternalGo.g:5097:2: ( ruleOperations )
            {
            // InternalGo.g:5097:2: ( ruleOperations )
            // InternalGo.g:5098:3: ruleOperations
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFAccess().getOOperationsParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOperations();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFAccess().getOOperationsParserRuleCall_0_1_0()); 
            }

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
    // $ANTLR end "rule__F__OAssignment_0_1"


    // $ANTLR start "rule__Condition__IfAssignment_0"
    // InternalGo.g:5107:1: rule__Condition__IfAssignment_0 : ( ruleIfCondition ) ;
    public final void rule__Condition__IfAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5111:1: ( ( ruleIfCondition ) )
            // InternalGo.g:5112:2: ( ruleIfCondition )
            {
            // InternalGo.g:5112:2: ( ruleIfCondition )
            // InternalGo.g:5113:3: ruleIfCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getIfIfConditionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIfCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getIfIfConditionParserRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__Condition__IfAssignment_0"


    // $ANTLR start "rule__Condition__ElseifAssignment_1"
    // InternalGo.g:5122:1: rule__Condition__ElseifAssignment_1 : ( ruleElseIfCondition ) ;
    public final void rule__Condition__ElseifAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5126:1: ( ( ruleElseIfCondition ) )
            // InternalGo.g:5127:2: ( ruleElseIfCondition )
            {
            // InternalGo.g:5127:2: ( ruleElseIfCondition )
            // InternalGo.g:5128:3: ruleElseIfCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getElseifElseIfConditionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleElseIfCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getElseifElseIfConditionParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__Condition__ElseifAssignment_1"


    // $ANTLR start "rule__Condition__ElseAssignment_2"
    // InternalGo.g:5137:1: rule__Condition__ElseAssignment_2 : ( ruleElseCondition ) ;
    public final void rule__Condition__ElseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5141:1: ( ( ruleElseCondition ) )
            // InternalGo.g:5142:2: ( ruleElseCondition )
            {
            // InternalGo.g:5142:2: ( ruleElseCondition )
            // InternalGo.g:5143:3: ruleElseCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getElseElseConditionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleElseCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getElseElseConditionParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__Condition__ElseAssignment_2"


    // $ANTLR start "rule__IfCondition__CondAssignment_1"
    // InternalGo.g:5152:1: rule__IfCondition__CondAssignment_1 : ( ruleExpression ) ;
    public final void rule__IfCondition__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5156:1: ( ( ruleExpression ) )
            // InternalGo.g:5157:2: ( ruleExpression )
            {
            // InternalGo.g:5157:2: ( ruleExpression )
            // InternalGo.g:5158:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfConditionAccess().getCondExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfConditionAccess().getCondExpressionParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__IfCondition__CondAssignment_1"


    // $ANTLR start "rule__IfCondition__ThenAssignment_3"
    // InternalGo.g:5167:1: rule__IfCondition__ThenAssignment_3 : ( ruleGreeting ) ;
    public final void rule__IfCondition__ThenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5171:1: ( ( ruleGreeting ) )
            // InternalGo.g:5172:2: ( ruleGreeting )
            {
            // InternalGo.g:5172:2: ( ruleGreeting )
            // InternalGo.g:5173:3: ruleGreeting
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfConditionAccess().getThenGreetingParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGreeting();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfConditionAccess().getThenGreetingParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__IfCondition__ThenAssignment_3"


    // $ANTLR start "rule__ElseCondition__ThenAssignment_2"
    // InternalGo.g:5182:1: rule__ElseCondition__ThenAssignment_2 : ( ruleGreeting ) ;
    public final void rule__ElseCondition__ThenAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5186:1: ( ( ruleGreeting ) )
            // InternalGo.g:5187:2: ( ruleGreeting )
            {
            // InternalGo.g:5187:2: ( ruleGreeting )
            // InternalGo.g:5188:3: ruleGreeting
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseConditionAccess().getThenGreetingParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGreeting();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseConditionAccess().getThenGreetingParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__ElseCondition__ThenAssignment_2"


    // $ANTLR start "rule__OrExpression__RightAssignment_1_2"
    // InternalGo.g:5197:1: rule__OrExpression__RightAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5201:1: ( ( ruleAndExpression ) )
            // InternalGo.g:5202:2: ( ruleAndExpression )
            {
            // InternalGo.g:5202:2: ( ruleAndExpression )
            // InternalGo.g:5203:3: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__OrExpression__RightAssignment_1_2"


    // $ANTLR start "rule__AndExpression__RightAssignment_1_2"
    // InternalGo.g:5212:1: rule__AndExpression__RightAssignment_1_2 : ( ruleComparisonExpression ) ;
    public final void rule__AndExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5216:1: ( ( ruleComparisonExpression ) )
            // InternalGo.g:5217:2: ( ruleComparisonExpression )
            {
            // InternalGo.g:5217:2: ( ruleComparisonExpression )
            // InternalGo.g:5218:3: ruleComparisonExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__AndExpression__RightAssignment_1_2"


    // $ANTLR start "rule__ComparisonExpression__OperatorAssignment_1_1"
    // InternalGo.g:5227:1: rule__ComparisonExpression__OperatorAssignment_1_1 : ( ( rule__ComparisonExpression__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__ComparisonExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5231:1: ( ( ( rule__ComparisonExpression__OperatorAlternatives_1_1_0 ) ) )
            // InternalGo.g:5232:2: ( ( rule__ComparisonExpression__OperatorAlternatives_1_1_0 ) )
            {
            // InternalGo.g:5232:2: ( ( rule__ComparisonExpression__OperatorAlternatives_1_1_0 ) )
            // InternalGo.g:5233:3: ( rule__ComparisonExpression__OperatorAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getOperatorAlternatives_1_1_0()); 
            }
            // InternalGo.g:5234:3: ( rule__ComparisonExpression__OperatorAlternatives_1_1_0 )
            // InternalGo.g:5234:4: rule__ComparisonExpression__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__OperatorAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getOperatorAlternatives_1_1_0()); 
            }

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
    // $ANTLR end "rule__ComparisonExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__ComparisonExpression__RightAssignment_1_2"
    // InternalGo.g:5242:1: rule__ComparisonExpression__RightAssignment_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__ComparisonExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5246:1: ( ( rulePrimaryExpression ) )
            // InternalGo.g:5247:2: ( rulePrimaryExpression )
            {
            // InternalGo.g:5247:2: ( rulePrimaryExpression )
            // InternalGo.g:5248:3: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__ComparisonExpression__RightAssignment_1_2"


    // $ANTLR start "rule__Literal__ValueAssignment_0_1"
    // InternalGo.g:5257:1: rule__Literal__ValueAssignment_0_1 : ( ruleBoolean ) ;
    public final void rule__Literal__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5261:1: ( ( ruleBoolean ) )
            // InternalGo.g:5262:2: ( ruleBoolean )
            {
            // InternalGo.g:5262:2: ( ruleBoolean )
            // InternalGo.g:5263:3: ruleBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getValueBooleanParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getValueBooleanParserRuleCall_0_1_0()); 
            }

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
    // $ANTLR end "rule__Literal__ValueAssignment_0_1"


    // $ANTLR start "rule__DecFunc__NameAssignment_1"
    // InternalGo.g:5272:1: rule__DecFunc__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DecFunc__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5276:1: ( ( RULE_ID ) )
            // InternalGo.g:5277:2: ( RULE_ID )
            {
            // InternalGo.g:5277:2: ( RULE_ID )
            // InternalGo.g:5278:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecFuncAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecFuncAccess().getNameIDTerminalRuleCall_1_0()); 
            }

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


    // $ANTLR start "rule__DecFunc__ParamAssignment_3"
    // InternalGo.g:5287:1: rule__DecFunc__ParamAssignment_3 : ( ruleParams ) ;
    public final void rule__DecFunc__ParamAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5291:1: ( ( ruleParams ) )
            // InternalGo.g:5292:2: ( ruleParams )
            {
            // InternalGo.g:5292:2: ( ruleParams )
            // InternalGo.g:5293:3: ruleParams
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecFuncAccess().getParamParamsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParams();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecFuncAccess().getParamParamsParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__DecFunc__ParamAssignment_3"


    // $ANTLR start "rule__DecFunc__ArgsAssignment_6"
    // InternalGo.g:5302:1: rule__DecFunc__ArgsAssignment_6 : ( ruleGreeting ) ;
    public final void rule__DecFunc__ArgsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5306:1: ( ( ruleGreeting ) )
            // InternalGo.g:5307:2: ( ruleGreeting )
            {
            // InternalGo.g:5307:2: ( ruleGreeting )
            // InternalGo.g:5308:3: ruleGreeting
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecFuncAccess().getArgsGreetingParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGreeting();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecFuncAccess().getArgsGreetingParserRuleCall_6_0()); 
            }

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
    // $ANTLR end "rule__DecFunc__ArgsAssignment_6"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // InternalGo.g:5317:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:5321:1: ( ( RULE_ID ) )
            // InternalGo.g:5322:2: ( RULE_ID )
            {
            // InternalGo.g:5322:2: ( RULE_ID )
            // InternalGo.g:5323:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            }

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


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\4\2\5\10\uffff";
    static final String dfa_3s = "\1\73\2\11\10\uffff";
    static final String dfa_4s = "\3\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\1";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\6\1\3\1\uffff\1\10\1\uffff\1\10\23\uffff\1\2\3\uffff\1\5\1\7\1\11\3\uffff\1\1\23\uffff\1\4",
            "\1\3\3\uffff\1\12",
            "\1\3\3\uffff\1\12",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1203:1: rule__Greeting__Alternatives : ( ( ruleMultDecVars ) | ( ruleDecVar ) | ( ruleDataType ) | ( ruleDecFunc ) | ( RULE_EOL ) | ( ruleCondition ) | ( ruleOperations ) | ( ruleDecImport ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0800008E200002B2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x001FC04000000100L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0060000000000AE0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0100000000000100L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0060000000000AC0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0800008E200042B0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00003E0000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00003E0000000002L});

}