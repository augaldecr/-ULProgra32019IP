package javamysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private static Connection conn;

    public Conexion() {
        conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://(host=localhost,port=3306)/db_estudiantes?"
                    + "user=Vegetta777&password=VivaWillyreh3");
            if (conn != null) {
                System.out.println("Conexion establecida");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public Connection conectar(){
        return conn;
    }
    
    public void desconectar(){
        conn = null;
        if (conn == null) {
            System.out.println("Desconexion exitosa");
        }
    }
}
