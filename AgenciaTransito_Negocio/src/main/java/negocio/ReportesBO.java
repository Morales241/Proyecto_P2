/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import daos.ReportesDAO;
import entidadesJPA.Persona;
import excepciones.ExcepcionAT;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author crist
 */
public class ReportesBO implements IReportes{
    
    ReportesDAO reportesDAO = new ReportesDAO();

    @Override
    public List<Object[]> consultarLicenciasPlacasPorNombre(String nombre) throws ExcepcionAT {
        try {
            List<Object[]> placas = reportesDAO.consultarLicenciasPlacasPorNombre(nombre);
            
            return placas;
        } catch (Exception e) {
            throw new ExcepcionAT("La persona buscada no tiene placas ni licencias registradas " , e);
        } 
    }

    @Override
    public List<Object[]> consultarLicenciasPlacasPorPeriodo(Calendar fechaInicio, Calendar fechaFin) throws ExcepcionAT {
         try {
            List<Object[]> placas = reportesDAO.consultarLicenciasPlacasPorPeriodo(fechaInicio, fechaFin);
            
            return placas;
        } catch (Exception e) {
            throw new ExcepcionAT("No se registraron placas ni licencias en el periodo seleccionado" , e);
        }   }

    @Override
    public List<Object> consultarLicenciasPlacasPorTipo(String tipo) throws ExcepcionAT {
        try {
            List<Object> placas = reportesDAO.consultarLicenciasPlacasPorTipo(tipo);
            
            return placas;
        } catch (Exception e) {
            throw new ExcepcionAT("No hay registros del tramite seleccionado" , e);
        }  
    }
    
 

    
}
