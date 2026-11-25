package _6funciones;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase = "frase inicial";
        String fraseResultado = "";
        boolean salir = false;
        int opcion = 0;

        do{
            System.out.println();
            System.out.println("=========================================");
            System.out.printf("Frase: %s\n",frase);
            System.out.printf("Resultado: %s\n",fraseResultado);
            System.out.println("=========================================");
            System.out.println("1. Introducir frase");
            System.out.println("2. Pasar a UpperCamelCase");
            System.out.println("3. Pasar a snake_case");
            System.out.println("4. Salir");
            do {
                System.out.print("Elige una opción: ");
                try {
                    opcion = Integer.parseInt(teclado.nextLine());
                    if (opcion<1 || opcion>4) {
                        System.out.println("  ERROR: introduce un numero válido");
                    }
                }catch (Exception e){
                    System.out.println("  ERROR: introduce un numero.");
                }

            }while(opcion<1 || opcion>4);

            switch (opcion){
                case 1:
                    //Meter nueva frase
                    System.out.print("Nueva frase: ");
                    frase = teclado.nextLine();
                    break;
                case 2:
                    fraseResultado = pasarUpperCamelCase(frase);
                    break;
                case 3:
                    fraseResultado = pasarSnakeCase(frase);
                    break;
                case 4:
                    salir = true;
            }
        }while (!salir);
    }//main

    public static String pasarUpperCamelCase(String cadena){
        //-----------------------------------
        //Algoritmo de pasar a UpperCamelCase
        //-----------------------------------
        String fraseResultado = "";
        //El primer caracter de la frase lo meto en mayusculas
        char primerCaracter = cadena.charAt(0);
        fraseResultado = fraseResultado + Character.toUpperCase(primerCaracter);
        //Parto del segundo caracter (evito excepción al acceder luego al "caracterAnterior")
        for (int i = 1; i < cadena.length(); i++) {
            char caracterActual = cadena.charAt(i);
            if (caracterActual != ' '){
                char caracterAnterior = cadena.charAt(i-1);
                if (caracterAnterior == ' '){
                    //El caracter anterior es espacio. Meto el actual en mayus
                    fraseResultado = fraseResultado + Character.toUpperCase(caracterActual);
                }
                else{
                    //El caracter anterior no es espacio. Metro el actual
                    fraseResultado = fraseResultado + caracterActual;
                }
            }
        }

        return fraseResultado;

    }//fin pasarUpperCamelCase

    public static String pasarSnakeCase(String cadena){
        //---------------------------------
        //Algoritmo de pasar a SnakeCase
        //---------------------------------
        String resultado = "";
        for (int i = 0; i < cadena.length(); i++){
            char caracterActual = cadena.charAt(i);
            if (caracterActual == ' '){
                resultado = resultado + '_';
            }
            else{
                resultado = resultado + caracterActual;
            }
        }

        return resultado;
    }


}
