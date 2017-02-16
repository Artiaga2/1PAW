package com.artiaga;

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(1,1);

        Point p2 = new Point(5,1);

        Point p3 = new Point(5,3);

        Point p4 = new Point(1,3);

        double distancia = 0.0;
        
        distancia += p1.distancia(p2);
        distancia += p2.distancia(p3);
        distancia += p3.distancia(p4);
        distancia += p4.distancia(p1);


        System.out.println(distancia);
    }
}
