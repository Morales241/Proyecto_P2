/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daos;

/**
 *
 * @author tacot
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConsultasDAO c = new ConsultasDAO();
        
        
        for (Object o: c.consultarHistorialNombre("Jesus", "Morales", "Rojas")){
            System.out.println(o.toString());
        }
    
        
    }
    
}
