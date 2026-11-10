package _6funciones;

import java.time.Year;
import java.util.Scanner;

public class Ejercicio02 {
    public static boolean fechaCorrecta(int dia,
                                        int mes,
                                        int year){
        boolean diaCorrecto, mesCorrecto, yearCorrecto;

        //Analizamos el año
        if (year >=1500 && year <=2500){
            yearCorrecto = true;
        }
        else{
            yearCorrecto = false;
        }

        //Analizamos el mes
        if(mes>=1 && mes<=12){
            mesCorrecto = true;
        }
        else{
            mesCorrecto = false;
        }

        //Analizar el dia
        switch (mes){
            case 1,3,5,7,8,10,12:
                //Meses de 31 dias
                if (dia>=1 && dia<=31){
                    diaCorrecto = true;
                }
                else{
                    diaCorrecto = false;
                }
                break;
            case 4,6,9,11:
                //Meses de 30 dias
                if (dia>=1 && dia<=30){
                    diaCorrecto = true;
                }
                else{
                    diaCorrecto = false;
                }
                break;
            case 2:
                //Febrero. Depense si es o no bisiesto
                if (Year.of(year).isLeap()){
                    //Año bisiesto
                    if (dia>=1 && dia<=29){
                        diaCorrecto = true;
                    }
                    else{
                        diaCorrecto = false;
                    }
                }
                else{
                    //Año NO bisiesto
                    if (dia>=1 && dia<=28){
                        diaCorrecto = true;
                    }
                    else{
                        diaCorrecto = false;
                    }
                }
                break;
            default:
                diaCorrecto = false;

        }

        //Ahora, analizo los booleanos
        if (diaCorrecto &&
                mesCorrecto &&
                yearCorrecto){
            return true;
        }
        else{
            return false;
        }



    }//fin fechaCorrecta

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime una fecha (dd/mm/aaaa):");
        String fecha = teclado.nextLine();

        String[]partes = fecha.split("/");

        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int year = Integer.parseInt(partes[2]);

        if (fechaCorrecta(dia,mes,year)){
            System.out.println("-La fecha es correcta");
        }
        else{
            System.out.println("-La fecha es incorrecta");
        }



    }

}//fin class
