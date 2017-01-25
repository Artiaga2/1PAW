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

    public static void main (String[] args) {

    mayorEntero();

    }



    static int mayorEntero(){
        int mayor = 0, posicion = 0;
        int array [] = new int [10];

        for (int i = 0 ; i < array.length; i++){
            array [i] = (int) (Math.random() * 100 + 1);
            if (array [i] > mayor){
                mayor = array[i];
                posicion = i;
            }

        }
        return mayor;
    }

    static void imprimirArray (){
        mayorEntero();

    }
}