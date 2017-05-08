import java.util.Scanner;
public class EntreCeroDiez
{

public static void main (String[] args)

	{
	  Scanner input = new Scanner(System.in);

  int nota;

    System.out.println("Introduce nota");
    nota = input.nextInt();

    switch ( nota )
    {
    case 0:
    System.out.println("Dedicate a otra cosa");
    break;
    case 10:
    System.out.println("Matricula de honor");
    break;
    case 9:
    System.out.println("Sobresaliente");
    break;
    case 8:
    case 7:
    System.out.println("Notable");
    break;
    case 6:
    System.out.println("Bien");
    break;
    case 5:
    System.out.println("Suficiente");
    break;
    case 4:
    case 3:
    System.out.println("Defeciente");
    break;
    case 2:
    case 1:
    System.out.println("Muy Deficiente");
    break;

    default:
      System.out.println("Nota invalida");
    }

  }
}
