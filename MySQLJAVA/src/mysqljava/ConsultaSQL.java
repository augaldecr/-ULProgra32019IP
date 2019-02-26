package mysqljava;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultaSQL {
    
    private Connection conn;
    private ResultSet rs;
    private ResultSetMetaData mtd;
    private String[] columnas;
    private String consulta, error;

    public ConsultaSQL(Connection conn, String consulta) {
        this.conn = conn;
        this.consulta = consulta;
        
        try {
            Statement st = conn.createStatement();
            
            rs = st.executeQuery(consulta);
            mtd = rs.getMetaData();
            error = null;
        } catch (SQLException e) {
            error = e.getMessage();
            System.out.println(e);
        }
    }
    
    public String getError(){
        return this.error;
    }
    
    public ResultSet getResultado(){
        return this.rs;
    }
    
}
