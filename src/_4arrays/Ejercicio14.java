package _4arrays;

public class Ejercicio14 {
    public static void main(String[] args) {
        int[] numeros = {5,2,4,2,2};

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" - ");
        }
        System.out.println();


        int repe = 0;
        int maxrepe = 0;
        int moda = 0;

        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[i];
            repe = 0;
            for (int j = 0; j < numeros.length ; j++) {
                if (valor == numeros[j]){
                    repe++;
                }
            }
            //Actualizo maximo
            if (repe > maxrepe){
                maxrepe = repe;
                moda = valor;
            }
        }
        System.out.println("La moda es "+moda);








    }
}
