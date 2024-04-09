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

/**
 * Clase entidad de reportes
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

    /**
     * Metodo que regresa el id del reporte
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * Metodo que establece el id del reporte
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Constructor vacio
     */
    public Reporte() {
    }

    /**
     * Constructor sin id
     * @param nombrePersona
     * @param RFC
     * @param tipoTramite
     * @param costo
     * @param fechaExpedicion
     */
    public Reporte(String nombrePersona, String RFC, String tipoTramite, double costo, Calendar fechaExpedicion) {
        this.nombrePersona = nombrePersona;
        this.RFC = RFC;
        this.tipoTramite = tipoTramite;
        this.costo = costo;
        this.fechaExpedicion = fechaExpedicion;
    }

    /**
     * Metodo que regresa el nombre de la persona
     * @return
     */
    public String getNombrePersona() {
        return nombrePersona;
    }

    /**
     * Metodo que establece el nombre de la persona
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
     * Metodo que imprime los atributos de reportes
     * @return
     */
    @Override
    public String toString() {
        return "Reporte{" + "id=" + id + ", nombrePersona=" + nombrePersona + ", RFC=" + RFC + ", tipoTramite=" + tipoTramite + ", costo=" + costo + ", fechaExpedicion=" + fechaExpedicion + '}';
    }
    
    

    
}
