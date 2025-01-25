/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author DyS
 */
public class MateriaPrimaM {
    // Atributos
    private int id_materia_prima;
    private String nombre;
    private String unidad;
    private String descripcion;
    
    // Metodos
    public int getId_materia_prima() {
        return id_materia_prima;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUnidad() {
        return unidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId_materia_prima(int id_materia_prima) {
        this.id_materia_prima = id_materia_prima;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
