grammar JSON;

json:
   object | array;

value:
   string
   | number
   | 'true'
   | 'false'
   | 'null';

object:
    '{' WS '}'
    | '{' members '}';

members:
    member (',' member)*;

member:
    WS string WS ':' element;

array:
    '[' WS ']' | '[' elements ']';

elements:
    element (',' element);

element:
    WS value WS;

string:
    '"' characters? '"';

characters:
    (CHARACTER | ESCAPE);

CHARACTER:
    ~["\\\u0000-\u001F];

ESCAPE:
    '\\' ["\\/bfnrt];

number:
    '-'? (DIGIT+ | ONENINE DIGIT) ('.' DIGIT+)? (('E' | 'e') ('+' | '-')? DIGIT+)?;

WS:
    [ \t\r\n] -> skip;

DIGIT:
    [0-9];

ONENINE:
    [1-9];
