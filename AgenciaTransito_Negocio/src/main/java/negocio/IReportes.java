/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import entidadesJPA.Automovil;
import entidadesJPA.Persona;
import entidadesJPA.Placas;
import entidadesJPA.Reporte;
import excepciones.ExcepcionAT;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author crist
 */
public interface IReportes {
    public List<Reporte> consultarLicenciasPlacasPorNombre(String nombre)throws ExcepcionAT;
    
    public List<Reporte> consultarLicenciasPlacasPorPeriodo(LocalDate fechaInicio, LocalDate fechaFin) throws ExcepcionAT;
    
    public List<Reporte> consultarLicenciasPlacasPorTipo(String tipo)throws ExcepcionAT;
    
    
    
    
}
