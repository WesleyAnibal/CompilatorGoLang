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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_NEWLINE", "RULE_COMMENTS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'break'", "'case'", "'chan'", "'const'", "'continue'", "'else'", "'for'", "'func'", "'if'", "'import'", "'return'", "'package'", "'type'", "'var'", "'range'", "'<'", "'<='", "'=='", "'>='", "'>'", "'false'", "','", "'='", "'{'", "'}'", "'||'", "'&&'", "'('", "')'", "'print'", "'datatype'", "'true'"
    };
    public static final int T__19=19;
    public static final int RULE_COMMENTS=9;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=7;
    public static final int RULE_EOL=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_NEWLINE=8;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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

                if ( (LA1_0==RULE_EOL||(LA1_0>=21 && LA1_0<=22)||LA1_0==27||(LA1_0>=43 && LA1_0<=44)) ) {
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
    // InternalGo.g:113:1: ruleDecVar : ( ( rule__DecVar__Group__0 ) ) ;
    public final void ruleDecVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:117:2: ( ( ( rule__DecVar__Group__0 ) ) )
            // InternalGo.g:118:2: ( ( rule__DecVar__Group__0 ) )
            {
            // InternalGo.g:118:2: ( ( rule__DecVar__Group__0 ) )
            // InternalGo.g:119:3: ( rule__DecVar__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getGroup()); 
            }
            // InternalGo.g:120:3: ( rule__DecVar__Group__0 )
            // InternalGo.g:120:4: rule__DecVar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DecVar__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getGroup()); 
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


    // $ANTLR start "entryRuleCondition"
    // InternalGo.g:129:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalGo.g:130:1: ( ruleCondition EOF )
            // InternalGo.g:131:1: ruleCondition EOF
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
    // InternalGo.g:138:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:142:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalGo.g:143:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalGo.g:143:2: ( ( rule__Condition__Group__0 ) )
            // InternalGo.g:144:3: ( rule__Condition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getGroup()); 
            }
            // InternalGo.g:145:3: ( rule__Condition__Group__0 )
            // InternalGo.g:145:4: rule__Condition__Group__0
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
    // InternalGo.g:154:1: entryRuleIfCondition : ruleIfCondition EOF ;
    public final void entryRuleIfCondition() throws RecognitionException {
        try {
            // InternalGo.g:155:1: ( ruleIfCondition EOF )
            // InternalGo.g:156:1: ruleIfCondition EOF
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
    // InternalGo.g:163:1: ruleIfCondition : ( ( rule__IfCondition__Group__0 ) ) ;
    public final void ruleIfCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:167:2: ( ( ( rule__IfCondition__Group__0 ) ) )
            // InternalGo.g:168:2: ( ( rule__IfCondition__Group__0 ) )
            {
            // InternalGo.g:168:2: ( ( rule__IfCondition__Group__0 ) )
            // InternalGo.g:169:3: ( rule__IfCondition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfConditionAccess().getGroup()); 
            }
            // InternalGo.g:170:3: ( rule__IfCondition__Group__0 )
            // InternalGo.g:170:4: rule__IfCondition__Group__0
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
    // InternalGo.g:179:1: entryRuleElseIfCondition : ruleElseIfCondition EOF ;
    public final void entryRuleElseIfCondition() throws RecognitionException {
        try {
            // InternalGo.g:180:1: ( ruleElseIfCondition EOF )
            // InternalGo.g:181:1: ruleElseIfCondition EOF
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
    // InternalGo.g:188:1: ruleElseIfCondition : ( ( rule__ElseIfCondition__Group__0 ) ) ;
    public final void ruleElseIfCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:192:2: ( ( ( rule__ElseIfCondition__Group__0 ) ) )
            // InternalGo.g:193:2: ( ( rule__ElseIfCondition__Group__0 ) )
            {
            // InternalGo.g:193:2: ( ( rule__ElseIfCondition__Group__0 ) )
            // InternalGo.g:194:3: ( rule__ElseIfCondition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseIfConditionAccess().getGroup()); 
            }
            // InternalGo.g:195:3: ( rule__ElseIfCondition__Group__0 )
            // InternalGo.g:195:4: rule__ElseIfCondition__Group__0
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
    // InternalGo.g:204:1: entryRuleElseCondition : ruleElseCondition EOF ;
    public final void entryRuleElseCondition() throws RecognitionException {
        try {
            // InternalGo.g:205:1: ( ruleElseCondition EOF )
            // InternalGo.g:206:1: ruleElseCondition EOF
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
    // InternalGo.g:213:1: ruleElseCondition : ( ( rule__ElseCondition__Group__0 ) ) ;
    public final void ruleElseCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:217:2: ( ( ( rule__ElseCondition__Group__0 ) ) )
            // InternalGo.g:218:2: ( ( rule__ElseCondition__Group__0 ) )
            {
            // InternalGo.g:218:2: ( ( rule__ElseCondition__Group__0 ) )
            // InternalGo.g:219:3: ( rule__ElseCondition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseConditionAccess().getGroup()); 
            }
            // InternalGo.g:220:3: ( rule__ElseCondition__Group__0 )
            // InternalGo.g:220:4: rule__ElseCondition__Group__0
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
    // InternalGo.g:229:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalGo.g:230:1: ( ruleExpression EOF )
            // InternalGo.g:231:1: ruleExpression EOF
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
    // InternalGo.g:238:1: ruleExpression : ( ruleOrExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:242:2: ( ( ruleOrExpression ) )
            // InternalGo.g:243:2: ( ruleOrExpression )
            {
            // InternalGo.g:243:2: ( ruleOrExpression )
            // InternalGo.g:244:3: ruleOrExpression
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
    // InternalGo.g:254:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalGo.g:255:1: ( ruleOrExpression EOF )
            // InternalGo.g:256:1: ruleOrExpression EOF
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
    // InternalGo.g:263:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:267:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalGo.g:268:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalGo.g:268:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalGo.g:269:3: ( rule__OrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup()); 
            }
            // InternalGo.g:270:3: ( rule__OrExpression__Group__0 )
            // InternalGo.g:270:4: rule__OrExpression__Group__0
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
    // InternalGo.g:279:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalGo.g:280:1: ( ruleAndExpression EOF )
            // InternalGo.g:281:1: ruleAndExpression EOF
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
    // InternalGo.g:288:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:292:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalGo.g:293:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalGo.g:293:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalGo.g:294:3: ( rule__AndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup()); 
            }
            // InternalGo.g:295:3: ( rule__AndExpression__Group__0 )
            // InternalGo.g:295:4: rule__AndExpression__Group__0
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
    // InternalGo.g:304:1: entryRuleComparisonExpression : ruleComparisonExpression EOF ;
    public final void entryRuleComparisonExpression() throws RecognitionException {
        try {
            // InternalGo.g:305:1: ( ruleComparisonExpression EOF )
            // InternalGo.g:306:1: ruleComparisonExpression EOF
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
    // InternalGo.g:313:1: ruleComparisonExpression : ( ( rule__ComparisonExpression__Group__0 ) ) ;
    public final void ruleComparisonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:317:2: ( ( ( rule__ComparisonExpression__Group__0 ) ) )
            // InternalGo.g:318:2: ( ( rule__ComparisonExpression__Group__0 ) )
            {
            // InternalGo.g:318:2: ( ( rule__ComparisonExpression__Group__0 ) )
            // InternalGo.g:319:3: ( rule__ComparisonExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getGroup()); 
            }
            // InternalGo.g:320:3: ( rule__ComparisonExpression__Group__0 )
            // InternalGo.g:320:4: rule__ComparisonExpression__Group__0
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
    // InternalGo.g:329:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalGo.g:330:1: ( rulePrimaryExpression EOF )
            // InternalGo.g:331:1: rulePrimaryExpression EOF
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
    // InternalGo.g:338:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:342:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalGo.g:343:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalGo.g:343:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalGo.g:344:3: ( rule__PrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }
            // InternalGo.g:345:3: ( rule__PrimaryExpression__Alternatives )
            // InternalGo.g:345:4: rule__PrimaryExpression__Alternatives
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
    // InternalGo.g:354:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalGo.g:355:1: ( ruleLiteral EOF )
            // InternalGo.g:356:1: ruleLiteral EOF
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
    // InternalGo.g:363:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:367:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalGo.g:368:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalGo.g:368:2: ( ( rule__Literal__Alternatives ) )
            // InternalGo.g:369:3: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // InternalGo.g:370:3: ( rule__Literal__Alternatives )
            // InternalGo.g:370:4: rule__Literal__Alternatives
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
    // InternalGo.g:379:1: entryRuleDecFunc : ruleDecFunc EOF ;
    public final void entryRuleDecFunc() throws RecognitionException {
        try {
            // InternalGo.g:380:1: ( ruleDecFunc EOF )
            // InternalGo.g:381:1: ruleDecFunc EOF
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
    // InternalGo.g:388:1: ruleDecFunc : ( ( rule__DecFunc__Group__0 ) ) ;
    public final void ruleDecFunc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:392:2: ( ( ( rule__DecFunc__Group__0 ) ) )
            // InternalGo.g:393:2: ( ( rule__DecFunc__Group__0 ) )
            {
            // InternalGo.g:393:2: ( ( rule__DecFunc__Group__0 ) )
            // InternalGo.g:394:3: ( rule__DecFunc__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecFuncAccess().getGroup()); 
            }
            // InternalGo.g:395:3: ( rule__DecFunc__Group__0 )
            // InternalGo.g:395:4: rule__DecFunc__Group__0
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


    // $ANTLR start "entryRuleBREAK"
    // InternalGo.g:404:1: entryRuleBREAK : ruleBREAK EOF ;
    public final void entryRuleBREAK() throws RecognitionException {
        try {
            // InternalGo.g:405:1: ( ruleBREAK EOF )
            // InternalGo.g:406:1: ruleBREAK EOF
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
    // InternalGo.g:413:1: ruleBREAK : ( 'break' ) ;
    public final void ruleBREAK() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:417:2: ( ( 'break' ) )
            // InternalGo.g:418:2: ( 'break' )
            {
            // InternalGo.g:418:2: ( 'break' )
            // InternalGo.g:419:3: 'break'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBREAKAccess().getBreakKeyword()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:429:1: entryRuleCASE : ruleCASE EOF ;
    public final void entryRuleCASE() throws RecognitionException {
        try {
            // InternalGo.g:430:1: ( ruleCASE EOF )
            // InternalGo.g:431:1: ruleCASE EOF
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
    // InternalGo.g:438:1: ruleCASE : ( 'case' ) ;
    public final void ruleCASE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:442:2: ( ( 'case' ) )
            // InternalGo.g:443:2: ( 'case' )
            {
            // InternalGo.g:443:2: ( 'case' )
            // InternalGo.g:444:3: 'case'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCASEAccess().getCaseKeyword()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:454:1: entryRuleCHAN : ruleCHAN EOF ;
    public final void entryRuleCHAN() throws RecognitionException {
        try {
            // InternalGo.g:455:1: ( ruleCHAN EOF )
            // InternalGo.g:456:1: ruleCHAN EOF
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
    // InternalGo.g:463:1: ruleCHAN : ( 'chan' ) ;
    public final void ruleCHAN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:467:2: ( ( 'chan' ) )
            // InternalGo.g:468:2: ( 'chan' )
            {
            // InternalGo.g:468:2: ( 'chan' )
            // InternalGo.g:469:3: 'chan'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCHANAccess().getChanKeyword()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:479:1: entryRuleCONST : ruleCONST EOF ;
    public final void entryRuleCONST() throws RecognitionException {
        try {
            // InternalGo.g:480:1: ( ruleCONST EOF )
            // InternalGo.g:481:1: ruleCONST EOF
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
    // InternalGo.g:488:1: ruleCONST : ( 'const' ) ;
    public final void ruleCONST() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:492:2: ( ( 'const' ) )
            // InternalGo.g:493:2: ( 'const' )
            {
            // InternalGo.g:493:2: ( 'const' )
            // InternalGo.g:494:3: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCONSTAccess().getConstKeyword()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:504:1: entryRuleCONTINUE : ruleCONTINUE EOF ;
    public final void entryRuleCONTINUE() throws RecognitionException {
        try {
            // InternalGo.g:505:1: ( ruleCONTINUE EOF )
            // InternalGo.g:506:1: ruleCONTINUE EOF
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
    // InternalGo.g:513:1: ruleCONTINUE : ( 'continue' ) ;
    public final void ruleCONTINUE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:517:2: ( ( 'continue' ) )
            // InternalGo.g:518:2: ( 'continue' )
            {
            // InternalGo.g:518:2: ( 'continue' )
            // InternalGo.g:519:3: 'continue'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCONTINUEAccess().getContinueKeyword()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:529:1: entryRuleELSE : ruleELSE EOF ;
    public final void entryRuleELSE() throws RecognitionException {
        try {
            // InternalGo.g:530:1: ( ruleELSE EOF )
            // InternalGo.g:531:1: ruleELSE EOF
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
    // InternalGo.g:538:1: ruleELSE : ( 'else' ) ;
    public final void ruleELSE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:542:2: ( ( 'else' ) )
            // InternalGo.g:543:2: ( 'else' )
            {
            // InternalGo.g:543:2: ( 'else' )
            // InternalGo.g:544:3: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getELSEAccess().getElseKeyword()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:554:1: entryRuleFOR : ruleFOR EOF ;
    public final void entryRuleFOR() throws RecognitionException {
        try {
            // InternalGo.g:555:1: ( ruleFOR EOF )
            // InternalGo.g:556:1: ruleFOR EOF
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
    // InternalGo.g:563:1: ruleFOR : ( 'for' ) ;
    public final void ruleFOR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:567:2: ( ( 'for' ) )
            // InternalGo.g:568:2: ( 'for' )
            {
            // InternalGo.g:568:2: ( 'for' )
            // InternalGo.g:569:3: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFORAccess().getForKeyword()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:579:1: entryRuleFUNC : ruleFUNC EOF ;
    public final void entryRuleFUNC() throws RecognitionException {
        try {
            // InternalGo.g:580:1: ( ruleFUNC EOF )
            // InternalGo.g:581:1: ruleFUNC EOF
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
    // InternalGo.g:588:1: ruleFUNC : ( 'func' ) ;
    public final void ruleFUNC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:592:2: ( ( 'func' ) )
            // InternalGo.g:593:2: ( 'func' )
            {
            // InternalGo.g:593:2: ( 'func' )
            // InternalGo.g:594:3: 'func'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFUNCAccess().getFuncKeyword()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:604:1: entryRuleIF : ruleIF EOF ;
    public final void entryRuleIF() throws RecognitionException {
        try {
            // InternalGo.g:605:1: ( ruleIF EOF )
            // InternalGo.g:606:1: ruleIF EOF
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
    // InternalGo.g:613:1: ruleIF : ( 'if' ) ;
    public final void ruleIF() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:617:2: ( ( 'if' ) )
            // InternalGo.g:618:2: ( 'if' )
            {
            // InternalGo.g:618:2: ( 'if' )
            // InternalGo.g:619:3: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIFAccess().getIfKeyword()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:629:1: entryRuleIMPORT : ruleIMPORT EOF ;
    public final void entryRuleIMPORT() throws RecognitionException {
        try {
            // InternalGo.g:630:1: ( ruleIMPORT EOF )
            // InternalGo.g:631:1: ruleIMPORT EOF
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
    // InternalGo.g:638:1: ruleIMPORT : ( 'import' ) ;
    public final void ruleIMPORT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:642:2: ( ( 'import' ) )
            // InternalGo.g:643:2: ( 'import' )
            {
            // InternalGo.g:643:2: ( 'import' )
            // InternalGo.g:644:3: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIMPORTAccess().getImportKeyword()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:654:1: entryRuleRETURN : ruleRETURN EOF ;
    public final void entryRuleRETURN() throws RecognitionException {
        try {
            // InternalGo.g:655:1: ( ruleRETURN EOF )
            // InternalGo.g:656:1: ruleRETURN EOF
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
    // InternalGo.g:663:1: ruleRETURN : ( 'return' ) ;
    public final void ruleRETURN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:667:2: ( ( 'return' ) )
            // InternalGo.g:668:2: ( 'return' )
            {
            // InternalGo.g:668:2: ( 'return' )
            // InternalGo.g:669:3: 'return'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRETURNAccess().getReturnKeyword()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:679:1: entryRulePACKAGE : rulePACKAGE EOF ;
    public final void entryRulePACKAGE() throws RecognitionException {
        try {
            // InternalGo.g:680:1: ( rulePACKAGE EOF )
            // InternalGo.g:681:1: rulePACKAGE EOF
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
    // InternalGo.g:688:1: rulePACKAGE : ( 'package' ) ;
    public final void rulePACKAGE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:692:2: ( ( 'package' ) )
            // InternalGo.g:693:2: ( 'package' )
            {
            // InternalGo.g:693:2: ( 'package' )
            // InternalGo.g:694:3: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPACKAGEAccess().getPackageKeyword()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:704:1: entryRuleTYPE : ruleTYPE EOF ;
    public final void entryRuleTYPE() throws RecognitionException {
        try {
            // InternalGo.g:705:1: ( ruleTYPE EOF )
            // InternalGo.g:706:1: ruleTYPE EOF
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
    // InternalGo.g:713:1: ruleTYPE : ( 'type' ) ;
    public final void ruleTYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:717:2: ( ( 'type' ) )
            // InternalGo.g:718:2: ( 'type' )
            {
            // InternalGo.g:718:2: ( 'type' )
            // InternalGo.g:719:3: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTYPEAccess().getTypeKeyword()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:729:1: entryRuleVAR : ruleVAR EOF ;
    public final void entryRuleVAR() throws RecognitionException {
        try {
            // InternalGo.g:730:1: ( ruleVAR EOF )
            // InternalGo.g:731:1: ruleVAR EOF
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
    // InternalGo.g:738:1: ruleVAR : ( 'var' ) ;
    public final void ruleVAR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:742:2: ( ( 'var' ) )
            // InternalGo.g:743:2: ( 'var' )
            {
            // InternalGo.g:743:2: ( 'var' )
            // InternalGo.g:744:3: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVARAccess().getVarKeyword()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:754:1: entryRuleRANGE : ruleRANGE EOF ;
    public final void entryRuleRANGE() throws RecognitionException {
        try {
            // InternalGo.g:755:1: ( ruleRANGE EOF )
            // InternalGo.g:756:1: ruleRANGE EOF
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
    // InternalGo.g:763:1: ruleRANGE : ( 'range' ) ;
    public final void ruleRANGE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:767:2: ( ( 'range' ) )
            // InternalGo.g:768:2: ( 'range' )
            {
            // InternalGo.g:768:2: ( 'range' )
            // InternalGo.g:769:3: 'range'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRANGEAccess().getRangeKeyword()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "entryRuleEntity"
    // InternalGo.g:779:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalGo.g:780:1: ( ruleEntity EOF )
            // InternalGo.g:781:1: ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalGo.g:788:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:792:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalGo.g:793:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalGo.g:793:2: ( ( rule__Entity__Group__0 ) )
            // InternalGo.g:794:3: ( rule__Entity__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getGroup()); 
            }
            // InternalGo.g:795:3: ( rule__Entity__Group__0 )
            // InternalGo.g:795:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getGroup()); 
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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleDataType"
    // InternalGo.g:804:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalGo.g:805:1: ( ruleDataType EOF )
            // InternalGo.g:806:1: ruleDataType EOF
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
    // InternalGo.g:813:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:817:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalGo.g:818:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalGo.g:818:2: ( ( rule__DataType__Group__0 ) )
            // InternalGo.g:819:3: ( rule__DataType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeAccess().getGroup()); 
            }
            // InternalGo.g:820:3: ( rule__DataType__Group__0 )
            // InternalGo.g:820:4: rule__DataType__Group__0
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
    // InternalGo.g:828:1: rule__Greeting__Alternatives : ( ( ruleDecVar ) | ( ruleDataType ) | ( ruleEntity ) | ( ruleDecFunc ) | ( RULE_EOL ) | ( ruleCondition ) );
    public final void rule__Greeting__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:832:1: ( ( ruleDecVar ) | ( ruleDataType ) | ( ruleEntity ) | ( ruleDecFunc ) | ( RULE_EOL ) | ( ruleCondition ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt2=1;
                }
                break;
            case 44:
                {
                alt2=2;
                }
                break;
            case 43:
                {
                alt2=3;
                }
                break;
            case 21:
                {
                alt2=4;
                }
                break;
            case RULE_EOL:
                {
                alt2=5;
                }
                break;
            case 22:
                {
                alt2=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGo.g:833:2: ( ruleDecVar )
                    {
                    // InternalGo.g:833:2: ( ruleDecVar )
                    // InternalGo.g:834:3: ruleDecVar
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGreetingAccess().getDecVarParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDecVar();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGreetingAccess().getDecVarParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:839:2: ( ruleDataType )
                    {
                    // InternalGo.g:839:2: ( ruleDataType )
                    // InternalGo.g:840:3: ruleDataType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGreetingAccess().getDataTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGreetingAccess().getDataTypeParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:845:2: ( ruleEntity )
                    {
                    // InternalGo.g:845:2: ( ruleEntity )
                    // InternalGo.g:846:3: ruleEntity
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGreetingAccess().getEntityParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGreetingAccess().getEntityParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:851:2: ( ruleDecFunc )
                    {
                    // InternalGo.g:851:2: ( ruleDecFunc )
                    // InternalGo.g:852:3: ruleDecFunc
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
                    // InternalGo.g:857:2: ( RULE_EOL )
                    {
                    // InternalGo.g:857:2: ( RULE_EOL )
                    // InternalGo.g:858:3: RULE_EOL
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
                    // InternalGo.g:863:2: ( ruleCondition )
                    {
                    // InternalGo.g:863:2: ( ruleCondition )
                    // InternalGo.g:864:3: ruleCondition
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

            }
        }
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


    // $ANTLR start "rule__ComparisonExpression__OperatorAlternatives_1_1_0"
    // InternalGo.g:873:1: rule__ComparisonExpression__OperatorAlternatives_1_1_0 : ( ( '<' ) | ( '<=' ) | ( '==' ) | ( '>=' ) | ( '>' ) );
    public final void rule__ComparisonExpression__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:877:1: ( ( '<' ) | ( '<=' ) | ( '==' ) | ( '>=' ) | ( '>' ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt3=1;
                }
                break;
            case 30:
                {
                alt3=2;
                }
                break;
            case 31:
                {
                alt3=3;
                }
                break;
            case 32:
                {
                alt3=4;
                }
                break;
            case 33:
                {
                alt3=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGo.g:878:2: ( '<' )
                    {
                    // InternalGo.g:878:2: ( '<' )
                    // InternalGo.g:879:3: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSignKeyword_1_1_0_0()); 
                    }
                    match(input,29,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSignKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:884:2: ( '<=' )
                    {
                    // InternalGo.g:884:2: ( '<=' )
                    // InternalGo.g:885:3: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    }
                    match(input,30,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:890:2: ( '==' )
                    {
                    // InternalGo.g:890:2: ( '==' )
                    // InternalGo.g:891:3: '=='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonExpressionAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_2()); 
                    }
                    match(input,31,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonExpressionAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:896:2: ( '>=' )
                    {
                    // InternalGo.g:896:2: ( '>=' )
                    // InternalGo.g:897:3: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonExpressionAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_3()); 
                    }
                    match(input,32,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonExpressionAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalGo.g:902:2: ( '>' )
                    {
                    // InternalGo.g:902:2: ( '>' )
                    // InternalGo.g:903:3: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonExpressionAccess().getOperatorGreaterThanSignKeyword_1_1_0_4()); 
                    }
                    match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:912:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ruleLiteral ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:916:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ruleLiteral ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==41) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_INT||LA4_0==34||LA4_0==45) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGo.g:917:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // InternalGo.g:917:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // InternalGo.g:918:3: ( rule__PrimaryExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    }
                    // InternalGo.g:919:3: ( rule__PrimaryExpression__Group_0__0 )
                    // InternalGo.g:919:4: rule__PrimaryExpression__Group_0__0
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
                    // InternalGo.g:923:2: ( ruleLiteral )
                    {
                    // InternalGo.g:923:2: ( ruleLiteral )
                    // InternalGo.g:924:3: ruleLiteral
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
    // InternalGo.g:933:1: rule__Literal__Alternatives : ( ( ( rule__Literal__Group_0__0 ) ) | ( 'false' ) | ( RULE_INT ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:937:1: ( ( ( rule__Literal__Group_0__0 ) ) | ( 'false' ) | ( RULE_INT ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt5=1;
                }
                break;
            case 34:
                {
                alt5=2;
                }
                break;
            case RULE_INT:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalGo.g:938:2: ( ( rule__Literal__Group_0__0 ) )
                    {
                    // InternalGo.g:938:2: ( ( rule__Literal__Group_0__0 ) )
                    // InternalGo.g:939:3: ( rule__Literal__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getGroup_0()); 
                    }
                    // InternalGo.g:940:3: ( rule__Literal__Group_0__0 )
                    // InternalGo.g:940:4: rule__Literal__Group_0__0
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
                    // InternalGo.g:944:2: ( 'false' )
                    {
                    // InternalGo.g:944:2: ( 'false' )
                    // InternalGo.g:945:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getFalseKeyword_1()); 
                    }
                    match(input,34,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getFalseKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:950:2: ( RULE_INT )
                    {
                    // InternalGo.g:950:2: ( RULE_INT )
                    // InternalGo.g:951:3: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_2()); 
                    }
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_2()); 
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


    // $ANTLR start "rule__Entity__Alternatives_2"
    // InternalGo.g:960:1: rule__Entity__Alternatives_2 : ( ( RULE_STRING ) | ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) );
    public final void rule__Entity__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:964:1: ( ( RULE_STRING ) | ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INT) ) {
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
                    // InternalGo.g:965:2: ( RULE_STRING )
                    {
                    // InternalGo.g:965:2: ( RULE_STRING )
                    // InternalGo.g:966:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityAccess().getSTRINGTerminalRuleCall_2_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityAccess().getSTRINGTerminalRuleCall_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:971:2: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
                    {
                    // InternalGo.g:971:2: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
                    // InternalGo.g:972:3: ( ( RULE_INT ) ) ( ( RULE_INT )* )
                    {
                    // InternalGo.g:972:3: ( ( RULE_INT ) )
                    // InternalGo.g:973:4: ( RULE_INT )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityAccess().getINTTerminalRuleCall_2_1()); 
                    }
                    // InternalGo.g:974:4: ( RULE_INT )
                    // InternalGo.g:974:5: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_4); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityAccess().getINTTerminalRuleCall_2_1()); 
                    }

                    }

                    // InternalGo.g:977:3: ( ( RULE_INT )* )
                    // InternalGo.g:978:4: ( RULE_INT )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityAccess().getINTTerminalRuleCall_2_1()); 
                    }
                    // InternalGo.g:979:4: ( RULE_INT )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_INT) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalGo.g:979:5: RULE_INT
                    	    {
                    	    match(input,RULE_INT,FOLLOW_4); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityAccess().getINTTerminalRuleCall_2_1()); 
                    }

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
    // $ANTLR end "rule__Entity__Alternatives_2"


    // $ANTLR start "rule__DecVar__Group__0"
    // InternalGo.g:988:1: rule__DecVar__Group__0 : rule__DecVar__Group__0__Impl rule__DecVar__Group__1 ;
    public final void rule__DecVar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:992:1: ( rule__DecVar__Group__0__Impl rule__DecVar__Group__1 )
            // InternalGo.g:993:2: rule__DecVar__Group__0__Impl rule__DecVar__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__DecVar__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecVar__Group__1();

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
    // $ANTLR end "rule__DecVar__Group__0"


    // $ANTLR start "rule__DecVar__Group__0__Impl"
    // InternalGo.g:1000:1: rule__DecVar__Group__0__Impl : ( ruleVAR ) ;
    public final void rule__DecVar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1004:1: ( ( ruleVAR ) )
            // InternalGo.g:1005:1: ( ruleVAR )
            {
            // InternalGo.g:1005:1: ( ruleVAR )
            // InternalGo.g:1006:2: ruleVAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getVARParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVAR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getVARParserRuleCall_0()); 
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
    // $ANTLR end "rule__DecVar__Group__0__Impl"


    // $ANTLR start "rule__DecVar__Group__1"
    // InternalGo.g:1015:1: rule__DecVar__Group__1 : rule__DecVar__Group__1__Impl rule__DecVar__Group__2 ;
    public final void rule__DecVar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1019:1: ( rule__DecVar__Group__1__Impl rule__DecVar__Group__2 )
            // InternalGo.g:1020:2: rule__DecVar__Group__1__Impl rule__DecVar__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__DecVar__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecVar__Group__2();

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
    // $ANTLR end "rule__DecVar__Group__1"


    // $ANTLR start "rule__DecVar__Group__1__Impl"
    // InternalGo.g:1027:1: rule__DecVar__Group__1__Impl : ( ( rule__DecVar__VarsAssignment_1 ) ) ;
    public final void rule__DecVar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1031:1: ( ( ( rule__DecVar__VarsAssignment_1 ) ) )
            // InternalGo.g:1032:1: ( ( rule__DecVar__VarsAssignment_1 ) )
            {
            // InternalGo.g:1032:1: ( ( rule__DecVar__VarsAssignment_1 ) )
            // InternalGo.g:1033:2: ( rule__DecVar__VarsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getVarsAssignment_1()); 
            }
            // InternalGo.g:1034:2: ( rule__DecVar__VarsAssignment_1 )
            // InternalGo.g:1034:3: rule__DecVar__VarsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DecVar__VarsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getVarsAssignment_1()); 
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
    // $ANTLR end "rule__DecVar__Group__1__Impl"


    // $ANTLR start "rule__DecVar__Group__2"
    // InternalGo.g:1042:1: rule__DecVar__Group__2 : rule__DecVar__Group__2__Impl rule__DecVar__Group__3 ;
    public final void rule__DecVar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1046:1: ( rule__DecVar__Group__2__Impl rule__DecVar__Group__3 )
            // InternalGo.g:1047:2: rule__DecVar__Group__2__Impl rule__DecVar__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__DecVar__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecVar__Group__3();

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
    // $ANTLR end "rule__DecVar__Group__2"


    // $ANTLR start "rule__DecVar__Group__2__Impl"
    // InternalGo.g:1054:1: rule__DecVar__Group__2__Impl : ( ( rule__DecVar__Group_2__0 )* ) ;
    public final void rule__DecVar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1058:1: ( ( ( rule__DecVar__Group_2__0 )* ) )
            // InternalGo.g:1059:1: ( ( rule__DecVar__Group_2__0 )* )
            {
            // InternalGo.g:1059:1: ( ( rule__DecVar__Group_2__0 )* )
            // InternalGo.g:1060:2: ( rule__DecVar__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getGroup_2()); 
            }
            // InternalGo.g:1061:2: ( rule__DecVar__Group_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==35) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGo.g:1061:3: rule__DecVar__Group_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DecVar__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getGroup_2()); 
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
    // $ANTLR end "rule__DecVar__Group__2__Impl"


    // $ANTLR start "rule__DecVar__Group__3"
    // InternalGo.g:1069:1: rule__DecVar__Group__3 : rule__DecVar__Group__3__Impl rule__DecVar__Group__4 ;
    public final void rule__DecVar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1073:1: ( rule__DecVar__Group__3__Impl rule__DecVar__Group__4 )
            // InternalGo.g:1074:2: rule__DecVar__Group__3__Impl rule__DecVar__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__DecVar__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecVar__Group__4();

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
    // $ANTLR end "rule__DecVar__Group__3"


    // $ANTLR start "rule__DecVar__Group__3__Impl"
    // InternalGo.g:1081:1: rule__DecVar__Group__3__Impl : ( ruleTYPE ) ;
    public final void rule__DecVar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1085:1: ( ( ruleTYPE ) )
            // InternalGo.g:1086:1: ( ruleTYPE )
            {
            // InternalGo.g:1086:1: ( ruleTYPE )
            // InternalGo.g:1087:2: ruleTYPE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getTYPEParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_2);
            ruleTYPE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getTYPEParserRuleCall_3()); 
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
    // $ANTLR end "rule__DecVar__Group__3__Impl"


    // $ANTLR start "rule__DecVar__Group__4"
    // InternalGo.g:1096:1: rule__DecVar__Group__4 : rule__DecVar__Group__4__Impl ;
    public final void rule__DecVar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1100:1: ( rule__DecVar__Group__4__Impl )
            // InternalGo.g:1101:2: rule__DecVar__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecVar__Group__4__Impl();

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
    // $ANTLR end "rule__DecVar__Group__4"


    // $ANTLR start "rule__DecVar__Group__4__Impl"
    // InternalGo.g:1107:1: rule__DecVar__Group__4__Impl : ( ( rule__DecVar__Group_4__0 )? ) ;
    public final void rule__DecVar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1111:1: ( ( ( rule__DecVar__Group_4__0 )? ) )
            // InternalGo.g:1112:1: ( ( rule__DecVar__Group_4__0 )? )
            {
            // InternalGo.g:1112:1: ( ( rule__DecVar__Group_4__0 )? )
            // InternalGo.g:1113:2: ( rule__DecVar__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getGroup_4()); 
            }
            // InternalGo.g:1114:2: ( rule__DecVar__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==36) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGo.g:1114:3: rule__DecVar__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DecVar__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getGroup_4()); 
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
    // $ANTLR end "rule__DecVar__Group__4__Impl"


    // $ANTLR start "rule__DecVar__Group_2__0"
    // InternalGo.g:1123:1: rule__DecVar__Group_2__0 : rule__DecVar__Group_2__0__Impl rule__DecVar__Group_2__1 ;
    public final void rule__DecVar__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1127:1: ( rule__DecVar__Group_2__0__Impl rule__DecVar__Group_2__1 )
            // InternalGo.g:1128:2: rule__DecVar__Group_2__0__Impl rule__DecVar__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__DecVar__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecVar__Group_2__1();

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
    // $ANTLR end "rule__DecVar__Group_2__0"


    // $ANTLR start "rule__DecVar__Group_2__0__Impl"
    // InternalGo.g:1135:1: rule__DecVar__Group_2__0__Impl : ( ',' ) ;
    public final void rule__DecVar__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1139:1: ( ( ',' ) )
            // InternalGo.g:1140:1: ( ',' )
            {
            // InternalGo.g:1140:1: ( ',' )
            // InternalGo.g:1141:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getCommaKeyword_2_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getCommaKeyword_2_0()); 
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
    // $ANTLR end "rule__DecVar__Group_2__0__Impl"


    // $ANTLR start "rule__DecVar__Group_2__1"
    // InternalGo.g:1150:1: rule__DecVar__Group_2__1 : rule__DecVar__Group_2__1__Impl ;
    public final void rule__DecVar__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1154:1: ( rule__DecVar__Group_2__1__Impl )
            // InternalGo.g:1155:2: rule__DecVar__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecVar__Group_2__1__Impl();

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
    // $ANTLR end "rule__DecVar__Group_2__1"


    // $ANTLR start "rule__DecVar__Group_2__1__Impl"
    // InternalGo.g:1161:1: rule__DecVar__Group_2__1__Impl : ( ( rule__DecVar__VarsAssignment_2_1 ) ) ;
    public final void rule__DecVar__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1165:1: ( ( ( rule__DecVar__VarsAssignment_2_1 ) ) )
            // InternalGo.g:1166:1: ( ( rule__DecVar__VarsAssignment_2_1 ) )
            {
            // InternalGo.g:1166:1: ( ( rule__DecVar__VarsAssignment_2_1 ) )
            // InternalGo.g:1167:2: ( rule__DecVar__VarsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getVarsAssignment_2_1()); 
            }
            // InternalGo.g:1168:2: ( rule__DecVar__VarsAssignment_2_1 )
            // InternalGo.g:1168:3: rule__DecVar__VarsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DecVar__VarsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getVarsAssignment_2_1()); 
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
    // $ANTLR end "rule__DecVar__Group_2__1__Impl"


    // $ANTLR start "rule__DecVar__Group_4__0"
    // InternalGo.g:1177:1: rule__DecVar__Group_4__0 : rule__DecVar__Group_4__0__Impl rule__DecVar__Group_4__1 ;
    public final void rule__DecVar__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1181:1: ( rule__DecVar__Group_4__0__Impl rule__DecVar__Group_4__1 )
            // InternalGo.g:1182:2: rule__DecVar__Group_4__0__Impl rule__DecVar__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__DecVar__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecVar__Group_4__1();

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
    // $ANTLR end "rule__DecVar__Group_4__0"


    // $ANTLR start "rule__DecVar__Group_4__0__Impl"
    // InternalGo.g:1189:1: rule__DecVar__Group_4__0__Impl : ( '=' ) ;
    public final void rule__DecVar__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1193:1: ( ( '=' ) )
            // InternalGo.g:1194:1: ( '=' )
            {
            // InternalGo.g:1194:1: ( '=' )
            // InternalGo.g:1195:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getEqualsSignKeyword_4_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getEqualsSignKeyword_4_0()); 
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
    // $ANTLR end "rule__DecVar__Group_4__0__Impl"


    // $ANTLR start "rule__DecVar__Group_4__1"
    // InternalGo.g:1204:1: rule__DecVar__Group_4__1 : rule__DecVar__Group_4__1__Impl rule__DecVar__Group_4__2 ;
    public final void rule__DecVar__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1208:1: ( rule__DecVar__Group_4__1__Impl rule__DecVar__Group_4__2 )
            // InternalGo.g:1209:2: rule__DecVar__Group_4__1__Impl rule__DecVar__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__DecVar__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecVar__Group_4__2();

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
    // $ANTLR end "rule__DecVar__Group_4__1"


    // $ANTLR start "rule__DecVar__Group_4__1__Impl"
    // InternalGo.g:1216:1: rule__DecVar__Group_4__1__Impl : ( ( rule__DecVar__AtrbAssignment_4_1 ) ) ;
    public final void rule__DecVar__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1220:1: ( ( ( rule__DecVar__AtrbAssignment_4_1 ) ) )
            // InternalGo.g:1221:1: ( ( rule__DecVar__AtrbAssignment_4_1 ) )
            {
            // InternalGo.g:1221:1: ( ( rule__DecVar__AtrbAssignment_4_1 ) )
            // InternalGo.g:1222:2: ( rule__DecVar__AtrbAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getAtrbAssignment_4_1()); 
            }
            // InternalGo.g:1223:2: ( rule__DecVar__AtrbAssignment_4_1 )
            // InternalGo.g:1223:3: rule__DecVar__AtrbAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DecVar__AtrbAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getAtrbAssignment_4_1()); 
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
    // $ANTLR end "rule__DecVar__Group_4__1__Impl"


    // $ANTLR start "rule__DecVar__Group_4__2"
    // InternalGo.g:1231:1: rule__DecVar__Group_4__2 : rule__DecVar__Group_4__2__Impl ;
    public final void rule__DecVar__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1235:1: ( rule__DecVar__Group_4__2__Impl )
            // InternalGo.g:1236:2: rule__DecVar__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecVar__Group_4__2__Impl();

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
    // $ANTLR end "rule__DecVar__Group_4__2"


    // $ANTLR start "rule__DecVar__Group_4__2__Impl"
    // InternalGo.g:1242:1: rule__DecVar__Group_4__2__Impl : ( ( rule__DecVar__Group_4_2__0 )* ) ;
    public final void rule__DecVar__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1246:1: ( ( ( rule__DecVar__Group_4_2__0 )* ) )
            // InternalGo.g:1247:1: ( ( rule__DecVar__Group_4_2__0 )* )
            {
            // InternalGo.g:1247:1: ( ( rule__DecVar__Group_4_2__0 )* )
            // InternalGo.g:1248:2: ( rule__DecVar__Group_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getGroup_4_2()); 
            }
            // InternalGo.g:1249:2: ( rule__DecVar__Group_4_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==35) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGo.g:1249:3: rule__DecVar__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DecVar__Group_4_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getGroup_4_2()); 
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
    // $ANTLR end "rule__DecVar__Group_4__2__Impl"


    // $ANTLR start "rule__DecVar__Group_4_2__0"
    // InternalGo.g:1258:1: rule__DecVar__Group_4_2__0 : rule__DecVar__Group_4_2__0__Impl rule__DecVar__Group_4_2__1 ;
    public final void rule__DecVar__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1262:1: ( rule__DecVar__Group_4_2__0__Impl rule__DecVar__Group_4_2__1 )
            // InternalGo.g:1263:2: rule__DecVar__Group_4_2__0__Impl rule__DecVar__Group_4_2__1
            {
            pushFollow(FOLLOW_5);
            rule__DecVar__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecVar__Group_4_2__1();

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
    // $ANTLR end "rule__DecVar__Group_4_2__0"


    // $ANTLR start "rule__DecVar__Group_4_2__0__Impl"
    // InternalGo.g:1270:1: rule__DecVar__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__DecVar__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1274:1: ( ( ',' ) )
            // InternalGo.g:1275:1: ( ',' )
            {
            // InternalGo.g:1275:1: ( ',' )
            // InternalGo.g:1276:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getCommaKeyword_4_2_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getCommaKeyword_4_2_0()); 
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
    // $ANTLR end "rule__DecVar__Group_4_2__0__Impl"


    // $ANTLR start "rule__DecVar__Group_4_2__1"
    // InternalGo.g:1285:1: rule__DecVar__Group_4_2__1 : rule__DecVar__Group_4_2__1__Impl ;
    public final void rule__DecVar__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1289:1: ( rule__DecVar__Group_4_2__1__Impl )
            // InternalGo.g:1290:2: rule__DecVar__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecVar__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__DecVar__Group_4_2__1"


    // $ANTLR start "rule__DecVar__Group_4_2__1__Impl"
    // InternalGo.g:1296:1: rule__DecVar__Group_4_2__1__Impl : ( ( rule__DecVar__AtrbAssignment_4_2_1 ) ) ;
    public final void rule__DecVar__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1300:1: ( ( ( rule__DecVar__AtrbAssignment_4_2_1 ) ) )
            // InternalGo.g:1301:1: ( ( rule__DecVar__AtrbAssignment_4_2_1 ) )
            {
            // InternalGo.g:1301:1: ( ( rule__DecVar__AtrbAssignment_4_2_1 ) )
            // InternalGo.g:1302:2: ( rule__DecVar__AtrbAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getAtrbAssignment_4_2_1()); 
            }
            // InternalGo.g:1303:2: ( rule__DecVar__AtrbAssignment_4_2_1 )
            // InternalGo.g:1303:3: rule__DecVar__AtrbAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DecVar__AtrbAssignment_4_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getAtrbAssignment_4_2_1()); 
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
    // $ANTLR end "rule__DecVar__Group_4_2__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalGo.g:1312:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1316:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalGo.g:1317:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalGo.g:1324:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__IfAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1328:1: ( ( ( rule__Condition__IfAssignment_0 ) ) )
            // InternalGo.g:1329:1: ( ( rule__Condition__IfAssignment_0 ) )
            {
            // InternalGo.g:1329:1: ( ( rule__Condition__IfAssignment_0 ) )
            // InternalGo.g:1330:2: ( rule__Condition__IfAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getIfAssignment_0()); 
            }
            // InternalGo.g:1331:2: ( rule__Condition__IfAssignment_0 )
            // InternalGo.g:1331:3: rule__Condition__IfAssignment_0
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
    // InternalGo.g:1339:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1343:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalGo.g:1344:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalGo.g:1351:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ElseifAssignment_1 )* ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1355:1: ( ( ( rule__Condition__ElseifAssignment_1 )* ) )
            // InternalGo.g:1356:1: ( ( rule__Condition__ElseifAssignment_1 )* )
            {
            // InternalGo.g:1356:1: ( ( rule__Condition__ElseifAssignment_1 )* )
            // InternalGo.g:1357:2: ( rule__Condition__ElseifAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getElseifAssignment_1()); 
            }
            // InternalGo.g:1358:2: ( rule__Condition__ElseifAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==22) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalGo.g:1358:3: rule__Condition__ElseifAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Condition__ElseifAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalGo.g:1366:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1370:1: ( rule__Condition__Group__2__Impl )
            // InternalGo.g:1371:2: rule__Condition__Group__2__Impl
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
    // InternalGo.g:1377:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__ElseAssignment_2 )? ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1381:1: ( ( ( rule__Condition__ElseAssignment_2 )? ) )
            // InternalGo.g:1382:1: ( ( rule__Condition__ElseAssignment_2 )? )
            {
            // InternalGo.g:1382:1: ( ( rule__Condition__ElseAssignment_2 )? )
            // InternalGo.g:1383:2: ( rule__Condition__ElseAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getElseAssignment_2()); 
            }
            // InternalGo.g:1384:2: ( rule__Condition__ElseAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGo.g:1384:3: rule__Condition__ElseAssignment_2
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
    // InternalGo.g:1393:1: rule__IfCondition__Group__0 : rule__IfCondition__Group__0__Impl rule__IfCondition__Group__1 ;
    public final void rule__IfCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1397:1: ( rule__IfCondition__Group__0__Impl rule__IfCondition__Group__1 )
            // InternalGo.g:1398:2: rule__IfCondition__Group__0__Impl rule__IfCondition__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalGo.g:1405:1: rule__IfCondition__Group__0__Impl : ( ruleIF ) ;
    public final void rule__IfCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1409:1: ( ( ruleIF ) )
            // InternalGo.g:1410:1: ( ruleIF )
            {
            // InternalGo.g:1410:1: ( ruleIF )
            // InternalGo.g:1411:2: ruleIF
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
    // InternalGo.g:1420:1: rule__IfCondition__Group__1 : rule__IfCondition__Group__1__Impl rule__IfCondition__Group__2 ;
    public final void rule__IfCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1424:1: ( rule__IfCondition__Group__1__Impl rule__IfCondition__Group__2 )
            // InternalGo.g:1425:2: rule__IfCondition__Group__1__Impl rule__IfCondition__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalGo.g:1432:1: rule__IfCondition__Group__1__Impl : ( ( rule__IfCondition__CondAssignment_1 ) ) ;
    public final void rule__IfCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1436:1: ( ( ( rule__IfCondition__CondAssignment_1 ) ) )
            // InternalGo.g:1437:1: ( ( rule__IfCondition__CondAssignment_1 ) )
            {
            // InternalGo.g:1437:1: ( ( rule__IfCondition__CondAssignment_1 ) )
            // InternalGo.g:1438:2: ( rule__IfCondition__CondAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfConditionAccess().getCondAssignment_1()); 
            }
            // InternalGo.g:1439:2: ( rule__IfCondition__CondAssignment_1 )
            // InternalGo.g:1439:3: rule__IfCondition__CondAssignment_1
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
    // InternalGo.g:1447:1: rule__IfCondition__Group__2 : rule__IfCondition__Group__2__Impl rule__IfCondition__Group__3 ;
    public final void rule__IfCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1451:1: ( rule__IfCondition__Group__2__Impl rule__IfCondition__Group__3 )
            // InternalGo.g:1452:2: rule__IfCondition__Group__2__Impl rule__IfCondition__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalGo.g:1459:1: rule__IfCondition__Group__2__Impl : ( '{' ) ;
    public final void rule__IfCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1463:1: ( ( '{' ) )
            // InternalGo.g:1464:1: ( '{' )
            {
            // InternalGo.g:1464:1: ( '{' )
            // InternalGo.g:1465:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfConditionAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfConditionAccess().getLeftCurlyBracketKeyword_2()); 
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
    // InternalGo.g:1474:1: rule__IfCondition__Group__3 : rule__IfCondition__Group__3__Impl rule__IfCondition__Group__4 ;
    public final void rule__IfCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1478:1: ( rule__IfCondition__Group__3__Impl rule__IfCondition__Group__4 )
            // InternalGo.g:1479:2: rule__IfCondition__Group__3__Impl rule__IfCondition__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalGo.g:1486:1: rule__IfCondition__Group__3__Impl : ( ( rule__IfCondition__ThenAssignment_3 )* ) ;
    public final void rule__IfCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1490:1: ( ( ( rule__IfCondition__ThenAssignment_3 )* ) )
            // InternalGo.g:1491:1: ( ( rule__IfCondition__ThenAssignment_3 )* )
            {
            // InternalGo.g:1491:1: ( ( rule__IfCondition__ThenAssignment_3 )* )
            // InternalGo.g:1492:2: ( rule__IfCondition__ThenAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfConditionAccess().getThenAssignment_3()); 
            }
            // InternalGo.g:1493:2: ( rule__IfCondition__ThenAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_EOL||(LA13_0>=21 && LA13_0<=22)||LA13_0==27||(LA13_0>=43 && LA13_0<=44)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGo.g:1493:3: rule__IfCondition__ThenAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__IfCondition__ThenAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalGo.g:1501:1: rule__IfCondition__Group__4 : rule__IfCondition__Group__4__Impl ;
    public final void rule__IfCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1505:1: ( rule__IfCondition__Group__4__Impl )
            // InternalGo.g:1506:2: rule__IfCondition__Group__4__Impl
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
    // InternalGo.g:1512:1: rule__IfCondition__Group__4__Impl : ( '}' ) ;
    public final void rule__IfCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1516:1: ( ( '}' ) )
            // InternalGo.g:1517:1: ( '}' )
            {
            // InternalGo.g:1517:1: ( '}' )
            // InternalGo.g:1518:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfConditionAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfConditionAccess().getRightCurlyBracketKeyword_4()); 
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
    // InternalGo.g:1528:1: rule__ElseIfCondition__Group__0 : rule__ElseIfCondition__Group__0__Impl rule__ElseIfCondition__Group__1 ;
    public final void rule__ElseIfCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1532:1: ( rule__ElseIfCondition__Group__0__Impl rule__ElseIfCondition__Group__1 )
            // InternalGo.g:1533:2: rule__ElseIfCondition__Group__0__Impl rule__ElseIfCondition__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalGo.g:1540:1: rule__ElseIfCondition__Group__0__Impl : ( ( ruleELSE ) ) ;
    public final void rule__ElseIfCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1544:1: ( ( ( ruleELSE ) ) )
            // InternalGo.g:1545:1: ( ( ruleELSE ) )
            {
            // InternalGo.g:1545:1: ( ( ruleELSE ) )
            // InternalGo.g:1546:2: ( ruleELSE )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseIfConditionAccess().getELSEParserRuleCall_0()); 
            }
            // InternalGo.g:1547:2: ( ruleELSE )
            // InternalGo.g:1547:3: ruleELSE
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
    // InternalGo.g:1555:1: rule__ElseIfCondition__Group__1 : rule__ElseIfCondition__Group__1__Impl ;
    public final void rule__ElseIfCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1559:1: ( rule__ElseIfCondition__Group__1__Impl )
            // InternalGo.g:1560:2: rule__ElseIfCondition__Group__1__Impl
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
    // InternalGo.g:1566:1: rule__ElseIfCondition__Group__1__Impl : ( ruleIfCondition ) ;
    public final void rule__ElseIfCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1570:1: ( ( ruleIfCondition ) )
            // InternalGo.g:1571:1: ( ruleIfCondition )
            {
            // InternalGo.g:1571:1: ( ruleIfCondition )
            // InternalGo.g:1572:2: ruleIfCondition
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
    // InternalGo.g:1582:1: rule__ElseCondition__Group__0 : rule__ElseCondition__Group__0__Impl rule__ElseCondition__Group__1 ;
    public final void rule__ElseCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1586:1: ( rule__ElseCondition__Group__0__Impl rule__ElseCondition__Group__1 )
            // InternalGo.g:1587:2: rule__ElseCondition__Group__0__Impl rule__ElseCondition__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalGo.g:1594:1: rule__ElseCondition__Group__0__Impl : ( ( ruleELSE ) ) ;
    public final void rule__ElseCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1598:1: ( ( ( ruleELSE ) ) )
            // InternalGo.g:1599:1: ( ( ruleELSE ) )
            {
            // InternalGo.g:1599:1: ( ( ruleELSE ) )
            // InternalGo.g:1600:2: ( ruleELSE )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseConditionAccess().getELSEParserRuleCall_0()); 
            }
            // InternalGo.g:1601:2: ( ruleELSE )
            // InternalGo.g:1601:3: ruleELSE
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
    // InternalGo.g:1609:1: rule__ElseCondition__Group__1 : rule__ElseCondition__Group__1__Impl rule__ElseCondition__Group__2 ;
    public final void rule__ElseCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1613:1: ( rule__ElseCondition__Group__1__Impl rule__ElseCondition__Group__2 )
            // InternalGo.g:1614:2: rule__ElseCondition__Group__1__Impl rule__ElseCondition__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalGo.g:1621:1: rule__ElseCondition__Group__1__Impl : ( '{' ) ;
    public final void rule__ElseCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1625:1: ( ( '{' ) )
            // InternalGo.g:1626:1: ( '{' )
            {
            // InternalGo.g:1626:1: ( '{' )
            // InternalGo.g:1627:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseConditionAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseConditionAccess().getLeftCurlyBracketKeyword_1()); 
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
    // InternalGo.g:1636:1: rule__ElseCondition__Group__2 : rule__ElseCondition__Group__2__Impl rule__ElseCondition__Group__3 ;
    public final void rule__ElseCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1640:1: ( rule__ElseCondition__Group__2__Impl rule__ElseCondition__Group__3 )
            // InternalGo.g:1641:2: rule__ElseCondition__Group__2__Impl rule__ElseCondition__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalGo.g:1648:1: rule__ElseCondition__Group__2__Impl : ( ( rule__ElseCondition__ThenAssignment_2 )* ) ;
    public final void rule__ElseCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1652:1: ( ( ( rule__ElseCondition__ThenAssignment_2 )* ) )
            // InternalGo.g:1653:1: ( ( rule__ElseCondition__ThenAssignment_2 )* )
            {
            // InternalGo.g:1653:1: ( ( rule__ElseCondition__ThenAssignment_2 )* )
            // InternalGo.g:1654:2: ( rule__ElseCondition__ThenAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseConditionAccess().getThenAssignment_2()); 
            }
            // InternalGo.g:1655:2: ( rule__ElseCondition__ThenAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_EOL||(LA14_0>=21 && LA14_0<=22)||LA14_0==27||(LA14_0>=43 && LA14_0<=44)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGo.g:1655:3: rule__ElseCondition__ThenAssignment_2
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ElseCondition__ThenAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalGo.g:1663:1: rule__ElseCondition__Group__3 : rule__ElseCondition__Group__3__Impl ;
    public final void rule__ElseCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1667:1: ( rule__ElseCondition__Group__3__Impl )
            // InternalGo.g:1668:2: rule__ElseCondition__Group__3__Impl
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
    // InternalGo.g:1674:1: rule__ElseCondition__Group__3__Impl : ( '}' ) ;
    public final void rule__ElseCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1678:1: ( ( '}' ) )
            // InternalGo.g:1679:1: ( '}' )
            {
            // InternalGo.g:1679:1: ( '}' )
            // InternalGo.g:1680:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseConditionAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseConditionAccess().getRightCurlyBracketKeyword_3()); 
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
    // InternalGo.g:1690:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1694:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalGo.g:1695:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalGo.g:1702:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1706:1: ( ( ruleAndExpression ) )
            // InternalGo.g:1707:1: ( ruleAndExpression )
            {
            // InternalGo.g:1707:1: ( ruleAndExpression )
            // InternalGo.g:1708:2: ruleAndExpression
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
    // InternalGo.g:1717:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1721:1: ( rule__OrExpression__Group__1__Impl )
            // InternalGo.g:1722:2: rule__OrExpression__Group__1__Impl
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
    // InternalGo.g:1728:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1732:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalGo.g:1733:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalGo.g:1733:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalGo.g:1734:2: ( rule__OrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // InternalGo.g:1735:2: ( rule__OrExpression__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==39) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGo.g:1735:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalGo.g:1744:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1748:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalGo.g:1749:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalGo.g:1756:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1760:1: ( ( () ) )
            // InternalGo.g:1761:1: ( () )
            {
            // InternalGo.g:1761:1: ( () )
            // InternalGo.g:1762:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0()); 
            }
            // InternalGo.g:1763:2: ()
            // InternalGo.g:1763:3: 
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
    // InternalGo.g:1771:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1775:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // InternalGo.g:1776:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalGo.g:1783:1: rule__OrExpression__Group_1__1__Impl : ( '||' ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1787:1: ( ( '||' ) )
            // InternalGo.g:1788:1: ( '||' )
            {
            // InternalGo.g:1788:1: ( '||' )
            // InternalGo.g:1789:2: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:1798:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1802:1: ( rule__OrExpression__Group_1__2__Impl )
            // InternalGo.g:1803:2: rule__OrExpression__Group_1__2__Impl
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
    // InternalGo.g:1809:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__RightAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1813:1: ( ( ( rule__OrExpression__RightAssignment_1_2 ) ) )
            // InternalGo.g:1814:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            {
            // InternalGo.g:1814:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            // InternalGo.g:1815:2: ( rule__OrExpression__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2()); 
            }
            // InternalGo.g:1816:2: ( rule__OrExpression__RightAssignment_1_2 )
            // InternalGo.g:1816:3: rule__OrExpression__RightAssignment_1_2
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
    // InternalGo.g:1825:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1829:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalGo.g:1830:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalGo.g:1837:1: rule__AndExpression__Group__0__Impl : ( ruleComparisonExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1841:1: ( ( ruleComparisonExpression ) )
            // InternalGo.g:1842:1: ( ruleComparisonExpression )
            {
            // InternalGo.g:1842:1: ( ruleComparisonExpression )
            // InternalGo.g:1843:2: ruleComparisonExpression
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
    // InternalGo.g:1852:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1856:1: ( rule__AndExpression__Group__1__Impl )
            // InternalGo.g:1857:2: rule__AndExpression__Group__1__Impl
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
    // InternalGo.g:1863:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1867:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalGo.g:1868:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalGo.g:1868:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalGo.g:1869:2: ( rule__AndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // InternalGo.g:1870:2: ( rule__AndExpression__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==40) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGo.g:1870:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalGo.g:1879:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1883:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalGo.g:1884:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalGo.g:1891:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1895:1: ( ( () ) )
            // InternalGo.g:1896:1: ( () )
            {
            // InternalGo.g:1896:1: ( () )
            // InternalGo.g:1897:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0()); 
            }
            // InternalGo.g:1898:2: ()
            // InternalGo.g:1898:3: 
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
    // InternalGo.g:1906:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1910:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalGo.g:1911:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalGo.g:1918:1: rule__AndExpression__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1922:1: ( ( '&&' ) )
            // InternalGo.g:1923:1: ( '&&' )
            {
            // InternalGo.g:1923:1: ( '&&' )
            // InternalGo.g:1924:2: '&&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getAmpersandAmpersandKeyword_1_1()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:1933:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1937:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalGo.g:1938:2: rule__AndExpression__Group_1__2__Impl
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
    // InternalGo.g:1944:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1948:1: ( ( ( rule__AndExpression__RightAssignment_1_2 ) ) )
            // InternalGo.g:1949:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            {
            // InternalGo.g:1949:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            // InternalGo.g:1950:2: ( rule__AndExpression__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 
            }
            // InternalGo.g:1951:2: ( rule__AndExpression__RightAssignment_1_2 )
            // InternalGo.g:1951:3: rule__AndExpression__RightAssignment_1_2
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
    // InternalGo.g:1960:1: rule__ComparisonExpression__Group__0 : rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 ;
    public final void rule__ComparisonExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1964:1: ( rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 )
            // InternalGo.g:1965:2: rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalGo.g:1972:1: rule__ComparisonExpression__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__ComparisonExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1976:1: ( ( rulePrimaryExpression ) )
            // InternalGo.g:1977:1: ( rulePrimaryExpression )
            {
            // InternalGo.g:1977:1: ( rulePrimaryExpression )
            // InternalGo.g:1978:2: rulePrimaryExpression
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
    // InternalGo.g:1987:1: rule__ComparisonExpression__Group__1 : rule__ComparisonExpression__Group__1__Impl ;
    public final void rule__ComparisonExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1991:1: ( rule__ComparisonExpression__Group__1__Impl )
            // InternalGo.g:1992:2: rule__ComparisonExpression__Group__1__Impl
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
    // InternalGo.g:1998:1: rule__ComparisonExpression__Group__1__Impl : ( ( rule__ComparisonExpression__Group_1__0 )* ) ;
    public final void rule__ComparisonExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2002:1: ( ( ( rule__ComparisonExpression__Group_1__0 )* ) )
            // InternalGo.g:2003:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            {
            // InternalGo.g:2003:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            // InternalGo.g:2004:2: ( rule__ComparisonExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 
            }
            // InternalGo.g:2005:2: ( rule__ComparisonExpression__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=29 && LA17_0<=33)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGo.g:2005:3: rule__ComparisonExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ComparisonExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalGo.g:2014:1: rule__ComparisonExpression__Group_1__0 : rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 ;
    public final void rule__ComparisonExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2018:1: ( rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 )
            // InternalGo.g:2019:2: rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalGo.g:2026:1: rule__ComparisonExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2030:1: ( ( () ) )
            // InternalGo.g:2031:1: ( () )
            {
            // InternalGo.g:2031:1: ( () )
            // InternalGo.g:2032:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0()); 
            }
            // InternalGo.g:2033:2: ()
            // InternalGo.g:2033:3: 
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
    // InternalGo.g:2041:1: rule__ComparisonExpression__Group_1__1 : rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 ;
    public final void rule__ComparisonExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2045:1: ( rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 )
            // InternalGo.g:2046:2: rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalGo.g:2053:1: rule__ComparisonExpression__Group_1__1__Impl : ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparisonExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2057:1: ( ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) )
            // InternalGo.g:2058:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            {
            // InternalGo.g:2058:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            // InternalGo.g:2059:2: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalGo.g:2060:2: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            // InternalGo.g:2060:3: rule__ComparisonExpression__OperatorAssignment_1_1
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
    // InternalGo.g:2068:1: rule__ComparisonExpression__Group_1__2 : rule__ComparisonExpression__Group_1__2__Impl ;
    public final void rule__ComparisonExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2072:1: ( rule__ComparisonExpression__Group_1__2__Impl )
            // InternalGo.g:2073:2: rule__ComparisonExpression__Group_1__2__Impl
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
    // InternalGo.g:2079:1: rule__ComparisonExpression__Group_1__2__Impl : ( ( rule__ComparisonExpression__RightAssignment_1_2 ) ) ;
    public final void rule__ComparisonExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2083:1: ( ( ( rule__ComparisonExpression__RightAssignment_1_2 ) ) )
            // InternalGo.g:2084:1: ( ( rule__ComparisonExpression__RightAssignment_1_2 ) )
            {
            // InternalGo.g:2084:1: ( ( rule__ComparisonExpression__RightAssignment_1_2 ) )
            // InternalGo.g:2085:2: ( rule__ComparisonExpression__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getRightAssignment_1_2()); 
            }
            // InternalGo.g:2086:2: ( rule__ComparisonExpression__RightAssignment_1_2 )
            // InternalGo.g:2086:3: rule__ComparisonExpression__RightAssignment_1_2
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
    // InternalGo.g:2095:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2099:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // InternalGo.g:2100:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalGo.g:2107:1: rule__PrimaryExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2111:1: ( ( '(' ) )
            // InternalGo.g:2112:1: ( '(' )
            {
            // InternalGo.g:2112:1: ( '(' )
            // InternalGo.g:2113:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
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
    // InternalGo.g:2122:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2126:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // InternalGo.g:2127:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalGo.g:2134:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2138:1: ( ( ruleExpression ) )
            // InternalGo.g:2139:1: ( ruleExpression )
            {
            // InternalGo.g:2139:1: ( ruleExpression )
            // InternalGo.g:2140:2: ruleExpression
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
    // InternalGo.g:2149:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2153:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // InternalGo.g:2154:2: rule__PrimaryExpression__Group_0__2__Impl
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
    // InternalGo.g:2160:1: rule__PrimaryExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2164:1: ( ( ')' ) )
            // InternalGo.g:2165:1: ( ')' )
            {
            // InternalGo.g:2165:1: ( ')' )
            // InternalGo.g:2166:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
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
    // InternalGo.g:2176:1: rule__Literal__Group_0__0 : rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 ;
    public final void rule__Literal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2180:1: ( rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 )
            // InternalGo.g:2181:2: rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalGo.g:2188:1: rule__Literal__Group_0__0__Impl : ( () ) ;
    public final void rule__Literal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2192:1: ( ( () ) )
            // InternalGo.g:2193:1: ( () )
            {
            // InternalGo.g:2193:1: ( () )
            // InternalGo.g:2194:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getLiteralAction_0_0()); 
            }
            // InternalGo.g:2195:2: ()
            // InternalGo.g:2195:3: 
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
    // InternalGo.g:2203:1: rule__Literal__Group_0__1 : rule__Literal__Group_0__1__Impl ;
    public final void rule__Literal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2207:1: ( rule__Literal__Group_0__1__Impl )
            // InternalGo.g:2208:2: rule__Literal__Group_0__1__Impl
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
    // InternalGo.g:2214:1: rule__Literal__Group_0__1__Impl : ( ( rule__Literal__ValueAssignment_0_1 ) ) ;
    public final void rule__Literal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2218:1: ( ( ( rule__Literal__ValueAssignment_0_1 ) ) )
            // InternalGo.g:2219:1: ( ( rule__Literal__ValueAssignment_0_1 ) )
            {
            // InternalGo.g:2219:1: ( ( rule__Literal__ValueAssignment_0_1 ) )
            // InternalGo.g:2220:2: ( rule__Literal__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getValueAssignment_0_1()); 
            }
            // InternalGo.g:2221:2: ( rule__Literal__ValueAssignment_0_1 )
            // InternalGo.g:2221:3: rule__Literal__ValueAssignment_0_1
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
    // InternalGo.g:2230:1: rule__DecFunc__Group__0 : rule__DecFunc__Group__0__Impl rule__DecFunc__Group__1 ;
    public final void rule__DecFunc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2234:1: ( rule__DecFunc__Group__0__Impl rule__DecFunc__Group__1 )
            // InternalGo.g:2235:2: rule__DecFunc__Group__0__Impl rule__DecFunc__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalGo.g:2242:1: rule__DecFunc__Group__0__Impl : ( ruleFUNC ) ;
    public final void rule__DecFunc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2246:1: ( ( ruleFUNC ) )
            // InternalGo.g:2247:1: ( ruleFUNC )
            {
            // InternalGo.g:2247:1: ( ruleFUNC )
            // InternalGo.g:2248:2: ruleFUNC
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
    // InternalGo.g:2257:1: rule__DecFunc__Group__1 : rule__DecFunc__Group__1__Impl rule__DecFunc__Group__2 ;
    public final void rule__DecFunc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2261:1: ( rule__DecFunc__Group__1__Impl rule__DecFunc__Group__2 )
            // InternalGo.g:2262:2: rule__DecFunc__Group__1__Impl rule__DecFunc__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalGo.g:2269:1: rule__DecFunc__Group__1__Impl : ( ( rule__DecFunc__NameAssignment_1 ) ) ;
    public final void rule__DecFunc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2273:1: ( ( ( rule__DecFunc__NameAssignment_1 ) ) )
            // InternalGo.g:2274:1: ( ( rule__DecFunc__NameAssignment_1 ) )
            {
            // InternalGo.g:2274:1: ( ( rule__DecFunc__NameAssignment_1 ) )
            // InternalGo.g:2275:2: ( rule__DecFunc__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecFuncAccess().getNameAssignment_1()); 
            }
            // InternalGo.g:2276:2: ( rule__DecFunc__NameAssignment_1 )
            // InternalGo.g:2276:3: rule__DecFunc__NameAssignment_1
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
    // InternalGo.g:2284:1: rule__DecFunc__Group__2 : rule__DecFunc__Group__2__Impl rule__DecFunc__Group__3 ;
    public final void rule__DecFunc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2288:1: ( rule__DecFunc__Group__2__Impl rule__DecFunc__Group__3 )
            // InternalGo.g:2289:2: rule__DecFunc__Group__2__Impl rule__DecFunc__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalGo.g:2296:1: rule__DecFunc__Group__2__Impl : ( '(' ) ;
    public final void rule__DecFunc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2300:1: ( ( '(' ) )
            // InternalGo.g:2301:1: ( '(' )
            {
            // InternalGo.g:2301:1: ( '(' )
            // InternalGo.g:2302:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecFuncAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecFuncAccess().getLeftParenthesisKeyword_2()); 
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
    // InternalGo.g:2311:1: rule__DecFunc__Group__3 : rule__DecFunc__Group__3__Impl rule__DecFunc__Group__4 ;
    public final void rule__DecFunc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2315:1: ( rule__DecFunc__Group__3__Impl rule__DecFunc__Group__4 )
            // InternalGo.g:2316:2: rule__DecFunc__Group__3__Impl rule__DecFunc__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalGo.g:2323:1: rule__DecFunc__Group__3__Impl : ( ( rule__DecFunc__ParameterAssignment_3 )? ) ;
    public final void rule__DecFunc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2327:1: ( ( ( rule__DecFunc__ParameterAssignment_3 )? ) )
            // InternalGo.g:2328:1: ( ( rule__DecFunc__ParameterAssignment_3 )? )
            {
            // InternalGo.g:2328:1: ( ( rule__DecFunc__ParameterAssignment_3 )? )
            // InternalGo.g:2329:2: ( rule__DecFunc__ParameterAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecFuncAccess().getParameterAssignment_3()); 
            }
            // InternalGo.g:2330:2: ( rule__DecFunc__ParameterAssignment_3 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGo.g:2330:3: rule__DecFunc__ParameterAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__DecFunc__ParameterAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecFuncAccess().getParameterAssignment_3()); 
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
    // InternalGo.g:2338:1: rule__DecFunc__Group__4 : rule__DecFunc__Group__4__Impl rule__DecFunc__Group__5 ;
    public final void rule__DecFunc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2342:1: ( rule__DecFunc__Group__4__Impl rule__DecFunc__Group__5 )
            // InternalGo.g:2343:2: rule__DecFunc__Group__4__Impl rule__DecFunc__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalGo.g:2350:1: rule__DecFunc__Group__4__Impl : ( ( rule__DecFunc__Group_4__0 )* ) ;
    public final void rule__DecFunc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2354:1: ( ( ( rule__DecFunc__Group_4__0 )* ) )
            // InternalGo.g:2355:1: ( ( rule__DecFunc__Group_4__0 )* )
            {
            // InternalGo.g:2355:1: ( ( rule__DecFunc__Group_4__0 )* )
            // InternalGo.g:2356:2: ( rule__DecFunc__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecFuncAccess().getGroup_4()); 
            }
            // InternalGo.g:2357:2: ( rule__DecFunc__Group_4__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==35) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGo.g:2357:3: rule__DecFunc__Group_4__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DecFunc__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecFuncAccess().getGroup_4()); 
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
    // InternalGo.g:2365:1: rule__DecFunc__Group__5 : rule__DecFunc__Group__5__Impl rule__DecFunc__Group__6 ;
    public final void rule__DecFunc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2369:1: ( rule__DecFunc__Group__5__Impl rule__DecFunc__Group__6 )
            // InternalGo.g:2370:2: rule__DecFunc__Group__5__Impl rule__DecFunc__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalGo.g:2377:1: rule__DecFunc__Group__5__Impl : ( ')' ) ;
    public final void rule__DecFunc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2381:1: ( ( ')' ) )
            // InternalGo.g:2382:1: ( ')' )
            {
            // InternalGo.g:2382:1: ( ')' )
            // InternalGo.g:2383:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecFuncAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecFuncAccess().getRightParenthesisKeyword_5()); 
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
    // InternalGo.g:2392:1: rule__DecFunc__Group__6 : rule__DecFunc__Group__6__Impl rule__DecFunc__Group__7 ;
    public final void rule__DecFunc__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2396:1: ( rule__DecFunc__Group__6__Impl rule__DecFunc__Group__7 )
            // InternalGo.g:2397:2: rule__DecFunc__Group__6__Impl rule__DecFunc__Group__7
            {
            pushFollow(FOLLOW_14);
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
    // InternalGo.g:2404:1: rule__DecFunc__Group__6__Impl : ( '{' ) ;
    public final void rule__DecFunc__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2408:1: ( ( '{' ) )
            // InternalGo.g:2409:1: ( '{' )
            {
            // InternalGo.g:2409:1: ( '{' )
            // InternalGo.g:2410:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecFuncAccess().getLeftCurlyBracketKeyword_6()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecFuncAccess().getLeftCurlyBracketKeyword_6()); 
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
    // InternalGo.g:2419:1: rule__DecFunc__Group__7 : rule__DecFunc__Group__7__Impl rule__DecFunc__Group__8 ;
    public final void rule__DecFunc__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2423:1: ( rule__DecFunc__Group__7__Impl rule__DecFunc__Group__8 )
            // InternalGo.g:2424:2: rule__DecFunc__Group__7__Impl rule__DecFunc__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__DecFunc__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecFunc__Group__8();

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
    // InternalGo.g:2431:1: rule__DecFunc__Group__7__Impl : ( ( rule__DecFunc__ArgsAssignment_7 )* ) ;
    public final void rule__DecFunc__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2435:1: ( ( ( rule__DecFunc__ArgsAssignment_7 )* ) )
            // InternalGo.g:2436:1: ( ( rule__DecFunc__ArgsAssignment_7 )* )
            {
            // InternalGo.g:2436:1: ( ( rule__DecFunc__ArgsAssignment_7 )* )
            // InternalGo.g:2437:2: ( rule__DecFunc__ArgsAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecFuncAccess().getArgsAssignment_7()); 
            }
            // InternalGo.g:2438:2: ( rule__DecFunc__ArgsAssignment_7 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_EOL||(LA20_0>=21 && LA20_0<=22)||LA20_0==27||(LA20_0>=43 && LA20_0<=44)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGo.g:2438:3: rule__DecFunc__ArgsAssignment_7
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__DecFunc__ArgsAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecFuncAccess().getArgsAssignment_7()); 
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


    // $ANTLR start "rule__DecFunc__Group__8"
    // InternalGo.g:2446:1: rule__DecFunc__Group__8 : rule__DecFunc__Group__8__Impl ;
    public final void rule__DecFunc__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2450:1: ( rule__DecFunc__Group__8__Impl )
            // InternalGo.g:2451:2: rule__DecFunc__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecFunc__Group__8__Impl();

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
    // $ANTLR end "rule__DecFunc__Group__8"


    // $ANTLR start "rule__DecFunc__Group__8__Impl"
    // InternalGo.g:2457:1: rule__DecFunc__Group__8__Impl : ( '}' ) ;
    public final void rule__DecFunc__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2461:1: ( ( '}' ) )
            // InternalGo.g:2462:1: ( '}' )
            {
            // InternalGo.g:2462:1: ( '}' )
            // InternalGo.g:2463:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecFuncAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecFuncAccess().getRightCurlyBracketKeyword_8()); 
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
    // $ANTLR end "rule__DecFunc__Group__8__Impl"


    // $ANTLR start "rule__DecFunc__Group_4__0"
    // InternalGo.g:2473:1: rule__DecFunc__Group_4__0 : rule__DecFunc__Group_4__0__Impl rule__DecFunc__Group_4__1 ;
    public final void rule__DecFunc__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2477:1: ( rule__DecFunc__Group_4__0__Impl rule__DecFunc__Group_4__1 )
            // InternalGo.g:2478:2: rule__DecFunc__Group_4__0__Impl rule__DecFunc__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__DecFunc__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DecFunc__Group_4__1();

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
    // $ANTLR end "rule__DecFunc__Group_4__0"


    // $ANTLR start "rule__DecFunc__Group_4__0__Impl"
    // InternalGo.g:2485:1: rule__DecFunc__Group_4__0__Impl : ( ',' ) ;
    public final void rule__DecFunc__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2489:1: ( ( ',' ) )
            // InternalGo.g:2490:1: ( ',' )
            {
            // InternalGo.g:2490:1: ( ',' )
            // InternalGo.g:2491:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecFuncAccess().getCommaKeyword_4_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecFuncAccess().getCommaKeyword_4_0()); 
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
    // $ANTLR end "rule__DecFunc__Group_4__0__Impl"


    // $ANTLR start "rule__DecFunc__Group_4__1"
    // InternalGo.g:2500:1: rule__DecFunc__Group_4__1 : rule__DecFunc__Group_4__1__Impl ;
    public final void rule__DecFunc__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2504:1: ( rule__DecFunc__Group_4__1__Impl )
            // InternalGo.g:2505:2: rule__DecFunc__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecFunc__Group_4__1__Impl();

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
    // $ANTLR end "rule__DecFunc__Group_4__1"


    // $ANTLR start "rule__DecFunc__Group_4__1__Impl"
    // InternalGo.g:2511:1: rule__DecFunc__Group_4__1__Impl : ( ( rule__DecFunc__ParameterAssignment_4_1 ) ) ;
    public final void rule__DecFunc__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2515:1: ( ( ( rule__DecFunc__ParameterAssignment_4_1 ) ) )
            // InternalGo.g:2516:1: ( ( rule__DecFunc__ParameterAssignment_4_1 ) )
            {
            // InternalGo.g:2516:1: ( ( rule__DecFunc__ParameterAssignment_4_1 ) )
            // InternalGo.g:2517:2: ( rule__DecFunc__ParameterAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecFuncAccess().getParameterAssignment_4_1()); 
            }
            // InternalGo.g:2518:2: ( rule__DecFunc__ParameterAssignment_4_1 )
            // InternalGo.g:2518:3: rule__DecFunc__ParameterAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DecFunc__ParameterAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecFuncAccess().getParameterAssignment_4_1()); 
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
    // $ANTLR end "rule__DecFunc__Group_4__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalGo.g:2527:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2531:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalGo.g:2532:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Entity__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalGo.g:2539:1: rule__Entity__Group__0__Impl : ( 'print' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2543:1: ( ( 'print' ) )
            // InternalGo.g:2544:1: ( 'print' )
            {
            // InternalGo.g:2544:1: ( 'print' )
            // InternalGo.g:2545:2: 'print'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getPrintKeyword_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getPrintKeyword_0()); 
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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalGo.g:2554:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2558:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalGo.g:2559:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Entity__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalGo.g:2566:1: rule__Entity__Group__1__Impl : ( '(' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2570:1: ( ( '(' ) )
            // InternalGo.g:2571:1: ( '(' )
            {
            // InternalGo.g:2571:1: ( '(' )
            // InternalGo.g:2572:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalGo.g:2581:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2585:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalGo.g:2586:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Entity__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalGo.g:2593:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Alternatives_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2597:1: ( ( ( rule__Entity__Alternatives_2 ) ) )
            // InternalGo.g:2598:1: ( ( rule__Entity__Alternatives_2 ) )
            {
            // InternalGo.g:2598:1: ( ( rule__Entity__Alternatives_2 ) )
            // InternalGo.g:2599:2: ( rule__Entity__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getAlternatives_2()); 
            }
            // InternalGo.g:2600:2: ( rule__Entity__Alternatives_2 )
            // InternalGo.g:2600:3: rule__Entity__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getAlternatives_2()); 
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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalGo.g:2608:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2612:1: ( rule__Entity__Group__3__Impl )
            // InternalGo.g:2613:2: rule__Entity__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__3__Impl();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalGo.g:2619:1: rule__Entity__Group__3__Impl : ( ')' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2623:1: ( ( ')' ) )
            // InternalGo.g:2624:1: ( ')' )
            {
            // InternalGo.g:2624:1: ( ')' )
            // InternalGo.g:2625:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getRightParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__DataType__Group__0"
    // InternalGo.g:2635:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2639:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalGo.g:2640:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalGo.g:2647:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2651:1: ( ( 'datatype' ) )
            // InternalGo.g:2652:1: ( 'datatype' )
            {
            // InternalGo.g:2652:1: ( 'datatype' )
            // InternalGo.g:2653:2: 'datatype'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalGo.g:2662:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2666:1: ( rule__DataType__Group__1__Impl )
            // InternalGo.g:2667:2: rule__DataType__Group__1__Impl
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
    // InternalGo.g:2673:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2677:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalGo.g:2678:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalGo.g:2678:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalGo.g:2679:2: ( rule__DataType__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            }
            // InternalGo.g:2680:2: ( rule__DataType__NameAssignment_1 )
            // InternalGo.g:2680:3: rule__DataType__NameAssignment_1
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
    // InternalGo.g:2689:1: rule__Go__ElementsAssignment : ( ruleGreeting ) ;
    public final void rule__Go__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2693:1: ( ( ruleGreeting ) )
            // InternalGo.g:2694:2: ( ruleGreeting )
            {
            // InternalGo.g:2694:2: ( ruleGreeting )
            // InternalGo.g:2695:3: ruleGreeting
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


    // $ANTLR start "rule__DecVar__VarsAssignment_1"
    // InternalGo.g:2704:1: rule__DecVar__VarsAssignment_1 : ( RULE_ID ) ;
    public final void rule__DecVar__VarsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2708:1: ( ( RULE_ID ) )
            // InternalGo.g:2709:2: ( RULE_ID )
            {
            // InternalGo.g:2709:2: ( RULE_ID )
            // InternalGo.g:2710:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getVarsIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getVarsIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__DecVar__VarsAssignment_1"


    // $ANTLR start "rule__DecVar__VarsAssignment_2_1"
    // InternalGo.g:2719:1: rule__DecVar__VarsAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__DecVar__VarsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2723:1: ( ( RULE_ID ) )
            // InternalGo.g:2724:2: ( RULE_ID )
            {
            // InternalGo.g:2724:2: ( RULE_ID )
            // InternalGo.g:2725:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getVarsIDTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getVarsIDTerminalRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__DecVar__VarsAssignment_2_1"


    // $ANTLR start "rule__DecVar__AtrbAssignment_4_1"
    // InternalGo.g:2734:1: rule__DecVar__AtrbAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__DecVar__AtrbAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2738:1: ( ( RULE_ID ) )
            // InternalGo.g:2739:2: ( RULE_ID )
            {
            // InternalGo.g:2739:2: ( RULE_ID )
            // InternalGo.g:2740:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getAtrbIDTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getAtrbIDTerminalRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__DecVar__AtrbAssignment_4_1"


    // $ANTLR start "rule__DecVar__AtrbAssignment_4_2_1"
    // InternalGo.g:2749:1: rule__DecVar__AtrbAssignment_4_2_1 : ( RULE_ID ) ;
    public final void rule__DecVar__AtrbAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2753:1: ( ( RULE_ID ) )
            // InternalGo.g:2754:2: ( RULE_ID )
            {
            // InternalGo.g:2754:2: ( RULE_ID )
            // InternalGo.g:2755:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecVarAccess().getAtrbIDTerminalRuleCall_4_2_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecVarAccess().getAtrbIDTerminalRuleCall_4_2_1_0()); 
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
    // $ANTLR end "rule__DecVar__AtrbAssignment_4_2_1"


    // $ANTLR start "rule__Condition__IfAssignment_0"
    // InternalGo.g:2764:1: rule__Condition__IfAssignment_0 : ( ruleIfCondition ) ;
    public final void rule__Condition__IfAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2768:1: ( ( ruleIfCondition ) )
            // InternalGo.g:2769:2: ( ruleIfCondition )
            {
            // InternalGo.g:2769:2: ( ruleIfCondition )
            // InternalGo.g:2770:3: ruleIfCondition
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
    // InternalGo.g:2779:1: rule__Condition__ElseifAssignment_1 : ( ruleElseIfCondition ) ;
    public final void rule__Condition__ElseifAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2783:1: ( ( ruleElseIfCondition ) )
            // InternalGo.g:2784:2: ( ruleElseIfCondition )
            {
            // InternalGo.g:2784:2: ( ruleElseIfCondition )
            // InternalGo.g:2785:3: ruleElseIfCondition
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
    // InternalGo.g:2794:1: rule__Condition__ElseAssignment_2 : ( ruleElseCondition ) ;
    public final void rule__Condition__ElseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2798:1: ( ( ruleElseCondition ) )
            // InternalGo.g:2799:2: ( ruleElseCondition )
            {
            // InternalGo.g:2799:2: ( ruleElseCondition )
            // InternalGo.g:2800:3: ruleElseCondition
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
    // InternalGo.g:2809:1: rule__IfCondition__CondAssignment_1 : ( ruleExpression ) ;
    public final void rule__IfCondition__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2813:1: ( ( ruleExpression ) )
            // InternalGo.g:2814:2: ( ruleExpression )
            {
            // InternalGo.g:2814:2: ( ruleExpression )
            // InternalGo.g:2815:3: ruleExpression
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
    // InternalGo.g:2824:1: rule__IfCondition__ThenAssignment_3 : ( ruleGreeting ) ;
    public final void rule__IfCondition__ThenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2828:1: ( ( ruleGreeting ) )
            // InternalGo.g:2829:2: ( ruleGreeting )
            {
            // InternalGo.g:2829:2: ( ruleGreeting )
            // InternalGo.g:2830:3: ruleGreeting
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
    // InternalGo.g:2839:1: rule__ElseCondition__ThenAssignment_2 : ( ruleGreeting ) ;
    public final void rule__ElseCondition__ThenAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2843:1: ( ( ruleGreeting ) )
            // InternalGo.g:2844:2: ( ruleGreeting )
            {
            // InternalGo.g:2844:2: ( ruleGreeting )
            // InternalGo.g:2845:3: ruleGreeting
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
    // InternalGo.g:2854:1: rule__OrExpression__RightAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2858:1: ( ( ruleAndExpression ) )
            // InternalGo.g:2859:2: ( ruleAndExpression )
            {
            // InternalGo.g:2859:2: ( ruleAndExpression )
            // InternalGo.g:2860:3: ruleAndExpression
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
    // InternalGo.g:2869:1: rule__AndExpression__RightAssignment_1_2 : ( ruleComparisonExpression ) ;
    public final void rule__AndExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2873:1: ( ( ruleComparisonExpression ) )
            // InternalGo.g:2874:2: ( ruleComparisonExpression )
            {
            // InternalGo.g:2874:2: ( ruleComparisonExpression )
            // InternalGo.g:2875:3: ruleComparisonExpression
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
    // InternalGo.g:2884:1: rule__ComparisonExpression__OperatorAssignment_1_1 : ( ( rule__ComparisonExpression__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__ComparisonExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2888:1: ( ( ( rule__ComparisonExpression__OperatorAlternatives_1_1_0 ) ) )
            // InternalGo.g:2889:2: ( ( rule__ComparisonExpression__OperatorAlternatives_1_1_0 ) )
            {
            // InternalGo.g:2889:2: ( ( rule__ComparisonExpression__OperatorAlternatives_1_1_0 ) )
            // InternalGo.g:2890:3: ( rule__ComparisonExpression__OperatorAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getOperatorAlternatives_1_1_0()); 
            }
            // InternalGo.g:2891:3: ( rule__ComparisonExpression__OperatorAlternatives_1_1_0 )
            // InternalGo.g:2891:4: rule__ComparisonExpression__OperatorAlternatives_1_1_0
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
    // InternalGo.g:2899:1: rule__ComparisonExpression__RightAssignment_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__ComparisonExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2903:1: ( ( rulePrimaryExpression ) )
            // InternalGo.g:2904:2: ( rulePrimaryExpression )
            {
            // InternalGo.g:2904:2: ( rulePrimaryExpression )
            // InternalGo.g:2905:3: rulePrimaryExpression
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
    // InternalGo.g:2914:1: rule__Literal__ValueAssignment_0_1 : ( ( 'true' ) ) ;
    public final void rule__Literal__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2918:1: ( ( ( 'true' ) ) )
            // InternalGo.g:2919:2: ( ( 'true' ) )
            {
            // InternalGo.g:2919:2: ( ( 'true' ) )
            // InternalGo.g:2920:3: ( 'true' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getValueTrueKeyword_0_1_0()); 
            }
            // InternalGo.g:2921:3: ( 'true' )
            // InternalGo.g:2922:4: 'true'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getValueTrueKeyword_0_1_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getValueTrueKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getValueTrueKeyword_0_1_0()); 
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
    // InternalGo.g:2933:1: rule__DecFunc__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DecFunc__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2937:1: ( ( RULE_ID ) )
            // InternalGo.g:2938:2: ( RULE_ID )
            {
            // InternalGo.g:2938:2: ( RULE_ID )
            // InternalGo.g:2939:3: RULE_ID
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


    // $ANTLR start "rule__DecFunc__ParameterAssignment_3"
    // InternalGo.g:2948:1: rule__DecFunc__ParameterAssignment_3 : ( RULE_ID ) ;
    public final void rule__DecFunc__ParameterAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2952:1: ( ( RULE_ID ) )
            // InternalGo.g:2953:2: ( RULE_ID )
            {
            // InternalGo.g:2953:2: ( RULE_ID )
            // InternalGo.g:2954:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecFuncAccess().getParameterIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecFuncAccess().getParameterIDTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__DecFunc__ParameterAssignment_3"


    // $ANTLR start "rule__DecFunc__ParameterAssignment_4_1"
    // InternalGo.g:2963:1: rule__DecFunc__ParameterAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__DecFunc__ParameterAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2967:1: ( ( RULE_ID ) )
            // InternalGo.g:2968:2: ( RULE_ID )
            {
            // InternalGo.g:2968:2: ( RULE_ID )
            // InternalGo.g:2969:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecFuncAccess().getParameterIDTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecFuncAccess().getParameterIDTerminalRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__DecFunc__ParameterAssignment_4_1"


    // $ANTLR start "rule__DecFunc__ArgsAssignment_7"
    // InternalGo.g:2978:1: rule__DecFunc__ArgsAssignment_7 : ( ruleGreeting ) ;
    public final void rule__DecFunc__ArgsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2982:1: ( ( ruleGreeting ) )
            // InternalGo.g:2983:2: ( ruleGreeting )
            {
            // InternalGo.g:2983:2: ( ruleGreeting )
            // InternalGo.g:2984:3: ruleGreeting
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecFuncAccess().getArgsGreetingParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGreeting();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecFuncAccess().getArgsGreetingParserRuleCall_7_0()); 
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
    // $ANTLR end "rule__DecFunc__ArgsAssignment_7"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // InternalGo.g:2993:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2997:1: ( ( RULE_ID ) )
            // InternalGo.g:2998:2: ( RULE_ID )
            {
            // InternalGo.g:2998:2: ( RULE_ID )
            // InternalGo.g:2999:3: RULE_ID
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000180008600012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000804000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000220400000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000184008600010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000180008600010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000003E0000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000003E0000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040800000080L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000060L});

}