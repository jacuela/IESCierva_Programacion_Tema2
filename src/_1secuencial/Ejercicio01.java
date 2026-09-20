package _1secuencial;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double x;
        double y,z;
        double media;


        System.out.println("=====================");
        System.out.println("Ejercicio 01");
        System.out.println("=====================");


        System.out.print("Dime el primer valor:");
        x=Double.parseDouble(teclado.nextLine());

        System.out.print("Dime el segundo valor:");
        y=Double.parseDouble(teclado.nextLine());

        System.out.print("Dime el tercer valor:");
        z=Double.parseDouble(teclado.nextLine());


        media=(x+y+z)/3;

        System.out.println("La media es:"+media);

        System.out.printf("La media es:%.2f\n",media);
        System.out.println("");

    }
}
