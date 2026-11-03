package _4arrays;

public class Ejercicio15 {
    public static void main(String[] args) {
        //Me creo tabla de 3x6 (filasxcolumnas)

        int [][] tabla = new int[3][6];

        tabla[1][0] = 75;
        tabla[0][1] = 30;
        tabla[0][2] = 2;
        tabla[2][5] = 11;
        tabla[2][2] = -2;
        tabla[2][3] = 9;

        //i son las filas
        //j son las columnas

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                System.out.print(tabla[i][j]+"  ");
            }
            System.out.println();
        }













    }
}
