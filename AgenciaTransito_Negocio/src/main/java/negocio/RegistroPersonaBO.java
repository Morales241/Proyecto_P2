/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dto.PersonaDTO;
import entidadesJPA.Persona;



/**
 *
 * @author crist
 */
public class RegistroPersonaBO implements IRegistroPersona{

    private IRegistroPersona registroPersona;

    public RegistroPersonaBO(IRegistroPersona registroPersona) {
        this.registroPersona = registroPersona;
    }

    @Override
    public void registrarPersona(PersonaDTO personaDTO) {
     // Aquí podrías agregar lógica de negocio si fuera necesario

        // Convertir PersonaDTO a Persona
        Persona persona = new Persona();
        persona.setFechaNaci(personaDTO.getFechaNaci());
        persona.setRfc(personaDTO.getRfc());
        persona.setNombre(personaDTO.getNombre());
        persona.setApellidoP(personaDTO.getApellidoP());
        persona.setApellidoM(personaDTO.getApellidoM());
        persona.setTelefono(personaDTO.getTelefono());
        
         PersonaDTO nuevaPersonaDTO = new PersonaDTO();
        nuevaPersonaDTO.setFechaNaci(persona.getFechaNaci());
        nuevaPersonaDTO.setRfc(persona.getRfc());
        nuevaPersonaDTO.setNombre(persona.getNombre());
        nuevaPersonaDTO.setApellidoP(persona.getApellidoP());
        nuevaPersonaDTO.setApellidoM(persona.getApellidoM());
        nuevaPersonaDTO.setTelefono(persona.getTelefono());

        // Llamar a la capa de persistencia para registrar la persona
        registroPersona.registrarPersona(nuevaPersonaDTO);
    }

   
    
}
