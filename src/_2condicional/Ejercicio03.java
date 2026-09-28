package _2condicional;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ejercicio03 - login");
        System.out.println("=========================");

        String usuario, password;

        System.out.print("Dime el nombre:");
        usuario = teclado.nextLine();
        System.out.print("Dime el password:");
        password = teclado.nextLine();

        //OPCION1 - condicion doble
        if (usuario.equals("root") && password.equals("toor")){
            // usuario == "root" && password=="toor"
            System.out.println("OP1:Login correcto. Welcome.");
        }
        else{
            System.out.println("OP1:Error de login");
        }














    }
}
