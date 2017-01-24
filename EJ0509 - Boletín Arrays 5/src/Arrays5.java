/**
 * PSEUDOCÓDIGO
 *
 * Descripción: Leer 10 números enteros, almacenarlos en un vector y determinar en qué posiciones se encuentran los
 *              números terminados en 4.
 *
 * Constantes:
 *      Entero: DIM = 10
 *
 * Variables:
 *      Entero: nums[DIM];
 *
 * Inicio
 *
 *      Desde i = 0 hasta i < [Longitud nums]
 *          nums[i] = [Aleatorio entre 1 y 100]
 *          Imprimir nums[i]
 *      FinDesde
 *
 *      [Salto de línea];
 *
 *      Desde i = 0 hasta i < [Longitud nums]
 *          Si ( nums[i] % 10 == 0 ) Entonces:
 *              Imprimir "Posición: " + i
 *          FinSi
 *      FinDesde
 *
 *  Fin
 */
public class Arrays5 {

    public static void main(String[] args) {
        // Constantes
        final int DIM = 10;

        // Variables
        int nums[] = new int[DIM];

        //Rellenar el array y se comprueba si el nuevo número termina en 4
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random()*100+1);
            System.out.printf(" %d", nums[i]);
        }

        System.out.println();

        for (int i = 0; i < nums.length; i++) {
            // Para comprobar si un número es terminado en 4 compruebo su módulo 10
            if (nums[i] % 10 == 4){
                System.out.println("Posición: "+i);
            }
        }
    }
}