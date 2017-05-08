import java.util.Scanner;

/**
 * Created by artiaga on 3/11/16.
 */
public class TotalAlumnos {

    public static void main (String[] args) {

        int alumnos, alumnas;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el número de alumnos: ");
        alumnos = input.nextInt();
        System.out.println("Introduce el número de alumnas: ");
        alumnas = input.nextInt();

        int total = alumnos + alumnas;

        System.out.println("El numero total de alumn@s es: " + total);

        double totalAlumnos = (alumnos * 100) / total;
        System.out.printf("El porcentaje de alumnos es: %.1f%%\n", totalAlumnos);

        double totalAlumnas = (alumnas * 100) / total;
        System.out.printf("El porcentaje de alumnos es: %.1f%%\n", totalAlumnas);

    }
}