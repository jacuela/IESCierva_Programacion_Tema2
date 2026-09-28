package _1secuencial;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("    MOSTRAR LAS INICIALES");
        System.out.println("-----------------------------");

        String nombre, apellido1,apellido2;

        System.out.print("Dime el nombre:");
        nombre = teclado.nextLine();
        System.out.print("Dime el apellido1:");
        apellido1 = teclado.nextLine();
        System.out.print("Dime el apellido2:");
        apellido2 = teclado.nextLine();

        char inicialN = nombre.charAt(0); //caracter en la posicion 0
        char inicialA1 = apellido1.charAt(0);
        char inicialA2 = apellido2.charAt(0);

        //Paso los char a mayúsculas
        inicialN = Character.toUpperCase(inicialN);
        inicialA1 = Character.toUpperCase(inicialA1);
        inicialA2 = Character.toUpperCase(inicialA2);

        System.out.println("Tus iniciales son:"+inicialN+inicialA1+inicialA2);









    }

}
