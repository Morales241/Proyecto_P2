/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.Calendar;
import java.util.List;

/**
 *
 * @author crist
 */
public class PersonaDTO {
       
   private Calendar fechaNaci;
   
   private String rfc;
   
   private String nombre;
   
   private String apellidoP;
           
   private String apellidoM;     

   private String telefono;
   
   private List<LicenciaDTO> licencias;

    public PersonaDTO() {
    }

    public PersonaDTO(Calendar fechaNaci, String rfc, String nombre, String apellidoP, String apellidoM, String telefono) {
        this.fechaNaci = fechaNaci;
        this.rfc = rfc;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.telefono = telefono;
    }

    public List<LicenciaDTO> getLicencias() {
        return licencias;
    }

    public void setLicencias(List<LicenciaDTO> licencias) {
        this.licencias = licencias;
    }


    public Calendar getFechaNaci() {
        return fechaNaci;
    }

    public void setFechaNaci(Calendar fechaNaci) {
        this.fechaNaci = fechaNaci;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + " fechaNaci=" + fechaNaci + ", rfc=" + rfc + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM + ", telefono=" + telefono + '}';
    }
}
