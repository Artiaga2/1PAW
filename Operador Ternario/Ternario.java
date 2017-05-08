import java.util.Scanner;
public class Ternario
{

public static void main (String[] args)

	{

		Scanner input = new Scanner(System.in);

	   double precioTotal, precio;

    System.out.println("Introduce precio: ");
		precio = input.nextDouble();

    precioTotal = (precio < 100) ? precio * 0.90 : precio * 0.95;
    System.out.println("Precio Total: " + precioTotal);
  }
}
