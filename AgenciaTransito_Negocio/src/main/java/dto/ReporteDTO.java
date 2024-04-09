/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import entidadesJPA.Reporte;
import java.util.Calendar;

/**
 * Clase que transfiere los datos del reporte
 * @author galan
 */
public class ReporteDTO {
    private String nombrePersona, RFC, tipoTramite;
    private Calendar fechaExpedicion;
    private double costo;

    /**
     * Constructor vacio
     */
    public ReporteDTO() {
    }
    
    /**
     * Constructor sin id
     * @param nombrePersona
     * @param RFC
     * @param tipoTramite
     * @param fechaExpedicion
     * @param costo
     */
    public ReporteDTO(String nombrePersona, String RFC, String tipoTramite, Calendar fechaExpedicion, double costo) {
        this.nombrePersona = nombrePersona;
        this.RFC = RFC;
        this.tipoTramite = tipoTramite;
        this.fechaExpedicion = fechaExpedicion;
        this.costo = costo;
    }
    
    /**
     * Metodo que regresa el nombre de la persona
     * @return
     */
    public String getNombrePersona() {
        return nombrePersona;
    }

    /**
     * Metodo que establece le nombre de la persona
     * @param nombrePersona
     */
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    /**
     * Metodo que regresa el rfc
     * @return
     */
    public String getRFC() {
        return RFC;
    }

    /**
     * Metodo que establece el rfc
     * @param RFC
     */
    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    /**
     * Metodo que regresa el tipo de tramite
     * @return
     */
    public String getTipoTramite() {
        return tipoTramite;
    }

    /**
     * Metodo que establece el tipo de tramite
     * @param tipoTramite
     */
    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    /**
     * Metodo que regresa la fecha de expedicion
     * @return
     */
    public Calendar getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Metodo que establoece la fecha de expedicion
     * @param fechaExpedicion
     */
    public void setFechaExpedicion(Calendar fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
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
    
    
}
