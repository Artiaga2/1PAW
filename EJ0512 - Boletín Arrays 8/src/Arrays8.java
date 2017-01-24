/*Enunciado

        Leer 10 números enteros, almacenarlos en un vector y
        determinar en qué posición está el número con mas dígitos.

        Notas

        En este ejercicio se ha optado por inicializar un
        array con valores dados para facilitar la ejecución del programa.
*/
public class Arrays8 {

    public static void main(String[] args) {
        int numeros[] = { 1, 10, 100, 1000, 10000, 10, 10000000, 10, 100, 1};
        int maxCifras = 0;
        int posicion = -1;

        imprimirArray(numeros);

        for (int i = 0; i < numeros.length; i++) {
            int cifras = contarCifras(numeros[i]);
            if( cifras > maxCifras){
                maxCifras = cifras;
                posicion = i;
            }
        }

        System.out.println("El número mayor tiene " + maxCifras + " cifras y está en la posición " + posicion);
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
     * Cuenta las cifras de un entero.
     *
     * @param num Número entero del que cuenta las cifras
     *
     * @return Número de cifras del parámetro
     */
    static int contarCifras(int num) {
        int cifras = 0;
        while(num > 0){
            num /= 10;
            cifras++;
        }

        return cifras;
    }
}