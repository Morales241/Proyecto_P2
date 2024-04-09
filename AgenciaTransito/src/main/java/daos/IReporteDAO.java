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
 *
 * @author galan
 */
public interface IReporteDAO {

    public void registrarReporte(Reporte reporte) throws ExcepcionAT;

    public List<Reporte> consultarLicenciasPlacasPorNombre(String nombre);

    public List<Reporte> consultarLicenciasPlacasPorPeriodo(LocalDate fechaInicio, LocalDate fechaFin);

    public List<Reporte> consultarLicenciasPlacasPorTipo(String tipo);
    
    public void generarReporte(List<Reporte> reportes);

}
