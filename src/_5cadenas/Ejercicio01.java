package _5cadenas;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        //Cuento letras de una frase
        //No es sensible a mayúsculas, es decir, no es
        //NO ES CASESENTITIVE
        //Lo paso too a minúsculas

        Scanner teclado = new Scanner(System.in);
        String frase = "Yo he visto cosas que vosotros no creeríais";
        int contador = 0;
        char letra = ' ';
        boolean salir = false;
        System.out.println("FRASE:");
        System.out.println(frase);
        frase = frase.toLowerCase(); //la frase la paso a minusculas

        do{
            contador = 0;
            System.out.print("Dime letra [INTRO fin]: ");
            try{
                letra = teclado.nextLine().toLowerCase().charAt(0);
            }
            catch (Exception e){
                //break;
                salir = true;

            }
            //letra = Character.toLowerCase(letra); //pasar un char a minuscula
            for (int i = 0; i < frase.length() ; i++) {
                if (letra == frase.charAt(i)){
                    contador++;
                }
            }
            System.out.printf("  La letra '%c' aparece %d veces\n",letra,contador);
        }while(!salir);

    }
}
