package _2condicional;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombre, apellido1, apellido2;
        char inicialN1, inicialN2, inicialA1, inicialA2;

        System.out.println("Ejercicio13 - Iniciales");
        System.out.println("=======================");

        System.out.print("Dime en nombre:");
        nombre = teclado.nextLine();
        System.out.print("Dime el primer apellido:");
        apellido1 = teclado.nextLine();
        System.out.print("Dime el segundo apellido:");
        apellido2 = teclado.nextLine();

        int posicionBlanco;
        posicionBlanco = nombre.indexOf(' ');

        //Analizo la variable para saber si hay o no espacio
        if (posicionBlanco != -1){
            //El nombre es compuesto
            inicialN1 = nombre.charAt(0);
            inicialN2 = nombre.charAt(posicionBlanco+1);
            inicialA1 = apellido1.charAt(0);
            inicialA2 = apellido2.charAt(0);
            System.out.println("INICIALES: "+inicialN1+
                    inicialN2+inicialA1+inicialA2);

        }else{
            //El nombre es simple
            inicialN1 = nombre.charAt(0);
            inicialA1 = apellido1.charAt(0);
            inicialA2 = apellido2.charAt(0);
            System.out.println("INICIALES: "+inicialN1+
                    inicialA1+inicialA2);
        }




    }
}
