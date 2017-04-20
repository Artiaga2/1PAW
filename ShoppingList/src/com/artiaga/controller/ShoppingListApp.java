package com.artiaga.controller;


import java.util.Scanner;
import com.artiaga.model.*;

/**
 * Created by artiaga on 20/4/17.
 */
public class ShoppingListApp {

    ShoppingList shoppingList;

   //Constructor

    public ShoppingListApp() {

        shoppingList = new ShoppingList();

    }

    //Metodos

    public  void run(){

        int option;

        while((option = showMenu())!= 0){
            switch (option){
                case 1:
                    leerProducto();
                    break;
                case 2:

                    break;
                case 3:
                    shoppingList.showArticulos();
                    break;
                case 4:
                    break;

                    default:

            }
        }


    }



    private void leerProducto() {

        Scanner scanner = new Scanner(System.in);

        String nombre;
        double precio;
        Articulo articulo;

        System.out.println("Nombre del articulo");
        nombre = scanner.nextLine();

        System.out.println("Precio del articulo");
        precio = scanner.nextDouble();

        articulo = new Articulo(nombre, precio);

        shoppingList.addArticulo(articulo);

    }


    public int showMenu(){
        Scanner scanner = new Scanner(System.in);

        int option;

        System.out.println("*******************************");
        System.out.println("* 1 - Añadir producto         *");
        System.out.println("* 2 - Eliminar producto       *");
        System.out.println("* 3 - Mostrar lista artículos *");
        System.out.println("* 4 - Consultar importe total *");
        System.out.println("* 0 - Salir                   *");
        System.out.println("*******************************");
        System.out.println("Opcion: ");
        option = scanner.nextInt();

        return option;
    }
}
