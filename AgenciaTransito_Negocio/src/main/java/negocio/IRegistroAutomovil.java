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
 * Interfaz de el caso de uso de automoviles que definen todos sus metod abstractos
 * @author crist
 */
public interface IRegistroAutomovil {
    
    /**
     * Metodo que registra un automovil recibiendo una automovilDTO y una personaDTO
     * @param automovilDTO
     * @param persona
     * @return
     */
    public String registrarAutomovil(AutomovilDTO automovilDTO, PersonaDTO persona);
    
    /**
     * Metodo que valida un auto recibiendo un automovilDTO
     * @param auto
     * @throws ExcepcionAT
     */
    public void validarAuto(AutomovilDTO auto)throws ExcepcionAT;

    /**
     * Metodo que busca un auto mediante su placa
     * @param placa
     * @return
     * @throws ExcepcionAT
     */
    public AutomovilDTO buscarAuto(String placa)throws ExcepcionAT;
    
    /**
     * Metodo que registra un automovil usado recibiendo un automovilDTO y una personaDTO
     * @param automovilDTO
     * @param dueñoN
     * @return
     * @throws ExcepcionAT
     */
    public String registrarAutomovilUsado(AutomovilDTO automovilDTO, PersonaDTO dueñoN)throws ExcepcionAT;
    
}
