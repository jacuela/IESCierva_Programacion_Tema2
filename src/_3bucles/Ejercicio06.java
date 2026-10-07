package _3bucles;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio06");
        System.out.println("===========");

        int numero;
        boolean hayNegativos=false;

        do {
            System.out.print("Introduce un numero:");
            numero=Integer.parseInt(teclado.nextLine());

            if (numero<0){
                hayNegativos=true;
            }
            else{                      //No se puede poner porque se
               hayNegativos=false;     //nos quedariamso con la ultima
            }                          //comparación

        } while(numero != 0);

        //Analizamos el testigo
        if (hayNegativos) {
            System.out.println("SI has introducido negativos");
        }else {
            System.out.println("NO has introducido negativos");
        }




    }

}
