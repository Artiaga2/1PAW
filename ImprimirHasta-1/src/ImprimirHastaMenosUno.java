import java.util.Scanner;

/**
 * Created by artiaga on 3/11/16.
 */
public class ImprimirHastaMenosUno {


    public static void main(String[] args) {

        double numero, suma = 0, cantidad = 0, media;

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        numero = input.nextDouble();

       while ( numero != -1)
       {
            if (numero > -1)
            {
                cantidad++;
                suma = suma + numero;
                System.out.println("Introduce otro numero");
                numero= input.nextDouble();

            }else{
                System.out.println("Introduce otro numero");
                numero = input.nextDouble();

            }

       }

       if (cantidad > 0) {
           media = suma / cantidad;
           System.out.printf("Has introducido %.0f numeros, su media es %.2f", cantidad, media);

       }else{
           System.out.println("No has introducido ningún numero");
       }

    }
}