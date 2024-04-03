/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidadesJPA.Automovil;
import entidadesJPA.Placas;
import entidadesJPA.Vehiculo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author crist
 */
public class AutomovilDAO implements IAutomovilDAO {

    EntityManagerFactory emf;
    EntityManager em;

    public AutomovilDAO() {
        emf = Persistence.createEntityManagerFactory("ConexionPU");
    }

    @Override
    public void registrarAutomovil(Automovil automovil) {
        em = emf.createEntityManager();
        em.getTransaction().begin();

        em.persist(automovil);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    @Override
    public List<Placas> buscarAutoPorPlacas(String numero) {
       try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            String jpql3 = "SELECT p FROM Persona p WHERE p.RFC = :rfc";

            TypedQuery<Placas> query = em.createQuery(jpql3, Placas.class);
            query.setParameter("numero", numero);
            List<Placas> placas = query.getResultList();

            em.getTransaction().commit();
            em.close();
            
            if(!placas.isEmpty()){
                return placas;
            }else{
                return null;
            }
        } catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.getLocalizedMessage());
            return null;
        }   }

}
