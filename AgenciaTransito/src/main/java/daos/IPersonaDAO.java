/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import entidadesJPA.Licencia;
import entidadesJPA.Persona;

/**
 *
 * @author crist
 */
public interface IPersonaDAO {
    
    public void registrarPersona(Persona persona, Licencia licencias);
    
    public boolean validarPersona(String rfc, String nombre, String apellidoP, String apellidoM);
    
    public void actualizarPersona(Persona persona, Licencia licencias);
}
