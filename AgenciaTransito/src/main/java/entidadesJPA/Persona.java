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
 *
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
    private List<Vehiculo> vehiculos;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellidoPaterno, String apellidoMaterno, Calendar fechaNacimiento, String RFC, String telefono, List<Licencia> licencias) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.RFC = RFC;
        this.telefono = telefono;
        this.licencias = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
    }

    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, Calendar fechaNacimiento, String RFC, String telefono) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.RFC = RFC;
        this.telefono = telefono;
        this.licencias = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Licencia> getLicencias() {
        return licencias;
    }

    public void setLicencias(List<Licencia> licencias) {
        this.licencias = licencias;
    }
    
    public void agregarLicencia(Licencia licencia){
        this.licencias.add(licencia);
    }
    
}
