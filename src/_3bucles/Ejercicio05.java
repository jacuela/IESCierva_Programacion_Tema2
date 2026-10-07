package _3bucles;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        char caracter;

        do {
            //Leemos un caracter por teclado    
            System.out.print("Introduce un caracter:");
            caracter=teclado.nextLine().charAt(0);

            //Tratamiento del caracter vocal
            if (caracter == 'a' ||
                    caracter == 'e' || caracter == 'i' || caracter == 'o' ||
                    caracter == 'u' ){
                System.out.println("......es vocal");
            }
            //Tratamiento del caracter espacio en blanco
            else if (caracter == ' '){
                System.out.println("FIN");
            }
            //Tratamiento del resto
            else
                System.out.println("........es no vocal");

        } while(caracter != ' ');

    }
}
