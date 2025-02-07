package persistencia;

import db.DataBase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.InventarioMateriaPrimaM;

public class DAOInventarioMateriaPrimaImpl extends DataBase{
    // Metodos
    public void registrar(InventarioMateriaPrimaM ob) throws Exception {
        this.establecerConexion();
        
        PreparedStatement st = this.conexion.prepareStatement("SET XACT_ABORT ON;INSERT INTO InventarioMateriaPrima(id_inventario, id_sucursal, id_materia_prima, cantidad_disponible) VALUES(?,?,?,?);");
        st.setInt(1, ob.getId_inventario());
        st.setInt(2, ob.getId_sucursal());
        st.setInt(3, ob.getId_materia_prima());
        st.setBigDecimal(4, ob.getCantidad_disponible());
        st.executeUpdate();
        st.close();
        
        this.cerrarConexion();
    }
    
    public void modificar(InventarioMateriaPrimaM ob) throws Exception {
        this.establecerConexion();
        
        PreparedStatement st = this.conexion.prepareStatement("SET XACT_ABORT ON;UPDATE InventarioMateriaPrima SET cantidad_disponible = ? WHERE id_inventario = ? AND id_sucursal = ?;");
        st.setBigDecimal(1, ob.getCantidad_disponible());
        st.setInt(2, ob.getId_inventario());
        st.setInt(3, ob.getId_sucursal());
        st.executeUpdate();
        st.close();
        
        this.cerrarConexion();
    }
    
    public void eliminar(int id_inventario, int id_sucursal) throws Exception {
        this.establecerConexion();
        
        PreparedStatement st = this.conexion.prepareStatement("SET XACT_ABORT ON;DELETE FROM InventarioMateriaPrima WHERE id_inventario = ? AND id_sucursal = ?;");
        st.setInt(1, id_inventario);
        st.setInt(2, id_sucursal);
        st.executeUpdate();
        st.close();
        
        this.cerrarConexion();
    }
    
    public List<InventarioMateriaPrimaM> leer() throws Exception {
        List<InventarioMateriaPrimaM> datos;
        this.establecerConexion();
        
        PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM InventarioMateriaPrima;");

        datos = new ArrayList();
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            InventarioMateriaPrimaM ob = new InventarioMateriaPrimaM();
            ob.setId_inventario(rs.getInt("id_inventario"));
            ob.setId_sucursal(rs.getInt("id_sucursal"));
            ob.setId_materia_prima(rs.getInt("id_materia_prima"));
            ob.setCantidad_disponible(rs.getBigDecimal("cantidad_disponible"));
            datos.add(ob);
        }
        rs.close();
        st.close();
        
        this.cerrarConexion();
        return datos;
    }
}
