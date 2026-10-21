# Tema 2 - Ejercicios de cadenas

## Métodos de String en Java

Los 10 métodos de `String` más usados. En todos los ejemplos:

```java
String s = "Hola Mundo";
```

| # | Método | Qué hace | Ejemplo | Resultado |
|---|--------|----------|---------|-----------|
| 1 | `length()` | Devuelve el número de caracteres | `s.length()` | `10` |
| 2 | `charAt(i)` | Devuelve el carácter de la posición `i` (empieza en 0) | `s.charAt(0)` | `'H'` |
| 3 | `substring(ini, fin)` | Extrae desde `ini` hasta `fin` (sin incluir `fin`) | `s.substring(0, 4)` | `"Hola"` |
| 4 | `indexOf(texto)` | Posición de la primera aparición, o `-1` si no aparece | `s.indexOf("Mundo")` | `5` |
| 5 | `equals(otro)` | Compara el contenido de dos cadenas | `s.equals("Hola Mundo")` | `true` |
| 6 | `equalsIgnoreCase(otro)` | Compara sin distinguir mayúsculas y minúsculas | `s.equalsIgnoreCase("hola mundo")` | `true` |
| 7 | `toUpperCase()` / `toLowerCase()` | Pasa a mayúsculas o a minúsculas | `s.toUpperCase()` | `"HOLA MUNDO"` |
| 8 | `trim()` | Quita los espacios del principio y del final | `"  hola  ".trim()` | `"hola"` |
| 9 | `replace(viejo, nuevo)` | Sustituye todas las apariciones de un texto por otro | `s.replace("o", "0")` | `"H0la Mund0"` |
| 10 | `split(separador)` | Parte la cadena y devuelve un array | `s.split(" ")` | `{"Hola", "Mundo"}` |

> **Ojo:** para comparar cadenas usa siempre `equals`, nunca `==`.

**Otros útiles:** `contains`, `startsWith`, `compareTo`.

Consula el [API JAVADOC 21](https://docs.oracle.com/en/java/javase/21/docs/api/index.html) para más información (java.lang.String).

## Ejercicio01 - Contar apariciones de letras
Dada la frase `String frase = "Yo he visto cosas que vosotros no creeríais"`
- Hacer un programa que te pida una letra y te cuente las apariciones de dicha letra en la frase. Repetir en bucle. Salir al pulsar INTRO y no introducir ninguna letra.

## Ejercicio02 - contar vocales y consonantes
Dada la frase `"String frase= "El covid19 es lo peor"`, indicar el numero de vocales y de consonantes de la frase.

## Ejercicio03 - funciones indexof, replace, contains
Dada la frase (en mayúsculas y con espacios al principio y final) `String frase= "   HOMBRES Y MUJERES TENEMOS LOS MISMOS DERECHOS   "`:
- ¿Aparece la palabra "mujeres"?. Hazlo con `indexOf()` y con `contains()`.
- Indicar el numero de palabras que tiene (debe salir 7)
- Cambia los espacios en blanco de la frase original por el carcarter '_'
- Elimina los espacios en blanco de la frase. Debe salir `HOMBRESYMUJERESTENEMOSLOSMISMOSDERECHOS`

## Ejercicio04 - substring
Hacer un programa que te pida un email como "ana@gmail.com" y muestre por separado el usuario y el dominio, usando indexOf() junto con substring. Hacerlo en bucle y terminar con INTRO.
```java
ana@gmail.com
  usuario: ana
  dominio: gmail.com
```

## Ejercicio05 - eliminar blancos
Dada una cadena por teclado, eliminar espacios en blanco pero sin usar la función `replace()`. Para ello, recorre letra a letra la cadena y usa la concatenación de cadenas en java (el símbolo +) para acumular caracteres.
```
frase = frase + caracter
```

## Ejercicio06 - 
Dada la cadena **"el rock mola siempre"**, convertir la frase a mayúsculas y cambiar las letras 'o' por un cero y las letras 'i' por el numero 1. La salida será: **"EL R0CK M0LA S1EMPRE"**.
El ejercicio hay que hacerlo concatenando carácter a carácter, y antes de concatenarlo, pasarlo a mayúsculas. Es decir, no puedo usar la función replace() dos veces y luego usar la función toUpperCase().




## ...... y más