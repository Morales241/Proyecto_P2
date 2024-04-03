/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import daos.PlacasDAO;
import dto.AutomovilDTO;
import dto.PlacasDTO;
import entidadesJPA.Automovil;
import entidadesJPA.Placas;
import excepciones.ExcepcionAT;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class RegistroPlacasBO implements IRegistroPlacas{
    
    PlacasDAO placasDAO;
    

    @Override
    public String generarPlacas() {
       Random random = new Random();
        StringBuilder placas = new StringBuilder();

        // Generar 3 letras aleatorias
        for (int i = 0; i < 3; i++) {
            char letter = (char) (random.nextInt(26) + 'A');
            placas.append(letter);
        }

        // Añadir un guión
        placas.append("-");

        for (int i = 0; i < 3; i++) {
            int digit = random.nextInt(10);
            placas.append(digit);
        }

        return placas.toString();
    }
/*
    @Override
    public void registrarPlacas(PlacasDTO placasDTO, AutomovilDTO automovilDTO) {
        Placas placas= new Placas(generarPlacas(), placasDTO.getFechaExpedicion(), placasDTO.getFechaRecepcion(),
                placasDTO.getVigencia());
        placasDAO.registrarPlaca(placas);
    }
    */
}
