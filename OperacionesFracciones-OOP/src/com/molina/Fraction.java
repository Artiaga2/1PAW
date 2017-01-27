package com.molina;

import java.util.stream.Stream;

/**
 * Created by FraN on 26/01/2017.
 */
public class Fraction {

    private int numerator;
    private int denominator;

    //Constructores

    /**
     * Constructor de conveniencia sin parametros. Pone la fraccion
     * como 1/1
     */
    public Fraction(){
        this(1,1);
    }

    /**
     * Constructor de conveniencia con un parametro. Pone la fraccion
     * como num/1
     * @param num
     */
    public Fraction(int num){
        this(num,1);
    }

    /**
     * Constructor designado. Da valor a todos los parametros. Pone la fraccion
     * como num/den
     * @param num
     * @param den
     */
    public Fraction(int num, int den){
        this.setNumerator(num);
        this.setDenominator(den);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    /**
     * Metodo que suma dos fracciones.
     * @param fraction2
     * @return
     */
    public Fraction plus(Fraction fraction2){
        int suma = 0, mcm = 0;

        mcm = this.MCM(fraction2);

        suma = (mcm/this.getDenominator())* this.getNumerator() + (mcm/fraction2.getDenominator())*fraction2.getNumerator();

        return new Fraction(suma,mcm).simplify();
    }

    /**
     * Metodo que resta dos fracciones.
     * @param fraction2
     * @return
     */
    public Fraction minus(Fraction fraction2){
        int resta, mcm;

        mcm = this.MCM(fraction2);

        resta = (mcm/this.getDenominator())* this.getNumerator() - (mcm/fraction2.getDenominator())*fraction2.getNumerator();

        return  new Fraction(resta,mcm).simplify();
    }

    /**
     * Metodo que multiplica dos fracciones.
     * @param fraction2
     * @return
     */
    public Fraction times(Fraction fraction2){
        int numRes, denRes;
        numRes = this.getNumerator() * fraction2.getNumerator();
        denRes = this.getDenominator() * fraction2.getDenominator();

        return new Fraction(numRes,denRes).simplify();
    }

    /**
     * Metodo que divide dos fracciones
     * @param fraction2
     * @return
     */
    public Fraction dividedBy(Fraction fraction2){
        int numRes, denRes;
        numRes = this.getNumerator() * fraction2.getDenominator();
        denRes = this.getDenominator() * fraction2.getNumerator();

        return new Fraction(numRes,denRes).simplify();
    }

    public String mix (){
        int num, den, numero;
        String resultado = "";


        numero = this.getNumerator() / this.getDenominator();
        num = this.getNumerator() % this.getDenominator();
        den = this.getDenominator();
        resultado = numero + " " + num + "/" + den;
        return resultado;
    }

    /**
     * Metodo que simplifica una fraccion.
     * @return
     */
    private Fraction simplify(){
        int num,den;
        int min = Math.min(this.getNumerator(), this.getDenominator());
        int max = Math.max(this.getNumerator(), this.getDenominator());

        while(min != 0){
            int t = min;
            min = max % min;
            max = t;
        }

        num = this.getNumerator();
        den = this.getDenominator();

        num /= max;
        den /= max;

        return new Fraction(num,den);
    }

    /**
     * Metodo que calcula el maximo comun divisor de dos fracciones.
     * @param fraction2
     * @return
     */
    public int MCD(Fraction fraction2){
        int min = Math.min(this.getDenominator(), fraction2.getDenominator());
        int max = Math.max(this.getDenominator(), fraction2.getDenominator());

        while(min != 0){
            int t = min;
            min = max % min;
            max = t;
        }
        return max;
    }

    /**
     * Metodo que calcula el minimo comun multiplo de dos fracciones.
     * @param fraction2
     * @return
     */
    public int MCM(Fraction fraction2){
        int max = Math.max(this.getDenominator(), fraction2.getDenominator());
        int min = Math.min(this.getDenominator(), fraction2.getDenominator());

        int mcm = (max * min ) / this.MCD(fraction2);
        return mcm;

    }

    public String toString(){
        String resultado = "";

        resultado = this.getNumerator() + "/"
                + this.getDenominator();

        return resultado;
    }
}