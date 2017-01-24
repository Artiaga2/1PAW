/* */


import java.util.Scanner;

public class gradosuperior
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String titulacion;
        double nota;

        System.out.println("Introduzca su titulacion:");
        titulacion = input.nextLine().toLowerCase();
        //titulacionLowerCase = titulacion.toLowerCase();

        if (titulacion.equals("prueba de acceso") || titulacion.equals("bachiller"))
        {
            if (titulacion.equals("prueba de acceso"))
            {
                System.out.println("Introduzca su nota:");
                nota = input.nextDouble();

                if (nota >= 5) {
                    System.out.println("Puede acceder al grado superior");
                } else {
                    System.out.println("No puede acceder al grado superior");
                }
            }

            if (titulacion.equals("bachiller"))
            {
                System.out.println("Introduzca su nota media:");
                nota = input.nextDouble();

                if (nota >= 6)
                {
                    System.out.println("Puede acceder al grado superior");
                }
                else
                {
                    System.out.println("No puede acceder al grado superior");
                }
            }
        }
        else
        {
            System.out.println("No puede acceder al grado superior");
        }
    }
}
