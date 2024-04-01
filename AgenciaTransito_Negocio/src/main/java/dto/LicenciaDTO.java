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
    
    private String vigencia;
    
    private double costo;
    
    private String estado;
    
    private String tipo;
    
    private PersonaDTO persona;

    public LicenciaDTO() {
    }

    

    public LicenciaDTO(Calendar fechaVencimiento, Calendar fechaExpedicion, String tipo, String vigencia, double costo, String estado) {
        this.fechaVencimiento = fechaVencimiento;
        this.fechaExpedicion = fechaExpedicion;
        this.vigencia = vigencia;
        this.costo = costo;
        this.tipo = tipo;
        this.estado= estado;
    }

    public LicenciaDTO(Calendar fechaVencimiento, Calendar fechaExpedicion, String vigencia, double costo, String tipo, PersonaDTO persona, String estado) {
        this.fechaVencimiento = fechaVencimiento;
        this.fechaExpedicion = fechaExpedicion;
        this.vigencia = vigencia;
        this.costo = costo;
        this.tipo = tipo;
        this.persona = persona;
        this.estado= estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
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
