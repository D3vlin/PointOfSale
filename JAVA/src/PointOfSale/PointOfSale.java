package PointOfSale;

import View.System;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.UIManager;

public class PointOfSale {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //maximizar la ventana
        System main = new System();
        main.setExtendedState(MAXIMIZED_BOTH);
        main.setVisible(true);
    }

}
