package _6funciones;

import java.time.Year;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Programa principal
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime una fecha (dd/mm/aaaa):");
        String fecha = teclado.nextLine();

        int salida = fechaCorrecta(fecha);
        if (salida == 2){
            System.out.println("ERROR: valores incorrectos");
        }
        else if (salida==1){
            System.out.println("ERROR: formato incorrecto");
        }
        else{
            imprimirFechaLarga(fecha);
        }

    } //fin main


    /**
     * Función para imprimir la fecha en formato "23 de enero del 2000"
     * No comprueba errores. No devuelve nada.
     * @param fecha
     */
    public static void imprimirFechaLarga(String fecha){
        String [] mesesAño={"","enero","febrero","marzo","abril","mayo",
                "junio","julio","agosto","septiembre","octubre",
                "noviembre","diciembre"};

        //Necesito ahora sacar los tres campos.
        String[] camposFecha = fecha.split("/");
        int dia = Integer.parseInt(camposFecha[0]);
        int mes = Integer.parseInt(camposFecha[1]);
        int year = Integer.parseInt(camposFecha[2]);

        System.out.printf("%d de %s del %d",dia,mesesAño[mes],year);

    }// fin imprimirFechaLarga

    //JAVADOC
    //Función que pide una fecha y comprueba que esta
    //en formato dd/mm/aaaa. Es decir, hay que usar 2
    //digitos para el dia y el mes y 4 para el año.
    //ENTRADA: una cadena con la fecha
    //DEVUELVE: true si es correcta en formato
    public static boolean formatoFechaCorrecto(String fecha){
            boolean formatoFechaCorrecto = true;  //reseteo variable

            //fecha = null; //para ver la pila de llamadas

            String[] camposFecha = fecha.split("/");

            if (camposFecha.length !=3){
                //Tenemos que tener tres campos
                formatoFechaCorrecto = false;
            }else if (camposFecha[0].length()!=2 ||
                    camposFecha[1].length()!=2   ||
                    camposFecha[2].length()!=4 ) {

                formatoFechaCorrecto = false;
            }

        return formatoFechaCorrecto;

    }


    /**
     * Función para indicar si una fecha es correcta, tanto en formato dd/mm/aaaa
     * como en valores.
     * @param fecha en formato dd/mm/aaaa
     * @return devuelve 0 si es correcta, 1 si tiene error de formato, 2 si error de valores
     */
    public static int fechaCorrecta(String fecha){
        boolean fechaCorrecta = true;

        //1º - compruebo el formato
        fechaCorrecta = formatoFechaCorrecto(fecha);

        if (!fechaCorrecta){
            return 1;
        }

        //2º - compruebo valores
        //Necesito ahora sacar los tres campos.
        String[] camposFecha = fecha.split("/");
        int dia = Integer.parseInt(camposFecha[0]);
        int mes = Integer.parseInt(camposFecha[1]);
        int year = Integer.parseInt(camposFecha[2]);

        int [] diasMes={0,31,28,31,30,31,30,31,31,30,31,30,31};


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

        if (!fechaCorrecta){
            return 2;
        }

        //Si llego hasta aquí, es porque la fecha tiene un formato correcto
        //y los valores son correctos.
        return 0;
    }//fin fechaCorrecta










}//fin class
