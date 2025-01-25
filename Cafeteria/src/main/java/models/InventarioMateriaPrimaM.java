/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.math.BigDecimal;

/**
 *
 * @author DyS
 */
public class InventarioMateriaPrimaM {
    // Atributos
    private int id_inventario;
    private int id_sucursal;
    private int id_materia_prima;
    private BigDecimal cantidad_disponible;
    
    // Atributos
    public int getId_inventario() {
        return id_inventario;
    }

    public int getId_sucursal() {
        return id_sucursal;
    }

    public int getId_materia_prima() {
        return id_materia_prima;
    }

    public BigDecimal getCantidad_disponible() {
        return cantidad_disponible;
    }

    public void setId_inventario(int id_inventario) {
        this.id_inventario = id_inventario;
    }

    public void setId_sucursal(int id_sucursal) {
        this.id_sucursal = id_sucursal;
    }

    public void setId_materia_prima(int id_materia_prima) {
        this.id_materia_prima = id_materia_prima;
    }

    public void setCantidad_disponible(BigDecimal cantidad_disponible) {
        this.cantidad_disponible = cantidad_disponible;
    }
    
}
