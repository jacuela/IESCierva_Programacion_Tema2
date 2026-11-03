package _4arrays;

public class Ejercicio16 {
    public static void main(String[] args) {
        System.out.println("Ejercicio16");
        System.out.println("===============");

        int[][] tabla = new int[5][5];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                tabla[i][j]=(int)(Math.random()*10);
                System.out.print(tabla[i][j]+"  ");
            }
            System.out.println();
        }

        //Suma de las filas
        // i-->filas    j-->columnas
        int sumaFilas;
        for (int i = 0; i < tabla.length; i++) {
            sumaFilas = 0;
            for (int j = 0; j < tabla[0].length; j++) {
                sumaFilas = sumaFilas + tabla[i][j];
            }
            System.out.println("Suma de fila "+(i+1)+":"+sumaFilas);
        }
        System.out.println();
        //Suma de columnas
        // i-->filas    j-->columnas
        int sumaCol;
        for (int j = 0; j < tabla.length; j++) {
            sumaCol = 0;
            for (int i = 0; i < tabla[0].length; i++) {
                sumaCol = sumaCol + tabla[i][j];
            }
            System.out.println("Suma de columna "+(j+1)+":"+sumaCol);
        }

    }
}
