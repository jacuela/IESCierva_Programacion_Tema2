package _1secuencial;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double velocidad,tiempo;
        final double GRAVEDAD = 9.81;

        System.out.print("Dime el tiempo en segundos de caida libre:");
        tiempo = Double.parseDouble(teclado.nextLine());

        velocidad = tiempo * GRAVEDAD;

        System.out.println("Tiempo: " + tiempo + " segundos");
        System.out.println("Velocidad: " + velocidad + " m/s");





    }
}
