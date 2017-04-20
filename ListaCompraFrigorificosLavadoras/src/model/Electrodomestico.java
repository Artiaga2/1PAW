package model;

/**
 * Created by artiaga on 20/4/17.
 */
public class Electrodomestico {

    private String marca;
    private String modelo;
    private double precioBase;
    private char consumoElectrico;
    private double altura;
    private double anchura;
    private double peso;

    //Constructores


    public Electrodomestico() {
    }

    public Electrodomestico(String marca,
                            String modelo,
                            double precioBase,
                            char consumoElectrico,
                            double altura,
                            double anchura,
                            double peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
        this.consumoElectrico = consumoElectrico;
        this.altura = altura;
        this.anchura = anchura;
        this.peso = peso;
    }


    //Accesores


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public char getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(char consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
