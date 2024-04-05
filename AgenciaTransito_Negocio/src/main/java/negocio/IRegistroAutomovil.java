/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import dto.AutomovilDTO;
import dto.PersonaDTO;
import entidadesJPA.Automovil;
import excepciones.ExcepcionAT;


/**
 *
 * @author crist
 */
public interface IRegistroAutomovil {
    
    public String registrarAutomovil(AutomovilDTO automovilDTO, PersonaDTO persona);
    
    public void validarAuto(AutomovilDTO auto)throws ExcepcionAT;

}
