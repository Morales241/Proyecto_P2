/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dto.LicenciaDTO;

/**
 *
 * @author crist
 */
public class RegistroLicenciaBO implements IRegistroLicencia{

    
    @Override
    public void registrarLicencia(LicenciaDTO licenciaDTO) {
       Licencia licencia = new Licencia(licenciaDTO.getFechaVencimiento(), licenciaDTO.getFehcaExpedicion(),
                                          licenciaDTO.getTipo(), licenciaDTO.getVigencia(), licenciaDTO.getCosto());
        entityManager.getTransaction().begin();
        entityManager.persist(licencia);
        entityManager.getTransaction().commit();
    }
    
}
