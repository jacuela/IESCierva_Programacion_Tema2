package _6funciones;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("EJERCICIO05 - GENERADOR ARRAY");
        System.out.println("=============================");
        System.out.print("Tamaño: ");
        int tam = Integer.parseInt(teclado.nextLine());
        System.out.print("Extremo inferior: ");
        int min = Integer.parseInt(teclado.nextLine());
        System.out.print("Extremo superior: ");
        int max = Integer.parseInt(teclado.nextLine());

        //int []lista = arrayAleatorio(tam,min,max);
        //imprimirArray(lista);
        imprimirArray(arrayAleatorio(tam,min,max));

    }

    /**
     * Función que genera un array de enteros aleatorios
     * entre min y max, ambos extremos incluidos.
     * @param tam tamaño del array
     * @param min extremo inferior incluido
     * @param max extremo superior incluido
     * @return el array de enteros
     */
    public static int[] arrayAleatorio(int tam,
                                       int min,
                                       int max){
        int[] resultado;
        resultado = new int[tam];

        Random random = new Random();

        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = random.nextInt(min,max+1);
        }

        return resultado;

    }

    public static void imprimirArray(int[] array){
        //Imprimimos array con este formato
        //  +----+----+----+----+
        //  |   3|   7|   9|   1|
        //  +----+----+----+----+
        //
        for (int i = 0; i < array.length ; i++) {
            System.out.print("+----");
        }
        System.out.println("+");

        for (int i = 0; i < array.length ; i++) {
            System.out.printf("|%3d ",array[i]);
        }
        System.out.println("|");
        for (int i = 0; i < array.length ; i++) {
            System.out.print("+----");
        }
        System.out.println("+");
    }//fin imprimirArray




}
