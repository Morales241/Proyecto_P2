/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidadesJPA;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Clase de la entidad Automoviles
 * @author tacot
 */
@Entity
@Table(name = "automoviles")
public class Automovil extends Vehiculo implements Serializable {

    @OneToMany(mappedBy = "automovil", cascade= {CascadeType.PERSIST,CascadeType.MERGE, CascadeType.REMOVE})
    private List<Placas> placas;
    
   @ManyToOne
   @JoinColumn(name = "idPersona")
   private Persona persona;
    
    /**
     * Constructor que inicializa la lista de placas
     */
    public Automovil() {
        placas = new ArrayList<>();
    }

    /**
     * Constructor sin id
     * @param tipo
     * @param numeroSerie
     * @param marca
     * @param linea
     * @param modelo
     * @param color
     */
    public Automovil(String tipo, String numeroSerie, String marca, String linea, String modelo, String color) {
        super(tipo, numeroSerie, marca, linea, modelo, color);
        placas = new ArrayList<>();
    }
    
    /**
     * Constructor que inicializa la lista de placas y la persona
     * @param placas
     * @param persona
     */
    public Automovil(List<Placas> placas, Persona persona) {
        this.placas = placas;
        this.persona = persona;
    }

    /**
     * Constructor que inicializa los atributos de la clase padre, las plaxas y la persona
     * @param placas
     * @param persona
     * @param tipo
     * @param numeroSerie
     * @param marca
     * @param linea
     * @param modelo
     * @param color
     */
    public Automovil(List<Placas> placas, Persona persona, String tipo, String numeroSerie, String marca, String linea, String modelo, String color) {
        super(tipo, numeroSerie, marca, linea, modelo, color);
        this.placas = placas;
        this.persona = persona;
    }

    /**
     * Constructor que inicializa los atributos de la clase padre y las placas
     * @param placas
     * @param tipo
     * @param numeroSerie
     * @param marca
     * @param linea
     * @param modelo
     * @param color
     */
    public Automovil(List<Placas> placas, String tipo, String numeroSerie, String marca, String linea, String modelo, String color) {
        super(tipo, numeroSerie, marca, linea, modelo, color);
        this.placas = placas;
    }

    /**
     * Metodo que regresa la lista de placas
     * @return
     */
    public List<Placas> getPlacas() {
        return placas;
    }

    /**
     * Metodo que establece la lista de placas
     * @param placas
     */
    public void setPlacas(List<Placas> placas) {
        this.placas = placas;
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
