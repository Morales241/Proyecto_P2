/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import java.util.List;

/**
 *
 * @author tacot
 */
public interface IconsultasDAO {
    public List<Object> consultarHistorialNombre(String Nombre, String aP, String aM);
    
    public List<Object> consultarHistorialFechaN(String Nombre, String aP, String aM);
    
    public List<Object> consultarHistorialCURP(String curp);
}
