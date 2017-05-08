package com.artiaga;

import java.util.Scanner;

/**
 * Created by artiaga on 3/2/17.
 */


public class Cancion {

    private String titulo;
    private String autor;
    private String estilo;
    private String formato;
    private int duracion;

    //Constructores

    /**
     * Constructor designado con todos los parametros
     * @param titulo String titulo de la Cancion
     * @param autor String autor de la Cancion
     * @param estilo String estilo de la Cancion
     * @param formato String formato de la Cancion
     * @param duracion String duracion de la Cancion
     */

    public Cancion (String titulo, String autor, String estilo, String formato, int duracion){

        this.titulo = titulo;
        this.autor = autor ;
        this.estilo = estilo;
        this.formato = formato;
        this.duracion = duracion;

    }
    /**
     * Constructor sin parámetros. Se ponen los string a ""
     * menos el String formato que se pone a MP3 y el int duracion que se pone a 0.
     */
    public Cancion (){
        this("","","","MP3",0);

    }

    //Accesores


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        if( duracion < 0){
            System.out.println("La cancion es muy corta");
        }else{
            this.duracion = duracion;
        }
    }

    public String toSexagesimal(int duracion){
        int min, seg;
        min = duracion / 60;
        seg = duracion % 60;
        String resultado = min + " minutos y " +  seg + " segundos ";

        return resultado;
    }

    //Las funciones solo pueden tener 1 funcion
    @Override
    public String toString() {
        return "titulo: " + titulo +
                ", autor: " + autor +
                ", estilo: " + estilo +
                ", formato: " + formato +
                ", duracion: " + toSexagesimal(this.getDuracion()) +
                '}';
    }
}
