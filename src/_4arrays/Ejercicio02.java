package _4arrays;

import java.util.Random;

public class Ejercicio02 {
    public static void main(String[] args) {
        System.out.println("Ejercicio02 - ");
        System.out.println("======================");

        Random random = new Random();

        int[] numeros = new int[5]; //lo creo sin darle valor aun

        //Bucle para rellenarlo
        for (int i = 0; i < numeros.length; i++) {
            int aleatorio = random.nextInt(1,20);
            numeros[i]=aleatorio;
        }

        //FORMA1 - Bucle para imprimirlo
        System.out.println("ARRAY DE NUMEROS");
        System.out.println("-----------------------");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("numeros[%d] %5d\n",i,numeros[i]);
        }
        //FORMA2 - Bucle para imprimirlo
        System.out.print("Array --> [");
        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length-1){
                //Estamos en el ultimo elemento
                System.out.print(numeros[i]);
            }
            else{
                //Estamos en el resto
                System.out.print(numeros[i]+"|");
            }
        }
        System.out.println("]");










    }
}
