package _2condicional;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        System.out.println("Ejercicio2 - positivo/negativo/cero");
        System.out.println("===================================");

        int num;

        System.out.print("Dime un número:");
        num = Integer.parseInt(teclado.nextLine());

        //OPCION 1 - usando tres if
        if (num > 0){
            System.out.println("El numero es POSITIVO");
        }
        if (num < 0){
            System.out.println("El numero es NEGATIVO");
        }
        if (num == 0){
            System.out.println("El numero es CERO");
        }

        //OPCION 2 - usando if..else
        if (num > 0){
            System.out.println("El numero es POSITIVO");
        }
        else if (num < 0){
            System.out.println("El numero es NEGATIVO");
        }
        else {
            System.out.println("El numero es CERO");
        }








    }
}
