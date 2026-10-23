package _1secuencial;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        int mon1e,mon2e,mon50c,mon20c,mon10c;

        int euros;
        int centimos;

        System.out.print("Monedas de 1€: ");
        mon1e=Integer.parseInt(teclado.nextLine());
        System.out.print("Monedas de 2€: ");
        mon2e=Integer.parseInt(teclado.nextLine());
        System.out.print("Monedas de 50centimos: ");
        mon50c=Integer.parseInt(teclado.nextLine());
        System.out.print("Monedas de 20centimos: ");
        mon20c=Integer.parseInt(teclado.nextLine());
        System.out.print("Monedas de 10centimos: ");
        mon10c=Integer.parseInt(teclado.nextLine());

        euros=(mon1e*1)+(mon2e*2);
        centimos=(mon50c*50)+(mon20c*20)+(mon10c*10);

        System.out.println("----------totales-------------");
        System.out.println("Euros: "+euros+"€");
        System.out.println("Centimos: "+centimos+"cen");
        System.out.println("------------------------------");

        //A los euros, le sumo los euros extra de los centimos
        int eurosExtra=centimos/100;
        int eurosTotales=euros+eurosExtra;

        //Calculo el resto de centimos
        int centimosResto=centimos%100;

        System.out.printf("Todo suma %d euros y %d centimos\n",eurosTotales,centimosResto);

    }
}
