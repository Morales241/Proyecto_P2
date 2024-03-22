/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;


import dto.PersonaDTO;
import entidadesJPA.Persona;

/**
 *
 * @author crist
 */
public interface IRegistroPersona {
    public boolean validarPersona(PersonaDTO persona);
}
