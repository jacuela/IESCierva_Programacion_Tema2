package _5cadenas;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        String frase,fraseCifrada="";
        int caracter;

        System.out.println("MAQUINA DE CIFRADO");
        System.out.println("==================");


        System.out.print("Frase en claro-->");
        frase=teclado.nextLine();


        for (int i = 0; i < frase.length(); i++) {

            caracter=frase.charAt(i)+1;

            fraseCifrada=fraseCifrada+Character.toString(caracter);

        }
        System.out.println("\n. . . cifrando . . .\n");

        //OPCIONAL. Espero 1 segundo para que parezca que esta cifrando
        try {
            Thread.sleep (1000);
        } catch (InterruptedException ex) {
            ex.getMessage();
        }
        //FIN OPCIONAL

        System.out.println("Frase cifrada-->"+fraseCifrada);



        System.out.println("\n\n");
        System.out.println("MAQUINA DE DESCIFRADO");
        System.out.println("=====================");
        System.out.println("Copia y pega con el ratón la frase a descifrar...");


        frase="";
        System.out.print("\nFrase cifrada-->");
        fraseCifrada=teclado.nextLine();


        for (int i = 0; i < fraseCifrada.length(); i++) {

            caracter=fraseCifrada.charAt(i)-1;

            frase=frase+Character.toString(caracter);

        }

        System.out.println("\n. . . descifrando . . .\n");

        //OPCIONAL. Espero 1 segundo para que parezca que esta cifrando
        try {
            Thread.sleep (1000);
        } catch (InterruptedException ex) {
            ex.getMessage();
        }
        //FIN OPCIONAL


        System.out.println("Frase en claro-->"+frase);

        System.out.println();System.out.println();


    }
}
