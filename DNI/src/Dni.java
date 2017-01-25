import java.util.Scanner;
import java.util.jar.Attributes;

/**
 * Created by artiaga on 1/12/16.
 */
public class Dni {

    public static void main (String[] args) {

        letraDni();

    }

    static void letraDni () {

        Scanner input = new Scanner(System.in);

        int num;


        char array[] = new char[23];
        array[0] = 'T';
        array[1] = 'R';
        array[2] = 'W';
        array[3] = 'A';
        array[4] = 'G';
        array[5] = 'M';
        array[6] = 'Y';
        array[7] = 'F';
        array[8] = 'P';
        array[9] = 'D';
        array[10] = 'X';
        array[11] = 'B';
        array[12] = 'N';
        array[13] = 'J';
        array[14] = 'Z';
        array[15] = 'S';
        array[16] = 'Q';
        array[17] = 'V';
        array[18] = 'H';
        array[19] = 'L';
        array[20] = 'C';
        array[21] = 'K';
        array[22] = 'E';

        System.out.println("Numero: ");
        num = input.nextInt();

       System.out.println(num + " - " + array[num%23]);

    }

}
