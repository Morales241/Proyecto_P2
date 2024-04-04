/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import entidadesJPA.Automovil;
import entidadesJPA.Placas;
import entidadesJPA.Vehiculo;
import java.util.List;

/**
 *
 * @author crist
 */
public interface IAutomovilDAO {
    
     public void registrarAutomovil(Automovil automovil);
     
     public List<Placas> buscarAutoPorPlacas(String numero);
}
