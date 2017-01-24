import java.util.Scanner;

/**
 * Created by artiaga on 3/11/16.
 */
public class Primos {

    public static void main (String[] args){

        int numero;
        boolean esPrimo = true;
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        numero = input.nextInt();

        for (int i = 2; esPrimo && i < Math.sqrt(numero); i++)
        {
            if (numero % i == 0) {
                esPrimo = false;
            }
            System.out.println(i);
        }
        if (esPrimo) {
            System.out.println("El numero " + numero + " es primo");

        }else{
            System.out.println("El numero " + numero + " no es primo");
        }
    }
}
