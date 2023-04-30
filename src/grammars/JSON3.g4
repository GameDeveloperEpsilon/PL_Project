grammar JSON3;  // Grammar name

json:  // Starting rule - every valid file is either an object or an array at the top level
    object | array;

object:  // Collection of members or fields
    '{' members '}'
    | '{' '}';
members: member | member ',' members;
member: STRING ':' value;

array:  // List of elements
    '[' elements ']'
    | '[' ']';
elements: element | element ',' elements;
element: value;

value:  // Values that can appear on the value side of "key":"value"
    NULL
    | BOOLEAN
    | STRING
    | number
    | object
    | array;

NULL: 'null';  // Null values
BOOLEAN: 'true'|'false';  // Boolean values
number:  // e.g. 1, -50, 5.5, 0, 5.67E-10, 5.67e+11
    '-'? (DIGIT+ | ONENINE DIGIT) ('.' DIGIT+)? (('E' | 'e') ('+' | '-')? DIGIT+)?;

DIGIT:  // 0,1,2,...,8,9
    [0-9];
ONENINE:  // 1,2,3,...,8,9
    [1-9];

STRING: '"' (' '|'!'|'\u0023'..'\u007E' | ESCAPE)* '"';  // String of characters

ESCAPE: '\\' ["\\/bfnrt];  // Escape characters \t \r \n \" \\ etc.

WS: (' '|'\t'|'\r'|'\n'|'\f')+ -> skip;  // Skip whitespace
