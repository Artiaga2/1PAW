/*Enunciado

        Escribir un programa que recoja de la entrada estándar dos arrays de entero de
        tamaño especificado por el usuario y los multiplique dos a dos, guardando el
        resultado en otro array e imprimiendo los valores de este último array.
*/
import java.util.Scanner;


public class Arrays13 {

    public static void main(String[] args) {
        int array1[][], array2[][], producto[][];
        Scanner input = new Scanner(System.in);
        int filas, cols;

        System.out.println("Número de filas de los arrays: ");
        filas = input.nextInt();
        System.out.println("Número de columnas de los arrays: ");
        cols = input.nextInt();

        array1 = new int[filas][cols];
        array2 = new int[filas][cols];

        cargar(array1);
        System.out.println("ARRAY 1");
        System.out.println("=======");
        imprimir(array1);

        cargar(array2);
        System.out.println("ARRAY 2");
        System.out.println("=======");
        imprimir(array2);

        producto = multiplica(array1, array2);
        System.out.println("PRODUCTO");
        System.out.println("========");
        imprimir(producto);
    }

    /**
     * Carga un array de dos dimensiones de enteros leídos desde la entrada estándar.
     *
     * @param array
     */
    static void cargar(int array[][]){
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("Introducir el elemento (%d,%d): ", i,j);
                array[i][j] = in.nextInt();
            }
        }
    }

    /**
     * Imprime los valores de un array de dos dimensiones.
     *
     * @param array
     */
    static void imprimir(int array[][]){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4d ",array[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Multiplica posición por posición dos array de dos dimensiones. Observar que esta función
     * devuelve un array de dos dimensiones.
     *
     * @param a int [][]
     * @param b int [][]
     *
     * @return int [][]
     */
    static int[][] multiplica(int a[][], int b[][]){
        // Las dimensiones del array resultados las extraemos de las dimensiones de los arrays
        // de uno de los parámetros.
        int resultado[][] = new int[a.length][a[0].length];

        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                resultado[i][j] = a[i][j] * b[i][j];
            }
        }

        return resultado;
    }
}