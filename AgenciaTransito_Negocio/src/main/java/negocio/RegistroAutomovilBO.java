/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import daos.AutomovilDAO;
import dto.AutomovilDTO;
import dto.VehiculoDTO;
import entidadesJPA.Automovil;


/**
 *
 * @author crist
 */
public class RegistroAutomovilBO implements IRegistroAutomovil{

    AutomovilDAO automovilDAO;
    VehiculoDTO vehiculoDTO;
    
    @Override
    public void registrarAutomovil(AutomovilDTO automovilDTO) {
        Automovil automovil = new Automovil("Nuevo", vehiculoDTO.getNumeroSerie(), vehiculoDTO.getMarca(), vehiculoDTO.getLinea(),
                vehiculoDTO.getModelo(), vehiculoDTO.getColor());
        automovilDAO.registrarAutomovil(automovil); 
    }
    
}
