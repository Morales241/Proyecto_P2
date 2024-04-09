/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.Calendar;

/**
 * Clase que transfiere los datos de la licencia
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

    /**
     * Constructor vacio
     */
    public LicenciaDTO() {
    }

    /**
     * Constructor sin id
     * @param fechaVencimiento
     * @param fechaExpedicion
     * @param tipo
     * @param vigencia
     * @param costo
     * @param estado
     */
    public LicenciaDTO(Calendar fechaVencimiento, Calendar fechaExpedicion, String tipo, String vigencia, double costo, String estado) {
        this.fechaVencimiento = fechaVencimiento;
        this.fechaExpedicion = fechaExpedicion;
        this.vigencia = vigencia;
        this.costo = costo;
        this.tipo = tipo;
        this.estado= estado;
    }

    /**
     * Constructor con id
     * @param fechaVencimiento
     * @param fechaExpedicion
     * @param vigencia
     * @param costo
     * @param tipo
     * @param persona
     * @param estado
     */
    public LicenciaDTO(Calendar fechaVencimiento, Calendar fechaExpedicion, String vigencia, double costo, String tipo, PersonaDTO persona, String estado) {
        this.fechaVencimiento = fechaVencimiento;
        this.fechaExpedicion = fechaExpedicion;
        this.vigencia = vigencia;
        this.costo = costo;
        this.tipo = tipo;
        this.persona = persona;
        this.estado= estado;
    }

    /**
     * Metodo que regresa el estado
     * @return
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Metodo que establece el estado
     * @param estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    /**
     * Metodo que regresa la fecha de nacimiento
     * @return
     */
    public Calendar getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Metodo que establece la fecha de nacimiento
     * @param fechaVencimiento
     */
    public void setFechaVencimiento(Calendar fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    /**
     * Metodo que regresa la fecha de expedicion
     * @return
     */
    public Calendar getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Metodo que establece la fecha de expedicion
     * @param fechaExpedicion
     */
    public void setFechaExpedicion(Calendar fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    /**
     * Metodo que regresa la vigencia
     * @return
     */
    public String getVigencia() {
        return vigencia;
    }

    /**
     * Metodo que establece la vigencia
     * @param vigencia
     */
    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    /**
     * Metodo que regresa el costo
     * @return
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Metodo que establece el costo
     * @param costo
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    /**
     * Metodo que regresa el tipo
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Metodo que establece el tipo
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Metodo que regresa la persona
     * @return
     */
    public PersonaDTO getPersona() {
        return persona;
    }

    /**
     * Metodo que establece la persona
     * @param persona
     */
    public void setPersona(PersonaDTO persona) {
        this.persona = persona;
    }

    /**
     * Metodo que imprime todos los atributos
     * @return
     */
    @Override
    public String toString() {
        return "Licencia{ fechaVencimiento=" + fechaVencimiento + ", fechaExpedicion=" + fechaExpedicion + ", vigencia=" + vigencia + ", costo=" + costo + ", tipo=" + tipo + '}';
    }
}
