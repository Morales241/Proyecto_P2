/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidadesJPA;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author galan
 */
@Entity
public class Reporte implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombrePersona", nullable = false, length = 150)
    private String nombrePersona;
    
    @Column(name = "RFC", nullable = false, length = 150)
    private String RFC;
    
    @Column(name = "tipoTramite", nullable = false, length = 150)
    private String tipoTramite;
    
    @Column(name = "costo", nullable = false, length = 150)
    private double costo;
    
    @Column(name = "fechaExpedicion", nullable = false)
    private Calendar fechaExpedicion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Reporte() {
    }

    public Reporte(String nombrePersona, String RFC, String tipoTramite, double costo, Calendar fechaExpedicion) {
        this.nombrePersona = nombrePersona;
        this.RFC = RFC;
        this.tipoTramite = tipoTramite;
        this.costo = costo;
        this.fechaExpedicion = fechaExpedicion;
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

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Calendar getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Calendar fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    @Override
    public String toString() {
        return "Reporte{" + "id=" + id + ", nombrePersona=" + nombrePersona + ", RFC=" + RFC + ", tipoTramite=" + tipoTramite + ", costo=" + costo + ", fechaExpedicion=" + fechaExpedicion + '}';
    }
    
    

    
}
