/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Licencias;

import Excepciones.ExcepcionesAT;
import dto.LicenciaDTO;
import dto.PersonaDTO;
import java.util.Calendar;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

/**
 *
 * @author tacot
 */
public interface ISolicitud_Licencia {
    public void validarDatos(LicenciaDTO licencia, PersonaDTO persona) throws ExcepcionesAT;
    
    public boolean SolicitarLicencia(LicenciaDTO licencia, PersonaDTO persona);
    
    public Calendar fechaDeExpiracion(int op);
    
    public String tipo(JRadioButton si);
    
    public String CalcularPrecio(JRadioButton si,JRadioButton no, JComboBox años);
}
