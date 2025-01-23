package modelo.inicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    // Atributos
    private Connection conexion = null;
    private String bd = "ElPuyoDB";
    private String ip = "localhost";
    private String cadena = "jdbc:sqlserver://" + ip + "1433"
            + ";database=" + bd
            + ";user=sa"
            + ";password=P@ssw0rd"
            + ";loginTimeout=15"
            + ";TrustServerCertificate=True;";
    
    //Metodos
    public void establecerConexion() {
        try {
            this.conexion = DriverManager.getConnection(cadena);
        } catch(SQLException e){
            System.out.println("Error de conexion: " + e.toString());
        }
    }
    
    public void cerrarConexion() throws SQLException {
        if (this.conexion != null) {
            if (!this.conexion.isClosed()) {
                this.conexion.close();
            }
        }
    }
    
    public Connection getConnection() {
        return this.conexion;
    }
}
