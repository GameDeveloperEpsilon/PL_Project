grammar JSON2;

json:
    object;
    //| array;

value:
    //object
    //| array
    //|
    string
    | NUMBER
    | TRUE
    | FALSE
    | NULL;

object:
    '{' '}'
    | '{' members '}';

members: member | member ',' members;

member: string ':' value;

//array: '[' WS ']' | '[' elements ']';

//elements: value | value ',' elements;

string: '"' characters* '"' ;

characters:
    (CHARACTER | ESCAPE);

CHARACTER:
    ~["\\\u0000-\u001F];

ESCAPE: '\\' (["\\/bfnrt] | UNICODE);

UNICODE: 'u' HEX HEX HEX HEX;

HEX: DIGIT | [A-Fa-f];

NUMBER: '-'? INT '.' DIGIT+ EXP? | '-'? INT EXP | '-'? INT '.' DIGIT+;

DIGIT: [0-9];

INT: '0' | [1-9] [0-9]*;

EXP: [Ee] [+-]? INT;

TRUE: 'true';

FALSE: 'false';

NULL: 'null';

WS: (' '|'\t'|'\r'|'\n'|'\f')+ -> skip;
