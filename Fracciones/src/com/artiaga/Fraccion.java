package com.artiaga;

/**
 * Created by artiaga on 9/3/17.
 */
public class Fraccion {

    private int numerador;
    private int denominador;

    //Constructores


    /*public Fraccion() {
    }
*/
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;

        if (this.denominador != 0){

            this.denominador=denominador;

        }else {

            this.denominador = 1;


        }
    }


    //Accesores


    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        if (this.denominador != 0) {

            this.denominador = denominador;

        } else {

            this.denominador = 1;


        }

    }

    @Override
    public String toString() {
        return "Fraccion{" +
                "numerador=" + numerador +
                ", denominador=" + denominador +
                '}';
    }
}
