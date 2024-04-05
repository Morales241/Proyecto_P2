/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidadesJPA;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author tacot
 */
@Entity
public class Automovil extends Vehiculo implements Serializable {

    @OneToMany(mappedBy = "automovil", cascade= {CascadeType.PERSIST,CascadeType.MERGE, CascadeType.REMOVE})
    private List<Placas> placas;
    
   @ManyToOne
   @JoinColumn(name = "idPersona")
   private Persona persona;
    
    public Automovil() {
    }

    public Automovil(String tipo, String numeroSerie, String marca, String linea, String modelo, String color) {
        super(tipo, numeroSerie, marca, linea, modelo, color);
    }

    public Automovil(List<Placas> placas, Persona persona) {
        this.placas = placas;
        this.persona = persona;
    }

    public Automovil(List<Placas> placas, Persona persona, String tipo, String numeroSerie, String marca, String linea, String modelo, String color) {
        super(tipo, numeroSerie, marca, linea, modelo, color);
        this.placas = placas;
        this.persona = persona;
    }

    public Automovil(List<Placas> placas, String tipo, String numeroSerie, String marca, String linea, String modelo, String color) {
        super(tipo, numeroSerie, marca, linea, modelo, color);
        this.placas = placas;
    }

    public List<Placas> getPlacas() {
        return placas;
    }

    public void setPlacas(List<Placas> placas) {
        this.placas = placas;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
    
}
