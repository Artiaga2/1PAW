package com.artiaga.controller;

import com.artiaga.model.Automovil;
import com.artiaga.model.Taxi;

public class Main {

    public static void main(String[] args) {

        Automovil miCoche = new Automovil();
        Taxi miTaxi = new Taxi("Renault","Megane","1234-ABC","Mañana","s9d8f");

        System.out.println(miTaxi);

    }
}
