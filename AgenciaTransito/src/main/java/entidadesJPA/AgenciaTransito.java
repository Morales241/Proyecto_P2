/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package entidadesJPA;

import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author tacot
 */
public class AgenciaTransito {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //hola quiero ver el mapeo ylm
         EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ConexionP");
        
         EntityManager entityManager = entityManagerFactory.createEntityManager();
         entityManager.getTransaction().begin();
         
         Calendar fechaNaci = Calendar.getInstance();
         fechaNaci.set(2004, Calendar.MAY, 28);
         Persona p = new Persona( fechaNaci, "1223jnfcncd", "Ana", "Castro", "Noriega", "6442282937");
         
         Calendar fechaExp = Calendar.getInstance();
         fechaExp.set(2024, Calendar.MARCH, 20);
         Calendar fechaVig = Calendar.getInstance();
         fechaVig.set(2027, Calendar.MARCH, 20);
         
         Licencia l = new Licencia(fechaVig, fechaExp, "normal", 3, 1500.0);
         
         l.setPersona(p);
         entityManager.persist(p);
         entityManager.persist(l);
         
         entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
