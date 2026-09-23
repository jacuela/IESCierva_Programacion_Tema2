package _1secuencial;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int a,b,aux;

        System.out.println("Intercambio de valores");
        System.out.println("----------------------------------------");

        System.out.print("valor de a:");
        a=Integer.parseInt(teclado.nextLine());

        System.out.print("valor de b:");
        b=Integer.parseInt(teclado.nextLine());

        aux=a;
        a=b;
        b=aux;

        System.out.println("El nuevo valor de a es: "+a);
        System.out.println("El nuevo valor de b es: "+b);





    }
}
