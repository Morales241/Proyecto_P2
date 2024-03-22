/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author crist
 */
public class PersonaDAO implements IPersonaDAO {

    EntityManagerFactory emf;

    EntityManager em;

    public PersonaDAO() {
    }

    @Override
    public void registrarPersona(Persona persona) {
        emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();

        em.getTransaction().begin();
        
        em.persist(persona);
        
        em.getTransaction().commit();

        em.close();
        
        emf.close();
        
    }

    @Override
    public boolean validarPersona(String rfc, String nombre, String apellidoM, String apellidoP) {

        List<Persona> personas = null;

        emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Persona> query = cb.createQuery(Persona.class);

        Root<Persona> personaRoot = query.from(Persona.class);

        Predicate prepre = cb.and((cb.equal(personaRoot.get("rfc"), rfc)),
                (cb.equal(personaRoot.get("nombre"), nombre)),
                (cb.equal(personaRoot.get("apellidoM"), apellidoM)),
                (cb.equal(personaRoot.get("apellidoP"), apellidoP)));

        query.where(prepre);

        personas = em.createQuery(query).getResultList();

        em.close();
        
        emf.close();
        
        return personas.size() != 0;
    }

    @Override
    public void actualizarPersona(Persona persona) {

    }

    
}
