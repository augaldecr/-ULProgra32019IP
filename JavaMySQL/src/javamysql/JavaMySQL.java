package javamysql;

import java.sql.Connection;

public class JavaMySQL {

    public static void main(String[] args) {
        
        Conexion conn;
        conn = new Conexion();

        Connection con = conn.conectar();
        
    }
}
