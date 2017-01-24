/*Enunciado

        Leer 10 números enteros, almacenarlos en un vector y
         calcularle el factorial a cada uno de los números leídos
         almacenándolos en otro vector.

        Notas

        Para resolver este ejercicio se va recorriendo e
        l array datos y calculándose el factorial de los valores almacenados en este.
        Estos factoriales se van guardando en el array resultados.

        Tened cuidado con los datos que se pasan para calcular el factorial.
        Cuando son muy grandes, el factorial genera valores que exceden el tipo.
*/
public class Arrays9 {
    public static void main(String[] args) {
        int numeros[] = new int[10];
        int factoriales[] = new int[10];

        cargarArray(numeros, 10);
        imprimirArray(numeros);

        calcularFactoriales(numeros, factoriales);

        imprimirArray(factoriales);
    }

    /**
     * Carga un array con valores aleatorios.
     *
     * @param array  Array que voy a cargar con datos
     * @param limite Límite númerico de los datos que se cargaran
     */
    static void cargarArray(int array[], int limite) {
        for (int i = 0; i < array.length; i++) {
            // Se carga el array con valores aleatorios entre 1 y 100
            array[i] = (int) (Math.random() * limite + 1);
        }
    }

    /**
     * Se toman los valores del array datos, se calculan sus factoriales y se guardan en resultados.
     *
     * @param datos
     * @param resultados
     */
    static void calcularFactoriales(int datos[], int resultados[]) {
        for (int i = 0; i < datos.length; i++) {
            resultados[i] = factorial(datos[i]);
        }
    }

    /**
     * Calcula el factorial de un número.
     *
     * @param num Entero del que se calcula el factorial.
     * @return Factorial del número recibido como parámetro
     */
    static int factorial(int num) {
        int resultado = 1;

        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }

        return resultado;
    }

    /**
     * Imprime los valores de un array.
     *
     * @param array Array de enteros.
     */
    static void imprimirArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf(" %8d", array[i]);    //
        }
        System.out.println();   // Salto de línea
    }
}