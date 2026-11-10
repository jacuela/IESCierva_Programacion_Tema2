package _6funciones;

public class Prueba1 {
    public static void main(String[] args) {
        double imc = calcularIMC(90,1.73);
        System.out.println(imc);
    }

    public static double calcularIMC(double peso, double altura){
        double imc;

        imc = peso / (altura*altura);

        return imc;

    }



}
