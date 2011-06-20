// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g 2011-04-22 01:06:25

  package xm.input.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class inputLexer extends Lexer {
    public static final int EOF=-1;
    public static final int Separator=4;
    public static final int LParen=5;
    public static final int LCurl=6;
    public static final int RParen=7;
    public static final int RCurl=8;
    public static final int ID=9;
    public static final int IDPart=10;
    public static final int Dot=11;
    public static final int Letter=12;
    public static final int Digit=13;
    public static final int COMMENT=14;
    public static final int LINE_COMMENT=15;
    public static final int WHITESPACE=16;

    // delegates
    // delegators

    public inputLexer() {;} 
    public inputLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public inputLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g"; }

    // $ANTLR start "LParen"
    public final void mLParen() throws RecognitionException {
        try {
            int _type = LParen;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:33:7: ( '(' )
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:33:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LParen"

    // $ANTLR start "LCurl"
    public final void mLCurl() throws RecognitionException {
        try {
            int _type = LCurl;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:34:6: ( '{' )
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:34:8: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LCurl"

    // $ANTLR start "RParen"
    public final void mRParen() throws RecognitionException {
        try {
            int _type = RParen;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:35:7: ( ')' )
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:35:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RParen"

    // $ANTLR start "RCurl"
    public final void mRCurl() throws RecognitionException {
        try {
            int _type = RCurl;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:36:6: ( '}' )
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:36:8: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RCurl"

    // $ANTLR start "Separator"
    public final void mSeparator() throws RecognitionException {
        try {
            int _type = Separator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:37:10: ( ',' | ';' )
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:
            {
            if ( input.LA(1)==','||input.LA(1)==';' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Separator"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:39:3: ( IDPart ( Dot IDPart )* )
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:39:5: IDPart ( Dot IDPart )*
            {
            mIDPart(); 
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:39:12: ( Dot IDPart )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='.') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:39:13: Dot IDPart
            	    {
            	    mDot(); 
            	    mIDPart(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "IDPart"
    public final void mIDPart() throws RecognitionException {
        try {
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:40:16: ( ( Letter | Digit )* )
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:40:18: ( Letter | Digit )*
            {
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:40:18: ( Letter | Digit )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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


            }

        }
        finally {
        }
    }
    // $ANTLR end "IDPart"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:41:16: ( 'a' .. 'z' | 'A' .. 'Z' )
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Letter"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:42:15: ( '0' .. '9' )
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:42:17: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Digit"

    // $ANTLR start "Dot"
    public final void mDot() throws RecognitionException {
        try {
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:43:13: ( '.' )
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:43:15: '.'
            {
            match('.'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Dot"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:47:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:47:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:48:9: ( options {greedy=false; } : . )*
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
            	    // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:48:36: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match("*/"); 


                        _channel = HIDDEN;
                        

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:56:5: ( ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r\\n' | '\\r' | '\\n' ) | '//' (~ ( '\\n' | '\\r' ) )* ) )
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:56:7: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r\\n' | '\\r' | '\\n' ) | '//' (~ ( '\\n' | '\\r' ) )* )
            {
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:56:7: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r\\n' | '\\r' | '\\n' ) | '//' (~ ( '\\n' | '\\r' ) )* )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:56:10: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r\\n' | '\\r' | '\\n' )
                    {
                    match("//"); 

                    // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:56:15: (~ ( '\\n' | '\\r' ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:56:15: ~ ( '\\n' | '\\r' )
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

                    // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:56:30: ( '\\r\\n' | '\\r' | '\\n' )
                    int alt5=3;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        int LA5_1 = input.LA(2);

                        if ( (LA5_1=='\n') ) {
                            alt5=1;
                        }
                        else {
                            alt5=2;}
                    }
                    else if ( (LA5_0=='\n') ) {
                        alt5=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:56:31: '\\r\\n'
                            {
                            match("\r\n"); 


                            }
                            break;
                        case 2 :
                            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:56:40: '\\r'
                            {
                            match('\r'); 

                            }
                            break;
                        case 3 :
                            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:56:47: '\\n'
                            {
                            match('\n'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:57:9: '//' (~ ( '\\n' | '\\r' ) )*
                    {
                    match("//"); 

                    // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:57:14: (~ ( '\\n' | '\\r' ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:57:14: ~ ( '\\n' | '\\r' )
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


                    }
                    break;

            }

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:62:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:62:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:62:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\t' && LA8_0<='\n')||(LA8_0>='\f' && LA8_0<='\r')||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:1:8: ( LParen | LCurl | RParen | RCurl | Separator | ID | COMMENT | LINE_COMMENT | WHITESPACE )
        int alt9=9;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:1:10: LParen
                {
                mLParen(); 

                }
                break;
            case 2 :
                // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:1:17: LCurl
                {
                mLCurl(); 

                }
                break;
            case 3 :
                // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:1:23: RParen
                {
                mRParen(); 

                }
                break;
            case 4 :
                // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:1:30: RCurl
                {
                mRCurl(); 

                }
                break;
            case 5 :
                // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:1:36: Separator
                {
                mSeparator(); 

                }
                break;
            case 6 :
                // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:1:46: ID
                {
                mID(); 

                }
                break;
            case 7 :
                // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:1:49: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 8 :
                // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:1:57: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 9 :
                // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:1:70: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA7_eotS =
        "\2\uffff\2\5\2\uffff";
    static final String DFA7_eofS =
        "\6\uffff";
    static final String DFA7_minS =
        "\2\57\2\0\2\uffff";
    static final String DFA7_maxS =
        "\2\57\2\uffff\2\uffff";
    static final String DFA7_acceptS =
        "\4\uffff\1\1\1\2";
    static final String DFA7_specialS =
        "\2\uffff\1\1\1\0\2\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1",
            "\1\2",
            "\12\3\1\4\2\3\1\4\ufff2\3",
            "\12\3\1\4\2\3\1\4\ufff2\3",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "56:7: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r\\n' | '\\r' | '\\n' ) | '//' (~ ( '\\n' | '\\r' ) )* )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_3 = input.LA(1);

                        s = -1;
                        if ( (LA7_3=='\n'||LA7_3=='\r') ) {s = 4;}

                        else if ( ((LA7_3>='\u0000' && LA7_3<='\t')||(LA7_3>='\u000B' && LA7_3<='\f')||(LA7_3>='\u000E' && LA7_3<='\uFFFF')) ) {s = 3;}

                        else s = 5;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_2 = input.LA(1);

                        s = -1;
                        if ( ((LA7_2>='\u0000' && LA7_2<='\t')||(LA7_2>='\u000B' && LA7_2<='\f')||(LA7_2>='\u000E' && LA7_2<='\uFFFF')) ) {s = 3;}

                        else if ( (LA7_2=='\n'||LA7_2=='\r') ) {s = 4;}

                        else s = 5;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA9_eotS =
        "\1\6\12\uffff";
    static final String DFA9_eofS =
        "\13\uffff";
    static final String DFA9_minS =
        "\1\11\6\uffff\1\52\3\uffff";
    static final String DFA9_maxS =
        "\1\175\6\uffff\1\57\3\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\11\1\7\1\10";
    static final String DFA9_specialS =
        "\13\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\10\1\uffff\2\10\22\uffff\1\10\7\uffff\1\1\1\3\2\uffff\1"+
            "\5\2\uffff\1\7\13\uffff\1\5\77\uffff\1\2\1\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\11\4\uffff\1\12",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( LParen | LCurl | RParen | RCurl | Separator | ID | COMMENT | LINE_COMMENT | WHITESPACE );";
        }
    }
 

}