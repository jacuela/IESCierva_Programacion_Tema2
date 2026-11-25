package _6funciones;

import utilidades.Util;

public class Ejercicio10 {
    public static void main(String[] args) {
        int []numeros = {2,4,6};
        int []copiaNumeros = hacerCopia(numeros);

        //Voy a modificar el original
        numeros[0]=666;numeros[1]=777;
        Util.imprimirArray(numeros);
        //Veo que la copia NO se ha visto afectada
        Util.imprimirArray(copiaNumeros);

        //Otro forma de hacer copia de array
        //copiaNumeros = numeros.clone();

    }

    public static int[] hacerCopia(int[] lista){
        int [] resultado = new int[lista.length];
     //resultado = lista; //ESTO NO VALE; ES UN ALIAS
        for (int i = 0; i < lista.length; i++) {
            resultado[i] = lista[i];
        }
        return resultado;
    }





}

