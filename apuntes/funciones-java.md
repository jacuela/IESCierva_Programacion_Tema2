# Manual de funciones en Java

## Introducción

Una función es un bloque de código con nombre que realiza una tarea concreta y que se puede ejecutar (**llamar**) tantas veces como haga falta desde otras partes del programa. Es la herramienta principal de la programación estructurada para dividir un problema grande en problemas pequeños, lo que se conoce como **programación modular** o diseño descendente.

Usar funciones aporta tres ventajas:

- **Reutilización**: el código se escribe una vez y se usa muchas.
- **Legibilidad**: `calcularMedia(notas)` se entiende mejor que diez líneas de cálculos.
- **Mantenimiento**: si hay un error, se corrige en un único sitio.

En Java las funciones se llaman **métodos** y siempre van dentro de una clase. Como todavía no trabajamos con objetos, en este manual todas llevan la palabra `static`, igual que `main`. Para ejecutar los ejemplos, guarda cada uno en un fichero con el nombre de la clase (por ejemplo, `Saludo.java`).

## Definir y llamar a una función

**Sintaxis**

```java
public static tipoDeRetorno nombre(tipo parametro1, tipo parametro2) {
    // cuerpo
    return valor;
}
```

- **`public static`**: por ahora, siempre así.
- **Tipo de retorno**: el tipo del valor que devuelve (`int`, `double`, `boolean`, `String`...) o `void` si no devuelve nada.
- **Nombre**: un verbo en minúsculas que diga qué hace (`calcularArea`, `esPar`, `mostrarMenu`).
- **Parámetros**: los datos que recibe, entre paréntesis y separados por comas. Puede no tener ninguno: `()`.

La primera línea (tipo, nombre y parámetros) se llama **cabecera** o **firma** de la función.

**Funcionamiento de una llamada**

1. El programa llega a la llamada, por ejemplo `cuadrado(5)`.
2. Se copian los valores de los argumentos en los parámetros.
3. Se ejecuta el cuerpo de la función.
4. Al llegar a `return` (o al final del cuerpo), se vuelve al punto de la llamada con el resultado.

**Ejemplo**: una función que calcula el cuadrado de un número.

```java
public class Cuadrados {
    public static int cuadrado(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        int a = cuadrado(4);              // a vale 16
        System.out.println(a);
        System.out.println(cuadrado(7));  // imprime 49
        System.out.println(cuadrado(a) + cuadrado(2)); // 256 + 4 = 260
    }
}
```

El orden en que se escriben las funciones dentro de la clase no importa: `main` puede ir antes o después de `cuadrado`.

## Funciones que devuelven un valor y procedimientos (void)

Una función con tipo de retorno **calcula y devuelve** un resultado, que se puede guardar en una variable, imprimir o usar dentro de una expresión. Debe terminar siempre con un `return` del tipo indicado.

Una función `void` (a veces llamada **procedimiento**) **hace algo** pero no devuelve nada: mostrar un mensaje, dibujar un menú... Se llama como una instrucción suelta.

**Ejemplo**: las dos formas juntas.

```java
public class Saludo {
    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    public static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }

    public static void main(String[] args) {
        saludar("Lucía");                 // instrucción suelta

        if (esMayorDeEdad(20)) {          // dentro de una condición
            System.out.println("Puede votar");
        }
    }
}
```

`return` termina la función en ese mismo instante, así que puede haber varios. En una función `void` se puede usar `return;` sin valor para salir antes de tiempo.

```java
public static String calificacion(double nota) {
    if (nota < 5) return "Suspenso";
    if (nota < 7) return "Aprobado";
    if (nota < 9) return "Notable";
    return "Sobresaliente";
}
```

## Parámetros y argumentos

- **Parámetros** (o parámetros formales): las variables declaradas en la cabecera, `int n`.
- **Argumentos** (o parámetros reales): los valores que se pasan en la llamada, `cuadrado(4)`.

Los argumentos se asignan a los parámetros **por posición** y deben coincidir en número, orden y tipo:

```java
public static double areaRectangulo(double base, double altura) {
    return base * altura;
}

areaRectangulo(3, 2.5);   // base = 3, altura = 2.5
areaRectangulo(2.5);      // no compila: falta un argumento
areaRectangulo("3", 2);   // no compila: "3" es un String
```

**Paso por valor**

En Java los argumentos se pasan **por valor**: la función recibe una copia, y cambiar el parámetro no cambia la variable original.

```java
public class PasoPorValor {
    public static void duplicar(int x) {
        x = x * 2;
        System.out.println("Dentro: " + x);   // Dentro: 20
    }

    public static void main(String[] args) {
        int num = 10;
        duplicar(num);
        System.out.println("Fuera: " + num);  // Fuera: 10
    }
}
```

Si se quiere el valor modificado, la función debe devolverlo y quien la llama, guardarlo: `num = duplicar(num);` (con `duplicar` devolviendo `int`).

**Arrays como parámetros**: un array también se pasa por valor, pero lo que se copia es la referencia al array, no sus elementos. Por eso, si la función modifica `v[i]`, el cambio **sí** se ve fuera. Se ve con detalle en el manual de arrays.

```java
public static int sumar(int[] v) {
    int suma = 0;
    for (int x : v) {
        suma += x;
    }
    return suma;
}
```

## Ámbito de las variables

Una variable solo existe dentro del bloque `{ }` donde se declara. Las variables declaradas dentro de una función, incluidos sus parámetros, son **locales**: se crean al llamarla y desaparecen al terminar.

```java
public static int factorial(int n) {
    int resultado = 1;              // local de factorial
    for (int i = 2; i <= n; i++) {  // i solo existe dentro del for
        resultado *= i;
    }
    return resultado;
}

public static void main(String[] args) {
    int n = 5;                      // otra n distinta, local de main
    System.out.println(factorial(n));
    // System.out.println(resultado);  // no compila: resultado no existe aquí
}
```

Dos funciones pueden tener variables con el mismo nombre sin que se mezclen. La forma correcta de pasar datos entre funciones es con **parámetros** (hacia dentro) y **`return`** (hacia fuera).

## Sobrecarga

Java permite varias funciones con el mismo nombre si tienen distintos parámetros (en número o en tipo). Al llamarla, se elige la versión que encaja con los argumentos.

```java
public static int maximo(int a, int b) {
    return (a > b) ? a : b;
}

public static int maximo(int a, int b, int c) {
    return maximo(maximo(a, b), c);
}

public static double maximo(double a, double b) {
    return (a > b) ? a : b;
}
```

`maximo(3, 8)` usa la primera, `maximo(3, 8, 5)` la segunda y `maximo(2.5, 1.0)` la tercera. Solo cambiar el tipo de retorno no basta para sobrecargar.

## Ejemplo completo

Un programa con menú en el que `main` solo organiza y cada tarea está en su propia función.

```java
import java.util.Scanner;

public class Calculadora {
    public static void mostrarMenu() {
        System.out.println("1. Sumar");
        System.out.println("2. Multiplicar");
        System.out.println("0. Salir");
    }

    public static int leerEntero(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return sc.nextInt();
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero(sc, "Opción: ");
            if (opcion == 1 || opcion == 2) {
                int a = leerEntero(sc, "Primer número: ");
                int b = leerEntero(sc, "Segundo número: ");
                int r = (opcion == 1) ? sumar(a, b) : multiplicar(a, b);
                System.out.println("Resultado: " + r);
            }
        } while (opcion != 0);

        sc.close();
    }
}
```

## Errores frecuentes y buenas prácticas

- **Olvidar el `return`**: una función no `void` en la que algún camino no llega a un `return` no compila (`missing return statement`).
- **Ignorar el valor devuelto**: `cuadrado(5);` compila, pero el resultado se pierde. Hay que guardarlo o usarlo.
- **Usar una función `void` como valor**: `int x = saludar("Ana");` no compila.
- **Esperar que el parámetro cambie la variable original**: con tipos primitivos no ocurre (paso por valor).
- **Olvidar `static`**: desde `main` no se puede llamar a una función sin `static` (`non-static method cannot be referenced from a static context`).
- **Declarar una función dentro de otra**: en Java no se puede; todas van al mismo nivel dentro de la clase.
- **Imprimir en lugar de devolver**: una función que calcula algo debe hacer `return`, no `System.out.println`. Así quien la llama decide qué hacer con el resultado.
- **Una función, una tarea**: si una función no cabe en pantalla o su nombre necesita un "y" (`leerYCalcularYMostrar`), conviene dividirla.
- **Nombres claros**: verbos para acciones (`calcularIva`) y `es`/`tiene` para las que devuelven `boolean` (`esPrimo`, `tieneDescuento`).
