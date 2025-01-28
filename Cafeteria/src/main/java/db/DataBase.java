package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    // Atributos
    //  ElPuyo -> 0, QuitoDB -> 1
    public static int servidorGlobal;
    private final String[][] servidores = {{"192.168.1.1", "ElPuyoDB"}, {"192.168.1.1", "QuitoDB"}};
    protected Connection conexion = null;
    
    //Metodos
    public void establecerConexion() {
        String cadena = "jdbc:sqlserver://" + servidores[servidorGlobal][0] + "1433"
            + ";database=" + servidores[servidorGlobal][1]
            + ";user=sa"
            + ";password=P@ssw0rd"
            + ";loginTimeout=15"
            + ";TrustServerCertificate=True;";
        try {
            this.conexion = DriverManager.getConnection(cadena);
        } catch(SQLException e){
            System.out.println("Error de conexion: " + e.toString());
        }
    }
    
    public void establecerConexion(int servidor) {
        String cadena = "jdbc:sqlserver://" + servidores[servidor][0] + "1433"
            + ";database=" + servidores[servidor][1]
            + ";user=sa"
            + ";password=P@ssw0rd"
            + ";loginTimeout=15"
            + ";TrustServerCertificate=True;";
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
