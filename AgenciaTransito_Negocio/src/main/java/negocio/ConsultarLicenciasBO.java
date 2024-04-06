/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import daos.ConsultasDAO;
import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import entidadesJPA.Placas;
import excepciones.ExcepcionAT;
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
public class ConsultarLicenciasBO implements IconsultarLicencias{

    ConsultasDAO consultasDAO;

    public ConsultarLicenciasBO() {
       consultasDAO = new ConsultasDAO();
    }
    
    
    @Override
    public List<Licencia> cunsltarLicencias(Long ID) {
    List<Licencia> licencias = null;
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionPU");
    EntityManager em = emf.createEntityManager();

    try {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Licencia> query = cb.createQuery(Licencia.class);
        Root<Licencia> licenciaRoot = query.from(Licencia.class);
        Predicate prepre = cb.equal(licenciaRoot.get("persona").get("id"), ID);
        query.where(prepre);
        licencias = em.createQuery(query).getResultList();
    } catch (Exception ex) {
        ex.printStackTrace(); // O manejo adecuado de excepciones
    } finally {
        if (em != null) {
            em.close();
        }
        if (emf != null) {
            emf.close();
        }
    }

    return licencias;
    }

    @Override
    public List<Placas> obtenerPlacasDePersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Licencia> obtenerLicencias(Persona persona) throws ExcepcionAT {
        try {
            List<Licencia> licencias = consultasDAO.obtenerLicencias(persona);
            if (licencias.isEmpty()) {
                throw new ExcepcionAT("La persona buscada no tiene licencias registradas.");
            }
            return licencias;
        } catch (Exception e) {
            throw new ExcepcionAT("Error al obtener las licencias de la persona.", e);
        }
    }

    @Override
    public List<Persona> consultarPorNombre(String Nombre) throws ExcepcionAT  {
        
        if (this.consultasDAO == null) {
            throw new IllegalStateException("El objeto consultasDAO no ha sido inicializado correctamente.");
        }
        try {
            List<Persona> persona = consultasDAO.consultarPorNombre(Nombre);
            if (persona.isEmpty()) {
                throw new ExcepcionAT("La persona buscada no esta registradas.");
            }
            return persona;
        } catch (Exception e) {
             e.printStackTrace(); 
            throw new ExcepcionAT("Error al obtener la persona.", e);
        }  
    }

    @Override
    public List<Persona> consultarHistorialFechaN(Calendar fechaNacimiento) throws ExcepcionAT {
         
        if (this.consultasDAO == null) {
            throw new IllegalStateException("El objeto consultasDAO no ha sido inicializado correctamente.");
        }
        try {
            List<Persona> persona = consultasDAO.consultarHistorialFechaN(fechaNacimiento);
            if (persona.isEmpty()) {
                throw new ExcepcionAT("La persona buscada no esta registradas.");
            }
            return persona;
        } catch (Exception e) {
             e.printStackTrace(); 
            throw new ExcepcionAT("Error al obtener la persona.", e);
        }   }

    @Override
    public List<Persona> consultarPorCURP(String curp) throws ExcepcionAT {
       
        if (this.consultasDAO == null) {
            throw new IllegalStateException("El objeto consultasDAO no ha sido inicializado correctamente.");
        }
        try {
            List<Persona> persona = consultasDAO.consultarPorCURP(curp);
            if (persona.isEmpty()) {
                throw new ExcepcionAT("La persona buscada no esta registradas.");
            }
            return persona;
        } catch (Exception e) {
             e.printStackTrace(); 
            throw new ExcepcionAT("Error al obtener la persona.", e);
        } 
    }

    
}
