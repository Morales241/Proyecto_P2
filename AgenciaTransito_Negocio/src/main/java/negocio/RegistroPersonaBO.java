/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dto.PersonaDTO;

/**
 *
 * @author crist
 */
public class RegistroPersonaBO implements IRegistroPersona{

    @Override
    public void registrarPersona(PersonaDTO personaDTO) {
       Persona persona = new Persona(personaDTO.getFechaNaci(), personaDTO.getRfc(),
                                       personaDTO.getNombre(), personaDTO.getApellidoP(),
                                       personaDTO.getApellidoM(), personaDTO.getTelefono());
        entityManager.getTransaction().begin();
        entityManager.persist(persona);
        entityManager.getTransaction().commit();
    }
    
}
