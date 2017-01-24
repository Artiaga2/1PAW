import java.util.Scanner;

public class cantidadNumeros
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double num, suma = 0, cantidadNum = 0, media;

        System.out.println("Introduce un numero:");
        num = input.nextInt();

        while ( num != 0)
        {
            if (num > 0)
            {
                cantidadNum++;
                suma += num;
                System.out.println("Introduce otro numero:");
                num = input.nextDouble();
            }
            else
            {
                System.out.println("Introduce otro numero:");
                num = input.nextDouble();
            }
        }

        media = suma / cantidadNum;
        System.out.printf("Has introducido %.0f numeros, su media aritmetica es %.2f", cantidadNum, media);
    }
}

