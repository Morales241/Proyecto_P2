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
public class Automovil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "Nserie", nullable = false, length = 150)
    private String numeroSerie;
    
    @Column(name = "marca", nullable = false, length = 150)
    private String marca;
    
    @Column(name = "linea", nullable = false, length = 150)
    private String linea;
    
    @Column(name = "color", nullable = false, length = 150)
    private String color;
    
    @Column(name = "modelo", nullable = false)
    private int modelo;
    
    @Column(name = "precio", nullable = false)
    private double precio;

    @OneToMany(mappedBy = "automovil")
    private List<Placas> placas;

    public Automovil() {
    }

    public Automovil(String numeroSerie, String marca, String linea, String color, int modelo, double precio, List<Placas> placas) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.linea = linea;
        this.color = color;
        this.modelo = modelo;
        this.precio = precio;
        this.placas = placas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<Placas> getPlacas() {
        return placas;
    }

    public void setPlacas(List<Placas> placas) {
        this.placas = placas;
    }

    @Override
    public String toString() {
        return "Automovil{" + "id=" + id + ", numeroSerie=" + numeroSerie + ", marca=" + marca + ", linea=" + linea + ", color=" + color + ", modelo=" + modelo + ", precio=" + precio + ", placas=" + placas + '}';
    }
    
    
    
}
