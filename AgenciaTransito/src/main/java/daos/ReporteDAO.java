/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidadesJPA.Persona;
import entidadesJPA.Reporte;
import excepciones.ExcepcionAT;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author galan
 */
public class ReporteDAO {
    EntityManagerFactory emf;
    EntityManager em;

    /**
     * Contructor que inicializa la conexion a la base de datos
     */
    public ReporteDAO() {
        emf = Persistence.createEntityManagerFactory("ConexionPU");
    }

    public void registrarReporte (Reporte reporte) throws ExcepcionAT{
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            em.persist(reporte);

            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            System.out.println(e.getCause());
            throw new ExcepcionAT("Error al registrar reporte");
        }
    }
}
