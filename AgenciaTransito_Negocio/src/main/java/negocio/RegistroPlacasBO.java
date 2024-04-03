/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import daos.PersonaDAO;
import daos.PlacasDAO;
import dto.PersonaDTO;
import dto.PlacasDTO;
import entidadesJPA.Persona;
import entidadesJPA.Placas;
import excepciones.ExcepcionAT;
import java.util.List;
import java.util.Random;

/**
 *
 * @author crist
 */
public class RegistroPlacasBO implements IRegistroPlacas{
    
    PlacasDAO placasDAO;
    PersonaDAO personaDAO;

    @Override
    public String generarPlacas() {
       Random random = new Random();
        StringBuilder placas = new StringBuilder();

        // Generar 3 letras aleatorias
        for (int i = 0; i < 3; i++) {
            char letter = (char) (random.nextInt(26) + 'A');
            placas.append(letter);
        }

        // Añadir un guión
        placas.append("-");

        for (int i = 0; i < 3; i++) {
            int digit = random.nextInt(10);
            placas.append(digit);
        }

        return placas.toString();
    }

    @Override
    public void registrarPlacas(PlacasDTO placasDTO, PersonaDTO personaDTO){
        
        List<Persona> personaLista= personaDAO.buscarPersonaPorRFC(personaDTO.getRFC());
        Persona persona= personaLista.get(0);
        Placas placas= new Placas(generarPlacas(), placasDTO.getFechaExpedicion(), placasDTO.getFechaRecepcion(),
                             placasDTO.getVigencia(), persona);
        placasDAO.registrarPlaca(placas);
    }
    
    
    @Override
     public PersonaDTO buscarPersonaPorRFC(String RFC) throws ExcepcionAT {
        List<Persona> persona= personaDAO.buscarPersonaPorRFC(RFC);
        if(persona==null){
            throw new ExcepcionAT("La persona buscada no existe en nuestros registros");
        }
        PersonaDTO personaDTO= new PersonaDTO(persona.get(0));
        return personaDTO;
    }
    
    
}
