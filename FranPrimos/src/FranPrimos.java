import java.util.Scanner;

/**
 * Created by artiaga on 25/11/16.
 */
public class FranPrimos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un numero");
        numero = input.nextInt();

        if (esPrimo(numero)) {
            System.out.println("El numero " + numero + " es primo");

        } else {

            System.out.println("El numero " + numero + " no es primo");
        }

    }


    static boolean esPrimo(int num) {

        boolean primo = true;

        for (int i = 2; primo && i <= Math.sqrt(num); i++) {

            if (num % i == 0) {
                primo = false;
            }
        }
        return primo;
    }

}


