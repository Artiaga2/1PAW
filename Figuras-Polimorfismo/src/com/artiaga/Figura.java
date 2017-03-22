package com.artiaga;

/**
 * Created by artiaga on 20/3/17.
 */
public abstract class Figura {

    public abstract double area ();

    public abstract double perimetro();

    public static Figura figuraAleatoria(){

        int num = (int)(Math.random()*10);

        if (num <= 5){
            return new Circulo();
        }else{
            return new Triangulo();
        }
    }

}
