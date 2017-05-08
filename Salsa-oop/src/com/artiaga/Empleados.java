package com.artiaga;

/**
 * Created by artiaga on 9/3/17.
 */
public abstract class Empleados {

    private String nombre;
    private String apellidos;
    private String DNI;
    private int numSegSocial;
    private String direccion;
    private int telefono;
    private String correo;

    //Constructores


    public Empleados() {
    }

    public Empleados(String nombre, String apellidos, String DNI, int numSegSocial, String direccion, int telefono, String correo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.numSegSocial = numSegSocial;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }


    //Accesores


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getNumSegSocial() {
        return numSegSocial;
    }

    public void setNumSegSocial(int numSegSocial) {
        this.numSegSocial = numSegSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", DNI='" + DNI + '\'' +
                ", numSegSocial=" + numSegSocial +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", correo='" + correo + '\'' +
                '}';
    }
}
