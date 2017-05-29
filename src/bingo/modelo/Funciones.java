package bingo.modelo;

import java.awt.Dimension;
import java.awt.Window;

/**
 *
 * @author Iván Torres Curinao
 */
public class Funciones {

    public static Dimension screenSize;

    public static void centrarVentana(Window ventana) {
        if (screenSize.width < ventana.getPreferredSize().width) {
            ventana.setPreferredSize(new Dimension(screenSize.width - 50, ventana.getPreferredSize().height));
        }
        int x = (screenSize.width - ventana.getPreferredSize().width) / 2;
        int y = (screenSize.height - ventana.getPreferredSize().height) / 2;
        ventana.setLocation(x, y);
    }
}
