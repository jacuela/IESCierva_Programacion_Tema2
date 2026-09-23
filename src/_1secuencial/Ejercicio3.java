package _1secuencial;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        System.out.println("Ejercicio03");
        System.out.println("===========================");

        Scanner teclado = new Scanner(System.in);

        double precio_compra;
        double porcentaje_descuento;
        double precio_final;

        System.out.print("Dime el precio de compra:");
        precio_compra = Double.parseDouble(teclado.nextLine());

        System.out.print("Y el porcentaje de descuento:");
        porcentaje_descuento = Double.parseDouble(teclado.nextLine());

        double descuento = (precio_compra * porcentaje_descuento)/100;
        precio_final = precio_compra - descuento;

        System.out.println("Tu artículo menos el "+porcentaje_descuento+"%, se te queda en "+precio_final+"€");
        System.out.printf("Tu artículo menos el %.1f%%, se te queda en %.1f€",porcentaje_descuento,precio_final);


    }
}
