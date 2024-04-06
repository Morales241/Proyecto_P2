/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import excepciones.ExcepcionAT;
import java.util.List;

/**
 *
 * @author crist
 */
public interface IPersonaDAO {
    
    public void registrarPersona(Persona persona) throws ExcepcionAT;
    
    public void actualizarPersona (Persona persona) throws ExcepcionAT;
    
    public List<Persona> buscarPersonaPorRFC(String RFC);
    
    public boolean validarPersona(Persona persona);
    
    public void registrarListaPersonas(List<Persona> personas) throws ExcepcionAT;
    
    public Persona buscarPersona(String RFC);
}
