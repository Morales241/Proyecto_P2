/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import entidadesJPA.Automovil;
import entidadesJPA.Placas;
import excepciones.ExcepcionAT;
import java.util.List;

/**
 * Interfaz de placas que define los metodos abstractos
 * @author tacot
 */
public interface IPlacasDAO {

    /**
     * Metodo que regresa la lista de placas recibiendo un auto
     * @param auto
     * @return
     */
    public List<Placas> consultarPlacas(Automovil auto);

    /**
     * Metodo que regresa verdadero o falso verificando la vigencia de la placa recibiendo un ID
     * @param id
     * @return
     */
    public boolean validarPlacaVigente(Long id);
    
    /**
     * Metodo que regresa verdadero o falso verificando la existencia de la placa recibiendo un numero de placa
     * @param numero
     * @return
     */
    public boolean validarPlacaExistente(String numero);
    
    /**
     * Metodo que cancela la placa recibiendo un numero de placa
     * @param numero
     */
    public void cancelarPlaca(String numero);
    
    /**
     * Metodo que genera el numero de placa y regresa la placa
     * @return
     */
    public Placas generarPlaca();
}
