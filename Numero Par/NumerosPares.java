import java.util.Scanner;
public class NumerosPares
{

public static void main (String[] args)

	{

		Scanner input = new Scanner(System.in);

    final int numero;

    System.out.println("Introduce un numero: ");
    numero = input.nextInt();

    if (numero % 2 == 0)
    {
    System.out.println("El numero " + numero + " es par");
  }else { System.out.println("El numero " + numero + " es impar");
          }
  }
}
