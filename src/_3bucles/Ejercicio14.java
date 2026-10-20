package _3bucles;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio14 - divisores");
        System.out.println("=======================");

        int num;

        do {
            System.out.print("Dime un número(0 para salir):");
            num = Integer.parseInt(teclado.nextLine());

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.printf(" >El numero %d es divisor de %d\n", i, num);
                }

            }
            System.out.println();
        }while(num!=0);











    }
}
