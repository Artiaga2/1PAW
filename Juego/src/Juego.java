import java.util.Scanner;

/**
 * Created by artiaga on 11/11/16.
 */
public class Juego {

    public static void main (String[] args) {

        int numeroAleatorio, intentos = 0, num;

        Scanner input = new Scanner(System.in);

            numeroAleatorio = (int) (1 + Math.random() * 99);

        System.out.println("Introduce un numero entre 1 y 100: ");
        num = input.nextInt();

        while (num != numeroAleatorio && intentos < 10) {

            if (num < numeroAleatorio) {
                System.out.println("El numero es demasiado bajo");
                num = input.nextInt();
                intentos++;

            } else {
                System.out.println("El numero es demasiado alto");
                intentos++;
                num = input.nextInt();
            }
        }


            if (intentos < 10){
                System.out.println("Has ganado con " + intentos + " intentos");
            }else{
                System.out.println("Has perdido con "  + intentos + " intentos");

            }
    }
}
