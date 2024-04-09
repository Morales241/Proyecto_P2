/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidadesJPA.Reporte;
import excepciones.ExcepcionAT;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author galan
 */
public class ReporteDAO implements IReporteDAO{
    EntityManagerFactory emf;
    EntityManager em;

    /**
     * Contructor que inicializa la conexion a la base de datos
     */
    public ReporteDAO() {
        emf = Persistence.createEntityManagerFactory("ConexionPU");
    }

    public void registrarReporte (Reporte reporte) throws ExcepcionAT{
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            em.persist(reporte);

            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            System.out.println(e.getCause());
            throw new ExcepcionAT("Error al registrar reporte");
        }
    }
    
    
    @Override
    public List<Reporte> consultarLicenciasPlacasPorNombre(String nombre) {
        emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();

        String jpql = "SELECT r FROM Reporte r WHERE r.nombrePersona LIKE :nombre";
        TypedQuery<Reporte> query = em.createQuery(jpql, Reporte.class);
        query.setParameter("nombre", nombre);
        return query.getResultList();
    }

    @Override
    public List<Reporte> consultarLicenciasPlacasPorTipo(String tipo) {
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

        TypedQuery<Reporte> query = em.createQuery(jpql, Reporte.class);
        return query.getResultList();

    }

    @Override
    public List<Reporte> consultarLicenciasPlacasPorPeriodo(LocalDate fechaInicio, LocalDate fechaFin) {
        emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();

        String jpql = "SELECT l, p FROM Licencia l JOIN l.persona p JOIN l.placas pl WHERE l.fechaGeneracion BETWEEN :fechaInicio AND :fechaFin OR pl.fechaGeneracion BETWEEN :fechaInicio AND :fechaFin";
        TypedQuery<Reporte> query = em.createQuery(jpql, Reporte.class);
        query.setParameter("fechaInicio", fechaInicio);
        query.setParameter("fechaFin", fechaFin);
        return query.getResultList();
    }

}
