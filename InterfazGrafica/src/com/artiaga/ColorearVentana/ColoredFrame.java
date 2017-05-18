package com.artiaga.ColorearVentana;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Created by artiaga on 18/5/17.
 */
public class ColoredFrame {

    public static void main (String[] args) {

        Marco miMarco = new Marco();


    }
}

class Marco extends JFrame{

    public Marco (){

        setTitle("Dar color, pulir color");
        setBounds(200,200,500,500);

        Lienzo miLienzo = new Lienzo();
        add(miLienzo);


        miLienzo.setBackground(new Color((float)0.0,(float)0.3,(float) 0.7, (float) 0.5));
        miLienzo.setForeground(Color.PINK);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}

class Lienzo extends JPanel{

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        Line2D linea = new Line2D.Double(100,250,300,100);
        g2.draw(linea);

        g2.draw(new Line2D.Double(100,100,300,250));
    }
}
