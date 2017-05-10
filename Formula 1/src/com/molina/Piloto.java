package com.molina;

import java.util.Scanner;

/**
 * Created by Fran on 09/05/2017.
 */
public class Piloto {

    // Atributos

    private String nombre;
    private String dorsal;
    private Nacionalidad nacionalidad;
    private Escuderia escuderia;
    private TipoPiloto tipoPiloto;

    // Constructores

    public Piloto() {
    }

    public Piloto(String nombre, String dorsal, Nacionalidad nacionalidad, Escuderia escuderia, TipoPiloto tipoPiloto) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.nacionalidad = nacionalidad;
        this.escuderia = escuderia;
        this.tipoPiloto = tipoPiloto;
    }

    // Metodos

    public static Piloto resgistrarPiloto(){
        String nombre;
        String dorsal;
        String nacionalidad;
        String escuderia;
        String tipoPiloto;

        Scanner input = new Scanner(System.in);

        System.out.println("Introduzca el nombre del piloto:");
        nombre = input.nextLine();
        System.out.println("Introduzca el dorsal del piloto:");
        dorsal = input.nextLine();
        System.out.println("Introduzca la nacionalidad del piloto:");
        nacionalidad = input.nextLine().toUpperCase();
        System.out.println("Introduzca la escuderia del piloto:");
        escuderia = input.nextLine().toUpperCase();
        System.out.println("Introduzca el tipo de piloto");
        tipoPiloto = input.nextLine().toUpperCase().replace(" ","");

        return new Piloto(nombre,dorsal,Nacionalidad.valueOf(nacionalidad),Escuderia.valueOf(escuderia),TipoPiloto.valueOf(tipoPiloto));
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre + '\n' +
                "Dorsal: " + dorsal + '\n' +
                "Nacionalidad: " + nacionalidad.getNacionalidad() + '\n' +
                "Escuderia: " + escuderia.getNOMBRE() + '\n' +
                "Posicion Escuderia: " + escuderia.getPOSICION() + '\n' +
                "TipoPiloto: " + tipoPiloto.getTIPO_PILOTO() + '\n';
    }

    // Accesores

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Escuderia getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(Escuderia escuderia) {
        this.escuderia = escuderia;
    }

    public TipoPiloto getTipoPiloto() {
        return tipoPiloto;
    }

    public void setTipoPiloto(TipoPiloto tipoPiloto) {
        this.tipoPiloto = tipoPiloto;
    }
}
