/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import entidadesJPA.vigencia;
import java.util.Calendar;

/**
 * Clase que transfiere los datos de las placas
 * @author crist
 */
public class PlacasDTO {
  
    private Long id;

    private String numero;
    
    private Calendar fechaExpedicion;
   
    private Calendar fechaRecepcion;
    
    private vigencia Vigencia;

    private AutomovilDTO automovil;

    private PersonaDTO persona;

    /**
     * Metodo que regresa el id 
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * Metodo que establece el id
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Metodo que regresa el numero de placas
     * @return
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Metodo que establece el numero de placas
     * @param numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Metodo que regresa la fecha de expedicion
     * @return
     */
    public Calendar getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Metodo que establece la fecha expedicion
     * @param fechaExpedicion
     */
    public void setFechaExpedicion(Calendar fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    /**
     * Metodo que regresa la fecha de recepcion
     * 
     * @return
     */
    public Calendar getFechaRecepcion() {
        return fechaRecepcion;
    }

    /**
     * Metodo que establece la fecha recepcion
     * @param fechaRecepcion
     */
    public void setFechaRecepcion(Calendar fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    /**
     * Metodo que regresa la vigencia
     * @return
     */
    public vigencia getVigencia() {
        return Vigencia;
    }

    /**
     * Metodo que establece la vigencia
     * @param Vigencia
     */
    public void setVigencia(vigencia Vigencia) {
        this.Vigencia = Vigencia;
    }

    /**
     * Metodo que regresa el automovilDTO
     * @return
     */
    public AutomovilDTO getAutomovil() {
        return automovil;
    }

    /**
     * Metodo que establece el automovilDTO
     * @param automovil
     */
    public void setAutomovil(AutomovilDTO automovil) {
        this.automovil = automovil;
    }

    /**
     * Metodo que regresa la personaDTO
     * @return
     */
    public PersonaDTO getPersona() {
        return persona;
    }

    /**
     * Metodo que establece la personaDTO
     * @param persona
     */
    public void setPersona(PersonaDTO persona) {
        this.persona = persona;
    }

    /**
     * Constructor vacio
     */
    public PlacasDTO() {
    }

    /**
     * Constructor sin id
     * @param numero
     * @param fechaExpedicion
     * @param fechaRecepcion
     * @param Vigencia
     * @param automovil
     * @param persona
     */
    public PlacasDTO(String numero, Calendar fechaExpedicion, Calendar fechaRecepcion, vigencia Vigencia, AutomovilDTO automovil, PersonaDTO persona) {
        this.numero = numero;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaRecepcion = fechaRecepcion;
        this.Vigencia = Vigencia;
        this.automovil = automovil;
        this.persona = persona;
    }

    /**
     * Constructor sin automovil ni persona
     * @param numero
     * @param fechaExpedicion
     * @param fechaRecepcion
     * @param Vigencia
     */
    public PlacasDTO(String numero, Calendar fechaExpedicion, Calendar fechaRecepcion, vigencia Vigencia) {
        this.numero = numero;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaRecepcion = fechaRecepcion;
        this.Vigencia = Vigencia;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "PlacasDTO{" + "id=" + id + ", numero=" + numero + ", fechaExpedicion=" + fechaExpedicion + ", fechaRecepcion=" + fechaRecepcion + ", Vigencia=" + Vigencia + ", persona=" + persona + '}';
    }
    
    
}
