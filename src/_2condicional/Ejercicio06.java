package _2condicional;

public class Ejercicio06 {
    public static void main(String[] args) {
        System.out.println("OPERADOR TERNARIO");
        System.out.println("=================");

        //Apartado 1 - mayor de dos numeros
        int a = 6;
        int b = 23;
        int mayor = (a>b)?a:b;

        //Apartado 2
        int num = 28;
        String paroimpar=(num%2 == 0)?"par":"impar";

        //Apartado 3
        int edad=67;
        boolean esMayor = (edad > 18)?true:false;

    }
}
