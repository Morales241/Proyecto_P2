/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import entidadesJPA.Placas;
import entidadesJPA.Vehiculo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author crist
 */
public class PersonaDTO {

    private Calendar fechaNacimiento;

    private String RFC;

    private String nombre;

    private String apellidoPaterno;

    private String apellidoMaterno;

    private String telefono;

    private List<LicenciaDTO> licencias;
    
    private List<VehiculoDTO> vehiculos;

    public PersonaDTO() {
    }

    public PersonaDTO(Calendar fechaNacimiento, String RFC, String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, List<LicenciaDTO> licencias) {
        this.fechaNacimiento = fechaNacimiento;
        this.RFC = RFC;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefono = telefono;
        this.licencias = licencias;
    }

    public PersonaDTO(Persona persona) {
        this.fechaNacimiento = persona.getFechaNacimiento();
        this.RFC = persona.getRFC();
        this.nombre = persona.getNombre() + " " + persona.getApellidoPaterno() + " " + persona.getApellidoMaterno();
        this.apellidoPaterno = persona.getApellidoPaterno();
        this.apellidoMaterno = persona.getApellidoMaterno();
        this.telefono = persona.getTelefono();

        if (!persona.getLicencias().isEmpty()) {
            licencias = new ArrayList<>();
            List<Licencia> licenciasPersona = persona.getLicencias();
            for (Licencia licencia : licenciasPersona) {
                LicenciaDTO licenciaAux = new LicenciaDTO();
                licenciaAux.setCosto(licencia.getCosto());
                licenciaAux.setFechaExpedicion(licencia.getFechaExpedicion());
                licenciaAux.setFechaVencimiento(licencia.getFechaVencimiento());
                licenciaAux.setPersona(this);
                licenciaAux.setTipo(licencia.getTipo());
                licenciaAux.setEstado(licencia.getEstado());
                this.licencias.add(licenciaAux);
            }
        }
        
        if (!persona.getVehiculos().isEmpty()) {
            vehiculos = new ArrayList<>();
            List<Vehiculo> vehiculosPersona = persona.getVehiculos();
            
            for (Vehiculo v : vehiculosPersona ) {
                VehiculoDTO vehiculoAux = new VehiculoDTO(v.getTipo(), v.getNumeroSerie(), v.getMarca(), 
                v.getLinea(), v.getModelo(), v.getColor());
                
                List<PlacasDTO> placas = new ArrayList<>();
                
                if (!v.getPlacas().isEmpty()) {
                    List<Placas> placasVehiculo = v.getPlacas();
                    
                    for (Placas p : placasVehiculo) {
                        PlacasDTO placaAux;
                        placaAux = new PlacasDTO(p.getNumero(),
                                p.getFechaExpedicion(), p.getFechaRecepcion() ,p.getVigencia());
                    
                        placas.add(placaAux);
                    }
                    
                    vehiculoAux.setPlacas(placas);
                }
            }
        }
        
    }

    public List<VehiculoDTO> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<VehiculoDTO> vehiculos) {
        this.vehiculos = vehiculos;
    }

    
    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<LicenciaDTO> getLicencias() {
        return licencias;
    }

    public void setLicencias(List<LicenciaDTO> licencias) {
        this.licencias = licencias;
    }

}
