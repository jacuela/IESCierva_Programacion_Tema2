package _2condicional;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ejercicio05 - calculo nota con trabajo");
        System.out.println("======================================");

        double examen1, examen2, examen3;
        String entregado;  //indica si he entregado o no el trabajo
        double notaEvaluacion;

        System.out.print("Nota del primer examen:");
        examen1=Double.parseDouble(teclado.nextLine()); //permitimos el . como decimal
        System.out.print("Nota del segundo examen:");
        examen2=Double.parseDouble(teclado.nextLine()); //permitimos el . como decimal
        System.out.print("Nota del tercer examen:");
        examen3=Double.parseDouble(teclado.nextLine()); //permitimos el . como decimal
        System.out.print("Has entregado el trabajo (S|N):");
        entregado = teclado.nextLine();

        //Cálculo de la nota de evaluación
        if (entregado.equals("S") || entregado.equals("s") ){
            //He entregado el trabajo. Calculo media
            notaEvaluacion=examen1*0.3+examen2*0.3+examen3*0.4;
        }
        else{
            //No he entregado el trabajo
            notaEvaluacion = 4;
        }

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
}
