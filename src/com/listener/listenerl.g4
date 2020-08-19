lexer grammar listenerl;

TEXTO: ~[,\n\t"]+;
STRING: '"' ('"'|~'"')*'"';
WS:[\r\n]+;
COMA:',';
