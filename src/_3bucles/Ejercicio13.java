package _3bucles;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        System.out.println("Ejercicio13 - email correcto");
        System.out.println("============================");

        Scanner teclado = new Scanner(System.in);

        //--------------------------------------
        // Un email será valido si tiene el carcacer @
        // y si contiene tambien el caracter .
        // Además, la posición de la @ tiene que ser
        // anterior al .
        //--------------------------------------

        boolean existe_arroba=false;
        boolean existe_punto=false;
        int posicion_punto=0;   //mejor iniciar a -1??
        int posicion_arroba=0;  //mejor iniciar a -1???
        String email;

        do{
            //Leo email por teclado
            System.out.print("email (INTRO para fin):");
            email = teclado.nextLine();

            for (int i = 0; i < email.length(); i++) {
                char caracter = email.charAt(i); //leo letra actual

                if (caracter == '@'){
                    existe_arroba = true;
                    posicion_arroba = i;
                }
                else if (caracter == '.'){
                    existe_punto = true;
                    posicion_punto = i;
                }
            }

            //Analizo booleanos y posiciones
            if (email.equals("")){
                //Si es vacio, no hagp nada
                System.out.println();
            }
            else if (existe_arroba &&
                existe_punto &&
                posicion_arroba<posicion_punto){
                System.out.println("  >Email VALIDO :)");
            }
            else{
                System.out.println("  >Email NO VALIDO :(");
            }

            //Reseteo booleanos y contadores
            existe_arroba=false;
            existe_punto=false;
            posicion_punto=0;
            posicion_arroba=0;

        }while(!email.equals(""));

    }
}
