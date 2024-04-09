/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import daos.ReporteDAO;
import dto.ReporteDTO;
import entidadesJPA.Reporte;
import excepciones.ExcepcionAT;
import javax.swing.JOptionPane;

/**
 *
 * @author galan
 */
public class ReporteBO {
    
    ReporteDAO reporteDAO;

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
}
