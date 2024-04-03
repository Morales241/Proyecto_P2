/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;


import dto.PersonaDTO;
import dto.PlacasDTO;
import excepciones.ExcepcionAT;


/**
 *
 * @author crist
 */
public interface IRegistroPlacas {
    
    public String generarPlacas();
    
    public void registrarPlacas(PlacasDTO placasDTO, PersonaDTO personaDTO);
    
     public PersonaDTO buscarPersonaPorRFC(String RFC) throws ExcepcionAT;

}
