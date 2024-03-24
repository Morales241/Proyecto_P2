/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Licencias;

import daos.LicenciaDAO;
import daos.PersonaDAO;
import dto.LicenciaDTO;
import dto.PersonaDTO;
import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

/**
 *
 * @author tacot
 */
public class Solicitud_Licencia implements ISolicitud_Licencia {

    PersonaDAO pc = new PersonaDAO();

    LicenciaDAO lc = new LicenciaDAO();

    @Override
    public String validarDatos(LicenciaDTO licencia, PersonaDTO persona) {
        if (licencia != null && persona != null) {

            if (true) {

            } else {

            }
        } else {

            return "los datos de la persona o la licencia son nulos";

        }
        return "Algo salio terriblemente mal";
    }

    @Override
    public boolean SolicitarLicencia(LicenciaDTO lic, PersonaDTO per) {
        List<Licencia> licencias = new ArrayList<>();
        Persona persona = new Persona(per.getFechaNaci(), per.getRfc(), per.getNombre(), per.getApellidoP(), per.getApellidoM(), per.getTelefono());
        Licencia licencia = new Licencia(lic.getFechaExpedicion(), lic.getFechaVencimiento(), lic.getTipo(), lic.getVigencia(), lic.getCosto());

        if (pc.validarPersona(per.getRfc(), per.getNombre(), per.getApellidoP(), per.getApellidoM())) {
            licencia.setPersona(persona);
            licencias.add(licencia);
            persona.setLicencias(licencias);

            pc.registrarPersona(persona, licencia);
            return true;
        } else {

            pc.actualizarPersona(persona, licencia);
            return false;
        }
    }

    @Override
    public Calendar fechaDeExpiracion(int op) {
        Calendar fecha = Calendar.getInstance();
        if (op == 1) {
            fecha.add(Calendar.YEAR, 1);
        }
        if (op == 2) {
            fecha.add(Calendar.YEAR, 2);
        }
        if (op == 3) {
            fecha.add(Calendar.YEAR, 3);
        }
        return fecha;
    }

    @Override
    public String tipo(JRadioButton si) {
        if (si.isSelected()) {
            return "Discapacitado";
        }else{
            return "Normal";
        }
    }

    @Override
    public String CalcularPrecio(JRadioButton si, JRadioButton no, JComboBox años) {
        
        int op = Integer.parseInt(String.valueOf(años.getSelectedItem()));
        
        if (1 ==  op && si.isSelected()) {
            return "200.00";

        }
        if (1 == op && no.isSelected() || (!si.isSelected() && !no.isSelected())) {
            return "600.00";

        }
        if (2 == op && si.isSelected()) {
            return "500.00";

        }
        if (2 == op && no.isSelected()|| (!si.isSelected() && !no.isSelected())) {
            return "900.00";

        }
        if (3 == op && si.isSelected()) {
            return "700.00";

        }
        if (3 == op && no.isSelected()|| (!si.isSelected() && !no.isSelected())) {
            return "1100.00";
        }
        
        return "0.00";
    }

   

}
