package GUI;


import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import entidadesJPA.Placas;
import excepciones.ExcepcionAT;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author crist
 */
public class ConsultasNacimiento extends javax.swing.JFrame {

    ConsultasBO consultasBO = new ConsultasBO();

    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    /**
     * Creates new form ConsultasNacimiento
     */
    public ConsultasNacimiento() {
        initComponents();
      
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        
       getContentPane().add(datePicker1);
             
        javax.swing.JButton btnObtenerFecha = new javax.swing.JButton();
        btnObtenerFecha.setText("Obtener Fecha");
        btnObtenerFecha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LocalDate fechaSeleccionada = datePicker1.getDate();
                System.out.println("Fecha seleccionada: " + fechaSeleccionada);
            }
        });
        
        getContentPane().add(btnObtenerFecha);
        
        pack();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buscarBoton = new javax.swing.JButton();
        verTramitesComboBox = new javax.swing.JComboBox<>();
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenido.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Ingrese su fecha de nacimiento para ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("verificar su existencia en los registros");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Fecha de nacimiento:");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(101, 101, 101))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(verTramitesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(buscarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(verTramitesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
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
         try {

        LocalDate fechaNacimiento = datePicker2.getDate();
       
        
        consultasBO.consultarHistorialFechaN(fechaNacimiento);
        consultasBO.cargarDatosTabla(consultasBO.consultarHistorialFechaN(fechaNacimiento), jTable1);
         } catch (ExcepcionAT ex) {
        Logger.getLogger(ConsultasNacimiento.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        
    }
    }//GEN-LAST:event_buscarBotonActionPerformed

    private void verTramitesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verTramitesComboBoxActionPerformed
        // TODO add your handling code here:
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
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> verTramitesComboBox;
    // End of variables declaration//GEN-END:variables
}
