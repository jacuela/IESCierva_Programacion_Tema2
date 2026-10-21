package _4arrays;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio04 - marca de fin");
        System.out.println("========================");

        int[] lista=new int[5];
        System.out.println("Meter valores positivos. -1 para fin");
        System.out.println("Total valores a meter: 5");
        //Paso1 - relleno array
        for (int i = 0; i < lista.length; i++) {
            System.out.print("Dime numero (-1 para fin):");
            int num = Integer.parseInt(teclado.nextLine());
            lista[i]=num;

            //Si meto -1, lo meto y paro
            if (num == -1){
                break;
            }
        }

        //Paso2 - muestro valores
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]!=-1){
                System.out.print(lista[i]+"-");
            }
            else{
                break;
            }
        }






    }
}
