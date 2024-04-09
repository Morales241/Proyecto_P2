/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import entidadesJPA.Vehiculo;
import java.util.List;

/**
 * Interfaz de vehiculo que define los metodos abstractos
 * @author crist
 */
public interface IVehiculoDAO {

    /**
     * Metodo que registra el vehiculo en la base de datos recibiendo un vehiculo
     * @param vehiculo
     */
    public void registrarVehiculo(Vehiculo vehiculo);

    /**
     * Metodo que regresa la lista de los vehiculos recibiendo un vehiculo
     * @param vehiculo
     * @return
     */
    public List<Vehiculo> consultarVehiculos(Vehiculo vehiculo);

    /**
     * Metodo que regresa verdadero o falso al validar la existencia de un vehiculo recibiendo un ID
     * @param id
     * @return
     */
    public boolean validarVehiculoExistente(Long id);

}
