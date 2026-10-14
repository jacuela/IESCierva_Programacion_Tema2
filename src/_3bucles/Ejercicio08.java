package _3bucles;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        System.out.println("Ejercicio08");
        System.out.println("=================");

        Scanner teclado = new Scanner(System.in);

        int suma=0;
        int totalNum=0;
        int num; //numero por teclado
        do{
            System.out.print("Dime número:");
            num = Integer.parseInt(teclado.nextLine());
            if (num!=0){
                suma = suma + num;
                totalNum++;
            }

        }while(num!=0);

        System.out.println("Suma:"+suma+"y totalNum:"+totalNum);
        System.out.println();

        //==== CON UN WHILE ====
        //Me obliga a hacer una primera lectura fuera

        //Reseteo variables
        suma = 0;
        totalNum = 0;

        System.out.print("Dime número:");
        num = Integer.parseInt(teclado.nextLine());

        while(num!=0){
            suma = suma + num;
            totalNum++;

            System.out.print("Dime número:");
            num = Integer.parseInt(teclado.nextLine());

        }

        System.out.println("Suma total:"+suma);
        System.out.println("Total numeros:"+totalNum);

    }
}
