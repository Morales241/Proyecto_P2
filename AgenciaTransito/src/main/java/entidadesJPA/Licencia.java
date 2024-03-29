/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidadesJPA;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "licencias")
public class Licencia implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "fechaExpedicion", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar fechaExpedicion;
    
    @Column(name = "fechaVencimiento", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar fechaVencimiento;

    @Column(name = "tipo", nullable = false, length = 150)
    private String tipo;

    @Column(name = "vigencia", nullable = false)
    private vigencia Vigencia;

    @Column(name = "costo", nullable = false, length = 150)
    private Double costo;

    @ManyToOne
    @JoinColumn(name = "idPersona")
    private Persona persona;

    public Licencia(Calendar fechaExpedicion, Calendar fechaVencimiento, String tipo, String vig, Double costo) {
        this.fechaExpedicion = fechaExpedicion;
        this.fechaVencimiento = fechaVencimiento;
        this.tipo = tipo;
        this.Vigencia = vigencia.valueOf(vig);
        this.costo = costo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
    
    public Licencia() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Calendar fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public Calendar getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Calendar fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public vigencia getVigencia() {
        return Vigencia;
    }

    public void setVigencia(vigencia vigencia) {
        this.Vigencia = vigencia;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Licencia{" + "id=" + id + ", fechaExpedicion=" + fechaExpedicion.getTime() + ", fechaVencimiento=" + fechaVencimiento.getTime() + ", tipo=" + tipo + ", vigencia=" + Vigencia + ", costo=" + costo + '}';
    }

   
    
}
