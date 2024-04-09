/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que transfiere los datos del automovil que extiende de su clase padre VehiculoDTO
 * @author crist
 */
public class AutomovilDTO extends VehiculoDTO implements Serializable {

    private List<PlacasDTO> placas;

    private PersonaDTO persona;

    /**
     * Constructor que inicializa las placas
     */
    public AutomovilDTO() {
        placas = new ArrayList<>();
    }

    /**
     * Constructor que inicializa a los atributos de su clase padre
     * @param tipo
     * @param numeroSerie
     * @param marca
     * @param linea
     * @param modelo
     * @param color
     */
    public AutomovilDTO(String tipo, String numeroSerie, String marca, String linea, String modelo, String color) {
        super(tipo, numeroSerie, marca, linea, modelo, color);
        placas = new ArrayList<>();
    }

    /**
     * Constructor con placas y persona
     * @param placas
     * @param persona
     */
    public AutomovilDTO(List<PlacasDTO> placas, PersonaDTO persona) {
        this.placas = placas;
        this.persona = persona;
    }

    /**
     * Constructor sin id
     * @param placas
     * @param persona
     * @param tipo
     * @param numeroSerie
     * @param marca
     * @param linea
     * @param modelo
     * @param color
     */
    public AutomovilDTO(List<PlacasDTO> placas, PersonaDTO persona, String tipo, String numeroSerie, String marca, String linea, String modelo, String color) {
        super(tipo, numeroSerie, marca, linea, modelo, color);
        this.placas = placas;
        this.persona = persona;
    }

    /**
     * Metodo que regresa una lista de placas
     * @return
     */
    public List<PlacasDTO> getPlacas() {
        return placas;
    }

    /**
     * Metodo que establece las placas
     * @param placas
     */
    public void setPlacas(List<PlacasDTO> placas) {
        this.placas = placas;
    }

    /**
     * Metodo que regresa la persona
     * @return
     */
    public PersonaDTO getPersona() {
        return persona;
    }

    /**
     * Metodo que establece la persona
     * @param persona
     */
    public void setPersona(PersonaDTO persona) {
        this.persona = persona;
    }


}
