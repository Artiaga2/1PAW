package com.artiaga;

public class Main {

    public static void main(String[] args) {
	// write your code here
        EmpleadosOficina test1 = new EmpleadosOficina();
        EmpleadosComerciales test2 = new EmpleadosComerciales();


        test1.setAños(15);

        System.out.println(test1.SueldoOficina());

        test2.setAltasUltimoMes(20);
        test2.setAltas(150);


        System.out.println(test2.sueldoComercial());
        System.out.println(test2.sueldoComercialNeto());

    }
}
