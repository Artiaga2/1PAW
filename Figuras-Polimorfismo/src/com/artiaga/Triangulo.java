package com.artiaga;

/**
 * Created by artiaga on 20/3/17.
 */
public class Triangulo extends Figura {

    private double base;
    private double altura;


    //Constructores


    public Triangulo() {

        this(Math.random() * 50,Math.random() * 50);


    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    //Accesores


    public double getBase() {
        return base;
    }

    public void setBase(double base) {

        if (base < 0){
            this.base = 0;

        }else{
            this.base = base;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 0){
            this.altura = 0;

        }else{
            this.altura = altura;
        }
    }

    //Metodos


    @Override
    public double area() {
        return base * altura / 2;
    }

    @Override
    public double perimetro() {
        return 123.24;
    }
}
