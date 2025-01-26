package persistencia;

import db.DataBase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.EmpleadoM;

public class DAOEmpleadoImpl extends DataBase {
    // Atributos
    private String ip;
    private String db;
    
    // Constructores
    public DAOEmpleadoImpl(String ip, String db) {
        this.ip = ip;
        this.db = db;
    }
    
    // Metodos
    public void registrar(EmpleadoM ob) throws Exception {
        // Empleado info
        this.establecerConexion(ip, db);
        
        PreparedStatement st = this.conexion.prepareStatement("INSERT INTO Empleado(id_empleado, nombre, cedula, telefono, id_sucursal, cargo) VALUES(?,?,?,?,?,?);");
        st.setInt(1, ob.getId_empleado());
        st.setString(2, ob.getNombre());
        st.setString(3, ob.getCedula());
        st.setString(4, ob.getTelefono());
        st.setInt(5, ob.getId_sucursal());
        st.setString(6, ob.getCargo());
        st.executeUpdate();
        st.close();
        
        this.cerrarConexion();
        
        // Empleado datos sensibles
        this.establecerConexion("192.168.1.1", "ElPuyoDB");
        
        st = this.conexion.prepareStatement("INSERT INTO Empleado_Datos_Sensibles(id_empleado, fecha_contrato) VALUES(?, ?);");
        st.setInt(1, ob.getId_empleado());
        st.setDate(2, java.sql.Date.valueOf(ob.getFecha_contrato()));
        st.executeUpdate();
        st.close();
        
        this.cerrarConexion();
    }
    
    public void modificar(EmpleadoM ob) throws Exception {
        this.establecerConexion(ip, db);
        
        // Empleado info
        PreparedStatement st = this.conexion.prepareStatement("UPDATE Empleado SET nombre = ?, cedula = ?, telefono = ?, cargo = ? WHERE id_empleado = ? AND id_sucursal = ?");
        st.setString(1, ob.getNombre());
        st.setString(2, ob.getCedula());
        st.setString(3, ob.getTelefono());
        st.setString(4, ob.getCargo());
        st.setInt(5, ob.getId_empleado());
        st.setInt(6, ob.getId_sucursal());
        st.executeUpdate();
        st.close();
        
        this.cerrarConexion();
    }
    
    public void eliminar(int id) throws Exception {
        // Empleado info
        this.establecerConexion(ip, db);
        
        PreparedStatement st = this.conexion.prepareStatement("DELETE FROM Empleado WHERE id_empleado = ? AND id_sucursal = ?;");
        st.setInt(1, id);
        st.executeUpdate();
        st.close();
        
        this.cerrarConexion();
        
        // Empleado datos sensibles
        this.establecerConexion("192.168.1.1", "ElPuyoDB");
        st = this.conexion.prepareStatement("DELETE FROM Empleado_Datos_Sensibles WHERE id_empleado = ?;");
        st.setInt(1, id);
        st.executeUpdate();
        st.close();
        
        this.cerrarConexion();
    }
    
    public List<EmpleadoM> leer() throws Exception {
        List<EmpleadoM> datos;
        this.establecerConexion(ip, db);
        
        PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM Empleado;");

        datos = new ArrayList();
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            EmpleadoM ob = new EmpleadoM();
            ob.setId_empleado(rs.getInt("id_empleado"));
            ob.setNombre(rs.getString("nombre"));
            ob.setCedula(rs.getString("cedula"));
            ob.setTelefono(rs.getString("telefono"));
            ob.setId_sucursal(rs.getInt("id_sucursal"));
            ob.setCargo(rs.getString("cargo"));
            datos.add(ob);
        }
        rs.close();
        st.close();
        
        this.cerrarConexion();
        return datos;
    }
    
    public List<EmpleadoM> leerDatosSensibles() throws Exception {
        List<EmpleadoM> datos;
        this.establecerConexion("192.168.1.1", "ElPuyoDB");
        
        PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM Empleado_Datos_Sensibles;");

        datos = new ArrayList();
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            EmpleadoM ob = new EmpleadoM();
            ob.setId_empleado(rs.getInt("id_empleado"));
            ob.setFecha_contrato(rs.getDate("fecha_contrato").toLocalDate());
            datos.add(ob);
        }
        rs.close();
        st.close();
        
        this.cerrarConexion();
        return datos;
    }
    
}
