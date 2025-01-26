package persistencia;

import db.DataBase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.ProductoM;

public class DAOProductoImpl extends DataBase {
    // Atributos
    private String ip;
    private String db;
    
    // Constructores
    public DAOProductoImpl(String ip, String db) {
        this.ip = ip;
        this.db = db;
    }
    
    // Métodos
    public void registrar(ProductoM ob) throws Exception {
        this.establecerConexion(ip, db);
        
        PreparedStatement st = this.conexion.prepareStatement("INSERT INTO Producto(id_producto, nombre, descripcion, precio_base, categoria) VALUES(?,?,?,?,?);");
        st.setInt(1, ob.getId_producto());
        st.setString(2, ob.getNombre());
        st.setString(3, ob.getDescripcion());
        st.setBigDecimal(4, ob.getPrecio_base());
        st.setString(5, ob.getCategoria());
        st.executeUpdate();
        st.close();
        
        this.cerrarConexion();
    }
    
    public void modificar(ProductoM ob) throws Exception {
        this.establecerConexion(ip, db);
        
        PreparedStatement st = this.conexion.prepareStatement("UPDATE Producto SET nombre = ?, descripcion = ?, precio_base = ?, categoria = ? WHERE id_producto = ?");
        st.setString(1, ob.getNombre());
        st.setString(2, ob.getDescripcion());
        st.setBigDecimal(3, ob.getPrecio_base());
        st.setString(4, ob.getCategoria());
        st.setInt(5, ob.getId_producto());
        st.executeUpdate();
        st.close();
        
        this.cerrarConexion();
    }
    
    public void eliminar(int id) throws Exception {
        this.establecerConexion(ip, db);
        
        PreparedStatement st = this.conexion.prepareStatement("DELETE FROM Producto WHERE id_producto = ?;");
        st.setInt(1, id);
        st.executeUpdate();
        st.close();
        
        this.cerrarConexion();
    }
    
    public List<ProductoM> leer() throws Exception {
        List<ProductoM> datos;
        this.establecerConexion(ip, db);
        
        PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM Producto;");

        datos = new ArrayList();
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            ProductoM ob = new ProductoM();
            ob.setId_producto(rs.getInt("id_producto"));
            ob.setNombre(rs.getString("nombre"));
            ob.setDescripcion(rs.getString("descripcion"));
            ob.setPrecio_base(rs.getBigDecimal("precio_base"));
            ob.setCategoria(rs.getString("categoria"));
            datos.add(ob);
        }
        rs.close();
        st.close();
        
        this.cerrarConexion();
        return datos;
    }
    
}