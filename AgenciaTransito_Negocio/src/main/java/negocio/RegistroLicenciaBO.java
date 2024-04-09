/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import daos.LicenciaDAO;
import daos.PersonaDAO;
import dto.LicenciaDTO;
import dto.PersonaDTO;
import dto.ReporteDTO;
import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import excepciones.ExcepcionAT;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 * aqui lo que hacemos es que pedimos una licencia y una persona, mandamos a pedir si tiene Licencias
 *
 * @author crist
 */
public class RegistroLicenciaBO implements IRegistroLicencia {

    PersonaDAO personaDAO;
    LicenciaDAO licenciaDAO;
    ReporteBO reporteBO;

    /**
     *  Constructor que inicializa licenciaDAO, personaDAO y reporteBO
     */
    public RegistroLicenciaBO() {
        personaDAO=new PersonaDAO();
        licenciaDAO= new LicenciaDAO();
        reporteBO= new ReporteBO();
    }
    
    @Override
    public void registrarLicencia(LicenciaDTO licenciaDTO, PersonaDTO personaDTO) {
        try {
            List<Persona> personaLista= personaDAO.buscarPersonaPorRFC(personaDTO.getRFC());
            Persona persona= personaLista.get(0);
            Licencia licencia= new Licencia(licenciaDTO.getFechaExpedicion(), licenciaDTO.getFechaVencimiento(),
                    licenciaDTO.getTipo(), licenciaDTO.getVigencia(), licenciaDTO.getCosto(), "Activa", persona);
            persona.agregarLicencia(licencia);
            licenciaDAO.registrarLicencia(licencia);
            personaDAO.actualizarPersona(persona);
            
            ReporteDTO reporteDTO= new ReporteDTO(personaDTO.getNombre(), persona.getRFC(), "Registro Licencia", 
                    licenciaDTO.getFechaExpedicion(), licenciaDTO.getCosto());
            reporteBO.registrarReporte(reporteDTO);
        } catch (ExcepcionAT ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    /**
     * Metodo que busca a la persona mediante su RFC 
     * @param RFC
     * @return
     * @throws ExcepcionAT
     */
    public PersonaDTO buscarPersonaPorRFC(String RFC) throws ExcepcionAT {
        List<Persona> persona= personaDAO.buscarPersonaPorRFC(RFC);
        if(persona==null){
            throw new ExcepcionAT("La persona buscada no existe en nuestros registros");
        }
        PersonaDTO personaDTO= new PersonaDTO(persona.get(0));
        // aquí podemos poner un paso mas para demostrar que la licencia si esta activa, 
        // recordemos que la persona puede tener muchas licencias
        if(personaDTO.getLicencias()!=null){
            throw new ExcepcionAT("La persona buscada ya cuenta con una licencia activa");
        }
        return personaDTO;
    }
    
    /**
     * Metodo que calcula el precio de la licencia
     * @param si
     * @param no
     * @param años
     * @return
     */
    public String CalcularPrecio(JRadioButton si, JRadioButton no, JComboBox años) {

        int op = años.getSelectedIndex();

        if (0 == op && si.isSelected()) {
            return "200.00";

        }
        
        if ((0 == op && no.isSelected()) ) {
            return "600.00";

        }
        if (1 == op && si.isSelected()) {
            return "500.00";

        }
        if (1 == op && no.isSelected() ) {
            return "900.00";

        }
        if (2 == op && si.isSelected()) {
            return "700.00";

        }
        if (2 == op && no.isSelected() ) {
            return "1100.00";
        }

        return "600.00";
    }

}
