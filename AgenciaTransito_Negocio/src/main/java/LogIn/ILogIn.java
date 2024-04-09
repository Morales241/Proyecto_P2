/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package LogIn;

/**
 * Interfaz para iniciar sesion que define sus metodos abstractos
 * @author tacot
 */
public interface ILogIn {

    /**
     * Metodo que regresa verdadero o falso si se pudo iniciar sesion
     * @param usuario
     * @param contra
     * @return
     */
    public boolean IniciarSecion(String usuario, String contra);
}
