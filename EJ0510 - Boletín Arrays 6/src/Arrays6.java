/*
Enunciado

Leer 10 números enteros, almacenarlos en un vector y determinar cuántas veces está repetido el mayor.

Notas

Este algo se resuelve delegando cada operación fundamental en una función. De manera que su funcionamiento se puede listando las acciones básicas necesarias para su solución:

Llenar el array de datos (en el ejercicio se hace con datos aleatorios en vez de leídos por la entrada estándar).
Impresión de los datos del array.
Cálculo del máximo.
Recuento de las apariciones del máximo.
Impresión de resultados.
 */
public class Arrays6 {

    public static void main(String[] args) {
        int numeros[] = new int[10];
        int max, repeticiones;

        llenarArray(numeros);
        imprimirArray(numeros);

        max = maxArray(numeros);
        repeticiones = vecesEnArray(numeros, max);

        System.out.println("Valor máximo: "+max);
        System.out.println("Apariciones: " +repeticiones);
    }

    /**
     * Llena de valores aleatorios el array recibido como parámetro.
     *
     * @param array Array de enteros
     */
    static void llenarArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*10+1);
        }
    }

    /**
     * Imprime el array recibido como parámetro.
     *
     * @param array Array de enteros
     */
    static void imprimirArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.printf(" %d", array[i]);
        }
        System.out.println();
    }

    /**
     * Devuelve el valor máximo del array recibido como parámetro.
     *
     * @param array Array de enteros
     *
     * @return Valor máximo del array
     */
    static int maxArray(int array[]){
        int maximo = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if(array[i] > maximo){
                maximo = array[i];
            }
        }

        return maximo;
    }

    /**
     * Devuelve el número de apariciones de un valor en un array.
     *
     * @param array Array de enteros
     * @param valor Valor que se busca en el array
     *
     * @return Número de apariciones del valor
     */
    static int vecesEnArray(int array[], int valor){
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor){
                contador++;
            }
        }

        return contador;
    }
}