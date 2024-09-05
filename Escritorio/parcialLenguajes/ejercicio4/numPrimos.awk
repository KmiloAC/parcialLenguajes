#!/usr/bin/awk -f

# Función para verificar si un número es primo
function es_primo(n) {
    if (n <= 1) return 0
    if (n == 2) return 1
    if (n % 2 == 0) return 0
    for (i = 3; i * i <= n; i += 2) {
        if (n % i == 0) return 0
    }
    return 1
}

# Leer cada línea del archivo
{
    num = $1
    if (es_primo(num)) {
        print num " es primo"
    }
}
