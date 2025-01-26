package models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class VentaM {
    // Atributos
    private int id_venta;
    private int id_sucursal;
    private LocalDateTime fecha;
    private BigDecimal monto_total;
    private int id_empleado;
    private Integer id_cliente;
    
    // Métodos 
    public int getId_venta() {
        return id_venta;
    }

    public int getId_sucursal() {
        return id_sucursal;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public BigDecimal getMonto_total() {
        return monto_total;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public void setId_sucursal(int id_sucursal) {
        this.id_sucursal = id_sucursal;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public void setMonto_total(BigDecimal monto_total) {
        this.monto_total = monto_total;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }
}
