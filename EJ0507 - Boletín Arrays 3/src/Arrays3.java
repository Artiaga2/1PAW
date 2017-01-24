/**
 * PSEUDOCÓDIGO
 *
 * Descripción: Guarda los 10 primero elementos de la serie de Fibonacci en un array
 *
 * Constantes:
 *      Entero: DIM = 10
 *
 * Variables:
 *      Entero: fibo[DIM], i
 *
 * Inicio
 *
 *      fibo[0] = 0
 *      fibo[1] = 1
 *
 *      Desde i = 2 hasta i < [Logitud fibo]
 *          fibo[i] = fibo[i-1] + fibo[i-2]
 *      FinDesde
 *
 *      Desde i = 0 hasta i < [Logitud fibo]
 *          Imprimir fibo[i]
 *      FinDesde
 *  Fin
 */
public class Arrays3 {

    public static void main(String[] args) {
        final int DIM = 10;
        int fibo[] = new int[DIM];

        // Inicialización de los 2 primeros elementos de la serie (dado por deficinión)
        fibo[0] = 0;
        fibo[1] = 1;

        // Calculo los elementos del array (del 2 al 9)
        for (int i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i-1] +  fibo[i-2];
        }

        // Imprimir array
        for (int i = 0; i < fibo.length; i++) {
            System.out.printf(" %d", fibo[i]);
        }
    }
}