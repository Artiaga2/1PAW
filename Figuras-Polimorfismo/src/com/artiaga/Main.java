package com.artiaga;

public class Main {

    public static void main(String[] args) {
	// write your code here
         Figura misFiguras[] = new Figura [10];

        for (int i = 0; i < misFiguras.length ; i++) {

            misFiguras[i] = Figura.figuraAleatoria();

            System.out.println(misFiguras[i].getClass().getName());
            System.out.println("Area: " + misFiguras[i].area());
        }



//        System.out.println(misFiguras[0].area());
//        System.out.println(misFiguras[0].perimetro());
//        System.out.println(misFiguras[0].area());
//        System.out.println(misFiguras[1].perimetro());

    }
}
