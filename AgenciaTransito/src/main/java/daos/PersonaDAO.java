/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author crist
 */
public class PersonaDAO implements IPersonaDAO{

    public PersonaDAO() {
    } 
    
  @Override
    public void registrarPersona(Persona persona) {
        
    }
    
    @Override
    public boolean validarPersona(Long id){
        List<Licencia> licencias = null;
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionPU");
        
        
        
        return licencias.isEmpty();
    }

}
