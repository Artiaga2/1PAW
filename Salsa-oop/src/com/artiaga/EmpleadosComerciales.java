package com.artiaga;

/**
 * Created by artiaga on 9/3/17.
 */
public class EmpleadosComerciales extends Empleados {

    private String provincia;
    private int altas;
    private int altasUltimoMes;
    private double sueldo = 850;


    //Constructores


    public EmpleadosComerciales() {
    }

    public EmpleadosComerciales(String nombre, String apellidos, String DNI, int numSegSocial, String direccion, int telefono, String correo, String provincia, int altas, int altasUltimoMes, double sueldo) {
        super(nombre, apellidos, DNI, numSegSocial, direccion, telefono, correo);
        this.provincia = provincia;
        this.altas = altas;
        this.altasUltimoMes = altasUltimoMes;
        this.sueldo = sueldo;
    }

//Accesores


    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getAltas() {
        return altas;
    }

    public void setAltas(int altas) {
        this.altas = altas;
    }

    public int getAltasUltimoMes() {
        return altasUltimoMes;
    }

    public void setAltasUltimoMes(int altasUltimoMes) {
        this.altasUltimoMes = altasUltimoMes;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //Funciones

    public double SueldoComercial (){

        double plus = altasUltimoMes * 12;
        double plusMesesAnteriores = 0;

        if (altas >= 100 && altas < 300) {

            plusMesesAnteriores = (this.getSueldo() * 8) / 100;

        }else if (altas >= 300 && altas < 500){

            plusMesesAnteriores = (this.getSueldo() * 10) / 100;

        }else if (altas >= 500){
            plusMesesAnteriores = (this.getSueldo() * 15) / 100;

        }else{

            this.getSueldo();
        }


        this.setSueldo(this.getSueldo() + plus + plusMesesAnteriores);

        return this.getSueldo();
    }
}
