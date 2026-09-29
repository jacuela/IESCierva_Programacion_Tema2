# Condiciones compuestas en Java

Sep 29, 2026 · @Juan Antonio

Una condición compuesta une dos o más condiciones simples con los operadores lógicos `&&` (Y) y `||` (O), y su resultado sigue siendo un único valor: `true` o `false`.

## 1. Punto de partida: la condición simple

Una condición simple compara dos valores con un operador relacional y da `true` o `false`. Es la pieza con la que se construyen las condiciones compuestas.

| Operador | Significado | Ejemplo (`edad = 20`) | Resultado |
| --- | --- | --- | --- |
| `==` | igual a | `edad == 18` | `false` |
| `!=` | distinto de | `edad != 18` | `true` |
| `>` | mayor que | `edad > 18` | `true` |
| `<` | menor que | `edad < 18` | `false` |
| `>=` | mayor o igual que | `edad >= 20` | `true` |
| `<=` | menor o igual que | `edad <= 19` | `false` |

El resultado de una condición se puede guardar en una variable `boolean` o mostrar directamente:

```java
int edad = 20;
boolean mayorDeEdad = edad >= 18;
System.out.println(mayorDeEdad);   // true
```

## 2. Los operadores lógicos && y ||

`&&` exige que se cumplan **todas** las condiciones; `||` se conforma con que se cumpla **al menos una**.

### && (Y, AND)

| A | B | A && B |
| --- | --- | --- |
| `true` | `true` | **`true`** |
| `true` | `false` | `false` |
| `false` | `true` | `false` |
| `false` | `false` | `false` |

Solo da `true` cuando las dos partes son verdaderas. Basta una falsa para que todo sea falso.

### || (O, OR)

| A | B | A \|\| B |
| --- | --- | --- |
| `true` | `true` | `true` |
| `true` | `false` | `true` |
| `false` | `true` | `true` |
| `false` | `false` | **`false`** |

Solo da `false` cuando las dos partes son falsas. Basta una verdadera para que todo sea verdadero.

Una forma de recordarlo: `&&` es exigente, `||` es generoso.

## 3. Condiciones dobles

Una condición doble une dos condiciones simples con un operador lógico. Para evaluarla, primero se resuelve cada condición simple y después se aplica el operador.

### 3.1. Doble con && : comprobar un rango

El uso más habitual de `&&` es comprobar que un valor está **dentro** de un intervalo.

```java
double nota = 6.5;
boolean esBien = nota >= 6 && nota < 7;
System.out.println(esBien);   // true
```

Evaluación paso a paso con `nota = 6.5`:

1. `nota >= 6` → `6.5 >= 6` → `true`
2. `nota < 7` → `6.5 < 7` → `true`
3. `true && true` → **`true`**

Con `nota = 8`, la segunda parte es falsa (`8 < 7` → `false`) y el resultado es `false`.

Otros ejemplos con `&&`:

```java
boolean notaValida = nota >= 0 && nota <= 10;        // entre 0 y 10
boolean puedeConducir = edad >= 18 && tieneCarnet;   // mayor de edad y con carnet
boolean esAdolescente = edad >= 13 && edad <= 17;
```

### 3.2. Doble con || : comprobar alternativas

`||` se usa cuando basta con que se cumpla **una** de las opciones, o para comprobar que un valor está **fuera** de un intervalo.

```java
int dia = 7;
boolean finDeSemana = dia == 6 || dia == 7;
System.out.println(finDeSemana);   // true
```

Evaluación paso a paso con `dia = 7`:

1. `dia == 6` → `7 == 6` → `false`
2. `dia == 7` → `7 == 7` → `true`
3. `false || true` → **`true`**

Otros ejemplos con `||`:

```java
boolean notaInvalida = nota < 0 || nota > 10;          // fuera de 0-10
boolean esVocalA = letra == 'a' || letra == 'A';       // minúscula o mayúscula
boolean entradaReducida = edad < 12 || edad > 65;
```

Fíjate en la pareja `notaValida` / `notaInvalida`: **dentro** de un rango se escribe con `&&` y los operadores `>=` / `<=`; **fuera** del rango, con `||` y los operadores `<` / `>`.

## 4. Condiciones triples

Una condición triple une tres condiciones simples. Si todos los operadores son iguales, el resultado es fácil de razonar; si se mezclan `&&` y `||`, hay que tener en cuenta el orden en que Java los evalúa.

### 4.1. Triple con && : se tienen que cumplir las tres

```java
double ex1 = 7, ex2 = 4.5, ex3 = 8;
boolean todoAprobado = ex1 >= 5 && ex2 >= 5 && ex3 >= 5;
System.out.println(todoAprobado);   // false
```

1. `ex1 >= 5` → `true`
2. `ex2 >= 5` → `false`
3. `true && false && true` → **`false`**: basta una falsa.

### 4.2. Triple con || : basta con que se cumpla una

```java
boolean algunaSuspensa = ex1 < 5 || ex2 < 5 || ex3 < 5;
System.out.println(algunaSuspensa);   // true
```

1. `ex1 < 5` → `false`
2. `ex2 < 5` → `true`
3. `false || true || false` → **`true`**: basta una verdadera.

Observa que `algunaSuspensa` es justo lo contrario de `todoAprobado`: cambiar `&&` por `||` e invertir cada comparación da la condición opuesta.

### 4.3. Triple mezclando && y ||

Cuando se mezclan, Java evalúa **primero `&&` y después `||`**, igual que en matemáticas se multiplica antes de sumar. Esto puede dar un resultado distinto del que se pretendía.

Ejemplo: tienen descuento los estudiantes o jubilados, **siempre que** presenten la tarjeta. Con estos valores la persona no debería tener descuento:

```java
boolean esEstudiante = true;
boolean esJubilado = false;
boolean tieneTarjeta = false;
```

**Sin paréntesis (incorrecto):**

```java
boolean descuento = esEstudiante || esJubilado && tieneTarjeta;
```

1. Primero `&&`: `esJubilado && tieneTarjeta` → `false && false` → `false`
2. Después `||`: `esEstudiante || false` → `true || false` → **`true`**

Java lo ha leído como `esEstudiante || (esJubilado && tieneTarjeta)`, y el estudiante obtiene descuento sin tarjeta.

**Con paréntesis (correcto):**

```java
boolean descuento = (esEstudiante || esJubilado) && tieneTarjeta;
```

1. Primero el paréntesis: `esEstudiante || esJubilado` → `true || false` → `true`
2. Después `&&`: `true && tieneTarjeta` → `true && false` → **`false`**

Regla práctica: **cuando mezcles `&&` y `||`, usa siempre paréntesis**, aunque el resultado coincida. Dejan claro lo que quieres decir.

### 4.4. Rango más condición

Una forma muy frecuente de condición triple es un rango (dos comparaciones) más una condición adicional:

```java
// Nota entre 5 y 7, y asistencia mínima del 80 %
boolean ok = nota >= 5 && nota < 7 && asistencia >= 80;

// Sábado o domingo, a partir de las 10
boolean abierto = (dia == 6 || dia == 7) && hora >= 10;
```

## 5. Cortocircuito y negación

### 5.1. Evaluación en cortocircuito

Java evalúa las condiciones de izquierda a derecha y se detiene en cuanto conoce el resultado:

- Con `&&`, si una parte es `false`, el resto no se evalúa: el resultado ya es `false`.
- Con `||`, si una parte es `true`, el resto no se evalúa: el resultado ya es `true`.

Esto permite poner primero una comprobación que proteja a la siguiente:

```java
int divisor = 0;
boolean ok = divisor != 0 && 10 / divisor > 2;   // false, sin error
```

Como `divisor != 0` es `false`, Java no llega a hacer la división entre cero. Si se invierte el orden (`10 / divisor > 2 && divisor != 0`), el programa lanza `ArithmeticException`.

### 5.2. El operador ! (NO)

`!` invierte el resultado de una condición: `!true` es `false` y `!false` es `true`. Para negar una condición compuesta entera, se rodea de paréntesis:

```java
boolean notaValida = nota >= 0 && nota <= 10;
boolean notaInvalida = !(nota >= 0 && nota <= 10);
```

Al negar una condición compuesta, `&&` se convierte en `||` (y al revés) y cada comparación se invierte. Son las **leyes de De Morgan**:

| Expresión negada | Equivale a |
| --- | --- |
| `!(A && B)` | `!A \|\| !B` |
| `!(A \|\| B)` | `!A && !B` |
| `!(nota >= 0 && nota <= 10)` | `nota < 0 \|\| nota > 10` |
| `!(dia == 6 \|\| dia == 7)` | `dia != 6 && dia != 7` |

## 6. Errores frecuentes

| Lo que se escribe | Problema | Forma correcta |
| --- | --- | --- |
| `5 <= nota < 7` | No es válido en Java: no se pueden encadenar comparaciones como en matemáticas. | `nota >= 5 && nota < 7` |
| `dia == 6 \|\| 7` | Cada lado del operador debe ser una condición completa; `7` no es un `boolean`. | `dia == 6 \|\| dia == 7` |
| `nota < 0 && nota > 10` | Ningún número es a la vez menor que 0 y mayor que 10: siempre da `false`. | `nota < 0 \|\| nota > 10` |
| `dia != 6 \|\| dia != 7` | Todo día es distinto de 6 o distinto de 7: siempre da `true`. | `dia != 6 && dia != 7` |
| `a \|\| b && c` pensando en `(a \|\| b) && c` | `&&` se evalúa antes que `\|\|`, así que Java lo lee como `a \|\| (b && c)`. | `(a \|\| b) && c` |
| `&` o `\|` en lugar de `&&` o `\|\|` | Funcionan con `boolean`, pero sin cortocircuito: evalúan siempre las dos partes. | `&&` y `\|\|` |

Un truco para detectar los errores de las filas 3 y 4: prueba la condición con un valor concreto de cada caso. Si da siempre lo mismo, el operador lógico está mal elegido.

## 7. Ejercicios

### A. Evalúa cada expresión

Con `int a = 5, b = 10, c = 0;`, indica si el resultado es `true` o `false`. Escribe los pasos intermedios.

1. `a > 3 && b < 20`
2. `a > 7 || b == 10`
3. `a == 5 && b != 10`
4. `c != 0 && b / c > 1`
5. `a < 10 && b > 5 && c == 0`
6. `a > 10 || b < 5 || c > 0`
7. `a > 1 || b > 20 && c > 5`
8. `(a > 1 || b > 20) && c > 5`
9. `!(a > 3 && b > 3)`

### B. Escribe la condición

Escribe la expresión booleana y guárdala en una variable con un nombre adecuado.

1. La edad está entre 18 y 65, ambos incluidos.
2. La temperatura está fuera del intervalo de 15 a 25 grados.
3. El carácter `respuesta` es `'s'` o `'S'`.
4. El mes es de verano: 6, 7 u 8.
5. Los tres lados de un triángulo son iguales (equilátero).
6. Al menos dos lados de un triángulo son iguales (isósceles).
7. Un alumno aprueba si su media es al menos 5, su asistencia es al menos del 80 % y no tiene ninguna falta grave (`faltaGrave` es un `boolean`).
8. Un año es bisiesto si es divisible entre 4 y no entre 100, o si es divisible entre 400.

### Soluciones del apartado A

| N.º | Pasos | Resultado |
| --- | --- | --- |
| 1 | `true && true` | `true` |
| 2 | `false \|\| true` | `true` |
| 3 | `true && false` | `false` |
| 4 | `false && …` (cortocircuito, no divide entre 0) | `false` |
| 5 | `true && true && true` | `true` |
| 6 | `false \|\| false \|\| false` | `false` |
| 7 | `true \|\| (false && false)` → `true \|\| false` | `true` |
| 8 | `(true \|\| false) && false` → `true && false` | `false` |
| 9 | `!(true && true)` → `!true` | `false` |
