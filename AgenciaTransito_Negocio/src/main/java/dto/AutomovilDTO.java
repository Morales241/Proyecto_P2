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
public class AutomovilDTO extends VehiculoDTO implements Serializable{

    public AutomovilDTO() {
    }

    public AutomovilDTO(Long id, String tipo, String numeroSerie, String marca, String linea, String modelo, String color, List<PlacasDTO> placas, PersonaDTO persona) {
        super(id, tipo, numeroSerie, marca, linea, modelo, color, placas, persona);
    }
    
    
}
