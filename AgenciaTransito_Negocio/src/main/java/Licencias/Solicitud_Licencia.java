/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Licencias;

import daos.LicenciaDAO;
import daos.PersonaDAO;
import dto.LicenciaDTO;
import dto.PersonaDTO;
import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tacot
 */
public class Solicitud_Licencia implements ISolicitud_Licencia {
    
    PersonaDAO pc = new PersonaDAO();
        
        LicenciaDAO lc = new LicenciaDAO();
        
        
    @Override
    public String validarDatos(LicenciaDTO licencia, PersonaDTO persona) {
        if (licencia != null && persona != null) {
            
            if (true) {
                
            }else{
            
            }
        } else {
            
            return "los datos de la persona o la licencia son nulos";
            
        }
        return "Algo salio terriblemente mal";
    }

    @Override
    public boolean SolicitarLicencia(LicenciaDTO lic, PersonaDTO per) {
        List<Licencia> licencias = new ArrayList<>();
        Persona persona = new Persona(per.getFechaNaci(), per.getRfc(), per.getNombre(), per.getApellidoP(), per.getApellidoM(), per.getTelefono());
        Licencia licencia = new Licencia(lic.getFechaExpedicion(), lic.getFechaVencimiento(), lic.getTipo(), lic.getVigencia(), lic.getCosto());
        
        if (pc.validarPersona(per.getRfc(), per.getNombre(), per.getApellidoP(), per.getApellidoM())) {
            lic.setPersona(per);
            licencias.add(licencia);
            per.setLicencias(licencias);
            
            pc.registrarPersona(persona,licencia);
        }else{
            
            pc.actualizarPersona(per, lic);
            
        }
    }

}
