/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import daos.ConsultasDAO;
import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import entidadesJPA.Placas;
import excepciones.ExcepcionAT;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author crist
 */
public class ConsultarLicenciasBO implements IconsultarLicencias{

    ConsultasDAO consultasDAO;
    private JLabel tituloTablas = new JLabel();
    private JLabel tablitaSP = new JLabel();
    private JLabel tablePersonas = new JLabel();

    public ConsultarLicenciasBO() {
       consultasDAO = new ConsultasDAO();
    }
    
    
    @Override
    public List<Licencia> cunsltarLicencias(Long ID) {
    List<Licencia> licencias = null;
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionPU");
    EntityManager em = emf.createEntityManager();

    try {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Licencia> query = cb.createQuery(Licencia.class);
        Root<Licencia> licenciaRoot = query.from(Licencia.class);
        Predicate prepre = cb.equal(licenciaRoot.get("persona").get("id"), ID);
        query.where(prepre);
        licencias = em.createQuery(query).getResultList();
    } catch (Exception ex) {
        ex.printStackTrace(); // O manejo adecuado de excepciones
    } finally {
        if (em != null) {
            em.close();
        }
        if (emf != null) {
            emf.close();
        }
    }

    return licencias;
    }

    @Override
    public List<Placas> obtenerPlacasDePersona(Persona persona) throws ExcepcionAT {
        try {
            List<Placas> placas = consultasDAO.obtenerPlacasDePersona(persona);
            if (placas.isEmpty()) {
                throw new ExcepcionAT("La persona buscada no tiene throws placas registradas: " + persona.getRFC());
            }
            return placas;
        } catch (NoResultException e) {
            throw new ExcepcionAT("La persona buscada no tiene placas registradas: " + persona.getRFC(), e);
        } catch (Exception e) {
            throw new ExcepcionAT("Error al obtener las placas de la persona: " + persona.getRFC(), e);
        } }

        @Override
    public List<Licencia> obtenerLicencias(Persona persona) throws ExcepcionAT {
        try {
            List<Licencia> licencias = consultasDAO.obtenerLicencias(persona);
            if (licencias.isEmpty()) {
                throw new ExcepcionAT("La persona buscada no tiene licencias registradas: " + persona.getRFC());
            }
            return licencias;
        } catch (NoResultException e) {
            throw new ExcepcionAT("La persona buscada no tiene licencias registradas: " + persona.getRFC(), e);
        } catch (Exception e) {
            throw new ExcepcionAT("Error al obtener las licencias de la persona: " + persona.getRFC(), e);
        }
    }

    

    @Override
    public List<Persona> consultarPorNombre(String Nombre) throws ExcepcionAT  {
        
        if (this.consultasDAO == null) {
            throw new IllegalStateException("El objeto consultasDAO no ha sido inicializado correctamente.");
        }
        try {
            List<Persona> persona = consultasDAO.consultarPorNombre(Nombre);
            if (persona.isEmpty()) {
                throw new ExcepcionAT("La persona buscada no esta registradas.");
            }
            return persona;
        } catch (Exception e) {
             e.printStackTrace(); 
            throw new ExcepcionAT("Error al obtener la persona.", e);
        }  
    }

    @Override
    public List<Persona> consultarHistorialFechaN(Calendar fechaNacimiento) throws ExcepcionAT {
         
        if (this.consultasDAO == null) {
            throw new IllegalStateException("El objeto consultasDAO no ha sido inicializado correctamente.");
        }
        try {
            List<Persona> persona = consultasDAO.consultarHistorialFechaN(fechaNacimiento);
            if (persona.isEmpty()) {
                throw new ExcepcionAT("La persona buscada no esta registradas.");
            }
            return persona;
        } catch (Exception e) {
             e.printStackTrace(); 
            throw new ExcepcionAT("Error al obtener la persona.", e);
        }   }

    @Override
    public List<Persona> consultarPorCURP(String curp) throws ExcepcionAT {
       
        if (this.consultasDAO == null) {
            throw new IllegalStateException("El objeto consultasDAO no ha sido inicializado correctamente.");
        }
        try {
            List<Persona> persona = consultasDAO.consultarPorCURP(curp);
            if (persona.isEmpty()) {
                throw new ExcepcionAT("La persona buscada no esta registradas.");
            }
            return persona;
        } catch (Exception e) {
             e.printStackTrace(); 
            throw new ExcepcionAT("Error al obtener la persona.", e);
        } 
    }

    @Override
    public Persona obtenerPersona(String rfc) throws ExcepcionAT {
       
        if (this.consultasDAO == null) {
            throw new IllegalStateException("El objeto consultasDAO no ha sido inicializado correctamente.");
        }
        try {
            return  consultasDAO.obtenerPersona(rfc);
        } catch (Exception e) {
             e.printStackTrace(); 
            throw new ExcepcionAT("Error al obtener la persona.", e);
        } 
    }

    @Override
    public void cargarDatosTabla(List<Persona> personas, JTable JTable1) {
         DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"RFC", "Nombre", "Birth", "Telefono"});

        if (personas.isEmpty()) {
            tituloTablas.setText("No se encontro ninguna persona");
            
        } else {
            tituloTablas.setText("Selecciona 1 de " + personas.size() + " personas encontradas para continuar");

            for (Persona persona : personas) {
                Date fecha = persona.getFechaNacimiento().getTime();
                String fechaString = (fecha != null) ? new SimpleDateFormat("yyyy-MM-dd").format(fecha) : "NoDate";
                model.addRow(new Object[]{persona.getRFC(), persona.getNombre(), fechaString, persona.getTelefono()});
            }
            JTable1.setModel(model);

            tablitaSP.setVisible(true);
            tablePersonas.setVisible(true);

        }
        tituloTablas.setVisible(true);
    }

    public void cargarDatosTablaLicencias(List<Licencia> licencias, JTable JTable1) {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Expedicion", "Vencimiento", "Tipo", "Vigencia", "Costo", "Estado", "Persona"});

        if (licencias.isEmpty()) {
            tituloTablas.setText("No se encontro ninguna persona");
            
        } else {
            tituloTablas.setText("Selecciona 1 de " + licencias.size() + " personas encontradas para continuar");

            for (Licencia licencia : licencias) {
                Date fechaE = licencia.getFechaExpedicion().getTime();
                Date fechaV = licencia.getFechaVencimiento().getTime();
                String fechaExString = (fechaE != null) ? new SimpleDateFormat("yyyy-MM-dd").format(fechaE) : "NoDate";
                String fechaVeString = (fechaV != null) ? new SimpleDateFormat("yyyy-MM-dd").format(fechaV) : "NoDate";
                model.addRow(new Object[]{fechaExString, fechaVeString, licencia.getTipo(),licencia.getVigencia(),licencia.getCosto(), licencia.getEstado(), licencia.getPersona()});
            }
            JTable1.setModel(model);

            tablitaSP.setVisible(true);
            tablePersonas.setVisible(true);

        }
        tituloTablas.setVisible(true);

    }
    
      public void cargarDatosTablaPlacas(List<Placas> placas, JTable JTable1) {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Placas", "Expedicion", "Recepcion", "Vigencia"});

        if (placas.isEmpty()) {
            tituloTablas.setText("No se encontro ninguna persona");
            
        } else {
            tituloTablas.setText("Selecciona 1 de " + placas.size() + " personas encontradas para continuar");

            for (Placas placa : placas) {
                Date fechaE = placa.getFechaExpedicion().getTime();
                Date fechaR = placa.getFechaRecepcion().getTime();
                String fechaExString = (fechaE != null) ? new SimpleDateFormat("yyyy-MM-dd").format(fechaE) : "NoDate";
                String fechaReString = (fechaR != null) ? new SimpleDateFormat("yyyy-MM-dd").format(fechaR) : "NoDate";
                model.addRow(new Object[]{placa.getNumero(), fechaExString, fechaReString, placa.getVigencia()});
            }
            JTable1.setModel(model);

            tablitaSP.setVisible(true);
            tablePersonas.setVisible(true);

        }
        tituloTablas.setVisible(true);

    }

}
