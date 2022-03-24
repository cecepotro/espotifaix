/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.espotifaix.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Representa el artista, cantante o banda musical a la que corresponde los álbumes.
 * @author Jesús Pérez Ceceña
 */
@Entity
public class Artista {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String descripcion;
    
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
     * Obtiene el valor del atributo descripcion.
     * @return El atributo descripcion.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Asigna el valor del atributo descripcion.
     * @param descripcion Valor a asignar al atributo descripcion.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}