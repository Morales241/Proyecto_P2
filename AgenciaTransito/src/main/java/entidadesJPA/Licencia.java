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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 * Clase de la entidad Licencias
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

    @Column(name = "vigencia", nullable = false, length = 150)
    private String Vigencia;

    @Column(name = "costo", nullable = false, length = 150)
    private Double costo;
    
    @Column(name = "estado", nullable = false, length = 150)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "idPersona")
    private Persona persona;

    /**
     * Constructor vacio
     */
    public Licencia() {
    }

    /**
     * Constructor sin id
     * @param fechaExpedicion
     * @param fechaVencimiento
     * @param tipo
     * @param Vigencia
     * @param costo
     * @param estado
     * @param persona
     */
    public Licencia(Calendar fechaExpedicion, Calendar fechaVencimiento, String tipo, String Vigencia, Double costo, String estado, Persona persona) {
        this.fechaExpedicion = fechaExpedicion;
        this.fechaVencimiento = fechaVencimiento;
        this.tipo = tipo;
        this.Vigencia = Vigencia;
        this.costo = costo;
        this.estado = estado;
        this.persona = persona;
    }

    /**
     * Constructor con todos los atributos
     * @param id
     * @param fechaExpedicion
     * @param fechaVencimiento
     * @param tipo
     * @param Vigencia
     * @param costo
     * @param estado
     * @param persona
     */
    public Licencia(Long id, Calendar fechaExpedicion, Calendar fechaVencimiento, String tipo, String Vigencia, Double costo, String estado, Persona persona) {
        this.id = id;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaVencimiento = fechaVencimiento;
        this.tipo = tipo;
        this.Vigencia = Vigencia;
        this.costo = costo;
        this.estado = estado;
        this.persona = persona;
    }

    /**
     * Metodo que regresa el id de la licenia
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * Metodo que establece el id de la licencia
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
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
     * Metodo que regresa la fecha de vencimiento
     * @return
     */
    public Calendar getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Metodo que establece la fecha de vencimiento
     * @param fechaVencimiento
     */
    public void setFechaVencimiento(Calendar fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
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
     * Metodo que regresa la vigencia
     * @return
     */
    public String getVigencia() {
        return Vigencia;
    }

    /**
     * Metodo que establece la vigencia
     * @param Vigencia
     */
    public void setVigencia(String Vigencia) {
        this.Vigencia = Vigencia;
    }

    /**
     * Metodo que regresa el costo
     * @return
     */
    public Double getCosto() {
        return costo;
    }

    /**
     * Metodo que establece el costo
     * @param costo
     */
    public void setCosto(Double costo) {
        this.costo = costo;
    }

    /**
     * Mestodo que regresa el estado
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
     * Metodo que regresa la persona
     * @return
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * Metodo que establece la persona
     * @param persona
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
    
    

    
   
    
}
