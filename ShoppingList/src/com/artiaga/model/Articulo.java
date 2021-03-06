package com.artiaga.model;

/**
 * Created by artiaga on 20/4/17.
 */
public class Articulo {

    private String nombre;
    private double precio;

    //Constructor

    public Articulo(String nombre, double precio) {
        this.setNombre(nombre);
        this.setPrecio(precio);
    }


    //Accesores


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.equals("") ){
            this.nombre = "Sin nombre";

        }else {
            this.nombre = nombre;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {

        if (precio < 0){
            this.precio = 0.0;

        }else {

            this.precio = precio;
        }
    }

    @Override
    public String toString() {
        return "Articulo: " + nombre  +
                " (" + precio + "€)";
    }
}
