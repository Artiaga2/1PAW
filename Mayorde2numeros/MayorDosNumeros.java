import java.util.Scanner;
public class MayorDosNumeros
{

public static void main (String[] args)

	{

		Scanner input = new Scanner(System.in);

		final int a, b;

		System.out.println("Introduce 'a': ");
		a = input.nextInt();

		System.out.println("Introduce 'b': ");
		b = input.nextInt();

		if (a > b){
			System.out.println("El mayor es 'a', " +a);
		}
		else {
			System.out.println("El mayor es 'b', " +b);
		}
  }
}
