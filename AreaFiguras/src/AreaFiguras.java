import java.util.Scanner;

/**
 * Created by artiaga on 16/11/16.
 */
public class AreaFiguras {

    public static void main(String[] args) {

        int  opcion;
        double base, altura, radio, triangulo, rectangulo, pentagono, circulo, lado, apotema, perimetro;

        Scanner input = new Scanner(System.in);




        do {

            System.out.println("################");
            System.out.println("#  SUPER ÁREA  #");
            System.out.println("################");
            System.out.println("#              #");
            System.out.println("1#  Triángulo  #");
            System.out.println("2#  Rectangulo #");
            System.out.println("3#  Pentagono  #");
            System.out.println("4#   Circulo   #");
            System.out.println("0#    Salir    #");
            System.out.println("#______________#");
            System.out.println("Introduce opción");
            opcion = input.nextInt();

            if (opcion == 1){
                System.out.println("Introduce base  ");
                base = input.nextDouble();
                System.out.println("Introduce altura  ");
                altura = input.nextDouble();
                triangulo = base * altura / 2;
                System.out.println("El area del triangulo es igual a " + triangulo);
            }

            else if (opcion == 2){
                System.out.println("Introduce base  ");
                base = input.nextDouble();
                System.out.println("Introduce altura  ");
                altura = input.nextDouble();
                rectangulo = base * altura / 2;
                System.out.println("El area del rectangulo es igual a " + rectangulo);
            }

            else if (opcion == 3){
                System.out.println("Introduce lado  ");
                lado = input.nextDouble();
                perimetro = lado * 5;
                System.out.println("Introduce apotema  ");
                apotema = input.nextDouble();
                pentagono = perimetro * apotema / 2;
                System.out.println("El area del pentagono es igual a " + pentagono);
            }

            else if (opcion == 4){
                System.out.println("Introduce radio  ");
                radio = input.nextDouble();
                circulo = 3.14 * radio * radio;
                System.out.println("El area del circulo es igual a " + circulo);
            }

        } while (opcion != 0);
            System.out.println("Has acabado");

    }
}
