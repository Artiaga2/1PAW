import java.util.Scanner;

public class DiasDeSemana
{

	public static void main (String[] args)
	{

			Scanner input = new Scanner(System.in);

	    System.out.println("Introduce el dia de la semana");
	    String diaSemana = input.next();

			switch ( diaSemana )
			{
			case "Lunes":
			case "Martes":
			case "Miercoles":
			case "Jueves":
			case "Viernes":
				System.out.println("Dia Laborable");
				break;
			case "Sabado":
			case "Domingo":
				System.out.println("Dia Festivo");
				break;
			default:
				System.out.println("Dia no valido");
		  }
	}
}
