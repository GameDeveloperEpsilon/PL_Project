grammar JSON3;

json:
    object | array;

object:
    '{' members '}'
    | '{' '}';
members: member | member ',' members;
member: STRING ':' value;

array:
    '[' elements ']'
    | '[' ']';
elements: element | element ',' elements;
element: value;

value:
    NULL
    | BOOLEAN
    | STRING
    | number
    | object
    | array;

NULL: 'null';
BOOLEAN: 'true'|'false';
number:
    '-'? (DIGIT+ | ONENINE DIGIT) ('.' DIGIT+)? (('E' | 'e') ('+' | '-')? DIGIT+)?;

DIGIT:
    [0-9];
ONENINE:
    [1-9];

STRING: '"' (' '|'!'|'\u0023'..'\u007E' | ESCAPE)* '"';

ESCAPE: '\\' ["\\/bfnrt];

WS: (' '|'\t'|'\r'|'\n'|'\f')+ -> skip;
