/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import dto.LicenciaDTO;
import dto.PersonaDTO;
import excepciones.ExcepcionAT;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import negocio.RegistroLicenciaBO;

/**
 *
 * @author galan
 */
public class TramitarLicencia extends javax.swing.JFrame {

    RegistroLicenciaBO registroLicenciaBO= new RegistroLicenciaBO();
    PersonaDTO personaDTO;
    GregorianCalendar fechaExpedicion= new GregorianCalendar();
    GregorianCalendar fechaVencimiento= new GregorianCalendar();
    String tipo, vigencia;
    Double costo;
    
    /**
     * Creates new form BusquedaRFC
     */
    public TramitarLicencia() {
        initComponents();
        comboBoxVigencia.addItem("1 año");
        comboBoxVigencia.addItem("2 años");
        comboBoxVigencia.addItem("3 años");
    }
    
    public TramitarLicencia(PersonaDTO personaDTO) {
        initComponents();
        this.personaDTO=personaDTO;
        txtFieldNombre.setText(personaDTO.getNombre());
        txtFieldRFC.setText(personaDTO.getRFC());
        txtFieldTelefono.setText(personaDTO.getTelefono());
        txtFieldFecha.setText(personaDTO.getFechaNacimiento().getTime().toString());
        
        comboBoxVigencia.addItem("1 año");
        comboBoxVigencia.addItem("2 años");
        comboBoxVigencia.addItem("3 años");
        
        txtFieldExpedicion.setText(fechaExpedicion.getTime().toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBlanco = new javax.swing.JPanel();
        panelRojo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtFieldPrecio = new javax.swing.JTextField();
        txtFieldFecha = new javax.swing.JTextField();
        txtFieldTelefono = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtFieldRFC = new javax.swing.JTextField();
        comboBoxVigencia = new javax.swing.JComboBox<>();
        txtFieldNombre = new javax.swing.JTextField();
        botonDiscapacidadNo = new javax.swing.JRadioButton();
        botonDiscapacidadSi = new javax.swing.JRadioButton();
        txtFieldVencimiento = new javax.swing.JTextField();
        txtFieldExpedicion = new javax.swing.JTextField();
        botonSolicitar = new javax.swing.JButton();

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

        panelBlanco.add(panelRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 591, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("RFC: ");
        panelBlanco.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

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
        panelBlanco.add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 133, 36));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nombre:");
        panelBlanco.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nacimiento:");
        panelBlanco.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 110, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Precio:");
        panelBlanco.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        txtFieldPrecio.setEditable(false);
        txtFieldPrecio.setBackground(new java.awt.Color(182, 0, 0));
        txtFieldPrecio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFieldPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtFieldPrecio.setOpaque(true);
        txtFieldPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldPrecioActionPerformed(evt);
            }
        });
        panelBlanco.add(txtFieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 170, 30));

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
        panelBlanco.add(txtFieldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 170, 30));

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
        panelBlanco.add(txtFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 170, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Telefono:");
        panelBlanco.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 90, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Vencimiento:");
        panelBlanco.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Discapacidad:");
        panelBlanco.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Vigencia:");
        panelBlanco.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Expedición:");
        panelBlanco.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        txtFieldRFC.setEditable(false);
        txtFieldRFC.setBackground(new java.awt.Color(182, 0, 0));
        txtFieldRFC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFieldRFC.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldRFC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtFieldRFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldRFCActionPerformed(evt);
            }
        });
        panelBlanco.add(txtFieldRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 160, 30));

        comboBoxVigencia.setBackground(new java.awt.Color(182, 0, 0));
        comboBoxVigencia.setForeground(new java.awt.Color(255, 255, 255));
        comboBoxVigencia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxVigenciaItemStateChanged(evt);
            }
        });
        comboBoxVigencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxVigenciaActionPerformed(evt);
            }
        });
        panelBlanco.add(comboBoxVigencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 130, 30));

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
        panelBlanco.add(txtFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 160, 30));

        botonDiscapacidadNo.setBackground(new java.awt.Color(255, 255, 255));
        botonDiscapacidadNo.setForeground(new java.awt.Color(0, 0, 0));
        botonDiscapacidadNo.setText("NO");
        botonDiscapacidadNo.setToolTipText("");
        botonDiscapacidadNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDiscapacidadNoActionPerformed(evt);
            }
        });
        panelBlanco.add(botonDiscapacidadNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 50, 30));

        botonDiscapacidadSi.setBackground(new java.awt.Color(255, 255, 255));
        botonDiscapacidadSi.setForeground(new java.awt.Color(0, 0, 0));
        botonDiscapacidadSi.setText("SI");
        botonDiscapacidadSi.setToolTipText("");
        botonDiscapacidadSi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                botonDiscapacidadSiItemStateChanged(evt);
            }
        });
        botonDiscapacidadSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDiscapacidadSiActionPerformed(evt);
            }
        });
        panelBlanco.add(botonDiscapacidadSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 40, 30));

        txtFieldVencimiento.setEditable(false);
        txtFieldVencimiento.setBackground(new java.awt.Color(182, 0, 0));
        txtFieldVencimiento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFieldVencimiento.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldVencimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtFieldVencimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldVencimientoActionPerformed(evt);
            }
        });
        panelBlanco.add(txtFieldVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 170, 30));

        txtFieldExpedicion.setEditable(false);
        txtFieldExpedicion.setBackground(new java.awt.Color(182, 0, 0));
        txtFieldExpedicion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFieldExpedicion.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldExpedicion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtFieldExpedicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldExpedicionActionPerformed(evt);
            }
        });
        panelBlanco.add(txtFieldExpedicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 170, 30));

        botonSolicitar.setBackground(new java.awt.Color(102, 102, 102));
        botonSolicitar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        botonSolicitar.setForeground(new java.awt.Color(255, 255, 255));
        botonSolicitar.setText("SOLICITAR");
        botonSolicitar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSolicitarActionPerformed(evt);
            }
        });
        panelBlanco.add(botonSolicitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 133, 36));

        getContentPane().add(panelBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        BusquedaRFC licencias = new BusquedaRFC();
        licencias.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void txtFieldPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldPrecioActionPerformed

    private void txtFieldFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldFechaActionPerformed

    private void txtFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldTelefonoActionPerformed

    private void txtFieldRFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldRFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldRFCActionPerformed

    private void comboBoxVigenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxVigenciaActionPerformed

    }//GEN-LAST:event_comboBoxVigenciaActionPerformed

    private void txtFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNombreActionPerformed

    private void botonDiscapacidadNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDiscapacidadNoActionPerformed
        botonDiscapacidadSi.setSelected(false);
        tipo="Normal";
        txtFieldPrecio.setText(registroLicenciaBO.CalcularPrecio(botonDiscapacidadSi, botonDiscapacidadNo, comboBoxVigencia));
    }//GEN-LAST:event_botonDiscapacidadNoActionPerformed

    private void botonDiscapacidadSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDiscapacidadSiActionPerformed
        botonDiscapacidadNo.setSelected(false);
        tipo="Discapacitado";
        txtFieldPrecio.setText(registroLicenciaBO.CalcularPrecio(botonDiscapacidadSi, botonDiscapacidadNo, comboBoxVigencia));
    }//GEN-LAST:event_botonDiscapacidadSiActionPerformed

    private void botonDiscapacidadSiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_botonDiscapacidadSiItemStateChanged

    }//GEN-LAST:event_botonDiscapacidadSiItemStateChanged

    private void comboBoxVigenciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxVigenciaItemStateChanged
        txtFieldPrecio.setText(registroLicenciaBO.CalcularPrecio(botonDiscapacidadSi, botonDiscapacidadNo, comboBoxVigencia));
        
        int op = comboBoxVigencia.getSelectedIndex();
        if(op==0){
            fechaVencimiento.set(GregorianCalendar.YEAR, fechaExpedicion.get(GregorianCalendar.YEAR));
            fechaVencimiento.add(GregorianCalendar.YEAR, 1);
            vigencia= "1 año";
        }else if(op==1){
            fechaVencimiento.set(GregorianCalendar.YEAR, fechaExpedicion.get(GregorianCalendar.YEAR));
            fechaVencimiento.add(GregorianCalendar.YEAR, 2);
            vigencia= "2 años";
        }else{
            fechaVencimiento.set(GregorianCalendar.YEAR, fechaExpedicion.get(GregorianCalendar.YEAR));
            fechaVencimiento.add(GregorianCalendar.YEAR, 3);
            vigencia= "3 años";
        }
        txtFieldVencimiento.setText(fechaVencimiento.getTime().toString());
    }//GEN-LAST:event_comboBoxVigenciaItemStateChanged

    private void txtFieldVencimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldVencimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldVencimientoActionPerformed

    private void txtFieldExpedicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldExpedicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldExpedicionActionPerformed

    private void botonSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSolicitarActionPerformed
        try {
            LicenciaDTO licenciaDTO= new LicenciaDTO(fechaVencimiento, fechaExpedicion, tipo, vigencia, Double.parseDouble(txtFieldPrecio.getText()), "Activo");
            registroLicenciaBO.registrarLicencia(licenciaDTO, personaDTO);
            JOptionPane.showMessageDialog(null, "El registro de licencia ha sido exitoso");
            Inicio inicio = new Inicio();
            inicio.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Ha habido un error al registrar la licencia");
        }
    }//GEN-LAST:event_botonSolicitarActionPerformed

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
            java.util.logging.Logger.getLogger(TramitarLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TramitarLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TramitarLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TramitarLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TramitarLicencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton botonDiscapacidadNo;
    private javax.swing.JRadioButton botonDiscapacidadSi;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonSolicitar;
    private javax.swing.JComboBox<String> comboBoxVigencia;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelBlanco;
    private javax.swing.JPanel panelRojo;
    private javax.swing.JTextField txtFieldExpedicion;
    private javax.swing.JTextField txtFieldFecha;
    private javax.swing.JTextField txtFieldNombre;
    private javax.swing.JTextField txtFieldPrecio;
    private javax.swing.JTextField txtFieldRFC;
    private javax.swing.JTextField txtFieldTelefono;
    private javax.swing.JTextField txtFieldVencimiento;
    // End of variables declaration//GEN-END:variables
}
