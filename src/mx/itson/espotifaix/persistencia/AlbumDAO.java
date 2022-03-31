/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.espotifaix.persistencia;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import mx.itson.espotifaix.entidades.Album;
import mx.itson.espotifaix.utilerias.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author jesus
 */
public class AlbumDAO {
    
    public static List<Album> obtenerTodos(){
        List<Album> albumes = new ArrayList<>();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            CriteriaQuery<Album> criteriaQuery = session.getCriteriaBuilder().createQuery(Album.class);
            criteriaQuery.from(Album.class);
            albumes = session.createQuery(criteriaQuery).getResultList();
        } catch(HibernateException ex){
            System.err.print("Error: " + ex.getMessage());
        }
        return albumes;
    }
}
