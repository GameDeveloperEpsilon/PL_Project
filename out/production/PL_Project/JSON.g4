grammar JSON;

json:
   object | array;

value:
   'true'
   | 'false'
   | 'null'
   | number
   | string;

object:
    '{' '}'
    | '{' members '}';

members:
    member (',' member)*;

member:
    string ':' element;

array:
    '[' ']' | '[' elements ']';

elements:
    element (',' element)*;

element:
    value;

string:
    '"' (CHARACTER | ESCAPE)* '"';

CHARACTER:
    ~["\\\u0000-\u001F];

ESCAPE:
    '\\' ["\\/bfnrt];

number:
    '-'? (DIGIT+ | ONENINE DIGIT) ('.' DIGIT+)? (('E' | 'e') ('+' | '-')? DIGIT+)?;

DIGIT:
    [0-9];

ONENINE:
    [1-9];

WS:
    (' '|'\t'|'\r'|'\n')+ -> skip;
