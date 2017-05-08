import java.util.Scanner;

/**
 * Created by artiaga on 3/11/16.
 */
public class Rectangulo {

    public static void main (String[] args) {

        int altura, anchura;

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce la altura ");
        altura = input.nextInt();

        System.out.println("Introduce la anchura ");
        anchura = input.nextInt();

        for (int i = 0;i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Esto es un rectangulo de " + altura + " asteriscos de altura y " + anchura + " asteriscos5 de anchura");
    }
}
