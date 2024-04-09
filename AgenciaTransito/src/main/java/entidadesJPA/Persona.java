/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidadesJPA;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Clase de la entidad Personas
 * @author crist
 */
@Entity
@Table(name = "personas")
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre", nullable = false, length = 150)
    private String nombre;
    
    @Column(name = "apellidoPaterno", nullable = false, length = 150)
    private String apellidoPaterno;
   
    @Column(name = "apellidoMaterno", nullable = false, length = 150)
    private String apellidoMaterno;

    @Column(name = "fechaNacimiento", nullable = false)
    private Calendar fechaNacimiento;
   
    @Column(name = "RFC", nullable = false, length = 150)
    private String RFC;
 
    @Column(name = "telefono", nullable = false, length = 20)
    private String telefono;

    @OneToMany(mappedBy = "persona", cascade= {CascadeType.PERSIST,CascadeType.MERGE, CascadeType.REMOVE})
    private List<Licencia> licencias;
    
    @OneToMany(mappedBy = "persona", cascade= {CascadeType.PERSIST,CascadeType.MERGE, CascadeType.REMOVE})
    private List<Automovil> autos;

    /**
     * Contructor de personas que inicializa las listas de licencias y autos
     */
    public Persona() {
        this.licencias = new ArrayList<>();
        this.autos = new ArrayList<>();
    }

    /**
     * Contructor de todos los atributos
     * @param id
     * @param nombre
     * @param apellidoPaterno
     * @param apellidoMaterno
     * @param fechaNacimiento
     * @param RFC
     * @param telefono
     * @param licencias
     */
    public Persona(Long id, String nombre, String apellidoPaterno, String apellidoMaterno, Calendar fechaNacimiento, String RFC, String telefono, List<Licencia> licencias) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.RFC = RFC;
        this.telefono = telefono;
        this.licencias = new ArrayList<>();
        this.autos = new ArrayList<>();
    }

    /**
     * Constructor sin id
     * @param nombre
     * @param apellidoPaterno
     * @param apellidoMaterno
     * @param fechaNacimiento
     * @param RFC
     * @param telefono
     */
    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, Calendar fechaNacimiento, String RFC, String telefono) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.RFC = RFC;
        this.telefono = telefono;
        this.licencias = new ArrayList<>();
        this.autos = new ArrayList<>();
    }

    /**
     * Metodo que regresa la lista de autos
     * @return
     */
    public List<Automovil> getVehiculos() {
        return autos;
    }

    /**
     * Metodo que establece los autos
     * @param Autos
     */
    public void setVehiculos(List<Automovil> Autos) {
        this.autos = Autos;
    }

    /**
     * Metodo que regresa el id de la persona
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * Metodo que establece le id de la persona
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
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
     * Metodo que regresa el RFC
     * @return
     */
    public String getRFC() {
        return RFC;
    }

    /**
     * Metodo que establece el RFC
     * @param RFC
     */
    public void setRFC(String RFC) {
        this.RFC = RFC;
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
     * Metodo que regresa la lista de las licencias
     * @return
     */
    public List<Licencia> getLicencias() {
        return licencias;
    }

    /**
     * Metodo que establece la lista de las licencias
     * @param licencias
     */
    public void setLicencias(List<Licencia> licencias) {
        this.licencias = licencias;
    }
    
    /**
     * Metodo que agrega licencias a la lista de licencias
     * @param licencia
     */
    public void agregarLicencia(Licencia licencia){
        this.licencias.add(licencia);
    }

    /**
     * Metodo que regresa la lista de autos
     * @return
     */
    public List<Automovil> getAutos() {
        return autos;
    }

    /**
     * Metodo que establece la lista de autos
     * @param autos
     */
    public void setAutos(List<Automovil> autos) {
        this.autos = autos;
    }
    
}
