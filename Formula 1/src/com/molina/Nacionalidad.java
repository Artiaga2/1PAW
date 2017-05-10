package com.molina;

/**
 * Created by User01 on 09/05/2017.
 */
public enum Nacionalidad {
    ESPAÑA("eS"),
    ALEMANIA("aL"),
    RUSIA("rS"),
    ITALIA("iT");

    private final String nacionalidad;

    Nacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
}
