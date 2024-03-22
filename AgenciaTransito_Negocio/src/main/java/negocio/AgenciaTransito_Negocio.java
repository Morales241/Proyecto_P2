/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package negocio;

import daos.PersonaDAO;
import dto.LicenciaDTO;
import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;



/**
 *
 * @author crist
 */
public class AgenciaTransito_Negocio {
/*
    public static void main(String[] args) {
        System.out.println("Hello World!");
         List<Licencia> licencias = new ArrayList<>();
        
        Calendar fecha = Calendar.getInstance();
        fecha.set(2024, 3, 21);
        
        Calendar fecha2 = Calendar.getInstance();
        fecha.set(2024, 2, 21);
        
        Calendar fecha3 = Calendar.getInstance();
        fecha.set(2025, 3, 21);
        
        RegistroPersonaBO pc = new RegistroPersonaBO();
        PersonaDAO pD = new PersonaDAO();
        ConsultarLicenciasBO cl = new ConsultarLicenciasBO();
        
        Persona per = new Persona(fecha,"MORJ040221SA3", "jesus", "Morales", "Rojas", "6441494951");
        Licencia lic = new Licencia(fecha2, fecha3, "normal", 1, 300.00);
        
        if (pc.validarPersona(per)) {
            lic.setPersona(per);
            licencias.add(lic);
            per.setLicencias(licencias);
            
            pD.registrarPersona(per);
        }else{
            
            licencias = cl.cunsltarLicencias(lic.getId());
            lic.setPersona(per);
            licencias.add(lic);
            per.setLicencias(licencias);
            pD.registrarPersona(per);
            
        }
   
    }*/
}
