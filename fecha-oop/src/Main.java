/**
 * Created by artiaga on 25/1/17.
 */
public class Main {

    public static void main (String[] args) {

        Fecha hoy = new Fecha();
        Fecha ayer = new Fecha();

        hoy.setDay(25);
        hoy.setMonth(1);
        hoy.setYear(2017);

        ayer.setDay(24);
        ayer.setMonth(1);
        ayer.setYear(2017);

        System.out.printf("Ayer: %1d",ayer.getDay());
        System.out.printf("/%1d",ayer.getMonth());
        System.out.printf("/%1d",ayer.getYear());

        System.out.println();

        System.out.printf("Hoy: %1d",hoy.getDay());
        System.out.printf("/%1d",hoy.getMonth());
        System.out.printf("/%1d",hoy.getYear());


    }
}
