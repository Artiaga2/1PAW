/**
 * PSEUDOCÓDIGO
 *
 * Programa: buscaMayorArray
 * Descripción: busca el mayor entero dentro de un array y da su valor y posición.
 * Constantes:
 *  -
 * Variables:
 *  Entero: mayor, posicion, nums[10]
 * Inicio
 *  mayor = [menor entero del tipo]
 *  posición = 0
 *
 *  // Carga del array
 *  Desde i=0 hasta i<longitud(nums) Entonces:
 *      nums[i] = [valor aleatorio entre 1 y 100]
 *  FinDesde
 *
 *  // Buscar elemento mayor y la posición
 *  Desde i=0 hasta i<longitud(nums) Entonces:
 *      Si (nums[i] > mayor) Entonces:
 *          mayor = nums[i];
 *          posicion = i;
 *      FinSi
 *  FinDesde
 *
 *  // Impresión del Array
 *   Desde i=0 hasta i<longitud(nums) Entonces:
 *      Imprime nums[i];
 *  FinDesde
 *  [Salto de línea]
 *
 *  // Impresión de resultados
 *  Imprimir "Mayor: " + mayor
 *  Imprimir "Posicion: " + posicion
 * Fin
 */
public class Arrays1 {

    public static void main(String[] args) {
        int nums[] = new int[10];
        int mayor = Integer.MIN_VALUE;
        int posicion = 0;

        // Cargar array con datos
        for (int i = 0; i < nums.length; i++) {
            // Se carga el array con valores aleatorios entre 1 y 100
            nums[i] = (int)(Math.random()*100+1);
        }

        // Buscar elemento mayor y la posición
        for (int i = 0; i < nums.length; i++) {
            // Si el elemento nums[i] supera el mayor valor guardado
            // se guarda con mayor valor y se guarda la posición 'i'
            if(nums[i] > mayor){
                mayor = nums[i];
                posicion = i;
            }
        }

        // Impresión del array
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%3d", nums[i]);
        }
        System.out.println();   // Salto de línea

        // Impresión de resultados
        System.out.println("Mayor: "+mayor);
        System.out.println("Posición: "+posicion);
    }
}