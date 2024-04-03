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

/**
 *
 * @author tacot
 */
@Entity
public class Placas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero", nullable = false)
    private String numero;
    
    @Column(name = "fechaExpedicion", nullable = false)
    private Calendar fechaExpedicion;
    
    @Column(name = "fechaRecepcion", nullable = false)
    private Calendar fechaRecepcion;
    
    @Column(name = "vigencia", nullable = false)
    private vigencia Vigencia;

    @ManyToOne
    @JoinColumn(name = "idAutomovil")
    private Automovil automovil;

    @ManyToOne
    private Persona persona;

    public Placas() {
    }

    public Placas(String numero, Calendar fechaExpedicion, Calendar fechaRecepcion, vigencia Vigencia, Automovil automovil, Persona persona) {
        this.numero = numero;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaRecepcion = fechaRecepcion;
        this.Vigencia = Vigencia;
        this.automovil = automovil;
        this.persona = persona;
    }

    public Placas(String numero, Calendar fechaExpedicion, Calendar fechaRecepcion, vigencia Vigencia, Persona persona) {
        this.numero = numero;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaRecepcion = fechaRecepcion;
        this.Vigencia = Vigencia;
        this.persona = persona;
    }
    
    

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Calendar getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Calendar fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public Calendar getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Calendar fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public vigencia getVigencia() {
        return Vigencia;
    }

    public void setVigencia(vigencia Vigencia) {
        this.Vigencia = Vigencia;
    }

    public Automovil getAutomovil() {
        return automovil;
    }

    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Placas{" + "id=" + id + ", numero=" + numero + ", fechaExpedicion=" + fechaExpedicion + ", fechaRecepcion=" + fechaRecepcion + ", Vigencia=" + Vigencia + ", automovil=" + automovil + ", persona=" + persona + '}';
    }
 
    
}
