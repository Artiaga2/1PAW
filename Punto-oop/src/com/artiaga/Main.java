package com.artiaga;

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(1,1);

        Point p2 = new Point(5,1);

        Point p3 = new Point(5,3);

        Point p4 = new Point(1,3);

        double distanciaa = 0.0;
        
        distanciaa += p1.distancia(p2);
        distanciaa+= p2.distancia(p3);
        distanciaa += p3.distancia(p4);
        distanciaa += p4.distancia(p1);



        System.out.println(distanciaa);
        System.out.println(Point.distancePath(p1,p2,p3,p4));
    }
}
