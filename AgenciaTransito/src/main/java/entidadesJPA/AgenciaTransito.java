/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package entidadesJPA;

import daos.ILicenciaDAO;
import daos.IPersonaDAO;
import daos.LicenciaDAO;
import daos.PersonaDAO;
import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author tacot
 */
public class AgenciaTransito {

    public static void main(String[] args) {
        List<Licencia> licencias = new ArrayList<>();
        
        Calendar fecha = Calendar.getInstance();
        fecha.set(2024, 3, 21);
        
        Calendar fecha2 = Calendar.getInstance();
        fecha.set(2024, 2, 21);
        
        Calendar fecha3 = Calendar.getInstance();
        fecha.set(2027, 3, 21);
        
        PersonaDAO pc = new PersonaDAO();
        
        LicenciaDAO lc = new LicenciaDAO();
        
        Persona per = new Persona(fecha,"MORJ040221SA3", "jesus", "Morales", "Rojas", "6441494951");
        Licencia lic = new Licencia(fecha2, fecha3, "normal", 3, 700.00);
        
        if (pc.validarPersona(per.getRfc(), per.getNombre(), per.getApellidoP(), per.getApellidoM())) {
            lic.setPersona(per);
            licencias.add(lic);
            per.setLicencias(licencias);
            
            pc.registrarPersona(per,lic);
        }else{
            
            pc.actualizarPersona(per, lic);
            
        }
        
        System.out.println(per.toString());
    }
}
