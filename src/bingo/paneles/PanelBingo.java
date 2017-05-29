package bingo.paneles;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Iván Torres Curinao
 */
public final class PanelBingo extends JPanel {

    private final String teclas[] = {"B", "I", "N", "G", "O", "1", "16", "31", "46", "61", "2", "17", "32", "47", "62", "3", "18", "33", "48", "63",
        "4", "19", "34", "49", "64", "5", "20", "35", "50", "65", "6", "21", "36", "51", "66", "7", "22", "37",
        "52", "67", "8", "23", "38", "53", "68", "9", "24", "39", "54", "69", "10", "25", "40", "55", "70", "11",
        "26", "41", "56", "71", "12", "27", "42", "57", "72", "13", "28", "43", "58", "73", "14", "29", "44", "59",
        "74", "15", "30", "45", "60", "75"
    };

    //Colores
    public static final Color VERDE_INTENSO = new Color(4, 166, 15);
    public static final Color AZUL_INTENSO = new Color(0, 126, 255);
    public static final Color AMARILLO_INTENSO = new Color(255, 238, 20);
    public static final Color ROJO_INTENSO = new Color(248, 22, 9);
    public static final Color MORADO_INTENSO = new Color(122, 97, 246);

    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    private final ArrayList<JButton> botones = new ArrayList<>();
    private JPanel panel, panelB, panelI, panelN, panelG, panelO;
    private Font fontLetra = new Font("DejaVu Sans", 1, 18);
    private Dimension dimensionTecla = new Dimension(122, 68);
    private int espacioHorizontal = 10;
    private int espacioVertical = 10;

    public PanelBingo(Integer espacioHorizontal, Integer espacioVertical, Dimension dimensionTecla, Font fontLetra) {
        super();
        inicializaComponentes(espacioHorizontal, espacioVertical, dimensionTecla, fontLetra);
    }

    private void inicializaComponentes(Integer espacioHorizontal, Integer espacioVertical, Dimension dimensionTecla, Font fontLetra) {
        // Cambiar los valores por defecto del teclado
        if (fontLetra != null) {
            this.fontLetra = fontLetra;
        }
        if (dimensionTecla != null) {
            this.dimensionTecla = dimensionTecla;
        }
        if (espacioHorizontal != null) {
            this.espacioHorizontal = espacioHorizontal;
        }
        if (espacioVertical != null) {
            this.espacioVertical = espacioVertical;
        }

        panelB = new JPanel();
        panelI = new JPanel();
        panelN = new JPanel();
        panelG = new JPanel();
        panelO = new JPanel();
        panel = new JPanel();
        setLayout(new FlowLayout());

        // Construir teclado númerico
        construirTeclado();
        construir();
        habilitarBingo();
    }

    public void habilitarNumero(String numero) {
        for (JButton boton : botones) {
            if (boton.getText().equals(numero)) {
                boton.setEnabled(true);
            }
        }
    }

    private void habilitarBingo() {
        for (JButton boton : botones) {
            if (boton.getText().equals("B")) {
                boton.setEnabled(true);
                boton.setBackground(VERDE_INTENSO);
                boton.setForeground(Color.BLACK);
            }
            if (boton.getText().equals("I")) {
                boton.setEnabled(true);
                boton.setBackground(AMARILLO_INTENSO);
                boton.setForeground(Color.BLACK);
            }
            if (boton.getText().equals("N")) {
                boton.setEnabled(true);
                boton.setBackground(MORADO_INTENSO);
                boton.setForeground(Color.BLACK);
            }
            if (boton.getText().equals("G")) {
                boton.setEnabled(true);
                boton.setBackground(AZUL_INTENSO);
                boton.setForeground(Color.BLACK);
            }
            if (boton.getText().equals("O")) {
                boton.setEnabled(true);
                boton.setBackground(ROJO_INTENSO);
                boton.setForeground(Color.BLACK);
            }
        }
    }

    private void construirTeclado() {
        panel.setLayout(new GridLayout(16, 4, espacioHorizontal, espacioVertical));

        JButton boton;
        for (int i = 0; i < 80; i++) {
            boton = new JButton(teclas[i]);
            boton.setEnabled(false);
            boton.setVisible(true);
            boton.setBackground(Color.LIGHT_GRAY);
            boton.setForeground(Color.RED);
            boton.setFont(this.fontLetra);
            boton.setPreferredSize(dimensionTecla);
            boton.setFocusable(false);
            panel.add(boton);
            botones.add(boton);
        }
    }

    private void construir() {
        this.add(panel);
    }

    void limpiarPanel() {
        if (JOptionPane.showConfirmDialog(null, "¿Está seguro de borrar todos los datos?", "Confirmación", JOptionPane.YES_NO_OPTION) == 0) {
            for (JButton boton : botones) {
                boton.setEnabled(false);
                habilitarBingo();
            }
        }
    }
}
