package bingo.modelo;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

/**
 *
 * @author Iván Torres Curinao
 */
public class AtajoDeTeclado {

    private final JPanel panel;

    public AtajoDeTeclado(JPanel panel) {
        this.panel = panel;
    }

    /**
     * Se agrega el atajo de teclado para que al presionar la tecla escape, se cierre la venta actual.
     */
    public void agregarAtajoSalirDialog() {
        AbstractAction accion = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                // Cerrar ventana actual
                ((JDialog) panel.getParent().getParent().getParent()).dispose();
            }
        };
        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
                "cerrar ventana"
        );
        panel.getActionMap().put("cerrar ventana", accion);
    }

    /**
     * Atajo al presionar Entel en el panel
     * @param accion
     */
    public void agregarAtajoBotonEnterPanel(Action accion) {
        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "Enter");
        panel.getActionMap().put("Enter", accion);
    }
}
