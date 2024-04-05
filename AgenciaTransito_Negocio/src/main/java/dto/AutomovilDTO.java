/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author crist
 */
public class AutomovilDTO extends VehiculoDTO implements Serializable {

    private List<PlacasDTO> placas;

    private PersonaDTO persona;

    public AutomovilDTO() {
    }

    public AutomovilDTO(String tipo, String numeroSerie, String marca, String linea, String modelo, String color) {
        super(tipo, numeroSerie, marca, linea, modelo, color);
    }

    public AutomovilDTO(List<PlacasDTO> placas, PersonaDTO persona) {
        this.placas = placas;
        this.persona = persona;
    }

    public AutomovilDTO(List<PlacasDTO> placas, PersonaDTO persona, String tipo, String numeroSerie, String marca, String linea, String modelo, String color) {
        super(tipo, numeroSerie, marca, linea, modelo, color);
        this.placas = placas;
        this.persona = persona;
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
