package bingo;

import bingo.modelo.Aplicacion;
import bingo.modelo.Funciones;
import bingo.modelo.UnaInstancia;
import bingo.paneles.PanelPrincipal;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.Socket;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Iván Torres Curinao
 */
public class Main {

    private static FormMenuPrincipal MENU_PRINCIPAL;
    public static Dimension screenSize;

    public static void main(String[] args) {
        try {
            iniciar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La aplicación se cerrará", "Error Grave", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    private static void iniciar() {
        //evitar que se abra mas de una instancia de la aplicación al mismo tiempo en un mismo computador
        if (!comprobarInstancia()) {
            JOptionPane.showMessageDialog(null, "Bingo ya se está ejecutandose en otra ventana", "Error",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        //definir variable entorno grafico
        Funciones.screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        MENU_PRINCIPAL = new FormMenuPrincipal();
        Funciones.centrarVentana(MENU_PRINCIPAL);
        //setear imagen de icono ventana
//        ImageIcon img = new ImageIcon(System.getProperty("user.home") + "");
//        MENU_PRINCIPAL.setIconImage(img.getImage());
        MENU_PRINCIPAL.getContentPane().setLayout(new FlowLayout());
        MENU_PRINCIPAL.setMaximumSize(Funciones.screenSize);
        MENU_PRINCIPAL.setResizable(false);
        MENU_PRINCIPAL.dispose();
        MENU_PRINCIPAL.setVisible(false);
        MENU_PRINCIPAL.setExtendedState(MENU_PRINCIPAL.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        MENU_PRINCIPAL.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        MENU_PRINCIPAL.setUndecorated(false);
        MENU_PRINCIPAL.pack();
        JDialog frameConsultor;
        frameConsultor = new JDialog(MENU_PRINCIPAL);
        frameConsultor.setName("panelBingo");
        frameConsultor.setTitle("Bingo De Colores");
        frameConsultor.setUndecorated(true);
        PanelPrincipal panelConsultor = new PanelPrincipal();
        frameConsultor.setContentPane(panelConsultor);
        frameConsultor.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frameConsultor.setResizable(false);
        panelConsultor.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Main.getApplication().show(frameConsultor, true);
    }

    private static boolean comprobarInstancia() {
        UnaInstancia unaInstancia;
        try {
            Socket clientSocket = new Socket("localhost", UnaInstancia.PORT);
            return false;
        } catch (IOException e) {
            unaInstancia = new UnaInstancia();
            unaInstancia.start();
            return true;
        }
    }

    public static JFrame getMainFrame() {
        return MENU_PRINCIPAL;
    }

    public static Aplicacion getApplication() {
        return new Aplicacion();
    }
}
