package _5cadenas;

public class Ejercicio07 {
    public static void main(String[] args) {
        //Contar las apariciones de una palabra en
        //frase sin usar split ni replace

        String frase = "La paz es paz si en el pazo llueve paz";
        int contador = 0;
        String palabra = "paz";
        boolean fin = false;

        //VERSION1 - pazo lo cuenta como palabra para "paz"
//        System.out.println("FRASE: "+frase);
//        do {
//            int posi_palabra = frase.indexOf(palabra);
//            if (posi_palabra != -1) {
//                //He encontrado la palabra. OJO, cuenta "pazos"
//                contador++;
//                frase = frase.substring(posi_palabra + palabra.length());
//            } else {
//                fin = true;
//            }
//        }while(!fin);
//
//        System.out.printf("La palabra %s aparece %d veces\n",palabra,contador);


        //VERSION2 - pazo no se cuenta para paz. Además, la palabra puede acabar la frase
        System.out.println("FRASE: "+frase);
        do {
            int posi_palabra = frase.indexOf(palabra);
            if (posi_palabra != -1) {
                //He encontrado la palabra.
                //Compruebo primero si es el final de la frase
                if (posi_palabra+palabra.length()==frase.length()){
                    //Si es así, cuento palabra y fin
                    contador++;
                    fin = true;
                }
                // Si no es el final de frase, compruebo que después hay espacio en blanco
                else if(frase.charAt(posi_palabra+palabra.length())==' '){
                    //Cuento palabra y me quedo con el resto
                    contador++;
                    frase = frase.substring(posi_palabra + palabra.length());
                }else{
                    //No cuento, pero debe seguir, quedándome con el resto
                    frase = frase.substring(posi_palabra + palabra.length());
                }
            } else {
                fin = true;
            }
        }while(!fin);

        System.out.printf("La palabra %s aparece %d veces\n",palabra,contador);









    }
}
