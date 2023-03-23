grammar json_grammar;

json:
   element;

value:
   object
   | array
   | string
   | number
   | 'true'
   | 'false'
   | 'null';

object:
    '{' ws '}'
    | '{' members '}';

members:
    member
    | member ',' members;

member:
    ws string ws ':' element;

array:
    '[' ws ']'
    | '[' elements ']';

elements:
    element
    | element ',' elements;

element:
    ws value ws;

string:
    '"' characters '"';

characters:
    (character)*;

character:
    'U+0020'.'U+0021' | 'U+0023' . 'U+005B' | 'U+00005D' 'U+10FFFF'
    | '\\' escape;

escape:
    '"'
    | '\\'
    | '/'
    | 'b'
    | 'f'
    | 'n'
    | 'r'
    | 't'
    | 'u' hex hex hex hex;

hex:
    digit
    | 'A' . 'F'
    | 'a' . 'f';

number:
    integer fraction exponent;

integer:
    digit
    | onenine digits
    | '-' digit
    | '-' onenine digits;

digits:
    digit
    | digit digits;

digit:
    '0'
    | onenine;

onenine:
    '1' . '9';

fraction:
    ('.' digits)*;

exponent:
    ('E' sign digits | 'e' sign digits)*;

sign:
    ('+'
    | '-')*;

ws:
    ('0020' ws
    | '000A' ws
    | '000D' ws
    | '0009' ws)*;
