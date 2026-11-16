package _6funciones;

public class Ejercicio04 {
    public static void main(String[] args) {
        int [] lista = {1,3,5,8,12,3,6};
        imprimirArray(lista);
    }

    //  +----+----+----+----+
    //  |   3|   7|   9|   1|
    //  +----+----+----+----+
    public static void imprimirArray(int[] array){
        //Imprimimos array de forma bonita
        for (int i = 0; i < array.length ; i++) {
            System.out.print("+----");
        }
        System.out.println("+");

        for (int i = 0; i < array.length ; i++) {
            System.out.printf("|%3d ",array[i]);
        }
        System.out.println("|");
        for (int i = 0; i < array.length ; i++) {
            System.out.print("+----");
        }
        System.out.println("+");
    }//fin imprimirArray

}
