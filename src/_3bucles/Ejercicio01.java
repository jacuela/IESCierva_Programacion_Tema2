package _3bucles;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio01 - Tabla multiplicar");
        System.out.println("==============================");

        System.out.println("Dime un numero:");
        int num = Integer.parseInt(teclado.nextLine());

        for (int i=1;i<=10;i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }
        System.out.println("--------------------------");
        int i=1;
        while (i<=10){
            System.out.println(num+" x "+i+" = "+(num*i));
            i++;
        }


    }



}
