/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import entidadesJPA.Automovil;
import entidadesJPA.Placas;
import java.util.List;

/**
 *
 * @author tacot
 */
public interface IPlacasDAO {
    public void registrarPlaca(Placas placa);

    public List<Placas> consultarPlacas(Automovil auto);

    public boolean validarPlacaVigente(Long id);
}
