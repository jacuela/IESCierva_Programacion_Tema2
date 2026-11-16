package _6funciones;

import utilidades.Util;

public class Ejercicio06 {
    public static void main(String[] args) {
        int[] lista1={1,2,3};
        int[] lista2={1,5,3};

        String texto = compararArrays(lista1,lista2) ? "iguales" : "distintos";
        System.out.println("Los arrays son "+texto);

        int[] resultado=fusionarArrays(lista1,lista2);

        Util.imprimirArray(resultado);

    }

    public static boolean compararArrays(int[] lista1, int[] lista2){
        // boolean resultado=true;

        if (lista1.length != lista2.length )
            return false;
        else{
            //Los arrays tienen el mismo tamaño. Comparo posición a posición
            for (int i = 0; i < lista1.length; i++) {
                if (lista1[i]!=lista2[i]){
                    return false;
                }
            }
        }
        return true;
    }//fin compararArrays


    public static int[] fusionarArrays(int[] lista1, int[] lista2){

        int[]resultado=new int[lista1.length+lista2.length];
        int indice_resultado=0;

        for (int i = 0; i < lista1.length; i++) {
            resultado[indice_resultado]=lista1[i];
            indice_resultado++;
        }

        for (int i = 0; i < lista2.length; i++) {
            resultado[indice_resultado]=lista2[i];
            indice_resultado++;
        }

        return resultado;

    }//fin fusionarArrays




}
