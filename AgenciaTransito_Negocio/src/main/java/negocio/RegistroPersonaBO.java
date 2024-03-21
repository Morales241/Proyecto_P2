/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dto.LicenciaDTO;
import dto.PersonaDTO;
import entidadesJPA.Persona;
import java.util.List;
import javax.persistence.*;



/**
 *
 * @author crist
 */
public class RegistroPersonaBO implements IRegistroPersona, IconsultarLicencias{

   
   
    @Override
    public void registrarPersona(PersonaDTO personaDTO, LicenciaDTO licenciaDTO) {
     
        
    }

    @Override
    public List<LicenciaDTO> cunsltarLicencias(Long ID) {
        
        return null;
    }

}
