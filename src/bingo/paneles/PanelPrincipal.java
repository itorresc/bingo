package bingo.paneles;

import bingo.modelo.AtajoDeTeclado;
import bingo.modelo.Funciones;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

/**
 *
 * @author Iván Torres Curinao
 */
public class PanelPrincipal extends PanelBase {

    PanelBingo panelBingo;

    public PanelPrincipal() {
        initComponents();
        inicializarComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelNumero = new javax.swing.JLabel();
        textoNumero = new javax.swing.JTextField();
        botonIngresar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelNumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        textoNumero.setPreferredSize(new java.awt.Dimension(100, 30));
        textoNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoNumeroKeyTyped(evt);
            }
        });

        botonIngresar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonIngresar.setText("Ingresar"); // NOI18N
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });

        botonLimpiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonLimpiar.setText("Limpiar"); // NOI18N
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonIngresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonLimpiar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonIngresar)
                            .addComponent(botonLimpiar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        habilitarNumero();
        deshabilitarNumeros();
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void textoNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoNumeroKeyTyped
        letraAmayuscula(evt);

    }//GEN-LAST:event_textoNumeroKeyTyped

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        panelBingo.limpiarPanel();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    /**
     * Inicializar los componentes del panel.
     */
    private void inicializarComponentes() {
        this.setPreferredSize(Funciones.screenSize);
        Font fontDejaVu300 = new Font("DejaVu Sans", 1, 300);
        Font fontDejaVu22 = new Font("DejaVu Sans", 1, 22);
        Font fontDejaVu16 = new Font("DejaVu Sans", 0, 16);
        Dimension dimensionBoton = new Dimension(68, 38);
        centrarTexto(textoNumero);
        textoNumero.setFont(fontDejaVu22);
        botonIngresar.setFont(fontDejaVu16);
        botonLimpiar.setFont(fontDejaVu16);
        botonIngresar.setText("Ingresar");
        botonLimpiar.setText("Borrar");
        labelNumero.setText("");
        labelNumero.setFont(fontDejaVu300);
        inicializarPanelBingo(dimensionBoton, fontDejaVu22);
        activarAtajosTeclado();
        panelBingo.setFocusable(false);
        textoNumero.setFocusable(true);
        dejarFocoEn(textoNumero);
    }

    /**
     * Habilitar un número en el panel Numero Bingo.
     */
    private void habilitarNumero() {
        panelBingo.habilitarNumero(textoNumero.getText());
        labelNumero.setText(textoNumero.getText());

    }

    /**
     * Deshabilitar todos los números del panel que esten habilitados.
     */
    private void deshabilitarNumeros() {
        textoNumero.setText("");
    }

    /**
     * Inicializar panel bingo 75 bolas.
     */
    private void inicializarPanelBingo(Dimension dimensionTecla, Font fontLetra) {
        panelBingo = new PanelBingo(10, 5, dimensionTecla, fontLetra);
        panel.add(panelBingo);
    }

    /**
     * Activar los atajos de teclado
     */
    private void activarAtajosTeclado() {
        AtajoDeTeclado atajo = new AtajoDeTeclado(this);
        atajo.agregarAtajoSalirDialog();

        atajo.agregarAtajoBotonEnterPanel(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIngresar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField textoNumero;
    // End of variables declaration//GEN-END:variables

}
