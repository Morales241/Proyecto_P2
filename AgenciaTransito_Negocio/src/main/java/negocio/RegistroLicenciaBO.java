/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dto.LicenciaDTO;
import dto.PersonaDTO;
import entidadesJPA.Licencia;
import javax.persistence.*;

/**
 * aqui lo que hacemos es que pedimos una licencia y una persona, mandamos a pedir si tiene Licencias
 *
 * @author crist
 */
public class RegistroLicenciaBO implements IRegistroLicencia {

    @Override
    public void registrarLicencia(LicenciaDTO licenciaDTO) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionPU");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        em.persist(licenciaDTO);

        em.getTransaction().commit();

        em.close();
        
        emf.close();
    }

}
