package com.artiaga.model;

import java.util.Objects;

/**
 * Created by artiaga on 16/2/17.
 */
public class Automovil {

    public String marca;
    protected String modelo;
    protected String matricula;


    public Automovil() {

    }

    public Automovil(String marca, String modelo, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    //Accesores
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    //Override

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }


    //Métodos

    public void arrancar(){}

    public void frenar(){}

    public void repostar(){}
}
