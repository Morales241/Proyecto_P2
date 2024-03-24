/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Licencias;

import dto.LicenciaDTO;
import dto.PersonaDTO;

/**
 *
 * @author tacot
 */
public class Solicitud_Licencia implements ISolicitud_Licencia {

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
    public boolean SolicitarLicencia(LicenciaDTO licencia, PersonaDTO persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
