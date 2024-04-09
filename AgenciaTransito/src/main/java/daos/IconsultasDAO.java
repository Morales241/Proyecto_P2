/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import entidadesJPA.Placas;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author tacot
 */
public interface IConsultasDAO {
    public List<Object> consultarHistorialNombre(String Nombre, String aP, String aM);
    
    public List<Persona> consultarHistorialFechaN(LocalDate fechaNacimiento);
    
    public List<Object> consultarHistorialCURP(String curp);
    
    public List<Placas> obtenerPlacasDePersona(Persona persona);
    
    public List<Licencia> obtenerLicencias(Persona persona);
    
    public List<Persona> consultarPorNombre(String Nombre);
    
    public List<Persona> consultarPorCURP(String curp);
    
    public Persona obtenerPersona(String rfc); 
}
