package _2condicional;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int dia;

        System.out.println("Dime el dia de la semana:");
        dia=Integer.parseInt(teclado.nextLine());

        switch(dia){
            case 1,2,3:
                System.out.println("Hay PROGRAMACION");
                break;
            case 4,5,6,7:
                System.out.println("Hoy no hay. Que pena!!");
                break;
            default:
                System.out.println("ERROR: dia incorrecto");

        }









    }
}
