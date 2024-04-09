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
 * Interfaz del caso de uso de los reportes que define sus metodos abstractos
 * @author crist
 */
public interface IReportes {

    /**
     * Metodo que regresa la lista de reportes por el nombre
     * @param nombre
     * @return
     * @throws ExcepcionAT
     */
    public List<ReporteDTO> consultarLicenciasPlacasPorNombre(String nombre)throws ExcepcionAT;
    
    /**
     * Metodo que regresa la lista de reportes por el periodo
     * @param fechaInicio
     * @param fechaFin
     * @return
     * @throws ExcepcionAT
     */
    public List<ReporteDTO> consultarLicenciasPlacasPorPeriodo(Calendar fechaInicio, Calendar fechaFin) throws ExcepcionAT;
    
    /**
     * Metodo que regresa la lista de reportes por el tipo de tramite
     * @param tipo
     * @return
     * @throws ExcepcionAT
     */
    public List<ReporteDTO> consultarLicenciasPlacasPorTipo(String tipo)throws ExcepcionAT;
    
    /**
     * Metodo que genera el reporte pdf
     * @param reportes
     * @param op
     */
    public void generarReporte(List<ReporteDTO> reportes, int op);
    
    /**
     * Metodo que actualiza la tabla con la lista que regresa
     * @param reportes
     * @param JTable1
     * @return
     */
    public JTable cargarDatosTablaReportes(List<ReporteDTO> reportes, JTable JTable1);
    
}
