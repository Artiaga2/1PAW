package com.artiaga;

/**
 * Created by artiaga on 8/5/17.
 */
public enum PuntoCardinal {

    ESTE ('E', 'E'),
    OESTE('O', 'W'),
    NORTE('N', 'N'),
    SUR('S', 'S');

    private final char letraPuntoCardinalEs;
    private final char letraPuntoCardinalEn;


    // Constructor

    PuntoCardinal(char codigoEs, char codigoEn){

        this.letraPuntoCardinalEs = codigoEs;
        this.letraPuntoCardinalEn = codigoEn;
    }

    //Getter

    public char getLetraPuntoCardinalEs(){
        return this.letraPuntoCardinalEs;
    }


    public char getLetraPuntoCardinalEn(){
        return this.letraPuntoCardinalEn;
    }
}
