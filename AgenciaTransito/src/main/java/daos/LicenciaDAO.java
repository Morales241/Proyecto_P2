/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidadesJPA.Licencia;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;
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
public class LicenciaDAO implements ILicenciaDAO {

    EntityManagerFactory emf;

    EntityManager em;

    public LicenciaDAO() {

    }

    @Override
    public void registrarLicencia(Licencia licencia) {
        emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();

        em.getTransaction().begin();

        em.persist(licencia);

        em.getTransaction().commit();

        em.close();

        emf.close();
    }

    @Override
    public List<Licencia> consultarLicencias(Long id) {
        List<Licencia> licencias = null;

        emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Licencia> query = cb.createQuery(Licencia.class);

        Root<Licencia> licenciaRoot = query.from(Licencia.class);

        Predicate prepre = cb.equal(licenciaRoot.get("persona").get("id"), id);

        query.where(prepre);

        licencias = em.createQuery(query).getResultList();
        
        em.close();
        
        emf.close();
        
        return licencias;
    }

}
