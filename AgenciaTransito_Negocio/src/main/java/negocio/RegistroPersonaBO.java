/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dto.LicenciaDTO;
import dto.PersonaDTO;
import entidadesJPA.Persona;
import java.util.List;
import javax.persistence.*;



/**
 *
 * @author crist
 */
public class RegistroPersonaBO implements IRegistroPersona, IconsultarLicencias{

   private List<LicenciaDTO> licencias;
   
   private EntityManagerFactory emf;
   
   private EntityManager em;
   
    @Override
    public void registrarPersona(PersonaDTO personaDTO, LicenciaDTO licenciaDTO) {
     
        emf = Persistence.createEntityManagerFactory("ConexionPU");
        
        em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        em.persist(personaDTO);
        
        em.getTransaction().commit();
        
        em.close();
        
        emf.close();
    }

    @Override
    public List<LicenciaDTO> cunsltarLicencias(Long ID) {
        emf = Persistence.createEntityManagerFactory("ConexionPU");
        
        em = emf.createEntityManager();
        
//        Criteria 
        
        em.close();
        
        emf.close();
        return null;
    }

}
