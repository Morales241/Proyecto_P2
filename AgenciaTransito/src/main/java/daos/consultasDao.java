/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author tacot
 */
public class consultasDao implements IconsultasDAO {

    EntityManagerFactory emf;

    EntityManager em;

    public consultasDao() {
    }

    @Override
    public List<Object> consultarHistorialNombre(String Nombre, String aP, String aM) {
        emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();
        
        String jpql = "SELECT l FROM Licencia l WHERE l.persona.nombre = :nombre AND l.persona.apellidoP = :apellidoP AND l.persona.apellidoM = :apellidoM";
        TypedQuery<Object> query = em.createQuery(jpql, Object.class);
        query.setParameter("nombre", Nombre);
        query.setParameter("apellidoP", aP);
        query.setParameter("apellidoM", aM);
        return query.getResultList();
    }

    @Override
    public List<Object> consultarHistorialFechaN(String Nombre, String aP, String aM) {
        emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();
        
        String jpql = "SELECT l FROM Licencia l WHERE l.persona.nombre = :nombre AND l.persona.apellidoP = :apellidoP AND l.persona.apellidoM = :apellidoM";
        TypedQuery<Object> query = em.createQuery(jpql, Object.class);
        query.setParameter("nombre", Nombre);
        query.setParameter("apellidoP", aP);
        query.setParameter("apellidoM", aM);
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
}
