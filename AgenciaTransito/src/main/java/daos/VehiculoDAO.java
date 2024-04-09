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
 * Clase que implementa la interfaz de IVehiculoDAO y contiene el codigo de sus metodos
 * @author crist
 */
public class VehiculoDAO implements IVehiculoDAO{
    EntityManagerFactory emf;
    EntityManager em;

    /**
     * Constructor que inicializa la conexion a la base de datos
     */
    public VehiculoDAO() {
        emf = Persistence.createEntityManagerFactory("ConexionPU");
    }

    /**
     * Metodo de la interfaz que contiene el codigo para registrar un vehiculo a la base de datos
     * @param vehiculo
     */
    public void registrarVehiculo(Vehiculo vehiculo) {
        em = emf.createEntityManager();
        em.getTransaction().begin();

        em.persist(vehiculo);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    /**
     * Metodo de la interfaz que contiene el codigo para regresar la lista de los vehiculos
     * @param vehiculo
     * @return
     */
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

    /**
     * Metodo de la interfaz que contiene el codigo para validar la existencia de un vehiculo
     * @param id
     * @return
     */
    public boolean validarVehiculoExistente(Long id) {
        Vehiculo vehiculo;

        emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Vehiculo> query = cb.createQuery(Vehiculo.class);

        Root<Vehiculo> vehiculoRoot = query.from(Vehiculo.class);

        Predicate predicate = cb.and(
                cb.equal(vehiculoRoot.get("vehiculo").get("id"), id)
        );

        query.where(predicate);

        vehiculo = em.createQuery(query).getSingleResult();

        em.close();

        emf.close();

        return vehiculo!=null;
    }
}
