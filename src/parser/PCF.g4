grammar PCF;

// règles syntaxiques

// program : term EOF ;
term : LIT                                   # Lit
     | VAR                                   # Var
     | term OP2 term                         # BinOp
     | term OP1 term                         # BinOp
     | 'ifz' term 'then' term 'else' term    # Cond
     | 'fun' VAR '->' term 'in' term         # Fun
     | VAR LIT                               # Call
     | 'let' VAR '=' term 'in' term          # Assign
     ;

// règles lexicales (dont exceptions sur les whitespaces & les comments)

OP1  : '+' | '-' ;
OP2  : '*' | '/' ;
LIT : '0' | [1-9][0-9]* ;
VAR : ([A-Z] | [a-z] | '-' | '_')+([A-Z] | [a-z] | LIT | '-' | '_')* ;
WS : [ \t\n\r]+ -> channel(HIDDEN) ;
LINE_COMMENT : '//' ~'\n'* '\n' -> channel(HIDDEN) ;