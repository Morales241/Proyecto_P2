/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import entidadesJPA.Licencia;
import java.util.List;

/**
 *
 * @author jesus
 */
public interface IConsultarLicencia {
    public List<Licencia> consultarLicencias(Long id);
}
