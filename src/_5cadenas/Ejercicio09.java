package _5cadenas;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String frase = "Alicia tiene 35 años";

        int contadorEspacios = 0;
        String palabra="";
        int posicion = 0;
        boolean guardarPalabra = false;

        System.out.println("FRASE:"+frase);

        do{
            //Reseteo contadores
            palabra = "";
            contadorEspacios = 0;
            posicion = -1;
            do{
                System.out.print("Palabra en posición: ");
                try {
                    posicion = Integer.parseInt(teclado.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("ERROR: indica un número");
                }

            }while(posicion==-1);

            for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i)==' '){ //Cuento espacios para saber en la palabra que estoy
                    contadorEspacios++;
                }
                if (frase.charAt(i)!=' ' &&
                        contadorEspacios==(posicion-1)){ //estoy en la palabra que busco
                    //Acumula letra a letra
                    palabra = palabra + frase.charAt(i);
                }
            }
            if (palabra.length()!=0 && posicion!=0){
                System.out.println("  --->"+palabra);
            }else if(posicion!=0){
                System.out.println("  Posición demasiado grande. No hay palabras.");
            }

        }while(posicion != 0);

    }
}
