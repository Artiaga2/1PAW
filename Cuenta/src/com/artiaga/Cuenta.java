package com.artiaga;

import java.util.concurrent.CancellationException;

/**
 * Created by artiaga on 3/2/17.
 */
public class Cuenta {

    private String numeroCuenta, DNI;
    private double saldoActual;
    private final char LETRA_DNI[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};


    //Constructores

    //Constructor designado

    public Cuenta (String numeroCuenta,String DNI, double saldoActual){

        this.numeroCuenta = numeroCuenta;
        this.setDNI(DNI);
        this.saldoActual = saldoActual;

    }

    public Cuenta (){
        this("ES1245325478131234567890","77846385",200);

    }

    //Accesores

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        int letra = Integer.valueOf(DNI) % 23;
        this.DNI = DNI + "-" + LETRA_DNI [letra];

    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }


    public double ingresarDinero( double dinero){

        if (dinero <= 0) {
            System.out.println("No se ha ingresado nada");
        }else{
            this.saldoActual = this.saldoActual + dinero;
        }

        return this.getSaldoActual();

    }

    public double extraerDinero (double dinero){
        if (dinero <= 0) {
            System.out.println("No se ha ingresado nada");
        }else if(this.saldoActual < dinero + 0.90){
            System.out.println("No tiene suficiente dinero");
        }else{
           this.saldoActual = this.saldoActual - dinero - 0.90;
        }

        return this.getSaldoActual();
    }

    public void estadoCuenta (){
        System.out.println("Estado de la cuenta");
        System.out.println("Cuenta: " + this.getNumeroCuenta());
        System.out.println("Cliente: " + this.getDNI());
        System.out.println("Saldo Actual: " + this.getSaldoActual());

    }

}
