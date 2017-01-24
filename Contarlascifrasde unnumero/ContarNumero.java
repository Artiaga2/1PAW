import java.util.Scanner;

public class ContarNumero
{

	public static void main (String[] args)
	{

			Scanner input = new Scanner(System.in);

			int numero, cifras;
			cifras = 0;

	    System.out.println("Introduce un numero entra 1 y 9999:");
	    numero = input.nextInt();


			if (numero >=0 && numero <= 9999)
			{
			if(numero >= 0)
			{
				cifras = cifras +1;
				numero = numero /10;
			}
			if(numero > 0)
			{
				cifras = cifras +1;
				numero = numero /10;
			}
			if(numero > 0)
			{
				cifras = cifras +1;
				numero = numero /10;
			}
			if(numero > 0)
			{
				cifras = cifras +1;
				numero = numero /10;
			}
			System.out.println("El numero tiene " + cifras + " cifras.");
			}
			else{
				System.out.println("El numero no está dentro del rango pedido.");

			}
  }
}
