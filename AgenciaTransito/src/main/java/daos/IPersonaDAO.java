/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import entidadesJPA.Persona;

/**
 *
 * @author crist
 */
public interface IPersonaDAO {
    
    public void registrarPersona(Persona persona);
    
    public boolean validarPersona(String rfc, String nombre, String apellidoM, String apellidoP);
    
    public void actualizarPersona(Persona persona);
}
