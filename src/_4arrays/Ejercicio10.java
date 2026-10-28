package _4arrays;

import com.sun.security.jgss.GSSUtil;

import java.time.Year;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio 10 - fecha correcta");
        System.out.println("con control de formato");
        System.out.println("===============================");

        boolean formatoFechaCorrecto; // = true;
        int dia=-1, mes=-1, year=-1;


        //===============================================
        //===== PARTE 1: Comprobar el formato de la fecha
        //===============================================
        do{
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

        //===============================================
        //===== PARTE 2: Comprobar que la fecha es correcta
        //===============================================

        System.out.printf("Dia:%d  Mes:%d  Año:%d\n",dia,mes,year);

        boolean fechaCorrecta = true;

        int [] diasMes={0,31,28,31,30,31,30,31,31,30,31,30,31};
        String [] mesesAño={"","enero","febrero","marzo","abril","mayo",
                "junio","julio","agosto","septiembre","octubre",
                "noviembre","diciembre"};

        //Antes de seguir, si el año es bisiesto, hago que febrero tenga
        //29 dias
        if (Year.isLeap(year)){
            diasMes[2]=29; //actualizamos tabla
        }

        if (year<1900 || year>3000){
            fechaCorrecta = false;
        }
        else if (mes<1 || mes>12){
            fechaCorrecta = false;
        }
        else if(dia<1 || dia>diasMes[mes]){
            fechaCorrecta = false;
        }

        //Parte final:  mostrar fecha
        if (fechaCorrecta){
            System.out.printf("El <%d de %s de %d> es CORRECTO\n",dia,mesesAño[mes],year);
        }
        else{
            System.out.println("ERROR: la fecha es incorrecta");
        }











    }
}
