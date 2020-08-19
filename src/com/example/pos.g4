grammar pos ;

program: expr EOF;

expr: term rest;

rest: PLUS term rest         #suma
        |MINUS term rest     #resta
        |                    #vacio
        ;

term: INT;

PLUS: '+';
MINUS:  '-';

INT:[0-9]+;
WS:[\t\n\r]+ ->skip;