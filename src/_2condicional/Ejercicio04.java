package _2condicional;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ejercicio04 - calculo nota");
        System.out.println("==========================");

        double examen1, examen2, examen3;
        double notaEvaluacion;

        boolean notasOK;   //=true;


        System.out.print("Nota del primer examen:");
        examen1=Double.parseDouble(teclado.nextLine()); //permitimos el . como decimal
        System.out.print("Nota del segundo examen:");
        examen2=Double.parseDouble(teclado.nextLine()); //permitimos el . como decimal
        System.out.print("Nota del tercer examen:");
        examen3=Double.parseDouble(teclado.nextLine()); //permitimos el . como decimal

        //Compruebo que todas las notas son correctas
        if (examen1 >= 0 && examen1 <=10 &&
            examen2 >= 0 && examen2 <=10 &&
            examen3 >= 0 && examen3 <=10 ){
            notasOK = true;
        }
        else{
            notasOK = false;
        }


        if (notasOK == true){
            //Calculo de la nota(media ponderada)
            notaEvaluacion=examen1*0.3+examen2*0.3+examen3*0.4;

            System.out.println("---------------------------------------");
            System.out.printf("La nota de la evaluación es:%.2f\n",notaEvaluacion);

            //Mostrar la calificación
            if (notaEvaluacion<5){
                System.out.println("SUSPENSO");
            }
            else if(notaEvaluacion>=5 && notaEvaluacion<6){
                System.out.println("SUFICIENTE");
            }
            else if(notaEvaluacion>=6 && notaEvaluacion<7){
                System.out.println("BIEN");
            }
            else if(notaEvaluacion>=7 && notaEvaluacion<9){
                System.out.println("NOTABLE");
            }
            else if(notaEvaluacion>=9 && notaEvaluacion<10){
                System.out.println("SOBRESALIENTE");
            }
            else {
                System.out.println("MATRICULA DE HONOR");
            }

        }
        else{
            System.out.println("ERROR: Has introducido alguna nota no permitida.");
        }








    }
}
