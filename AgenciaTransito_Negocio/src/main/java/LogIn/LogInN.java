/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogIn;

import daos.ILogInDAO;
import daos.LogInDAO;

/**
 * Clase que implementa la interfaz de ILogIn y contiene el codigo de todos sus metodos
 * @author tacot
 */
public class LogInN implements ILogIn {

    ILogInDAO login = new LogInDAO();
    
    @Override
    public boolean IniciarSecion(String usuario, String contra) {
        return login.IniciarSecion(usuario, contra);
    }
}
