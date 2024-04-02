/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import dto.PersonaDTO;
import excepciones.ExcepcionAT;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import negocio.RegistroLicenciaBO;

/**
 *
 * @author galan
 */
public class BusquedaRFC extends javax.swing.JFrame {

    RegistroLicenciaBO registroLicenciaBO= new RegistroLicenciaBO();
    PersonaDTO personaDTO;
    
    /**
     * Creates new form BusquedaRFC
     */
    public BusquedaRFC() {
        initComponents();
        botonSiguiente.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        panelBlanco = new javax.swing.JPanel();
        panelRojo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFieldRFC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        botonSiguiente = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtFieldNombre = new javax.swing.JTextField();
        txtFieldFecha = new javax.swing.JTextField();
        txtFieldTelefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBlanco.setBackground(new java.awt.Color(255, 255, 255));
        panelBlanco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelBlanco.setForeground(new java.awt.Color(0, 0, 0));
        panelBlanco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRojo.setBackground(new java.awt.Color(182, 0, 0));
        panelRojo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelRojo.setForeground(new java.awt.Color(182, 0, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TRÁMITE DE LICENCIAS");

        javax.swing.GroupLayout panelRojoLayout = new javax.swing.GroupLayout(panelRojo);
        panelRojo.setLayout(panelRojoLayout);
        panelRojoLayout.setHorizontalGroup(
            panelRojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRojoLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel6)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        panelRojoLayout.setVerticalGroup(
            panelRojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRojoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelBlanco.add(panelRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 591, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("RFC: ");
        panelBlanco.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 149, -1, -1));

        txtFieldRFC.setBackground(new java.awt.Color(182, 0, 0));
        txtFieldRFC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFieldRFC.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldRFC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtFieldRFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldRFCActionPerformed(evt);
            }
        });
        panelBlanco.add(txtFieldRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 148, 265, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Ingrese su RFC para verificar su existencia en los registros");
        panelBlanco.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 101, -1, -1));

        botonBuscar.setBackground(new java.awt.Color(102, 102, 102));
        botonBuscar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        botonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscar.setText("BUSCAR");
        botonBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        panelBlanco.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 367, 133, 36));

        botonSiguiente.setBackground(new java.awt.Color(102, 102, 102));
        botonSiguiente.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        botonSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        botonSiguiente.setText("SIGUIENTE");
        botonSiguiente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });
        panelBlanco.add(botonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 367, 133, 36));

        botonRegresar.setBackground(new java.awt.Color(102, 102, 102));
        botonRegresar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        botonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresar.setText("REGRESAR");
        botonRegresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        panelBlanco.add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 367, 133, 36));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nombre:");
        panelBlanco.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 194, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Fecha de Nacimiento:");
        panelBlanco.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 236, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Telefono:");
        panelBlanco.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 284, -1, -1));

        txtFieldNombre.setEditable(false);
        txtFieldNombre.setBackground(new java.awt.Color(182, 0, 0));
        txtFieldNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFieldNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtFieldNombre.setOpaque(true);
        txtFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNombreActionPerformed(evt);
            }
        });
        panelBlanco.add(txtFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 193, 265, 30));

        txtFieldFecha.setEditable(false);
        txtFieldFecha.setBackground(new java.awt.Color(182, 0, 0));
        txtFieldFecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFieldFecha.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtFieldFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldFechaActionPerformed(evt);
            }
        });
        panelBlanco.add(txtFieldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 235, 265, 30));

        txtFieldTelefono.setEditable(false);
        txtFieldTelefono.setBackground(new java.awt.Color(182, 0, 0));
        txtFieldTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFieldTelefono.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldTelefonoActionPerformed(evt);
            }
        });
        panelBlanco.add(txtFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 283, 265, 30));

        getContentPane().add(panelBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldRFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldRFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldRFCActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        try {
            txtFieldNombre.setText("");
            txtFieldTelefono.setText("");
            txtFieldFecha.setText("");
            
            personaDTO= registroLicenciaBO.buscarPersonaPorRFC(txtFieldRFC.getText());
            
            txtFieldNombre.setText(personaDTO.getNombre());
            txtFieldTelefono.setText(personaDTO.getTelefono());
            txtFieldFecha.setText(personaDTO.getFechaNacimiento().getTime().toString());
            
            botonSiguiente.setVisible(true);
        } catch (Exception ex) {
            botonSiguiente.setVisible(false);
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
        TramitarLicencia tramiteLicencia= new TramitarLicencia(personaDTO);
        tramiteLicencia.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonSiguienteActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void txtFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNombreActionPerformed

    private void txtFieldFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldFechaActionPerformed

    private void txtFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldTelefonoActionPerformed

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
            java.util.logging.Logger.getLogger(BusquedaRFC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusquedaRFC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusquedaRFC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusquedaRFC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusquedaRFC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel panelBlanco;
    private javax.swing.JPanel panelRojo;
    private javax.swing.JTextField txtFieldFecha;
    private javax.swing.JTextField txtFieldNombre;
    private javax.swing.JTextField txtFieldRFC;
    private javax.swing.JTextField txtFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
