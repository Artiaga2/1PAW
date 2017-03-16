package com.artiaga;

public class Main {

    public static void main(String[] args) {
	// write your code here
        EmpleadosOficina test1 = new EmpleadosOficina();
        EmpleadosComerciales test2 = new EmpleadosComerciales();
        ProfesionalesLibres test3 = new ProfesionalesLibres();


        test1.setAños(15);

        test2.setAltas(150);

        test2.setAltasUltimoMes(20);

        test3.setHorasTotales(100);

        test3.setHorasUltimoServicio(42);

        System.out.println(test1.SueldoOficina());
        System.out.println(test2.sueldoComercial());
        System.out.println(test2.sueldoComercialNeto());
        System.out.println(test3.sueldoLibres());

    }
}
