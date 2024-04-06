/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidadesJPA.Automovil;
import entidadesJPA.Placas;
import entidadesJPA.vigencia;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author tacot
 */
public class PlacasDAO implements IPlacasDAO{
    
    EntityManagerFactory emf;
    EntityManager em;

    public PlacasDAO() {
        emf = Persistence.createEntityManagerFactory("ConexionPU");
        em = emf.createEntityManager();
    }
    

    @Override
    public List<Placas> consultarPlacas(Automovil auto) {
        List<Placas> placas = null;

        em = emf.createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Placas> query = cb.createQuery(Placas.class);

        Root<Placas> placasRoot = query.from(Placas.class);

        Predicate prepre = cb.equal(placasRoot.get("idAutomovil"), auto.getId());

        query.where(prepre);

        placas = em.createQuery(query).getResultList();


        return placas;
    }

    @Override
    public boolean validarPlacaVigente(Long id) {
        Placas placa;

        LocalDate fecha = LocalDate.now();

        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Placas> query = cb.createQuery(Placas.class);

        Root<Placas> placasRoot = query.from(Placas.class);

        
        Predicate predicate = cb.and(
                cb.equal(placasRoot.get("idAutomovil"), id),
                cb.greaterThan(placasRoot.get("fechaRecepcion"), fecha)
        );

        query.where(predicate);

        placa = em.createQuery(query).getSingleResult();

        return placa!=null;
    }

    @Override
    public boolean validarPlacaExistente(String numero)  {
        Placas placa;


        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Placas> query = cb.createQuery(Placas.class);

        Root<Placas> placasRoot = query.from(Placas.class);

        Predicate predicate = cb.equal(placasRoot.get("numero"), numero);

        query.where(predicate);

        placa = em.createQuery(query).getSingleResult();


        return placa==null;
    }

    @Override
    public void cancelarPlaca(String numero) {
        Placas placa;

        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Placas> query = cb.createQuery(Placas.class);

        Root<Placas> placasRoot = query.from(Placas.class);

        Predicate predicate = cb.equal(placasRoot.get("numero"), numero);

        query.where(predicate);

        placa = em.createQuery(query).getSingleResult();

        placa.setVigencia(vigencia.Expirada);
        
        em.getTransaction().begin();
        
        em.merge(placa);
        
        em.getTransaction().commit();
        
    }

    @Override
    public Placas generarPlaca() {
        //primero ponemos nuestro dominio que son las letras del alfabeto
        String Letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        Random random = new Random();

        String placa = "";

        for (int i = 0; i < 3; i++) {
            //aqui estamos sacando una posicion random de todas nuestras letras
            int index = random.nextInt(Letras.length());
            
            //aqui simplemente agregamos a nuestra placa la letra de la posicion random
            //que salió
            placa += Letras.charAt(index);
        }

        placa += "-";

        for (int i = 0; i < 3; i++) {
            //aqui solo elegimos un numero entre el 0 al 9
            int numero = random.nextInt(10);
            
            //y ya solo lo agregamos a nuestra placa
            placa += numero;
        }

        
        return new Placas(placa, Calendar.getInstance(), vigencia.Vigente);
    }
    
}
