package utilidades;

public class Util {
    public static void imprimirArray(int[] array){
        //Imprimimos array con este formato
        //  +----+----+----+----+
        //  |   3|   7|   9|   1|
        //  +----+----+----+----+
        //
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
