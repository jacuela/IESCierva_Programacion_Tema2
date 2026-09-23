package _1secuencial;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double parcial1;
        double parcial2;
        double parcial3;
        double examen;
        double trabajo;
        double notaFinal;

        int porcentParciales=55; //55% los parciales
        int porcentExamen=30;
        int porcentTrabajo=15;



        System.out.println("EJERCICIO 6 - NOTA FINAL ALUMNO");
        System.out.println("-------------------------------");

        System.out.print("Nota parcial1:");
        parcial1=Double.parseDouble(teclado.nextLine());

        System.out.print("Nota parcial2:");
        parcial2=Double.parseDouble(teclado.nextLine());

        System.out.print("Nota parcial3:");
        parcial3=Double.parseDouble(teclado.nextLine());

        //Calculo la media de los tres parciales
        double mediaParciales=(parcial1+parcial2+parcial3)/3;

        System.out.print("Calificación del examen final:");
        examen=Double.parseDouble(teclado.nextLine());

        System.out.print("Claficación del trabajo final:");
        trabajo=Double.parseDouble(teclado.nextLine());


        //Una vez que tengo todos los datos de teclado, calculo la
        //nota final
        notaFinal=mediaParciales*porcentParciales/100+examen*porcentExamen/100+trabajo*porcentTrabajo/100;
        System.out.println("La nota final es de " +notaFinal);


        //int notaRedondeada=(int)notaFinal;
        System.out.println("Nota redondeada: "+Math.round(notaFinal));


    }
}
