/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import entidadesJPA.Automovil;
import entidadesJPA.Persona;
import excepciones.ExcepcionAT;
import java.util.List;

/**
 * Interfaz de automoviles que define sus metodos abstractos
 * @author crist
 */
public interface IAutomovilDAO {

    /**
     * Metodo que registra un auto nuevo recibiendo un automovil y una persona
     * @param auto
     * @param persona
     * @return
     */
    public String registrarAutoNuevo(Automovil auto, Persona persona);
    
    /**
     * Metodo que regresa la lista de automoviles recibiendo una persona
     * @param persona
     * @return
     */
    public List<Automovil> consultarAutos(Persona persona);
    
    /**
     * Metodo que registra un auto usado recibiendo un automovil, una persona y las placas del auto anterior
     * @param auto
     * @param persona
     * @param placaAnterior
     * @return
     * @throws ExcepcionAT
     */
    public String registrarAutoUsado(Automovil auto, Persona persona, String placaAnterior) throws ExcepcionAT;
    
    /**
     * Metodo que regresa un auto recibiendo las placas
     * @param placa
     * @return
     */
    public Automovil consultarAutoPorPlaca(String placa);
}
