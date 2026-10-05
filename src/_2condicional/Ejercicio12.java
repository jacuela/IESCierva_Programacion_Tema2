package _2condicional;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("      CALCULADORA");
        System.out.println("==========================");
        System.out.print("Dime el numero A: ");
        double numA=Double.parseDouble(teclado.nextLine());
        System.out.print("Dime el numero B: ");
        double numB=Double.parseDouble(teclado.nextLine());
        //Mostramos el menu de opciones
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Dime una opción: ");
        int opcion=Integer.parseInt(teclado.nextLine());

        switch (opcion){
            case 1:
                System.out.print("La suma es ");
                System.out.println(numA+numB);
                break;
            case 2:
                double resta=numA-numB;
                System.out.println("La resta es "+resta);
                break;
            case 3:
                double multiplica=numA*numB;
                System.out.println("La multiplicacion es "+multiplica);
                break;
            case 4:
                double divi=numA/numB;
                System.out.println("La division es "+divi);
                break;
            case 5:
                System.out.println("Saliendo.....");
                break;
            default:
                System.out.println("ERROR: opcion no válida");

        }




    }
}
