/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insercion;

import daos.PersonaDAO;
import entidadesJPA.Persona;
import excepciones.ExcepcionAT;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author galan
 */
public class InsercionMasiva {
    
    public void insertarPersonas() throws ExcepcionAT{
        
        //Crear lista de personas que será persistida
        List<Persona> personas= new ArrayList<>();
        
        //Crear las 20 personas que serán ingresados a la BD
        Persona persona1= new Persona("Pablo", "Galan", "Valenzuela", 
                new GregorianCalendar(2004, Calendar.AUGUST, 13), "GAVP040813PA9", "6441401671");
        Persona persona2= new Persona("Jesus", "Morales", "Rojas", 
                new GregorianCalendar(2004, Calendar.FEBRUARY, 21), "MORJ040221SA3", "6447878784");
        Persona persona3= new Persona("Cristina", "Castro", "Noriega", 
                new GregorianCalendar(2004, Calendar.AUGUST, 25), "CANC040825WE3", "644577544");
        Persona persona4= new Persona("Juan", "Garcia", "Jimenez", 
                new GregorianCalendar(1998, Calendar.JUNE, 1), "GAJJ980601ABC", "6442887744");
        Persona persona5= new Persona("Maria", "Garcia", "Muñoz", 
                new GregorianCalendar(1998, Calendar.JUNE, 1), "GARM980601ABC", "6444598747");
        Persona persona6= new Persona("Alejandro", "Martinez", "Rodriguez", 
                new GregorianCalendar(1990, Calendar.JULY, 2), "MAAR900702XYZ", "6447854757");
        Persona persona7= new Persona("Carlos", "Lopez", "Carrillo", 
                new GregorianCalendar(1988, Calendar.APRIL, 3), "LOCC880403PQR", "6441258598");
        Persona persona8= new Persona("Roberto", "Perez", "Baez", 
                new GregorianCalendar(1991, Calendar.MAY, 4), "PERB910504DEF", "6447785478");
        Persona persona9= new Persona("Luis", "Rodriguez", "Jauguin", 
                new GregorianCalendar(1987, Calendar.FEBRUARY, 15), "ROLJ870215GHI", "6441401671");
        Persona persona10= new Persona("Fernando", "Sanchez", "Fentanes", 
                new GregorianCalendar(1985, Calendar.MARCH, 26), "SANF850326JKL", "6445787885");
        Persona persona11= new Persona("Miguel", "Gonzalez", "Iñatu", 
                new GregorianCalendar(1992, Calendar.AUGUST, 7), "GOMI920807MNO", "6445857474");
        Persona persona12= new Persona("David", "Ramirez", "Duarte", 
                new GregorianCalendar(1993, Calendar.JUNE, 18), "RADD930618STU", "6441525287");
        Persona persona13= new Persona("Ana", "Martinez", "Niguez", 
                new GregorianCalendar(1990, Calendar.JULY, 2), "MAAN900702XYZ", "6447474785");
        Persona persona14= new Persona("Laura", "Lopez", "Lopez", 
                new GregorianCalendar(1988, Calendar.APRIL, 3), "LOPL880403PQR", "6441405528");
        Persona persona15= new Persona("Sofia", "Rodriguez", "Fernandez", 
                new GregorianCalendar(1987, Calendar.FEBRUARY, 15), "ROSF870215GHI", "6442655898");
        Persona persona16= new Persona("Brenda", "Sanchez", "Rodriguez", 
                new GregorianCalendar(1985, Calendar.MARCH, 26), "SABR850326JKL", "6441425285");
        Persona persona17= new Persona("Andrea", "Gonzalez", "Alcantar", 
                new GregorianCalendar(1992, Calendar.AUGUST, 7), "GOAA920807MNO", "6447458547");
        Persona persona18= new Persona("Jessica", "Ramirez", "Espinoza", 
                new GregorianCalendar(1993, Calendar.JUNE, 18), "RAJE930618STU", "6441454578");
        Persona persona19= new Persona("Diana", "Hernandez", "Imparan", 
                new GregorianCalendar(1989, Calendar.JULY, 19), "HEDI890719VWX", "6441454748");
        Persona persona20= new Persona("Alejandra", "Diaz", "Amparan", 
                new GregorianCalendar(1984, Calendar.AUGUST, 20), "DIAA840820YZA", "6445877874");
        
        //Añadir personas a la lista
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        personas.add(persona5);
        personas.add(persona6);
        personas.add(persona7);
        personas.add(persona8);
        personas.add(persona9);
        personas.add(persona10);
        personas.add(persona11);
        personas.add(persona12);
        personas.add(persona13);
        personas.add(persona14);
        personas.add(persona15);
        personas.add(persona16);
        personas.add(persona17);
        personas.add(persona18);
        personas.add(persona19);
        personas.add(persona20);
        
        PersonaDAO personaDAO= new PersonaDAO();
        
//        personaDAO.registrarListaPersonas(personas);

        for (Persona p : personas) {
            personaDAO.registrarPersona(p);
        }
//        
//        personaDAO.registrarPersona(persona1);
//        personaDAO.registrarPersona(persona2);
//        personaDAO.registrarPersona(persona3);
//        personaDAO.registrarPersona(persona4);
//        personaDAO.registrarPersona(persona5);
//        personaDAO.registrarPersona(persona6);
//        personaDAO.registrarPersona(persona7);
//        personaDAO.registrarPersona(persona8);
//        personaDAO.registrarPersona(persona9);
//        personaDAO.registrarPersona(persona10);
//        personaDAO.registrarPersona(persona11);
//        personaDAO.registrarPersona(persona12);
//        personaDAO.registrarPersona(persona13);
//        personaDAO.registrarPersona(persona14);
//        personaDAO.registrarPersona(persona15);
//        personaDAO.registrarPersona(persona16);
//        personaDAO.registrarPersona(persona17);
//        personaDAO.registrarPersona(persona18);
//        personaDAO.registrarPersona(persona19);
//        personaDAO.registrarPersona(persona20);
    }    
    
}
