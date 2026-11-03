package _4arrays;

public class Ejercicio17 {
    public static void main(String[] args) {
        System.out.println("Ejercicio17 - tablero 3 en raya");
        System.out.println("===============================");

        char[][] tablero = {{'x','o','x'},{'-','o','o'},{'x','o','x'}};

        //=========MEJORA 1 - TABLERO ALEATORIO===================
        //Recorro cada ficha del tablero y aleatoriamente meto una 'x' o una 'o'
        //ESTA MAL, no es justa. Puede generar más fichas de un tipo

        char [] fichas={'x','o'};  //(int)(Math.random()*2)--> aleatorios entre 0 y 1

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int valor = (int)(Math.random()*2);
                tablero[i][j]=fichas[valor];
            }

        }
        //===========================================

        //Imprimo la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("  "+tablero[i][j]+"  ");
            }
            System.out.println();
        }

        //Busco ganadores
        char jugador1='x';
        char jugador2='o';

        boolean ganaJugador1 = false;
        boolean ganaJugador2 = false;

        //*********Compruebo si gana jugador1 (x)***********
        //Compruebo filas y columnas
        for (int i = 0; i < 3; i++) {
            if ((tablero[i][0] == jugador1 && tablero[i][1] == jugador1 && tablero[i][2] == jugador1) || // Filas
                    (tablero[0][i] == jugador1 && tablero[1][i] == jugador1 && tablero[2][i] == jugador1)) { // Columnas
                ganaJugador1 = true;
            }
        }

        // Comprobar diagonales
        if ((tablero[0][0] == jugador1 && tablero[1][1] == jugador1 && tablero[2][2] == jugador1) || // Diagonal principal
                (tablero[0][2] == jugador1 && tablero[1][1] == jugador1 && tablero[2][0] == jugador1)) { // Diagonal inversa
            ganaJugador1 = true;
        }

        //*********Compruebo si gana jugador2 (o)***********
        //Compruebo filas y columnas
        for (int i = 0; i < 3; i++) {
            if ((tablero[i][0] == jugador2 && tablero[i][1] == jugador2 && tablero[i][2] == jugador2) || // Filas
                    (tablero[0][i] == jugador2 && tablero[1][i] == jugador2 && tablero[2][i] == jugador2)) { // Columnas
                ganaJugador2 = true;
            }
        }

        // Comprobar diagonales
        if ((tablero[0][0] == jugador2 && tablero[1][1] == jugador2 && tablero[2][2] == jugador2) || // Diagonal principal
                (tablero[0][2] == jugador2 && tablero[1][1] == jugador2 && tablero[2][0] == jugador2)) { // Diagonal inversa
            ganaJugador2 = true;
        }



        if (ganaJugador1){
            System.out.println("El jugador X gana");
        }
        else if (ganaJugador2){
            System.out.println("El jugador O gana");
        }
        else{
            System.out.println("TABLAS");
        }








    }
}
