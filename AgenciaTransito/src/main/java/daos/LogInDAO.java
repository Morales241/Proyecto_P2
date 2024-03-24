/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

/**
 *
 * @author tacot
 */
public class LogInDAO implements ILogInDAO{

    @Override
    public boolean IniciarSecion(String usuario, String contra) {
        return usuario.equalsIgnoreCase("root") && contra.equalsIgnoreCase("admin");
    }
    
}
