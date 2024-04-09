
package entidadesJPA;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Clase de la herencia Vehiculo
 * @author galan
 */
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) 
public class Vehiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "tipo", nullable = false, length = 150)
    private String tipo;
    
    @Column(name = "numeroSerie", nullable = false, length = 150)
    private String numeroSerie;
    
    @Column(name = "marca", nullable = false, length = 150)
    private String marca;
    
    @Column(name = "linea", nullable = false, length = 150)
    private String linea;
    
    @Column(name = "modelo", nullable = false, length = 150)
    private String modelo;
    
    @Column(name = "color", nullable = false, length = 150)
    private String color;

    /**
     * Constructor vacio
     */
    public Vehiculo() {
    }

    /**
     * Constructor sin id 
     * @param tipo
     * @param numeroSerie
     * @param marca
     * @param linea
     * @param modelo
     * @param color
     */
    public Vehiculo(String tipo, String numeroSerie, String marca, String linea, String modelo, String color) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.linea = linea;
        this.modelo = modelo;
        this.color = color;
    }

    /**
     * Metodo que regresa el id del vehiculo
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * Metodo que establece el id del vehiculo
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Metodo que regrtesa el tipo
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Metodo que establece el tipo
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Metodo que regresa el numero de serie
     * @return
     */
    public String getNumeroSerie() {
        return numeroSerie;
    }

    /**
     * Metodo que establece el numero de serie
     * @param numeroSerie
     */
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    /**
     * Metodo que regresa la marca
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Metodo que establece la marca
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Metodo que regresa la linea
     * @return
     */
    public String getLinea() {
        return linea;
    }

    /**
     * Metodo que establece la linea
     * @param linea
     */
    public void setLinea(String linea) {
        this.linea = linea;
    }

    /**
     * Metodo que regresa el modelo
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Metodo que establece el modelo
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Metodo que rergesa el color
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * Metodo que establece el color
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Metodo que imprime todos los atributos
     * @return
     */
    @Override
    public String toString() {
        return "Vehiculo{" + "id=" + id + ", tipo=" + tipo + ", numeroSerie=" + numeroSerie + ", marca=" + marca + ", linea=" + linea + ", modelo=" + modelo + ", color=" + color + '}';
    }
    
    

    
}
