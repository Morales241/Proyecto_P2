/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author crist
 */
public class PersonaDAO implements IPersonaDAO {

    LicenciaDAO LD = new LicenciaDAO();
    
    EntityManagerFactory emf;

    EntityManager em;

    public PersonaDAO() {
    }

    @Override
    public void registrarPersona(Persona persona, Licencia licencia) {
        List<Licencia> licencias = new ArrayList<>();
        
        emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();

        em.getTransaction().begin();

        licencias.add(licencia);
        
        persona.setLicencias(licencias);
        
        em.persist(persona);

        em.getTransaction().commit();

        em.close();

        emf.close();

    }

    @Override
    public boolean validarPersona(String rfc, String nombre, String apellidoP, String apellidoM) {

        List<Persona> personas = new ArrayList<>();
        
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

        return personas.isEmpty();
    }

    @Override
    public void actualizarPersona(Persona persona, Licencia licencia) {

        persona.setLicencias(LD.consultarLicencias(persona.getId()));
        
        emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();

        em.getTransaction().begin();

        licencia.setPersona(persona);
        
        em.remove(persona);
        
        persona.getLicencias().add(licencia);
        
        em.persist(persona);
        
        persona.getLicencias().add(licencia);
        em.getTransaction().commit();

        em.close();

        emf.close();
    }

}
