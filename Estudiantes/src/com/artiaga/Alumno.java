package com.artiaga;

import java.util.Comparator;
import java.util.Objects;

/**
 * Created by artiaga on 26/4/17.
 */
public class Alumno implements Comparable {

    private String nombre;
    private String apellidos;
    private String direccion;
    private String email;
    private String dni;


    //Constructores


    public Alumno(String dni) {
        this.dni = dni;
    }

    public Alumno() {
    }

    public Alumno(String nombre,
                  String apellidos,
                  String direccion,
                  String email,
                  String dni)

    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.email = email;
        this.dni = dni;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }


    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        //Self check
        if (this == obj) {
            return true;
        }

        //null check
        if (obj == null) {
            return false;
        }

        //type check and cast
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        //field comparasion

        Alumno alu = (Alumno) obj;

        return Objects.equals(this.dni, alu.dni);
    }


    @Override
    public int compareTo(Object obj) {

        Alumno alumno = (Alumno) obj;
        int res;

        res = this.getApellidos().compareToIgnoreCase(alumno.getApellidos());

        if (res != 0){
            return res;}

        return this.getNombre().compareToIgnoreCase(alumno.getNombre());
    }

   public static Comparator<Alumno> comparadorPorApellidosNombre = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno alumno1, Alumno alumno2) {

            int res;

            res = alumno1.getApellidos().compareToIgnoreCase(alumno2.getApellidos());

            if (res != 0) {
                return res;


            }
            return alumno1.getNombre().compareToIgnoreCase(alumno2.getNombre());
        }

    };

     public static Comparator<Alumno> comparadorPorTamaño = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno alumno1, Alumno alumno2) {
            return alumno1.getNombre().length() - alumno2.getNombre().length();
        }
    };

}
