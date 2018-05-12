package org.xtext.go.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGoLexer extends Lexer {
    public static final int RULE_NEWLINE=7;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_EOL=4;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalGoLexer() {;} 
    public InternalGoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGo.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:11:7: ( 'break' )
            // InternalGo.g:11:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:12:7: ( 'case' )
            // InternalGo.g:12:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:13:7: ( 'chan' )
            // InternalGo.g:13:9: 'chan'
            {
            match("chan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:14:7: ( 'const' )
            // InternalGo.g:14:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:15:7: ( 'continue' )
            // InternalGo.g:15:9: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:16:7: ( 'else' )
            // InternalGo.g:16:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:17:7: ( 'for' )
            // InternalGo.g:17:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:18:7: ( 'func' )
            // InternalGo.g:18:9: 'func'
            {
            match("func"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:19:7: ( 'if' )
            // InternalGo.g:19:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:20:7: ( 'import' )
            // InternalGo.g:20:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:21:7: ( 'return' )
            // InternalGo.g:21:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:22:7: ( 'package' )
            // InternalGo.g:22:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:23:7: ( 'range' )
            // InternalGo.g:23:9: 'range'
            {
            match("range"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:24:7: ( '<' )
            // InternalGo.g:24:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:25:7: ( '<=' )
            // InternalGo.g:25:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:26:7: ( '==' )
            // InternalGo.g:26:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:27:7: ( '>=' )
            // InternalGo.g:27:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:28:7: ( '>' )
            // InternalGo.g:28:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:29:7: ( 'false' )
            // InternalGo.g:29:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:30:7: ( '{' )
            // InternalGo.g:30:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:31:7: ( '}' )
            // InternalGo.g:31:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:32:7: ( '||' )
            // InternalGo.g:32:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:33:7: ( '&&' )
            // InternalGo.g:33:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:34:7: ( '(' )
            // InternalGo.g:34:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:35:7: ( ')' )
            // InternalGo.g:35:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:36:7: ( ',' )
            // InternalGo.g:36:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:37:7: ( 'print' )
            // InternalGo.g:37:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:38:7: ( 'datatype' )
            // InternalGo.g:38:9: 'datatype'
            {
            match("datatype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:39:7: ( 'true' )
            // InternalGo.g:39:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "RULE_EOL"
    public final void mRULE_EOL() throws RecognitionException {
        try {
            int _type = RULE_EOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:2558:10: ( ( RULE_NEWLINE | RULE_SL_COMMENT ) )
            // InternalGo.g:2558:12: ( RULE_NEWLINE | RULE_SL_COMMENT )
            {
            // InternalGo.g:2558:12: ( RULE_NEWLINE | RULE_SL_COMMENT )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\n'||LA1_0=='\r') ) {
                alt1=1;
            }
            else if ( (LA1_0=='/') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGo.g:2558:13: RULE_NEWLINE
                    {
                    mRULE_NEWLINE(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:2558:26: RULE_SL_COMMENT
                    {
                    mRULE_SL_COMMENT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EOL"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:2560:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGo.g:2560:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGo.g:2560:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGo.g:2560:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalGo.g:2560:40: ( ( '\\r' )? '\\n' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\n'||LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGo.g:2560:41: ( '\\r' )? '\\n'
                    {
                    // InternalGo.g:2560:41: ( '\\r' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\r') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalGo.g:2560:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            // InternalGo.g:2562:23: ( ( '\\r' )? '\\n' )
            // InternalGo.g:2562:25: ( '\\r' )? '\\n'
            {
            // InternalGo.g:2562:25: ( '\\r' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGo.g:2562:25: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEWLINE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:2564:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGo.g:2564:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGo.g:2564:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGo.g:2564:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGo.g:2564:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGo.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:2566:10: ( ( '0' .. '9' )+ )
            // InternalGo.g:2566:12: ( '0' .. '9' )+
            {
            // InternalGo.g:2566:12: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGo.g:2566:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:2568:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGo.g:2568:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGo.g:2568:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalGo.g:2568:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGo.g:2568:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalGo.g:2568:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:2568:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:2568:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGo.g:2568:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalGo.g:2568:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:2568:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:2570:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGo.g:2570:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGo.g:2570:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGo.g:2570:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:2572:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGo.g:2572:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGo.g:2572:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGo.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:2574:16: ( . )
            // InternalGo.g:2574:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalGo.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_EOL | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=37;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalGo.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalGo.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalGo.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalGo.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalGo.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalGo.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalGo.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalGo.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalGo.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalGo.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalGo.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalGo.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalGo.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalGo.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalGo.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalGo.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalGo.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalGo.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalGo.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalGo.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalGo.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalGo.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalGo.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalGo.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalGo.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalGo.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalGo.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalGo.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalGo.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalGo.g:1:184: RULE_EOL
                {
                mRULE_EOL(); 

                }
                break;
            case 31 :
                // InternalGo.g:1:193: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 32 :
                // InternalGo.g:1:209: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 33 :
                // InternalGo.g:1:217: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 34 :
                // InternalGo.g:1:226: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 35 :
                // InternalGo.g:1:238: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 36 :
                // InternalGo.g:1:254: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 37 :
                // InternalGo.g:1:262: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\7\37\1\56\1\35\1\61\2\uffff\2\35\3\uffff\2\37\1\74\1\75\2\35\2\uffff\2\35\2\uffff\1\37\1\uffff\7\37\1\112\5\37\14\uffff\2\37\1\75\2\uffff\1\75\3\uffff\5\37\1\133\2\37\1\uffff\7\37\1\75\2\uffff\1\37\1\146\1\147\2\37\1\152\1\uffff\1\153\7\37\1\163\1\164\2\uffff\1\165\1\37\2\uffff\1\167\2\37\1\172\1\37\1\174\1\37\3\uffff\1\37\1\uffff\1\177\1\u0080\1\uffff\1\37\1\uffff\2\37\2\uffff\1\u0084\1\37\1\u0086\1\uffff\1\u0087\2\uffff";
    static final String DFA14_eofS =
        "\u0088\uffff";
    static final String DFA14_minS =
        "\1\0\1\162\1\141\1\154\1\141\1\146\2\141\3\75\2\uffff\1\174\1\46\3\uffff\1\141\1\162\1\12\1\11\1\52\1\101\2\uffff\2\0\2\uffff\1\145\1\uffff\1\163\1\141\1\156\1\163\1\162\1\156\1\154\1\60\1\160\1\164\1\156\1\143\1\151\14\uffff\1\164\1\165\1\11\2\uffff\1\0\3\uffff\1\141\1\145\1\156\1\163\1\145\1\60\1\143\1\163\1\uffff\1\157\1\165\1\147\1\153\1\156\1\141\1\145\1\0\1\12\1\uffff\1\153\2\60\1\164\1\151\1\60\1\uffff\1\60\1\145\2\162\1\145\1\141\2\164\2\60\2\uffff\1\60\1\156\2\uffff\1\60\1\164\1\156\1\60\1\147\1\60\1\171\3\uffff\1\165\1\uffff\2\60\1\uffff\1\145\1\uffff\1\160\1\145\2\uffff\1\60\1\145\1\60\1\uffff\1\60\2\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\162\1\157\1\154\1\165\1\155\1\145\1\162\3\75\2\uffff\1\174\1\46\3\uffff\1\141\1\162\1\12\1\40\1\57\1\172\2\uffff\2\uffff\2\uffff\1\145\1\uffff\1\163\1\141\1\156\1\163\1\162\1\156\1\154\1\172\1\160\1\164\1\156\1\143\1\151\14\uffff\1\164\1\165\1\40\2\uffff\1\uffff\3\uffff\1\141\1\145\1\156\1\164\1\145\1\172\1\143\1\163\1\uffff\1\157\1\165\1\147\1\153\1\156\1\141\1\145\1\uffff\1\12\1\uffff\1\153\2\172\1\164\1\151\1\172\1\uffff\1\172\1\145\2\162\1\145\1\141\2\164\2\172\2\uffff\1\172\1\156\2\uffff\1\172\1\164\1\156\1\172\1\147\1\172\1\171\3\uffff\1\165\1\uffff\2\172\1\uffff\1\145\1\uffff\1\160\1\145\2\uffff\1\172\1\145\1\172\1\uffff\1\172\2\uffff";
    static final String DFA14_acceptS =
        "\13\uffff\1\24\1\25\2\uffff\1\30\1\31\1\32\6\uffff\1\40\1\41\2\uffff\1\44\1\45\1\uffff\1\40\15\uffff\1\17\1\16\1\20\1\21\1\22\1\24\1\25\1\26\1\27\1\30\1\31\1\32\3\uffff\1\44\1\36\1\uffff\1\43\1\41\1\42\10\uffff\1\11\11\uffff\1\36\6\uffff\1\7\12\uffff\1\2\1\3\2\uffff\1\6\1\10\7\uffff\1\35\1\1\1\4\1\uffff\1\23\2\uffff\1\15\1\uffff\1\33\2\uffff\1\12\1\13\3\uffff\1\14\1\uffff\1\5\1\34";
    static final String DFA14_specialS =
        "\1\4\31\uffff\1\3\1\1\42\uffff\1\2\23\uffff\1\0\65\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\35\1\34\1\25\2\35\1\24\22\35\1\34\1\35\1\32\3\35\1\16\1\33\1\17\1\20\2\35\1\21\2\35\1\26\12\31\2\35\1\10\1\11\1\12\2\35\32\30\3\35\1\27\1\30\1\35\1\30\1\1\1\2\1\22\1\3\1\4\2\30\1\5\6\30\1\7\1\30\1\6\1\30\1\23\6\30\1\13\1\15\1\14\uff82\35",
            "\1\36",
            "\1\40\6\uffff\1\41\6\uffff\1\42",
            "\1\43",
            "\1\46\15\uffff\1\44\5\uffff\1\45",
            "\1\47\6\uffff\1\50",
            "\1\52\3\uffff\1\51",
            "\1\53\20\uffff\1\54",
            "\1\55",
            "\1\57",
            "\1\60",
            "",
            "",
            "\1\64",
            "\1\65",
            "",
            "",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\2\74\2\uffff\1\74\22\uffff\1\74",
            "\1\77\4\uffff\1\76",
            "\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\0\101",
            "\0\101",
            "",
            "",
            "\1\102",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
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
            "",
            "",
            "\1\120",
            "\1\121",
            "\2\74\2\uffff\1\74\22\uffff\1\74",
            "",
            "",
            "\12\122\1\124\2\122\1\123\ufff2\122",
            "",
            "",
            "",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130\1\131",
            "\1\132",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\134",
            "\1\135",
            "",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\122\1\124\2\122\1\123\ufff2\122",
            "\1\124",
            "",
            "\1\145",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\150",
            "\1\151",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\166",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\170",
            "\1\171",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\173",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\175",
            "",
            "",
            "",
            "\1\176",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u0081",
            "",
            "\1\u0082",
            "\1\u0083",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0085",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_EOL | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_82 = input.LA(1);

                        s = -1;
                        if ( (LA14_82=='\r') ) {s = 83;}

                        else if ( (LA14_82=='\n') ) {s = 84;}

                        else if ( ((LA14_82>='\u0000' && LA14_82<='\t')||(LA14_82>='\u000B' && LA14_82<='\f')||(LA14_82>='\u000E' && LA14_82<='\uFFFF')) ) {s = 82;}

                        else s = 61;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_27 = input.LA(1);

                        s = -1;
                        if ( ((LA14_27>='\u0000' && LA14_27<='\uFFFF')) ) {s = 65;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_62 = input.LA(1);

                        s = -1;
                        if ( ((LA14_62>='\u0000' && LA14_62<='\t')||(LA14_62>='\u000B' && LA14_62<='\f')||(LA14_62>='\u000E' && LA14_62<='\uFFFF')) ) {s = 82;}

                        else if ( (LA14_62=='\r') ) {s = 83;}

                        else if ( (LA14_62=='\n') ) {s = 84;}

                        else s = 61;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_26 = input.LA(1);

                        s = -1;
                        if ( ((LA14_26>='\u0000' && LA14_26<='\uFFFF')) ) {s = 65;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='b') ) {s = 1;}

                        else if ( (LA14_0=='c') ) {s = 2;}

                        else if ( (LA14_0=='e') ) {s = 3;}

                        else if ( (LA14_0=='f') ) {s = 4;}

                        else if ( (LA14_0=='i') ) {s = 5;}

                        else if ( (LA14_0=='r') ) {s = 6;}

                        else if ( (LA14_0=='p') ) {s = 7;}

                        else if ( (LA14_0=='<') ) {s = 8;}

                        else if ( (LA14_0=='=') ) {s = 9;}

                        else if ( (LA14_0=='>') ) {s = 10;}

                        else if ( (LA14_0=='{') ) {s = 11;}

                        else if ( (LA14_0=='}') ) {s = 12;}

                        else if ( (LA14_0=='|') ) {s = 13;}

                        else if ( (LA14_0=='&') ) {s = 14;}

                        else if ( (LA14_0=='(') ) {s = 15;}

                        else if ( (LA14_0==')') ) {s = 16;}

                        else if ( (LA14_0==',') ) {s = 17;}

                        else if ( (LA14_0=='d') ) {s = 18;}

                        else if ( (LA14_0=='t') ) {s = 19;}

                        else if ( (LA14_0=='\r') ) {s = 20;}

                        else if ( (LA14_0=='\n') ) {s = 21;}

                        else if ( (LA14_0=='/') ) {s = 22;}

                        else if ( (LA14_0=='^') ) {s = 23;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='a'||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='o')||LA14_0=='q'||LA14_0=='s'||(LA14_0>='u' && LA14_0<='z')) ) {s = 24;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 25;}

                        else if ( (LA14_0=='\"') ) {s = 26;}

                        else if ( (LA14_0=='\'') ) {s = 27;}

                        else if ( (LA14_0=='\t'||LA14_0==' ') ) {s = 28;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='%')||(LA14_0>='*' && LA14_0<='+')||(LA14_0>='-' && LA14_0<='.')||(LA14_0>=':' && LA14_0<=';')||(LA14_0>='?' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}