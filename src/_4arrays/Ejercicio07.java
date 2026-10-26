package _4arrays;

public class Ejercicio07 {
    public static void main(String[] args) {
        int[] lista1={1,5,7,2};

        int[] lista2={2,7,5,1};
        //int[] lista2={3,5,2,8};

        int contadorIguales = 0;

        for (int i = 0; i < lista1.length; i++) {
            //Busco el elemento actual lista1[i] en la segunta tabla
            //Si lo encuentro, aumento el contador de iguales
            for (int j = 0; j < lista1.length; j++) {
                if (lista1[i]==lista2[j]){
                    contadorIguales++;
                    break; //AHORRAR TIEMPO
                }
            }
        }

        System.out.println("Contador iguales:"+contadorIguales);
        if (lista1.length == contadorIguales) {
            System.out.println("Sí son iguales");
        }
        else {
            System.out.println("NO son iguales");
        }

    }
}
