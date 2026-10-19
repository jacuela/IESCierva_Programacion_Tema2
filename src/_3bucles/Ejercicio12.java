package _3bucles;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        System.out.println("Ejer12 - Adivinar numero");
        System.out.println("========================");

        Scanner teclado = new Scanner(System.in);

        //Genero numero aleatorio entre 1 y 50
        // int secreto = (int)(Math.random()*50)+1;
        Random random = new Random();
        int secreto = random.nextInt(1, 51);

        int intentos = 0;
        boolean acertado = false;

        do{
            System.out.print("Adivina numero (entre 1 y 50):");
            int num = Integer.parseInt(teclado.nextLine());
            intentos++;

            if(num < secreto){
                System.out.println(" >Numero secreto es MAYOR");
            }
            else if (num > secreto){
                System.out.println(" >Numero secreto es MENOR");
            }
            else {  //if (num == secreto)
                acertado = true;
            }

        }while (!acertado);

        System.out.printf("\nNumero secreto [%d] encontrado\n",secreto);
        System.out.println("Intentos: "+intentos);


    }
}
