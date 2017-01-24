/**
 * Created by artiaga on 11/11/16.
 */
public class NumerosAleatorios {

    public static void main (String[] args) {

        double num;
        for (int i = 0; i < 100 ; i++) {
            num = 20 + Math.random() * 10;
            System.out.println(num);
        }
    }

}
