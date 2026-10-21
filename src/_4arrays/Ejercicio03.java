package _4arrays;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        System.out.println("Ejercicio03 - notas");
        System.out.println("========================");

        Scanner teclado = new Scanner(System.in);

        double notas[] = new double[5];
        double max, min, media;

        double suma,nota;

        //Paso1 - rellenar el array
        for (int i = 0; i < notas.length; i++) {
            do{
                System.out.print("Introduce la nota "+(i+1)+": ");
                nota = Double.parseDouble(teclado.nextLine());
            }while(nota < 0 || nota>10);

            notas[i] = nota;
        }

        //Paso2 - calcular la max, min, suma
        max = notas[0];
        min = notas[0];
        suma = 0;
        for (int i = 0; i < notas.length; i++) {
            //Para sacar la maxima nota
            if (notas[i]>max){
                max = notas[i];
            }
            //Para sacar el minimo
            if (notas[i]<min){
                min = notas[i];
            }
            //Sumo notas
            suma = suma + notas[i];
        }
        //Saco la media
        media = suma / notas.length;

        //Mostrar datos
        System.out.printf("Max: %.1f   ",max);
        System.out.printf("Min: %.1f   ",min);
        System.out.printf("Media: %.1f\n",media);







    }
}
