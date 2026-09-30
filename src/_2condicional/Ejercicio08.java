package _2condicional;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ejercicio08 - Switch");
        System.out.println("====================");

        int diaSemana;

        System.out.print("Dime el dia de la semana:");
        diaSemana = Integer.parseInt(teclado.nextLine());

        switch (diaSemana){
            case 1:
                System.out.println("Hoy es LUNES");
                break;
            case 2:
                System.out.println("Hoy es MARTES");
                break;
            case 3:
                System.out.println("Hoy es MIERCOLES");
                break;
            case 4:
                System.out.println("Hoy es JUEVES");
                break;
            case 5:
                System.out.println("Hoy es VIERNES");
                break;
            case 6:
                System.out.println("Hoy es SABADO");
                break;
            case 7:
                System.out.println("Hoy es DOMINGO");
                break;
            default:
                System.out.println("ERROR: dia incorrecto");
        }




    }

}
