package _5cadenas;

public class Ejercicio05 {
    public static void main(String[] args) {
        String cadena = "El jueves sale el GTA";
        String resultado = "";

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter!=' '){
                //Si no es espacio, lo concateno
                resultado = resultado + caracter;
            }
        }
        System.out.println(resultado);





    }

}
