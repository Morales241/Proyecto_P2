/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import entidadesJPA.Placas;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author crist
 */
public interface IReportesDAO {
    public List<Object[]> consultarLicenciasPlacasPorNombre(String nombre);
    
    public List<Object[]> consultarLicenciasPlacasPorPeriodo(Calendar fechaInicio, Calendar fechaFin);
    
    public List<Object> consultarLicenciasPlacasPorTipo(String tipo);
    
}
