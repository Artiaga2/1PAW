/*Enunciado

        Leer 10 números enteros, almacenarlos en un vector y determinar
        si el promedio entero de estos datos está almacenado en el vector.
*/
public class Arrays7 {

    public static void main(String[] args) {
        int nums[] = new int[10];
        int promedio;

        llenarArray(nums);
        imprimirArray(nums);

        promedio = mediaEnteraArray(nums);

        if( apareceEnArray(nums, promedio) ){
            System.out.println("El promedio es " + promedio + " y aparece en el array.");
        }else{
            System.out.println("El promedio es " + promedio + " y NO aparece en el array.");
        }
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

    static int mediaEnteraArray(int nums[]){
        int suma = 0;

        for (int i = 0; i < nums.length; i++) {
            suma += nums[i];
        }

        return suma/nums.length;
    }

    /**
     * Devuelve el número de apariciones de un valor en un array.
     *
     * @param array Array de enteros
     * @param valor Valor que se busca en el array
     *
     * @return Número de apariciones del valor
     */
    static boolean apareceEnArray(int array[], int valor){
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor){
                return true;
            }
        }

        return false;
    }
}