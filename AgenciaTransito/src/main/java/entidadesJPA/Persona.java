/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidadesJPA;

import java.io.Serializable;
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

    @Column(name = "fechaNacimiento", nullable = false)
    private Calendar fechaNaci;
   
    @Column(name = "RFC", nullable = false, length = 150)
    private String rfc;
    
    @Column(name = "nombre", nullable = false, length = 150)
    private String nombre;
    
    @Column(name = "apellidoPaterno", nullable = false, length = 150)
    private String apellidoP;
   
    @Column(name = "apellidoMaterno", nullable = false, length = 150)
    private String apellidoM;
    
     @Column(name = "telefono", nullable = false, length = 20)
    private String telefono;

    @OneToMany(mappedBy = "persona", cascade= {CascadeType.PERSIST})
    private List<Licencia> licencias;

    public Persona() {
    }

   
     
    public Long getId() {
        return id;
    }

    public Persona(Calendar fechaNaci, String rfc, String nombre, String apellidoP, String apellidoM, String telefono) {
        this.fechaNaci = fechaNaci;
        this.rfc = rfc;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.telefono = telefono;
    }

   

    public void setId(Long id) {
        this.id = id;
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

    public List<Licencia> getLicencias() {
        return licencias;
    }

    public void setLicencias(List<Licencia> licencias) {
        this.licencias = licencias;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", fechaNaci=" + fechaNaci + ", rfc=" + rfc + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM + ", telefono=" + telefono + '}';
    }

    
    
        
    
}
