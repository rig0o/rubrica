grammar Simple;

program returns [String s]: e = expr EOF {$s = $e.s;};
expr returns [String s]: t=term r=rest {$s = $t.s + $r.s;};

rest returns [String s]: PLUS t=term r=rest {$s = $t.s + "+" + $r.s;}
                        | MINUS t=term r=rest {$s = $t.s + "-" + $r.s;}
                        | /* empty */ {$s = "";};

term returns [String s] : DIGIT {$s = $DIGIT.text;};

PLUS : '+' ;
MINUS : '-' ;
DIGIT : [0-9]+;



