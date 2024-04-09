/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import entidadesJPA.Reporte;
import java.util.Calendar;

/**
 *
 * @author galan
 */
public class ReporteDTO {
    private String nombrePersona, RFC, tipoTramite;
    private Calendar fechaExpedicion;
    private double costo;

    public ReporteDTO() {
    }
    
    public ReporteDTO(String nombrePersona, String RFC, String tipoTramite, Calendar fechaExpedicion, double costo) {
        this.nombrePersona = nombrePersona;
        this.RFC = RFC;
        this.tipoTramite = tipoTramite;
        this.fechaExpedicion = fechaExpedicion;
        this.costo = costo;
    }
    

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    public Calendar getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Calendar fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    
}
