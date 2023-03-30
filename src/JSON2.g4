grammar JSON2;

json: value;

value: object | array | STRING | NUMBER | TRUE | FALSE | NULL;

object: '{' WS '}' | '{' members '}';

members: member | member ',' members;

member: STRING WS ':' WS value;

array: '[' WS ']' | '[' elements ']';

elements: value | value ',' elements;

STRING: '"' (ESC | ~["\])* '"' ;

ESC: '\' (["\/bfnrt] | UNICODE);

UNICODE: 'u' HEX HEX HEX HEX;

HEX: DIGIT | [A-Fa-f];

NUMBER: '-'? INT '.' DIGIT+ EXP? | '-'? INT EXP | '-'? INT '.' DIGIT+;

INT: '0' | [1-9] [0-9]*;

EXP: [Ee] [+-]? INT;

TRUE: 'true';

FALSE: 'false';

NULL: 'null';

WS: [ \t\n\r]+ -> skip;