/*Enunciado

        Leer 10 números enteros, almacenarlos en un vector y determinar cuántos números
         de los almacenados en dicho vector terminan en 15.
*/
public class Arrays11 {

    public static void main(String[] args) {
        final int LIMITE = 20;
        int numeros[] = new int[10];


        cargarArray(numeros, LIMITE);
        imprimirArray(numeros);

        System.out.println("Números terminados en 15: " + terminadoEn15(numeros));
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
     * Calcula el número de números terminados en 15 de un array.
     *
     * @param numeros Array de enteros.
     *
     * @return Números terminados en 15 dentro del array.
     */
    static int terminadoEn15(int numeros[]){
        int cont = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%100 == 15){
                cont++;
            }
        }
        return cont;
    }
}