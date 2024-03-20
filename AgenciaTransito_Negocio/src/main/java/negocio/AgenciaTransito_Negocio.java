/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package negocio;

import daos.LicenciaDAO;
import daos.PersonaDAO;
import dto.LicenciaDTO;
import dto.PersonaDTO;
import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author crist
 */
public class AgenciaTransito_Negocio {

    public static void main(String[] args) {
        System.out.println("Hello World!");
         // Crear EntityManagerFactory y EntityManager
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ConexionP");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    // Crear instancia de RegistroPersonaBO y RegistroLicenciaBO
    IRegistroPersona registroPersona = new PersonaDAO(entityManager);
    RegistroPersonaBO registroPersonaBO = new RegistroPersonaBO(registroPersona);

    IRegistroLicencia registroLicencia = new LicenciaDAO(entityManager);
    RegistroLicenciaBO registroLicenciaBO = new RegistroLicenciaBO(registroLicencia);

    Calendar fechaNaci = Calendar.getInstance();
    fechaNaci.set(2004, Calendar.MAY, 28);
    PersonaDTO personaDTO = new PersonaDTO(fechaNaci, "1223jnfcncd", "Ana", "Castro", "Noriega", "6442282937");
    registroPersonaBO.registrarPersona(personaDTO);

    // Crear una licencia y registrarla
    Calendar fechaExp = Calendar.getInstance();
    fechaExp.set(2024, Calendar.MARCH, 20);
    Calendar fechaVig = Calendar.getInstance();
    fechaVig.set(2027, Calendar.MARCH, 20);
    LicenciaDTO licenciaDTO = new LicenciaDTO(fechaVig, fechaExp, "normal", 3, 1500.0);
    registroLicenciaBO.registrarLicencia(licenciaDTO);

    // Cerrar EntityManager y EntityManagerFactory
    entityManager.close();
    entityManagerFactory.close();
    }
}
