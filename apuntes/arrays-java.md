# Manual de arrays estáticos en Java

## Introducción

Un **array** (o vector) es una colección de datos **del mismo tipo** guardados uno detrás de otro bajo un único nombre. En lugar de declarar `nota1`, `nota2`, `nota3`... se declara un solo array `notas` y se accede a cada valor por su posición.

Se llaman **estáticos** porque su tamaño se fija al crearlos y **no puede cambiar** después: si un array tiene 5 casillas, tendrá 5 casillas hasta el final del programa. Para guardar más datos hay que crear otro array más grande y copiar los valores.

Conceptos básicos:

- **Elemento**: cada uno de los valores guardados.
- **Índice**: la posición de un elemento. En Java **empieza en 0**, así que el último índice es `longitud - 1`.
- **Longitud**: el número de elementos, que se consulta con `nombre.length` (sin paréntesis).

```
  notas  -->  +---+---+---+---+---+
              | 7 | 5 | 9 | 6 | 8 |
              +---+---+---+---+---+
  índice:       0   1   2   3   4        notas.length = 5
```

Los ejemplos de este manual están en Java. Para ejecutarlos, guarda cada uno en un fichero con el nombre de la clase (por ejemplo, `MediaNotas.java`).

## Declaración y creación

Un array se declara indicando el tipo seguido de corchetes, y se crea con `new` indicando el tamaño.

**Sintaxis**

```java
tipo[] nombre = new tipo[tamaño];
```

```java
int[] edades = new int[10];        // 10 enteros
double[] precios = new double[5];  // 5 reales
String[] nombres = new String[3];  // 3 textos
```

El tamaño puede ser una variable (por ejemplo, un número que ha introducido el usuario), pero una vez creado el array ya no cambia.

**Valores por defecto**: al crear un array con `new`, Java rellena cada casilla automáticamente.

| Tipo | Valor inicial |
| --- | --- |
| `int`, `long`, `short`, `byte` | `0` |
| `double`, `float` | `0.0` |
| `boolean` | `false` |
| `char` | `'\u0000'` (carácter nulo) |
| `String` | `null` (sin texto) |

**Inicialización directa**: si ya se conocen los valores, se pueden escribir entre llaves y Java calcula el tamaño solo.

```java
int[] notas = {7, 5, 9, 6, 8};
String[] dias = {"lunes", "martes", "miércoles", "jueves", "viernes"};
```

Esta forma abreviada solo vale en la misma línea de la declaración.

## Acceso a los elementos

Cada elemento se lee o se modifica escribiendo el índice entre corchetes.

```java
int[] notas = {7, 5, 9, 6, 8};

System.out.println(notas[0]);   // 7, el primero
System.out.println(notas[notas.length - 1]);   // 8, el último

notas[1] = 10;                  // cambia el 5 por un 10
notas[2]++;                     // el 9 pasa a 10
```

Un elemento de un array se comporta como cualquier variable de su tipo: se puede usar en operaciones, condiciones, `println`, etc.

Si se usa un índice fuera del rango `0 .. length - 1` (por ejemplo, `notas[5]` o `notas[-1]`), el programa compila pero se detiene al ejecutarse con un error `ArrayIndexOutOfBoundsException`.

## Recorrido de un array

Recorrer un array es pasar por todos sus elementos, uno a uno. Como el número de elementos es conocido (`length`), el bucle natural es el `for`.

**Con for e índice**: se usa cuando hace falta la posición o hay que modificar los elementos.

```java
for (int i = 0; i < notas.length; i++) {
    System.out.println("Nota " + i + ": " + notas[i]);
}
```

**Con for-each**: más corto, se usa cuando solo hay que leer los valores.

```java
for (int nota : notas) {
    System.out.println(nota);
}
```

En el for-each la variable `nota` es una copia del valor: cambiarla **no** modifica el array. Para modificar, usa siempre el `for` con índice.

**Ejemplo**: leer 5 notas por teclado y calcular la media.

```java
import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota del alumno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }

        System.out.println("Media: " + suma / notas.length);
        sc.close();
    }
}
```

Fíjate en que al usuario se le muestra `i + 1`: para las personas el primer alumno es el 1, aunque para Java esté en la posición 0.

## Operaciones habituales

Estos son los algoritmos que más se repiten con arrays. Todos se basan en un recorrido.

**Máximo y mínimo**: se toma el primer elemento como candidato y se compara con el resto.

```java
int[] valores = {4, 12, 7, 1, 9};
int max = valores[0];
int min = valores[0];

for (int i = 1; i < valores.length; i++) {
    if (valores[i] > max) max = valores[i];
    if (valores[i] < min) min = valores[i];
}
System.out.println("Máximo: " + max + ", mínimo: " + min);
```

Es mejor empezar con `valores[0]` que con `0`: si todos los números fueran negativos, un máximo inicial de `0` daría un resultado falso.

**Contar los que cumplen una condición**

```java
int aprobados = 0;
for (int nota : notas) {
    if (nota >= 5) aprobados++;
}
```

**Búsqueda secuencial**: averiguar si un valor está en el array y en qué posición. Se usa un `while` porque conviene parar en cuanto se encuentra.

```java
int[] codigos = {31, 8, 45, 12, 27};
int buscado = 12;
int pos = -1;          // -1 significa "no encontrado"
int i = 0;

while (i < codigos.length && pos == -1) {
    if (codigos[i] == buscado) {
        pos = i;
    }
    i++;
}

if (pos == -1) {
    System.out.println("No está");
} else {
    System.out.println("Encontrado en la posición " + pos);
}
```

El orden de la condición importa: `i < codigos.length` va primero para no consultar nunca una posición que no existe.

**Copiar un array**: asignar con `=` **no** copia los datos, solo hace que las dos variables apunten al mismo array.

```java
int[] a = {1, 2, 3};
int[] b = a;      // b y a son el MISMO array
b[0] = 99;
System.out.println(a[0]);   // 99: a también ha cambiado
```

Para obtener una copia independiente hay que crear un array nuevo y copiar elemento a elemento:

```java
int[] copia = new int[a.length];
for (int k = 0; k < a.length; k++) {
    copia[k] = a[k];
}
```

Por el mismo motivo, dos arrays no se comparan con `==` (eso solo dice si son el mismo array); hay que recorrerlos y comparar posición a posición.

**Mostrar un array entero**: `System.out.println(notas)` no imprime los valores, sino algo como `[I@1b6d3586`. Para verlo de una vez se puede usar `java.util.Arrays`:

```java
import java.util.Arrays;
...
System.out.println(Arrays.toString(notas));   // [7, 5, 9, 6, 8]
```

## Arrays bidimensionales (matrices)

Una matriz es un array de arrays: se organiza en **filas** y **columnas** y cada elemento necesita dos índices, `[fila][columna]`.

```java
int[][] tabla = new int[3][4];   // 3 filas, 4 columnas

int[][] m = {
    {1, 2, 3},
    {4, 5, 6}
};
System.out.println(m[1][2]);     // 6: fila 1, columna 2
```

```
               columna
              0   1   2
            +---+---+---+
  fila 0    | 1 | 2 | 3 |
            +---+---+---+
  fila 1    | 4 | 5 | 6 |
            +---+---+---+

  m.length = 2 (filas)      m[0].length = 3 (columnas)
```

Se recorren con dos bucles anidados: el exterior para las filas y el interior para las columnas.

**Ejemplo**: sumar cada fila de una matriz.

```java
public class SumaFilas {
    public static void main(String[] args) {
        int[][] ventas = {
            {120, 80, 95},
            {60, 110, 70},
            {200, 150, 90}
        };

        for (int f = 0; f < ventas.length; f++) {
            int suma = 0;
            for (int c = 0; c < ventas[f].length; c++) {
                suma += ventas[f][c];
            }
            System.out.println("Fila " + f + ": " + suma);
        }
    }
}
```

Usar `ventas[f].length` en el bucle interior (en vez de un número fijo) hace que el código funcione con matrices de cualquier tamaño.

## Errores frecuentes y buenas prácticas

- **Índice fuera de rango**: el último índice es `length - 1`. Recorre siempre con `i < array.length`, nunca con `<=`.
- **`length` no lleva paréntesis**: en un array es `notas.length`; en un `String` es `texto.length()`.
- **Olvidar crear el array**: `int[] v;` solo declara la variable. Hasta hacer `v = new int[5];` no existe el array, y usarlo da error.
- **Confundir copiar con asignar**: `b = a` no duplica los datos, como se vio en *Copiar un array*.
- **Imprimir con `println(array)`**: muestra una dirección rara; usa un bucle o `Arrays.toString`.
- **Modificar dentro de un for-each**: no cambia el array; usa el `for` con índice.
- **Números mágicos**: escribe `notas.length` en lugar de `5`. Si mañana el array tiene 30 elementos, el código sigue funcionando sin tocarlo.
- **Tamaño fijo**: si no sabes cuántos datos habrá, reserva un tamaño máximo razonable y lleva en una variable aparte cuántas casillas están realmente ocupadas.

```java
int[] datos = new int[100];   // capacidad máxima
int usados = 0;               // casillas ocupadas

datos[usados] = 42;           // añadir un dato
usados++;

for (int i = 0; i < usados; i++) {   // recorrer solo las ocupadas
    System.out.println(datos[i]);
}
```
