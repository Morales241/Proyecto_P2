/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidadesJPA.Automovil;
import entidadesJPA.Placas;
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
 *
 * @author tacot
 */
public class PlacasDAO implements IPlacasDAO{
    
    EntityManagerFactory emf;
    EntityManager em;

    public PlacasDAO() {
        emf = Persistence.createEntityManagerFactory("ConexionPU");
    }
    
    @Override
    public void registrarPlaca(Placas placa) {
        em = emf.createEntityManager();
        em.getTransaction().begin();

        em.persist(placa);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    @Override
    public List<Placas> consultarPlacas(Automovil auto) {
        List<Placas> placas = null;

        em = emf.createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Placas> query = cb.createQuery(Placas.class);

        Root<Placas> placasRoot = query.from(Placas.class);

        Predicate prepre = cb.equal(placasRoot.get("idAutomovil"), auto.getId());

        query.where(prepre);

        placas = em.createQuery(query).getResultList();

        em.close();

        emf.close();

        return placas;
    }

    @Override
    public boolean validarPlacaVigente(Long id) {
        Placas placa;

        LocalDate fecha = LocalDate.now();

        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Placas> query = cb.createQuery(Placas.class);

        Root<Placas> placasRoot = query.from(Placas.class);

        //lo que hago aquí es que traigo la licencia que sea mayor a hoy 
        //por lo tanto es la que todavía esta vigente
        Predicate predicate = cb.and(
                cb.equal(placasRoot.get("idAutomovil"), id),
                cb.greaterThan(placasRoot.get("fechaRecepcion"), fecha)
        );

        query.where(predicate);

        placa = em.createQuery(query).getSingleResult();

        em.close();

        emf.close();

        //ahora si se ah guardado una licencia regresamos true para avisar que si 
        //tiene una licencia vigente
        return placa!=null;
    }

    @Override
    public boolean validarPlacaExistente(String numero) {
        Placas placa;


        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Placas> query = cb.createQuery(Placas.class);

        Root<Placas> placasRoot = query.from(Placas.class);

        Predicate predicate = cb.and(
                cb.equal(placasRoot.get("numero"), numero)
        );

        query.where(predicate);

        placa = em.createQuery(query).getSingleResult();

        em.close();

        emf.close();

        //ahora si se ah guardado una licencia regresamos true para avisar que si 
        //tiene una licencia con ese numero
        return placa!=null;
    }
    
}
