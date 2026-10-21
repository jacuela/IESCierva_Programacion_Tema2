package _4arrays;

public class Ejercicio06 {
    public static void main(String[] args) {
        int[] lista1={1,2,3,2};

        //int[] lista2={1,9,5,2};
        int[] lista2={1,2,3,2};

        boolean sonIguales=true;

        for (int i = 0; i < lista1.length; i++) {
            if (lista1[i]!=lista2[i]){
                sonIguales=false;
            }
        }
        if (sonIguales) System.out.println("Sí son iguales");
        else System.out.println("NO son iguales");










    }
}
