package _2condicional;

import java.time.Year;

public class Ejercicio07 {
    public static void main(String[] args) {


        System.out.println("AÑO BISIESTO");
        System.out.println("=================");

//Dos posibles opciones:
//A- Es divisible entre 4 y no es divisible entre 100.
//B- Es divisible entre 100 y 400.

//FUUUUUUSION
// (year%4==0 && !(year%100==0))||(year%100==0 && year%400==0)

        int year = 2027;
        //opcion A
        if (year%4==0 && !(year%100==0)){
            System.out.println("El año "+year+" SÍ es bisiesto");
        }
        //opcionB
        else if(year%100==0 && year%400==0){
            System.out.println("El año "+year+" SÍ es bisiesto");
        }
        else{
            System.out.println("El año "+year+" NO es bisiesto");
        }


        //Usando una funcion
        if (Year.of(year).isLeap()){
            System.out.println("El año "+year+" SI es bisiesto");
        }
        else{
            System.out.println("El año "+year+" NO es bisiesto");
        }





    }
}
