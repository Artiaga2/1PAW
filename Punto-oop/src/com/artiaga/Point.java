package com.artiaga;

/**
 * Created by artiaga on 15/2/17.
 */
public class Point {

    private double x;
    private double y;


    public Point(){

    }

    public Point(double x, double y) {
        setX(x);
        setY(y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.getY() + ")";
    }

    public double distancia(Point aPoint){
        double d= 0.0;
        d = Math.sqrt(
                (Math.pow((aPoint.x - this.x) ,2 ) +
                (Math.pow((aPoint.y - this.y) ,2 )))
        );

        return d;
    }

    public int cuadrante(){

        if ( this.getX() >= 0 ){

            if ( this.getY() >= 0 ){
                return 1;
            }else{
                return 4;
            }

        }else{

            if ( this.getY() >= 0 ) {
                return 2;
            }else {
                return 3;
            }
        }
    }
}
