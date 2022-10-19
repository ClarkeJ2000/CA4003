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
                 if condition
                 |
                 Begin
                 statement_block
                 End
                 else
                 Begin
                 statement_block
                 End
                 |
                 while condition
                 Begin
                 statement_block
                 End
                 skip
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
                number
                |
                true
                |
                false
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







Semicolon:    ';';
ID:           'identifier';
Colon:        ':';
Comma:        ',';
OpenBracket:  '(';
CloseBracket: ')';
Equals:        '=';
Variable:     'VARIABLE';
Constant:     'CONSTANT';
Begin:        'BEGIN';
End:          'END';
Integer:      'INTEGER';
Minus:        '-';
Plus:         '+';
true:         'TRUE';
false:        'FALSE';
if:           'IF';
Assign:       ':=';
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
else:          'ELSE';
while:         'WHILE';
skip:          'SKIP';
