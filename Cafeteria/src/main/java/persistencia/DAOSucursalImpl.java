package persistencia;

import db.DataBase;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.SucursalM;

public class DAOSucursalImpl extends DataBase {
    // Atributos
    private String ip;
    private String db;
    
    // Constructores
    public DAOSucursalImpl(String ip, String db) {
        this.ip = ip;
        this.db = db;
    }
    
    // Métodos
    public List<SucursalM> listar() throws Exception {
        List<SucursalM> datos;
        this.establecerConexion(ip, db);
        
        PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM Sucursal;");

        datos = new ArrayList();
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            SucursalM ob = new SucursalM();
            ob.setId_sucursal(rs.getInt("id_sucursal"));
            ob.setNombre(rs.getString("nombre"));
            ob.setDireccion(rs.getString("direccion"));
            ob.setCiudad(rs.getString("ciudad"));
            ob.setTelefono(rs.getString("telefono"));
            datos.add(ob);
        }
        rs.close();
        st.close();
        
        this.cerrarConexion();
        return datos;
    }
}
