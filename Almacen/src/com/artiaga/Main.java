package com.artiaga;
import com.artiaga.controller.AlmacenApp;
public class Main {

    public static void main(String[] args) {

        AlmacenApp almacenApp = new AlmacenApp();

        almacenApp.loadTestArticulo();

        almacenApp.start();

    }
}
