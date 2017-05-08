package com.artiaga;

/**
 * Created by artiaga on 9/3/17.
 */
public class EmpleadosOficina extends Empleados {

    private int planta;
    private String oficina;
    private String area;
    private String seccion;
    private int años;
    private double sueldo = 1150;


    //Constructores


    public EmpleadosOficina() {

    }

    public EmpleadosOficina(String nombre, String apellidos, String DNI, int numSegSocial, String direccion, int telefono, String correo, int planta, String oficina, String area, String seccion, int años, int sueldo) {
        super(nombre, apellidos, DNI, numSegSocial, direccion, telefono, correo);
        this.planta = planta;
        this.oficina = oficina;
        this.area = area;
        this.seccion = seccion;
        this.años = años;
        this.sueldo = sueldo;
    }


    //Accesores


    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //Funciones

    public double SueldoOficina (){

        int trienio = años / 3;
        double retencion;

        if (trienio > 10){
        trienio = 10;
            this.setSueldo(this.getSueldo() + (trienio*35));

        }else{
            this.setSueldo(this.getSueldo() + (trienio*35));
        }

        retencion =  this.getSueldo() * 18 / 100;

        this.setSueldo(this.getSueldo() - retencion);

        return this.getSueldo();
    }

}
