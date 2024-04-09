/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import java.util.List;

/**
 * Interfaz de licencias que define los metodos abstractos
 * @author crist
 */
public interface ILicenciaDAO {

    /**
     * Metodo que registra la licencia recibiendo una licencia
     * @param licencia
     */
    public void registrarLicencia(Licencia licencia);

    /**
     * Metodo que regresa la lista de licencias recibiendo una persona
     * @param persona
     * @return
     */
    public List<Licencia> consultarLicencias(Persona persona);

    /**
     * Metodo que regresa verdadero o falso verificando que la licencia sea vigente recibiendo un id
     * @param id
     * @return
     */
    public boolean validarLicenciaVigente(Long id);

}
