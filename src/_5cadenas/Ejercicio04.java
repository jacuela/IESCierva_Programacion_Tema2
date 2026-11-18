package _5cadenas;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String email; // = "ana@gmail.com";

        do{
            System.out.println("Dime un email: ");
            email = teclado.nextLine();

            if (!email.isEmpty()){
                int posi_arroba=email.indexOf("@");
                String nombre = email.substring(0,posi_arroba);
                String dominio = email.substring(posi_arroba+1);
                System.out.println("  usuario:"+nombre);
                System.out.println("  dominio:"+dominio);
            }
        }while(!email.isEmpty());




    }
}
