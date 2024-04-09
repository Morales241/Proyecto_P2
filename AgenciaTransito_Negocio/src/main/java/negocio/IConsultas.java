/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;


import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import entidadesJPA.Placas;
import excepciones.ExcepcionAT;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;
import javax.swing.JTable;

/**
 * Interfaz del caso de uso de las consultas que define todos sus metodos abstractos
 * @author tacot
 */
public interface IConsultas {

    /**
     * Metodo que regresa la lista de licencias al realizar la consulta recibiendo un ID
     * @param ID
     * @return
     */
    public List<Licencia> cunsltarLicencias(Long ID);
    
    /**
     * Metodo que regresa la lista de placas al realizar la consulta recibiendo una persona
     * @param persona
     * @return
     * @throws ExcepcionAT
     */
    public List<Placas> obtenerPlacasDePersona(Persona persona)throws ExcepcionAT ;
    
    /**
     * Metodo que regresa la lista de licencias al realizar la consulta recibiendo una persona
     * @param persona
     * @return
     * @throws ExcepcionAT
     */
    public List<Licencia> obtenerLicencias(Persona persona)throws ExcepcionAT;
    
    /**
     * Metodo que regresa la lista de personas al realizar la consulta recibiendo un nombre
     * @param Nombre
     * @return
     * @throws ExcepcionAT
     */
    public List<Persona> consultarPorNombre(String Nombre)throws ExcepcionAT ;
    
    /**
     * Metodo que regresa la lista de licencias al realizar la consulta recibiendo una fecha
     * @param fechaNacimiento
     * @return
     * @throws ExcepcionAT
     */
    public List<Persona> consultarHistorialFechaN(LocalDate fechaNacimiento) throws ExcepcionAT;
    
    /**
     * Metodo que regresa la lista de licencias al realizar la consulta recibiendo una curp
     * @param curp
     * @return
     * @throws ExcepcionAT
     */
    public List<Persona> consultarPorCURP(String curp)throws ExcepcionAT;
    
    /**
     * Metodo que regresa la persona al realizar la consulta recibiendo una curp
     * @param rfc
     * @return
     * @throws ExcepcionAT
     */
    public Persona obtenerPersona(String rfc) throws ExcepcionAT;
     
    /**
     * Metodo que actualiza la tabla con la lista de personas
     * @param personas
     * @param JTable1
     */
    public void cargarDatosTabla(List<Persona> personas, JTable JTable1);
    
    /**
     * Metodo que actualiza la tabla con la lista de licencias
     * @param licencias
     * @param JTable1
     */
    public void cargarDatosTablaLicencias(List<Licencia> licencias, JTable JTable1);
}
