/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.List;

/**
 * Clase que tranfiere los datos del vehiculo
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
    
    /**
     * Constructor vacio
     */
    public VehiculoDTO() {
    }

    /**
     * Constructor sin ID
     * @param tipo
     * @param numeroSerie
     * @param marca
     * @param linea
     * @param modelo
     * @param color
     */
    public VehiculoDTO(String tipo, String numeroSerie, String marca, String linea, String modelo, String color) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.linea = linea;
        this.modelo = modelo;
        this.color = color;
    }

    /**
     * Metodo que regresa el id
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * Metodo que establece el id
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Metodo que regresa el tipo
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Metodo que estbalece el tipo
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Metodo que regresa el numero de serie
     * @return
     */
    public String getNumeroSerie() {
        return numeroSerie;
    }

    /**
     * Metodo que establece el numero de serie
     * @param numeroSerie
     */
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    /**
     * Metodo que regresa la a,arca
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Metodo que establece la marca
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *Metodo que regresa la linea
     * @return
     */
    public String getLinea() {
        return linea;
    }

    /**
     *Metodo que establece la linea
     * @param linea
     */
    public void setLinea(String linea) {
        this.linea = linea;
    }

    /**
     * Metodo que regresa el modelo
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Metodo que establece el modelo
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Metodo que regresa el color
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * Metodo que establece el color
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

}
