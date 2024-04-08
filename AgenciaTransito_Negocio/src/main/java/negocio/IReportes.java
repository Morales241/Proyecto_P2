/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import entidadesJPA.Automovil;
import entidadesJPA.Persona;
import entidadesJPA.Placas;
import excepciones.ExcepcionAT;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author crist
 */
public interface IReportes {
    public List<Object[]> consultarLicenciasPlacasPorNombre(String nombre)throws ExcepcionAT;
    
    public List<Object[]> consultarLicenciasPlacasPorPeriodo(Calendar fechaInicio, Calendar fechaFin) throws ExcepcionAT;
    
    public List<Object> consultarLicenciasPlacasPorTipo(String tipo)throws ExcepcionAT;
    
    
    
    
}
