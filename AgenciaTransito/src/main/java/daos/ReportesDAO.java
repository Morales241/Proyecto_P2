/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import entidadesJPA.Placas;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author crist
 */
public class ReportesDAO implements IReportesDAO {

    EntityManagerFactory emf;

    EntityManager em;

    public ReportesDAO() {
    }

    @Override
    public List<Object[]> consultarLicenciasPlacasPorNombre(String nombre) {
        emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();

        String jpql = "SELECT l, p FROM Licencia l JOIN l.persona p WHERE p.nombre LIKE :nombre";
        TypedQuery<Object[]> query = em.createQuery(jpql, Object[].class);
        query.setParameter("nombre", nombre);
        return query.getResultList();
    }

    @Override
    public List<Object> consultarLicenciasPlacasPorTipo(String tipo) {
        emf = Persistence.createEntityManagerFactory("ConexionPU");
        em = emf.createEntityManager();

        String jpql;
        if ("licencias".equals(tipo)) {
            jpql = "SELECT l FROM Licencia l";
        } else if ("placas".equals(tipo)) {
            jpql = "SELECT p FROM Placas p";
        } else {
            throw new IllegalArgumentException("Tipo de trámite no válido: " + tipo);
        }

        TypedQuery<Object> query = em.createQuery(jpql, Object.class);
        return query.getResultList();

    }

    @Override
    public List<Object[]> consultarLicenciasPlacasPorPeriodo(Calendar fechaInicio, Calendar fechaFin) {
        emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();

        String jpql = "SELECT l, p FROM Licencia l JOIN l.persona p JOIN l.placas pl WHERE l.fechaGeneracion BETWEEN :fechaInicio AND :fechaFin OR pl.fechaGeneracion BETWEEN :fechaInicio AND :fechaFin";
        TypedQuery<Object[]> query = em.createQuery(jpql, Object[].class);
        query.setParameter("fechaInicio", fechaInicio);
        query.setParameter("fechaFin", fechaFin);
        return query.getResultList();
    }

    
    
}
