/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.espotifaix.persistencia;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import mx.itson.espotifaix.entidades.Album;
import mx.itson.espotifaix.entidades.Artista;
import mx.itson.espotifaix.utilerias.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author jesus
 */
public class ArtistaDAO {
    
    public static List<Artista> obtenerTodos(){
        List<Artista> artistas = new ArrayList<>();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            CriteriaQuery<Artista> criteriaQuery = session.getCriteriaBuilder().createQuery(Artista.class);
            criteriaQuery.from(Artista.class);
            artistas = session.createQuery(criteriaQuery).getResultList();
        } catch(HibernateException ex){
            System.err.print("Error: " + ex.getMessage());
        }
        return artistas;
    }
    
    public static boolean guardar(String nombre, String descripcion){
        boolean resultado = false;
        try {
              Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            
            Artista a = new Artista();
            a.setNombre(nombre);
            a.setDescripcion(descripcion);
            
            session.save(a);
            session.getTransaction().commit();
            resultado = a.getId() != 0;
        } catch(HibernateException ex){
            System.err.print("Error al guardar artista: " + ex.getMessage());
        }
        return resultado;
    }
    
    public static boolean editar (int id, String nombre, String descripcion) {
        boolean resultado = false;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            
            Artista a = obtenerPorId(id);
            if(a != null) {
                a.setNombre(nombre);
                a.setDescripcion(descripcion);
                
                session.saveOrUpdate(a);
                session.getTransaction().commit();
                
                resultado = a.getId() != 0;
            }
        } catch(HibernateException ex) {
              System.err.print("Error al editar artista: " + ex.getMessage());
        }
        return resultado;
        
    }
    
    public static boolean eliminar(int id) {
        boolean resultado = false;
         try {
             Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            
            Artista a = obtenerPorId(id);
            if(a != null) {
                session.delete(a);
                session.getTransaction().commit();
            }
          } catch(HibernateException ex) {
              System.err.print("Error al editar artista: " + ex.getMessage());
        }
        return resultado;
    }
    
    public static Artista obtenerPorId(int id){
        Artista artista = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            artista = session.get(Artista.class, id);
        } catch(HibernateException ex) {
              System.err.print("Error al editar artista: " + ex.getMessage());
        }
        return artista;
    }
}