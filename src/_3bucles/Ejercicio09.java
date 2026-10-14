package _3bucles;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {

        System.out.println("Ejercicio09 - caja fuerte");
        System.out.println("========================");

        Scanner teclado = new Scanner(System.in);

        String secreto="0555";
        boolean acertado = false;

        //PARTE1 - sin la mejora
//        do{
//            System.out.print("Dime la clave:");
//            String clave = teclado.nextLine();
//
//            //Comprobar tam correcto de la clave
//            if (clave.length()!=4){
//                System.out.println("ERROR: tamaño de clave erróneo");
//            }
//            else if (clave.equals(secreto)){
//                acertado = true;
//                System.out.println("Caja abierta");
//            }
//        }while(!acertado);

        //PARTE2 - con la mejora

        int intentos = 0;  //Maximo 3 intentos

        do{
            System.out.print("Dime la clave:");
            String clave = teclado.nextLine();
            intentos++;

            //Comprobar tam correcto de la clave
            if (clave.length()!=4){
                System.out.println("ERROR: tamaño de clave erróneo");
            }
            else if (clave.equals(secreto)){
                acertado = true;
                System.out.println("Caja abierta");
            }
            else if (intentos==3){
                System.out.println("Caja bloqueada");
            }
        }while(!acertado && intentos<3);





    }

}
