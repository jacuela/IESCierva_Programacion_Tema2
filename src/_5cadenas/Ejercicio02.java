package _5cadenas;

public class Ejercicio02 {
    public static void main(String[] args) {
        String frase= "El covid19 es lo peor";
        char letra;
        int contadorVocales=0, contadorConsonantes=0;
        System.out.println("FRASE: "+frase);
        frase = frase.toLowerCase(); //lo paso todo a minuscula
        for (int i = 0; i < frase.length(); i++) {
            letra = frase.charAt(i);

            //Analizo la letra
            switch (letra){
                case 'a','e','i','o','u':
                    contadorVocales++;
                    break;
                case '0','1','2','3','4','5','6','7','8','9':
                    break;
                case ' ': //trato el espacio
                    break;
                default:
                    contadorConsonantes++;
            }

        }
        System.out.println("  -Total vocales:"+contadorVocales);
        System.out.println("  -Total consonantes:"+contadorConsonantes);








    }
}
