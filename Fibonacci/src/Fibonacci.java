import java.util.Scanner;

/**
 * Created by artiaga on 1/12/16.
 */
public class Fibonacci {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        //int array[];
        int numero;

        System.out.println("Introduce un numero ");
        numero = input.nextInt();

        int fibb = fibonacciRecursivo(numero);

        System.out.println(fibb);
    }
       /*
        if (numero > 1){

        array = new int [numero];
        array [0] = 1;
        array [1] = 1;
        System.out.printf("%d ", array [0]);
        System.out.printf("%d ", array [1]);

        for (int i = 2 ; i < numero; i++) {

            array[i] = array[i - 1] + array[i - 2];

            System.out.printf("%d ", array[i]);

        }

        }else{
            System.out.println(1);
        }
    }*/

    static int fibonacciRecursivo (int number){

        if (number == 1 || number == 2){
            return 1;
        }else{


            return fibonacciRecursivo(number - 1) + fibonacciRecursivo(number - 2);
        }

    }

}

