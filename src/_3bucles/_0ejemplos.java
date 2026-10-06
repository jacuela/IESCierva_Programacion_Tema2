package _3bucles;

import java.util.Scanner;

public class _0ejemplos {
    public static void main(String[] args) {

        //Imprimir hola 5 veces
//        for(int i=0;i<5;i++){
//            System.out.println("Hola");
//        }

//        System.out.println("----------");
//        int i=0;
//        while(i<5){
//            System.out.println("Hola");
//            i++;
//        }
//        System.out.println("-------------");
//        //i=0;
//        do{
//            System.out.println("Hola");
//            i++;
//        }while(i<5);

        Scanner teclado = new Scanner(System.in);

        int num;

        do {
            System.out.println("Para para continuar:");
            num = Integer.parseInt(teclado.nextLine());

            if (num == 666){
                break;
            }

        }while(true);








    }
}
