/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidadesJPA;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author tacot
 */
@Entity
public class Automovil extends Vehiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "automovil")
    private List<Placas> placas;


    public Automovil(Long id, List<Placas> placas, String tipo, String numeroSerie, String marca, String linea, String modelo, String color) {
        super(tipo, numeroSerie, marca, linea, modelo, color);
        this.id = id;
        this.placas = placas;
    }

    public Automovil(String tipo, String numeroSerie, String marca, String linea, String modelo, String color) {
        super(tipo, numeroSerie, marca, linea, modelo, color);
    }
    
    

    
    
    
}
