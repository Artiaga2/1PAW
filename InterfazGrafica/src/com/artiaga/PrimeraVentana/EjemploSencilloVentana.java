package com.artiaga.PrimeraVentana;

import javax.swing.*;
import java.awt.*;
import com.apple.eawt.Application;

/**
 * Created by artiaga on 15/5/17.
 */






public class EjemploSencilloVentana {


    public static void main(String[] args) {

        VentanaSencilla miVentana = new VentanaSencilla();



    }


}

class VentanaSencilla  extends JFrame {


    public VentanaSencilla(){

        int widht = 500;
        int height = 500;

        Toolkit myScreen = Toolkit.getDefaultToolkit();
        Dimension screenDimension = Toolkit.getDefaultToolkit().getScreenSize();


        setBounds(screenDimension.width / 2 - widht / 2, screenDimension.height / 2 - height / 2, widht, height);
        setVisible( true );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        Application aplication = Application.getApplication();
        aplication.setDockIconImage(myScreen.getImage("assassin.png"));

    }

}