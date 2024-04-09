/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

/**
 * Clase que implementa la interfaz de ILogInDao y contiene el codigo de sus metodos
 * @author tacot
 */
public class LogInDAO implements ILogInDAO{

    @Override
    public boolean IniciarSecion(String usuario, String contra) {
        return usuario.equalsIgnoreCase("root") && contra.equalsIgnoreCase("admin");
    }
    
}
