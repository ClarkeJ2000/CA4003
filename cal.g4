grammar cal;

prog:          decl_list function_list main;

decl_list:     decl Semi decl_list
               |
               ;

decl:          var_decl const_decl;


var_decl:      Variable ID Colon type;

const_decl:    Constant ID Colon Equals expression;

function_list: function function_list
               |
               ;

function:      type ID 
               LBR parameter_list RBR
               Is
               decl_list 
               Begin
               statement_block Return
               LBR expression
               | 
               RBR
               Semi
               End;
            
type:          Integer | Boolean | Void;

parameter_list: nemp_parameter_list | ;

nemp_parameter_list: ID Colon type
                     | 
                     ID Colon type Comma
                     nemp_parameter_list;
            
main: Main
      Begin
      decl_list
      statement_block
      End;

statement_block: statement statement_block
                 |
                 ;

statement:       ID Equals expression
                 |
                 ID LBR arg_list RBR
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

expression:     frag binary_arith_op frag
                |
                LBR expression RBR
                |
                ID LBR arg_list RBR
                |
                frag
                ;

frag:           ID 
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
               LBR condition RBR
               |
               expression CompOp expression
               |
               condition LBR | And RBR condition
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


// Tokens //

Assign:       ':=';
Print:        'print';
LBR:          '(';
RBR:          ')';
Mult:         '*';
Semi:         ';';
Divide:       '/';
Plus:         '+';
Minus:        '-';
Comma:        ',';
Colon:        ':';
Equals:       '=';
And:          '&';
NotEqual:     '!=';
LessThan:     '<';
LessOrEqualTo:'<=';
GreaterThan:  '>';
GreaterThanOrEqualTo: '>=';
Tilde:        '~';
Or:           '|';   


// Taken from your notes on Antlr4 //



fragment A:       'a' | 'A';
fragment B:       'b' | 'B';
fragment C:       'c' | 'C';
fragment D:       'd' | 'D';
fragment E:       'e' | 'E';
fragment F:       'f' | 'F';
fragment G:       'g' | 'G';
fragment H:       'h' | 'H';
fragment I:       'i' | 'I';
fragment K:       'k' | 'K';
fragment L:       'l' | 'L';
fragment M:       'm' | 'M';
fragment N:       'n' | 'N';
fragment O:       'o' | 'O';
fragment P:       'p' | 'P';
fragment R:       'r' | 'R';
fragment S:       's' | 'S';
fragment T:       't' | 'T';
fragment U:       'u' | 'U';
fragment V:       'v' | 'V';
fragment W:       'w' | 'W';



Variable:     V A R I A B L E;
Constant:     C O N S T A N T;
Begin:        B E G I N;
End:          E N D;
Integer:      I N T E G E R;
True:         T R U E;
False:        F A L S E;
If:           I F;
Is:           I S;
Return:       R E T U R N;
Void:         V O I D;
Boolean:      B O O L E A N;
Else:         E L S E;
While:        W H I L E;
Skip:         S K I P;
Main:         M A I N;


fragment Letter: [a-zA-Z]; 
fragment Digit: [0 - 9];
fragment UnderScore: '_';


ID:           Letter (Letter | Digit | UnderScore)*;
Number:       Digit Digit*;

WS:           [\t\n\r]+ -> skip;
