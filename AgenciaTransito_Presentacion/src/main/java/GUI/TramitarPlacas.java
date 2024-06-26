/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import dto.AutomovilDTO;
import dto.PersonaDTO;
import excepciones.ExcepcionAT;
import javax.swing.JOptionPane;
import negocio.RegistroAutomovilBO;

/**
 *
 * @author tacot
 */
public class TramitarPlacas extends javax.swing.JFrame {

    TramiteAutoNuevo autoN = new TramiteAutoNuevo();

    AutomovilDTO auto;

    GenerarPlacas placas = new GenerarPlacas();

    TramiteAutoUsado AutoU = new TramiteAutoUsado();

    RegistroAutomovilBO registroAuto = new RegistroAutomovilBO();
    
    int Opcion =0;
    
    private PersonaDTO persona;

    /**
     * Creates new form TamitePlacas
     */
    public TramitarPlacas(PersonaDTO personaDTO) {
        this.persona = personaDTO;
        initComponents();
        this.GenerarPlacas.setVisible(false);
    }

    public TramitarPlacas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelRojo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        botonAutoU = new javax.swing.JButton();
        botonAutoN = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        contenido = new javax.swing.JPanel();
        GenerarPlacas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        panelRojo.setBackground(new java.awt.Color(182, 0, 0));
        panelRojo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelRojo.setForeground(new java.awt.Color(182, 0, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TRÁMITE DE PLACAS");

        javax.swing.GroupLayout panelRojoLayout = new javax.swing.GroupLayout(panelRojo);
        panelRojo.setLayout(panelRojoLayout);
        panelRojoLayout.setHorizontalGroup(
            panelRojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRojoLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel6)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        panelRojoLayout.setVerticalGroup(
            panelRojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRojoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        botonAutoU.setBackground(new java.awt.Color(102, 102, 102));
        botonAutoU.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        botonAutoU.setForeground(new java.awt.Color(255, 255, 255));
        botonAutoU.setText("Auto Usado");
        botonAutoU.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAutoU.setBorderPainted(false);
        botonAutoU.setFocusPainted(false);
        botonAutoU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAutoUActionPerformed(evt);
            }
        });

        botonAutoN.setBackground(new java.awt.Color(102, 102, 102));
        botonAutoN.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        botonAutoN.setForeground(new java.awt.Color(255, 255, 255));
        botonAutoN.setText("Auto Nuevo");
        botonAutoN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAutoN.setBorderPainted(false);
        botonAutoN.setFocusPainted(false);
        botonAutoN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAutoNActionPerformed(evt);
            }
        });

        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresar.png"))); // NOI18N
        botonRegresar.setBorderPainted(false);
        botonRegresar.setContentAreaFilled(false);
        botonRegresar.setFocusPainted(false);
        botonRegresar.setFocusable(false);
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        contenido.setBackground(new java.awt.Color(255, 255, 255));
        contenido.setForeground(new java.awt.Color(255, 255, 255));
        contenido.setPreferredSize(new java.awt.Dimension(579, 297));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRojo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(botonAutoN, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(botonAutoU, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(GenerarPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonAutoN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonAutoU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(GenerarPlacas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAutoUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAutoUActionPerformed
        this.contenido.removeAll();
        this.contenido.add(AutoU.traerContenido());
        AutoU.posicion(this);
        this.contenido.revalidate();
        this.contenido.repaint();
        this.GenerarPlacas.setVisible(false);
    }//GEN-LAST:event_botonAutoUActionPerformed

    private void botonAutoNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAutoNActionPerformed
        this.contenido.removeAll();
        this.contenido.add(autoN.traerContenido());
        autoN.posicion(this);
        this.contenido.revalidate();
        this.contenido.repaint();
        this.GenerarPlacas.setVisible(false);

    }//GEN-LAST:event_botonAutoNActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        Inicio ini = new Inicio();
        ini.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_botonRegresarActionPerformed

    private void GenerarPlacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarPlacasActionPerformed
        
        String placasGeneradas = "";
        //validadores
        try {
            registroAuto.validarAuto(auto);
            //generar placas 
            if (this.Opcion == 1) {
                placasGeneradas = registroAuto.registrarAutomovil(auto, persona);
            }
            if (this.Opcion == 2) {
                placasGeneradas = registroAuto.registrarAutomovilUsado(auto, persona);
            }
            

            //ver las placas generadas
            this.contenido.removeAll();

            this.contenido.add(placas.traerContenido());
            placas.posicion(this);
            placas.txtPlacas.setText(placasGeneradas);
            this.contenido.revalidate();
            this.contenido.repaint();
        } catch (ExcepcionAT ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }


    }//GEN-LAST:event_GenerarPlacasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TramitarPlacas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TramitarPlacas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TramitarPlacas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TramitarPlacas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TramitarPlacas().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton GenerarPlacas;
    private javax.swing.JButton botonAutoN;
    private javax.swing.JButton botonAutoU;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelRojo;
    // End of variables declaration//GEN-END:variables
}
