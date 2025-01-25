/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;

/**
 *
 * @author DyS
 */
public class EmpleadoM {
    // Atributos
    private int id_empleado;
    private String nombre;
    private String cedula;
    private String telefono;
    private Date fecha_contrato;
    private int id_sucursal;
    private String cargo;
    
    // Metodos
    public int getId_empleado() {
        return id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public Date getFecha_contrato() {
        return fecha_contrato;
    }

    public int getId_sucursal() {
        return id_sucursal;
    }

    public String getCargo() {
        return cargo;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFecha_contrato(Date fecha_contrato) {
        this.fecha_contrato = fecha_contrato;
    }

    public void setId_sucursal(int id_sucursal) {
        this.id_sucursal = id_sucursal;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
