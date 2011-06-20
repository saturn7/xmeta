// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g 2011-04-22 01:06:24

  package xm.input.antlr;
  import xm.input.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class inputParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Separator", "LParen", "LCurl", "RParen", "RCurl", "ID", "IDPart", "Dot", "Letter", "Digit", "COMMENT", "LINE_COMMENT", "WHITESPACE"
    };
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


        public inputParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public inputParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return inputParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g"; }



    // $ANTLR start "root"
    // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:17:1: root returns [InputNode nret] : (n= node ( Separator n= node )* ( Separator )? )? ;
    public final InputNode root() throws RecognitionException {
        InputNode nret = null;

        InputNode n = null;


        try {
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:17:30: ( (n= node ( Separator n= node )* ( Separator )? )? )
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:17:32: (n= node ( Separator n= node )* ( Separator )? )?
            {
            nret = new InputNode();
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:17:58: (n= node ( Separator n= node )* ( Separator )? )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:17:59: n= node ( Separator n= node )* ( Separator )?
                    {
                    pushFollow(FOLLOW_node_in_root46);
                    n=node();

                    state._fsp--;

                    nret.getChildren().add(n);
                    // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:18:21: ( Separator n= node )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==Separator) ) {
                            int LA1_1 = input.LA(2);

                            if ( (LA1_1==ID) ) {
                                alt1=1;
                            }


                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:18:22: Separator n= node
                    	    {
                    	    match(input,Separator,FOLLOW_Separator_in_root71); 
                    	    pushFollow(FOLLOW_node_in_root75);
                    	    n=node();

                    	    state._fsp--;

                    	    nret.getChildren().add(n);

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:18:70: ( Separator )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==Separator) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:18:70: Separator
                            {
                            match(input,Separator,FOLLOW_Separator_in_root81); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return nret;
    }
    // $ANTLR end "root"


    // $ANTLR start "node"
    // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:20:1: node returns [InputNode n] : name= id ( () | child= node | ( ( LParen | LCurl ) child= node ( Separator child= node )* ( Separator )? ( RParen | RCurl ) ) ) ;
    public final InputNode node() throws RecognitionException {
        InputNode n = null;

        InputID name = null;

        InputNode child = null;


        n = new InputNode();
        try {
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:20:56: (name= id ( () | child= node | ( ( LParen | LCurl ) child= node ( Separator child= node )* ( Separator )? ( RParen | RCurl ) ) ) )
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:21:5: name= id ( () | child= node | ( ( LParen | LCurl ) child= node ( Separator child= node )* ( Separator )? ( RParen | RCurl ) ) )
            {
            pushFollow(FOLLOW_id_in_node108);
            name=id();

            state._fsp--;

            n.setID(name);
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:22:5: ( () | child= node | ( ( LParen | LCurl ) child= node ( Separator child= node )* ( Separator )? ( RParen | RCurl ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case EOF:
            case Separator:
            case RParen:
            case RCurl:
                {
                alt6=1;
                }
                break;
            case ID:
                {
                alt6=2;
                }
                break;
            case LParen:
            case LCurl:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:22:6: ()
                    {
                    // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:22:6: ()
                    // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:22:7: 
                    {
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:23:5: child= node
                    {
                    pushFollow(FOLLOW_node_in_node127);
                    child=node();

                    state._fsp--;

                    n.getChildren().add(child);

                    }
                    break;
                case 3 :
                    // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:24:5: ( ( LParen | LCurl ) child= node ( Separator child= node )* ( Separator )? ( RParen | RCurl ) )
                    {
                    // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:24:5: ( ( LParen | LCurl ) child= node ( Separator child= node )* ( Separator )? ( RParen | RCurl ) )
                    // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:25:7: ( LParen | LCurl ) child= node ( Separator child= node )* ( Separator )? ( RParen | RCurl )
                    {
                    if ( (input.LA(1)>=LParen && input.LA(1)<=LCurl) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_node_in_node156);
                    child=node();

                    state._fsp--;

                    n.getChildren().add(child);
                    // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:26:9: ( Separator child= node )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==Separator) ) {
                            int LA4_1 = input.LA(2);

                            if ( (LA4_1==ID) ) {
                                alt4=1;
                            }


                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:26:10: Separator child= node
                    	    {
                    	    match(input,Separator,FOLLOW_Separator_in_node170); 
                    	    pushFollow(FOLLOW_node_in_node174);
                    	    child=node();

                    	    state._fsp--;

                    	    n.getChildren().add(child);

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:26:63: ( Separator )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==Separator) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:26:63: Separator
                            {
                            match(input,Separator,FOLLOW_Separator_in_node180); 

                            }
                            break;

                    }

                    if ( (input.LA(1)>=RParen && input.LA(1)<=RCurl) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "node"


    // $ANTLR start "id"
    // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:30:1: id returns [InputID id] : idname= ID ;
    public final InputID id() throws RecognitionException {
        InputID id = null;

        Token idname=null;

        try {
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:30:24: (idname= ID )
            // C:\\Users\\t\\workspace_3.6.1\\sattest\\src\\xm\\input\\antlr\\input.g:30:26: idname= ID
            {
            idname=(Token)match(input,ID,FOLLOW_ID_in_id215); 
            id = new InputID(); id.setName(idname.getText());

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return id;
    }
    // $ANTLR end "id"

    // Delegated rules


 

    public static final BitSet FOLLOW_node_in_root46 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_Separator_in_root71 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_node_in_root75 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_Separator_in_root81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_node108 = new BitSet(new long[]{0x0000000000000262L});
    public static final BitSet FOLLOW_node_in_node127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_node146 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_node_in_node156 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_Separator_in_node170 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_node_in_node174 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_Separator_in_node180 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_set_in_node189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id215 = new BitSet(new long[]{0x0000000000000002L});

}