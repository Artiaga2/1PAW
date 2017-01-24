/*Enunciado

        Hacer un programa que dados dos arrays de una dimensión determine si son iguales.
*/
public class Arrays12 {

    public static void main(String[] args) {
        int matriz1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int matriz2[] = {1, 2, 3, 4, 5, 6, 7, 8};

        if( sonIguales(matriz1, matriz2) ){
            System.out.println("Los arrays son iguales");
        }else{
            System.out.println("Los arrays son diferentes");
        }
    }

    static boolean sonIguales(int array1[], int array2[]){
        if( array1.length != array2.length ){
            return false;
        }else{
            for (int i = 0; i < array1.length; i++) {
                if( array1[i] != array2[i] ){
                    return false;
                }
            }
        }

        return true;
    }
}
