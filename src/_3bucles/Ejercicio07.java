package _3bucles;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        System.out.println("Ejercicio7 - acumuladores");
        System.out.println("=========================");

        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero N:");
        int num=Integer.parseInt(teclado.nextLine());

        int suma=0;
        for (int i = 1; i <= num; i++) {
            suma=suma+i;
            //System.out.println("valor de suma"+suma);
        }
        System.out.println("La suma de los "+num+" primeros num. es:"+suma);


        int factorial=1;
        for (int i = 1; i <= num; i++) {
            factorial=factorial*i;
        }
        System.out.println("El factorial de "+num+" es:"+factorial);


    }
}
