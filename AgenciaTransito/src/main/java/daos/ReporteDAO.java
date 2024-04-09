package daos;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
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
 * Clase ReporteDAO que implementa la interfaz IReporteDAO. Esta clase contiene métodos para interactuar con la base de datos.
 *
 * @author galan
 */
public class ReporteDAO implements IReporteDAO {

    // EntityManagerFactory y EntityManager para interactuar con la base de datos.
    EntityManagerFactory emf;
    EntityManager em;

    /**
     * Constructor de ReporteDAO. Inicializa la conexión a la base de datos.
     */
    public ReporteDAO() {
        emf = Persistence.createEntityManagerFactory("ConexionPU");
    }

    /**
     * Método para registrar un reporte en la base de datos.
     *
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
     *
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
     *
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
     *
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
     *
     * @param reportes La lista de reportes a incluir en el PDF.
     */
    @Override
    public void generarReporte(List<Reporte> reportes, int opcion) {
        Document doc = new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("Reporte.pdf"));
            doc.open();

            // Título del PDF
            // Fuente grande y en color rojo oscuro      
                Font fontTitulo = new Font(Font.FontFamily.HELVETICA, 24, Font.BOLD, new BaseColor(182, 0, 0)); 
                Paragraph titulo = new Paragraph("Agencia Tránsito", fontTitulo);
                // Alineación centrada
                titulo.setAlignment(Element.ALIGN_CENTER); 
                // Espacio después del título
                titulo.setSpacingAfter(20); 
                doc.add(titulo);
                
                
            if (opcion == 1) {
                Font fontSubTitulo = new Font(Font.FontFamily.HELVETICA, 20, Font.BOLD, new BaseColor(182, 0, 0)); 
                Paragraph Subtitulo = new Paragraph("Reporte de tramites de la persona: "+reportes.get(0).getNombrePersona(), fontSubTitulo);
                // Alineación a la izquierda
                Subtitulo.setAlignment(Element.ALIGN_LEFT); 
                // Espacio después del título
                Subtitulo.setSpacingAfter(20); 
                doc.add(Subtitulo);
            }if (opcion == 2) {
                Font fontSubTitulo = new Font(Font.FontFamily.HELVETICA, 20, Font.BOLD, new BaseColor(182, 0, 0)); 
                Paragraph Subtitulo = new Paragraph("Reporte de tramites por periodo", fontSubTitulo);
                // Alineación a la izquierda
                Subtitulo.setAlignment(Element.ALIGN_LEFT); 
                // Espacio después del título
                Subtitulo.setSpacingAfter(20); 
                doc.add(Subtitulo);
            }if (opcion == 3) {
                Font fontSubTitulo = new Font(Font.FontFamily.HELVETICA, 20, Font.BOLD, new BaseColor(182, 0, 0)); 
                Paragraph Subtitulo = new Paragraph("Reporte de tramites por tipo: "+reportes.get(0).getTipoTramite(), fontSubTitulo);
                // Alineación a la izquierda
                Subtitulo.setAlignment(Element.ALIGN_LEFT); 
                // Espacio después del título
                Subtitulo.setSpacingAfter(20); 
                doc.add(Subtitulo);
            }
            
            PdfPTable tabla = new PdfPTable(5);
            // Ancho de la tabla al 100% de la página
            tabla.setWidthPercentage(100); 
            // Espacio antes de la tabla
            tabla.setSpacingBefore(10); 

            // Encabezados de la tabla
            Font fontHeader = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD,  BaseColor.BLACK);
            PdfPCell cellHeader = new PdfPCell();
            // Color de fondo blanco
            cellHeader.setBackgroundColor(new BaseColor(255, 255, 255)); 
            // Alineación centrada
            cellHeader.setHorizontalAlignment(Element.ALIGN_CENTER); 
            // Alineación vertical centrada
            cellHeader.setVerticalAlignment(Element.ALIGN_MIDDLE); 
            // Color de borde rojo oscuro
            cellHeader.setBorderColor(new BaseColor(182, 0, 0)); 
             // Grosor del borde
            cellHeader.setBorderWidth(1);
            cellHeader.setPadding(5);
            
            cellHeader.setPhrase(new Phrase("Nombre", fontHeader));
            tabla.addCell(cellHeader);
            
            cellHeader.setPhrase(new Phrase("RFC", fontHeader));
            tabla.addCell(cellHeader);
            
            cellHeader.setPhrase(new Phrase("Tipo de trámite", fontHeader));
            tabla.addCell(cellHeader);
            
            cellHeader.setPhrase(new Phrase("Fecha de expedición", fontHeader));
            tabla.addCell(cellHeader);
            
            cellHeader.setPhrase(new Phrase("Total", fontHeader));
            tabla.addCell(cellHeader);

            // Contenido de la tabla
            Font fontContent = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL, BaseColor.BLACK); 
            for (Reporte reporte : reportes) {
                tabla.addCell(new Phrase(reporte.getNombrePersona(), fontContent));
                tabla.addCell(new Phrase(reporte.getRFC(), fontContent));
                tabla.addCell(new Phrase(reporte.getTipoTramite(), fontContent));

                // Convertir la fecha de Calendar a String
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                tabla.addCell(new Phrase(sdf.format(reporte.getFechaExpedicion().getTime()), fontContent));

                // Convertir el costo de double a String
                tabla.addCell(new Phrase(String.valueOf(reporte.getCosto()), fontContent));
            }
            

            // Agregar caja alrededor de la tabla
            PdfContentByte cb = writer.getDirectContent();
            // Posición y tamaño de la caja
            cb.rectangle(36, 50, 523, 700 - (reportes.size() * 20 + 40)); 
            // Color del borde
            cb.setColorStroke(new BaseColor(182, 0, 0)); 
            // Grosor del borde
            cb.setLineWidth(3); 
            cb.stroke();
            
            doc.add(tabla);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReporteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(ReporteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (doc.isOpen()) {
                doc.close();
            }
        }
    }
    
}
