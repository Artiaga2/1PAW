public class Circunferencia
{
  public static void main(String[] args)
  {
    final double PI = 3.141592;
    double radio, perimetro;
    perimetro = radio = 0.0;

    radio = 30;

    perimetro = 2 * PI * radio;
    System.out.println("La longitud del circulo de radio " + radio + " es " + perimetro);
  }
}
