package persistencia;

import db.DataBase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.MateriaPrimaM;

public class DAOMateriaPrimaImpl extends DataBase {
    // Atributos
    private String ip;
    private String db;
    
    // Constructores
    public DAOMateriaPrimaImpl(String ip, String db) {
        this.ip = ip;
        this.db = db;
    }
    
    // Metodos
    public void registrar(MateriaPrimaM ob) throws Exception {
        this.establecerConexion(ip, db);
        
        PreparedStatement st = this.conexion.prepareStatement("INSERT INTO MateriaPrima(id_materia_prima, nombre, unidad, descripcion) VALUES(?,?,?,?);");
        st.setInt(1, ob.getId_materia_prima());
        st.setString(2, ob.getNombre());
        st.setString(3, ob.getUnidad());
        st.setString(4, ob.getDescripcion());
        st.executeUpdate();
        st.close();
        
        this.cerrarConexion();
    }
    
    public void modificar(MateriaPrimaM ob) throws Exception {
        this.establecerConexion(ip, db);
        
        PreparedStatement st = this.conexion.prepareStatement("UPDATE MateriaPrima SET nombre = ?, unidad = ?, descripcion = ? WHERE id_materia_prima = ?");
        st.setString(1, ob.getNombre());
        st.setString(2, ob.getUnidad());
        st.setString(3, ob.getDescripcion());
        st.setInt(4, ob.getId_materia_prima());
        st.executeUpdate();
        st.close();
        
        this.cerrarConexion();
    }
    
    public void eliminar(int id) throws Exception {
        this.establecerConexion(ip, db);
        
        PreparedStatement st = this.conexion.prepareStatement("DELETE FROM MateriaPrima WHERE id_materia_prima = ?;");
        st.setInt(1, id);
        st.executeUpdate();
        st.close();
        
        this.cerrarConexion();
    }
    
    public List<MateriaPrimaM> leer() throws Exception {
        List<MateriaPrimaM> datos;
        this.establecerConexion(ip, db);
        
        PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM MateriaPrima;");

        datos = new ArrayList();
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            MateriaPrimaM ob = new MateriaPrimaM();
            ob.setId_materia_prima(rs.getInt("id_materia_prima"));
            ob.setNombre(rs.getString("nombre"));
            ob.setUnidad(rs.getString("unidad"));
            ob.setDescripcion(rs.getString("descripcion"));
            datos.add(ob);
        }
        rs.close();
        st.close();
        
        this.cerrarConexion();
        return datos;
    }
}
