package _3bucles;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        System.out.println("Ejer12 - Adivinar numero");
        System.out.println("========================");

        Scanner teclado = new Scanner(System.in);


        int secreto = (int)(Math.random()*50)+1;
        int intentos = 0;
        boolean acertado = false;

        do{
            System.out.print("Adivina numero (entre 1 y 50):");
            int num = Integer.parseInt(teclado.nextLine());
            intentos++;

            if (num == secreto){
                acertado = true;
            }
            else if(num < secreto){
                System.out.println(" >Numero secreto es MAYOR");
            }
            else if (num > secreto){
                System.out.println(" >Numero secreto es MENOR");
            }
        }while (!acertado);

        System.out.printf("\nNumero secreto [%d] encontrado\n",secreto);
        System.out.println("Intentos: "+intentos);


    }
}
