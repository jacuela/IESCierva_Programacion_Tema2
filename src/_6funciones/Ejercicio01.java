package _6funciones;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Dime un numero entero:");
            numero = Integer.parseInt(teclado.nextLine());
            if (numero!=0){
                if (esPar(numero)){
                    System.out.println("   -Par");
                }
                else{
                    System.out.println("   -Impar");
                }
            }

        }while(numero !=0);
    }

    public static boolean esPar(int num){
        boolean resultado;

        if (num%2 == 0 ){
            resultado = true;
            //return true;
        }
        else{
            resultado = false;
            //return false;
        }
        return resultado;
    }

}
