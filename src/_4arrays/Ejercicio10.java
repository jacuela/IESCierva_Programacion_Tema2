package _4arrays;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio 10 - fecha correcta");
        System.out.println("con control de formato");
        System.out.println("===============================");

        boolean formatoFechaCorrecto; // = true;
        int dia=-1, mes=-1, year=-1;



        do{
            //===== PARTE 1: Comprobar el formato de la fecha
            formatoFechaCorrecto = true;  //reseteo variable
            System.out.print("Dime una fecha [dd/mm/aaaa]:");
            String fecha = teclado.nextLine();

            String[] camposFecha = fecha.split("/");
            //Tenemos que tener tres campos
            if (camposFecha.length !=3){
                formatoFechaCorrecto = false;
            }else if (camposFecha[0].length()!=2 ||
                    camposFecha[1].length()!=2   ||
                    camposFecha[2].length()!=4 ) {

                formatoFechaCorrecto = false;
            }else{
                //Compruebo que cada campo es un numero
                try {
                    dia = Integer.parseInt(camposFecha[0]);
                    mes = Integer.parseInt(camposFecha[1]);
                    year = Integer.parseInt(camposFecha[2]);
                }
                catch(Exception e){
                    formatoFechaCorrecto = false;
                    //System.out.println("Se ha produciudo EXCEPCION");
                    //System.out.println(e);

                }
            }

            if (!formatoFechaCorrecto){
                System.out.println("    >ERROR en el formato");
            }

        }while (!formatoFechaCorrecto);








        System.out.println("Formato fecha correcto:"+formatoFechaCorrecto);
        System.out.printf("Dia:%d  Mes:%d  Año:%d\n",dia,mes,year);











    }
}
