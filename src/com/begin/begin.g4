grammar begin;

b: BEGIN? ID;


BEGIN:'begin';
ID:[a-z]+;

WS:[ \r\t\n]+->skip;

