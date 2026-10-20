package _4arrays;

public class Ejercicio01 {
    public static void main(String[] args) {
        String []animales={"perro","gato","rata","pajaro","raton"};

        String []animales2= new String[5];
        animales2[0]="perro";
        animales2[1]="gato";
        animales2[2]="rata";
        animales2[3]="pajaro";
        animales2[4]="raton";

        System.out.println(animales[0]);
        System.out.println(animales[1]);
        System.out.println(animales[2]);
        System.out.println(animales[3]);
        System.out.println(animales[4]);
        System.out.println("------------");
        //Imprimir los valores de un array
        for (int i = 0; i < animales.length ; i++) {
            System.out.println(animales[i]);
        }
        System.out.println("------------");
        int []numeros = {2,4,6,8,10};

        for (int i = numeros.length-1; i >=0 ; i--) {
            System.out.println(numeros[i]);
        }
        System.out.println("------------");
        for (int i = 0; i < numeros.length ; i++) {
            int indice = numeros.length-i-1;
            System.out.println(numeros[indice]);
        }



    }
}
