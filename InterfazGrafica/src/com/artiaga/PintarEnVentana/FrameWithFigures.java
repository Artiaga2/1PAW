package com.artiaga.PintarEnVentana;

import javax.swing.*;
import java.awt.*;

/**
 * Created by artiaga on 18/5/17.
 */
public class FrameWithFigures {

    public static void main (String[] args) {

        Marco miMarco = new Marco();


    }
}

class Marco extends JFrame{

    public Marco(){
        setBounds(200,200,500,500);
        setTitle("Dibujitos");


        Lienzo miLienzo  = new Lienzo();
        add(miLienzo);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class Lienzo extends  JPanel{
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        g.drawRect(50,50,100,150);
        g.drawLine(50,50,150, 200);
        g.drawArc(50,100,100,200,120,150);
    }

}
