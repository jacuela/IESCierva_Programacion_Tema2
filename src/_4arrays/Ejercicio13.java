package _4arrays;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        System.out.println("Ejercicio13 - nombres y edades");
        System.out.println("==============================");

        Scanner teclado = new Scanner(System.in);

        String [] nombres; // = new String[5];
        int [] edades; // = new int[5];

        System.out.println("¿Cuantas personas máximo quieres guardar?");
        int maxPersonas = Integer.parseInt(teclado.nextLine());

        nombres = new String[maxPersonas];
        edades = new int[maxPersonas];

        System.out.println();
        System.out.println("Dame nombres y edades. " +
                "Máximo de "+maxPersonas+" personas. ");
        System.out.println("Si quieres finalizar antes, introduce *");

        for (int i = 0; i < nombres.length ; i++) {
            System.out.print("Nombre: ");
            String nombre = teclado.nextLine();
            nombres[i] = nombre;

            if (!nombre.equals("*")){
                System.out.print("Edad:");
                int edad = Integer.parseInt(teclado.nextLine());
                edades[i] = edad;
            }else{
                edades[i] = -1;
                break;
            }

        }

        //DEPURACION: Imprimir todos los nombres y edades
//        for (int i = 0; i < nombres.length; i++) {
//            System.out.println(nombres[i]+"----"+edades[i]);
//        }

        //PARTE2 - mostrar nombres del mayor y el menor

        int posMax = 0;
        int posMin = 0;
        int maxedad=edades[0];
        int minedad=edades[0];

        //Recorro con while porque no se cuantos pasos voy a dar
        int i=0;
        while(i<edades.length && edades[i]!=-1){

            if (maxedad<edades[i]){ //Sacar el máximo
                maxedad = edades[i];
                posMax = i;
            }
            if (minedad>edades[i]){ //Sacar el mínimo
                minedad = edades[i];
                posMin = i;
            }
            i++;
        }

        //Muestro datos
        System.out.println("-----------------------------------");
        System.out.printf("Mayor: %s (%d años)\n",nombres[posMax],maxedad);
        System.out.printf("Menor: %s (%d años)\n",nombres[posMin],minedad);

















    }
}
