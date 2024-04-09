/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import excepciones.ExcepcionAT;
import java.util.Calendar;
import java.util.List;

/**
 * Interfaz de personas que define los metodos abstractos
 * @author crist
 */
public interface IPersonaDAO {
    
    /**
     * Metodo que registra a la persona recibiendo una persona y arroja una excepcion
     * @param persona
     * @throws ExcepcionAT
     */
    public void registrarPersona(Persona persona) throws ExcepcionAT;
    
    /**
     * Metodo que actualiza a la persona recibiendo una persona y arroja una excepcion
     * @param persona
     * @throws ExcepcionAT
     */
    public void actualizarPersona (Persona persona) throws ExcepcionAT;
    
    /**
     * Metodo que regresa la lista de personas buscadas por el RFC recibido
     * @param RFC
     * @return
     */
    public List<Persona> buscarPersonaPorRFC(String RFC);
    
    /**
     * Metodo que regresa verdadero o falso al validar la existencia de la persona recibiendo una persona
     * @param persona
     * @return
     */
    public boolean validarPersona(Persona persona);
    
    /**
     * Metodo que registra muchas personas y arroja una excepcion
     * @param personas
     * @throws ExcepcionAT
     */
    public void registrarListaPersonas(List<Persona> personas) throws ExcepcionAT;
    
    /**
     * Metodo que regresa una persona recibiendo un RFC
     * @param RFC
     * @return
     */
    public Persona buscarPersona(String RFC);
}
