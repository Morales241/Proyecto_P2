/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import entidadesJPA.Automovil;
import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import entidadesJPA.Placas;
import entidadesJPA.Vehiculo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Clase que transfiere los datos de la persona
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

    /**
     * Constructor vacio
     */
    public PersonaDTO() {
    }

    /**
     * Constructor sin id
     * @param fechaNacimiento
     * @param RFC
     * @param nombre
     * @param apellidoPaterno
     * @param apellidoMaterno
     * @param telefono
     * @param licencias
     */
    public PersonaDTO(Calendar fechaNacimiento, String RFC, String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, List<LicenciaDTO> licencias) {
        this.fechaNacimiento = fechaNacimiento;
        this.RFC = RFC;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefono = telefono;
        this.licencias = licencias;
    }

    /**
     * Constructor que inicializa la persona
     * @param persona
     */
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
            List<Automovil> autosPersona = persona.getAutos();
            
            for (Automovil v : autosPersona ) {
                AutomovilDTO autoAux = new AutomovilDTO(v.getTipo(), v.getNumeroSerie(), v.getMarca(), 
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
                    
                    autoAux.setPlacas(placas);
                }
            }
        }
        
    }

    /**
     * Metodo que regresa la lista de vehiculosDTO
     * @return
     */
    public List<VehiculoDTO> getVehiculos() {
        return vehiculos;
    }

    /**
     * Metodo que establece la lista de vehiculosDTO
     * @param vehiculos
     */
    public void setVehiculos(List<VehiculoDTO> vehiculos) {
        this.vehiculos = vehiculos;
    }

    /**
     * Metodo que regresa la fecha de nacimiento
     * @return
     */
    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Metodo que establece la fecha de nacimiento
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Metodo que regresa el rfc
     * @return
     */
    public String getRFC() {
        return RFC;
    }

    /**
     * Metodo que establece el rfc
     * @param RFC
     */
    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    /**
     * Metodo que regresa el nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /** 
     * Metodo que establece el nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que regresa el apellido paterno
     * @return
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * Metodo que establece el apellido paterno
     * @param apellidoPaterno
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * Metodo que regresa el apellido materno
     * @return
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * Metodo que establece el apellido materno
     * @param apellidoMaterno
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * Metodo que regresa el telefono
     * @return
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Metodo que establece el telefono
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Metodo que regresa la lista de licenciasDTP
     * @return
     */
    public List<LicenciaDTO> getLicencias() {
        return licencias;
    }

    /**
     * Metodo que establece la lista de licenciasDTO
     * @param licencias
     */
    public void setLicencias(List<LicenciaDTO> licencias) {
        this.licencias = licencias;
    }

}
