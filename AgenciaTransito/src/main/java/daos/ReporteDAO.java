package daos;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import daos.IReporteDAO;
import entidadesJPA.Reporte;
import excepciones.ExcepcionAT;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
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
 * Clase ReporteDAO que implementa la interfaz IReporteDAO.
 * Esta clase contiene métodos para interactuar con la base de datos.
 * @author galan
 */
public class ReporteDAO implements IReporteDAO {

    // EntityManagerFactory y EntityManager para interactuar con la base de datos.
    EntityManagerFactory emf;
    EntityManager em;

    /**
     * Constructor de ReporteDAO.
     * Inicializa la conexión a la base de datos.
     */
    public ReporteDAO() {
        emf = Persistence.createEntityManagerFactory("ConexionPU");
    }

    /**
     * Método para registrar un reporte en la base de datos.
     * @param reporte El reporte a registrar.
     * @throws ExcepcionAT si ocurre un error al registrar el reporte.
     */
    public void registrarReporte(Reporte reporte) throws ExcepcionAT {
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            // Persiste el reporte en la base de datos.
            em.persist(reporte);

            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            System.out.println(e.getCause());
            throw new ExcepcionAT("Error al registrar reporte");
        }
    }

    /**
     * Método para consultar reportes por nombre.
     * @param nombre El nombre a buscar.
     * @return Una lista de reportes que coinciden con el nombre.
     */
    @Override
    public List<Reporte> consultarLicenciasPlacasPorNombre(String nombre) {
        emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();

        // Consulta JPQL para seleccionar reportes donde el nombre de la persona coincide con el parámetro.
        String jpql = "SELECT r FROM Reporte r WHERE LOWER(r.nombrePersona) LIKE LOWER(:nombre)";
        TypedQuery<Reporte> query = em.createQuery(jpql, Reporte.class);
        query.setParameter("nombre", "%" + nombre.toLowerCase() + "%");

        return query.getResultList();
    }

    /**
     * Método para consultar reportes por tipo de trámite.
     * @param tipo El tipo de trámite a buscar.
     * @return Una lista de reportes que coinciden con el tipo de trámite.
     */
    @Override
    public List<Reporte> consultarLicenciasPlacasPorTipo(String tipo) {
        emf = Persistence.createEntityManagerFactory("ConexionPU");
        em = emf.createEntityManager();

        String jpql;
        if ("Licencias".equals(tipo)) {
            jpql = "SELECT r FROM Reporte r WHERE r.tipoTramite = 'Registro Licencia'";
        } else if ("Placas".equals(tipo)) {
            jpql = "SELECT r FROM Reporte r WHERE r.tipoTramite = 'Registro Placas'";
        } else {
            throw new IllegalArgumentException("Tipo de trámite no válido: " + tipo);
        }

        TypedQuery<Reporte> query = em.createQuery(jpql, Reporte.class);
        return query.getResultList();
    }

    /**
     * Método para consultar reportes por un periodo de tiempo.
     * @param fechaInicio La fecha de inicio del periodo.
     * @param fechaFin La fecha de fin del periodo.
     * @return Una lista de reportes que están dentro del periodo de tiempo.
     */
    @Override
    public List<Reporte> consultarLicenciasPlacasPorPeriodo(Calendar fechaInicio, Calendar fechaFin) {
        emf = Persistence.createEntityManagerFactory("ConexionPU");

        em = emf.createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Reporte> cq = cb.createQuery(Reporte.class);
        Root<Reporte> reporte = cq.from(Reporte.class);

        // Crea un predicado para la fecha de expedición entre la fecha de inicio y la fecha de fin.
        Predicate fechaPredicate = cb.and(cb.greaterThanOrEqualTo(reporte.get("fechaExpedicion"), fechaInicio),
                cb.lessThanOrEqualTo(reporte.get("fechaExpedicion"), fechaFin));

        cq.where(fechaPredicate);

        TypedQuery<Reporte> query = em.createQuery(cq);

        return query.getResultList();
    }

    /**
     * Método para generar un reporte en formato PDF.
     * @param reportes La lista de reportes a incluir en el PDF.
     */
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
