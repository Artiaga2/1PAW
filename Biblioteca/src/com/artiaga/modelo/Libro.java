package com.artiaga.modelo;

import java.util.ArrayList;

/**
 * Created by artiaga on 27/4/17.
 */
public class Libro extends Articulo {

    boolean prestamo;



    public void librosExistentes(){

        ArrayList<Articulo> libros = new ArrayList<>();

        libros.add( new Articulo("", "",23, true));


    }


    //Constructores

    public Libro(String codigo,
                 String titulo,
                 int año,
                 boolean disponibilidad,
                 boolean prestamo) {
        super(codigo, titulo, año, disponibilidad);
        this.prestamo = prestamo;
    }


//Accesores


    public boolean isPrestamo() {
        return prestamo;
    }

    public void setPrestamo(boolean prestamo) {
        this.prestamo = prestamo;
    }
}
