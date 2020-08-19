grammar ArrayInit;
tokens{FLOAT}

init: '{' value (',' value)* '}';
value: init | INT ;

COMA:',';
INT : DIGIT+;
WS:[ \t\n\r]+->skip;

fragment
DIGIT:[0-9];


