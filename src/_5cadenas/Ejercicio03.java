package _5cadenas;

public class Ejercicio03 {
    public static void main(String[] args) {
        String frase= " HOMBRES Y MUJERES TENEMOS LOS MISMOS DERECHOS ";
        System.out.println(frase);
        //======PARTE1
        String palabra = "MUJERES";
        //Usando indexOf
        if (frase.indexOf(palabra) != -1){
            System.out.println("-"+palabra+" sí aparece");
        }else{
            System.out.println("-"+palabra+" no aparece");
        }
        //Usando contains
        if (frase.contains(palabra)){
            System.out.println("-"+palabra+" sí aparece");
        }else{
            System.out.println("-"+palabra+" no aparece");
        }
        //Contains y operador ternario
        String si_no = frase.contains(palabra) ? "sí" : "no";
        System.out.printf("-%s %s aparece\n",palabra,si_no);

        //======PARTE2 - indicar num palabras
        int contadorEspacios = 0;
        frase = frase.trim();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' '){ contadorEspacios++; }
        }
        System.out.printf("Hay %d palabras\n",(contadorEspacios+1));

        //=====PARTE3 - cambiar espacios por _
        frase = frase.replace(' ','_');
        System.out.println(frase);

        //======PARTE4 - eliminar espacios
        frase = frase.replace("_","");
        System.out.println(frase);
    }
}
