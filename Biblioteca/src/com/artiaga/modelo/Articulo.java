package com.artiaga.modelo;

/**
 * Created by artiaga on 27/4/17.
 */
public class Articulo {

    String codigo;
    String titulo;
    int año;
    boolean disponibilidad;


    //Constructores

    public Articulo(String codigo,
                    String titulo,
                    int año,
                    boolean disponibilidad) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.año = año;
        this.disponibilidad = disponibilidad;
    }


    //Accesores


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
