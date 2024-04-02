/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidadesJPA.Vehiculo;
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
public class VehiculoDAO {
    EntityManagerFactory emf;
    EntityManager em;

    public VehiculoDAO() {
        emf = Persistence.createEntityManagerFactory("ConexionPU");
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        em = emf.createEntityManager();
        em.getTransaction().begin();

        em.persist(vehiculo);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public List<Vehiculo> consultarVehiculos(Vehiculo vehiculo) {
        List<Vehiculo> vehiculos = null;

        em = emf.createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Vehiculo> query = cb.createQuery(Vehiculo.class);

        Root<Vehiculo> vehiculoRoot = query.from(Vehiculo.class);

        Predicate prepre = cb.equal(vehiculoRoot.get("vehiculo").get("id"), vehiculo.getId());

        query.where(prepre);

        vehiculos = em.createQuery(query).getResultList();

        em.close();

        emf.close();

        return vehiculos;
    }

   public boolean validarVehiculoExistente(Long id) {
        Vehiculo vehiculo;

        emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Vehiculo> query = cb.createQuery(Vehiculo.class);

        Root<Vehiculo> vehiculoRoot = query.from(Vehiculo.class);

        //lo que hago aquí es que traigo la licencia que sea mayor a hoy 
        //por lo tanto es la que todavía esta vigente
        Predicate predicate = cb.and(
                cb.equal(vehiculoRoot.get("vehiculo").get("id"), id)
        );

        query.where(predicate);

        vehiculo = em.createQuery(query).getSingleResult();

        em.close();

        emf.close();

        //ahora si se ah guardado una licencia regresamos true para avisar que si 
        //tiene una licencia vigente
        return vehiculo!=null;
    }
}
