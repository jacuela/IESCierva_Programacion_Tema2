package _3bucles;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Prueba de como funciona un bucle anidado
//        for (int i=0;i<5;i++){
//            for (int j=0;j<3;j++){
//                System.out.println(i+"---"+j);
//            }
//        }


//        System.out.println("Tablas de multiplicar");
//        System.out.println("=====================");
//        System.out.print("Dime un numero N:");
//        int N = Integer.parseInt(teclado.nextLine());
//
//        for (int i=1; i<=N; i++){ //controla el numero de tablas
//            System.out.println("Tabla del "+i);
//            System.out.println("-------------");
//            for (int j=1;j<=10;j++){ //muestra la tabla
//                System.out.println(i+"x"+j+"="+(i*j));
//            }
//            System.out.println();
//        }

        System.out.println("Factorial");
        System.out.println("===========");
        System.out.println("Dime un numero N:");
        int N = Integer.parseInt(teclado.nextLine());
        int factorial = 1;

        for(int i=0;i<=N;i++){ //factorial desde 0 hasta N
            factorial = 1;
            for(int j=1;j<=i;j++){
                factorial = factorial * j;
            }
            System.out.println(i+"!-->"+factorial);

        }







//        System.out.println("Reloj");
//        System.out.println("=====================");
//
//        // i son los minutos
//        // j son los segundos
//        for (int min=0;min<=2;min++){
//            for(int seg=0;seg<=59;seg++){
//                if (seg>=0 && seg<=9){ //Primos 9 segundos
//                    System.out.println(min+":0"+seg);
//                }
//                else{
//                    System.out.println(min+":"+seg);
//                }
//
//                try {
//                    Thread.sleep(1000);
//                }catch(Exception e){
//                    System.out.println(e);
//                }
//
//                //Aborto cuando llego al 2:0
//                if (min==2 && seg==0){
//                    break;
//                }
//            }
//        }


    }
}
