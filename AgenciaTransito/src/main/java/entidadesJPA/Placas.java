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
import javax.persistence.ManyToOne;

/**
 * Clase de la entidad Placas
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
    
    @Column(name = "fechaRecepcion", nullable = true)
    private Calendar fechaRecepcion;
    
    @Column(name = "vigencia", nullable = false)
    private vigencia Vigencia;

    @ManyToOne
    private Automovil automovil;

    /**
     * Constructor vacio
     */
    public Placas() {
    }

    /**
     * Constructor sin id
     * @param numero
     * @param fechaExpedicion
     * @param fechaRecepcion
     * @param Vigencia
     * @param automovil
     * @param persona
     */
    public Placas(String numero, Calendar fechaExpedicion, Calendar fechaRecepcion, vigencia Vigencia, Automovil automovil, Persona persona) {
        this.numero = numero;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaRecepcion = fechaRecepcion;
        this.Vigencia = Vigencia;
        this.automovil = automovil;
    }

    /**
     * Constructor que inicializa solamente el numero de placas, la fecha expedicion y la vigencia
     * @param numero
     * @param fechaExpedicion
     * @param Vigencia
     */
    public Placas(String numero, Calendar fechaExpedicion,  vigencia Vigencia) {
        this.numero = numero;
        this.fechaExpedicion = fechaExpedicion;
        this.Vigencia = Vigencia;
    }
    
    /**
     * Metodo que regresa el numero de placas
     * @return
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Metodo que establece el numereo de placas
     * @param numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
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
     * Metodo que regresa la fecha de recepcion
     * @return
     */
    public Calendar getFechaRecepcion() {
        return fechaRecepcion;
    }

    /**
     * Metodo que establece la fecha de recepcion
     * @param fechaRecepcion
     */
    public void setFechaRecepcion(Calendar fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    /**
     * Metodo que regresa la vigencia
     * @return
     */
    public vigencia getVigencia() {
        return Vigencia;
    }

    /**
     * Metodo que establece la vigencia
     * @param Vigencia
     */
    public void setVigencia(vigencia Vigencia) {
        this.Vigencia = Vigencia;
    }

    /**
     * Metodo que regresa el automovil
     * @return
     */
    public Automovil getAutomovil() {
        return automovil;
    }

    /**
     * Metodo que establece el automovil
     * @param automovil
     */
    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }

    /**
     * Metodo que regresa el id de la placa
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * Metodo que establece el id de la placa
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Metodo que imprime todos los atributos de la placa
     * @return
     */
    @Override
    public String toString() {
        return "Placas{" + "id=" + id + ", numero=" + numero + ", fechaExpedicion=" + fechaExpedicion + ", fechaRecepcion=" + fechaRecepcion + ", Vigencia=" + Vigencia + ", automovil=" + automovil  + '}';
    }
 
    
}
