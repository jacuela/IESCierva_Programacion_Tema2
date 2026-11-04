package _2condicional;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean esMayorEdad;
        String mensaje;

        try{
            System.out.print("Indica la edad (INTRO fin):");
            int edad = Integer.parseInt(teclado.nextLine());

            esMayorEdad = (edad>=18)?true:false;
            mensaje = esMayorEdad ? "Sí" : "No";
            System.out.println("Mayor de edad: "+mensaje);
        }catch (Exception ex){
            //System.out.println(ex);
            System.out.println("FIN");
        }



    }
}
