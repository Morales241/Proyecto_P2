/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidadesJPA.Licencia;
import java.util.Calendar;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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

}
