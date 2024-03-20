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
      private int idLicencia;
    
    private Calendar fechaVencimiento;
    
    private Calendar fehcaExpedicion;
    
    private int vigencia;
    
    private double costo;
    
    private String tipo;

    public LicenciaDTO() {
    }

    public LicenciaDTO(int idLicencia, Calendar fechaVencimiento, Calendar fehcaExpedicion, int vigencia, double costo, String tipo) {
        this.idLicencia = idLicencia;
        this.fechaVencimiento = fechaVencimiento;
        this.fehcaExpedicion = fehcaExpedicion;
        this.vigencia = vigencia;
        this.costo = costo;
        this.tipo = tipo;
    }

    public LicenciaDTO(Calendar fechaVencimiento, Calendar fehcaExpedicion, int vigencia, double costo, String tipo) {
        this.fechaVencimiento = fechaVencimiento;
        this.fehcaExpedicion = fehcaExpedicion;
        this.vigencia = vigencia;
        this.costo = costo;
        this.tipo = tipo;
    }

    public int getIdLicencia() {
        return idLicencia;
    }

    public void setIdLicencia(int idLicencia) {
        this.idLicencia = idLicencia;
    }

    public Calendar getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Calendar fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Calendar getFehcaExpedicion() {
        return fehcaExpedicion;
    }

    public void setFehcaExpedicion(Calendar fehcaExpedicion) {
        this.fehcaExpedicion = fehcaExpedicion;
    }

    public int getVigencia() {
        return vigencia;
    }

    public void setVigencia(int vigencia) {
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

    @Override
    public String toString() {
        return "Licencia{" + "idLicencia=" + idLicencia + ", fechaVencimiento=" + fechaVencimiento + ", fehcaExpedicion=" + fehcaExpedicion + ", vigencia=" + vigencia + ", costo=" + costo + ", tipo=" + tipo + '}';
    }
}
