package _5cadenas;

public class Ejercicio06 {
    public static void main(String[] args) {
        String frase1="el rock mola siempre";
        String frase2="";
        char caracter;


        for (int i = 0; i < frase1.length(); i++) {
            caracter = frase1.charAt(i);
            if (caracter=='o'){
                frase2=frase2+'0';
            }
            else if (caracter=='i'){
                frase2=frase2+'1';
            }
            else{
                caracter= Character.toUpperCase(caracter); //caracter en minuscula
                frase2=frase2+caracter;
            }

        }

        System.out.println(frase2);

    }
}
