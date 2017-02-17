package com.artiaga;

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
        this.dni = gerenaDni();
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
            this.altura = altura;
        }
    }

    //Metodos

    public double calcularIMC(){
        return this.getPeso() / pow(this.getAltura(), 2);

    }

    public boolean isOld(){
        return this.edad >= 18;

    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                ", IMC=" + calcularIMC() +
                '}';
    }

    private String gerenaDni(){
        int letra = Math.random() * 10;
        String DNI = this.dni;
        char LETRA_DNI[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        letra = Integer.valueOf(DNI) % 23;
        return DNI + "-" + LETRA_DNI [letra];



    }


}
