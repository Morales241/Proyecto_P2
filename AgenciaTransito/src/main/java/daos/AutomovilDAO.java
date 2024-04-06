/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidadesJPA.Automovil;
import entidadesJPA.Persona;
import entidadesJPA.Placas;
import entidadesJPA.Vehiculo;
import excepciones.ExcepcionAT;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
 * @author crist
 */
public class AutomovilDAO implements IAutomovilDAO {

    PlacasDAO placasDao = new PlacasDAO();
    
    EntityManagerFactory emf;
    EntityManager em;

    public AutomovilDAO() {
        emf = Persistence.createEntityManagerFactory("ConexionPU");
        em = emf.createEntityManager();
    }

    @Override
    public String registrarAutoNuevo(Automovil auto, Persona persona) {
        Placas placa = placasDao.generarPlaca();
        
        em.getTransaction().begin();
        
        auto.setPersona(persona);
        
        placa.setAutomovil(auto);
        
        List<Placas> placas = new ArrayList<>();
        
        
        placas.add(placa);
        
        auto.setPlacas(placas);
        
        persona.getVehiculos().add(auto);
        
        em.merge(persona);
        
        em.getTransaction().commit();
        
        return placa.getNumero();
        
    }

    @Override
    public List<Automovil> consultarAutos(Persona persona) {

        List<Automovil> autos = new ArrayList<>();
        
        CriteriaBuilder cb = em.getCriteriaBuilder();
        
        CriteriaQuery<Automovil> cq = cb.createQuery(Automovil.class);
        
        Root<Automovil> autoRoot = cq.from(Automovil.class);
        
        Predicate autoPredicate = cb.equal(autoRoot.get("persona").get("id"), persona.getId());
        
        cq.where(autoPredicate);
        
        autos = em.createQuery(cq).getResultList();
        
        return autos;
    }

    @Override
    public String registrarAutoUsado(Automovil auto, Persona persona, String placaAnterior) throws ExcepcionAT {
        
        if (placasDao.validarPlacaExistente(placaAnterior)) {
            throw new ExcepcionAT("La placa ingresada no esta registrada en este automovil");
        }
        
        Placas placa = placasDao.generarPlaca();
        placasDao.cancelarPlaca(placaAnterior);
        
        em.getTransaction().begin();
        
        em.remove(auto);
        
        auto.setPersona(persona);
        
        placa.setAutomovil(auto);
        
        auto.getPlacas().add(placa);
        
        List<Automovil> autos =consultarAutos(persona);
        
        autos.add(auto);
        
        persona.setVehiculos(autos);
        
        em.merge(persona);
        
        em.getTransaction().commit();
        
        return placa.getNumero();
    }

    @Override
    public Automovil consultarAutoPorPlaca(String placa) {
        Automovil auto;
        Placas placaAuto;
        
        CriteriaBuilder cb = em.getCriteriaBuilder();
        
        CriteriaQuery<Placas> query = cb.createQuery(Placas.class);
        
        Root<Placas> placaRoot = query.from(Placas.class);
        
        Predicate placaPre = cb.equal(placaRoot.get("numero"), placa);
        
        query.where(placaPre);
        
        placaAuto = em.createQuery(query).getSingleResult();
        
        CriteriaQuery<Automovil> cq = cb.createQuery(Automovil.class);
        
        Root<Automovil> autoRoot = cq.from(Automovil.class);
        
        Predicate autoPredicate = cb.equal(autoRoot.get("id"), placaAuto.getAutomovil().getId());
        
        cq.where(autoPredicate);
        
        
        auto = em.createQuery(cq).getSingleResult();
        
        return auto;
    }


}