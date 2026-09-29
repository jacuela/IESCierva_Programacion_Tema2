package _2condicional;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String usuarioSecreto = "root";
        String passSecreto = "toor";

        System.out.println("Ejercicio03 - login");
        System.out.println("=========================");

        String usuario, password;

        System.out.print("Dime el nombre:");
        usuario = teclado.nextLine();
        System.out.print("Dime el password:");
        password = teclado.nextLine();

        //OPCION1 - condicion doble
        if (usuario.equals(usuarioSecreto) && password.equals(passSecreto)){
            // usuario == "root" && password=="toor"
            System.out.println("OP1:Login correcto. Welcome.");
        }
        else{
            System.out.println("OP1:Error de login");
        }

        //OPCION2 - condicion doble
        if (usuario.equals(usuarioSecreto)){
            //Si entro, es pq el usuario esta correcto
            if (password.equals(passSecreto)){
                System.out.println("OP2:Login correcto. Welcome.");
            }
            else{
                System.out.println("OP2: Error de password");
            }
        }
        else{
            System.out.println("OP2: Error de usuario");
        }

        //OPCION 3 - usando booleanos
        boolean usuarioOK;
        boolean passOK;

        //Primero, compruebo el usuario
        if (usuario.equals(usuarioSecreto)){
            usuarioOK = true;
        }else{
            usuarioOK = false;
        }

        //Segundo, compruebo el password
        if (password.equals(passSecreto)){
            passOK = true;
        }else{
            passOK = false;
        }

        //Analizo las dos variables booleanas, buscandoc los
        //cuatro casos posibles
        if (usuarioOK && passOK){
            System.out.println("OP3: login correcto");
        }
        else if (usuarioOK && !passOK){
            System.out.println("OP3: Error. Password incorrecto");
        }
        else if (!usuarioOK && passOK){
            System.out.println("OP3: Error. Usuario incorrecto");
        }
        else{ //(usuarioOK == false && passOK == false)
            System.out.println("OP3: Error total. Pass y Usuario incorrecto");
        }









    }
}
