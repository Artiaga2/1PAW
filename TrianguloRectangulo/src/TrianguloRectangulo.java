import java.util.Scanner;

/**
 * Created by artiaga on 14/11/16.
 */
public class TrianguloRectangulo {


    public static void main(String[] args) {

        int base;

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce la base ");
        base = input.nextInt();


        for (int i = 0; i < base; i++) {
            for (int j= 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Esto es un rectangulo-triangulo de " + base + " asteriscos ");
    }
}