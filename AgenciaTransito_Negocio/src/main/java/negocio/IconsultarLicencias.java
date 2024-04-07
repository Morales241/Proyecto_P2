/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;


import dto.PersonaDTO;
import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import entidadesJPA.Placas;
import excepciones.ExcepcionAT;
import java.util.Calendar;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author tacot
 */
public interface IconsultarLicencias {
    public List<Licencia> cunsltarLicencias(Long ID);
    
    public List<Placas> obtenerPlacasDePersona(Persona persona)throws ExcepcionAT ;
    
    public List<Licencia> obtenerLicencias(Persona persona)throws ExcepcionAT;
    
    public List<Persona> consultarPorNombre(String Nombre)throws ExcepcionAT ;
    
    public List<Persona> consultarHistorialFechaN(Calendar fechaNacimiento) throws ExcepcionAT;
    
    public List<Persona> consultarPorCURP(String curp)throws ExcepcionAT;
    
    public Persona obtenerPersona(String rfc) throws ExcepcionAT;
     
    public void cargarDatosTabla(List<Persona> personas, JTable JTable1);
    
    public void cargarDatosTablaLicencias(List<Licencia> licencias, JTable JTable1);
}
