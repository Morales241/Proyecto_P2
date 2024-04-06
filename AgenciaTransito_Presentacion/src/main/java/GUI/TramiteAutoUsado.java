/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import dto.AutomovilDTO;
import dto.PersonaDTO;
import excepciones.ExcepcionAT;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import negocio.RegistroAutomovilBO;

/**
 *
 * @author tacot
 */
public class TramiteAutoUsado extends javax.swing.JFrame {

    RegistroAutomovilBO registroAutomovilBO;
    private TramitarPlacas placas;
    AutomovilDTO autoBucado;

    /**
     * Creates new form TramiteAutoUsado
     */
    public TramiteAutoUsado(PersonaDTO personaDTO) {
        registroAutomovilBO = new RegistroAutomovilBO();
        initComponents();
        this.PanelAutoEncontrado.setVisible(false);
    }

    public TramiteAutoUsado() {
    initComponents();
    registroAutomovilBO = new RegistroAutomovilBO();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFieldRFC3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFieldRFC2 = new javax.swing.JTextField();
        txtFieldRFC1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFieldRFC4 = new javax.swing.JTextField();
        panelAutoUsado = new javax.swing.JPanel();
        txtPlacasAnteriores = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        PanelAutoEncontrado = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNSerie = new javax.swing.JTextField();
        GenerarPlacas = new javax.swing.JButton();

        txtFieldRFC3.setBackground(new java.awt.Color(182, 0, 0));
        txtFieldRFC3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFieldRFC3.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldRFC3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtFieldRFC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldRFC3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Numero de serie:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Modelo:");

        txtFieldRFC2.setBackground(new java.awt.Color(182, 0, 0));
        txtFieldRFC2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFieldRFC2.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldRFC2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtFieldRFC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldRFC2ActionPerformed(evt);
            }
        });

        txtFieldRFC1.setBackground(new java.awt.Color(182, 0, 0));
        txtFieldRFC1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFieldRFC1.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldRFC1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtFieldRFC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldRFC1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Marca:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Color:");

        txtFieldRFC4.setBackground(new java.awt.Color(182, 0, 0));
        txtFieldRFC4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFieldRFC4.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldRFC4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtFieldRFC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldRFC4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelAutoUsado.setBackground(new java.awt.Color(255, 255, 255));
        panelAutoUsado.setPreferredSize(new java.awt.Dimension(579, 297));
        panelAutoUsado.setLayout(null);

        txtPlacasAnteriores.setBackground(new java.awt.Color(182, 0, 0));
        txtPlacasAnteriores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPlacasAnteriores.setForeground(new java.awt.Color(255, 255, 255));
        txtPlacasAnteriores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtPlacasAnteriores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacasAnterioresActionPerformed(evt);
            }
        });
        panelAutoUsado.add(txtPlacasAnteriores);
        txtPlacasAnteriores.setBounds(268, 21, 209, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Placas anteriores:");
        panelAutoUsado.add(jLabel8);
        jLabel8.setBounds(100, 22, 150, 25);

        botonBuscar.setBackground(new java.awt.Color(102, 102, 102));
        botonBuscar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        botonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscar.setText("BUSCAR");
        botonBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonBuscar.setBorderPainted(false);
        botonBuscar.setFocusPainted(false);
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        panelAutoUsado.add(botonBuscar);
        botonBuscar.setBounds(344, 57, 133, 26);

        PanelAutoEncontrado.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Modelo:");

        txtModelo.setEditable(false);
        txtModelo.setBackground(new java.awt.Color(182, 0, 0));
        txtModelo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtModelo.setForeground(new java.awt.Color(255, 255, 255));
        txtModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        txtMarca.setEditable(false);
        txtMarca.setBackground(new java.awt.Color(182, 0, 0));
        txtMarca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(255, 255, 255));
        txtMarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Marca:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Color:");

        txtColor.setEditable(false);
        txtColor.setBackground(new java.awt.Color(182, 0, 0));
        txtColor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtColor.setForeground(new java.awt.Color(255, 255, 255));
        txtColor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Numero de serie:");

        txtNSerie.setEditable(false);
        txtNSerie.setBackground(new java.awt.Color(182, 0, 0));
        txtNSerie.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNSerie.setForeground(new java.awt.Color(255, 255, 255));
        txtNSerie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtNSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNSerieActionPerformed(evt);
            }
        });

        GenerarPlacas.setBackground(new java.awt.Color(102, 102, 102));
        GenerarPlacas.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        GenerarPlacas.setForeground(new java.awt.Color(255, 255, 255));
        GenerarPlacas.setText("Aceptar");
        GenerarPlacas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        GenerarPlacas.setBorderPainted(false);
        GenerarPlacas.setFocusPainted(false);
        GenerarPlacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarPlacasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAutoEncontradoLayout = new javax.swing.GroupLayout(PanelAutoEncontrado);
        PanelAutoEncontrado.setLayout(PanelAutoEncontradoLayout);
        PanelAutoEncontradoLayout.setHorizontalGroup(
            PanelAutoEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAutoEncontradoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAutoEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelAutoEncontradoLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txtNSerie, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                    .addGroup(PanelAutoEncontradoLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(PanelAutoEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(PanelAutoEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtModelo)
                            .addComponent(txtMarca)
                            .addComponent(txtColor))))
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAutoEncontradoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GenerarPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        PanelAutoEncontradoLayout.setVerticalGroup(
            PanelAutoEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAutoEncontradoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelAutoEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAutoEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAutoEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAutoEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addComponent(GenerarPlacas)
                .addGap(20, 20, 20))
        );

        panelAutoUsado.add(PanelAutoEncontrado);
        PanelAutoEncontrado.setBounds(103, 89, 400, 197);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAutoUsado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAutoUsado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPlacasAnterioresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacasAnterioresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacasAnterioresActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        try {
            autoBucado = registroAutomovilBO.buscarAuto(this.txtPlacasAnteriores.getText());
            this.PanelAutoEncontrado.setVisible(true);
            this.txtColor.setText(autoBucado.getColor());
            this.txtMarca.setText(autoBucado.getMarca());
            this.txtModelo.setText(autoBucado.getModelo());
            this.txtNSerie.setText(autoBucado.getNumeroSerie());
        } catch (ExcepcionAT ex) {
            Logger.getLogger(TramiteAutoUsado.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_botonBuscarActionPerformed

    private void txtFieldRFC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldRFC3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldRFC3ActionPerformed

    private void txtFieldRFC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldRFC2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldRFC2ActionPerformed

    private void txtFieldRFC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldRFC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldRFC1ActionPerformed

    private void txtFieldRFC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldRFC4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldRFC4ActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtNSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNSerieActionPerformed

    private void GenerarPlacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarPlacasActionPerformed
        this.autoBucado.setTipo(this.txtPlacasAnteriores.getText());
        placas.auto = this.autoBucado;
        placas.GenerarPlacas.setVisible(true);
        placas.GenerarPlacas.setText("Generar Placas");
        placas.Opcion = 2;
    }//GEN-LAST:event_GenerarPlacasActionPerformed

    public javax.swing.JPanel traerContenido() {
        return this.panelAutoUsado;
    }
    
    public void posicion(TramitarPlacas Placas){
    this.placas = Placas;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GenerarPlacas;
    private javax.swing.JPanel PanelAutoEncontrado;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelAutoUsado;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtFieldRFC1;
    private javax.swing.JTextField txtFieldRFC2;
    private javax.swing.JTextField txtFieldRFC3;
    private javax.swing.JTextField txtFieldRFC4;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNSerie;
    private javax.swing.JTextField txtPlacasAnteriores;
    // End of variables declaration//GEN-END:variables
}
