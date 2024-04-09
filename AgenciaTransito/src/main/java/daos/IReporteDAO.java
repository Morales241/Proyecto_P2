/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import entidadesJPA.Reporte;
import excepciones.ExcepcionAT;
import java.time.LocalDate;
import java.util.List;

/**
 * Interfaz de reportes que define los metodos abstractos
 * @author galan
 */
public interface IReporteDAO {

    /**
     * Metodo que registra un reporte y arroja una excepcion
     * @param reporte
     * @throws ExcepcionAT
     */
    public void registrarReporte(Reporte reporte) throws ExcepcionAT;

    /**
     * Metodo que regresa una lista de reportes del nombre que recibe
     * @param nombre
     * @return
     */
    public List<Reporte> consultarLicenciasPlacasPorNombre(String nombre);

    /**
     * Metodo que regresa una lista de reportes del periodo de fechas que recibe 
     * @param fechaInicio
     * @param fechaFin
     * @return
     */
    public List<Reporte> consultarLicenciasPlacasPorPeriodo(LocalDate fechaInicio, LocalDate fechaFin);

    /**
     * Metodo que regresa una lista de reportes del tipo que recibe
     * @param tipo
     * @return
     */
    public List<Reporte> consultarLicenciasPlacasPorTipo(String tipo);
    
    /**
     *  Metodo que recibe una lista de reportes y genera el reporte en pdf
     * @param reportes
     */
    public void generarReporte(List<Reporte> reportes);

}
