package _1secuencial;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        double gradosF, gradosC;

        System.out.print("Dime la temperatura en grados fahrenheit:");
        gradosF=Double.parseDouble(teclado.nextLine());

        gradosC=(gradosF-32)*5/9;

        System.out.println(gradosF+" Fahrenheit son "+gradosC+" Celsius");

        //Misma salida pero formateada con 1 decimal
        System.out.printf("%.1f Fahrenheit son %.1f Celsius\n",gradosF,gradosC);

    }
}
