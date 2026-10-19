package _3bucles;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio11");
        System.out.println("==================");

        int totalAfortunados = 0;
        int totalNoAfortunados = 0;

        System.out.print("Dime una numero:");
        String numero = teclado.nextLine();

        for(int i=0;i<numero.length();i++){
            char carac = numero.charAt(i);
            if (carac=='2' || carac=='5'|| carac=='8'){
                totalAfortunados++;
            }
            else{
                totalNoAfortunados++;
            }
        }

        //Queda analizar contador
        if (totalAfortunados > totalNoAfortunados) {
            System.out.printf("El numero %s es AFORTUNADO",numero);
        }
        else{
            System.out.printf("El numero %s es NO AFORTUNADO",numero);

        }






    }
}
