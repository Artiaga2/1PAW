/**
 * Created by artiaga on 24/11/16.
 */
public class Funciones {

    public static void main (String[] args) {
        //Llamada a funcion sin parametros

        saludo();
        System.out.println("Pos ná");
        saludo("Fran");
    }

        //La funcion que no devuelve nada tiene como tipo void
        //Si no recibe parametros no se indica nada entre los paréntesis
    static void saludo (){
        System.out.println("Hola");
        System.out.println("K");
        System.out.println("ase");
    }

    static void saludo (String nombre) {
        System.out.println("Hola que ase " + nombre + "!");

    }
    
}
