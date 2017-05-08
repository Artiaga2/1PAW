import java.util.Arrays;

/**
 * Created by artiaga on 9/12/16.
 */
public class Primitiva {

    public static void main(String[] args) {

        int numero;
        int ganadora[] = {32, 7, 19, 8, 5, 4};
        int apuestas[][] = new int[2][6];

        for (int i = 0; i < apuestas.length; i++) {
            for (int j = 0; j < apuestas[i].length; j++) {
                //Genero el valor a aleatorio
                //Compruebo que el valor aleatorio no exista en el array
                //Si el valor no existe, agrego un nuevo valor
                do {
                    numero = (int) (Math.random() * 49 + 1);
                }while(arrayContiene(apuestas[i], numero));

                apuestas[i][j] = numero;
            }
            Arrays.sort(ganadora);
            Arrays.sort(apuestas[i]);
            showMeTheArray(apuestas[i]);
        }

        if (ganadora.equals(apuestas)){
            System.out.println("Has ganado");
            showMeTheArray(ganadora);
        }else{
            System.out.println("Has perdido");
            showMeTheArray(ganadora);
        }
    }

    //Imprimir los arrays
    public static void showMeTheArray(int apuesta[]) {
        for (int i = 0; i < apuesta.length; i++) {
            System.out.printf("%3d", apuesta[i]);


        }
        System.out.println();
    }

    public static boolean arrayContiene(int apuesta[], int numero) {
        for (int i = 0; i < apuesta.length; i++) {
            if (apuesta[i] == numero) {
                return true;
            }
        }
        return false;
    }
}



