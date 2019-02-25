package javamysql;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class SentenciaMySQL {
    
    private Connection con;
    private String sql, error;

    public SentenciaMySQL(Connection con, String sql) {
        this.con = con;
        this.sql = sql;
        
        try {
            Statement st = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            st.executeUpdate(sql);
            st.close();
            this.error = null;
        } catch (Exception e) {
            this.error = e.getMessage();
            System.out.println(e);
        }
    }
    
    

    
}
