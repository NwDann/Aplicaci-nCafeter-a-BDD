package modelo.operacion;

import modelo.inicio.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public abstract class CRUD {
    // Atributos
    protected Conexion conexion;
    protected String consulta;
    protected Statement comando;
    protected ResultSet resultado;
    protected PreparedStatement comandoAPreparar;
}
