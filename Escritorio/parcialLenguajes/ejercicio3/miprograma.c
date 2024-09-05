#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_LINE_LENGTH 1024
#define MAX_FILENAME_LENGTH 256
#define MAX_KEYWORD_LENGTH 256

// Función para contar las ocurrencias de una palabra clave en un archivo
int count_occurrences(FILE *file, char keyword[]) {
    char line[MAX_LINE_LENGTH];
    int count = 0;
    size_t keyword_length = strlen(keyword);

    // Leer el archivo línea por línea
    while (fgets(line, sizeof(line), file)) {
        char *pos = line;

        // Buscar la palabra clave en la línea actual
        while ((pos = strstr(pos, keyword)) != NULL) {
            count++;
            pos += keyword_length; // Mover el puntero para continuar la búsqueda
        }
    }
    return count;
}

int main(int argc, char *argv[]) {
    if (argc != 3) {
        fprintf(stderr, "Uso: %s <archivo> <palabra_clave>\n", argv[0]);
        return EXIT_FAILURE;
    }

    // Definir arreglos para el nombre del archivo y la palabra clave
    char filename[MAX_FILENAME_LENGTH];
    char keyword[MAX_KEYWORD_LENGTH];

    // Copiar el nombre del archivo del argumento a un arreglo
    strncpy(filename, argv[1], sizeof(filename) - 1);
    filename[sizeof(filename) - 1] = '\0'; // Asegurarse de que el arreglo esté terminado en null

    // Copiar la palabra clave del argumento a un arreglo
    strncpy(keyword, argv[2], sizeof(keyword) - 1);
    keyword[sizeof(keyword) - 1] = '\0'; // Asegurarse de que el arreglo esté terminado en null

    // Abrir el archivo para lectura
    FILE *file = fopen(filename, "r");
    if (file == NULL) {
        perror("Error al abrir el archivo");
        return EXIT_FAILURE;
    }

    // Contar las ocurrencias de la palabra clave
    int count = count_occurrences(file, keyword);
    fclose(file);

    // Mostrar el resultado
    if(count != 1){
        printf("La palabra '%s' se repite %d veces en el texto.\n", keyword, count);

    } else {
        printf("La palabra '%s' se repite %d vez en el texto.\n", keyword, count);
    }
    return EXIT_SUCCESS;
}
