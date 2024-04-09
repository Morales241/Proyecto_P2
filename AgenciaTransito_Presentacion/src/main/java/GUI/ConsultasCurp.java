/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import entidadesJPA.Placas;
import excepciones.ExcepcionAT;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.NoResultException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import negocio.ConsultasBO;

/**
 *
 * @author crist
 */
public class ConsultasCurp extends javax.swing.JFrame {

    ConsultasBO consultasBO = new ConsultasBO();

    
    /**
     * Creates new form ConsultasCurp
     */
    public ConsultasCurp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCurp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buscarBoton = new javax.swing.JButton();
        verTramitesComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(518, 472));

        contenido.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Ingrese su curp para verificar ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("su existencia en los registros");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("CURP:");

        txtCurp.setBackground(new java.awt.Color(182, 0, 0));
        txtCurp.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txtCurp.setForeground(new java.awt.Color(255, 255, 255));
        txtCurp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtCurp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurpActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        buscarBoton.setBackground(new java.awt.Color(102, 102, 102));
        buscarBoton.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        buscarBoton.setForeground(new java.awt.Color(255, 255, 255));
        buscarBoton.setText("BUSCAR");
        buscarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBotonActionPerformed(evt);
            }
        });

        verTramitesComboBox.setBackground(new java.awt.Color(102, 102, 102));
        verTramitesComboBox.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        verTramitesComboBox.setForeground(new java.awt.Color(255, 255, 255));
        verTramitesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VER TRAMITES", "Licencias", "Placas" }));
        verTramitesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verTramitesComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenidoLayout.createSequentialGroup()
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(128, 128, 128))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenidoLayout.createSequentialGroup()
                        .addComponent(verTramitesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenidoLayout.createSequentialGroup()
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contenidoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118)
                                .addComponent(buscarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34))))
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(verTramitesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBotonActionPerformed
        // TODO add your handling code here:
         try {
            
            consultasBO.cargarDatosTabla( consultasBO.consultarPorCURP(txtCurp.getText()), jTable1);
        } catch (ExcepcionAT ex) {
            Logger.getLogger(ConsultasCurp.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        
        }
    }//GEN-LAST:event_buscarBotonActionPerformed

    private void txtCurpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurpActionPerformed

    private void verTramitesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verTramitesComboBoxActionPerformed
      int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada >= 0) {
            String rfcSelected = jTable1.getValueAt(filaSeleccionada, 0).toString();
            System.out.println(rfcSelected);
            String consulta = verTramitesComboBox.getSelectedItem().toString();
            System.out.println(consulta);
            try {
                Persona personaAux = consultasBO.obtenerPersona(rfcSelected);
                if (consulta.equals("Licencias")) {
                    List<Licencia> licencias = consultasBO.obtenerLicencias(personaAux);
                    if (licencias.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "La persona no tiene licencias registradas.", "Mensaje de Advertencia", JOptionPane.WARNING_MESSAGE);
                    } else {
                        consultasBO.cargarDatosTablaLicencias(licencias, jTable1);
                    }
                }
            } catch (ExcepcionAT ex) {
                Logger.getLogger(ConsultasNombre.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoResultException ex) {
                Logger.getLogger(ConsultasNombre.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "La persona no tiene licencias registradas.", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            }
            try {
                Persona personaAux = consultasBO.obtenerPersona(rfcSelected);
                if (consulta.equals("Placas")) {
                    List<Placas> placas = consultasBO.obtenerPlacasDePersona(personaAux);
                    if (placas.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "La persona no tiene placas registradas.", "Mensaje de Advertencia", JOptionPane.WARNING_MESSAGE);
                    } else {
                        consultasBO.cargarDatosTablaPlacas(placas, jTable1);
                    }
                }
            } catch (ExcepcionAT ex) {
                Logger.getLogger(ConsultasNombre.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoResultException ex) {
                Logger.getLogger(ConsultasNombre.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "La persona no tiene placas registradas.", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            System.out.println("No se ha seleccionado ninguna fila.");
        }       
    }//GEN-LAST:event_verTramitesComboBoxActionPerformed

      public javax.swing.JPanel traerContenido(){
        return this.contenido;
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarBoton;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCurp;
    private javax.swing.JComboBox<String> verTramitesComboBox;
    // End of variables declaration//GEN-END:variables
}