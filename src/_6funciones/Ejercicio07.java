package _6funciones;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra;
        System.out.println("Ejercicio07 - palindromo");
        System.out.println("========================");
        do{
            System.out.print("Dime una palabra:");
            palabra = teclado.nextLine();
            if (!palabra.equals("")){
                if (esPalindromo(palabra)){
                    System.out.printf("La palabra '%s' SI es palindromo\n",palabra);
                }else{
                    System.out.printf("La palabra '%s' NO es palindromo\n",palabra);
                }
            }
        }while (!palabra.equals(""));

    }

    public static boolean esPalindromo(String palabra){
        String invertida = invertirPalabra(palabra);
        //Comparo ambas palabras. No puedo hacer palabra1==palabra2

        return invertida.equals(palabra);

        //Otra forma - larga y demasiado tonta
//        if (invertida.equals(palabra)){
//            return true;
//        }
//        else{
//            return false;
//        }

        //Otra forma - operador ternario
//        boolean iguales = invertida.equals(palabra) ? true : false;
//        return iguales;

    }

    public static String invertirPalabra(String palabra){
        String invertida = "";

        for (int i = palabra.length()-1; i >= 0; i--) {
            invertida = invertida + palabra.charAt(i);
        }
        //System.out.println(invertida);
        return invertida;
    }
}
