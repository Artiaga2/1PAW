package model;

/**
 * Created by artiaga on 18/4/17.
 */
public class Articulo extends ListaCompra {

    //Atributos

    String nombre;
    double precio;

    //Conbstructores


    public Articulo() {
    }

    public Articulo(String nombre, double precio) {
        this.setNombre(nombre);
        this.setPrecio(precio);
    }


    //Accesores


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        if (this.nombre == ""){

            System.out.println("EL nombre no puede estar vacío");
            return ListaCompra.showmenu(tasklist);
        }
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
