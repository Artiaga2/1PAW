import java.util.Scanner;

/**
 * Created by artiaga on 7/12/16.
 */
public class EJEV02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, millares, centenas, decenas, unidades;

        System.out.println("Introduce un numero ");
        numero = input.nextInt();

        if (numero != 0) {
            millares = (numero / 1000);
            System.out.println("*");
            centenas = (numero / 100);
            System.out.println("*");

            decenas = (numero / 100);
            System.out.println("*");
            unidades = (numero % 10);
            System.out.println("*");


        }
    }
}