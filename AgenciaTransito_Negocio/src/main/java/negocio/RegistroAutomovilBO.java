/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import daos.AutomovilDAO;
import daos.PersonaDAO;
import dto.AutomovilDTO;
import dto.PersonaDTO;
import dto.ReporteDTO;
import dto.VehiculoDTO;
import entidadesJPA.Automovil;
import entidadesJPA.Persona;
import excepciones.ExcepcionAT;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 * Clase que implementa la interfaz IRegistroAutomovil y contiene el codigo de todos sus metodos
 * @author crist
 */
public class RegistroAutomovilBO implements IRegistroAutomovil {

    AutomovilDAO automovilDAO;
    PersonaDAO personaDAO;
    ReporteBO reporteBO;

    /**
     * Constructor que inicializa automovilDAO, personaDAO y reporteBO
     */
    public RegistroAutomovilBO() {
        this.automovilDAO = new AutomovilDAO();
        this.personaDAO = new PersonaDAO();
        reporteBO = new ReporteBO();
    }

    @Override
    public String registrarAutomovil(AutomovilDTO automovilDTO, PersonaDTO persona) {
        try {
            List<Persona> pers = personaDAO.buscarPersonaPorRFC(persona.getRFC());

            Automovil automovil = new Automovil("Nuevo", automovilDTO.getNumeroSerie(), automovilDTO.getMarca(), automovilDTO.getLinea(),
                    automovilDTO.getModelo(), automovilDTO.getColor());

            ReporteDTO reporteDTO = new ReporteDTO(persona.getNombre(), persona.getRFC(), "Registro Placas",
                    new GregorianCalendar(), 1500);
            reporteBO.registrarReporte(reporteDTO);
            return automovilDAO.registrarAutoNuevo(automovil, pers.get(0));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }

    @Override
    public void validarAuto(AutomovilDTO auto) throws ExcepcionAT {
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(auto.getColor());

        if (auto.getColor() == null && !matcher.matches()) {
            throw new ExcepcionAT("El color del auto solo debe de contener letras");
        }

        matcher = pattern.matcher(auto.getLinea());

        if (auto.getLinea() == null && !matcher.matches()) {
            throw new ExcepcionAT("La linea del auto solo debe de contener letras");
        }

        matcher = pattern.matcher(auto.getMarca());

        if (auto.getMarca() == null && !matcher.matches()) {
            throw new ExcepcionAT("La marca del auto solo debe de contener letras");
        }

        matcher = pattern.matcher(auto.getModelo());

        if (auto.getModelo() == null && !matcher.matches()) {
            throw new ExcepcionAT("El modelo del auto solo debe de contener letras");
        }

        pattern = Pattern.compile("^[a-zA-Z0-9]*$");
        matcher = pattern.matcher(auto.getNumeroSerie());

        if (auto.getNumeroSerie() == null && !matcher.matches()) {
            throw new ExcepcionAT("El modelo del auto solo debe de contener letras");
        }

    }

    @Override
    public AutomovilDTO buscarAuto(String placa) throws ExcepcionAT {

        Automovil automovilAux = automovilDAO.consultarAutoPorPlaca(placa);

        AutomovilDTO automovil = new AutomovilDTO("Usado", automovilAux.getNumeroSerie(), automovilAux.getMarca(),
                automovilAux.getLinea(), automovilAux.getModelo(), automovilAux.getColor());

        return automovil;
    }

    @Override
    public String registrarAutomovilUsado(AutomovilDTO automovilDTO, PersonaDTO persona) throws ExcepcionAT {
        try {
            Persona pers = personaDAO.buscarPersona(persona.getRFC());

            String placasAnteriores = automovilDTO.getTipo();

            Automovil automovil = new Automovil("Usado", automovilDTO.getNumeroSerie(), automovilDTO.getMarca(), automovilDTO.getLinea(),
                    automovilDTO.getModelo(), automovilDTO.getColor());
            ReporteDTO reporteDTO = new ReporteDTO(persona.getNombre(), persona.getRFC(), "Registro Placas",
                    new GregorianCalendar(), 1000);
            reporteBO.registrarReporte(reporteDTO);
            return automovilDAO.registrarAutoUsado(automovil, pers, placasAnteriores);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }

}
