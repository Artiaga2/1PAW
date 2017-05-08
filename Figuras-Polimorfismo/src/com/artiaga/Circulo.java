package com.artiaga;

/**
 * Created by artiaga on 20/3/17.
 */
public class Circulo extends Figura {

    private double radio;


    //Constructores

    public Circulo() {
        setRadio(Math.random()*50);
    }

    public Circulo(double radio) {
        this.radio = radio;
    }


    //Accesores


    /**
     * Getter de radio
     * @return
     */
    public double getRadio() {
        return radio;
    }


    /**
     * Setter de radio
     * @param radio
     */
    public void setRadio(double radio) {
        if (radio < 0){
            this.radio = 0;

        }else{
            this.radio = radio;
        }
    }

    public double perimetro(){
        return 2 * Math.PI * radio;

    }

    public double area(){
        return 4 * Math.PI * radio * radio;

    }

}
