package persistencia;

import db.DataBase;
import java.awt.List;
import java.sql.PreparedStatement;
import models.SucursalM;

public class DAOSucursalImpl extends DataBase{
    // Atributos
    private String ip;
    private String db;
    
    // Constructores
    public DAOSucursalImpl(String ip, String db) {
        this.ip = ip;
        this.db = db;
    }
    
    // Métodos
    public void registrar(SucursalM ob) throws Exception {
        this.establecerConexion(ip, db);
        
        PreparedStatement st = this.conexion.prepareStatement("INSERT INTO Sucursal(id_sucursal, nombre, direccion, ciudad, telefono) VALUES(?,?,?,?,?);");
        st.setInt(1, ob.getId_sucursal());
        st.setString(2, ob.getNombre());
        st.setString(3, ob.getDireccion());
        st.setString(4, ob.getCiudad());
        st.setString(5, ob.getTelefono());
        st.executeUpdate();
        st.close();
        
        this.cerrarConexion();
    }
    
    public void modificar(SucursalM ob) throws Exception {
        
    }
    
    public void eliminar(int id) throws Exception {
        
    }
    
    public List<SucursalM> listar() throws Exception {
        throw new UnsupportedOperationException("");
    }
}
