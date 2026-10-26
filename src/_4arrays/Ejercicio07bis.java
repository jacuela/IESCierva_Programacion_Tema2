package _4arrays;

public class Ejercicio07bis {
    public static void main(String[] args) {

        //Permito cualquier orden y sí se pueden repetir
        int[] lista1={3,4,3,7};

        //int[] lista2={3,7,3,1};
        int[] lista2={7,4,3,3};

        //Esta lista lleva las apariciones de los
        //números de la lista1 en cada casilla.
        int[] auxLista1 = new int[10];

        //Idem con lista2
        int[] auxLista2 = new int[10];

        //Contador de numeros
        //int contador = 0;

        //Rellenamos la lista auxiliar 1
        for (int i = 0; i < auxLista1.length; i++) {
            for (int j = 0; j < lista1.length; j++) {
                if (i == lista1[j]){
                    auxLista1[i]++;
                }
            }
        }

        //Rellenamos la lista auxiliar 2
        for (int i = 0; i < auxLista2.length; i++) {
            for (int j = 0; j < lista2.length; j++) {
                if (i == lista2[j]) {
                    auxLista2[i]++;
                }
            }
        }

        //Comparo las dos listas.
        boolean sonIguales=true;

        for (int i = 0; i < auxLista1.length; i++) {
            if (auxLista1[i]!=auxLista2[i]){
                sonIguales=false;
            }
        }
        if (sonIguales) System.out.println("Sí son iguales");
        else System.out.println("NO son iguales");

    }

}
