/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.List;

/**
 *
 * @author crist
 */
public class VehiculoDTO {
    
    private Long id;
    
    private String tipo;
    
    private String numeroSerie;
    
    private String marca;
    
    private String linea;
    
    private String modelo;
  
    private String color;
    
    private List<PlacasDTO> placas;
    
   private PersonaDTO persona;

    public VehiculoDTO() {
    }

    public VehiculoDTO(String tipo, String numeroSerie, String marca, String linea, String modelo, String color, List<PlacasDTO> placas, PersonaDTO persona) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.linea = linea;
        this.modelo = modelo;
        this.color = color;
        this.placas = placas;
        this.persona = persona;
    }

    public VehiculoDTO(String tipo, String numeroSerie, String marca, String linea, String modelo, String color) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.linea = linea;
        this.modelo = modelo;
        this.color = color;
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

    public List<PlacasDTO> getPlacas() {
        return placas;
    }

    public void setPlacas(List<PlacasDTO> placas) {
        this.placas = placas;
    }

    public PersonaDTO getPersona() {
        return persona;
    }

    public void setPersona(PersonaDTO persona) {
        this.persona = persona;
    }

    
}
