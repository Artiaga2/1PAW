package com.artiaga;

import java.text.DecimalFormat;

import static java.lang.Math.*;

/**
 * Created by artiaga on 16/2/17.
 */
public class Persona {

    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    //Constructores

    public Persona(){
        this.setSexo('H');
    }

    public Persona(String nombre, int edad, char sexo){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setSexo(sexo);
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura ){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setSexo(sexo);
        this.setPeso(peso);
        this.setAltura(altura);
        this.dni = generaDni();
    }

    //Accesores

    //Getters: devuelven el tipo del atributo en cuestión
    public String getNombre(){ return nombre; }

    public  int getEdad(){return edad;}

    public String getDni(){return dni;}

    public  char getSexo(){return sexo;}

    public double getPeso(){return peso;}

    public double getAltura(){return altura;}

    //setters: recibiran un parametro del tipo del atributo que está configurando

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        if(edad < 0 ) {
            this.edad = 0;
        }else {

            this.edad = edad;
        }
    }

    public void setSexo(char sexo){
        if (sexo == 'H'|| sexo == 'h' ) {
            this.sexo = 'H';
        }else if(sexo == 'M'|| sexo == 'm' ){
            this.sexo = 'M';
        }else{
            this.sexo = '-';
        }
    }

    public void setPeso(double peso){
        if ( peso < 0 ){
            this.peso = 0;
        }else{
            this.peso = peso;
        }
    }

    public  void setAltura(double altura){
        if (altura < 0) {
            this.altura = 0;
        }else{
            this.altura = altura / 100;
        }
    }

    //Metodos

    public double calcularIMC(){

        if (altura < 0 || peso < 0){
            this.altura = 0;
            this.peso = 0;
        }
            return peso / pow(this.getAltura(), 2);

    }

    /*public boolean isOld(){
        return this.edad >= 18;

    }*/

    @Override
    public String toString() {
        String mayorEdad = (edad > 18)?"Si":"No";
        DecimalFormat formateo  = new DecimalFormat("###.###");
        return "Persona{" +
                "nombre = " + nombre +
                ", edad = " + edad +
                ", dni = " + dni  +
                ", sexo = " + sexo +
                ", peso = " + peso +
                ", altura = " + altura + "m" +
                ", mayor de edad = " + mayorEdad +
                ", IMC = " + String.format("%.3f", calcularIMC()) + " IMC= " + formateo.format(calcularIMC()) +
                '}';
    }

    private String generaDni(){
        String letradni = "";
        int letra;
        for (int i = 0; i < 8 ; i++) {
            letradni +=(int)( Math.random() * 9);
        }

        char LETRA_DNI[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        letra= Integer.valueOf(letradni) % 23;
        letradni += LETRA_DNI[letra];
        return letradni;



    }


}
