grammar cal;

prog:          decl_list function_list main;

decl_list:     decl Semicolon decl_list
               |
               ;

decl:          var_decl const_decl;


var_decl:      Variable ID Colon type;

const_decl:    Constant ID Colon Equals expression;

function_list: function function_list
               |
               ;

function:      type ID 
               OpenBracket parameter_list CloseBracket
               Is
               decl_list 
               Begin
               statement_block Return
               OpenBracket expression
               | 
               CloseBracket
               Semicolon
               End;
            
type:          Integer | Boolean | Void;

parameter_list: nemp_parameter_list | ;

nemp_parameter_list: ID Colon type
                     | 
                     ID Colon type Comma
                     nemp_parameter_list;
            
main: main
      Begin
      decl_list
      statement_block
      End;

statement_block: statement statement_block
                 |
                 ;

statement:       ID Equals expression
                 |
                 ID OpenBracket arg_list CloseBracket
                 |
                 Begin
                 statement_block
                 End
                 |
                 If condition
                 |
                 Begin
                 statement_block
                 End
                 Else
                 Begin
                 statement_block
                 End
                 |
                 While condition
                 Begin
                 statement_block
                 End
                 Skip
                 ;

expression:     fragment binary_arith_op fragment
                |
                OpenBracket expression CloseBracket
                |
                ID OpenBracket arg_list CloseBracket
                |
                fragment
                ;

fragment:       ID 
                |
                Minus ID
                |
                Number
                |
                True
                |
                False
                |
                ;

binary_arith_op: Plus
                |
                Minus
                ;

condition:     Tilde condition
               | 
               OpenBracket condition CloseBracket
               |
               expression CompOp expression
               |
               condition OpenBracket | And CloseBracket condition
               ;

CompOp:        Equals
               |
               NotEqual
               |
               LessThan
               |
               LessOrEqualTo
               |
               GreaterThan
               |
               GreaterThanOrEqualTo
               ;

arg_list:      nemp_arg_list
               |
               ;

nemp_arg_list: ID
               |
               ID Comma nemp_arg_list
               ;



Assign:       ':=';
Print:        'print';
OpenBracket:  '(';
CloseBracket: ')';
Multiply:     '*';
Semicolon:    ';';
Divide:       '/';
Plus:         '+';
Minus:        '-';
Comma:        ',';


Colon:        ':';
Equals:        '=';
Variable:     'VARIABLE';
Constant:     'CONSTANT';
Begin:        'BEGIN';
End:          'END';
Integer:      'INTEGER';
True:         'TRUE';
False:        'FALSE';
If:           'IF';
And:          '&';
NotEqual:     '!=';
LessThan:     '<';
LessOrEqualTo: '<=';
GreaterThan:   '>';
GreaterThanOrEqualTo: '>=';
Tilde:         '~';
Is:            'IS';
Return:        'RETURN';
Void:          'VOID';
Boolean:       'BOOLEAN';
Else:          'ELSE';
While:         'WHILE';
Skip:          'SKIP';
Main:          'MAIN';


// Taken from your notes on Antlr4 //
fragment Letter: [a-zA-Z]; 
fragment Digit: [0 - 9];
fragment UnderScore: '_';


ID:           Letter (Letter | Digit | UnderScore)*;
Number:       Digit Digit*;

WS:           [\t\n\r]+ -> skip;
