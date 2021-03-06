/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.espotifaix.entidades;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Representa los álbumes de canciones disponibles en la plataforma.
 * @author Jesús Pérez Ceceña
 */
@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="idArtista")
    private Artista artista;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="idAlbum")
    private List<Cancion> canciones;
    @Temporal(TemporalType.DATE)
    private Date fechaLanzamiento;
    
    /**
     * Obtiene el valor del atributo id.
     * @return El atributo id.
     */
    public int getId() {
        return id;
    }

    /**
     * Asigna el valor del atributo id.
     * @param id Valor a asignar al atributo id.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el valor del atributo nombre.
     * @return El atributo nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el valor del atributo nombre.
     * @param nombre Valor a asignar al atributo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el valor del atributo artista.
     * @return El atributo artista.
     */
    public Artista getArtista() {
        return artista;
    }

    /**
     * Asigna el valor del atributo artista.
     * @param artista Valor a asignar al atributo artista.
     */
    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    /**
     * Obtiene el valor del atributo canciones.
     * @return El atributo canciones.
     */
    public List<Cancion> getCanciones() {
        return canciones;
    }

    /**
     * Asigna el valor del atributo canciones.
     * @param canciones Valor a asignar al atributo canciones.
     */
    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

    /**
     * Obtiene el valor del atributo fechaLanzamiento.
     * @return El atributo fechaLanzamiento
     */
    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    /**
     * Asigna el valor del atributo fechaLanzamiento.
     * @param fechaLanzamiento Valor a asignar al atributo fechaLanzamiento.
     */
    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
}