
import java.util.Scanner;

/**
 * Created by artiaga on 25/11/16.
 */
public class Arrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fila, columna, numero;
        int array[][];

        System.out.println("Introduce una fila");
        fila = input.nextInt();
        System.out.println("Introduce una columna");
        columna = input.nextInt();

        array = new int[fila][columna];

        for (int i = 0; i < fila; i++) {

            for (int j = 0; j < columna; j++) {
                System.out.println("Introduce la celda [" + i + "] [" + j + "]");
                numero = input.nextInt();
                array [i][j] = numero;
            }
            System.out.println();
        }

        for (int i = 0; i < fila; i++) {

            for (int j = 0; j < columna; j++) {
                System.out.printf("%2d", array[i][j]);
            }
            System.out.println();
        }
    }
}