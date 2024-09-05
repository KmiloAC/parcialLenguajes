import re
import sys
from regular_expressions import validate_expression

def main():
    # Verificar que se ha pasado el argumento necesario
    if len(sys.argv) != 2:
        print("Uso: python3 APD.py <nombre_del_archivo>")
        sys.exit(1)
    
    # Obtener el nombre del archivo desde el argumento
    file_name = sys.argv[1]
    
    # Intentar abrir y leer el archivo
    try:
        with open(file_name, 'r') as file:
            lines = file.readlines()
    except FileNotFoundError:
        print(f"Archivo '{file_name}' no encontrado.")
        sys.exit(1)
    
    # Expresiones regulares a probar
    expressions = {
        r'\+': "SUMA",
        r'\+\+': "INCR",
        r'[0-9]+': "NUMERO",
        r'([0-9]+)\.([0-9]+)': "NUMERO DECIMAL"
    }
    
    # Procesar cada línea del archivo
    for line in lines:
        line = line.strip()  # Eliminar espacios y saltos de línea al inicio y final
        if not line:  # Ignorar líneas vacías
            continue
        
        print(f"\nProcesando línea: '{line}'")
        
        relevant_message = None

        # Verificar cada expresión y actualizar el mensaje más relevante
        for expr, message in expressions.items():
            if validate_expression(expr, line):
                relevant_message = message
        
        # Imprimir el mensaje más relevante encontrado
        if relevant_message:
            print(relevant_message)
        else:
            print("No se encontraron coincidencias.")

if __name__ == "__main__":
    main()