import java.util.Scanner;
public class MayorTresNumeros
{

public static void main (String[] args)

	{

		Scanner input = new Scanner(System.in);

		final int a, b, c;

		System.out.println("Introduce 'a': ");
		a = input.nextInt();

		System.out.println("Introduce 'b': ");
		b = input.nextInt();

    System.out.println("Introduce 'c': ");
    c = input.nextInt();

		if (a > b){
			if (a > c){
				if (b > c){
				System.out.println("a > b > c");
			}else{
				System.out.println("a > c > b");
		  }

			}else{
				System.out.println("c > a > b");
			}

			}else{
				if (b > c){
					if (a > c){
						System.out.println("b > a > c ");
					}else{
						System.out.println("b > c > a");
					}
				}else
				System.out.println("c > b > a");
			}
  }
}
