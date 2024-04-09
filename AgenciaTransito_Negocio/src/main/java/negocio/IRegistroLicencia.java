/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import dto.LicenciaDTO;
import dto.PersonaDTO;



/**
 *
 * @author crist
 */
public interface IRegistroLicencia {

    /**
     * Metodo que registra una licencia recibiendo una licenciaDTO y personaDTO
     * @param licenciaDTO
     * @param personaDTO
     */
    public void registrarLicencia(LicenciaDTO licenciaDTO, PersonaDTO personaDTO);
}
