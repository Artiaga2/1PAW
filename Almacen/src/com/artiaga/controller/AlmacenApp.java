package com.artiaga.controller;

import com.artiaga.modelo.Articulo;


import java.util.Collections;
import java.util.Scanner;

/**
 * Created by artiaga on 10/5/17.
 */
public class AlmacenApp {

    public void loadTestArticulo() {
        Articulo.añadirArticulo( new Articulo("Pan", 'A', 1.00, 2.0,2 ));
        Articulo.añadirArticulo( new Articulo("Queso", 'B', 2.00, 3.0,4 ));
        Articulo.añadirArticulo( new Articulo("Patatas", 'C', 1.75, 0.75,3 ));
        Articulo.añadirArticulo( new Articulo("Tabaco", 'A', 3.50, 2.0,1 ));
    }



    public void start() {
        int option;

        while ((option = showMenu()) != 0) {
            switch (option) {
                case 1:
                    LeerArticulo();
                    break;
                case 2:
                    ordenarPorNombre();
                    break;
                case 3:
                    ordenarPorCategoria();
                    break;
                case 4:
                    ordenarPorPrecio();
                    break;
                case 5:
                    ordenarPorPeso();
                    break;
                case 6:
                    ordenarPorVolumen();
                    break;
            }
        }
    }

    private void LeerArticulo() {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        char categoria;
        double precio;
        double peso;
        double volumen;


        do {
            System.out.println("Nombre Producto: ");
            nombre = scanner.nextLine().trim().replaceAll("\\s+", " ");
        } while (nombre.equals(""));

        scanner.nextLine();

            System.out.println("Categoria: ");
            categoria = scanner.nextLine().charAt(0);


        do {
            System.out.println("Precio: ");
            precio = scanner.nextDouble();
        } while (precio < 0.0);

        do {
            System.out.println("Peso: ");
            peso = scanner.nextDouble();
        } while (peso < 0.0);

        do {
            System.out.println("Volumen: ");
            volumen = scanner.nextDouble();
        } while (volumen < 0.0);

        Articulo.añadirArticulo( new Articulo(nombre, categoria, precio, peso, volumen));

    }

    private int showMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;

        System.out.println("****************************");
        System.out.println("* 1 - Añadir Articulo      *");
        System.out.println("* 2 - Lista por Nombre     *");
        System.out.println("* 3 - Lista por Categoria  *");
        System.out.println("* 4 - Lista por Precio     *");
        System.out.println("* 5 - Lista por Peso       *");
        System.out.println("* 6 - Lista por Volumen    *");
        System.out.println("* 0 - Salir                *");
        System.out.println("****************************");
        System.out.println("Opción: ");

        option = scanner.nextInt();

        return option;
    }


    private void ordenarPorNombre(){
        Collections.sort(Articulo.getArticulos(), Articulo.comparadorPorNombre);

        for (Articulo articulo : Articulo.getArticulos())
        {
            System.out.println(articulo);
        }
    }

    private void ordenarPorCategoria(){
        Collections.sort(Articulo.getArticulos(), Articulo.comparadorPorCategoria);

        for (Articulo articulo : Articulo.getArticulos())
        {
            System.out.println(articulo);
        }
    }
    private void ordenarPorPrecio(){
        Collections.sort(Articulo.getArticulos(), Articulo.comparadorPorPrecio);

        for (Articulo articulo : Articulo.getArticulos())
        {
            System.out.println(articulo);
        }
    }
    private void ordenarPorPeso(){
        Collections.sort(Articulo.getArticulos(), Articulo.comparadorPorPeso);

        for (Articulo articulo : Articulo.getArticulos())
        {
            System.out.println(articulo);
        }
    }
    private void ordenarPorVolumen(){
        Collections.sort(Articulo.getArticulos(), Articulo.comparadorPorVolumen);

        for (Articulo articulo : Articulo.getArticulos())
        {
            System.out.println(articulo);
        }
    }

}
