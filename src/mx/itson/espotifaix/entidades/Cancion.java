/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.espotifaix.entidades;

/**
 * Representa las canciones disponibles en la plataforma musical.
 * @author Jesús Pérez Ceceña
 */
public class Cancion {

    private int id;
    private String nombre;
    private int orden;
    
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
     * Obtiene el valor del atributo orden.
     * @return El atributo orden.
     */
    public int getOrden() {
        return orden;
    }

    /**
     * Asigna el valor del atributo orden.
     * @param orden Valor a asignar al atributo orden.
     */
    public void setOrden(int orden) {
        this.orden = orden;
    }
}