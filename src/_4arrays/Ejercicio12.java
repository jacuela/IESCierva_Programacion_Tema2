package _4arrays;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //DATOS DEL PROGRAMA  ===============================================
        String [] alumnos = {"Francisco","Marcos","Laura","Marta","Pedro"};
        double [] primerTrimestre =  {7,10,4,5,6};
        double [] segundoTrimestre = {4,10,10,5,5};
        double [] tercerTrimestre =  {1,10,8,2,3};
        //===================================================================

        double mediaAlumno,mediaGrupo=0,sumaParcialGrupo=0,mediaParcialGrupo=0;

//        double sumaPrimerTrim = 0;
//        double sumaSegundoTrim = 0;
//        double sumaTercerTrim = 0;
        int posicion;

        System.out.println("Listado de alumnos");
        System.out.println("================== ");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println((i+1)+". "+alumnos[i]);
        }
        System.out.println("");


        System.out.print("Seleccion un alumno: ");
        posicion = Integer.parseInt(teclado.nextLine());
        System.out.println("");
        //En realidad, el alumno esta la en posicion-1
        System.out.println("1ªeva    2ªeva    3ªeva");
        System.out.println("-----------------------");
        System.out.println(primerTrimestre[posicion-1]+"      "+segundoTrimestre[posicion-1]+"      "+tercerTrimestre[posicion-1]);

        System.out.println("");

        mediaAlumno = (primerTrimestre[posicion-1] + segundoTrimestre[posicion-1] + tercerTrimestre[posicion-1]) / 3;
        System.out.printf(">La media de %s es %.2f\n\n",alumnos[posicion-1],mediaAlumno);

        //Calculo la media del grupo entero.
        // FORMA1. Calcular las medias de todos los alumnos, sumarlas y dividirlas por el tamaño del grupo
        for (int i = 0; i < alumnos.length; i++) {
            mediaParcialGrupo = (primerTrimestre[i] + segundoTrimestre[i] + tercerTrimestre[i])/3;
            sumaParcialGrupo=sumaParcialGrupo+mediaParcialGrupo;
            //System.out.printf("media de %s:%.2f\n",alumnos[i],mediaParcialGrupo);
        }
        mediaGrupo = sumaParcialGrupo / alumnos.length;

        System.out.println(">La media del GRUPO es es "+mediaGrupo);

        //FORMA2. Otra forma de hacer la media del grupo. Sumo todas las notas y divido por 15
        double sumaTodasNotas=0;
        for (int i = 0; i < alumnos.length; i++) {
            sumaTodasNotas = sumaTodasNotas + primerTrimestre[i]+
                    segundoTrimestre[i]+tercerTrimestre[i];
        }
        System.out.println(">La media del GRUPO (forma2) es es "+(sumaTodasNotas/15));






    }
}
