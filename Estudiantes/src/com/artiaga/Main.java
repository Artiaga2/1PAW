package com.artiaga;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {


        ArrayList <Alumno> claseProgramacion = new ArrayList<>();

        claseProgramacion.add(new Alumno("Francisco", "Delgado", "Gominola St.", "fran@ymail.com", "1234568A"));
        claseProgramacion.add(new Alumno("Amalia", "delgado", "Avión 4", "amalia@gmail.com", "11223344B"));
        claseProgramacion.add(new Alumno("Luis", "Wonk", "España 23", "soyluis@hotmail.com", "11122233C"));
        claseProgramacion.add(new Alumno("Carlitos", "Alvarez", "Real S/N", "ca@hotmail.com", "87654321D"));
        claseProgramacion.add(new Alumno("Manuela", "Blanco", "Avda. de la O", "mb@mail.com", "12344321E"));

        Collections.sort(claseProgramacion, Alumno.comparadorPorApellidosNombre);


        for (Alumno alumnos :  claseProgramacion) {
            System.out.println(alumnos);

        }
//
//        Alumno loBusco = new Alumno("12345678A");
//        Alumno fran = new Alumno("Francisco", "Delgado", "Gominola St.", "fran@ymail.com", "1234568A");
//
//        if (fran.equals(loBusco)){
//
//            System.out.println("El alumno está matriculado");
//        }else{
//            System.out.println("El alumno NO está matriculado");
//
//        }

    }
}
