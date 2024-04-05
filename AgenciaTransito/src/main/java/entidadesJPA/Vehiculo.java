/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidadesJPA;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.*;

/**
 *
 * @author galan
 */
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) 
public class Vehiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "tipo", nullable = false, length = 150)
    private String tipo;
    
    @Column(name = "numeroSerie", nullable = false, length = 150)
    private String numeroSerie;
    
    @Column(name = "marca", nullable = false, length = 150)
    private String marca;
    
    @Column(name = "linea", nullable = false, length = 150)
    private String linea;
    
    @Column(name = "modelo", nullable = false, length = 150)
    private String modelo;
    
    @Column(name = "color", nullable = false, length = 150)
    private String color;

    @OneToMany(mappedBy = "vehiculo", cascade= {CascadeType.PERSIST,CascadeType.MERGE, CascadeType.REMOVE})
    private List<Placas> placas;
    
   @ManyToOne
   @JoinColumn(name = "idPersona")
   private Persona persona;
    
    public Vehiculo() {
    }

    public Vehiculo(String tipo, String numeroSerie, String marca, String linea, String modelo, String color, List<Placas> placas, Persona persona) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.linea = linea;
        this.modelo = modelo;
        this.color = color;
        this.placas = placas;
        this.persona = persona;
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
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "id=" + id + ", tipo=" + tipo + ", numeroSerie=" + numeroSerie + ", marca=" + marca + ", linea=" + linea + ", modelo=" + modelo + ", color=" + color + '}';
    }
    
    

    
}
