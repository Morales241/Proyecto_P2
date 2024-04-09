/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import dto.ReporteDTO;
import entidadesJPA.Automovil;
import entidadesJPA.Persona;
import entidadesJPA.Placas;
import entidadesJPA.Reporte;
import excepciones.ExcepcionAT;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author crist
 */
public interface IReportes {
    public List<ReporteDTO> consultarLicenciasPlacasPorNombre(String nombre)throws ExcepcionAT;
    
    public List<ReporteDTO> consultarLicenciasPlacasPorPeriodo(LocalDate fechaInicio, LocalDate fechaFin) throws ExcepcionAT;
    
    public List<ReporteDTO> consultarLicenciasPlacasPorTipo(String tipo)throws ExcepcionAT;
    
    public void generarReporte(List<ReporteDTO> reportes);
    
    public JTable cargarDatosTablaReportes(List<ReporteDTO> reportes, JTable JTable1);
    
}
