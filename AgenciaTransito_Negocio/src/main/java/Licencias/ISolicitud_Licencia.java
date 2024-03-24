/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Licencias;

import dto.LicenciaDTO;
import dto.PersonaDTO;

/**
 *
 * @author tacot
 */
public interface ISolicitud_Licencia {
    public String validarDatos(LicenciaDTO licencia, PersonaDTO persona);
    
    public boolean SolicitarLicencia(LicenciaDTO licencia, PersonaDTO persona);
    
}
