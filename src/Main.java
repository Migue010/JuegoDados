import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random aleatorio = new Random();
        /*int n , a;
        n = aleatorio.nextInt(50);
        a = aleatorio.nextInt(5,10);

        System.out.println(n);
        System.out.println(a);*/
        int random1 , random2 , dado1=0 , dado2=0 , contador=1;


            do {
                random1 = aleatorio.nextInt(1,6);
                random2 = aleatorio.nextInt(1,6);
                System.out.println("El dado uno tuvo el numero:" + random1);
                System.out.println("El dado dos tuvo el numero:" + random2);
                System.out.println("-----------------------------");
                if (random1 > random2) {
                    dado1++;

                }else if (random1 < random2) {
                    dado2++;

                }
                contador ++;
            }while (contador<=6);



        System.out.println("El dado uno tiene: " + dado1 + " Victorias");
        System.out.println("El dado dos tiene: " + dado2 + " Victorias");


    }
}