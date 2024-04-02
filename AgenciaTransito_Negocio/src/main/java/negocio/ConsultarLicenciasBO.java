/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dto.LicenciaDTO;
import entidadesJPA.Licencia;

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

    
}
