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
public class LicenciaDAO implements ILicenciaDAO{
     private EntityManager entityManager;

    public LicenciaDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    } 
   @Override
    public void registrarLicencia(Licencia licencia) {
        entityManager.getTransaction().begin();
        entityManager.persist(licencia);
        entityManager.getTransaction().commit();
    }
   
    
    
}
