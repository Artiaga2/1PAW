package com.artiaga.EscribirEnVentana;

import javax.swing.*;
import java.awt.*;

/**
 * Created by artiaga on 18/5/17.
 */
public class VentanaConTexto {
    public static void main(String[] args) {


        Marco miMarco = new Marco();

    }
}


class Marco extends JFrame {

    public Marco (){

        setBounds(200,200,500,500);
        setTitle("Escribir sobre un panel");

        Lienzo miLienzo = new Lienzo();
        add(miLienzo);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class Lienzo extends JPanel {

    @Override
    protected void paintComponent (Graphics g){
        //Cuidado con esto cuando tengamos
        //colores, tipos de letras, objetos, etc
        super.paintComponent(g);

        g.drawString("String mola . . .", 25, 25);
        g.drawRect(25,25,25,25);
    }

}