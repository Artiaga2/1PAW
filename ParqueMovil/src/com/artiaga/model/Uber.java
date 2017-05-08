package com.artiaga.model;

/**
 * Created by artiaga on 17/2/17.
 */
public class Uber extends Taxi {

    private String color;

    public Uber(String horario,
                String licencia,
                String color) {
        super(horario, licencia);
        this.color = color;
    }

    public Uber(String marca,
                String modelo,
                String matricula,
                String horario,
                String licencia,
                String color) {
        super(marca, modelo, matricula, horario, licencia);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return super.toString() + "Uber{" +
                "color='" + color + '\'' +
                '}';
    }
}
