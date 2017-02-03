package com.artiaga;

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

    //Constuctor designado
    public Cancion (String titulo, String autor, String estilo, String formato, int duracion){

        this.titulo = titulo;
        this.autor = autor ;
        this.estilo = estilo;
        this.formato = formato;
        this.duracion = duracion;

    }

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

    @Override
    public String toString() {
        int min, seg;
        min = duracion / 60;
        seg = duracion - min * 60;
        return "titulo: " + titulo +
                ", autor: " + autor +
                ", estilo: " + estilo +
                ", formato: " + formato +
                ", duracion: " + min + " minutos y " + seg + " segundos" +
                '}';
    }
}
