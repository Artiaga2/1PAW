package com.artiaga;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Cancion playlist[] = new Cancion[3];
        String titulo, autor, estilo, formato;
        int duracion;
        Scanner input = new Scanner(System.in);

        Cancion ole = new Cancion();

        for (int i = 0; i < playlist.length; i++) {

            System.out.println("Canción #" + (i + 1));
            System.out.println("=========");

            System.out.println("Introduzca el titulo: ");
            titulo = input.next();

            System.out.println("Introduzca el autor: ");
            autor = input.next();

            System.out.println("Introduzca el estilo: ");
            estilo = input.next();

            System.out.println("Introduzca el formato: ");
            formato = input.next();

            System.out.println("Introduzca el duracion: ");
            duracion = input.nextInt();

            playlist[i] = new Cancion(titulo, autor, estilo, formato, duracion);

            ole.setTitulo(titulo);
            ole.setAutor(autor);
            ole.setEstilo(estilo);
            ole.setFormato(formato);
            ole.setDuracion(duracion);


            //Impresion playlist


        }

        for (int j = 0; j < playlist.length; j++){
            System.out.println(playlist[j]);

        }
    }
}
