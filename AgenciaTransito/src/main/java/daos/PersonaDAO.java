/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import excepciones.ExcepcionAT;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
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
        emf = Persistence.createEntityManagerFactory("ConexionPU");
    }

    @Override
    public void registrarPersona (Persona persona) throws ExcepcionAT{
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            em.persist(persona);

            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            System.out.println(e.getCause());
            throw new ExcepcionAT("Error al registrar persona");
        }
    }
    
    @Override
    public void actualizarPersona (Persona persona) throws ExcepcionAT{
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            em.merge(persona);

            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            System.out.println(e.getCause());
            throw new ExcepcionAT("Error al actualizar persona");
        }
    }

    @Override
    public void registrarListaPersonas(List<Persona> personas) throws ExcepcionAT {
        try {
            for (Persona persona : personas) {
                if (validarPersona(persona)) {
                    System.out.println("La persona con RFC" + persona.getRFC() + " no se puede registrar debido a que ya existe");
                } else {
                    registrarPersona(persona);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getCause());
            throw new ExcepcionAT("Error al registrar lista de personas");
        }
    }

    @Override
    public List<Persona> buscarPersonaPorRFC(String RFC) {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            String jpql3 = "SELECT p FROM Persona p WHERE p.RFC = :rfc";

            TypedQuery<Persona> query = em.createQuery(jpql3, Persona.class);
            query.setParameter("rfc", RFC);
            List<Persona> persona = query.getResultList();

            em.getTransaction().commit();
            em.close();
            
            if(!persona.isEmpty()){
                return persona;
            }else{
                return null;
            }
        } catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.getLocalizedMessage());
            return null;
        }
    }

    /**
     * Verifica la existencia de una persona mediante su RFC en la base de
     * datos.
     *
     * @param persona
     * @return Regresa verdadero si existe en la base de datos, falso en caso
     * contrario
     */
    @Override
    public boolean validarPersona(Persona persona) {
        List<Persona> listaPersona = buscarPersonaPorRFC(persona.getRFC());
        return !listaPersona.isEmpty();
    }

    @Override
    public Persona buscarPersona(String RFC) {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            String jpql3 = "SELECT p FROM Persona p WHERE p.RFC = :rfc";

            TypedQuery<Persona> query = em.createQuery(jpql3, Persona.class);
            query.setParameter("rfc", RFC);
            Persona persona = query.getSingleResult();

            em.getTransaction().commit();
            em.close();
            
            return persona;
        } catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.getLocalizedMessage());
            return null;
        }
    }

}
