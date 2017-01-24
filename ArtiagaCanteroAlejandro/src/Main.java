import java.util.Scanner;

/**
 * Created by artiaga on 14/12/16.
 */
public class Main {

    public static void main(String[] args) {
        int tiradas[];
        int porcentaje[] = new int[7];
        int numeroTiradas;
        int uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0, seis = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el numero de tiradas");
        numeroTiradas = input.nextInt();
        tiradas = new int[numeroTiradas];
        //Recorremos el array una vez hemos obtenido el numero de tiradas
        //Randomizamos todos los vectores del array del 1 al 6
        //Almacenamos el numero de tiradas en el array porcentaje en la posicion 0
        for (int i = 0; i < tiradas.length; i++) {
            tiradas[i] = numeroTiradas;
            tiradas[i] = (int) (Math.random() * 6 + 1);
            porcentaje[0] = numeroTiradas;
        }

        //recorremos el array tiradas [i] y si es igual a algun numero del 1 al 6 le sumamos 1 a su variable
        //la variable la almacenamos en el segundo array porcentaje en la posicion correspondiente

        for (int i = 0; i < tiradas.length; i++) {

            if (tiradas[i] == 1) {

                uno++;
                porcentaje[1] = uno;
            }
            if (tiradas[i] == 2) {
                dos++;
                porcentaje[2] = dos;
            }
            if (tiradas[i] == 3) {
                tres++;
                porcentaje[3] = tres;
            }
            if (tiradas[i] == 4) {
                cuatro++;
                porcentaje[4] = cuatro;
            }
            if (tiradas[i] == 5) {
                cinco++;
                porcentaje[5] = cinco;
            }
            if (tiradas[i] == 6) {
                seis++;
                porcentaje[6] = seis;
            }

        }

        System.out.println("SIMULACIÓN DE TIRADAS");
        System.out.println("=====================");
        //Recorremos el array tiradas y lo imprimimos
        for (int i = 0; i < tiradas.length; i++) {
            System.out.printf("%3d", tiradas[i]);

        }
        System.out.println();
        System.out.println("CONTABILIZACIÓN");
        //Recorremos el array porcentaje y lo imprimimos
        for (int i = 0; i < porcentaje.length; i++) {
            System.out.printf("%3d", porcentaje[i]);

        }
        System.out.println();
        System.out.println("RESUMEN");
        System.out.println("=====================");
        System.out.printf("1: (",uno);
        System.out.printf("%.2f",(double) uno / numeroTiradas * 100);
        System.out.print("%)");
        System.out.println();
        System.out.printf("2: (",dos);
        System.out.printf("%.2f",(double) dos / numeroTiradas * 100);
        System.out.print("%)");
        System.out.println();
        System.out.printf("3: (",tres);
        System.out.printf("%.2f",(double) tres / numeroTiradas * 100);
        System.out.print("%)");
        System.out.println();
        System.out.printf("4: (",cuatro);
        System.out.printf("%.2f",(double) cuatro / numeroTiradas * 100);
        System.out.print("%)");
        System.out.println();
        System.out.printf("5: (",cinco);
        System.out.printf("%.2f",(double) cinco / numeroTiradas * 100);
        System.out.print("%)");
        System.out.println();
        System.out.printf("6: (",seis);
        System.out.printf("%.2f",(double) seis / numeroTiradas * 100);
        System.out.print("%)");
        System.out.println();
    }

}

