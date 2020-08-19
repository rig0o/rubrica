parser grammar listener;
options{ tokenVocab = listenerl;}

file: heder line+;

heder: line;

line: campo (COMA campo)* WS;

campo: TEXTO        #Texto
        |STRING     #String
        |           #Vacio
        ;

