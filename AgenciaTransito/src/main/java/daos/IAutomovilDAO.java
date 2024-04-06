/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import entidadesJPA.Automovil;
import entidadesJPA.Persona;
import entidadesJPA.Placas;
import entidadesJPA.Vehiculo;
import excepciones.ExcepcionAT;
import java.util.List;

/**
 *
 * @author crist
 */
public interface IAutomovilDAO {

    public String registrarAutoNuevo(Automovil auto, Persona persona);
    
    public List<Automovil> consultarAutos(Persona persona);
    
    public String registrarAutoUsado(Automovil auto, Persona persona, String placaAnterior) throws ExcepcionAT;
    
    public Automovil consultarAutoPorPlaca(String placa);
}
