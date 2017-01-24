/**
 * PSEUDOCÓDIGO
 *
 * Programa: buscaMayorPrimoArray
 *
 * Descripción: busca el mayor primo dentro de un array y da su valor y posición.
 *
 * Constantes:
 *  Entero: DIM = 10
 *  Entero: LIMITE_INFERIOR = 100
 *
 * Variables:
 *  Entero: indice, numero, primos[10], i
 *
 * Inicio
 *  indice = 0
 *  numero = LIMITE_INFERIOR
 *
 *  Mientras ( indice < [Longitud primos] )
 *      Si ( esPrimo(numero) ) Entonces:
 *          primos[indice] = numero;
 *          indice++;
 *      FinSI
 *  FinMientras
 *
 *  Desde i=0 Hasta i < [Logitud primos]
 *      Imprimir primos[i]
 *  FinDesde
 *
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
public class Arrays4 {

    public static void main(String[] args) {
        // Constantes
        final int DIM = 10;                 // Tamaño del array
        final int LIMITE_INFERIOR = 100;    // Constante que indica el número a partir del cual se buscan los primos

        int primos[] = new int[DIM];
        int indice = 0, numero = LIMITE_INFERIOR;

        // Buscar elemento mayor y la posición
        while( indice < primos.length){
            if(esPrimo(numero)){
                primos[indice] = numero;
                indice++;
            }
            numero++;
        }

        // Impresión de resultados
        for (int i = 0; i < primos.length; i++) {
            System.out.printf(" %d", primos[i]);
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