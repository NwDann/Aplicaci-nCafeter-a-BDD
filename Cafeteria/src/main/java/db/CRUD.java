package db;

import db.DataBase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public abstract class CRUD {
    // Atributos
    protected DataBase conexion;
    protected String consulta;
    protected Statement comando;
    protected ResultSet resultado;
    protected PreparedStatement comandoAPreparar;
}
