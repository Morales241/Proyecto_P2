/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * Clase que implementa la interfaz de ILicenciaDAO y contiene el codigo de todos sus metodos
 * @author crist
 */
public class LicenciaDAO implements ILicenciaDAO {

    EntityManagerFactory emf;
    EntityManager em;

    /**
     * Constructor que inicializa la conexion a la base de datos
     */
    public LicenciaDAO() {
        emf = Persistence.createEntityManagerFactory("ConexionPU");
    }

    @Override
    public void registrarLicencia(Licencia licencia) {
        em = emf.createEntityManager();
        em.getTransaction().begin();

        em.persist(licencia);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    @Override
    public List<Licencia> consultarLicencias(Persona persona) {
        List<Licencia> licencias = null;

        em = emf.createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Licencia> query = cb.createQuery(Licencia.class);

        Root<Licencia> licenciaRoot = query.from(Licencia.class);

        Predicate prepre = cb.equal(licenciaRoot.get("persona").get("id"), persona.getId());

        query.where(prepre);

        licencias = em.createQuery(query).getResultList();

        em.close();

        emf.close();

        return licencias;
    }

    @Override
    public boolean validarLicenciaVigente(Long id) {
        Licencia licencia;

        LocalDate fecha = LocalDate.now();
        emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Licencia> query = cb.createQuery(Licencia.class);

        Root<Licencia> licenciaRoot = query.from(Licencia.class);

        //lo que hago aquí es que traigo la licencia que sea mayor a hoy 
        //por lo tanto es la que todavía esta vigente
        Predicate predicate = cb.and(
                cb.equal(licenciaRoot.get("persona").get("id"), id),
                cb.greaterThan(licenciaRoot.get("fechaVencimiento"), fecha)
        );

        query.where(predicate);

        licencia = em.createQuery(query).getSingleResult();

        em.close();

        emf.close();

        //ahora si se ah guardado una licencia regresamos true para avisar que si 
        //tiene una licencia vigente
        return licencia!=null;
    }

}
