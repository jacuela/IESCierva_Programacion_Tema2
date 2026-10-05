# Manual de bucles en Java: for, while y do..while

## Introducción

Un bucle repite un bloque de instrucciones mientras se cumpla una condición. Junto con la secuencia y la selección (`if`, `switch`), es una de las tres estructuras de control de la programación estructurada.

Casi todo bucle tiene tres partes:

- **Inicialización**: se da un valor inicial a la variable de control (`int i = 0;`).
- **Condición**: se evalúa en cada vuelta y debe ser una expresión `boolean`; si es `true`, el bucle sigue.
- **Actualización**: se modifica la variable de control para que el bucle acabe algún día (`i++`).

Cada repetición del cuerpo se llama **iteración**. Los ejemplos de este manual están en Java; la sintaxis de los tres bucles es prácticamente la misma en C, C++, C# o JavaScript. Para ejecutarlos, guarda cada uno en un fichero con el nombre de la clase (por ejemplo, `TablaDel7.java`).

## Bucle for

El `for` reúne las tres partes del bucle en una sola línea, por eso es el preferido cuando se sabe de antemano cuántas vueltas hay que dar.

**Sintaxis**

```java
for (inicialización; condición; actualización) {
    // cuerpo
}
```

**Funcionamiento**

1. Se ejecuta la inicialización, una sola vez.
2. Se evalúa la condición. Si es falsa, el bucle termina.
3. Si es verdadera, se ejecuta el cuerpo.
4. Se ejecuta la actualización y se vuelve al paso 2.

**Ejemplo**: mostrar la tabla de multiplicar del 7.

```java
public class TablaDel7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " = " + (7 * i));
        }
    }
}
```

**Cuándo usarlo**: cuando el número de iteraciones es conocido o se puede calcular antes de empezar, por ejemplo recorrer un array de N elementos, contar de 1 a 100 o repetir algo un número fijo de veces.

**For mejorado (for-each)**: Java tiene además una forma abreviada para recorrer arrays y colecciones sin índice. Se usa cuando solo hay que leer cada elemento, no saber su posición.

```java
int[] notas = {7, 5, 9, 6};
int suma = 0;
for (int nota : notas) {
    suma += nota;
}
System.out.println("Media: " + (double) suma / notas.length);
```

## Bucle while

El `while` repite el cuerpo mientras la condición sea verdadera y la comprueba **antes** de cada vuelta, así que puede ejecutarse cero veces.

**Sintaxis**

```java
while (condición) {
    // cuerpo
}
```

**Funcionamiento**

1. Se evalúa la condición. Si es falsa, el bucle termina sin ejecutar el cuerpo.
2. Si es verdadera, se ejecuta el cuerpo.
3. Se vuelve al paso 1.

La inicialización va antes del bucle y la actualización dentro del cuerpo: si se olvida, el bucle no termina nunca.

**Ejemplo**: sumar números hasta que el usuario introduzca un 0.

```java
import java.util.Scanner;

public class SumaHastaCero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        System.out.print("Número (0 para terminar): ");
        int n = sc.nextInt();

        while (n != 0) {
            suma += n;
            System.out.print("Número (0 para terminar): ");
            n = sc.nextInt();
        }

        System.out.println("Suma total: " + suma);
        sc.close();
    }
}
```

**Cuándo usarlo**: cuando no se sabe cuántas vueltas habrá y depende de algo que ocurre durante la ejecución, como leer datos hasta un valor centinela, leer un fichero hasta el final o esperar a que se cumpla un estado.

## Bucle do..while

El `do..while` comprueba la condición **después** de cada vuelta, así que el cuerpo se ejecuta siempre al menos una vez.

**Sintaxis**

```java
do {
    // cuerpo
} while (condición);
```

Ojo al punto y coma final: es obligatorio y es el error de compilación más habitual con este bucle.

**Funcionamiento**

1. Se ejecuta el cuerpo.
2. Se evalúa la condición. Si es verdadera, se vuelve al paso 1.
3. Si es falsa, el bucle termina.

**Ejemplo**: pedir una nota hasta que sea válida.

```java
import java.util.Scanner;

public class PedirNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Introduce una nota (0-10): ");
            nota = sc.nextInt();
        } while (nota < 0 || nota > 10);

        System.out.println("Nota registrada: " + nota);
        sc.close();
    }
}
```

Comparado con el ejemplo del `while`, aquí no hace falta repetir el `System.out.print` y el `sc.nextInt()` antes del bucle, porque la primera lectura ya ocurre dentro. Fíjate también en que `nota` se declara fuera del `do`: una variable declarada dentro de las llaves no existe en la condición del `while`.

**Cuándo usarlo**: cuando el cuerpo tiene que ejecutarse al menos una vez antes de poder decidir si se repite, como validar datos de entrada o mostrar un menú hasta que el usuario elija "Salir".

## Comparativa

La diferencia clave es cuándo se comprueba la condición: `for` y `while` antes del cuerpo, `do..while` después.

```
        while (y for)                        do..while

            |                                    |
            v                                    v
  +--> ¿Condición? --no--> Fin       +----->  Cuerpo
  |         |                        |           |
  |        sí                        |           v
  |         v                        +--sí-- ¿Condición? --no--> Fin
  +----- Cuerpo

  El cuerpo puede ejecutarse 0 veces     El cuerpo se ejecuta al menos 1 vez
```

En `while` la condición es la puerta de entrada al cuerpo; en `do..while` es la puerta de salida.

| Bucle | Comprueba la condición | Ejecuciones mínimas | Uso típico |
| --- | --- | --- | --- |
| `for` | Antes de cada vuelta | 0 | Número de vueltas conocido (contadores, arrays) |
| `while` | Antes de cada vuelta | 0 | Número de vueltas desconocido (centinelas, ficheros) |
| `do..while` | Después de cada vuelta | 1 | Hay que ejecutar al menos una vez (menús, validación) |

**Equivalencias**: cualquier bucle se puede reescribir con otro. Este `for`

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

hace exactamente lo mismo que este `while`:

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

Elegir uno u otro es cuestión de claridad: el bucle adecuado deja ver de un vistazo cuántas veces se repite y por qué termina.

## Errores frecuentes y buenas prácticas

- **Bucle infinito**: la condición nunca llega a ser falsa, casi siempre porque falta la actualización (`i++`) en un `while`.
- **Error por uno (off-by-one)**: usar `<=` donde iba `<`. Un array se recorre con `for (int i = 0; i < array.length; i++)`; llegar a `i <= array.length` lanza `ArrayIndexOutOfBoundsException`.
- **Punto y coma de más**: `for (int i = 0; i < 10; i++);` o `while (x > 0);` dejan el bucle con un cuerpo vacío, y las llaves de debajo se ejecutan una sola vez (o el programa se cuelga).
- **Punto y coma de menos**: en `do..while`, `} while (condición)` sin `;` no compila.
- **Usar `=` en vez de `==`**: con un `int`, `while (x = 0)` no compila porque la condición debe ser `boolean`; pero con un `boolean`, `while (fin = true)` sí compila y crea un bucle infinito.
- **Comparar `String` con `==`**: para textos se usa `.equals()`, por ejemplo `while (!opcion.equals("salir"))`.
- **Llaves siempre**: aunque el cuerpo tenga una sola línea, ponerlas evita errores al añadir instrucciones después.

**break y continue**

- `break` sale del bucle inmediatamente.
- `continue` salta el resto del cuerpo y pasa a la siguiente iteración (en un `for`, se ejecuta antes la actualización).

```java
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) continue;  // salta los pares
    if (i > 7) break;          // termina al pasar de 7
    System.out.print(i + " "); // imprime 1 3 5 7
}
```

En programación estructurada estricta se recomienda usarlos con moderación: un bucle se entiende mejor cuando su única salida es la condición.
