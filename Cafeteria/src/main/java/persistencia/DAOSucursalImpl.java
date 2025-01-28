package persistencia;

import db.DataBase;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.SucursalM;

public class DAOSucursalImpl extends DataBase {
    // Métodos
    public List<SucursalM> listar() throws Exception {
        List<SucursalM> datos;
        this.establecerConexion();
        
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
