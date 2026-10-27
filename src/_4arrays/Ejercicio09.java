package _4arrays;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio09 - split");
        System.out.println("======================");

        //PARTE A - palabras
//        String frase;
//        do{
//            System.out.println("Dime una frase [INTRO fin]:");
//            frase = teclado.nextLine();
//            if (!frase.isEmpty()) {
//                String[] palabras = frase.split(" ");
//                System.out.println("Num palabras:" + palabras.length);
//                for (int i = 0; i < palabras.length; i++) {
//                    System.out.println("   -" + palabras[i]);
//                }
//            }
//        }while(!frase.isEmpty()); //frase.equals("")

        //PARTE B - fecha
        System.out.print("Dime una fecha [dd/mm/aaaa]:");
        String fecha=teclado.nextLine();

        String[] unaFecha=fecha.split("/");

        System.out.println("\nFecha obtenida");
        System.out.println("----------------");
        System.out.println("Dia: "+unaFecha[0]);
        System.out.println("Mes: "+unaFecha[1]);
        System.out.println("Año: "+unaFecha[2]);





    }
}
