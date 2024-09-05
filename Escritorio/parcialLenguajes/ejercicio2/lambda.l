%{
#include <stdio.h>
#include <stdlib.h>

int accept = 0;  // Inicialmente se considera que no acepta
%}

%%

lambda          { accept = 1; }
[ ]+            { /* Ignorar espacios en blanco */ }
[0-9]+          { /* Ignorar números */ }
[0-9a-zA-Z_]+   { /* Ignorar identificadores */ }
=               { /* Ignorar operador de asignación */ }
:               { /* Ignorar dos puntos */ }
\*\*            { /* Ignorar operador de exponenciación */ }
\(               { /* Ignorar paréntesis izquierdo */ }
\)               { /* Ignorar paréntesis derecho */ }
[;]             { /* Ignorar punto y coma */ }
\n              { /* Ignorar saltos de línea */ }
.               { /* Ignorar otros caracteres */ }

%%

int main(int argc, char **argv) {
    if (argc < 2) {
        fprintf(stderr, "Uso: %s nombre_archivo\n", argv[0]);
        exit(1);
    }

    FILE *file = fopen(argv[1], "r");
    if (!file) {
        perror("fopen");
        exit(1);
    }

    yyin = file;
    yylex(); // Analiza el archivo
    fclose(file);

    if (accept) {
        printf("ACEPTA\n");
    } else {
        printf("NO ACEPTA\n");
    }

    return 0;
}
