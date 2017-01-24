/*Enunciado

        Leer 10 números enteros, almacenarlos en un vector y mostrar en pantalla todos
        los enteros comprendidos entre 1 y cada uno
        de los números almacenados en el vector.
*/
public class Arrays10 {

    public static void main(String[] args) {
        final int LIMITE = 10;
        int numeros[] = new int[10];

        cargarArray(numeros, LIMITE);
        imprimirArray(numeros);

        // Se recorre el array imprimiendo la secuencia por cada valor.
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%02d:",numeros[i]);
            imprimirSecuencia(numeros[i]);
        }
    }

    /**
     * Imprime los valores del array.
     *
     * @param array Array de enteros
     */
    static void imprimirArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%2d ", array[i]);
        }
        System.out.println();   // Salto de línea
    }

    /**
     * Carga un array con valores aleatorios.
     *
     * @param array Array que voy a cargar con datos
     * @param limite Límite númerico de los datos que se cargaran
     */
    static void cargarArray(int array[], int limite){
        for (int i = 0; i < array.length; i++) {
            // Se carga el array con valores aleatorios entre 1 y 100
            array[i] = (int)(Math.random()*limite+1);
        }
    }

    /**
     * Imprime una secuencia de números desde 1 hasta el número indicado en el parámetro.
     *
     * @param num Entero que indica el límite de la secuencia de impresión.
     */
    static void imprimirSecuencia(int num){
        // Si el número recibido fuera negativo no se imprime nada
        if (num > 0){
            for (int i = 1; i <=num ; i++) {
                System.out.printf(" %d", i);
            }
            System.out.println();
        }
    }
}