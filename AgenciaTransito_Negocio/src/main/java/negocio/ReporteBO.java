/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import daos.ConsultasDAO;
import daos.ReporteDAO;
import dto.ReporteDTO;
import entidadesJPA.Placas;
import entidadesJPA.Reporte;
import excepciones.ExcepcionAT;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author galan
 */
public class ReporteBO implements IReportes{
    
    ReporteDAO reporteDAO;
     ConsultasDAO consultasDAO;
    private JLabel tituloTablas = new JLabel();
    private JLabel tablitaSP = new JLabel();
    private JLabel tableReportes = new JLabel();

    public ReporteBO() {
        reporteDAO= new ReporteDAO();
    }
    
    
    public void registrarReporte(ReporteDTO reporteDTO){
        try {
            Reporte reporte= new Reporte(reporteDTO.getNombrePersona(), reporteDTO.getRFC(), reporteDTO.getTipoTramite(), 
                    reporteDTO.getCosto(), reporteDTO.getFechaExpedicion());
            reporteDAO.registrarReporte(reporte);
        } catch (ExcepcionAT ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
       @Override
    public List<Reporte> consultarLicenciasPlacasPorNombre(String nombre) throws ExcepcionAT {
        try {
            List<Reporte> reporte = reporteDAO.consultarLicenciasPlacasPorNombre(nombre);
            
            return reporte;
        } catch (Exception e) {
            throw new ExcepcionAT("La persona buscada no tiene placas ni licencias registradas " , e);
        } 
    }

    @Override
    public List<Reporte> consultarLicenciasPlacasPorPeriodo(LocalDate fechaInicio, LocalDate fechaFin) throws ExcepcionAT {
         try {
            List<Reporte> reporte = reporteDAO.consultarLicenciasPlacasPorPeriodo(fechaInicio, fechaFin);
            
            return reporte;
        } catch (Exception e) {
            throw new ExcepcionAT("No se registraron placas ni licencias en el periodo seleccionado" , e);
        }   }

    @Override
    public List<Reporte> consultarLicenciasPlacasPorTipo(String tipo) throws ExcepcionAT {
        try {
            List<Reporte> reporte = reporteDAO.consultarLicenciasPlacasPorTipo(tipo);
            
            return reporte;
        } catch (Exception e) {
            throw new ExcepcionAT("No hay registros del tramite seleccionado" , e);
        }  
    }
    
 
    
    public void cargarDatosTablaReportes(List<Reporte> reportes, JTable JTable1) {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Placas", "Expedicion", "Recepcion", "Vigencia"});

        if (reportes.isEmpty()) {
            tituloTablas.setText("No se encontro ninguna persona");

        } else {
            tituloTablas.setText("Selecciona 1 de " + reportes.size() + " personas encontradas para continuar");

            for (Reporte reporte : reportes) {
                Date fechaE = reporte.getFechaExpedicion().getTime();
                String fechaExString = (fechaE != null) ? new SimpleDateFormat("yyyy-MM-dd").format(fechaE) : "NoDate";

                
                model.addRow(new Object[]{reporte.getNombrePersona(), reporte.getRFC(), reporte.getTipoTramite(), reporte.getCosto(), fechaE});
            }
            JTable1.setModel(model);

            tablitaSP.setVisible(true);
            tableReportes.setVisible(true);

        }
        tituloTablas.setVisible(true);

    }
}
