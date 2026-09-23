package _1secuencial;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Calculo de salario mensual");
        System.out.println("--------------------------");

        double sueldoBase,venta1,venta2,venta3;
        double comisionTotal;
        double salarioMes;

        double porcentajeComision=10;   //10% de comisión


        System.out.print("Dime el sueldo base: ");
        sueldoBase=Double.parseDouble(teclado.nextLine());

        System.out.print("Importe de la venta1: ");
        venta1=Double.parseDouble(teclado.nextLine());

        System.out.print("Importe de la venta2: ");
        venta2=Double.parseDouble(teclado.nextLine());

        System.out.print("Importe de la venta3: ");
        venta3=Double.parseDouble(teclado.nextLine());

        comisionTotal = (venta1 + venta2 + venta3)*(porcentajeComision/100);

        salarioMes=sueldoBase+comisionTotal;

        System.out.println("El total de comisiones del mes es: "+comisionTotal+"€");
        System.out.println("El salario total del mes es:"+salarioMes+"€");






    }
}
