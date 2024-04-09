/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import entidadesJPA.Reporte;
import excepciones.ExcepcionAT;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author galan
 */
public class ReporteDAO implements IReporteDAO {

    EntityManagerFactory emf;
    EntityManager em;

    /**
     * Contructor que inicializa la conexion a la base de datos
     */
    public ReporteDAO() {
        emf = Persistence.createEntityManagerFactory("ConexionPU");
    }

    public void registrarReporte(Reporte reporte) throws ExcepcionAT {
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

    @Override
    public List<Reporte> consultarLicenciasPlacasPorNombre(String nombre) {
        emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();

        String jpql = "SELECT r FROM Reporte r WHERE LOWER(r.nombrePersona) LIKE LOWER(:nombre)";
        TypedQuery<Reporte> query = em.createQuery(jpql, Reporte.class);
        query.setParameter("nombre", nombre);
        return query.getResultList();
    }

    @Override
    public List<Reporte> consultarLicenciasPlacasPorTipo(String tipo) {
        emf = Persistence.createEntityManagerFactory("ConexionPU");
        em = emf.createEntityManager();

        String jpql;
        if ("licencias".equals(tipo)) {
            jpql = "SELECT r FROM Reporte r WHERE r.tipoTramite = 'Registro Licencia'";
        } else if ("placas".equals(tipo)) {
            jpql = "SELECT r FROM Reporte r WHERE r.tipoTramite = 'Registro Placas'";
        } else {
            throw new IllegalArgumentException("Tipo de trámite no válido: " + tipo);
        }

        TypedQuery<Reporte> query = em.createQuery(jpql, Reporte.class);
        return query.getResultList();

    }

    @Override
    public List<Reporte> consultarLicenciasPlacasPorPeriodo(LocalDate fechaInicio, LocalDate fechaFin) {
        emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Reporte> cq = cb.createQuery(Reporte.class);

        Root<Reporte> reporte = cq.from(Reporte.class);

        Predicate fechaPredicate = cb.and(cb.greaterThanOrEqualTo(reporte.get("fechaExpedicion"), fechaInicio),
                cb.lessThanOrEqualTo(reporte.get("fechaExpedicion"), fechaFin));

        cq.where(fechaPredicate);

        TypedQuery<Reporte> query = em.createQuery(cq);

        return query.getResultList();
    }

    @Override
    public void generarReporte(List<Reporte> reportes) {
        Document doc = new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("Reporte.pdf"));

            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell("Nombre");
            tabla.addCell("RFC");
            tabla.addCell("tipo de tramite");
            tabla.addCell("fecha de expedición");
            tabla.addCell("Total");

            for (Reporte reporte : reportes) {
                tabla.addCell(reporte.getNombrePersona());
                tabla.addCell(reporte.getRFC());
                tabla.addCell(reporte.getTipoTramite());

                // Convertir la fecha de Calendar a String
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                tabla.addCell(sdf.format(reporte.getFechaExpedicion().getTime()));

                // Convertir el costo de double a String 
                tabla.addCell(String.valueOf(reporte.getCosto()));
            }

            doc.open();
            doc.add(tabla);
            doc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReporteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(ReporteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
