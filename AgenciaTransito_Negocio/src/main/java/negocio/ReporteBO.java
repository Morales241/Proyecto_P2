/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import daos.ConsultasDAO;
import daos.ReporteDAO;
import dto.ReporteDTO;
import entidadesJPA.Reporte;
import excepciones.ExcepcionAT;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Clase que implementa la interfaz de IReportes y contiene el codigo de todos sus metodos
 * @author galan
 */
public class ReporteBO implements IReportes{
    
    ReporteDAO reporteDAO;
    ConsultasDAO consultasDAO;
    private JLabel tituloTablas = new JLabel();
    private JLabel tablitaSP = new JLabel();
    private JLabel tableReportes = new JLabel();

    /**
     * Constructor que inicializa reporteDAO
     */
    public ReporteBO() {
        reporteDAO= new ReporteDAO();
    }
    
    /**
     * Metodo que registra un reporte recibiendo reporteDTO llamando el metodo en reporteDAO
     * @param reporteDTO
     */
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
    public List<ReporteDTO> consultarLicenciasPlacasPorNombre(String nombre) throws ExcepcionAT {
        try {
            List<Reporte> reportes = reporteDAO.consultarLicenciasPlacasPorNombre(nombre);
            
            List<ReporteDTO> reportesDTO = new ArrayList<>();
            reportes.forEach(Reporte->{
            
            ReporteDTO r = new ReporteDTO(Reporte.getNombrePersona(), Reporte.getRFC(), Reporte.getTipoTramite(), 
            Reporte.getFechaExpedicion(),Reporte.getCosto());
            reportesDTO.add(r);
            });
            
            
            return reportesDTO;
        } catch (Exception e) {
            throw new ExcepcionAT("La persona buscada no tiene placas ni licencias registradas " , e);
        } 
    }

    @Override
    public List<ReporteDTO> consultarLicenciasPlacasPorPeriodo(LocalDate fechaInicio, LocalDate fechaFin) throws ExcepcionAT {
         try {
            List<Reporte> reportes = reporteDAO.consultarLicenciasPlacasPorPeriodo(fechaInicio, fechaFin);
            
            List<ReporteDTO> reportesDTO = new ArrayList<>();
            reportes.forEach(Reporte->{
            
            ReporteDTO r = new ReporteDTO(Reporte.getNombrePersona(), Reporte.getRFC(), Reporte.getTipoTramite(), 
            Reporte.getFechaExpedicion(),Reporte.getCosto());
            reportesDTO.add(r);
            });
            
            
            return reportesDTO;
        } catch (Exception e) {
            throw new ExcepcionAT("No se registraron placas ni licencias en el periodo seleccionado" , e);
        }   }

    @Override
    public List<ReporteDTO> consultarLicenciasPlacasPorTipo(String tipo) throws ExcepcionAT {
        try {
            List<Reporte> reportes = reporteDAO.consultarLicenciasPlacasPorTipo(tipo);
            
            List<ReporteDTO> reportesDTO = new ArrayList<>();
            reportes.forEach(Reporte->{
            
            ReporteDTO r = new ReporteDTO(Reporte.getNombrePersona(), Reporte.getRFC(), Reporte.getTipoTramite(), 
            Reporte.getFechaExpedicion(),Reporte.getCosto());
            reportesDTO.add(r);
            });
            
            
            return reportesDTO;
        } catch (Exception e) {
            throw new ExcepcionAT("No hay registros del tramite seleccionado" , e);
        }  
    }
    
 
    @Override
    public JTable cargarDatosTablaReportes(List<ReporteDTO> reportes, JTable JTable1) {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Placas", "Expedicion", "Recepcion", "Vigencia"});

        if (reportes.isEmpty()) {
            tituloTablas.setText("No se encontro ninguna persona");

        } else {
            tituloTablas.setText("Selecciona 1 de " + reportes.size() + " personas encontradas para continuar");

            for (ReporteDTO reporte : reportes) {
                Date fechaE = reporte.getFechaExpedicion().getTime();
                String fechaExString = (fechaE != null) ? new SimpleDateFormat("yyyy-MM-dd").format(fechaE) : "NoDate";

                
                model.addRow(new Object[]{reporte.getNombrePersona(), reporte.getRFC(), reporte.getTipoTramite(), reporte.getCosto(), fechaE});
            }
            JTable1.setModel(model);

            tablitaSP.setVisible(true);
            tableReportes.setVisible(true);

        }
        tituloTablas.setVisible(true);
        
        return JTable1;
    }

    @Override
    public void generarReporte(List<ReporteDTO> reportesDTO) {
        List<Reporte> reportes = new ArrayList<>();
        
        reportesDTO.forEach(ReporteDTO->{
        Reporte r = new Reporte(ReporteDTO.getNombrePersona(), ReporteDTO.getRFC(), ReporteDTO.getTipoTramite(),
        ReporteDTO.getCosto(), ReporteDTO.getFechaExpedicion());
        reportes.add(r);
        });
        
        reportes.forEach(Reporte ->{
            System.out.println(Reporte.getNombrePersona());
        });
        
        
        reporteDAO.generarReporte(reportes);
        
        
    }
}
