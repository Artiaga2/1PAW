package com.artiaga.modelo;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by artiaga on 10/5/17.
 */
public class Articulo {

    private String nombre;
    private char categoria;
    private double precio;
    private double peso;
    private double volumen;

    private static ArrayList <Articulo> articulos = new ArrayList<>();

    //Constructores

    public Articulo(String nombre, char categoria, double precio, double peso, double volumen) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.peso = peso;
        this.volumen = volumen;
    }


    //Accesores


    public static ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public static void setArticulos(ArrayList<Articulo> articulos) {
        Articulo.articulos = articulos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }


    public static void añadirArticulo(Articulo articulo){
        if (articulo != null){
            articulos.add(articulo);
        }
    }


    public static Comparator <Articulo> comparadorPorNombre = new Comparator<Articulo>() {
        @Override
        public int compare(Articulo articulo1, Articulo articulo2) {
            int res;

            res = articulo1.getNombre().compareToIgnoreCase(articulo2.getNombre());

            if (res != 0){
                return res;
            }
            return  Double.compare(articulo1.getPrecio(), articulo2.getPrecio());
        }
    };

    public static Comparator <Articulo> comparadorPorCategoria = new Comparator<Articulo>() {
        @Override
        public int compare(Articulo articulo1, Articulo articulo2) {
            int res;

            res = Character.compare(articulo1.getCategoria(), articulo2.getCategoria());

            if (res != 0){
                return res;
            }
            return  articulo1.getNombre().compareToIgnoreCase(articulo2.getNombre());
        }
    };

    public static Comparator <Articulo> comparadorPorPrecio = new Comparator<Articulo>() {
        @Override
        public int compare(Articulo articulo1, Articulo articulo2) {
            int res;

            res = Double.compare(articulo1.getPrecio(), articulo2.getPrecio());

            if (res != 0){
                return res;
            }
            return  articulo1.getNombre().compareToIgnoreCase(articulo2.getNombre());
        }
    };

    public static Comparator <Articulo> comparadorPorPeso = new Comparator<Articulo>() {
        @Override
        public int compare(Articulo articulo1, Articulo articulo2) {
            int res;

            res = Double.compare(articulo1.getPeso(), articulo2.getPeso());

            if (res != 0){
                return res;
            }
            return  articulo1.getNombre().compareToIgnoreCase(articulo2.getNombre());
        }
    };


    public static Comparator <Articulo> comparadorPorVolumen = new Comparator<Articulo>() {
        @Override
        public int compare(Articulo articulo1, Articulo articulo2) {
            int res;

            res = Double.compare(articulo1.getVolumen(), articulo2.getVolumen());

            if (res != 0){
                return res;
            }
            return  articulo1.getNombre().compareToIgnoreCase(articulo2.getNombre());
        }
    };

    @Override
    public String toString() {
        return "Articulo{" +
                "nombre='" + nombre + '\'' +
                ", categoria=" + categoria +
                ", precio=" + precio +
                ", peso=" + peso +
                ", volumen=" + volumen +
                '}';
    }
}
