package com.artiaga.model;
import java.util.ArrayList;

/**
 * Created by artiaga on 20/4/17.
 */
public class ShoppingList {

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    private ArrayList<Articulo> articulos;

    public ShoppingList() {

        articulos = new ArrayList<>();
    }

    public void addArticulo(Articulo articulo){
        if (articulo != null) {
            articulos.add(articulo);
        }

    }

    public void showArticulos(){
        for (Articulo articulo: articulos) {

            System.out.println(articulo);

        }

    }

}
