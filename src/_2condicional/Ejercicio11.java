package _2condicional;

import java.time.Year;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio11");
        System.out.println("=================");

        int dia, mes, year;

        boolean diaCorrecto, mesCorrecto, yearCorrecto;

        //Pido los datos de entrada
        System.out.print("Dime el dia:");
        dia = Integer.parseInt(teclado.nextLine());
        System.out.print("Dime el mes:");
        mes = Integer.parseInt(teclado.nextLine());
        System.out.print("Dime el año:");
        year = Integer.parseInt(teclado.nextLine());

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

            System.out.println("La fecha es correcta");
        }
        else{
            System.out.println("La fecha es incorrecta");
        }





    }
}
