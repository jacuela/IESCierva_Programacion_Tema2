package _1secuencial;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        //Ejercicio02

        Scanner teclado = new Scanner(System.in);
        System.out.println("Calcular area y perimetro del rectangulo");
        System.out.println("----------------------------------------");

        double base,altura; //variables entrada
        double perimetro,area;  //variable salida

        System.out.print("Dime la base:");
        base = Double.parseDouble(teclado.nextLine());

        System.out.print("Dime la altura:");
        altura = Double.parseDouble(teclado.nextLine());

        perimetro = 2*base + 2*altura;
        area = base * altura;

        System.out.println("El perimetro es:"+perimetro+" y el area es:"+area);
        System.out.printf("El perimetro es:%.2f y el area es:%.2f",perimetro,area);







    }
}
