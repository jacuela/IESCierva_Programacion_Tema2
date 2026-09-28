package _2condicional;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio1 - par/impar");
        System.out.println("======================");

        int numero;

        System.out.print("Dime un numero:");
        numero = Integer.parseInt(teclado.nextLine());

        if (numero % 2 == 0){
            System.out.println("El numero "+numero+" es par.");
        }
        else{
            System.out.println("El numero "+numero+" es impar.");
        }

        //ALTERNATIVA CON BOOLEANO
        boolean esPar;
        System.out.print("(Con booleano)Dime un numero:");
        numero = Integer.parseInt(teclado.nextLine());

        //Primero relleno la variable booleana
        if (numero%2==0){
            esPar = true;
        }
        else{
            esPar = false;
        }

        //Segun el booleano, muestro uno u otro mensaje
        if (esPar==true){  //(esPar)
            System.out.println("El numero "+numero+" es par.");
        }
        else{
            System.out.println("El numero "+numero+" es impar.");
        }






    }
}
