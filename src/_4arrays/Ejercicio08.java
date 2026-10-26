package _4arrays;

public class Ejercicio08 {
    public static void main(String[] args) {
        System.out.println("Ejercicio08 - crece/decrece");
        System.out.println("===========================");

        //int []lista={6,7,50,50,67};  //lista que crece
        //int []lista={67,34,20,17,5};  //lista decrece
        int []lista={67,34,50,17,5};  //lista decrece


        boolean esCreciente = true;
        boolean esDecreciente=true;
        //boolean sonIguales=true;

        //Busco que decrezca
        for (int i = 0; i < lista.length-1; i++) {
            if (lista[i]>lista[i+1]){
                esCreciente = false;
            }
            else if (lista[i]<lista[i+1]){
                esDecreciente = false;
            }
        }
        if (esCreciente) {
            System.out.println("Es CRECIENTE");
        }else if (esDecreciente){
            System.out.println("Es DECRECIENTE");
        }
        else{
            System.out.println("No hay orden");
        }




    }
}
