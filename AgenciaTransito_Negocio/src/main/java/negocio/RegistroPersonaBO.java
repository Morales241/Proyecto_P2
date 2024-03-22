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
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;



/**
 *
 * @author crist
 */
public class RegistroPersonaBO implements IRegistroPersona{
EntityManagerFactory emf;

    EntityManager em;
    
    @Override
    public boolean validarPersona(Persona persona) {
         List<Persona> personas = null;

        emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Persona> query = cb.createQuery(Persona.class);

        Root<Persona> personaRoot = query.from(Persona.class);

        Predicate prepre = cb.and((cb.equal(personaRoot.get("rfc"), persona.getRfc())),
                (cb.equal(personaRoot.get("nombre"), persona.getNombre())),
                (cb.equal(personaRoot.get("apellidoM"), persona.getApellidoM())),
                (cb.equal(personaRoot.get("apellidoP"), persona.getApellidoP())));

        query.where(prepre);

        personas = em.createQuery(query).getResultList();

        em.close();
        
        emf.close();
        
        return personas.size() != 0;
    }

    
   
   
  

}
