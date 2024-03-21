/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dto.PersonaDTO;
import entidadesJPA.Persona;
import javax.persistence.*;



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
     
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionPU");
        
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        em.persist(personaDTO);
        
    }

}
