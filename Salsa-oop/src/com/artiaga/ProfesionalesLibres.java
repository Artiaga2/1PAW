package com.artiaga;

/**
 * Created by artiaga on 9/3/17.
 */
public class ProfesionalesLibres extends Empleados {

    private int horasTotales;
    private int horasUltimoServicio;

    //Costructores


    public ProfesionalesLibres() {
    }

    public ProfesionalesLibres(String nombre, String apellidos, String DNI, int numSegSocial, String direccion, int telefono, String correo, int horasTotales, int horasUltimoServicio) {
        super(nombre, apellidos, DNI, numSegSocial, direccion, telefono, correo);
        this.horasTotales = horasTotales;
        this.horasUltimoServicio = horasUltimoServicio;
    }


    //Accesores

    public int getHorasTotales() {
        return horasTotales;
    }

    public void setHorasTotales(int horasTotales) {
        this.horasTotales = horasTotales;
    }

    public int getHorasUltimoServicio() {
        return horasUltimoServicio;
    }

    public void setHorasUltimoServicio(int horasUltimoServicio) {
        this.horasUltimoServicio = horasUltimoServicio;
    }


    //Funciones

    public double sueldoLibres() {


        double sueldo = horasUltimoServicio * 25;
        double plus;
        double impuestos;


        if (horasTotales < 10) {

            plus = 0;

        } else if (horasTotales >= 10 && horasTotales < 25) {

            plus = (sueldo * 3) / 100;

        } else if (horasTotales >= 25 && horasTotales < 50) {

            plus = (sueldo * 5) / 100;
        } else{

            plus = (sueldo * 10) / 100;

        }

        sueldo = sueldo + plus;

        if (sueldo >= 850){
            impuestos = (sueldo * 11) / 100;

        }else{

            impuestos = 0;
        }

        sueldo = sueldo - impuestos;

        return sueldo;

    }

}
