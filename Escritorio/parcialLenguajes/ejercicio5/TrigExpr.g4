grammar TrigExpr;

// Reglas para las funciones trigonométricas
prog:   expr+ ;

expr:   'Sin' '(' expr ')'   # SinExpr
    |   'Cos' '(' expr ')'   # CosExpr
    |   'Tan' '(' expr ')'   # TanExpr
    |   NUMBER               # NumberExpr
    ;

// Definir los tokens
NUMBER: [0-9]+ ('.' [0-9]+)? ;

// Ignorar espacios en blanco
WS: [ \t\r\n]+ -> skip ;
