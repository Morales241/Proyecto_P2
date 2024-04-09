/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;


import dto.PersonaDTO;
import dto.PlacasDTO;
import excepciones.ExcepcionAT;


/**
 * Interfaz del caso de uso para el registro de placas que define sus metodos abstractos
 * @author crist
 */
public interface IRegistroPlacas {
    
    /**
     * Metodo que genera las placas aleatoriamente
     * @return
     */
    public String generarPlacas();
    
    /**
     * Metodo que registra una placa recibiendo  placasDTO y personaDTO
     * @param placasDTO
     * @param personaDTO
     */
    public void registrarPlacas(PlacasDTO placasDTO, PersonaDTO personaDTO);
    
    /**
     * Metodo que busca una persona mediante su rfc
     * @param RFC
     * @return
     * @throws ExcepcionAT
     */
    public PersonaDTO buscarPersonaPorRFC(String RFC) throws ExcepcionAT;

}
