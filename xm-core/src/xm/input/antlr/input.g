grammar input;

options {
  language = Java;
}

@lexer::header{
  package xm.input.antlr;
}

@header{
  package xm.input.antlr;
  import xm.input.*;
}


root returns [InputNode nret]: {nret = new InputNode();} (n=node {nret.getChildren().add(n);}
                    (Separator n=node {nret.getChildren().add(n);})* Separator? )?;

node returns [InputNode n] @init {n = new InputNode();}: 
    name=id {n.setID(name);}
    (()|
    child=node {n.getChildren().add(child);} | 
    (
      (LParen | LCurl) child=node {n.getChildren().add(child);} 
        (Separator child=node {n.getChildren().add(child);})* Separator?
      (RParen | RCurl)
    ));

id returns [InputID id]: idname=ID {id = new InputID(); id.setName(idname.getText());};


LParen: '(';
LCurl: '{';
RParen: ')';
RCurl: '}'; 
Separator: ',' | ';'; 

ID: IDPart (Dot IDPart)*;
fragment IDPart: (Letter | Digit)*; 
fragment Letter: 'a'..'z' | 'A'..'Z';
fragment Digit: '0'..'9';
fragment Dot: '.';


COMMENT
    :   '/*'
        (options {greedy=false;} : . )* 
        '*/'
            {
            $channel = HIDDEN;
            }
    ;

LINE_COMMENT
    : (  '//' ~('\n'|'\r')*  ('\r\n' | '\r' | '\n')
    |   '//' ~('\n'|'\r')*     // a line comment could appear at the end of the file without CR/LF
    )
    { $channel = HIDDEN; }
    ;  
    
 WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+   { $channel = HIDDEN; } ;
     