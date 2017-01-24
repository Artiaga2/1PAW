import java.util.Scanner;

public class EntradaTeclado
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    int entero;
    double real;
    String nombre;


    System.out.println("Introduce tu nombre: ");
    nombre = input.nextLine();

    System.out.println("Introduce un entero: ");
    entero = input.nextInt();

    System.out.println("Introduce un real: ");
    real = input.nextDouble();

    System.out.println("nombre: " + nombre);
    System.out.println("Entero: " + entero);
    System.out.println("Real: " + real);
  }

}
