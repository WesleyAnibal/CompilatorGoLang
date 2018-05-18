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
    public static final int T__50=50;
    public static final int RULE_OPEN_KEY=12;
    public static final int RULE_OPEN_PARENTHESES=7;
    public static final int RULE_BAR=18;
    public static final int RULE_COMMENTS=21;
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
    public static final int RULE_ID=5;
    public static final int RULE_EOL=4;
    public static final int RULE_COMMA=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int RULE_ML_COMMENT=22;
    public static final int RULE_NEWLINE=20;
    public static final int RULE_ASTERICS=17;
    public static final int RULE_STRING=14;
    public static final int RULE_SL_COMMENT=23;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_OPEN_BRACKETS=9;
    public static final int RULE_PLUS=15;
    public static final int T__36=36;
    public static final int RULE_DOT=19;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=24;
    public static final int RULE_CLOSED_KEY=13;
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
    public static final int RULE_CLOSED_BRACKETS=11;

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

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
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
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:12:7: ( ':=' )
            // InternalGo.g:12:9: ':='
            {
            match(":="); 


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
            // InternalGo.g:13:7: ( '||' )
            // InternalGo.g:13:9: '||'
            {
            match("||"); 


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
            // InternalGo.g:14:7: ( '&&' )
            // InternalGo.g:14:9: '&&'
            {
            match("&&"); 


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
            // InternalGo.g:15:7: ( '<' )
            // InternalGo.g:15:9: '<'
            {
            match('<'); 

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
            // InternalGo.g:16:7: ( '<=' )
            // InternalGo.g:16:9: '<='
            {
            match("<="); 


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
            // InternalGo.g:17:7: ( '==' )
            // InternalGo.g:17:9: '=='
            {
            match("=="); 


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
            // InternalGo.g:18:7: ( '>=' )
            // InternalGo.g:18:9: '>='
            {
            match(">="); 


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
            // InternalGo.g:19:7: ( '>' )
            // InternalGo.g:19:9: '>'
            {
            match('>'); 

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
            // InternalGo.g:20:7: ( 'string' )
            // InternalGo.g:20:9: 'string'
            {
            match("string"); 


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
            // InternalGo.g:21:7: ( 'int' )
            // InternalGo.g:21:9: 'int'
            {
            match("int"); 


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
            // InternalGo.g:22:7: ( 'bool' )
            // InternalGo.g:22:9: 'bool'
            {
            match("bool"); 


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
            // InternalGo.g:23:7: ( 'byte' )
            // InternalGo.g:23:9: 'byte'
            {
            match("byte"); 


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
            // InternalGo.g:24:7: ( 'rune' )
            // InternalGo.g:24:9: 'rune'
            {
            match("rune"); 


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
            // InternalGo.g:25:7: ( 'float32' )
            // InternalGo.g:25:9: 'float32'
            {
            match("float32"); 


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
            // InternalGo.g:26:7: ( 'float64' )
            // InternalGo.g:26:9: 'float64'
            {
            match("float64"); 


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
            // InternalGo.g:27:7: ( 'true' )
            // InternalGo.g:27:9: 'true'
            {
            match("true"); 


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
            // InternalGo.g:28:7: ( 'false' )
            // InternalGo.g:28:9: 'false'
            {
            match("false"); 


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
            // InternalGo.g:29:7: ( 'break' )
            // InternalGo.g:29:9: 'break'
            {
            match("break"); 


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
            // InternalGo.g:30:7: ( 'case' )
            // InternalGo.g:30:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:31:7: ( 'chan' )
            // InternalGo.g:31:9: 'chan'
            {
            match("chan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:32:7: ( 'const' )
            // InternalGo.g:32:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:33:7: ( 'continue' )
            // InternalGo.g:33:9: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:34:7: ( 'else' )
            // InternalGo.g:34:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:35:7: ( 'for' )
            // InternalGo.g:35:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:36:7: ( 'func' )
            // InternalGo.g:36:9: 'func'
            {
            match("func"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:37:7: ( 'if' )
            // InternalGo.g:37:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:38:7: ( 'import' )
            // InternalGo.g:38:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:39:7: ( 'return' )
            // InternalGo.g:39:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:40:7: ( 'package' )
            // InternalGo.g:40:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:41:7: ( 'type' )
            // InternalGo.g:41:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:42:7: ( 'var' )
            // InternalGo.g:42:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:43:7: ( 'range' )
            // InternalGo.g:43:9: 'range'
            {
            match("range"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:44:7: ( 'datatype' )
            // InternalGo.g:44:9: 'datatype'
            {
            match("datatype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "RULE_OPEN_KEY"
    public final void mRULE_OPEN_KEY() throws RecognitionException {
        try {
            int _type = RULE_OPEN_KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:2492:15: ( '{' )
            // InternalGo.g:2492:17: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OPEN_KEY"

    // $ANTLR start "RULE_CLOSED_KEY"
    public final void mRULE_CLOSED_KEY() throws RecognitionException {
        try {
            int _type = RULE_CLOSED_KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:2494:17: ( '}' )
            // InternalGo.g:2494:19: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CLOSED_KEY"

    // $ANTLR start "RULE_OPEN_BRACKETS"
    public final void mRULE_OPEN_BRACKETS() throws RecognitionException {
        try {
            int _type = RULE_OPEN_BRACKETS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:2496:20: ( '[' )
            // InternalGo.g:2496:22: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OPEN_BRACKETS"

    // $ANTLR start "RULE_CLOSED_BRACKETS"
    public final void mRULE_CLOSED_BRACKETS() throws RecognitionException {
        try {
            int _type = RULE_CLOSED_BRACKETS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:2498:22: ( ']' )
            // InternalGo.g:2498:24: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CLOSED_BRACKETS"

    // $ANTLR start "RULE_DOT"
    public final void mRULE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:2500:10: ( '.' )
            // InternalGo.g:2500:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:2502:12: ( ',' )
            // InternalGo.g:2502:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_OPEN_PARENTHESES"
    public final void mRULE_OPEN_PARENTHESES() throws RecognitionException {
        try {
            int _type = RULE_OPEN_PARENTHESES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:2504:23: ( '(' )
            // InternalGo.g:2504:25: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OPEN_PARENTHESES"

    // $ANTLR start "RULE_CLOSED_PARENTHESES"
    public final void mRULE_CLOSED_PARENTHESES() throws RecognitionException {
        try {
            int _type = RULE_CLOSED_PARENTHESES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:2506:25: ( ')' )
            // InternalGo.g:2506:27: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CLOSED_PARENTHESES"

    // $ANTLR start "RULE_BAR"
    public final void mRULE_BAR() throws RecognitionException {
        try {
            int _type = RULE_BAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:2508:10: ( '/' )
            // InternalGo.g:2508:12: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BAR"

    // $ANTLR start "RULE_ASTERICS"
    public final void mRULE_ASTERICS() throws RecognitionException {
        try {
            int _type = RULE_ASTERICS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:2510:15: ( '*' )
            // InternalGo.g:2510:17: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASTERICS"

    // $ANTLR start "RULE_MINUS"
    public final void mRULE_MINUS() throws RecognitionException {
        try {
            int _type = RULE_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:2512:12: ( '-' )
            // InternalGo.g:2512:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUS"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:2514:11: ( '+' )
            // InternalGo.g:2514:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS"

    // $ANTLR start "RULE_EOL"
    public final void mRULE_EOL() throws RecognitionException {
        try {
            int _type = RULE_EOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:2516:10: ( ( RULE_NEWLINE | RULE_COMMENTS ) )
            // InternalGo.g:2516:12: ( RULE_NEWLINE | RULE_COMMENTS )
            {
            // InternalGo.g:2516:12: ( RULE_NEWLINE | RULE_COMMENTS )
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
                    // InternalGo.g:2516:13: RULE_NEWLINE
                    {
                    mRULE_NEWLINE(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:2516:26: RULE_COMMENTS
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
            // InternalGo.g:2518:24: ( ( RULE_ML_COMMENT | RULE_SL_COMMENT ) )
            // InternalGo.g:2518:26: ( RULE_ML_COMMENT | RULE_SL_COMMENT )
            {
            // InternalGo.g:2518:26: ( RULE_ML_COMMENT | RULE_SL_COMMENT )
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
                    // InternalGo.g:2518:27: RULE_ML_COMMENT
                    {
                    mRULE_ML_COMMENT(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:2518:43: RULE_SL_COMMENT
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
            // InternalGo.g:2520:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGo.g:2520:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGo.g:2520:24: ( options {greedy=false; } : . )*
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
            	    // InternalGo.g:2520:52: .
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
            // InternalGo.g:2522:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGo.g:2522:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGo.g:2522:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGo.g:2522:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalGo.g:2522:40: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGo.g:2522:41: ( '\\r' )? '\\n'
                    {
                    // InternalGo.g:2522:41: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalGo.g:2522:41: '\\r'
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
            // InternalGo.g:2524:23: ( ( '\\r' )? '\\n' )
            // InternalGo.g:2524:25: ( '\\r' )? '\\n'
            {
            // InternalGo.g:2524:25: ( '\\r' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGo.g:2524:25: '\\r'
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
            // InternalGo.g:2526:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGo.g:2526:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGo.g:2526:11: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGo.g:2526:11: '^'
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

            // InternalGo.g:2526:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalGo.g:2528:10: ( ( '0' .. '9' )+ )
            // InternalGo.g:2528:12: ( '0' .. '9' )+
            {
            // InternalGo.g:2528:12: ( '0' .. '9' )+
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
            	    // InternalGo.g:2528:13: '0' .. '9'
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
            // InternalGo.g:2530:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGo.g:2530:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGo.g:2530:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalGo.g:2530:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGo.g:2530:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalGo.g:2530:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:2530:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalGo.g:2530:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGo.g:2530:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalGo.g:2530:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:2530:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalGo.g:2532:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGo.g:2532:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGo.g:2532:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalGo.g:2534:16: ( . )
            // InternalGo.g:2534:18: .
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
        // InternalGo.g:1:8: ( T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | RULE_OPEN_KEY | RULE_CLOSED_KEY | RULE_OPEN_BRACKETS | RULE_CLOSED_BRACKETS | RULE_DOT | RULE_COMMA | RULE_OPEN_PARENTHESES | RULE_CLOSED_PARENTHESES | RULE_BAR | RULE_ASTERICS | RULE_MINUS | RULE_PLUS | RULE_EOL | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER )
        int alt15=54;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalGo.g:1:10: T__26
                {
                mT__26(); 

                }
                break;
            case 2 :
                // InternalGo.g:1:16: T__27
                {
                mT__27(); 

                }
                break;
            case 3 :
                // InternalGo.g:1:22: T__28
                {
                mT__28(); 

                }
                break;
            case 4 :
                // InternalGo.g:1:28: T__29
                {
                mT__29(); 

                }
                break;
            case 5 :
                // InternalGo.g:1:34: T__30
                {
                mT__30(); 

                }
                break;
            case 6 :
                // InternalGo.g:1:40: T__31
                {
                mT__31(); 

                }
                break;
            case 7 :
                // InternalGo.g:1:46: T__32
                {
                mT__32(); 

                }
                break;
            case 8 :
                // InternalGo.g:1:52: T__33
                {
                mT__33(); 

                }
                break;
            case 9 :
                // InternalGo.g:1:58: T__34
                {
                mT__34(); 

                }
                break;
            case 10 :
                // InternalGo.g:1:64: T__35
                {
                mT__35(); 

                }
                break;
            case 11 :
                // InternalGo.g:1:70: T__36
                {
                mT__36(); 

                }
                break;
            case 12 :
                // InternalGo.g:1:76: T__37
                {
                mT__37(); 

                }
                break;
            case 13 :
                // InternalGo.g:1:82: T__38
                {
                mT__38(); 

                }
                break;
            case 14 :
                // InternalGo.g:1:88: T__39
                {
                mT__39(); 

                }
                break;
            case 15 :
                // InternalGo.g:1:94: T__40
                {
                mT__40(); 

                }
                break;
            case 16 :
                // InternalGo.g:1:100: T__41
                {
                mT__41(); 

                }
                break;
            case 17 :
                // InternalGo.g:1:106: T__42
                {
                mT__42(); 

                }
                break;
            case 18 :
                // InternalGo.g:1:112: T__43
                {
                mT__43(); 

                }
                break;
            case 19 :
                // InternalGo.g:1:118: T__44
                {
                mT__44(); 

                }
                break;
            case 20 :
                // InternalGo.g:1:124: T__45
                {
                mT__45(); 

                }
                break;
            case 21 :
                // InternalGo.g:1:130: T__46
                {
                mT__46(); 

                }
                break;
            case 22 :
                // InternalGo.g:1:136: T__47
                {
                mT__47(); 

                }
                break;
            case 23 :
                // InternalGo.g:1:142: T__48
                {
                mT__48(); 

                }
                break;
            case 24 :
                // InternalGo.g:1:148: T__49
                {
                mT__49(); 

                }
                break;
            case 25 :
                // InternalGo.g:1:154: T__50
                {
                mT__50(); 

                }
                break;
            case 26 :
                // InternalGo.g:1:160: T__51
                {
                mT__51(); 

                }
                break;
            case 27 :
                // InternalGo.g:1:166: T__52
                {
                mT__52(); 

                }
                break;
            case 28 :
                // InternalGo.g:1:172: T__53
                {
                mT__53(); 

                }
                break;
            case 29 :
                // InternalGo.g:1:178: T__54
                {
                mT__54(); 

                }
                break;
            case 30 :
                // InternalGo.g:1:184: T__55
                {
                mT__55(); 

                }
                break;
            case 31 :
                // InternalGo.g:1:190: T__56
                {
                mT__56(); 

                }
                break;
            case 32 :
                // InternalGo.g:1:196: T__57
                {
                mT__57(); 

                }
                break;
            case 33 :
                // InternalGo.g:1:202: T__58
                {
                mT__58(); 

                }
                break;
            case 34 :
                // InternalGo.g:1:208: T__59
                {
                mT__59(); 

                }
                break;
            case 35 :
                // InternalGo.g:1:214: RULE_OPEN_KEY
                {
                mRULE_OPEN_KEY(); 

                }
                break;
            case 36 :
                // InternalGo.g:1:228: RULE_CLOSED_KEY
                {
                mRULE_CLOSED_KEY(); 

                }
                break;
            case 37 :
                // InternalGo.g:1:244: RULE_OPEN_BRACKETS
                {
                mRULE_OPEN_BRACKETS(); 

                }
                break;
            case 38 :
                // InternalGo.g:1:263: RULE_CLOSED_BRACKETS
                {
                mRULE_CLOSED_BRACKETS(); 

                }
                break;
            case 39 :
                // InternalGo.g:1:284: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 40 :
                // InternalGo.g:1:293: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 41 :
                // InternalGo.g:1:304: RULE_OPEN_PARENTHESES
                {
                mRULE_OPEN_PARENTHESES(); 

                }
                break;
            case 42 :
                // InternalGo.g:1:326: RULE_CLOSED_PARENTHESES
                {
                mRULE_CLOSED_PARENTHESES(); 

                }
                break;
            case 43 :
                // InternalGo.g:1:350: RULE_BAR
                {
                mRULE_BAR(); 

                }
                break;
            case 44 :
                // InternalGo.g:1:359: RULE_ASTERICS
                {
                mRULE_ASTERICS(); 

                }
                break;
            case 45 :
                // InternalGo.g:1:373: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 46 :
                // InternalGo.g:1:384: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 47 :
                // InternalGo.g:1:394: RULE_EOL
                {
                mRULE_EOL(); 

                }
                break;
            case 48 :
                // InternalGo.g:1:403: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 49 :
                // InternalGo.g:1:419: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 50 :
                // InternalGo.g:1:435: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 51 :
                // InternalGo.g:1:443: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 52 :
                // InternalGo.g:1:452: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 53 :
                // InternalGo.g:1:464: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 54 :
                // InternalGo.g:1:472: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\50\3\46\1\55\1\57\13\61\10\uffff\1\122\3\uffff\1\127\1\130\1\46\2\uffff\2\46\13\uffff\1\61\1\uffff\1\61\1\135\24\61\11\uffff\1\130\4\uffff\1\130\4\uffff\1\61\1\170\1\uffff\11\61\1\u0082\10\61\1\u008c\1\61\2\uffff\1\130\2\uffff\1\61\1\uffff\1\61\1\u0091\1\u0092\1\61\1\u0094\4\61\1\uffff\1\u0099\1\u009a\1\u009b\1\u009c\1\u009d\2\61\1\u00a0\1\61\1\uffff\1\61\1\130\2\61\2\uffff\1\u00a5\1\uffff\1\61\1\u00a7\1\61\1\u00aa\5\uffff\1\u00ab\1\61\1\uffff\2\61\1\u00af\1\u00b0\1\uffff\1\u00b1\1\uffff\2\61\2\uffff\3\61\3\uffff\1\u00b7\1\u00b8\1\61\1\u00ba\1\61\2\uffff\1\u00bc\1\uffff\1\u00bd\2\uffff";
    static final String DFA15_eofS =
        "\u00be\uffff";
    static final String DFA15_minS =
        "\1\0\2\75\1\174\1\46\2\75\1\164\1\146\1\157\2\141\1\162\1\141\1\154\3\141\10\uffff\1\52\3\uffff\1\12\1\11\1\101\2\uffff\2\0\13\uffff\1\162\1\uffff\1\164\1\60\1\160\1\157\1\164\1\145\1\156\1\164\1\156\1\157\1\154\1\162\1\156\1\165\1\160\1\163\1\141\1\156\1\163\1\143\1\162\1\164\10\uffff\2\0\4\uffff\1\11\4\uffff\1\151\1\60\1\uffff\1\157\1\154\1\145\1\141\1\145\1\165\1\147\1\141\1\163\1\60\1\143\3\145\1\156\1\163\1\145\1\153\1\60\1\141\3\0\1\12\1\uffff\1\156\1\uffff\1\162\2\60\1\153\1\60\1\162\1\145\1\164\1\145\1\uffff\5\60\1\164\1\151\1\60\1\141\1\uffff\1\164\1\0\1\147\1\164\2\uffff\1\60\1\uffff\1\156\1\60\1\63\1\60\5\uffff\1\60\1\156\1\uffff\1\147\1\171\2\60\1\uffff\1\60\1\uffff\1\62\1\64\2\uffff\1\165\1\145\1\160\3\uffff\2\60\1\145\1\60\1\145\2\uffff\1\60\1\uffff\1\60\2\uffff";
    static final String DFA15_maxS =
        "\1\uffff\2\75\1\174\1\46\2\75\1\164\1\156\1\171\2\165\1\171\1\157\1\154\3\141\10\uffff\1\57\3\uffff\1\12\1\40\1\172\2\uffff\2\uffff\13\uffff\1\162\1\uffff\1\164\1\172\1\160\1\157\1\164\1\145\1\156\1\164\1\156\1\157\1\154\1\162\1\156\1\165\1\160\1\163\1\141\1\156\1\163\1\143\1\162\1\164\10\uffff\2\uffff\4\uffff\1\40\4\uffff\1\151\1\172\1\uffff\1\157\1\154\1\145\1\141\1\145\1\165\1\147\1\141\1\163\1\172\1\143\3\145\1\156\1\164\1\145\1\153\1\172\1\141\3\uffff\1\12\1\uffff\1\156\1\uffff\1\162\2\172\1\153\1\172\1\162\1\145\1\164\1\145\1\uffff\5\172\1\164\1\151\1\172\1\141\1\uffff\1\164\1\uffff\1\147\1\164\2\uffff\1\172\1\uffff\1\156\1\172\1\66\1\172\5\uffff\1\172\1\156\1\uffff\1\147\1\171\2\172\1\uffff\1\172\1\uffff\1\62\1\64\2\uffff\1\165\1\145\1\160\3\uffff\2\172\1\145\1\172\1\145\2\uffff\1\172\1\uffff\1\172\2\uffff";
    static final String DFA15_acceptS =
        "\22\uffff\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\uffff\1\54\1\55\1\56\3\uffff\1\62\1\63\2\uffff\1\65\1\66\1\7\1\1\1\2\1\3\1\4\1\6\1\5\1\10\1\11\1\uffff\1\62\26\uffff\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\2\uffff\1\53\1\54\1\55\1\56\1\uffff\1\65\1\57\1\63\1\64\2\uffff\1\33\30\uffff\1\57\1\uffff\1\13\11\uffff\1\31\11\uffff\1\40\4\uffff\1\14\1\15\1\uffff\1\16\4\uffff\1\32\1\21\1\37\1\24\1\25\2\uffff\1\30\4\uffff\1\23\1\uffff\1\41\2\uffff\1\22\1\26\3\uffff\1\12\1\34\1\35\5\uffff\1\17\1\20\1\uffff\1\36\1\uffff\1\27\1\42";
    static final String DFA15_specialS =
        "\1\7\42\uffff\1\0\1\6\53\uffff\1\10\1\1\40\uffff\1\5\1\2\1\3\31\uffff\1\4\57\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\46\1\45\1\37\2\46\1\36\22\46\1\45\1\46\1\43\3\46\1\4\1\44\1\30\1\31\1\33\1\35\1\27\1\34\1\26\1\32\12\42\1\2\1\46\1\5\1\1\1\6\2\46\32\41\1\24\1\46\1\25\1\40\1\41\1\46\1\41\1\11\1\15\1\21\1\16\1\13\2\41\1\10\6\41\1\17\1\41\1\12\1\7\1\14\1\41\1\20\4\41\1\22\1\3\1\23\uff82\46",
            "\1\47",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\56",
            "\1\60",
            "\1\63\6\uffff\1\64\1\62",
            "\1\65\2\uffff\1\67\6\uffff\1\66",
            "\1\72\3\uffff\1\71\17\uffff\1\70",
            "\1\74\12\uffff\1\73\2\uffff\1\75\5\uffff\1\76",
            "\1\77\6\uffff\1\100",
            "\1\101\6\uffff\1\102\6\uffff\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\120\4\uffff\1\121",
            "",
            "",
            "",
            "\1\126",
            "\2\127\2\uffff\1\127\22\uffff\1\127",
            "\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\0\132",
            "\0\132",
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
            "\1\133",
            "",
            "\1\134",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\52\163\1\162\uffd5\163",
            "\12\164\1\166\2\164\1\165\ufff2\164",
            "",
            "",
            "",
            "",
            "\2\127\2\uffff\1\127\22\uffff\1\127",
            "",
            "",
            "",
            "",
            "\1\167",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u008d",
            "\52\163\1\162\4\163\1\u008e\uffd0\163",
            "\52\163\1\162\uffd5\163",
            "\12\164\1\166\2\164\1\165\ufff2\164",
            "\1\166",
            "",
            "\1\u008f",
            "",
            "\1\u0090",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0093",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u009e",
            "\1\u009f",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00a1",
            "",
            "\1\u00a2",
            "\52\163\1\162\uffd5\163",
            "\1\u00a3",
            "\1\u00a4",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u00a6",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00a8\2\uffff\1\u00a9",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00ac",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00b9",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00bb",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
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
            return "1:1: Tokens : ( T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | RULE_OPEN_KEY | RULE_CLOSED_KEY | RULE_OPEN_BRACKETS | RULE_CLOSED_BRACKETS | RULE_DOT | RULE_COMMA | RULE_OPEN_PARENTHESES | RULE_CLOSED_PARENTHESES | RULE_BAR | RULE_ASTERICS | RULE_MINUS | RULE_PLUS | RULE_EOL | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_35 = input.LA(1);

                        s = -1;
                        if ( ((LA15_35>='\u0000' && LA15_35<='\uFFFF')) ) {s = 90;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_81 = input.LA(1);

                        s = -1;
                        if ( ((LA15_81>='\u0000' && LA15_81<='\t')||(LA15_81>='\u000B' && LA15_81<='\f')||(LA15_81>='\u000E' && LA15_81<='\uFFFF')) ) {s = 116;}

                        else if ( (LA15_81=='\r') ) {s = 117;}

                        else if ( (LA15_81=='\n') ) {s = 118;}

                        else s = 88;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_115 = input.LA(1);

                        s = -1;
                        if ( (LA15_115=='*') ) {s = 114;}

                        else if ( ((LA15_115>='\u0000' && LA15_115<=')')||(LA15_115>='+' && LA15_115<='\uFFFF')) ) {s = 115;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_116 = input.LA(1);

                        s = -1;
                        if ( (LA15_116=='\r') ) {s = 117;}

                        else if ( (LA15_116=='\n') ) {s = 118;}

                        else if ( ((LA15_116>='\u0000' && LA15_116<='\t')||(LA15_116>='\u000B' && LA15_116<='\f')||(LA15_116>='\u000E' && LA15_116<='\uFFFF')) ) {s = 116;}

                        else s = 88;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_142 = input.LA(1);

                        s = -1;
                        if ( (LA15_142=='*') ) {s = 114;}

                        else if ( ((LA15_142>='\u0000' && LA15_142<=')')||(LA15_142>='+' && LA15_142<='\uFFFF')) ) {s = 115;}

                        else s = 88;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_114 = input.LA(1);

                        s = -1;
                        if ( (LA15_114=='/') ) {s = 142;}

                        else if ( (LA15_114=='*') ) {s = 114;}

                        else if ( ((LA15_114>='\u0000' && LA15_114<=')')||(LA15_114>='+' && LA15_114<='.')||(LA15_114>='0' && LA15_114<='\uFFFF')) ) {s = 115;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_36 = input.LA(1);

                        s = -1;
                        if ( ((LA15_36>='\u0000' && LA15_36<='\uFFFF')) ) {s = 90;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='=') ) {s = 1;}

                        else if ( (LA15_0==':') ) {s = 2;}

                        else if ( (LA15_0=='|') ) {s = 3;}

                        else if ( (LA15_0=='&') ) {s = 4;}

                        else if ( (LA15_0=='<') ) {s = 5;}

                        else if ( (LA15_0=='>') ) {s = 6;}

                        else if ( (LA15_0=='s') ) {s = 7;}

                        else if ( (LA15_0=='i') ) {s = 8;}

                        else if ( (LA15_0=='b') ) {s = 9;}

                        else if ( (LA15_0=='r') ) {s = 10;}

                        else if ( (LA15_0=='f') ) {s = 11;}

                        else if ( (LA15_0=='t') ) {s = 12;}

                        else if ( (LA15_0=='c') ) {s = 13;}

                        else if ( (LA15_0=='e') ) {s = 14;}

                        else if ( (LA15_0=='p') ) {s = 15;}

                        else if ( (LA15_0=='v') ) {s = 16;}

                        else if ( (LA15_0=='d') ) {s = 17;}

                        else if ( (LA15_0=='{') ) {s = 18;}

                        else if ( (LA15_0=='}') ) {s = 19;}

                        else if ( (LA15_0=='[') ) {s = 20;}

                        else if ( (LA15_0==']') ) {s = 21;}

                        else if ( (LA15_0=='.') ) {s = 22;}

                        else if ( (LA15_0==',') ) {s = 23;}

                        else if ( (LA15_0=='(') ) {s = 24;}

                        else if ( (LA15_0==')') ) {s = 25;}

                        else if ( (LA15_0=='/') ) {s = 26;}

                        else if ( (LA15_0=='*') ) {s = 27;}

                        else if ( (LA15_0=='-') ) {s = 28;}

                        else if ( (LA15_0=='+') ) {s = 29;}

                        else if ( (LA15_0=='\r') ) {s = 30;}

                        else if ( (LA15_0=='\n') ) {s = 31;}

                        else if ( (LA15_0=='^') ) {s = 32;}

                        else if ( ((LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||LA15_0=='a'||(LA15_0>='g' && LA15_0<='h')||(LA15_0>='j' && LA15_0<='o')||LA15_0=='q'||LA15_0=='u'||(LA15_0>='w' && LA15_0<='z')) ) {s = 33;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 34;}

                        else if ( (LA15_0=='\"') ) {s = 35;}

                        else if ( (LA15_0=='\'') ) {s = 36;}

                        else if ( (LA15_0=='\t'||LA15_0==' ') ) {s = 37;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='%')||LA15_0==';'||(LA15_0>='?' && LA15_0<='@')||LA15_0=='\\'||LA15_0=='`'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA15_80 = input.LA(1);

                        s = -1;
                        if ( (LA15_80=='*') ) {s = 114;}

                        else if ( ((LA15_80>='\u0000' && LA15_80<=')')||(LA15_80>='+' && LA15_80<='\uFFFF')) ) {s = 115;}

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