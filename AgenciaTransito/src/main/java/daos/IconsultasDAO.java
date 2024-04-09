/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import entidadesJPA.Placas;
import java.time.LocalDate;
import java.util.List;

/**
 * Interfaz de las consultas que define sus metodos abstractos
 * @author tacot
 */
public interface IConsultasDAO {

   
    /**
     * Metodo que regresa la lista de personas al realizar la consulta recibiendo la fecha de nacimiento
     * Al mismo tiempo inicializa la conexion a la base de datos
     * @param fechaNacimiento
     * @return
     */
    public List<Persona> consultarHistorialFechaN(LocalDate fechaNacimiento);
    
    
    /**
     * Metodo que regresa las placas de una persona recibiendo la persona
     * Al mismo tiempo inicializa la conexion a la base de datos
     * @param persona
     * @return
     */
    public List<Placas> obtenerPlacasDePersona(Persona persona);
    
    /**
     * Metodo que regresa las licencias de una persona recibiendo la persona
     * Al mismo tiempo inicializa la conexion a la base de datos
     * @param persona
     * @return
     */
    public List<Licencia> obtenerLicencias(Persona persona);
    
    /**
     * Metodo que regresa una lista de personas con el nombre similar al realizar la consulta recibiendo un nombre
     * Al mismo tiempo inicializa la conexion a la base de datos
     * @param Nombre
     * @return
     */
    public List<Persona> consultarPorNombre(String Nombre);
    
    /**
     * Metodo que regresa una lista de personas al realizar la consulta recibiendo su curp
     * Al mismo tiempo inicializa la conexion a la base de datos
     * @param curp
     * @return
     */
    public List<Persona> consultarPorCURP(String curp);
    
    /**
     * Metodo que regresa la persona obtenida recibiendo el RFC
     * Al mismo tiempo inicializa la conexion a la base de datos
     * @param rfc
     * @return
     */
    public Persona obtenerPersona(String rfc); 
}
