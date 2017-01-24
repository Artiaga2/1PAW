/**
 * PSEUDOCÓDIGO
 *
 * Programa: buscaMayorPrimoArray
 * Descripción: busca el mayor primo dentro de un array y da su valor y posición.
 * Constantes:
 *  -
 * Variables:
 *  Entero: maxPrime, posicion, nums[10]
 * Inicio
 *  max = [menor entero del tipo]
 *  posición = -1
 *
 *  // Carga del array
 *  Desde i=0 hasta i<longitud(nums) Entonces:
 *      nums[i] = [valor aleatorio entre 1 y 100]
 *  FinDesde
 *
 *  // Impresión del Array
 *   Desde i=0 hasta i<longitud(nums) Entonces:
 *      Imprime nums[i];
 *  FinDesde
 *  [Salto de línea]
 *
 *  // Buscar elemento mayor y la posición
 *  Desde i=0 hasta i<longitud(nums) Entonces:
 *      Si ( esPrimo(nums[i]) ) Entonces:
 *          Si (nums[i] > maxPrime) Entonces:
 *              maxPrime = nums[i];
 *              posicion = i;
 *          FinSi
 *      FinSi
 *  FinDesde
 *
 *  // Impresión de resultados
 *  Si ( posicion != -1) Entonces:
 *      Imprimir "Máximo: " + max
 *      Imprimir "Posicion: " + posicion
 *  SiNo
 *      Imprimir "La tabla no contiene ningún primo"
 *  FinSi
 * Fin
 *
 * Función: esPrimo
 * Descripción: Calcula si el número recibido como parámetro es primo.
 * Recibe:
 *  Entero: num
 * Devuelve:
 *  Boolean: esPrimo
 * Constantes:
 *  -
 * Variables:
 *  Entero: i
 * Inicio
 *  Desde i=2 hasta i < Raíz2(num)
 *      Si (num % i == 0) Entonces
 *          Devolver false
 *      FinSi
 *  FinDesde
 *
 *  Devolver true
 * FinFunción
 */
public class Arrays2 {

    public static void main(String[] args) {
        int nums[] = new int[10];
        int maxPrime = Integer.MIN_VALUE;
        int posicion = -1;

        // Cargar array con datos
        for (int i = 0; i < nums.length; i++) {
            // Se carga el array con valores aleatorios entre 1 y 100
            nums[i] = (int)(Math.random()*100+1);
        }

        // Impresión del array
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%3d", nums[i]);
        }
        System.out.println();   // Salto de línea

        // Buscar elemento mayor y la posición
        for (int i = 0; i < nums.length; i++) {
            // Si el elemento nums[i] supera el mayor valor guardado
            // se guarda con mayor valor y se guarda la posición 'i'
            if(esPrimo(nums[i])){
                if(nums[i] > maxPrime){
                    maxPrime = nums[i];
                    posicion = i;
                }
            }
        }

        // Impresión de resultados
        if (posicion != -1){
            System.out.println("Mayor Primo: " + maxPrime);
            System.out.println("Posición: "+posicion);
        }else{
            System.out.println("La tabla no contiene ningún primo.");
        }

    }

    static boolean esPrimo(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }
}