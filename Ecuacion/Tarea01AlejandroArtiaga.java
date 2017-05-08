import java.util.Scanner;
public class Tarea01AlejandroArtiaga
{

public static void main (String[] args)

	{

		Scanner input = new Scanner(System.in);

		double a, b, c;
		double resultado1, resultado2;

			System.out.println("Introduce a: ");
			a = input.nextDouble();

			System.out.println("Introduce b: ");
			b = input.nextDouble();

			System.out.println("Introduce c: ");
			c = input.nextDouble();


			resultado1 = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
			resultado2 = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);


			System.out.println("Solucion 1: " + resultado1);
			System.out.println("Solucion 2: " + resultado2);
	}
}
