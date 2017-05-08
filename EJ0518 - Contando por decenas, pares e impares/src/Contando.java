/**
 * Created by artiaga on 9/1/17.
 */
public class Contando {

    public static void main (String[] args) {
        final int SIZE = 100;

        int nums [] = new int [SIZE];

        fillArray(nums);
        printArray(nums);
        printArray(printCountTens(nums));
        //countEvensOdds{};

    }


    /**
     * Rellena el array con valores aleatorios entre min y max
     * @param array Array de enteros
     *
     */
    static void fillArray(int array[]){
        int min = 0, max = 100;
        for (int i = 0 ; i < array.length; i ++){
            array[i] = (int) (Math.random() * max + min);
        }


    }

    static void printArray (int array []) {

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3d", array[i]);
            if( (i+1) % 10 == 00){
                System.out.println();
            }
        }
        System.out.println();
    }

    static int[] printCountTens(int array[]){

        int decenas [] = new int [10];
        for (int i = 0 ; i < array.length; i ++) {
            decenas[array[i] / 10]++;
        }
        return decenas;
    }
}
