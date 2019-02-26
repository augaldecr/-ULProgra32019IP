package mysqljava;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    
    private static Connection conn;

    public Conexion() {
        conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://(host=localhost, port=3306)/db_estudiantes?"
                    + "user=Vegetta777&password=VivaWillyreh3");
            if (conn!=null) {
                System.out.println("Conexion exitosa");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public Connection Conectar(){
        return conn;
    }
    
    public void Desconectar(){
        conn = null;
        if (conn != null) {
            System.out.println("Desconexion exitosa");
        }
    }
}
