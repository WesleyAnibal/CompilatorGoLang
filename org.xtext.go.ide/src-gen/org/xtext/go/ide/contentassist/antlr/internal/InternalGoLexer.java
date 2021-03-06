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
    public static final int RULE_MINUSONE=10;
    public static final int T__50=50;
    public static final int RULE_OPEN_KEY=15;
    public static final int RULE_OPEN_PARENTHESES=13;
    public static final int RULE_BAR=25;
    public static final int RULE_DOISPONTOS=17;
    public static final int RULE_COMMENTS=28;
    public static final int RULE_EQUALS=12;
    public static final int T__59=59;
    public static final int RULE_CLOSED_PARENTHESES=14;
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
    public static final int RULE_ID=8;
    public static final int RULE_EOL=4;
    public static final int RULE_COMMA=11;
    public static final int RULE_PLUSONE=9;
    public static final int RULE_INT=19;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=29;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_PONTOVIRGULA=26;
    public static final int RULE_NEWLINE=27;
    public static final int RULE_ASTERICS=24;
    public static final int RULE_STRING=5;
    public static final int RULE_MINUSEQUALS=7;
    public static final int RULE_SL_COMMENT=30;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_OPEN_BRACKETS=18;
    public static final int RULE_PLUS=22;
    public static final int T__36=36;
    public static final int RULE_DOT=21;
    public static final int EOF=-1;
    public static final int RULE_WS=31;
    public static final int RULE_PLUSEQUALS=6;
    public static final int RULE_CLOSED_KEY=16;
    public static final int RULE_ANY_OTHER=32;
    public static final int RULE_MINUS=23;
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
    public static final int RULE_CLOSED_BRACKETS=20;

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

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
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
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
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
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
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
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
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
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
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
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
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
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
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
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
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
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:23:7: ( 'type' )
            // InternalGo.g:23:9: 'type'
            {
            match("type"); 


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
            // InternalGo.g:24:7: ( 'var' )
            // InternalGo.g:24:9: 'var'
            {
            match("var"); 


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
            // InternalGo.g:25:7: ( 'default' )
            // InternalGo.g:25:9: 'default'
            {
            match("default"); 


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
            // InternalGo.g:26:7: ( 'switch' )
            // InternalGo.g:26:9: 'switch'
            {
            match("switch"); 


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
            // InternalGo.g:27:7: ( 'range' )
            // InternalGo.g:27:9: 'range'
            {
            match("range"); 


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
            // InternalGo.g:28:7: ( '<' )
            // InternalGo.g:28:9: '<'
            {
            match('<'); 

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
            // InternalGo.g:29:7: ( '<=' )
            // InternalGo.g:29:9: '<='
            {
            match("<="); 


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
            // InternalGo.g:30:7: ( '==' )
            // InternalGo.g:30:9: '=='
            {
            match("=="); 


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
            // InternalGo.g:31:7: ( '>=' )
            // InternalGo.g:31:9: '>='
            {
            match(">="); 


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
            // InternalGo.g:32:7: ( '>' )
            // InternalGo.g:32:9: '>'
            {
            match('>'); 

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
            // InternalGo.g:33:7: ( 'string' )
            // InternalGo.g:33:9: 'string'
            {
            match("string"); 


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
            // InternalGo.g:34:7: ( 'int' )
            // InternalGo.g:34:9: 'int'
            {
            match("int"); 


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
            // InternalGo.g:35:7: ( 'bool' )
            // InternalGo.g:35:9: 'bool'
            {
            match("bool"); 


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
            // InternalGo.g:36:7: ( 'byte' )
            // InternalGo.g:36:9: 'byte'
            {
            match("byte"); 


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
            // InternalGo.g:37:7: ( 'rune' )
            // InternalGo.g:37:9: 'rune'
            {
            match("rune"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:38:7: ( 'float32' )
            // InternalGo.g:38:9: 'float32'
            {
            match("float32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:39:7: ( 'float64' )
            // InternalGo.g:39:9: 'float64'
            {
            match("float64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:40:7: ( '||' )
            // InternalGo.g:40:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:41:7: ( '&&' )
            // InternalGo.g:41:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
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
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:43:7: ( 'true' )
            // InternalGo.g:43:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:44:7: ( 'false' )
            // InternalGo.g:44:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "RULE_PONTOVIRGULA"
    public final void mRULE_PONTOVIRGULA() throws RecognitionException {
        try {
            int _type = RULE_PONTOVIRGULA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8310:19: ( ';' )
            // InternalGo.g:8310:21: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PONTOVIRGULA"

    // $ANTLR start "RULE_OPEN_KEY"
    public final void mRULE_OPEN_KEY() throws RecognitionException {
        try {
            int _type = RULE_OPEN_KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8312:15: ( ( '\\n' )? '{' )
            // InternalGo.g:8312:17: ( '\\n' )? '{'
            {
            // InternalGo.g:8312:17: ( '\\n' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\n') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGo.g:8312:17: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }

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
            // InternalGo.g:8314:17: ( ( '\\n' )? '}' )
            // InternalGo.g:8314:19: ( '\\n' )? '}'
            {
            // InternalGo.g:8314:19: ( '\\n' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\n') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGo.g:8314:19: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }

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
            // InternalGo.g:8316:20: ( '[' )
            // InternalGo.g:8316:22: '['
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
            // InternalGo.g:8318:22: ( ']' )
            // InternalGo.g:8318:24: ']'
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
            // InternalGo.g:8320:10: ( '.' )
            // InternalGo.g:8320:12: '.'
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
            // InternalGo.g:8322:12: ( ',' )
            // InternalGo.g:8322:14: ','
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
            // InternalGo.g:8324:23: ( '(' )
            // InternalGo.g:8324:25: '('
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
            // InternalGo.g:8326:25: ( ')' )
            // InternalGo.g:8326:27: ')'
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
            // InternalGo.g:8328:10: ( '/' )
            // InternalGo.g:8328:12: '/'
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
            // InternalGo.g:8330:15: ( '*' )
            // InternalGo.g:8330:17: '*'
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

    // $ANTLR start "RULE_DOISPONTOS"
    public final void mRULE_DOISPONTOS() throws RecognitionException {
        try {
            int _type = RULE_DOISPONTOS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8332:17: ( ':' )
            // InternalGo.g:8332:19: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOISPONTOS"

    // $ANTLR start "RULE_MINUS"
    public final void mRULE_MINUS() throws RecognitionException {
        try {
            int _type = RULE_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8334:12: ( '-' )
            // InternalGo.g:8334:14: '-'
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

    // $ANTLR start "RULE_MINUSONE"
    public final void mRULE_MINUSONE() throws RecognitionException {
        try {
            int _type = RULE_MINUSONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8336:15: ( '--' )
            // InternalGo.g:8336:17: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUSONE"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8338:11: ( '+' )
            // InternalGo.g:8338:13: '+'
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

    // $ANTLR start "RULE_PLUSEQUALS"
    public final void mRULE_PLUSEQUALS() throws RecognitionException {
        try {
            int _type = RULE_PLUSEQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8340:17: ( '+=' )
            // InternalGo.g:8340:19: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUSEQUALS"

    // $ANTLR start "RULE_MINUSEQUALS"
    public final void mRULE_MINUSEQUALS() throws RecognitionException {
        try {
            int _type = RULE_MINUSEQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8342:18: ( '-=' )
            // InternalGo.g:8342:20: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUSEQUALS"

    // $ANTLR start "RULE_PLUSONE"
    public final void mRULE_PLUSONE() throws RecognitionException {
        try {
            int _type = RULE_PLUSONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8344:14: ( '++' )
            // InternalGo.g:8344:16: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUSONE"

    // $ANTLR start "RULE_EOL"
    public final void mRULE_EOL() throws RecognitionException {
        try {
            int _type = RULE_EOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8346:10: ( ( RULE_NEWLINE | RULE_COMMENTS ) )
            // InternalGo.g:8346:12: ( RULE_NEWLINE | RULE_COMMENTS )
            {
            // InternalGo.g:8346:12: ( RULE_NEWLINE | RULE_COMMENTS )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            else if ( (LA3_0=='/') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGo.g:8346:13: RULE_NEWLINE
                    {
                    mRULE_NEWLINE(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8346:26: RULE_COMMENTS
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
            // InternalGo.g:8348:24: ( ( RULE_ML_COMMENT | RULE_SL_COMMENT ) )
            // InternalGo.g:8348:26: ( RULE_ML_COMMENT | RULE_SL_COMMENT )
            {
            // InternalGo.g:8348:26: ( RULE_ML_COMMENT | RULE_SL_COMMENT )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='/') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='*') ) {
                    alt4=1;
                }
                else if ( (LA4_1=='/') ) {
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
                    // InternalGo.g:8348:27: RULE_ML_COMMENT
                    {
                    mRULE_ML_COMMENT(); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8348:43: RULE_SL_COMMENT
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
            // InternalGo.g:8350:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGo.g:8350:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGo.g:8350:24: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='/') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGo.g:8350:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
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
            // InternalGo.g:8352:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGo.g:8352:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGo.g:8352:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGo.g:8352:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop6;
                }
            } while (true);

            // InternalGo.g:8352:40: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGo.g:8352:41: ( '\\r' )? '\\n'
                    {
                    // InternalGo.g:8352:41: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalGo.g:8352:41: '\\r'
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
            // InternalGo.g:8354:23: ( ( '\\r' )? '\\n' )
            // InternalGo.g:8354:25: ( '\\r' )? '\\n'
            {
            // InternalGo.g:8354:25: ( '\\r' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGo.g:8354:25: '\\r'
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

    // $ANTLR start "RULE_EQUALS"
    public final void mRULE_EQUALS() throws RecognitionException {
        try {
            int _type = RULE_EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8356:13: ( '=' )
            // InternalGo.g:8356:15: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUALS"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:8358:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGo.g:8358:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGo.g:8358:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGo.g:8358:11: '^'
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

            // InternalGo.g:8358:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
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
            	    break loop11;
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
            // InternalGo.g:8360:10: ( ( '0' .. '9' )+ )
            // InternalGo.g:8360:12: ( '0' .. '9' )+
            {
            // InternalGo.g:8360:12: ( '0' .. '9' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGo.g:8360:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // InternalGo.g:8362:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGo.g:8362:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGo.g:8362:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\"') ) {
                alt15=1;
            }
            else if ( (LA15_0=='\'') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalGo.g:8362:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGo.g:8362:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='!')||(LA13_0>='#' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalGo.g:8362:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:8362:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop13;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:8362:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGo.g:8362:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalGo.g:8362:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:8362:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop14;
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
            // InternalGo.g:8364:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGo.g:8364:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGo.g:8364:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
            // InternalGo.g:8366:16: ( . )
            // InternalGo.g:8366:18: .
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
        // InternalGo.g:1:8: ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | RULE_PONTOVIRGULA | RULE_OPEN_KEY | RULE_CLOSED_KEY | RULE_OPEN_BRACKETS | RULE_CLOSED_BRACKETS | RULE_DOT | RULE_COMMA | RULE_OPEN_PARENTHESES | RULE_CLOSED_PARENTHESES | RULE_BAR | RULE_ASTERICS | RULE_DOISPONTOS | RULE_MINUS | RULE_MINUSONE | RULE_PLUS | RULE_PLUSEQUALS | RULE_MINUSEQUALS | RULE_PLUSONE | RULE_EOL | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_EQUALS | RULE_ID | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER )
        int alt17=61;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalGo.g:1:10: T__33
                {
                mT__33(); 

                }
                break;
            case 2 :
                // InternalGo.g:1:16: T__34
                {
                mT__34(); 

                }
                break;
            case 3 :
                // InternalGo.g:1:22: T__35
                {
                mT__35(); 

                }
                break;
            case 4 :
                // InternalGo.g:1:28: T__36
                {
                mT__36(); 

                }
                break;
            case 5 :
                // InternalGo.g:1:34: T__37
                {
                mT__37(); 

                }
                break;
            case 6 :
                // InternalGo.g:1:40: T__38
                {
                mT__38(); 

                }
                break;
            case 7 :
                // InternalGo.g:1:46: T__39
                {
                mT__39(); 

                }
                break;
            case 8 :
                // InternalGo.g:1:52: T__40
                {
                mT__40(); 

                }
                break;
            case 9 :
                // InternalGo.g:1:58: T__41
                {
                mT__41(); 

                }
                break;
            case 10 :
                // InternalGo.g:1:64: T__42
                {
                mT__42(); 

                }
                break;
            case 11 :
                // InternalGo.g:1:70: T__43
                {
                mT__43(); 

                }
                break;
            case 12 :
                // InternalGo.g:1:76: T__44
                {
                mT__44(); 

                }
                break;
            case 13 :
                // InternalGo.g:1:82: T__45
                {
                mT__45(); 

                }
                break;
            case 14 :
                // InternalGo.g:1:88: T__46
                {
                mT__46(); 

                }
                break;
            case 15 :
                // InternalGo.g:1:94: T__47
                {
                mT__47(); 

                }
                break;
            case 16 :
                // InternalGo.g:1:100: T__48
                {
                mT__48(); 

                }
                break;
            case 17 :
                // InternalGo.g:1:106: T__49
                {
                mT__49(); 

                }
                break;
            case 18 :
                // InternalGo.g:1:112: T__50
                {
                mT__50(); 

                }
                break;
            case 19 :
                // InternalGo.g:1:118: T__51
                {
                mT__51(); 

                }
                break;
            case 20 :
                // InternalGo.g:1:124: T__52
                {
                mT__52(); 

                }
                break;
            case 21 :
                // InternalGo.g:1:130: T__53
                {
                mT__53(); 

                }
                break;
            case 22 :
                // InternalGo.g:1:136: T__54
                {
                mT__54(); 

                }
                break;
            case 23 :
                // InternalGo.g:1:142: T__55
                {
                mT__55(); 

                }
                break;
            case 24 :
                // InternalGo.g:1:148: T__56
                {
                mT__56(); 

                }
                break;
            case 25 :
                // InternalGo.g:1:154: T__57
                {
                mT__57(); 

                }
                break;
            case 26 :
                // InternalGo.g:1:160: T__58
                {
                mT__58(); 

                }
                break;
            case 27 :
                // InternalGo.g:1:166: T__59
                {
                mT__59(); 

                }
                break;
            case 28 :
                // InternalGo.g:1:172: T__60
                {
                mT__60(); 

                }
                break;
            case 29 :
                // InternalGo.g:1:178: T__61
                {
                mT__61(); 

                }
                break;
            case 30 :
                // InternalGo.g:1:184: T__62
                {
                mT__62(); 

                }
                break;
            case 31 :
                // InternalGo.g:1:190: T__63
                {
                mT__63(); 

                }
                break;
            case 32 :
                // InternalGo.g:1:196: T__64
                {
                mT__64(); 

                }
                break;
            case 33 :
                // InternalGo.g:1:202: T__65
                {
                mT__65(); 

                }
                break;
            case 34 :
                // InternalGo.g:1:208: T__66
                {
                mT__66(); 

                }
                break;
            case 35 :
                // InternalGo.g:1:214: RULE_PONTOVIRGULA
                {
                mRULE_PONTOVIRGULA(); 

                }
                break;
            case 36 :
                // InternalGo.g:1:232: RULE_OPEN_KEY
                {
                mRULE_OPEN_KEY(); 

                }
                break;
            case 37 :
                // InternalGo.g:1:246: RULE_CLOSED_KEY
                {
                mRULE_CLOSED_KEY(); 

                }
                break;
            case 38 :
                // InternalGo.g:1:262: RULE_OPEN_BRACKETS
                {
                mRULE_OPEN_BRACKETS(); 

                }
                break;
            case 39 :
                // InternalGo.g:1:281: RULE_CLOSED_BRACKETS
                {
                mRULE_CLOSED_BRACKETS(); 

                }
                break;
            case 40 :
                // InternalGo.g:1:302: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 41 :
                // InternalGo.g:1:311: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 42 :
                // InternalGo.g:1:322: RULE_OPEN_PARENTHESES
                {
                mRULE_OPEN_PARENTHESES(); 

                }
                break;
            case 43 :
                // InternalGo.g:1:344: RULE_CLOSED_PARENTHESES
                {
                mRULE_CLOSED_PARENTHESES(); 

                }
                break;
            case 44 :
                // InternalGo.g:1:368: RULE_BAR
                {
                mRULE_BAR(); 

                }
                break;
            case 45 :
                // InternalGo.g:1:377: RULE_ASTERICS
                {
                mRULE_ASTERICS(); 

                }
                break;
            case 46 :
                // InternalGo.g:1:391: RULE_DOISPONTOS
                {
                mRULE_DOISPONTOS(); 

                }
                break;
            case 47 :
                // InternalGo.g:1:407: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 48 :
                // InternalGo.g:1:418: RULE_MINUSONE
                {
                mRULE_MINUSONE(); 

                }
                break;
            case 49 :
                // InternalGo.g:1:432: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 50 :
                // InternalGo.g:1:442: RULE_PLUSEQUALS
                {
                mRULE_PLUSEQUALS(); 

                }
                break;
            case 51 :
                // InternalGo.g:1:458: RULE_MINUSEQUALS
                {
                mRULE_MINUSEQUALS(); 

                }
                break;
            case 52 :
                // InternalGo.g:1:475: RULE_PLUSONE
                {
                mRULE_PLUSONE(); 

                }
                break;
            case 53 :
                // InternalGo.g:1:488: RULE_EOL
                {
                mRULE_EOL(); 

                }
                break;
            case 54 :
                // InternalGo.g:1:497: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 55 :
                // InternalGo.g:1:513: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 56 :
                // InternalGo.g:1:529: RULE_EQUALS
                {
                mRULE_EQUALS(); 

                }
                break;
            case 57 :
                // InternalGo.g:1:541: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 58 :
                // InternalGo.g:1:549: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 59 :
                // InternalGo.g:1:558: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 60 :
                // InternalGo.g:1:570: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 61 :
                // InternalGo.g:1:578: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\13\53\1\103\1\105\1\107\2\47\1\uffff\1\113\10\uffff\1\127\2\uffff\1\134\1\137\1\114\1\47\2\uffff\2\47\2\uffff\3\53\1\uffff\10\53\1\156\15\53\24\uffff\1\113\11\uffff\1\113\2\uffff\7\53\1\u0089\3\53\1\uffff\1\53\1\u008e\6\53\1\u0095\4\53\2\uffff\1\113\2\uffff\1\53\1\u009c\1\u009d\1\u009e\1\u009f\2\53\1\u00a2\1\uffff\1\u00a3\3\53\1\uffff\2\53\1\u00a9\1\53\1\u00ab\1\u00ac\1\uffff\4\53\1\113\1\u00b1\4\uffff\1\u00b2\1\53\2\uffff\1\53\1\u00b6\2\53\1\u00b9\1\uffff\1\53\2\uffff\4\53\2\uffff\3\53\1\uffff\1\u00c2\1\u00c3\1\uffff\3\53\1\u00c7\1\u00c8\1\53\1\u00ca\1\u00cb\2\uffff\1\u00cc\1\u00cd\1\53\2\uffff\1\u00cf\4\uffff\1\u00d0\2\uffff";
    static final String DFA17_eofS =
        "\u00d1\uffff";
    static final String DFA17_minS =
        "\1\0\1\157\1\141\1\154\1\141\1\146\2\141\1\162\2\141\1\164\3\75\1\174\1\46\1\uffff\1\11\10\uffff\1\52\2\uffff\1\55\1\53\1\12\1\101\2\uffff\2\0\2\uffff\1\145\1\157\1\164\1\uffff\1\163\1\141\1\156\1\163\1\162\1\156\1\157\1\154\1\60\1\160\2\164\2\156\1\143\1\160\1\165\1\162\1\146\1\164\1\151\1\162\23\uffff\2\0\11\uffff\1\11\2\uffff\1\141\1\154\2\145\1\156\1\163\1\145\1\60\1\143\1\141\1\163\1\uffff\1\157\1\60\1\165\1\147\1\145\1\153\2\145\1\60\2\141\1\164\1\151\3\0\1\12\1\uffff\1\153\4\60\1\164\1\151\1\60\1\uffff\1\60\1\164\1\145\1\162\1\uffff\1\162\1\145\1\60\1\141\2\60\1\uffff\1\165\1\164\1\143\1\156\1\0\1\60\4\uffff\1\60\1\156\2\uffff\1\63\1\60\1\164\1\156\1\60\1\uffff\1\147\2\uffff\1\154\1\171\1\150\1\147\2\uffff\1\165\1\62\1\64\1\uffff\2\60\1\uffff\1\145\1\164\1\160\2\60\1\145\2\60\2\uffff\2\60\1\145\2\uffff\1\60\4\uffff\1\60\2\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\171\1\157\1\154\1\165\1\156\1\165\1\141\1\171\1\141\1\145\1\167\3\75\1\174\1\46\1\uffff\1\175\10\uffff\1\57\2\uffff\2\75\1\12\1\172\2\uffff\2\uffff\2\uffff\1\145\1\157\1\164\1\uffff\1\163\1\141\1\156\1\163\1\162\1\156\1\157\1\154\1\172\1\160\2\164\2\156\1\143\1\160\1\165\1\162\1\146\1\164\1\151\1\162\23\uffff\2\uffff\11\uffff\1\40\2\uffff\1\141\1\154\2\145\1\156\1\164\1\145\1\172\1\143\1\141\1\163\1\uffff\1\157\1\172\1\165\1\147\1\145\1\153\2\145\1\172\2\141\1\164\1\151\3\uffff\1\12\1\uffff\1\153\4\172\1\164\1\151\1\172\1\uffff\1\172\1\164\1\145\1\162\1\uffff\1\162\1\145\1\172\1\141\2\172\1\uffff\1\165\1\164\1\143\1\156\1\uffff\1\172\4\uffff\1\172\1\156\2\uffff\1\66\1\172\1\164\1\156\1\172\1\uffff\1\147\2\uffff\1\154\1\171\1\150\1\147\2\uffff\1\165\1\62\1\64\1\uffff\2\172\1\uffff\1\145\1\164\1\160\2\172\1\145\2\172\2\uffff\2\172\1\145\2\uffff\1\172\4\uffff\1\172\2\uffff";
    static final String DFA17_acceptS =
        "\21\uffff\1\43\1\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\uffff\1\55\1\56\4\uffff\1\71\1\72\2\uffff\1\74\1\75\3\uffff\1\71\26\uffff\1\23\1\22\1\24\1\70\1\25\1\26\1\36\1\37\1\43\1\65\1\74\1\45\1\44\1\46\1\47\1\50\1\51\1\52\1\53\2\uffff\1\54\1\55\1\56\1\60\1\63\1\57\1\62\1\64\1\61\1\uffff\1\72\1\73\13\uffff\1\11\21\uffff\1\65\10\uffff\1\7\4\uffff\1\30\6\uffff\1\16\6\uffff\1\31\1\32\1\2\1\3\2\uffff\1\6\1\10\5\uffff\1\33\1\uffff\1\15\1\41\4\uffff\1\1\1\4\3\uffff\1\42\2\uffff\1\21\10\uffff\1\12\1\13\3\uffff\1\20\1\27\1\uffff\1\34\1\35\1\14\1\17\1\uffff\1\5\1\40";
    static final String DFA17_specialS =
        "\1\6\43\uffff\1\5\1\10\57\uffff\1\2\1\0\45\uffff\1\3\1\4\1\1\33\uffff\1\7\66\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\47\1\46\1\22\2\47\1\40\22\47\1\46\1\47\1\44\3\47\1\20\1\45\1\31\1\32\1\34\1\37\1\30\1\36\1\27\1\33\12\43\1\35\1\21\1\14\1\15\1\16\2\47\32\42\1\25\1\47\1\26\1\41\1\42\1\47\1\42\1\1\1\2\1\12\1\3\1\4\2\42\1\5\6\42\1\7\1\42\1\6\1\13\1\10\1\42\1\11\4\42\1\23\1\17\1\24\uff82\47",
            "\1\51\2\uffff\1\50\6\uffff\1\52",
            "\1\54\6\uffff\1\55\6\uffff\1\56",
            "\1\57",
            "\1\63\12\uffff\1\62\2\uffff\1\60\5\uffff\1\61",
            "\1\64\6\uffff\1\65\1\66",
            "\1\70\3\uffff\1\67\17\uffff\1\71",
            "\1\72",
            "\1\74\6\uffff\1\73",
            "\1\75",
            "\1\77\3\uffff\1\76",
            "\1\101\2\uffff\1\100",
            "\1\102",
            "\1\104",
            "\1\106",
            "\1\110",
            "\1\111",
            "",
            "\2\114\2\uffff\1\114\22\uffff\1\114\132\uffff\1\116\1\uffff\1\115",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\125\4\uffff\1\126",
            "",
            "",
            "\1\132\17\uffff\1\133",
            "\1\136\21\uffff\1\135",
            "\1\140",
            "\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\0\142",
            "\0\142",
            "",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
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
            "",
            "",
            "",
            "",
            "\52\175\1\174\uffd5\175",
            "\12\176\1\u0080\2\176\1\177\ufff2\176",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\114\2\uffff\1\114\22\uffff\1\114",
            "",
            "",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086\1\u0087",
            "\1\u0088",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "\1\u008d",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\52\175\1\174\4\175\1\u009a\uffd0\175",
            "\52\175\1\174\uffd5\175",
            "\12\176\1\u0080\2\176\1\177\ufff2\176",
            "\1\u0080",
            "",
            "\1\u009b",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00a0",
            "\1\u00a1",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "",
            "\1\u00a7",
            "\1\u00a8",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00aa",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\52\175\1\174\uffd5\175",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00b3",
            "",
            "",
            "\1\u00b4\2\uffff\1\u00b5",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00b7",
            "\1\u00b8",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u00ba",
            "",
            "",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00c9",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00ce",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | RULE_PONTOVIRGULA | RULE_OPEN_KEY | RULE_CLOSED_KEY | RULE_OPEN_BRACKETS | RULE_CLOSED_BRACKETS | RULE_DOT | RULE_COMMA | RULE_OPEN_PARENTHESES | RULE_CLOSED_PARENTHESES | RULE_BAR | RULE_ASTERICS | RULE_DOISPONTOS | RULE_MINUS | RULE_MINUSONE | RULE_PLUS | RULE_PLUSEQUALS | RULE_MINUSEQUALS | RULE_PLUSONE | RULE_EOL | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_EQUALS | RULE_ID | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_86 = input.LA(1);

                        s = -1;
                        if ( ((LA17_86>='\u0000' && LA17_86<='\t')||(LA17_86>='\u000B' && LA17_86<='\f')||(LA17_86>='\u000E' && LA17_86<='\uFFFF')) ) {s = 126;}

                        else if ( (LA17_86=='\r') ) {s = 127;}

                        else if ( (LA17_86=='\n') ) {s = 128;}

                        else s = 75;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_126 = input.LA(1);

                        s = -1;
                        if ( (LA17_126=='\r') ) {s = 127;}

                        else if ( (LA17_126=='\n') ) {s = 128;}

                        else if ( ((LA17_126>='\u0000' && LA17_126<='\t')||(LA17_126>='\u000B' && LA17_126<='\f')||(LA17_126>='\u000E' && LA17_126<='\uFFFF')) ) {s = 126;}

                        else s = 75;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_85 = input.LA(1);

                        s = -1;
                        if ( (LA17_85=='*') ) {s = 124;}

                        else if ( ((LA17_85>='\u0000' && LA17_85<=')')||(LA17_85>='+' && LA17_85<='\uFFFF')) ) {s = 125;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_124 = input.LA(1);

                        s = -1;
                        if ( (LA17_124=='/') ) {s = 154;}

                        else if ( (LA17_124=='*') ) {s = 124;}

                        else if ( ((LA17_124>='\u0000' && LA17_124<=')')||(LA17_124>='+' && LA17_124<='.')||(LA17_124>='0' && LA17_124<='\uFFFF')) ) {s = 125;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_125 = input.LA(1);

                        s = -1;
                        if ( (LA17_125=='*') ) {s = 124;}

                        else if ( ((LA17_125>='\u0000' && LA17_125<=')')||(LA17_125>='+' && LA17_125<='\uFFFF')) ) {s = 125;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_36 = input.LA(1);

                        s = -1;
                        if ( ((LA17_36>='\u0000' && LA17_36<='\uFFFF')) ) {s = 98;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='b') ) {s = 1;}

                        else if ( (LA17_0=='c') ) {s = 2;}

                        else if ( (LA17_0=='e') ) {s = 3;}

                        else if ( (LA17_0=='f') ) {s = 4;}

                        else if ( (LA17_0=='i') ) {s = 5;}

                        else if ( (LA17_0=='r') ) {s = 6;}

                        else if ( (LA17_0=='p') ) {s = 7;}

                        else if ( (LA17_0=='t') ) {s = 8;}

                        else if ( (LA17_0=='v') ) {s = 9;}

                        else if ( (LA17_0=='d') ) {s = 10;}

                        else if ( (LA17_0=='s') ) {s = 11;}

                        else if ( (LA17_0=='<') ) {s = 12;}

                        else if ( (LA17_0=='=') ) {s = 13;}

                        else if ( (LA17_0=='>') ) {s = 14;}

                        else if ( (LA17_0=='|') ) {s = 15;}

                        else if ( (LA17_0=='&') ) {s = 16;}

                        else if ( (LA17_0==';') ) {s = 17;}

                        else if ( (LA17_0=='\n') ) {s = 18;}

                        else if ( (LA17_0=='{') ) {s = 19;}

                        else if ( (LA17_0=='}') ) {s = 20;}

                        else if ( (LA17_0=='[') ) {s = 21;}

                        else if ( (LA17_0==']') ) {s = 22;}

                        else if ( (LA17_0=='.') ) {s = 23;}

                        else if ( (LA17_0==',') ) {s = 24;}

                        else if ( (LA17_0=='(') ) {s = 25;}

                        else if ( (LA17_0==')') ) {s = 26;}

                        else if ( (LA17_0=='/') ) {s = 27;}

                        else if ( (LA17_0=='*') ) {s = 28;}

                        else if ( (LA17_0==':') ) {s = 29;}

                        else if ( (LA17_0=='-') ) {s = 30;}

                        else if ( (LA17_0=='+') ) {s = 31;}

                        else if ( (LA17_0=='\r') ) {s = 32;}

                        else if ( (LA17_0=='^') ) {s = 33;}

                        else if ( ((LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||LA17_0=='a'||(LA17_0>='g' && LA17_0<='h')||(LA17_0>='j' && LA17_0<='o')||LA17_0=='q'||LA17_0=='u'||(LA17_0>='w' && LA17_0<='z')) ) {s = 34;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 35;}

                        else if ( (LA17_0=='\"') ) {s = 36;}

                        else if ( (LA17_0=='\'') ) {s = 37;}

                        else if ( (LA17_0=='\t'||LA17_0==' ') ) {s = 38;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<='%')||(LA17_0>='?' && LA17_0<='@')||LA17_0=='\\'||LA17_0=='`'||(LA17_0>='~' && LA17_0<='\uFFFF')) ) {s = 39;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA17_154 = input.LA(1);

                        s = -1;
                        if ( (LA17_154=='*') ) {s = 124;}

                        else if ( ((LA17_154>='\u0000' && LA17_154<=')')||(LA17_154>='+' && LA17_154<='\uFFFF')) ) {s = 125;}

                        else s = 75;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA17_37 = input.LA(1);

                        s = -1;
                        if ( ((LA17_37>='\u0000' && LA17_37<='\uFFFF')) ) {s = 98;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}