package com.artiaga;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*String nombre;
        char sexo;

        Scanner input = new Scanner(System.in);

        Persona grupo [] = new Persona[3];

        for (int i = 0; i < grupo.length; i++){
            System.out.println("Nombre");
            nombre = input.nextLine();

            System.out.println("Sexo:");
            sexo = input.nextLine().charAt(0);
        }

        for (int i = 0; i < grupo.length; i++){

            System.out.println(grupo[i]);
        }
     */

        Persona persona = new Persona("Alejandro",23,'H',70,170);
        System.out.println(persona);

    }
}
