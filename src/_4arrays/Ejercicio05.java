package _4arrays;

public class Ejercicio05 {
    public static void main(String[] args) {
        int []lista={6,5,4,2,2};
        boolean sonPares = true;

        for (int i = 0; i < lista.length; i++) {
            if (lista[i]%2!=0){
                sonPares = false;
            }
        }

        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]+"-");
        }
        System.out.println();
        if (sonPares){
            System.out.println("Todos son PARES");
        }else{
            System.out.println("NO son todos PARES");
        }
    }
}
