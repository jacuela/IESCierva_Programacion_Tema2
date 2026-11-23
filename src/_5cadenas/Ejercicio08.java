package _5cadenas;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {

          Scanner teclado = new Scanner(System.in);
          String frase = "frase inicial";
          String fraseResultado = "";
          boolean salir = false;
          int opcion;

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
                  opcion = Integer.parseInt(teclado.nextLine());
              }while(opcion<1 || opcion>4);

              switch (opcion){
                  case 1:
                      //Meter nueva frase
                      System.out.print("Nueva frase: ");
                      frase = teclado.nextLine();
                      break;
                  case 2:
                      //-----------------------------------
                      //Algoritmo de pasar a UpperCamelCase
                      //-----------------------------------
                      fraseResultado = "";
                      //El primer caracter de la frase lo meto en mayusculas
                      char primerCaracter = frase.charAt(0);
                      fraseResultado = fraseResultado + Character.toUpperCase(primerCaracter);
                      //Parto del segundo caracter (evito excepción al acceder luego al "caracterAnterior")
                      for (int i = 1; i < frase.length(); i++) {
                          char caracterActual = frase.charAt(i);
                          if (caracterActual != ' '){
                              char caracterAnterior = frase.charAt(i-1);
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
                      break;
                  case 3:
                      //---------------------------------
                      //Algoritmo de pasar a SnakeCase
                      //---------------------------------
                      fraseResultado = "";
                      for (int i = 0; i < frase.length(); i++) {
                          char caracterActual = frase.charAt(i);
                          if (caracterActual == ' '){
                              fraseResultado = fraseResultado + '_';
                          }
                          else{
                              fraseResultado = fraseResultado + caracterActual;
                          }
                      }
                      break;
                  case 4:
                      salir = true;

              }

          }while (!salir);











    }
}
