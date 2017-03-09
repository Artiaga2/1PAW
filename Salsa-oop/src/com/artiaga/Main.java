package com.artiaga;

public class Main {

    public static void main(String[] args) {
	// write your code here
        EmpleadosComerciales test1 = new EmpleadosComerciales();

        test1.setAltasUltimoMes(20);
        test1.setAltas(150);


        System.out.println(test1.SueldoComercial());

    }
}
