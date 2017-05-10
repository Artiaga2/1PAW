package com.molina;

/**
 * Created by Fran on 09/05/2017.
 */
public enum Escuderia {
    MCLAREN("McLaren","3º"),
    MERCEDES("Mercedes","2º"),
    FERRARI("Ferrari","1º"),
    REDBULL("Red Bull", "4º");

    private final String NOMBRE;
    private final String POSICION;

    Escuderia(String NOMBRE, String POSICION) {
        this.NOMBRE = NOMBRE;
        this.POSICION = POSICION;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public String getPOSICION() {
        return POSICION;
    }
}
