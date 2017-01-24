import java.util.Scanner;

/**
 * Created by artiaga on 3/11/16.
 */
public class Descuento {

    public static void main(String[] args) {

        Double importe;
        String mes;

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el importe ");
        importe = input.nextDouble();

        System.out.println("Introduce el mes ");
        mes = input.next().toLowerCase();


        if (mes.equals("junio") ||
            mes.equals("julio") ||
            mes.equals("agosto")
            )
        {

            importe *= 0.8;

                System.out.println("El importe es : " + importe);

        }else{
            System.out.println("El importe es : " + importe);
        }
    }
}