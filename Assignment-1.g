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

function:      type ID parameter_list Is
               decl_list 
               Begin
               statement_block Return
               (expr | )
               Semicolon
               end;
            
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
      end;

statement_block: statement statement_block
                 |
                 ;

