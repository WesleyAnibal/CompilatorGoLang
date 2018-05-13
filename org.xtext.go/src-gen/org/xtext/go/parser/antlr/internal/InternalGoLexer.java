package org.xtext.go.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGoLexer extends Lexer {
    public static final int T__19=19;
    public static final int RULE_COMMENTS=9;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int RULE_EOL=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_NEWLINE=8;
    public static final int RULE_STRING=7;
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

    public InternalGoLexer() {;} 
    public InternalGoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGo.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:11:7: ( '=' )
            // InternalGo.g:11:9: '='
            {
            match('='); 

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
            // InternalGo.g:12:7: ( ',' )
            // InternalGo.g:12:9: ','
            {
            match(','); 

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
            // InternalGo.g:13:7: ( '{' )
            // InternalGo.g:13:9: '{'
            {
            match('{'); 

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
            // InternalGo.g:14:7: ( '}' )
            // InternalGo.g:14:9: '}'
            {
            match('}'); 

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
            // InternalGo.g:15:7: ( '||' )
            // InternalGo.g:15:9: '||'
            {
            match("||"); 


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
            // InternalGo.g:16:7: ( '&&' )
            // InternalGo.g:16:9: '&&'
            {
            match("&&"); 


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
            // InternalGo.g:17:7: ( '<' )
            // InternalGo.g:17:9: '<'
            {
            match('<'); 

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
            // InternalGo.g:18:7: ( '<=' )
            // InternalGo.g:18:9: '<='
            {
            match("<="); 


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
            // InternalGo.g:19:7: ( '==' )
            // InternalGo.g:19:9: '=='
            {
            match("=="); 


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
            // InternalGo.g:20:7: ( '>=' )
            // InternalGo.g:20:9: '>='
            {
            match(">="); 


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
            // InternalGo.g:21:7: ( '>' )
            // InternalGo.g:21:9: '>'
            {
            match('>'); 

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
            // InternalGo.g:22:7: ( '(' )
            // InternalGo.g:22:9: '('
            {
            match('('); 

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
            // InternalGo.g:23:7: ( ')' )
            // InternalGo.g:23:9: ')'
            {
            match(')'); 

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
            // InternalGo.g:24:7: ( 'true' )
            // InternalGo.g:24:9: 'true'
            {
            match("true"); 


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
            // InternalGo.g:25:7: ( 'false' )
            // InternalGo.g:25:9: 'false'
            {
            match("false"); 


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
            // InternalGo.g:26:7: ( 'break' )
            // InternalGo.g:26:9: 'break'
            {
            match("break"); 


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
            // InternalGo.g:27:7: ( 'case' )
            // InternalGo.g:27:9: 'case'
            {
            match("case"); 


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
            // InternalGo.g:28:7: ( 'chan' )
            // InternalGo.g:28:9: 'chan'
            {
            match("chan"); 


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
            // InternalGo.g:29:7: ( 'const' )
            // InternalGo.g:29:9: 'const'
            {
            match("const"); 


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
            // InternalGo.g:30:7: ( 'continue' )
            // InternalGo.g:30:9: 'continue'
            {
            match("continue"); 


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
            // InternalGo.g:31:7: ( 'else' )
            // InternalGo.g:31:9: 'else'
            {
            match("else"); 


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
            // InternalGo.g:32:7: ( 'for' )
            // InternalGo.g:32:9: 'for'
            {
            match("for"); 


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
            // InternalGo.g:33:7: ( 'func' )
            // InternalGo.g:33:9: 'func'
            {
            match("func"); 


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
            // InternalGo.g:34:7: ( 'if' )
            // InternalGo.g:34:9: 'if'
            {
            match("if"); 


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
            // InternalGo.g:35:7: ( 'import' )
            // InternalGo.g:35:9: 'import'
            {
            match("import"); 


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
            // InternalGo.g:36:7: ( 'return' )
            // InternalGo.g:36:9: 'return'
            {
            match("return"); 


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
            // InternalGo.g:37:7: ( 'package' )
            // InternalGo.g:37:9: 'package'
            {
            match("package"); 


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
            // InternalGo.g:38:7: ( 'type' )
            // InternalGo.g:38:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:39:7: ( 'var' )
            // InternalGo.g:39:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:40:7: ( 'range' )
            // InternalGo.g:40:9: 'range'
            {
            match("range"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:41:7: ( 'print' )
            // InternalGo.g:41:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:42:7: ( 'datatype' )
            // InternalGo.g:42:9: 'datatype'
            {
            match("datatype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "RULE_EOL"
    public final void mRULE_EOL() throws RecognitionException {
        try {
            int _type = RULE_EOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:1409:10: ( ( RULE_NEWLINE | RULE_COMMENTS ) )
            // InternalGo.g:1409:12: ( RULE_NEWLINE | RULE_COMMENTS )
            {
            // InternalGo.g:1409:12: ( RULE_NEWLINE | RULE_COMMENTS )
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
                    // InternalGo.g:1409:13: RULE_NEWLINE
                    {
                    mRULE_NEWLINE(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:1409:26: RULE_COMMENTS
                    {
                    mRULE_COMMENTS(); 

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

    // $ANTLR start "RULE_COMMENTS"
    public final void mRULE_COMMENTS() throws RecognitionException {
        try {
            // InternalGo.g:1411:24: ( ( RULE_ML_COMMENT | RULE_SL_COMMENT ) )
            // InternalGo.g:1411:26: ( RULE_ML_COMMENT | RULE_SL_COMMENT )
            {
            // InternalGo.g:1411:26: ( RULE_ML_COMMENT | RULE_SL_COMMENT )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='/') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='*') ) {
                    alt2=1;
                }
                else if ( (LA2_1=='/') ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGo.g:1411:27: RULE_ML_COMMENT
                    {
                    mRULE_ML_COMMENT(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:1411:43: RULE_SL_COMMENT
                    {
                    mRULE_SL_COMMENT(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENTS"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:1413:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGo.g:1413:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGo.g:1413:24: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='*') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='/') ) {
                        alt3=2;
                    }
                    else if ( ((LA3_1>='\u0000' && LA3_1<='.')||(LA3_1>='0' && LA3_1<='\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<=')')||(LA3_0>='+' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGo.g:1413:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
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

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:1415:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGo.g:1415:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGo.g:1415:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGo.g:1415:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop4;
                }
            } while (true);

            // InternalGo.g:1415:40: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGo.g:1415:41: ( '\\r' )? '\\n'
                    {
                    // InternalGo.g:1415:41: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalGo.g:1415:41: '\\r'
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
            // InternalGo.g:1417:23: ( ( '\\r' )? '\\n' )
            // InternalGo.g:1417:25: ( '\\r' )? '\\n'
            {
            // InternalGo.g:1417:25: ( '\\r' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGo.g:1417:25: '\\r'
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
            // InternalGo.g:1419:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGo.g:1419:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGo.g:1419:11: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGo.g:1419:11: '^'
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

            // InternalGo.g:1419:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
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
            	    break loop9;
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
            // InternalGo.g:1421:10: ( ( '0' .. '9' )+ )
            // InternalGo.g:1421:12: ( '0' .. '9' )+
            {
            // InternalGo.g:1421:12: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGo.g:1421:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
            // InternalGo.g:1423:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGo.g:1423:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGo.g:1423:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\"') ) {
                alt13=1;
            }
            else if ( (LA13_0=='\'') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalGo.g:1423:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGo.g:1423:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalGo.g:1423:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:1423:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop11;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:1423:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGo.g:1423:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalGo.g:1423:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:1423:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop12;
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:1425:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGo.g:1425:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGo.g:1425:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // InternalGo.g:1427:16: ( . )
            // InternalGo.g:1427:18: .
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
        // InternalGo.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | RULE_EOL | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER )
        int alt15=40;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalGo.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalGo.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalGo.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalGo.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalGo.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalGo.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalGo.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalGo.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalGo.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalGo.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalGo.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalGo.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalGo.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalGo.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalGo.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalGo.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalGo.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalGo.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalGo.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalGo.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalGo.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalGo.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalGo.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalGo.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalGo.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalGo.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalGo.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalGo.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalGo.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalGo.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalGo.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalGo.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalGo.g:1:202: RULE_EOL
                {
                mRULE_EOL(); 

                }
                break;
            case 34 :
                // InternalGo.g:1:211: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 35 :
                // InternalGo.g:1:227: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 36 :
                // InternalGo.g:1:243: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 37 :
                // InternalGo.g:1:251: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 38 :
                // InternalGo.g:1:260: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 39 :
                // InternalGo.g:1:272: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 40 :
                // InternalGo.g:1:280: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\40\3\uffff\2\36\1\47\1\51\2\uffff\12\56\1\77\1\101\2\36\2\uffff\2\36\17\uffff\2\56\1\uffff\10\56\1\120\7\56\1\uffff\1\101\2\uffff\1\101\2\uffff\3\56\1\140\6\56\1\uffff\5\56\1\155\1\56\2\uffff\1\101\2\uffff\1\160\1\161\1\56\1\uffff\1\163\1\56\1\165\1\166\2\56\1\171\5\56\1\uffff\1\56\1\101\2\uffff\1\u0080\1\uffff\1\u0081\2\uffff\1\u0082\1\56\1\uffff\2\56\1\u0086\1\56\1\u0088\1\56\3\uffff\1\56\1\u008b\1\u008c\1\uffff\1\56\1\uffff\2\56\2\uffff\1\u0090\1\56\1\u0092\1\uffff\1\u0093\2\uffff";
    static final String DFA15_eofS =
        "\u0094\uffff";
    static final String DFA15_minS =
        "\1\0\1\75\3\uffff\1\174\1\46\2\75\2\uffff\1\162\1\141\1\162\1\141\1\154\1\146\4\141\1\12\1\11\1\52\1\101\2\uffff\2\0\17\uffff\1\165\1\160\1\uffff\1\154\1\162\1\156\1\145\1\163\1\141\1\156\1\163\1\60\1\160\1\164\1\156\1\143\1\151\1\162\1\164\1\uffff\1\11\1\uffff\2\0\2\uffff\2\145\1\163\1\60\1\143\1\141\1\145\1\156\1\163\1\145\1\uffff\1\157\1\165\1\147\1\153\1\156\1\60\1\141\3\0\1\12\1\uffff\2\60\1\145\1\uffff\1\60\1\153\2\60\1\164\1\151\1\60\2\162\1\145\1\141\1\164\1\uffff\1\164\1\0\2\uffff\1\60\1\uffff\1\60\2\uffff\1\60\1\156\1\uffff\1\164\1\156\1\60\1\147\1\60\1\171\3\uffff\1\165\2\60\1\uffff\1\145\1\uffff\1\160\1\145\2\uffff\1\60\1\145\1\60\1\uffff\1\60\2\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\75\3\uffff\1\174\1\46\2\75\2\uffff\1\171\1\165\1\162\1\157\1\154\1\155\1\145\1\162\2\141\1\12\1\40\1\57\1\172\2\uffff\2\uffff\17\uffff\1\165\1\160\1\uffff\1\154\1\162\1\156\1\145\1\163\1\141\1\156\1\163\1\172\1\160\1\164\1\156\1\143\1\151\1\162\1\164\1\uffff\1\40\1\uffff\2\uffff\2\uffff\2\145\1\163\1\172\1\143\1\141\1\145\1\156\1\164\1\145\1\uffff\1\157\1\165\1\147\1\153\1\156\1\172\1\141\3\uffff\1\12\1\uffff\2\172\1\145\1\uffff\1\172\1\153\2\172\1\164\1\151\1\172\2\162\1\145\1\141\1\164\1\uffff\1\164\1\uffff\2\uffff\1\172\1\uffff\1\172\2\uffff\1\172\1\156\1\uffff\1\164\1\156\1\172\1\147\1\172\1\171\3\uffff\1\165\2\172\1\uffff\1\145\1\uffff\1\160\1\145\2\uffff\1\172\1\145\1\172\1\uffff\1\172\2\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\1\3\1\4\4\uffff\1\14\1\15\16\uffff\1\44\1\45\2\uffff\1\47\1\50\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\10\1\7\1\12\1\13\1\14\1\15\2\uffff\1\44\20\uffff\1\47\1\uffff\1\41\2\uffff\1\45\1\46\12\uffff\1\30\13\uffff\1\41\3\uffff\1\26\14\uffff\1\35\2\uffff\1\16\1\34\1\uffff\1\27\1\uffff\1\21\1\22\2\uffff\1\25\6\uffff\1\17\1\20\1\23\3\uffff\1\36\1\uffff\1\37\2\uffff\1\31\1\32\3\uffff\1\33\1\uffff\1\24\1\40";
    static final String DFA15_specialS =
        "\1\1\32\uffff\1\10\1\5\45\uffff\1\6\1\2\24\uffff\1\3\1\7\1\0\24\uffff\1\4\44\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\36\1\35\1\26\2\36\1\25\22\36\1\35\1\36\1\33\3\36\1\6\1\34\1\11\1\12\2\36\1\2\2\36\1\27\12\32\2\36\1\7\1\1\1\10\2\36\32\31\3\36\1\30\1\31\1\36\1\31\1\15\1\16\1\24\1\17\1\14\2\31\1\20\6\31\1\22\1\31\1\21\1\31\1\13\1\31\1\23\4\31\1\3\1\5\1\4\uff82\36",
            "\1\37",
            "",
            "",
            "",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\50",
            "",
            "",
            "\1\54\6\uffff\1\55",
            "\1\57\15\uffff\1\60\5\uffff\1\61",
            "\1\62",
            "\1\63\6\uffff\1\64\6\uffff\1\65",
            "\1\66",
            "\1\67\6\uffff\1\70",
            "\1\72\3\uffff\1\71",
            "\1\73\20\uffff\1\74",
            "\1\75",
            "\1\76",
            "\1\100",
            "\2\77\2\uffff\1\77\22\uffff\1\77",
            "\1\102\4\uffff\1\103",
            "\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\0\105",
            "\0\105",
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
            "",
            "",
            "",
            "\1\106",
            "\1\107",
            "",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "",
            "\2\77\2\uffff\1\77\22\uffff\1\77",
            "",
            "\52\131\1\130\uffd5\131",
            "\12\132\1\134\2\132\1\133\ufff2\132",
            "",
            "",
            "\1\135",
            "\1\136",
            "\1\137",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145\1\146",
            "\1\147",
            "",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\156",
            "\52\131\1\130\4\131\1\157\uffd0\131",
            "\52\131\1\130\uffd5\131",
            "\12\132\1\134\2\132\1\133\ufff2\132",
            "\1\134",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\162",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\164",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\167",
            "\1\170",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "",
            "\1\177",
            "\52\131\1\130\uffd5\131",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0083",
            "",
            "\1\u0084",
            "\1\u0085",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0087",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0089",
            "",
            "",
            "",
            "\1\u008a",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u008d",
            "",
            "\1\u008e",
            "\1\u008f",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0091",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | RULE_EOL | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_90 = input.LA(1);

                        s = -1;
                        if ( (LA15_90=='\r') ) {s = 91;}

                        else if ( (LA15_90=='\n') ) {s = 92;}

                        else if ( ((LA15_90>='\u0000' && LA15_90<='\t')||(LA15_90>='\u000B' && LA15_90<='\f')||(LA15_90>='\u000E' && LA15_90<='\uFFFF')) ) {s = 90;}

                        else s = 65;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='=') ) {s = 1;}

                        else if ( (LA15_0==',') ) {s = 2;}

                        else if ( (LA15_0=='{') ) {s = 3;}

                        else if ( (LA15_0=='}') ) {s = 4;}

                        else if ( (LA15_0=='|') ) {s = 5;}

                        else if ( (LA15_0=='&') ) {s = 6;}

                        else if ( (LA15_0=='<') ) {s = 7;}

                        else if ( (LA15_0=='>') ) {s = 8;}

                        else if ( (LA15_0=='(') ) {s = 9;}

                        else if ( (LA15_0==')') ) {s = 10;}

                        else if ( (LA15_0=='t') ) {s = 11;}

                        else if ( (LA15_0=='f') ) {s = 12;}

                        else if ( (LA15_0=='b') ) {s = 13;}

                        else if ( (LA15_0=='c') ) {s = 14;}

                        else if ( (LA15_0=='e') ) {s = 15;}

                        else if ( (LA15_0=='i') ) {s = 16;}

                        else if ( (LA15_0=='r') ) {s = 17;}

                        else if ( (LA15_0=='p') ) {s = 18;}

                        else if ( (LA15_0=='v') ) {s = 19;}

                        else if ( (LA15_0=='d') ) {s = 20;}

                        else if ( (LA15_0=='\r') ) {s = 21;}

                        else if ( (LA15_0=='\n') ) {s = 22;}

                        else if ( (LA15_0=='/') ) {s = 23;}

                        else if ( (LA15_0=='^') ) {s = 24;}

                        else if ( ((LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||LA15_0=='a'||(LA15_0>='g' && LA15_0<='h')||(LA15_0>='j' && LA15_0<='o')||LA15_0=='q'||LA15_0=='s'||LA15_0=='u'||(LA15_0>='w' && LA15_0<='z')) ) {s = 25;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 26;}

                        else if ( (LA15_0=='\"') ) {s = 27;}

                        else if ( (LA15_0=='\'') ) {s = 28;}

                        else if ( (LA15_0=='\t'||LA15_0==' ') ) {s = 29;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='%')||(LA15_0>='*' && LA15_0<='+')||(LA15_0>='-' && LA15_0<='.')||(LA15_0>=':' && LA15_0<=';')||(LA15_0>='?' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_67 = input.LA(1);

                        s = -1;
                        if ( ((LA15_67>='\u0000' && LA15_67<='\t')||(LA15_67>='\u000B' && LA15_67<='\f')||(LA15_67>='\u000E' && LA15_67<='\uFFFF')) ) {s = 90;}

                        else if ( (LA15_67=='\r') ) {s = 91;}

                        else if ( (LA15_67=='\n') ) {s = 92;}

                        else s = 65;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_88 = input.LA(1);

                        s = -1;
                        if ( (LA15_88=='/') ) {s = 111;}

                        else if ( (LA15_88=='*') ) {s = 88;}

                        else if ( ((LA15_88>='\u0000' && LA15_88<=')')||(LA15_88>='+' && LA15_88<='.')||(LA15_88>='0' && LA15_88<='\uFFFF')) ) {s = 89;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_111 = input.LA(1);

                        s = -1;
                        if ( (LA15_111=='*') ) {s = 88;}

                        else if ( ((LA15_111>='\u0000' && LA15_111<=')')||(LA15_111>='+' && LA15_111<='\uFFFF')) ) {s = 89;}

                        else s = 65;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_28 = input.LA(1);

                        s = -1;
                        if ( ((LA15_28>='\u0000' && LA15_28<='\uFFFF')) ) {s = 69;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_66 = input.LA(1);

                        s = -1;
                        if ( (LA15_66=='*') ) {s = 88;}

                        else if ( ((LA15_66>='\u0000' && LA15_66<=')')||(LA15_66>='+' && LA15_66<='\uFFFF')) ) {s = 89;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA15_89 = input.LA(1);

                        s = -1;
                        if ( (LA15_89=='*') ) {s = 88;}

                        else if ( ((LA15_89>='\u0000' && LA15_89<=')')||(LA15_89>='+' && LA15_89<='\uFFFF')) ) {s = 89;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA15_27 = input.LA(1);

                        s = -1;
                        if ( ((LA15_27>='\u0000' && LA15_27<='\uFFFF')) ) {s = 69;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}