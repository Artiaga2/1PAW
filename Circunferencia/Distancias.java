public class Distancias{
  public static String ESPACIOS = "%-10s%10s km\n";

  public static void main(String[] args) {

    System.out.printf("DISTANCIAS DESDE SEVILLA\n");
    System.out.printf("========================\n");
    System.out.printf(ESPACIOS, "Madrid", "500");
    System.out.printf(ESPACIOS, "Barcelona", "1000");
    System.out.printf(ESPACIOS, "New york", "10000");
    System.out.printf(ESPACIOS, "Camberra", "100000");
    System.out.printf("========================\n");

  }
}
