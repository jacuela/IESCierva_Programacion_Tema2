package _3bucles;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("MENU");
            System.out.println("========");
            System.out.println("1. Decir hola");
            System.out.println("2. Decir adios");
            System.out.println("3. Salir");

            do {
                System.out.print("Dime una opcion:");
                opcion = Integer.parseInt(teclado.nextLine());
//            if (opcion <1 || opcion >3 ){
//                System.out.println("   -opcion no valida");
//            }
            } while (opcion < 1 || opcion > 3);
            switch (opcion) {
                case 1:
                    System.out.println("Hola!");
                    break;
                case 2:
                    System.out.println("Adios");
                    break;
            }
            System.out.println();
        }while(opcion!=3);








    }
}
