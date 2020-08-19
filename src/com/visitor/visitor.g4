grammar visitor;

prog:	(e )* ;

e   : e MULT e        #Mult
    | e DIV  e        #Div
    | e MINUS e       #Menos
 	| e PLUS e        #Plus
    | INT             #Int
 	;

MULT:'*';
DIV:'/';
PLUS:'+';
MINUS:'-';
INT:[0-9]+;
WS:[ \r\t\n]+ ->skip;

