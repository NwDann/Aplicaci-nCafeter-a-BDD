package persistencia;

import db.DataBase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.VentaM;

public class DAOVentaImpl extends DataBase {
    // Atributos
    private String ip;
    private String db;
    
    // Constructores
    public DAOVentaImpl(String ip, String db) {
        this.ip = ip;
        this.db = db;
    }
    
    // Metodos
    public void registrar(VentaM ob) throws Exception {
        this.establecerConexion(ip, db);
        
        PreparedStatement st = this.conexion.prepareStatement("INSERT INTO Venta(id_venta, id_sucursal, fecha, monto_total, id_empleado, id_cliente) VALUES(?,?,?,?,?,?);");
        st.setInt(1, ob.getId_venta());
        st.setInt(2, ob.getId_sucursal());
        st.setTimestamp(3, java.sql.Timestamp.valueOf(ob.getFecha()));
        st.setBigDecimal(4, ob.getMonto_total());
        st.setInt(5, ob.getId_empleado());
        if (ob.getId_cliente() != null) {
            st.setInt(6, ob.getId_cliente());
        } else {
            st.setNull(6, java.sql.Types.INTEGER);
        }
        st.executeUpdate();
        st.close();
        
        this.cerrarConexion();
    }
    
    public List<VentaM> leer() throws Exception {
        List<VentaM> datos;
        this.establecerConexion(ip, db);
        
        PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM Venta;");

        datos = new ArrayList();
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            VentaM ob = new VentaM();
            ob.setId_venta(rs.getInt("id_venta"));
            ob.setId_sucursal(rs.getInt("id_sucursal"));
            ob.setFecha(rs.getTimestamp("fecha").toLocalDateTime());
            ob.setMonto_total(rs.getBigDecimal("monto_total"));
            ob.setId_empleado(rs.getInt("id_empleado"));
            ob.setId_cliente(rs.getObject("id_cliente", Integer.class));
            datos.add(ob);
        }
        rs.close();
        st.close();
        
        this.cerrarConexion();
        return datos;
    }
}
