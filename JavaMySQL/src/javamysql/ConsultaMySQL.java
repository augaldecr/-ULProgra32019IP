package javamysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsultaMySQL {
    
    private Connection conn;
    private ResultSet rs;
    private ResultSetMetaData mtd;
    private String[] columnas;
    private String consulta, error;

    public ConsultaMySQL(Connection conn, String consulta) {
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
    
    public String[] getColumnsNames(){
        try {
            int columnsQty = mtd.getColumnCount();
            this.columnas = new String[columnsQty];
            
            for (int i = 0; i < columnsQty; i++) {
                columnas[i] = mtd.getColumnLabel(i+1);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return columnas;
    }
    
}
