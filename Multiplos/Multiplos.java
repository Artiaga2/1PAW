import java.util.Scanner;
public class Multiplos
{

public static void main (String[] args)

	{

		Scanner input = new Scanner(System.in);

		final int a, b;

    System.out.println("Introduce 'a': ");
		a = input.nextInt();

		System.out.println("Introduce 'b': ");
		b = input.nextInt();

    if (a % b == 0){
			System.out.println(" 'a' es multiplo de 'b' ");
		}else {

    	System.out.println(" 'a' no es multiplo de 'b' ");
    }
  }
}
