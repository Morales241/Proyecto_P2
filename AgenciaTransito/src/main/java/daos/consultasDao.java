/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import entidadesJPA.Placas;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author tacot
 */
public class ConsultasDAO implements IConsultasDAO {

    EntityManagerFactory emf;

    EntityManager em;

    public ConsultasDAO() {
    }

    @Override
    public List<Object> consultarHistorialNombre(String Nombre, String aP, String aM) {
        emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();
        
        String jpql = "SELECT l FROM Licencia l WHERE l.persona.nombre = :nombre AND l.persona.apellidoPaterno = :apellidoP AND l.persona.apellidoMaterno = :apellidoM";
        TypedQuery<Object> query = em.createQuery(jpql, Object.class);
        query.setParameter("nombre", Nombre);
        query.setParameter("apellidoP", aP);
        query.setParameter("apellidoM", aM);
        return query.getResultList();
    }

    @Override
    public List<Persona> consultarHistorialFechaN(Calendar fechaNacimiento) {
        emf = Persistence.createEntityManagerFactory("ConexionPU");
        em = emf.createEntityManager();

        // Convertir el Calendar a un String en el formato "yyyy-MM-dd"
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fechaNacimientoStr = sdf.format(fechaNacimiento.getTime());

        String jpql = "SELECT p FROM Persona p WHERE p.fechaNacimiento LIKE :fechaNacimiento";
        TypedQuery<Persona> query = em.createQuery(jpql, Persona.class);
        query.setParameter("fechaNacimiento", "%" + fechaNacimientoStr + "%");
        return query.getResultList();
    }


    @Override
    public List<Object> consultarHistorialCURP(String curp) {
        emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();
        
        String jpql = "SELECT l FROM Licencia l WHERE l.persona.rfc = :rfc";
        TypedQuery<Object> query = em.createQuery(jpql, Object.class);
        query.setParameter("rfc", curp);
        return query.getResultList();
    }

    @Override
    public List<Placas> obtenerPlacasDePersona(Persona persona) {
        emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();
        
        String jpql = "SELECT p FROM Placas p WHERE p.automovil.propietario = :persona";
        TypedQuery<Placas> query = em.createQuery(jpql, Placas.class);
        query.setParameter("persona", persona);
        return query.getResultList();

    }

    @Override
    public List<Licencia> obtenerLicencias(Persona persona) {
       emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();
        
        String jpql = "SELECT l FROM Licencia l WHERE l.persona = :persona";
        TypedQuery<Licencia> query = em.createQuery(jpql, Licencia.class);
        query.setParameter("persona", persona);
        return query.getResultList();
    }
    
     @Override
    public List<Persona> consultarPorNombre(String Nombre) {
        emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();
        
        String jpql = "SELECT p FROM Persona p WHERE p.nombre LIKE :nombre";
        TypedQuery<Persona> query = em.createQuery(jpql, Persona.class);
        query.setParameter("nombre", "%" + Nombre + "%");
        return query.getResultList();
    }
    
    @Override
    public List<Persona> consultarPorCURP(String curp) {
        emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();
        
         String jpql = "SELECT p FROM Persona p WHERE p.RFC LIKE :rfc";
        TypedQuery<Persona> query = em.createQuery(jpql, Persona.class);
        query.setParameter("rfc", "%" + curp + "%");
        return query.getResultList();
    }

}
