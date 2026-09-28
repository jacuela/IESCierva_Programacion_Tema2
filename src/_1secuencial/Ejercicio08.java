package _1secuencial;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("        INVERTIR NUMERO DE DOS CIFRAS");
        System.out.println("--------------------------------------------");
        System.out.print("Introduce un numero entero:");
        int numero = Integer.parseInt(teclado.nextLine());

        int unidades = numero%10;  //calculo el módulo
        int decenas = numero/10;  //división entera

        //Invierto el número
        int numeroInvertido = unidades*10+decenas;
        System.out.println("El número invertido es:"+numeroInvertido);




    }





}
