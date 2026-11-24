package _6funciones;

import utilidades.Util;

public class Ejercicio09 {
    public static void main(String[] args) {
        int []notasAlumno1={10,6,7};
        incrementar(notasAlumno1,2);

        Util.imprimirArray(notasAlumno1);
    }

    public static void incrementar(int [] lista, int valor){
        for (int i = 0; i < lista.length; i++) {
            int suma = lista[i] + valor;
            if (suma <=10){
                lista[i] = suma;
            }else{
                lista[i] = 10;
            }

        }


    }
}
