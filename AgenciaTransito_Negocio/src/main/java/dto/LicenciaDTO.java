/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.Calendar;

/**
 *
 * @author crist
 */
public class LicenciaDTO {
    
    private Calendar fechaVencimiento;
    
    private Calendar fechaExpedicion;
    
    private vigenciaDTO vigencia;
    
    private double costo;
    
    private String tipo;
    
    private PersonaDTO persona;

    public LicenciaDTO() {
    }

    

    public LicenciaDTO(Calendar fechaVencimiento, Calendar fechaExpedicion, String tipo, vigenciaDTO vigencia, double costo) {
        this.fechaVencimiento = fechaVencimiento;
        this.fechaExpedicion = fechaExpedicion;
        this.vigencia = vigencia;
        this.costo = costo;
        this.tipo = tipo;
    }


    public Calendar getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Calendar fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Calendar getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Calendar fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public vigenciaDTO getVigencia() {
        return vigencia;
    }

    public void setVigencia(vigenciaDTO vigencia) {
        this.vigencia = vigencia;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public PersonaDTO getPersona() {
        return persona;
    }

    public void setPersona(PersonaDTO persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Licencia{ fechaVencimiento=" + fechaVencimiento + ", fechaExpedicion=" + fechaExpedicion + ", vigencia=" + vigencia + ", costo=" + costo + ", tipo=" + tipo + '}';
    }
}
