package com.artiaga.model;

import com.artiaga.model.Automovil;

/**
 * Created by artiaga on 16/2/17.
 */
public class Taxi extends Automovil {

    private String horario;
    private String licencia;

    //Constructores


    public Taxi(String horario, String licencia) {
        this.horario = horario;
        this.licencia = licencia;
    }

    public Taxi(String marca, String modelo, String matricula, String horario, String licencia) {
        super(marca, modelo, matricula);
        this.horario = horario;
        this.licencia = licencia;
    }


    //Accesores


    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    //Override


    @Override
    public String toString() {
        return super.toString() + "Taxi{" +
                "horario='" + horario + '\'' +
                ", licencia='" + licencia + '\'' +
                '}';
    }

    //Metodos
    public void iniciarCarrera(){}

    public void finalizarCarrera(){}

    public void cobrarCarrera(){}

}
