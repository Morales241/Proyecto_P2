/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import java.util.List;

/**
 *
 * @author crist
 */
public interface ILicenciaDAO {
    public void registrarLicencia(Licencia licencia);

    public List<Licencia> consultarLicencias(Persona persona);

    public boolean validarLicenciaVigente(Long id);

}
