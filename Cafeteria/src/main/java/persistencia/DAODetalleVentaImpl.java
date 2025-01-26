package persistencia;

import db.DataBase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.DetalleVentaM;

public class DAODetalleVentaImpl extends DataBase {
    // Atributos
    private String ip;
    private String db;
    
    // Constructores
    public DAODetalleVentaImpl(String ip, String db) {
        this.ip = ip;
        this.db = db;
    }
    
    // Metodos
    public void registrar(DetalleVentaM ob) throws Exception {
        this.establecerConexion(ip, db);
        
        PreparedStatement st = this.conexion.prepareStatement("INSERT INTO DetalleVenta(id_detalle, id_sucursal, id_venta, id_producto, cantidad, precio_unitario) VALUES(?,?,?,?,?,?);");
        st.setInt(1, ob.getId_detalle());
        st.setInt(2, ob.getId_sucursal());
        st.setInt(3, ob.getId_venta());
        st.setInt(4, ob.getId_producto());
        st.setInt(5, ob.getCantidad());
        st.setBigDecimal(6, ob.getPrecio_unitario());
        st.executeUpdate();
        st.close();
        
        this.cerrarConexion();
    }
    
    public List<DetalleVentaM> leer(int id_sucursal, int id_venta) throws Exception {
        List<DetalleVentaM> datos;
        this.establecerConexion(ip, db);
        
        PreparedStatement st = this.conexion.prepareStatement("SELECT id_producto, cantidad, precio_unitario FROM DetalleVenta WHERE id_sucursal = ? AND id_venta = ?;");
        st.setInt(1, id_sucursal);
        st.setInt(2, id_venta);

        datos = new ArrayList();
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            DetalleVentaM ob = new DetalleVentaM();
            ob.setId_producto(rs.getInt("id_producto"));
            ob.setCantidad(rs.getInt("cantidad"));
            ob.setPrecio_unitario(rs.getBigDecimal("precio_unitario"));
            datos.add(ob);
        }
        rs.close();
        st.close();
        
        this.cerrarConexion();
        return datos;
    }
}
