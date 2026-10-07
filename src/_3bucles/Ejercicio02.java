package _3bucles;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio 02");
        System.out.println("============");

        System.out.print("Dime cuantos números:");
        int totalNumeros = Integer.parseInt(teclado.nextLine());

        int contadorPosi=0, contadorNega=0, contadorCero=0;

        for (int i=0;i<totalNumeros;i++){
            System.out.print("Dime un numero:");
            int num = Integer.parseInt(teclado.nextLine());
            //Analizamos num
            if (num>0){
                contadorPosi++;
            }
            else if (num<0){
                contadorNega++;
            }
            else{
                contadorCero++;
            }
        }
        System.out.println("Total positivos:"+contadorPosi);
        System.out.println("Total negativos:"+contadorNega);
        System.out.println("Total ceros:"+contadorCero);











    }
}
