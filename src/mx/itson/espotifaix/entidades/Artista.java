/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.espotifaix.entidades;

/**
 *
 * @author jesus
 */
public class Artista {
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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
