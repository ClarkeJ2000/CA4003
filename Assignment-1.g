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

function:      type ID parameter_list IS
               decl_list 
               Begin
               statement_block Return
               (expr | )
               Semicolon
               End;