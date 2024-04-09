/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

/**
 * Interfaz del login que define los metodos abstractos
 * @author tacot
 */
public interface ILogInDAO {
    
    /**
     * Metodo que regresa verdadero o falso al intentar iniciar la sesion recibiendo el usuario y la contraseña
     * @param usuario
     * @param contra
     * @return
     */
    public boolean IniciarSecion(String usuario, String contra);
}
