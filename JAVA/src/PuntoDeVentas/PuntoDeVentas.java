package PuntoDeVentas;

import View.Sistema;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.UIManager;

public class PuntoDeVentas {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //maximizar la ventana
        Sistema main = new Sistema();
        main.setExtendedState(MAXIMIZED_BOTH);
        main.setVisible(true);
    }

}
