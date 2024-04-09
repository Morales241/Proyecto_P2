/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import entidadesJPA.Placas;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 * Clase que implementa la interfaz de IConsultasDAO y contiene el codigo de todos sus metodos
 * @author tacot
 */
public class ConsultasDAO implements IConsultasDAO {

    EntityManagerFactory emf;

    EntityManager em;

    /**
     * Constructor Vacio
     */
    public ConsultasDAO() {
    }

    /**
     * Metodo que contiene la consulta JPQL realizada al recibir la fecha de nacimiento
     * @param fechaNacimiento
     * @return
     */
    @Override
    public List<Persona> consultarHistorialFechaN(LocalDate fechaNacimiento) {
        emf = Persistence.createEntityManagerFactory("ConexionPU");
        em = emf.createEntityManager();

        java.util.Date date = java.sql.Date.valueOf(fechaNacimiento);

        String jpql = "SELECT p FROM Persona p WHERE p.fechaNacimiento = :fechaNacimiento";
        TypedQuery<Persona> query = em.createQuery(jpql, Persona.class);
        query.setParameter("fechaNacimiento", date);
        return query.getResultList();
    }

    /**
     * Metodo que contiene la consulta JPQL realizada al recibir una persona y regresa las placas de esa persona
     * @param persona
     * @return
     */
    @Override
    public List<Placas> obtenerPlacasDePersona(Persona persona) {
        emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();
        
        String jpql = "SELECT p FROM Placas p WHERE p.automovil.persona = :persona";
        TypedQuery<Placas> query = em.createQuery(jpql, Placas.class);
        query.setParameter("persona", persona);
        return query.getResultList();

    }

    /**
     * Metodo que contiene la consulta JPQL realizada al recibir una persona y regresa la lista de licencias de esa persona
     * @param persona
     * @return
     */
    @Override
    public List<Licencia> obtenerLicencias(Persona persona) {
       emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();
        
        String jpql = "SELECT l FROM Licencia l WHERE l.persona = :persona";
        TypedQuery<Licencia> query = em.createQuery(jpql, Licencia.class);
        query.setParameter("persona", persona);
        return query.getResultList();
    }
    
    /**
     * Metodo que contiene la consulta JPQL realizada al recibir el nombre
     * @param Nombre
     * @return
     */
    @Override
    public List<Persona> consultarPorNombre(String Nombre) {
        emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();
        
        String jpql = "SELECT p FROM Persona p WHERE p.nombre LIKE :nombre";
        TypedQuery<Persona> query = em.createQuery(jpql, Persona.class);
        query.setParameter("nombre", "%" + Nombre + "%");
        return query.getResultList();
    }
    
    /**
     * Metodo que contiene la consulta JPQL realizada al recibir el rfc
     * @param curp
     * @return
     */
    @Override
    public List<Persona> consultarPorCURP(String curp) {
        emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();
        
         String jpql = "SELECT p FROM Persona p WHERE p.RFC LIKE :rfc";
        TypedQuery<Persona> query = em.createQuery(jpql, Persona.class);
        query.setParameter("rfc", "%" + curp + "%");
        return query.getResultList();
    }
    
    /**
     * Metodo que contiene la consulta JPQL realizada al recibir el rfc de una persona y regresa esa persona
     * @param rfc
     * @return
     */
    @Override
    public Persona obtenerPersona(String rfc) {
        emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();
        
        String jpql = "SELECT p FROM Persona p WHERE p.RFC = :rfc";
        TypedQuery<Persona> query = em.createQuery(jpql, Persona.class);
        query.setParameter("rfc", rfc);
        return query.getSingleResult();

    }

}
