/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import entidadesJPA.vigencia;
import java.util.Calendar;

/**
 *
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Calendar getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Calendar fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public Calendar getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Calendar fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public vigencia getVigencia() {
        return Vigencia;
    }

    public void setVigencia(vigencia Vigencia) {
        this.Vigencia = Vigencia;
    }

    public AutomovilDTO getAutomovil() {
        return automovil;
    }

    public void setAutomovil(AutomovilDTO automovil) {
        this.automovil = automovil;
    }

    public PersonaDTO getPersona() {
        return persona;
    }

    public void setPersona(PersonaDTO persona) {
        this.persona = persona;
    }

    public PlacasDTO(Long id, String numero, Calendar fechaExpedicion, Calendar fechaRecepcion, vigencia Vigencia, AutomovilDTO automovil, PersonaDTO persona) {
        this.id = id;
        this.numero = numero;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaRecepcion = fechaRecepcion;
        this.Vigencia = Vigencia;
        this.automovil = automovil;
        this.persona = persona;
    }

    public PlacasDTO(String numero, Calendar fechaExpedicion, Calendar fechaRecepcion, vigencia Vigencia, AutomovilDTO automovil, PersonaDTO persona) {
        this.numero = numero;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaRecepcion = fechaRecepcion;
        this.Vigencia = Vigencia;
        this.automovil = automovil;
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "PlacasDTO{" + "id=" + id + ", numero=" + numero + ", fechaExpedicion=" + fechaExpedicion + ", fechaRecepcion=" + fechaRecepcion + ", Vigencia=" + Vigencia + ", persona=" + persona + '}';
    }
    
    
}
