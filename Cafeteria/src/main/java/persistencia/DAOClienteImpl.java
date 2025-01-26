package persistencia;

import db.DataBase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.ClienteM;

public class DAOClienteImpl extends DataBase {
    // Atributos
    private String ip;
    private String db;
    
    // Constructores
    public DAOClienteImpl(String ip, String db) {
        this.ip = ip;
        this.db = db;
    }
    
    // Metodos
    public void registrar(ClienteM ob) throws Exception {
        this.establecerConexion(ip, db);
        
        // Cliente info
        PreparedStatement st = this.conexion.prepareStatement("INSERT INTO Cliente_Informacion(id_cliente, nombre, correo, telefono) VALUES(?,?,?,?);");
        st.setInt(1, ob.getId_cliente());
        st.setString(2, ob.getNombre());
        st.setString(3, ob.getCorreo());
        st.setString(4, ob.getTelefono());
        st.executeUpdate();
        
        // Cliente datos sensibles
        st = this.conexion.prepareStatement("INSERT INTO ClienteDatosSensibles(id_cliente, fecha_registro) VALUES(?,?);");
        st.setInt(1, ob.getId_cliente());
        st.setDate(2, java.sql.Date.valueOf(ob.getFecha_registro()));
        st.executeUpdate();
        st.close();
        
        this.cerrarConexion();
    }
    
    public void modificar(ClienteM ob) throws Exception {
        this.establecerConexion(ip, db);
        
        PreparedStatement st = this.conexion.prepareStatement("UPDATE Cliente_Informacion SET nombre = ?, correo = ?, telefono = ? WHERE id_cliente = ?");
        st.setString(1, ob.getNombre());
        st.setString(2, ob.getCorreo());
        st.setString(3, ob.getTelefono());
        st.setInt(4, ob.getId_cliente());
        st.executeUpdate();
        st.close();
        
        this.cerrarConexion();
    }
    
    public void eliminar(int id) throws Exception {
        this.establecerConexion(ip, db);
        
        // Cliente info
        PreparedStatement st = this.conexion.prepareStatement("DELETE FROM Cliente_Informacion WHERE id_cliente = ?;");
        st.setInt(1, id);
        st.executeUpdate();
        
        //Cliente datos sensibles
        st = this.conexion.prepareStatement("DELETE FROM ClienteDatosSensibles WHERE id_cliente = ?;");
        st.setInt(1, id);
        st.close();
        
        this.cerrarConexion();
    }
    
    public List<ClienteM> leer() throws Exception {
        List<ClienteM> datos;
        this.establecerConexion(ip, db);
        
        PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM Cliente_Informacion;");

        datos = new ArrayList();
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            ClienteM ob = new ClienteM();
            ob.setId_cliente(rs.getInt("id_cliente"));
            ob.setNombre(rs.getString("nombre"));
            ob.setCorreo(rs.getString("correo"));
            ob.setTelefono(rs.getString("telefono"));
            datos.add(ob);
        }
        rs.close();
        st.close();
        
        this.cerrarConexion();
        return datos;
    }
    
    public List<ClienteM> leerDatosSensibles() throws Exception {
        List<ClienteM> datos;
        this.establecerConexion(ip, db);
        
        PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM ClienteDatosSensibles;");

        datos = new ArrayList();
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            ClienteM ob = new ClienteM();
            ob.setId_cliente(rs.getInt("id_cliente"));
            ob.setFecha_registro(rs.getDate("fecha_registro").toLocalDate());
            datos.add(ob);
        }
        rs.close();
        st.close();
        
        this.cerrarConexion();
        return datos;
    }
}
