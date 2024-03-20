/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dto.LicenciaDTO;
import entidadesJPA.Licencia;

/**
 *
 * @author crist
 */
public class RegistroLicenciaBO implements IRegistroLicencia{
    private IRegistroLicencia registroLicencia;

    public RegistroLicenciaBO(IRegistroLicencia registroLicencia) {
        this.registroLicencia = registroLicencia;
    }
    public void registrarLicencia(LicenciaDTO licenciaDTO) {
            
    Licencia licencia = new Licencia();
    licencia.setFechaExpedicion(licenciaDTO.getFechaExpedicion());
    licencia.setFechaVencimiento(licenciaDTO.getFechaVencimiento());
    licencia.setTipo(licenciaDTO.getTipo());
    licencia.setVigencia(licenciaDTO.getVigencia());
    licencia.setCosto(licenciaDTO.getCosto());

    // Convertir Licencia a LicenciaDTO
    LicenciaDTO nuevaLicenciaDTO = new LicenciaDTO();
    nuevaLicenciaDTO.setFechaExpedicion(licencia.getFechaExpedicion());
    nuevaLicenciaDTO.setFechaVencimiento(licencia.getFechaVencimiento());
    nuevaLicenciaDTO.setTipo(licencia.getTipo());
    nuevaLicenciaDTO.setVigencia(licencia.getVigencia());
    nuevaLicenciaDTO.setCosto(licencia.getCosto());

    // Llamar a la capa de persistencia para registrar la licencia
    registroLicencia.registrarLicencia(licenciaDTO);
}


    
}
