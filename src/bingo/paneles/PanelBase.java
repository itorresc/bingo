package bingo.paneles;

import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.JTextComponent;

/**
 * Panel base para que los demás hereden de esta
 *
 * @author Omar Paché
 */
public class PanelBase extends JPanel {

    protected TableRowSorter<TableModel> ordenar;

    /**
     * Cerrar ventana actual
     */
    protected void cerrarVentana() {
        ((JDialog) this.getParent().getParent().getParent()).dispose();
    }

    /**
     * Limita la escritura en las entradas de texto solo a números.
     *
     * @param evt evento al presionar una tecla
     */
    protected void limitarAsoloNumeros(KeyEvent evt) {
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }

    /**
     * Transforma el carácter digitado a mayúscula.
     *
     * @param evt evento al presionar una tecla (keytyped)
     */
    protected void letraAmayuscula(KeyEvent evt) {
        evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
    }

    /**
     * Evalúa si se presionó la tecla enter.
     *
     * @param evt evento al presionar una tecla
     * @return true si se presiono, false de lo contrario
     */
    protected boolean sePresionoTeclaEnter(KeyEvent evt) {
        int key = evt.getKeyCode();
        return (key == KeyEvent.VK_ENTER);
    }

    /**
     * Deshabilita en una entrada de texto el pegar desde el porta papeles con Ctrl + V o con el clic derecho del mouse.
     * -> Pegar
     *
     * @param campo componente de entrada de texto en donde se desea deshabilitar el porta papeles
     */
    protected void deshabilitarPortapapeles(JTextComponent campo) {
        campo.setTransferHandler(null);
    }

    /**
     * Hace visibles a un grupo de elementos.
     *
     * @param componentes elementos a mostrar
     */
    protected void hacerVisibles(JComponent... componentes) {
        for (JComponent componente : componentes) {
            componente.setVisible(true);
        }
    }

    /**
     * Deshabilitar a un grupo de elementos.
     *
     * @param componentes elementos a ocultar
     */
    protected void deshabilitar(JComponent... componentes) {
        for (JComponent componente : componentes) {
            componente.setEnabled(false);
        }
    }

    /**
     * Habilitar un grupo de elementos.
     *
     * @param componentes elementos a mostrar
     */
    protected void habilitar(JComponent... componentes) {
        for (JComponent componente : componentes) {
            componente.setEnabled(true);
        }
    }

    /**
     * Lleva el foco al elemento recibido.
     *
     * @param componente elementos para dejar el foco
     */
    public void dejarFocoEn(JComponent componente) {
        componente.requestFocusInWindow();
    }

    /**
     * Centrar los datos de un JTextField.
     *
     * @param txtField texto a centrar
     */
    public void centrarTexto(JTextField txtField) {
        if (txtField != null) {
            txtField.setHorizontalAlignment(SwingConstants.CENTER);
        }
    }
}
