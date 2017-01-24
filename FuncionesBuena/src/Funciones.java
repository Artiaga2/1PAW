import java.util.Scanner;

public class Funciones
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Llamada a funcion sin parametros
        saludo();

        saludo("Fran");
        System.out.println( calculo(1,2,3) );
        System.out.println("El factorial de 5 es: " + factorial(5));
    }

    // La funcion que no devuelve nada tiene como tipo void.
    // Si no recibe parametros no se indica nada entre los parentesis.
    static void saludo()
    {
        System.out.println("Hola");
    }

    static void saludo(String nombre)
    {
        System.out.println("Hola k ase "+ nombre + "!");
    }

    static int calculo(int x, int y, int z)
    {
        int resultado;
        resultado = (x + y + z) * x * y;
        return resultado;
    }

    static int factorial(int num)
    {
        int resultado = 1;
        for (int i = 1; i <= num ; i++) {
            resultado *= i;
        }
        return resultado;
    }

}
