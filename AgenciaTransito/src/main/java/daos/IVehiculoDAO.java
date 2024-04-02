/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import entidadesJPA.Vehiculo;
import java.util.List;

/**
 *
 * @author crist
 */
public interface IVehiculoDAO {
      public void registrarVehiculo(Vehiculo vehiculo);

    public List<Vehiculo> consultarVehiculos(Vehiculo vehiculo);

    public boolean validarVehiculoExistente(Long id);

}
