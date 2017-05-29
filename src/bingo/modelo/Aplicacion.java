package bingo.modelo;

import javax.swing.JDialog;

/**
 *
 * @author Iván Torres Curinao
 */
public class Aplicacion {

    public void show(JDialog dialogo, boolean centrar) {
        if (centrar) {
            Funciones.centrarVentana(dialogo);
            dialogo.pack();
        }
        dialogo.setVisible(true);
    }
}
