package com.artiaga;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Fraccion f1 = new Fraccion(3,4);

        f1.setDenominador(0);

        System.out.println(f1); // Imprime 3/0


        Fraccion f2 = new Fraccion(5,6);

        f2.setNumerador(3);

        System.out.println(f2); // Imprime 3/6 en vez de

    }
}
