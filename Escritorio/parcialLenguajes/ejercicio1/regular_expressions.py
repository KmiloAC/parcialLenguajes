import re

def validate_expression(pattern, string):
    try:
        return re.findall(pattern, string)
    except re.error as e:
        print(f"Error en la expresión regular: {e}")
        return []
